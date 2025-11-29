/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.thieving;

import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.thieving.GameEnum;
import gg.squire.thieving.GameEnum4;

@Singleton
public class ThievingOverlayPanel
extends OverlayPanel {
    private final  SquireThievingConfig n;

    private final  SquireThieving m;

    static {
        ThievingOverlayPanel.var3();
        ThievingOverlayPanel.var4();
    }

    private void a(Graphics2D graphics2D) {
        d d2 = this.m.b();
        if (ThievingOverlayPanel.var5((Object)d2)) {
            return;
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[12]]).right(d2.v()).build());
        0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    @Inject
    public ThievingOverlayPanel(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.m = squireThieving;
        this.n = squireThievingConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void var3() {
        var2 = new int[14];
        ThievingOverlayPanel.var2[0] = 0xA4 ^ 0xAE;
        ThievingOverlayPanel.var2[1] = -(0xFFFFBF36 & 0x58DF) & (0xFFFF9B5F & 0x7DB7);
        ThievingOverlayPanel.var2[2] = 0x9B ^ 0xA4 ^ (0x6A ^ 0x41);
        ThievingOverlayPanel.var2[3] = (0x11 ^ 0x68 ^ (0xF0 ^ 0x9C)) & (52 + 75 - 10 + 12 ^ 116 + 52 - 57 + 37 ^ -1);
        ThievingOverlayPanel.var2[4] = 1;
        ThievingOverlayPanel.var2[5] = 2;
        ThievingOverlayPanel.var2[6] = 3;
        ThievingOverlayPanel.var2[7] = 0x46 ^ 0x42;
        ThievingOverlayPanel.var2[8] = 0x1A ^ 0x1F;
        ThievingOverlayPanel.var2[9] = 0xA8 ^ 0xAE;
        ThievingOverlayPanel.var2[10] = -1;
        ThievingOverlayPanel.var2[11] = 0x21 ^ 0x6C ^ (0x5F ^ 0x15);
        ThievingOverlayPanel.var2[12] = 2 ^ 0x2A ^ (0x44 ^ 0x64);
        ThievingOverlayPanel.var2[13] = 0x52 ^ 0x13 ^ (0xF1 ^ 0xB9);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var13(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var14(Object object, Object object2) {
        return object == object2;
    }

    private static void var4() {
        var1 = new String[var2[13]];
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[3]] = "Squire Thieving";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[4]] = "Version:";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[5]] = "1.4.6";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[6]] = "Runtime:";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[7]] = "Method";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[8]] = "Banking: ";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[9]] = "Performing";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[11]] = "Saved world";
        ThievingOverlayPanel.var1[ThievingOverlayPanel.var2[12]] = "Target";
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        TaskManager var15;
        ThievingOverlayPanel var16;
        if (ThievingOverlayPanel.var17(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var16.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        int var18 = var2[1];
        var16.panelComponent.setPreferredSize(new Dimension(var18 + var2[2], var2[3]));
        String var19 = var1[var2[3]];
        var16.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var19).build());
        0;
        var16.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(var1[var2[5]]).build());
        0;
        Duration var20 = Duration.between(var16.m.getStarted(), Instant.now());
        var16.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(Time.format((Duration)var20)).build());
        0;
        var16.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(var16.n.method().toString()).build());
        0;
        if (ThievingOverlayPanel.var14((Object)var16.n.method(), (Object)b.PICKPOCKETING)) {
            var16.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(String.valueOf(var16.m.j())).build());
            0;
        }
        if (ThievingOverlayPanel.var12(var15 = var16.m.getManager())) {
            var16.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[9]]).right(var15.getCurrentTask()).build());
            0;
            if (ThievingOverlayPanel.var14((Object)var16.n.method(), (Object)b.BLACK_JACK)) {
                void var21;
                var16.a((Graphics2D)var21);
            }
        }
        if (ThievingOverlayPanel.var17(var16.m.e()) && ThievingOverlayPanel.var13(var16.m.e(), var2[10])) {
            var16.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[11]]).right(String.valueOf(var16.m.e())).build());
            0;
        }
        return super.render(graphics2D);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var2[3];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var2[3];
        while (ThievingOverlayPanel.var37(var36, var35)) {
            char var38 = var34[var36];
            var31.append((char)(var38 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    private static boolean var37(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }
}

