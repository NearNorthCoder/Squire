/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 */
package net.unethicalite.api.script.paint;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.RenderableEntity;
import net.unethicalite.api.script.paint.DefaultPaint;
import net.unethicalite.client.devtools.EntityRenderer;
import net.unethicalite.client.managers.InputManager;

@Singleton
public class Paint
extends Overlay {
    private final List<RenderableEntity> overlays = new ArrayList<RenderableEntity>();
    private boolean enabled = false;
    @Inject
    private EntityRenderer entityRenderer;
    @Inject
    private ConfigManager configManager;
    @Inject
    private InputManager inputManager;
    public final DefaultPaint tracker = new DefaultPaint();

    @Inject
    public Paint(OverlayManager overlayManager) {
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_WIDGETS);
        this.setPriority(OverlayPriority.LOW);
        overlayManager.add(this);
    }

    @Override
    public Dimension render(Graphics2D g) {
        Font font = g.getFont();
        if (!this.enabled) {
            return null;
        }
        for (RenderableEntity renderableEntity : this.overlays) {
            renderableEntity.render(g);
        }
        return null;
    }

    public void submit(RenderableEntity p) {
        this.overlays.add(p);
    }

    public void clear() {
        this.overlays.clear();
        this.tracker.clear();
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (enabled) {
            this.submit(this.tracker.getTracker());
        }
    }
}

