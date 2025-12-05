package gg.squire.combat.overlays;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
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
 * Overlay panel that displays plugin information and statistics.
 * Shows runtime, current task, and loot counts.
 */
public class PluginInfoBox extends OverlayPanel {
    private final SquireBlueDragonKiller plugin;
    private final TaskManager taskManager;
    private final SquireBlueDragonKillerConfig config;

    @Inject
    public PluginInfoBox(SquireBlueDragonKiller plugin, SquireBlueDragonKiller pluginRef,
                        SquireBlueDragonKillerConfig config) {
        this.plugin = plugin;
        this.taskManager = plugin.getManager();
        this.config = config;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        // Don't render if plugin is disabled
        if (this.plugin.isPaintDisabled()) {
            return null;
        }

        Duration runtime = Duration.between(plugin.getStarted(), Instant.now());

        // Title
        panelComponent.getChildren().add(
            TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text("Blue Dragon Killer")
                .build()
        );

        // Runtime
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Runtime:")
                .right(Time.format(runtime))
                .build()
        );

        // Current task
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Status:")
                .right("Running")
                .build()
        );

        // Current task name
        panelComponent.getChildren().add(
            LineComponent.builder()
                .left("Task:")
                .right(taskManager.getCurrentTask())
                .build()
        );

        // Loot statistics
        if (config.lootBones()) {
            panelComponent.getChildren().add(
                LineComponent.builder()
                    .left("Bones:")
                    .right(plugin.getBonesLooted() + " (" +
                           calculatePerHour(plugin.getBonesLooted()) + "/h)")
                    .build()
            );
        }

        if (config.lootHides()) {
            panelComponent.getChildren().add(
                LineComponent.builder()
                    .left("Blue Dragonhides:")
                    .right(plugin.getHidesLooted() + " (" +
                           calculatePerHour(plugin.getHidesLooted()) + "/h)")
                    .build()
            );
        }

        if (config.lootScales()) {
            panelComponent.getChildren().add(
                LineComponent.builder()
                    .left("Blue Dragon Scales:")
                    .right(plugin.getScalesLooted() + " (" +
                           calculatePerHour(plugin.getScalesLooted()) + "/h)")
                    .build()
            );
        }

        if (config.lootEnsouled()) {
            panelComponent.getChildren().add(
                LineComponent.builder()
                    .left("Ensouled Dragon Heads:")
                    .right(plugin.getEnsouledLooted() + " (" +
                           calculatePerHour(plugin.getEnsouledLooted()) + "/h)")
                    .build()
            );
        }

        int width = 200;
        this.panelComponent.setPreferredSize(new Dimension(width, 0));
        return super.render(graphics);
    }

    /**
     * Calculates items per hour based on current runtime.
     *
     * @param count Current item count
     * @return Projected items per hour
     */
    public long calculatePerHour(int count) {
        Duration runtime = Duration.between(plugin.getStarted(), Instant.now());
        if (!runtime.isZero()) {
            return (long) ((double) count * (double) Duration.ofHours(1).toMillis() /
                          (double) runtime.toMillis());
        }
        return 0;
    }
}
