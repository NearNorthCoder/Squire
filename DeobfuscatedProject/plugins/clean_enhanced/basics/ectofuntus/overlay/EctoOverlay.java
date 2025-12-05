/*
 * Deobfuscated from EctoOverlay
 * Package: gg.squire.basics.ectofuntus.overlay
 *
 * Overlay panel for displaying Ectofuntus plugin status and statistics.
 * Shows runtime, task status, and phase counters.
 */
package gg.squire.basics.ectofuntus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.client.plugins.fw.TaskManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;

/**
 * Overlay panel showing Ectofuntus plugin status.
 * Displays runtime, current task, phase completion counts, and hourly rates.
 */
public class EctoOverlay extends OverlayPanel {

    /** Preferred overlay width in pixels */
    private static final int OVERLAY_WIDTH = 200;

    /** Additional width padding */
    private static final int WIDTH_PADDING = 20;

    private final SquireEcto plugin;
    private final TaskManager taskManager;

    @Inject
    private EctoOverlay(SquireEcto plugin) {
        this.plugin = plugin;
        this.taskManager = plugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    /**
     * Calculates items/actions per hour based on current count and runtime.
     *
     * @param count current action count
     * @return projected hourly rate
     */
    public long calculatePerHour(int count) {
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

        // Calculate runtime
        Duration runtime = Duration.between(plugin.getStarted(), Instant.now());

        // Title
        panelComponent.getChildren().add(
            TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text("Squire Ectofuntus")
                .build()
        );

        // Runtime
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Runtime")
                .right(Time.format(runtime))
                .build()
        );

        // Current task
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Task")
                .right(taskManager.getCurrentTask())
                .build()
        );

        // Paint disabled status
        String paintStatus = plugin.isPaintDisabled() ? "Yes" : "No";
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Paint Disabled")
                .right(paintStatus)
                .build()
        );

        // Offerings made with per-hour rate
        int offeringsMade = plugin.getOfferingsMade();
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Offerings Made")
                .right(offeringsMade + " (" + calculatePerHour(offeringsMade) + "/h)")
                .build()
        );

        // Bones ground with per-hour rate
        int bonesGround = plugin.getBonesGround();
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Bones Ground")
                .right(bonesGround + " (" + calculatePerHour(bonesGround) + "/h)")
                .build()
        );

        // Slime collected with per-hour rate
        int slimeCollected = plugin.getSlimeCollected();
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Slime Collected")
                .right(slimeCollected + " (" + calculatePerHour(slimeCollected) + "/h)")
                .build()
        );

        // Set panel size
        panelComponent.setPreferredSize(new Dimension(OVERLAY_WIDTH + WIDTH_PADDING, 0));
        return super.render(graphics2D);
    }
}
