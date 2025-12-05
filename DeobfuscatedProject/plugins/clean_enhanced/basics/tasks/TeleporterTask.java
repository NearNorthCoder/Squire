/*
 * Deobfuscated with CFR 0.152.
 *
 * Teleporter Task
 * Task implementation for the standalone teleporter plugin.
 *
 * Original obfuscated class: aV
 * Package: i.i.b.s.c.q.r.s.s.-.u.a.e
 */
package gg.squire.basics.tasks;

import com.google.inject.Inject;
import gg.squire.basics.enums.TeleportSpell;
import gg.squire.basics.magic.teleporter.SquireTeleporterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Task that automatically casts configured teleportation spells.
 * Can use progressive mode to automatically select the highest level teleport.
 */
@TaskDesc(name = "Teleporting")
public class TeleporterTask extends Task {

    // Animation IDs for teleport animations
    private static final int ANIMATION_STANDARD_TELEPORT = 8939;
    private static final int ANIMATION_ANCIENT_TELEPORT = 9606;
    private static final int ANIMATION_HOME_TELEPORT = -1;

    private final SquireTeleporterConfig config;

    /**
     * Constructs a new TeleporterTask.
     *
     * @param config the teleporter configuration
     */
    @Inject
    public TeleporterTask(SquireTeleporterConfig config) {
        this.config = config;
    }

    /**
     * Executes the teleporter task.
     * Casts the configured teleport spell or the highest available if in progressive mode.
     *
     * @return true if the task should continue running, false otherwise
     */
    @Override
    public boolean run() {
        Player localPlayer = Players.getLocal();

        // Wait if no player
        if (localPlayer == null) {
            return false;
        }

        // Only teleport when player is not currently animating or teleporting
        if (localPlayer.getAnimation() == ANIMATION_STANDARD_TELEPORT ||
            localPlayer.getAnimation() == ANIMATION_ANCIENT_TELEPORT ||
            localPlayer.getAnimation() == ANIMATION_HOME_TELEPORT) {
            return true; // Continue running but wait for animation to finish
        }

        // If using progressive mode, find the highest level teleport we can cast
        if (config.teleport() == TeleportSpell.PROGRESSIVE) {
            // Create a reversed list (highest level first)
            List<TeleportSpell> teleportList = new ArrayList<>(List.of(TeleportSpell.values()));
            Collections.reverse(teleportList);

            // Find first teleport we can cast
            for (TeleportSpell teleport : teleportList) {
                if (teleport.canCast()) {
                    teleport.getSpell().cast();
                    return true;
                }
            }

            return false; // No teleports available
        }

        // Use configured specific teleport
        if (config.teleport().canCast()) {
            config.teleport().getSpell().cast();
            return true;
        }

        return false;
    }
}
