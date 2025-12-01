package gg.squire.fishing.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: squire-fisher-0.1.0.jar:gg/squire/fishing/overlay/FishingInfoBox.class */
public class FishingInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIlllIlllIII;
    private final /* synthetic */ TaskManager D;
    private final /* synthetic */ SquireFisherConfig E;
    private final /* synthetic */ SquireFisherPlugin C;
    private static /* synthetic */ int[] lIlllIlllIIl;

    @Inject
    private FishingInfoBox(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.C = squireFisherPlugin;
        this.D = squireFisherPlugin.getManager();
        this.E = squireFisherConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int i2) {
        Duration between = Duration.between(this.C.getStarted(), Instant.now());
        if (lllIllIIIIIlll(between.isZero() ? 1 : 0)) {
            return (int) ((i2 * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lllIllIIIIIlll(int i2) {
        return i2 == 0;
    }

    private static String lllIllIIIIIIIl(String lllllllllllllllIlIlllIlIIIIlIlIl, String lllllllllllllllIlIlllIlIIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIlllIlllIIl[8]), "DES");
            Cipher lllllllllllllllIlIlllIlIIIIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIIIIlIlll.init(lIlllIlllIIl[2], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIIIlIllI) {
            lllllllllllllllIlIlllIlIIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lllIllIIIIIIlI(String lllllllllllllllIlIlllIlIIIIIIlIl, String lllllllllllllllIlIlllIlIIIIIIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlIIIIIIIll = new StringBuilder();
        char[] lllllllllllllllIlIlllIlIIIIIIIlI = lllllllllllllllIlIlllIlIIIIIIlII.toCharArray();
        int lllllllllllllllIlIlllIlIIIIIIIIl = lIlllIlllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlllIlllIIl[0];
        while (lllIllIIIIlIII(i2, length)) {
            lllllllllllllllIlIlllIlIIIIIIIll.append((char) (charArray[i2] ^ lllllllllllllllIlIlllIlIIIIIIIlI[lllllllllllllllIlIlllIlIIIIIIIIl % lllllllllllllllIlIlllIlIIIIIIIlI.length]));
            "".length();
            lllllllllllllllIlIlllIlIIIIIIIIl++;
            i2++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlIIIIIIIll);
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        if (lllIllIIIIIllI(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration minus = Duration.between(this.C.getStarted(), Instant.now()).minus(SquireFisherPlugin.c(), ChronoUnit.MILLIS);
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlllIlllIII[lIlllIlllIIl[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[1]]).right(Time.format(minus)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[2]]).right(lIlllIlllIII[lIlllIlllIIl[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[4]]).right(this.D.getCurrentTask()).build());
        "".length();
        if (lllIllIIIIIlll(this.E.fishingTrawler() ? 1 : 0)) {
            List children = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[5]]);
            if (lllIllIIIIIllI(this.E.tickFishing() ? 1 : 0)) {
                str = lIlllIlllIII[lIlllIlllIIl[6]];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            } else {
                str = lIlllIlllIII[lIlllIlllIIl[7]];
            }
            children.add(left.right(str).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[8]]).right(SquireFisherPlugin.d).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[9]]).right(b(SquireFisherPlugin.d)).build());
            "".length();
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return null;
            }
        } else {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[10]]).right(SquireFisherPlugin.c).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[11]]).right(b(SquireFisherPlugin.c)).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[12]]).right(SquireFisherPlugin.b).build());
            "".length();
        }
        this.panelComponent.setPreferredSize(new Dimension(lIlllIlllIIl[13] + lIlllIlllIIl[14], lIlllIlllIIl[0]));
        return super.render(graphics2D);
    }

    static {
        lllIllIIIIIlIl();
        lllIllIIIIIlII();
    }

    private static boolean lllIllIIIIlIII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lllIllIIIIIIll(String lllllllllllllllIlIlllIIlllllIIII, String lllllllllllllllIlIlllIIllllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIlllllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIlllllIIlI.init(lIlllIlllIIl[2], secretKeySpec);
            return new String(lllllllllllllllIlIlllIIlllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIllllIllII) {
            lllllllllllllllIlIlllIIllllIllII.printStackTrace();
            return null;
        }
    }

    private static void lllIllIIIIIlII() {
        lIlllIlllIII = new String[lIlllIlllIIl[15]];
        lIlllIlllIII[lIlllIlllIIl[0]] = lllIllIIIIIIIl("A6kKwSP7fRLc4bIHEAQD/A==", "YVQDW");
        lIlllIlllIII[lIlllIlllIIl[1]] = lllIllIIIIIIIl("pzquLwoIoeU=", "PXVYr");
        lIlllIlllIII[lIlllIlllIIl[2]] = lllIllIIIIIIlI("JCMfCgYdKA==", "rFmyo");
        lIlllIlllIII[lIlllIlllIIl[3]] = lllIllIIIIIIIl("CRDa4ETB15Y=", "PTnFn");
        lIlllIlllIII[lIlllIlllIIl[4]] = lllIllIIIIIIll("HfpZ7XjkwDo=", "AXepB");
        lIlllIlllIII[lIlllIlllIIl[5]] = lllIllIIIIIIll("Uwm2AltAZonK/sTUtD35Dg==", "rgiSb");
        lIlllIlllIII[lIlllIlllIIl[6]] = lllIllIIIIIIlI("DiIm", "WGUqA");
        lIlllIlllIII[lIlllIlllIIl[7]] = lllIllIIIIIIll("+G2Lps3kFD0=", "PwtHc");
        lIlllIlllIII[lIlllIlllIIl[8]] = lllIllIIIIIIll("mYa0gB1WOu7boulJtxXnpQ==", "IOVDe");
        lIlllIlllIII[lIlllIlllIIl[9]] = lllIllIIIIIIll("FWZBGzkQueitugDu3+uxQA==", "RrVme");
        lIlllIlllIII[lIlllIlllIIl[10]] = lllIllIIIIIIll("9CvhuclJRyh/xCWdLr+Dig==", "xWAio");
        lIlllIlllIII[lIlllIlllIIl[11]] = lllIllIIIIIIlI("IRQNOgsQFEwKBhgDH203EBRMBQgAFA==", "uflMg");
        lIlllIlllIII[lIlllIlllIIl[12]] = lllIllIIIIIIlI("ESc2OXgVLTsnPTU2Mi8=", "VBWKX");
    }

    private static void lllIllIIIIIlIl() {
        lIlllIlllIIl = new int[16];
        lIlllIlllIIl[0] = ((52 ^ 123) ^ (92 ^ 84)) & (((((2 + 50) - (-128)) + 54) ^ (((61 + 40) - 13) + 85)) ^ (-" ".length()));
        lIlllIlllIIl[1] = " ".length();
        lIlllIlllIIl[2] = "  ".length();
        lIlllIlllIIl[3] = "   ".length();
        lIlllIlllIIl[4] = 172 ^ 168;
        lIlllIlllIIl[5] = (17 ^ 36) ^ (13 ^ 61);
        lIlllIlllIIl[6] = (194 ^ 165) ^ (29 ^ 124);
        lIlllIlllIIl[7] = 187 ^ 188;
        lIlllIlllIIl[8] = (97 ^ 51) ^ (46 ^ 116);
        lIlllIlllIIl[9] = 72 ^ 65;
        lIlllIlllIIl[10] = 108 ^ 102;
        lIlllIlllIIl[11] = (((170 + 122) - 100) + 12) ^ (((119 + 47) - 36) + 69);
        lIlllIlllIIl[12] = 94 ^ 82;
        lIlllIlllIIl[13] = (-10913) & 11170;
        lIlllIlllIIl[14] = 164 ^ 176;
        lIlllIlllIIl[15] = (215 ^ 196) ^ (180 ^ 170);
    }

    private static boolean lllIllIIIIIllI(int i2) {
        return i2 != 0;
    }
}
