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
package gg.squire.scurrius.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
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
import gg.squire.scurrius.overlay.ScurriusManager;

public class SquireScurriusBox
extends OverlayPanel {
    private final  SquireScurriusConfig K;

    private  b c;
    private final  SquireScurrius I;
    private final  TaskManager J;

    @Inject
    public SquireScurriusBox(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2) {
        this.I = squireScurrius;
        this.J = squireScurrius.getManager();
        this.K = squireScurriusConfig;
        this.c = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var2 = new String[var1[8]];
        SquireScurriusBox.var2[SquireScurriusBox.var1[1]] = "Squire Scurrius";
        SquireScurriusBox.var2[SquireScurriusBox.var1[4]] = "Runtime:";
        SquireScurriusBox.var2[SquireScurriusBox.var1[5]] = "Kills: ";
        SquireScurriusBox.var2[SquireScurriusBox.var1[6]] = "%d (%.1f/h)";
        SquireScurriusBox.var2[SquireScurriusBox.var1[7]] = "Task:";
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[1];
        while (SquireScurriusBox.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0x38 ^ 0x3E) & ~(0 ^ 6)) > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var16() {
        var1 = new int[10];
        SquireScurriusBox.var1[0] = 0x45 ^ 0x4F;
        SquireScurriusBox.var1[1] = (0x3C ^ 3) & ~(0x4E ^ 0x71);
        SquireScurriusBox.var1[2] = (0x6C ^ 0x3A) + (0x28 ^ 0x3F) - -(0xAC ^ 0xA2) + (0xCC ^ 0x8A);
        SquireScurriusBox.var1[3] = 0x3C ^ 0x28;
        SquireScurriusBox.var1[4] = 1;
        SquireScurriusBox.var1[5] = 2;
        SquireScurriusBox.var1[6] = 3;
        SquireScurriusBox.var1[7] = 0xE4 ^ 0x88 ^ (0xE9 ^ 0x81);
        SquireScurriusBox.var1[8] = 0x26 ^ 0x2C ^ (0xA ^ 5);
        SquireScurriusBox.var1[9] = 0x38 ^ 0x30;
    }

    public double c(int n2) {
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        if (SquireScurriusBox.var3(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireScurriusBox.var23(this.I.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        String string = var2[var1[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = var1[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[3], var1[1]));
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(Time.format((Duration)duration)).build());
        0;
        int n3 = this.I.l();
        double d2 = this.c(n3);
        Object[] objectArray = new Object[var1[5]];
        objectArray[SquireScurriusBox.var1[1]] = n3;
        objectArray[SquireScurriusBox.var1[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(String.format(var2[var1[6]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(this.J.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.I.j()).left("Banking: " + this.I.m()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        if (SquireScurriusBox.var3(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        SquireScurriusBox.var16();
        SquireScurriusBox.var4();
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

