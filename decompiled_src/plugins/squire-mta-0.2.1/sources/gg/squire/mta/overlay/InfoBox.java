package gg.squire.mta.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mta.SquireMTA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.p000.e.s.q.t.i.r.c;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: squire-mta-0.2.1.jar:gg/squire/mta/overlay/InfoBox.class */
public class InfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lllIlIlIllll;
    private static /* synthetic */ int[] lllIlIllIIII;
    private final /* synthetic */ SquireMTA ao;
    private final /* synthetic */ TaskManager ap;

    private static void lIIIllIIIllIlII() {
        lllIlIlIllll = new String[lllIlIllIIII[10]];
        lllIlIlIllll[lllIlIllIIII[1]] = lIIIllIIIllIIIl("Khc/AyYcRgc+FQ==", "yfJjT");
        lllIlIlIllll[lllIlIllIIII[2]] = lIIIllIIIllIIlI("g2QEsCd6HEj9uftp6TS5gg==", "CIdVH");
        lllIlIlIllll[lllIlIllIIII[3]] = lIIIllIIIllIIlI("rsoM85rP9D8ZMsUbe9ZW+g==", "CdydY");
        lllIlIlIllll[lllIlIllIIII[4]] = lIIIllIIIllIIll("DiTj0ZI9ozsXYWcsl6zG/o4mFIzUVS2w", "aTEFl");
        lllIlIlIllll[lllIlIllIIII[5]] = lIIIllIIIllIIll("2es1dPl8MqMuCBW/jpIIm2lgMNr8raT9", "xoyJS");
        lllIlIlIllll[lllIlIllIIII[6]] = lIIIllIIIllIIlI("bwuZFB+LFNJLd4TG87ZkqC3414NM/TxO", "vmGCd");
        lllIlIlIllll[lllIlIllIIII[7]] = lIIIllIIIllIIlI("MCyGlPAHHjscDyx7sL+WJdhwcPyAoVXg", "Esmuu");
    }

    private static String lIIIllIIIllIIll(String lllllllllllllllIIllIlIlIllIIIlII, String lllllllllllllllIIllIlIlIllIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), lllIlIllIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIllIIII[3], lllllllllllllllIIllIlIlIllIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlIllIIIlIl) {
            lllllllllllllllIIllIlIlIllIIIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIIIllIlIl();
        lIIIllIIIllIlII();
    }

    private static void lIIIllIIIllIlIl() {
        lllIlIllIIII = new int[12];
        lllIlIllIIII[0] = (27 ^ 111) ^ (42 ^ 84);
        lllIlIllIIII[1] = ((9 ^ 55) ^ (0 ^ 47)) & (((73 ^ 104) ^ (182 ^ 134)) ^ (-" ".length()));
        lllIlIllIIII[2] = " ".length();
        lllIlIllIIII[3] = "  ".length();
        lllIlIllIIII[4] = "   ".length();
        lllIlIllIIII[5] = 16 ^ 20;
        lllIlIllIIII[6] = (((103 + 77) - 143) + 152) ^ (((50 + 8) - (-95)) + 31);
        lllIlIllIIII[7] = 74 ^ 76;
        lllIlIllIIII[8] = (-17598) & 17855;
        lllIlIllIIII[9] = (24 ^ 73) ^ (253 ^ 184);
        lllIlIllIIII[10] = 191 ^ 184;
        lllIlIllIIII[11] = 52 ^ 60;
    }

    private static boolean lIIIllIIIllIllI(int i) {
        return i != 0;
    }

    @Inject
    private InfoBox(SquireMTA squireMTA) {
        this.ao = squireMTA;
        this.ap = squireMTA.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIIllIIIllIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllIIIllIIIl(String lllllllllllllllIIllIlIlIlIllIlII, String lllllllllllllllIIllIlIlIlIllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIlIlIllIIlI = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIlIllIIIl = lllllllllllllllIIllIlIlIlIllIIll.toCharArray();
        int lllllllllllllllIIllIlIlIlIllIIII = lllIlIllIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIllIIII[1];
        while (lIIIllIIIllIlll(i, length)) {
            lllllllllllllllIIllIlIlIlIllIIlI.append((char) (charArray[i] ^ lllllllllllllllIIllIlIlIlIllIIIl[lllllllllllllllIIllIlIlIlIllIIII % lllllllllllllllIIllIlIlIlIllIIIl.length]));
            "".length();
            lllllllllllllllIIllIlIlIlIllIIII++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIlIlIllIIlI);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIIllIIIllIllI(this.ao.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.ao.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlIllIIII[0], lllIlIllIIII[0], lllIlIllIIII[0], lllIlIllIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIllll[lllIlIllIIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[2]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[3]]).right(String.valueOf(this.ap.getCurrentTask())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[4]]).right(this.ao.c(c.ALCHEMY) + "/" + this.ao.d(c.ALCHEMY)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[5]]).right(this.ao.c(c.ENCHANTMENT) + "/" + this.ao.d(c.ENCHANTMENT)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[6]]).right(this.ao.c(c.GRAVEYARD) + "/" + this.ao.d(c.GRAVEYARD)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[7]]).right(this.ao.c(c.TELEKENETIC) + "/" + this.ao.d(c.TELEKENETIC)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIlIllIIII[8] + lllIlIllIIII[9], lllIlIllIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIIIllIIIllIIlI(String lllllllllllllllIIllIlIlIllIIllll, String lllllllllllllllIIllIlIlIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlIllIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlIllIlIIll.init(lllIlIllIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIlIlIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlIllIlIIlI) {
            lllllllllllllllIIllIlIlIllIlIIlI.printStackTrace();
            return null;
        }
    }
}
