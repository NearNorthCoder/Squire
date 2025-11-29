package gg.squire.sotf.steps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

/**
 * Parses the Hitpoints widget to extract base hitpoints and calculate combat-related metrics.
 * This utility class reads the hitpoints value from the game interface and performs
 * calculations to derive training progress metrics.
 */
public class HitpointsWidgetParser {

    private static final int WIDGET_GROUP_ID = 12543;
    private static final int WIDGET_CHILD_ID = 7;
    private static final int BASE_HITPOINTS = 10;
    private static final int HITPOINTS_DIVISOR = 7;
    private static final int XP_PER_HP = 4;
    private static final int MAX_RECURSION_DEPTH = 5;

    private static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");

    private boolean hasInitialized;
    private boolean hasCalculatedMetrics;
    private int totalHitpoints;
    private int calculatedRows;
    private int calculatedColumns;

    /**
     * Creates a new hitpoints widget parser.
     */
    public HitpointsWidgetParser() {
        this.hasInitialized = false;
        this.hasCalculatedMetrics = false;
    }

    /**
     * Updates the parser by reading the current hitpoints value from the widget.
     * This should be called periodically to keep metrics up to date.
     */
    public void update() {
        Widget hitpointsWidget = Widgets.get(WIDGET_GROUP_ID, WIDGET_CHILD_ID);

        if (hitpointsWidget != null && !hasInitialized && !hasCalculatedMetrics) {
            String widgetText = hitpointsWidget.getText();
            Matcher matcher = NUMBER_PATTERN.matcher(widgetText);

            if (matcher.find()) {
                hasInitialized = true;
                hasCalculatedMetrics = true;
                totalHitpoints = Integer.parseInt(matcher.group(0));
                calculateMetrics();
            }
        }
    }

    /**
     * Calculates derived metrics from the total hitpoints value.
     */
    private void calculateMetrics() {
        int baseLevel = totalHitpoints / HITPOINTS_DIVISOR;
        calculateRowsAndColumns(baseLevel);
    }

    /**
     * Recursively calculates row and column values based on the level.
     * This appears to be calculating training grid dimensions or similar metrics.
     *
     * @param level The current level to calculate from
     */
    private void calculateRowsAndColumns(int level) {
        if (level == 0) {
            return;
        }

        int currentValue = level * HITPOINTS_DIVISOR;
        int remainder = this.totalHitpoints - currentValue;

        // Check if this level creates a valid division by XP_PER_HP
        if (level <= MAX_RECURSION_DEPTH && remainder % XP_PER_HP == 0) {
            this.calculatedRows = level;
            this.calculatedColumns = remainder / XP_PER_HP;
        } else {
            // Recurse with decremented level
            calculateRowsAndColumns(level - 1);
        }
    }

    /**
     * Gets the calculated row value.
     *
     * @return The calculated row value
     */
    public int getCalculatedRows() {
        return this.calculatedRows;
    }

    /**
     * Gets the calculated column value.
     *
     * @return The calculated column value
     */
    public int getCalculatedColumns() {
        return this.calculatedColumns;
    }

    /**
     * Checks if a child widget matches the expected pattern for a specific value.
     * This appears to be unused but may have been part of a larger widget validation system.
     *
     * @param widget The parent widget to check
     * @param targetValue The value to match
     * @return true if a matching widget is found
     */
    @SuppressWarnings("unused")
    private boolean findMatchingChildWidget(Widget widget, int targetValue) {
        boolean found = false;

        Widget[] children = widget.getChildren();
        if (children == null) {
            return false;
        }

        for (Widget child : children) {
            if (child != null && child.getText().equals(targetValue + " (current)")) {
                found = true;
                break;
            }
        }

        return found;
    }
}
