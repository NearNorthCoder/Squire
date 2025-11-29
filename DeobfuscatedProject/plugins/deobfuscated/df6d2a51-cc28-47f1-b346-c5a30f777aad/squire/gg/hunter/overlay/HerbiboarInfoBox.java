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

    private static String lIIIlIlIIlllIIl(String lllllllllllllllIIllIlIIIllllllIl, String lllllllllllllllIIllIlIIIllllIlll) {
        lllllllllllllllIIllIlIIIllllllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIlllllIll = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIlllllIlI = lllllllllllllllIIllIlIIIllllIlll.toCharArray();
        int lllllllllllllllIIllIlIIIlllllIIl = lllIIllIIlII[0];
        char[] lllllllllllllllIIllIlIIIllllIIll = lllllllllllllllIIllIlIIIllllllIl.toCharArray();
        int lllllllllllllllIIllIlIIIllllIIlI = lllllllllllllllIIllIlIIIllllIIll.length;
        int lllllllllllllllIIllIlIIIllllIIIl = lllIIllIIlII[0];
        while (HerbiboarInfoBox.lIIIlIlIIlllllI(lllllllllllllllIIllIlIIIllllIIIl, lllllllllllllllIIllIlIIIllllIIlI)) {
            char lllllllllllllllIIllIlIIIlllllllI = lllllllllllllllIIllIlIIIllllIIll[lllllllllllllllIIllIlIIIllllIIIl];
            lllllllllllllllIIllIlIIIlllllIll.append((char)(lllllllllllllllIIllIlIIIlllllllI ^ lllllllllllllllIIllIlIIIlllllIlI[lllllllllllllllIIllIlIIIlllllIIl % lllllllllllllllIIllIlIIIlllllIlI.length]));
            0;
            ++lllllllllllllllIIllIlIIIlllllIIl;
            ++lllllllllllllllIIllIlIIIllllIIIl;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIIlllllIll);
    }

    private static String lIIIlIlIIlllIII(String lllllllllllllllIIllIlIIIllIllIll, String lllllllllllllllIIllIlIIIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIllIllIII.getBytes(StandardCharsets.UTF_8)), lllIIllIIlII[8]), "DES");
            Cipher lllllllllllllllIIllIlIIIllIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIllIlllIl.init(lllIIllIIlII[2], lllllllllllllllIIllIlIIIllIllllI);
            return new String(lllllllllllllllIIllIlIIIllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIllIlllII) {
            lllllllllllllllIIllIlIIIllIlllII.printStackTrace();
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

    private static String lIIIlIlIIllIlll(String lllllllllllllllIIllIlIIIlllIIllI, String lllllllllllllllIIllIlIIIlllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIlllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIlllIlIlI.init(lllIIllIIlII[2], lllllllllllllllIIllIlIIIlllIlIll);
            return new String(lllllllllllllllIIllIlIIIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIlllIlIIl) {
            lllllllllllllllIIllIlIIIlllIlIIl.printStackTrace();
            return null;
        }
    }
}

