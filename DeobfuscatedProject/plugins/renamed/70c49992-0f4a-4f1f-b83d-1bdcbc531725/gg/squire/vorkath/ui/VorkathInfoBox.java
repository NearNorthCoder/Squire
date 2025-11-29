/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.runelite.client.util.QuantityFormatter
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.client.Static
 */
package gg.squire.vorkath.ui;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.d_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
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
import net.runelite.api.NPC;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.util.QuantityFormatter;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class VorkathInfoBox
extends OverlayPanel {
    private final /* synthetic */ d cL;
    private static /* synthetic */ int[] lIlIlIlIlIIlI;
    private final /* synthetic */ SquireVorkathPlugin cK;
    private static /* synthetic */ String[] lIlIlIlIlIIII;
    private /* synthetic */ SquireVorkathConfig y;
    private final /* synthetic */ f cM;

    private static boolean lIlllllIlllllIl(Object object) {
        return object != null;
    }

    private static String lIlllllIllIlIIl(String var1, String var6) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIlI[10]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIlIlIlIIlI[4], var20);
            return new String(var9.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        VorkathInfoBox.lIlllllIllllIll();
        VorkathInfoBox.lIlllllIllIlllI();
    }

    private static void lIlllllIllIlllI() {
        lIlIlIlIlIIII = new String[lIlIlIlIlIIlI[17]];
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[2]] = VorkathInfoBox."Squire Vorkath";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[3]] = VorkathInfoBox."Version";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[4]] = VorkathInfoBox."0.3.1";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[5]] = VorkathInfoBox."Runtime";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[6]] = VorkathInfoBox."Performing Task";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[7]] = VorkathInfoBox."Kills";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[8]] = VorkathInfoBox."%d (%d/h)";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[9]] = VorkathInfoBox."Money";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[10]] = VorkathInfoBox."%s (%s/h)";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[11]] = VorkathInfoBox."Deaths";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[0]] = VorkathInfoBox."%d";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[12]] = VorkathInfoBox."Bakning";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[13]] = VorkathInfoBox."Vorkath Frame";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[14]] = VorkathInfoBox."Ticks since attack";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[15]] = VorkathInfoBox."Ice spawn";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[16]] = VorkathInfoBox."Special";
    }

    private static boolean lIlllllIlllllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public VorkathInfoBox(SquireVorkathPlugin squireVorkathPlugin, d d2, f f2, SquireVorkathConfig squireVorkathConfig) {
        this.cK = squireVorkathPlugin;
        this.cL = d2;
        this.cM = f2;
        this.y = squireVorkathConfig;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lIlllllIllllIll() {
        lIlIlIlIlIIlI = new int[18];
        VorkathInfoBox.lIlIlIlIlIIlI[0] = 0x89 ^ 0x83;
        VorkathInfoBox.lIlIlIlIlIIlI[1] = 0xFFFFFF0F & 0x1F2;
        VorkathInfoBox.lIlIlIlIlIIlI[2] = (0x12 ^ 0x2D) & ~(0x6B ^ 0x54);
        VorkathInfoBox.lIlIlIlIlIIlI[3] = 1;
        VorkathInfoBox.lIlIlIlIlIIlI[4] = 2;
        VorkathInfoBox.lIlIlIlIlIIlI[5] = 3;
        VorkathInfoBox.lIlIlIlIlIIlI[6] = 133 + 92 - 55 + 9 ^ 93 + 130 - 121 + 81;
        VorkathInfoBox.lIlIlIlIlIIlI[7] = 0x8A ^ 0x8F;
        VorkathInfoBox.lIlIlIlIlIIlI[8] = 82 + 65 - 78 + 96 ^ 147 + 41 - 131 + 106;
        VorkathInfoBox.lIlIlIlIlIIlI[9] = 0xB6 ^ 0xB1;
        VorkathInfoBox.lIlIlIlIlIIlI[10] = 0xA9 ^ 0xA1;
        VorkathInfoBox.lIlIlIlIlIIlI[11] = 0xA2 ^ 0xBB ^ (0x71 ^ 0x61);
        VorkathInfoBox.lIlIlIlIlIIlI[12] = 0xC1 ^ 0x82 ^ (0xED ^ 0xA5);
        VorkathInfoBox.lIlIlIlIlIIlI[13] = 0x64 ^ 0x68;
        VorkathInfoBox.lIlIlIlIlIIlI[14] = 0x91 ^ 0x9C;
        VorkathInfoBox.lIlIlIlIlIIlI[15] = 137 + 35 - 90 + 62 ^ 80 + 81 - 26 + 23;
        VorkathInfoBox.lIlIlIlIlIIlI[16] = 168 + 102 - 143 + 51 ^ 148 + 149 - 229 + 121;
        VorkathInfoBox.lIlIlIlIlIIlI[17] = 134 + 152 - 109 + 13 ^ 66 + 98 - 86 + 96;
    }

    private static boolean lIlllllIllllllI(int n2) {
        return n2 == 0;
    }

    private static String lIlllllIllIllII(String var21, String var19) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var15 = var19.toCharArray();
        int var13 = lIlIlIlIlIIlI[2];
        char[] var2 = var21.toCharArray();
        int var10 = var2.length;
        int var16 = lIlIlIlIlIIlI[2];
        while (VorkathInfoBox.lIlllllIlllllll(var16, var10)) {
            char var11 = var2[var16];
            var7.append((char)(var11 ^ var15[var13 % var15.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIlllllIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        VorkathInfoBox var22;
        if (VorkathInfoBox.lIlllllIlllllII(this.cK.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var22.panelComponent.setBorder(new Rectangle(lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0]));
        var22.panelComponent.setPreferredSize(new Dimension(lIlIlIlIlIIlI[1], lIlIlIlIlIIlI[2]));
        String var3 = lIlIlIlIlIIII[lIlIlIlIlIIlI[2]];
        var22.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var3).build());
        0;
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[3]]).right(lIlIlIlIlIIII[lIlIlIlIlIIlI[4]]).build());
        0;
        Duration var4 = Duration.between(var22.cK.getStarted(), Instant.now());
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[5]]).right(Time.format((Duration)var4)).build());
        0;
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[6]]).right(var22.cK.getManager().getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[lIlIlIlIlIIlI[4]];
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[2]] = var22.cK.e();
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[3]] = var22.g(var22.cK.e());
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[7]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[8]], objectArray)).build());
        0;
        Object[] objectArray2 = new Object[lIlIlIlIlIIlI[4]];
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[2]] = QuantityFormatter.quantityToRSDecimalStack((int)var22.cK.g());
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[3]] = QuantityFormatter.quantityToRSDecimalStack((int)var22.g(var22.cK.g()));
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[9]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[10]], objectArray2)).build());
        0;
        Object[] objectArray3 = new Object[lIlIlIlIlIIlI[3]];
        objectArray3[VorkathInfoBox.lIlIlIlIlIIlI[2]] = var22.cK.d();
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[11]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[0]], objectArray3)).build());
        0;
        var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[12]]).right(String.valueOf(var22.cK.c())).build());
        0;
        NPC var5 = var22.cM.c(lIlIlIlIlIIlI[3]);
        if (VorkathInfoBox.lIlllllIlllllIl(var5) && VorkathInfoBox.lIlllllIlllllII(var22.y.debug() ? 1 : 0)) {
            var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[13]]).right(String.valueOf(var5.getActionFrame())).build());
            0;
            var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[14]]).right(String.valueOf(Static.getClient().getTickCount() - var22.cM.H())).build());
            0;
            var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[15]]).right(String.valueOf(var22.cM.I())).build());
            0;
            var22.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[16]]).right(String.valueOf((Object)var22.cM.B())).build());
            0;
        }
        return super.render(graphics2D);
    }

    public int g(int n2) {
        Duration duration = Duration.between(this.cK.getStarted(), Instant.now());
        if (VorkathInfoBox.lIlllllIllllllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return lIlIlIlIlIIlI[2];
    }

    private static String lIlllllIllIlIlI(String var12, String var23) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIlIlIlIlIIlI[4], var17);
            return new String(var18.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

