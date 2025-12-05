/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Point
 */
package net.runelite.client.plugins.unethicaldevtools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Point;
import net.runelite.client.plugins.unethicaldevtools.UnethicalDevToolsConfig;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.managers.InputManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class InteractionOverlay
extends Overlay {
    private static final Logger log = LoggerFactory.getLogger(InteractionOverlay.class);
    private final UnethicalDevToolsConfig config;
    private final InputManager inputManager;

    @Inject
    public InteractionOverlay(UnethicalDevToolsConfig config, InputManager inputManager) {
        this.config = config;
        this.inputManager = inputManager;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_WIDGETS);
        this.setPriority(OverlayPriority.LOW);
    }

    @Override
    public Dimension render(Graphics2D g) {
        if (this.config.drawMouse()) {
            g.setFont(new Font("Tahoma", 1, 18));
            OverlayUtil.renderTextLocation(g, new Point(this.inputManager.getLastClickX() - g.getFont().getSize() / 3, this.inputManager.getLastClickY() + g.getFont().getSize() / 3), "X", Color.WHITE);
            OverlayUtil.renderTextLocation(g, new Point(this.inputManager.getLastMoveX() - g.getFont().getSize() / 3, this.inputManager.getLastMoveY() + g.getFont().getSize() / 3), "X", Color.GREEN);
        }
        return null;
    }
}

