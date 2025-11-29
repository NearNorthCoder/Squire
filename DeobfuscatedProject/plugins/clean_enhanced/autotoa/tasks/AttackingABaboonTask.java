package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Task for attacking individual Baboon adds during the Ba-Ba boss fight in TOA.
 *
 * NPC Types (Priority Order):
 * 1. Cursed Baboon - Uses Ice Blitz/Barrage, highest threat
 * 2. Baboon Shaman - Support enemy
 * 3. Baboon Thrall - Groups together, use Blood Barrage for AOE
 * 4. Baboon Mage - Ranged magic attacks
 * 5. Baboon Thrower - Ranged attacks
 * 6. Baboon Brawler - Melee attacks, use Blood spells
 *
 * Combat Logic:
 * - Uses Ancient Magicks (Blood/Ice spells) based on enemy type
 * - Blood Burst/Barrage for Thralls and Brawlers (AOE healing)
 * - Ice Blitz/Barrage for Cursed Baboons (freeze)
 * - Avoids Venom pools
 * - Tracks baboons with death animations to avoid re-targeting
 * - Prioritizes threats intelligently
 *
 * Magic Level Requirements:
 * - 68+ Magic: Blood Burst, Ice Blitz
 * - 94+ Magic: Blood Barrage, Ice Barrage
 *
 * Priority: 10 (medium)
 */
@TaskDesc(name="Attacking a baboon", priority=10)
public class AttackingABaboonTask extends KephriManager {

    // NPC Names
    private static final String NPC_BABOON_THRALL = "Baboon Thrall";
    private static final String NPC_BABOON_BRAWLER = "Baboon Brawler";
    private static final String NPC_CURSED_BABOON = "Cursed Baboon";
    private static final String NPC_BABOON_SHAMAN = "Baboon Shaman";
    private static final String NPC_BABOON_MAGE = "Baboon Mage";
    private static final String NPC_BABOON_THROWER = "Baboon Thrower";
    private static final String OBJECT_VENOM_POOL = "Venom pool";
    private static final String INTERACTION_ATTACK = "Attack";

    // Constants
    private static final int DEATH_GRAPHIC_ID = 2030; // Graphic ID for baboon death animation
    private static final int ATTACK_RANGE = 10;
    private static final int SAFE_AREA_RADIUS = 2;
    private static final int NEARBY_BABOON_DISTANCE = 2;
    private static final int MAGIC_LEVEL_BARRAGE = 94; // Level for Barrage spells
    private static final int MAGIC_LEVEL_BURST = 68;   // Level for Burst/Blitz spells

    // State tracking
    private final Set<NPC> dyingBaboons; // Baboons with death animation
    private String currentTargetName;

    @Inject
    protected AttackingABaboonTask(Client client, ToaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
        this.dyingBaboons = new HashSet<>();
        this.currentTargetName = "";
    }

    @Override
    public void reset() {
        this.dyingBaboons.clear();
        this.currentTargetName = "";
    }

    /**
     * Returns equipment setup based on the baboon type being attacked
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        ConfigStorageBox<EquipmentSetup> equipmentSetup = getEquipmentForBaboonType(this.currentTargetName);
        return equipmentSetup != null ? equipmentSetup : this.config.mageGearAkkha();
    }

    /**
     * Gets the appropriate equipment setup for a specific baboon type
     */
    private ConfigStorageBox<EquipmentSetup> getEquipmentForBaboonType(String baboonName) {
        switch (baboonName) {
            case NPC_BABOON_THRALL:
            case NPC_BABOON_BRAWLER:
            case NPC_CURSED_BABOON:
                return this.config.mageGearBaboons();
            case NPC_BABOON_THROWER:
                return this.config.meleeGearBaboons();
            case NPC_BABOON_MAGE:
            case NPC_BABOON_SHAMAN:
                return this.config.rangeGearBaboons();
            default:
                return null;
        }
    }

