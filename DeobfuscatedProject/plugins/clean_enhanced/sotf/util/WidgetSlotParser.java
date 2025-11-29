package gg.squire.sotf.util;

import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parses widget text containing slot numbers and converts them to grid coordinates.
 *
 * This utility is used to extract numeric slot identifiers from OSRS widget text
 * and calculate their corresponding position in a grid layout. The grid is organized
 * with 7 columns and 4 items per column (28 total slots).
 *
 * Common use case: Converting a displayed slot number (e.g., "slot 15") to its
 * (column, row) coordinates for interaction or validation.
 */
public class WidgetSlotParser {

    // Grid dimensions
    private static final int WIDGET_PARENT_ID = 625;
    private static final int WIDGET_CHILD_ID = 7;
    private static final int GRID_COLUMNS = 7;
    private static final int ITEMS_PER_COLUMN = 4;
    private static final int MAX_COLUMN_INDEX = 5;

    // Regex pattern to extract numeric values from widget text
    private static final String NUMERIC_PATTERN = "[0-9]+";

    // State tracking
    private boolean widgetParsed;
    private boolean coordinatesCalculated;
    private boolean slotFound;
    private boolean validPosition;
    private boolean initialized;

    // Parsed values
    private int slotNumber;
    private int columnIndex;
    private int rowIndex;

    /**
     * Creates a new WidgetSlotParser instance with default state.
     */
    public WidgetSlotParser() {
        this.widgetParsed = false;
        this.coordinatesCalculated = false;
        this.slotFound = false;
        this.validPosition = false;
        this.initialized = false;
    }

    /**
     * Parses the widget text to extract the slot number.
     *
     * Retrieves the widget at the configured parent:child ID and uses regex
     * to extract the first numeric value from its text. If found, calculates
     * the grid coordinates for that slot.
     */
    public void parseWidgetSlot() {
        Widget widget = Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID);

        if (!widgetParsed && widget != null && !coordinatesCalculated) {
            Matcher matcher = Pattern.compile(NUMERIC_PATTERN).matcher(widget.getText());

            if (matcher.find()) {
                widgetParsed = true;
                coordinatesCalculated = true;
                slotNumber = Integer.parseInt(matcher.group(0));
                calculateGridPosition();
            }
        }
    }

    /**
     * Calculates grid coordinates from the parsed slot number.
     *
     * Divides the slot number by the number of columns to determine
     * which column the slot belongs to, then uses recursive calculation
     * to find the exact position.
     */
    private void calculateGridPosition() {
        int columnGuess = slotNumber / GRID_COLUMNS;
        findExactPosition(columnGuess);
    }

    /**
     * Recursively determines the exact grid position for the slot.
     *
     * This method works by trying different column positions and checking
     * if the remaining slots divide evenly into rows. The grid layout uses
     * 7 columns with 4 items per column.
     *
     * @param columnAttempt The column index to try
     */
    private void findExactPosition(int columnAttempt) {
        if (columnAttempt == 0) {
            return;
        }

        int slotOffset = columnAttempt * GRID_COLUMNS;
        int remainingSlots = slotNumber - slotOffset;

        if (columnAttempt <= MAX_COLUMN_INDEX && remainingSlots % ITEMS_PER_COLUMN == 0) {
            slotFound = true;
            columnIndex = columnAttempt;
            rowIndex = remainingSlots / ITEMS_PER_COLUMN;
        } else {
            // Try the previous column
            findExactPosition(columnAttempt - 1);
        }
    }

    /**
     * Gets the column index (x-coordinate) of the parsed slot.
     *
     * @return The column index in the grid
     */
    public int getColumnIndex() {
        return columnIndex;
    }

    /**
     * Gets the row index (y-coordinate) of the parsed slot.
     *
     * @return The row index in the grid
     */
    public int getRowIndex() {
        return rowIndex;
    }

    /**
     * Checks if a widget contains text indicating it's the current selection.
     *
     * Iterates through the child widgets to find one with text matching
     * the pattern "N (current)" where N is the slot number.
     *
     * @param parentWidget The parent widget to search
     * @param targetSlot The slot number to check
     * @return true if the slot is marked as current, false otherwise
     */
    private boolean isCurrentSlot(Widget parentWidget, int targetSlot) {
        boolean foundCurrent = false;
        Widget[] children = parentWidget.getChildren();

        for (int i = 0; i < children.length; i++) {
            Widget child = children[i];
            if (child.getText().equals(targetSlot + " (current)")) {
                foundCurrent = true;
            }
        }

        return foundCurrent;
    }
}
