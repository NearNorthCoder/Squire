package gg.squire.minigame.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigame.SquirePestControl;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:gg/squire/minigame/overlay/InfoBox.class */
public class InfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIIIlIIlllIlI;
    private final /* synthetic */ SquirePestControl o;
    private final /* synthetic */ TaskManager n;
    private static /* synthetic */ int[] lIIIlIIlllllI;

    static {
        lIIllllllIIlIII();
        lIIllllllIIIllI();
    }

    public long d(int i) {
        Duration between = Duration.between(this.o.getStarted(), Instant.now());
        if (lIIllllllIIlIlI(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIllllllIIlIIl(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlIIlllIlI[lIIIlIIlllllI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[2]]).right(String.valueOf(this.o.b())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[3]]).right(String.valueOf(this.o.c())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[4]]).right(String.valueOf(d(this.o.c()))).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIIlIIlllllI[5], lIIIlIIlllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIllllllIIIllI() {
        lIIIlIIlllIlI = new String[lIIIlIIlllllI[6]];
        lIIIlIIlllIlI[lIIIlIIlllllI[0]] = lIIllllllIIIIlI("coTbrsLdYJ9lHe0Zxm1t6vqAf+DjrF0V", "wqIKx");
        lIIIlIIlllIlI[lIIIlIIlllllI[1]] = lIIllllllIIIIlI("E3x6lrQ2nAU=", "uVrVx");
        lIIIlIIlllIlI[lIIIlIIlllllI[2]] = lIIllllllIIIIlI("Wo3K+Pb7wZXidkd7m/cmV3wVb/0Abi/j", "pxsph");
        lIIIlIIlllIlI[lIIIlIIlllllI[3]] = lIIllllllIIIlIl("VYxFsmIncQcej4jkDPBnOg==", "vkReQ");
        lIIIlIIlllIlI[lIIIlIIlllllI[4]] = lIIllllllIIIlIl("njeOMZnJ8Ose5OjLfhOoweL0XnT/pqDw", "PaEem");
    }

    private static boolean lIIllllllIIlIIl(int i) {
        return i != 0;
    }

    private static String lIIllllllIIIIlI(String lllllllllllllllIIIIlllIllIlllIlI, String lllllllllllllllIIIIlllIllIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIllIllllII.init(lIIIlIIlllllI[2], secretKeySpec);
            return new String(lllllllllllllllIIIIlllIllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIllIllIllI) {
            lllllllllllllllIIIIlllIllIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllllIIlIlI(int i) {
        return i == 0;
    }

    @Inject
    public InfoBox(TaskManager taskManager, SquirePestControl squirePestControl) {
        this.n = taskManager;
        this.o = squirePestControl;
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static String lIIllllllIIIlIl(String lllllllllllllllIIIIlllIllIlIllIl, String lllllllllllllllIIIIlllIllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllIlIllII.getBytes(StandardCharsets.UTF_8)), lIIIlIIlllllI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIIlllllI[2], lllllllllllllllIIIIlllIllIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIllIlIlllI) {
            lllllllllllllllIIIIlllIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIllllllIIlIII() {
        lIIIlIIlllllI = new int[8];
        lIIIlIIlllllI[0] = ((((146 + 7) - 104) + 164) ^ (((70 + 35) - 67) + 110)) & (((((6 + 197) - 67) + 83) ^ (((91 + 57) - 49) + 55)) ^ (-" ".length()));
        lIIIlIIlllllI[1] = " ".length();
        lIIIlIIlllllI[2] = "  ".length();
        lIIIlIIlllllI[3] = "   ".length();
        lIIIlIIlllllI[4] = 108 ^ 104;
        lIIIlIIlllllI[5] = (-25) & 282;
        lIIIlIIlllllI[6] = (75 ^ 68) ^ (54 ^ 60);
        lIIIlIIlllllI[7] = (((17 + 53) - (-22)) + 35) ^ (20 ^ 99);
    }
}
