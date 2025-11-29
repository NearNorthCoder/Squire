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
package gg.squire.tithefarm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tithefarm.SquireTitheFarm;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.tithefarm.overlay.TithefarmManager;

public class TitheInfoBox
extends OverlayPanel {
    private final  i x;
    private final  TaskManager w;

    private final  SquireTitheFarm v;

    public long e(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (TitheInfoBox.var3(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (TitheInfoBox.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-(159 + 46 - 80 + 41 ^ 102 + 81 - 113 + 92) <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void var15() {
        var2 = new String[var1[14]];
        TitheInfoBox.var2[TitheInfoBox.var1[0]] = "Squire Tithe Farm";
        TitheInfoBox.var2[TitheInfoBox.var1[1]] = "Runtime";
        TitheInfoBox.var2[TitheInfoBox.var1[2]] = "Version";
        TitheInfoBox.var2[TitheInfoBox.var1[3]] = "0.0.1";
        TitheInfoBox.var2[TitheInfoBox.var1[4]] = "Task: ";
        TitheInfoBox.var2[TitheInfoBox.var1[5]] = "Harvested";
        TitheInfoBox.var2[TitheInfoBox.var1[6]] = "Harvested Per Hour";
        TitheInfoBox.var2[TitheInfoBox.var1[7]] = "Current patch";
        TitheInfoBox.var2[TitheInfoBox.var1[8]] = "Watering can charges";
        TitheInfoBox.var2[TitheInfoBox.var1[9]] = "Have enough water?";
        TitheInfoBox.var2[TitheInfoBox.var1[10]] = "NO (please get more water)";
        TitheInfoBox.var2[TitheInfoBox.var1[11]] = "Yes";
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    static {
        TitheInfoBox.var16();
        TitheInfoBox.var15();
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Inject
    private TitheInfoBox(SquireTitheFarm squireTitheFarm, i i2) {
        this.v = squireTitheFarm;
        this.w = squireTitheFarm.getManager();
        this.x = i2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        TitheInfoBox var24;
        if (TitheInfoBox.var23(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var25 = Duration.between(var24.v.getStarted(), Instant.now());
        var24.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[0]]).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[1]]).right(Time.format((Duration)var25)).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(var2[var1[3]]).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(var24.w.getCurrentTask()).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(String.valueOf(var24.v.a())).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.valueOf(var24.e(var24.v.a()))).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(String.valueOf(var24.x.q())).build());
        0;
        var24.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(String.valueOf(var24.x.v())).build());
        0;
        List list = var24.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var2[var1[9]]);
        if (TitheInfoBox.var13(var24.x.v(), var1[4] * var24.x.u())) {
            string = var2[var1[10]];
            0;
            if (((0xE2 ^ 0xC6) & ~(0x65 ^ 0x41)) != ((0x78 ^ 0x49) & ~(0xA1 ^ 0x90))) {
                return null;
            }
        } else {
            string = var2[var1[11]];
        }
        list.add(lineComponentBuilder.right(string).build());
        0;
        int n2 = var1[12];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[13], var1[0]));
        return super.render(graphics2D);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static void var16() {
        var1 = new int[15];
        TitheInfoBox.var1[0] = (0x62 ^ 1) & ~(0xD9 ^ 0xBA);
        TitheInfoBox.var1[1] = 1;
        TitheInfoBox.var1[2] = 2;
        TitheInfoBox.var1[3] = 3;
        TitheInfoBox.var1[4] = 0x2C ^ 0x28;
        TitheInfoBox.var1[5] = 0x1E ^ 0x7B ^ (0x2B ^ 0x4B);
        TitheInfoBox.var1[6] = 0x72 ^ 0x40 ^ (0x9F ^ 0xAB);
        TitheInfoBox.var1[7] = 0x2D ^ 0x41 ^ (0x62 ^ 9);
        TitheInfoBox.var1[8] = 0x57 ^ 0x21 ^ (0xBF ^ 0xC1);
        TitheInfoBox.var1[9] = 0xD3 ^ 0x81 ^ (0x23 ^ 0x78);
        TitheInfoBox.var1[10] = 0x2E ^ 0x24;
        TitheInfoBox.var1[11] = 0xBA ^ 0xB1;
        TitheInfoBox.var1[12] = -(0xFFFF9EED & 0x77FB) & (0xFFFF9FEA & 0x77FF);
        TitheInfoBox.var1[13] = 84 + 21 - -9 + 32 ^ 45 + 84 - 42 + 47;
        TitheInfoBox.var1[14] = 0xA9 ^ 0xA5;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }
}

