package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import com.google.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.b  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/b.class */
public class b extends Overlay {
    private static /* synthetic */ int[] llIl;
    private final /* synthetic */ PanelComponent D = new PanelComponent();
    private final /* synthetic */ Clues C;
    private static /* synthetic */ String[] llII;
    private final /* synthetic */ Client B;

    private static void lIIIIIl() {
        llII = new String[llIl[10]];
        llII[llIl[0]] = llllll("6x5dwvBSPR4=", "DBSCr");
        llII[llIl[2]] = lIIIIII("ADcjKzo2ZhMjOypmFS49NjU=", "SFVBH");
        llII[llIl[3]] = llllll("FwcQ4i0Eo4k=", "DNyeY");
        llII[llIl[4]] = llllll("/YmwwbYkXxg=", "oCUiF");
        llII[llIl[5]] = lIIIIII("ERgyOAcxVg==", "BlSLr");
        llII[llIl[6]] = llllll("Le1AgekcXjgmPsCA3OyvJ4zYm3Q2v4QT", "Ostvn");
        llII[llIl[7]] = llllll("OuUwmUn+w6E=", "rkKqY");
    }

    private static void lIIIIlI() {
        llIl = new int[12];
        llIl[0] = ((((93 + 67) - 103) + 87) ^ (((150 + 141) - 160) + 23)) & (((153 ^ 151) ^ (103 ^ 99)) ^ (-" ".length()));
        llIl[1] = (((26 + 32) - 56) + 128) ^ (((8 + 14) - (-59)) + 55);
        llIl[2] = " ".length();
        llIl[3] = "  ".length();
        llIl[4] = "   ".length();
        llIl[5] = 86 ^ 82;
        llIl[6] = (129 ^ 173) ^ (118 ^ 95);
        llIl[7] = (92 ^ 40) ^ (81 ^ 35);
        llIl[8] = (-((-14) & 31855)) & (-641) & 32739;
        llIl[9] = 147 ^ 135;
        llIl[10] = (31 ^ 92) ^ (31 ^ 91);
        llIl[11] = 92 ^ 84;
    }

    private static boolean lIIIIll(int i) {
        return i != 0;
    }

    private static String llllll(String lllllIllIllIIlI, String lllllIllIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllIllIIIl.getBytes(StandardCharsets.UTF_8)), llIl[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIllIllIIll) {
            lllllIllIllIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    private b(Client client, Clues clues) {
        this.B = client;
        this.C = clues;
        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static double a(double d) {
        return Double.parseDouble(new DecimalFormat(llII[llIl[0]]).format(d));
    }

    static {
        lIIIIlI();
        lIIIIIl();
    }

    private static boolean lIIIlII(int i, int i2) {
        return i < i2;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.D.getChildren().clear();
        long currentTimeMillis = System.currentTimeMillis() - Clues.m;
        int i = (int) ((Clues.n * 3600000.0d) / currentTimeMillis);
        this.D.setBorder(new Rectangle(llIl[1], llIl[1], llIl[1], llIl[1]));
        this.D.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llII[llIl[2]]).build());
        "".length();
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[3]]).right("1." + 4599436227440940155).build());
        "".length();
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[4]]).right(k.b(currentTimeMillis)).build());
        "".length();
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[5]]).right(Clues.f0c).build());
        "".length();
        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[6]]).right(k.f(Clues.i) + " (" + a(Clues.i, currentTimeMillis) + "/hr)").build());
        "".length();
        if (lIIIIll(Clues.f ? 1 : 0)) {
            this.D.getChildren().add(LineComponent.builder().left(llII[llIl[7]]).right(k.f(Clues.n) + " (" + k.f(i) + "/hr)").build());
            "".length();
        }
        this.D.setPreferredSize(new Dimension(llIl[8] + llIl[9], llIl[0]));
        return this.D.render(graphics2D);
    }

    private static String lIIIIII(String lllllIlllIIIlll, String lllllIlllIIIllI) {
        String lllllIlllIIIlll2 = new String(Base64.getDecoder().decode(lllllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllIlllIIIllI.toCharArray();
        int lllllIllIlllllI = llIl[0];
        char[] charArray2 = lllllIlllIIIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIl[0];
        while (lIIIlII(i, length)) {
            char lllllIlllIIlIII = charArray2[i];
            sb.append((char) (lllllIlllIIlIII ^ charArray[lllllIllIlllllI % charArray.length]));
            "".length();
            lllllIllIlllllI++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static double a(double d, long j) {
        return a((d * 3600000.0d) / j);
    }
}
