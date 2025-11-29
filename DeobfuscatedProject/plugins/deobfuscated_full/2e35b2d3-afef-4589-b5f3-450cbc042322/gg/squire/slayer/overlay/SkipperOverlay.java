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
package gg.squire.slayer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.slayer.SquireSkipperPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
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

public class SkipperOverlay
extends OverlayPanel {
    private static /* synthetic */ String[] lIlIIlIIllIIl;
    private final /* synthetic */ SquireSkipperPlugin p;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIlIIlIIllIlI;

    private static String lIlllIlIlIlIlII(String var16, String var21) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var11 = var21.toCharArray();
        int var12 = lIlIIlIIllIlI[0];
        char[] var18 = var16.toCharArray();
        int var7 = var18.length;
        int var5 = lIlIIlIIllIlI[0];
        while (SkipperOverlay.lIlllIlIlIlllII(var5, var7)) {
            char var4 = var18[var5];
            var3.append((char)(var4 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var5;
            0;
            if ((1 ^ (0x32 ^ 0x37)) != 3) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIlllIlIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        SkipperOverlay.lIlllIlIlIllIII();
        SkipperOverlay.lIlllIlIlIlIlll();
    }

    private static String lIlllIlIlIlIIll(String var1, String var13) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIIlIIllIlI[2], var10);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIlIlIlIl(String var8, String var2) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIlIIllIlI[8]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlIIlIIllIlI[2], var19);
            return new String(var15.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    private SkipperOverlay(SquireSkipperPlugin squireSkipperPlugin) {
        this.p = squireSkipperPlugin;
        this.q = squireSkipperPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIlllIlIlIlIlll() {
        lIlIIlIIllIIl = new String[lIlIIlIIllIlI[12]];
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[0]] = SkipperOverlay."Squire Task Skipper";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[1]] = SkipperOverlay."Runtime";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[2]] = SkipperOverlay."Version";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[3]] = SkipperOverlay."2.1.0";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[4]] = SkipperOverlay."Task: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[5]] = SkipperOverlay."Slayer Task: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[6]] = SkipperOverlay."Need supplies: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[7]] = SkipperOverlay."Task Completed: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[8]] = SkipperOverlay."Task Completed Per Hour: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[9]] = SkipperOverlay."Current Streak: ";
    }

    public long f(int n2) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (SkipperOverlay.lIlllIlIlIllIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        SkipperOverlay var9;
        if (SkipperOverlay.lIlllIlIlIllIIl(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var17 = Duration.between(var9.p.getStarted(), Instant.now());
        var9.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIlIIllIIl[lIlIIlIIllIlI[0]]).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[1]]).right(Time.format((Duration)var17)).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[2]]).right(lIlIIlIIllIIl[lIlIIlIIllIlI[3]]).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[4]]).right(var9.q.getCurrentTask()).build());
        0;
        if (SkipperOverlay.lIlllIlIlIllIlI((Object)var9.p.b())) {
            var9.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[5]]).right(var9.p.b().toString()).build());
            0;
            var9.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[6]]).right(String.valueOf(var9.p.h())).build());
            0;
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[7]]).right(String.valueOf(this.p.f())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[8]]).right(String.valueOf(this.f(this.p.f()))).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[9]]).right(String.valueOf(this.p.g())).build());
        0;
        int n2 = lIlIIlIIllIlI[10];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIIlIIllIlI[11], lIlIIlIIllIlI[0]));
        return super.render(graphics2D);
    }

    private static boolean lIlllIlIlIllIlI(Object object) {
        return object != null;
    }

    private static void lIlllIlIlIllIII() {
        lIlIIlIIllIlI = new int[13];
        SkipperOverlay.lIlIIlIIllIlI[0] = (2 ^ 0x42) & ~(0xCD ^ 0x8D);
        SkipperOverlay.lIlIIlIIllIlI[1] = 1;
        SkipperOverlay.lIlIIlIIllIlI[2] = 2;
        SkipperOverlay.lIlIIlIIllIlI[3] = 3;
        SkipperOverlay.lIlIIlIIllIlI[4] = 0x40 ^ 0x44;
        SkipperOverlay.lIlIIlIIllIlI[5] = 0xD5 ^ 0xA5 ^ (0xB6 ^ 0xC3);
        SkipperOverlay.lIlIIlIIllIlI[6] = 113 + 96 - 125 + 59 ^ 11 + 9 - -90 + 27;
        SkipperOverlay.lIlIIlIIllIlI[7] = 0x52 ^ 0x55;
        SkipperOverlay.lIlIIlIIllIlI[8] = 0xEF ^ 0xAA ^ (0xC5 ^ 0x88);
        SkipperOverlay.lIlIIlIIllIlI[9] = 0x1D ^ 0x5A ^ (0x24 ^ 0x6A);
        SkipperOverlay.lIlIIlIIllIlI[10] = 0xFFFFD1EE & 0x2F13;
        SkipperOverlay.lIlIIlIIllIlI[11] = 0x57 ^ 0x43;
        SkipperOverlay.lIlIIlIIllIlI[12] = 0xE7 ^ 0x92 ^ 72 + 29 - 50 + 76;
    }
}

