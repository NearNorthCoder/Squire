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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.plugins.gauntlet.overlay.GauntletManager;
import gg.squire.plugins.gauntlet.overlay.GameEnum38;
import gg.squire.plugins.gauntlet.overlay.GameEnum39;
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

        return String.valueOf(var1);
    }

    private static boolean lIIIIIIIllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIIIIIII(int n2) {
        return n2 <= 0;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var2;
        int n2;
        GauntletInfoBox var3;
        if (GauntletInfoBox.lIIIIIIIllllIll(this.bj.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        if (GauntletInfoBox.lIIIIIIIllllIll(var3.bh.corruptedMode() ? 1 : 0)) {
            n2 = llIlIIIIlllI[0];

            if (-(0x96 ^ 0x85 ^ (0xAA ^ 0xBC)) >= 0) {
                return null;
            }
        } else {
            n2 = llIlIIIIlllI[1];
        }
        int var4 = n2;
        String var5 = var3.n(var3.bg.i() * var4);
        Duration var6 = Duration.between(var3.bj.getStarted(), Instant.now()).minus(var3.bj.l(), ChronoUnit.MILLIS);
        var3.panelComponent.setBorder(new Rectangle(llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2]));
        Object var7 = llIlIIIIIllI[llIlIIIIlllI[3]];
        if (GauntletInfoBox.lIIIIIIIllllIll(SquireGauntlet.g() ? 1 : 0)) {
            var7 = (String)var7 + " (paused)";
        }
        var3.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text((String)var7).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[4]]).right(llIlIIIIIllI[llIlIIIIlllI[5]]).build());

        d var8 = var3.bi.W();
        int var9 = llIlIIIIlllI[6];
        var3.panelComponent.setPreferredSize(new Dimension(var9 + llIlIIIIlllI[7], llIlIIIIlllI[3]));
        var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[8]]).right(var8.toString()).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[9]]).right(var3.bj.getManager().getCurrentTask()).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[10]]).right(Time.format((Duration)var6)).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[11]]).right(var3.bj.i() + "/" + var3.bj.j()).build());

        if (GauntletInfoBox.lIIIIIIIlllllII(var5) && GauntletInfoBox.lIIIIIIIlllllIl(var5.equals(llIlIIIIIllI[llIlIIIIlllI[12]]) ? 1 : 0)) {
            var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[13]]).right(var5).build());

        }
        if (!GauntletInfoBox.lIIIIIIIllllIll(var3.bi.A() ? 1 : 0) || !GauntletInfoBox.lIIIIIIIllllllI(Game.getState(), GameState.LOADING) || GauntletInfoBox.lIIIIIIIlllllll(var3.bi.V())) {
            return super.render((Graphics2D)var2);
        }
        if (GauntletInfoBox.lIIIIIIIllllIll(var3.bi.A() ? 1 : 0) && GauntletInfoBox.lIIIIIIIllllllI(Game.getState(), GameState.LOADING)) {
            Object var10;
            j var11 = var3.bi.X();
            if (GauntletInfoBox.lIIIIIIIlllllII(var11)) {
                var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[14]]).right(String.valueOf(var11.aH())).build());

                var10 = var11.aD();
                if (GauntletInfoBox.lIIIIIIIlllllII(var10)) {
                    var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[2]]).right(var11.aE()).build());

                }
            }
            if (GauntletInfoBox.lIIIIIIIlllllIl(var3.bi.h().showDebugInfoboxAll() ? 1 : 0)) {
                return super.render((Graphics2D)var2);
            }
            var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[15]]).right(String.valueOf(var3.bi.V().av().bb())).build());

            if (GauntletInfoBox.lIIIIIIIllllllI((Object)var3.bi.W(), (Object)d.BOSS_FIGHT)) {
                Object var12;
                var3.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[16]]).build());

                var10 = var3.bi.E().entrySet().iterator();
                while (GauntletInfoBox.lIIIIIIIllllIll(var10.hasNext() ? 1 : 0)) {
                    var12 = (Map.Entry)var10.next();
                    int var13 = (Integer)var12.getValue();
                    if (GauntletInfoBox.lIIIIIIlIIIIIII(var13)) {

                        if (3 != 0) continue;
                        return null;
                    }
                    var3.panelComponent.getChildren().add(LineComponent.builder().left(((i)((Object)var12.getKey())).toString()).right(Integer.toString(var13)).build());

                    if ((0xC2 ^ 0xC6) >= (0xA ^ 0xE)) continue;
                    return null;
                }
                var3.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[17]]).build());

                var10 = new StringBuilder();
                var12 = var3.bi.P().iterator();
                while (GauntletInfoBox.lIIIIIIIllllIll(var12.hasNext() ? 1 : 0)) {
                    f var13 = (f)((Object)var12.next());
                    ((StringBuilder)var10).append(var13.name()).append(llIlIIIIIllI[llIlIIIIlllI[18]]);

                    if (3 > 0) continue;
                    return null;
                }
                var3.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[19]]).right(String.valueOf(var10)).build());

            }
        }
        return super.render(graphics2D);
    }

    private static boolean lIIIIIIIllllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIlIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIlllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIlllllll(Object object) {
        return object == null;
    }

    private static void lIIIIIIIllIIIll() {
        llIlIIIIIllI = new String[llIlIIIIlllI[25]];
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[3]] = "Squire Gauntlet";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[4]] = "Version";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[5]] = "1.1.9";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[8]] = "Stage";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[9]] = "Performing Task";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[10]] = "Runtime";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[11]] = "Kills/deaths";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[12]] = "0";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[13]] = "Est. GP/H";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[14]] = "Hunllef Phase:";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[2]] = "Hunleff Prayer";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[15]] = "Fish in spawn";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[16]] = "------------------------------------";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[17]] = "------------------------------------";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[18]] = "\n";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[19]] = "Crafting";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[20]] = "%.0fK";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[21]] = "%.0fK";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[22]] = "%.1fK";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[23]] = "%.0f";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[7]] = "%.1f";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[24]] = "------------------------------------";
    }

    private static boolean lIIIIIIIlllllII(Object object) {
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

    private static int lIIIIIIlIIIIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public static String b(double d2) {
        double var14;
        if (GauntletInfoBox.lIIIIIIlIIIIIlI(GauntletInfoBox.lIIIIIIlIIIIIIl(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = d3;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[20]], objectArray);
        }
        if (GauntletInfoBox.lIIIIIIlIIIIIlI(GauntletInfoBox.lIIIIIIlIIIIIIl(var14, 1000.0))) {
            double var15 = var14 / 1000.0;
            if (GauntletInfoBox.lIIIIIIIlllllIl(GauntletInfoBox.lIIIIIIlIIIIIIl(var15 % 1.0, 0.0))) {
                Object[] objectArray = new Object[llIlIIIIlllI[4]];
                objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = var15;
                return String.format(llIlIIIIIllI[llIlIIIIlllI[21]], objectArray);
            }
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = var15;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[22]], objectArray);
        }
        if (GauntletInfoBox.lIIIIIIIlllllIl(GauntletInfoBox.lIIIIIIlIIIIIIl(var14 % 1.0, 0.0))) {
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = var14;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[23]], objectArray);
        }
        Object[] objectArray = new Object[llIlIIIIlllI[4]];
        objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = d2;
        return String.format(llIlIIIIIllI[llIlIIIIlllI[7]], objectArray);
    }

    private static boolean lIIIIIIlIIIIIlI(int n2) {
        return n2 >= 0;
    }

    public double m(int n2) {
        Duration duration = Duration.between(this.bg.getStarted(), Instant.now());
        if (GauntletInfoBox.lIIIIIIIlllllIl(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private String n(int n2) {
        double d2 = this.m(n2);
        return GauntletInfoBox.b(d2);
    }

    static {
        GauntletInfoBox.lIIIIIIIllllIlI();
        GauntletInfoBox.lIIIIIIIllIIIll();
        bk = llIlIIIIlllI[1];
        bl = llIlIIIIlllI[0];
        bf = llIlIIIIIllI[llIlIIIIlllI[24]];
    }
}

