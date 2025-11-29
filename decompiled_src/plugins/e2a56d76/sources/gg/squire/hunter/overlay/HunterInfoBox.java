package gg.squire.hunter.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.hunter.SquireHunter;
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
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:gg/squire/hunter/overlay/HunterInfoBox.class */
public class HunterInfoBox extends OverlayPanel {
    private final /* synthetic */ TaskManager t;
    private static /* synthetic */ String[] lllIlllIIIII;
    private static /* synthetic */ int[] lllIlllIIIIl;
    private final /* synthetic */ SquireHunter s;

    public long c(int i) {
        Duration between = Duration.between(this.s.getStarted(), Instant.now());
        if (lIIIllIllIlIllI(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIllIllIlIlIl(int i) {
        return i != 0;
    }

    private static void lIIIllIllIlIIll() {
        lllIlllIIIII = new String[lllIlllIIIIl[9]];
        lllIlllIIIII[lllIlllIIIIl[1]] = lIIIllIllIlIIIl("PO1fo5wNcIQaiu897B5a2w==", "gvTzA");
        lllIlllIIIII[lllIlllIIIIl[2]] = lIIIllIllIlIIlI("33Reu5jIhho=", "DJSZR");
        lllIlllIIIII[lllIlllIIIIl[3]] = lIIIllIllIlIIlI("ALRxjoy1pX8=", "hCarM");
        lllIlllIIIII[lllIlllIIIIl[4]] = lIIIllIllIlIIIl("vTvUI9PbTYw=", "wowiU");
        lllIlllIIIII[lllIlllIIIIl[5]] = lIIIllIllIlIIlI("KB9dOem5DpM=", "jrrCc");
        lllIlllIIIII[lllIlllIIIIl[6]] = lIIIllIllIlIIlI("08yr8GWo92t3N285UERujw==", "KMcFT");
    }

    static {
        lIIIllIllIlIlII();
        lIIIllIllIlIIll();
    }

    private static boolean lIIIllIllIlIllI(int i) {
        return i == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIIllIllIlIlIl(this.s.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.s.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlllIIIIl[0], lllIlllIIIIl[0], lllIlllIIIIl[0], lllIlllIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(lllIlllIIIII[lllIlllIIIIl[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[2]]).right(lllIlllIIIII[lllIlllIIIIl[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[4]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[5]]).right(this.t.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[6]]).right(this.s.a() + " (" + c(this.s.a()) + "/hr)").build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIlllIIIIl[7] + lllIlllIIIIl[8], lllIlllIIIIl[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HunterInfoBox(SquireHunter squireHunter) {
        this.s = squireHunter;
        this.t = squireHunter.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIIllIllIlIIIl(String lllllllllllllllIIlIlllIlIIIllIII, String lllllllllllllllIIlIlllIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIlIIIllIlI.init(lllIlllIIIIl[3], lllllllllllllllIIlIlllIlIIIllIll);
            return new String(lllllllllllllllIIlIlllIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIIIllIIl) {
            lllllllllllllllIIlIlllIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIllIlIIlI(String lllllllllllllllIIlIlllIlIIIIlIll, String lllllllllllllllIIlIlllIlIIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlllIIIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlllIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIIIIllII) {
            lllllllllllllllIIlIlllIlIIIIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIllIlIlII() {
        lllIlllIIIIl = new int[11];
        lllIlllIIIIl[0] = 124 ^ 118;
        lllIlllIIIIl[1] = ((59 ^ 65) ^ (43 ^ 71)) & (((((101 + 11) - 32) + 59) ^ (((91 + 14) - (-33)) + 19)) ^ (-" ".length()));
        lllIlllIIIIl[2] = " ".length();
        lllIlllIIIIl[3] = "  ".length();
        lllIlllIIIIl[4] = "   ".length();
        lllIlllIIIIl[5] = 125 ^ 121;
        lllIlllIIIIl[6] = (219 ^ 189) ^ (104 ^ 11);
        lllIlllIIIIl[7] = (-((-4513) & 32229)) & (-657) & 28630;
        lllIlllIIIIl[8] = 109 ^ 121;
        lllIlllIIIIl[9] = 78 ^ 72;
        lllIlllIIIIl[10] = (((125 + 21) - 114) + 174) ^ (((101 + 107) - 107) + 97);
    }
}
