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
 */
package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
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

public class QuesterInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIIIllIIIlIIl;
    private static /* synthetic */ String[] lIIIllIIIlIII;
    private final /* synthetic */ TaskManager af;

    private static void lIlIIIIllIIllll() {
        lIIIllIIIlIIl = new int[7];
        QuesterInfoBox.lIIIllIIIlIIl[0] = (0xE3 ^ 0xBD) & ~(0xE3 ^ 0xBD);
        QuesterInfoBox.lIIIllIIIlIIl[1] = 1;
        QuesterInfoBox.lIIIllIIIlIIl[2] = 2;
        QuesterInfoBox.lIIIllIIIlIIl[3] = 3;
        QuesterInfoBox.lIIIllIIIlIIl[4] = -(0xFFFFF166 & 0x5EDF) & (0xFFFFD17F & 0x7FC7);
        QuesterInfoBox.lIIIllIIIlIIl[5] = 176 + 196 - 360 + 185 ^ 21 + 79 - 29 + 122;
        QuesterInfoBox.lIIIllIIIlIIl[6] = 0x23 ^ 0x2B;
    }

    private static String lIlIIIIllIIlIll(String lllllllllllllllIIIIlIllIlIlIIIII, String lllllllllllllllIIIIlIllIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIIllIIIlIIl[6]), "DES");
            Cipher lllllllllllllllIIIIlIllIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIllIlIlIIIlI.init(lIIIllIIIlIIl[2], lllllllllllllllIIIIlIllIlIlIIIll);
            return new String(lllllllllllllllIIIIlIllIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIllIlIlIIIIl) {
            lllllllllllllllIIIIlIllIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIllIIIlIII[lIIIllIIIlIIl[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIllIIIlIII[lIIIllIIIlIIl[1]]).right(lIIIllIIIlIII[lIIIllIIIlIIl[2]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIllIIIlIII[lIIIllIIIlIIl[3]]).right(this.af.getCurrentTask()).build());
        0;
        int n2 = lIIIllIIIlIIl[4];
        this.panelComponent.setPreferredSize(new Dimension(n2, lIIIllIIIlIIl[0]));
        return super.render(graphics2D);
    }

    private static String lIlIIIIllIIllIl(String lllllllllllllllIIIIlIllIlIIIlIll, String lllllllllllllllIIIIlIllIlIIIlIlI) {
        lllllllllllllllIIIIlIllIlIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIllIlIIIlllI = new StringBuilder();
        char[] lllllllllllllllIIIIlIllIlIIIllIl = lllllllllllllllIIIIlIllIlIIIlIlI.toCharArray();
        int lllllllllllllllIIIIlIllIlIIIllII = lIIIllIIIlIIl[0];
        char[] lllllllllllllllIIIIlIllIlIIIIllI = lllllllllllllllIIIIlIllIlIIIlIll.toCharArray();
        int lllllllllllllllIIIIlIllIlIIIIlIl = lllllllllllllllIIIIlIllIlIIIIllI.length;
        int lllllllllllllllIIIIlIllIlIIIIlII = lIIIllIIIlIIl[0];
        while (QuesterInfoBox.lIlIIIIllIlIIII(lllllllllllllllIIIIlIllIlIIIIlII, lllllllllllllllIIIIlIllIlIIIIlIl)) {
            char lllllllllllllllIIIIlIllIlIIlIIIl = lllllllllllllllIIIIlIllIlIIIIllI[lllllllllllllllIIIIlIllIlIIIIlII];
            lllllllllllllllIIIIlIllIlIIIlllI.append((char)(lllllllllllllllIIIIlIllIlIIlIIIl ^ lllllllllllllllIIIIlIllIlIIIllIl[lllllllllllllllIIIIlIllIlIIIllII % lllllllllllllllIIIIlIllIlIIIllIl.length]));
            0;
            ++lllllllllllllllIIIIlIllIlIIIllII;
            ++lllllllllllllllIIIIlIllIlIIIIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIllIlIIIlllI);
    }

    private static void lIlIIIIllIIlllI() {
        lIIIllIIIlIII = new String[lIIIllIIIlIIl[5]];
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[0]] = QuesterInfoBox."Squire Quester";
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[1]] = QuesterInfoBox."Version";
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[2]] = QuesterInfoBox."0.1.3";
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[3]] = QuesterInfoBox."Task: ";
    }

    private static boolean lIlIIIIllIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        QuesterInfoBox.lIlIIIIllIIllll();
        QuesterInfoBox.lIlIIIIllIIlllI();
    }

    private static String lIlIIIIllIIllII(String lllllllllllllllIIIIlIllIlIlIllIl, String lllllllllllllllIIIIlIllIlIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIllIlIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIllIlIlIllll.init(lIIIllIIIlIIl[2], lllllllllllllllIIIIlIllIlIllIIII);
            return new String(lllllllllllllllIIIIlIllIlIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIllIlIlIlllI) {
            lllllllllllllllIIIIlIllIlIlIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public QuesterInfoBox(SquireQuester squireQuester) {
        this.af = squireQuester.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }
}

