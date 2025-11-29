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
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.barrows.overlay;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.barrows.overlay.BarrowsManager;

public class BarrowsInfoBox
extends OverlayPanel {
    private final  int B = 77566;
    private final  SquireBarrows y;
    private final  TaskManager z;
    private final  c A;

    private static int var3(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    static {
        BarrowsInfoBox.var4();
        BarrowsInfoBox.var5();
    }

    private static void var5() {
        var2 = new String[var1[22]];
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[1]] = "%.0fK";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[2]] = "%.0fK";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[3]] = "%.1fK";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[4]] = "%.0f";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[5]] = "%.1f";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[7]] = "Squire Barrows";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[8]] = "Runtime";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[9]] = "Version";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[10]] = "1.3.1";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[11]] = "Task: ";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[6]] = "Missing Potential:";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[12]] = "Chests:";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[13]] = "%d (%d/h)";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[14]] = "Est. GP/H:";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[15]] = "Uniques:";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[16]] = "%d (%d/h)";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[17]] = "Claimed chest:";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[18]] = "Should bank:";
        BarrowsInfoBox.var2[BarrowsInfoBox.var1[19]] = "Should claim chest:";
    }

    @Inject
    private BarrowsInfoBox(SquireBarrows squireBarrows, c c2) {
        this.B = var1[0];
        this.y = squireBarrows;
        this.z = squireBarrows.getManager();
        this.A = c2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var6(int n2) {
        return n2 >= 0;
    }

    private String f(int n2) {
        double d2 = this.e(n2);
        return BarrowsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double var7;
        if (BarrowsInfoBox.var6(BarrowsInfoBox.var3(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[var1[2]];
            objectArray[BarrowsInfoBox.var1[1]] = d3;
            return String.format(var2[var1[1]], objectArray);
        }
        if (BarrowsInfoBox.var6(BarrowsInfoBox.var3(var7, 1000.0))) {
            double var8 = var7 / 1000.0;
            if (BarrowsInfoBox.var9(BarrowsInfoBox.var3(var8 % 1.0, 0.0))) {
                Object[] objectArray = new Object[var1[2]];
                objectArray[BarrowsInfoBox.var1[1]] = var8;
                return String.format(var2[var1[2]], objectArray);
            }
            Object[] objectArray = new Object[var1[2]];
            objectArray[BarrowsInfoBox.var1[1]] = var8;
            return String.format(var2[var1[3]], objectArray);
        }
        if (BarrowsInfoBox.var9(BarrowsInfoBox.var3(var7 % 1.0, 0.0))) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[BarrowsInfoBox.var1[1]] = var7;
            return String.format(var2[var1[4]], objectArray);
        }
        Object[] objectArray = new Object[var1[2]];
        objectArray[BarrowsInfoBox.var1[1]] = d2;
        return String.format(var2[var1[5]], objectArray);
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new int[23];
        BarrowsInfoBox.var1[0] = 0xFFFFBFFE & 0x16EFF;
        BarrowsInfoBox.var1[1] = (0x6C ^ 0x34) & ~(0 ^ 0x58);
        BarrowsInfoBox.var1[2] = 1;
        BarrowsInfoBox.var1[3] = 2;
        BarrowsInfoBox.var1[4] = 3;
        BarrowsInfoBox.var1[5] = 0x65 ^ 0x6A ^ (0x40 ^ 0x4B);
        BarrowsInfoBox.var1[6] = 0x6E ^ 0x64;
        BarrowsInfoBox.var1[7] = 0x60 ^ 0x65;
        BarrowsInfoBox.var1[8] = 0x1A ^ 0x37 ^ (0xA5 ^ 0x8E);
        BarrowsInfoBox.var1[9] = 0x2C ^ 6 ^ (0x3F ^ 0x12);
        BarrowsInfoBox.var1[10] = 0x75 ^ 0x7D;
        BarrowsInfoBox.var1[11] = 70 + 153 - 105 + 52 ^ 51 + 35 - 83 + 160;
        BarrowsInfoBox.var1[12] = 0x1E ^ 0x3F ^ (0xEB ^ 0xC1);
        BarrowsInfoBox.var1[13] = 0x3E ^ 0x32;
        BarrowsInfoBox.var1[14] = 0x27 ^ 0x2A;
        BarrowsInfoBox.var1[15] = 0x32 ^ 0x3C;
        BarrowsInfoBox.var1[16] = 81 + 29 - -33 + 36 ^ 127 + 27 - 144 + 178;
        BarrowsInfoBox.var1[17] = 0x2D ^ 0x5F ^ (0x21 ^ 0x43);
        BarrowsInfoBox.var1[18] = 122 + 66 - 39 + 28 ^ 71 + 16 - -46 + 27;
        BarrowsInfoBox.var1[19] = 2 + 63 - 64 + 142 ^ 50 + 56 - 64 + 115;
        BarrowsInfoBox.var1[20] = 0xFFFFABB3 & 0x554E;
        BarrowsInfoBox.var1[21] = 0xA6 ^ 0xB2;
        BarrowsInfoBox.var1[22] = 0x45 ^ 0x56;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.var9(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public double e(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.var9(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var1[1];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var1[1];
        while (BarrowsInfoBox.var10(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (((92 + 76 - 14 + 16 ^ 35 + 95 - 12 + 59) & (0x74 ^ 7 ^ (0xF ^ 0x67) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static boolean var33(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BarrowsInfoBox.var33(this.y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var1[6], var1[6], var1[6], var1[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[7]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(var2[var1[10]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(this.z.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.valueOf(this.A.d())).build());
        0;
        Object[] objectArray = new Object[var1[3]];
        objectArray[BarrowsInfoBox.var1[1]] = this.y.w();
        objectArray[BarrowsInfoBox.var1[2]] = this.d(this.y.w());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(String.format(var2[var1[13]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[14]]).right(this.f(this.y.w() * var1[0])).build());
        0;
        Object[] objectArray2 = new Object[var1[3]];
        objectArray2[BarrowsInfoBox.var1[1]] = this.y.x();
        objectArray2[BarrowsInfoBox.var1[2]] = this.d(this.y.x());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[15]]).right(String.format(var2[var1[16]], objectArray2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[17]]).right(String.valueOf(this.y.v())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[18]]).right(String.valueOf(this.y.u())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[19]]).right(String.valueOf(this.y.g())).build());
        0;
        int n2 = var1[20];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[21], var1[1]));
        return super.render(graphics2D);
    }
}

