package gg.squire.pvm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.pvm.SquireShamansPlugin;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.C0000a;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.c;
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:gg/squire/pvm/overlay/ShamanInfoBox.class */
public class ShamanInfoBox extends OverlayPanel {
    private static /* synthetic */ int[] lIIllIIIIIIII;
    private final /* synthetic */ c L;
    private final /* synthetic */ TaskManager K;
    private final /* synthetic */ SquireShamansPlugin J;
    private static /* synthetic */ String[] lIIlIllllllll;
    private /* synthetic */ C0000a M;

    @Inject
    private ShamanInfoBox(SquireShamansPlugin squireShamansPlugin, c cVar, C0000a c0000a) {
        this.J = squireShamansPlugin;
        this.K = squireShamansPlugin.getManager();
        this.L = cVar;
        this.M = c0000a;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIlIlllIIlIllII(String llllllllllllllIllllIIllIlIIIIlIl, String llllllllllllllIllllIIllIlIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIIIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIlIIIIllI) {
            llllllllllllllIllllIIllIlIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIllIIIl(int i) {
        return i != 0;
    }

    private static String lIlIlllIIlIllIl(String llllllllllllllIllllIIllIlIIlIIlI, String llllllllllllllIllllIIllIlIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIllIlIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIllIlIIlIlII.init(lIIllIIIIIIII[3], secretKeySpec);
            return new String(llllllllllllllIllllIIllIlIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIlIIlIIll) {
            llllllllllllllIllllIIllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    public long c(int i) {
        Duration between = Duration.between(this.J.getStarted(), Instant.now());
        if (lIlIlllIIllIIlI(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    static {
        lIlIlllIIllIIII();
        lIlIlllIIlIllll();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIlllIIllIIIl(this.J.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.J.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIllllllll[lIIllIIIIIIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[2]]).right(lIIlIllllllll[lIIllIIIIIIII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[4]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[5]]).right(this.K.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[6]]).right(String.valueOf(this.M.m())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[7]]).right(String.valueOf(this.J.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[8]]).right(c(this.J.a())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIllIIIIIIII[9] + lIIllIIIIIIII[10], lIIllIIIIIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIlIlllIIlIlllI(String llllllllllllllIllllIIllIIlllIlIl, String llllllllllllllIllllIIllIIlllIlII) {
        String llllllllllllllIllllIIllIIlllIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIllIIlllIlII.toCharArray();
        int llllllllllllllIllllIIllIIlllIIIl = lIIllIIIIIIII[1];
        char[] charArray2 = llllllllllllllIllllIIllIIlllIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIIIIII[1];
        while (lIlIlllIIllIIll(i, length)) {
            char llllllllllllllIllllIIllIIlllIllI = charArray2[i];
            sb.append((char) (llllllllllllllIllllIIllIIlllIllI ^ charArray[llllllllllllllIllllIIllIIlllIIIl % charArray.length]));
            "".length();
            llllllllllllllIllllIIllIIlllIIIl++;
            i++;
            "".length();
            if (((((21 + 95) - 4) + 19) ^ (((15 + 85) - 59) + 94)) <= (((((159 + 152) - 303) + 200) ^ (((106 + 105) - 204) + 151)) & (((104 ^ 44) ^ (2 ^ 8)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIIllIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlllIIlIllll() {
        lIIlIllllllll = new String[lIIllIIIIIIII[11]];
        lIIlIllllllll[lIIllIIIIIIII[1]] = lIlIlllIIlIllII("9XblA7cyKJOJPSr89qnApQ==", "XZqnA");
        lIIlIllllllll[lIIllIIIIIIII[2]] = lIlIlllIIlIllIl("RaLu2J3QzTM=", "mmysr");
        lIIlIllllllll[lIIllIIIIIIII[3]] = lIlIlllIIlIllII("vD0oCawDR/w=", "jamRN");
        lIIlIllllllll[lIIllIIIIIIII[4]] = lIlIlllIIlIllII("VIIxyBZciVk=", "oEpgQ");
        lIIlIllllllll[lIIllIIIIIIII[5]] = lIlIlllIIlIllII("Z2p4M8UoJlI=", "NLtMl");
        lIIlIllllllll[lIIllIIIIIIII[6]] = lIlIlllIIlIllIl("aRsjXlM6/dNyU6WFPsks6A==", "OiGvl");
        lIIlIllllllll[lIIllIIIIIIII[7]] = lIlIlllIIlIlllI("OzsKCSM=", "pRfeP");
        lIIlIllllllll[lIIllIIIIIIII[8]] = lIlIlllIIlIllII("8GEY0JfFfpYGmHizHdhQbg==", "NAIzQ");
    }

    private static void lIlIlllIIllIIII() {
        lIIllIIIIIIII = new int[12];
        lIIllIIIIIIII[0] = 48 ^ 58;
        lIIllIIIIIIII[1] = ((((27 + 65) - (-47)) + 58) ^ (((24 + 75) - 49) + 87)) & (((108 ^ 59) ^ (51 ^ 40)) ^ (-" ".length()));
        lIIllIIIIIIII[2] = " ".length();
        lIIllIIIIIIII[3] = "  ".length();
        lIIllIIIIIIII[4] = "   ".length();
        lIIllIIIIIIII[5] = (((9 + 109) - (-74)) + 3) ^ (((71 + 11) - 3) + 120);
        lIIllIIIIIIII[6] = 174 ^ 171;
        lIIllIIIIIIII[7] = 105 ^ 111;
        lIIllIIIIIIII[8] = (((12 + 45) - (-5)) + 99) ^ (((64 + 65) - 51) + 88);
        lIIllIIIIIIII[9] = (-1637) & 1894;
        lIIllIIIIIIII[10] = (((110 + 157) - 174) + 75) ^ (((107 + 155) - 94) + 20);
        lIIllIIIIIIII[11] = (168 ^ 134) ^ (150 ^ 176);
    }

    private static boolean lIlIlllIIllIIlI(int i) {
        return i == 0;
    }
}
