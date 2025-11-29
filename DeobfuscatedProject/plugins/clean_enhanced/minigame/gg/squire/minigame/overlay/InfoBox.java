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
package gg.squire.minigame.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigame.SquirePestControl;
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

public class InfoBox
extends OverlayPanel {
    
    private final  SquirePestControl o;
    private final  TaskManager n;

    static {
        InfoBox.var3();
        InfoBox.var4();
    }

    public long d(int n) {
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        if (InfoBox.var5(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (InfoBox.var6(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[1]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(String.valueOf(this.o.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(String.valueOf(this.o.c())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(String.valueOf(this.d(this.o.c()))).build());
        0;
        int n = var2[5];
        this.panelComponent.setPreferredSize(new Dimension(n, var2[0]));
        return super.render(graphics2D);
    }

    private static void var4() {
        var1 = new String[var2[6]];
        InfoBox.var1[InfoBox.var2[0]] = "Squire Pest Control";
        InfoBox.var1[InfoBox.var2[1]] = "Runtime";
        InfoBox.var1[InfoBox.var2[2]] = "Starting Points: ";
        InfoBox.var1[InfoBox.var2[3]] = "Points Gained: ";
        InfoBox.var1[InfoBox.var2[4]] = "Points Per Hour: ";
    }

    private static boolean var6(int n) {
        return n != 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n) {
        return n == 0;
    }

    @Inject
    public InfoBox(TaskManager taskManager, SquirePestControl squirePestControl) {
        this.n = taskManager;
        this.o = squirePestControl;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var2 = new int[8];
        InfoBox.var2[0] = (146 + 7 - 104 + 164 ^ 70 + 35 - 67 + 110) & (6 + 197 - 67 + 83 ^ 91 + 57 - 49 + 55 ^ -1);
        InfoBox.var2[1] = 1;
        InfoBox.var2[2] = 2;
        InfoBox.var2[3] = 3;
        InfoBox.var2[4] = 0x6C ^ 0x68;
        InfoBox.var2[5] = 0xFFFFFFE7 & 0x11A;
        InfoBox.var2[6] = 0x4B ^ 0x44 ^ (0x36 ^ 0x3C);
        InfoBox.var2[7] = 17 + 53 - -22 + 35 ^ (0x14 ^ 0x63);
    }
}

