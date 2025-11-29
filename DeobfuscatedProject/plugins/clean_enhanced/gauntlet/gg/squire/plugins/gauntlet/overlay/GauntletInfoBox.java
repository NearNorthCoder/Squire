/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 */
package gg.squire.plugins.gauntlet.overlay;

import com.google.inject.Inject;
import gg.squire.plugins.gauntlet.GauntletConfig;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import gg.squire.plugins.gauntlet.overlay.GauntletManager;
import gg.squire.plugins.gauntlet.overlay.GameEnum4;
import gg.squire.plugins.gauntlet.overlay.GameEnum5;
import gg.squire.plugins.gauntlet.overlay.GameEnum;
import gg.squire.plugins.gauntlet.overlay.GauntletManager;
import net.runelite.api.GameState;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;

public class GauntletInfoBox
extends OverlayPanel {
    private final  SquireGauntlet bg;
    
    private final  c bi;
    
    private static final  int bl;
    private final  SquireGauntlet bj;
    private final  GauntletConfig bh;
    private static final  int bk;
    private static final  String bf;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[3];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[3];
        while (GauntletInfoBox.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 < (0xA0 ^ 0xB1 ^ (0x8E ^ 0x9B))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var15(int n2) {
        return n2 <= 0;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var22;
        int n2;
        GauntletInfoBox var23;
        if (GauntletInfoBox.var14(this.bj.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        if (GauntletInfoBox.var14(var23.bh.corruptedMode() ? 1 : 0)) {
            n2 = var2[0];
            0;
            if (-(0x96 ^ 0x85 ^ (0xAA ^ 0xBC)) >= 0) {
                return null;
            }
        } else {
            n2 = var2[1];
        }
        int var24 = n2;
        String var25 = var23.n(var23.bg.i() * var24);
        Duration var26 = Duration.between(var23.bj.getStarted(), Instant.now()).minus(var23.bj.l(), ChronoUnit.MILLIS);
        var23.panelComponent.setBorder(new Rectangle(var2[2], var2[2], var2[2], var2[2]));
        Object var27 = var1[var2[3]];
        if (GauntletInfoBox.var14(SquireGauntlet.g() ? 1 : 0)) {
            var27 = (String)var27 + " (paused)";
        }
        var23.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text((String)var27).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(var1[var2[5]]).build());
        0;
        d var28 = var23.bi.W();
        int var29 = var2[6];
        var23.panelComponent.setPreferredSize(new Dimension(var29 + var2[7], var2[3]));
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(var28.toString()).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[9]]).right(var23.bj.getManager().getCurrentTask()).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[10]]).right(Time.format((Duration)var26)).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[11]]).right(var23.bj.i() + "/" + var23.bj.j()).build());
        0;
        if (GauntletInfoBox.var30(var25) && GauntletInfoBox.var31(var25.equals(var1[var2[12]]) ? 1 : 0)) {
            var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[13]]).right(var25).build());
            0;
        }
        if (!GauntletInfoBox.var14(var23.bi.A() ? 1 : 0) || !GauntletInfoBox.var32(Game.getState(), GameState.LOADING) || GauntletInfoBox.var33(var23.bi.V())) {
            return super.render((Graphics2D)var22);
        }
        if (GauntletInfoBox.var14(var23.bi.A() ? 1 : 0) && GauntletInfoBox.var32(Game.getState(), GameState.LOADING)) {
            Object var34;
            j var35 = var23.bi.X();
            if (GauntletInfoBox.var30(var35)) {
                var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[14]]).right(String.valueOf(var35.aH())).build());
                0;
                var34 = var35.aD();
                if (GauntletInfoBox.var30(var34)) {
                    var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(var35.aE()).build());
                    0;
                }
            }
            if (GauntletInfoBox.var31(var23.bi.h().showDebugInfoboxAll() ? 1 : 0)) {
                return super.render((Graphics2D)var22);
            }
            var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[15]]).right(String.valueOf(var23.bi.V().av().bb())).build());
            0;
            if (GauntletInfoBox.var32((Object)var23.bi.W(), (Object)d.BOSS_FIGHT)) {
                Object var36;
                var23.panelComponent.getChildren().add(TitleComponent.builder().text(var1[var2[16]]).build());
                0;
                var34 = var23.bi.E().entrySet().iterator();
                while (GauntletInfoBox.var14(var34.hasNext() ? 1 : 0)) {
                    var36 = (Map.Entry)var34.next();
                    int var37 = (Integer)var36.getValue();
                    if (GauntletInfoBox.var15(var37)) {
                        0;
                        if (3 != 0) continue;
                        return null;
                    }
                    var23.panelComponent.getChildren().add(LineComponent.builder().left(((i)((Object)var36.getKey())).toString()).right(Integer.toString(var37)).build());
                    0;
                    0;
                    if ((0xC2 ^ 0xC6) >= (0xA ^ 0xE)) continue;
                    return null;
                }
                var23.panelComponent.getChildren().add(TitleComponent.builder().text(var1[var2[17]]).build());
                0;
                var34 = new StringBuilder();
                var36 = var23.bi.P().iterator();
                while (GauntletInfoBox.var14(var36.hasNext() ? 1 : 0)) {
                    f var37 = (f)((Object)var36.next());
                    ((StringBuilder)var34).append(var37.name()).append(var1[var2[18]]);
                    0;
                    0;
                    if (3 > 0) continue;
                    return null;
                }
                var23.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[19]]).right(String.valueOf(var34)).build());
                0;
            }
        }
        return super.render(graphics2D);
    }

    private static boolean var32(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var38() {
        var2 = new int[26];
        GauntletInfoBox.var2[0] = -(0xFFFF8F6B & 0x74B6) & (0xFFFFDFEF & 0xAFDBB);
        GauntletInfoBox.var2[1] = 0xFFFFD42F & 0x3FFD3;
        GauntletInfoBox.var2[2] = 0x4E ^ 0x44;
        GauntletInfoBox.var2[3] = (0x7D ^ 0x79) & ~(0x64 ^ 0x60);
        GauntletInfoBox.var2[4] = 1;
        GauntletInfoBox.var2[5] = 2;
        GauntletInfoBox.var2[6] = 0xFFFFB3D7 & 0x4D2A;
        GauntletInfoBox.var2[7] = 0xD ^ 0x19;
        GauntletInfoBox.var2[8] = 3;
        GauntletInfoBox.var2[9] = 0x8C ^ 0xBD ^ (0x5C ^ 0x69);
        GauntletInfoBox.var2[10] = 24 + 160 - 150 + 133 ^ 22 + 84 - 3 + 59;
        GauntletInfoBox.var2[11] = 79 + 71 - 28 + 56 ^ 9 + 20 - -7 + 144;
        GauntletInfoBox.var2[12] = 0x7E ^ 0x52 ^ (0x71 ^ 0x5A);
        GauntletInfoBox.var2[13] = 0xB0 ^ 0xB8;
        GauntletInfoBox.var2[14] = 86 + 67 - 27 + 1 ^ (0x44 ^ 0x32);
        GauntletInfoBox.var2[15] = 106 + 81 - 66 + 41 ^ 70 + 36 - -36 + 27;
        GauntletInfoBox.var2[16] = 52 + 53 - 63 + 110 ^ 85 + 7 - 6 + 62;
        GauntletInfoBox.var2[17] = 0xF1 ^ 0xBC ^ (0x7A ^ 0x3A);
        GauntletInfoBox.var2[18] = 0x9C ^ 0x92;
        GauntletInfoBox.var2[19] = 0x4E ^ 0x41;
        GauntletInfoBox.var2[20] = 0x96 ^ 0x86;
        GauntletInfoBox.var2[21] = 0x28 ^ 0x39;
        GauntletInfoBox.var2[22] = 0x2A ^ 0x12 ^ (0x54 ^ 0x7E);
        GauntletInfoBox.var2[23] = 0x82 ^ 0x91;
        GauntletInfoBox.var2[24] = 0xA7 ^ 0xB2;
        GauntletInfoBox.var2[25] = 0 ^ 0x16;
    }

    private static boolean var31(int n2) {
        return n2 == 0;
    }

    private static boolean var33(Object object) {
        return object == null;
    }

    private static void var39() {
        var1 = new String[var2[25]];
        GauntletInfoBox.var1[GauntletInfoBox.var2[3]] = "Squire Gauntlet";
        GauntletInfoBox.var1[GauntletInfoBox.var2[4]] = "Version";
        GauntletInfoBox.var1[GauntletInfoBox.var2[5]] = "1.1.9";
        GauntletInfoBox.var1[GauntletInfoBox.var2[8]] = "Stage";
        GauntletInfoBox.var1[GauntletInfoBox.var2[9]] = "Performing Task";
        GauntletInfoBox.var1[GauntletInfoBox.var2[10]] = "Runtime";
        GauntletInfoBox.var1[GauntletInfoBox.var2[11]] = "Kills/deaths";
        GauntletInfoBox.var1[GauntletInfoBox.var2[12]] = "0";
        GauntletInfoBox.var1[GauntletInfoBox.var2[13]] = "Est. GP/H";
        GauntletInfoBox.var1[GauntletInfoBox.var2[14]] = "Hunllef Phase:";
        GauntletInfoBox.var1[GauntletInfoBox.var2[2]] = "Hunleff Prayer";
        GauntletInfoBox.var1[GauntletInfoBox.var2[15]] = "Fish in spawn";
        GauntletInfoBox.var1[GauntletInfoBox.var2[16]] = "------------------------------------";
        GauntletInfoBox.var1[GauntletInfoBox.var2[17]] = "------------------------------------";
        GauntletInfoBox.var1[GauntletInfoBox.var2[18]] = "\n";
        GauntletInfoBox.var1[GauntletInfoBox.var2[19]] = "Crafting";
        GauntletInfoBox.var1[GauntletInfoBox.var2[20]] = "%.0fK";
        GauntletInfoBox.var1[GauntletInfoBox.var2[21]] = "%.0fK";
        GauntletInfoBox.var1[GauntletInfoBox.var2[22]] = "%.1fK";
        GauntletInfoBox.var1[GauntletInfoBox.var2[23]] = "%.0f";
        GauntletInfoBox.var1[GauntletInfoBox.var2[7]] = "%.1f";
        GauntletInfoBox.var1[GauntletInfoBox.var2[24]] = "------------------------------------";
    }

    private static boolean var30(Object object) {
        return object != null;
    }

    @Inject
    private GauntletInfoBox(SquireGauntlet squireGauntlet, GauntletConfig gauntletConfig, c c2, SquireGauntlet squireGauntlet2) {
        this.bg = squireGauntlet;
        this.bh = gauntletConfig;
        this.bi = c2;
        this.bj = squireGauntlet2;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static int var40(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public static String b(double d2) {
        double var41;
        if (GauntletInfoBox.var42(GauntletInfoBox.var40(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[var2[4]];
            objectArray[GauntletInfoBox.var2[3]] = d3;
            return String.format(var1[var2[20]], objectArray);
        }
        if (GauntletInfoBox.var42(GauntletInfoBox.var40(var41, 1000.0))) {
            double var43 = var41 / 1000.0;
            if (GauntletInfoBox.var31(GauntletInfoBox.var40(var43 % 1.0, 0.0))) {
                Object[] objectArray = new Object[var2[4]];
                objectArray[GauntletInfoBox.var2[3]] = var43;
                return String.format(var1[var2[21]], objectArray);
            }
            Object[] objectArray = new Object[var2[4]];
            objectArray[GauntletInfoBox.var2[3]] = var43;
            return String.format(var1[var2[22]], objectArray);
        }
        if (GauntletInfoBox.var31(GauntletInfoBox.var40(var41 % 1.0, 0.0))) {
            Object[] objectArray = new Object[var2[4]];
            objectArray[GauntletInfoBox.var2[3]] = var41;
            return String.format(var1[var2[23]], objectArray);
        }
        Object[] objectArray = new Object[var2[4]];
        objectArray[GauntletInfoBox.var2[3]] = d2;
        return String.format(var1[var2[7]], objectArray);
    }

    private static boolean var42(int n2) {
        return n2 >= 0;
    }

        catch (Exception var49) {
            var49.printStackTrace();
            return null;
        }
    }

    public double m(int n2) {
        Duration duration = Duration.between(this.bg.getStarted(), Instant.now());
        if (GauntletInfoBox.var31(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private String n(int n2) {
        double d2 = this.m(n2);
        return GauntletInfoBox.b(d2);
    }

    static {
        GauntletInfoBox.var38();
        GauntletInfoBox.var39();
        bk = var2[1];
        bl = var2[0];
        bf = var1[var2[24]];
    }
}