    /**
     * Main task execution
     */
    @Override
    public boolean execute() {
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Move away from venom pools
        if (isOnVenomPool(playerLocation)) {
            WorldPoint safeSpot = findSafeSpotNearby(playerLocation);
            if (safeSpot != null) {
                Movement.setDestination(safeSpot);
                return true;
            }
        }

        // Find best baboon to attack
        NPC targetBaboon = selectBaboonTarget();
        if (targetBaboon == null) {
            return false;
        }

        this.logAction("Targeting: " + targetBaboon.getName());
        this.currentTargetName = targetBaboon.getName();
        this.prepareAttack();

        // Check if we can attack from current position
        boolean hasVenomPools = !TileObjects.getAll("Venom pool").isEmpty();
        boolean inRange = targetBaboon.distanceTo((Locatable) Players.getLocal()) <= this.getAttackRange();
        boolean hasLineOfSight = Players.getLocal().getWorldArea().hasLineOfSightTo(
            this.client.getTopLevelWorldView(),
            targetBaboon.getWorldLocation()
        );

        // Move closer if needed
        if (hasVenomPools && (!inRange || !hasLineOfSight)) {
            WorldPoint targetLocation = targetBaboon.getWorldLocation();
            int searchRadius = this.getAttackRange() <= 2 ? 1 : 2;

            WorldPoint attackPosition = targetLocation.createWorldArea(searchRadius)
                .toWorldPointList().stream()
                .filter(wp -> Reachable.isWalkable(wp) && !isOnVenomPool(wp))
                .findFirst()
                .orElse(null);

            if (attackPosition == null) {
                return false;
            }

            this.walkTo(attackPosition);
            return true;
        }

        // Cast appropriate spell based on baboon type
        if (shouldUseBloodSpells(targetBaboon.getName())) {
            SpellBook.Ancient bloodSpell = Skills.getBoostedLevel(Skill.MAGIC) >= MAGIC_LEVEL_BARRAGE
                ? SpellBook.Ancient.BLOOD_BARRAGE
                : SpellBook.Ancient.BLOOD_BURST;

            if (bloodSpell.canCast()) {
                Magic.cast(bloodSpell, targetBaboon);
                return true;
            }
        }

        if (shouldUseIceSpells(targetBaboon.getName())) {
            SpellBook.Ancient iceSpell = Skills.getBoostedLevel(Skill.MAGIC) >= MAGIC_LEVEL_BARRAGE
                ? SpellBook.Ancient.ICE_BARRAGE
                : SpellBook.Ancient.ICE_BLITZ;

            if (iceSpell.canCast()) {
                Magic.cast(iceSpell, targetBaboon);
                return true;
            }
        }

        // Default to melee attack
        targetBaboon.interact(INTERACTION_ATTACK);
        return true;
    }

