package gg.squire.sepulchre.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
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
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:gg/squire/sepulchre/overlay/SquireSepulchreInfoBox.class */
public class SquireSepulchreInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireSepulchre aa;
    private static /* synthetic */ String[] lllIIlIllIII;
    private static /* synthetic */ int[] lllIIlIllIIl;
    private final /* synthetic */ TaskManager ab;
    private final /* synthetic */ SquireSepulchreConfig ac;

    private static boolean lIIIlIlIIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIlIIIlIlll(int i) {
        return i != 0;
    }

    private static String lIIIlIlIIIlIIlI(String lllllllllllllllIIllIlIlIlIIIlIlI, String lllllllllllllllIIllIlIlIlIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIlIllIIl[9]), "DES");
            Cipher lllllllllllllllIIllIlIlIlIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlIlIIIllII.init(lllIIlIllIIl[5], secretKeySpec);
            return new String(lllllllllllllllIIllIlIlIlIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlIlIIIIllI) {
            lllllllllllllllIIllIlIlIlIIIIllI.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIlIIIlIllI();
        lIIIlIlIIIlIlIl();
    }

    private static String lIIIlIlIIIlIIll(String lllllllllllllllIIllIlIlIIllIllIl, String lllllllllllllllIIllIlIlIIllIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIlIIllIllII.toCharArray();
        int lllllllllllllllIIllIlIlIIllIlIIl = lllIIlIllIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIlIllIIl[1];
        while (lIIIlIlIIIllIIl(i, length)) {
            char lllllllllllllllIIllIlIlIIllIlllI = charArray2[i];
            sb.append((char) (lllllllllllllllIIllIlIlIIllIlllI ^ charArray[lllllllllllllllIIllIlIlIIllIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIlIIllIlIIl++;
            i++;
            "".length();
            if (((6 ^ 42) & ((33 ^ 13) ^ (-1))) == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlIlIIIlIlII(String lllllllllllllllIIllIlIlIIlllllIl, String lllllllllllllllIIllIlIlIIlllllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlIIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlIIlllllll.init(lllIIlIllIIl[5], lllllllllllllllIIllIlIlIlIIIIIII);
            return new String(lllllllllllllllIIllIlIlIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlIIllllllI) {
            lllllllllllllllIIllIlIlIIllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIIlIlIl() {
        lllIIlIllIII = new String[lllIIlIllIIl[8]];
        lllIIlIllIII[lllIIlIllIIl[1]] = lIIIlIlIIIlIIlI("7R/BeHEQ3ac5lKf3TzbncjqNTSlc+WYYhCDzVr7eXyI=", "HxmwY");
        lllIIlIllIII[lllIIlIllIIl[4]] = lIIIlIlIIIlIIll("FSceEBgsLFY=", "CBlcq");
        lllIIlIllIII[lllIIlIllIIl[5]] = lIIIlIlIIIlIlII("gwiUuSxckXU=", "MbTcx");
        lllIIlIllIII[lllIIlIllIIl[6]] = lIIIlIlIIIlIIll("EwIDLTosElc=", "AwmYS");
        lllIIlIllIII[lllIIlIllIIl[7]] = lIIIlIlIIIlIIlI("LYDixdCG+c5HAkamKamjkw==", "znmlq");
    }

    @Inject
    public SquireSepulchreInfoBox(SquireSepulchre squireSepulchre, TaskManager taskManager, SquireSepulchreConfig squireSepulchreConfig) {
        this.aa = squireSepulchre;
        this.ab = squireSepulchre.getManager();
        this.ac = squireSepulchreConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int i) {
        Duration between = Duration.between(this.aa.getStarted(), Instant.now());
        if (lIIIlIlIIIllIII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIIllIII(int i) {
        return i == 0;
    }

    private static void lIIIlIlIIIlIllI() {
        lllIIlIllIIl = new int[10];
        lllIIlIllIIl[0] = (62 ^ 51) ^ (152 ^ 159);
        lllIIlIllIIl[1] = (184 ^ 171) & ((101 ^ 118) ^ (-1));
        lllIIlIllIIl[2] = ((65 + 182) - 129) + 75;
        lllIIlIllIIl[3] = 15 ^ 27;
        lllIIlIllIIl[4] = " ".length();
        lllIIlIllIIl[5] = "  ".length();
        lllIIlIllIIl[6] = "   ".length();
        lllIIlIllIIl[7] = (((45 + 38) - 51) + 120) ^ (((154 + 96) - 118) + 24);
        lllIIlIllIIl[8] = (((16 + 106) - 3) + 8) ^ (95 ^ 37);
        lllIIlIllIIl[9] = 47 ^ 39;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIIlIlIIIlIlll(this.aa.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIlIllIII[lllIIlIllIIl[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIIlIllIIl[2] + lllIIlIllIIl[3], lllIIlIllIIl[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[4]]).right(lllIIlIllIII[lllIIlIllIIl[5]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[6]]).right(Time.format(Duration.between(this.aa.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[7]]).right(this.aa.getName()).build());
        "".length();
        return super.render(graphics2D);
    }
}
