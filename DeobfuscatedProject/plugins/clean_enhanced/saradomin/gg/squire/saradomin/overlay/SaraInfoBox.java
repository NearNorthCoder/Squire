/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.saradomin.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.saradomin.SquireSaradomin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import gg.squire.saradomin.overlay.SaradominManager;
import gg.squire.saradomin.overlay.SaradominManager;

public class SaraInfoBox
extends OverlayPanel {
    
    private final  g F;
    
    private final  f G;
    private final  SquireSaradomin E;
    private final  TaskManager H;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SaraInfoBox.var9(this.E.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        String string = var2[var1[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(String.valueOf(this.F.l())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[3]]).right(String.valueOf(this.F.m())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(String.valueOf(this.F.u())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(this.H.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.valueOf(this.E.a())).build());
        0;
        return super.render(graphics2D);
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[1];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[1];
        while (SaraInfoBox.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (3 > ((0xF2 ^ 0xA8) & ~(0x7D ^ 0x27))) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static void var21() {
        var2 = new String[var1[7]];
        SaraInfoBox.var2[SaraInfoBox.var1[1]] = "Squire Saradomin";
        SaraInfoBox.var2[SaraInfoBox.var1[2]] = "Zily alive";
        SaraInfoBox.var2[SaraInfoBox.var1[3]] = "Inside room";
        SaraInfoBox.var2[SaraInfoBox.var1[4]] = "Sara Kills";
        SaraInfoBox.var2[SaraInfoBox.var1[5]] = "Current Task";
        SaraInfoBox.var2[SaraInfoBox.var1[6]] = "Banking";
    }

    @Inject
    public SaraInfoBox(SquireSaradomin squireSaradomin, g g2, f f2) {
        this.E = squireSaradomin;
        this.F = g2;
        this.G = f2;
        this.H = squireSaradomin.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    static {
        SaraInfoBox.var22();
        SaraInfoBox.var21();
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static void var22() {
        var1 = new int[9];
        SaraInfoBox.var1[0] = 0xA1 ^ 0x98 ^ (0xBE ^ 0x8D);
        SaraInfoBox.var1[1] = (0x42 ^ 0x6C) & ~(0xBB ^ 0x95);
        SaraInfoBox.var1[2] = 1;
        SaraInfoBox.var1[3] = 2;
        SaraInfoBox.var1[4] = 3;
        SaraInfoBox.var1[5] = 0x79 ^ 0x7D;
        SaraInfoBox.var1[6] = 0x33 ^ 0x36;
        SaraInfoBox.var1[7] = 0x39 ^ 0x3F;
        SaraInfoBox.var1[8] = 0x1C ^ 0x14;
    }
}

