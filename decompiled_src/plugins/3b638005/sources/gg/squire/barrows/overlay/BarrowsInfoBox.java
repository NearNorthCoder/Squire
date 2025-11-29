package gg.squire.barrows.overlay;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.TaskManager;
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
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.c;
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:gg/squire/barrows/overlay/BarrowsInfoBox.class */
public class BarrowsInfoBox extends OverlayPanel {
    private final /* synthetic */ int B = llllIIIlIIl[0];
    private final /* synthetic */ SquireBarrows y;
    private final /* synthetic */ TaskManager z;
    private final /* synthetic */ c A;
    private static /* synthetic */ int[] llllIIIlIIl;
    private static /* synthetic */ String[] lllIllllllI;

    private static int lIllIIllIlllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIllIIllIllllI();
        lIllIIlIlllIII();
    }

    private static void lIllIIlIlllIII() {
        lllIllllllI = new String[llllIIIlIIl[22]];
        lllIllllllI[llllIIIlIIl[1]] = lIllIIlIlIllll("ZkJbFB0=", "ClkrV");
        lllIllllllI[llllIIIlIIl[2]] = lIllIIlIlIllll("UE10KCU=", "ucDNn");
        lllIllllllI[llllIIIlIIl[3]] = lIllIIlIllIIII("nYTFj2G/xcQ=", "HWeAf");
        lllIllllllI[llllIIIlIIl[4]] = lIllIIlIllIIII("xe3Pd5KqDuE=", "JRQkp");
        lllIllllllI[llllIIIlIIl[5]] = lIllIIlIlIllll("andeCA==", "OYonS");
        lllIllllllI[llllIIIlIIl[7]] = lIllIIlIlIllll("GgcBLB4sVjYkHjsZAzY=", "IvtEl");
        lllIllllllI[llllIIIlIIl[8]] = lIllIIlIlIllll("NC80IwcLPw==", "fZZWn");
        lllIllllllI[llllIIIlIIl[9]] = lIllIIlIllIIII("QgEd5XXg+1M=", "HpSNk");
        lllIllllllI[llllIIIlIIl[10]] = lIllIIlIlIllll("VUxSVmM=", "dbaxR");
        lllIllllllI[llllIIIlIIl[11]] = lIllIIlIllIllI("+QMGB11sdgU=", "tSXsf");
        lllIllllllI[llllIIIlIIl[6]] = lIllIIlIllIIII("fcTXhGyjQG3mba/k1Jt1/ByEqh05Z57O", "KLtcR");
        lllIllllllI[llllIIIlIIl[12]] = lIllIIlIllIllI("A8Gy/72YLao=", "kTOjk");
        lllIllllllI[llllIIIlIIl[13]] = lIllIIlIllIIII("5mTJrfuIuuBOQpIZQEnvvg==", "DlhIr");
        lllIllllllI[llllIIIlIIl[14]] = lIllIIlIllIIII("CbhSeawiDtCSRbL6oogy2g==", "mczxx");
        lllIllllllI[llllIIIlIIl[15]] = lIllIIlIllIllI("EguyN1DnOQCv4Xkh4qylvQ==", "UkKPP");
        lllIllllllI[llllIIIlIIl[16]] = lIllIIlIlIllll("TSVaS3QMbhJK", "hAzcQ");
        lllIllllllI[llllIIIlIIl[17]] = lIllIIlIllIllI("tjG+C8J8q8mU307nWOKoBQ==", "cgLpi");
        lllIllllllI[llllIIIlIIl[18]] = lIllIIlIllIllI("9Qa7ONCnDQ/vvwBgF5rw1w==", "UAabg");
        lllIllllllI[llllIIIlIIl[19]] = lIllIIlIlIllll("AiElJwA1aSk+DTgkajEENDo+aA==", "QIJRl");
    }

    @Inject
    private BarrowsInfoBox(SquireBarrows squireBarrows, c cVar) {
        this.y = squireBarrows;
        this.z = squireBarrows.getManager();
        this.A = cVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIlllIIIII(int i) {
        return i >= 0;
    }

    private String f(int i) {
        return a(e(i));
    }

    public static String a(double llllllllllllllllIIIlllIllIlllIII) {
        if (lIllIIlllIIIII(lIllIIllIlllll(llllllllllllllllIIIlllIllIlllIII, 1000000.0d))) {
            String str = lllIllllllI[llllIIIlIIl[1]];
            Object[] objArr = new Object[llllIIIlIIl[2]];
            objArr[llllIIIlIIl[1]] = Double.valueOf(llllllllllllllllIIIlllIllIlllIII / 1000.0d);
            return String.format(str, objArr);
        } else if (!lIllIIlllIIIII(lIllIIllIlllll(llllllllllllllllIIIlllIllIlllIII, 1000.0d))) {
            if (lIllIIlllIIIIl(lIllIIllIlllll(llllllllllllllllIIIlllIllIlllIII % 1.0d, 0.0d))) {
                String str2 = lllIllllllI[llllIIIlIIl[4]];
                Object[] objArr2 = new Object[llllIIIlIIl[2]];
                objArr2[llllIIIlIIl[1]] = Double.valueOf(llllllllllllllllIIIlllIllIlllIII);
                return String.format(str2, objArr2);
            }
            String str3 = lllIllllllI[llllIIIlIIl[5]];
            Object[] objArr3 = new Object[llllIIIlIIl[2]];
            objArr3[llllIIIlIIl[1]] = Double.valueOf(llllllllllllllllIIIlllIllIlllIII);
            return String.format(str3, objArr3);
        } else {
            double d = llllllllllllllllIIIlllIllIlllIII / 1000.0d;
            if (lIllIIlllIIIIl(lIllIIllIlllll(d % 1.0d, 0.0d))) {
                String str4 = lllIllllllI[llllIIIlIIl[2]];
                Object[] objArr4 = new Object[llllIIIlIIl[2]];
                objArr4[llllIIIlIIl[1]] = Double.valueOf(d);
                return String.format(str4, objArr4);
            }
            String str5 = lllIllllllI[llllIIIlIIl[3]];
            Object[] objArr5 = new Object[llllIIIlIIl[2]];
            objArr5[llllIIIlIIl[1]] = Double.valueOf(d);
            return String.format(str5, objArr5);
        }
    }

    private static boolean lIllIIlllIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIlllIIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIllIllllI() {
        llllIIIlIIl = new int[23];
        llllIIIlIIl[0] = (-16386) & 93951;
        llllIIIlIIl[1] = (108 ^ 52) & ((0 ^ 88) ^ (-1));
        llllIIIlIIl[2] = " ".length();
        llllIIIlIIl[3] = "  ".length();
        llllIIIlIIl[4] = "   ".length();
        llllIIIlIIl[5] = (101 ^ 106) ^ (64 ^ 75);
        llllIIIlIIl[6] = 110 ^ 100;
        llllIIIlIIl[7] = 96 ^ 101;
        llllIIIlIIl[8] = (26 ^ 55) ^ (165 ^ 142);
        llllIIIlIIl[9] = (44 ^ 6) ^ (63 ^ 18);
        llllIIIlIIl[10] = 117 ^ 125;
        llllIIIlIIl[11] = (((70 + 153) - 105) + 52) ^ (((51 + 35) - 83) + 160);
        llllIIIlIIl[12] = (30 ^ 63) ^ (235 ^ 193);
        llllIIIlIIl[13] = 62 ^ 50;
        llllIIIlIIl[14] = 39 ^ 42;
        llllIIIlIIl[15] = 50 ^ 60;
        llllIIIlIIl[16] = (((81 + 29) - (-33)) + 36) ^ (((127 + 27) - 144) + 178);
        llllIIIlIIl[17] = (45 ^ 95) ^ (33 ^ 67);
        llllIIIlIIl[18] = (((122 + 66) - 39) + 28) ^ (((71 + 16) - (-46)) + 27);
        llllIIIlIIl[19] = (((2 + 63) - 64) + 142) ^ (((50 + 56) - 64) + 115);
        llllIIIlIIl[20] = (-21581) & 21838;
        llllIIIlIIl[21] = 166 ^ 178;
        llllIIIlIIl[22] = 69 ^ 86;
    }

    private static String lIllIIlIllIllI(String llllllllllllllllIIIlllIlIlllIllI, String llllllllllllllllIIIlllIlIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlIIl[3], llllllllllllllllIIIlllIlIllllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIlIlllIlll) {
            llllllllllllllllIIIlllIlIlllIlll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIllIIII(String llllllllllllllllIIIlllIllIIIIIll, String llllllllllllllllIIIlllIllIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlIIl[3], llllllllllllllllIIIlllIllIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIllIIIIlII) {
            llllllllllllllllIIIlllIllIIIIlII.printStackTrace();
            return null;
        }
    }

    public long d(int i) {
        Duration between = Duration.between(this.y.getStarted(), Instant.now());
        if (lIllIIlllIIIIl(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    public double e(int i) {
        Duration between = Duration.between(this.y.getStarted(), Instant.now());
        if (lIllIIlllIIIIl(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static String lIllIIlIlIllll(String llllllllllllllllIIIlllIllIIllIII, String llllllllllllllllIIIlllIllIIlIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIIlllIllIIlIlIl = llllllllllllllllIIIlllIllIIlIIlI.toCharArray();
        int llllllllllllllllIIIlllIllIIlIlII = llllIIIlIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIIlIIl[1];
        while (lIllIIlllIIIll(i, length)) {
            char llllllllllllllllIIIlllIllIIllIIl = charArray[i];
            sb.append((char) (llllllllllllllllIIIlllIllIIllIIl ^ llllllllllllllllIIIlllIllIIlIlIl[llllllllllllllllIIIlllIllIIlIlII % llllllllllllllllIIIlllIllIIlIlIl.length]));
            "".length();
            llllllllllllllllIIIlllIllIIlIlII++;
            i++;
            "".length();
            if ((((((92 + 76) - 14) + 16) ^ (((35 + 95) - 12) + 59)) & (((116 ^ 7) ^ (15 ^ 103)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlllIIIlI(int i) {
        return i != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIllIIlllIIIlI(this.y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.y.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllllllI[llllIIIlIIl[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[8]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[9]]).right(lllIllllllI[llllIIIlIIl[10]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[11]]).right(this.z.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[6]]).right(String.valueOf(this.A.d())).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lllIllllllI[llllIIIlIIl[12]]);
        String str = lllIllllllI[llllIIIlIIl[13]];
        Object[] objArr = new Object[llllIIIlIIl[3]];
        objArr[llllIIIlIIl[1]] = Integer.valueOf(this.y.w());
        objArr[llllIIIlIIl[2]] = Long.valueOf(d(this.y.w()));
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[14]]).right(f(this.y.w() * llllIIIlIIl[0])).build());
        "".length();
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lllIllllllI[llllIIIlIIl[15]]);
        String str2 = lllIllllllI[llllIIIlIIl[16]];
        Object[] objArr2 = new Object[llllIIIlIIl[3]];
        objArr2[llllIIIlIIl[1]] = Integer.valueOf(this.y.x());
        objArr2[llllIIIlIIl[2]] = Long.valueOf(d(this.y.x()));
        children2.add(left2.right(String.format(str2, objArr2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[17]]).right(String.valueOf(this.y.v())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[18]]).right(String.valueOf(this.y.u())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[19]]).right(String.valueOf(this.y.g())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llllIIIlIIl[20] + llllIIIlIIl[21], llllIIIlIIl[1]));
        return super.render(graphics2D);
    }
}
