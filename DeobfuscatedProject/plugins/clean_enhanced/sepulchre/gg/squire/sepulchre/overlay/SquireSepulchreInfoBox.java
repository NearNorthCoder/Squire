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
package gg.squire.sepulchre.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
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

public class SquireSepulchreInfoBox
extends OverlayPanel {
    private final  SquireSepulchre aa;

    private final  TaskManager ab;
    private final  SquireSepulchreConfig ac;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        SquireSepulchreInfoBox.var11();
        SquireSepulchreInfoBox.var12();
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (SquireSepulchreInfoBox.var3(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((6 ^ 0x2A) & ~(0x21 ^ 0xD)) != -1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static void var12() {
        var1 = new String[var2[8]];
        SquireSepulchreInfoBox.var1[SquireSepulchreInfoBox.var2[1]] = "Squire Hallowed Sepulchre";
        SquireSepulchreInfoBox.var1[SquireSepulchreInfoBox.var2[4]] = "Version:";
        SquireSepulchreInfoBox.var1[SquireSepulchreInfoBox.var2[5]] = "1.2.10";
        SquireSepulchreInfoBox.var1[SquireSepulchreInfoBox.var2[6]] = "Runtime:";
        SquireSepulchreInfoBox.var1[SquireSepulchreInfoBox.var2[7]] = "Obstacle:";
    }

    @Inject
    public SquireSepulchreInfoBox(SquireSepulchre squireSepulchre, TaskManager taskManager, SquireSepulchreConfig squireSepulchreConfig) {
        this.aa = squireSepulchre;
        this.ab = squireSepulchre.getManager();
        this.ac = squireSepulchreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        if (SquireSepulchreInfoBox.var29(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var29(int n2) {
        return n2 == 0;
    }

    private static void var11() {
        var2 = new int[10];
        SquireSepulchreInfoBox.var2[0] = 0x3E ^ 0x33 ^ (0x98 ^ 0x9F);
        SquireSepulchreInfoBox.var2[1] = (0xB8 ^ 0xAB) & ~(0x65 ^ 0x76);
        SquireSepulchreInfoBox.var2[2] = 65 + 182 - 129 + 75;
        SquireSepulchreInfoBox.var2[3] = 0xF ^ 0x1B;
        SquireSepulchreInfoBox.var2[4] = 1;
        SquireSepulchreInfoBox.var2[5] = 2;
        SquireSepulchreInfoBox.var2[6] = 3;
        SquireSepulchreInfoBox.var2[7] = 45 + 38 - 51 + 120 ^ 154 + 96 - 118 + 24;
        SquireSepulchreInfoBox.var2[8] = 16 + 106 - 3 + 8 ^ (0x5F ^ 0x25);
        SquireSepulchreInfoBox.var2[9] = 0x2F ^ 0x27;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireSepulchreInfoBox.var4(this.aa.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        String string = var1[var2[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = var2[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[3], var2[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(var1[var2[5]]).build());
        0;
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(this.aa.getName()).build());
        0;
        return super.render(graphics2D);
    }
}

