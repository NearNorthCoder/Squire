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
package gg.squire.pvm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.pvm.SquireShamansPlugin;
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
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.a;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

public class ShamanInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIIllIIIIIIII;
    private final /* synthetic */ c L;
    private final /* synthetic */ TaskManager K;
    private final /* synthetic */ SquireShamansPlugin J;
    private static /* synthetic */ String[] lIIlIllllllll;
    private /* synthetic */ a M;

    @Inject
    private ShamanInfoBox(SquireShamansPlugin squireShamansPlugin, c c2, a a2) {
        this.J = squireShamansPlugin;
        this.K = squireShamansPlugin.getManager();
        this.L = c2;
        this.M = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIlIlllIIlIllII(String var9, String var7) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIIII[11]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIllIIIIIIII[3], var14);
            return new String(var15.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIlllIIlIllIl(String var19, String var11) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIllIIIIIIII[3], var8);
            return new String(var17.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        if (ShamanInfoBox.lIlIlllIIllIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        ShamanInfoBox.lIlIlllIIllIIII();
        ShamanInfoBox.lIlIlllIIlIllll();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ShamanInfoBox.lIlIlllIIllIIIl(this.J.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIllllllll[lIIllIIIIIIII[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[2]]).right(lIIlIllllllll[lIIllIIIIIIII[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[5]]).right(this.K.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[6]]).right(String.valueOf(this.M.m())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[7]]).right(String.valueOf(this.J.a())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[8]]).right("" + this.c(this.J.a())).build());
        0;
        int n2 = lIIllIIIIIIII[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllIIIIIIII[10], lIIllIIIIIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIlIlllIIlIlllI(String var18, String var4) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var10 = var4.toCharArray();
        int var2 = lIIllIIIIIIII[1];
        char[] var13 = var18.toCharArray();
        int var12 = var13.length;
        int var16 = lIIllIIIIIIII[1];
        while (ShamanInfoBox.lIlIlllIIllIIll(var16, var12)) {
            char var5 = var13[var16];
            var1.append((char)(var5 ^ var10[var2 % var10.length]));
            0;
            ++var2;
            ++var16;
            0;
            if ((21 + 95 - 4 + 19 ^ 15 + 85 - 59 + 94) > ((159 + 152 - 303 + 200 ^ 106 + 105 - 204 + 151) & (0x68 ^ 0x2C ^ (2 ^ 8) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIlIlllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlllIIlIllll() {
        lIIlIllllllll = new String[lIIllIIIIIIII[11]];
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[1]] = ShamanInfoBox."Squire Shamans";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[2]] = ShamanInfoBox."Version";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[3]] = ShamanInfoBox."0.2.7";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[4]] = ShamanInfoBox."Runtime";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[5]] = ShamanInfoBox."Task: ";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[6]] = ShamanInfoBox."Looting: ";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[7]] = ShamanInfoBox."Kills";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[8]] = ShamanInfoBox."Kills Per Hour";
    }

    private static void lIlIlllIIllIIII() {
        lIIllIIIIIIII = new int[12];
        ShamanInfoBox.lIIllIIIIIIII[0] = 0x30 ^ 0x3A;
        ShamanInfoBox.lIIllIIIIIIII[1] = (27 + 65 - -47 + 58 ^ 24 + 75 - 49 + 87) & (0x6C ^ 0x3B ^ (0x33 ^ 0x28) ^ -1);
        ShamanInfoBox.lIIllIIIIIIII[2] = 1;
        ShamanInfoBox.lIIllIIIIIIII[3] = 2;
        ShamanInfoBox.lIIllIIIIIIII[4] = 3;
        ShamanInfoBox.lIIllIIIIIIII[5] = 9 + 109 - -74 + 3 ^ 71 + 11 - 3 + 120;
        ShamanInfoBox.lIIllIIIIIIII[6] = 0xAE ^ 0xAB;
        ShamanInfoBox.lIIllIIIIIIII[7] = 0x69 ^ 0x6F;
        ShamanInfoBox.lIIllIIIIIIII[8] = 12 + 45 - -5 + 99 ^ 64 + 65 - 51 + 88;
        ShamanInfoBox.lIIllIIIIIIII[9] = 0xFFFFF99B & 0x766;
        ShamanInfoBox.lIIllIIIIIIII[10] = 110 + 157 - 174 + 75 ^ 107 + 155 - 94 + 20;
        ShamanInfoBox.lIIllIIIIIIII[11] = 0xA8 ^ 0x86 ^ (0x96 ^ 0xB0);
    }

    private static boolean lIlIlllIIllIIlI(int n2) {
        return n2 == 0;
    }
}

