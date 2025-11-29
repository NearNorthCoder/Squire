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
package gg.squire.plugins.skilling.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import gg.squire.plugins.skilling.overlay.GameEnum4;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    
    private final  TaskManager n;
    private final  SquireBankStander m;
    
    private final  BankStanderConfig o;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new String[var2[0]];
        InfoBox.var1[InfoBox.var2[1]] = "Squire Bankstander";
        InfoBox.var1[InfoBox.var2[2]] = "Runtime:";
        InfoBox.var1[InfoBox.var2[3]] = "Version";
        InfoBox.var1[InfoBox.var2[4]] = "1.2.1";
        InfoBox.var1[InfoBox.var2[5]] = "Task: ";
        InfoBox.var1[InfoBox.var2[6]] = "Glass on ground: ";
        InfoBox.var1[InfoBox.var2[7]] = "Gems cut: ";
        InfoBox.var1[InfoBox.var2[8]] = "Gems cut per hour: ";
        InfoBox.var1[InfoBox.var2[9]] = "Products Made: ";
        InfoBox.var1[InfoBox.var2[10]] = "Products Made Per Hour: ";
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var11(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    @Inject
    private InfoBox(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.m = squireBankStander;
        this.n = squireBankStander.getManager();
        this.o = bankStanderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        InfoBox.var18();
        InfoBox.var9();
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (InfoBox.var20(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var21;
        if (InfoBox.var10(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var22 = Duration.between(var21.m.getStarted(), Instant.now());
        var21.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        var21.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[1]]).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(Time.format((Duration)var22)).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(var1[var2[4]]).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(var21.n.getCurrentTask()).build());
        0;
        if (InfoBox.var23((Object)var21.o.activity(), (Object)b.GLASS_MAKE)) {
            var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(var21.m.b())).build());
            0;
        }
        if (InfoBox.var23((Object)var21.o.activity(), (Object)b.GLASS_BLOWING)) {
            var21.panelComponent.getChildren().add(LineComponent.builder().left(var21.o.glassProduct().name() + " made").right(String.valueOf(var21.m.c())).build());
            0;
        }
        if (InfoBox.var23((Object)var21.o.activity(), (Object)b.GEM_CUTTING)) {
            var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(String.valueOf(var21.m.c())).build());
            0;
            var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(String.valueOf(var21.d(var21.m.c()))).build());
            0;
        }
        if (!InfoBox.var11((Object)var21.o.activity(), (Object)b.SMITHING) || !InfoBox.var11((Object)var21.o.activity(), (Object)b.FLETCH_CUTTING) || InfoBox.var23((Object)var21.o.activity(), (Object)b.STRING_BOWS)) {
            var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[9]]).right(String.valueOf(var21.m.c())).build());
            0;
            var21.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[10]]).right(String.valueOf(var21.d(var21.m.c()))).build());
            0;
        }
        int n2 = var2[11];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[12], var2[1]));
        return super.render(graphics2D);
    }

    private static boolean var23(Object object, Object object2) {
        return object == object2;
    }

    private static void var18() {
        var2 = new int[13];
        InfoBox.var2[0] = 33 + 18 - -73 + 4 ^ 17 + 67 - 66 + 120;
        InfoBox.var2[1] = (0xD4 ^ 0x80) & ~(0x75 ^ 0x21);
        InfoBox.var2[2] = 1;
        InfoBox.var2[3] = 2;
        InfoBox.var2[4] = 3;
        InfoBox.var2[5] = 0x24 ^ 0x20;
        InfoBox.var2[6] = 0x5D ^ 0x58 ^ (0x20 ^ 0x18) & ~(0x55 ^ 0x6D);
        InfoBox.var2[7] = 0x22 ^ 0x24;
        InfoBox.var2[8] = 6 ^ 0x3B ^ (0x14 ^ 0x2E);
        InfoBox.var2[9] = 0x7B ^ 0x73;
        InfoBox.var2[10] = 0x1D ^ 0x77 ^ (0xCD ^ 0xAE);
        InfoBox.var2[11] = -(0xFFFFF7FE & 0x3C07) & (0xFFFFFFEF & 0x3517);
        InfoBox.var2[12] = 0x77 ^ 0x63;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[1];
        while (InfoBox.var19(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (-(0x22 ^ 0x26) < 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }
}

