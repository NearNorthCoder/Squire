/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.client.Static
 */
package gg.squire.mixology.overlay;

import com.google.inject.Inject;
import gg.squire.mixology.SquireMixology;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class MixologyInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireMixology B;
    private final /* synthetic */ int C = 403886;
    public static /* synthetic */ int D;
    public static /* synthetic */ int E;
    private static /* synthetic */ int[] llllllllIIII;
    private static /* synthetic */ String[] lllllllIllll;
    public static /* synthetic */ int F;

    private static boolean lIIlIlIllIIIIII(int n2) {
        return n2 >= 0;
    }

    private static String lIIlIlIlIllllII(String lllllllllllllllIIlIIIIllllIlIIII, String lllllllllllllllIIlIIIIllllIIlIlI) {
        lllllllllllllllIIlIIIIllllIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIllllIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIIIllllIIllIl = lllllllllllllllIIlIIIIllllIIlIlI.toCharArray();
        int lllllllllllllllIIlIIIIllllIIllII = llllllllIIII[1];
        char[] lllllllllllllllIIlIIIIllllIIIllI = lllllllllllllllIIlIIIIllllIlIIII.toCharArray();
        int lllllllllllllllIIlIIIIllllIIIlIl = lllllllllllllllIIlIIIIllllIIIllI.length;
        int lllllllllllllllIIlIIIIllllIIIlII = llllllllIIII[1];
        while (MixologyInfoBox.lIIlIlIllIIIIll(lllllllllllllllIIlIIIIllllIIIlII, lllllllllllllllIIlIIIIllllIIIlIl)) {
            char lllllllllllllllIIlIIIIllllIlIIIl = lllllllllllllllIIlIIIIllllIIIllI[lllllllllllllllIIlIIIIllllIIIlII];
            lllllllllllllllIIlIIIIllllIIlllI.append((char)(lllllllllllllllIIlIIIIllllIlIIIl ^ lllllllllllllllIIlIIIIllllIIllIl[lllllllllllllllIIlIIIIllllIIllII % lllllllllllllllIIlIIIIllllIIllIl.length]));
            "".length();
            ++lllllllllllllllIIlIIIIllllIIllII;
            ++lllllllllllllllIIlIIIIllllIIIlII;
            "".length();
            if ("  ".length() >= "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIllllIIlllI);
    }

    public double b(int n2) {
        Duration duration = Duration.between(this.B.getStarted(), Instant.now());
        if (MixologyInfoBox.lIIlIlIllIIIIIl(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static void lIIlIlIlIllllIl() {
        lllllllIllll = new String[llllllllIIII[18]];
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[1]] = MixologyInfoBox.lIIlIlIlIlllIlI("5UOlJxK5ZIo=", "kZNmx");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[2]] = MixologyInfoBox.lIIlIlIlIlllIll("pqw5/XCa3CI=", "mJONP");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[3]] = MixologyInfoBox.lIIlIlIlIlllIll("cxcGRUD0H28=", "RebVh");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[4]] = MixologyInfoBox.lIIlIlIlIlllIlI("wrkcuFENUfU=", "pUvQJ");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[5]] = MixologyInfoBox.lIIlIlIlIllllII("UEx6KQ==", "ubKOs");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[7]] = MixologyInfoBox.lIIlIlIlIllllII("PBglHycVP1gnJx81FAUpHg==", "gZxjN");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[8]] = MixologyInfoBox.lIIlIlIlIllllII("NS8rJgsKPw==", "gZERb");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[9]] = MixologyInfoBox.lIIlIlIlIllllII("Oh8cBCwDFA==", "lznwE");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[10]] = MixologyInfoBox.lIIlIlIlIllllII("BRg2MnNx", "QyEYI");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[11]] = MixologyInfoBox.lIIlIlIlIlllIlI("KmpMERzfyNo6/rr0HWVslypty4ejl0e+", "FaZWg");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[6]] = MixologyInfoBox.lIIlIlIlIllllII("MjYRJS8RdxUkMlo2HyplGS4dcWo=", "uWxKJ");
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[17]] = MixologyInfoBox.lIIlIlIlIlllIll("ylp7Gelx5XY=", "nnQNX");
    }

    private static boolean lIIlIlIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static double b(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(lllllllIllll[llllllllIIII[17]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    private static int lIIlIlIlIllllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIlIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIlIlllllI() {
        llllllllIIII = new int[19];
        MixologyInfoBox.llllllllIIII[0] = -(0xFFFFD357 & 0x7EB9) & (0xFFFFFBFE & 0x67FBF);
        MixologyInfoBox.llllllllIIII[1] = (0x37 ^ 0x1B) & ~(0x9F ^ 0xB3);
        MixologyInfoBox.llllllllIIII[2] = " ".length();
        MixologyInfoBox.llllllllIIII[3] = "  ".length();
        MixologyInfoBox.llllllllIIII[4] = "   ".length();
        MixologyInfoBox.llllllllIIII[5] = 92 + 68 - 56 + 49 ^ 123 + 39 - 57 + 52;
        MixologyInfoBox.llllllllIIII[6] = 0x72 ^ 0x78;
        MixologyInfoBox.llllllllIIII[7] = 0xF4 ^ 0xB3 ^ (1 ^ 0x43);
        MixologyInfoBox.llllllllIIII[8] = 93 + 123 - 213 + 167 ^ 148 + 136 - 230 + 118;
        MixologyInfoBox.llllllllIIII[9] = 0x24 ^ 0x23;
        MixologyInfoBox.llllllllIIII[10] = 0xCF ^ 0xC7;
        MixologyInfoBox.llllllllIIII[11] = 0xBA ^ 0x82 ^ (0x6A ^ 0x5B);
        MixologyInfoBox.llllllllIIII[12] = 0xFFFFD3CE & 0x3D71;
        MixologyInfoBox.llllllllIIII[13] = 0xFFFFB57F & 0x5BBF;
        MixologyInfoBox.llllllllIIII[14] = -(0xFFFFFDA6 & 0x665B) & (0xFFFFFFBF & 0x757F);
        MixologyInfoBox.llllllllIIII[15] = 0xFFFFB596 & 0x4B6B;
        MixologyInfoBox.llllllllIIII[16] = 10 + 43 - 4 + 106 ^ 59 + 79 - 91 + 96;
        MixologyInfoBox.llllllllIIII[17] = 50 + 38 - 25 + 113 ^ 121 + 152 - 198 + 112;
        MixologyInfoBox.llllllllIIII[18] = 0x87 ^ 0xB6 ^ (0x23 ^ 0x1E);
    }

    private String c(int n2) {
        double d2 = this.b(n2);
        return MixologyInfoBox.a(d2);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return MixologyInfoBox.b(d3);
    }

    public static String a(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    static {
        MixologyInfoBox.lIIlIlIlIlllllI();
        MixologyInfoBox.lIIlIlIlIllllIl();
    }

    private static String lIIlIlIlIlllIlI(String lllllllllllllllIIlIIIIlllIlllIll, String lllllllllllllllIIlIIIIlllIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), llllllllIIII[10]), "DES");
            Cipher lllllllllllllllIIlIIIIlllIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIlllIllllIl.init(llllllllIIII[3], lllllllllllllllIIlIIIIlllIlllllI);
            return new String(lllllllllllllllIIlIIIIlllIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIlllIllllII) {
            lllllllllllllllIIlIIIIlllIllllII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (MixologyInfoBox.lIIlIlIllIIIIlI(this.B.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long l2 = System.currentTimeMillis() - SquireMixology.l;
        Duration duration = Duration.between(this.B.getStarted(), Instant.now());
        int n2 = (int)((double)SquireMixology.i * 3600000.0 / (double)l2);
        this.panelComponent.setBorder(new Rectangle(llllllllIIII[6], llllllllIIII[6], llllllllIIII[6], llllllllIIII[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllllIllll[llllllllIIII[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[8]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[9]]).right(SquireMixology.f).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[10]]).right(SquireMixology.g).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[11]]).right(SquireMixology.p).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[6]]).right(Static.getClient().getVarpValue(llllllllIIII[12]) - F + "/" + (Static.getClient().getVarpValue(llllllllIIII[13]) - E) + "/" + (Static.getClient().getVarpValue(llllllllIIII[14]) - D)).build());
        "".length();
        int n3 = llllllllIIII[15];
        this.panelComponent.setPreferredSize(new Dimension(n3 + llllllllIIII[16], llllllllIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIlIlllIll(String lllllllllllllllIIlIIIIlllllIIIII, String lllllllllllllllIIlIIIIllllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIlllllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIlllllIIIlI.init(llllllllIIII[3], lllllllllllllllIIlIIIIlllllIIIll);
            return new String(lllllllllllllllIIlIIIIlllllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIlllllIIIIl) {
            lllllllllllllllIIlIIIIlllllIIIIl.printStackTrace();
            return null;
        }
    }

    public static String a(double d2) {
        double lllllllllllllllIIlIIIIlllllllIll;
        if (MixologyInfoBox.lIIlIlIllIIIIII(MixologyInfoBox.lIIlIlIlIllllll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllllllIIII[2]];
            objectArray[MixologyInfoBox.llllllllIIII[1]] = d3;
            return String.format(lllllllIllll[llllllllIIII[1]], objectArray);
        }
        if (MixologyInfoBox.lIIlIlIllIIIIII(MixologyInfoBox.lIIlIlIlIllllll(lllllllllllllllIIlIIIIlllllllIll, 1000.0))) {
            double lllllllllllllllIIlIIIIlllllllIlI = lllllllllllllllIIlIIIIlllllllIll / 1000.0;
            if (MixologyInfoBox.lIIlIlIllIIIIIl(MixologyInfoBox.lIIlIlIlIllllll(lllllllllllllllIIlIIIIlllllllIlI % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllllllIIII[2]];
                objectArray[MixologyInfoBox.llllllllIIII[1]] = lllllllllllllllIIlIIIIlllllllIlI;
                return String.format(lllllllIllll[llllllllIIII[2]], objectArray);
            }
            Object[] objectArray = new Object[llllllllIIII[2]];
            objectArray[MixologyInfoBox.llllllllIIII[1]] = lllllllllllllllIIlIIIIlllllllIlI;
            return String.format(lllllllIllll[llllllllIIII[3]], objectArray);
        }
        if (MixologyInfoBox.lIIlIlIllIIIIIl(MixologyInfoBox.lIIlIlIlIllllll(lllllllllllllllIIlIIIIlllllllIll % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllllllIIII[2]];
            objectArray[MixologyInfoBox.llllllllIIII[1]] = lllllllllllllllIIlIIIIlllllllIll;
            return String.format(lllllllIllll[llllllllIIII[4]], objectArray);
        }
        Object[] objectArray = new Object[llllllllIIII[2]];
        objectArray[MixologyInfoBox.llllllllIIII[1]] = d2;
        return String.format(lllllllIllll[llllllllIIII[5]], objectArray);
    }

    @Inject
    private MixologyInfoBox(SquireMixology squireMixology) {
        this.C = llllllllIIII[0];
        this.B = squireMixology;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

