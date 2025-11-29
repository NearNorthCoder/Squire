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
package gg.squire.plugins.agility;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
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

public class AgilityOverlay
extends OverlayPanel {
    private final /* synthetic */ TaskManager c;
    private static /* synthetic */ int[] lIllIIIIlll;
    private final /* synthetic */ AgilityConfig b;
    private static /* synthetic */ String[] lIllIIIIlIl;
    private final /* synthetic */ SquireAgilityPlugin a;

    private static String lIIlIlIIllllll(String var12, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIllIIIIlll[10]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIllIIIIlll[2], var7);
            return new String(var1.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIllI(int n, int n2) {
        return n < n2;
    }

    private static void lIIlIlIlIIIIII() {
        lIllIIIIlIl = new String[lIllIIIIlll[9]];
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[0]] = AgilityOverlay."Squire Agility";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[1]] = AgilityOverlay."Runtime";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[2]] = AgilityOverlay."Version";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[3]] = AgilityOverlay."1.3.0";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[4]] = AgilityOverlay."Status";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[5]] = AgilityOverlay."Laps";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[6]] = AgilityOverlay."Course";
    }

    private static String lIIlIlIIlllllI(String var13, String var11) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var9 = var11.toCharArray();
        int var16 = lIllIIIIlll[0];
        char[] var15 = var13.toCharArray();
        int var3 = var15.length;
        int var8 = lIllIIIIlll[0];
        while (AgilityOverlay.lIIlIlIlIIIllI(var8, var3)) {
            char var18 = var15[var8];
            var4.append((char)(var18 ^ var9[var16 % var9.length]));
            0;
            ++var16;
            ++var8;
            0;
            
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lIIlIlIlIIIlIl(int n) {
        return n != 0;
    }

    private static void lIIlIlIlIIIlII() {
        lIllIIIIlll = new int[11];
        AgilityOverlay.lIllIIIIlll[0] = (0x92 ^ 0x9E ^ (0xF9 ^ 0xB3)) & (166 + 141 - 229 + 132 ^ 54 + 137 - 69 + 26 ^ -1) & ((0xC8 ^ 0xBD ^ (0x55 ^ 0x1D)) & (0x97 ^ 0xB1 ^ (0x27 ^ 0x3C) ^ -1) & ((90 + 166 - 108 + 63 ^ 53 + 130 - 123 + 118) & (74 + 92 - 18 + 67 ^ 52 + 176 - 148 + 102 ^ -1) ^ -1) ^ -1);
        AgilityOverlay.lIllIIIIlll[1] = 1;
        AgilityOverlay.lIllIIIIlll[2] = 2;
        AgilityOverlay.lIllIIIIlll[3] = 3;
        AgilityOverlay.lIllIIIIlll[4] = 0x36 ^ 0x30 ^ 2;
        AgilityOverlay.lIllIIIIlll[5] = 0x42 ^ 0x2F ^ (0xAD ^ 0xC5);
        AgilityOverlay.lIllIIIIlll[6] = 118 + 57 - 39 + 37 ^ 71 + 137 - 200 + 163;
        AgilityOverlay.lIllIIIIlll[7] = 0xFFFF833B & 0x7DC6;
        AgilityOverlay.lIllIIIIlll[8] = 0xB ^ 0x1F;
        AgilityOverlay.lIllIIIIlll[9] = 0xAF ^ 0xC3 ^ (0xD ^ 0x66);
        AgilityOverlay.lIllIIIIlll[10] = 0 ^ 8;
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        AgilityOverlay var17;
        if (AgilityOverlay.lIIlIlIlIIIlIl(this.a.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var17.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIlIl[lIllIIIIlll[0]]).build());
        0;
        Duration var5 = Duration.between(var17.a.getStarted(), Instant.now());
        var17.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[1]]).right(Time.format((Duration)var5)).build());
        0;
        var17.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[2]]).right(lIllIIIIlIl[lIllIIIIlll[3]]).build());
        0;
        var17.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[4]]).right(var17.c.getCurrentTask()).build());
        0;
        var17.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[5]]).right(var17.a.b() + " (" + var17.a(var17.a.b()) + "/h)").build());
        0;
        if (AgilityOverlay.lIIlIlIlIIIlIl(var17.b.progressive() ? 1 : 0)) {
            object = "Progressive (" + String.valueOf((Object)var17.a.a()) + ")";
            0;
            if ((78 + 149 - 80 + 25 ^ 149 + 72 - 81 + 28) < (0x52 ^ 0x5A ^ (0x45 ^ 0x49))) {
                return null;
            }
        } else {
            object = var17.a.a().toString();
        }
        Object object2 = object;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[6]]).right((String)object2).build());
        0;
        int n = lIllIIIIlll[7];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIIIlll[8], lIllIIIIlll[0]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIIllllIl(String var14, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIllIIIIlll[2], var2);
            return new String(var10.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        AgilityOverlay.lIIlIlIlIIIlII();
        AgilityOverlay.lIIlIlIlIIIIII();
    }

    private long a(int n) {
        Duration duration = Duration.between(this.a.getStarted(), Instant.now());
        if (AgilityOverlay.lIIlIlIlIIIlIl(duration.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

    @Inject
    private AgilityOverlay(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.a = squireAgilityPlugin;
        this.b = agilityConfig;
        this.c = squireAgilityPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

