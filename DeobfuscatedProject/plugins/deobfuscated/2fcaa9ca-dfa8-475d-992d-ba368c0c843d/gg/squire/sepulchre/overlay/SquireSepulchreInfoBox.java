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
package gg.squire.sepulchre.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
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

public class SquireSepulchreInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireSepulchre aa;
    private static /* synthetic */ String[] lllIIlIllIII;
    private static /* synthetic */ int[] lllIIlIllIIl;
    private final /* synthetic */ TaskManager ab;
    private final /* synthetic */ SquireSepulchreConfig ac;

    private static boolean lIIIlIlIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static String lIIIlIlIIIlIIlI(String lllllllllllllllIIllIlIlIlIIIlIII, String lllllllllllllllIIllIlIlIlIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIlIllIIl[9]), "DES");
            Cipher lllllllllllllllIIllIlIlIlIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlIlIIIllII.init(lllIIlIllIIl[5], lllllllllllllllIIllIlIlIlIIIllIl);
            return new String(lllllllllllllllIIllIlIlIlIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlIlIIIlIll) {
            lllllllllllllllIIllIlIlIlIIIlIll.printStackTrace();
            return null;
        }
    }

    static {
        SquireSepulchreInfoBox.lIIIlIlIIIlIllI();
        SquireSepulchreInfoBox.lIIIlIlIIIlIlIl();
    }

    private static String lIIIlIlIIIlIIll(String lllllllllllllllIIllIlIlIIllIllIl, String lllllllllllllllIIllIlIlIIllIllII) {
        lllllllllllllllIIllIlIlIIllIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIlIIllIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIIllIlIlI = lllllllllllllllIIllIlIlIIllIllII.toCharArray();
        int lllllllllllllllIIllIlIlIIllIlIIl = lllIIlIllIIl[1];
        char[] lllllllllllllllIIllIlIlIIllIIIll = lllllllllllllllIIllIlIlIIllIllIl.toCharArray();
        int lllllllllllllllIIllIlIlIIllIIIlI = lllllllllllllllIIllIlIlIIllIIIll.length;
        int lllllllllllllllIIllIlIlIIllIIIIl = lllIIlIllIIl[1];
        while (SquireSepulchreInfoBox.lIIIlIlIIIllIIl(lllllllllllllllIIllIlIlIIllIIIIl, lllllllllllllllIIllIlIlIIllIIIlI)) {
            char lllllllllllllllIIllIlIlIIllIlllI = lllllllllllllllIIllIlIlIIllIIIll[lllllllllllllllIIllIlIlIIllIIIIl];
            lllllllllllllllIIllIlIlIIllIlIll.append((char)(lllllllllllllllIIllIlIlIIllIlllI ^ lllllllllllllllIIllIlIlIIllIlIlI[lllllllllllllllIIllIlIlIIllIlIIl % lllllllllllllllIIllIlIlIIllIlIlI.length]));
            0;
            ++lllllllllllllllIIllIlIlIIllIlIIl;
            ++lllllllllllllllIIllIlIlIIllIIIIl;
            0;
            if (((6 ^ 0x2A) & ~(0x21 ^ 0xD)) != -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIlIIllIlIll);
    }

    private static String lIIIlIlIIIlIlII(String lllllllllllllllIIllIlIlIIllllIll, String lllllllllllllllIIllIlIlIIlllllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlIIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlIIlllllll.init(lllIIlIllIIl[5], lllllllllllllllIIllIlIlIlIIIIIII);
            return new String(lllllllllllllllIIllIlIlIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlIIllllllI) {
            lllllllllllllllIIllIlIlIIllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIIlIlIl() {
        lllIIlIllIII = new String[lllIIlIllIIl[8]];
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[1]] = SquireSepulchreInfoBox."Squire Hallowed Sepulchre";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[4]] = SquireSepulchreInfoBox."Version:";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[5]] = SquireSepulchreInfoBox."1.2.10";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[6]] = SquireSepulchreInfoBox."Runtime:";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[7]] = SquireSepulchreInfoBox."Obstacle:";
    }

    @Inject
    public SquireSepulchreInfoBox(SquireSepulchre squireSepulchre, TaskManager taskManager, SquireSepulchreConfig squireSepulchreConfig) {
        this.aa = squireSepulchre;
        this.ab = squireSepulchre.getManager();
        this.ac = squireSepulchreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        if (SquireSepulchreInfoBox.lIIIlIlIIIllIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIIllIII(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIlIIIlIllI() {
        lllIIlIllIIl = new int[10];
        SquireSepulchreInfoBox.lllIIlIllIIl[0] = 0x3E ^ 0x33 ^ (0x98 ^ 0x9F);
        SquireSepulchreInfoBox.lllIIlIllIIl[1] = (0xB8 ^ 0xAB) & ~(0x65 ^ 0x76);
        SquireSepulchreInfoBox.lllIIlIllIIl[2] = 65 + 182 - 129 + 75;
        SquireSepulchreInfoBox.lllIIlIllIIl[3] = 0xF ^ 0x1B;
        SquireSepulchreInfoBox.lllIIlIllIIl[4] = 1;
        SquireSepulchreInfoBox.lllIIlIllIIl[5] = 2;
        SquireSepulchreInfoBox.lllIIlIllIIl[6] = 3;
        SquireSepulchreInfoBox.lllIIlIllIIl[7] = 45 + 38 - 51 + 120 ^ 154 + 96 - 118 + 24;
        SquireSepulchreInfoBox.lllIIlIllIIl[8] = 16 + 106 - 3 + 8 ^ (0x5F ^ 0x25);
        SquireSepulchreInfoBox.lllIIlIllIIl[9] = 0x2F ^ 0x27;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireSepulchreInfoBox.lIIIlIlIIIlIlll(this.aa.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0]));
        String string = lllIIlIllIII[lllIIlIllIIl[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lllIIlIllIIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIlIllIIl[3], lllIIlIllIIl[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[4]]).right(lllIIlIllIII[lllIIlIllIIl[5]]).build());
        0;
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[6]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[7]]).right(this.aa.getName()).build());
        0;
        return super.render(graphics2D);
    }
}