    /**
     * Selects the best baboon to attack based on priority
     */
    private NPC selectBaboonTarget() {
        // Priority 1: Cursed Baboon without death animation
        NPC cursedBaboon = NPCs.getNearest(npc ->
            npc.getName().equals(NPC_CURSED_BABOON) &&
            !dyingBaboons.contains(npc) &&
            !npc.isDead()
        );

        if (cursedBaboon != null && cursedBaboon.getGraphic() == DEATH_GRAPHIC_ID) {
            dyingBaboons.add(cursedBaboon);
        } else if (cursedBaboon != null) {
            return cursedBaboon;
        }

        // Priority 2: Cursed Baboon that is moving
        NPC movingCursed = NPCs.getNearest(npc ->
            npc.getName().equals(NPC_CURSED_BABOON) &&
            dyingBaboons.contains(npc) &&
            npc.isMoving()
        );

        if (movingCursed != null) {
            dyingBaboons.remove(movingCursed);
            return movingCursed;
        }

        // Priority 3: Baboon Shaman
        NPC shaman = NPCs.getNearest(npc -> npc.getName().equals(NPC_BABOON_SHAMAN) && !npc.isDead());
        if (shaman != null) {
            return shaman;
        }

        // Priority 4: Baboon Thrall in groups (for Blood Barrage AOE)
        List<NPC> thralls = NPCs.getAll(npc ->
            npc.getName().equals(NPC_BABOON_THRALL) && !npc.isDead()
        );

        if (thralls.size() > 5) {
            // Find thrall with most other thralls nearby
            return thralls.stream()
                .max(Comparator.comparingInt(thrall -> {
                    return (int) NPCs.getAll(npc ->
                        npc.getName().equals("Baboon thrall") &&
                        npc.getWorldLocation().distanceTo(thrall.getWorldLocation()) < NEARBY_BABOON_DISTANCE
                    ).size();
                }))
                .orElse(null);
        }

        // Priority 5: Moving Cursed Baboon
        List<NPC> movingCursedList = NPCs.getAll(npc ->
            npc.getName().equals(NPC_CURSED_BABOON) &&
            npc.isMoving() &&
            !npc.isDead()
        );

        if (movingCursedList.size() > 1) {
            return movingCursedList.get(0);
        }

        // Priority 6: Baboon Mage or Thrower
        NPC rangedBaboon = NPCs.getNearest(npc ->
            (npc.getName().equals(NPC_BABOON_MAGE) || npc.getName().equals(NPC_BABOON_THROWER)) &&
            !npc.isDead()
        );

        if (rangedBaboon != null) {
            return rangedBaboon;
        }

        // Priority 7: Any remaining Baboon Thrall
        if (thralls.size() > 3) {
            return thralls.stream()
                .max(Comparator.comparingInt(thrall -> {
                    return (int) NPCs.getAll(npc ->
                        npc.getName().equals("Baboon thrall") &&
                        npc.getWorldLocation().distanceTo(thrall.getWorldLocation()) < NEARBY_BABOON_DISTANCE
                    ).size();
                }))
                .orElse(null);
        }

        // Priority 8: Cursed Baboon or Brawler
        NPC meleeBaboon = NPCs.getNearest(npc ->
            (npc.getName().equals(NPC_CURSED_BABOON) || npc.getName().equals(NPC_BABOON_BRAWLER)) &&
            !npc.isDead()
        );

        if (meleeBaboon != null) {
            return meleeBaboon;
        }

        // Priority 9: Any Baboon Thrall
        return NPCs.getNearest(npc -> npc.getName().equals(NPC_BABOON_THRALL) && !npc.isDead());
    }

    /**
     * Creates a predicate for filtering baboon NPCs by name
     */
    private java.util.function.Predicate<NPC> createBaboonFilter(String... names) {
        return npc -> {
            for (String name : names) {
                if (name.equals(npc.getName()) && !npc.isDead()) {
                    return true;
                }
            }
            return false;
        };
    }

    /**
     * Checks if a world point has a venom pool
     */
    private boolean isOnVenomPool(WorldPoint location) {
        return TileObjects.getFirstAt(location, OBJECT_VENOM_POOL) != null;
    }

    /**
     * Finds a safe spot near the player without venom pools
     */
    private WorldPoint findSafeSpotNearby(WorldPoint center) {
        return center.createWorldArea(SAFE_AREA_RADIUS)
            .toWorldPointList().stream()
            .filter(wp -> !isOnVenomPool(wp) && Reachable.isWalkable(wp))
            .findFirst()
            .orElse(null);
    }

    /**
     * Determines if Blood spells should be used for this baboon type
     */
    private boolean shouldUseBloodSpells(String baboonName) {
        return baboonName.equals(NPC_BABOON_THRALL) || baboonName.equals(NPC_BABOON_BRAWLER);
    }

    /**
     * Determines if Ice spells should be used for this baboon type
     */
    private boolean shouldUseIceSpells(String baboonName) {
        return baboonName.equals(NPC_CURSED_BABOON);
    }
}
