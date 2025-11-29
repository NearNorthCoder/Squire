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
        FightCavesInfoBox.llIIIllIlIII[1] = (0x2F ^ 0x19 ^ (0x94 ^ 0x9E)) & (0x6C ^ 0x4C ^ (0xA2 ^ 0xBE) ^ -" ".length());
        FightCavesInfoBox.llIIIllIlIII[2] = 6 + 167 - 58 + 78;
        FightCavesInfoBox.llIIIllIlIII[3] = 6 + 120 - 79 + 162 ^ 51 + 129 - 162 + 179;
        FightCavesInfoBox.llIIIllIlIII[4] = " ".length();
        FightCavesInfoBox.llIIIllIlIII[5] = "  ".length();
        FightCavesInfoBox.llIIIllIlIII[6] = "   ".length();
        FightCavesInfoBox.llIIIllIlIII[7] = 0x3A ^ 0xB ^ (0x53 ^ 0x66);
        FightCavesInfoBox.llIIIllIlIII[8] = 86 + 176 - 194 + 119 ^ 138 + 22 - 52 + 82;
        FightCavesInfoBox.llIIIllIlIII[9] = 0x34 ^ 0x32;
        FightCavesInfoBox.llIIIllIlIII[10] = 0x65 ^ 0x11 ^ (0x35 ^ 0x46);
        FightCavesInfoBox.llIIIllIlIII[11] = 0x6D ^ 0x65;
        FightCavesInfoBox.llIIIllIlIII[12] = 0x72 ^ 0x7B;
        FightCavesInfoBox.llIIIllIlIII[13] = 0xCF ^ 0xC4;
    }

    private static String llllIlIlllllIl(String lllllllllllllllIlIlIIlIIIIIllIIl, String lllllllllllllllIlIlIIlIIIIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIIIllIII.getBytes(StandardCharsets.UTF_8)), llIIIllIlIII[11]), "DES");
            Cipher lllllllllllllllIlIlIIlIIIIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIIIIIlllIl.init(llIIIllIlIII[5], lllllllllllllllIlIlIIlIIIIIllllI);
            return new String(lllllllllllllllIlIlIIlIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIIIIIlllII) {
            lllllllllllllllIlIlIIlIIIIIlllII.printStackTrace();
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

    private static String llllIlIllllllI(String lllllllllllllllIlIlIIlIIIIlIlIll, String lllllllllllllllIlIlIIlIIIIlIllll) {
        lllllllllllllllIlIlIIlIIIIlIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIIIIlIlllI = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIIIIlIllIl = lllllllllllllllIlIlIIlIIIIlIllll.toCharArray();
        int lllllllllllllllIlIlIIlIIIIlIllII = llIIIllIlIII[1];
        char[] lllllllllllllllIlIlIIlIIIIlIIllI = lllllllllllllllIlIlIIlIIIIlIlIll.toCharArray();
        int lllllllllllllllIlIlIIlIIIIlIIlIl = lllllllllllllllIlIlIIlIIIIlIIllI.length;
        int lllllllllllllllIlIlIIlIIIIlIIlII = llIIIllIlIII[1];
        while (FightCavesInfoBox.llllIllIIIIIll(lllllllllllllllIlIlIIlIIIIlIIlII, lllllllllllllllIlIlIIlIIIIlIIlIl)) {
            char lllllllllllllllIlIlIIlIIIIllIIIl = lllllllllllllllIlIlIIlIIIIlIIllI[lllllllllllllllIlIlIIlIIIIlIIlII];
            lllllllllllllllIlIlIIlIIIIlIlllI.append((char)(lllllllllllllllIlIlIIlIIIIllIIIl ^ lllllllllllllllIlIlIIlIIIIlIllIl[lllllllllllllllIlIlIIlIIIIlIllII % lllllllllllllllIlIlIIlIIIIlIllIl.length]));
            "".length();
            ++lllllllllllllllIlIlIIlIIIIlIllII;
            ++lllllllllllllllIlIlIIlIIIIlIIlII;
            "".length();
            if (-" ".length() <= ((0xCF ^ 0xC7 ^ (0x74 ^ 0x63)) & (147 + 111 - 197 + 158 ^ 41 + 75 - -38 + 42 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIlIIIIlIlllI);
    }

    public Dimension render(Graphics2D graphics2D) {
        FightCavesInfoBox lllllllllllllllIlIlIIlIIIlIlIIll;
        if (FightCavesInfoBox.llllIllIIIIIIl(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long lllllllllllllllIlIlIIlIIIlIlIIIl = System.currentTimeMillis() - SquireFightCavesPlugin.k;
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.setBorder(new Rectangle(llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0]));
        String lllllllllllllllIlIlIIlIIIlIlIIII = llIIIllIIlll[llIIIllIlIII[1]];
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllllllllllllIlIlIIlIIIlIlIIII).build());
        "".length();
        int lllllllllllllllIlIlIIlIIIlIIllll = llIIIllIlIII[2];
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIlIlIIlIIIlIIllll + llIIIllIlIII[3], llIIIllIlIII[1]));
        Duration lllllllllllllllIlIlIIlIIIlIIlllI = Duration.between(lllllllllllllllIlIlIIlIIIlIlIIll.N.getStarted(), Instant.now());
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[4]]).right(Time.format((Duration)lllllllllllllllIlIlIIlIIIlIIlllI)).build());
        "".length();
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[5]]).right(SquireFightCavesPlugin.h).build());
        "".length();
        List list = lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[6]]);
        f cfr_ignored_0 = lllllllllllllllIlIlIIlIIIlIlIIll.O;
        "".length();
        list.add(lineComponentBuilder.right(String.valueOf(f.p())).build());
        "".length();
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[7]]).right(String.valueOf(SquireFightCavesPlugin.j)).build());
        "".length();
        lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[8]]).right(String.valueOf(SquireFightCavesPlugin.i) + " (" + FightCavesInfoBox.a(SquireFightCavesPlugin.i, lllllllllllllllIlIlIIlIIIlIlIIIl) + "/hr)").build());
        "".length();
        if (FightCavesInfoBox.llllIllIIIIIIl(lllllllllllllllIlIlIIlIIIlIlIIll.P.showExtraInfoOnUI() ? 1 : 0)) {
            lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[9]]).right(String.valueOf(f.w())).build());
            "".length();
            lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[10]]).right(String.valueOf(f.u())).build());
            "".length();
            lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[11]]).right(String.valueOf(f.t())).build());
            "".length();
            lllllllllllllllIlIlIIlIIIlIlIIll.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[12]]).right(String.valueOf(f.r())).build());
            "".length();
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

    private static String llllIlIlllllII(String lllllllllllllllIlIlIIlIIIIlllllI, String lllllllllllllllIlIlIIlIIIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIIIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIIIlIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIIIlIIIIlI.init(llIIIllIlIII[5], lllllllllllllllIlIlIIlIIIlIIIIll);
            return new String(lllllllllllllllIlIlIIlIIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIIIlIIIIIl) {
            lllllllllllllllIlIlIIlIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIlllllll() {
        llIIIllIIlll = new String[llIIIllIlIII[13]];
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[1]] = FightCavesInfoBox.llllIlIlllllII("XXvevLWVmqmyuqzZBJjq0W1IDBIFJ8aZ", "ULtvp");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[4]] = FightCavesInfoBox.llllIlIlllllIl("j0JoKqZDXbBQ3lmgDKhnOg==", "EHUhd");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[5]] = FightCavesInfoBox.llllIlIllllllI("OhAUG0JO", "nqgpx");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[6]] = FightCavesInfoBox.llllIlIlllllIl("5b4XTi2E4bSiCMOFvENoqA==", "yrizl");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[7]] = FightCavesInfoBox.llllIlIllllllI("MwY2Li4CBjFxYw==", "rrBKC");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[8]] = FightCavesInfoBox.llllIlIlllllIl("fDagndhUfu8=", "LBXHW");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[9]] = FightCavesInfoBox.llllIlIlllllII("69Y2WBZUen2Zneo8UNO16sc2VjjJ0uFM", "wmPpC");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[10]] = FightCavesInfoBox.llllIlIlllllIl("OKB6no/dq121PLHNDzJLQ2Y37YCA/9gh", "kAIDY");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[11]] = FightCavesInfoBox.llllIlIllllllI("FhELLnoXER8/KHoxDC47ORtCeg==", "ZpxZZ");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[12]] = FightCavesInfoBox.llllIlIllllllI("ATUrLlIAMTQ/Fz90GS4GLDczYFI=", "MTXZr");
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[0]] = FightCavesInfoBox.llllIlIlllllIl("21gO7tGAHqo=", "xBRDD");
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

