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
package gg.squire.combat.overlays;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
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

public class InfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireBlueDragonKiller p;
    private final /* synthetic */ SquireBlueDragonKiller r;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIIlllIlIIll;
    private static /* synthetic */ String[] lIIlllIlIIlI;
    private final /* synthetic */ SquireBlueDragonKillerConfig s;

    public long g(int n) {
        Duration duration = Duration.between(this.r.getStarted(), Instant.now());
        if (InfoBox.llIlIIIIllIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIlIIIIllIlII(int n) {
        return n == 0;
    }

    static {
        InfoBox.llIlIIIIllIIlI();
        InfoBox.llIlIIIIllIIIl();
    }

    private static boolean llIlIIIIllIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIIllIlIl(int n, int n2) {
        return n < n2;
    }

    private static void llIlIIIIllIIIl() {
        lIIlllIlIIlI = new String[lIIlllIlIIll[10]];
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[0]] = InfoBox."Squire Blue Dragon Killer";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[1]] = InfoBox."Runtime: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[2]] = InfoBox."Version";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[3]] = InfoBox."1.1.0";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[4]] = InfoBox."Task: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[5]] = InfoBox."Dragon Bones: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[6]] = InfoBox."Dragon Hides / H: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[7]] = InfoBox."Dragon Scales / H: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[8]] = InfoBox."Ensouled Heads / H: ";
    }

    private static String llIlIIIIllIIII(String var16, String var2) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var13 = lIIlllIlIIll[0];
        char[] var5 = var16.toCharArray();
        int var1 = var5.length;
        int var14 = lIIlllIlIIll[0];
        while (InfoBox.llIlIIIIllIlIl(var14, var1)) {
            char var11 = var5[var14];
            var15.append((char)(var11 ^ var4[var13 % var4.length]));
            0;
            ++var13;
            ++var14;
            0;
            if ((69 + 73 - 74 + 87 ^ 78 + 13 - 56 + 124) > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static String llIlIIIIlIlllI(String var6, String var8) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIIlllIlIIll[2], var10);
            return new String(var18.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var7;
        if (InfoBox.llIlIIIIllIIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var19 = Duration.between(var7.p.getStarted(), Instant.now());
        var7.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllIlIIlI[lIIlllIlIIll[0]]).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[1]]).right(Time.format((Duration)var19)).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[2]]).right(lIIlllIlIIlI[lIIlllIlIIll[3]]).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[4]]).right(var7.q.getCurrentTask()).build());
        0;
        if (InfoBox.llIlIIIIllIIll(var7.s.lootBones() ? 1 : 0)) {
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[5]]).right(var7.r.d() + " (" + var7.g(var7.r.d()) + "/h)").build());
            0;
        }
        if (InfoBox.llIlIIIIllIIll(var7.s.lootHides() ? 1 : 0)) {
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[6]]).right(var7.r.e() + " (" + var7.g(var7.r.e()) + "/h)").build());
            0;
        }
        if (InfoBox.llIlIIIIllIIll(var7.s.lootScales() ? 1 : 0)) {
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[7]]).right(var7.r.f() + " (" + var7.g(var7.r.f()) + "/h)").build());
            0;
        }
        if (InfoBox.llIlIIIIllIIll(var7.s.lootEnsouled() ? 1 : 0)) {
            var7.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[8]]).right(var7.r.g() + " (" + var7.g(var7.r.g()) + "/h)").build());
            0;
        }
        int n = lIIlllIlIIll[9];
        this.panelComponent.setPreferredSize(new Dimension(n, lIIlllIlIIll[0]));
        return super.render(graphics2D);
    }

    private static String llIlIIIIlIllll(String var20, String var21) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIIlllIlIIll[8]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIIlllIlIIll[2], var9);
            return new String(var12.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    @Inject
    public InfoBox(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKiller squireBlueDragonKiller2, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.p = squireBlueDragonKiller;
        this.q = squireBlueDragonKiller.getManager();
        this.r = squireBlueDragonKiller2;
        this.s = squireBlueDragonKillerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void llIlIIIIllIIlI() {
        lIIlllIlIIll = new int[11];
        InfoBox.lIIlllIlIIll[0] = (0x76 ^ 0x73) & ~(0x34 ^ 0x31);
        InfoBox.lIIlllIlIIll[1] = 1;
        InfoBox.lIIlllIlIIll[2] = 2;
        InfoBox.lIIlllIlIIll[3] = 3;
        InfoBox.lIIlllIlIIll[4] = 25 + 156 - 93 + 101 ^ 157 + 140 - 181 + 69;
        InfoBox.lIIlllIlIIll[5] = 0 ^ 5;
        InfoBox.lIIlllIlIIll[6] = 0x52 ^ 0x54;
        InfoBox.lIIlllIlIIll[7] = 0x13 ^ 0x33 ^ (0x39 ^ 0x1E);
        InfoBox.lIIlllIlIIll[8] = 0x95 ^ 0xC4 ^ (0x1E ^ 0x47);
        InfoBox.lIIlllIlIIll[9] = 0xFFFF8DD3 & 0x732E;
        InfoBox.lIIlllIlIIll[10] = 0xBB ^ 0xB2;
    }
}

