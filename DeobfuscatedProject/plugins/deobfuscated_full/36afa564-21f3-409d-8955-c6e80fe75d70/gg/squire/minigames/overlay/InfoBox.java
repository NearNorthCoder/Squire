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
package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireSorceressGarden;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
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
    private final /* synthetic */ SquireSorceressGarden p;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIIllIIlIIlll;
    private final /* synthetic */ SquireSorceressGardenConfig r;
    private static /* synthetic */ String[] lIIllIIlIIlIl;

    public long n(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (InfoBox.lIlIlllllIlllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static void lIlIlllllIllIII() {
        lIIllIIlIIlIl = new String[lIIllIIlIIlll[19]];
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[1]] = InfoBox."Squire Sorceress Garden";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[2]] = InfoBox."Runtime";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[3]] = InfoBox."Task: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[4]] = InfoBox."Sq'irks Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[5]] = InfoBox."XP PH: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[6]] = InfoBox."Herbs Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[7]] = InfoBox."Guams Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[8]] = InfoBox."Marrentills Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[9]] = InfoBox."Tarromins Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[10]] = InfoBox."Harralanders Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[0]] = InfoBox."Irits Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[11]] = InfoBox."Avantoes Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[12]] = InfoBox."Ranarrs Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[13]] = InfoBox."Kwuarms Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[14]] = InfoBox."Cadantines Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[15]] = InfoBox."Lantadymes Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[16]] = InfoBox."Dwarf Weeds Collected: ";
    }

    @Inject
    private InfoBox(SquireSorceressGarden squireSorceressGarden, SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.p = squireSorceressGarden;
        this.q = squireSorceressGarden.getManager();
        this.r = squireSorceressGardenConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIlIlllllIlIIlI(String var13, String var4) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIllIIlIIlll[3], var9);
            return new String(var10.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIlIIIl(String var7, String var15) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlll[9]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIllIIlIIlll[3], var21);
            return new String(var6.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIlIIII(String var16, String var3) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var3.toCharArray();
        int var14 = lIIllIIlIIlll[1];
        char[] var8 = var16.toCharArray();
        int var11 = var8.length;
        int var12 = lIIllIIlIIlll[1];
        while (InfoBox.lIlIlllllIlllIl(var12, var11)) {
            char var1 = var8[var12];
            var19.append((char)(var1 ^ var20[var14 % var20.length]));
            0;
            ++var14;
            ++var12;
            0;
            if (((0xEB ^ 0xA3) & ~(0x8E ^ 0xC6)) == 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIlIlllllIllIll(int n) {
        return n != 0;
    }

    static {
        InfoBox.lIlIlllllIllIlI();
        InfoBox.lIlIlllllIllIII();
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var2;
        if (InfoBox.lIlIlllllIllIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var5 = Duration.between(var2.p.getStarted(), Instant.now());
        var2.panelComponent.setBorder(new Rectangle(lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0]));
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlIIlIl[lIIllIIlIIlll[1]]).build());
        0;
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[2]]).right(Time.format((Duration)var5)).build());
        0;
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[3]]).right(var2.q.getCurrentTask()).build());
        0;
        if (InfoBox.lIlIlllllIlllII(var2.r.pickHerbs() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[4]]).right(var2.p.a() + " (" + var2.n(var2.p.a()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[5]]).right(NumberFormat.getIntegerInstance().format(var2.n())).build());
            0;
            0;
            if (((0x42 ^ 0x18) & ~(0x3B ^ 0x61)) >= 2) {
                return null;
            }
        } else if (InfoBox.lIlIlllllIlllII(var2.r.breakDownHerbs() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[6]]).right(var2.p.b() + " (" + var2.n(var2.p.b()) + "/h)").build());
            0;
            0;
            if ((66 + 72 - 116 + 109 ^ 37 + 62 - 21 + 57) <= 0) {
                return null;
            }
        } else {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[7]]).right(var2.p.c() + " (" + var2.n(var2.p.c()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[8]]).right(var2.p.d() + " (" + var2.n(var2.p.d()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[9]]).right(var2.p.e() + " (" + var2.n(var2.p.e()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[10]]).right(var2.p.f() + " (" + var2.n(var2.p.f()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[0]]).right(var2.p.g() + " (" + var2.n(var2.p.g()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[11]]).right(var2.p.h() + " (" + var2.n(var2.p.h()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[12]]).right(var2.p.i() + " (" + var2.n(var2.p.i()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[13]]).right(var2.p.j() + " (" + var2.n(var2.p.j()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[14]]).right(var2.p.k() + " (" + var2.n(var2.p.k()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[15]]).right(var2.p.l() + " (" + var2.n(var2.p.l()) + "/h)").build());
            0;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[16]]).right(var2.p.m() + " (" + var2.n(var2.p.m()) + "/h)").build());
            0;
        }
        int n = lIIllIIlIIlll[17];
        this.panelComponent.setPreferredSize(new Dimension(n + lIIllIIlIIlll[18], lIIllIIlIIlll[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIlllllIlllII(int n) {
        return n == 0;
    }

    public long n() {
        int n = (int)this.n(this.p.a());
        return (long)n * 1500L;
    }

    private static boolean lIlIlllllIlllIl(int n, int n2) {
        return n < n2;
    }

    private static void lIlIlllllIllIlI() {
        lIIllIIlIIlll = new int[20];
        InfoBox.lIIllIIlIIlll[0] = 65 + 123 - 111 + 94 ^ 133 + 29 - 68 + 67;
        InfoBox.lIIllIIlIIlll[1] = (0x93 ^ 0xBA) & ~(0x25 ^ 0xC);
        InfoBox.lIIllIIlIIlll[2] = 1;
        InfoBox.lIIllIIlIIlll[3] = 2;
        InfoBox.lIIllIIlIIlll[4] = 3;
        InfoBox.lIIllIIlIIlll[5] = 0x5E ^ 0x5A;
        InfoBox.lIIllIIlIIlll[6] = 0x2A ^ 3 ^ (0x7D ^ 0x51);
        InfoBox.lIIllIIlIIlll[7] = 0xC0 ^ 0xC6;
        InfoBox.lIIllIIlIIlll[8] = 0x68 ^ 0x6F;
        InfoBox.lIIllIIlIIlll[9] = 0 ^ 0x57 ^ (0x26 ^ 0x79);
        InfoBox.lIIllIIlIIlll[10] = 0x43 ^ 0x2E ^ (0x32 ^ 0x56);
        InfoBox.lIIllIIlIIlll[11] = 0x68 ^ 0x56 ^ (0x85 ^ 0xB0);
        InfoBox.lIIllIIlIIlll[12] = 0xB1 ^ 0xBD;
        InfoBox.lIIllIIlIIlll[13] = 0x6E ^ 0x63;
        InfoBox.lIIllIIlIIlll[14] = 0xBA ^ 0xB4;
        InfoBox.lIIllIIlIIlll[15] = 0x35 ^ 8 ^ (0xAD ^ 0x9F);
        InfoBox.lIIllIIlIIlll[16] = 0x39 ^ 0x29;
        InfoBox.lIIllIIlIIlll[17] = 0xFFFF9B3E & 0x65C3;
        InfoBox.lIIllIIlIIlll[18] = 0 ^ 0x14;
        InfoBox.lIIllIIlIIlll[19] = 0x19 ^ 0x23 ^ (0x34 ^ 0x1F);
    }
}

