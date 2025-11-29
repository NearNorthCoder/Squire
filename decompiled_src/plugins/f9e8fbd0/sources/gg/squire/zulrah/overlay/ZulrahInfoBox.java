package gg.squire.zulrah.overlay;

import a.u.i.p000.l.r.h.z.s.r.u.q.e.C0021v;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.util.Text;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
@Singleton
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:gg/squire/zulrah/overlay/ZulrahInfoBox.class */
public class ZulrahInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] lIllIlIlIIlll;
    private static /* synthetic */ String[] lIllIlIlIIlII;
    private final /* synthetic */ C0021v O;
    private final /* synthetic */ SquireZulrah N;

    private static String llIIIllllllIlll(String llllllllllllllIllIIIllIlllIlIllI, String llllllllllllllIllIIIllIlllIlIlIl) {
        String llllllllllllllIllIIIllIlllIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIlllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIlllIlIlII = new StringBuilder();
        char[] llllllllllllllIllIIIllIlllIlIIll = llllllllllllllIllIIIllIlllIlIlIl.toCharArray();
        int llllllllllllllIllIIIllIlllIlIIlI = lIllIlIlIIlll[2];
        char[] charArray = llllllllllllllIllIIIllIlllIlIllI2.toCharArray();
        int llllllllllllllIllIIIllIlllIIlIll = charArray.length;
        int i = lIllIlIlIIlll[2];
        while (llIIlIIIIIIIlIl(i, llllllllllllllIllIIIllIlllIIlIll)) {
            char llllllllllllllIllIIIllIlllIlIlll = charArray[i];
            llllllllllllllIllIIIllIlllIlIlII.append((char) (llllllllllllllIllIIIllIlllIlIlll ^ llllllllllllllIllIIIllIlllIlIIll[llllllllllllllIllIIIllIlllIlIIlI % llllllllllllllIllIIIllIlllIlIIll.length]));
            "".length();
            llllllllllllllIllIIIllIlllIlIIlI++;
            i++;
            "".length();
            if ((((((41 + 122) - 147) + 163) ^ (((131 + 112) - 198) + 87)) & (((23 ^ 105) ^ (218 ^ 147)) ^ (-" ".length()))) > (((32 ^ 101) ^ (2 ^ 82)) & (((((165 + 171) - 193) + 45) ^ (((158 + 14) - 76) + 73)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIllIlllIlIlII);
    }

    private static void llIIlIIIIIIIIII() {
        lIllIlIlIIlII = new String[lIllIlIlIIlll[13]];
        lIllIlIlIIlII[lIllIlIlIIlll[2]] = llIIIllllllIlll("EiYZBxckdzYbCTM2BA==", "AWlne");
        lIllIlIlIIlII[lIllIlIlIIlll[3]] = llIIIlllllllIII("xThJMah4Mb4=", "tNUAI");
        lIllIlIlIIlII[lIllIlIlIIlll[4]] = llIIIlllllllIll("hn/D2br0ZTs=", "jfMuK");
        lIllIlIlIIlII[lIllIlIlIIlll[5]] = llIIIllllllIlll("OS8dDTMGPw==", "kZsyZ");
        lIllIlIlIIlII[lIllIlIlIIlll[6]] = llIIIlllllllIll("aPyRacNf50wdIWYw19KyaA==", "rRijV");
        lIllIlIlIIlII[lIllIlIlIIlll[7]] = llIIIlllllllIll("Vuv9tn39RuU=", "sGkLA");
        lIllIlIlIIlII[lIllIlIlIIlll[8]] = llIIIlllllllIll("psSXkWX9DSg9XYFGCM3wvg==", "gOmjj");
        lIllIlIlIIlII[lIllIlIlIIlll[9]] = llIIIlllllllIII("hdIlRcCvdY4=", "Dwdtb");
        lIllIlIlIIlII[lIllIlIlIIlll[10]] = llIIIlllllllIII("sR6o20FhqJ+RAqkxGhUdaQ==", "CkooY");
        lIllIlIlIIlII[lIllIlIlIIlll[11]] = llIIIlllllllIII("6RE5tL4KaGqPQVScHsEXpA==", "QwGJk");
        lIllIlIlIIlII[lIllIlIlIIlll[0]] = llIIIllllllIlll("NDkIEBUGbDYNAA84DQ0a", "nLdbt");
        lIllIlIlIIlII[lIllIlIlIIlll[12]] = llIIIllllllIlll("MxIFOiABRzo8OAUC", "igiHA");
    }

    static {
        llIIlIIIIIIIIIl();
        llIIlIIIIIIIIII();
    }

    private static boolean llIIlIIIIIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIIIIIIIlI(int i) {
        return i != 0;
    }

    private static void llIIlIIIIIIIIIl() {
        lIllIlIlIIlll = new int[14];
        lIllIlIlIIlll[0] = 105 ^ 99;
        lIllIlIlIIlll[1] = (-31401) & 31658;
        lIllIlIlIIlll[2] = (202 ^ 197) & ((52 ^ 59) ^ (-1));
        lIllIlIlIIlll[3] = " ".length();
        lIllIlIlIIlll[4] = "  ".length();
        lIllIlIlIIlll[5] = "   ".length();
        lIllIlIlIIlll[6] = 151 ^ 147;
        lIllIlIlIIlll[7] = 6 ^ 3;
        lIllIlIlIIlll[8] = 113 ^ 119;
        lIllIlIlIIlll[9] = (((28 + 121) - 56) + 40) ^ (((37 + 60) - 24) + 57);
        lIllIlIlIIlll[10] = 144 ^ 152;
        lIllIlIlIIlll[11] = 110 ^ 103;
        lIllIlIlIIlll[12] = (((167 + 129) - 186) + 95) ^ (((51 + 45) - (-98)) + 4);
        lIllIlIlIIlll[13] = 52 ^ 56;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIlIIIIIIIIlI(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0]));
        this.panelComponent.setPreferredSize(new Dimension(lIllIlIlIIlll[1], lIllIlIlIIlll[2]));
        String llllllllllllllIllIIIlllIIIIIIlII = lIllIlIlIIlII[lIllIlIlIIlll[2]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllllllllllIllIIIlllIIIIIIlII).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[3]]).right(lIllIlIlIIlII[lIllIlIlIIlll[4]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[5]]).right(Time.format(Duration.between(this.N.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[6]]).right(this.N.getManager().getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[7]]).right(String.valueOf(this.N.d())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[8]]).right(String.valueOf(this.N.e())).build());
        "".length();
        int i = (int) i(this.O.Y());
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[9]]);
        String str = lIllIlIlIIlII[lIllIlIlIIlll[10]];
        Object[] objArr = new Object[lIllIlIlIIlll[4]];
        objArr[lIllIlIlIIlll[2]] = Integer.valueOf(this.O.Y());
        objArr[lIllIlIlIIlll[3]] = Integer.valueOf(i);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        NPC W = this.O.W();
        if (llIIlIIIIIIIIll(W)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[11]]).right(String.valueOf((int) (W.getHealthRatio() * 4.25d))).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[0]]).right(Text.titleCase(this.O.V().C())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[12]]).right(Text.titleCase(this.O.V().C().w())).build());
            "".length();
        }
        return super.render(graphics2D);
    }

    public long i(int i) {
        Duration between = Duration.between(this.N.getStarted(), Instant.now());
        if (llIIlIIIIIIIlII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static String llIIIlllllllIII(String llllllllllllllIllIIIllIlllllIIll, String llllllllllllllIllIIIllIlllllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIlllllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIlllllIlIl.init(lIllIlIlIIlll[4], secretKeySpec);
            return new String(llllllllllllllIllIIIllIlllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIlllllIlII) {
            llllllllllllllIllIIIllIlllllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIIIIlII(int i) {
        return i == 0;
    }

    private static boolean llIIlIIIIIIIIll(Object obj) {
        return obj != null;
    }

    @Inject
    public ZulrahInfoBox(SquireZulrah squireZulrah, C0021v c0021v) {
        this.N = squireZulrah;
        this.O = c0021v;
        setPosition(OverlayPosition.TOP_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    private static String llIIIlllllllIll(String llllllllllllllIllIIIllIllllIIllI, String llllllllllllllIllIIIllIllllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIllllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIllllIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIlll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIlIIlll[4], llllllllllllllIllIIIllIllllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIllllIIlll) {
            llllllllllllllIllIIIllIllllIIlll.printStackTrace();
            return null;
        }
    }
}
