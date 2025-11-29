/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.runelite.client.util.QuantityFormatter
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.client.Static
 */
package gg.squire.vorkath.ui;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.ui.VorkathManager;
import gg.squire.vorkath.ui.VorkathManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.NPC;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.util.QuantityFormatter;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class VorkathInfoBox
extends OverlayPanel {
    private final  d cL;
    
    private final  SquireVorkathPlugin cK;
    
    private  SquireVorkathConfig y;
    private final  f cM;

    private static boolean var3(Object object) {
        return object != null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        VorkathInfoBox.var10();
        VorkathInfoBox.var11();
    }

    private static void var11() {
        var2 = new String[var1[17]];
        VorkathInfoBox.var2[VorkathInfoBox.var1[2]] = "Squire Vorkath";
        VorkathInfoBox.var2[VorkathInfoBox.var1[3]] = "Version";
        VorkathInfoBox.var2[VorkathInfoBox.var1[4]] = "0.3.1";
        VorkathInfoBox.var2[VorkathInfoBox.var1[5]] = "Runtime";
        VorkathInfoBox.var2[VorkathInfoBox.var1[6]] = "Performing Task";
        VorkathInfoBox.var2[VorkathInfoBox.var1[7]] = "Kills";
        VorkathInfoBox.var2[VorkathInfoBox.var1[8]] = "%d (%d/h)";
        VorkathInfoBox.var2[VorkathInfoBox.var1[9]] = "Money";
        VorkathInfoBox.var2[VorkathInfoBox.var1[10]] = "%s (%s/h)";
        VorkathInfoBox.var2[VorkathInfoBox.var1[11]] = "Deaths";
        VorkathInfoBox.var2[VorkathInfoBox.var1[0]] = "%d";
        VorkathInfoBox.var2[VorkathInfoBox.var1[12]] = "Bakning";
        VorkathInfoBox.var2[VorkathInfoBox.var1[13]] = "Vorkath Frame";
        VorkathInfoBox.var2[VorkathInfoBox.var1[14]] = "Ticks since attack";
        VorkathInfoBox.var2[VorkathInfoBox.var1[15]] = "Ice spawn";
        VorkathInfoBox.var2[VorkathInfoBox.var1[16]] = "Special";
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    @Inject
    public VorkathInfoBox(SquireVorkathPlugin squireVorkathPlugin, d d2, f f2, SquireVorkathConfig squireVorkathConfig) {
        this.cK = squireVorkathPlugin;
        this.cL = d2;
        this.cM = f2;
        this.y = squireVorkathConfig;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void var10() {
        var1 = new int[18];
        VorkathInfoBox.var1[0] = 0x89 ^ 0x83;
        VorkathInfoBox.var1[1] = 0xFFFFFF0F & 0x1F2;
        VorkathInfoBox.var1[2] = (0x12 ^ 0x2D) & ~(0x6B ^ 0x54);
        VorkathInfoBox.var1[3] = 1;
        VorkathInfoBox.var1[4] = 2;
        VorkathInfoBox.var1[5] = 3;
        VorkathInfoBox.var1[6] = 133 + 92 - 55 + 9 ^ 93 + 130 - 121 + 81;
        VorkathInfoBox.var1[7] = 0x8A ^ 0x8F;
        VorkathInfoBox.var1[8] = 82 + 65 - 78 + 96 ^ 147 + 41 - 131 + 106;
        VorkathInfoBox.var1[9] = 0xB6 ^ 0xB1;
        VorkathInfoBox.var1[10] = 0xA9 ^ 0xA1;
        VorkathInfoBox.var1[11] = 0xA2 ^ 0xBB ^ (0x71 ^ 0x61);
        VorkathInfoBox.var1[12] = 0xC1 ^ 0x82 ^ (0xED ^ 0xA5);
        VorkathInfoBox.var1[13] = 0x64 ^ 0x68;
        VorkathInfoBox.var1[14] = 0x91 ^ 0x9C;
        VorkathInfoBox.var1[15] = 137 + 35 - 90 + 62 ^ 80 + 81 - 26 + 23;
        VorkathInfoBox.var1[16] = 168 + 102 - 143 + 51 ^ 148 + 149 - 229 + 121;
        VorkathInfoBox.var1[17] = 134 + 152 - 109 + 13 ^ 66 + 98 - 86 + 96;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[2];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[2];
        while (VorkathInfoBox.var23(var22, var21)) {
            char var24 = var20[var22];
            var17.append((char)(var24 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        VorkathInfoBox var25;
        if (VorkathInfoBox.var12(this.cK.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var25.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        var25.panelComponent.setPreferredSize(new Dimension(var1[1], var1[2]));
        String var26 = var2[var1[2]];
        var25.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var26).build());
        0;
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[3]]).right(var2[var1[4]]).build());
        0;
        Duration var27 = Duration.between(var25.cK.getStarted(), Instant.now());
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(Time.format((Duration)var27)).build());
        0;
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(var25.cK.getManager().getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[var1[4]];
        objectArray[VorkathInfoBox.var1[2]] = var25.cK.e();
        objectArray[VorkathInfoBox.var1[3]] = var25.g(var25.cK.e());
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(String.format(var2[var1[8]], objectArray)).build());
        0;
        Object[] objectArray2 = new Object[var1[4]];
        objectArray2[VorkathInfoBox.var1[2]] = QuantityFormatter.quantityToRSDecimalStack((int)var25.cK.g());
        objectArray2[VorkathInfoBox.var1[3]] = QuantityFormatter.quantityToRSDecimalStack((int)var25.g(var25.cK.g()));
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(String.format(var2[var1[10]], objectArray2)).build());
        0;
        Object[] objectArray3 = new Object[var1[3]];
        objectArray3[VorkathInfoBox.var1[2]] = var25.cK.d();
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(String.format(var2[var1[0]], objectArray3)).build());
        0;
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(String.valueOf(var25.cK.c())).build());
        0;
        NPC var28 = var25.cM.c(var1[3]);
        if (VorkathInfoBox.var3(var28) && VorkathInfoBox.var12(var25.y.debug() ? 1 : 0)) {
            var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[13]]).right(String.valueOf(var28.getActionFrame())).build());
            0;
            var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[14]]).right(String.valueOf(Static.getClient().getTickCount() - var25.cM.H())).build());
            0;
            var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[15]]).right(String.valueOf(var25.cM.I())).build());
            0;
            var25.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[16]]).right(String.valueOf((Object)var25.cM.B())).build());
            0;
        }
        return super.render(graphics2D);
    }

    public int g(int n2) {
        Duration duration = Duration.between(this.cK.getStarted(), Instant.now());
        if (VorkathInfoBox.var13(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return var1[2];
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }
}

