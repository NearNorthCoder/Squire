/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.overlay.FHelper;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class FightCavesInfoBox
extends OverlayPanel {
    
    private final  f O;
    private final  SquireFightCavesPlugin N;
    private final  SquireFightCavesConfig P;
    private final  TaskManager Q;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public long j(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 <= ((0xCF ^ 0xC7 ^ (0x74 ^ 0x63)) & (147 + 111 - 197 + 158 ^ 41 + 75 - -38 + 42 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public Dimension render(Graphics2D graphics2D) {
        FightCavesInfoBox var19;
        if ((this.N.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        long var20 = System.currentTimeMillis() - SquireFightCavesPlugin.k;
        var19.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String var21 = var2[1];
        var19.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var21).build());
        0;
        int var22 = 2;
        var19.panelComponent.setPreferredSize(new Dimension(var22 + 3, 1));
        Duration var23 = Duration.between(var19.N.getStarted(), Instant.now());
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(Time.format((Duration)var23)).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(SquireFightCavesPlugin.h).build());
        0;
        List list = var19.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var2[6]);
        f cfr_ignored_0 = var19.O;
        0;
        list.add(lineComponentBuilder.right(String.valueOf(f.p())).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[7]).right(String.valueOf(SquireFightCavesPlugin.j)).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[8]).right(String.valueOf(SquireFightCavesPlugin.i) + " (" + FightCavesInfoBox.a(SquireFightCavesPlugin.i, var20) + "/hr)").build());
        0;
        if ((var19.P.showExtraInfoOnUI( != 0) ? 1 : 0)) {
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[9]).right(String.valueOf(f.w())).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(String.valueOf(f.u())).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(String.valueOf(f.t())).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(String.valueOf(f.r())).build());
            0;
        }
        return super.render(graphics2D);
    }

    @Inject
    public FightCavesInfoBox(SquireFightCavesPlugin squireFightCavesPlugin, f f2, SquireFightCavesConfig squireFightCavesConfig) {
        this.N = squireFightCavesPlugin;
        this.Q = squireFightCavesPlugin.getManager();
        this.O = f2;
        this.P = squireFightCavesConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static double a(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(var2[0]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return FightCavesInfoBox.a(d3);
    }
}

