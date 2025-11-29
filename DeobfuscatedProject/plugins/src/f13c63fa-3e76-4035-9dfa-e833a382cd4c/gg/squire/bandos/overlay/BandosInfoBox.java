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
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.client.Static
 */
package gg.squire.bandos.overlay;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.client.plugins.fw.TaskManager;
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
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.k;
import q.s.r.i.e.s.o.u.a.d.n.-.b.w;

public class BandosInfoBox
extends OverlayPanel {
    private final /* synthetic */ TaskManager G;
    private final /* synthetic */ k F;
    private final /* synthetic */ e E;
    private final /* synthetic */ SquireBandos D;
    private final /* synthetic */ w H;
    private static /* synthetic */ int[] lllIIIIIIlI;
    private static /* synthetic */ String[] lllIIIIIIIl;

    private static void lIlIllIIlIllII() {
        lllIIIIIIIl = new String[lllIIIIIIlI[8]];
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[1]] = BandosInfoBox.lIlIllIIlIlIlI("KgsjOzccWhQzKx0VJQ==", "yzVRE");
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[2]] = BandosInfoBox.lIlIllIIlIlIlI("FxMcDSImUhMFJCMX", "UrriM");
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[3]] = BandosInfoBox.lIlIllIIlIlIlI("ICgmGQoMZicfAQQ=", "iFUpn");
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[4]] = BandosInfoBox.lIlIllIIlIlIll("CmuPcmG4lbRvNuuhydOMKw==", "iJBJE");
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[5]] = BandosInfoBox.lIlIllIIlIlIll("Xu7pbl7ZOWLvnabQt8hF6Dyn/G/9VWXi", "KJCWq");
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[6]] = BandosInfoBox.lIlIllIIlIlIlI("EQwqRSUzHjBFJGAd", "RmDeF");
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[7]] = BandosInfoBox.lIlIllIIlIlIll("IxuoVlhEXvjVDxDmr0iTcg==", "Bqqvf");
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BandosInfoBox.lIlIllIIlIllll(this.D.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIIIIIlI[0], lllIIIIIIlI[0], lllIIIIIIlI[0], lllIIIIIIlI[0]));
        String string = lllIIIIIIIl[lllIIIIIIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[2]]).right(String.valueOf(this.E.s())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[3]]).right(String.valueOf(this.E.t())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[4]]).right(String.valueOf(this.E.A())).build());
        "".length();
        int n2 = Math.max(lllIIIIIIlI[1], this.H.Q() - Static.getClient().getTickCount());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[5]]).right(String.valueOf(n2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[6]]).right(String.valueOf(SpellBook.Standard.BONES_TO_PEACHES.canCast())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[7]]).right(this.G.getCurrentTask()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean lIlIllIIlIllll(int n2) {
        return n2 != 0;
    }

    private static String lIlIllIIlIlIlI(String llllllllllllllllIIlIlIIIlllIIIlI, String llllllllllllllllIIlIlIIIlllIIllI) {
        llllllllllllllllIIlIlIIIlllIIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIlllIIlIl = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIlllIIlII = llllllllllllllllIIlIlIIIlllIIllI.toCharArray();
        int llllllllllllllllIIlIlIIIlllIIIll = lllIIIIIIlI[1];
        char[] llllllllllllllllIIlIlIIIllIlllIl = llllllllllllllllIIlIlIIIlllIIIlI.toCharArray();
        int llllllllllllllllIIlIlIIIllIlllII = llllllllllllllllIIlIlIIIllIlllIl.length;
        int llllllllllllllllIIlIlIIIllIllIll = lllIIIIIIlI[1];
        while (BandosInfoBox.lIlIllIIllIIII(llllllllllllllllIIlIlIIIllIllIll, llllllllllllllllIIlIlIIIllIlllII)) {
            char llllllllllllllllIIlIlIIIlllIlIII = llllllllllllllllIIlIlIIIllIlllIl[llllllllllllllllIIlIlIIIllIllIll];
            llllllllllllllllIIlIlIIIlllIIlIl.append((char)(llllllllllllllllIIlIlIIIlllIlIII ^ llllllllllllllllIIlIlIIIlllIIlII[llllllllllllllllIIlIlIIIlllIIIll % llllllllllllllllIIlIlIIIlllIIlII.length]));
            "".length();
            ++llllllllllllllllIIlIlIIIlllIIIll;
            ++llllllllllllllllIIlIlIIIllIllIll;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIIlllIIlIl);
    }

    private static void lIlIllIIlIlllI() {
        lllIIIIIIlI = new int[10];
        BandosInfoBox.lllIIIIIIlI[0] = 70 + 64 - 26 + 69 ^ 185 + 36 - 54 + 20;
        BandosInfoBox.lllIIIIIIlI[1] = (0x36 ^ 0x6C) & ~(0x55 ^ 0xF);
        BandosInfoBox.lllIIIIIIlI[2] = " ".length();
        BandosInfoBox.lllIIIIIIlI[3] = "  ".length();
        BandosInfoBox.lllIIIIIIlI[4] = "   ".length();
        BandosInfoBox.lllIIIIIIlI[5] = 0x8C ^ 0x88;
        BandosInfoBox.lllIIIIIIlI[6] = 0x38 ^ 0x3D;
        BandosInfoBox.lllIIIIIIlI[7] = 0x17 ^ 0x11;
        BandosInfoBox.lllIIIIIIlI[8] = 0x6B ^ 0x49 ^ (0x4E ^ 0x6B);
        BandosInfoBox.lllIIIIIIlI[9] = 0x4D ^ 0x45;
    }

    @Inject
    public BandosInfoBox(SquireBandos squireBandos, e e2, k k2, w w2) {
        this.D = squireBandos;
        this.E = e2;
        this.F = k2;
        this.G = squireBandos.getManager();
        this.H = w2;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlIllIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        BandosInfoBox.lIlIllIIlIlllI();
        BandosInfoBox.lIlIllIIlIllII();
    }

    private static String lIlIllIIlIlIll(String llllllllllllllllIIlIlIIIllllIlll, String llllllllllllllllIIlIlIIIllllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIlllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllllIlII.getBytes(StandardCharsets.UTF_8)), lllIIIIIIlI[9]), "DES");
            Cipher llllllllllllllllIIlIlIIIlllllIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIlllllIIl.init(lllIIIIIIlI[3], llllllllllllllllIIlIlIIIlllllIlI);
            return new String(llllllllllllllllIIlIlIIIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIlllllIII) {
            llllllllllllllllIIlIlIIIlllllIII.printStackTrace();
            return null;
        }
    }
}

