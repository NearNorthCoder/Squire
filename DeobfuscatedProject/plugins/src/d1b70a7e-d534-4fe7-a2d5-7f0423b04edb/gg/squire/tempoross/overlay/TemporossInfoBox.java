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
 */
package gg.squire.tempoross.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tempoross.SquireTempoross;
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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;

public class TemporossInfoBox
extends OverlayPanel {
    private final /* synthetic */ TaskManager ad;
    private final /* synthetic */ a ac;
    private final /* synthetic */ SquireTempoross ab;
    private static /* synthetic */ int[] lIIlllIIIIIlI;
    private static /* synthetic */ String[] lIIlllIIIIIIl;

    private static boolean lIllIIlIIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        TemporossInfoBox.lIllIIlIIIIllIl();
        TemporossInfoBox.lIllIIlIIIIlIll();
    }

    private static String lIllIIlIIIIlIlI(String llllllllllllllIlllIllIIlllllIIll, String llllllllllllllIlllIllIIlllllIIlI) {
        llllllllllllllIlllIllIIlllllIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIlllllIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIIlllllIlIl = llllllllllllllIlllIllIIlllllIIlI.toCharArray();
        int llllllllllllllIlllIllIIlllllIlII = lIIlllIIIIIlI[1];
        char[] llllllllllllllIlllIllIIllllIlllI = llllllllllllllIlllIllIIlllllIIll.toCharArray();
        int llllllllllllllIlllIllIIllllIllIl = llllllllllllllIlllIllIIllllIlllI.length;
        int llllllllllllllIlllIllIIllllIllII = lIIlllIIIIIlI[1];
        while (TemporossInfoBox.lIllIIlIIIlIIII(llllllllllllllIlllIllIIllllIllII, llllllllllllllIlllIllIIllllIllIl)) {
            char llllllllllllllIlllIllIIllllllIIl = llllllllllllllIlllIllIIllllIlllI[llllllllllllllIlllIllIIllllIllII];
            llllllllllllllIlllIllIIlllllIllI.append((char)(llllllllllllllIlllIllIIllllllIIl ^ llllllllllllllIlllIllIIlllllIlIl[llllllllllllllIlllIllIIlllllIlII % llllllllllllllIlllIllIIlllllIlIl.length]));
            "".length();
            ++llllllllllllllIlllIllIIlllllIlII;
            ++llllllllllllllIlllIllIIllllIllII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIlllllIllI);
    }

    private static boolean lIllIIlIIIIlllI(int n2) {
        return n2 == 0;
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.ab.getStarted(), Instant.now());
        if (TemporossInfoBox.lIllIIlIIIIlllI(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (TemporossInfoBox.lIllIIlIIIIllll(this.ab.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0]));
        String string = lIIlllIIIIIIl[lIIlllIIIIIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        "".length();
        int n2 = lIIlllIIIIIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlllIIIIIlI[3], lIIlllIIIIIlI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[4]]).right(String.valueOf(this.ac.B().toElapsedString())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[5]]).right(this.ad.getCurrentTask()).build());
        "".length();
        Object[] objectArray = new Object[lIIlllIIIIIlI[5]];
        objectArray[TemporossInfoBox.lIIlllIIIIIlI[1]] = this.ac.D();
        objectArray[TemporossInfoBox.lIIlllIIIIIlI[4]] = this.g(this.ac.D());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[6]]).right(String.format(lIIlllIIIIIIl[lIIlllIIIIIlI[7]], objectArray)).build());
        "".length();
        Object[] objectArray2 = new Object[lIIlllIIIIIlI[5]];
        objectArray2[TemporossInfoBox.lIIlllIIIIIlI[1]] = this.ac.C();
        objectArray2[TemporossInfoBox.lIIlllIIIIIlI[4]] = this.g(this.ac.C());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[8]]).right(String.format(lIIlllIIIIIIl[lIIlllIIIIIlI[9]], objectArray2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[10]]).right(String.valueOf(this.ac.E())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String lIllIIlIIIIlIIl(String llllllllllllllIlllIllIIllllIIIll, String llllllllllllllIlllIllIIllllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIllllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIllllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIllllIIlIl.init(lIIlllIIIIIlI[5], llllllllllllllIlllIllIIllllIIllI);
            return new String(llllllllllllllIlllIllIIllllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIllllIIlII) {
            llllllllllllllIlllIllIIllllIIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    public TemporossInfoBox(SquireTempoross squireTempoross, a a2) {
        this.ab = squireTempoross;
        this.ac = a2;
        this.ad = squireTempoross.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIllIIlIIIIlIII(String llllllllllllllIlllIllIIlllIlIllI, String llllllllllllllIlllIllIIlllIlIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIlllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIlI[11]), "DES");
            Cipher llllllllllllllIlllIllIIlllIllIII = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIlllIllIII.init(lIIlllIIIIIlI[5], llllllllllllllIlllIllIIlllIllIIl);
            return new String(llllllllllllllIlllIllIIlllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIlllIlIlll) {
            llllllllllllllIlllIllIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIIIllIl() {
        lIIlllIIIIIlI = new int[12];
        TemporossInfoBox.lIIlllIIIIIlI[0] = 0x2E ^ 0x24;
        TemporossInfoBox.lIIlllIIIIIlI[1] = (0x5D ^ 0x15 ^ (0x11 ^ 0x15)) & (0x4E ^ 0x69 ^ (0x42 ^ 0x29) ^ -" ".length());
        TemporossInfoBox.lIIlllIIIIIlI[2] = 2 + 80 - -5 + 106;
        TemporossInfoBox.lIIlllIIIIIlI[3] = 0xB6 ^ 0xC3 ^ (0xDF ^ 0xBE);
        TemporossInfoBox.lIIlllIIIIIlI[4] = " ".length();
        TemporossInfoBox.lIIlllIIIIIlI[5] = "  ".length();
        TemporossInfoBox.lIIlllIIIIIlI[6] = "   ".length();
        TemporossInfoBox.lIIlllIIIIIlI[7] = 0xD9 ^ 0x9C ^ (0x53 ^ 0x12);
        TemporossInfoBox.lIIlllIIIIIlI[8] = 0x90 ^ 0x95;
        TemporossInfoBox.lIIlllIIIIIlI[9] = " ".length() ^ (0x87 ^ 0x80);
        TemporossInfoBox.lIIlllIIIIIlI[10] = 0xB7 ^ 0xB0;
        TemporossInfoBox.lIIlllIIIIIlI[11] = 0x6D ^ 0x43 ^ (4 ^ 0x22);
    }

    private static boolean lIllIIlIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIIIIlIll() {
        lIIlllIIIIIIl = new String[lIIlllIIIIIlI[11]];
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[1]] = TemporossInfoBox.lIllIIlIIIIlIII("u7bjKDWsPDgDFPww6bcCWO70E2Jatvpv", "Oqfuz");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[4]] = TemporossInfoBox.lIllIIlIIIIlIIl("wvzfwPR/b+OPJKMV07lwug==", "OMzjl");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[5]] = TemporossInfoBox.lIllIIlIIIIlIlI("PjsgPWNK", "jZSVY");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[6]] = TemporossInfoBox.lIllIIlIIIIlIlI("OhoiDgwGTyAKSRMOIgkaTg==", "toOli");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[7]] = TemporossInfoBox.lIllIIlIIIIlIII("Wcmf9iFVBhvSrdAzMkqhOA==", "EptrM");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[8]] = TemporossInfoBox.lIllIIlIIIIlIII("RuT+/pJWUKk+XiOxLYjJYQ==", "lmkBr");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[9]] = TemporossInfoBox.lIllIIlIIIIlIIl("ozH+L4Y9y7Ax8yZ0WK02dA==", "wKDpK");
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[10]] = TemporossInfoBox.lIllIIlIIIIlIII("d/CHkICcX0Q=", "AqSLG");
    }
}

