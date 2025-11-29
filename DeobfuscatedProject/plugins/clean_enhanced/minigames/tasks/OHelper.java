/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.YHelper;
import com.google.inject.Inject;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.TextComponent;

public class OHelper
extends Overlay {
    @Inject
    private  Client g;
    @Inject
    private  D aG;
    
    @Inject
    private  SquireBlastFurnaceConfig i;

    static {
        O.var2();
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var3_3;
        void var4_4;
        O var3;
        void var4;
        w w2 = this.aG.Y();
        if w2 == null {
            return null;
        }
        if (var4 instanceof y == 0) {
            return null;
        }
        Color var5 = ColorScheme.PROGRESS_COMPLETE_COLOR;
        LocalPoint var6 = LocalPoint.fromWorld((Client)var3.g, (WorldPoint)((y)var4).L());
        if var6 == null {
            return null;
        }
        Polygon polygon = Perspective.getCanvasTilePoly((Client)this.g, (LocalPoint)var4_4);
        graphics2D.setColor((Color)var3_3);
        graphics2D.draw(polygon);
        graphics2D.setColor(new Color(var3_3.getRed(), var3_3.getBlue(), var3_3.getGreen(), 0));
        graphics2D.fill(polygon);
        TextComponent textComponent = new TextComponent();
        Rectangle rectangle = polygon.getBounds();
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = fontMetrics.stringWidth(w2.J());
        int n3 = fontMetrics.getHeight();
        textComponent.setPosition(new Point(rectangle.x + rectangle.width / 1 - n2 / 1, rectangle.y + rectangle.height));
        textComponent.setColor((Color)var3_3);
        textComponent.setText(w2.J());
        textComponent.render(graphics2D);
        0;
        return null;
    }

    OHelper() {
        this.setPosition(OverlayPosition.DYNAMIC);
    }

}

