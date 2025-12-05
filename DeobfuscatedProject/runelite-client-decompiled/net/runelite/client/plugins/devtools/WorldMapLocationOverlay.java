/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.worldmap.WorldMap
 */
package net.runelite.client.plugins.devtools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.worldmap.WorldMap;
import net.runelite.client.plugins.devtools.DevToolsPlugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.worldmap.WorldMapOverlay;

public class WorldMapLocationOverlay
extends Overlay {
    private final Client client;
    private final WorldMapOverlay worldMapOverlay;
    private final DevToolsPlugin plugin;

    @Inject
    private WorldMapLocationOverlay(Client client, WorldMapOverlay worldMapOverlay, DevToolsPlugin plugin) {
        this.client = client;
        this.worldMapOverlay = worldMapOverlay;
        this.plugin = plugin;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setPriority(1.0f);
        this.setLayer(OverlayLayer.MANUAL);
        this.drawAfterInterface(595);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (!this.plugin.getWorldMapLocation().isActive()) {
            return null;
        }
        WorldMap worldMap = this.client.getWorldMap();
        Widget worldMapWidget = this.client.getWidget(38993927);
        if (worldMap == null || worldMapWidget == null) {
            return null;
        }
        Rectangle worldMapRectangle = worldMapWidget.getBounds();
        graphics.setClip(worldMapRectangle);
        graphics.setColor(Color.CYAN);
        WorldPoint mapCenterPoint = new WorldPoint(worldMap.getWorldMapPosition().getX(), worldMap.getWorldMapPosition().getY(), 0);
        Point middle = this.worldMapOverlay.mapWorldPointToGraphicsPoint(mapCenterPoint);
        if (middle == null) {
            return null;
        }
        graphics.drawLine(middle.getX(), worldMapRectangle.y, middle.getX(), worldMapRectangle.y + worldMapRectangle.height);
        graphics.drawLine(worldMapRectangle.x, middle.getY(), worldMapRectangle.x + worldMapRectangle.width, middle.getY());
        String output = "Center: " + mapCenterPoint.getX() + ", " + mapCenterPoint.getY();
        graphics.setColor(Color.white);
        FontMetrics fm = graphics.getFontMetrics();
        int height = fm.getHeight();
        int width = fm.stringWidth(output);
        graphics.fillRect((int)worldMapRectangle.getX(), (int)worldMapRectangle.getY() + worldMapRectangle.height - height, (int)worldMapRectangle.getX() + width, (int)worldMapRectangle.getY() + worldMapRectangle.height);
        graphics.setColor(Color.BLACK);
        graphics.drawString(output, (int)worldMapRectangle.getX(), (int)worldMapRectangle.getY() + worldMapRectangle.height);
        return null;
    }
}

