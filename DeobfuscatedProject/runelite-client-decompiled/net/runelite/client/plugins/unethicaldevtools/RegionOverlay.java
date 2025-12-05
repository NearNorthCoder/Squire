/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.MenuOpened
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.runelite.client.plugins.unethicaldevtools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.unethicaldevtools.UnethicalDevToolsConfig;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.utils.CoordUtils;
import net.unethicalite.api.utils.DrawUtils;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class RegionOverlay
extends Overlay {
    private static final Logger log = LoggerFactory.getLogger(RegionOverlay.class);
    private static final Color RED_TRANSLUCENT = new Color(255, 0, 0, 128);
    private final UnethicalDevToolsConfig config;
    private final GlobalCollisionMap collisionMap;
    private final Client client;
    private final ExecutorService executorService;
    private List<WorldPoint> path = new ArrayList<WorldPoint>();

    @Inject
    public RegionOverlay(UnethicalDevToolsConfig config, GlobalCollisionMap collisionMap, Client client, ExecutorService executorService) {
        this.config = config;
        this.collisionMap = collisionMap;
        this.client = client;
        this.executorService = executorService;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_WIDGETS);
        this.setPriority(OverlayPriority.LOW);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
        if (worldMap != null) {
            Rectangle mapBounds = worldMap.getBounds();
            graphics.setClip(mapBounds);
            if (this.config.transportsOverlay()) {
                List<Transport> transports = TransportLoader.buildTransports();
                for (Transport transport : transports) {
                    Point linkCenter;
                    DrawUtils.drawOnMap(graphics, transport.getDestination(), Color.magenta);
                    Point center = CoordUtils.worldPointToWorldMap(transport.getSource());
                    if (center == null || (linkCenter = CoordUtils.worldPointToWorldMap(transport.getDestination())) == null) continue;
                    graphics.drawLine(center.getX(), center.getY(), linkCenter.getX(), linkCenter.getY());
                }
            }
            if (this.config.collisionOverlay()) {
                Set<WorldPoint> worldMapTiles = Tiles.getWorldMapTiles();
                Iterator<Transport> iterator = worldMapTiles.iterator();
                while (iterator.hasNext()) {
                    WorldPoint worldMapTile = (WorldPoint)iterator.next();
                    if (worldMapTile == null || !this.collisionMap.fullBlock(worldMapTile)) continue;
                    DrawUtils.drawOnMap(graphics, worldMapTile, RED_TRANSLUCENT);
                }
            }
            if (this.config.pathOverlay() && !this.path.isEmpty()) {
                for (WorldPoint tile : this.path) {
                    DrawUtils.drawOnMap(graphics, tile, Color.RED);
                }
                DrawUtils.drawOnMap(graphics, this.path.get(this.path.size() - 1), Color.GREEN);
            }
            return null;
        }
        if (this.config.transportsOverlay()) {
            DrawUtils.drawTransports(graphics);
        }
        if (this.config.collisionOverlay()) {
            DrawUtils.drawCollisions(graphics);
        }
        if (this.config.pathOverlay() && !this.path.isEmpty()) {
            for (WorldPoint tile : this.path) {
                tile.outline(this.client, graphics, Color.RED);
            }
            this.path.get(this.path.size() - 1).outline(this.client, graphics, Color.GREEN, "Destination");
        }
        return null;
    }

    @Subscribe
    public void onMenuOpened(MenuOpened event) {
        if (!this.config.pathOverlay()) {
            return;
        }
        Point mouse = this.client.getMouseCanvasPosition();
        Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
        if (worldMap == null) {
            Tile clickPoint = Tiles.getHoveredTile();
            if (clickPoint == null) {
                return;
            }
            this.client.createMenuEntry(1).setOption("<col=00ff00>Debug:</col>").setTarget("Calculate path").setType(MenuAction.RUNELITE_OVERLAY).onClick(e -> this.executorService.execute(() -> {
                this.path = Walker.calculatePath(clickPoint.getWorldLocation());
            }));
        } else {
            if (!worldMap.getBounds().contains(mouse.getX(), mouse.getY())) {
                return;
            }
            this.client.createMenuEntry(1).setOption("<col=00ff00>Debug:</col>").setTarget("Calculate path").setType(MenuAction.RUNELITE_OVERLAY).onClick(e -> {
                WorldPoint clickPoint = CoordUtils.worldMapToWorldPoint(mouse);
                if (clickPoint == null) {
                    return;
                }
                this.executorService.execute(() -> {
                    this.path = Walker.calculatePath(clickPoint);
                });
            });
        }
    }
}

