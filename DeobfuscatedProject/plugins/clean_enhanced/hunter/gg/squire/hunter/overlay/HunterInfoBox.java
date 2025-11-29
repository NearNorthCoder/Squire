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
package gg.squire.hunter.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.hunter.SquireHunter;
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

public class HunterInfoBox
extends OverlayPanel {
    private final  TaskManager t;

    private final  SquireHunter s;

    public long c(int n2) {
        Duration duration = Duration.between(this.s.getStarted(), Instant.now());
        if (HunterInfoBox.var3(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var1 = new String[var2[9]];
        HunterInfoBox.var1[HunterInfoBox.var2[1]] = "Squire Hunter";
        HunterInfoBox.var1[HunterInfoBox.var2[2]] = "Version";
        HunterInfoBox.var1[HunterInfoBox.var2[3]] = "1.4.2";
        HunterInfoBox.var1[HunterInfoBox.var2[4]] = "Runtime";
        HunterInfoBox.var1[HunterInfoBox.var2[5]] = "Task: ";
        HunterInfoBox.var1[HunterInfoBox.var2[6]] = "Caught: ";
    }

    static {
        HunterInfoBox.var6();
        HunterInfoBox.var5();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HunterInfoBox.var4(this.s.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.s.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(var1[var2[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(var1[var2[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(this.t.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(this.s.a() + " (" + this.c(this.s.a()) + "/hr)").build());
        0;
        int n2 = var2[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[8], var2[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HunterInfoBox(SquireHunter squireHunter) {
        this.s = squireHunter;
        this.t = squireHunter.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var6() {
        var2 = new int[11];
        HunterInfoBox.var2[0] = 0x7C ^ 0x76;
        HunterInfoBox.var2[1] = (0x3B ^ 0x41 ^ (0x2B ^ 0x47)) & (101 + 11 - 32 + 59 ^ 91 + 14 - -33 + 19 ^ -1);
        HunterInfoBox.var2[2] = 1;
        HunterInfoBox.var2[3] = 2;
        HunterInfoBox.var2[4] = 3;
        HunterInfoBox.var2[5] = 0x7D ^ 0x79;
        HunterInfoBox.var2[6] = 0xDB ^ 0xBD ^ (0x68 ^ 0xB);
        HunterInfoBox.var2[7] = -(0xFFFFEE5F & 0x7DE5) & (0xFFFFFD6F & 0x6FD6);
        HunterInfoBox.var2[8] = 0x6D ^ 0x79;
        HunterInfoBox.var2[9] = 0x4E ^ 0x48;
        HunterInfoBox.var2[10] = 125 + 21 - 114 + 174 ^ 101 + 107 - 107 + 97;
    }
}

