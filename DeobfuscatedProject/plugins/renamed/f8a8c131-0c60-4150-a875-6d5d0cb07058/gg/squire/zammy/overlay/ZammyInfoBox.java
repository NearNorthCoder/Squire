/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.zammy.SquireZammy;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.PlacingCannonBaseTask;
import m.e.a.i.z.m.r.-.q.s.y.u.k_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;

public class ZammyInfoBox
extends OverlayPanel {
    private final /* synthetic */ B G;
    private final /* synthetic */ k E;
    private final /* synthetic */ TaskManager F;
    private final /* synthetic */ SquireZammy C;
    private static /* synthetic */ int[] lIllIIlIllIll;
    private final /* synthetic */ l D;
    private static /* synthetic */ String[] lIllIIlIllIII;

    static {
        ZammyInfoBox.llIIIllIIlIIlll();
        ZammyInfoBox.llIIIllIIlIIllI();
    }

    private static boolean llIIIllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIllIIlIIllI() {
        lIllIIlIllIII = new String[lIllIIlIllIll[7]];
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[1]] = ZammyInfoBox."Squire Zamorak";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[2]] = ZammyInfoBox."Kril alive";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[3]] = ZammyInfoBox."Inside room";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[4]] = ZammyInfoBox."Zammy Kills";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[5]] = ZammyInfoBox."Cannon base expires in:";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[6]] = ZammyInfoBox."Current Task";
    }

    private static String llIIIllIIIllIlI(String var4, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllIIlIllIll[3], var14);
            return new String(var12.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIllIll(String var9, String var1) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var6 = var1.toCharArray();
        int var7 = lIllIIlIllIll[1];
        char[] var13 = var9.toCharArray();
        int var10 = var13.length;
        int var5 = lIllIIlIllIll[1];
        while (ZammyInfoBox.llIIIllIIlIlIIl(var5, var10)) {
            char var8 = var13[var5];
            var11.append((char)(var8 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var5;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    @Inject
    public ZammyInfoBox(SquireZammy squireZammy, l l2, k k2, B b2) {
        this.C = squireZammy;
        this.D = l2;
        this.E = k2;
        this.F = squireZammy.getManager();
        this.G = b2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ZammyInfoBox.llIIIllIIlIlIII(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIIlIllIll[0], lIllIIlIllIll[0], lIllIIlIllIll[0], lIllIIlIllIll[0]));
        String string = lIllIIlIllIII[lIllIIlIllIll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[2]]).right(String.valueOf(this.D.A())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[3]]).right(String.valueOf(this.D.B())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[4]]).right(String.valueOf(this.D.J())).build());
        0;
        int n2 = Math.max(lIllIIlIllIll[1], this.G.Q() - Static.getClient().getTickCount());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[5]]).right(String.valueOf(n2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[6]]).right(this.F.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean llIIIllIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static void llIIIllIIlIIlll() {
        lIllIIlIllIll = new int[8];
        ZammyInfoBox.lIllIIlIllIll[0] = 82 + 180 - 247 + 170 ^ 5 + 67 - 32 + 139;
        ZammyInfoBox.lIllIIlIllIll[1] = (0xD4 ^ 0xA0 ^ (0xF5 ^ 0x9C)) & (0x76 ^ 0x22 ^ (5 ^ 0x4C) ^ -1);
        ZammyInfoBox.lIllIIlIllIll[2] = 1;
        ZammyInfoBox.lIllIIlIllIll[3] = 2;
        ZammyInfoBox.lIllIIlIllIll[4] = 3;
        ZammyInfoBox.lIllIIlIllIll[5] = 50 + 66 - -82 + 0 ^ 109 + 100 - 202 + 187;
        ZammyInfoBox.lIllIIlIllIll[6] = 74 + 68 - 84 + 136 ^ 156 + 170 - 183 + 56;
        ZammyInfoBox.lIllIIlIllIll[7] = 84 + 1 - 39 + 96 ^ 135 + 29 - 61 + 33;
    }
}

