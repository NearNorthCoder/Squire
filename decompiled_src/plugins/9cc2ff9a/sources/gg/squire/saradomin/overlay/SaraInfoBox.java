package gg.squire.saradomin.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.saradomin.SquireSaradomin;
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
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.C0005f;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.C0006g;
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:gg/squire/saradomin/overlay/SaraInfoBox.class */
public class SaraInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] lIIlIlIlIIIll;
    private final /* synthetic */ C0006g F;
    private static /* synthetic */ String[] lIIlIlIlIIIIl;
    private final /* synthetic */ C0005f G;
    private final /* synthetic */ SquireSaradomin E;
    private final /* synthetic */ TaskManager H;

    private static String lIlIlIllllIlIlI(String llllllllllllllIllllIlllIllIllIlI, String llllllllllllllIllllIlllIllIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIllIlIlll.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIIIll[8]), "DES");
            Cipher llllllllllllllIllllIlllIllIlllII = Cipher.getInstance("DES");
            llllllllllllllIllllIlllIllIlllII.init(lIIlIlIlIIIll[3], llllllllllllllIllllIlllIllIlllIl);
            return new String(llllllllllllllIllllIlllIllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlllIllIllIll) {
            llllllllllllllIllllIlllIllIllIll.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIlIlllllIIII(this.E.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlIlIlIIIll[0], lIIlIlIlIIIll[0], lIIlIlIlIIIll[0], lIIlIlIlIIIll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIlIlIIIIl[lIIlIlIlIIIll[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[2]]).right(String.valueOf(this.F.l())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[3]]).right(String.valueOf(this.F.m())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[4]]).right(String.valueOf(this.F.u())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[5]]).right(this.H.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[6]]).right(String.valueOf(this.E.a())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String lIlIlIllllIlIII(String llllllllllllllIllllIlllIlllIllll, String llllllllllllllIllllIlllIlllIlllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIlllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIlllIlllIllII = llllllllllllllIllllIlllIlllIlllI.toCharArray();
        int llllllllllllllIllllIlllIlllIlIll = lIIlIlIlIIIll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIlIIIll[1];
        while (lIlIlIlllllIIIl(i, length)) {
            char llllllllllllllIllllIlllIllllIIII = charArray[i];
            sb.append((char) (llllllllllllllIllllIlllIllllIIII ^ llllllllllllllIllllIlllIlllIllII[llllllllllllllIllllIlllIlllIlIll % llllllllllllllIllllIlllIlllIllII.length]));
            "".length();
            llllllllllllllIllllIlllIlllIlIll++;
            i++;
            "".length();
            if ("   ".length() <= ((242 ^ 168) & ((125 ^ 39) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIlIllllIlllI() {
        lIIlIlIlIIIIl = new String[lIIlIlIlIIIll[7]];
        lIIlIlIlIIIIl[lIIlIlIlIIIll[1]] = lIlIlIllllIlIII("BCUQIjAydDYqMDYwCiYrOQ==", "WTeKB");
        lIIlIlIlIIIIl[lIIlIlIlIIIll[2]] = lIlIlIllllIlIIl("NzEiuB1BiXosOFzYmA1LJg==", "cTnPM");
        lIIlIlIlIIIIl[lIIlIlIlIIIll[3]] = lIlIlIllllIlIlI("+XDp6kfafhfT0s1syERmVQ==", "zRZEA");
        lIIlIlIlIIIIl[lIIlIlIlIIIll[4]] = lIlIlIllllIlIlI("4y+8WKWQLxaQhSMLrbzKXQ==", "tXhBb");
        lIIlIlIlIIIIl[lIIlIlIlIIIll[5]] = lIlIlIllllIlIlI("Bsaw3OMPvPsjY6PA9syvrw==", "TPTVm");
        lIIlIlIlIIIIl[lIIlIlIlIIIll[6]] = lIlIlIllllIlIIl("uDaEa0onOp4=", "yKDLq");
    }

    @Inject
    public SaraInfoBox(SquireSaradomin squireSaradomin, C0006g c0006g, C0005f c0005f) {
        this.E = squireSaradomin;
        this.F = c0006g;
        this.G = c0005f;
        this.H = squireSaradomin.getManager();
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlIlIlllllIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlllllIIII(int i) {
        return i != 0;
    }

    static {
        lIlIlIllllIllll();
        lIlIlIllllIlllI();
    }

    private static String lIlIlIllllIlIIl(String llllllllllllllIllllIlllIllIIllIl, String llllllllllllllIllllIlllIllIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlllIllIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlllIllIIllll.init(lIIlIlIlIIIll[3], secretKeySpec);
            return new String(llllllllllllllIllllIlllIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlllIllIIlllI) {
            llllllllllllllIllllIlllIllIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllllIllll() {
        lIIlIlIlIIIll = new int[9];
        lIIlIlIlIIIll[0] = (161 ^ 152) ^ (190 ^ 141);
        lIIlIlIlIIIll[1] = (66 ^ 108) & ((187 ^ 149) ^ (-1));
        lIIlIlIlIIIll[2] = " ".length();
        lIIlIlIlIIIll[3] = "  ".length();
        lIIlIlIlIIIll[4] = "   ".length();
        lIIlIlIlIIIll[5] = 121 ^ 125;
        lIIlIlIlIIIll[6] = 51 ^ 54;
        lIIlIlIlIIIll[7] = 57 ^ 63;
        lIIlIlIlIIIll[8] = 28 ^ 20;
    }
}
