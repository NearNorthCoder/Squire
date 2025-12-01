package gg.squire.slayer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.slayer.SquireSkipperPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:gg/squire/slayer/overlay/SkipperOverlay.class */
public class SkipperOverlay extends OverlayPanel {
    private static /* synthetic */ String[] lIlIIlIIllIIl;
    private final /* synthetic */ SquireSkipperPlugin p;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIlIIlIIllIlI;

    private static String lIlllIlIlIlIlII(String llllllllllllllIllIlllIlIlIIlIIll, String llllllllllllllIllIlllIlIlIIlIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlllIlIlIIlIIlI.toCharArray();
        int llllllllllllllIllIlllIlIlIIIllll = lIlIIlIIllIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIllIlI[0];
        while (lIlllIlIlIlllII(i, length)) {
            char llllllllllllllIllIlllIlIlIIlIlII = charArray2[i];
            sb.append((char) (llllllllllllllIllIlllIlIlIIlIlII ^ charArray[llllllllllllllIllIlllIlIlIIIllll % charArray.length]));
            "".length();
            llllllllllllllIllIlllIlIlIIIllll++;
            i++;
            "".length();
            if ((" ".length() ^ (50 ^ 55)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllIlIlIlllII(int i, int i2) {
        return i < i2;
    }

    static {
        lIlllIlIlIllIII();
        lIlllIlIlIlIlll();
    }

    private static String lIlllIlIlIlIIll(String llllllllllllllIllIlllIlIIllllllI, String llllllllllllllIllIlllIlIIlllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIlIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIllIlI[2], llllllllllllllIllIlllIlIlIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIIlllllll) {
            llllllllllllllIllIlllIlIIlllllll.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIlIlIlIl(String llllllllllllllIllIlllIlIIlllIIIl, String llllllllllllllIllIlllIlIIlllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIllIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIIlllIIlI) {
            llllllllllllllIllIlllIlIIlllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIllIll(int i) {
        return i == 0;
    }

    private static boolean lIlllIlIlIllIIl(int i) {
        return i != 0;
    }

    @Inject
    private SkipperOverlay(SquireSkipperPlugin squireSkipperPlugin) {
        this.p = squireSkipperPlugin;
        this.q = squireSkipperPlugin.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIlllIlIlIlIlll() {
        lIlIIlIIllIIl = new String[lIlIIlIIllIlI[12]];
        lIlIIlIIllIIl[lIlIIlIIllIlI[0]] = lIlllIlIlIlIIll("gQll0cDBA3zHWKzsNP+oWHAxQDYOx78f", "zcEfu");
        lIlIIlIIllIIl[lIlIIlIIllIlI[1]] = lIlllIlIlIlIlII("GB0sAhAnDQ==", "JhBvy");
        lIlIIlIIllIIl[lIlIIlIIllIlI[2]] = lIlllIlIlIlIlII("HiMYFC4nKA==", "HFjgG");
        lIlIIlIIllIIl[lIlIIlIIllIlI[3]] = lIlllIlIlIlIlIl("xisfuWompHU=", "WCHRT");
        lIlIIlIIllIIl[lIlIIlIIllIlI[4]] = lIlllIlIlIlIIll("DaqYkxgKgo0=", "gPFsR");
        lIlIIlIIllIIl[lIlIIlIIllIlI[5]] = lIlllIlIlIlIlII("JwMbEjwGTy4KKh9VWg==", "tozkY");
        lIlIIlIIllIIl[lIlIIlIIllIlI[6]] = lIlllIlIlIlIIll("MSxu0ZMUABCHQaipiTY9zA==", "CqvFG");
        lIlIIlIIllIIl[lIlIIlIIllIlI[7]] = lIlllIlIlIlIlIl("wDcV8NDi7O0OQsaqG6vtTGDWUHb15PT0", "wErTC");
        lIlIIlIIllIIl[lIlIIlIIllIlI[8]] = lIlllIlIlIlIlIl("T0lrdPWIscfBC4WorALOhBZ3ZeZfigpXhuccw5guKYo=", "uBcCo");
        lIlIIlIIllIIl[lIlIIlIIllIlI[9]] = lIlllIlIlIlIIll("dSEyHhxBd7x3ehbeZ+ZOLakJ+kp2/VQ6", "CNSEx");
    }

    public long f(int i) {
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        if (lIlllIlIlIllIll(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlllIlIlIllIIl(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIlIIllIIl[lIlIIlIIllIlI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[2]]).right(lIlIIlIIllIIl[lIlIIlIIllIlI[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[4]]).right(this.q.getCurrentTask()).build());
        "".length();
        if (lIlllIlIlIllIlI(this.p.b())) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[5]]).right(this.p.b().toString()).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[6]]).right(String.valueOf(this.p.h())).build());
            "".length();
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[7]]).right(String.valueOf(this.p.f())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[8]]).right(String.valueOf(f(this.p.f()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[9]]).right(String.valueOf(this.p.g())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIIlIIllIlI[10] + lIlIIlIIllIlI[11], lIlIIlIIllIlI[0]));
        return super.render(graphics2D);
    }

    private static boolean lIlllIlIlIllIlI(Object obj) {
        return obj != null;
    }

    private static void lIlllIlIlIllIII() {
        lIlIIlIIllIlI = new int[13];
        lIlIIlIIllIlI[0] = (2 ^ 66) & ((205 ^ 141) ^ (-1));
        lIlIIlIIllIlI[1] = " ".length();
        lIlIIlIIllIlI[2] = "  ".length();
        lIlIIlIIllIlI[3] = "   ".length();
        lIlIIlIIllIlI[4] = 64 ^ 68;
        lIlIIlIIllIlI[5] = (213 ^ 165) ^ (182 ^ 195);
        lIlIIlIIllIlI[6] = (((113 + 96) - 125) + 59) ^ (((11 + 9) - (-90)) + 27);
        lIlIIlIIllIlI[7] = 82 ^ 85;
        lIlIIlIIllIlI[8] = (239 ^ 170) ^ (197 ^ 136);
        lIlIIlIIllIlI[9] = (29 ^ 90) ^ (36 ^ 106);
        lIlIIlIIllIlI[10] = (-11794) & 12051;
        lIlIIlIIllIlI[11] = 87 ^ 67;
        lIlIIlIIllIlI[12] = (231 ^ 146) ^ (((72 + 29) - 50) + 76);
    }
}
