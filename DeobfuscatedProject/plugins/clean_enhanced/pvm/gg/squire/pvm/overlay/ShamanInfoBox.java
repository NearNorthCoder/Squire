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
package gg.squire.pvm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.pvm.SquireShamansPlugin;
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
import gg.squire.pvm.overlay.PvmManager;
import gg.squire.pvm.overlay.PvmManager;

public class ShamanInfoBox
extends OverlayPanel {
    
    private final  c L;
    private final  TaskManager K;
    private final  SquireShamansPlugin J;
    
    private  a M;

    @Inject
    private ShamanInfoBox(SquireShamansPlugin squireShamansPlugin, c c2, a a2) {
        this.J = squireShamansPlugin;
        this.K = squireShamansPlugin.getManager();
        this.L = c2;
        this.M = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        if (ShamanInfoBox.var16(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        ShamanInfoBox.var17();
        ShamanInfoBox.var18();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ShamanInfoBox.var9(this.J.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(var2[var1[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(this.K.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.valueOf(this.M.m())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(String.valueOf(this.J.a())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right("" + this.c(this.J.a())).build());
        0;
        int n2 = var1[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[10], var1[1]));
        return super.render(graphics2D);
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[1];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[1];
        while (ShamanInfoBox.var28(var27, var26)) {
            char var29 = var25[var27];
            var22.append((char)(var29 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if ((21 + 95 - 4 + 19 ^ 15 + 85 - 59 + 94) > ((159 + 152 - 303 + 200 ^ 106 + 105 - 204 + 151) & (0x68 ^ 0x2C ^ (2 ^ 8) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }

    private static void var18() {
        var2 = new String[var1[11]];
        ShamanInfoBox.var2[ShamanInfoBox.var1[1]] = "Squire Shamans";
        ShamanInfoBox.var2[ShamanInfoBox.var1[2]] = "Version";
        ShamanInfoBox.var2[ShamanInfoBox.var1[3]] = "0.2.7";
        ShamanInfoBox.var2[ShamanInfoBox.var1[4]] = "Runtime";
        ShamanInfoBox.var2[ShamanInfoBox.var1[5]] = "Task: ";
        ShamanInfoBox.var2[ShamanInfoBox.var1[6]] = "Looting: ";
        ShamanInfoBox.var2[ShamanInfoBox.var1[7]] = "Kills";
        ShamanInfoBox.var2[ShamanInfoBox.var1[8]] = "Kills Per Hour";
    }

    private static void var17() {
        var1 = new int[12];
        ShamanInfoBox.var1[0] = 0x30 ^ 0x3A;
        ShamanInfoBox.var1[1] = (27 + 65 - -47 + 58 ^ 24 + 75 - 49 + 87) & (0x6C ^ 0x3B ^ (0x33 ^ 0x28) ^ -1);
        ShamanInfoBox.var1[2] = 1;
        ShamanInfoBox.var1[3] = 2;
        ShamanInfoBox.var1[4] = 3;
        ShamanInfoBox.var1[5] = 9 + 109 - -74 + 3 ^ 71 + 11 - 3 + 120;
        ShamanInfoBox.var1[6] = 0xAE ^ 0xAB;
        ShamanInfoBox.var1[7] = 0x69 ^ 0x6F;
        ShamanInfoBox.var1[8] = 12 + 45 - -5 + 99 ^ 64 + 65 - 51 + 88;
        ShamanInfoBox.var1[9] = 0xFFFFF99B & 0x766;
        ShamanInfoBox.var1[10] = 110 + 157 - 174 + 75 ^ 107 + 155 - 94 + 20;
        ShamanInfoBox.var1[11] = 0xA8 ^ 0x86 ^ (0x96 ^ 0xB0);
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }
}

