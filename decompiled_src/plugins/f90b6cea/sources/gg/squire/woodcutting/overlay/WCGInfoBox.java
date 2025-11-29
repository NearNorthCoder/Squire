package gg.squire.woodcutting.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
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
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:gg/squire/woodcutting/overlay/WCGInfoBox.class */
public class WCGInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIllIIIIIllII;
    private static /* synthetic */ int[] lIllIIIIlIIII;
    private final /* synthetic */ SquireWoodcutterConfig q;
    private final /* synthetic */ TaskManager r;
    private final /* synthetic */ SquireWoodcutterPlugin p;

    static {
        llIIIlIIIIlIllI();
        llIIIlIIIIlIlIl();
    }

    private static String llIIIlIIIIlIIll(String llllllllllllllIllIIllIlIIIIIlllI, String llllllllllllllIllIIllIlIIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlIIIIIllll) {
            llllllllllllllIllIIllIlIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIlIIIIlIlll(int i) {
        return i != 0;
    }

    private static void llIIIlIIIIlIllI() {
        lIllIIIIlIIII = new int[12];
        lIllIIIIlIIII[0] = (34 ^ 119) ^ (8 ^ 87);
        lIllIIIIlIIII[1] = " ".length() & (" ".length() ^ (-" ".length()));
        lIllIIIIlIIII[2] = " ".length();
        lIllIIIIlIIII[3] = "  ".length();
        lIllIIIIlIIII[4] = "   ".length();
        lIllIIIIlIIII[5] = (232 ^ 178) ^ (127 ^ 33);
        lIllIIIIlIIII[6] = 22 ^ 19;
        lIllIIIIlIIII[7] = (((94 + 113) - 74) + 36) ^ (((162 + 142) - 271) + 142);
        lIllIIIIlIIII[8] = 179 ^ 180;
        lIllIIIIlIIII[9] = (-((-26437) & 32757)) & (-26118) & 32695;
        lIllIIIIlIIII[10] = 133 ^ 145;
        lIllIIIIlIIII[11] = 146 ^ 154;
    }

    private static String llIIIlIIIIlIlII(String llllllllllllllIllIIllIlIIIlIIIll, String llllllllllllllIllIIllIlIIIlIIIlI) {
        String llllllllllllllIllIIllIlIIIlIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIllIlIIIlIIIII = llllllllllllllIllIIllIlIIIlIIIlI.toCharArray();
        int llllllllllllllIllIIllIlIIIIlllll = lIllIIIIlIIII[1];
        char[] charArray = llllllllllllllIllIIllIlIIIlIIIll2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIlIIII[1];
        while (llIIIlIIIIllIIl(i, length)) {
            char llllllllllllllIllIIllIlIIIlIIlII = charArray[i];
            sb.append((char) (llllllllllllllIllIIllIlIIIlIIlII ^ llllllllllllllIllIIllIlIIIlIIIII[llllllllllllllIllIIllIlIIIIlllll % llllllllllllllIllIIllIlIIIlIIIII.length]));
            "".length();
            llllllllllllllIllIIllIlIIIIlllll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIlIIIIIIlll(String llllllllllllllIllIIllIlIIIIIIIIl, String llllllllllllllIllIIllIlIIIIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIlIIII[3], llllllllllllllIllIIllIlIIIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlIIIIIIIlI) {
            llllllllllllllIllIIllIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIllIII(int i) {
        return i == 0;
    }

    @Inject
    private WCGInfoBox(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.p = squireWoodcutterPlugin;
        this.q = squireWoodcutterConfig;
        this.r = squireWoodcutterPlugin.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIIlIIIIlIlll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIllIIIIlIIII[0], lIllIIIIlIIII[0], lIllIIIIlIIII[0], lIllIIIIlIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIIllII[lIllIIIIlIIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[2]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[3]]).right(lIllIIIIIllII[lIllIIIIlIIII[4]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[5]]).right(this.r.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[6]]).right(SquireWoodcutterPlugin.b).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[7]]).right(d(SquireWoodcutterPlugin.b)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[8]]).right(SquireWoodcutterPlugin.c).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIllIIIIlIIII[9] + lIllIIIIlIIII[10], lIllIIIIlIIII[1]));
        return super.render(graphics2D);
    }

    private static void llIIIlIIIIlIlIl() {
        lIllIIIIIllII = new String[lIllIIIIlIIII[11]];
        lIllIIIIIllII[lIllIIIIlIIII[1]] = llIIIlIIIIIIlll("DBBvM2h0awYv2E3WLdEEYtYsBmvuzKtF", "kWWpj");
        lIllIIIIIllII[lIllIIIIlIIII[2]] = llIIIlIIIIIIlll("amV7Hb8lgBM=", "PvvuQ");
        lIllIIIIIllII[lIllIIIIlIIII[3]] = llIIIlIIIIIIlll("4XNL6QkMG+g=", "dKlcH");
        lIllIIIIIllII[lIllIIIIlIIII[4]] = llIIIlIIIIlIIll("1o+WVbHCogU=", "BOhog");
        lIllIIIIIllII[lIllIIIIlIIII[5]] = llIIIlIIIIIIlll("0Fe+92/0eX4=", "PeatD");
        lIllIIIIIllII[lIllIIIIlIIII[6]] = llIIIlIIIIlIlII("GgMsOQ==", "VlKJb");
        lIllIIIIIllII[lIllIIIIlIIII[7]] = llIIIlIIIIlIIll("BdeCLZtuKl5M3O/D+RUM2Q==", "viFzk");
        lIllIIIIIllII[lIllIIIIlIIII[8]] = llIIIlIIIIlIIll("H0TnEY44Gk8Nbw8K2LS2nA==", "CJAsq");
    }

    public long d(int i) {
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        if (llIIIlIIIIllIII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }
}
