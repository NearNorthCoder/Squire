package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

import java.awt.*;

/**
 * Base overlay class for rendering TOA (Tombs of Amascut) task visualizations.
 *
 * <p>This abstract class provides common rendering utilities for drawing tiles,
 * polygons, and text on the game overlay. It handles the complex mathematics
 * of converting between world coordinates, local coordinates, and screen
 * coordinates.
 *
 * <p>Key rendering capabilities:
 * <ul>
 *   <li>Tile highlighting with custom colors and transparency</li>
 *   <li>Polygon rendering with stroke and fill options</li>
 *   <li>Text rendering with shadow effects</li>
 *   <li>Height-based perspective calculations</li>
 *   <li>Distance-based render culling</li>
 * </ul>
 *
 * <p>All subclasses must implement the Overlay render method to display
 * their specific task information.
 *
 * @author Squire Deobfuscation Team
 */
public abstract class ToaOverlayBase extends Overlay {

    // ========== Rendering Constants ==========

    /** Bit shift amount for tile coordinate calculations (divides by 128) */
    private static final int TILE_COORDINATE_SHIFT = 7;

    /** Tile coordinate mask for sub-tile positioning (127 in binary) */
    private static final int TILE_COORDINATE_MASK = 127;

    /** Tile size in local coordinate units (128 units per tile) */
    private static final int TILE_SIZE = 128;

    /** Maximum render distance in tiles - tiles beyond this won't be rendered */
    private static final int MAX_RENDER_DISTANCE = 32;

    /** Scene size in tiles (104x104 grid) */
    private static final int SCENE_SIZE = 104;

    /** Default text size for overlay rendering */
    private static final int DEFAULT_TEXT_SIZE = 12;

    /** Default stroke width for polygon outlines */
    private static final int DEFAULT_STROKE_WIDTH = 2;

    /** Default fill transparency for tile highlighting */
    private static final int DEFAULT_FILL_ALPHA = 50;

    /** Default stroke width for highlighted tiles */
    private static final int DEFAULT_TILE_STROKE = 1;

    /** Constant for tile edge calculations */
    private static final int TILE_EDGE_OFFSET = 0;

    // ========== Injected Dependencies ==========

    /**
     * The RuneLite client instance for accessing game state.
     */
    @Inject
    protected Client client;

    /**
     * The TOA plugin configuration.
     */
    protected final TOAConfig config;

    // ========== Constructor ==========

