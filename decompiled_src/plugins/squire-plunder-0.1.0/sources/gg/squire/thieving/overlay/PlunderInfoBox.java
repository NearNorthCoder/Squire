package gg.squire.thieving.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquirePlunder;
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
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.a;
/* loaded from: squire-plunder-0.1.0.jar:gg/squire/thieving/overlay/PlunderInfoBox.class */
public class PlunderInfoBox extends OverlayPanel {
    private final /* synthetic */ SquirePlunder o;
    private final /* synthetic */ a q;
    private static /* synthetic */ String[] llllllIIlIll;
    private final /* synthetic */ TaskManager p;
    private static /* synthetic */ int[] llllllIIllII;

    private static String lIIlIlIIIIlIllI(String lllllllllllllllIIlIIlllIlIIIIlII, String lllllllllllllllIIlIIlllIlIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllIlIIIIlll) {
            lllllllllllllllIIlIIlllIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIllIll(int i) {
        return i != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIlIlIIIIllIll(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIllII[0], llllllIIllII[0], llllllIIllII[0], llllllIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(llllllIIlIll[llllllIIllII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[2]]).right(llllllIIlIll[llllllIIllII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[4]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[5]]).right(String.valueOf(this.q.e())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[6]]).right(this.p.getCurrentTask()).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llllllIIllII[7] + llllllIIllII[8], llllllIIllII[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIIIIllIII(String lllllllllllllllIIlIIlllIIllllIIl, String lllllllllllllllIIlIIlllIIllllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIIllllIII.getBytes(StandardCharsets.UTF_8)), llllllIIllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIIllII[3], lllllllllllllllIIlIIlllIIlllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllIIllllIlI) {
            lllllllllllllllIIlIIlllIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIlIll = new String[llllllIIllII[9]];
        llllllIIlIll[llllllIIllII[1]] = lIIlIlIIIIlIllI("KsTD8cuBipv+U+SAMPoIg6PvHVOd+LO+", "umPSR");
        llllllIIlIll[llllllIIllII[2]] = lIIlIlIIIIlIlll("MgMFAwQLCA==", "dfwpm");
        llllllIIlIll[llllllIIllII[3]] = lIIlIlIIIIllIII("tOKaXyZMMDw=", "tJCDV");
        llllllIIlIll[llllllIIllII[4]] = lIIlIlIIIIllIII("2OGZebCFs3U=", "ffihy");
        llllllIIlIll[llllllIIllII[5]] = lIIlIlIIIIlIlll("IgE9ITMDBytxIR4XNjV9UQ==", "qbXQG");
        llllllIIlIll[llllllIIllII[6]] = lIIlIlIIIIlIlll("BTcfP3Nx", "QVlTI");
    }

    @Inject
    private PlunderInfoBox(SquirePlunder squirePlunder, a aVar) {
        this.o = squirePlunder;
        this.p = squirePlunder.getManager();
        this.q = aVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIlIlIIIIllIlI() {
        llllllIIllII = new int[11];
        llllllIIllII[0] = 168 ^ 162;
        llllllIIllII[1] = ((122 ^ 31) ^ (16 ^ 35)) & (((170 ^ 156) ^ (54 ^ 86)) ^ (-" ".length()));
        llllllIIllII[2] = " ".length();
        llllllIIllII[3] = "  ".length();
        llllllIIllII[4] = "   ".length();
        llllllIIllII[5] = (178 ^ 134) ^ (126 ^ 78);
        llllllIIllII[6] = (94 ^ 124) ^ (177 ^ 150);
        llllllIIllII[7] = (-29265) & 29522;
        llllllIIllII[8] = 125 ^ 105;
        llllllIIllII[9] = 118 ^ 112;
        llllllIIllII[10] = 156 ^ 148;
    }

    static {
        lIIlIlIIIIllIlI();
        lIIlIlIIIIllIIl();
    }

    private static String lIIlIlIIIIlIlll(String lllllllllllllllIIlIIlllIlIIllIll, String lllllllllllllllIIlIIlllIlIIllIlI) {
        String lllllllllllllllIIlIIlllIlIIllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlllIlIIllIIl = new StringBuilder();
        char[] lllllllllllllllIIlIIlllIlIIllIII = lllllllllllllllIIlIIlllIlIIllIlI.toCharArray();
        int lllllllllllllllIIlIIlllIlIIlIlll = llllllIIllII[1];
        char[] charArray = lllllllllllllllIIlIIlllIlIIllIll2.toCharArray();
        int lllllllllllllllIIlIIlllIlIIlIIII = charArray.length;
        int lllllllllllllllIIlIIlllIlIIIllll = llllllIIllII[1];
        while (lIIlIlIIIIlllII(lllllllllllllllIIlIIlllIlIIIllll, lllllllllllllllIIlIIlllIlIIlIIII)) {
            lllllllllllllllIIlIIlllIlIIllIIl.append((char) (charArray[lllllllllllllllIIlIIlllIlIIIllll] ^ lllllllllllllllIIlIIlllIlIIllIII[lllllllllllllllIIlIIlllIlIIlIlll % lllllllllllllllIIlIIlllIlIIllIII.length]));
            "".length();
            lllllllllllllllIIlIIlllIlIIlIlll++;
            lllllllllllllllIIlIIlllIlIIIllll++;
            "".length();
            if ("  ".length() > (45 ^ 41)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIlllIlIIllIIl);
    }

    private static boolean lIIlIlIIIIlllII(int i, int i2) {
        return i < i2;
    }
}
