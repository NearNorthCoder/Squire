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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.c;

public class BarrowsInfoBox
extends OverlayPanel {
    private final /* synthetic */ int B = 77566;
    private final /* synthetic */ SquireBarrows y;
    private final /* synthetic */ TaskManager z;
    private final /* synthetic */ c A;
    private static /* synthetic */ int[] llllIIIlIIl;
    private static /* synthetic */ String[] lllIllllllI;

    private static int lIllIIllIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    static {
        BarrowsInfoBox.lIllIIllIllllI();
        BarrowsInfoBox.lIllIIlIlllIII();
    }

    private static void lIllIIlIlllIII() {
        lllIllllllI = new String[llllIIIlIIl[22]];
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[1]] = BarrowsInfoBox.lIllIIlIlIllll("ZkJbFB0=", "ClkrV");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[2]] = BarrowsInfoBox.lIllIIlIlIllll("UE10KCU=", "ucDNn");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[3]] = BarrowsInfoBox.lIllIIlIllIIII("nYTFj2G/xcQ=", "HWeAf");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[4]] = BarrowsInfoBox.lIllIIlIllIIII("xe3Pd5KqDuE=", "JRQkp");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[5]] = BarrowsInfoBox.lIllIIlIlIllll("andeCA==", "OYonS");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[7]] = BarrowsInfoBox.lIllIIlIlIllll("GgcBLB4sVjYkHjsZAzY=", "IvtEl");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[8]] = BarrowsInfoBox.lIllIIlIlIllll("NC80IwcLPw==", "fZZWn");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[9]] = BarrowsInfoBox.lIllIIlIllIIII("QgEd5XXg+1M=", "HpSNk");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[10]] = BarrowsInfoBox.lIllIIlIlIllll("VUxSVmM=", "dbaxR");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[11]] = BarrowsInfoBox.lIllIIlIllIllI("+QMGB11sdgU=", "tSXsf");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[6]] = BarrowsInfoBox.lIllIIlIllIIII("fcTXhGyjQG3mba/k1Jt1/ByEqh05Z57O", "KLtcR");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[12]] = BarrowsInfoBox.lIllIIlIllIllI("A8Gy/72YLao=", "kTOjk");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[13]] = BarrowsInfoBox.lIllIIlIllIIII("5mTJrfuIuuBOQpIZQEnvvg==", "DlhIr");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[14]] = BarrowsInfoBox.lIllIIlIllIIII("CbhSeawiDtCSRbL6oogy2g==", "mczxx");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[15]] = BarrowsInfoBox.lIllIIlIllIllI("EguyN1DnOQCv4Xkh4qylvQ==", "UkKPP");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[16]] = BarrowsInfoBox.lIllIIlIlIllll("TSVaS3QMbhJK", "hAzcQ");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[17]] = BarrowsInfoBox.lIllIIlIllIllI("tjG+C8J8q8mU307nWOKoBQ==", "cgLpi");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[18]] = BarrowsInfoBox.lIllIIlIllIllI("9Qa7ONCnDQ/vvwBgF5rw1w==", "UAabg");
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[19]] = BarrowsInfoBox.lIllIIlIlIllll("AiElJwA1aSk+DTgkajEENDo+aA==", "QIJRl");
    }

    @Inject
    private BarrowsInfoBox(SquireBarrows squireBarrows, c c2) {
        this.B = llllIIIlIIl[0];
        this.y = squireBarrows;
        this.z = squireBarrows.getManager();
        this.A = c2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private String f(int n2) {
        double d2 = this.e(n2);
        return BarrowsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double llllllllllllllllIIIlllIllIlllIII;
        if (BarrowsInfoBox.lIllIIlllIIIII(BarrowsInfoBox.lIllIIllIlllll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = d3;
            return String.format(lllIllllllI[llllIIIlIIl[1]], objectArray);
        }
        if (BarrowsInfoBox.lIllIIlllIIIII(BarrowsInfoBox.lIllIIllIlllll(llllllllllllllllIIIlllIllIlllIII, 1000.0))) {
            double llllllllllllllllIIIlllIllIllIlll = llllllllllllllllIIIlllIllIlllIII / 1000.0;
            if (BarrowsInfoBox.lIllIIlllIIIIl(BarrowsInfoBox.lIllIIllIlllll(llllllllllllllllIIIlllIllIllIlll % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllIIIlIIl[2]];
                objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = llllllllllllllllIIIlllIllIllIlll;
                return String.format(lllIllllllI[llllIIIlIIl[2]], objectArray);
            }
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = llllllllllllllllIIIlllIllIllIlll;
            return String.format(lllIllllllI[llllIIIlIIl[3]], objectArray);
        }
        if (BarrowsInfoBox.lIllIIlllIIIIl(BarrowsInfoBox.lIllIIllIlllll(llllllllllllllllIIIlllIllIlllIII % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = llllllllllllllllIIIlllIllIlllIII;
            return String.format(lllIllllllI[llllIIIlIIl[4]], objectArray);
        }
        Object[] objectArray = new Object[llllIIIlIIl[2]];
        objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = d2;
        return String.format(lllIllllllI[llllIIIlIIl[5]], objectArray);
    }

    private static boolean lIllIIlllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIllIllllI() {
        llllIIIlIIl = new int[23];
        BarrowsInfoBox.llllIIIlIIl[0] = 0xFFFFBFFE & 0x16EFF;
        BarrowsInfoBox.llllIIIlIIl[1] = (0x6C ^ 0x34) & ~(0 ^ 0x58);
        BarrowsInfoBox.llllIIIlIIl[2] = " ".length();
        BarrowsInfoBox.llllIIIlIIl[3] = "  ".length();
        BarrowsInfoBox.llllIIIlIIl[4] = "   ".length();
        BarrowsInfoBox.llllIIIlIIl[5] = 0x65 ^ 0x6A ^ (0x40 ^ 0x4B);
        BarrowsInfoBox.llllIIIlIIl[6] = 0x6E ^ 0x64;
        BarrowsInfoBox.llllIIIlIIl[7] = 0x60 ^ 0x65;
        BarrowsInfoBox.llllIIIlIIl[8] = 0x1A ^ 0x37 ^ (0xA5 ^ 0x8E);
        BarrowsInfoBox.llllIIIlIIl[9] = 0x2C ^ 6 ^ (0x3F ^ 0x12);
        BarrowsInfoBox.llllIIIlIIl[10] = 0x75 ^ 0x7D;
        BarrowsInfoBox.llllIIIlIIl[11] = 70 + 153 - 105 + 52 ^ 51 + 35 - 83 + 160;
        BarrowsInfoBox.llllIIIlIIl[12] = 0x1E ^ 0x3F ^ (0xEB ^ 0xC1);
        BarrowsInfoBox.llllIIIlIIl[13] = 0x3E ^ 0x32;
        BarrowsInfoBox.llllIIIlIIl[14] = 0x27 ^ 0x2A;
        BarrowsInfoBox.llllIIIlIIl[15] = 0x32 ^ 0x3C;
        BarrowsInfoBox.llllIIIlIIl[16] = 81 + 29 - -33 + 36 ^ 127 + 27 - 144 + 178;
        BarrowsInfoBox.llllIIIlIIl[17] = 0x2D ^ 0x5F ^ (0x21 ^ 0x43);
        BarrowsInfoBox.llllIIIlIIl[18] = 122 + 66 - 39 + 28 ^ 71 + 16 - -46 + 27;
        BarrowsInfoBox.llllIIIlIIl[19] = 2 + 63 - 64 + 142 ^ 50 + 56 - 64 + 115;
        BarrowsInfoBox.llllIIIlIIl[20] = 0xFFFFABB3 & 0x554E;
        BarrowsInfoBox.llllIIIlIIl[21] = 0xA6 ^ 0xB2;
        BarrowsInfoBox.llllIIIlIIl[22] = 0x45 ^ 0x56;
    }

    private static String lIllIIlIllIllI(String llllllllllllllllIIIlllIlIlllIllI, String llllllllllllllllIIIlllIlIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIl[10]), "DES");
            Cipher llllllllllllllllIIIlllIlIllllIII = Cipher.getInstance("DES");
            llllllllllllllllIIIlllIlIllllIII.init(llllIIIlIIl[3], llllllllllllllllIIIlllIlIllllIIl);
            return new String(llllllllllllllllIIIlllIlIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIlIlllIlll) {
            llllllllllllllllIIIlllIlIlllIlll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIllIIII(String llllllllllllllllIIIlllIllIIIIIIl, String llllllllllllllllIIIlllIllIIIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIllIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIllIIIIlIl.init(llllIIIlIIl[3], llllllllllllllllIIIlllIllIIIIllI);
            return new String(llllllllllllllllIIIlllIllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIllIIIIlII) {
            llllllllllllllllIIIlllIllIIIIlII.printStackTrace();
            return null;
        }
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.lIllIIlllIIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public double e(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.lIllIIlllIIIIl(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static String lIllIIlIlIllll(String llllllllllllllllIIIlllIllIIllIII, String llllllllllllllllIIIlllIllIIlIlll) {
        llllllllllllllllIIIlllIllIIllIII = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIllIIlIllI = new StringBuilder();
        char[] llllllllllllllllIIIlllIllIIlIlIl = llllllllllllllllIIIlllIllIIlIlll.toCharArray();
        int llllllllllllllllIIIlllIllIIlIlII = llllIIIlIIl[1];
        char[] llllllllllllllllIIIlllIllIIIlllI = llllllllllllllllIIIlllIllIIllIII.toCharArray();
        int llllllllllllllllIIIlllIllIIIllIl = llllllllllllllllIIIlllIllIIIlllI.length;
        int llllllllllllllllIIIlllIllIIIllII = llllIIIlIIl[1];
        while (BarrowsInfoBox.lIllIIlllIIIll(llllllllllllllllIIIlllIllIIIllII, llllllllllllllllIIIlllIllIIIllIl)) {
            char llllllllllllllllIIIlllIllIIllIIl = llllllllllllllllIIIlllIllIIIlllI[llllllllllllllllIIIlllIllIIIllII];
            llllllllllllllllIIIlllIllIIlIllI.append((char)(llllllllllllllllIIIlllIllIIllIIl ^ llllllllllllllllIIIlllIllIIlIlIl[llllllllllllllllIIIlllIllIIlIlII % llllllllllllllllIIIlllIllIIlIlIl.length]));
            "".length();
            ++llllllllllllllllIIIlllIllIIlIlII;
            ++llllllllllllllllIIIlllIllIIIllII;
            "".length();
            if (((92 + 76 - 14 + 16 ^ 35 + 95 - 12 + 59) & (0x74 ^ 7 ^ (0xF ^ 0x67) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIlllIllIIlIllI);
    }

    private static boolean lIllIIlllIIIlI(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BarrowsInfoBox.lIllIIlllIIIlI(this.y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllllllI[llllIIIlIIl[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[8]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[9]]).right(lllIllllllI[llllIIIlIIl[10]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[11]]).right(this.z.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[6]]).right(String.valueOf(this.A.d())).build());
        "".length();
        Object[] objectArray = new Object[llllIIIlIIl[3]];
        objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = this.y.w();
        objectArray[BarrowsInfoBox.llllIIIlIIl[2]] = this.d(this.y.w());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[12]]).right(String.format(lllIllllllI[llllIIIlIIl[13]], objectArray)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[14]]).right(this.f(this.y.w() * llllIIIlIIl[0])).build());
        "".length();
        Object[] objectArray2 = new Object[llllIIIlIIl[3]];
        objectArray2[BarrowsInfoBox.llllIIIlIIl[1]] = this.y.x();
        objectArray2[BarrowsInfoBox.llllIIIlIIl[2]] = this.d(this.y.x());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[15]]).right(String.format(lllIllllllI[llllIIIlIIl[16]], objectArray2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[17]]).right(String.valueOf(this.y.v())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[18]]).right(String.valueOf(this.y.u())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[19]]).right(String.valueOf(this.y.g())).build());
        "".length();
        int n2 = llllIIIlIIl[20];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIIIlIIl[21], llllIIIlIIl[1]));
        return super.render(graphics2D);
    }
}

