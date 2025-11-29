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
package gg.squire.hunter.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
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
import gg.squire.hunter.tasks.HunterManager;
import squire.gg.hunter.SquireHerbiboarPlugin;

public class HerbiboarInfoBox
extends OverlayPanel {
    private final  TaskManager aa;
    private final  SquireHerbiboarPlugin Z;

    private final  b ab;

    @Inject
    private HerbiboarInfoBox(SquireHerbiboarPlugin squireHerbiboarPlugin, b b2) {
        this.Z = squireHerbiboarPlugin;
        this.aa = squireHerbiboarPlugin.getManager();
        this.ab = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[12];
        HerbiboarInfoBox.var1[0] = (149 + 113 - 164 + 77 ^ 162 + 26 - 158 + 137) & (8 + 123 - 58 + 112 ^ 110 + 7 - -44 + 16 ^ -1);
        HerbiboarInfoBox.var1[1] = 1;
        HerbiboarInfoBox.var1[2] = 2;
        HerbiboarInfoBox.var1[3] = 3;
        HerbiboarInfoBox.var1[4] = 0xBF ^ 0xBB;
        HerbiboarInfoBox.var1[5] = 0x6C ^ 0x69;
        HerbiboarInfoBox.var1[6] = 0xC2 ^ 0xC4;
        HerbiboarInfoBox.var1[7] = 0x77 ^ 1 ^ (0x6F ^ 0x1E);
        HerbiboarInfoBox.var1[8] = 114 + 39 - 90 + 90 ^ 34 + 96 - 67 + 82;
        HerbiboarInfoBox.var1[9] = -(0xFFFFFFDD & 0x6FF) & (0xFFFFA7FF & 0x5FDE);
        HerbiboarInfoBox.var1[10] = 0x8B ^ 0x9F;
        HerbiboarInfoBox.var1[11] = 145 + 120 - 255 + 162 ^ 62 + 83 - 10 + 30;
    }

    static {
        HerbiboarInfoBox.var4();
        HerbiboarInfoBox.var5();
    }

    private static void var5() {
        var2 = new String[var1[11]];
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[0]] = "Squire Herbiboar";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[1]] = "Runtime";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[2]] = "Version";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[3]] = "1.1.5";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[4]] = "Current state: ";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[5]] = "Needs restock: ";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[6]] = "Task: ";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[7]] = "Herbiboar Kills";
        HerbiboarInfoBox.var2[HerbiboarInfoBox.var1[8]] = "Herbiboar Kills Per Hour";
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (HerbiboarInfoBox.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HerbiboarInfoBox.var3(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[1]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(var2[var1[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(this.ab.i().toString()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(String.valueOf(this.Z.f())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(this.aa.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right("" + SquireHerbiboarPlugin.e()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right("" + this.c(SquireHerbiboarPlugin.e())).build());
        0;
        int n2 = var1[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[10], var1[0]));
        return super.render(graphics2D);
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (HerbiboarInfoBox.var23(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

