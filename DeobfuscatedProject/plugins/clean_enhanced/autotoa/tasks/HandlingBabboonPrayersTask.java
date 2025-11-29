package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import java.util.*;

/**
 * Task for handling prayer flicking against Baboon attacks during the Ba-Ba boss fight in TOA.
 *
 * NPC Names and Attack Styles:
 * - Baboon Mage: Uses magic attacks (PROTECT_FROM_MAGIC)
 * - Baboon Thrower: Uses ranged attacks (PROTECT_FROM_MISSILES)
 * - Baboon Brawler: Uses melee attacks (PROTECT_FROM_MELEE)
 * - Baboon Thrall: Uses melee attacks (PROTECT_FROM_MELEE)
 *
 * Animation IDs:
 * - 13906: Baboon Mage attack animation
 * - 9809: Baboon Thrower attack animation
 * - 9742: Baboon Brawler/Thrall attack animation
 *
 * Prayer Flicking Logic:
 * 1. Tracks baboon attack animations
 * 2. Predicts which prayer to use based on attack type
 * 3. Stores prayer predictions by game tick
 * 4. Flicks prayers on the tick before damage
 * 5. Prioritizes prayers based on number of attackers
 *
 * Priority Logic:
 * - Counts number of each baboon type attacking
 * - Uses prayer for the most common attack type
 * - If tie, uses magic > melee > ranged priority
 * - Checks for melee distance baboons for immediate threat
 *
 * Priority: MAX (2147483647) - highest possible priority
 */
@TaskDesc(name="Handling babboon prayers", priority=0x7FFFFFFF, register=true)
public class HandlingBabboonPrayersTask extends KephriManager {

    // NPC Names
    private static final String NPC_BABOON_MAGE = "Baboon Mage";
    private static final String NPC_BABOON_THROWER = "Baboon Thrower";
    private static final String NPC_BABOON_BRAWLER = "Baboon Brawler";
    private static final String NPC_BABOON_THRALL = "Baboon Thrall";
    private static final String NPC_BABOON = "Baboon";

    // Animation IDs
    private static final int ANIMATION_BABOON_MAGE_ATTACK = 13906;
    private static final int ANIMATION_BABOON_THROWER_ATTACK = 9809;
    private static final int ANIMATION_BABOON_MELEE_ATTACK = 9742;

    // Constants
    private static final int PRAYER_TICK_DELAY = 4; // Ticks to delay prayer prediction
    private static final int MELEE_DISTANCE = 10;   // Distance for melee threat check

    // State tracking
    private final Map<Integer, List<BaboonAttack>> attacksByTick;

    @Inject
    public HandlingBabboonPrayersTask(SquireAutoTOA plugin, TOAConfig config) {
        super(plugin, config);
        this.attacksByTick = new HashMap<>();
    }

    /**
     * Check if task should be active (if baboons are present)
     */
    @Override
    public boolean shouldActivate() {
        NPC baboon = NPCs.getNearest(npc ->
            npc.getName().contains(NPC_BABOON) && !npc.isDead()
        );
        return baboon != null;
    }

    /**
     * Always use prayer flicking mode
     */
    @Override
    public boolean alwaysActive() {
        return true;
    }

