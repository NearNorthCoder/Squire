package gg.squire.toa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.toa.SquireTOA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
@Singleton
/* loaded from: squire-toa-1.0.1.jar:gg/squire/toa/overlay/debug/DebugOverlay.class */
public class DebugOverlay extends OverlayPanel {
    private final /* synthetic */ TaskManager aK;
    private static /* synthetic */ int[] lIIllllllIIII;
    private static /* synthetic */ String[] lIIlllllIllll;
    private final /* synthetic */ SquireTOA aJ;

    private static void lIllIlIlIlIIIll() {
        lIIllllllIIII = new int[4];
        lIIllllllIIII[0] = (106 ^ 83) & ((248 ^ 193) ^ (-1));
        lIIllllllIIII[1] = " ".length();
        lIIllllllIIII[2] = "  ".length();
        lIIllllllIIII[3] = (((60 + 14) - (-11)) + 83) ^ (((130 + 148) - 276) + 158);
    }

    private static boolean lIllIlIlIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIllIlIlIlIIIII(String llllllllllllllIlllIIlllllIlllIlI, String llllllllllllllIlllIIlllllIlllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllllIlllIIl.getBytes(StandardCharsets.UTF_8)), lIIllllllIIII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllllIIII[2], llllllllllllllIlllIIlllllIllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlllllIlllIll) {
            llllllllllllllIlllIIlllllIlllIll.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlIlIlIIIll();
        lIllIlIlIlIIIlI();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIllIlIlIlIIlII(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIII[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIII[1]]).right(this.aK.getCurrentTask()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean lIllIlIlIlIIlII(int i) {
        return i != 0;
    }

    @Inject
    protected DebugOverlay(SquireTOA squireTOA) {
        this.aJ = squireTOA;
        this.aK = squireTOA.getManager();
        setPosition(OverlayPosition.TOP_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    private static void lIllIlIlIlIIIlI() {
        lIIlllllIllll = new String[lIIllllllIIII[2]];
        lIIlllllIllll[lIIllllllIIII[0]] = lIllIlIlIlIIIII("YhMlDzXDmoOOBsljPCWQhQ==", "rohmP");
        lIIlllllIllll[lIIllllllIIII[1]] = lIllIlIlIlIIIIl("MiwZEwkQJAIbAUIdCgYN", "bIkuf");
    }

    private static String lIllIlIlIlIIIIl(String llllllllllllllIlllIIllllllIIllll, String llllllllllllllIlllIIllllllIIlllI) {
        String llllllllllllllIlllIIllllllIIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllllllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllllllIIlllI.toCharArray();
        int llllllllllllllIlllIIllllllIIlIll = lIIllllllIIII[0];
        char[] charArray2 = llllllllllllllIlllIIllllllIIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllllllIIII[0];
        while (lIllIlIlIlIIlIl(i, length)) {
            char llllllllllllllIlllIIllllllIlIIII = charArray2[i];
            sb.append((char) (llllllllllllllIlllIIllllllIlIIII ^ charArray[llllllllllllllIlllIIllllllIIlIll % charArray.length]));
            "".length();
            llllllllllllllIlllIIllllllIIlIll++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
