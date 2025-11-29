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

import com.google.inject.Inject;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import gg.squire.account.AccBuilderRogues;
import gg.squire.account.BuilderConfig;
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

public class BuilderInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIIlIlIllI;
    private final /* synthetic */ AccBuilderRogues bo;
    private static /* synthetic */ String[] lIIlIlIlIl;
    private final /* synthetic */ BuilderConfig bp;

    private static String lllllllIIIlI(String lllllllllllllllllllllllIIIlIllll, String lllllllllllllllllllllllIIIllIIll) {
        lllllllllllllllllllllllIIIlIllll = new String(Base64.getDecoder().decode(lllllllllllllllllllllllIIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllllIIIllIIlI = new StringBuilder();
        char[] lllllllllllllllllllllllIIIllIIIl = lllllllllllllllllllllllIIIllIIll.toCharArray();
        int lllllllllllllllllllllllIIIllIIII = lIIlIlIllI[1];
        char[] lllllllllllllllllllllllIIIlIlIlI = lllllllllllllllllllllllIIIlIllll.toCharArray();
        int lllllllllllllllllllllllIIIlIlIIl = lllllllllllllllllllllllIIIlIlIlI.length;
        int lllllllllllllllllllllllIIIlIlIII = lIIlIlIllI[1];
        while (BuilderInfoBox.lllllllIIlIl(lllllllllllllllllllllllIIIlIlIII, lllllllllllllllllllllllIIIlIlIIl)) {
            char lllllllllllllllllllllllIIIllIlIl = lllllllllllllllllllllllIIIlIlIlI[lllllllllllllllllllllllIIIlIlIII];
            lllllllllllllllllllllllIIIllIIlI.append((char)(lllllllllllllllllllllllIIIllIlIl ^ lllllllllllllllllllllllIIIllIIIl[lllllllllllllllllllllllIIIllIIII % lllllllllllllllllllllllIIIllIIIl.length]));
            0;
            ++lllllllllllllllllllllllIIIllIIII;
            ++lllllllllllllllllllllllIIIlIlIII;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllllllIIIllIIlI);
    }

    private static void lllllllIIIll() {
        lIIlIlIlIl = new String[lIIlIlIllI[9]];
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[1]] = BuilderInfoBox."Squire Rogues Outfit Builder";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[2]] = BuilderInfoBox."Version";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[3]] = BuilderInfoBox."Runtime";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[4]] = BuilderInfoBox."Status:";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[5]] = BuilderInfoBox."Current Quest:";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[6]] = BuilderInfoBox."Tasks Completed:";
    }

    @Inject
    private BuilderInfoBox(AccBuilderRogues accBuilderRogues, BuilderConfig builderConfig) {
        this.bo = accBuilderRogues;
        this.bp = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lllllllIIIII(String lllllllllllllllllllllllIIlIIllll, String lllllllllllllllllllllllIIlIIlllI) {
        try {
            SecretKeySpec lllllllllllllllllllllllIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllllIIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllllIIlIlIIll.init(lIIlIlIllI[3], lllllllllllllllllllllllIIlIlIlII);
            return new String(lllllllllllllllllllllllIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllllIIlIlIIlI) {
            lllllllllllllllllllllllIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllllllIIIIl(String lllllllllllllllllllllllIIlIIIlII, String lllllllllllllllllllllllIIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllllllllIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIllI[10]), "DES");
            Cipher lllllllllllllllllllllllIIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllllllllllllIIlIIIllI.init(lIIlIlIllI[3], lllllllllllllllllllllllIIlIIIlll);
            return new String(lllllllllllllllllllllllIIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllllIIlIIIlIl) {
            lllllllllllllllllllllllIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllllIIlII() {
        lIIlIlIllI = new int[11];
        BuilderInfoBox.lIIlIlIllI[0] = 2 ^ 0x53 ^ (0xCA ^ 0x91);
        BuilderInfoBox.lIIlIlIllI[1] = (0xD3 ^ 0x9D ^ (0xFE ^ 0x84)) & (0x2C ^ 0x19 ^ 1 ^ -1);
        BuilderInfoBox.lIIlIlIllI[2] = 1;
        BuilderInfoBox.lIIlIlIllI[3] = 2;
        BuilderInfoBox.lIIlIlIllI[4] = 3;
        BuilderInfoBox.lIIlIlIllI[5] = 0x4D ^ 0x49;
        BuilderInfoBox.lIIlIlIllI[6] = 0x2B ^ 0x2E ^ (0x37 ^ 0x2C) & ~(0x74 ^ 0x6F);
        BuilderInfoBox.lIIlIlIllI[7] = 0xFFFFE9FE & 0x1703;
        BuilderInfoBox.lIIlIlIllI[8] = 0x77 ^ 0x63;
        BuilderInfoBox.lIIlIlIllI[9] = 0x49 ^ 0x4F;
        BuilderInfoBox.lIIlIlIllI[10] = 0xC ^ 4;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderRogues.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIIlIlIllI[0], lIIlIlIllI[0], lIIlIlIllI[0], lIIlIlIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIlIlIl[lIIlIlIllI[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[4]]).right(AccBuilderRogues.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[5]]).right(String.valueOf(AccBuilderRogues.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[6]]).right(String.valueOf(AccBuilderRogues.f)).build());
        0;
        int n2 = lIIlIlIllI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlIlIllI[8], lIIlIlIllI[1]));
        return super.render(graphics2D);
    }

    private static boolean lllllllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        BuilderInfoBox.lllllllIIlII();
        BuilderInfoBox.lllllllIIIll();
    }
}

