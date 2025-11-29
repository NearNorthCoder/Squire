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
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import gg.squire.account.AccBuilderTempleTrek;
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
    private static /* synthetic */ String[] lllllIIIIl;
    private final /* synthetic */ AccBuilderTempleTrek bn;
    private static /* synthetic */ int[] lllllIIIlI;
    private final /* synthetic */ BuilderConfig bo;

    private static String llIlIIlIIIlIl(String var13, String var1) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lllllIIIlI[3], var14);
            return new String(var8.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIIIlII(String var11, String var12) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lllllIIIlI[10]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lllllIIIlI[3], var5);
            return new String(var17.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        BuilderInfoBox.llIlIIlIIIlll();
        BuilderInfoBox.llIlIIlIIIllI();
    }

    private static String llIlIIlIIIIll(String var4, String var10) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var7 = var10.toCharArray();
        int var6 = lllllIIIlI[1];
        char[] var19 = var4.toCharArray();
        int var9 = var19.length;
        int var2 = lllllIIIlI[1];
        while (BuilderInfoBox.llIlIIlIIlIII(var2, var9)) {
            char var16 = var19[var2];
            var3.append((char)(var16 ^ var7[var6 % var7.length]));
            0;
            ++var6;
            ++var2;
            0;
            if ((0x2E ^ 0x2A) == (0x61 ^ 0x65)) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llIlIIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIlIIIlll() {
        lllllIIIlI = new int[11];
        BuilderInfoBox.lllllIIIlI[0] = 2 ^ (0x9C ^ 0x94);
        BuilderInfoBox.lllllIIIlI[1] = (124 + 51 - 117 + 91 ^ 120 + 1 - 12 + 28) & (0x67 ^ 0x7B ^ (0x5F ^ 0x76) & ~(0x96 ^ 0xBF) ^ -1);
        BuilderInfoBox.lllllIIIlI[2] = 1;
        BuilderInfoBox.lllllIIIlI[3] = 2;
        BuilderInfoBox.lllllIIIlI[4] = 3;
        BuilderInfoBox.lllllIIIlI[5] = 0xD ^ 0x3C ^ (0x28 ^ 0x1D);
        BuilderInfoBox.lllllIIIlI[6] = 0x8E ^ 0x8B;
        BuilderInfoBox.lllllIIIlI[7] = 0xFFFFF58E & 0xB73;
        BuilderInfoBox.lllllIIIlI[8] = 0xF1 ^ 0x81 ^ (0x62 ^ 6);
        BuilderInfoBox.lllllIIIlI[9] = 0x62 ^ 0x3C ^ (0x2B ^ 0x73);
        BuilderInfoBox.lllllIIIlI[10] = 0x2A ^ 0x22;
    }

    @Inject
    private BuilderInfoBox(AccBuilderTempleTrek accBuilderTempleTrek, BuilderConfig builderConfig) {
        this.bn = accBuilderTempleTrek;
        this.bo = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderTempleTrek.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lllllIIIlI[0], lllllIIIlI[0], lllllIIIlI[0], lllllIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllIIIIl[lllllIIIlI[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[4]]).right(AccBuilderTempleTrek.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[5]]).right(String.valueOf(AccBuilderTempleTrek.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[6]]).right(String.valueOf(AccBuilderTempleTrek.f)).build());
        0;
        int n2 = lllllIIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllllIIIlI[8], lllllIIIlI[1]));
        return super.render(graphics2D);
    }

    private static void llIlIIlIIIllI() {
        lllllIIIIl = new String[lllllIIIlI[9]];
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[1]] = BuilderInfoBox."Squire TempleTrek Builder";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[2]] = BuilderInfoBox."Version";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[3]] = BuilderInfoBox."Runtime";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[4]] = BuilderInfoBox."Status:";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[5]] = BuilderInfoBox."Current Quest:";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[6]] = BuilderInfoBox."Tasks Completed:";
    }
}

