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
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.moons.overlay;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class MoonsInfoBox
extends OverlayPanel {
    private final  SquireMoonsOfPeril k;

    private final  int l = 403886;

    private static boolean var3(int n) {
        return n != 0;
    }

    public double a(int n) {
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        if (MoonsInfoBox.var4(duration.isZero() ? 1 : 0)) {
            return (double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static double b(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(var2[var1[6]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    public Dimension render(Graphics2D graphics2D) {
        if (MoonsInfoBox.var3(this.k.isPaintDisabled() ? 1 : 0)) {
            // empty if block
        }
        long l2 = System.currentTimeMillis() - SquireMoonsOfPeril.i;
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var1[6], var1[6], var1[6], var1[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[7]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(SquireMoonsOfPeril.f).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(SquireMoonsOfPeril.g).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(SquireMoonsOfPeril.h + " (" + MoonsInfoBox.a(SquireMoonsOfPeril.h, l2) + "/hr)").build());
        0;
        int n = var1[12];
        this.panelComponent.setPreferredSize(new Dimension(n + var1[13], var1[1]));
        return super.render(graphics2D);
    }

    private static void var5() {
        var1 = new int[15];
        MoonsInfoBox.var1[0] = 0xFFFFEBFF & 0x63DAE;
        MoonsInfoBox.var1[1] = (0xD1 ^ 0x84 ^ (0x34 ^ 0x21)) & (0x2A ^ 0x31 ^ (0x20 ^ 0x7B) ^ -1);
        MoonsInfoBox.var1[2] = 1;
        MoonsInfoBox.var1[3] = 2;
        MoonsInfoBox.var1[4] = 3;
        MoonsInfoBox.var1[5] = 120 + 23 - 0 + 43 ^ 97 + 120 - 162 + 135;
        MoonsInfoBox.var1[6] = 3 ^ 9;
        MoonsInfoBox.var1[7] = 31 + 169 - 128 + 98 ^ 106 + 67 - 51 + 53;
        MoonsInfoBox.var1[8] = 0xC5 ^ 0xC3;
        MoonsInfoBox.var1[9] = 0x95 ^ 0x92;
        MoonsInfoBox.var1[10] = 0xCA ^ 0xA3 ^ (0x76 ^ 0x17);
        MoonsInfoBox.var1[11] = 70 + 89 - 56 + 44 ^ 56 + 78 - 32 + 52;
        MoonsInfoBox.var1[12] = -(0xFFFFFAEE & 0x2773) & (0xFFFFBB63 & 0x67FF);
        MoonsInfoBox.var1[13] = 0xD5 ^ 0xC1;
        MoonsInfoBox.var1[14] = 25 + 120 - 134 + 156 ^ 155 + 140 - 245 + 122;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[1];
        while (MoonsInfoBox.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return MoonsInfoBox.b(d3);
    }

    static {
        MoonsInfoBox.var5();
        MoonsInfoBox.var17();
    }

    private static int var18(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean var15(int n, int n2) {
        return n < n2;
    }

    private String b(int n) {
        double d2 = this.a(n);
        return MoonsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double var19;
        if (MoonsInfoBox.var20(MoonsInfoBox.var18(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[var1[2]];
            objectArray[MoonsInfoBox.var1[1]] = d3;
            return String.format(var2[var1[1]], objectArray);
        }
        if (MoonsInfoBox.var20(MoonsInfoBox.var18(var19, 1000.0))) {
            double var21 = var19 / 1000.0;
            if (MoonsInfoBox.var4(MoonsInfoBox.var18(var21 % 1.0, 0.0))) {
                Object[] objectArray = new Object[var1[2]];
                objectArray[MoonsInfoBox.var1[1]] = var21;
                return String.format(var2[var1[2]], objectArray);
            }
            Object[] objectArray = new Object[var1[2]];
            objectArray[MoonsInfoBox.var1[1]] = var21;
            return String.format(var2[var1[3]], objectArray);
        }
        if (MoonsInfoBox.var4(MoonsInfoBox.var18(var19 % 1.0, 0.0))) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[MoonsInfoBox.var1[1]] = var19;
            return String.format(var2[var1[4]], objectArray);
        }
        Object[] objectArray = new Object[var1[2]];
        objectArray[MoonsInfoBox.var1[1]] = d2;
        return String.format(var2[var1[5]], objectArray);
    }

    private static boolean var4(int n) {
        return n == 0;
    }

    private static void var17() {
        var2 = new String[var1[14]];
        MoonsInfoBox.var2[MoonsInfoBox.var1[1]] = "%.0fK";
        MoonsInfoBox.var2[MoonsInfoBox.var1[2]] = "%.0fK";
        MoonsInfoBox.var2[MoonsInfoBox.var1[3]] = "%.1fK";
        MoonsInfoBox.var2[MoonsInfoBox.var1[4]] = "%.0f";
        MoonsInfoBox.var2[MoonsInfoBox.var1[5]] = "%.1f";
        MoonsInfoBox.var2[MoonsInfoBox.var1[7]] = "Squire Moons of Peril";
        MoonsInfoBox.var2[MoonsInfoBox.var1[8]] = "Runtime";
        MoonsInfoBox.var2[MoonsInfoBox.var1[9]] = "Version";
        MoonsInfoBox.var2[MoonsInfoBox.var1[10]] = "Task: ";
        MoonsInfoBox.var2[MoonsInfoBox.var1[11]] = "Chests: ";
        MoonsInfoBox.var2[MoonsInfoBox.var1[6]] = "#.0";
    }

    @Inject
    private MoonsInfoBox(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.l = var1[0];
        this.k = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n) {
        return n >= 0;
    }
}

