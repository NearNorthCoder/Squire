package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.f;
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
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:gg/squire/minigames/overlay/FightCavesInfoBox.class */
public class FightCavesInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] llIIIllIlIII;
    private final /* synthetic */ f O;
    private final /* synthetic */ SquireFightCavesPlugin N;
    private final /* synthetic */ SquireFightCavesConfig P;
    private final /* synthetic */ TaskManager Q;
    private static /* synthetic */ String[] llIIIllIIlll;

    private static void llllIllIIIIIII() {
        llIIIllIlIII = new int[14];
        llIIIllIlIII[0] = 191 ^ 181;
        llIIIllIlIII[1] = ((47 ^ 25) ^ (148 ^ 158)) & (((108 ^ 76) ^ (162 ^ 190)) ^ (-" ".length()));
        llIIIllIlIII[2] = ((6 + 167) - 58) + 78;
        llIIIllIlIII[3] = (((6 + 120) - 79) + 162) ^ (((51 + 129) - 162) + 179);
        llIIIllIlIII[4] = " ".length();
        llIIIllIlIII[5] = "  ".length();
        llIIIllIlIII[6] = "   ".length();
        llIIIllIlIII[7] = (58 ^ 11) ^ (83 ^ 102);
        llIIIllIlIII[8] = (((86 + 176) - 194) + 119) ^ (((138 + 22) - 52) + 82);
        llIIIllIlIII[9] = 52 ^ 50;
        llIIIllIlIII[10] = (101 ^ 17) ^ (53 ^ 70);
        llIIIllIlIII[11] = 109 ^ 101;
        llIIIllIlIII[12] = 114 ^ 123;
        llIIIllIlIII[13] = 207 ^ 196;
    }

    private static String llllIlIlllllIl(String lllllllllllllllIlIlIIlIIIIIllIll, String lllllllllllllllIlIlIIlIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), llIIIllIlIII[11]), "DES");
            Cipher lllllllllllllllIlIlIIlIIIIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIIIIIlllIl.init(llIIIllIlIII[5], lllllllllllllllIlIlIIlIIIIIllllI);
            return new String(lllllllllllllllIlIlIIlIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIIIIIlllII) {
            lllllllllllllllIlIlIIlIIIIIlllII.printStackTrace();
            return null;
        }
    }

    public long j(int i) {
        Duration between = Duration.between(this.N.getStarted(), Instant.now());
        if (llllIllIIIIIlI(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean llllIllIIIIIll(int i, int i2) {
        return i < i2;
    }

    private static String llllIlIllllllI(String lllllllllllllllIlIlIIlIIIIllIIII, String lllllllllllllllIlIlIIlIIIIlIllll) {
        String lllllllllllllllIlIlIIlIIIIllIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIIIIlIlllI = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIIIIlIllIl = lllllllllllllllIlIlIIlIIIIlIllll.toCharArray();
        int lllllllllllllllIlIlIIlIIIIlIllII = llIIIllIlIII[1];
        char[] charArray = lllllllllllllllIlIlIIlIIIIllIIII2.toCharArray();
        int length = charArray.length;
        int i = llIIIllIlIII[1];
        while (llllIllIIIIIll(i, length)) {
            char lllllllllllllllIlIlIIlIIIIllIIIl = charArray[i];
            lllllllllllllllIlIlIIlIIIIlIlllI.append((char) (lllllllllllllllIlIlIIlIIIIllIIIl ^ lllllllllllllllIlIlIIlIIIIlIllIl[lllllllllllllllIlIlIIlIIIIlIllII % lllllllllllllllIlIlIIlIIIIlIllIl.length]));
            "".length();
            lllllllllllllllIlIlIIlIIIIlIllII++;
            i++;
            "".length();
            if ((-" ".length()) > (((207 ^ 199) ^ (116 ^ 99)) & (((((147 + 111) - 197) + 158) ^ (((41 + 75) - (-38)) + 42)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIlIIIIlIlllI);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llllIllIIIIIIl(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - SquireFightCavesPlugin.k;
        this.panelComponent.setBorder(new Rectangle(llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0]));
        String lllllllllllllllIlIlIIlIIIlIlIIII = llIIIllIIlll[llIIIllIlIII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllllllllllllIlIlIIlIIIlIlIIII).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llIIIllIlIII[2] + llIIIllIlIII[3], llIIIllIlIII[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[4]]).right(Time.format(Duration.between(this.N.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[5]]).right(SquireFightCavesPlugin.f0h).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[6]]);
        f fVar = this.O;
        "".length();
        children.add(left.right(String.valueOf(f.p())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[7]]).right(String.valueOf(SquireFightCavesPlugin.j)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[8]]).right(String.valueOf(SquireFightCavesPlugin.i) + " (" + a(SquireFightCavesPlugin.i, currentTimeMillis) + "/hr)").build());
        "".length();
        if (llllIllIIIIIIl(this.P.showExtraInfoOnUI() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[9]]).right(String.valueOf(f.w())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[10]]).right(String.valueOf(f.u())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[11]]).right(String.valueOf(f.t())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[12]]).right(String.valueOf(f.r())).build());
            "".length();
        }
        return super.render(graphics2D);
    }

    static {
        llllIllIIIIIII();
        llllIlIlllllll();
    }

    @Inject
    public FightCavesInfoBox(SquireFightCavesPlugin squireFightCavesPlugin, f fVar, SquireFightCavesConfig squireFightCavesConfig) {
        this.N = squireFightCavesPlugin;
        this.Q = squireFightCavesPlugin.getManager();
        this.O = fVar;
        this.P = squireFightCavesConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPriority(OverlayPriority.MED);
    }

    private static boolean llllIllIIIIIlI(int i) {
        return i == 0;
    }

    private static String llllIlIlllllII(String lllllllllllllllIlIlIIlIIIlIIIIII, String lllllllllllllllIlIlIIlIIIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIIIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllIlIII[5], lllllllllllllllIlIlIIlIIIlIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIIIlIIIIIl) {
            lllllllllllllllIlIlIIlIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIlllllll() {
        llIIIllIIlll = new String[llIIIllIlIII[13]];
        llIIIllIIlll[llIIIllIlIII[1]] = llllIlIlllllII("XXvevLWVmqmyuqzZBJjq0W1IDBIFJ8aZ", "ULtvp");
        llIIIllIIlll[llIIIllIlIII[4]] = llllIlIlllllIl("j0JoKqZDXbBQ3lmgDKhnOg==", "EHUhd");
        llIIIllIIlll[llIIIllIlIII[5]] = llllIlIllllllI("OhAUG0JO", "nqgpx");
        llIIIllIIlll[llIIIllIlIII[6]] = llllIlIlllllIl("5b4XTi2E4bSiCMOFvENoqA==", "yrizl");
        llIIIllIIlll[llIIIllIlIII[7]] = llllIlIllllllI("MwY2Li4CBjFxYw==", "rrBKC");
        llIIIllIIlll[llIIIllIlIII[8]] = llllIlIlllllIl("fDagndhUfu8=", "LBXHW");
        llIIIllIIlll[llIIIllIlIII[9]] = llllIlIlllllII("69Y2WBZUen2Zneo8UNO16sc2VjjJ0uFM", "wmPpC");
        llIIIllIIlll[llIIIllIlIII[10]] = llllIlIlllllIl("OKB6no/dq121PLHNDzJLQ2Y37YCA/9gh", "kAIDY");
        llIIIllIIlll[llIIIllIlIII[11]] = llllIlIllllllI("FhELLnoXER8/KHoxDC47ORtCeg==", "ZpxZZ");
        llIIIllIIlll[llIIIllIlIII[12]] = llllIlIllllllI("ATUrLlIAMTQ/Fz90GS4GLDczYFI=", "MTXZr");
        llIIIllIIlll[llIIIllIlIII[0]] = llllIlIlllllIl("21gO7tGAHqo=", "xBRDD");
    }

    private static double a(double d) {
        return Double.parseDouble(new DecimalFormat(llIIIllIIlll[llIIIllIlIII[0]]).format(d));
    }

    private static boolean llllIllIIIIIIl(int i) {
        return i != 0;
    }

    public static double a(double d, long j) {
        return a((d * 3600000.0d) / j);
    }
}
