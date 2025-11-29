package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderSotf;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0018e;
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:gg/squire/account/GodsApi/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private final /* synthetic */ BuilderConfig ce;
    private static /* synthetic */ String[] llIllIlIll;
    private static /* synthetic */ int[] llIllIllII;
    private final /* synthetic */ AccBuilderSotf cd;

    private static void lIllIlllllllI() {
        llIllIllII = new int[10];
        llIllIllII[0] = 92 ^ 86;
        llIllIllII[1] = ((((23 + 76) - 65) + 100) ^ (((58 + 148) - 136) + 88)) & (((126 ^ 55) ^ (55 ^ 102)) ^ (-" ".length()));
        llIllIllII[2] = " ".length();
        llIllIllII[3] = "  ".length();
        llIllIllII[4] = "   ".length();
        llIllIllII[5] = 8 ^ 12;
        llIllIllII[6] = (((15 + 24) - (-64)) + 56) ^ (((76 + 127) - 177) + 128);
        llIllIllII[7] = (-4826) & 5083;
        llIllIllII[8] = 36 ^ 48;
        llIllIllII[9] = 77 ^ 75;
    }

    static {
        lIllIlllllllI();
        lIllIllllllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderSotf.b;
        this.panelComponent.setBorder(new Rectangle(llIllIllII[0], llIllIllII[0], llIllIllII[0], llIllIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIllIlIll[llIllIllII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[3]]).right(C0018e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[4]]).right(AccBuilderSotf.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[5]]).right(String.valueOf(AccBuilderSotf.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[6]]).right(String.valueOf(AccBuilderSotf.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llIllIllII[7] + llIllIllII[8], llIllIllII[1]));
        return super.render(graphics2D);
    }

    private static String lIllIlllllIll(String llllllllllllllllllIIIIlllIlllIII, String llllllllllllllllllIIIIlllIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIlllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIlllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIlllIlllIIl) {
            llllllllllllllllllIIIIlllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIllllllII(String llllllllllllllllllIIIIllllIIllIl, String llllllllllllllllllIIIIllllIIllII) {
        String llllllllllllllllllIIIIllllIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIllllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIllllIIlIll = new StringBuilder();
        char[] llllllllllllllllllIIIIllllIIlIlI = llllllllllllllllllIIIIllllIIllII.toCharArray();
        int llllllllllllllllllIIIIllllIIlIIl = llIllIllII[1];
        char[] charArray = llllllllllllllllllIIIIllllIIllIl2.toCharArray();
        int llllllllllllllllllIIIIllllIIIIlI = charArray.length;
        int i = llIllIllII[1];
        while (lIllIllllllll(i, llllllllllllllllllIIIIllllIIIIlI)) {
            char llllllllllllllllllIIIIllllIIlllI = charArray[i];
            llllllllllllllllllIIIIllllIIlIll.append((char) (llllllllllllllllllIIIIllllIIlllI ^ llllllllllllllllllIIIIllllIIlIlI[llllllllllllllllllIIIIllllIIlIIl % llllllllllllllllllIIIIllllIIlIlI.length]));
            "".length();
            llllllllllllllllllIIIIllllIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIIllllIIlIll);
    }

    private static void lIllIllllllIl() {
        llIllIlIll = new String[llIllIllII[9]];
        llIllIlIll[llIllIllII[1]] = lIllIlllllIll("WDyOrBhy/v2tWtZia5Qobn4A0qQe7see", "NSqPV");
        llIllIlIll[llIllIllII[2]] = lIllIllllllII("ACwYAh05Jw==", "VIjqt");
        llIllIlIll[llIllIllII[3]] = lIllIlllllIll("bk7MSiZOeoM=", "GeVdE");
        llIllIlIll[llIllIllII[4]] = lIllIllllllII("PSQiADgdag==", "nPCtM");
        llIllIlIll[llIllIllII[5]] = lIllIllllllII("CBAhBC0lEXMnPS4WJ0w=", "KeSvH");
        llIllIlIll[llIllIllII[6]] = lIllIllllllII("PSQ3LxtJBispGAUgMCEMUw==", "iEDDh");
    }

    private static boolean lIllIllllllll(int i, int i2) {
        return i < i2;
    }

    @Inject
    private BuilderInfoBox(AccBuilderSotf accBuilderSotf, BuilderConfig builderConfig) {
        this.cd = accBuilderSotf;
        this.ce = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}
