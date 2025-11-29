/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.util.Text
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.zulrah.overlay;

import a.u.i.-.l.r.h.z.s.r.u.q.e.v_Unknown;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
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
import net.runelite.api.util.Text;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class ZulrahInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIllIlIlIIlll;
    private static /* synthetic */ String[] lIllIlIlIIlII;
    private final /* synthetic */ v O;
    private final /* synthetic */ SquireZulrah N;

    private static String llIIIllllllIlll(String var6, String var3) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var10 = var3.toCharArray();
        int var13 = lIllIlIlIIlll[2];
        char[] var5 = var6.toCharArray();
        int var1 = var5.length;
        int var17 = lIllIlIlIIlll[2];
        while (ZulrahInfoBox.llIIlIIIIIIIlIl(var17, var1)) {
            char var4 = var5[var17];
            var15.append((char)(var4 ^ var10[var13 % var10.length]));
            0;
            ++var13;
            ++var17;
            0;
            if (((41 + 122 - 147 + 163 ^ 131 + 112 - 198 + 87) & (0x17 ^ 0x69 ^ (0xDA ^ 0x93) ^ -1)) <= ((0x20 ^ 0x65 ^ (2 ^ 0x52)) & (165 + 171 - 193 + 45 ^ 158 + 14 - 76 + 73 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void llIIlIIIIIIIIII() {
        lIllIlIlIIlII = new String[lIllIlIlIIlll[13]];
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[2]] = ZulrahInfoBox."Squire Zulrah";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[3]] = ZulrahInfoBox."Version";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[4]] = ZulrahInfoBox."0.2.0";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[5]] = ZulrahInfoBox."Runtime";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[6]] = ZulrahInfoBox."Performing Task";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[7]] = ZulrahInfoBox."Banking";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[8]] = ZulrahInfoBox."Killed zulrah";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[9]] = ZulrahInfoBox."Kills";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[10]] = ZulrahInfoBox."%d (%d/h)";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[11]] = ZulrahInfoBox."Zulrah Health";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[0]] = ZulrahInfoBox."Zulrah Rotation";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[12]] = ZulrahInfoBox."Zulrah Style";
    }

    static {
        ZulrahInfoBox.llIIlIIIIIIIIIl();
        ZulrahInfoBox.llIIlIIIIIIIIII();
    }

    private static boolean llIIlIIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIIIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIIIIIIIIl() {
        lIllIlIlIIlll = new int[14];
        ZulrahInfoBox.lIllIlIlIIlll[0] = 0x69 ^ 0x63;
        ZulrahInfoBox.lIllIlIlIIlll[1] = 0xFFFF8557 & 0x7BAA;
        ZulrahInfoBox.lIllIlIlIIlll[2] = (0xCA ^ 0xC5) & ~(0x34 ^ 0x3B);
        ZulrahInfoBox.lIllIlIlIIlll[3] = 1;
        ZulrahInfoBox.lIllIlIlIIlll[4] = 2;
        ZulrahInfoBox.lIllIlIlIIlll[5] = 3;
        ZulrahInfoBox.lIllIlIlIIlll[6] = 0x97 ^ 0x93;
        ZulrahInfoBox.lIllIlIlIIlll[7] = 6 ^ 3;
        ZulrahInfoBox.lIllIlIlIIlll[8] = 0x71 ^ 0x77;
        ZulrahInfoBox.lIllIlIlIIlll[9] = 28 + 121 - 56 + 40 ^ 37 + 60 - 24 + 57;
        ZulrahInfoBox.lIllIlIlIIlll[10] = 0x90 ^ 0x98;
        ZulrahInfoBox.lIllIlIlIIlll[11] = 0x6E ^ 0x67;
        ZulrahInfoBox.lIllIlIlIIlll[12] = 167 + 129 - 186 + 95 ^ 51 + 45 - -98 + 4;
        ZulrahInfoBox.lIllIlIlIIlll[13] = 0x34 ^ 0x38;
    }

    public Dimension render(Graphics2D graphics2D) {
        ZulrahInfoBox var7;
        if (ZulrahInfoBox.llIIlIIIIIIIIlI(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var7.panelComponent.setBorder(new Rectangle(lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0]));
        var7.panelComponent.setPreferredSize(new Dimension(lIllIlIlIIlll[1], lIllIlIlIIlll[2]));
        String var18 = lIllIlIlIIlII[lIllIlIlIIlll[2]];
        var7.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var18).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[3]]).right(lIllIlIlIIlII[lIllIlIlIIlll[4]]).build());
        0;
        Duration var2 = Duration.between(var7.N.getStarted(), Instant.now());
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[5]]).right(Time.format((Duration)var2)).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[6]]).right(var7.N.getManager().getCurrentTask()).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[7]]).right(String.valueOf(var7.N.d())).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[8]]).right(String.valueOf(var7.N.e())).build());
        0;
        int var22 = (int)var7.i(var7.O.Y());
        Object[] objectArray = new Object[lIllIlIlIIlll[4]];
        objectArray[ZulrahInfoBox.lIllIlIlIIlll[2]] = var7.O.Y();
        objectArray[ZulrahInfoBox.lIllIlIlIIlll[3]] = var22;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[9]]).right(String.format(lIllIlIlIIlII[lIllIlIlIIlll[10]], objectArray)).build());
        0;
        NPC var12 = var7.O.W();
        if (ZulrahInfoBox.llIIlIIIIIIIIll(var12)) {
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[11]]).right(String.valueOf((int)((double)var12.getHealthRatio() * 4.25))).build());
            0;
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[0]]).right(Text.titleCase((Enum)var7.O.V().C())).build());
            0;
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[12]]).right(Text.titleCase((Enum)var7.O.V().C().w())).build());
            0;
        }
        return super.render(graphics2D);
    }

    public long i(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if (ZulrahInfoBox.llIIlIIIIIIIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String llIIIlllllllIII(String var24, String var16) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIllIlIlIIlll[4], var8);
            return new String(var14.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIIIIIIll(Object object) {
        return object != null;
    }

    @Inject
    public ZulrahInfoBox(SquireZulrah squireZulrah, v v2) {
        this.N = squireZulrah;
        this.O = v2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static String llIIIlllllllIll(String var23, String var9) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIlll[10]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIllIlIlIIlll[4], var20);
            return new String(var11.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

