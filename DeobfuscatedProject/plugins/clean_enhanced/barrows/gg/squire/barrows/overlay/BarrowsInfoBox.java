/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Overlay that displays Barrows run statistics and current state.
 * Shows runtime, potential, kills, and other relevant information.
 */
package gg.squire.barrows.overlay;

import com.google.inject.Inject;
import gg.squire.barrows.BarrowsHelper;
import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.TaskManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

import java.awt.*;
import java.time.Duration;
import java.time.Instant;

/**
 * Overlay panel displaying Barrows run statistics.
 * Shows progress, kills, loot, and per-hour rates.
 */
public class BarrowsInfoBox extends OverlayPanel {
    private static final int BARROWS_CHEST_VALUE = 77566; // Average value per chest
    private static final int OVERLAY_WIDTH = 190;
    private static final int OVERLAY_BORDER_SIZE = 10;

    private final SquireBarrows plugin;
    private final TaskManager taskManager;
    private final BarrowsHelper helper;

    @Inject
    private BarrowsInfoBox(SquireBarrows plugin, BarrowsHelper helper) {
        this.plugin = plugin;
        this.taskManager = plugin.getManager();
        this.helper = helper;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (this.plugin.isPaintDisabled()) {
            return null;
        }

        Duration runtime = Duration.between(this.plugin.getStarted(), Instant.now());

        this.panelComponent.setBorder(new Rectangle(OVERLAY_BORDER_SIZE, OVERLAY_BORDER_SIZE,
            OVERLAY_BORDER_SIZE, OVERLAY_BORDER_SIZE));

        // Title
        this.panelComponent.getChildren().add(
            TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text("Squire Barrows")
                .build()
        );

        // Runtime
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Runtime:")
                .right(Time.format(runtime))
                .build()
        );

        // Status
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Status:")
                .right("Active")
                .build()
        );

        // Current task
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Task:")
                .right(this.taskManager.getCurrentTask())
                .build()
        );

        // Reward potential
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("KC:")
                .right(String.valueOf(this.helper.getCurrentPotential()))
                .build()
        );

        // Chests opened
        int chestsOpened = this.plugin.getChestsOpened();
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Chests:")
                .right(String.format("%d (%d/hr)", chestsOpened, getPerHour(chestsOpened)))
                .build()
        );

        // Chest value per hour
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Chest Value:")
                .right(formatNumber(getValuePerHour(chestsOpened)))
                .build()
        );

        // Unique drops
        int uniqueDrops = this.plugin.getUniqueDrops();
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Uniques:")
                .right(String.format("%d (%d/hr)", uniqueDrops, getPerHour(uniqueDrops)))
                .build()
        );

        // House restore state
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("House Restore:")
                .right(String.valueOf(this.plugin.needsHouseRestore()))
                .build()
        );

        // Should bank state
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Should Bank:")
                .right(String.valueOf(this.plugin.shouldBank()))
                .build()
        );

        // All brothers killed
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left("All Killed:")
                .right(String.valueOf(this.plugin.allBrothersKilled()))
                .build()
        );

        this.panelComponent.setPreferredSize(new Dimension(OVERLAY_WIDTH + OVERLAY_BORDER_SIZE, 0));
        return super.render(graphics);
    }

    /**
     * Calculates the per-hour rate for a given count.
     *
     * @param count The total count
     * @return The per-hour rate
     */
    private long getPerHour(int count) {
        Duration runtime = Duration.between(this.plugin.getStarted(), Instant.now());
        if (!runtime.isZero()) {
            return (long) ((double) count * (double) Duration.ofHours(1L).toMillis() / (double) runtime.toMillis());
        }
        return 0L;
    }

    /**
     * Calculates the value per hour based on chest count.
     *
     * @param chestCount The number of chests opened
     * @return The estimated value per hour
     */
    private double getValuePerHour(int chestCount) {
        Duration runtime = Duration.between(this.plugin.getStarted(), Instant.now());
        if (!runtime.isZero()) {
            return (double) chestCount * (double) Duration.ofHours(1L).toMillis() / (double) runtime.toMillis();
        }
        return 0.0;
    }

    /**
     * Formats a number to a readable string with K/M suffixes.
     *
     * @param value The value to format
     * @return The formatted string
     */
    private static String formatNumber(double value) {
        if (value >= 1000000.0) {
            double millions = value / 1000.0;
            return String.format("%.0fM", millions);
        }
        if (value >= 1000.0) {
            double thousands = value / 1000.0;
            if (thousands % 1.0 == 0.0) {
                return String.format("%.0fK", thousands);
            }
            return String.format("%.1fK", thousands);
        }
        if (value % 1.0 == 0.0) {
            return String.format("%.0f", value);
        }
        return String.format("%.0f", value);
    }
}
