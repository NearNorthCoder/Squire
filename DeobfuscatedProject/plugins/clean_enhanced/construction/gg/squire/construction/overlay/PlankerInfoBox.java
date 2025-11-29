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
package gg.squire.construction.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.SquirePlankerPlugin;
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

public class PlankerInfoBox
extends OverlayPanel {
    private final  SquirePlankerConfig k;

    private final  TaskManager j;
    private final  SquirePlankerPlugin i;

    private static void var3() {
        var2 = new int[10];
        PlankerInfoBox.var2[0] = 0x29 ^ 0x23;
        PlankerInfoBox.var2[1] = (0x63 ^ 0x40) & ~(0x2E ^ 0xD);
        PlankerInfoBox.var2[2] = 1;
        PlankerInfoBox.var2[3] = 2;
        PlankerInfoBox.var2[4] = 3;
        PlankerInfoBox.var2[5] = 0x5B ^ 0x5F;
        PlankerInfoBox.var2[6] = -(0xFFFFFD1F & 0x1EF2) & (0xFFFF9F9B & 0x7D77);
        PlankerInfoBox.var2[7] = 0x8E ^ 0x9A;
        PlankerInfoBox.var2[8] = 0x7C ^ 0x79;
        PlankerInfoBox.var2[9] = 80 + 102 - 32 + 41 ^ 102 + 54 - 75 + 102;
    }

    private static void var4() {
        var1 = new String[var2[8]];
        PlankerInfoBox.var1[PlankerInfoBox.var2[1]] = "Squire Planker";
        PlankerInfoBox.var1[PlankerInfoBox.var2[2]] = "Version";
        PlankerInfoBox.var1[PlankerInfoBox.var2[3]] = "0.1.1";
        PlankerInfoBox.var1[PlankerInfoBox.var2[4]] = "Runtime";
        PlankerInfoBox.var1[PlankerInfoBox.var2[5]] = "Task: ";
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
        while (PlankerInfoBox.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (3 > ((0xB3 ^ 0xA0) & ~(0x35 ^ 0x26))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var20(int n, int n2) {
        return n < n2;
    }

    @Inject
    private PlankerInfoBox(SquirePlankerPlugin squirePlankerPlugin, SquirePlankerConfig squirePlankerConfig) {
        this.i = squirePlankerPlugin;
        this.j = squirePlankerPlugin.getManager();
        this.k = squirePlankerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long a(int n) {
        Duration duration = Duration.between(this.i.getStarted(), Instant.now());
        if (PlankerInfoBox.var22(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var22(int n) {
        return n == 0;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var29(int n) {
        return n != 0;
    }

    static {
        PlankerInfoBox.var3();
        PlankerInfoBox.var4();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlankerInfoBox.var29(this.i.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.i.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(var1[var2[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(this.j.getCurrentTask()).build());
        0;
        int n = var2[6];
        this.panelComponent.setPreferredSize(new Dimension(n + var2[7], var2[1]));
        return super.render(graphics2D);
    }
}

