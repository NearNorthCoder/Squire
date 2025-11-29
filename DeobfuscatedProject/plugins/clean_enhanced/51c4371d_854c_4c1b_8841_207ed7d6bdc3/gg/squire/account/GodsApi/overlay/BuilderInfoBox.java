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

import gg.squire.account.GodsApi.overlay.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import com.google.inject.Inject;
import gg.squire.account.AccBuilderBarrows;
import gg.squire.account.BuilderConfig;
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
    private static  String[] lIllllll;
    private final  BuilderConfig bv;
    private static  int[] llIIIIIl;
    private final  AccBuilderBarrows bu;

    private static boolean var1(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderBarrows.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llIIIIIl[0], llIIIIIl[0], llIIIIIl[0], llIIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllllll[llIIIIIl[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[4]]).right(AccBuilderBarrows.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[5]]).right(String.valueOf(AccBuilderBarrows.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[6]]).right(String.valueOf(AccBuilderBarrows.f)).build());
        0;
        int n2 = llIIIIIl[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIIIIIl[8], llIIIIIl[1]));
        return super.render(graphics2D);
    }

        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderBarrows accBuilderBarrows, BuilderConfig builderConfig) {
        this.bu = accBuilderBarrows;
        this.bv = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.var8();
        BuilderInfoBox.var9();
    }

    private static void var9() {
        lIllllll = new String[llIIIIIl[9]];
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[1]] = "Squire Barrows Builder";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[2]] = "Version";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[3]] = "Runtime";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[4]] = "Status:";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[5]] = "Current Quest:";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[6]] = "Tasks Completed:";
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = llIIIIIl[1];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = llIIIIIl[1];
        while (BuilderInfoBox.var1(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    private static void var8() {
        llIIIIIl = new int[10];
        BuilderInfoBox.llIIIIIl[0] = 0x39 ^ 0x33;
        BuilderInfoBox.llIIIIIl[1] = (0xC8 ^ 0xC1 ^ (0x30 ^ 0x3D)) & (0xB7 ^ 0x8D ^ (0x50 ^ 0x6E) ^ -1);
        BuilderInfoBox.llIIIIIl[2] = 1;
        BuilderInfoBox.llIIIIIl[3] = 2;
        BuilderInfoBox.llIIIIIl[4] = 3;
        BuilderInfoBox.llIIIIIl[5] = 109 + 49 - 32 + 6 ^ 96 + 51 - 20 + 1;
        BuilderInfoBox.llIIIIIl[6] = 0xB3 ^ 0xB6;
        BuilderInfoBox.llIIIIIl[7] = 0xFFFFF17A & 0xF87;
        BuilderInfoBox.llIIIIIl[8] = 0xBD ^ 0xA7 ^ (0x9F ^ 0x91);
        BuilderInfoBox.llIIIIIl[9] = 0x16 ^ 0x63 ^ (0xC6 ^ 0xB5);
    }
}

