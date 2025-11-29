package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:gg/squire/quest/overlay/QuesterInfoBox.class */
public class QuesterInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] lIIIllIIIlIIl;
    private static /* synthetic */ String[] lIIIllIIIlIII;
    private final /* synthetic */ TaskManager af;

    private static void lIlIIIIllIIllll() {
        lIIIllIIIlIIl = new int[7];
        lIIIllIIIlIIl[0] = (227 ^ 189) & ((227 ^ 189) ^ (-1));
        lIIIllIIIlIIl[1] = " ".length();
        lIIIllIIIlIIl[2] = "  ".length();
        lIIIllIIIlIIl[3] = "   ".length();
        lIIIllIIIlIIl[4] = (-((-3738) & 24287)) & (-11905) & 32711;
        lIIIllIIIlIIl[5] = (((176 + 196) - 360) + 185) ^ (((21 + 79) - 29) + 122);
        lIIIllIIIlIIl[6] = 35 ^ 43;
    }

    private static String lIlIIIIllIIlIll(String lllllllllllllllIIIIlIllIlIIllllI, String lllllllllllllllIIIIlIllIlIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIlIIlllll.getBytes(StandardCharsets.UTF_8)), lIIIllIIIlIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIIlIIl[2], lllllllllllllllIIIIlIllIlIlIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllIlIlIIIIl) {
            lllllllllllllllIIIIlIllIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIllIIIlIII[lIIIllIIIlIIl[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIllIIIlIII[lIIIllIIIlIIl[1]]).right(lIIIllIIIlIII[lIIIllIIIlIIl[2]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIllIIIlIII[lIIIllIIIlIIl[3]]).right(this.af.getCurrentTask()).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIIllIIIlIIl[4], lIIIllIIIlIIl[0]));
        return super.render(graphics2D);
    }

    private static String lIlIIIIllIIllIl(String lllllllllllllllIIIIlIllIlIIlIIII, String lllllllllllllllIIIIlIllIlIIIllll) {
        String lllllllllllllllIIIIlIllIlIIlIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIllIlIIIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIllIlIIIllll.toCharArray();
        int lllllllllllllllIIIIlIllIlIIIllII = lIIIllIIIlIIl[0];
        char[] charArray2 = lllllllllllllllIIIIlIllIlIIlIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIIlIIl[0];
        while (lIlIIIIllIlIIII(i, length)) {
            char lllllllllllllllIIIIlIllIlIIlIIIl = charArray2[i];
            lllllllllllllllIIIIlIllIlIIIlllI.append((char) (lllllllllllllllIIIIlIllIlIIlIIIl ^ charArray[lllllllllllllllIIIIlIllIlIIIllII % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIllIlIIIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIllIlIIIlllI);
    }

    private static void lIlIIIIllIIlllI() {
        lIIIllIIIlIII = new String[lIIIllIIIlIIl[5]];
        lIIIllIIIlIII[lIIIllIIIlIIl[0]] = lIlIIIIllIIlIll("34cVSdZ3g2ni7d7uggfa/g==", "OIrqj");
        lIIIllIIIlIII[lIIIllIIIlIIl[1]] = lIlIIIIllIIlIll("2aZAzE/zIS4=", "MNmls");
        lIIIllIIIlIII[lIIIllIIIlIIl[2]] = lIlIIIIllIIllII("IrngkAUNPqc=", "CGSkx");
        lIIIllIIIlIII[lIIIllIIIlIIl[3]] = lIlIIIIllIIllIl("PSY0HX9J", "iGGvE");
    }

    private static boolean lIlIIIIllIlIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIIIIllIIllll();
        lIlIIIIllIIlllI();
    }

    private static String lIlIIIIllIIllII(String lllllllllllllllIIIIlIllIlIlIllIl, String lllllllllllllllIIIIlIllIlIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIIIlIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllIlIlIlllI) {
            lllllllllllllllIIIIlIllIlIlIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public QuesterInfoBox(SquireQuester squireQuester) {
        this.af = squireQuester.getManager();
        setPosition(OverlayPosition.TOP_LEFT);
    }
}
