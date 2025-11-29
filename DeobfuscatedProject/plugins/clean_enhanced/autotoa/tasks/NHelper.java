/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
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
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.KephriManager;

/**
 * NPCOverlay - Renders NPC convex hulls as blue outlines.
 *
 * This overlay highlights NPCs by drawing their convex hull boundaries
 * in blue. Used to visually identify NPCs of interest during
 * Tombs of Amascut gameplay.
 */
public class NPCOverlay extends AutotoaTaskBase {

    /** RuneLite client instance */
    private final Client client;

    /** Reference to the task manager providing NPC data */
    private final AutotoaManager taskManager;

    /**
     * Renders the overlay by drawing NPC highlights.
     *
     * @param graphics The graphics context to draw on
     * @return null (no specific dimension requirements)
     */
    public Dimension render(Graphics2D graphics) {
        this.renderNPCHighlights(graphics);
        return null;
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
     * Creates a new NPC overlay.
     *
     * @param config TOA configuration
     * @param client RuneLite client instance
     * @param taskManager The task manager providing NPC data
     */
    @Inject
    protected NPCOverlay(TOAConfig config, Client client, AutotoaManager taskManager) {
        super(config);
        this.client = client;
        this.taskManager = taskManager;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    /**
     * Renders blue outlines around NPC convex hulls.
     *
     * @param graphics The graphics context to draw on
     */
    private void renderNPCHighlights(Graphics2D graphics) {
        // Iterate through all NPCs tracked by the task manager
        Iterator<NPC> npcIterator = this.taskManager.getTrackedNPCs().iterator();

        while (isTrue(npcIterator.hasNext() ? 1 : 0)) {
            NPC npc = npcIterator.next();
            Shape convexHull = npc.getConvexHull();

            // Skip if NPC has no visible convex hull
            if (isNull(convexHull)) {
                continue;
            }

            // Draw the NPC convex hull in blue with 1px stroke
            OverlayUtil.renderPolygon(
                graphics,
                convexHull,
                Color.BLUE,
                new BasicStroke(1.0f)
            );
        }
    }
}
