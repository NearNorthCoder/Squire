/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Helper class for Barrows-related calculations and queries.
 * Handles reward potential tracking and tunnel creature management.
 */
package gg.squire.barrows;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for Barrows minigame mechanics.
 * Tracks reward potential and manages tunnel creatures.
 */
@Singleton
public class BarrowsHelper {
    // Varbit ID for total reward potential
    private static final int REWARD_POTENTIAL_VARBIT = 17535;

    // Minimum potential to fight tunnel creatures
    private static final int MIN_POTENTIAL_FOR_CREATURES = 73;

    // Multiplier for reward potential calculation
    private static final int POTENTIAL_MULTIPLIER = 10;

    private final SquireBarrows plugin;
    private final SquireBarrowsConfig config;

    @Inject
    public BarrowsHelper(SquireBarrows plugin, SquireBarrowsConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    /**
     * Gets the current reward potential from the varbit.
     *
     * @return The current reward potential value
     */
    public int getCurrentPotential() {
        return Vars.getBit(REWARD_POTENTIAL_VARBIT);
    }

    /**
     * Calculates the remaining reward potential needed to reach the target.
     * Takes into account the last brother if not all brothers are defeated.
     *
     * @return The remaining potential needed
     */
    public int getRemainingPotential() {
        int currentPotential = this.getCurrentPotential();
        Brother lastBrother = this.plugin.getLastBrother();

        if (lastBrother != null && this.plugin.getBrothersKilledCount() != 6) {
            // Account for the last brother's combat level in the calculation
            return this.config.rewardPotential() * POTENTIAL_MULTIPLIER - currentPotential - lastBrother.getCombatLevel() + 2;
        }

        return this.config.rewardPotential() * POTENTIAL_MULTIPLIER - currentPotential;
    }

    /**
     * Gets a list of tunnel creatures to fight based on the current potential.
     * If below the minimum threshold, returns common tunnel creatures.
     * Otherwise, returns creatures whose potential values match the remaining potential.
     *
     * @param remainingPotential The remaining potential needed
     * @return List of NPC names to target
     */
    public List<String> getTunnelCreaturesToFight(int remainingPotential) {
        ArrayList<String> creatureNames = new ArrayList<>();

        // If below minimum threshold, fight common creatures
        if (remainingPotential > MIN_POTENTIAL_FOR_CREATURES) {
            creatureNames.add(TunnelCreature.BLOODWORM.getNpcName());
            creatureNames.add(TunnelCreature.SKELETON.getNpcName());
            creatureNames.add(TunnelCreature.GIANT_CRYPT_RAT.getNpcName());
            creatureNames.add(TunnelCreature.GIANT_CRYPT_SPIDER.getNpcName());
            return creatureNames;
        }

        // Add creatures whose potential values match our needs
        ArrayList<String> targetCreatures = new ArrayList<>();
        for (TunnelCreature creature : TunnelCreature.values()) {
            if (creature.getPotential() <= remainingPotential) {
                targetCreatures.add(creature.getNpcName());
            }
        }

        return targetCreatures;
    }

    /**
     * Gets all tunnel creatures that are currently attacking the player.
     *
     * @param remainingPotential The remaining potential needed
     * @return List of NPCs attacking the player
     */
    public List<NPC> getAttackingCreatures(int remainingPotential) {
        return NPCs.getAll(npc ->
            npc.getInteracting() == Players.getLocal() &&
            this.getTunnelCreaturesToFight(remainingPotential).contains(npc.getName())
        );
    }
}
