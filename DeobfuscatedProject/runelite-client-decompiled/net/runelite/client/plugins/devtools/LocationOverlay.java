/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 */
package net.runelite.client.plugins.devtools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.devtools.DevToolsPlugin;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;

public class LocationOverlay
extends OverlayPanel {
    private final Client client;
    private final DevToolsPlugin plugin;

    @Inject
    LocationOverlay(Client client, DevToolsPlugin plugin) {
        this.client = client;
        this.plugin = plugin;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (!this.plugin.getLocation().isActive()) {
            return null;
        }
        WorldPoint worldPoint = this.client.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.client.getLocalPlayer().getLocalLocation();
        if (this.client.isInInstancedRegion()) {
            worldPoint = WorldPoint.fromLocalInstance((Client)this.client, (LocalPoint)localPoint);
            this.panelComponent.getChildren().add(LineComponent.builder().left("Instance").build());
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left("Local").right(localPoint.getX() + ", " + localPoint.getY()).build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("World").right(worldPoint.getX() + ", " + worldPoint.getY() + ", " + this.client.getPlane()).build());
        this.panelComponent.getChildren().add(LineComponent.builder().left("Scene").right(localPoint.getSceneX() + ", " + localPoint.getSceneY()).build());
        if (this.client.isInInstancedRegion()) {
            int[][][] instanceTemplateChunks = this.client.getInstanceTemplateChunks();
            int z = this.client.getPlane();
            for (int cy = 0; cy < 13; ++cy) {
                for (int cx = 0; cx < 13; ++cx) {
                    int chunkData = instanceTemplateChunks[z][cx][cy];
                    if (chunkData == -1) continue;
                    int rotation = chunkData >> 1 & 3;
                    int chunkY = chunkData >> 3 & 0x7FF;
                    int chunkX = chunkData >> 14 & 0x3FF;
                    int chunkPlane = chunkData >> 24 & 3;
                    boolean myChunk = cx == localPoint.getSceneX() / 8 && cy == localPoint.getSceneY() / 8;
                    this.panelComponent.getChildren().add(LineComponent.builder().left("Chunk").right(chunkX + ", " + chunkY + ", " + chunkPlane).rightColor(myChunk ? Color.GREEN : Color.WHITE).build());
                }
            }
        } else {
            this.panelComponent.getChildren().add(LineComponent.builder().left("Base").right(this.client.getBaseX() + ", " + this.client.getBaseY()).build());
        }
        for (int i = 0; i < this.client.getMapRegions().length; ++i) {
            int region = this.client.getMapRegions()[i];
            int mx = region >> 8;
            int my = region & 0xFF;
            this.panelComponent.getChildren().add(LineComponent.builder().left(i == 0 ? "Map regions" : " ").right(mx + ", " + my).rightColor(region == worldPoint.getRegionID() ? Color.GREEN : Color.WHITE).build());
        }
        return super.render(graphics);
    }
}

