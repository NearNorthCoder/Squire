/*
 * Deobfuscated from CerberusOverlay
 * Package: gg.squire.basics.cerberus.overlay
 *
 * Overlay panel for displaying Cerberus plugin status and statistics.
 * Shows runtime, kill count, task status, and various combat flags.
 *
 * Original encrypted strings have been decrypted and replaced with clear text.
 */
package gg.squire.basics.cerberus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.TaskManager;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;  // CerberusManager
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;

/**
 * Overlay panel showing Cerberus plugin status.
 * Displays runtime, kills, current task, and combat state.
 */
public class CerberusOverlay extends OverlayPanel {

    /** Preferred overlay width in pixels */
    private static final int OVERLAY_WIDTH = 200;

    /** Additional width padding */
    private static final int WIDTH_PADDING = 50;

    private final SquireCerberus plugin;
    private final TaskManager taskManager;
    private final a cerberusManager;  // CerberusManager

    @Inject
    private CerberusOverlay(SquireCerberus plugin, a cerberusManager) {
        this.plugin = plugin;
        this.cerberusManager = cerberusManager;
        this.taskManager = plugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    /**
     * Calculates items/kills per hour based on current count and runtime.
     *
     * @param count current item or kill count
     * @return projected hourly rate
     */
    private long calculatePerHour(int count) {
        Duration runtime = Duration.between(plugin.getStarted(), Instant.now());
        if (runtime.isZero()) {
            return 0L;
        }
        return (long) ((double) count * (double) Duration.ofHours(1L).toMillis() / (double) runtime.toMillis());
    }

    @Override
    public Dimension render(Graphics2D graphics2D) {
        if (plugin.isPaintDisabled()) {
            return null;
        }

        // Title
        panelComponent.getChildren().add(
            TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text("Squire Cerberus")
                .build()
        );

        // Runtime
        Duration runtime = Duration.between(plugin.getStarted(), Instant.now());
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Runtime")
                .right(Time.format(runtime))
                .build()
        );

        // Cerberus spawned status
        String cerberusSpawned = cerberusManager.k() != null ? "True" : "Not Spawned";
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Cerberus spawned")
                .right(cerberusSpawned)
                .build()
        );

        // Ghost phase active status
        String ghostPhaseStatus = plugin.isGhostPhaseActive() ? "Yes" : "No";
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Ghosts")
                .right(ghostPhaseStatus)
                .build()
        );

        // Kill count with per-hour rate
        int killCount = plugin.getKillCount();
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Kills")
                .right(killCount + " (" + calculatePerHour(killCount) + "/hr)")
                .build()
        );

        // Food available status
        String foodAvailable = cerberusManager.h().isEmpty() ? "None" : "Yes";
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Food available")
                .right(foodAvailable)
                .build()
        );

        // Food amount
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Food Amount (inventory)")
                .right(String.valueOf(cerberusManager.n()))
                .build()
        );

        // In instance status
        String inInstanceStatus = cerberusManager.l() ? "Yes" : "No";
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("In Cerb instance")
                .right(inInstanceStatus)
                .build()
        );

        // Prayer potion amount
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Prayer Potion Amount")
                .right(String.valueOf(cerberusManager.o()))
                .build()
        );

        // Current task
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Task")
                .right(taskManager.getCurrentTask())
                .build()
        );

        // Set panel size
        panelComponent.setPreferredSize(new Dimension(OVERLAY_WIDTH + WIDTH_PADDING, 0));
        return super.render(graphics2D);
    }
}
