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
 */
package gg.squire.toa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.toa.SquireTOA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

@Singleton
public class DebugOverlay
extends OverlayPanel {
    private final  TaskManager aK;

    private final  SquireTOA aJ;

    private static void var3() {
        var1 = new int[4];
        DebugOverlay.var1[0] = (0x6A ^ 0x53) & ~(0xF8 ^ 0xC1);
        DebugOverlay.var1[1] = 1;
        DebugOverlay.var1[2] = 2;
        DebugOverlay.var1[3] = 60 + 14 - -11 + 83 ^ 130 + 148 - 276 + 158;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        DebugOverlay.var3();
        DebugOverlay.var11();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (DebugOverlay.var12(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[1]]).right(this.aK.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    @Inject
    protected DebugOverlay(SquireTOA squireTOA) {
        this.aJ = squireTOA;
        this.aK = squireTOA.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static void var11() {
        var2 = new String[var1[2]];
        DebugOverlay.var2[DebugOverlay.var1[0]] = "Squire TOA";
        DebugOverlay.var2[DebugOverlay.var1[1]] = "Performing Task";
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (DebugOverlay.var4(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }
}

