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
package gg.squire.thieving.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquirePlunder;
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
import gg.squire.thieving.overlay.ThievingManager;

public class PlunderInfoBox
extends OverlayPanel {
    private final  SquirePlunder o;
    private final  a q;
    
    private final  TaskManager p;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlunderInfoBox.var9(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(var1[var2[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(var1[var2[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.valueOf(this.q.e())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(this.p.getCurrentTask()).build());
        0;
        int n2 = var2[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[8], var2[1]));
        return super.render(graphics2D);
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var16() {
        var1 = new String[var2[9]];
        PlunderInfoBox.var1[PlunderInfoBox.var2[1]] = "Squire Pyramid Plunder";
        PlunderInfoBox.var1[PlunderInfoBox.var2[2]] = "Version";
        PlunderInfoBox.var1[PlunderInfoBox.var2[3]] = "1.0.0";
        PlunderInfoBox.var1[PlunderInfoBox.var2[4]] = "Runtime";
        PlunderInfoBox.var1[PlunderInfoBox.var2[5]] = "Sceptres found: ";
        PlunderInfoBox.var1[PlunderInfoBox.var2[6]] = "Task: ";
    }

    @Inject
    private PlunderInfoBox(SquirePlunder squirePlunder, a a2) {
        this.o = squirePlunder;
        this.p = squirePlunder.getManager();
        this.q = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void var17() {
        var2 = new int[11];
        PlunderInfoBox.var2[0] = 0xA8 ^ 0xA2;
        PlunderInfoBox.var2[1] = (0x7A ^ 0x1F ^ (0x10 ^ 0x23)) & (0xAA ^ 0x9C ^ (0x36 ^ 0x56) ^ -1);
        PlunderInfoBox.var2[2] = 1;
        PlunderInfoBox.var2[3] = 2;
        PlunderInfoBox.var2[4] = 3;
        PlunderInfoBox.var2[5] = 0xB2 ^ 0x86 ^ (0x7E ^ 0x4E);
        PlunderInfoBox.var2[6] = 0x5E ^ 0x7C ^ (0xB1 ^ 0x96);
        PlunderInfoBox.var2[7] = 0xFFFF8DAF & 0x7352;
        PlunderInfoBox.var2[8] = 0x7D ^ 0x69;
        PlunderInfoBox.var2[9] = 0x76 ^ 0x70;
        PlunderInfoBox.var2[10] = 0x9C ^ 0x94;
    }

    static {
        PlunderInfoBox.var17();
        PlunderInfoBox.var16();
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[1];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[1];
        while (PlunderInfoBox.var27(var26, var25)) {
            char var28 = var24[var26];
            var21.append((char)(var28 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (2 <= (0x2D ^ 0x29)) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var27(int n2, int n3) {
        return n2 < n3;
    }
}

