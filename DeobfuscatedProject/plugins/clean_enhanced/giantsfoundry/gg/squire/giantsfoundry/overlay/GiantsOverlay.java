/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Point
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.giantsfoundry.overlay;

import gg.squire.giantsfoundry.overlay.GiantsfoundryManager;
import gg.squire.giantsfoundry.overlay.GameEnum6;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Point;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class GiantsOverlay
extends OverlayPanel {
    private final  a Z;
    private final  SquireGiantsFoundry Y;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        GiantsOverlay var11;
        if (GiantsOverlay.var3(this.Y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var11.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[0]]).build());
        0;
        Duration var12 = Duration.between(var11.Y.getStarted(), Instant.now());
        var11.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[1]]).right(Time.format((Duration)var12)).build());
        0;
        List list = var11.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var1[var2[2]]);
        if (GiantsOverlay.var4((Object)var11.Z.k())) {
            object = var1[var2[3]];
            0;
            if (((0xD2 ^ 0x9B) & ~(0x52 ^ 0x1B)) > (0x91 ^ 0x95)) {
                return null;
            }
        } else {
            object = var11.Z.k();
        }
        list.add(lineComponentBuilder.right(String.valueOf(object)).build());
        0;
        var11.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(String.valueOf(var11.Y.getManager().getCurrentTask())).build());
        0;
        if (GiantsOverlay.var13(var11.Z.l(), var2[5])) {
            String string;
            var11.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(var11.Z.l())).build());
            0;
            List list2 = var11.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(var1[var2[7]]);
            if (GiantsOverlay.var3(var11.Z.n() ? 1 : 0)) {
                string = var1[var2[8]];
                0;
                if (-2 >= 0) {
                    return null;
                }
            } else {
                string = var1[var2[9]];
            }
            list2.add(lineComponentBuilder2.right(string).build());
            0;
            var11.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[10]]).right(String.valueOf(var11.Z.m())).build());
            0;
            Map<h, Point> var14 = var11.Z.o();
            h[] var15 = h.values();
            int var16 = var15.length;
            int var17 = var2[0];
            while (GiantsOverlay.var18(var17, var16)) {
                h var19 = var15[var17];
                Object[] objectArray = new Object[var2[1]];
                objectArray[GiantsOverlay.var2[0]] = var19;
                Object[] objectArray2 = new Object[var2[2]];
                objectArray2[GiantsOverlay.var2[0]] = var14.get((Object)var19).getX();
                objectArray2[GiantsOverlay.var2[1]] = var14.get((Object)var19).getY();
                var11.panelComponent.getChildren().add(LineComponent.builder().left(String.format(var1[var2[11]], objectArray)).right(String.format(var1[var2[12]], objectArray2)).build());
                0;
                ++var17;
                0;
                if null == null continue;
                return null;
            }
        }
        int n2 = var2[13];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[14], var2[0]));
        return super.render(graphics2D);
    }

    private static void var20() {
        var1 = new String[var2[15]];
        GiantsOverlay.var1[GiantsOverlay.var2[0]] = "Squire Giants Foundry";
        GiantsOverlay.var1[GiantsOverlay.var2[1]] = "Runtime";
        GiantsOverlay.var1[GiantsOverlay.var2[2]] = "Current Sword Task";
        GiantsOverlay.var1[GiantsOverlay.var2[3]] = "None";
        GiantsOverlay.var1[GiantsOverlay.var2[4]] = "Current Actual Task";
        GiantsOverlay.var1[GiantsOverlay.var2[6]] = "Current Temperature";
        GiantsOverlay.var1[GiantsOverlay.var2[7]] = "Is Temperature Correct";
        GiantsOverlay.var1[GiantsOverlay.var2[8]] = "Yes";
        GiantsOverlay.var1[GiantsOverlay.var2[9]] = "No";
        GiantsOverlay.var1[GiantsOverlay.var2[10]] = "Optimal Temperature";
        GiantsOverlay.var1[GiantsOverlay.var2[11]] = "%s zone:";
        GiantsOverlay.var1[GiantsOverlay.var2[12]] = "%d - %d";
    }

    @Inject
    public GiantsOverlay(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.Y = squireGiantsFoundry;
        this.Z = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[0];
        while (GiantsOverlay.var18(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if ((177 + 157 - 224 + 72 ^ 131 + 157 - 189 + 79) > 2) continue;
            return null;
        }
        return String.valueOf(var24);
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    static {
        GiantsOverlay.var37();
        GiantsOverlay.var20();
    }

    private static boolean var13(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static void var37() {
        var2 = new int[16];
        GiantsOverlay.var2[0] = (0x7C ^ 0x4C) & ~(0x4B ^ 0x7B);
        GiantsOverlay.var2[1] = 1;
        GiantsOverlay.var2[2] = 2;
        GiantsOverlay.var2[3] = 3;
        GiantsOverlay.var2[4] = 61 + 64 - -2 + 1 ^ 56 + 95 - 61 + 42;
        GiantsOverlay.var2[5] = -1;
        GiantsOverlay.var2[6] = 0x3A ^ 0x3D ^ 2;
        GiantsOverlay.var2[7] = 0x19 ^ 0x1F;
        GiantsOverlay.var2[8] = 0x7D ^ 0x7A;
        GiantsOverlay.var2[9] = 0x17 ^ 0x6D ^ (0xF8 ^ 0x8A);
        GiantsOverlay.var2[10] = 0xB9 ^ 0xB0;
        GiantsOverlay.var2[11] = 0x99 ^ 0x93;
        GiantsOverlay.var2[12] = 0x2C ^ 0x27;
        GiantsOverlay.var2[13] = -(0xFFFFCDB7 & 0x7EFD) & (0xFFFFDDB7 & 0x6FFE);
        GiantsOverlay.var2[14] = 28 + 68 - 60 + 122 ^ 109 + 61 - 89 + 57;
        GiantsOverlay.var2[15] = 0xBD ^ 0xB1;
    }
}

