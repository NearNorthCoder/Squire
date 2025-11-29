package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderShamans;
import gg.squire.account.BuilderConfig;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0004e;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:gg/squire/account/GodsApi/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] lIllIIlIll;
    private final /* synthetic */ AccBuilderShamans bX;
    private final /* synthetic */ BuilderConfig bY;
    private static /* synthetic */ String[] lIllIIlIII;

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderShamans.b;
        this.panelComponent.setBorder(new Rectangle(lIllIIlIll[0], lIllIIlIll[0], lIllIIlIll[0], lIllIIlIll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIlIII[lIllIIlIll[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[4]]).right(AccBuilderShamans.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[5]]).right(String.valueOf(AccBuilderShamans.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[6]]).right(String.valueOf(AccBuilderShamans.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIllIIlIll[7] + lIllIIlIll[8], lIllIIlIll[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlllIIlll(String lllllllllllllllllllIIlIIIIIIIIII, String lllllllllllllllllllIIIllllllllll) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIIIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIll[3], lllllllllllllllllllIIlIIIIIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIIIIIIIIIl) {
            lllllllllllllllllllIIlIIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIlllIlllI() {
        lIllIIlIII = new String[lIllIIlIll[9]];
        lIllIIlIII[lIllIIlIll[1]] = lIIlIlllIIlll("ByA4/NfFT5J1t9/S5BppA/dTo3HTGqLK", "SuPTR");
        lIllIIlIII[lIllIIlIll[2]] = lIIlIlllIIlll("81xie//v3DM=", "SlrZL");
        lIllIIlIII[lIllIIlIll[3]] = lIIlIlllIlIII("BAI/Aws7Eg==", "VwQwb");
        lIllIIlIII[lIllIIlIll[4]] = lIIlIlllIlIIl("785NY2+RMGI=", "qTngg");
        lIllIIlIII[lIllIIlIll[5]] = lIIlIlllIIlll("b3JAHqgA4HwK16BWKc6f0w==", "euPxL");
        lIllIIlIII[lIllIIlIll[6]] = lIIlIlllIIlll("UhWz8RwQSBqC2DMC5Jx89AgaKrx4eQnv", "FlvtB");
    }

    @Inject
    private BuilderInfoBox(AccBuilderShamans accBuilderShamans, BuilderConfig builderConfig) {
        this.bX = accBuilderShamans;
        this.bY = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        lIIlIlllIllll();
        lIIlIlllIlllI();
    }

    private static void lIIlIlllIllll() {
        lIllIIlIll = new int[11];
        lIllIIlIll[0] = 105 ^ 99;
        lIllIIlIll[1] = (164 ^ 147) & ((73 ^ 126) ^ (-1));
        lIllIIlIll[2] = " ".length();
        lIllIIlIll[3] = "  ".length();
        lIllIIlIll[4] = "   ".length();
        lIllIIlIll[5] = 139 ^ 143;
        lIllIIlIll[6] = 14 ^ 11;
        lIllIIlIll[7] = (-((-8211) & 30455)) & (-10) & 22511;
        lIllIIlIll[8] = 186 ^ 174;
        lIllIIlIll[9] = (245 ^ 198) ^ (131 ^ 182);
        lIllIIlIll[10] = 42 ^ 34;
    }

    private static String lIIlIlllIlIIl(String lllllllllllllllllllIIlIIIIlIIlIl, String lllllllllllllllllllIIlIIIIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIIlIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIlIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIIIIlIIllI) {
            lllllllllllllllllllIIlIIIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlllIlIII(String lllllllllllllllllllIIlIIIIIlIlIl, String lllllllllllllllllllIIlIIIIIlIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIlIIIIIlIIll = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIlIIIIIlIlII.toCharArray();
        int lllllllllllllllllllIIlIIIIIlIIIl = lIllIIlIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlIll[1];
        while (lIIlIllllIIII(i, length)) {
            lllllllllllllllllllIIlIIIIIlIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIIlIIIIIlIIIl % charArray.length]));
            "".length();
            lllllllllllllllllllIIlIIIIIlIIIl++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIIlIIIIIlIIll);
    }
}
