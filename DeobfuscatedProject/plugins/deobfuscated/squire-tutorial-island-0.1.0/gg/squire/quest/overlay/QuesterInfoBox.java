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
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireTutorialIsland;
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
import net.unethicalite.api.game.Vars;

public class QuesterInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIlIIIlIIllII;
    private final /* synthetic */ TaskManager ag;
    private static /* synthetic */ int[] lIlIIIlIIllll;

    private static void lIllIlllllIllIl() {
        lIlIIIlIIllll = new int[9];
        QuesterInfoBox.lIlIIIlIIllll[0] = (5 ^ 0x69 ^ (0x4F ^ 0x34)) & (60 + 126 - 129 + 78 ^ 6 + 104 - 8 + 42 ^ -1);
        QuesterInfoBox.lIlIIIlIIllll[1] = 1;
        QuesterInfoBox.lIlIIIlIIllll[2] = 2;
        QuesterInfoBox.lIlIIIlIIllll[3] = 3;
        QuesterInfoBox.lIlIIIlIIllll[4] = 26 + 133 - 39 + 66 ^ 6 + 138 - 21 + 67;
        QuesterInfoBox.lIlIIIlIIllll[5] = 0xFFFF879F & 0x7979;
        QuesterInfoBox.lIlIIIlIIllll[6] = -(0xFFFFFEFD & 0x136B) & (0xFFFFB36E & 0x5FFB);
        QuesterInfoBox.lIlIIIlIIllll[7] = 0 + 18 - -20 + 118 ^ 15 + 46 - -13 + 79;
        QuesterInfoBox.lIlIIIlIIllll[8] = 0x7E ^ 0x15 ^ (0x46 ^ 0x25);
    }

    private static void lIllIlllllIllII() {
        lIlIIIlIIllII = new String[lIlIIIlIIllll[7]];
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[0]] = QuesterInfoBox."Squire Quester";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[1]] = QuesterInfoBox."Version";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[2]] = QuesterInfoBox."0.1.3";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[3]] = QuesterInfoBox."Task: ";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[4]] = QuesterInfoBox."Current Step: ";
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIIlIIllII[lIlIIIlIIllll[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[1]]).right(lIlIIIlIIllII[lIlIIIlIIllll[2]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[3]]).right(this.ag.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[4]]).right(String.valueOf(Vars.getVarp((int)lIlIIIlIIllll[5]))).build());
        0;
        int n2 = lIlIIIlIIllll[6];
        this.panelComponent.setPreferredSize(new Dimension(n2, lIlIIIlIIllll[0]));
        return super.render(graphics2D);
    }

    private static String lIllIlllllIlIll(String llllllllllllllIlllIIIlIlllIllIlI, String llllllllllllllIlllIIIlIlllIllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIlllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlllIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIllll[8]), "DES");
            Cipher llllllllllllllIlllIIIlIlllIlllII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIlllIlllII.init(lIlIIIlIIllll[2], llllllllllllllIlllIIIlIlllIlllIl);
            return new String(llllllllllllllIlllIIIlIlllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIlllIllIll) {
            llllllllllllllIlllIIIlIlllIllIll.printStackTrace();
            return null;
        }
    }

    static {
        QuesterInfoBox.lIllIlllllIllIl();
        QuesterInfoBox.lIllIlllllIllII();
    }

    private static boolean lIllIlllllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlllllIlIlI(String llllllllllllllIlllIIIlIlllllllII, String llllllllllllllIlllIIIlIllllllIll) {
        llllllllllllllIlllIIIlIlllllllII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIlIllllllIlI = new StringBuilder();
        char[] llllllllllllllIlllIIIlIllllllIIl = llllllllllllllIlllIIIlIllllllIll.toCharArray();
        int llllllllllllllIlllIIIlIllllllIII = lIlIIIlIIllll[0];
        char[] llllllllllllllIlllIIIlIlllllIIlI = llllllllllllllIlllIIIlIlllllllII.toCharArray();
        int llllllllllllllIlllIIIlIlllllIIIl = llllllllllllllIlllIIIlIlllllIIlI.length;
        int llllllllllllllIlllIIIlIlllllIIII = lIlIIIlIIllll[0];
        while (QuesterInfoBox.lIllIlllllIlllI(llllllllllllllIlllIIIlIlllllIIII, llllllllllllllIlllIIIlIlllllIIIl)) {
            char llllllllllllllIlllIIIlIlllllllIl = llllllllllllllIlllIIIlIlllllIIlI[llllllllllllllIlllIIIlIlllllIIII];
            llllllllllllllIlllIIIlIllllllIlI.append((char)(llllllllllllllIlllIIIlIlllllllIl ^ llllllllllllllIlllIIIlIllllllIIl[llllllllllllllIlllIIIlIllllllIII % llllllllllllllIlllIIIlIllllllIIl.length]));
            0;
            ++llllllllllllllIlllIIIlIllllllIII;
            ++llllllllllllllIlllIIIlIlllllIIII;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIlIllllllIlI);
    }

    private static String lIllIlllllIlIIl(String llllllllllllllIlllIIIlIllllIIlll, String llllllllllllllIlllIIIlIllllIIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIllllIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIllllIlIIl.init(lIlIIIlIIllll[2], llllllllllllllIlllIIIlIllllIlIlI);
            return new String(llllllllllllllIlllIIIlIllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIllllIlIII) {
            llllllllllllllIlllIIIlIllllIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public QuesterInfoBox(SquireTutorialIsland squireTutorialIsland) {
        this.ag = squireTutorialIsland.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }
}

