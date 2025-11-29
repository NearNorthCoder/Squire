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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j;
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
    private final /* synthetic */ SquireGauntlet bg;
    private static /* synthetic */ String[] llIlIIIIIllI;
    private final /* synthetic */ c bi;
    private static /* synthetic */ int[] llIlIIIIlllI;
    private static final /* synthetic */ int bl;
    private final /* synthetic */ SquireGauntlet bj;
    private final /* synthetic */ GauntletConfig bh;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ String bf;

    private static String lIIIIIIIllIIIlI(String var27, String var30) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var14 = var30.toCharArray();
        int var20 = llIlIIIIlllI[3];
        char[] var16 = var27.toCharArray();
        int var29 = var16.length;
        int var7 = llIlIIIIlllI[3];
        while (GauntletInfoBox.lIIIIIIlIIIIIll(var7, var29)) {
            char var28 = var16[var7];
            var1.append((char)(var28 ^ var14[var20 % var14.length]));
            0;
            ++var20;
            ++var7;
            0;
            if (3 < (0xA0 ^ 0xB1 ^ (0x8E ^ 0x9B))) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIIIIIIIllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIIIIIII(int n2) {
        return n2 <= 0;
    }

    private static String lIIIIIIIllIIIIl(String var23, String var10) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llIlIIIIlllI[13]), "DES");
            Cipher var33 = Cipher.getInstance("DES");
            var33.init(llIlIIIIlllI[5], var6);
            return new String(var33.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var5;
        int n2;
        GauntletInfoBox var15;
        if (GauntletInfoBox.lIIIIIIIllllIll(this.bj.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        if (GauntletInfoBox.lIIIIIIIllllIll(var15.bh.corruptedMode() ? 1 : 0)) {
            n2 = llIlIIIIlllI[0];
            0;
            if (-(0x96 ^ 0x85 ^ (0xAA ^ 0xBC)) >= 0) {
                return null;
            }
        } else {
            n2 = llIlIIIIlllI[1];
        }
        int var21 = n2;
        String var17 = var15.n(var15.bg.i() * var21);
        Duration var3 = Duration.between(var15.bj.getStarted(), Instant.now()).minus(var15.bj.l(), ChronoUnit.MILLIS);
        var15.panelComponent.setBorder(new Rectangle(llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2]));
        Object var9 = llIlIIIIIllI[llIlIIIIlllI[3]];
        if (GauntletInfoBox.lIIIIIIIllllIll(SquireGauntlet.g() ? 1 : 0)) {
            var9 = (String)var9 + " (paused)";
        }
        var15.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text((String)var9).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[4]]).right(llIlIIIIIllI[llIlIIIIlllI[5]]).build());
        0;
        d var32 = var15.bi.W();
        int var8 = llIlIIIIlllI[6];
        var15.panelComponent.setPreferredSize(new Dimension(var8 + llIlIIIIlllI[7], llIlIIIIlllI[3]));
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[8]]).right(var32.toString()).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[9]]).right(var15.bj.getManager().getCurrentTask()).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[10]]).right(Time.format((Duration)var3)).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[11]]).right(var15.bj.i() + "/" + var15.bj.j()).build());
        0;
        if (GauntletInfoBox.lIIIIIIIlllllII(var17) && GauntletInfoBox.lIIIIIIIlllllIl(var17.equals(llIlIIIIIllI[llIlIIIIlllI[12]]) ? 1 : 0)) {
            var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[13]]).right(var17).build());
            0;
        }
        if (!GauntletInfoBox.lIIIIIIIllllIll(var15.bi.A() ? 1 : 0) || !GauntletInfoBox.lIIIIIIIllllllI(Game.getState(), GameState.LOADING) || GauntletInfoBox.lIIIIIIIlllllll(var15.bi.V())) {
            return super.render((Graphics2D)var5);
        }
        if (GauntletInfoBox.lIIIIIIIllllIll(var15.bi.A() ? 1 : 0) && GauntletInfoBox.lIIIIIIIllllllI(Game.getState(), GameState.LOADING)) {
            Object var25;
            j var4 = var15.bi.X();
            if (GauntletInfoBox.lIIIIIIIlllllII(var4)) {
                var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[14]]).right(String.valueOf(var4.aH())).build());
                0;
                var25 = var4.aD();
                if (GauntletInfoBox.lIIIIIIIlllllII(var25)) {
                    var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[2]]).right(var4.aE()).build());
                    0;
                }
            }
            if (GauntletInfoBox.lIIIIIIIlllllIl(var15.bi.h().showDebugInfoboxAll() ? 1 : 0)) {
                return super.render((Graphics2D)var5);
            }
            var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[15]]).right(String.valueOf(var15.bi.V().av().bb())).build());
            0;
            if (GauntletInfoBox.lIIIIIIIllllllI((Object)var15.bi.W(), (Object)d.BOSS_FIGHT)) {
                Object var24;
                var15.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[16]]).build());
                0;
                var25 = var15.bi.E().entrySet().iterator();
                while (GauntletInfoBox.lIIIIIIIllllIll(var25.hasNext() ? 1 : 0)) {
                    var24 = (Map.Entry)var25.next();
                    int var11 = (Integer)var24.getValue();
                    if (GauntletInfoBox.lIIIIIIlIIIIIII(var11)) {
                        0;
                        if (3 != 0) continue;
                        return null;
                    }
                    var15.panelComponent.getChildren().add(LineComponent.builder().left(((i)((Object)var24.getKey())).toString()).right(Integer.toString(var11)).build());
                    0;
                    0;
                    if ((0xC2 ^ 0xC6) >= (0xA ^ 0xE)) continue;
                    return null;
                }
                var15.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[17]]).build());
                0;
                var25 = new StringBuilder();
                var24 = var15.bi.P().iterator();
                while (GauntletInfoBox.lIIIIIIIllllIll(var24.hasNext() ? 1 : 0)) {
                    f var11 = (f)((Object)var24.next());
                    ((StringBuilder)var25).append(var11.name()).append(llIlIIIIIllI[llIlIIIIlllI[18]]);
                    0;
                    0;
                    if (3 > 0) continue;
                    return null;
                }
                var15.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[19]]).right(String.valueOf(var25)).build());
                0;
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

    private static void lIIIIIIIllllIlI() {
        llIlIIIIlllI = new int[26];
        GauntletInfoBox.llIlIIIIlllI[0] = -(0xFFFF8F6B & 0x74B6) & (0xFFFFDFEF & 0xAFDBB);
        GauntletInfoBox.llIlIIIIlllI[1] = 0xFFFFD42F & 0x3FFD3;
        GauntletInfoBox.llIlIIIIlllI[2] = 0x4E ^ 0x44;
        GauntletInfoBox.llIlIIIIlllI[3] = (0x7D ^ 0x79) & ~(0x64 ^ 0x60);
        GauntletInfoBox.llIlIIIIlllI[4] = 1;
        GauntletInfoBox.llIlIIIIlllI[5] = 2;
        GauntletInfoBox.llIlIIIIlllI[6] = 0xFFFFB3D7 & 0x4D2A;
        GauntletInfoBox.llIlIIIIlllI[7] = 0xD ^ 0x19;
        GauntletInfoBox.llIlIIIIlllI[8] = 3;
        GauntletInfoBox.llIlIIIIlllI[9] = 0x8C ^ 0xBD ^ (0x5C ^ 0x69);
        GauntletInfoBox.llIlIIIIlllI[10] = 24 + 160 - 150 + 133 ^ 22 + 84 - 3 + 59;
        GauntletInfoBox.llIlIIIIlllI[11] = 79 + 71 - 28 + 56 ^ 9 + 20 - -7 + 144;
        GauntletInfoBox.llIlIIIIlllI[12] = 0x7E ^ 0x52 ^ (0x71 ^ 0x5A);
        GauntletInfoBox.llIlIIIIlllI[13] = 0xB0 ^ 0xB8;
        GauntletInfoBox.llIlIIIIlllI[14] = 86 + 67 - 27 + 1 ^ (0x44 ^ 0x32);
        GauntletInfoBox.llIlIIIIlllI[15] = 106 + 81 - 66 + 41 ^ 70 + 36 - -36 + 27;
        GauntletInfoBox.llIlIIIIlllI[16] = 52 + 53 - 63 + 110 ^ 85 + 7 - 6 + 62;
        GauntletInfoBox.llIlIIIIlllI[17] = 0xF1 ^ 0xBC ^ (0x7A ^ 0x3A);
        GauntletInfoBox.llIlIIIIlllI[18] = 0x9C ^ 0x92;
        GauntletInfoBox.llIlIIIIlllI[19] = 0x4E ^ 0x41;
        GauntletInfoBox.llIlIIIIlllI[20] = 0x96 ^ 0x86;
        GauntletInfoBox.llIlIIIIlllI[21] = 0x28 ^ 0x39;
        GauntletInfoBox.llIlIIIIlllI[22] = 0x2A ^ 0x12 ^ (0x54 ^ 0x7E);
        GauntletInfoBox.llIlIIIIlllI[23] = 0x82 ^ 0x91;
        GauntletInfoBox.llIlIIIIlllI[24] = 0xA7 ^ 0xB2;
        GauntletInfoBox.llIlIIIIlllI[25] = 0 ^ 0x16;
    }

    private static boolean lIIIIIIIlllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIlllllll(Object object) {
        return object == null;
    }

    private static void lIIIIIIIllIIIll() {
        llIlIIIIIllI = new String[llIlIIIIlllI[25]];
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[3]] = GauntletInfoBox."Squire Gauntlet";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[4]] = GauntletInfoBox."Version";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[5]] = GauntletInfoBox."1.1.9";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[8]] = GauntletInfoBox."Stage";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[9]] = GauntletInfoBox."Performing Task";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[10]] = GauntletInfoBox."Runtime";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[11]] = GauntletInfoBox."Kills/deaths";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[12]] = GauntletInfoBox."0";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[13]] = GauntletInfoBox."Est. GP/H";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[14]] = GauntletInfoBox."Hunllef Phase:";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[2]] = GauntletInfoBox."Hunleff Prayer";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[15]] = GauntletInfoBox."Fish in spawn";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[16]] = GauntletInfoBox."------------------------------------";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[17]] = GauntletInfoBox."------------------------------------";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[18]] = GauntletInfoBox."\n";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[19]] = GauntletInfoBox."Crafting";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[20]] = GauntletInfoBox."%.0fK";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[21]] = GauntletInfoBox."%.0fK";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[22]] = GauntletInfoBox."%.1fK";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[23]] = GauntletInfoBox."%.0f";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[7]] = GauntletInfoBox."%.1f";
        GauntletInfoBox.llIlIIIIIllI[GauntletInfoBox.llIlIIIIlllI[24]] = GauntletInfoBox."------------------------------------";
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
        double var22;
        if (GauntletInfoBox.lIIIIIIlIIIIIlI(GauntletInfoBox.lIIIIIIlIIIIIIl(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = d3;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[20]], objectArray);
        }
        if (GauntletInfoBox.lIIIIIIlIIIIIlI(GauntletInfoBox.lIIIIIIlIIIIIIl(var22, 1000.0))) {
            double var31 = var22 / 1000.0;
            if (GauntletInfoBox.lIIIIIIIlllllIl(GauntletInfoBox.lIIIIIIlIIIIIIl(var31 % 1.0, 0.0))) {
                Object[] objectArray = new Object[llIlIIIIlllI[4]];
                objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = var31;
                return String.format(llIlIIIIIllI[llIlIIIIlllI[21]], objectArray);
            }
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = var31;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[22]], objectArray);
        }
        if (GauntletInfoBox.lIIIIIIIlllllIl(GauntletInfoBox.lIIIIIIlIIIIIIl(var22 % 1.0, 0.0))) {
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = var22;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[23]], objectArray);
        }
        Object[] objectArray = new Object[llIlIIIIlllI[4]];
        objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = d2;
        return String.format(llIlIIIIIllI[llIlIIIIlllI[7]], objectArray);
    }

    private static boolean lIIIIIIlIIIIIlI(int n2) {
        return n2 >= 0;
    }

    private static String lIIIIIIIllIIIII(String var13, String var18) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIlIIIIlllI[5], var19);
            return new String(var2.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
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

