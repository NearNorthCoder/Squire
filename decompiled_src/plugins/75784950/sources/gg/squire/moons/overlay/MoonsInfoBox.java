package gg.squire.moons.overlay;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
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
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:gg/squire/moons/overlay/MoonsInfoBox.class */
public class MoonsInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireMoonsOfPeril k;
    private static /* synthetic */ int[] lIIIIIIlIlIII;
    private static /* synthetic */ String[] lIIIIIIlIIlll;
    private final /* synthetic */ int l = lIIIIIIlIlIII[0];

    private static boolean lIIlIllllIIlllI(int i) {
        return i != 0;
    }

    public double a(int i) {
        Duration between = Duration.between(this.k.getStarted(), Instant.now());
        if (lIIlIllllIIllIl(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static double b(double d) {
        return Double.parseDouble(new DecimalFormat(lIIIIIIlIIlll[lIIIIIIlIlIII[6]]).format(d));
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIlIllllIIlllI(this.k.isPaintDisabled() ? 1 : 0)) {
        }
        long currentTimeMillis = System.currentTimeMillis() - SquireMoonsOfPeril.i;
        Duration between = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIIIIIlIlIII[6], lIIIIIIlIlIII[6], lIIIIIIlIlIII[6], lIIIIIIlIlIII[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIIIIlIIlll[lIIIIIIlIlIII[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[8]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[9]]).right(SquireMoonsOfPeril.f).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[10]]).right(SquireMoonsOfPeril.g).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[11]]).right(SquireMoonsOfPeril.h + " (" + a(SquireMoonsOfPeril.h, currentTimeMillis) + "/hr)").build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIIIIIlIlIII[12] + lIIIIIIlIlIII[13], lIIIIIIlIlIII[1]));
        return super.render(graphics2D);
    }

    private static void lIIlIllllIIlIlI() {
        lIIIIIIlIlIII = new int[15];
        lIIIIIIlIlIII[0] = (-5121) & 409006;
        lIIIIIIlIlIII[1] = ((209 ^ 132) ^ (52 ^ 33)) & (((42 ^ 49) ^ (32 ^ 123)) ^ (-" ".length()));
        lIIIIIIlIlIII[2] = " ".length();
        lIIIIIIlIlIII[3] = "  ".length();
        lIIIIIIlIlIII[4] = "   ".length();
        lIIIIIIlIlIII[5] = (((120 + 23) - 0) + 43) ^ (((97 + 120) - 162) + 135);
        lIIIIIIlIlIII[6] = 3 ^ 9;
        lIIIIIIlIlIII[7] = (((31 + 169) - 128) + 98) ^ (((106 + 67) - 51) + 53);
        lIIIIIIlIlIII[8] = 197 ^ 195;
        lIIIIIIlIlIII[9] = 149 ^ 146;
        lIIIIIIlIlIII[10] = (202 ^ 163) ^ (118 ^ 23);
        lIIIIIIlIlIII[11] = (((70 + 89) - 56) + 44) ^ (((56 + 78) - 32) + 52);
        lIIIIIIlIlIII[12] = (-((-1298) & 10099)) & (-17565) & 26623;
        lIIIIIIlIlIII[13] = 213 ^ 193;
        lIIIIIIlIlIII[14] = (((25 + 120) - 134) + 156) ^ (((155 + 140) - 245) + 122);
    }

    private static String lIIlIllllIIIllI(String lllllllllllllllIIIlllIlllIIlllII, String lllllllllllllllIIIlllIlllIIllIll) {
        String lllllllllllllllIIIlllIlllIIlllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIlllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIlllIlllIIllIll.toCharArray();
        int lllllllllllllllIIIlllIlllIIllIII = lIIIIIIlIlIII[1];
        char[] charArray2 = lllllllllllllllIIIlllIlllIIlllII2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIIlllIlllIIlIIII = lIIIIIIlIlIII[1];
        while (lIIlIllllIIllll(lllllllllllllllIIIlllIlllIIlIIII, length)) {
            sb.append((char) (charArray2[lllllllllllllllIIIlllIlllIIlIIII] ^ charArray[lllllllllllllllIIIlllIlllIIllIII % charArray.length]));
            "".length();
            lllllllllllllllIIIlllIlllIIllIII++;
            lllllllllllllllIIIlllIlllIIlIIII++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static double a(double d, long j) {
        return b((d * 3600000.0d) / j);
    }

    static {
        lIIlIllllIIlIlI();
        lIIlIllllIIlIIl();
    }

    private static int lIIlIllllIIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIllllIIllll(int i, int i2) {
        return i < i2;
    }

    private String b(int i) {
        return a(a(i));
    }

    public static String a(double d) {
        if (lIIlIllllIIllII(lIIlIllllIIlIll(d, 1000000.0d))) {
            String str = lIIIIIIlIIlll[lIIIIIIlIlIII[1]];
            Object[] objArr = new Object[lIIIIIIlIlIII[2]];
            objArr[lIIIIIIlIlIII[1]] = Double.valueOf(d / 1000.0d);
            return String.format(str, objArr);
        } else if (!lIIlIllllIIllII(lIIlIllllIIlIll(d, 1000.0d))) {
            if (lIIlIllllIIllIl(lIIlIllllIIlIll(d % 1.0d, 0.0d))) {
                String str2 = lIIIIIIlIIlll[lIIIIIIlIlIII[4]];
                Object[] objArr2 = new Object[lIIIIIIlIlIII[2]];
                objArr2[lIIIIIIlIlIII[1]] = Double.valueOf(d);
                return String.format(str2, objArr2);
            }
            String str3 = lIIIIIIlIIlll[lIIIIIIlIlIII[5]];
            Object[] objArr3 = new Object[lIIIIIIlIlIII[2]];
            objArr3[lIIIIIIlIlIII[1]] = Double.valueOf(d);
            return String.format(str3, objArr3);
        } else {
            double d2 = d / 1000.0d;
            if (lIIlIllllIIllIl(lIIlIllllIIlIll(d2 % 1.0d, 0.0d))) {
                String str4 = lIIIIIIlIIlll[lIIIIIIlIlIII[2]];
                Object[] objArr4 = new Object[lIIIIIIlIlIII[2]];
                objArr4[lIIIIIIlIlIII[1]] = Double.valueOf(d2);
                return String.format(str4, objArr4);
            }
            String str5 = lIIIIIIlIIlll[lIIIIIIlIlIII[3]];
            Object[] objArr5 = new Object[lIIIIIIlIlIII[2]];
            objArr5[lIIIIIIlIlIII[1]] = Double.valueOf(d2);
            return String.format(str5, objArr5);
        }
    }

    private static boolean lIIlIllllIIllIl(int i) {
        return i == 0;
    }

    private static void lIIlIllllIIlIIl() {
        lIIIIIIlIIlll = new String[lIIIIIIlIlIII[14]];
        lIIIIIIlIIlll[lIIIIIIlIlIII[1]] = lIIlIllllIIIllI("SkNzMQg=", "omCWC");
        lIIIIIIlIIlll[lIIIIIIlIlIII[2]] = lIIlIllllIIIlll("p6SWnVBXoQ0=", "knUJX");
        lIIIIIIlIIlll[lIIIIIIlIlIII[3]] = lIIlIllllIIIllI("RkhFISE=", "cftGj");
        lIIIIIIlIIlll[lIIIIIIlIlIII[4]] = lIIlIllllIIIllI("Sn92Mw==", "oQFUt");
        lIIIIIIlIIlll[lIIIIIIlIlIII[5]] = lIIlIllllIIIlll("/hxiHCY7nMk=", "Gqwdw");
        lIIIIIIlIIlll[lIIIIIIlIlIII[7]] = lIIlIllllIIIlll("SoVqTXQyny84GSbDqlVkhKQvKhL3XBJn", "kKnbQ");
        lIIIIIIlIIlll[lIIIIIIlIlIII[8]] = lIIlIllllIIlIII("X+NRkcCkC9U=", "sMrNL");
        lIIIIIIlIIlll[lIIIIIIlIlIII[9]] = lIIlIllllIIIllI("Oi0QJhwDJg==", "lHbUu");
        lIIIIIIlIIlll[lIIIIIIlIlIII[10]] = lIIlIllllIIIllI("BDcVLH9w", "PVfGE");
        lIIIIIIlIIlll[lIIIIIIlIlIII[11]] = lIIlIllllIIIllI("LysfBgMfeVo=", "lCzuw");
        lIIIIIIlIIlll[lIIIIIIlIlIII[6]] = lIIlIllllIIlIII("1oOa4/TfXMA=", "YRYDA");
    }

    @Inject
    private MoonsInfoBox(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.k = squireMoonsOfPeril;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIlIllllIIIlll(String lllllllllllllllIIIlllIllIllllIlI, String lllllllllllllllIIIlllIllIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIllIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllIllllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIlIII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlIlIII[3], lllllllllllllllIIIlllIllIlllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllIllIllllIll) {
            lllllllllllllllIIIlllIllIllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllllIIlIII(String lllllllllllllllIIIlllIlllIIIIlll, String lllllllllllllllIIIlllIlllIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIlllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllIlllIIIlIII) {
            lllllllllllllllIIIlllIlllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIllII(int i) {
        return i >= 0;
    }
}
