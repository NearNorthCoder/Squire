/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import gg.squire.autotoa.tasks.AutotoaManager;

/**
 * ObjectNPCOverlay - Renders tile objects and NPCs with colored outlines.
 *
 * This overlay highlights important game objects and NPCs:
 * - Tile objects are outlined in yellow (ColorScheme.BRAND_YELLOW)
 * - NPCs are outlined in orange (ColorScheme.BRAND_ORANGE)
 *
 * Used to visually identify important targets during Tombs of Amascut gameplay.
 */
public class ObjectNPCOverlay extends Overlay {

    /** TOA configuration */
    private final TOAConfig config;

    /** The task manager providing object and NPC data */
    private final AutotoaManager taskManager;

    /** RuneLite client instance */
    private final Client client;

    /**
     * Renders the overlay by drawing object and NPC highlights.
     *
     * @param graphics The graphics context to draw on
     * @return null (no specific dimension requirements)
     */
    public Dimension render(Graphics2D graphics) {
        this.renderTileObjects(graphics);
        this.renderNPCs(graphics);
        return null;
    }

    /**
     * Renders yellow outlines around tile objects.
     *
     * @param graphics The graphics context to draw on
     */
    private void renderTileObjects(Graphics2D graphics) {
        Iterator<TileObject> objectIterator = this.taskManager.getTrackedTileObjects().iterator();

        while (isTrue(objectIterator.hasNext() ? 1 : 0)) {
            TileObject tileObject = objectIterator.next();
            Polygon tilePoly = tileObject.getCanvasTilePoly();

            // Skip if tile has no visible polygon
            if (isNull(tilePoly)) {
                continue;
            }

            // Draw the tile object in yellow with 1px stroke
            OverlayUtil.renderPolygon(
                graphics,
                tilePoly,
                ColorScheme.BRAND_YELLOW,
                new BasicStroke(1.0f)
            );
        }
    }

    /**
     * Renders orange outlines around NPCs.
     *
     * @param graphics The graphics context to draw on
     */
    private void renderNPCs(Graphics2D graphics) {
        List<NPC> npcList = this.taskManager.getTrackedNPCList();
        Iterator<NPC> npcIterator = npcList.iterator();

        while (isTrue(npcIterator.hasNext() ? 1 : 0)) {
            NPC npc = npcIterator.next();
            Shape convexHull = npc.getConvexHull();

            // Only render if NPC has a visible convex hull
            if (isNotNull(convexHull)) {
                OverlayUtil.renderPolygon(
                    graphics,
                    convexHull,
                    ColorScheme.BRAND_ORANGE,
                    new BasicStroke(1.0f)
                );
            }
        }
    }

    /**
     * Checks if an object is not null.
     *
     * @param object The object to check
     * @return true if object is not null
     */
    private static boolean isNotNull(Object object) {
        return object != null;
    }

    /**
     * Creates a new object/NPC overlay.
     *
     * @param client RuneLite client instance
     * @param taskManager The task manager providing data
     * @param config TOA configuration
     */
    @Inject
    protected ObjectNPCOverlay(Client client, AutotoaManager taskManager, TOAConfig config) {
        this.client = client;
        this.taskManager = taskManager;
        this.config = config;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    /**
     * Checks if an object is null.
     *
     * @param object The object to check
     * @return true if object is null
     */
    private static boolean isNull(Object object) {
        return object == null;
    }

    /**
     * Checks if an integer represents a true boolean value.
     *
     * @param value The integer to check
     * @return true if value is non-zero
     */
    private static boolean isTrue(int value) {
        return value != 0;
    }
}
