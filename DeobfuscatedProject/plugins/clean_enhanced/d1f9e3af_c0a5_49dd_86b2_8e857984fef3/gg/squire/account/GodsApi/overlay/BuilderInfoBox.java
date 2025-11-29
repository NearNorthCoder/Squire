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
import gg.squire.account.AccBuilderEasyClues;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import gg.squire.account.GodsApi.overlay.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {
    private final  AccBuilderEasyClues bo;
    private final  BuilderConfig bp;
    private static  int[] lIlIlIIlI;
    private static  String[] lIlIlIIIl;

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderEasyClues.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlIIIl[lIlIlIIlI[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[4]]).right(AccBuilderEasyClues.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[5]]).right(String.valueOf(AccBuilderEasyClues.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[6]]).right(String.valueOf(AccBuilderEasyClues.f)).build());
        0;
        int n2 = lIlIlIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlIIlI[8], lIlIlIIlI[1]));
        return super.render(graphics2D);
    }

    private static void var1() {
        lIlIlIIIl = new String[lIlIlIIlI[9]];
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[1]] = "Squire Easy Clue Builder";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[2]] = "Version";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[3]] = "Runtime";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[4]] = "Status:";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[5]] = "Current Quest:";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[6]] = "Tasks Completed:";
    }

    private static String var2(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var4.toCharArray();
        int var7 = lIlIlIIlI[1];
        char[] var8 = var3.toCharArray();
        int var9 = var8.length;
        int var10 = lIlIlIIlI[1];
        while (BuilderInfoBox.var11(var10, var9)) {
            char var12 = var8[var10];
            var5.append((char)(var12 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var10;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderEasyClues accBuilderEasyClues, BuilderConfig builderConfig) {
        this.bo = accBuilderEasyClues;
        this.bp = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.var19();
        BuilderInfoBox.var1();
    }

    private static void var19() {
        lIlIlIIlI = new int[11];
        BuilderInfoBox.lIlIlIIlI[0] = 0x55 ^ 0x5F;
        BuilderInfoBox.lIlIlIIlI[1] = (0x42 ^ 0x73 ^ (0x14 ^ 0x12)) & (174 + 104 - 140 + 38 ^ 42 + 97 - 97 + 93 ^ -1);
        BuilderInfoBox.lIlIlIIlI[2] = 1;
        BuilderInfoBox.lIlIlIIlI[3] = 2;
        BuilderInfoBox.lIlIlIIlI[4] = 3;
        BuilderInfoBox.lIlIlIIlI[5] = 69 + 37 - -59 + 5 ^ 5 + 55 - -79 + 35;
        BuilderInfoBox.lIlIlIIlI[6] = 0xAB ^ 0xAE;
        BuilderInfoBox.lIlIlIIlI[7] = 0xFFFFFD0E & 0x3F3;
        BuilderInfoBox.lIlIlIIlI[8] = 0x3F ^ 0x59 ^ (0x53 ^ 0x21);
        BuilderInfoBox.lIlIlIIlI[9] = 0xC0 ^ 0xAA ^ (0xCB ^ 0xA7);
        BuilderInfoBox.lIlIlIIlI[10] = 8 + 123 - 42 + 79 ^ 128 + 142 - 199 + 89;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }
}

