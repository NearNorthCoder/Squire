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
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[8]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[9]]).right(SquireMoonsOfPeril.f).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[10]]).right(SquireMoonsOfPeril.g).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[11]]).right(SquireMoonsOfPeril.h + " (" + MoonsInfoBox.a(SquireMoonsOfPeril.h, l2) + "/hr)").build());
        0;
        int n = lIIIIIIlIlIII[12];
        this.panelComponent.setPreferredSize(new Dimension(n + lIIIIIIlIlIII[13], lIIIIIIlIlIII[1]));
        return super.render(graphics2D);
    }

    private static void lIIlIllllIIlIlI() {
        lIIIIIIlIlIII = new int[15];
        MoonsInfoBox.lIIIIIIlIlIII[0] = 0xFFFFEBFF & 0x63DAE;
        MoonsInfoBox.lIIIIIIlIlIII[1] = (0xD1 ^ 0x84 ^ (0x34 ^ 0x21)) & (0x2A ^ 0x31 ^ (0x20 ^ 0x7B) ^ -1);
        MoonsInfoBox.lIIIIIIlIlIII[2] = 1;
        MoonsInfoBox.lIIIIIIlIlIII[3] = 2;
        MoonsInfoBox.lIIIIIIlIlIII[4] = 3;
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

    private static String lIIlIllllIIIllI(String var3, String var19) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var16 = var19.toCharArray();
        int var12 = lIIIIIIlIlIII[1];
        char[] var20 = var3.toCharArray();
        int var6 = var20.length;
        int var18 = lIIIIIIlIlIII[1];
        while (MoonsInfoBox.lIIlIllllIIllll(var18, var6)) {
            char var2 = var20[var18];
            var9.append((char)(var2 ^ var16[var12 % var16.length]));
            0;
            ++var12;
            ++var18;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
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
        double var15;
        if (MoonsInfoBox.lIIlIllllIIllII(MoonsInfoBox.lIIlIllllIIlIll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = d3;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[1]], objectArray);
        }
        if (MoonsInfoBox.lIIlIllllIIllII(MoonsInfoBox.lIIlIllllIIlIll(var15, 1000.0))) {
            double var13 = var15 / 1000.0;
            if (MoonsInfoBox.lIIlIllllIIllIl(MoonsInfoBox.lIIlIllllIIlIll(var13 % 1.0, 0.0))) {
                Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
                objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = var13;
                return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[2]], objectArray);
            }
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = var13;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[3]], objectArray);
        }
        if (MoonsInfoBox.lIIlIllllIIllIl(MoonsInfoBox.lIIlIllllIIlIll(var15 % 1.0, 0.0))) {
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = var15;
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
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[1]] = MoonsInfoBox."%.0fK";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[2]] = MoonsInfoBox."%.0fK";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[3]] = MoonsInfoBox."%.1fK";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[4]] = MoonsInfoBox."%.0f";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[5]] = MoonsInfoBox."%.1f";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[7]] = MoonsInfoBox."Squire Moons of Peril";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[8]] = MoonsInfoBox."Runtime";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[9]] = MoonsInfoBox."Version";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[10]] = MoonsInfoBox."Task: ";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[11]] = MoonsInfoBox."Chests: ";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[6]] = MoonsInfoBox."#.0";
    }

    @Inject
    private MoonsInfoBox(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.l = lIIIIIIlIlIII[0];
        this.k = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIlIllllIIIlll(String var4, String var21) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIlIII[10]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIIIIIIlIlIII[3], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllllIIlIII(String var5, String var7) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIIIIIlIlIII[3], var10);
            return new String(var17.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIllII(int n) {
        return n >= 0;
    }
}

