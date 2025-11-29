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

    private static String lIIIIIIIllIIIlI(String lllllllllllllllIlIIIllIlIlIIllIl, String lllllllllllllllIlIIIllIlIlIIllII) {
        lllllllllllllllIlIIIllIlIlIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIlIlIIlIll = new StringBuilder();
        char[] lllllllllllllllIlIIIllIlIlIIlIlI = lllllllllllllllIlIIIllIlIlIIllII.toCharArray();
        int lllllllllllllllIlIIIllIlIlIIlIIl = llIlIIIIlllI[3];
        char[] lllllllllllllllIlIIIllIlIlIIIIll = lllllllllllllllIlIIIllIlIlIIllIl.toCharArray();
        int lllllllllllllllIlIIIllIlIlIIIIlI = lllllllllllllllIlIIIllIlIlIIIIll.length;
        int lllllllllllllllIlIIIllIlIlIIIIIl = llIlIIIIlllI[3];
        while (GauntletInfoBox.lIIIIIIlIIIIIll(lllllllllllllllIlIIIllIlIlIIIIIl, lllllllllllllllIlIIIllIlIlIIIIlI)) {
            char lllllllllllllllIlIIIllIlIlIIlllI = lllllllllllllllIlIIIllIlIlIIIIll[lllllllllllllllIlIIIllIlIlIIIIIl];
            lllllllllllllllIlIIIllIlIlIIlIll.append((char)(lllllllllllllllIlIIIllIlIlIIlllI ^ lllllllllllllllIlIIIllIlIlIIlIlI[lllllllllllllllIlIIIllIlIlIIlIIl % lllllllllllllllIlIIIllIlIlIIlIlI.length]));
            0;
            ++lllllllllllllllIlIIIllIlIlIIlIIl;
            ++lllllllllllllllIlIIIllIlIlIIIIIl;
            0;
            if (3 < (0xA0 ^ 0xB1 ^ (0x8E ^ 0x9B))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllIlIlIIlIll);
    }

    private static boolean lIIIIIIIllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIIIIIII(int n2) {
        return n2 <= 0;
    }

    private static String lIIIIIIIllIIIIl(String lllllllllllllllIlIIIllIlIIllIllI, String lllllllllllllllIlIIIllIlIIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIlIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlIIllIlll.getBytes(StandardCharsets.UTF_8)), llIlIIIIlllI[13]), "DES");
            Cipher lllllllllllllllIlIIIllIlIIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIlIIlllIlI.init(llIlIIIIlllI[5], lllllllllllllllIlIIIllIlIIlllIll);
            return new String(lllllllllllllllIlIIIllIlIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIlIIlllIIl) {
            lllllllllllllllIlIIIllIlIIlllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void lllllllllllllllIlIIIllIlIllIllII;
        int n2;
        GauntletInfoBox lllllllllllllllIlIIIllIlIllIllIl;
        if (GauntletInfoBox.lIIIIIIIllllIll(this.bj.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        if (GauntletInfoBox.lIIIIIIIllllIll(lllllllllllllllIlIIIllIlIllIllIl.bh.corruptedMode() ? 1 : 0)) {
            n2 = llIlIIIIlllI[0];
            0;
            if (-(0x96 ^ 0x85 ^ (0xAA ^ 0xBC)) >= 0) {
                return null;
            }
        } else {
            n2 = llIlIIIIlllI[1];
        }
        int lllllllllllllllIlIIIllIlIllIlIll = n2;
        String lllllllllllllllIlIIIllIlIllIlIlI = lllllllllllllllIlIIIllIlIllIllIl.n(lllllllllllllllIlIIIllIlIllIllIl.bg.i() * lllllllllllllllIlIIIllIlIllIlIll);
        Duration lllllllllllllllIlIIIllIlIllIlIIl = Duration.between(lllllllllllllllIlIIIllIlIllIllIl.bj.getStarted(), Instant.now()).minus(lllllllllllllllIlIIIllIlIllIllIl.bj.l(), ChronoUnit.MILLIS);
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.setBorder(new Rectangle(llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2]));
        Object lllllllllllllllIlIIIllIlIllIlIII = llIlIIIIIllI[llIlIIIIlllI[3]];
        if (GauntletInfoBox.lIIIIIIIllllIll(SquireGauntlet.g() ? 1 : 0)) {
            lllllllllllllllIlIIIllIlIllIlIII = (String)lllllllllllllllIlIIIllIlIllIlIII + " (paused)";
        }
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text((String)lllllllllllllllIlIIIllIlIllIlIII).build());
        0;
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[4]]).right(llIlIIIIIllI[llIlIIIIlllI[5]]).build());
        0;
        d lllllllllllllllIlIIIllIlIllIIlll = lllllllllllllllIlIIIllIlIllIllIl.bi.W();
        int lllllllllllllllIlIIIllIlIllIIllI = llIlIIIIlllI[6];
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIlIIIllIlIllIIllI + llIlIIIIlllI[7], llIlIIIIlllI[3]));
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[8]]).right(lllllllllllllllIlIIIllIlIllIIlll.toString()).build());
        0;
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[9]]).right(lllllllllllllllIlIIIllIlIllIllIl.bj.getManager().getCurrentTask()).build());
        0;
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[10]]).right(Time.format((Duration)lllllllllllllllIlIIIllIlIllIlIIl)).build());
        0;
        lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[11]]).right(lllllllllllllllIlIIIllIlIllIllIl.bj.i() + "/" + lllllllllllllllIlIIIllIlIllIllIl.bj.j()).build());
        0;
        if (GauntletInfoBox.lIIIIIIIlllllII(lllllllllllllllIlIIIllIlIllIlIlI) && GauntletInfoBox.lIIIIIIIlllllIl(lllllllllllllllIlIIIllIlIllIlIlI.equals(llIlIIIIIllI[llIlIIIIlllI[12]]) ? 1 : 0)) {
            lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[13]]).right(lllllllllllllllIlIIIllIlIllIlIlI).build());
            0;
        }
        if (!GauntletInfoBox.lIIIIIIIllllIll(lllllllllllllllIlIIIllIlIllIllIl.bi.A() ? 1 : 0) || !GauntletInfoBox.lIIIIIIIllllllI(Game.getState(), GameState.LOADING) || GauntletInfoBox.lIIIIIIIlllllll(lllllllllllllllIlIIIllIlIllIllIl.bi.V())) {
            return super.render((Graphics2D)lllllllllllllllIlIIIllIlIllIllII);
        }
        if (GauntletInfoBox.lIIIIIIIllllIll(lllllllllllllllIlIIIllIlIllIllIl.bi.A() ? 1 : 0) && GauntletInfoBox.lIIIIIIIllllllI(Game.getState(), GameState.LOADING)) {
            Object lllllllllllllllIlIIIllIlIllIIlII;
            j lllllllllllllllIlIIIllIlIllIIlIl = lllllllllllllllIlIIIllIlIllIllIl.bi.X();
            if (GauntletInfoBox.lIIIIIIIlllllII(lllllllllllllllIlIIIllIlIllIIlIl)) {
                lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[14]]).right(String.valueOf(lllllllllllllllIlIIIllIlIllIIlIl.aH())).build());
                0;
                lllllllllllllllIlIIIllIlIllIIlII = lllllllllllllllIlIIIllIlIllIIlIl.aD();
                if (GauntletInfoBox.lIIIIIIIlllllII(lllllllllllllllIlIIIllIlIllIIlII)) {
                    lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[2]]).right(lllllllllllllllIlIIIllIlIllIIlIl.aE()).build());
                    0;
                }
            }
            if (GauntletInfoBox.lIIIIIIIlllllIl(lllllllllllllllIlIIIllIlIllIllIl.bi.h().showDebugInfoboxAll() ? 1 : 0)) {
                return super.render((Graphics2D)lllllllllllllllIlIIIllIlIllIllII);
            }
            lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[15]]).right(String.valueOf(lllllllllllllllIlIIIllIlIllIllIl.bi.V().av().bb())).build());
            0;
            if (GauntletInfoBox.lIIIIIIIllllllI((Object)lllllllllllllllIlIIIllIlIllIllIl.bi.W(), (Object)d.BOSS_FIGHT)) {
                Object lllllllllllllllIlIIIllIlIllIIIll;
                lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[16]]).build());
                0;
                lllllllllllllllIlIIIllIlIllIIlII = lllllllllllllllIlIIIllIlIllIllIl.bi.E().entrySet().iterator();
                while (GauntletInfoBox.lIIIIIIIllllIll(lllllllllllllllIlIIIllIlIllIIlII.hasNext() ? 1 : 0)) {
                    lllllllllllllllIlIIIllIlIllIIIll = (Map.Entry)lllllllllllllllIlIIIllIlIllIIlII.next();
                    int lllllllllllllllIlIIIllIlIllIIIlI = (Integer)lllllllllllllllIlIIIllIlIllIIIll.getValue();
                    if (GauntletInfoBox.lIIIIIIlIIIIIII(lllllllllllllllIlIIIllIlIllIIIlI)) {
                        0;
                        if (3 != 0) continue;
                        return null;
                    }
                    lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(((i)((Object)lllllllllllllllIlIIIllIlIllIIIll.getKey())).toString()).right(Integer.toString(lllllllllllllllIlIIIllIlIllIIIlI)).build());
                    0;
                    0;
                    if ((0xC2 ^ 0xC6) >= (0xA ^ 0xE)) continue;
                    return null;
                }
                lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[17]]).build());
                0;
                lllllllllllllllIlIIIllIlIllIIlII = new StringBuilder();
                lllllllllllllllIlIIIllIlIllIIIll = lllllllllllllllIlIIIllIlIllIllIl.bi.P().iterator();
                while (GauntletInfoBox.lIIIIIIIllllIll(lllllllllllllllIlIIIllIlIllIIIll.hasNext() ? 1 : 0)) {
                    f lllllllllllllllIlIIIllIlIllIIIlI = (f)((Object)lllllllllllllllIlIIIllIlIllIIIll.next());
                    ((StringBuilder)lllllllllllllllIlIIIllIlIllIIlII).append(lllllllllllllllIlIIIllIlIllIIIlI.name()).append(llIlIIIIIllI[llIlIIIIlllI[18]]);
                    0;
                    0;
                    if (3 > 0) continue;
                    return null;
                }
                lllllllllllllllIlIIIllIlIllIllIl.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[19]]).right(String.valueOf(lllllllllllllllIlIIIllIlIllIIlII)).build());
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
        double lllllllllllllllIlIIIllIlIlIlllll;
        if (GauntletInfoBox.lIIIIIIlIIIIIlI(GauntletInfoBox.lIIIIIIlIIIIIIl(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = d3;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[20]], objectArray);
        }
        if (GauntletInfoBox.lIIIIIIlIIIIIlI(GauntletInfoBox.lIIIIIIlIIIIIIl(lllllllllllllllIlIIIllIlIlIlllll, 1000.0))) {
            double lllllllllllllllIlIIIllIlIlIllllI = lllllllllllllllIlIIIllIlIlIlllll / 1000.0;
            if (GauntletInfoBox.lIIIIIIIlllllIl(GauntletInfoBox.lIIIIIIlIIIIIIl(lllllllllllllllIlIIIllIlIlIllllI % 1.0, 0.0))) {
                Object[] objectArray = new Object[llIlIIIIlllI[4]];
                objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = lllllllllllllllIlIIIllIlIlIllllI;
                return String.format(llIlIIIIIllI[llIlIIIIlllI[21]], objectArray);
            }
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = lllllllllllllllIlIIIllIlIlIllllI;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[22]], objectArray);
        }
        if (GauntletInfoBox.lIIIIIIIlllllIl(GauntletInfoBox.lIIIIIIlIIIIIIl(lllllllllllllllIlIIIllIlIlIlllll % 1.0, 0.0))) {
            Object[] objectArray = new Object[llIlIIIIlllI[4]];
            objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = lllllllllllllllIlIIIllIlIlIlllll;
            return String.format(llIlIIIIIllI[llIlIIIIlllI[23]], objectArray);
        }
        Object[] objectArray = new Object[llIlIIIIlllI[4]];
        objectArray[GauntletInfoBox.llIlIIIIlllI[3]] = d2;
        return String.format(llIlIIIIIllI[llIlIIIIlllI[7]], objectArray);
    }

    private static boolean lIIIIIIlIIIIIlI(int n2) {
        return n2 >= 0;
    }

    private static String lIIIIIIIllIIIII(String lllllllllllllllIlIIIllIlIIlIlIIl, String lllllllllllllllIlIIIllIlIIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIlIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIlIIlIllIl.init(llIlIIIIlllI[5], lllllllllllllllIlIIIllIlIIlIlllI);
            return new String(lllllllllllllllIlIIIllIlIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIlIIlIllII) {
            lllllllllllllllIlIIIllIlIIlIllII.printStackTrace();
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

