/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package net.runelite.client.plugins.unethicaldevtools;

import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.client.plugins.unethicaldevtools.UnethicalDevToolsConfig;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.unethicalite.client.devtools.EntityRenderer;

public class UnethicalDevToolsOverlay
extends Overlay {
    private final UnethicalDevToolsConfig config;
    private final EntityRenderer entityRenderer;

    @Inject
    private UnethicalDevToolsOverlay(UnethicalDevToolsConfig config, EntityRenderer entityRenderer) {
        this.config = config;
        this.entityRenderer = entityRenderer;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_WIDGETS);
        this.setPriority(OverlayPriority.HIGHEST);
    }

    @Override
    public Dimension render(Graphics2D g) {
        this.entityRenderer.setActions(this.config.actions());
        this.entityRenderer.setNames(this.config.names());
        this.entityRenderer.setAnimations(this.config.animations());
        this.entityRenderer.setGraphics(this.config.graphics());
        this.entityRenderer.setActions(this.config.actions());
        this.entityRenderer.setIds(this.config.ids());
        this.entityRenderer.setIndexes(this.config.indexes());
        this.entityRenderer.setQuantities(this.config.quantities());
        this.entityRenderer.setWorldLocations(this.config.worldLocations());
        this.entityRenderer.setTrueWorldLocations(this.config.trueWorldLocations());
        this.entityRenderer.setTileLocation(this.config.tileLocation());
        this.entityRenderer.setGameObjects(this.config.gameObjects());
        this.entityRenderer.setDecorativeObjects(this.config.decorObjects());
        this.entityRenderer.setGraphicsObjects(this.config.graphicsObjects());
        this.entityRenderer.setGroundObjects(this.config.groundObjects());
        this.entityRenderer.setInventory(this.config.inventory());
        this.entityRenderer.setPlayers(this.config.players());
        this.entityRenderer.setProjectiles(this.config.projectiles());
        this.entityRenderer.setNpcs(this.config.npcs());
        this.entityRenderer.setGroundObjects(this.config.groundObjects());
        this.entityRenderer.setTileItems(this.config.tileItems());
        this.entityRenderer.setWallObjects(this.config.wallObjects());
        this.entityRenderer.setPath(this.config.path());
        this.entityRenderer.render(g);
        return null;
    }
}

