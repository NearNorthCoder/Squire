/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Auto TOA Plugin
 *
 * Debug overlay that displays plugin state, runtime, and raid statistics
 */
package gg.squire.autotoa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

/**
 * Debug overlay that displays plugin information and statistics
 * Shows current task, runtime, raid counts, deaths, and custom debug states
 */
@Singleton
public class DebugOverlay extends OverlayPanel {

    // Display labels
    private static final String TITLE = "Squire Auto TOA";
    private static final String LABEL_RUNTIME = "Runtime";
    private static final String LABEL_VERSION = "Version";
    private static final String VERSION = "2.10.3";
    private static final String LABEL_PERFORMING_TASK = "Performing Task";
    private static final String LABEL_COMPLETED_RAIDS = "Completed Raids";
    private static final String LABEL_DEATHS_THIS_RAID = "Deaths (this raid)";
    private static final String LABEL_FAILED_RAIDS = "Failed Raids";

    private final AutotoaManager autotoaManager;
    private final SquireAutoTOA plugin;
    private final TaskManager taskManager;

    @Inject
    protected DebugOverlay(SquireAutoTOA plugin, AutotoaManager autotoaManager) {
        this.plugin = plugin;
        this.taskManager = plugin.getManager();
        this.autotoaManager = autotoaManager;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    @Override
    public Dimension render(Graphics2D graphics2D) {
        // Don't render if paint is disabled
        if (this.plugin.isPaintDisabled()) {
            return null;
        }

        // Calculate runtime duration
        Duration runtime = Duration.between(this.plugin.getStarted(), Instant.now());

        // Add title
        this.panelComponent.getChildren().add(
            TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text(TITLE)
                .build()
        );

        // Add runtime
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left(LABEL_RUNTIME)
                .right(Time.format(runtime))
                .build()
        );

        // Add version
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left(LABEL_VERSION)
                .right(VERSION)
                .build()
        );

        // Add current task
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left(LABEL_PERFORMING_TASK)
                .right(this.taskManager.getCurrentTask())
                .build()
        );

        // Add completed raids count
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left(LABEL_COMPLETED_RAIDS)
                .right(String.valueOf(this.plugin.getCompletedRaidsCount()))
                .build()
        );

        // Add deaths this raid
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left(LABEL_DEATHS_THIS_RAID)
                .right(String.valueOf(this.plugin.getDeathsThisRaid()))
                .build()
        );

        // Add failed raids count
        this.panelComponent.getChildren().add(
            LineComponent.builder()
                .left(LABEL_FAILED_RAIDS)
                .right(String.valueOf(this.plugin.getFailedRaidsCount()))
                .build()
        );

        // Add custom debug states from AutotoaManager
        // The manager can provide additional debug information specific to current room/boss
        for (GameState state : this.autotoaManager.getDebugStates().keySet()) {
            this.panelComponent.getChildren().add(
                LineComponent.builder()
                    .left(state.toString())
                    .right(this.autotoaManager.getDebugStates().get(state).toString())
                    .build()
            );
        }

        return super.render(graphics2D);
    }
}
