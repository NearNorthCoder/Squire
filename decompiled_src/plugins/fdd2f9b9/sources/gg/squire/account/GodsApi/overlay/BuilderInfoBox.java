package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0004e;
import gg.squire.account.AccBuilderRogues;
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
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:gg/squire/account/GodsApi/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] lIIlIlIllI;
    private final /* synthetic */ AccBuilderRogues bo;
    private static /* synthetic */ String[] lIIlIlIlIl;
    private final /* synthetic */ BuilderConfig bp;

    private static String lllllllIIIlI(String lllllllllllllllllllllllIIIllIlII, String lllllllllllllllllllllllIIIllIIll) {
        String lllllllllllllllllllllllIIIllIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllllIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllllIIIllIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllllllllllIIIllIIll.toCharArray();
        int lllllllllllllllllllllllIIIlIlIll = lIIlIlIllI[1];
        char[] charArray2 = lllllllllllllllllllllllIIIllIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIllI[1];
        while (lllllllIIlIl(i, length)) {
            lllllllllllllllllllllllIIIllIIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllllllIIIlIlIll % charArray.length]));
            "".length();
            lllllllllllllllllllllllIIIlIlIll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllllllIIIllIIlI);
    }

    private static void lllllllIIIll() {
        lIIlIlIlIl = new String[lIIlIlIllI[9]];
        lIIlIlIlIl[lIIlIlIllI[1]] = lllllllIIIII("LMC7b+xqAv/CsA/EDQDnzJiWubTPlxK4mOcYAdFJpJI=", "NUbSL");
        lIIlIlIlIl[lIIlIlIllI[2]] = lllllllIIIIl("ro555wOSXlY=", "bfIqM");
        lIIlIlIlIl[lIIlIlIllI[3]] = lllllllIIIlI("Jx8XOh8YDw==", "ujyNv");
        lIIlIlIlIl[lIIlIlIllI[4]] = lllllllIIIlI("IzsQHgIDdQ==", "pOqjw");
        lIIlIlIlIl[lIIlIlIllI[5]] = lllllllIIIII("e3kGDk8IVsnw4td0o7Ky3w==", "PhfSR");
        lIIlIlIlIl[lIIlIlIllI[6]] = lllllllIIIIl("N0VoW6VJ02ED1wAXpi7zJt8Baps0c8rC", "tfOwg");
    }

    @Inject
    private BuilderInfoBox(AccBuilderRogues accBuilderRogues, BuilderConfig builderConfig) {
        this.bo = accBuilderRogues;
        this.bp = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lllllllIIIII(String lllllllllllllllllllllllIIlIlIIIl, String lllllllllllllllllllllllIIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllllIIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllllIIlIlIIll.init(lIIlIlIllI[3], secretKeySpec);
            return new String(lllllllllllllllllllllllIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIIlIIllIl) {
            lllllllllllllllllllllllIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lllllllIIIIl(String lllllllllllllllllllllllIIlIIIlII, String lllllllllllllllllllllllIIlIIIIll) {
        try {
            SecretKeySpec lllllllllllllllllllllllIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIllI[10]), "DES");
            Cipher lllllllllllllllllllllllIIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllllllllllllIIlIIIllI.init(lIIlIlIllI[3], lllllllllllllllllllllllIIlIIIlll);
            return new String(lllllllllllllllllllllllIIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIIlIIIlIl) {
            lllllllllllllllllllllllIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllllIIlII() {
        lIIlIlIllI = new int[11];
        lIIlIlIllI[0] = (2 ^ 83) ^ (202 ^ 145);
        lIIlIlIllI[1] = ((211 ^ 157) ^ (254 ^ 132)) & (((44 ^ 25) ^ " ".length()) ^ (-" ".length()));
        lIIlIlIllI[2] = " ".length();
        lIIlIlIllI[3] = "  ".length();
        lIIlIlIllI[4] = "   ".length();
        lIIlIlIllI[5] = 77 ^ 73;
        lIIlIlIllI[6] = (43 ^ 46) ^ ((55 ^ 44) & ((116 ^ 111) ^ (-1)));
        lIIlIlIllI[7] = (-5634) & 5891;
        lIIlIlIllI[8] = 119 ^ 99;
        lIIlIlIllI[9] = 73 ^ 79;
        lIIlIlIllI[10] = 12 ^ 4;
    }

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderRogues.b;
        this.panelComponent.setBorder(new Rectangle(lIIlIlIllI[0], lIIlIlIllI[0], lIIlIlIllI[0], lIIlIlIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIlIlIl[lIIlIlIllI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[4]]).right(AccBuilderRogues.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[5]]).right(String.valueOf(AccBuilderRogues.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[6]]).right(String.valueOf(AccBuilderRogues.f3f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIlIlIllI[7] + lIIlIlIllI[8], lIIlIlIllI[1]));
        return super.render(graphics2D);
    }

    private static boolean lllllllIIlIl(int i, int i2) {
        return i < i2;
    }

    static {
        lllllllIIlII();
        lllllllIIIll();
    }
}
