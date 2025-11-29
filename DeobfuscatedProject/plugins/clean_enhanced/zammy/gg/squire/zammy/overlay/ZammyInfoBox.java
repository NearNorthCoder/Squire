/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.zammy.SquireZammy;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import gg.squire.zammy.overlay.PlacingCannonBaseTask;
import gg.squire.zammy.overlay.ZammyManager;
import gg.squire.zammy.overlay.ZammyManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;

public class ZammyInfoBox
extends OverlayPanel {
    private final  B G;
    private final  k E;
    private final  TaskManager F;
    private final  SquireZammy C;
    
    private final  l D;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public ZammyInfoBox(SquireZammy squireZammy, l l2, k k2, B b2) {
        this.C = squireZammy;
        this.D = l2;
        this.E = k2;
        this.F = squireZammy.getManager();
        this.G = b2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.C.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String string = var2[1];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[2]).right(String.valueOf(this.D.A())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[3]).right(String.valueOf(this.D.B())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(String.valueOf(this.D.J())).build());
        0;
        int n2 = Math.max(1, this.G.Q() - Static.getClient().getTickCount());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(String.valueOf(n2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(this.F.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

}

