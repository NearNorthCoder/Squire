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
package gg.squire.plugins.agility;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
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

public class AgilityOverlay
extends OverlayPanel {
    private final  TaskManager c;
    
    private final  AgilityConfig b;
    
    private final  SquireAgilityPlugin a;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n, int n2) {
        return n < n2;
    }

    private static void var10() {
        var2 = new String[var1[9]];
        AgilityOverlay.var2[AgilityOverlay.var1[0]] = "Squire Agility";
        AgilityOverlay.var2[AgilityOverlay.var1[1]] = "Runtime";
        AgilityOverlay.var2[AgilityOverlay.var1[2]] = "Version";
        AgilityOverlay.var2[AgilityOverlay.var1[3]] = "1.3.0";
        AgilityOverlay.var2[AgilityOverlay.var1[4]] = "Status";
        AgilityOverlay.var2[AgilityOverlay.var1[5]] = "Laps";
        AgilityOverlay.var2[AgilityOverlay.var1[6]] = "Course";
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (AgilityOverlay.var9(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var21(int n) {
        return n != 0;
    }

    private static void var22() {
        var1 = new int[11];
        AgilityOverlay.var1[0] = (0x92 ^ 0x9E ^ (0xF9 ^ 0xB3)) & (166 + 141 - 229 + 132 ^ 54 + 137 - 69 + 26 ^ -1) & ((0xC8 ^ 0xBD ^ (0x55 ^ 0x1D)) & (0x97 ^ 0xB1 ^ (0x27 ^ 0x3C) ^ -1) & ((90 + 166 - 108 + 63 ^ 53 + 130 - 123 + 118) & (74 + 92 - 18 + 67 ^ 52 + 176 - 148 + 102 ^ -1) ^ -1) ^ -1);
        AgilityOverlay.var1[1] = 1;
        AgilityOverlay.var1[2] = 2;
        AgilityOverlay.var1[3] = 3;
        AgilityOverlay.var1[4] = 0x36 ^ 0x30 ^ 2;
        AgilityOverlay.var1[5] = 0x42 ^ 0x2F ^ (0xAD ^ 0xC5);
        AgilityOverlay.var1[6] = 118 + 57 - 39 + 37 ^ 71 + 137 - 200 + 163;
        AgilityOverlay.var1[7] = 0xFFFF833B & 0x7DC6;
        AgilityOverlay.var1[8] = 0xB ^ 0x1F;
        AgilityOverlay.var1[9] = 0xAF ^ 0xC3 ^ (0xD ^ 0x66);
        AgilityOverlay.var1[10] = 0 ^ 8;
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        AgilityOverlay var23;
        if (AgilityOverlay.var21(this.a.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var23.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[0]]).build());
        0;
        Duration var24 = Duration.between(var23.a.getStarted(), Instant.now());
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[1]]).right(Time.format((Duration)var24)).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(var2[var1[3]]).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(var23.c.getCurrentTask()).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(var23.a.b() + " (" + var23.a(var23.a.b()) + "/h)").build());
        0;
        if (AgilityOverlay.var21(var23.b.progressive() ? 1 : 0)) {
            object = "Progressive (" + String.valueOf((Object)var23.a.a()) + ")";
            0;
            if ((78 + 149 - 80 + 25 ^ 149 + 72 - 81 + 28) < (0x52 ^ 0x5A ^ (0x45 ^ 0x49))) {
                return null;
            }
        } else {
            object = var23.a.a().toString();
        }
        Object object2 = object;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right((String)object2).build());
        0;
        int n = var1[7];
        this.panelComponent.setPreferredSize(new Dimension(n + var1[8], var1[0]));
        return super.render(graphics2D);
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    static {
        AgilityOverlay.var22();
        AgilityOverlay.var10();
    }

    private long a(int n) {
        Duration duration = Duration.between(this.a.getStarted(), Instant.now());
        if (AgilityOverlay.var21(duration.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

    @Inject
    private AgilityOverlay(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.a = squireAgilityPlugin;
        this.b = agilityConfig;
        this.c = squireAgilityPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

