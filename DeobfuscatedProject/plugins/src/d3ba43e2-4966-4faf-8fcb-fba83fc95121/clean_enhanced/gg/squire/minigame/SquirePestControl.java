package gg.squire.minigame;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigame.overlay.PestControlInfoBox;
import gg.squire.minigame.pestcontrol.AttackMonstersTask;
import gg.squire.minigame.pestcontrol.EnterBoatTask;
import gg.squire.minigame.pestcontrol.PestControlNavigator;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.widgets.Widgets;

import java.time.Instant;

/**
 * Main plugin class for the Squire Pest Control bot.
 * Automates playing the Pest Control minigame to earn points.
 */
@PluginDescriptor(name = "Squire Pest Control", enabledByDefault = false)
public class SquirePestControl extends SquirePlugin {
    private static final String PLUGIN_STARTED_MESSAGE = "Squire Pest Control Plugin Started";
    private static final String NO_POINTS_MESSAGE = "No points gained, stopping plugin";
    private static final String POINTS_DELIMITER = " ";
    private static final int POINTS_WIDGET_ID = 8151;
    private static final int POINTS_WIDGET_CHILD_ID = 5;
    private static final int NO_POINTS_THRESHOLD = 150;

    @Inject
    private PestControlNavigator navigator;

    @Inject
    private EventBus eventBus;

    @Inject
    private ConfigManager configManager;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private PestControlInfoBox infoBoxOverlay;

    private int currentPoints;
    private int initialPoints;
    private int pointsGained;
    private Instant startTime;

    /**
     * Provides the plugin configuration.
     *
     * @param configManager The config manager
     * @return The plugin configuration
     */
    @Provides
    SquirePestControlConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquirePestControlConfig.class);
    }

    /**
     * Called when the plugin starts.
     * Initializes the overlay and tracking variables.
     */
    @Override
    protected void onStart() {
        System.out.println(PLUGIN_STARTED_MESSAGE);
        overlayManager.add((Overlay) infoBoxOverlay);
        startTime = Instant.now();
        currentPoints = 0;
    }

    /**
     * Called when the plugin stops.
     * Removes the overlay.
     */
    @Override
    protected void onStop() {
        overlayManager.remove((Overlay) infoBoxOverlay);
    }

    /**
     * Defines the task classes this plugin uses.
     *
     * @return Array of task classes
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[]{
                EnterBoatTask.class,
                AttackMonstersTask.class
        };
    }

    /**
     * Handles game tick events to track points and check for stopping conditions.
     *
     * @param gameTick The game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Check if we've gone too long without gaining points
        if (currentPoints >= NO_POINTS_THRESHOLD) {
            System.out.println(NO_POINTS_MESSAGE);
            forceStop();
            return;
        }

        // Read current Pest Control points from widget
        if (Widgets.get(POINTS_WIDGET_ID, POINTS_WIDGET_CHILD_ID) == null) {
            return;
        }

        String pointsText = Widgets.get(POINTS_WIDGET_ID, POINTS_WIDGET_CHILD_ID).getText();
        if (pointsText == null || pointsText.isEmpty()) {
            return;
        }

        // Parse points from widget text (format: "X points")
        currentPoints = Integer.parseInt(pointsText.split(POINTS_DELIMITER)[0]);

        // Initialize starting points on first read
        if (initialPoints == 0) {
            setInitialPoints(currentPoints);
        } else {
            // Calculate points gained
            pointsGained = currentPoints - initialPoints;
        }
    }

    /**
     * Logs menu action events for debugging.
     *
     * @param menuActionProcessed The menu action event
     */
    @Subscribe
    public void onMenuAction(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    /**
     * Gets the plugin start time.
     *
     * @return The instant the plugin started
     */
    public Instant getStartTime() {
        return this.startTime;
    }

    /**
     * Gets the initial Pest Control points when the plugin started.
     *
     * @return The initial points
     */
    public int getInitialPoints() {
        return this.initialPoints;
    }

    /**
     * Sets the initial Pest Control points.
     *
     * @param initialPoints The initial points value
     */
    public void setInitialPoints(int initialPoints) {
        this.initialPoints = initialPoints;
    }

    /**
     * Gets the number of points gained since the plugin started.
     *
     * @return The points gained
     */
    public int getPointsGained() {
        return this.pointsGained;
    }

    /**
     * Sets the number of points gained.
     *
     * @param pointsGained The points gained value
     */
    public void setPointsGained(int pointsGained) {
        this.pointsGained = pointsGained;
    }

    /**
     * Gets the current Pest Control points.
     *
     * @return The current points
     */
    public int getCurrentPoints() {
        return this.currentPoints;
    }

    /**
     * Sets the current Pest Control points.
     *
     * @param currentPoints The current points value
     */
    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }
}
