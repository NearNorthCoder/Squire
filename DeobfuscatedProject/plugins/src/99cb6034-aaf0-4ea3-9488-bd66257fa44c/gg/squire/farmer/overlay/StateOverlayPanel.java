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
package gg.squire.farmer.overlay;

import -.m.e.a.u.s.r.r.q.i.r.e.f.b;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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

public class StateOverlayPanel
extends OverlayPanel {
    private final /* synthetic */ SquireFarmer bP;
    private static /* synthetic */ String[] lIllllIllllI;
    private static /* synthetic */ int[] lIlllllIIIII;
    private final /* synthetic */ SquireFarmerConfig bO;
    private final /* synthetic */ b bN;
    private final /* synthetic */ f bM;
    private final /* synthetic */ TaskManager bQ;

    private static String lllIlllIlllIIl(String lllllllllllllllIlIllIIIlIlIllIII, String lllllllllllllllIlIllIIIlIlIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIlIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIlIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIlIlIlllII.init(lIlllllIIIII[3], lllllllllllllllIlIllIIIlIlIlllIl);
            return new String(lllllllllllllllIlIllIIIlIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIlIlIllIll) {
            lllllllllllllllIlIllIIIlIlIllIll.printStackTrace();
            return null;
        }
    }

    static {
        StateOverlayPanel.lllIllllIIlIIl();
        StateOverlayPanel.lllIlllIllllII();
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.setBorder(new Rectangle(lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0]));
        String string = lIllllIllllI[lIlllllIIIII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[2]]).right(lIllllIllllI[lIlllllIIIII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[4]]).right(String.valueOf(this.bQ.getCurrentTask())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[5]]).right(String.valueOf((Object)this.bP.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[6]]).right(String.valueOf(this.bM.x())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[7]]).right(String.valueOf(this.bM.v())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String lllIlllIlllIlI(String lllllllllllllllIlIllIIIlIlIIllIl, String lllllllllllllllIlIllIIIlIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIlIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), lIlllllIIIII[9]), "DES");
            Cipher lllllllllllllllIlIllIIIlIlIIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIIlIlIIllll.init(lIlllllIIIII[3], lllllllllllllllIlIllIIIlIlIlIIII);
            return new String(lllllllllllllllIlIllIIIlIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIlIlIIlllI) {
            lllllllllllllllIlIllIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public StateOverlayPanel(f f2, b b2, SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer) {
        this.bM = f2;
        this.bN = b2;
        this.bO = squireFarmerConfig;
        this.bP = squireFarmer;
        this.bQ = squireFarmer.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lllIlllIllllII() {
        lIllllIllllI = new String[lIlllllIIIII[8]];
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[1]] = StateOverlayPanel.lllIlllIlllIII("Pj4nOgMIbxQyAwAqIA==", "mORSq");
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[2]] = StateOverlayPanel.lllIlllIlllIIl("jhiG2NtabI45/QbE4CL/uw==", "ZutAU");
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[3]] = StateOverlayPanel.lllIlllIlllIlI("Zop6UFqzbAk=", "YsSCa");
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[4]] = StateOverlayPanel.lllIlllIlllIIl("wmzu3FyqqqeotLRPwT7sPA==", "NLSOK");
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[5]] = StateOverlayPanel.lllIlllIlllIII("FD0hVzs/OCo=", "FHOwO");
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[6]] = StateOverlayPanel.lllIlllIlllIIl("PgMIbfbkG/M=", "SKPYi");
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[7]] = StateOverlayPanel.lllIlllIlllIIl("Ac54Zh+cQZ0=", "ngTLC");
    }

    private static boolean lllIllllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlllIlllIII(String lllllllllllllllIlIllIIIlIllIllll, String lllllllllllllllIlIllIIIlIllIlIIl) {
        lllllllllllllllIlIllIIIlIllIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIIlIllIllIl = new StringBuilder();
        char[] lllllllllllllllIlIllIIIlIllIllII = lllllllllllllllIlIllIIIlIllIlIIl.toCharArray();
        int lllllllllllllllIlIllIIIlIllIlIll = lIlllllIIIII[1];
        char[] lllllllllllllllIlIllIIIlIllIIlIl = lllllllllllllllIlIllIIIlIllIllll.toCharArray();
        int lllllllllllllllIlIllIIIlIllIIlII = lllllllllllllllIlIllIIIlIllIIlIl.length;
        int lllllllllllllllIlIllIIIlIllIIIll = lIlllllIIIII[1];
        while (StateOverlayPanel.lllIllllIIlIlI(lllllllllllllllIlIllIIIlIllIIIll, lllllllllllllllIlIllIIIlIllIIlII)) {
            char lllllllllllllllIlIllIIIlIlllIIII = lllllllllllllllIlIllIIIlIllIIlIl[lllllllllllllllIlIllIIIlIllIIIll];
            lllllllllllllllIlIllIIIlIllIllIl.append((char)(lllllllllllllllIlIllIIIlIlllIIII ^ lllllllllllllllIlIllIIIlIllIllII[lllllllllllllllIlIllIIIlIllIlIll % lllllllllllllllIlIllIIIlIllIllII.length]));
            "".length();
            ++lllllllllllllllIlIllIIIlIllIlIll;
            ++lllllllllllllllIlIllIIIlIllIIIll;
            "".length();
            if (" ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIIIlIllIllIl);
    }

    private static void lllIllllIIlIIl() {
        lIlllllIIIII = new int[10];
        StateOverlayPanel.lIlllllIIIII[0] = 0x74 ^ 0x7E;
        StateOverlayPanel.lIlllllIIIII[1] = (0xF5 ^ 0xA6) & ~(0x33 ^ 0x60);
        StateOverlayPanel.lIlllllIIIII[2] = " ".length();
        StateOverlayPanel.lIlllllIIIII[3] = "  ".length();
        StateOverlayPanel.lIlllllIIIII[4] = "   ".length();
        StateOverlayPanel.lIlllllIIIII[5] = 0xAF ^ 0xAB;
        StateOverlayPanel.lIlllllIIIII[6] = 63 + 174 - 236 + 198 ^ 15 + 105 - -41 + 33;
        StateOverlayPanel.lIlllllIIIII[7] = 0x97 ^ 0xC7 ^ (0xCD ^ 0x9B);
        StateOverlayPanel.lIlllllIIIII[8] = 45 + 19 - 41 + 145 ^ 131 + 93 - 114 + 65;
        StateOverlayPanel.lIlllllIIIII[9] = 0x79 ^ 0x71;
    }
}

