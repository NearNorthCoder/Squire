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
import gg.squire.account.AccBuilderShamans;
import gg.squire.account.BuilderConfig;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
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
    private static /* synthetic */ int[] lIllIIlIll;
    private final /* synthetic */ AccBuilderShamans bX;
    private final /* synthetic */ BuilderConfig bY;
    private static /* synthetic */ String[] lIllIIlIII;

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderShamans.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIllIIlIll[0], lIllIIlIll[0], lIllIIlIll[0], lIllIIlIll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIlIII[lIllIIlIll[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[4]]).right(AccBuilderShamans.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[5]]).right(String.valueOf(AccBuilderShamans.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[6]]).right(String.valueOf(AccBuilderShamans.f)).build());
        0;
        int n2 = lIllIIlIll[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIllIIlIll[8], lIllIIlIll[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlllIIlll(String var5, String var16) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllIIlIll[3], var17);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIlllIlllI() {
        lIllIIlIII = new String[lIllIIlIll[9]];
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[1]] = BuilderInfoBox."Squire Shamans Builder";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[2]] = BuilderInfoBox."Version";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[3]] = BuilderInfoBox."Runtime";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[4]] = BuilderInfoBox."Status:";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[5]] = BuilderInfoBox."Current Quest:";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[6]] = BuilderInfoBox."Tasks Completed:";
    }

    @Inject
    private BuilderInfoBox(AccBuilderShamans accBuilderShamans, BuilderConfig builderConfig) {
        this.bX = accBuilderShamans;
        this.bY = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.lIIlIlllIllll();
        BuilderInfoBox.lIIlIlllIlllI();
    }

    private static void lIIlIlllIllll() {
        lIllIIlIll = new int[11];
        BuilderInfoBox.lIllIIlIll[0] = 0x69 ^ 0x63;
        BuilderInfoBox.lIllIIlIll[1] = (0xA4 ^ 0x93) & ~(0x49 ^ 0x7E);
        BuilderInfoBox.lIllIIlIll[2] = 1;
        BuilderInfoBox.lIllIIlIll[3] = 2;
        BuilderInfoBox.lIllIIlIll[4] = 3;
        BuilderInfoBox.lIllIIlIll[5] = 0x8B ^ 0x8F;
        BuilderInfoBox.lIllIIlIll[6] = 0xE ^ 0xB;
        BuilderInfoBox.lIllIIlIll[7] = -(0xFFFFDFED & 0x76F7) & (0xFFFFFFF6 & 0x57EF);
        BuilderInfoBox.lIllIIlIll[8] = 0xBA ^ 0xAE;
        BuilderInfoBox.lIllIIlIll[9] = 0xF5 ^ 0xC6 ^ (0x83 ^ 0xB6);
        BuilderInfoBox.lIllIIlIll[10] = 0x2A ^ 0x22;
    }

    private static String lIIlIlllIlIIl(String var10, String var12) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIllIIlIll[10]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIllIIlIll[3], var14);
            return new String(var1.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlllIlIII(String var4, String var19) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var11 = var19.toCharArray();
        int var7 = lIllIIlIll[1];
        char[] var3 = var4.toCharArray();
        int var8 = var3.length;
        int var13 = lIllIIlIll[1];
        while (BuilderInfoBox.lIIlIllllIIII(var13, var8)) {
            char var18 = var3[var13];
            var15.append((char)(var18 ^ var11[var7 % var11.length]));
            0;
            ++var7;
            ++var13;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }
}

