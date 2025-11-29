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
package gg.squire.hunter.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.hunter.SquireHunter;
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

public class HunterInfoBox
extends OverlayPanel {
    private final /* synthetic */ TaskManager t;
    private static /* synthetic */ String[] lllIlllIIIII;
    private static /* synthetic */ int[] lllIlllIIIIl;
    private final /* synthetic */ SquireHunter s;

    public long c(int n2) {
        Duration duration = Duration.between(this.s.getStarted(), Instant.now());
        if (HunterInfoBox.lIIIllIllIlIllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIllIllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIllIlIIll() {
        lllIlllIIIII = new String[lllIlllIIIIl[9]];
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[1]] = HunterInfoBox."Squire Hunter";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[2]] = HunterInfoBox."Version";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[3]] = HunterInfoBox."1.4.2";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[4]] = HunterInfoBox."Runtime";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[5]] = HunterInfoBox."Task: ";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[6]] = HunterInfoBox."Caught: ";
    }

    static {
        HunterInfoBox.lIIIllIllIlIlII();
        HunterInfoBox.lIIIllIllIlIIll();
    }

    private static boolean lIIIllIllIlIllI(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HunterInfoBox.lIIIllIllIlIlIl(this.s.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.s.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlllIIIIl[0], lllIlllIIIIl[0], lllIlllIIIIl[0], lllIlllIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(lllIlllIIIII[lllIlllIIIIl[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[2]]).right(lllIlllIIIII[lllIlllIIIIl[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[5]]).right(this.t.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[6]]).right(this.s.a() + " (" + this.c(this.s.a()) + "/hr)").build());
        0;
        int n2 = lllIlllIIIIl[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlllIIIIl[8], lllIlllIIIIl[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HunterInfoBox(SquireHunter squireHunter) {
        this.s = squireHunter;
        this.t = squireHunter.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIIllIllIlIIIl(String lllllllllllllllIIlIlllIlIIIllIII, String lllllllllllllllIIlIlllIlIIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIlIIIllIlI.init(lllIlllIIIIl[3], lllllllllllllllIIlIlllIlIIIllIll);
            return new String(lllllllllllllllIIlIlllIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlIIIllIIl) {
            lllllllllllllllIIlIlllIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIllIlIIlI(String lllllllllllllllIIlIlllIlIIIIlIll, String lllllllllllllllIIlIlllIlIIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlllIIIIl[10]), "DES");
            Cipher lllllllllllllllIIlIlllIlIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIlIIIIllIl.init(lllIlllIIIIl[3], lllllllllllllllIIlIlllIlIIIIlllI);
            return new String(lllllllllllllllIIlIlllIlIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlIIIIllII) {
            lllllllllllllllIIlIlllIlIIIIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIllIlIlII() {
        lllIlllIIIIl = new int[11];
        HunterInfoBox.lllIlllIIIIl[0] = 0x7C ^ 0x76;
        HunterInfoBox.lllIlllIIIIl[1] = (0x3B ^ 0x41 ^ (0x2B ^ 0x47)) & (101 + 11 - 32 + 59 ^ 91 + 14 - -33 + 19 ^ -1);
        HunterInfoBox.lllIlllIIIIl[2] = 1;
        HunterInfoBox.lllIlllIIIIl[3] = 2;
        HunterInfoBox.lllIlllIIIIl[4] = 3;
        HunterInfoBox.lllIlllIIIIl[5] = 0x7D ^ 0x79;
        HunterInfoBox.lllIlllIIIIl[6] = 0xDB ^ 0xBD ^ (0x68 ^ 0xB);
        HunterInfoBox.lllIlllIIIIl[7] = -(0xFFFFEE5F & 0x7DE5) & (0xFFFFFD6F & 0x6FD6);
        HunterInfoBox.lllIlllIIIIl[8] = 0x6D ^ 0x79;
        HunterInfoBox.lllIlllIIIIl[9] = 0x4E ^ 0x48;
        HunterInfoBox.lllIlllIIIIl[10] = 125 + 21 - 114 + 174 ^ 101 + 107 - 107 + 97;
    }
}

