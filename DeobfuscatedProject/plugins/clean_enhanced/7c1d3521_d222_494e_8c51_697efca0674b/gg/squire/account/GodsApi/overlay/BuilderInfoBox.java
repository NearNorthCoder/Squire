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
import gg.squire.account.AccBuilderSotf;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import gg.squire.account.GodsApi.overlay.7c1d3521-d222-494e-8c51-697efca0674bManager;

public class BuilderInfoBox
extends OverlayPanel {
    private final  BuilderConfig ce;

    private final  AccBuilderSotf cd;

    private static void var3() {
        var2 = new int[10];
        BuilderInfoBox.var2[0] = 0x5C ^ 0x56;
        BuilderInfoBox.var2[1] = (23 + 76 - 65 + 100 ^ 58 + 148 - 136 + 88) & (0x7E ^ 0x37 ^ (0x37 ^ 0x66) ^ -1);
        BuilderInfoBox.var2[2] = 1;
        BuilderInfoBox.var2[3] = 2;
        BuilderInfoBox.var2[4] = 3;
        BuilderInfoBox.var2[5] = 8 ^ 0xC;
        BuilderInfoBox.var2[6] = 15 + 24 - -64 + 56 ^ 76 + 127 - 177 + 128;
        BuilderInfoBox.var2[7] = 0xFFFFED26 & 0x13DB;
        BuilderInfoBox.var2[8] = 0x24 ^ 0x30;
        BuilderInfoBox.var2[9] = 0x4D ^ 0x4B;
    }

    static {
        BuilderInfoBox.var3();
        BuilderInfoBox.var4();
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderSotf.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(AccBuilderSotf.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.valueOf(AccBuilderSotf.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(AccBuilderSotf.f)).build());
        0;
        int n2 = var2[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[8], var2[1]));
        return super.render(graphics2D);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[1];
        while (BuilderInfoBox.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void var4() {
        var1 = new String[var2[9]];
        BuilderInfoBox.var1[BuilderInfoBox.var2[1]] = "Squire Sotf Builder";
        BuilderInfoBox.var1[BuilderInfoBox.var2[2]] = "Version";
        BuilderInfoBox.var1[BuilderInfoBox.var2[3]] = "Runtime";
        BuilderInfoBox.var1[BuilderInfoBox.var2[4]] = "Status:";
        BuilderInfoBox.var1[BuilderInfoBox.var2[5]] = "Current Quest:";
        BuilderInfoBox.var1[BuilderInfoBox.var2[6]] = "Tasks Completed:";
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private BuilderInfoBox(AccBuilderSotf accBuilderSotf, BuilderConfig builderConfig) {
        this.cd = accBuilderSotf;
        this.ce = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

