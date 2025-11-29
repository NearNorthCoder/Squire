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
package gg.squire.slayer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.slayer.SquireSkipperPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class SkipperOverlay
extends OverlayPanel {
    
    private final  SquireSkipperPlugin p;
    private final  TaskManager q;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (SkipperOverlay.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((1 ^ (0x32 ^ 0x37)) != 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    static {
        SkipperOverlay.var14();
        SkipperOverlay.var15();
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var28(int n2) {
        return n2 == 0;
    }

    private static boolean var29(int n2) {
        return n2 != 0;
    }

    @Inject
    private SkipperOverlay(SquireSkipperPlugin squireSkipperPlugin) {
        this.p = squireSkipperPlugin;
        this.q = squireSkipperPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void var15() {
        var1 = new String[var2[12]];
        SkipperOverlay.var1[SkipperOverlay.var2[0]] = "Squire Task Skipper";
        SkipperOverlay.var1[SkipperOverlay.var2[1]] = "Runtime";
        SkipperOverlay.var1[SkipperOverlay.var2[2]] = "Version";
        SkipperOverlay.var1[SkipperOverlay.var2[3]] = "2.1.0";
        SkipperOverlay.var1[SkipperOverlay.var2[4]] = "Task: ";
        SkipperOverlay.var1[SkipperOverlay.var2[5]] = "Slayer Task: ";
        SkipperOverlay.var1[SkipperOverlay.var2[6]] = "Need supplies: ";
        SkipperOverlay.var1[SkipperOverlay.var2[7]] = "Task Completed: ";
        SkipperOverlay.var1[SkipperOverlay.var2[8]] = "Task Completed Per Hour: ";
        SkipperOverlay.var1[SkipperOverlay.var2[9]] = "Current Streak: ";
    }

    public long f(int n2) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (SkipperOverlay.var28(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        SkipperOverlay var30;
        if (SkipperOverlay.var29(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var31 = Duration.between(var30.p.getStarted(), Instant.now());
        var30.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[0]]).build());
        0;
        var30.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[1]]).right(Time.format((Duration)var31)).build());
        0;
        var30.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(var1[var2[3]]).build());
        0;
        var30.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(var30.q.getCurrentTask()).build());
        0;
        if (SkipperOverlay.var32((Object)var30.p.b())) {
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(var30.p.b().toString()).build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(var30.p.h())).build());
            0;
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(String.valueOf(this.p.f())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(String.valueOf(this.f(this.p.f()))).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[9]]).right(String.valueOf(this.p.g())).build());
        0;
        int n2 = var2[10];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[11], var2[0]));
        return super.render(graphics2D);
    }

    private static boolean var32(Object object) {
        return object != null;
    }

    private static void var14() {
        var2 = new int[13];
        SkipperOverlay.var2[0] = (2 ^ 0x42) & ~(0xCD ^ 0x8D);
        SkipperOverlay.var2[1] = 1;
        SkipperOverlay.var2[2] = 2;
        SkipperOverlay.var2[3] = 3;
        SkipperOverlay.var2[4] = 0x40 ^ 0x44;
        SkipperOverlay.var2[5] = 0xD5 ^ 0xA5 ^ (0xB6 ^ 0xC3);
        SkipperOverlay.var2[6] = 113 + 96 - 125 + 59 ^ 11 + 9 - -90 + 27;
        SkipperOverlay.var2[7] = 0x52 ^ 0x55;
        SkipperOverlay.var2[8] = 0xEF ^ 0xAA ^ (0xC5 ^ 0x88);
        SkipperOverlay.var2[9] = 0x1D ^ 0x5A ^ (0x24 ^ 0x6A);
        SkipperOverlay.var2[10] = 0xFFFFD1EE & 0x2F13;
        SkipperOverlay.var2[11] = 0x57 ^ 0x43;
        SkipperOverlay.var2[12] = 0xE7 ^ 0x92 ^ 72 + 29 - 50 + 76;
    }
}

