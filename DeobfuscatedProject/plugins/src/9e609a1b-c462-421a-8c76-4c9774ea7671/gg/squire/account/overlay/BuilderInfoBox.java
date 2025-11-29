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
package gg.squire.account.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderRat;
import gg.squire.account.BuilderConfig;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
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
    private static /* synthetic */ String[] lIIIlllIIIlII;
    private static /* synthetic */ int[] lIIIlllIIIllI;
    private final /* synthetic */ BuilderConfig bu;
    private final /* synthetic */ AccBuilderRat bt;

    private static void lIlIIIlllIlIIll() {
        lIIIlllIIIlII = new String[lIIIlllIIIllI[9]];
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[1]] = BuilderInfoBox.lIlIIIlllIlIIIl("KzkHMAMdaCA4BVgDGzcWWAoHMB0cLQA=", "xHrYq");
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[2]] = BuilderInfoBox.lIlIIIlllIlIIIl("PS8ZBgcEJA==", "kJkun");
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[3]] = BuilderInfoBox.lIlIIIlllIlIIIl("CwEtMD80EQ==", "YtCDV");
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[4]] = BuilderInfoBox.lIlIIIlllIlIIIl("Ii0MBjACYw==", "qYmrE");
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[5]] = BuilderInfoBox.lIlIIIlllIlIIIl("BxY3OiMqF2UZMyEQMXI=", "DcEHF");
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[6]] = BuilderInfoBox.lIlIIIlllIlIIlI("gJqQg1FLZhOB0CIhSzFJq6MrcIRwN4MA", "oDeFd");
    }

    private static void lIlIIIlllIlllll() {
        lIIIlllIIIllI = new int[10];
        BuilderInfoBox.lIIIlllIIIllI[0] = 0x50 ^ 0x40 ^ (0x2D ^ 0x37);
        BuilderInfoBox.lIIIlllIIIllI[1] = (0x73 ^ 0x24) & ~(0x28 ^ 0x7F);
        BuilderInfoBox.lIIIlllIIIllI[2] = " ".length();
        BuilderInfoBox.lIIIlllIIIllI[3] = "  ".length();
        BuilderInfoBox.lIIIlllIIIllI[4] = "   ".length();
        BuilderInfoBox.lIIIlllIIIllI[5] = 0x11 ^ 0x15;
        BuilderInfoBox.lIIIlllIIIllI[6] = 0x20 ^ 0x3B ^ (0x19 ^ 7);
        BuilderInfoBox.lIIIlllIIIllI[7] = 0xFFFFFD72 & 0x38F;
        BuilderInfoBox.lIIIlllIIIllI[8] = 153 + 13 - 51 + 67 ^ 150 + 152 - 150 + 10;
        BuilderInfoBox.lIIIlllIIIllI[9] = 119 + 140 - 83 + 0 ^ 57 + 111 - 126 + 140;
    }

    static {
        BuilderInfoBox.lIlIIIlllIlllll();
        BuilderInfoBox.lIlIIIlllIlIIll();
    }

    private static String lIlIIIlllIlIIIl(String lllllllllllllllIIIIIllIllIllIIII, String lllllllllllllllIIIIIllIllIlIIlll) {
        lllllllllllllllIIIIIllIllIllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIllIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIllIlIlllI = new StringBuilder();
        char[] lllllllllllllllIIIIIllIllIlIllII = lllllllllllllllIIIIIllIllIlIIlll.toCharArray();
        int lllllllllllllllIIIIIllIllIlIlIlI = lIIIlllIIIllI[1];
        char[] lllllllllllllllIIIIIllIllIlIIIll = lllllllllllllllIIIIIllIllIllIIII.toCharArray();
        int lllllllllllllllIIIIIllIllIlIIIlI = lllllllllllllllIIIIIllIllIlIIIll.length;
        int lllllllllllllllIIIIIllIllIlIIIIl = lIIIlllIIIllI[1];
        while (BuilderInfoBox.lIlIIIllllIIIII(lllllllllllllllIIIIIllIllIlIIIIl, lllllllllllllllIIIIIllIllIlIIIlI)) {
            char lllllllllllllllIIIIIllIllIllIIlI = lllllllllllllllIIIIIllIllIlIIIll[lllllllllllllllIIIIIllIllIlIIIIl];
            lllllllllllllllIIIIIllIllIlIlllI.append((char)(lllllllllllllllIIIIIllIllIllIIlI ^ lllllllllllllllIIIIIllIllIlIllII[lllllllllllllllIIIIIllIllIlIlIlI % lllllllllllllllIIIIIllIllIlIllII.length]));
            "".length();
            ++lllllllllllllllIIIIIllIllIlIlIlI;
            ++lllllllllllllllIIIIIllIllIlIIIIl;
            "".length();
            if (-(0xC2 ^ 0xC6) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIllIllIlIlllI);
    }

    private static String lIlIIIlllIlIIlI(String lllllllllllllllIIIIIllIllIIlIIIl, String lllllllllllllllIIIIIllIllIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIllIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIllIIlIlll.init(lIIIlllIIIllI[3], lllllllllllllllIIIIIllIllIIllIII);
            return new String(lllllllllllllllIIIIIllIllIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIllIllIIlIlIl) {
            lllllllllllllllIIIIIllIllIIlIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderRat accBuilderRat, BuilderConfig builderConfig) {
        this.bt = accBuilderRat;
        this.bu = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIIIllllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderRat.b;
        double d2 = 0.14;
        this.panelComponent.setBorder(new Rectangle(lIIIlllIIIllI[0], lIIIlllIIIllI[0], lIIIlllIIIllI[0], lIIIlllIIIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlllIIIlII[lIIIlllIIIllI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[2]]).right("1." + d2).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[3]]).right(e.b(l2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[4]]).right(AccBuilderRat.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[5]]).right(String.valueOf(AccBuilderRat.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[6]]).right(String.valueOf(AccBuilderRat.f)).build());
        "".length();
        int n2 = lIIIlllIIIllI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIIlllIIIllI[8], lIIIlllIIIllI[1]));
        return super.render(graphics2D);
    }
}

