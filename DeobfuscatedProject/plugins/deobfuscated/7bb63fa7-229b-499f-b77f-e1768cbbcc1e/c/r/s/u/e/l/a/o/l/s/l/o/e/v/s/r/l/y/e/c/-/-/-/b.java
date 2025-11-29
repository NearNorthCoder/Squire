/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.PanelComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
import com.google.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.plugins.logout.Clues;

public class b
extends Overlay {
    private static /* synthetic */ int[] llIl;
    private final /* synthetic */ PanelComponent D;
    private final /* synthetic */ Clues C;
    private static /* synthetic */ String[] llII;
    private final /* synthetic */ Client B;

    private static void lIIIIIl() {
        llII = new String[llIl[10]];
        b.llII[b.llIl[0]] = b."#.00";
        b.llII[b.llIl[2]] = b."Squire Easy Clues";
        b.llII[b.llIl[3]] = b."Version";
        b.llII[b.llIl[4]] = b."Runtime";
        b.llII[b.llIl[5]] = b."Status:";
        b.llII[b.llIl[6]] = b."Clues completed:";
        b.llII[b.llIl[7]] = b."Profit:";
    }

    private static void lIIIIlI() {
        llIl = new int[12];
        b.llIl[0] = (93 + 67 - 103 + 87 ^ 150 + 141 - 160 + 23) & (0x99 ^ 0x97 ^ (0x67 ^ 0x63) ^ -1);
        b.llIl[1] = 26 + 32 - 56 + 128 ^ 8 + 14 - -59 + 55;
        b.llIl[2] = 1;
        b.llIl[3] = 2;
        b.llIl[4] = 3;
        b.llIl[5] = 0x56 ^ 0x52;
        b.llIl[6] = 0x81 ^ 0xAD ^ (0x76 ^ 0x5F);
        b.llIl[7] = 0x5C ^ 0x28 ^ (0x51 ^ 0x23);
        b.llIl[8] = -(0xFFFFFFF2 & 0x7C6F) & (0xFFFFFD7F & 0x7FE3);
        b.llIl[9] = 0x93 ^ 0x87;
        b.llIl[10] = 0x1F ^ 0x5C ^ (0x1F ^ 0x5B);
        b.llIl[11] = 0x5C ^ 0x54;
    }

    private static boolean lIIIIll(int n2) {
        return n2 != 0;
    }

    private static String llllll(String lllllIllIllIIII, String lllllIllIllIIIl) {
        try {
            SecretKeySpec lllllIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllIllIIIl.getBytes(StandardCharsets.UTF_8)), llIl[11]), "DES");
            Cipher lllllIllIllIlII = Cipher.getInstance("DES");
            lllllIllIllIlII.init(llIl[3], lllllIllIllIlIl);
            return new String(lllllIllIllIlII.doFinal(Base64.getDecoder().decode(lllllIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIllIllIIll) {
            lllllIllIllIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    private b(Client client, Clues clues) {
        this.D = new PanelComponent();
        this.B = client;
        this.C = clues;
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static double a(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(llII[llIl[0]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    static {
        b.lIIIIlI();
        b.lIIIIIl();
    }

    private static boolean lIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.D.getChildren().clear();
        long l2 = System.currentTimeMillis() - Clues.m;
        int n2 = (int)((double)Clues.n * 3600000.0 / (double)l2);
        double d2 = 0.32;
        this.D.setBorder(new Rectangle(llIl[1], llIl[1], llIl[1], llIl[1]));
        this.D.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llII[llIl[2]]).build());
        0;
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[3]]).right("1." + d2).build());
        0;
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[4]]).right(k.b(l2)).build());
        0;
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[5]]).right(Clues.c).build());
        0;
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[6]]).right(k.f(Clues.i) + " (" + b.a(Clues.i, l2) + "/hr)").build());
        0;
        if (b.lIIIIll(Clues.f ? 1 : 0)) {
            this.D.getChildren().add(LineComponent.builder().left(llII[llIl[7]]).right(k.f(Clues.n) + " (" + k.f(n2) + "/hr)").build());
            0;
        }
        int n3 = llIl[8];
        this.D.setPreferredSize(new Dimension(n3 + llIl[9], llIl[0]));
        return this.D.render(graphics2D);
    }

    private static String lIIIIII(String lllllIlllIIIIlI, String lllllIlllIIIllI) {
        lllllIlllIIIIlI = new String(Base64.getDecoder().decode(lllllIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlllIIIlIl = new StringBuilder();
        char[] lllllIlllIIIlII = lllllIlllIIIllI.toCharArray();
        int lllllIlllIIIIll = llIl[0];
        char[] lllllIllIllllIl = lllllIlllIIIIlI.toCharArray();
        int lllllIllIllllII = lllllIllIllllIl.length;
        int lllllIllIlllIll = llIl[0];
        while (b.lIIIlII(lllllIllIlllIll, lllllIllIllllII)) {
            char lllllIlllIIlIII = lllllIllIllllIl[lllllIllIlllIll];
            lllllIlllIIIlIl.append((char)(lllllIlllIIlIII ^ lllllIlllIIIlII[lllllIlllIIIIll % lllllIlllIIIlII.length]));
            0;
            ++lllllIlllIIIIll;
            ++lllllIllIlllIll;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllIlllIIIlIl);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return b.a(d3);
    }
}

