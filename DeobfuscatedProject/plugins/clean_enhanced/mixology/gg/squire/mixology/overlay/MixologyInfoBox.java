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
 *  net.unethicalite.client.Static
 */
package gg.squire.mixology.overlay;

import com.google.inject.Inject;
import gg.squire.mixology.SquireMixology;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Locale;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class MixologyInfoBox
extends OverlayPanel {
    private final  SquireMixology B;
    private final  int C = 403886;
    public static  int D;
    public static  int E;

    public static  int F;

    private static boolean var3(int n2) {
        return n2 >= 0;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[1];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[1];
        while (MixologyInfoBox.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    public double b(int n2) {
        Duration duration = Duration.between(this.B.getStarted(), Instant.now());
        if (MixologyInfoBox.var15(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static void var16() {
        var2 = new String[var1[18]];
        MixologyInfoBox.var2[MixologyInfoBox.var1[1]] = "%.0fK";
        MixologyInfoBox.var2[MixologyInfoBox.var1[2]] = "%.0fK";
        MixologyInfoBox.var2[MixologyInfoBox.var1[3]] = "%.1fK";
        MixologyInfoBox.var2[MixologyInfoBox.var1[4]] = "%.0f";
        MixologyInfoBox.var2[MixologyInfoBox.var1[5]] = "%.1f";
        MixologyInfoBox.var2[MixologyInfoBox.var1[7]] = "[B]uire Mixology";
        MixologyInfoBox.var2[MixologyInfoBox.var1[8]] = "Runtime";
        MixologyInfoBox.var2[MixologyInfoBox.var1[9]] = "Version";
        MixologyInfoBox.var2[MixologyInfoBox.var1[10]] = "Task: ";
        MixologyInfoBox.var2[MixologyInfoBox.var1[11]] = "Current potion: ";
        MixologyInfoBox.var2[MixologyInfoBox.var1[6]] = "Gained mox/aga/lye: ";
        MixologyInfoBox.var2[MixologyInfoBox.var1[17]] = "#.0";
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static double b(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(var2[var1[17]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    private static int var18(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static void var19() {
        var1 = new int[19];
        MixologyInfoBox.var1[0] = -(0xFFFFD357 & 0x7EB9) & (0xFFFFFBFE & 0x67FBF);
        MixologyInfoBox.var1[1] = (0x37 ^ 0x1B) & ~(0x9F ^ 0xB3);
        MixologyInfoBox.var1[2] = 1;
        MixologyInfoBox.var1[3] = 2;
        MixologyInfoBox.var1[4] = 3;
        MixologyInfoBox.var1[5] = 92 + 68 - 56 + 49 ^ 123 + 39 - 57 + 52;
        MixologyInfoBox.var1[6] = 0x72 ^ 0x78;
        MixologyInfoBox.var1[7] = 0xF4 ^ 0xB3 ^ (1 ^ 0x43);
        MixologyInfoBox.var1[8] = 93 + 123 - 213 + 167 ^ 148 + 136 - 230 + 118;
        MixologyInfoBox.var1[9] = 0x24 ^ 0x23;
        MixologyInfoBox.var1[10] = 0xCF ^ 0xC7;
        MixologyInfoBox.var1[11] = 0xBA ^ 0x82 ^ (0x6A ^ 0x5B);
        MixologyInfoBox.var1[12] = 0xFFFFD3CE & 0x3D71;
        MixologyInfoBox.var1[13] = 0xFFFFB57F & 0x5BBF;
        MixologyInfoBox.var1[14] = -(0xFFFFFDA6 & 0x665B) & (0xFFFFFFBF & 0x757F);
        MixologyInfoBox.var1[15] = 0xFFFFB596 & 0x4B6B;
        MixologyInfoBox.var1[16] = 10 + 43 - 4 + 106 ^ 59 + 79 - 91 + 96;
        MixologyInfoBox.var1[17] = 50 + 38 - 25 + 113 ^ 121 + 152 - 198 + 112;
        MixologyInfoBox.var1[18] = 0x87 ^ 0xB6 ^ (0x23 ^ 0x1E);
    }

    private String c(int n2) {
        double d2 = this.b(n2);
        return MixologyInfoBox.a(d2);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return MixologyInfoBox.b(d3);
    }

    public static String a(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    static {
        MixologyInfoBox.var19();
        MixologyInfoBox.var16();
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (MixologyInfoBox.var17(this.B.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long l2 = System.currentTimeMillis() - SquireMixology.l;
        Duration duration = Duration.between(this.B.getStarted(), Instant.now());
        int n2 = (int)((double)SquireMixology.i * 3600000.0 / (double)l2);
        this.panelComponent.setBorder(new Rectangle(var1[6], var1[6], var1[6], var1[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[7]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(SquireMixology.f).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(SquireMixology.g).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(SquireMixology.p).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(Static.getClient().getVarpValue(var1[12]) - F + "/" + (Static.getClient().getVarpValue(var1[13]) - E) + "/" + (Static.getClient().getVarpValue(var1[14]) - D)).build());
        0;
        int n3 = var1[15];
        this.panelComponent.setPreferredSize(new Dimension(n3 + var1[16], var1[1]));
        return super.render(graphics2D);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public static String a(double d2) {
        double var32;
        if (MixologyInfoBox.var3(MixologyInfoBox.var18(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[var1[2]];
            objectArray[MixologyInfoBox.var1[1]] = d3;
            return String.format(var2[var1[1]], objectArray);
        }
        if (MixologyInfoBox.var3(MixologyInfoBox.var18(var32, 1000.0))) {
            double var33 = var32 / 1000.0;
            if (MixologyInfoBox.var15(MixologyInfoBox.var18(var33 % 1.0, 0.0))) {
                Object[] objectArray = new Object[var1[2]];
                objectArray[MixologyInfoBox.var1[1]] = var33;
                return String.format(var2[var1[2]], objectArray);
            }
            Object[] objectArray = new Object[var1[2]];
            objectArray[MixologyInfoBox.var1[1]] = var33;
            return String.format(var2[var1[3]], objectArray);
        }
        if (MixologyInfoBox.var15(MixologyInfoBox.var18(var32 % 1.0, 0.0))) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[MixologyInfoBox.var1[1]] = var32;
            return String.format(var2[var1[4]], objectArray);
        }
        Object[] objectArray = new Object[var1[2]];
        objectArray[MixologyInfoBox.var1[1]] = d2;
        return String.format(var2[var1[5]], objectArray);
    }

    @Inject
    private MixologyInfoBox(SquireMixology squireMixology) {
        this.C = var1[0];
        this.B = squireMixology;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

