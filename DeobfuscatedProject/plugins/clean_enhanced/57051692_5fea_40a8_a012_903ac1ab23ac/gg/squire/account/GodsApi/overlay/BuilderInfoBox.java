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
package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderShamans;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.57051692-5fea-40a8-a012-903ac1ab23acManager;
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
    
    private final  AccBuilderShamans bX;
    private final  BuilderConfig bY;

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderShamans.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(AccBuilderShamans.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(String.valueOf(AccBuilderShamans.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.valueOf(AccBuilderShamans.f)).build());
        0;
        int n2 = var1[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[8], var1[1]));
        return super.render(graphics2D);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static void var10() {
        var2 = new String[var1[9]];
        BuilderInfoBox.var2[BuilderInfoBox.var1[1]] = "Squire Shamans Builder";
        BuilderInfoBox.var2[BuilderInfoBox.var1[2]] = "Version";
        BuilderInfoBox.var2[BuilderInfoBox.var1[3]] = "Runtime";
        BuilderInfoBox.var2[BuilderInfoBox.var1[4]] = "Status:";
        BuilderInfoBox.var2[BuilderInfoBox.var1[5]] = "Current Quest:";
        BuilderInfoBox.var2[BuilderInfoBox.var1[6]] = "Tasks Completed:";
    }

    @Inject
    private BuilderInfoBox(AccBuilderShamans accBuilderShamans, BuilderConfig builderConfig) {
        this.bX = accBuilderShamans;
        this.bY = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.var11();
        BuilderInfoBox.var10();
    }

    private static void var11() {
        var1 = new int[11];
        BuilderInfoBox.var1[0] = 0x69 ^ 0x63;
        BuilderInfoBox.var1[1] = (0xA4 ^ 0x93) & ~(0x49 ^ 0x7E);
        BuilderInfoBox.var1[2] = 1;
        BuilderInfoBox.var1[3] = 2;
        BuilderInfoBox.var1[4] = 3;
        BuilderInfoBox.var1[5] = 0x8B ^ 0x8F;
        BuilderInfoBox.var1[6] = 0xE ^ 0xB;
        BuilderInfoBox.var1[7] = -(0xFFFFDFED & 0x76F7) & (0xFFFFFFF6 & 0x57EF);
        BuilderInfoBox.var1[8] = 0xBA ^ 0xAE;
        BuilderInfoBox.var1[9] = 0xF5 ^ 0xC6 ^ (0x83 ^ 0xB6);
        BuilderInfoBox.var1[10] = 0x2A ^ 0x22;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[1];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[1];
        while (BuilderInfoBox.var9(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

