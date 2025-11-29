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
 */
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

public class MoonsInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireMoonsOfPeril k;
    private static /* synthetic */ int[] lIIIIIIlIlIII;
    private static /* synthetic */ String[] lIIIIIIlIIlll;
    private final /* synthetic */ int l = 403886;

    private static boolean lIIlIllllIIlllI(int n) {
        return n != 0;
    }

    public double a(int n) {
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        if (MoonsInfoBox.lIIlIllllIIllIl(duration.isZero() ? 1 : 0)) {
            return (double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static double b(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(lIIIIIIlIIlll[lIIIIIIlIlIII[6]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    public Dimension render(Graphics2D graphics2D) {
        if (MoonsInfoBox.lIIlIllllIIlllI(this.k.isPaintDisabled() ? 1 : 0)) {
            // empty if block
        }
        long l2 = System.currentTimeMillis() - SquireMoonsOfPeril.i;
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIIIIIlIlIII[6], lIIIIIIlIlIII[6], lIIIIIIlIlIII[6], lIIIIIIlIlIII[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIIIIlIIlll[lIIIIIIlIlIII[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[8]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[9]]).right(SquireMoonsOfPeril.f).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[10]]).right(SquireMoonsOfPeril.g).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[11]]).right(SquireMoonsOfPeril.h + " (" + MoonsInfoBox.a(SquireMoonsOfPeril.h, l2) + "/hr)").build());
        "".length();
        int n = lIIIIIIlIlIII[12];
        this.panelComponent.setPreferredSize(new Dimension(n + lIIIIIIlIlIII[13], lIIIIIIlIlIII[1]));
        return super.render(graphics2D);
    }

    private static void lIIlIllllIIlIlI() {
        lIIIIIIlIlIII = new int[15];
        MoonsInfoBox.lIIIIIIlIlIII[0] = 0xFFFFEBFF & 0x63DAE;
        MoonsInfoBox.lIIIIIIlIlIII[1] = (0xD1 ^ 0x84 ^ (0x34 ^ 0x21)) & (0x2A ^ 0x31 ^ (0x20 ^ 0x7B) ^ -" ".length());
        MoonsInfoBox.lIIIIIIlIlIII[2] = " ".length();
        MoonsInfoBox.lIIIIIIlIlIII[3] = "  ".length();
        MoonsInfoBox.lIIIIIIlIlIII[4] = "   ".length();
        MoonsInfoBox.lIIIIIIlIlIII[5] = 120 + 23 - 0 + 43 ^ 97 + 120 - 162 + 135;
        MoonsInfoBox.lIIIIIIlIlIII[6] = 3 ^ 9;
        MoonsInfoBox.lIIIIIIlIlIII[7] = 31 + 169 - 128 + 98 ^ 106 + 67 - 51 + 53;
        MoonsInfoBox.lIIIIIIlIlIII[8] = 0xC5 ^ 0xC3;
        MoonsInfoBox.lIIIIIIlIlIII[9] = 0x95 ^ 0x92;
        MoonsInfoBox.lIIIIIIlIlIII[10] = 0xCA ^ 0xA3 ^ (0x76 ^ 0x17);
        MoonsInfoBox.lIIIIIIlIlIII[11] = 70 + 89 - 56 + 44 ^ 56 + 78 - 32 + 52;
        MoonsInfoBox.lIIIIIIlIlIII[12] = -(0xFFFFFAEE & 0x2773) & (0xFFFFBB63 & 0x67FF);
        MoonsInfoBox.lIIIIIIlIlIII[13] = 0xD5 ^ 0xC1;
        MoonsInfoBox.lIIIIIIlIlIII[14] = 25 + 120 - 134 + 156 ^ 155 + 140 - 245 + 122;
    }

    private static String lIIlIllllIIIllI(String lllllllllllllllIIIlllIlllIIlIlll, String lllllllllllllllIIIlllIlllIIllIll) {
        lllllllllllllllIIIlllIlllIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIlllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllIlllIIllIlI = new StringBuilder();
        char[] lllllllllllllllIIIlllIlllIIllIIl = lllllllllllllllIIIlllIlllIIllIll.toCharArray();
        int lllllllllllllllIIIlllIlllIIllIII = lIIIIIIlIlIII[1];
        char[] lllllllllllllllIIIlllIlllIIlIIlI = lllllllllllllllIIIlllIlllIIlIlll.toCharArray();
        int lllllllllllllllIIIlllIlllIIlIIIl = lllllllllllllllIIIlllIlllIIlIIlI.length;
        int lllllllllllllllIIIlllIlllIIlIIII = lIIIIIIlIlIII[1];
        while (MoonsInfoBox.lIIlIllllIIllll(lllllllllllllllIIIlllIlllIIlIIII, lllllllllllllllIIIlllIlllIIlIIIl)) {
            char lllllllllllllllIIIlllIlllIIlllIl = lllllllllllllllIIIlllIlllIIlIIlI[lllllllllllllllIIIlllIlllIIlIIII];
            lllllllllllllllIIIlllIlllIIllIlI.append((char)(lllllllllllllllIIIlllIlllIIlllIl ^ lllllllllllllllIIIlllIlllIIllIIl[lllllllllllllllIIIlllIlllIIllIII % lllllllllllllllIIIlllIlllIIllIIl.length]));
            "".length();
            ++lllllllllllllllIIIlllIlllIIllIII;
            ++lllllllllllllllIIIlllIlllIIlIIII;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlllIlllIIllIlI);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return MoonsInfoBox.b(d3);
    }

    static {
        MoonsInfoBox.lIIlIllllIIlIlI();
        MoonsInfoBox.lIIlIllllIIlIIl();
    }

    private static int lIIlIllllIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIllllIIllll(int n, int n2) {
        return n < n2;
    }

    private String b(int n) {
        double d2 = this.a(n);
        return MoonsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double lllllllllllllllIIIlllIlllIlllIII;
        if (MoonsInfoBox.lIIlIllllIIllII(MoonsInfoBox.lIIlIllllIIlIll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = d3;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[1]], objectArray);
        }
        if (MoonsInfoBox.lIIlIllllIIllII(MoonsInfoBox.lIIlIllllIIlIll(lllllllllllllllIIIlllIlllIlllIII, 1000.0))) {
            double lllllllllllllllIIIlllIlllIllIlll = lllllllllllllllIIIlllIlllIlllIII / 1000.0;
            if (MoonsInfoBox.lIIlIllllIIllIl(MoonsInfoBox.lIIlIllllIIlIll(lllllllllllllllIIIlllIlllIllIlll % 1.0, 0.0))) {
                Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
                objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = lllllllllllllllIIIlllIlllIllIlll;
                return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[2]], objectArray);
            }
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = lllllllllllllllIIIlllIlllIllIlll;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[3]], objectArray);
        }
        if (MoonsInfoBox.lIIlIllllIIllIl(MoonsInfoBox.lIIlIllllIIlIll(lllllllllllllllIIIlllIlllIlllIII % 1.0, 0.0))) {
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = lllllllllllllllIIIlllIlllIlllIII;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[4]], objectArray);
        }
        Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
        objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = d2;
        return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[5]], objectArray);
    }

    private static boolean lIIlIllllIIllIl(int n) {
        return n == 0;
    }

    private static void lIIlIllllIIlIIl() {
        lIIIIIIlIIlll = new String[lIIIIIIlIlIII[14]];
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[1]] = MoonsInfoBox.lIIlIllllIIIllI("SkNzMQg=", "omCWC");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[2]] = MoonsInfoBox.lIIlIllllIIIlll("p6SWnVBXoQ0=", "knUJX");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[3]] = MoonsInfoBox.lIIlIllllIIIllI("RkhFISE=", "cftGj");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[4]] = MoonsInfoBox.lIIlIllllIIIllI("Sn92Mw==", "oQFUt");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[5]] = MoonsInfoBox.lIIlIllllIIIlll("/hxiHCY7nMk=", "Gqwdw");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[7]] = MoonsInfoBox.lIIlIllllIIIlll("SoVqTXQyny84GSbDqlVkhKQvKhL3XBJn", "kKnbQ");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[8]] = MoonsInfoBox.lIIlIllllIIlIII("X+NRkcCkC9U=", "sMrNL");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[9]] = MoonsInfoBox.lIIlIllllIIIllI("Oi0QJhwDJg==", "lHbUu");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[10]] = MoonsInfoBox.lIIlIllllIIIllI("BDcVLH9w", "PVfGE");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[11]] = MoonsInfoBox.lIIlIllllIIIllI("LysfBgMfeVo=", "lCzuw");
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[6]] = MoonsInfoBox.lIIlIllllIIlIII("1oOa4/TfXMA=", "YRYDA");
    }

    @Inject
    private MoonsInfoBox(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.l = lIIIIIIlIlIII[0];
        this.k = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIlIllllIIIlll(String lllllllllllllllIIIlllIllIllllIII, String lllllllllllllllIIIlllIllIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIllIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIlIII[10]), "DES");
            Cipher lllllllllllllllIIIlllIllIlllllII = Cipher.getInstance("DES");
            lllllllllllllllIIIlllIllIlllllII.init(lIIIIIIlIlIII[3], lllllllllllllllIIIlllIllIlllllIl);
            return new String(lllllllllllllllIIIlllIllIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllIllIllllIll) {
            lllllllllllllllIIIlllIllIllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllllIIlIII(String lllllllllllllllIIIlllIlllIIIIlll, String lllllllllllllllIIIlllIlllIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIlllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllIlllIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllIlllIIIlIIl.init(lIIIIIIlIlIII[3], lllllllllllllllIIIlllIlllIIIlIlI);
            return new String(lllllllllllllllIIIlllIlllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIlllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllIlllIIIlIII) {
            lllllllllllllllIIIlllIlllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIllII(int n) {
        return n >= 0;
    }
}

