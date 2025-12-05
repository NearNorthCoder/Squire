/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Task that handles prayer flicking during combat.
 * Activates appropriate offensive and defensive prayers based on the enemy.
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.Brother;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles prayer activation and flicking during combat.
 * Determines which prayers to use based on the enemy type.
 */
@TaskDesc(name = "Handling Prayers", priority = Integer.MAX_VALUE)
public class HandlePrayersTask extends Task {
    private final SquireBarrowsConfig config;

    @Inject
    public HandlePrayersTask(SquireBarrowsConfig config) {
        this.config = config;
    }

    @Override
    public boolean run() {
        Player localPlayer = Players.getLocal();
        if (localPlayer == null) {
            return false;
        }

        // Don't flick prayers if out of prayer points
        if (Prayers.getPoints() == 0) {
            return false;
        }

        // Find nearest NPC that's attacking us
        NPC attackingNpc = NPCs.getNearest(npc ->
            Reachable.isInteractable(npc) &&
            (npc.getInteracting() == localPlayer || localPlayer.getInteracting() == npc)
        );

        if (attackingNpc == null) {
            // No enemies, disable all prayers
            if (Prayers.anyActive()) {
                Prayers.disableAll();
                return true;
            }
            return false;
        }

        // Determine which prayers to use
        List<Prayer> prayersToUse = getPrayersForNpc(attackingNpc);
        if (prayersToUse == null) {
            return false;
        }

        // Flick the prayers
        Prayers.flick(prayersToUse);
        return true;
    }

    /**
     * Determines which prayers to use against a specific NPC.
     *
     * @param npc The NPC we're fighting
     * @return List of prayers to activate
     */
    private List<Prayer> getPrayersForNpc(NPC npc) {
        String npcName = npc.getName();
        if (npcName == null) {
            return List.of();
        }

        ArrayList<Prayer> prayers = new ArrayList<>();

        // Karil (ranged brother)
        if (npcName.contains("Karil")) {
            prayers.addAll(this.config.karilOffensive().getPrayers());
            prayers.add(Prayer.PROTECT_FROM_MISSILES);
        }
        // Ahrim (magic brother)
        else if (npcName.contains("Ahrim")) {
            prayers.addAll(this.config.ahrimOffensive().getPrayers());
            prayers.add(Prayer.PROTECT_FROM_MAGIC);
        }
        // Other brothers (melee)
        else if (Brother.isBrotherAttackingPlayer(npc)) {
            prayers.addAll(this.config.defaultOffensive().getPrayers());
            prayers.add(Prayer.PROTECT_FROM_MELEE);
        }
        // Tunnel creatures (melee)
        else {
            prayers.addAll(this.config.tunnelOffensive().getPrayers());
            prayers.add(Prayer.PROTECT_FROM_MELEE);
        }

        return prayers;
    }
}
