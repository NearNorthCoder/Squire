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
package squire.gg.hunter.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
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
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.b;
import squire.gg.hunter.SquireHerbiboarPlugin;

public class HerbiboarInfoBox
extends OverlayPanel {
    private final /* synthetic */ TaskManager aa;
    private final /* synthetic */ SquireHerbiboarPlugin Z;
    private static /* synthetic */ int[] lllIIllIIlII;
    private static /* synthetic */ String[] lllIIllIIIll;
    private final /* synthetic */ b ab;

    @Inject
    private HerbiboarInfoBox(SquireHerbiboarPlugin squireHerbiboarPlugin, b b2) {
        this.Z = squireHerbiboarPlugin;
        this.aa = squireHerbiboarPlugin.getManager();
        this.ab = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIIlIlIIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIIIlIlIIlllIll() {
        lllIIllIIlII = new int[12];
        HerbiboarInfoBox.lllIIllIIlII[0] = (149 + 113 - 164 + 77 ^ 162 + 26 - 158 + 137) & (8 + 123 - 58 + 112 ^ 110 + 7 - -44 + 16 ^ -1);
        HerbiboarInfoBox.lllIIllIIlII[1] = 1;
        HerbiboarInfoBox.lllIIllIIlII[2] = 2;
        HerbiboarInfoBox.lllIIllIIlII[3] = 3;
        HerbiboarInfoBox.lllIIllIIlII[4] = 0xBF ^ 0xBB;
        HerbiboarInfoBox.lllIIllIIlII[5] = 0x6C ^ 0x69;
        HerbiboarInfoBox.lllIIllIIlII[6] = 0xC2 ^ 0xC4;
        HerbiboarInfoBox.lllIIllIIlII[7] = 0x77 ^ 1 ^ (0x6F ^ 0x1E);
        HerbiboarInfoBox.lllIIllIIlII[8] = 114 + 39 - 90 + 90 ^ 34 + 96 - 67 + 82;
        HerbiboarInfoBox.lllIIllIIlII[9] = -(0xFFFFFFDD & 0x6FF) & (0xFFFFA7FF & 0x5FDE);
        HerbiboarInfoBox.lllIIllIIlII[10] = 0x8B ^ 0x9F;
        HerbiboarInfoBox.lllIIllIIlII[11] = 145 + 120 - 255 + 162 ^ 62 + 83 - 10 + 30;
    }

    static {
        HerbiboarInfoBox.lIIIlIlIIlllIll();
        HerbiboarInfoBox.lIIIlIlIIlllIlI();
    }

    private static void lIIIlIlIIlllIlI() {
        lllIIllIIIll = new String[lllIIllIIlII[11]];
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[0]] = HerbiboarInfoBox."Squire Herbiboar";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[1]] = HerbiboarInfoBox."Runtime";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[2]] = HerbiboarInfoBox."Version";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[3]] = HerbiboarInfoBox."1.1.5";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[4]] = HerbiboarInfoBox."Current state: ";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[5]] = HerbiboarInfoBox."Needs restock: ";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[6]] = HerbiboarInfoBox."Task: ";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[7]] = HerbiboarInfoBox."Herbiboar Kills";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[8]] = HerbiboarInfoBox."Herbiboar Kills Per Hour";
    }

    private static String lIIIlIlIIlllIIl(String var13, String var2) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var12 = var2.toCharArray();
        int var3 = lllIIllIIlII[0];
        char[] var11 = var13.toCharArray();
        int var5 = var11.length;
        int var7 = lllIIllIIlII[0];
        while (HerbiboarInfoBox.lIIIlIlIIlllllI(var7, var5)) {
            char var8 = var11[var7];
            var15.append((char)(var8 ^ var12[var3 % var12.length]));
            0;
            ++var3;
            ++var7;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static String lIIIlIlIIlllIII(String var14, String var19) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lllIIllIIlII[8]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lllIIllIIlII[2], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HerbiboarInfoBox.lIIIlIlIIllllII(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllIIIll[lllIIllIIlII[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[1]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[2]]).right(lllIIllIIIll[lllIIllIIlII[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[4]]).right(this.ab.i().toString()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[5]]).right(String.valueOf(this.Z.f())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[6]]).right(this.aa.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[7]]).right("" + SquireHerbiboarPlugin.e()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[8]]).right("" + this.c(SquireHerbiboarPlugin.e())).build());
        0;
        int n2 = lllIIllIIlII[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIllIIlII[10], lllIIllIIlII[0]));
        return super.render(graphics2D);
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (HerbiboarInfoBox.lIIIlIlIIllllIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIlIIllIlll(String var16, String var4) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllIIllIIlII[2], var17);
            return new String(var10.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

