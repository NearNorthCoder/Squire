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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.tithefarm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tithefarm.SquireTitheFarm;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i_Unknown;

public class TitheInfoBox
extends OverlayPanel {
    private final /* synthetic */ i x;
    private final /* synthetic */ TaskManager w;
    private static /* synthetic */ int[] lIIllllllIIlI;
    private static /* synthetic */ String[] lIIlllllIllll;
    private final /* synthetic */ SquireTitheFarm v;

    public long e(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (TitheInfoBox.lIllIllIIIlIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String lIllIllIIIIIIlI(String var5, String var13) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var9 = var13.toCharArray();
        int var1 = lIIllllllIIlI[0];
        char[] var20 = var5.toCharArray();
        int var10 = var20.length;
        int var6 = lIIllllllIIlI[0];
        while (TitheInfoBox.lIllIllIIIlIIII(var6, var10)) {
            char var8 = var20[var6];
            var3.append((char)(var8 ^ var9[var1 % var9.length]));
            0;
            ++var1;
            ++var6;
            0;
            if (-(159 + 46 - 80 + 41 ^ 102 + 81 - 113 + 92) <= 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static void lIllIllIIIIIlII() {
        lIIlllllIllll = new String[lIIllllllIIlI[14]];
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[0]] = TitheInfoBox."Squire Tithe Farm";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[1]] = TitheInfoBox."Runtime";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[2]] = TitheInfoBox."Version";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[3]] = TitheInfoBox."0.0.1";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[4]] = TitheInfoBox."Task: ";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[5]] = TitheInfoBox."Harvested";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[6]] = TitheInfoBox."Harvested Per Hour";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[7]] = TitheInfoBox."Current patch";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[8]] = TitheInfoBox."Watering can charges";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[9]] = TitheInfoBox."Have enough water?";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[10]] = TitheInfoBox."NO (please get more water)";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[11]] = TitheInfoBox."Yes";
    }

    private static boolean lIllIllIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        TitheInfoBox.lIllIllIIIIlllI();
        TitheInfoBox.lIllIllIIIIIlII();
    }

    private static String lIllIllIIIIIIll(String var17, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIIllllllIIlI[8]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIllllllIIlI[2], var2);
            return new String(var15.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    @Inject
    private TitheInfoBox(SquireTitheFarm squireTitheFarm, i i2) {
        this.v = squireTitheFarm;
        this.w = squireTitheFarm.getManager();
        this.x = i2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIllIIIIllll(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        TitheInfoBox var21;
        if (TitheInfoBox.lIllIllIIIIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var16 = Duration.between(var21.v.getStarted(), Instant.now());
        var21.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIlI[0]]).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[1]]).right(Time.format((Duration)var16)).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[2]]).right(lIIlllllIllll[lIIllllllIIlI[3]]).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[4]]).right(var21.w.getCurrentTask()).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[5]]).right(String.valueOf(var21.v.a())).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[6]]).right(String.valueOf(var21.e(var21.v.a()))).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[7]]).right(String.valueOf(var21.x.q())).build());
        0;
        var21.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[8]]).right(String.valueOf(var21.x.v())).build());
        0;
        List list = var21.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[9]]);
        if (TitheInfoBox.lIllIllIIIlIIII(var21.x.v(), lIIllllllIIlI[4] * var21.x.u())) {
            string = lIIlllllIllll[lIIllllllIIlI[10]];
            0;
            if (((0xE2 ^ 0xC6) & ~(0x65 ^ 0x41)) != ((0x78 ^ 0x49) & ~(0xA1 ^ 0x90))) {
                return null;
            }
        } else {
            string = lIIlllllIllll[lIIllllllIIlI[11]];
        }
        list.add(lineComponentBuilder.right(string).build());
        0;
        int n2 = lIIllllllIIlI[12];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllllllIIlI[13], lIIllllllIIlI[0]));
        return super.render(graphics2D);
    }

    private static String lIllIllIIIIIIIl(String var14, String var4) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIIllllllIIlI[2], var18);
            return new String(var11.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIIIlllI() {
        lIIllllllIIlI = new int[15];
        TitheInfoBox.lIIllllllIIlI[0] = (0x62 ^ 1) & ~(0xD9 ^ 0xBA);
        TitheInfoBox.lIIllllllIIlI[1] = 1;
        TitheInfoBox.lIIllllllIIlI[2] = 2;
        TitheInfoBox.lIIllllllIIlI[3] = 3;
        TitheInfoBox.lIIllllllIIlI[4] = 0x2C ^ 0x28;
        TitheInfoBox.lIIllllllIIlI[5] = 0x1E ^ 0x7B ^ (0x2B ^ 0x4B);
        TitheInfoBox.lIIllllllIIlI[6] = 0x72 ^ 0x40 ^ (0x9F ^ 0xAB);
        TitheInfoBox.lIIllllllIIlI[7] = 0x2D ^ 0x41 ^ (0x62 ^ 9);
        TitheInfoBox.lIIllllllIIlI[8] = 0x57 ^ 0x21 ^ (0xBF ^ 0xC1);
        TitheInfoBox.lIIllllllIIlI[9] = 0xD3 ^ 0x81 ^ (0x23 ^ 0x78);
        TitheInfoBox.lIIllllllIIlI[10] = 0x2E ^ 0x24;
        TitheInfoBox.lIIllllllIIlI[11] = 0xBA ^ 0xB1;
        TitheInfoBox.lIIllllllIIlI[12] = -(0xFFFF9EED & 0x77FB) & (0xFFFF9FEA & 0x77FF);
        TitheInfoBox.lIIllllllIIlI[13] = 84 + 21 - -9 + 32 ^ 45 + 84 - 42 + 47;
        TitheInfoBox.lIIllllllIIlI[14] = 0xA9 ^ 0xA5;
    }

    private static boolean lIllIllIIIlIIIl(int n2) {
        return n2 == 0;
    }
}

