/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.ectofuntus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class EctoOverlay
extends OverlayPanel {
    private static /* synthetic */ String[] lllIllIIl;
    private final /* synthetic */ SquireEcto cW;
    private final /* synthetic */ TaskManager cX;
    private static /* synthetic */ int[] lllIllIlI;

    public long u(int n2) {
        Duration duration = Duration.between(this.cW.getStarted(), Instant.now());
        if (EctoOverlay.llIIllIIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIlllll() {
        lllIllIlI = new int[12];
        EctoOverlay.lllIllIlI[0] = (0x46 ^ 4) & ~(0x84 ^ 0xC6);
        EctoOverlay.lllIllIlI[1] = " ".length();
        EctoOverlay.lllIllIlI[2] = "  ".length();
        EctoOverlay.lllIllIlI[3] = "   ".length();
        EctoOverlay.lllIllIlI[4] = 6 + 64 - 13 + 95 ^ 47 + 96 - 7 + 20;
        EctoOverlay.lllIllIlI[5] = 0x97 ^ 0x92;
        EctoOverlay.lllIllIlI[6] = 0x15 ^ 0x13;
        EctoOverlay.lllIllIlI[7] = 0x98 ^ 0x9F;
        EctoOverlay.lllIllIlI[8] = 0x73 ^ 0x37 ^ (0x2B ^ 0x67);
        EctoOverlay.lllIllIlI[9] = 0xFFFF9367 & 0x6D9A;
        EctoOverlay.lllIllIlI[10] = 0x76 ^ 0x62;
        EctoOverlay.lllIllIlI[11] = 0x28 ^ 0x21;
    }

    private static String llIIlIllIll(String lIlIlIIIlIlIlII, String lIlIlIIIlIlIIll) {
        try {
            SecretKeySpec lIlIlIIIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIlIlIllI = Cipher.getInstance("Blowfish");
            lIlIlIIIlIlIllI.init(lllIllIlI[2], lIlIlIIIlIlIlll);
            return new String(lIlIlIIIlIlIllI.doFinal(Base64.getDecoder().decode(lIlIlIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIlIlIlIl) {
            lIlIlIIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIIIl(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        EctoOverlay lIlIlIIlIIIlIlI;
        if (EctoOverlay.llIIllIIIII(this.cW.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lIlIlIIlIIIlIII = Duration.between(lIlIlIIlIIIlIlI.cW.getStarted(), Instant.now());
        lIlIlIIlIIIlIlI.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllIIl[lllIllIlI[0]]).build());
        "".length();
        lIlIlIIlIIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[1]]).right(Time.format((Duration)lIlIlIIlIIIlIII)).build());
        "".length();
        lIlIlIIlIIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[2]]).right(lIlIlIIlIIIlIlI.cX.getCurrentTask()).build());
        "".length();
        List list = lIlIlIIlIIIlIlI.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lllIllIIl[lllIllIlI[3]]);
        if (EctoOverlay.llIIllIIIII(lIlIlIIlIIIlIlI.cW.r() ? 1 : 0)) {
            string = lllIllIIl[lllIllIlI[4]];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        } else {
            string = lllIllIIl[lllIllIlI[5]];
        }
        list.add(lineComponentBuilder.right(string).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[6]]).right(this.cW.bm() + " (" + this.u(this.cW.bm()) + "/h)").build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[7]]).right(this.cW.bl() + " (" + this.u(this.cW.bl()) + "/h)").build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[8]]).right(this.cW.bn() + " (" + this.u(this.cW.bn()) + "/h)").build());
        "".length();
        int n2 = lllIllIlI[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIllIlI[10], lllIllIlI[0]));
        return super.render(graphics2D);
    }

    static {
        EctoOverlay.llIIlIlllll();
        EctoOverlay.llIIlIllllI();
    }

    @Inject
    private EctoOverlay(SquireEcto squireEcto) {
        this.cW = squireEcto;
        this.cX = squireEcto.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static String llIIlIlllII(String lIlIlIIIlIlllll, String lIlIlIIIllIIIII) {
        try {
            SecretKeySpec lIlIlIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lllIllIlI[8]), "DES");
            Cipher lIlIlIIIllIIIll = Cipher.getInstance("DES");
            lIlIlIIIllIIIll.init(lllIllIlI[2], lIlIlIIIllIIlII);
            return new String(lIlIlIIIllIIIll.doFinal(Base64.getDecoder().decode(lIlIlIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIllIIIlI) {
            lIlIlIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlllIl(String lIlIlIIIlllIIIl, String lIlIlIIIlllIlIl) {
        lIlIlIIIlllIIIl = new String(Base64.getDecoder().decode(lIlIlIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIIlllIlII = new StringBuilder();
        char[] lIlIlIIIlllIIll = lIlIlIIIlllIlIl.toCharArray();
        int lIlIlIIIlllIIlI = lllIllIlI[0];
        char[] lIlIlIIIllIllII = lIlIlIIIlllIIIl.toCharArray();
        int lIlIlIIIllIlIll = lIlIlIIIllIllII.length;
        int lIlIlIIIllIlIlI = lllIllIlI[0];
        while (EctoOverlay.llIIllIIIlI(lIlIlIIIllIlIlI, lIlIlIIIllIlIll)) {
            char lIlIlIIIlllIlll = lIlIlIIIllIllII[lIlIlIIIllIlIlI];
            lIlIlIIIlllIlII.append((char)(lIlIlIIIlllIlll ^ lIlIlIIIlllIIll[lIlIlIIIlllIIlI % lIlIlIIIlllIIll.length]));
            "".length();
            ++lIlIlIIIlllIIlI;
            ++lIlIlIIIllIlIlI;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lIlIlIIIlllIlII);
    }

    private static void llIIlIllllI() {
        lllIllIIl = new String[lllIllIlI[11]];
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[0]] = EctoOverlay.llIIlIllIll("wcWKBKWfqR0ixwIp4HkHkeVs0/eb4VNN", "YDsGt");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[1]] = EctoOverlay.llIIlIlllII("aMg5YwjV/3aJStYx+LCX/w==", "QXzKk");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[2]] = EctoOverlay.llIIlIlllII("AldrkUKGRBScPZIHDJeykA==", "okUuG");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[3]] = EctoOverlay.llIIlIllIll("uzLPPs42QZQuA6CmVwjlCA==", "McQCH");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[4]] = EctoOverlay.llIIlIlllIl("KCkZ", "qLjAY");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[5]] = EctoOverlay.llIIlIlllII("0MvZ9OEq+5c=", "WgWpc");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[6]] = EctoOverlay.llIIlIlllII("k8zXN/kzRip+KV9GHxk9Dg==", "ESNTZ");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[7]] = EctoOverlay.llIIlIlllIl("ID0YFwUDbzUNBQI8TUI=", "gOwbk");
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[8]] = EctoOverlay.llIIlIlllIl("JwQFGRNUKwMYGhELGBESTkg=", "thltv");
    }

    private static boolean llIIllIIIII(int n2) {
        return n2 != 0;
    }
}

