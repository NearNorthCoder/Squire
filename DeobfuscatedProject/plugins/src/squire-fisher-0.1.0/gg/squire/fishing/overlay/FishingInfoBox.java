/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
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

public class FishingInfoBox
extends OverlayPanel {
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
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n) {
        Duration duration = Duration.between(this.C.getStarted(), Instant.now());
        if (FishingInfoBox.lllIllIIIIIlll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lllIllIIIIIlll(int n) {
        return n == 0;
    }

    private static String lllIllIIIIIIIl(String lllllllllllllllIlIlllIlIIIIlIIll, String lllllllllllllllIlIlllIlIIIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIIlIlII.getBytes(StandardCharsets.UTF_8)), lIlllIlllIIl[8]), "DES");
            Cipher lllllllllllllllIlIlllIlIIIIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIIIIlIlll.init(lIlllIlllIIl[2], lllllllllllllllIlIlllIlIIIIllIII);
            return new String(lllllllllllllllIlIlllIlIIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlIIIIlIllI) {
            lllllllllllllllIlIlllIlIIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lllIllIIIIIIlI(String lllllllllllllllIlIlllIlIIIIIIlIl, String lllllllllllllllIlIlllIlIIIIIIlII) {
        lllllllllllllllIlIlllIlIIIIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlIIIIIIIll = new StringBuilder();
        char[] lllllllllllllllIlIlllIlIIIIIIIlI = lllllllllllllllIlIlllIlIIIIIIlII.toCharArray();
        int lllllllllllllllIlIlllIlIIIIIIIIl = lIlllIlllIIl[0];
        char[] lllllllllllllllIlIlllIIllllllIll = lllllllllllllllIlIlllIlIIIIIIlIl.toCharArray();
        int lllllllllllllllIlIlllIIllllllIlI = lllllllllllllllIlIlllIIllllllIll.length;
        int lllllllllllllllIlIlllIIllllllIIl = lIlllIlllIIl[0];
        while (FishingInfoBox.lllIllIIIIlIII(lllllllllllllllIlIlllIIllllllIIl, lllllllllllllllIlIlllIIllllllIlI)) {
            char lllllllllllllllIlIlllIlIIIIIIllI = lllllllllllllllIlIlllIIllllllIll[lllllllllllllllIlIlllIIllllllIIl];
            lllllllllllllllIlIlllIlIIIIIIIll.append((char)(lllllllllllllllIlIlllIlIIIIIIllI ^ lllllllllllllllIlIlllIlIIIIIIIlI[lllllllllllllllIlIlllIlIIIIIIIIl % lllllllllllllllIlIlllIlIIIIIIIlI.length]));
            "".length();
            ++lllllllllllllllIlIlllIlIIIIIIIIl;
            ++lllllllllllllllIlIlllIIllllllIIl;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIlIIIIIIIll);
    }

    public Dimension render(Graphics2D graphics2D) {
        FishingInfoBox lllllllllllllllIlIlllIlIIIlIIllI;
        if (FishingInfoBox.lllIllIIIIIllI(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lllllllllllllllIlIlllIlIIIlIIlII = Duration.between(lllllllllllllllIlIlllIlIIIlIIllI.C.getStarted(), Instant.now()).minus(SquireFisherPlugin.c(), ChronoUnit.MILLIS);
        lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlllIlllIII[lIlllIlllIIl[0]]).build());
        "".length();
        lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[1]]).right(Time.format((Duration)lllllllllllllllIlIlllIlIIIlIIlII)).build());
        "".length();
        lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[2]]).right(lIlllIlllIII[lIlllIlllIIl[3]]).build());
        "".length();
        lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[4]]).right(lllllllllllllllIlIlllIlIIIlIIllI.D.getCurrentTask()).build());
        "".length();
        if (FishingInfoBox.lllIllIIIIIlll(lllllllllllllllIlIlllIlIIIlIIllI.E.fishingTrawler() ? 1 : 0)) {
            String string;
            List list = lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[5]]);
            if (FishingInfoBox.lllIllIIIIIllI(lllllllllllllllIlIlllIlIIIlIIllI.E.tickFishing() ? 1 : 0)) {
                string = lIlllIlllIII[lIlllIlllIIl[6]];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            } else {
                string = lIlllIlllIII[lIlllIlllIIl[7]];
            }
            list.add(lineComponentBuilder.right(string).build());
            "".length();
            lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[8]]).right("" + SquireFisherPlugin.d).build());
            "".length();
            lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[9]]).right("" + lllllllllllllllIlIlllIlIIIlIIllI.b(SquireFisherPlugin.d)).build());
            "".length();
            "".length();
            if ((0x83 ^ 0xAB ^ (0x7B ^ 0x57)) != (0x2F ^ 0x65 ^ (0x76 ^ 0x38))) {
                return null;
            }
        } else {
            lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[10]]).right("" + SquireFisherPlugin.c).build());
            "".length();
            lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[11]]).right("" + lllllllllllllllIlIlllIlIIIlIIllI.b(SquireFisherPlugin.c)).build());
            "".length();
            lllllllllllllllIlIlllIlIIIlIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[12]]).right("" + SquireFisherPlugin.b).build());
            "".length();
        }
        int n = lIlllIlllIIl[13];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlllIlllIIl[14], lIlllIlllIIl[0]));
        return super.render(graphics2D);
    }

    static {
        FishingInfoBox.lllIllIIIIIlIl();
        FishingInfoBox.lllIllIIIIIlII();
    }

    private static boolean lllIllIIIIlIII(int n, int n2) {
        return n < n2;
    }

    private static String lllIllIIIIIIll(String lllllllllllllllIlIlllIIllllIlllI, String lllllllllllllllIlIlllIIllllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIlllllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIlllllIIlI.init(lIlllIlllIIl[2], lllllllllllllllIlIlllIIlllllIIll);
            return new String(lllllllllllllllIlIlllIIlllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIlllllIIIl) {
            lllllllllllllllIlIlllIIlllllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllIllIIIIIlII() {
        lIlllIlllIII = new String[lIlllIlllIIl[15]];
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[0]] = FishingInfoBox.lllIllIIIIIIIl("A6kKwSP7fRLc4bIHEAQD/A==", "YVQDW");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[1]] = FishingInfoBox.lllIllIIIIIIIl("pzquLwoIoeU=", "PXVYr");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[2]] = FishingInfoBox.lllIllIIIIIIlI("JCMfCgYdKA==", "rFmyo");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[3]] = FishingInfoBox.lllIllIIIIIIIl("CRDa4ETB15Y=", "PTnFn");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[4]] = FishingInfoBox.lllIllIIIIIIll("HfpZ7XjkwDo=", "AXepB");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[5]] = FishingInfoBox.lllIllIIIIIIll("Uwm2AltAZonK/sTUtD35Dg==", "rgiSb");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[6]] = FishingInfoBox.lllIllIIIIIIlI("DiIm", "WGUqA");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[7]] = FishingInfoBox.lllIllIIIIIIll("+G2Lps3kFD0=", "PwtHc");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[8]] = FishingInfoBox.lllIllIIIIIIll("mYa0gB1WOu7boulJtxXnpQ==", "IOVDe");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[9]] = FishingInfoBox.lllIllIIIIIIll("FWZBGzkQueitugDu3+uxQA==", "RrVme");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[10]] = FishingInfoBox.lllIllIIIIIIll("9CvhuclJRyh/xCWdLr+Dig==", "xWAio");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[11]] = FishingInfoBox.lllIllIIIIIIlI("IRQNOgsQFEwKBhgDH203EBRMBQgAFA==", "uflMg");
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[12]] = FishingInfoBox.lllIllIIIIIIlI("ESc2OXgVLTsnPTU2Mi8=", "VBWKX");
    }

    private static void lllIllIIIIIlIl() {
        lIlllIlllIIl = new int[16];
        FishingInfoBox.lIlllIlllIIl[0] = (0x34 ^ 0x7B ^ (0x5C ^ 0x54)) & (2 + 50 - -128 + 54 ^ 61 + 40 - 13 + 85 ^ -" ".length());
        FishingInfoBox.lIlllIlllIIl[1] = " ".length();
        FishingInfoBox.lIlllIlllIIl[2] = "  ".length();
        FishingInfoBox.lIlllIlllIIl[3] = "   ".length();
        FishingInfoBox.lIlllIlllIIl[4] = 0xAC ^ 0xA8;
        FishingInfoBox.lIlllIlllIIl[5] = 0x11 ^ 0x24 ^ (0xD ^ 0x3D);
        FishingInfoBox.lIlllIlllIIl[6] = 0xC2 ^ 0xA5 ^ (0x1D ^ 0x7C);
        FishingInfoBox.lIlllIlllIIl[7] = 0xBB ^ 0xBC;
        FishingInfoBox.lIlllIlllIIl[8] = 0x61 ^ 0x33 ^ (0x2E ^ 0x74);
        FishingInfoBox.lIlllIlllIIl[9] = 0x48 ^ 0x41;
        FishingInfoBox.lIlllIlllIIl[10] = 0x6C ^ 0x66;
        FishingInfoBox.lIlllIlllIIl[11] = 170 + 122 - 100 + 12 ^ 119 + 47 - 36 + 69;
        FishingInfoBox.lIlllIlllIIl[12] = 0x5E ^ 0x52;
        FishingInfoBox.lIlllIlllIIl[13] = 0xFFFFD55F & 0x2BA2;
        FishingInfoBox.lIlllIlllIIl[14] = 0xA4 ^ 0xB0;
        FishingInfoBox.lIlllIlllIIl[15] = 0xD7 ^ 0xC4 ^ (0xB4 ^ 0xAA);
    }

    private static boolean lllIllIIIIIllI(int n) {
        return n != 0;
    }
}

