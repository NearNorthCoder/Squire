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
package gg.squire.scurrius.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

public class SquireScurriusBox
extends OverlayPanel {
    private final /* synthetic */ SquireScurriusConfig K;
    private static /* synthetic */ int[] lIIlIllIIlIII;
    private static /* synthetic */ String[] lIIlIllIIIlll;
    private /* synthetic */ b c;
    private final /* synthetic */ SquireScurrius I;
    private final /* synthetic */ TaskManager J;

    @Inject
    public SquireScurriusBox(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2) {
        this.I = squireScurrius;
        this.J = squireScurrius.getManager();
        this.K = squireScurriusConfig;
        this.c = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIllIIllIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIllIlIII() {
        lIIlIllIIIlll = new String[lIIlIllIIlIII[8]];
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[1]] = SquireScurriusBox."Squire Scurrius";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[4]] = SquireScurriusBox."Runtime:";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[5]] = SquireScurriusBox."Kills: ";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[6]] = SquireScurriusBox."%d (%.1f/h)";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[7]] = SquireScurriusBox."Task:";
    }

    private static String lIlIllIIllIIlll(String var11, String var18) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var19 = var18.toCharArray();
        int var13 = lIIlIllIIlIII[1];
        char[] var2 = var11.toCharArray();
        int var17 = var2.length;
        int var16 = lIIlIllIIlIII[1];
        while (SquireScurriusBox.lIlIllIIllIllII(var16, var17)) {
            char var9 = var2[var16];
            var4.append((char)(var9 ^ var19[var13 % var19.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (((0x38 ^ 0x3E) & ~(0 ^ 6)) > -1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static void lIlIllIIllIlIIl() {
        lIIlIllIIlIII = new int[10];
        SquireScurriusBox.lIIlIllIIlIII[0] = 0x45 ^ 0x4F;
        SquireScurriusBox.lIIlIllIIlIII[1] = (0x3C ^ 3) & ~(0x4E ^ 0x71);
        SquireScurriusBox.lIIlIllIIlIII[2] = (0x6C ^ 0x3A) + (0x28 ^ 0x3F) - -(0xAC ^ 0xA2) + (0xCC ^ 0x8A);
        SquireScurriusBox.lIIlIllIIlIII[3] = 0x3C ^ 0x28;
        SquireScurriusBox.lIIlIllIIlIII[4] = 1;
        SquireScurriusBox.lIIlIllIIlIII[5] = 2;
        SquireScurriusBox.lIIlIllIIlIII[6] = 3;
        SquireScurriusBox.lIIlIllIIlIII[7] = 0xE4 ^ 0x88 ^ (0xE9 ^ 0x81);
        SquireScurriusBox.lIIlIllIIlIII[8] = 0x26 ^ 0x2C ^ (0xA ^ 5);
        SquireScurriusBox.lIIlIllIIlIII[9] = 0x38 ^ 0x30;
    }

    public double c(int n2) {
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        if (SquireScurriusBox.lIlIllIIllIlIll(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static String lIlIllIIllIIlIl(String var8, String var7) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIlIllIIlIII[9]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIlIllIIlIII[5], var14);
            return new String(var15.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireScurriusBox.lIlIllIIllIlIlI(this.I.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlIllIIlIII[0], lIIlIllIIlIII[0], lIIlIllIIlIII[0], lIIlIllIIlIII[0]));
        String string = lIIlIllIIIlll[lIIlIllIIlIII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lIIlIllIIlIII[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlIllIIlIII[3], lIIlIllIIlIII[1]));
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[4]]).right(Time.format((Duration)duration)).build());
        0;
        int n3 = this.I.l();
        double d2 = this.c(n3);
        Object[] objectArray = new Object[lIIlIllIIlIII[5]];
        objectArray[SquireScurriusBox.lIIlIllIIlIII[1]] = n3;
        objectArray[SquireScurriusBox.lIIlIllIIlIII[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[5]]).right(String.format(lIIlIllIIIlll[lIIlIllIIlIII[6]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[7]]).right(this.J.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.I.j()).left("Banking: " + this.I.m()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean lIlIllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        if (SquireScurriusBox.lIlIllIIllIlIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        SquireScurriusBox.lIlIllIIllIlIIl();
        SquireScurriusBox.lIlIllIIllIlIII();
    }

    private static boolean lIlIllIIllIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIIllIIllI(String var1, String var3) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlIllIIlIII[5], var10);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

