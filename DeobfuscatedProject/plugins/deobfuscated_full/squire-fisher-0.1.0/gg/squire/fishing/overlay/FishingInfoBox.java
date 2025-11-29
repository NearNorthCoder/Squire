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
package gg.squire.fishing.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
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

public class FishingInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIlllIlllIII;
    private final /* synthetic */ TaskManager D;
    private final /* synthetic */ SquireFisherConfig E;
    private final /* synthetic */ SquireFisherPlugin C;
    private static /* synthetic */ int[] lIlllIlllIIl;

    @Inject
    private FishingInfoBox(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.C = squireFisherPlugin;
        this.D = squireFisherPlugin.getManager();
        this.E = squireFisherConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n) {
        Duration duration = Duration.between(this.C.getStarted(), Instant.now());
        if (FishingInfoBox.lllIllIIIIIlll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lllIllIIIIIlll(int n) {
        return n == 0;
    }

    private static String lllIllIIIIIIIl(String var17, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlllIlllIIl[8]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlllIlllIIl[2], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lllIllIIIIIIlI(String var14, String var9) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var18 = var9.toCharArray();
        int var10 = lIlllIlllIIl[0];
        char[] var3 = var14.toCharArray();
        int var20 = var3.length;
        int var21 = lIlllIlllIIl[0];
        while (FishingInfoBox.lllIllIIIIlIII(var21, var20)) {
            char var15 = var3[var21];
            var19.append((char)(var15 ^ var18[var10 % var18.length]));
            0;
            ++var10;
            ++var21;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public Dimension render(Graphics2D graphics2D) {
        FishingInfoBox var1;
        if (FishingInfoBox.lllIllIIIIIllI(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var13 = Duration.between(var1.C.getStarted(), Instant.now()).minus(SquireFisherPlugin.c(), ChronoUnit.MILLIS);
        var1.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlllIlllIII[lIlllIlllIIl[0]]).build());
        0;
        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[1]]).right(Time.format((Duration)var13)).build());
        0;
        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[2]]).right(lIlllIlllIII[lIlllIlllIIl[3]]).build());
        0;
        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[4]]).right(var1.D.getCurrentTask()).build());
        0;
        if (FishingInfoBox.lllIllIIIIIlll(var1.E.fishingTrawler() ? 1 : 0)) {
            String string;
            List list = var1.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[5]]);
            if (FishingInfoBox.lllIllIIIIIllI(var1.E.tickFishing() ? 1 : 0)) {
                string = lIlllIlllIII[lIlllIlllIIl[6]];
                0;
                if (3 == 0) {
                    return null;
                }
            } else {
                string = lIlllIlllIII[lIlllIlllIIl[7]];
            }
            list.add(lineComponentBuilder.right(string).build());
            0;
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[8]]).right("" + SquireFisherPlugin.d).build());
            0;
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[9]]).right("" + var1.b(SquireFisherPlugin.d)).build());
            0;
            0;
            if ((0x83 ^ 0xAB ^ (0x7B ^ 0x57)) != (0x2F ^ 0x65 ^ (0x76 ^ 0x38))) {
                return null;
            }
        } else {
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[10]]).right("" + SquireFisherPlugin.c).build());
            0;
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[11]]).right("" + var1.b(SquireFisherPlugin.c)).build());
            0;
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[12]]).right("" + SquireFisherPlugin.b).build());
            0;
        }
        int n = lIlllIlllIIl[13];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlllIlllIIl[14], lIlllIlllIIl[0]));
        return super.render(graphics2D);
    }

    static {
        FishingInfoBox.lllIllIIIIIlIl();
        FishingInfoBox.lllIllIIIIIlII();
    }

    private static boolean lllIllIIIIlIII(int n, int n2) {
        return n < n2;
    }

    private static String lllIllIIIIIIll(String var8, String var4) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlllIlllIIl[2], var12);
            return new String(var11.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void lllIllIIIIIlII() {
        lIlllIlllIII = new String[lIlllIlllIIl[15]];
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[0]] = FishingInfoBox."Squire Fisher";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[1]] = FishingInfoBox."Runtime";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[2]] = FishingInfoBox."Version";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[3]] = FishingInfoBox."1.2.1";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[4]] = FishingInfoBox."Task: ";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[5]] = FishingInfoBox."3 ticking:";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[6]] = FishingInfoBox."Yes";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[7]] = FishingInfoBox."No";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[8]] = FishingInfoBox."Fish Caught";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[9]] = FishingInfoBox."Fish Per Hour";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[10]] = FishingInfoBox."Trawler Games";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[11]] = FishingInfoBox."Trawler Games Per Hour";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[12]] = FishingInfoBox."Gear Collected";
    }

    private static void lllIllIIIIIlIl() {
        lIlllIlllIIl = new int[16];
        FishingInfoBox.lIlllIlllIIl[0] = (0x34 ^ 0x7B ^ (0x5C ^ 0x54)) & (2 + 50 - -128 + 54 ^ 61 + 40 - 13 + 85 ^ -1);
        FishingInfoBox.lIlllIlllIIl[1] = 1;
        FishingInfoBox.lIlllIlllIIl[2] = 2;
        FishingInfoBox.lIlllIlllIIl[3] = 3;
        FishingInfoBox.lIlllIlllIIl[4] = 0xAC ^ 0xA8;
        FishingInfoBox.lIlllIlllIIl[5] = 0x11 ^ 0x24 ^ (0xD ^ 0x3D);
        FishingInfoBox.lIlllIlllIIl[6] = 0xC2 ^ 0xA5 ^ (0x1D ^ 0x7C);
        FishingInfoBox.lIlllIlllIIl[7] = 0xBB ^ 0xBC;
        FishingInfoBox.lIlllIlllIIl[8] = 0x61 ^ 0x33 ^ (0x2E ^ 0x74);
        FishingInfoBox.lIlllIlllIIl[9] = 0x48 ^ 0x41;
        FishingInfoBox.lIlllIlllIIl[10] = 0x6C ^ 0x66;
        FishingInfoBox.lIlllIlllIIl[11] = 170 + 122 - 100 + 12 ^ 119 + 47 - 36 + 69;
        FishingInfoBox.lIlllIlllIIl[12] = 0x5E ^ 0x52;
        FishingInfoBox.lIlllIlllIIl[13] = 0xFFFFD55F & 0x2BA2;
        FishingInfoBox.lIlllIlllIIl[14] = 0xA4 ^ 0xB0;
        FishingInfoBox.lIlllIlllIIl[15] = 0xD7 ^ 0xC4 ^ (0xB4 ^ 0xAA);
    }

    private static boolean lllIllIIIIIllI(int n) {
        return n != 0;
    }
}

