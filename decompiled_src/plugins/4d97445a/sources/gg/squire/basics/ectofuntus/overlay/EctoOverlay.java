package gg.squire.basics.ectofuntus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/ectofuntus/overlay/EctoOverlay.class */
public class EctoOverlay extends OverlayPanel {
    private static /* synthetic */ String[] lllIllIIl;
    private final /* synthetic */ SquireEcto cW;
    private final /* synthetic */ TaskManager cX;
    private static /* synthetic */ int[] lllIllIlI;

    public long u(int i2) {
        Duration between = Duration.between(this.cW.getStarted(), Instant.now());
        if (llIIllIIIIl(between.isZero() ? 1 : 0)) {
            return (int) ((i2 * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean llIIllIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static void llIIlIlllll() {
        lllIllIlI = new int[12];
        lllIllIlI[0] = (70 ^ 4) & ((132 ^ 198) ^ (-1));
        lllIllIlI[1] = " ".length();
        lllIllIlI[2] = "  ".length();
        lllIllIlI[3] = "   ".length();
        lllIllIlI[4] = (((6 + 64) - 13) + 95) ^ (((47 + 96) - 7) + 20);
        lllIllIlI[5] = 151 ^ 146;
        lllIllIlI[6] = 21 ^ 19;
        lllIllIlI[7] = 152 ^ 159;
        lllIllIlI[8] = (115 ^ 55) ^ (43 ^ 103);
        lllIllIlI[9] = (-27801) & 28058;
        lllIllIlI[10] = 118 ^ 98;
        lllIllIlI[11] = 40 ^ 33;
    }

    private static String llIIlIllIll(String lIlIlIIIlIlIlII, String lIlIlIIIlIlIIll) {
        try {
            SecretKeySpec lIlIlIIIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIlIlIllI = Cipher.getInstance("Blowfish");
            lIlIlIIIlIlIllI.init(lllIllIlI[2], lIlIlIIIlIlIlll);
            return new String(lIlIlIIIlIlIllI.doFinal(Base64.getDecoder().decode(lIlIlIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIlIlIlIl) {
            lIlIlIIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIIIl(int i2) {
        return i2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        if (llIIllIIIII(this.cW.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.cW.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllIIl[lllIllIlI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[2]]).right(this.cX.getCurrentTask()).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lllIllIIl[lllIllIlI[3]]);
        if (llIIllIIIII(this.cW.r() ? 1 : 0)) {
            str = lllIllIIl[lllIllIlI[4]];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        } else {
            str = lllIllIIl[lllIllIlI[5]];
        }
        children.add(left.right(str).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[6]]).right(this.cW.bm() + " (" + u(this.cW.bm()) + "/h)").build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[7]]).right(this.cW.bl() + " (" + u(this.cW.bl()) + "/h)").build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[8]]).right(this.cW.bn() + " (" + u(this.cW.bn()) + "/h)").build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIllIlI[9] + lllIllIlI[10], lllIllIlI[0]));
        return super.render(graphics2D);
    }

    static {
        llIIlIlllll();
        llIIlIllllI();
    }

    @Inject
    private EctoOverlay(SquireEcto squireEcto) {
        this.cW = squireEcto;
        this.cX = squireEcto.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    private static String llIIlIlllII(String lIlIlIIIllIIIIl, String lIlIlIIIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lllIllIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIllIIIlI) {
            lIlIlIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlllIl(String lIlIlIIIlllIllI, String lIlIlIIIlllIlIl) {
        String lIlIlIIIlllIllI2 = new String(Base64.getDecoder().decode(lIlIlIIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlIIIlllIlIl.toCharArray();
        int lIlIlIIIlllIIlI = lllIllIlI[0];
        char[] charArray2 = lIlIlIIIlllIllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lllIllIlI[0];
        while (llIIllIIIlI(i2, length)) {
            char lIlIlIIIlllIlll = charArray2[i2];
            sb.append((char) (lIlIlIIIlllIlll ^ charArray[lIlIlIIIlllIIlI % charArray.length]));
            "".length();
            lIlIlIIIlllIIlI++;
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIlIllllI() {
        lllIllIIl = new String[lllIllIlI[11]];
        lllIllIIl[lllIllIlI[0]] = llIIlIllIll("wcWKBKWfqR0ixwIp4HkHkeVs0/eb4VNN", "YDsGt");
        lllIllIIl[lllIllIlI[1]] = llIIlIlllII("aMg5YwjV/3aJStYx+LCX/w==", "QXzKk");
        lllIllIIl[lllIllIlI[2]] = llIIlIlllII("AldrkUKGRBScPZIHDJeykA==", "okUuG");
        lllIllIIl[lllIllIlI[3]] = llIIlIllIll("uzLPPs42QZQuA6CmVwjlCA==", "McQCH");
        lllIllIIl[lllIllIlI[4]] = llIIlIlllIl("KCkZ", "qLjAY");
        lllIllIIl[lllIllIlI[5]] = llIIlIlllII("0MvZ9OEq+5c=", "WgWpc");
        lllIllIIl[lllIllIlI[6]] = llIIlIlllII("k8zXN/kzRip+KV9GHxk9Dg==", "ESNTZ");
        lllIllIIl[lllIllIlI[7]] = llIIlIlllIl("ID0YFwUDbzUNBQI8TUI=", "gOwbk");
        lllIllIIl[lllIllIlI[8]] = llIIlIlllIl("JwQFGRNUKwMYGhELGBESTkg=", "thltv");
    }

    private static boolean llIIllIIIII(int i2) {
        return i2 != 0;
    }
}
