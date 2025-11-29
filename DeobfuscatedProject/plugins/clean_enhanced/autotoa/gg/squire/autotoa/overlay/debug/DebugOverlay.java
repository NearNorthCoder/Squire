/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.autotoa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.autotoa.overlay.debug.AutotoaManager;
import gg.squire.autotoa.overlay.debug.GameEnum12;

@Singleton
public class DebugOverlay
extends OverlayPanel {
    private final  C cb;
    private final  SquireAutoTOA bZ;
    private final  TaskManager ca;

    @Inject
    protected DebugOverlay(SquireAutoTOA squireAutoTOA, C c2) {
        this.bZ = squireAutoTOA;
        this.ca = squireAutoTOA.getManager();
        this.cb = c2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (DebugOverlay.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var15() {
        var2 = new int[9];
        DebugOverlay.var2[0] = (55 + 77 - 99 + 186 ^ 46 + 38 - -22 + 37) & (205 + 40 - 34 + 19 ^ 60 + 50 - 15 + 83 ^ -1);
        DebugOverlay.var2[1] = 1;
        DebugOverlay.var2[2] = 2;
        DebugOverlay.var2[3] = 3;
        DebugOverlay.var2[4] = 90 + 145 - 137 + 68 ^ 83 + 111 - 161 + 129;
        DebugOverlay.var2[5] = 104 + 117 - 137 + 53 ^ 56 + 113 - 156 + 127;
        DebugOverlay.var2[6] = 0x7D ^ 0x2F ^ (0x54 ^ 0);
        DebugOverlay.var2[7] = 0x2F ^ 0x28;
        DebugOverlay.var2[8] = 0xE5 ^ 0xB5 ^ (0x79 ^ 0x21);
    }

    private static void var16() {
        var1 = new String[var2[8]];
        DebugOverlay.var1[DebugOverlay.var2[0]] = "Squire Auto TOA";
        DebugOverlay.var1[DebugOverlay.var2[1]] = "Runtime";
        DebugOverlay.var1[DebugOverlay.var2[2]] = "Version";
        DebugOverlay.var1[DebugOverlay.var2[3]] = "2.10.3";
        DebugOverlay.var1[DebugOverlay.var2[4]] = "Performing Task";
        DebugOverlay.var1[DebugOverlay.var2[5]] = "Completed Raids";
        DebugOverlay.var1[DebugOverlay.var2[6]] = "Deaths (this raid)";
        DebugOverlay.var1[DebugOverlay.var2[7]] = "Failed Raids";
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    static {
        DebugOverlay.var15();
        DebugOverlay.var16();
    }

    public Dimension render(Graphics2D graphics2D) {
        DebugOverlay var29;
        if (DebugOverlay.var14(this.bZ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var30 = Duration.between(var29.bZ.getStarted(), Instant.now());
        var29.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[0]]).build());
        0;
        var29.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[1]]).right(Time.format((Duration)var30)).build());
        0;
        var29.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(var1[var2[3]]).build());
        0;
        var29.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(var29.ca.getCurrentTask()).build());
        0;
        var29.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.valueOf(var29.bZ.i())).build());
        0;
        var29.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(var29.bZ.k())).build());
        0;
        var29.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(String.valueOf(var29.bZ.j())).build());
        0;
        Iterator<e> var31 = var29.cb.av().keySet().iterator();
        while (DebugOverlay.var14(var31.hasNext() ? 1 : 0)) {
            e var32 = var31.next();
            var29.panelComponent.getChildren().add(LineComponent.builder().left(var32.toString()).right(var29.cb.av().get((Object)var32).toString()).build());
            0;
            0;
            if (((0x72 ^ 0x36) & ~(0x31 ^ 0x75)) == 0) continue;
            return null;
        }
        return super.render(graphics2D);
    }
}

