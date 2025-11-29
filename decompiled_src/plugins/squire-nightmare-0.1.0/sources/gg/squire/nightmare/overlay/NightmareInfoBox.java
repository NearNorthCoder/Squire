package gg.squire.nightmare.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0013j;
/* loaded from: squire-nightmare-0.1.0.jar:gg/squire/nightmare/overlay/NightmareInfoBox.class */
public class NightmareInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] llllIlllIllI;
    private static /* synthetic */ String[] llllIlllIIll;
    private final /* synthetic */ SquireNightmarePlugin cw;
    private final /* synthetic */ int cy = llllIlllIllI[0];
    private final /* synthetic */ TaskManager cx;

    private String o(int i) {
        return a(n(i));
    }

    private static boolean lIIlIIIlllllIll(int i) {
        return i >= 0;
    }

    @Inject
    private NightmareInfoBox(SquireNightmarePlugin squireNightmarePlugin, C0013j c0013j) {
        this.cw = squireNightmarePlugin;
        this.cx = squireNightmarePlugin.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIlIIIlllllIIl() {
        llllIlllIllI = new int[22];
        llllIlllIllI[0] = (-20545) & 424430;
        llllIlllIllI[1] = (253 ^ 187) & ((211 ^ 149) ^ (-1));
        llllIlllIllI[2] = " ".length();
        llllIlllIllI[3] = "  ".length();
        llllIlllIllI[4] = "   ".length();
        llllIlllIllI[5] = (((95 + 8) - 86) + 122) ^ (((17 + 33) - (-52)) + 41);
        llllIlllIllI[6] = 82 ^ 88;
        llllIlllIllI[7] = 116 ^ 113;
        llllIlllIllI[8] = (((12 + 1) - (-92)) + 48) ^ (((39 + 157) - 188) + 151);
        llllIlllIllI[9] = 98 ^ 101;
        llllIlllIllI[10] = 43 ^ 35;
        llllIlllIllI[11] = (((132 + 29) - 135) + 126) ^ (((138 + 126) - 220) + 101);
        llllIlllIllI[12] = 33 ^ 42;
        llllIlllIllI[13] = 3 ^ 15;
        llllIlllIllI[14] = 82 ^ 95;
        llllIlllIllI[15] = 179 ^ 189;
        llllIlllIllI[16] = 144 ^ 159;
        llllIlllIllI[17] = (6 ^ 67) ^ (15 ^ 90);
        llllIlllIllI[18] = (((68 + 118) - 67) + 14) ^ (((53 + 118) - 100) + 77);
        llllIlllIllI[19] = (-22082) & 22339;
        llllIlllIllI[20] = 88 ^ 76;
        llllIlllIllI[21] = 42 ^ 56;
    }

    static {
        lIIlIIIlllllIIl();
        lIIlIIIlllllIII();
    }

    public static String a(double d) {
        if (lIIlIIIlllllIll(lIIlIIIlllllIlI(d, 1000000.0d))) {
            String str = llllIlllIIll[llllIlllIllI[1]];
            Object[] objArr = new Object[llllIlllIllI[2]];
            objArr[llllIlllIllI[1]] = Double.valueOf(d / 1000.0d);
            return String.format(str, objArr);
        } else if (!lIIlIIIlllllIll(lIIlIIIlllllIlI(d, 1000.0d))) {
            if (lIIlIIIllllllII(lIIlIIIlllllIlI(d % 1.0d, 0.0d))) {
                String str2 = llllIlllIIll[llllIlllIllI[4]];
                Object[] objArr2 = new Object[llllIlllIllI[2]];
                objArr2[llllIlllIllI[1]] = Double.valueOf(d);
                return String.format(str2, objArr2);
            }
            String str3 = llllIlllIIll[llllIlllIllI[5]];
            Object[] objArr3 = new Object[llllIlllIllI[2]];
            objArr3[llllIlllIllI[1]] = Double.valueOf(d);
            return String.format(str3, objArr3);
        } else {
            double d2 = d / 1000.0d;
            if (lIIlIIIllllllII(lIIlIIIlllllIlI(d2 % 1.0d, 0.0d))) {
                String str4 = llllIlllIIll[llllIlllIllI[2]];
                Object[] objArr4 = new Object[llllIlllIllI[2]];
                objArr4[llllIlllIllI[1]] = Double.valueOf(d2);
                return String.format(str4, objArr4);
            }
            String str5 = llllIlllIIll[llllIlllIllI[3]];
            Object[] objArr5 = new Object[llllIlllIllI[2]];
            objArr5[llllIlllIllI[1]] = Double.valueOf(d2);
            return String.format(str5, objArr5);
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        if (lIIlIIIllllllIl(this.cw.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.cw.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllIlllIllI[6], llllIlllIllI[6], llllIlllIllI[6], llllIlllIllI[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlllIIll[llllIlllIllI[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[8]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[9]]).right(llllIlllIIll[llllIlllIllI[10]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[11]]).right(this.cx.getCurrentTask()).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(llllIlllIIll[llllIlllIllI[6]]);
        if (lIIlIIIllllllIl(this.cw.ae() ? 1 : 0)) {
            str = llllIlllIIll[llllIlllIllI[12]];
            "".length();
            if ((-" ".length()) > (((212 ^ 152) ^ (16 ^ 28)) & (((((40 + 92) - (-63)) + 2) ^ (((125 + 18) - 26) + 16)) ^ (-" ".length())))) {
                return null;
            }
        } else {
            str = llllIlllIIll[llllIlllIllI[13]];
        }
        children.add(left.right(str).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[14]]).right(String.valueOf(this.cw.af())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[15]]).right(o(this.cw.af())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[16]]).right(o(this.cw.af() * llllIlllIllI[0])).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[17]]).right(String.valueOf(this.cw.J())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[18]]).right(String.valueOf(this.cw.K())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llllIlllIllI[19] + llllIlllIllI[20], llllIlllIllI[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIIIlllIlllI(String lllllllllllllllIIlIlIllIIIIlllII, String lllllllllllllllIIlIlIllIIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlllIllI[3], lllllllllllllllIIlIlIllIIIIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIIIIlllIl) {
            lllllllllllllllIIlIlIllIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllllllIl(int i) {
        return i != 0;
    }

    private static String lIIlIIIllllIIIl(String lllllllllllllllIIlIlIllIIIlIlIIl, String lllllllllllllllIIlIlIllIIIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), llllIlllIllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlllIllI[3], lllllllllllllllIIlIlIllIIIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIIIlIlIlI) {
            lllllllllllllllIIlIlIllIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static int lIIlIIIlllllIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIIIllllllII(int i) {
        return i == 0;
    }

    public double n(int i) {
        Duration between = Duration.between(this.cw.getStarted(), Instant.now());
        if (lIIlIIIllllllII(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static boolean lIIlIIIlllllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIlllIllll(String lllllllllllllllIIlIlIllIIIIIllII, String lllllllllllllllIIlIlIllIIIIIlIll) {
        String lllllllllllllllIIlIlIllIIIIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIllIIIIIlIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlIllIIIIIlIIl = lllllllllllllllIIlIlIllIIIIIlIll.toCharArray();
        int lllllllllllllllIIlIlIllIIIIIlIII = llllIlllIllI[1];
        char[] charArray = lllllllllllllllIIlIlIllIIIIIllII2.toCharArray();
        int length = charArray.length;
        int i = llllIlllIllI[1];
        while (lIIlIIIlllllllI(i, length)) {
            char lllllllllllllllIIlIlIlIlllllllll = charArray[i];
            lllllllllllllllIIlIlIllIIIIIlIlI.append((char) (lllllllllllllllIIlIlIlIlllllllll ^ lllllllllllllllIIlIlIllIIIIIlIIl[lllllllllllllllIIlIlIllIIIIIlIII % lllllllllllllllIIlIlIllIIIIIlIIl.length]));
            "".length();
            lllllllllllllllIIlIlIllIIIIIlIII++;
            i++;
            "".length();
            if (((((140 + 154) - 216) + 78) ^ (((36 + 14) - 36) + 138)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIllIIIIIlIlI);
    }

    private static void lIIlIIIlllllIII() {
        llllIlllIIll = new String[llllIlllIllI[21]];
        llllIlllIIll[llllIlllIllI[1]] = lIIlIIIlllIlllI("jnjrVFetbqI=", "YOPHo");
        llllIlllIIll[llllIlllIllI[2]] = lIIlIIIlllIllll("XWFJEDg=", "xOyvs");
        llllIlllIIll[llllIlllIllI[3]] = lIIlIIIlllIlllI("PuHb0HY9lyw=", "nnqqJ");
        llllIlllIIll[llllIlllIllI[4]] = lIIlIIIllllIIIl("/R3jroWYJi4=", "jQapV");
        llllIlllIIll[llllIlllIllI[5]] = lIIlIIIllllIIIl("urPn6behN48=", "QzRiU");
        llllIlllIIll[llllIlllIllI[7]] = lIIlIIIllllIIIl("EzJHGGcoPD8V17Gd6XkZdskrfBE9JQxwUf+54p+Ninw=", "GWqoJ");
        llllIlllIIll[llllIlllIllI[8]] = lIIlIIIlllIllll("JiEfADgZMQ==", "tTqtQ");
        llllIlllIIll[llllIlllIllI[9]] = lIIlIIIllllIIIl("kYGHapUwv8U=", "tuVRw");
        llllIlllIIll[llllIlllIllI[10]] = lIIlIIIlllIllll("RU1BQXo=", "vcuoH");
        llllIlllIIll[llllIlllIllI[11]] = lIIlIIIlllIllll("PDUEHlJI", "hTwuh");
        llllIlllIIll[llllIlllIllI[6]] = lIIlIIIlllIllll("BCAjPR0kbmI=", "WTBIh");
        llllIlllIIll[llllIlllIllI[12]] = lIIlIIIlllIlllI("zoRo0hLkbZJCMGwt7ZEwtA==", "OyEsV");
        llllIlllIIll[llllIlllIllI[13]] = lIIlIIIllllIIIl("3NvJeG4KkLA=", "ljiAe");
        llllIlllIIll[llllIlllIllI[14]] = lIIlIIIllllIIIl("V9Pji+XXgCw=", "nWKil");
        llllIlllIIll[llllIlllIllI[15]] = lIIlIIIlllIllll("ORMgHwdSKikBVDoVOQE=", "rzLst");
        llllIlllIIll[llllIlllIllI[16]] = lIIlIIIlllIllll("CRUffnMLNkQY", "LfkPS");
        llllIlllIIll[llllIlllIllI[17]] = lIIlIIIlllIlllI("2LAQnuQ6LFl6Vl4zGm4M4g==", "tPBGU");
        llllIlllIIll[llllIlllIllI[18]] = lIIlIIIllllIIIl("MOy8aT2dYMs=", "gOsmX");
    }
}
