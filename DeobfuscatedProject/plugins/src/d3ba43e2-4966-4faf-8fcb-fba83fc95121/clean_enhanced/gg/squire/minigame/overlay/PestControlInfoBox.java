package gg.squire.minigame.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigame.SquirePestControl;
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
 * Overlay panel that displays Pest Control plugin statistics.
 * Shows runtime, points gained, and points per hour.
 */
public class PestControlInfoBox extends OverlayPanel {
    private static final String TITLE = "Squire Pest Control";
    private static final String RUNTIME_LABEL = "Runtime:";
    private static final String INITIAL_POINTS_LABEL = "Initial Points:";
    private static final String POINTS_LABEL = "Points:";
    private static final String POINTS_PER_HOUR_LABEL = "Points/Hr:";
    private static final int OVERLAY_WIDTH = 200;

    private final SquirePestControl plugin;
    private final TaskManager taskManager;

    /**
     * Creates a new Pest Control info box overlay.
     *
     * @param taskManager The task manager
     * @param plugin      The main plugin instance
     */
    @Inject
    public PestControlInfoBox(TaskManager taskManager, SquirePestControl plugin) {
        this.taskManager = taskManager;
        this.plugin = plugin;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    /**
     * Renders the overlay panel.
     *
     * @param graphics The graphics context
     * @return The preferred size of the overlay
     */
    @Override
    public Dimension render(Graphics2D graphics) {
        if (plugin.isPaintDisabled()) {
            return null;
        }

        Duration runtime = Duration.between(plugin.getStartTime(), Instant.now());

        // Title
        panelComponent.getChildren().add(TitleComponent.builder()
                .color(ColorScheme.BRAND_ORANGE)
                .text(TITLE)
                .build());

        // Runtime
        panelComponent.getChildren().add(LineComponent.builder()
                .left(RUNTIME_LABEL)
                .right(Time.format(runtime))
                .build());

        // Initial Points
        panelComponent.getChildren().add(LineComponent.builder()
                .left(INITIAL_POINTS_LABEL)
                .right(String.valueOf(plugin.getInitialPoints()))
                .build());

        // Current Points Gained
        panelComponent.getChildren().add(LineComponent.builder()
                .left(POINTS_LABEL)
                .right(String.valueOf(plugin.getPointsGained()))
                .build());

        // Points Per Hour
        panelComponent.getChildren().add(LineComponent.builder()
                .left(POINTS_PER_HOUR_LABEL)
                .right(String.valueOf(calculatePointsPerHour(plugin.getPointsGained())))
                .build());

        panelComponent.setPreferredSize(new Dimension(OVERLAY_WIDTH, 0));
        return super.render(graphics);
    }

    /**
     * Calculates the points per hour rate based on runtime.
     *
     * @param pointsGained The number of points gained so far
     * @return The projected points per hour, or 0 if runtime is zero
     */
    private long calculatePointsPerHour(int pointsGained) {
        Duration runtime = Duration.between(plugin.getStartTime(), Instant.now());

        if (!runtime.isZero()) {
            return (long) ((double) pointsGained * (double) Duration.ofHours(1).toMillis() / (double) runtime.toMillis());
        }

        return 0;
    }
}
