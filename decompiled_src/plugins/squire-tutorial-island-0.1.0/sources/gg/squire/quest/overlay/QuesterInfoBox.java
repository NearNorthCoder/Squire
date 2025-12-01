package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireTutorialIsland;
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
import net.unethicalite.api.game.Vars;
/* loaded from: squire-tutorial-island-0.1.0.jar:gg/squire/quest/overlay/QuesterInfoBox.class */
public class QuesterInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIlIIIlIIllII;
    private final /* synthetic */ TaskManager ag;
    private static /* synthetic */ int[] lIlIIIlIIllll;

    private static void lIllIlllllIllIl() {
        lIlIIIlIIllll = new int[9];
        lIlIIIlIIllll[0] = ((5 ^ 105) ^ (79 ^ 52)) & (((((60 + 126) - 129) + 78) ^ (((6 + 104) - 8) + 42)) ^ (-" ".length()));
        lIlIIIlIIllll[1] = " ".length();
        lIlIIIlIIllll[2] = "  ".length();
        lIlIIIlIIllll[3] = "   ".length();
        lIlIIIlIIllll[4] = (((26 + 133) - 39) + 66) ^ (((6 + 138) - 21) + 67);
        lIlIIIlIIllll[5] = (-30817) & 31097;
        lIlIIIlIIllll[6] = (-((-259) & 4971)) & (-19602) & 24571;
        lIlIIIlIIllll[7] = (((0 + 18) - (-20)) + 118) ^ (((15 + 46) - (-13)) + 79);
        lIlIIIlIIllll[8] = (126 ^ 21) ^ (70 ^ 37);
    }

    private static void lIllIlllllIllII() {
        lIlIIIlIIllII = new String[lIlIIIlIIllll[7]];
        lIlIIIlIIllII[lIlIIIlIIllll[0]] = lIllIlllllIlIIl("j0fp5TcWPojtn2o28ETlzg==", "KTUgN");
        lIlIIIlIIllII[lIlIIIlIIllll[1]] = lIllIlllllIlIIl("N+II45Nuz5g=", "XyQXd");
        lIlIIIlIIllII[lIlIIIlIIllll[2]] = lIllIlllllIlIlI("R3l5aXs=", "wWHGH");
        lIlIIIlIIllII[lIlIIIlIIllll[3]] = lIllIlllllIlIIl("9PKbC8Li6gY=", "fHfXj");
        lIlIIIlIIllII[lIlIIIlIIllll[4]] = lIllIlllllIlIll("erqFc+4X5bNAsncS6+COTA==", "MjzZg");
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIIlIIllII[lIlIIIlIIllll[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[1]]).right(lIlIIIlIIllII[lIlIIIlIIllll[2]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[3]]).right(this.ag.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[4]]).right(String.valueOf(Vars.getVarp(lIlIIIlIIllll[5]))).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIIIlIIllll[6], lIlIIIlIIllll[0]));
        return super.render(graphics2D);
    }

    private static String lIllIlllllIlIll(String llllllllllllllIlllIIIlIlllIllIlI, String llllllllllllllIlllIIIlIlllIllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIlllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlllIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIllll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIlIIllll[2], llllllllllllllIlllIIIlIlllIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIlllIllIll) {
            llllllllllllllIlllIIIlIlllIllIll.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlllllIllIl();
        lIllIlllllIllII();
    }

    private static boolean lIllIlllllIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIlllllIlIlI(String llllllllllllllIlllIIIlIlllllllII, String llllllllllllllIlllIIIlIllllllIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIIlIllllllIll.toCharArray();
        int llllllllllllllIlllIIIlIllllllIII = lIlIIIlIIllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlIIllll[0];
        while (lIllIlllllIlllI(i, length)) {
            char llllllllllllllIlllIIIlIlllllllIl = charArray2[i];
            sb.append((char) (llllllllllllllIlllIIIlIlllllllIl ^ charArray[llllllllllllllIlllIIIlIllllllIII % charArray.length]));
            "".length();
            llllllllllllllIlllIIIlIllllllIII++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIlllllIlIIl(String llllllllllllllIlllIIIlIllllIIlll, String llllllllllllllIlllIIIlIllllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIllllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIllllIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIllllIlIIl.init(lIlIIIlIIllll[2], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIllllIlIII) {
            llllllllllllllIlllIIIlIllllIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public QuesterInfoBox(SquireTutorialIsland squireTutorialIsland) {
        this.ag = squireTutorialIsland.getManager();
        setPosition(OverlayPosition.TOP_LEFT);
    }
}
