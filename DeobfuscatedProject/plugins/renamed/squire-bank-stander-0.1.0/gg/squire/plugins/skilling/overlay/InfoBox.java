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
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.plugins.skilling.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lllIlIlIIll;
    private final /* synthetic */ TaskManager n;
    private final /* synthetic */ SquireBankStander m;
    private static /* synthetic */ int[] lllIlIlIlII;
    private final /* synthetic */ BankStanderConfig o;

    private static String lIlIllllllIIll(String var19, String var15) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lllIlIlIlII[9]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lllIlIlIlII[3], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIlIllllllIlII() {
        lllIlIlIIll = new String[lllIlIlIlII[0]];
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[1]] = InfoBox."Squire Bankstander";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[2]] = InfoBox."Runtime:";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[3]] = InfoBox."Version";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[4]] = InfoBox."1.2.1";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[5]] = InfoBox."Task: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[6]] = InfoBox."Glass on ground: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[7]] = InfoBox."Gems cut: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[8]] = InfoBox."Gems cut per hour: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[9]] = InfoBox."Products Made: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[10]] = InfoBox."Products Made Per Hour: ";
    }

    private static boolean lIlIllllllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllllllIII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIlIllllllIIIl(String var7, String var6) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllIlIlIlII[3], var17);
            return new String(var10.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    @Inject
    private InfoBox(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.m = squireBankStander;
        this.n = squireBankStander.getManager();
        this.o = bankStanderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        InfoBox.lIlIllllllIlIl();
        InfoBox.lIlIllllllIlII();
    }

    private static boolean lIlIlllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllllllIIl(int n2) {
        return n2 == 0;
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (InfoBox.lIlIlllllllIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var12;
        if (InfoBox.lIlIllllllIllI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var11 = Duration.between(var12.m.getStarted(), Instant.now());
        var12.panelComponent.setBorder(new Rectangle(lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0]));
        var12.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIIll[lllIlIlIlII[1]]).build());
        0;
        var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[2]]).right(Time.format((Duration)var11)).build());
        0;
        var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[3]]).right(lllIlIlIIll[lllIlIlIlII[4]]).build());
        0;
        var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[5]]).right(var12.n.getCurrentTask()).build());
        0;
        if (InfoBox.lIlIllllllIlll((Object)var12.o.activity(), (Object)b.GLASS_MAKE)) {
            var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[6]]).right(String.valueOf(var12.m.b())).build());
            0;
        }
        if (InfoBox.lIlIllllllIlll((Object)var12.o.activity(), (Object)b.GLASS_BLOWING)) {
            var12.panelComponent.getChildren().add(LineComponent.builder().left(var12.o.glassProduct().name() + " made").right(String.valueOf(var12.m.c())).build());
            0;
        }
        if (InfoBox.lIlIllllllIlll((Object)var12.o.activity(), (Object)b.GEM_CUTTING)) {
            var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[7]]).right(String.valueOf(var12.m.c())).build());
            0;
            var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[8]]).right(String.valueOf(var12.d(var12.m.c()))).build());
            0;
        }
        if (!InfoBox.lIlIlllllllIII((Object)var12.o.activity(), (Object)b.SMITHING) || !InfoBox.lIlIlllllllIII((Object)var12.o.activity(), (Object)b.FLETCH_CUTTING) || InfoBox.lIlIllllllIlll((Object)var12.o.activity(), (Object)b.STRING_BOWS)) {
            var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[9]]).right(String.valueOf(var12.m.c())).build());
            0;
            var12.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[10]]).right(String.valueOf(var12.d(var12.m.c()))).build());
            0;
        }
        int n2 = lllIlIlIlII[11];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlIlIlII[12], lllIlIlIlII[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIllllllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIllllllIlIl() {
        lllIlIlIlII = new int[13];
        InfoBox.lllIlIlIlII[0] = 33 + 18 - -73 + 4 ^ 17 + 67 - 66 + 120;
        InfoBox.lllIlIlIlII[1] = (0xD4 ^ 0x80) & ~(0x75 ^ 0x21);
        InfoBox.lllIlIlIlII[2] = 1;
        InfoBox.lllIlIlIlII[3] = 2;
        InfoBox.lllIlIlIlII[4] = 3;
        InfoBox.lllIlIlIlII[5] = 0x24 ^ 0x20;
        InfoBox.lllIlIlIlII[6] = 0x5D ^ 0x58 ^ (0x20 ^ 0x18) & ~(0x55 ^ 0x6D);
        InfoBox.lllIlIlIlII[7] = 0x22 ^ 0x24;
        InfoBox.lllIlIlIlII[8] = 6 ^ 0x3B ^ (0x14 ^ 0x2E);
        InfoBox.lllIlIlIlII[9] = 0x7B ^ 0x73;
        InfoBox.lllIlIlIlII[10] = 0x1D ^ 0x77 ^ (0xCD ^ 0xAE);
        InfoBox.lllIlIlIlII[11] = -(0xFFFFF7FE & 0x3C07) & (0xFFFFFFEF & 0x3517);
        InfoBox.lllIlIlIlII[12] = 0x77 ^ 0x63;
    }

    private static String lIlIllllllIIlI(String var18, String var16) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var14 = var16.toCharArray();
        int var21 = lllIlIlIlII[1];
        char[] var20 = var18.toCharArray();
        int var5 = var20.length;
        int var8 = lllIlIlIlII[1];
        while (InfoBox.lIlIlllllllIlI(var8, var5)) {
            char var9 = var20[var8];
            var2.append((char)(var9 ^ var14[var21 % var14.length]));
            0;
            ++var21;
            ++var8;
            0;
            if (-(0x22 ^ 0x26) < 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