    /**
     * Return prayer flick mode
     */
    @Override
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }

    /**
     * Get prayer overhead delay in ticks
     */
    @Override
    public int getPrayerDelay() {
        return 1;
    }

    /**
     * Track baboon attack animations and predict prayers
     */
    @Subscribe
    public void onAnimationChanged(AnimationChanged event) {
        Actor actor = event.getActor();

        // Ignore player animations
        if (actor instanceof Player) {
            return;
        }

        NPC npc = (NPC) actor;
        int currentTick = Static.getClient().getTickCount();
        int attackTick = currentTick + PRAYER_TICK_DELAY;

        // Track Baboon Mage attacks
        if (npc.getAnimation() == ANIMATION_BABOON_MAGE_ATTACK &&
            npc.getName().equals(NPC_BABOON_MAGE)) {
            recordAttack(npc, Prayer.PROTECT_FROM_MAGIC, attackTick);
        }

        // Track Baboon Thrower attacks
        if (npc.getAnimation() == ANIMATION_BABOON_THROWER_ATTACK &&
            npc.getName().equals(NPC_BABOON_THROWER)) {
            recordAttack(npc, Prayer.PROTECT_FROM_MISSILES, attackTick);
        }

        // Track Baboon Brawler and Thrall attacks
        if (npc.getAnimation() == ANIMATION_BABOON_MELEE_ATTACK &&
            (npc.getName().equals(NPC_BABOON_BRAWLER) || npc.getName().equals(NPC_BABOON_THRALL))) {
            recordAttack(npc, Prayer.PROTECT_FROM_MELEE, attackTick);
        }
    }

    /**
     * Records a baboon attack for a specific tick
     */
    private void recordAttack(Actor attacker, Prayer prayer, int tick) {
        BaboonAttack attack = new BaboonAttack(attacker, prayer);

        if (!attacksByTick.containsKey(tick)) {
            List<BaboonAttack> attacks = new ArrayList<>();
            attacks.add(attack);
            attacksByTick.put(tick, attacks);
        } else {
            List<BaboonAttack> attacks = attacksByTick.get(tick);
            attacks.add(attack);
            attacksByTick.put(tick, attacks);
        }
    }

    /**
     * Get the appropriate prayer for a specific tick
     */
    private Prayer getPrayerForTick(int tick) {
        Collection<BaboonAttack> attacks = attacksByTick.get(tick);

        if (attacks == null || attacks.isEmpty()) {
            return null;
        }

        Prayer predictedPrayer = null;
        int meleeCount = 0;
        int magicCount = 0;
        int rangedCount = 0;

        // Count each attack type
        for (BaboonAttack attack : attacks) {
            // Skip dead baboons
            if (attack.getAttacker() == null || attack.getAttacker().isDead()) {
                continue;
            }

            // Count by prayer type
            if (attack.getPrayer() == Prayer.PROTECT_FROM_MELEE) {
                meleeCount++;
                if (predictedPrayer == null) {
                    predictedPrayer = Prayer.PROTECT_FROM_MELEE;
                }
            }

            if (attack.getPrayer() == Prayer.PROTECT_FROM_MAGIC) {
                magicCount += 2; // Weight magic higher
                if (predictedPrayer != Prayer.PROTECT_FROM_MELEE || predictedPrayer == null) {
                    predictedPrayer = Prayer.PROTECT_FROM_MAGIC;
                }
            }

            if (attack.getPrayer() == Prayer.PROTECT_FROM_MISSILES) {
                rangedCount += 2; // Weight ranged higher
                predictedPrayer = Prayer.PROTECT_FROM_MISSILES;
            }
        }

        // Determine best prayer based on counts
        if (magicCount >= rangedCount && magicCount >= meleeCount) {
            return Prayer.PROTECT_FROM_MAGIC;
        }

        if (meleeCount >= rangedCount) {
            return Prayer.PROTECT_FROM_MELEE;
        }

        return Prayer.PROTECT_FROM_MISSILES;
    }

    /**
     * Get the list of prayers to use this tick
     */
    @Override
    public List<Prayer> getPrayers() {
        // Count alive baboons by type
        int throwerCount = (int) NPCs.getAll(npc ->
            npc.getName().equals(NPC_BABOON_THROWER) && !npc.isDead()
        ).size();

        int mageCount = (int) NPCs.getAll(npc ->
            npc.getName().equals(NPC_BABOON_MAGE) && !npc.isDead()
        ).size();

        // Determine base prayer from baboon counts
        Prayer basePrayer = Prayer.PROTECT_FROM_MELEE;

        if (mageCount > throwerCount) {
            basePrayer = Prayer.PROTECT_FROM_MAGIC;
        } else if (throwerCount > mageCount) {
            basePrayer = Prayer.PROTECT_FROM_MISSILES;
        } else {
            // Check for melee distance baboons
            NPC nearbyBaboon = NPCs.getNearest(npc ->
                (npc.getName().equals(NPC_BABOON_BRAWLER) || npc.getName().equals(NPC_BABOON_THRALL)) &&
                !npc.isDead()
            );

            if (nearbyBaboon != null && nearbyBaboon.distanceTo((Locatable) Players.getLocal()) < MELEE_DISTANCE) {
                // Check if any are alive
                if (mageCount > 0) {
                    basePrayer = Prayer.PROTECT_FROM_MAGIC;
                }
            } else {
                basePrayer = Prayer.PROTECT_FROM_MELEE;
            }
        }

        // Check for predicted prayer on next tick
        int nextTick = Static.getClient().getTickCount() + 1;
        Prayer predictedPrayer = getPrayerForTick(nextTick);

        if (predictedPrayer != null) {
            return List.of(getDefaultPrayer(), predictedPrayer);
        }

        return List.of(getDefaultPrayer());
    }

    /**
     * Inner class to track baboon attacks
     */
    private static class BaboonAttack {
        private final Actor attacker;
        private final Prayer prayer;

        public BaboonAttack(Actor attacker, Prayer prayer) {
            this.attacker = attacker;
            this.prayer = prayer;
        }

        public Actor getAttacker() {
            return attacker;
        }

        public Prayer getPrayer() {
            return prayer;
        }
    }
}
