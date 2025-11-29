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
package gg.squire.saradomin.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.saradomin.SquireSaradomin;
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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.f;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

public class SaraInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIIlIlIlIIIll;
    private final /* synthetic */ g F;
    private static /* synthetic */ String[] lIIlIlIlIIIIl;
    private final /* synthetic */ f G;
    private final /* synthetic */ SquireSaradomin E;
    private final /* synthetic */ TaskManager H;

    private static String lIlIlIllllIlIlI(String llllllllllllllIllllIlllIllIllIlI, String llllllllllllllIllllIlllIllIllIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIllIllIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIIIll[8]), "DES");
            Cipher llllllllllllllIllllIlllIllIlllII = Cipher.getInstance("DES");
            llllllllllllllIllllIlllIllIlllII.init(lIIlIlIlIIIll[3], llllllllllllllIllllIlllIllIlllIl);
            return new String(llllllllllllllIllllIlllIllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlllIllIllIll) {
            llllllllllllllIllllIlllIllIllIll.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SaraInfoBox.lIlIlIlllllIIII(this.E.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlIlIlIIIll[0], lIIlIlIlIIIll[0], lIIlIlIlIIIll[0], lIIlIlIlIIIll[0]));
        String string = lIIlIlIlIIIIl[lIIlIlIlIIIll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[2]]).right(String.valueOf(this.F.l())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[3]]).right(String.valueOf(this.F.m())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[4]]).right(String.valueOf(this.F.u())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[5]]).right(this.H.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[6]]).right(String.valueOf(this.E.a())).build());
        0;
        return super.render(graphics2D);
    }

    private static String lIlIlIllllIlIII(String llllllllllllllIllllIlllIlllIllll, String llllllllllllllIllllIlllIlllIlllI) {
        llllllllllllllIllllIlllIlllIllll = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIlllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlllIlllIllIl = new StringBuilder();
        char[] llllllllllllllIllllIlllIlllIllII = llllllllllllllIllllIlllIlllIlllI.toCharArray();
        int llllllllllllllIllllIlllIlllIlIll = lIIlIlIlIIIll[1];
        char[] llllllllllllllIllllIlllIlllIIlIl = llllllllllllllIllllIlllIlllIllll.toCharArray();
        int llllllllllllllIllllIlllIlllIIlII = llllllllllllllIllllIlllIlllIIlIl.length;
        int llllllllllllllIllllIlllIlllIIIll = lIIlIlIlIIIll[1];
        while (SaraInfoBox.lIlIlIlllllIIIl(llllllllllllllIllllIlllIlllIIIll, llllllllllllllIllllIlllIlllIIlII)) {
            char llllllllllllllIllllIlllIllllIIII = llllllllllllllIllllIlllIlllIIlIl[llllllllllllllIllllIlllIlllIIIll];
            llllllllllllllIllllIlllIlllIllIl.append((char)(llllllllllllllIllllIlllIllllIIII ^ llllllllllllllIllllIlllIlllIllII[llllllllllllllIllllIlllIlllIlIll % llllllllllllllIllllIlllIlllIllII.length]));
            0;
            ++llllllllllllllIllllIlllIlllIlIll;
            ++llllllllllllllIllllIlllIlllIIIll;
            0;
            if (3 > ((0xF2 ^ 0xA8) & ~(0x7D ^ 0x27))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlllIlllIllIl);
    }

    private static void lIlIlIllllIlllI() {
        lIIlIlIlIIIIl = new String[lIIlIlIlIIIll[7]];
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[1]] = SaraInfoBox."Squire Saradomin";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[2]] = SaraInfoBox."Zily alive";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[3]] = SaraInfoBox."Inside room";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[4]] = SaraInfoBox."Sara Kills";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[5]] = SaraInfoBox."Current Task";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[6]] = SaraInfoBox."Banking";
    }

    @Inject
    public SaraInfoBox(SquireSaradomin squireSaradomin, g g2, f f2) {
        this.E = squireSaradomin;
        this.F = g2;
        this.G = f2;
        this.H = squireSaradomin.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlIlIlllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlllllIIII(int n2) {
        return n2 != 0;
    }

    static {
        SaraInfoBox.lIlIlIllllIllll();
        SaraInfoBox.lIlIlIllllIlllI();
    }

    private static String lIlIlIllllIlIIl(String llllllllllllllIllllIlllIllIIlIll, String llllllllllllllIllllIlllIllIIllII) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlllIllIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlllIllIIllll.init(lIIlIlIlIIIll[3], llllllllllllllIllllIlllIllIlIIII);
            return new String(llllllllllllllIllllIlllIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlllIllIIlllI) {
            llllllllllllllIllllIlllIllIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllllIllll() {
        lIIlIlIlIIIll = new int[9];
        SaraInfoBox.lIIlIlIlIIIll[0] = 0xA1 ^ 0x98 ^ (0xBE ^ 0x8D);
        SaraInfoBox.lIIlIlIlIIIll[1] = (0x42 ^ 0x6C) & ~(0xBB ^ 0x95);
        SaraInfoBox.lIIlIlIlIIIll[2] = 1;
        SaraInfoBox.lIIlIlIlIIIll[3] = 2;
        SaraInfoBox.lIIlIlIlIIIll[4] = 3;
        SaraInfoBox.lIIlIlIlIIIll[5] = 0x79 ^ 0x7D;
        SaraInfoBox.lIIlIlIlIIIll[6] = 0x33 ^ 0x36;
        SaraInfoBox.lIIlIlIlIIIll[7] = 0x39 ^ 0x3F;
        SaraInfoBox.lIIlIlIlIIIll[8] = 0x1C ^ 0x14;
    }
}

