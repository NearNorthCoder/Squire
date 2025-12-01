package gg.squire.account.overlay;

import com.google.inject.Inject;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0004e;
import gg.squire.account.AccBuilderTempleTrek;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:gg/squire/account/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lllllIIIIl;
    private final /* synthetic */ AccBuilderTempleTrek bn;
    private static /* synthetic */ int[] lllllIIIlI;
    private final /* synthetic */ BuilderConfig bo;

    private static String llIlIIlIIIlIl(String lllllllllllllllllIlIIlllIllIIlIl, String lllllllllllllllllIlIIlllIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlllIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIlllIllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIlllIllIIlll.init(lllllIIIlI[3], secretKeySpec);
            return new String(lllllllllllllllllIlIIlllIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlllIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlllIllIIllI) {
            lllllllllllllllllIlIIlllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIIIlII(String lllllllllllllllllIlIIlllIlIllIII, String lllllllllllllllllIlIIlllIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lllllIIIlI[10]), "DES");
            Cipher lllllllllllllllllIlIIlllIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIlllIlIllIlI.init(lllllIIIlI[3], secretKeySpec);
            return new String(lllllllllllllllllIlIIlllIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlllIlIllIIl) {
            lllllllllllllllllIlIIlllIlIllIIl.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIlIIIlll();
        llIlIIlIIIllI();
    }

    private static String llIlIIlIIIIll(String lllllllllllllllllIlIIlllIllllIlI, String lllllllllllllllllIlIIlllIllllIIl) {
        String lllllllllllllllllIlIIlllIllllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIlllIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIlllIllllIII = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIlllIllllIIl.toCharArray();
        int lllllllllllllllllIlIIlllIlllIllI = lllllIIIlI[1];
        char[] charArray2 = lllllllllllllllllIlIIlllIllllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lllllIIIlI[1];
        while (llIlIIlIIlIII(i, length)) {
            lllllllllllllllllIlIIlllIllllIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlIIlllIlllIllI % charArray.length]));
            "".length();
            lllllllllllllllllIlIIlllIlllIllI++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIlllIllllIII);
    }

    private static boolean llIlIIlIIlIII(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIlIIIlll() {
        lllllIIIlI = new int[11];
        lllllIIIlI[0] = "  ".length() ^ (156 ^ 148);
        lllllIIIlI[1] = ((((124 + 51) - 117) + 91) ^ (((120 + 1) - 12) + 28)) & (((103 ^ 123) ^ ((95 ^ 118) & ((150 ^ 191) ^ (-1)))) ^ (-" ".length()));
        lllllIIIlI[2] = " ".length();
        lllllIIIlI[3] = "  ".length();
        lllllIIIlI[4] = "   ".length();
        lllllIIIlI[5] = (13 ^ 60) ^ (40 ^ 29);
        lllllIIIlI[6] = 142 ^ 139;
        lllllIIIlI[7] = (-2674) & 2931;
        lllllIIIlI[8] = (241 ^ 129) ^ (98 ^ 6);
        lllllIIIlI[9] = (98 ^ 60) ^ (43 ^ 115);
        lllllIIIlI[10] = 42 ^ 34;
    }

    @Inject
    private BuilderInfoBox(AccBuilderTempleTrek accBuilderTempleTrek, BuilderConfig builderConfig) {
        this.bn = accBuilderTempleTrek;
        this.bo = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderTempleTrek.b;
        this.panelComponent.setBorder(new Rectangle(lllllIIIlI[0], lllllIIIlI[0], lllllIIIlI[0], lllllIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllIIIIl[lllllIIIlI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[4]]).right(AccBuilderTempleTrek.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[5]]).right(String.valueOf(AccBuilderTempleTrek.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[6]]).right(String.valueOf(AccBuilderTempleTrek.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllllIIIlI[7] + lllllIIIlI[8], lllllIIIlI[1]));
        return super.render(graphics2D);
    }

    private static void llIlIIlIIIllI() {
        lllllIIIIl = new String[lllllIIIlI[9]];
        lllllIIIIl[lllllIIIlI[1]] = llIlIIlIIIIll("FzQnKjAhZQYmLzQpNxcwIS5yATctKTYmMA==", "DERCB");
        lllllIIIIl[lllllIIIlI[2]] = llIlIIlIIIlII("Sn/kDkYAZXk=", "Lmqqk");
        lllllIIIIl[lllllIIIlI[3]] = llIlIIlIIIlIl("3MjfbFXsB+I=", "PoEqH");
        lllllIIIIl[lllllIIIlI[4]] = llIlIIlIIIlII("lIj0HupSuSE=", "lNEnj");
        lllllIIIIl[lllllIIIlI[5]] = llIlIIlIIIIll("AhQiFBcvFXA3ByQSJFw=", "AaPfr");
        lllllIIIIl[lllllIIIlI[6]] = llIlIIlIIIlII("IdkuCb8r7trwcXtqLf959LhUUSIVv+vn", "nxyFR");
    }
}
