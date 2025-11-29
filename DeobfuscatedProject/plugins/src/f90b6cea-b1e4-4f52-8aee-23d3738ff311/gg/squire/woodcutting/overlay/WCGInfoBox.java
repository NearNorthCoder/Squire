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
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
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

public class WCGInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIllIIIIIllII;
    private static /* synthetic */ int[] lIllIIIIlIIII;
    private final /* synthetic */ SquireWoodcutterConfig q;
    private final /* synthetic */ TaskManager r;
    private final /* synthetic */ SquireWoodcutterPlugin p;

    static {
        WCGInfoBox.llIIIlIIIIlIllI();
        WCGInfoBox.llIIIlIIIIlIlIl();
    }

    private static String llIIIlIIIIlIIll(String llllllllllllllIllIIllIlIIIIIllII, String llllllllllllllIllIIllIlIIIIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIIII[11]), "DES");
            Cipher llllllllllllllIllIIllIlIIIIlIIII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIlIIIIlIIII.init(lIllIIIIlIIII[3], llllllllllllllIllIIllIlIIIIlIIIl);
            return new String(llllllllllllllIllIIllIlIIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIlIIIIIllll) {
            llllllllllllllIllIIllIlIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIIlIIIIlIlll(int n) {
        return n != 0;
    }

    private static void llIIIlIIIIlIllI() {
        lIllIIIIlIIII = new int[12];
        WCGInfoBox.lIllIIIIlIIII[0] = 0x22 ^ 0x77 ^ (8 ^ 0x57);
        WCGInfoBox.lIllIIIIlIIII[1] = " ".length() & (" ".length() ^ -" ".length());
        WCGInfoBox.lIllIIIIlIIII[2] = " ".length();
        WCGInfoBox.lIllIIIIlIIII[3] = "  ".length();
        WCGInfoBox.lIllIIIIlIIII[4] = "   ".length();
        WCGInfoBox.lIllIIIIlIIII[5] = 0xE8 ^ 0xB2 ^ (0x7F ^ 0x21);
        WCGInfoBox.lIllIIIIlIIII[6] = 0x16 ^ 0x13;
        WCGInfoBox.lIllIIIIlIIII[7] = 94 + 113 - 74 + 36 ^ 162 + 142 - 271 + 142;
        WCGInfoBox.lIllIIIIlIIII[8] = 0xB3 ^ 0xB4;
        WCGInfoBox.lIllIIIIlIIII[9] = -(0xFFFF98BB & 0x7FF5) & (0xFFFF99FA & 0x7FB7);
        WCGInfoBox.lIllIIIIlIIII[10] = 0x85 ^ 0x91;
        WCGInfoBox.lIllIIIIlIIII[11] = 0x92 ^ 0x9A;
    }

    private static String llIIIlIIIIlIlII(String llllllllllllllIllIIllIlIIIIllllI, String llllllllllllllIllIIllIlIIIIlllIl) {
        llllllllllllllIllIIllIlIIIIllllI = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIlIIIlIIIIl = new StringBuilder();
        char[] llllllllllllllIllIIllIlIIIlIIIII = llllllllllllllIllIIllIlIIIIlllIl.toCharArray();
        int llllllllllllllIllIIllIlIIIIlllll = lIllIIIIlIIII[1];
        char[] llllllllllllllIllIIllIlIIIIllIIl = llllllllllllllIllIIllIlIIIIllllI.toCharArray();
        int llllllllllllllIllIIllIlIIIIllIII = llllllllllllllIllIIllIlIIIIllIIl.length;
        int llllllllllllllIllIIllIlIIIIlIlll = lIllIIIIlIIII[1];
        while (WCGInfoBox.llIIIlIIIIllIIl(llllllllllllllIllIIllIlIIIIlIlll, llllllllllllllIllIIllIlIIIIllIII)) {
            char llllllllllllllIllIIllIlIIIlIIlII = llllllllllllllIllIIllIlIIIIllIIl[llllllllllllllIllIIllIlIIIIlIlll];
            llllllllllllllIllIIllIlIIIlIIIIl.append((char)(llllllllllllllIllIIllIlIIIlIIlII ^ llllllllllllllIllIIllIlIIIlIIIII[llllllllllllllIllIIllIlIIIIlllll % llllllllllllllIllIIllIlIIIlIIIII.length]));
            "".length();
            ++llllllllllllllIllIIllIlIIIIlllll;
            ++llllllllllllllIllIIllIlIIIIlIlll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIlIIIlIIIIl);
    }

    private static String llIIIlIIIIIIlll(String llllllllllllllIllIIllIIlllllllll, String llllllllllllllIllIIllIIllllllllI) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIllllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIlIIIIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIlIIIIIIIll.init(lIllIIIIlIIII[3], llllllllllllllIllIIllIlIIIIIIlII);
            return new String(llllllllllllllIllIIllIlIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIlIIIIIIIlI) {
            llllllllllllllIllIIllIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIllIII(int n) {
        return n == 0;
    }

    @Inject
    private WCGInfoBox(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.p = squireWoodcutterPlugin;
        this.q = squireWoodcutterConfig;
        this.r = squireWoodcutterPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (WCGInfoBox.llIIIlIIIIlIlll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIllIIIIlIIII[0], lIllIIIIlIIII[0], lIllIIIIlIIII[0], lIllIIIIlIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIIllII[lIllIIIIlIIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[2]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[3]]).right(lIllIIIIIllII[lIllIIIIlIIII[4]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[5]]).right(this.r.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[6]]).right("" + SquireWoodcutterPlugin.b).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[7]]).right("" + this.d(SquireWoodcutterPlugin.b)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[8]]).right("" + SquireWoodcutterPlugin.c).build());
        "".length();
        int n = lIllIIIIlIIII[9];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIIIlIIII[10], lIllIIIIlIIII[1]));
        return super.render(graphics2D);
    }

    private static void llIIIlIIIIlIlIl() {
        lIllIIIIIllII = new String[lIllIIIIlIIII[11]];
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[1]] = WCGInfoBox.llIIIlIIIIIIlll("DBBvM2h0awYv2E3WLdEEYtYsBmvuzKtF", "kWWpj");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[2]] = WCGInfoBox.llIIIlIIIIIIlll("amV7Hb8lgBM=", "PvvuQ");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[3]] = WCGInfoBox.llIIIlIIIIIIlll("4XNL6QkMG+g=", "dKlcH");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[4]] = WCGInfoBox.llIIIlIIIIlIIll("1o+WVbHCogU=", "BOhog");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[5]] = WCGInfoBox.llIIIlIIIIIIlll("0Fe+92/0eX4=", "PeatD");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[6]] = WCGInfoBox.llIIIlIIIIlIlII("GgMsOQ==", "VlKJb");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[7]] = WCGInfoBox.llIIIlIIIIlIIll("BdeCLZtuKl5M3O/D+RUM2Q==", "viFzk");
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[8]] = WCGInfoBox.llIIIlIIIIlIIll("H0TnEY44Gk8Nbw8K2LS2nA==", "CJAsq");
    }

    public long d(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (WCGInfoBox.llIIIlIIIIllIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }
}

