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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.nightmare.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.nightmare.overlay.NightmareManager;

public class NightmareInfoBox
extends OverlayPanel {

    private final  SquireNightmarePlugin cw;
    private final  int cy = 403886;
    private final  TaskManager cx;

    private String o(int n2) {
        double d2 = this.n(n2);
        return NightmareInfoBox.a(d2);
    }

    private static boolean var3(int n2) {
        return n2 >= 0;
    }

    @Inject
    private NightmareInfoBox(SquireNightmarePlugin squireNightmarePlugin, j j2) {
        this.cy = var1[0];
        this.cw = squireNightmarePlugin;
        this.cx = squireNightmarePlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void var4() {
        var1 = new int[22];
        NightmareInfoBox.var1[0] = 0xFFFFAFBF & 0x679EE;
        NightmareInfoBox.var1[1] = (0xFD ^ 0xBB) & ~(0xD3 ^ 0x95);
        NightmareInfoBox.var1[2] = 1;
        NightmareInfoBox.var1[3] = 2;
        NightmareInfoBox.var1[4] = 3;
        NightmareInfoBox.var1[5] = 95 + 8 - 86 + 122 ^ 17 + 33 - -52 + 41;
        NightmareInfoBox.var1[6] = 0x52 ^ 0x58;
        NightmareInfoBox.var1[7] = 0x74 ^ 0x71;
        NightmareInfoBox.var1[8] = 12 + 1 - -92 + 48 ^ 39 + 157 - 188 + 151;
        NightmareInfoBox.var1[9] = 0x62 ^ 0x65;
        NightmareInfoBox.var1[10] = 0x2B ^ 0x23;
        NightmareInfoBox.var1[11] = 132 + 29 - 135 + 126 ^ 138 + 126 - 220 + 101;
        NightmareInfoBox.var1[12] = 0x21 ^ 0x2A;
        NightmareInfoBox.var1[13] = 3 ^ 0xF;
        NightmareInfoBox.var1[14] = 0x52 ^ 0x5F;
        NightmareInfoBox.var1[15] = 0xB3 ^ 0xBD;
        NightmareInfoBox.var1[16] = 0x90 ^ 0x9F;
        NightmareInfoBox.var1[17] = 6 ^ 0x43 ^ (0xF ^ 0x5A);
        NightmareInfoBox.var1[18] = 68 + 118 - 67 + 14 ^ 53 + 118 - 100 + 77;
        NightmareInfoBox.var1[19] = 0xFFFFA9BE & 0x5743;
        NightmareInfoBox.var1[20] = 0x58 ^ 0x4C;
        NightmareInfoBox.var1[21] = 0x2A ^ 0x38;
    }

    static {
        NightmareInfoBox.var4();
        NightmareInfoBox.var5();
    }

    public static String a(double d2) {
        double var6;
        if (NightmareInfoBox.var3(NightmareInfoBox.var7(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[var1[2]];
            objectArray[NightmareInfoBox.var1[1]] = d3;
            return String.format(var2[var1[1]], objectArray);
        }
        if (NightmareInfoBox.var3(NightmareInfoBox.var7(var6, 1000.0))) {
            double var8 = var6 / 1000.0;
            if (NightmareInfoBox.var9(NightmareInfoBox.var7(var8 % 1.0, 0.0))) {
                Object[] objectArray = new Object[var1[2]];
                objectArray[NightmareInfoBox.var1[1]] = var8;
                return String.format(var2[var1[2]], objectArray);
            }
            Object[] objectArray = new Object[var1[2]];
            objectArray[NightmareInfoBox.var1[1]] = var8;
            return String.format(var2[var1[3]], objectArray);
        }
        if (NightmareInfoBox.var9(NightmareInfoBox.var7(var6 % 1.0, 0.0))) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[NightmareInfoBox.var1[1]] = var6;
            return String.format(var2[var1[4]], objectArray);
        }
        Object[] objectArray = new Object[var1[2]];
        objectArray[NightmareInfoBox.var1[1]] = d2;
        return String.format(var2[var1[5]], objectArray);
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        NightmareInfoBox var10;
        if (NightmareInfoBox.var11(this.cw.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var12 = Duration.between(var10.cw.getStarted(), Instant.now());
        var10.panelComponent.setBorder(new Rectangle(var1[6], var1[6], var1[6], var1[6]));
        var10.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[7]]).build());
        0;
        var10.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(Time.format((Duration)var12)).build());
        0;
        var10.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(var2[var1[10]]).build());
        0;
        var10.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(var10.cx.getCurrentTask()).build());
        0;
        List list = var10.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var2[var1[6]]);
        if (NightmareInfoBox.var11(var10.cw.ae() ? 1 : 0)) {
            string = var2[var1[12]];
            0;
            if (-1 > ((0xD4 ^ 0x98 ^ (0x10 ^ 0x1C)) & (40 + 92 - -63 + 2 ^ 125 + 18 - 26 + 16 ^ -1))) {
                return null;
            }
        } else {
            string = var2[var1[13]];
        }
        list.add(lineComponentBuilder.right(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[14]]).right(String.valueOf(this.cw.af())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[15]]).right(this.o(this.cw.af())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[16]]).right(this.o(this.cw.af() * var1[0])).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[17]]).right(String.valueOf(this.cw.J())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[18]]).right(String.valueOf(this.cw.K())).build());
        0;
        int n2 = var1[19];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[20], var1[1]));
        return super.render(graphics2D);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static int var7(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    public double n(int n2) {
        Duration duration = Duration.between(this.cw.getStarted(), Instant.now());
        if (NightmareInfoBox.var9(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean var25(int n2, int n3) {
        return n2 < n3;
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var1[1];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var1[1];
        while (NightmareInfoBox.var25(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if ((140 + 154 - 216 + 78 ^ 36 + 14 - 36 + 138) > 2) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    private static void var5() {
        var2 = new String[var1[21]];
        NightmareInfoBox.var2[NightmareInfoBox.var1[1]] = "%.0fK";
        NightmareInfoBox.var2[NightmareInfoBox.var1[2]] = "%.0fK";
        NightmareInfoBox.var2[NightmareInfoBox.var1[3]] = "%.1fK";
        NightmareInfoBox.var2[NightmareInfoBox.var1[4]] = "%.0f";
        NightmareInfoBox.var2[NightmareInfoBox.var1[5]] = "%.1f";
        NightmareInfoBox.var2[NightmareInfoBox.var1[7]] = "Squire Phosani's Nightmare";
        NightmareInfoBox.var2[NightmareInfoBox.var1[8]] = "Runtime";
        NightmareInfoBox.var2[NightmareInfoBox.var1[9]] = "Version";
        NightmareInfoBox.var2[NightmareInfoBox.var1[10]] = "3.4.2";
        NightmareInfoBox.var2[NightmareInfoBox.var1[11]] = "Task: ";
        NightmareInfoBox.var2[NightmareInfoBox.var1[6]] = "Status: ";
        NightmareInfoBox.var2[NightmareInfoBox.var1[12]] = "Restocking";
        NightmareInfoBox.var2[NightmareInfoBox.var1[13]] = "Idle";
        NightmareInfoBox.var2[NightmareInfoBox.var1[14]] = "Kills";
        NightmareInfoBox.var2[NightmareInfoBox.var1[15]] = "Kills Per Hour";
        NightmareInfoBox.var2[NightmareInfoBox.var1[16]] = "Est. GP/H";
        NightmareInfoBox.var2[NightmareInfoBox.var1[17]] = "Shrooms hit";
        NightmareInfoBox.var2[NightmareInfoBox.var1[18]] = "Deaths";
    }
}

