package gg.squire.construction.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.SquirePlankerPlugin;
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
/* loaded from: squire-planker-0.0.5.jar:gg/squire/construction/overlay/PlankerInfoBox.class */
public class PlankerInfoBox extends OverlayPanel {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ SquirePlankerConfig f0k;
    private static /* synthetic */ String[] llllllIIIIIl;
    private static /* synthetic */ int[] llllllIIIIlI;
    private final /* synthetic */ TaskManager j;
    private final /* synthetic */ SquirePlankerPlugin i;

    private static void lIIlIIllllIlllI() {
        llllllIIIIlI = new int[10];
        llllllIIIIlI[0] = 41 ^ 35;
        llllllIIIIlI[1] = (99 ^ 64) & ((46 ^ 13) ^ (-1));
        llllllIIIIlI[2] = " ".length();
        llllllIIIIlI[3] = "  ".length();
        llllllIIIIlI[4] = "   ".length();
        llllllIIIIlI[5] = 91 ^ 95;
        llllllIIIIlI[6] = (-((-737) & 7922)) & (-24677) & 32119;
        llllllIIIIlI[7] = 142 ^ 154;
        llllllIIIIlI[8] = 124 ^ 121;
        llllllIIIIlI[9] = (((80 + 102) - 32) + 41) ^ (((102 + 54) - 75) + 102);
    }

    private static void lIIlIIllllIllIl() {
        llllllIIIIIl = new String[llllllIIIIlI[8]];
        llllllIIIIIl[llllllIIIIlI[1]] = lIIlIIllllIlIlI("8hRAKXSGi6AASZZ4KwFqZA==", "BUurB");
        llllllIIIIIl[llllllIIIIlI[2]] = lIIlIIllllIlIll("qxmRyxrKJ1w=", "pPwGn");
        llllllIIIIIl[llllllIIIIlI[3]] = lIIlIIllllIllII("SGRnbHo=", "xJVBK");
        llllllIIIIIl[llllllIIIIlI[4]] = lIIlIIllllIlIll("RB2faIcU3DE=", "BbPWy");
        llllllIIIIIl[llllllIIIIlI[5]] = lIIlIIllllIlIlI("EVezKkUNwt0=", "RWqBj");
    }

    private static String lIIlIIllllIlIlI(String lllllllllllllllIIlIIlllllIllllII, String lllllllllllllllIIlIIlllllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlllllIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlllllIlllllI.init(llllllIIIIlI[3], lllllllllllllllIIlIIlllllIllllll);
            return new String(lllllllllllllllIIlIIlllllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllllIllllIl) {
            lllllllllllllllIIlIIlllllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllllIllII(String lllllllllllllllIIlIIlllllIlIllII, String lllllllllllllllIIlIIlllllIlIlIll) {
        String lllllllllllllllIIlIIlllllIlIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllllIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIlllllIlIlIIl = lllllllllllllllIIlIIlllllIlIlIll.toCharArray();
        int lllllllllllllllIIlIIlllllIlIlIII = llllllIIIIlI[1];
        char[] charArray = lllllllllllllllIIlIIlllllIlIllII2.toCharArray();
        int lllllllllllllllIIlIIlllllIlIIIIl = charArray.length;
        int i = llllllIIIIlI[1];
        while (lIIlIIlllllIIIl(i, lllllllllllllllIIlIIlllllIlIIIIl)) {
            char lllllllllllllllIIlIIlllllIlIllIl = charArray[i];
            sb.append((char) (lllllllllllllllIIlIIlllllIlIllIl ^ lllllllllllllllIIlIIlllllIlIlIIl[lllllllllllllllIIlIIlllllIlIlIII % lllllllllllllllIIlIIlllllIlIlIIl.length]));
            "".length();
            lllllllllllllllIIlIIlllllIlIlIII++;
            i++;
            "".length();
            if ("   ".length() <= ((179 ^ 160) & ((53 ^ 38) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlllllIIIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    private PlankerInfoBox(SquirePlankerPlugin squirePlankerPlugin, SquirePlankerConfig squirePlankerConfig) {
        this.i = squirePlankerPlugin;
        this.j = squirePlankerPlugin.getManager();
        this.f0k = squirePlankerConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long a(int i) {
        Duration between = Duration.between(this.i.getStarted(), Instant.now());
        if (lIIlIIlllllIIII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIIlIIlllllIIII(int i) {
        return i == 0;
    }

    private static String lIIlIIllllIlIll(String lllllllllllllllIIlIIllllllIIlIIl, String lllllllllllllllIIlIIllllllIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllllllIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllllllIIlIII.getBytes(StandardCharsets.UTF_8)), llllllIIIIlI[9]), "DES");
            Cipher lllllllllllllllIIlIIllllllIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllllllIIlIll.init(llllllIIIIlI[3], lllllllllllllllIIlIIllllllIIllII);
            return new String(lllllllllllllllIIlIIllllllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllllllIIlIlI) {
            lllllllllllllllIIlIIllllllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllllIllll(int i) {
        return i != 0;
    }

    static {
        lIIlIIllllIlllI();
        lIIlIIllllIllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIlIIllllIllll(this.i.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.i.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIIIlI[0], llllllIIIIlI[0], llllllIIIIlI[0], llllllIIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllIIIIIl[llllllIIIIlI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[2]]).right(llllllIIIIIl[llllllIIIIlI[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[4]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[5]]).right(this.j.getCurrentTask()).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llllllIIIIlI[6] + llllllIIIIlI[7], llllllIIIIlI[1]));
        return super.render(graphics2D);
    }
}
