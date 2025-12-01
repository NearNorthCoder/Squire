package gg.squire.scurrius.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.b;
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:gg/squire/scurrius/overlay/SquireScurriusBox.class */
public class SquireScurriusBox extends OverlayPanel {
    private final /* synthetic */ SquireScurriusConfig K;
    private static /* synthetic */ int[] lIIlIllIIlIII;
    private static /* synthetic */ String[] lIIlIllIIIlll;
    private /* synthetic */ b c;
    private final /* synthetic */ SquireScurrius I;
    private final /* synthetic */ TaskManager J;

    @Inject
    public SquireScurriusBox(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar) {
        this.I = squireScurrius;
        this.J = squireScurrius.getManager();
        this.K = squireScurriusConfig;
        this.c = bVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIllIIllIlIll(int i) {
        return i == 0;
    }

    private static void lIlIllIIllIlIII() {
        lIIlIllIIIlll = new String[lIIlIllIIlIII[8]];
        lIIlIllIIIlll[lIIlIllIIlIII[1]] = lIlIllIIllIIlIl("gmV2aoavUEmR8VHsmhqC4w==", "ZLFYO");
        lIIlIllIIIlll[lIIlIllIIlIII[4]] = lIlIllIIllIIllI("CHi4P1dliQLcmuCh8S6IYA==", "kYjju");
        lIIlIllIIIlll[lIIlIllIIlIII[5]] = lIlIllIIllIIlll("GRMZPjJoWg==", "RzuRA");
        lIIlIllIIIlll[lIIlIllIIlIII[6]] = lIlIllIIllIIlIl("KVIG4gGBUnDK8XIB6C0dWA==", "YohuR");
        lIIlIllIIIlll[lIIlIllIIlIII[7]] = lIlIllIIllIIlll("ASo1GkA=", "UKFqz");
    }

    private static String lIlIllIIllIIlll(String llllllllllllllIllllIlIlllIIllllI, String llllllllllllllIllllIlIlllIIlllIl) {
        String llllllllllllllIllllIlIlllIIllllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIlIlllIIllIll = llllllllllllllIllllIlIlllIIlllIl.toCharArray();
        int llllllllllllllIllllIlIlllIIllIlI = lIIlIllIIlIII[1];
        char[] charArray = llllllllllllllIllllIlIlllIIllllI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIllIIlIII[1];
        while (lIlIllIIllIllII(i, length)) {
            char llllllllllllllIllllIlIlllIIlllll = charArray[i];
            sb.append((char) (llllllllllllllIllllIlIlllIIlllll ^ llllllllllllllIllllIlIlllIIllIll[llllllllllllllIllllIlIlllIIllIlI % llllllllllllllIllllIlIlllIIllIll.length]));
            "".length();
            llllllllllllllIllllIlIlllIIllIlI++;
            i++;
            "".length();
            if (((56 ^ 62) & ((0 ^ 6) ^ (-1))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIllIIllIlIIl() {
        lIIlIllIIlIII = new int[10];
        lIIlIllIIlIII[0] = 69 ^ 79;
        lIIlIllIIlIII[1] = (60 ^ 3) & ((78 ^ 113) ^ (-1));
        lIIlIllIIlIII[2] = (((108 ^ 58) + (40 ^ 63)) - (-(172 ^ 162))) + (204 ^ 138);
        lIIlIllIIlIII[3] = 60 ^ 40;
        lIIlIllIIlIII[4] = " ".length();
        lIIlIllIIlIII[5] = "  ".length();
        lIIlIllIIlIII[6] = "   ".length();
        lIIlIllIIlIII[7] = (228 ^ 136) ^ (233 ^ 129);
        lIIlIllIIlIII[8] = (38 ^ 44) ^ (10 ^ 5);
        lIIlIllIIlIII[9] = 56 ^ 48;
    }

    public double c(int i) {
        Duration between = Duration.between(this.I.getStarted(), Instant.now());
        if (lIlIllIIllIlIll(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static String lIlIllIIllIIlIl(String llllllllllllllIllllIlIlllIlllIll, String llllllllllllllIllllIlIlllIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), lIIlIllIIlIII[9]), "DES");
            Cipher llllllllllllllIllllIlIlllIllllIl = Cipher.getInstance("DES");
            llllllllllllllIllllIlIlllIllllIl.init(lIIlIllIIlIII[5], secretKeySpec);
            return new String(llllllllllllllIllllIlIlllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlllIllllII) {
            llllllllllllllIllllIlIlllIllllII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIllIIllIlIlI(this.I.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlIllIIlIII[0], lIIlIllIIlIII[0], lIIlIllIIlIII[0], lIIlIllIIlIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIllIIIlll[lIIlIllIIlIII[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIlIllIIlIII[2] + lIIlIllIIlIII[3], lIIlIllIIlIII[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[4]]).right(Time.format(Duration.between(this.I.getStarted(), Instant.now()))).build());
        "".length();
        int l = this.I.l();
        double c = c(l);
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[5]]);
        String str = lIIlIllIIIlll[lIIlIllIIlIII[6]];
        Object[] objArr = new Object[lIIlIllIIlIII[5]];
        objArr[lIIlIllIIlIII[1]] = Integer.valueOf(l);
        objArr[lIIlIllIIlIII[4]] = Double.valueOf(c);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[7]]).right(this.J.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.I.j()).left("Banking: " + this.I.m()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean lIlIllIIllIlIlI(int i) {
        return i != 0;
    }

    public long b(int i) {
        Duration between = Duration.between(this.I.getStarted(), Instant.now());
        if (lIlIllIIllIlIll(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    static {
        lIlIllIIllIlIIl();
        lIlIllIIllIlIII();
    }

    private static boolean lIlIllIIllIllII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIIllIIllI(String llllllllllllllIllllIlIlllIlIlllI, String llllllllllllllIllllIlIlllIlIllIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllIIlIII[5], llllllllllllllIllllIlIlllIllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlllIlIllll) {
            llllllllllllllIllllIlIlllIlIllll.printStackTrace();
            return null;
        }
    }
}
