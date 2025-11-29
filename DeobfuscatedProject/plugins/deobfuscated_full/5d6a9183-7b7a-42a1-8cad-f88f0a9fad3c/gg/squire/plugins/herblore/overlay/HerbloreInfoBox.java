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
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class HerbloreInfoBox
extends OverlayPanel {
    private final /* synthetic */ HerbloreConfig m;
    private static /* synthetic */ String[] lllIlIIIlIll;
    private static /* synthetic */ int[] lllIlIIIllII;
    private final /* synthetic */ TaskManager l;
    private final /* synthetic */ SquireHerblore k;

    private static boolean lIIIlIlllIlIlII(int n) {
        return n == 0;
    }

    private static boolean lIIIlIlllIlIIll(int n) {
        return n != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HerbloreInfoBox.lIIIlIlllIlIIll(this.k.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIlIIIllII[0], lllIlIIIllII[0], lllIlIIIllII[0], lllIlIIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIIIlIll[lllIlIIIllII[1]]).build());
        0;
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIIIlIll[lllIlIIIllII[2]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIIIlIll[lllIlIIIllII[3]]).right(this.l.getCurrentTask()).build());
        0;
        int n = lllIlIIIllII[4];
        this.panelComponent.setPreferredSize(new Dimension(n + lllIlIIIllII[5], lllIlIIIllII[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HerbloreInfoBox(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        this.k = squireHerblore;
        this.l = squireHerblore.getManager();
        this.m = herbloreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIIlIlllIlIIlI() {
        lllIlIIIllII = new int[7];
        HerbloreInfoBox.lllIlIIIllII[0] = 0xDA ^ 0x85 ^ (0x23 ^ 0x76);
        HerbloreInfoBox.lllIlIIIllII[1] = (89 + 71 - 71 + 58 ^ 97 + 77 - 149 + 113) & (127 + 154 - 270 + 150 ^ 64 + 145 - 138 + 113 ^ -1);
        HerbloreInfoBox.lllIlIIIllII[2] = 1;
        HerbloreInfoBox.lllIlIIIllII[3] = 2;
        HerbloreInfoBox.lllIlIIIllII[4] = 176 + 140 - 137 + 14;
        HerbloreInfoBox.lllIlIIIllII[5] = 0xAC ^ 0xB8;
        HerbloreInfoBox.lllIlIIIllII[6] = 3;
    }

    public long c(int n) {
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        if (HerbloreInfoBox.lIIIlIlllIlIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlllIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static void lIIIlIlllIlIIIl() {
        lllIlIIIlIll = new String[lllIlIIIllII[6]];
        HerbloreInfoBox.lllIlIIIlIll[HerbloreInfoBox.lllIlIIIllII[1]] = HerbloreInfoBox."Squire Herblore";
        HerbloreInfoBox.lllIlIIIlIll[HerbloreInfoBox.lllIlIIIllII[2]] = HerbloreInfoBox."Runtime: ";
        HerbloreInfoBox.lllIlIIIlIll[HerbloreInfoBox.lllIlIIIllII[3]] = HerbloreInfoBox."Task: ";
    }

    private static String lIIIlIlllIlIIII(String var1, String var3) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = lllIlIIIllII[1];
        char[] var8 = var1.toCharArray();
        int var2 = var8.length;
        int var9 = lllIlIIIllII[1];
        while (HerbloreInfoBox.lIIIlIlllIlIlIl(var9, var2)) {
            char var4 = var8[var9];
            var7.append((char)(var4 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        HerbloreInfoBox.lIIIlIlllIlIIlI();
        HerbloreInfoBox.lIIIlIlllIlIIIl();
    }
}

