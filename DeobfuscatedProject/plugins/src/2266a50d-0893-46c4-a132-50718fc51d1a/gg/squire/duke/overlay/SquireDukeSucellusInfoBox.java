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
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class SquireDukeSucellusInfoBox
extends OverlayPanel {
    private /* synthetic */ a u;
    private static /* synthetic */ String[] lIllIlIIIlIl;
    private static /* synthetic */ int[] lIllIlIIIllI;
    private final /* synthetic */ TaskManager ad;
    private final /* synthetic */ SquireDukeSucellus ac;
    private final /* synthetic */ SquireDukeSucellusConfig ae;

    private static void lllIIllIlllIIl() {
        lIllIlIIIlIl = new String[lIllIlIIIllI[8]];
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[1]] = SquireDukeSucellusInfoBox.lllIIllIllIllI("rXvsqaiQNTqkBrd7BPrMaewiOJ3vevLp", "WvXeK");
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[4]] = SquireDukeSucellusInfoBox.lllIIllIllIllI("ZloP3saGColNSsOQJLSuvw==", "CYzAo");
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[5]] = SquireDukeSucellusInfoBox.lllIIllIllIlll("PhgjCwtPUQ==", "uqOgx");
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[6]] = SquireDukeSucellusInfoBox.lllIIllIllIlll("YQN5XUpqVj9aB20=", "DgYuo");
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[7]] = SquireDukeSucellusInfoBox.lllIIllIlllIII("NXq13ZUEb1o=", "iHFBw");
    }

    public long e(int n2) {
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        if (SquireDukeSucellusInfoBox.lllIIllIllllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lllIIllIlllIll(int n2) {
        return n2 != 0;
    }

    public double f(int n2) {
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        if (SquireDukeSucellusInfoBox.lllIIllIllllII(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean lllIIllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIllIlllIII(String lllllllllllllllIlIllllllIlIIIIlI, String lllllllllllllllIlIllllllIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllllllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllllIlIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllllIlIIIllI.init(lIllIlIIIllI[5], lllllllllllllllIlIllllllIlIIIlll);
            return new String(lllllllllllllllIlIllllllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllllIlIIIlIl) {
            lllllllllllllllIlIllllllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIllIllI(String lllllllllllllllIlIllllllIIllIlll, String lllllllllllllllIlIllllllIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllllllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllIIllIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIIIllI[9]), "DES");
            Cipher lllllllllllllllIlIllllllIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllllllIIlllIIl.init(lIllIlIIIllI[5], lllllllllllllllIlIllllllIIlllIlI);
            return new String(lllllllllllllllIlIllllllIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllllIIlllIII) {
            lllllllllllllllIlIllllllIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIllIlll(String lllllllllllllllIlIllllllIlIllIIl, String lllllllllllllllIlIllllllIlIllIII) {
        lllllllllllllllIlIllllllIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllllIlIlIlll = new StringBuilder();
        char[] lllllllllllllllIlIllllllIlIlIllI = lllllllllllllllIlIllllllIlIllIII.toCharArray();
        int lllllllllllllllIlIllllllIlIlIlIl = lIllIlIIIllI[1];
        char[] lllllllllllllllIlIllllllIlIIllll = lllllllllllllllIlIllllllIlIllIIl.toCharArray();
        int lllllllllllllllIlIllllllIlIIlllI = lllllllllllllllIlIllllllIlIIllll.length;
        int lllllllllllllllIlIllllllIlIIllIl = lIllIlIIIllI[1];
        while (SquireDukeSucellusInfoBox.lllIIllIllllIl(lllllllllllllllIlIllllllIlIIllIl, lllllllllllllllIlIllllllIlIIlllI)) {
            char lllllllllllllllIlIllllllIlIllIlI = lllllllllllllllIlIllllllIlIIllll[lllllllllllllllIlIllllllIlIIllIl];
            lllllllllllllllIlIllllllIlIlIlll.append((char)(lllllllllllllllIlIllllllIlIllIlI ^ lllllllllllllllIlIllllllIlIlIllI[lllllllllllllllIlIllllllIlIlIlIl % lllllllllllllllIlIllllllIlIlIllI.length]));
            "".length();
            ++lllllllllllllllIlIllllllIlIlIlIl;
            ++lllllllllllllllIlIllllllIlIIllIl;
            "".length();
            if ((0xEF ^ 0xB1 ^ (0xEA ^ 0xB0)) != ((17 + 119 - 10 + 12 ^ 43 + 129 - 82 + 55) & (113 + 96 - 67 + 12 ^ 32 + 115 - 72 + 54 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllllllIlIlIlll);
    }

    private static void lllIIllIlllIlI() {
        lIllIlIIIllI = new int[10];
        SquireDukeSucellusInfoBox.lIllIlIIIllI[0] = 3 ^ 0x2F ^ (4 ^ 0x22);
        SquireDukeSucellusInfoBox.lIllIlIIIllI[1] = (57 + 10 - -40 + 47 ^ 117 + 40 - 0 + 26) & (54 + 66 - 23 + 43 ^ 112 + 130 - 220 + 139 ^ -" ".length());
        SquireDukeSucellusInfoBox.lIllIlIIIllI[2] = 134 + 79 - 36 + 16;
        SquireDukeSucellusInfoBox.lIllIlIIIllI[3] = 68 + 26 - -11 + 24 ^ 56 + 47 - 40 + 86;
        SquireDukeSucellusInfoBox.lIllIlIIIllI[4] = " ".length();
        SquireDukeSucellusInfoBox.lIllIlIIIllI[5] = "  ".length();
        SquireDukeSucellusInfoBox.lIllIlIIIllI[6] = "   ".length();
        SquireDukeSucellusInfoBox.lIllIlIIIllI[7] = 0xAD ^ 0xA9;
        SquireDukeSucellusInfoBox.lIllIlIIIllI[8] = 0x2D ^ 0x1F ^ (0xBC ^ 0x8B);
        SquireDukeSucellusInfoBox.lIllIlIIIllI[9] = 109 + 24 - 124 + 153 ^ 53 + 147 - 89 + 59;
    }

    @Inject
    public SquireDukeSucellusInfoBox(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig, a a2) {
        this.ac = squireDukeSucellus;
        this.ad = squireDukeSucellus.getManager();
        this.ae = squireDukeSucellusConfig;
        this.u = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lllIIllIllllII(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireDukeSucellusInfoBox.lllIIllIlllIll(this.ac.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIlIIIllI[0], lIllIlIIIllI[0], lIllIlIIIllI[0], lIllIlIIIllI[0]));
        String string = lIllIlIIIlIl[lIllIlIIIllI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        "".length();
        int n2 = lIllIlIIIllI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIllIlIIIllI[3], lIllIlIIIllI[1]));
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[4]]).right(Time.format((Duration)duration)).build());
        "".length();
        int n3 = this.ac.o();
        double d2 = this.f(n3);
        Object[] objectArray = new Object[lIllIlIIIllI[5]];
        objectArray[SquireDukeSucellusInfoBox.lIllIlIIIllI[1]] = n3;
        objectArray[SquireDukeSucellusInfoBox.lIllIlIIIllI[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[5]]).right(String.format(lIllIlIIIlIl[lIllIlIIIllI[6]], objectArray)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[7]]).right(this.ad.getCurrentTask()).build());
        "".length();
        int n4 = Static.getClient().getTickCount();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Last spike: " + (n4 - this.u.D())).right("Last Gaze: " + (n4 - this.u.C())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.ac.l()).left("Banking: " + this.ac.p()).build());
        "".length();
        return super.render(graphics2D);
    }

    static {
        SquireDukeSucellusInfoBox.lllIIllIlllIlI();
        SquireDukeSucellusInfoBox.lllIIllIlllIIl();
    }
}

