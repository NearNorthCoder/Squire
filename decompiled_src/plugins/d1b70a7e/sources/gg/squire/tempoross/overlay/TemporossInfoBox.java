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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.a;
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:gg/squire/tempoross/overlay/TemporossInfoBox.class */
public class TemporossInfoBox extends OverlayPanel {
    private final /* synthetic */ TaskManager ad;
    private final /* synthetic */ a ac;
    private final /* synthetic */ SquireTempoross ab;
    private static /* synthetic */ int[] lIIlllIIIIIlI;
    private static /* synthetic */ String[] lIIlllIIIIIIl;

    private static boolean lIllIIlIIIIllll(int i) {
        return i != 0;
    }

    static {
        lIllIIlIIIIllIl();
        lIllIIlIIIIlIll();
    }

    private static String lIllIIlIIIIlIlI(String llllllllllllllIlllIllIIllllllIII, String llllllllllllllIlllIllIIlllllIlll) {
        String llllllllllllllIlllIllIIllllllIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIIlllllIlIl = llllllllllllllIlllIllIIlllllIlll.toCharArray();
        int llllllllllllllIlllIllIIlllllIlII = lIIlllIIIIIlI[1];
        char[] charArray = llllllllllllllIlllIllIIllllllIII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIlllIllIIllllIllII = lIIlllIIIIIlI[1];
        while (lIllIIlIIIlIIII(llllllllllllllIlllIllIIllllIllII, length)) {
            char llllllllllllllIlllIllIIllllllIIl = charArray[llllllllllllllIlllIllIIllllIllII];
            sb.append((char) (llllllllllllllIlllIllIIllllllIIl ^ llllllllllllllIlllIllIIlllllIlIl[llllllllllllllIlllIllIIlllllIlII % llllllllllllllIlllIllIIlllllIlIl.length]));
            "".length();
            llllllllllllllIlllIllIIlllllIlII++;
            llllllllllllllIlllIllIIllllIllII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIIIIlllI(int i) {
        return i == 0;
    }

    public double g(int i) {
        Duration between = Duration.between(this.ab.getStarted(), Instant.now());
        if (lIllIIlIIIIlllI(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIllIIlIIIIllll(this.ab.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllIIIIIIl[lIIlllIIIIIlI[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIlllIIIIIlI[2] + lIIlllIIIIIlI[3], lIIlllIIIIIlI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[4]]).right(String.valueOf(this.ac.B().toElapsedString())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[5]]).right(this.ad.getCurrentTask()).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[6]]);
        String str = lIIlllIIIIIIl[lIIlllIIIIIlI[7]];
        Object[] objArr = new Object[lIIlllIIIIIlI[5]];
        objArr[lIIlllIIIIIlI[1]] = Integer.valueOf(this.ac.D());
        objArr[lIIlllIIIIIlI[4]] = Double.valueOf(g(this.ac.D()));
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[8]]);
        String str2 = lIIlllIIIIIIl[lIIlllIIIIIlI[9]];
        Object[] objArr2 = new Object[lIIlllIIIIIlI[5]];
        objArr2[lIIlllIIIIIlI[1]] = Integer.valueOf(this.ac.C());
        objArr2[lIIlllIIIIIlI[4]] = Double.valueOf(g(this.ac.C()));
        children2.add(left2.right(String.format(str2, objArr2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[10]]).right(String.valueOf(this.ac.E())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String lIllIIlIIIIlIIl(String llllllllllllllIlllIllIIllllIIIll, String llllllllllllllIlllIllIIllllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIIIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIllllIIlII) {
            llllllllllllllIlllIllIIllllIIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    public TemporossInfoBox(SquireTempoross squireTempoross, a aVar) {
        this.ab = squireTempoross;
        this.ac = aVar;
        this.ad = squireTempoross.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIllIIlIIIIlIII(String llllllllllllllIlllIllIIlllIlIllI, String llllllllllllllIlllIllIIlllIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIlI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIIIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlllIlIlll) {
            llllllllllllllIlllIllIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIIIllIl() {
        lIIlllIIIIIlI = new int[12];
        lIIlllIIIIIlI[0] = 46 ^ 36;
        lIIlllIIIIIlI[1] = ((93 ^ 21) ^ (17 ^ 21)) & (((78 ^ 105) ^ (66 ^ 41)) ^ (-" ".length()));
        lIIlllIIIIIlI[2] = ((2 + 80) - (-5)) + 106;
        lIIlllIIIIIlI[3] = (182 ^ 195) ^ (223 ^ 190);
        lIIlllIIIIIlI[4] = " ".length();
        lIIlllIIIIIlI[5] = "  ".length();
        lIIlllIIIIIlI[6] = "   ".length();
        lIIlllIIIIIlI[7] = (217 ^ 156) ^ (83 ^ 18);
        lIIlllIIIIIlI[8] = 144 ^ 149;
        lIIlllIIIIIlI[9] = " ".length() ^ (135 ^ 128);
        lIIlllIIIIIlI[10] = 183 ^ 176;
        lIIlllIIIIIlI[11] = (109 ^ 67) ^ (4 ^ 34);
    }

    private static boolean lIllIIlIIIlIIII(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIlIIIIlIll() {
        lIIlllIIIIIIl = new String[lIIlllIIIIIlI[11]];
        lIIlllIIIIIIl[lIIlllIIIIIlI[1]] = lIllIIlIIIIlIII("u7bjKDWsPDgDFPww6bcCWO70E2Jatvpv", "Oqfuz");
        lIIlllIIIIIIl[lIIlllIIIIIlI[4]] = lIllIIlIIIIlIIl("wvzfwPR/b+OPJKMV07lwug==", "OMzjl");
        lIIlllIIIIIIl[lIIlllIIIIIlI[5]] = lIllIIlIIIIlIlI("PjsgPWNK", "jZSVY");
        lIIlllIIIIIIl[lIIlllIIIIIlI[6]] = lIllIIlIIIIlIlI("OhoiDgwGTyAKSRMOIgkaTg==", "toOli");
        lIIlllIIIIIIl[lIIlllIIIIIlI[7]] = lIllIIlIIIIlIII("Wcmf9iFVBhvSrdAzMkqhOA==", "EptrM");
        lIIlllIIIIIIl[lIIlllIIIIIlI[8]] = lIllIIlIIIIlIII("RuT+/pJWUKk+XiOxLYjJYQ==", "lmkBr");
        lIIlllIIIIIIl[lIIlllIIIIIlI[9]] = lIllIIlIIIIlIIl("ozH+L4Y9y7Ax8yZ0WK02dA==", "wKDpK");
        lIIlllIIIIIIl[lIIlllIIIIIlI[10]] = lIllIIlIIIIlIII("d/CHkICcX0Q=", "AqSLG");
    }
}
