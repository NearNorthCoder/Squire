/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class FightCavesInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] llIIIllIlIII;
    private final /* synthetic */ f O;
    private final /* synthetic */ SquireFightCavesPlugin N;
    private final /* synthetic */ SquireFightCavesConfig P;
    private final /* synthetic */ TaskManager Q;
    private static /* synthetic */ String[] llIIIllIIlll;

    private static void llllIllIIIIIII() {
        llIIIllIlIII = new int[14];
        FightCavesInfoBox.llIIIllIlIII[0] = 0xBF ^ 0xB5;
        FightCavesInfoBox.llIIIllIlIII[1] = (0x2F ^ 0x19 ^ (0x94 ^ 0x9E)) & (0x6C ^ 0x4C ^ (0xA2 ^ 0xBE) ^ -1);
        FightCavesInfoBox.llIIIllIlIII[2] = 6 + 167 - 58 + 78;
        FightCavesInfoBox.llIIIllIlIII[3] = 6 + 120 - 79 + 162 ^ 51 + 129 - 162 + 179;
        FightCavesInfoBox.llIIIllIlIII[4] = 1;
        FightCavesInfoBox.llIIIllIlIII[5] = 2;
        FightCavesInfoBox.llIIIllIlIII[6] = 3;
        FightCavesInfoBox.llIIIllIlIII[7] = 0x3A ^ 0xB ^ (0x53 ^ 0x66);
        FightCavesInfoBox.llIIIllIlIII[8] = 86 + 176 - 194 + 119 ^ 138 + 22 - 52 + 82;
        FightCavesInfoBox.llIIIllIlIII[9] = 0x34 ^ 0x32;
        FightCavesInfoBox.llIIIllIlIII[10] = 0x65 ^ 0x11 ^ (0x35 ^ 0x46);
        FightCavesInfoBox.llIIIllIlIII[11] = 0x6D ^ 0x65;
        FightCavesInfoBox.llIIIllIlIII[12] = 0x72 ^ 0x7B;
        FightCavesInfoBox.llIIIllIlIII[13] = 0xCF ^ 0xC4;
    }

    private static String llllIlIlllllIl(String var17, String var15) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIIllIlIII[11]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIIIllIlIII[5], var21);
            return new String(var11.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public long j(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if (FightCavesInfoBox.llllIllIIIIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llllIllIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllIlIllllllI(String var19, String var24) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var13 = var24.toCharArray();
        int var23 = llIIIllIlIII[1];
        char[] var10 = var19.toCharArray();
        int var1 = var10.length;
        int var3 = llIIIllIlIII[1];
        while (FightCavesInfoBox.llllIllIIIIIll(var3, var1)) {
            char var8 = var10[var3];
            var5.append((char)(var8 ^ var13[var23 % var13.length]));
            0;
            ++var23;
            ++var3;
            0;
            if (-1 <= ((0xCF ^ 0xC7 ^ (0x74 ^ 0x63)) & (147 + 111 - 197 + 158 ^ 41 + 75 - -38 + 42 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    public Dimension render(Graphics2D graphics2D) {
        FightCavesInfoBox var20;
        if (FightCavesInfoBox.llllIllIIIIIIl(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long var4 = System.currentTimeMillis() - SquireFightCavesPlugin.k;
        var20.panelComponent.setBorder(new Rectangle(llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0]));
        String var2 = llIIIllIIlll[llIIIllIlIII[1]];
        var20.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2).build());
        0;
        int var9 = llIIIllIlIII[2];
        var20.panelComponent.setPreferredSize(new Dimension(var9 + llIIIllIlIII[3], llIIIllIlIII[1]));
        Duration var6 = Duration.between(var20.N.getStarted(), Instant.now());
        var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[4]]).right(Time.format((Duration)var6)).build());
        0;
        var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[5]]).right(SquireFightCavesPlugin.h).build());
        0;
        List list = var20.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[6]]);
        f cfr_ignored_0 = var20.O;
        0;
        list.add(lineComponentBuilder.right(String.valueOf(f.p())).build());
        0;
        var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[7]]).right(String.valueOf(SquireFightCavesPlugin.j)).build());
        0;
        var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[8]]).right(String.valueOf(SquireFightCavesPlugin.i) + " (" + FightCavesInfoBox.a(SquireFightCavesPlugin.i, var4) + "/hr)").build());
        0;
        if (FightCavesInfoBox.llllIllIIIIIIl(var20.P.showExtraInfoOnUI() ? 1 : 0)) {
            var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[9]]).right(String.valueOf(f.w())).build());
            0;
            var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[10]]).right(String.valueOf(f.u())).build());
            0;
            var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[11]]).right(String.valueOf(f.t())).build());
            0;
            var20.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[12]]).right(String.valueOf(f.r())).build());
            0;
        }
        return super.render(graphics2D);
    }

    static {
        FightCavesInfoBox.llllIllIIIIIII();
        FightCavesInfoBox.llllIlIlllllll();
    }

    @Inject
    public FightCavesInfoBox(SquireFightCavesPlugin squireFightCavesPlugin, f f2, SquireFightCavesConfig squireFightCavesConfig) {
        this.N = squireFightCavesPlugin;
        this.Q = squireFightCavesPlugin.getManager();
        this.O = f2;
        this.P = squireFightCavesConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

    private static boolean llllIllIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String llllIlIlllllII(String var22, String var7) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIIIllIlIII[5], var12);
            return new String(var14.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void llllIlIlllllll() {
        llIIIllIIlll = new String[llIIIllIlIII[13]];
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[1]] = FightCavesInfoBox."Squire Fight Caves";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[4]] = FightCavesInfoBox."Runtime:";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[5]] = FightCavesInfoBox."Task: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[6]] = FightCavesInfoBox."Current Wave: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[7]] = FightCavesInfoBox."Attempts: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[8]] = FightCavesInfoBox."Capes: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[9]] = FightCavesInfoBox."Last Blob Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[10]] = FightCavesInfoBox."Last Ranger Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[11]] = FightCavesInfoBox."Last Mager Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[12]] = FightCavesInfoBox."Last Meleer Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[0]] = FightCavesInfoBox."#.0";
    }

    private static double a(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(llIIIllIIlll[llIIIllIlIII[0]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    private static boolean llllIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return FightCavesInfoBox.a(d3);
    }
}

