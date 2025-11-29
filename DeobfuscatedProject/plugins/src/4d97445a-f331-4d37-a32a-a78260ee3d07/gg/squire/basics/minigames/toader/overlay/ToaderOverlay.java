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
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.minigames.toader.overlay;

import com.google.inject.Inject;
import gg.squire.basics.minigames.toader.SquireToadKiller;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class ToaderOverlay
extends OverlayPanel {
    private final /* synthetic */ SquireToadKiller fl;
    private static /* synthetic */ String[] lllIlIlll;
    private static /* synthetic */ int[] lllIllIII;
    private final /* synthetic */ TaskManager fm;

    private static boolean llIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ToaderOverlay.llIIlIllIII();
        ToaderOverlay.llIIlIlIlll();
    }

    private static String llIIlIlIlIl(String lIlIlIIlIllllll, String lIlIlIIlIllllII) {
        try {
            SecretKeySpec lIlIlIIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIlIllllII.getBytes(StandardCharsets.UTF_8)), lllIllIII[9]), "DES");
            Cipher lIlIlIIllIIIIIl = Cipher.getInstance("DES");
            lIlIlIIllIIIIIl.init(lllIllIII[2], lIlIlIIllIIIIlI);
            return new String(lIlIlIIllIIIIIl.doFinal(Base64.getDecoder().decode(lIlIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIllIIIIII) {
            lIlIlIIllIIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIlII(String lIlIlIIlIIllIlI, String lIlIlIIlIIllIIl) {
        try {
            SecretKeySpec lIlIlIIlIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIlIIlllII = Cipher.getInstance("Blowfish");
            lIlIlIIlIIlllII.init(lllIllIII[2], lIlIlIIlIIlllIl);
            return new String(lIlIlIIlIIlllII.doFinal(Base64.getDecoder().decode(lIlIlIIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIlIIllIll) {
            lIlIlIIlIIllIll.printStackTrace();
            return null;
        }
    }

    @Inject
    private ToaderOverlay(SquireToadKiller squireToadKiller) {
        this.fl = squireToadKiller;
        this.fm = squireToadKiller.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ToaderOverlay.llIIlIllIIl(this.fl.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.fl.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlll[lllIllIII[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[1]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[2]]).right(lllIlIlll[lllIllIII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[4]]).right(this.fm.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[5]]).right(String.valueOf(this.fl.cs())).build());
        "".length();
        int n2 = lllIllIII[6];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIllIII[7], lllIllIII[0]));
        return super.render(graphics2D);
    }

    private static void llIIlIlIlll() {
        lllIlIlll = new String[lllIllIII[8]];
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[0]] = ToaderOverlay.llIIlIlIlII("7HKXc/B/RItUr3uhrmjMitLsGqjYe7TM", "sTwfp");
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[1]] = ToaderOverlay.llIIlIlIlIl("2eWjqyeKVBY=", "haBiN");
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[2]] = ToaderOverlay.llIIlIlIlIl("Wn9qEczaYnQ=", "NwvqJ");
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[3]] = ToaderOverlay.llIIlIlIlII("p6nwf1LOOTM=", "dMMXf");
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[4]] = ToaderOverlay.llIIlIlIllI("Ixc/PUNX", "wvLVy");
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[5]] = ToaderOverlay.llIIlIlIlIl("ZGi58OsV0JNcLajFKRGTng==", "qVIQj");
    }

    private static void llIIlIllIII() {
        lllIllIII = new int[10];
        ToaderOverlay.lllIllIII[0] = (0x24 ^ 0x22) & ~(0x43 ^ 0x45);
        ToaderOverlay.lllIllIII[1] = " ".length();
        ToaderOverlay.lllIllIII[2] = "  ".length();
        ToaderOverlay.lllIllIII[3] = "   ".length();
        ToaderOverlay.lllIllIII[4] = 0xA5 ^ 0xA1;
        ToaderOverlay.lllIllIII[5] = 0x33 ^ 0x72 ^ (0x26 ^ 0x62);
        ToaderOverlay.lllIllIII[6] = -(0xFFFFEEFF & 0x7DFD) & (0xFFFFEDFF & 0x7FFE);
        ToaderOverlay.lllIllIII[7] = 5 + 79 - 79 + 178 ^ 67 + 144 - 204 + 156;
        ToaderOverlay.lllIllIII[8] = 0x46 ^ 0x35 ^ (0x52 ^ 0x27);
        ToaderOverlay.lllIllIII[9] = 0xB5 ^ 0xA4 ^ (0xA ^ 0x13);
    }

    private static String llIIlIlIllI(String lIlIlIIlIlIlIlI, String lIlIlIIlIlIlIIl) {
        lIlIlIIlIlIlIlI = new String(Base64.getDecoder().decode(lIlIlIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIlIlIllIl = new StringBuilder();
        char[] lIlIlIIlIlIllII = lIlIlIIlIlIlIIl.toCharArray();
        int lIlIlIIlIlIlIll = lllIllIII[0];
        char[] lIlIlIIlIlIIlIl = lIlIlIIlIlIlIlI.toCharArray();
        int lIlIlIIlIlIIlII = lIlIlIIlIlIIlIl.length;
        int lIlIlIIlIlIIIll = lllIllIII[0];
        while (ToaderOverlay.llIIlIllIlI(lIlIlIIlIlIIIll, lIlIlIIlIlIIlII)) {
            char lIlIlIIlIllIIII = lIlIlIIlIlIIlIl[lIlIlIIlIlIIIll];
            lIlIlIIlIlIllIl.append((char)(lIlIlIIlIllIIII ^ lIlIlIIlIlIllII[lIlIlIIlIlIlIll % lIlIlIIlIlIllII.length]));
            "".length();
            ++lIlIlIIlIlIlIll;
            ++lIlIlIIlIlIIIll;
            "".length();
            if (-" ".length() <= (0x11 ^ 0x15)) continue;
            return null;
        }
        return String.valueOf(lIlIlIIlIlIllIl);
    }

    private static boolean llIIlIllIIl(int n2) {
        return n2 != 0;
    }
}

