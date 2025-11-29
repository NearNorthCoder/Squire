/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.account.GodsApi.overlay;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e_Unknown;
import com.google.inject.Inject;
import gg.squire.account.AccBuilderBarrows;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIllllll;
    private final /* synthetic */ BuilderConfig bv;
    private static /* synthetic */ int[] llIIIIIl;
    private final /* synthetic */ AccBuilderBarrows bu;

    private static boolean lIlIIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderBarrows.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llIIIIIl[0], llIIIIIl[0], llIIIIIl[0], llIIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllllll[llIIIIIl[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[4]]).right(AccBuilderBarrows.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[5]]).right(String.valueOf(AccBuilderBarrows.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[6]]).right(String.valueOf(AccBuilderBarrows.f)).build());
        0;
        int n2 = llIIIIIl[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIIIIIl[8], llIIIIIl[1]));
        return super.render(graphics2D);
    }

    private static String lIlIIIIIlIl(String lIlIllIlIlIllll, String lIlIllIlIllIIII) {
        try {
            SecretKeySpec lIlIllIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIllIIll = Cipher.getInstance("Blowfish");
            lIlIllIlIllIIll.init(llIIIIIl[3], lIlIllIlIllIlII);
            return new String(lIlIllIlIllIIll.doFinal(Base64.getDecoder().decode(lIlIllIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlIllIIlI) {
            lIlIllIlIllIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderBarrows accBuilderBarrows, BuilderConfig builderConfig) {
        this.bu = accBuilderBarrows;
        this.bv = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.lIlIIIlIIlI();
        BuilderInfoBox.lIlIIIIIlll();
    }

    private static void lIlIIIIIlll() {
        lIllllll = new String[llIIIIIl[9]];
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[1]] = BuilderInfoBox."Squire Barrows Builder";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[2]] = BuilderInfoBox."Version";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[3]] = BuilderInfoBox."Runtime";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[4]] = BuilderInfoBox."Status:";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[5]] = BuilderInfoBox."Current Quest:";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[6]] = BuilderInfoBox."Tasks Completed:";
    }

    private static String lIlIIIIIlII(String lIlIllIllIIIIIl, String lIlIllIllIIIIII) {
        lIlIllIllIIIIIl = new String(Base64.getDecoder().decode(lIlIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIllIIIlII = new StringBuilder();
        char[] lIlIllIllIIIIll = lIlIllIllIIIIII.toCharArray();
        int lIlIllIllIIIIlI = llIIIIIl[1];
        char[] lIlIllIlIllllII = lIlIllIllIIIIIl.toCharArray();
        int lIlIllIlIlllIll = lIlIllIlIllllII.length;
        int lIlIllIlIlllIlI = llIIIIIl[1];
        while (BuilderInfoBox.lIlIIIlIIll(lIlIllIlIlllIlI, lIlIllIlIlllIll)) {
            char lIlIllIllIIIlll = lIlIllIlIllllII[lIlIllIlIlllIlI];
            lIlIllIllIIIlII.append((char)(lIlIllIllIIIlll ^ lIlIllIllIIIIll[lIlIllIllIIIIlI % lIlIllIllIIIIll.length]));
            0;
            ++lIlIllIllIIIIlI;
            ++lIlIllIlIlllIlI;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lIlIllIllIIIlII);
    }

    private static void lIlIIIlIIlI() {
        llIIIIIl = new int[10];
        BuilderInfoBox.llIIIIIl[0] = 0x39 ^ 0x33;
        BuilderInfoBox.llIIIIIl[1] = (0xC8 ^ 0xC1 ^ (0x30 ^ 0x3D)) & (0xB7 ^ 0x8D ^ (0x50 ^ 0x6E) ^ -1);
        BuilderInfoBox.llIIIIIl[2] = 1;
        BuilderInfoBox.llIIIIIl[3] = 2;
        BuilderInfoBox.llIIIIIl[4] = 3;
        BuilderInfoBox.llIIIIIl[5] = 109 + 49 - 32 + 6 ^ 96 + 51 - 20 + 1;
        BuilderInfoBox.llIIIIIl[6] = 0xB3 ^ 0xB6;
        BuilderInfoBox.llIIIIIl[7] = 0xFFFFF17A & 0xF87;
        BuilderInfoBox.llIIIIIl[8] = 0xBD ^ 0xA7 ^ (0x9F ^ 0x91);
        BuilderInfoBox.llIIIIIl[9] = 0x16 ^ 0x63 ^ (0xC6 ^ 0xB5);
    }
}

