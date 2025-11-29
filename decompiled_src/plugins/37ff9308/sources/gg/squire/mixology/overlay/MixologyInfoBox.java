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
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:gg/squire/mixology/overlay/MixologyInfoBox.class */
public class MixologyInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireMixology B;
    private final /* synthetic */ int C = llllllllIIII[0];
    public static /* synthetic */ int D;
    public static /* synthetic */ int E;
    private static /* synthetic */ int[] llllllllIIII;
    private static /* synthetic */ String[] lllllllIllll;
    public static /* synthetic */ int F;

    private static boolean lIIlIlIllIIIIII(int i) {
        return i >= 0;
    }

    private static String lIIlIlIlIllllII(String lllllllllllllllIIlIIIIllllIlIIII, String lllllllllllllllIIlIIIIllllIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIllllIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIIIllllIIllIl = lllllllllllllllIIlIIIIllllIIllll.toCharArray();
        int lllllllllllllllIIlIIIIllllIIllII = llllllllIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllllllIIII[1];
        while (lIIlIlIllIIIIll(i, length)) {
            char lllllllllllllllIIlIIIIllllIlIIIl = charArray[i];
            lllllllllllllllIIlIIIIllllIIlllI.append((char) (lllllllllllllllIIlIIIIllllIlIIIl ^ lllllllllllllllIIlIIIIllllIIllIl[lllllllllllllllIIlIIIIllllIIllII % lllllllllllllllIIlIIIIllllIIllIl.length]));
            "".length();
            lllllllllllllllIIlIIIIllllIIllII++;
            i++;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIIllllIIlllI);
    }

    public double b(int i) {
        Duration between = Duration.between(this.B.getStarted(), Instant.now());
        if (lIIlIlIllIIIIIl(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static void lIIlIlIlIllllIl() {
        lllllllIllll = new String[llllllllIIII[18]];
        lllllllIllll[llllllllIIII[1]] = lIIlIlIlIlllIlI("5UOlJxK5ZIo=", "kZNmx");
        lllllllIllll[llllllllIIII[2]] = lIIlIlIlIlllIll("pqw5/XCa3CI=", "mJONP");
        lllllllIllll[llllllllIIII[3]] = lIIlIlIlIlllIll("cxcGRUD0H28=", "RebVh");
        lllllllIllll[llllllllIIII[4]] = lIIlIlIlIlllIlI("wrkcuFENUfU=", "pUvQJ");
        lllllllIllll[llllllllIIII[5]] = lIIlIlIlIllllII("UEx6KQ==", "ubKOs");
        lllllllIllll[llllllllIIII[7]] = lIIlIlIlIllllII("PBglHycVP1gnJx81FAUpHg==", "gZxjN");
        lllllllIllll[llllllllIIII[8]] = lIIlIlIlIllllII("NS8rJgsKPw==", "gZERb");
        lllllllIllll[llllllllIIII[9]] = lIIlIlIlIllllII("Oh8cBCwDFA==", "lznwE");
        lllllllIllll[llllllllIIII[10]] = lIIlIlIlIllllII("BRg2MnNx", "QyEYI");
        lllllllIllll[llllllllIIII[11]] = lIIlIlIlIlllIlI("KmpMERzfyNo6/rr0HWVslypty4ejl0e+", "FaZWg");
        lllllllIllll[llllllllIIII[6]] = lIIlIlIlIllllII("MjYRJS8RdxUkMlo2HyplGS4dcWo=", "uWxKJ");
        lllllllIllll[llllllllIIII[17]] = lIIlIlIlIlllIll("ylp7Gelx5XY=", "nnQNX");
    }

    private static boolean lIIlIlIllIIIIlI(int i) {
        return i != 0;
    }

    private static double b(double d) {
        return Double.parseDouble(new DecimalFormat(lllllllIllll[llllllllIIII[17]]).format(d));
    }

    private static int lIIlIlIlIllllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIlIllIIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIllIIIIIl(int i) {
        return i == 0;
    }

    private static void lIIlIlIlIlllllI() {
        llllllllIIII = new int[19];
        llllllllIIII[0] = (-((-11433) & 32441)) & (-1026) & 425919;
        llllllllIIII[1] = (55 ^ 27) & ((159 ^ 179) ^ (-1));
        llllllllIIII[2] = " ".length();
        llllllllIIII[3] = "  ".length();
        llllllllIIII[4] = "   ".length();
        llllllllIIII[5] = (((92 + 68) - 56) + 49) ^ (((123 + 39) - 57) + 52);
        llllllllIIII[6] = 114 ^ 120;
        llllllllIIII[7] = (244 ^ 179) ^ (1 ^ 67);
        llllllllIIII[8] = (((93 + 123) - 213) + 167) ^ (((148 + 136) - 230) + 118);
        llllllllIIII[9] = 36 ^ 35;
        llllllllIIII[10] = 207 ^ 199;
        llllllllIIII[11] = (186 ^ 130) ^ (106 ^ 91);
        llllllllIIII[12] = (-11314) & 15729;
        llllllllIIII[13] = (-19073) & 23487;
        llllllllIIII[14] = (-((-602) & 26203)) & (-65) & 30079;
        llllllllIIII[15] = (-19050) & 19307;
        llllllllIIII[16] = (((10 + 43) - 4) + 106) ^ (((59 + 79) - 91) + 96);
        llllllllIIII[17] = (((50 + 38) - 25) + 113) ^ (((121 + 152) - 198) + 112);
        llllllllIIII[18] = (135 ^ 182) ^ (35 ^ 30);
    }

    private String c(int i) {
        return a(b(i));
    }

    public static double a(double d, long j) {
        return b((d * 3600000.0d) / j);
    }

    public static String a(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    static {
        lIIlIlIlIlllllI();
        lIIlIlIlIllllIl();
    }

    private static String lIIlIlIlIlllIlI(String lllllllllllllllIIlIIIIlllIlllIll, String lllllllllllllllIIlIIIIlllIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlllIlllIII.getBytes(StandardCharsets.UTF_8)), llllllllIIII[10]), "DES");
            Cipher lllllllllllllllIIlIIIIlllIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIlllIllllIl.init(llllllllIIII[3], lllllllllllllllIIlIIIIlllIlllllI);
            return new String(lllllllllllllllIIlIIIIlllIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIlllIllllII) {
            lllllllllllllllIIlIIIIlllIllllII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIlIlIllIIIIlI(this.B.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - SquireMixology.l;
        Duration between = Duration.between(this.B.getStarted(), Instant.now());
        int i = (int) ((SquireMixology.i * 3600000.0d) / currentTimeMillis);
        this.panelComponent.setBorder(new Rectangle(llllllllIIII[6], llllllllIIII[6], llllllllIIII[6], llllllllIIII[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllllIllll[llllllllIIII[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[8]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[9]]).right(SquireMixology.f).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[10]]).right(SquireMixology.g).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[11]]).right(SquireMixology.p).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[6]]).right((Static.getClient().getVarpValue(llllllllIIII[12]) - F) + "/" + (Static.getClient().getVarpValue(llllllllIIII[13]) - E) + "/" + (Static.getClient().getVarpValue(llllllllIIII[14]) - D)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llllllllIIII[15] + llllllllIIII[16], llllllllIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIlIlllIll(String lllllllllllllllIIlIIIIlllllIIIII, String lllllllllllllllIIlIIIIllllIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIlllllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIlllllIIIlI.init(llllllllIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIlIIIIlllllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIlllllIIIIl) {
            lllllllllllllllIIlIIIIlllllIIIIl.printStackTrace();
            return null;
        }
    }

    public static String a(double d) {
        if (lIIlIlIllIIIIII(lIIlIlIlIllllll(d, 1000000.0d))) {
            String str = lllllllIllll[llllllllIIII[1]];
            Object[] objArr = new Object[llllllllIIII[2]];
            objArr[llllllllIIII[1]] = Double.valueOf(d / 1000.0d);
            return String.format(str, objArr);
        } else if (!lIIlIlIllIIIIII(lIIlIlIlIllllll(d, 1000.0d))) {
            if (lIIlIlIllIIIIIl(lIIlIlIlIllllll(d % 1.0d, 0.0d))) {
                String str2 = lllllllIllll[llllllllIIII[4]];
                Object[] objArr2 = new Object[llllllllIIII[2]];
                objArr2[llllllllIIII[1]] = Double.valueOf(d);
                return String.format(str2, objArr2);
            }
            String str3 = lllllllIllll[llllllllIIII[5]];
            Object[] objArr3 = new Object[llllllllIIII[2]];
            objArr3[llllllllIIII[1]] = Double.valueOf(d);
            return String.format(str3, objArr3);
        } else {
            double d2 = d / 1000.0d;
            if (lIIlIlIllIIIIIl(lIIlIlIlIllllll(d2 % 1.0d, 0.0d))) {
                String str4 = lllllllIllll[llllllllIIII[2]];
                Object[] objArr4 = new Object[llllllllIIII[2]];
                objArr4[llllllllIIII[1]] = Double.valueOf(d2);
                return String.format(str4, objArr4);
            }
            String str5 = lllllllIllll[llllllllIIII[3]];
            Object[] objArr5 = new Object[llllllllIIII[2]];
            objArr5[llllllllIIII[1]] = Double.valueOf(d2);
            return String.format(str5, objArr5);
        }
    }

    @Inject
    private MixologyInfoBox(SquireMixology squireMixology) {
        this.B = squireMixology;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}
