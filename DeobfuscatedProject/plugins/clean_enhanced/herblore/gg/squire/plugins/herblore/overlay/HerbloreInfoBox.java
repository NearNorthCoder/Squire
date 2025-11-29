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
package gg.squire.plugins.herblore.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
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

public class HerbloreInfoBox
extends OverlayPanel {
    private final  HerbloreConfig m;

    private final  TaskManager l;
    private final  SquireHerblore k;

    private static boolean var3(int n) {
        return n == 0;
    }

    private static boolean var4(int n) {
        return n != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HerbloreInfoBox.var4(this.k.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[1]]).build());
        0;
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(this.l.getCurrentTask()).build());
        0;
        int n = var2[4];
        this.panelComponent.setPreferredSize(new Dimension(n + var2[5], var2[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HerbloreInfoBox(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        this.k = squireHerblore;
        this.l = squireHerblore.getManager();
        this.m = herbloreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void var5() {
        var2 = new int[7];
        HerbloreInfoBox.var2[0] = 0xDA ^ 0x85 ^ (0x23 ^ 0x76);
        HerbloreInfoBox.var2[1] = (89 + 71 - 71 + 58 ^ 97 + 77 - 149 + 113) & (127 + 154 - 270 + 150 ^ 64 + 145 - 138 + 113 ^ -1);
        HerbloreInfoBox.var2[2] = 1;
        HerbloreInfoBox.var2[3] = 2;
        HerbloreInfoBox.var2[4] = 176 + 140 - 137 + 14;
        HerbloreInfoBox.var2[5] = 0xAC ^ 0xB8;
        HerbloreInfoBox.var2[6] = 3;
    }

    public long c(int n) {
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        if (HerbloreInfoBox.var3(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var6(int n, int n2) {
        return n < n2;
    }

    private static void var7() {
        var1 = new String[var2[6]];
        HerbloreInfoBox.var1[HerbloreInfoBox.var2[1]] = "Squire Herblore";
        HerbloreInfoBox.var1[HerbloreInfoBox.var2[2]] = "Runtime: ";
        HerbloreInfoBox.var1[HerbloreInfoBox.var2[3]] = "Task: ";
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var2[1];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var2[1];
        while (HerbloreInfoBox.var6(var16, var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    static {
        HerbloreInfoBox.var5();
        HerbloreInfoBox.var7();
    }
}

