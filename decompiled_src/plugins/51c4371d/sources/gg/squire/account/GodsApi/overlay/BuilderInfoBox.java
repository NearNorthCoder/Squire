package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderBarrows;
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
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0004e;
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:gg/squire/account/GodsApi/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIllllll;
    private final /* synthetic */ BuilderConfig bv;
    private static /* synthetic */ int[] llIIIIIl;
    private final /* synthetic */ AccBuilderBarrows bu;

    private static boolean lIlIIIlIIll(int i, int i2) {
        return i < i2;
    }

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderBarrows.b;
        this.panelComponent.setBorder(new Rectangle(llIIIIIl[0], llIIIIIl[0], llIIIIIl[0], llIIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllllll[llIIIIIl[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[4]]).right(AccBuilderBarrows.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[5]]).right(String.valueOf(AccBuilderBarrows.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[6]]).right(String.valueOf(AccBuilderBarrows.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llIIIIIl[7] + llIIIIIl[8], llIIIIIl[1]));
        return super.render(graphics2D);
    }

    private static String lIlIIIIIlIl(String lIlIllIlIllIIIl, String lIlIllIlIllIIII) {
        try {
            SecretKeySpec lIlIllIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIllIIll = Cipher.getInstance("Blowfish");
            lIlIllIlIllIIll.init(llIIIIIl[3], lIlIllIlIllIlII);
            return new String(lIlIllIlIllIIll.doFinal(Base64.getDecoder().decode(lIlIllIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlIllIIlI) {
            lIlIllIlIllIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderBarrows accBuilderBarrows, BuilderConfig builderConfig) {
        this.bu = accBuilderBarrows;
        this.bv = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        lIlIIIlIIlI();
        lIlIIIIIlll();
    }

    private static void lIlIIIIIlll() {
        lIllllll = new String[llIIIIIl[9]];
        lIllllll[llIIIIIl[1]] = lIlIIIIIlII("PyYAHCYJdzcUJh44AgZ0LiIcGTAJJQ==", "lWuuT");
        lIllllll[llIIIIIl[2]] = lIlIIIIIlIl("DF2UMHclik8=", "ReNnZ");
        lIllllll[llIIIIIl[3]] = lIlIIIIIlIl("b+Y+OHSwHkk=", "vEXrC");
        lIllllll[llIIIIIl[4]] = lIlIIIIIlIl("uEvHQNyTBCU=", "TBueY");
        lIllllll[llIIIIIl[5]] = lIlIIIIIlIl("pYlL1pr/g2lRUK1/VNOfnw==", "SfxkZ");
        lIllllll[llIIIIIl[6]] = lIlIIIIIlII("GDAbBRFsEgcDEiA0HAsGdg==", "LQhnb");
    }

    private static String lIlIIIIIlII(String lIlIllIllIIIllI, String lIlIllIllIIIlIl) {
        String lIlIllIllIIIllI2 = new String(Base64.getDecoder().decode(lIlIllIllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIllIIIlII = new StringBuilder();
        char[] lIlIllIllIIIIll = lIlIllIllIIIlIl.toCharArray();
        int lIlIllIlIllllIl = llIIIIIl[1];
        char[] charArray = lIlIllIllIIIllI2.toCharArray();
        int length = charArray.length;
        int i = llIIIIIl[1];
        while (lIlIIIlIIll(i, length)) {
            lIlIllIllIIIlII.append((char) (charArray[i] ^ lIlIllIllIIIIll[lIlIllIlIllllIl % lIlIllIllIIIIll.length]));
            "".length();
            lIlIllIlIllllIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lIlIllIllIIIlII);
    }

    private static void lIlIIIlIIlI() {
        llIIIIIl = new int[10];
        llIIIIIl[0] = 57 ^ 51;
        llIIIIIl[1] = ((200 ^ 193) ^ (48 ^ 61)) & (((183 ^ 141) ^ (80 ^ 110)) ^ (-" ".length()));
        llIIIIIl[2] = " ".length();
        llIIIIIl[3] = "  ".length();
        llIIIIIl[4] = "   ".length();
        llIIIIIl[5] = (((109 + 49) - 32) + 6) ^ (((96 + 51) - 20) + 1);
        llIIIIIl[6] = 179 ^ 182;
        llIIIIIl[7] = (-3718) & 3975;
        llIIIIIl[8] = (189 ^ 167) ^ (159 ^ 145);
        llIIIIIl[9] = (22 ^ 99) ^ (198 ^ 181);
    }
}
