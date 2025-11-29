/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.account.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderRat;
import gg.squire.account.BuilderConfig;
import gg.squire.account.overlay.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {

    private final  BuilderConfig bu;
    private final  AccBuilderRat bt;

    private static void var3() {
        var1 = new String[var2[9]];
        BuilderInfoBox.var1[BuilderInfoBox.var2[1]] = "Squire Rat King Builder";
        BuilderInfoBox.var1[BuilderInfoBox.var2[2]] = "Version";
        BuilderInfoBox.var1[BuilderInfoBox.var2[3]] = "Runtime";
        BuilderInfoBox.var1[BuilderInfoBox.var2[4]] = "Status:";
        BuilderInfoBox.var1[BuilderInfoBox.var2[5]] = "Current Quest:";
        BuilderInfoBox.var1[BuilderInfoBox.var2[6]] = "Tasks Completed:";
    }

    private static void var4() {
        var2 = new int[10];
        BuilderInfoBox.var2[0] = 0x50 ^ 0x40 ^ (0x2D ^ 0x37);
        BuilderInfoBox.var2[1] = (0x73 ^ 0x24) & ~(0x28 ^ 0x7F);
        BuilderInfoBox.var2[2] = 1;
        BuilderInfoBox.var2[3] = 2;
        BuilderInfoBox.var2[4] = 3;
        BuilderInfoBox.var2[5] = 0x11 ^ 0x15;
        BuilderInfoBox.var2[6] = 0x20 ^ 0x3B ^ (0x19 ^ 7);
        BuilderInfoBox.var2[7] = 0xFFFFFD72 & 0x38F;
        BuilderInfoBox.var2[8] = 153 + 13 - 51 + 67 ^ 150 + 152 - 150 + 10;
        BuilderInfoBox.var2[9] = 119 + 140 - 83 + 0 ^ 57 + 111 - 126 + 140;
    }

    static {
        BuilderInfoBox.var4();
        BuilderInfoBox.var3();
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[1];
        while (BuilderInfoBox.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-(0xC2 ^ 0xC6) <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderRat accBuilderRat, BuilderConfig builderConfig) {
        this.bt = accBuilderRat;
        this.bu = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderRat.b;
        double d2 = 0.14;
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(AccBuilderRat.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.valueOf(AccBuilderRat.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(AccBuilderRat.f)).build());
        0;
        int n2 = var2[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[8], var2[1]));
        return super.render(graphics2D);
    }
}

