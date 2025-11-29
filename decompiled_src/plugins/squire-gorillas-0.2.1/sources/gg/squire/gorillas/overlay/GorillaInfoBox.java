package gg.squire.gorillas.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.gorillas.SquireGorillaPlugin;
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
/* loaded from: squire-gorillas-0.2.1.jar:gg/squire/gorillas/overlay/GorillaInfoBox.class */
public class GorillaInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] llIIlIlIIIIl;
    private final /* synthetic */ TaskManager Q;
    private final /* synthetic */ SquireGorillaPlugin P;
    private static /* synthetic */ int[] llIIlIlIIIlI;

    public Dimension render(Graphics2D graphics2D) {
        if (lllllIlIlIIIIl(this.P.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.P.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llIIlIlIIIlI[0], llIIlIlIIIlI[0], llIIlIlIIIlI[0], llIIlIlIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIlIlIIIIl[llIIlIlIIIlI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[2]]).right(llIIlIlIIIIl[llIIlIlIIIlI[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[4]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[5]]).right(this.Q.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[6]]).right(String.valueOf(this.P.i())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llIIlIlIIIlI[7] + llIIlIlIIIlI[8], llIIlIlIIIlI[1]));
        return super.render(graphics2D);
    }

    private static String lllllIlIIlllIl(String lllllllllllllllIlIIlllllIIllllIl, String lllllllllllllllIlIIlllllIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllllIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllIIllllII.getBytes(StandardCharsets.UTF_8)), llIIlIlIIIlI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlIIIlI[3], lllllllllllllllIlIIlllllIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllllIIlllllI) {
            lllllllllllllllIlIIlllllIIlllllI.printStackTrace();
            return null;
        }
    }

    private static String lllllIlIIlllII(String lllllllllllllllIlIIlllllIlIIlIlI, String lllllllllllllllIlIIlllllIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlIIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllllIlIIlIll) {
            lllllllllllllllIlIIlllllIlIIlIll.printStackTrace();
            return null;
        }
    }

    static {
        lllllIlIlIIIII();
        lllllIlIIlllll();
    }

    private static boolean lllllIlIlIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lllllIlIIlllll() {
        llIIlIlIIIIl = new String[llIIlIlIIIlI[9]];
        llIIlIlIIIIl[llIIlIlIIIlI[1]] = lllllIlIIlllII("jYPsHzTZicND18hkmnZgXw==", "rTKrr");
        llIIlIlIIIIl[llIIlIlIIIlI[2]] = lllllIlIIlllIl("0FdaQoFeLrk=", "cqGYJ");
        llIIlIlIIIIl[llIIlIlIIIlI[3]] = lllllIlIIlllIl("9U5l3bVRYXQ=", "lxPIS");
        llIIlIlIIIIl[llIIlIlIIIlI[4]] = lllllIlIIllllI("PC0IGTADPQ==", "nXfmY");
        llIIlIlIIIIl[llIIlIlIIIlI[5]] = lllllIlIIlllIl("8v+JxEPyRwM=", "slRsb");
        llIIlIlIIIIl[llIIlIlIIIlI[6]] = lllllIlIIllllI("HgUOAwc=", "Ulbot");
    }

    @Inject
    private GorillaInfoBox(SquireGorillaPlugin squireGorillaPlugin) {
        this.P = squireGorillaPlugin;
        this.Q = squireGorillaPlugin.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lllllIlIlIIIIl(int i) {
        return i != 0;
    }

    private static String lllllIlIIllllI(String lllllllllllllllIlIIlllllIlIlllll, String lllllllllllllllIlIIlllllIlIllllI) {
        String lllllllllllllllIlIIlllllIlIlllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllIlIlllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlllllIlIllllI.toCharArray();
        int lllllllllllllllIlIIlllllIlIllIll = llIIlIlIIIlI[1];
        char[] charArray2 = lllllllllllllllIlIIlllllIlIlllll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlIIIlI[1];
        while (lllllIlIlIIIlI(i, length)) {
            char lllllllllllllllIlIIlllllIllIIIII = charArray2[i];
            lllllllllllllllIlIIlllllIlIlllIl.append((char) (lllllllllllllllIlIIlllllIllIIIII ^ charArray[lllllllllllllllIlIIlllllIlIllIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIlllllIlIllIll++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllllIlIlllIl);
    }

    private static void lllllIlIlIIIII() {
        llIIlIlIIIlI = new int[11];
        llIIlIlIIIlI[0] = 53 ^ 63;
        llIIlIlIIIlI[1] = (114 ^ 83) & ((10 ^ 43) ^ (-1));
        llIIlIlIIIlI[2] = " ".length();
        llIIlIlIIIlI[3] = "  ".length();
        llIIlIlIIIlI[4] = "   ".length();
        llIIlIlIIIlI[5] = 36 ^ 32;
        llIIlIlIIIlI[6] = 94 ^ 91;
        llIIlIlIIIlI[7] = (-((-6146) & 7935)) & (-1) & 2047;
        llIIlIlIIIlI[8] = (90 ^ 24) ^ (232 ^ 190);
        llIIlIlIIIlI[9] = (29 ^ 78) ^ (86 ^ 3);
        llIIlIlIIIlI[10] = 91 ^ 83;
    }
}
