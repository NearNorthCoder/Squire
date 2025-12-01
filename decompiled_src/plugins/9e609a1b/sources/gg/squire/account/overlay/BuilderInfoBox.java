package gg.squire.account.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderRat;
import gg.squire.account.BuilderConfig;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0004e;
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
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:gg/squire/account/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIIIlllIIIlII;
    private static /* synthetic */ int[] lIIIlllIIIllI;
    private final /* synthetic */ BuilderConfig bu;
    private final /* synthetic */ AccBuilderRat bt;

    private static void lIlIIIlllIlIIll() {
        lIIIlllIIIlII = new String[lIIIlllIIIllI[9]];
        lIIIlllIIIlII[lIIIlllIIIllI[1]] = lIlIIIlllIlIIIl("KzkHMAMdaCA4BVgDGzcWWAoHMB0cLQA=", "xHrYq");
        lIIIlllIIIlII[lIIIlllIIIllI[2]] = lIlIIIlllIlIIIl("PS8ZBgcEJA==", "kJkun");
        lIIIlllIIIlII[lIIIlllIIIllI[3]] = lIlIIIlllIlIIIl("CwEtMD80EQ==", "YtCDV");
        lIIIlllIIIlII[lIIIlllIIIllI[4]] = lIlIIIlllIlIIIl("Ii0MBjACYw==", "qYmrE");
        lIIIlllIIIlII[lIIIlllIIIllI[5]] = lIlIIIlllIlIIIl("BxY3OiMqF2UZMyEQMXI=", "DcEHF");
        lIIIlllIIIlII[lIIIlllIIIllI[6]] = lIlIIIlllIlIIlI("gJqQg1FLZhOB0CIhSzFJq6MrcIRwN4MA", "oDeFd");
    }

    private static void lIlIIIlllIlllll() {
        lIIIlllIIIllI = new int[10];
        lIIIlllIIIllI[0] = (80 ^ 64) ^ (45 ^ 55);
        lIIIlllIIIllI[1] = (115 ^ 36) & ((40 ^ 127) ^ (-1));
        lIIIlllIIIllI[2] = " ".length();
        lIIIlllIIIllI[3] = "  ".length();
        lIIIlllIIIllI[4] = "   ".length();
        lIIIlllIIIllI[5] = 17 ^ 21;
        lIIIlllIIIllI[6] = (32 ^ 59) ^ (25 ^ 7);
        lIIIlllIIIllI[7] = (-654) & 911;
        lIIIlllIIIllI[8] = (((153 + 13) - 51) + 67) ^ (((150 + 152) - 150) + 10);
        lIIIlllIIIllI[9] = (((119 + 140) - 83) + 0) ^ (((57 + 111) - 126) + 140);
    }

    static {
        lIlIIIlllIlllll();
        lIlIIIlllIlIIll();
    }

    private static String lIlIIIlllIlIIIl(String lllllllllllllllIIIIIllIllIllIIII, String lllllllllllllllIIIIIllIllIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIllIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIllIlIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIllIllIlIllll.toCharArray();
        int lllllllllllllllIIIIIllIllIlIlIlI = lIIIlllIIIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllIIIllI[1];
        while (lIlIIIllllIIIII(i2, length)) {
            char lllllllllllllllIIIIIllIllIllIIlI = charArray2[i2];
            lllllllllllllllIIIIIllIllIlIlllI.append((char) (lllllllllllllllIIIIIllIllIllIIlI ^ charArray[lllllllllllllllIIIIIllIllIlIlIlI % charArray.length]));
            "".length();
            lllllllllllllllIIIIIllIllIlIlIlI++;
            i2++;
            "".length();
            if ((-(194 ^ 198)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIllIllIlIlllI);
    }

    private static String lIlIIIlllIlIIlI(String lllllllllllllllIIIIIllIllIIlIIll, String lllllllllllllllIIIIIllIllIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIIIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIllIIlIlIl) {
            lllllllllllllllIIIIIllIllIIlIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderRat accBuilderRat, BuilderConfig builderConfig) {
        this.bt = accBuilderRat;
        this.bu = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIIIllllIIIII(int i2, int i3) {
        return i2 < i3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderRat.b;
        this.panelComponent.setBorder(new Rectangle(lIIIlllIIIllI[0], lIIIlllIIIllI[0], lIIIlllIIIllI[0], lIIIlllIIIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlllIIIlII[lIIIlllIIIllI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[2]]).right("1." + 4594212051873190380).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[4]]).right(AccBuilderRat.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[5]]).right(String.valueOf(AccBuilderRat.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[6]]).right(String.valueOf(AccBuilderRat.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIIlllIIIllI[7] + lIIIlllIIIllI[8], lIIIlllIIIllI[1]));
        return super.render(graphics2D);
    }
}
