package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderEasyClues;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0004e;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:gg/squire/account/GodsApi/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private final /* synthetic */ AccBuilderEasyClues bo;
    private final /* synthetic */ BuilderConfig bp;
    private static /* synthetic */ int[] lIlIlIIlI;
    private static /* synthetic */ String[] lIlIlIIIl;

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderEasyClues.b;
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlIIIl[lIlIlIIlI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[4]]).right(AccBuilderEasyClues.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[5]]).right(String.valueOf(AccBuilderEasyClues.f2l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[6]]).right(String.valueOf(AccBuilderEasyClues.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIlIIlI[7] + lIlIlIIlI[8], lIlIlIIlI[1]));
        return super.render(graphics2D);
    }

    private static void lIIIlllIlIIl() {
        lIlIlIIIl = new String[lIlIlIIlI[9]];
        lIlIlIIIl[lIlIlIIlI[1]] = lIIIlllIIllI("t1+7ydd0b0DTZ8mCBNJLb6jH1/6eR8cWh16RwBNSBW0=", "TGvaL");
        lIlIlIIIl[lIlIlIIlI[2]] = lIIIlllIIlll("eAueAY+0tA0=", "pbofN");
        lIlIlIIIl[lIlIlIIlI[3]] = lIIIlllIlIII("Jhs3AhAZCw==", "tnYvy");
        lIlIlIIIl[lIlIlIIlI[4]] = lIIIlllIlIII("HD4RFjY8cA==", "OJpbC");
        lIlIlIIIl[lIlIlIIlI[5]] = lIIIlllIlIII("KgQIGQQHBVo6FAwCDlE=", "iqzka");
        lIlIlIIIl[lIlIlIIlI[6]] = lIIIlllIlIII("LSMxARFZAS0HEhUnNg8GQw==", "yBBjb");
    }

    private static String lIIIlllIlIII(String lllIlIIIllIIII, String lllIlIIIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIlIlllI = new StringBuilder();
        char[] lllIlIIIlIllIl = lllIlIIIlIllll.toCharArray();
        int lllIlIIIlIllII = lIlIlIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllIlIIIlIIlII = lIlIlIIlI[1];
        while (lIIIlllIlIll(lllIlIIIlIIlII, length)) {
            lllIlIIIlIlllI.append((char) (charArray[lllIlIIIlIIlII] ^ lllIlIIIlIllIl[lllIlIIIlIllII % lllIlIIIlIllIl.length]));
            "".length();
            lllIlIIIlIllII++;
            lllIlIIIlIIlII++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllIlIIIlIlllI);
    }

    private static String lIIIlllIIllI(String lllIlIIlIIIIII, String lllIlIIIllllll) {
        try {
            SecretKeySpec lllIlIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIllllll.getBytes(StandardCharsets.UTF_8)), lIlIlIIlI[10]), "DES");
            Cipher lllIlIIlIIIIlI = Cipher.getInstance("DES");
            lllIlIIlIIIIlI.init(lIlIlIIlI[3], lllIlIIlIIIIll);
            return new String(lllIlIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllIlIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIlIIIIIl) {
            lllIlIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderEasyClues accBuilderEasyClues, BuilderConfig builderConfig) {
        this.bo = accBuilderEasyClues;
        this.bp = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        lIIIlllIlIlI();
        lIIIlllIlIIl();
    }

    private static void lIIIlllIlIlI() {
        lIlIlIIlI = new int[11];
        lIlIlIIlI[0] = 85 ^ 95;
        lIlIlIIlI[1] = ((66 ^ 115) ^ (20 ^ 18)) & (((((174 + 104) - 140) + 38) ^ (((42 + 97) - 97) + 93)) ^ (-" ".length()));
        lIlIlIIlI[2] = " ".length();
        lIlIlIIlI[3] = "  ".length();
        lIlIlIIlI[4] = "   ".length();
        lIlIlIIlI[5] = (((69 + 37) - (-59)) + 5) ^ (((5 + 55) - (-79)) + 35);
        lIlIlIIlI[6] = 171 ^ 174;
        lIlIlIIlI[7] = (-754) & 1011;
        lIlIlIIlI[8] = (63 ^ 89) ^ (83 ^ 33);
        lIlIlIIlI[9] = (192 ^ 170) ^ (203 ^ 167);
        lIlIlIIlI[10] = (((8 + 123) - 42) + 79) ^ (((128 + 142) - 199) + 89);
    }

    private static String lIIIlllIIlll(String lllIlIIIIllIll, String lllIlIIIIllIlI) {
        try {
            SecretKeySpec lllIlIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlI[3], lllIlIIIIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIIIlllII) {
            lllIlIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlIll(int i, int i2) {
        return i < i2;
    }
}
