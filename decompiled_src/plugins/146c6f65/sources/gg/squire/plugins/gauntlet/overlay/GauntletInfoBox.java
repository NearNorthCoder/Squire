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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0002c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0009j;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.EnumC0003d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.EnumC0005f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.EnumC0008i;
import net.runelite.api.GameState;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:gg/squire/plugins/gauntlet/overlay/GauntletInfoBox.class */
public class GauntletInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireGauntlet bg;
    private static /* synthetic */ String[] llIlIIIIIllI;
    private final /* synthetic */ C0002c bi;
    private static /* synthetic */ int[] llIlIIIIlllI;
    private static final /* synthetic */ int bl;
    private final /* synthetic */ SquireGauntlet bj;
    private final /* synthetic */ GauntletConfig bh;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ String bf;

    private static String lIIIIIIIllIIIlI(String lllllllllllllllIlIIIllIlIlIIllIl, String lllllllllllllllIlIIIllIlIlIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIlIlIIlIll = new StringBuilder();
        char[] lllllllllllllllIlIIIllIlIlIIlIlI = lllllllllllllllIlIIIllIlIlIIllII.toCharArray();
        int lllllllllllllllIlIIIllIlIlIIlIIl = llIlIIIIlllI[3];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIIIIlllI[3];
        while (lIIIIIIlIIIIIll(i, length)) {
            lllllllllllllllIlIIIllIlIlIIlIll.append((char) (charArray[i] ^ lllllllllllllllIlIIIllIlIlIIlIlI[lllllllllllllllIlIIIllIlIlIIlIIl % lllllllllllllllIlIIIllIlIlIIlIlI.length]));
            "".length();
            lllllllllllllllIlIIIllIlIlIIlIIl++;
            i++;
            "".length();
            if ("   ".length() >= ((160 ^ 177) ^ (142 ^ 155))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIllIlIlIIlIll);
    }

    private static boolean lIIIIIIIllllIll(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIlIIIIIII(int i) {
        return i <= 0;
    }

    private static String lIIIIIIIllIIIIl(String lllllllllllllllIlIIIllIlIIlllIII, String lllllllllllllllIlIIIllIlIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlIIllIlll.getBytes(StandardCharsets.UTF_8)), llIlIIIIlllI[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIIlllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIlIIlllIIl) {
            lllllllllllllllIlIIIllIlIIlllIIl.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        int i;
        if (lIIIIIIIllllIll(this.bj.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        if (lIIIIIIIllllIll(this.bh.corruptedMode() ? 1 : 0)) {
            i = llIlIIIIlllI[0];
            "".length();
            if ((-((150 ^ 133) ^ (170 ^ 188))) >= 0) {
                return null;
            }
        } else {
            i = llIlIIIIlllI[1];
        }
        int lllllllllllllllIlIIIllIlIllIlIll = i;
        String n2 = n(this.bg.i() * lllllllllllllllIlIIIllIlIllIlIll);
        Duration minus = Duration.between(this.bj.getStarted(), Instant.now()).minus(this.bj.l(), ChronoUnit.MILLIS);
        this.panelComponent.setBorder(new Rectangle(llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2], llIlIIIIlllI[2]));
        String str = llIlIIIIIllI[llIlIIIIlllI[3]];
        if (lIIIIIIIllllIll(SquireGauntlet.g() ? 1 : 0)) {
            str = str + " (paused)";
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(str).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[4]]).right(llIlIIIIIllI[llIlIIIIlllI[5]]).build());
        "".length();
        EnumC0003d W = this.bi.W();
        int lllllllllllllllIlIIIllIlIllIIllI = llIlIIIIlllI[6];
        this.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIlIIIllIlIllIIllI + llIlIIIIlllI[7], llIlIIIIlllI[3]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[8]]).right(W.toString()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[9]]).right(this.bj.getManager().getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[10]]).right(Time.format(minus)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[11]]).right(this.bj.i() + "/" + this.bj.j()).build());
        "".length();
        if (lIIIIIIIlllllII(n2) && lIIIIIIIlllllIl(n2.equals(llIlIIIIIllI[llIlIIIIlllI[12]]) ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[13]]).right(n2).build());
            "".length();
        }
        if (lIIIIIIIllllIll(this.bi.A() ? 1 : 0) && lIIIIIIIllllllI(Game.getState(), GameState.LOADING) && !lIIIIIIIlllllll(this.bi.V())) {
            if (lIIIIIIIllllIll(this.bi.A() ? 1 : 0) && lIIIIIIIllllllI(Game.getState(), GameState.LOADING)) {
                C0009j X = this.bi.X();
                if (lIIIIIIIlllllII(X)) {
                    this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[14]]).right(String.valueOf(X.aH())).build());
                    "".length();
                    if (lIIIIIIIlllllII(X.aD())) {
                        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[2]]).right(X.aE()).build());
                        "".length();
                    }
                }
                if (lIIIIIIIlllllIl(this.bi.h().showDebugInfoboxAll() ? 1 : 0)) {
                    return super.render(graphics2D);
                }
                this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[15]]).right(String.valueOf(this.bi.V().av().bb())).build());
                "".length();
                if (lIIIIIIIllllllI(this.bi.W(), EnumC0003d.BOSS_FIGHT)) {
                    this.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[16]]).build());
                    "".length();
                    for (Map.Entry<EnumC0008i, Integer> entry : this.bi.E().entrySet()) {
                        int intValue = entry.getValue().intValue();
                        if (lIIIIIIlIIIIIII(intValue)) {
                            "".length();
                            if ("   ".length() == 0) {
                                return null;
                            }
                        } else {
                            this.panelComponent.getChildren().add(LineComponent.builder().left(entry.getKey().toString()).right(Integer.toString(intValue)).build());
                            "".length();
                            "".length();
                            if ((194 ^ 198) < (10 ^ 14)) {
                                return null;
                            }
                        }
                    }
                    this.panelComponent.getChildren().add(TitleComponent.builder().text(llIlIIIIIllI[llIlIIIIlllI[17]]).build());
                    "".length();
                    StringBuilder sb = new StringBuilder();
                    for (EnumC0005f enumC0005f : this.bi.P()) {
                        sb.append(enumC0005f.name()).append(llIlIIIIIllI[llIlIIIIlllI[18]]);
                        "".length();
                        "".length();
                        if ("   ".length() <= 0) {
                            return null;
                        }
                    }
                    this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIIIllI[llIlIIIIlllI[19]]).right(String.valueOf(sb)).build());
                    "".length();
                }
            }
            return super.render(graphics2D);
        }
        return super.render(graphics2D);
    }

    private static boolean lIIIIIIIllllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIIIIlIIIIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIIIllllIlI() {
        llIlIIIIlllI = new int[26];
        llIlIIIIlllI[0] = (-((-28821) & 29878)) & (-8209) & 720315;
        llIlIIIIlllI[1] = (-11217) & 262099;
        llIlIIIIlllI[2] = 78 ^ 68;
        llIlIIIIlllI[3] = (125 ^ 121) & ((100 ^ 96) ^ (-1));
        llIlIIIIlllI[4] = " ".length();
        llIlIIIIlllI[5] = "  ".length();
        llIlIIIIlllI[6] = (-19497) & 19754;
        llIlIIIIlllI[7] = 13 ^ 25;
        llIlIIIIlllI[8] = "   ".length();
        llIlIIIIlllI[9] = (140 ^ 189) ^ (92 ^ 105);
        llIlIIIIlllI[10] = (((24 + 160) - 150) + 133) ^ (((22 + 84) - 3) + 59);
        llIlIIIIlllI[11] = (((79 + 71) - 28) + 56) ^ (((9 + 20) - (-7)) + 144);
        llIlIIIIlllI[12] = (126 ^ 82) ^ (113 ^ 90);
        llIlIIIIlllI[13] = 176 ^ 184;
        llIlIIIIlllI[14] = (((86 + 67) - 27) + 1) ^ (68 ^ 50);
        llIlIIIIlllI[15] = (((106 + 81) - 66) + 41) ^ (((70 + 36) - (-36)) + 27);
        llIlIIIIlllI[16] = (((52 + 53) - 63) + 110) ^ (((85 + 7) - 6) + 62);
        llIlIIIIlllI[17] = (241 ^ 188) ^ (122 ^ 58);
        llIlIIIIlllI[18] = 156 ^ 146;
        llIlIIIIlllI[19] = 78 ^ 65;
        llIlIIIIlllI[20] = 150 ^ 134;
        llIlIIIIlllI[21] = 40 ^ 57;
        llIlIIIIlllI[22] = (42 ^ 18) ^ (84 ^ 126);
        llIlIIIIlllI[23] = 130 ^ 145;
        llIlIIIIlllI[24] = 167 ^ 178;
        llIlIIIIlllI[25] = 0 ^ 22;
    }

    private static boolean lIIIIIIIlllllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIIIIIlllllll(Object obj) {
        return obj == null;
    }

    private static void lIIIIIIIllIIIll() {
        llIlIIIIIllI = new String[llIlIIIIlllI[25]];
        llIlIIIIIllI[llIlIIIIlllI[3]] = lIIIIIIIllIIIII("9SottZtbbDNSTBMeJIoHiQ==", "SsFMS");
        llIlIIIIIllI[llIlIIIIlllI[4]] = lIIIIIIIllIIIII("pMTjLNTPYQo=", "gXoZZ");
        llIlIIIIIllI[llIlIIIIlllI[5]] = lIIIIIIIllIIIIl("ENseggSWNMQ=", "ugFYV");
        llIlIIIIIllI[llIlIIIIlllI[8]] = lIIIIIIIllIIIlI("EAA5Mi8=", "CtXUJ");
        llIlIIIIIllI[llIlIIIIlllI[9]] = lIIIIIIIllIIIIl("Y9uj3ZLQxcLb6BZIPNvvQw==", "sVgxh");
        llIlIIIIIllI[llIlIIIIlllI[10]] = lIIIIIIIllIIIlI("JDcgPywbJw==", "vBNKE");
        llIlIIIIIllI[llIlIIIIlllI[11]] = lIIIIIIIllIIIII("K9yMUw+4z3wjwRw01U0zAQ==", "CrsBv");
        llIlIIIIIllI[llIlIIIIlllI[12]] = lIIIIIIIllIIIIl("srHUwQ98q7c=", "nlSbk");
        llIlIIIIIllI[llIlIIIIlllI[13]] = lIIIIIIIllIIIII("2cENYs6xgN7y5yI/tBC5Zg==", "xECVT");
        llIlIIIIIllI[llIlIIIIlllI[14]] = lIIIIIIIllIIIlI("BQEIOSooEkYFLiwHA28=", "MtfUF");
        llIlIIIIIllI[llIlIIIIlllI[2]] = lIIIIIIIllIIIIl("Rdn+rbJRwc4d7zQ2c2HQAg==", "KIiOH");
        llIlIIIIIllI[llIlIIIIlllI[15]] = lIIIIIIIllIIIIl("6TBJc3grQ5F/wNfNqKEqWQ==", "QWjaU");
        llIlIIIIIllI[llIlIIIIlllI[16]] = lIIIIIIIllIIIIl("6RMMdj8jvC7pEwx2PyO8LukTDHY/I7wu6RMMdj8jvC7jon/WRjOrow==", "civql");
        llIlIIIIIllI[llIlIIIIlllI[17]] = lIIIIIIIllIIIII("4wwNubBxNJzjDA25sHE0nOMMDbmwcTSc4wwNubBxNJwq4b+69Rz+LQ==", "Vpvjg");
        llIlIIIIIllI[llIlIIIIlllI[18]] = lIIIIIIIllIIIIl("67K96cs0lF0=", "nMxtT");
        llIlIIIIIllI[llIlIIIIlllI[19]] = lIIIIIIIllIIIIl("+u8wU8szQadO98kHjY7cWw==", "rhNbx");
        llIlIIIIIllI[llIlIIIIlllI[20]] = lIIIIIIIllIIIII("nFphHB0clxI=", "DhhKl");
        llIlIIIIIllI[llIlIIIIlllI[21]] = lIIIIIIIllIIIII("y3zFqq/pMYQ=", "BNhxu");
        llIlIIIIIllI[llIlIIIIlllI[22]] = lIIIIIIIllIIIII("BH1jhdrb0ME=", "IDIuC");
        llIlIIIIIllI[llIlIIIIlllI[23]] = lIIIIIIIllIIIIl("7D+Nre2w7d8=", "LbrKs");
        llIlIIIIIllI[llIlIIIIlllI[7]] = lIIIIIIIllIIIII("qsjX3NeFBaM=", "MEMrc");
        llIlIIIIIllI[llIlIIIIlllI[24]] = lIIIIIIIllIIIIl("yYtYW2LuZ4fJi1hbYu5nh8mLWFti7meHyYtYW2LuZ4fb/gESn3okVg==", "EZHzl");
    }

    private static boolean lIIIIIIIlllllII(Object obj) {
        return obj != null;
    }

    @Inject
    private GauntletInfoBox(SquireGauntlet squireGauntlet, GauntletConfig gauntletConfig, C0002c c0002c, SquireGauntlet squireGauntlet2) {
        this.bg = squireGauntlet;
        this.bh = gauntletConfig;
        this.bi = c0002c;
        this.bj = squireGauntlet2;
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static int lIIIIIIlIIIIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static String b(double d) {
        if (lIIIIIIlIIIIIlI(lIIIIIIlIIIIIIl(d, 1000000.0d))) {
            String str = llIlIIIIIllI[llIlIIIIlllI[20]];
            Object[] objArr = new Object[llIlIIIIlllI[4]];
            objArr[llIlIIIIlllI[3]] = Double.valueOf(d / 1000.0d);
            return String.format(str, objArr);
        } else if (!lIIIIIIlIIIIIlI(lIIIIIIlIIIIIIl(d, 1000.0d))) {
            if (lIIIIIIIlllllIl(lIIIIIIlIIIIIIl(d % 1.0d, 0.0d))) {
                String str2 = llIlIIIIIllI[llIlIIIIlllI[23]];
                Object[] objArr2 = new Object[llIlIIIIlllI[4]];
                objArr2[llIlIIIIlllI[3]] = Double.valueOf(d);
                return String.format(str2, objArr2);
            }
            String str3 = llIlIIIIIllI[llIlIIIIlllI[7]];
            Object[] objArr3 = new Object[llIlIIIIlllI[4]];
            objArr3[llIlIIIIlllI[3]] = Double.valueOf(d);
            return String.format(str3, objArr3);
        } else {
            double d2 = d / 1000.0d;
            if (lIIIIIIIlllllIl(lIIIIIIlIIIIIIl(d2 % 1.0d, 0.0d))) {
                String str4 = llIlIIIIIllI[llIlIIIIlllI[21]];
                Object[] objArr4 = new Object[llIlIIIIlllI[4]];
                objArr4[llIlIIIIlllI[3]] = Double.valueOf(d2);
                return String.format(str4, objArr4);
            }
            String str5 = llIlIIIIIllI[llIlIIIIlllI[22]];
            Object[] objArr5 = new Object[llIlIIIIlllI[4]];
            objArr5[llIlIIIIlllI[3]] = Double.valueOf(d2);
            return String.format(str5, objArr5);
        }
    }

    private static boolean lIIIIIIlIIIIIlI(int i) {
        return i >= 0;
    }

    private static String lIIIIIIIllIIIII(String lllllllllllllllIlIIIllIlIIlIlIll, String lllllllllllllllIlIIIllIlIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIlIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIlIIlIllIl.init(llIlIIIIlllI[5], secretKeySpec);
            return new String(lllllllllllllllIlIIIllIlIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIlIIlIllII) {
            lllllllllllllllIlIIIllIlIIlIllII.printStackTrace();
            return null;
        }
    }

    public double m(int i) {
        Duration between = Duration.between(this.bg.getStarted(), Instant.now());
        if (lIIIIIIIlllllIl(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private String n(int i) {
        return b(m(i));
    }

    static {
        lIIIIIIIllllIlI();
        lIIIIIIIllIIIll();
        bk = llIlIIIIlllI[1];
        bl = llIlIIIIlllI[0];
        bf = llIlIIIIIllI[llIlIIIIlllI[24]];
    }
}
