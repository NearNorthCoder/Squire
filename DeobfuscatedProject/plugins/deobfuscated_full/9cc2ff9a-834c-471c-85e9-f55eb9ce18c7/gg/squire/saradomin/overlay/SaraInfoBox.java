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

    private static String lIlIlIllllIlIlI(String var15, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIIIll[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIlIlIlIIIll[3], var3);
            return new String(var18.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
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

    private static String lIlIlIllllIlIII(String var7, String var16) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var11 = var16.toCharArray();
        int var8 = lIIlIlIlIIIll[1];
        char[] var19 = var7.toCharArray();
        int var13 = var19.length;
        int var4 = lIIlIlIlIIIll[1];
        while (SaraInfoBox.lIlIlIlllllIIIl(var4, var13)) {
            char var9 = var19[var4];
            var6.append((char)(var9 ^ var11[var8 % var11.length]));
            0;
            ++var8;
            ++var4;
            0;
            if (3 > ((0xF2 ^ 0xA8) & ~(0x7D ^ 0x27))) continue;
            return null;
        }
        return String.valueOf(var6);
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

    private static String lIlIlIllllIlIIl(String var17, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlIlIlIIIll[3], var14);
            return new String(var5.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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

