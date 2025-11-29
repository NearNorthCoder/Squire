package gg.squire.nightmarezone.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmarezone.SquireNightmareZone;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
@Singleton
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:gg/squire/nightmarezone/overlay/NMZInfoBox.class */
public class NMZInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIIIlIIIllIIl;
    private static /* synthetic */ int[] lIIIlIIIllIlI;
    private final /* synthetic */ SquireNightmareZone z;
    private final /* synthetic */ TaskManager A;

    private static String lIIllllIlIIllll(String lllllllllllllllIIIlIIIIIlIlIlIlI, String lllllllllllllllIIIlIIIIIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIIlIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIIlIlIllII.init(lIIIlIIIllIlI[5], lllllllllllllllIIIlIIIIIlIlIllIl);
            return new String(lllllllllllllllIIIlIIIIIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIIlIlIlIll) {
            lllllllllllllllIIIlIIIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIlIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllIlIlIIll(int i) {
        return i != 0;
    }

    private static void lIIllllIlIlIIlI() {
        lIIIlIIIllIlI = new int[7];
        lIIIlIIIllIlI[0] = 93 ^ 87;
        lIIIlIIIllIlI[1] = ((67 ^ 123) ^ (104 ^ 13)) & (((12 ^ 26) ^ (230 ^ 173)) ^ (-" ".length()));
        lIIIlIIIllIlI[2] = ((76 + 147) - 44) + 14;
        lIIIlIIIllIlI[3] = (117 ^ 7) ^ (248 ^ 158);
        lIIIlIIIllIlI[4] = " ".length();
        lIIIlIIIllIlI[5] = "  ".length();
        lIIIlIIIllIlI[6] = "   ".length();
    }

    @Inject
    public NMZInfoBox(SquireNightmareZone squireNightmareZone) {
        this.z = squireNightmareZone;
        this.A = squireNightmareZone.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIllllIlIlIIII(String lllllllllllllllIIIlIIIIIlIllllll, String lllllllllllllllIIIlIIIIIlIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIIlIllllII = lllllllllllllllIIIlIIIIIlIlllllI.toCharArray();
        int lllllllllllllllIIIlIIIIIlIlllIll = lIIIlIIIllIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIIllIlI[1];
        while (lIIllllIlIlIlII(i, length)) {
            lllllllllllllllIIIlIIIIIlIllllIl.append((char) (charArray[i] ^ lllllllllllllllIIIlIIIIIlIllllII[lllllllllllllllIIIlIIIIIlIlllIll % lllllllllllllllIIIlIIIIIlIllllII.length]));
            "".length();
            lllllllllllllllIIIlIIIIIlIlllIll++;
            i++;
            "".length();
            if (((17 ^ 4) ^ (118 ^ 103)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIlIIIIIlIllllIl);
    }

    private static void lIIllllIlIlIIIl() {
        lIIIlIIIllIIl = new String[lIIIlIIIllIlI[6]];
        lIIIlIIIllIIl[lIIIlIIIllIlI[1]] = lIIllllIlIIllll("u9yuVR3knylDlTo+0006eA==", "VkcjF");
        lIIIlIIIllIIl[lIIIlIIIllIlI[4]] = lIIllllIlIlIIII("FSAJGAsqMF0=", "GUglb");
        lIIIlIIIllIIl[lIIIlIIIllIlI[5]] = lIIllllIlIIllll("DmaK8N1rqa4=", "GTIBN");
    }

    static {
        lIIllllIlIlIIlI();
        lIIllllIlIlIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIllllIlIlIIll(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIIlIIIllIlI[0], lIIIlIIIllIlI[0], lIIIlIIIllIlI[0], lIIIlIIIllIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlIIIllIIl[lIIIlIIIllIlI[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIIlIIIllIlI[2] + lIIIlIIIllIlI[3], lIIIlIIIllIlI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIIllIIl[lIIIlIIIllIlI[4]]).right(Time.format(Duration.between(this.z.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIIllIIl[lIIIlIIIllIlI[5]]).right(this.A.getCurrentTask()).build());
        "".length();
        return super.render(graphics2D);
    }
}