    /**
     * Creates a new TOA overlay with the specified configuration.
     *
     * @param config The TOA plugin configuration
     */
    @Inject
    protected ToaOverlayBase(TOAConfig config) {
        this.config = config;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setPriority(OverlayPriority.HIGH);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    // ========== World Point Rendering ==========

    /**
     * Renders a tile at the specified world point with custom styling.
     *
     * <p>This method handles distance culling - tiles beyond MAX_RENDER_DISTANCE
     * from the player will not be rendered for performance.
     *
     * @param graphics The graphics context to draw on
     * @param worldPoint The world location to highlight
     * @param color The base color for the tile
     * @param strokeWidth The width of the tile border
     * @param strokeAlpha The transparency of the border (0-255)
     * @param fillAlpha The transparency of the fill (0-255)
     */
    protected void renderTile(Graphics2D graphics, WorldPoint worldPoint, Color color,
                             int strokeWidth, int strokeAlpha, int fillAlpha) {
        WorldPoint playerLocation = this.client.getLocalPlayer().getWorldLocation();

        // Distance culling - don't render distant tiles
        if (worldPoint.distanceTo(playerLocation) >= MAX_RENDER_DISTANCE) {
            return;
        }

        LocalPoint localPoint = LocalPoint.fromWorld(this.client, worldPoint);
        if (localPoint == null) {
            return;
        }

        Polygon tilePoly = Perspective.getCanvasTilePoly(this.client, localPoint);
        if (tilePoly == null) {
            return;
        }

        // Draw the tile with stroke
        graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), strokeAlpha));
        graphics.setStroke(new BasicStroke(strokeWidth));
        graphics.draw(tilePoly);

        // Fill the tile with transparency
        graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), fillAlpha));
        graphics.fill(tilePoly);
    }

    /**
     * Renders a tile at the specified local point with default styling.
     *
     * @param graphics The graphics context to draw on
     * @param color The color for the tile
     * @param localPoint The local point to highlight
     */
    protected void renderTile(Graphics2D graphics, Color color, LocalPoint localPoint) {
        if (localPoint == null) {
            return;
        }

        Polygon tilePoly = Perspective.getCanvasTilePoly(this.client, localPoint);
        if (tilePoly == null) {
            return;
        }

        renderPolygon(graphics, color, tilePoly, DEFAULT_TILE_STROKE, DEFAULT_FILL_ALPHA);
    }

    // ========== Polygon Rendering ==========

    /**
     * Renders a polygon with stroke and fill.
     *
     * @param graphics The graphics context
     * @param color The base color
     * @param polygon The polygon to render
     * @param strokeWidth The border width
     * @param fillAlpha The fill transparency (0-255)
     */
    protected void renderPolygon(Graphics2D graphics, Color color, Polygon polygon,
                                int strokeWidth, int fillAlpha) {
        if (polygon == null) {
            return;
        }

        graphics.setColor(color);
        graphics.setStroke(new BasicStroke(strokeWidth));
        graphics.draw(polygon);

        graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), fillAlpha));
        graphics.fill(polygon);
    }

    /**
     * Renders a polygon outline only.
     *
     * @param graphics The graphics context
     * @param color The color for the outline
     * @param polygon The polygon to render
     * @param strokeWidth The border width
     */
    protected void renderPolygon(Graphics2D graphics, Color color, Polygon polygon, int strokeWidth) {
        if (polygon == null) {
            return;
        }

        graphics.setColor(color);
        graphics.setStroke(new BasicStroke(strokeWidth));
        graphics.draw(polygon);
    }

    /**
     * Renders a polygon with default stroke width.
     *
     * @param graphics The graphics context
     * @param color The outline color
     * @param polygon The polygon to render
     */
    protected void renderPolygon(Graphics2D graphics, Color color, Polygon polygon) {
        renderPolygon(graphics, color, polygon, DEFAULT_STROKE_WIDTH);
    }

    // ========== Text Rendering ==========

    /**
     * Renders text at the specified screen position with a shadow effect.
     *
     * @param graphics The graphics context
     * @param text The text to render
     * @param color The text color
     * @param position The screen position for the text
     */
    public void renderText(Graphics2D graphics, String text, Color color, Point position) {
        if (position == null) {
            return;
        }

        graphics.setFont(new Font(FontManager.getRunescapeSmallFont().toString(),
                                 Font.PLAIN, DEFAULT_TEXT_SIZE));

        // Draw shadow slightly offset
        Point shadowPos = new Point(position.getX(), position.getY());
        Point mainPos = new Point(position.getX() + 1, position.getY() + 1);

        OverlayUtil.renderTextLocation(graphics, mainPos, text, Color.BLACK);
        OverlayUtil.renderTextLocation(graphics, shadowPos, text, color);
    }

    // ========== Tile Polygon Creation ==========

    /**
     * Creates a polygon representing a tile at the specified local point.
     *
     * <p>Simplified version using default border settings.
     *
     * @param client The client instance
     * @param localPoint The center point of the tile
     * @param tileCount Number of tiles for the polygon size
     * @param useCenterOffset If true, use center offset positioning
     * @return The tile polygon, or null if not on screen
     */
    public static Polygon createTilePolygon(Client client, LocalPoint localPoint,
                                           int tileCount, boolean useCenterOffset) {
        return createTilePolygon(client, localPoint, tileCount, TILE_EDGE_OFFSET, useCenterOffset);
    }

    /**
     * Creates a polygon representing a tile at the specified local point.
     *
     * <p>Basic version with default parameters.
     *
     * @param client The client instance
     * @param localPoint The center point of the tile
     * @param tileCount Number of tiles for the polygon size
     * @return The tile polygon, or null if not on screen
     */
    public static Polygon createTilePolygon(Client client, LocalPoint localPoint, int tileCount) {
        return createTilePolygon(client, localPoint, tileCount, TILE_EDGE_OFFSET, false);
    }

    /**
     * Creates a polygon representing multiple tiles at the specified local point.
     *
     * <p>This is the core method for creating accurate tile polygons with
     * perspective correction. It handles:
     * <ul>
     *   <li>Tile height calculations based on terrain</li>
     *   <li>Multi-tile area support</li>
     *   <li>Perspective transformation to screen coordinates</li>
     *   <li>Plane transitions (bridges, upper floors)</li>
     * </ul>
     *
     * @param client The client instance for coordinate conversions
     * @param localPoint The center point of the tile area
     * @param tileCount The number of tiles in each direction (1 = 1x1, 2 = 2x2, etc.)
     * @param borderOffset Additional pixel offset for tile borders
     * @param useCenterOffset If true, center the polygon; if false, start from corner
     * @return A polygon representing the tile(s), or null if not renderable
     */
    public static Polygon createTilePolygon(Client client, LocalPoint localPoint,
                                          int tileCount, int borderOffset, boolean useCenterOffset) {
        int plane = client.getPlane();

        // Calculate the bounds of the tile area
        int minX, minY, maxX, maxY;

        if (useCenterOffset) {
            // Center the area around the local point
            int halfSize = tileCount * (TILE_SIZE + borderOffset) / 2;
            minX = localPoint.getX() - halfSize;
            minY = localPoint.getY() - halfSize;
            maxX = localPoint.getX() + halfSize;
            maxY = localPoint.getY() + halfSize;
        } else {
            // Start from the corner
            int offset = (TILE_SIZE + borderOffset) / 2;
            minX = localPoint.getX() - offset;
            minY = localPoint.getY() - offset;
            maxX = minX + tileCount * (TILE_SIZE + borderOffset);
            maxY = minY + tileCount * (TILE_SIZE + borderOffset);
        }

        // Get tile settings for plane detection
        byte[][][] tileSettings = client.getTileSettings();
        int sceneX = localPoint.getSceneX();
        int sceneY = localPoint.getSceneY();

        // Validate scene coordinates
        if (sceneX < 0 || sceneY < 0 || sceneX >= SCENE_SIZE || sceneY >= SCENE_SIZE) {
            return null;
        }

        // Check for plane transitions (bridges, upper floors)
        int heightPlane = plane;
        if (plane < 3 && (tileSettings[1][sceneX][sceneY] & 2) == 2) {
            heightPlane = plane + 1;
        }

        // Get heights at each corner for perspective
        int swHeight = getTileHeight(client, minX, minY, heightPlane);
        int seHeight = getTileHeight(client, maxX, minY, heightPlane);
        int neHeight = getTileHeight(client, maxX, maxY, heightPlane);
        int nwHeight = getTileHeight(client, minX, maxY, heightPlane);

        // Convert to screen coordinates
        Point swPoint = Perspective.localToCanvas(client, minX, minY, swHeight);
        Point sePoint = Perspective.localToCanvas(client, maxX, minY, seHeight);
        Point nePoint = Perspective.localToCanvas(client, maxX, maxY, neHeight);
        Point nwPoint = Perspective.localToCanvas(client, minX, maxY, nwHeight);

        // Verify all points are on screen
        if (swPoint == null || sePoint == null || nePoint == null || nwPoint == null) {
            return null;
        }

        // Create the polygon
        Polygon polygon = new Polygon();
        polygon.addPoint(swPoint.getX(), swPoint.getY());
        polygon.addPoint(sePoint.getX(), sePoint.getY());
        polygon.addPoint(nePoint.getX(), nePoint.getY());
        polygon.addPoint(nwPoint.getX(), nwPoint.getY());

        return polygon;
    }

    // ========== Height Calculation ==========

    /**
     * Calculates the height at a specific local coordinate.
     *
     * <p>This method performs bilinear interpolation to get smooth height
     * values between tile corners. It's essential for accurate perspective
     * rendering on sloped terrain.
     *
     * <p>The algorithm:
     * <ol>
     *   <li>Find the four tile corners surrounding the point</li>
     *   <li>Get their heights from the tile height map</li>
     *   <li>Interpolate in X direction for both Y values</li>
     *   <li>Interpolate in Y direction for final height</li>
     * </ol>
     *
     * @param client The client instance
     * @param localX The local X coordinate
     * @param localY The local Y coordinate
     * @param plane The plane (height level) to check
     * @return The interpolated height at this position, or 0 if out of bounds
     */
    private static int getTileHeight(Client client, int localX, int localY, int plane) {
        // Convert local coordinates to tile coordinates
        int tileX = localX >> TILE_COORDINATE_SHIFT;
        int tileY = localY >> TILE_COORDINATE_SHIFT;

        // Validate bounds
        if (tileX < 0 || tileY < 0 || tileX >= SCENE_SIZE || tileY >= SCENE_SIZE) {
            return 0;
        }

        // Get height map
        int[][][] tileHeights = client.getTileHeights();

        // Get sub-tile position for interpolation
        int subX = localX & TILE_COORDINATE_MASK;
        int subY = localY & TILE_COORDINATE_MASK;

        // Interpolate between tile corners
        // Get heights at the four corners of the current tile
        int heightSW = tileHeights[plane][tileX][tileY];
        int heightSE = tileHeights[plane][tileX + 1][tileY];
        int heightNW = tileHeights[plane][tileX][tileY + 1];
        int heightNE = tileHeights[plane][tileX + 1][tileY + 1];

        // Interpolate in X direction for both Y positions
        int heightS = (subX * heightSE + (TILE_SIZE - subX) * heightSW) >> TILE_COORDINATE_SHIFT;
        int heightN = ((TILE_SIZE - subX) * heightNW + subX * heightNE) >> TILE_COORDINATE_SHIFT;

        // Interpolate in Y direction for final height
        return ((TILE_SIZE - subY) * heightS + subY * heightN) >> TILE_COORDINATE_SHIFT;
    }
}
