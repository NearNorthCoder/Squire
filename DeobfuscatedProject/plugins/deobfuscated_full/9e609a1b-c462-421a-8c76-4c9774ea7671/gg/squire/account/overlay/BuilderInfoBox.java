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
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[1]] = BuilderInfoBox."Squire Rat King Builder";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[2]] = BuilderInfoBox."Version";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[3]] = BuilderInfoBox."Runtime";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[4]] = BuilderInfoBox."Status:";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[5]] = BuilderInfoBox."Current Quest:";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[6]] = BuilderInfoBox."Tasks Completed:";
    }

    private static void lIlIIIlllIlllll() {
        lIIIlllIIIllI = new int[10];
        BuilderInfoBox.lIIIlllIIIllI[0] = 0x50 ^ 0x40 ^ (0x2D ^ 0x37);
        BuilderInfoBox.lIIIlllIIIllI[1] = (0x73 ^ 0x24) & ~(0x28 ^ 0x7F);
        BuilderInfoBox.lIIIlllIIIllI[2] = 1;
        BuilderInfoBox.lIIIlllIIIllI[3] = 2;
        BuilderInfoBox.lIIIlllIIIllI[4] = 3;
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

    private static String lIlIIIlllIlIIIl(String var4, String var8) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var12 = var8.toCharArray();
        int var7 = lIIIlllIIIllI[1];
        char[] var3 = var4.toCharArray();
        int var2 = var3.length;
        int var9 = lIIIlllIIIllI[1];
        while (BuilderInfoBox.lIlIIIllllIIIII(var9, var2)) {
            char var5 = var3[var9];
            var13.append((char)(var5 ^ var12[var7 % var12.length]));
            0;
            ++var7;
            ++var9;
            0;
            if (-(0xC2 ^ 0xC6) <= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIlIIIlllIlIIlI(String var11, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIIIlllIIIllI[3], var10);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
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
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[4]]).right(AccBuilderRat.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[5]]).right(String.valueOf(AccBuilderRat.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[6]]).right(String.valueOf(AccBuilderRat.f)).build());
        0;
        int n2 = lIIIlllIIIllI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIIlllIIIllI[8], lIIIlllIIIllI[1]));
        return super.render(graphics2D);
    }
}

