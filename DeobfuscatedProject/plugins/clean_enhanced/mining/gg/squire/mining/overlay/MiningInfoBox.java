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
package gg.squire.mining.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import gg.squire.mining.overlay.MiningManager;
import gg.squire.mining.overlay.GameEnum5;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class MiningInfoBox
extends OverlayPanel {
    private final  SquireMinerConfig n;
    private final  TaskManager m;
    private final  SquireMiner l;

    private final  T o;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var2 = new String[var1[14]];
        MiningInfoBox.var2[MiningInfoBox.var1[0]] = "Squire Miner";
        MiningInfoBox.var2[MiningInfoBox.var1[1]] = "Runtime";
        MiningInfoBox.var2[MiningInfoBox.var1[2]] = "Version";
        MiningInfoBox.var2[MiningInfoBox.var1[3]] = "1.3.4";
        MiningInfoBox.var2[MiningInfoBox.var1[4]] = "Task: ";
        MiningInfoBox.var2[MiningInfoBox.var1[7]] = "Paydirt: ";
        MiningInfoBox.var2[MiningInfoBox.var1[8]] = "%d | %d | %d";
        MiningInfoBox.var2[MiningInfoBox.var1[9]] = "Sack size: ";
        MiningInfoBox.var2[MiningInfoBox.var1[10]] = "Banking:";
        MiningInfoBox.var2[MiningInfoBox.var1[11]] = "Mined";
        MiningInfoBox.var2[MiningInfoBox.var1[12]] = "Mined";
        MiningInfoBox.var2[MiningInfoBox.var1[13]] = "Mined Per Hour";
    }

    public long a(int n2) {
        Duration duration = Duration.between(this.l.getStarted(), Instant.now());
        if (MiningInfoBox.var3(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (MiningInfoBox.var4(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var22(Object object, Object object2) {
        return object == object2;
    }

    static {
        MiningInfoBox.var23();
        MiningInfoBox.var11();
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private void b(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(String.valueOf(this.l.b())).build());
        0;
    }

    private void c(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(String.valueOf(this.l.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[13]]).right(String.valueOf(this.a(this.l.b()))).build());
        0;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var30;
        MiningInfoBox var31;
        if (MiningInfoBox.var32(this.l.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var33 = Duration.between(var31.l.getStarted(), Instant.now());
        var31.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[0]]).build());
        0;
        var31.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[1]]).right(Time.format((Duration)var33)).build());
        0;
        var31.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(var2[var1[3]]).build());
        0;
        var31.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(var31.m.getCurrentTask()).build());
        0;
        if (MiningInfoBox.var22((Object)var31.n.activity(), (Object)a.GRANITE)) {
            var31.c((Graphics2D)var30);
        }
        if (MiningInfoBox.var22((Object)var31.n.activity(), (Object)a.SANDSTONE)) {
            var31.b((Graphics2D)var30);
            0;
            if null != null {
                return null;
            }
        } else if (MiningInfoBox.var22((Object)var31.n.activity(), (Object)a.MOTHERLODE_MINE)) {
            var31.a((Graphics2D)var30);
        }
        int n2 = var1[5];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[6], var1[0]));
        return super.render(graphics2D);
    }

    private static void var23() {
        var1 = new int[15];
        MiningInfoBox.var1[0] = (0x61 ^ 0x3F) & ~(0x78 ^ 0x26);
        MiningInfoBox.var1[1] = 1;
        MiningInfoBox.var1[2] = 2;
        MiningInfoBox.var1[3] = 3;
        MiningInfoBox.var1[4] = 186 + 183 - 320 + 142 ^ 185 + 147 - 248 + 103;
        MiningInfoBox.var1[5] = -(0xFFFFFFF5 & 0x6E5F) & (0xFFFFFF56 & 0x6FFF);
        MiningInfoBox.var1[6] = 0x9F ^ 0x8B;
        MiningInfoBox.var1[7] = 0x18 ^ 0x1D;
        MiningInfoBox.var1[8] = 1 ^ 7;
        MiningInfoBox.var1[9] = 0xE7 ^ 0xBD ^ (0x2F ^ 0x72);
        MiningInfoBox.var1[10] = 0x5F ^ 0x57;
        MiningInfoBox.var1[11] = 102 + 33 - 9 + 5 ^ 125 + 35 - 38 + 16;
        MiningInfoBox.var1[12] = 29 + 132 - 27 + 22 ^ 134 + 80 - 151 + 87;
        MiningInfoBox.var1[13] = 90 + 67 - 115 + 163 ^ 63 + 126 - 23 + 32;
        MiningInfoBox.var1[14] = 0xF1 ^ 0x97 ^ (0x47 ^ 0x2D);
    }

    private static boolean var32(int n2) {
        return n2 != 0;
    }

    @Inject
    private MiningInfoBox(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig, T t2) {
        this.l = squireMiner;
        this.m = squireMiner.getManager();
        this.n = squireMinerConfig;
        this.o = t2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private void a(Graphics2D graphics2D) {
        Object[] objectArray = new Object[var1[3]];
        objectArray[MiningInfoBox.var1[0]] = this.o.C();
        objectArray[MiningInfoBox.var1[1]] = this.o.N();
        objectArray[MiningInfoBox.var1[2]] = this.o.M();
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(String.format(var2[var1[8]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(String.valueOf(this.o.H())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(String.valueOf(this.o.O())).build());
        0;
    }
}

