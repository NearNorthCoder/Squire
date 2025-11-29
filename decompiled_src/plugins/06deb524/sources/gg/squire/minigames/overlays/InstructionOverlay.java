package gg.squire.minigames.overlays;

import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.AbstractC0007h;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.C0014o;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
@Singleton
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:gg/squire/minigames/overlays/InstructionOverlay.class */
public class InstructionOverlay extends OverlayPanel {
    @Inject
    private /* synthetic */ C0014o j;
    @Inject
    private /* synthetic */ D aG;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    private static /* synthetic */ int[] lIIllIIllIll;
    private static /* synthetic */ String[] lIIllIIllIlI;
    private static final /* synthetic */ Color bU;
    public static final /* synthetic */ String bT;
    private final /* synthetic */ SquireBlastFurnace bV;

    private static String llIIlllIlIllll(String lllllllllllllllIlllIlllIlIlIlIlI, String lllllllllllllllIlllIlllIlIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIllIIllIll[9]), "DES");
            Cipher lllllllllllllllIlllIlllIlIlIllII = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllIlIlIllII.init(lIIllIIllIll[2], secretKeySpec);
            return new String(lllllllllllllllIlllIlllIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllIlIlIlIll) {
            lllllllllllllllIlllIlllIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIllIIII() {
        lIIllIIllIlI = new String[lIIllIIllIll[9]];
        lIIllIIllIlI[lIIllIIllIll[0]] = llIIlllIlIllIl("OsQU7Ng6lDI=", "geKFx");
        lIIllIIllIlI[lIIllIIllIll[1]] = llIIlllIlIlllI("MDYiCXQXOzADIFUxJAI6FDQ0UDsDMiMcNQw=", "uWQpT");
        lIIllIIllIlI[lIIllIIllIll[2]] = llIIlllIlIllll("g5+gnQ+HV18oXNcVK8oDMw==", "ePoAl");
        lIIllIIllIlI[lIIllIIllIll[3]] = llIIlllIlIllll("5rG+pN58IUEh2W9T0tV+JprSyVGEKqaaYj0Cb8pLV7U=", "qlZia");
        lIIllIIllIlI[lIIllIIllIll[4]] = llIIlllIlIllIl("uzOSnSmSNz0wgIrOMw0BI9CCWg3GZwyO", "BkldY");
        lIIllIIllIlI[lIIllIIllIll[5]] = llIIlllIlIllll("P6wJStsotvv5xmAKzk+mP6KrAmE2KXZbTHpjH1MLeRaLRTm5/dMTxCvqAVUYgRVT3Y4WZKs68PbhgJ8qOo9KfIffD5deVRjNKUwO+lgYA3xDSlnPNj79r8eumoFsJCxcD+vFTijBjoQ=", "EufZk");
        lIIllIIllIlI[lIIllIIllIll[6]] = llIIlllIlIlllI("FA8=", "LKjUV");
        lIIllIIllIlI[lIIllIIllIll[7]] = llIIlllIlIlllI("JQgcIQY=", "wmoDr");
    }

    static {
        llIIlllIllIIIl();
        llIIlllIllIIII();
        bT = lIIllIIllIlI[lIIllIIllIll[7]];
        bU = new Color(lIIllIIllIll[8], lIIllIIllIll[8], lIIllIIllIll[8]);
    }

    private static void llIIlllIllIIIl() {
        lIIllIIllIll = new int[10];
        lIIllIIllIll[0] = (111 ^ 60) & ((251 ^ 168) ^ (-1));
        lIIllIIllIll[1] = " ".length();
        lIIllIIllIll[2] = "  ".length();
        lIIllIIllIll[3] = "   ".length();
        lIIllIIllIll[4] = 41 ^ 45;
        lIIllIIllIll[5] = (248 ^ 145) ^ (249 ^ 149);
        lIIllIIllIll[6] = 165 ^ 163;
        lIIllIIllIll[7] = (69 ^ 86) ^ (40 ^ 60);
        lIIllIIllIll[8] = ((102 + 16) - 25) + 97;
        lIIllIIllIll[9] = 72 ^ 64;
    }

    @Inject
    InstructionOverlay(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace);
        this.bV = squireBlastFurnace;
        getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY, lIIllIIllIlI[lIIllIIllIll[0]], lIIllIIllIlI[lIIllIIllIll[1]]));
        "".length();
        getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, lIIllIIllIlI[lIIllIIllIll[2]], lIIllIIllIlI[lIIllIIllIll[3]]));
        "".length();
    }

    private static boolean llIIlllIllIIlI(Object obj) {
        return obj != null;
    }

    private static String llIIlllIlIlllI(String lllllllllllllllIlllIlllIlIllllll, String lllllllllllllllIlllIlllIlIlllllI) {
        String lllllllllllllllIlllIlllIlIllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIlllIlllIlIllllII = lllllllllllllllIlllIlllIlIlllllI.toCharArray();
        int lllllllllllllllIlllIlllIlIlllIll = lIIllIIllIll[0];
        char[] charArray = lllllllllllllllIlllIlllIlIllllll2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlllIlllIlIllIIll = lIIllIIllIll[0];
        while (llIIlllIllIIll(lllllllllllllllIlllIlllIlIllIIll, length)) {
            char lllllllllllllllIlllIlllIllIIIIII = charArray[lllllllllllllllIlllIlllIlIllIIll];
            lllllllllllllllIlllIlllIlIllllIl.append((char) (lllllllllllllllIlllIlllIllIIIIII ^ lllllllllllllllIlllIlllIlIllllII[lllllllllllllllIlllIlllIlIlllIll % lllllllllllllllIlllIlllIlIllllII.length]));
            "".length();
            lllllllllllllllIlllIlllIlIlllIll++;
            lllllllllllllllIlllIlllIlIllIIll++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIlllIlIllllIl);
    }

    private static String llIIlllIlIllIl(String lllllllllllllllIlllIlllIllIIllll, String lllllllllllllllIlllIlllIllIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIllIll[2], lllllllllllllllIlllIlllIllIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllIllIlIIII) {
            lllllllllllllllIlllIlllIllIlIIII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        String str2;
        AbstractC0007h X = this.aG.X();
        w Y = this.aG.Y();
        if (llIIlllIllIIlI(X)) {
            str = X.g();
            "".length();
            if ((-(85 ^ 81)) > 0) {
                return null;
            }
        } else {
            str = lIIllIIllIlI[lIIllIIllIll[4]];
        }
        String str3 = str;
        if (llIIlllIllIIlI(Y)) {
            str2 = Y.J();
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        } else {
            str2 = lIIllIIllIlI[lIIllIIllIll[5]];
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().text(lIIllIIllIlI[lIIllIIllIll[6]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(str3).leftColor(ColorScheme.PROGRESS_COMPLETE_COLOR).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(str2).leftColor(bU).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean llIIlllIllIIll(int i, int i2) {
        return i < i2;
    }
}
