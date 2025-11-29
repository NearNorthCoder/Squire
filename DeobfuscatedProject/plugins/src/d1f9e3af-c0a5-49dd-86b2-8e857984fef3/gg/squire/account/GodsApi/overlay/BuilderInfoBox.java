/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {
    private final /* synthetic */ AccBuilderEasyClues bo;
    private final /* synthetic */ BuilderConfig bp;
    private static /* synthetic */ int[] lIlIlIIlI;
    private static /* synthetic */ String[] lIlIlIIIl;

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderEasyClues.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlIIIl[lIlIlIIlI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[2]]).right("1." + d2).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[3]]).right(e.b(l2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[4]]).right(AccBuilderEasyClues.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[5]]).right(String.valueOf(AccBuilderEasyClues.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[6]]).right(String.valueOf(AccBuilderEasyClues.f)).build());
        "".length();
        int n2 = lIlIlIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlIIlI[8], lIlIlIIlI[1]));
        return super.render(graphics2D);
    }

    private static void lIIIlllIlIIl() {
        lIlIlIIIl = new String[lIlIlIIlI[9]];
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[1]] = BuilderInfoBox.lIIIlllIIllI("t1+7ydd0b0DTZ8mCBNJLb6jH1/6eR8cWh16RwBNSBW0=", "TGvaL");
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[2]] = BuilderInfoBox.lIIIlllIIlll("eAueAY+0tA0=", "pbofN");
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[3]] = BuilderInfoBox.lIIIlllIlIII("Jhs3AhAZCw==", "tnYvy");
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[4]] = BuilderInfoBox.lIIIlllIlIII("HD4RFjY8cA==", "OJpbC");
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[5]] = BuilderInfoBox.lIIIlllIlIII("KgQIGQQHBVo6FAwCDlE=", "iqzka");
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[6]] = BuilderInfoBox.lIIIlllIlIII("LSMxARFZAS0HEhUnNg8GQw==", "yBBjb");
    }

    private static String lIIIlllIlIII(String lllIlIIIllIIII, String lllIlIIIlIlIlI) {
        lllIlIIIllIIII = new String(Base64.getDecoder().decode(lllIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIlIlllI = new StringBuilder();
        char[] lllIlIIIlIllIl = lllIlIIIlIlIlI.toCharArray();
        int lllIlIIIlIllII = lIlIlIIlI[1];
        char[] lllIlIIIlIIllI = lllIlIIIllIIII.toCharArray();
        int lllIlIIIlIIlIl = lllIlIIIlIIllI.length;
        int lllIlIIIlIIlII = lIlIlIIlI[1];
        while (BuilderInfoBox.lIIIlllIlIll(lllIlIIIlIIlII, lllIlIIIlIIlIl)) {
            char lllIlIIIllIIIl = lllIlIIIlIIllI[lllIlIIIlIIlII];
            lllIlIIIlIlllI.append((char)(lllIlIIIllIIIl ^ lllIlIIIlIllIl[lllIlIIIlIllII % lllIlIIIlIllIl.length]));
            "".length();
            ++lllIlIIIlIllII;
            ++lllIlIIIlIIlII;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllIlIIIlIlllI);
    }

    private static String lIIIlllIIllI(String lllIlIIlIIIIII, String lllIlIIIllllIl) {
        try {
            SecretKeySpec lllIlIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIlI[10]), "DES");
            Cipher lllIlIIlIIIIlI = Cipher.getInstance("DES");
            lllIlIIlIIIIlI.init(lIlIlIIlI[3], lllIlIIlIIIIll);
            return new String(lllIlIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllIlIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIlIIIIIl) {
            lllIlIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private BuilderInfoBox(AccBuilderEasyClues accBuilderEasyClues, BuilderConfig builderConfig) {
        this.bo = accBuilderEasyClues;
        this.bp = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.lIIIlllIlIlI();
        BuilderInfoBox.lIIIlllIlIIl();
    }

    private static void lIIIlllIlIlI() {
        lIlIlIIlI = new int[11];
        BuilderInfoBox.lIlIlIIlI[0] = 0x55 ^ 0x5F;
        BuilderInfoBox.lIlIlIIlI[1] = (0x42 ^ 0x73 ^ (0x14 ^ 0x12)) & (174 + 104 - 140 + 38 ^ 42 + 97 - 97 + 93 ^ -" ".length());
        BuilderInfoBox.lIlIlIIlI[2] = " ".length();
        BuilderInfoBox.lIlIlIIlI[3] = "  ".length();
        BuilderInfoBox.lIlIlIIlI[4] = "   ".length();
        BuilderInfoBox.lIlIlIIlI[5] = 69 + 37 - -59 + 5 ^ 5 + 55 - -79 + 35;
        BuilderInfoBox.lIlIlIIlI[6] = 0xAB ^ 0xAE;
        BuilderInfoBox.lIlIlIIlI[7] = 0xFFFFFD0E & 0x3F3;
        BuilderInfoBox.lIlIlIIlI[8] = 0x3F ^ 0x59 ^ (0x53 ^ 0x21);
        BuilderInfoBox.lIlIlIIlI[9] = 0xC0 ^ 0xAA ^ (0xCB ^ 0xA7);
        BuilderInfoBox.lIlIlIIlI[10] = 8 + 123 - 42 + 79 ^ 128 + 142 - 199 + 89;
    }

    private static String lIIIlllIIlll(String lllIlIIIIllIIl, String lllIlIIIIllIlI) {
        try {
            SecretKeySpec lllIlIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIIlllIl = Cipher.getInstance("Blowfish");
            lllIlIIIIlllIl.init(lIlIlIIlI[3], lllIlIIIIllllI);
            return new String(lllIlIIIIlllIl.doFinal(Base64.getDecoder().decode(lllIlIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIIlllII) {
            lllIlIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

