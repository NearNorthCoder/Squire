package gg.squire.duke.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
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
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0000a;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:gg/squire/duke/overlay/SquireDukeSucellusInfoBox.class */
public class SquireDukeSucellusInfoBox extends OverlayPanel {
    private /* synthetic */ C0000a u;
    private static /* synthetic */ String[] lIllIlIIIlIl;
    private static /* synthetic */ int[] lIllIlIIIllI;
    private final /* synthetic */ TaskManager ad;
    private final /* synthetic */ SquireDukeSucellus ac;
    private final /* synthetic */ SquireDukeSucellusConfig ae;

    private static void lllIIllIlllIIl() {
        lIllIlIIIlIl = new String[lIllIlIIIllI[8]];
        lIllIlIIIlIl[lIllIlIIIllI[1]] = lllIIllIllIllI("rXvsqaiQNTqkBrd7BPrMaewiOJ3vevLp", "WvXeK");
        lIllIlIIIlIl[lIllIlIIIllI[4]] = lllIIllIllIllI("ZloP3saGColNSsOQJLSuvw==", "CYzAo");
        lIllIlIIIlIl[lIllIlIIIllI[5]] = lllIIllIllIlll("PhgjCwtPUQ==", "uqOgx");
        lIllIlIIIlIl[lIllIlIIIllI[6]] = lllIIllIllIlll("YQN5XUpqVj9aB20=", "DgYuo");
        lIllIlIIIlIl[lIllIlIIIllI[7]] = lllIIllIlllIII("NXq13ZUEb1o=", "iHFBw");
    }

    public long e(int i) {
        Duration between = Duration.between(this.ac.getStarted(), Instant.now());
        if (lllIIllIllllII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lllIIllIlllIll(int i) {
        return i != 0;
    }

    public double f(int i) {
        Duration between = Duration.between(this.ac.getStarted(), Instant.now());
        if (lllIIllIllllII(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static boolean lllIIllIllllIl(int i, int i2) {
        return i < i2;
    }

    private static String lllIIllIlllIII(String lllllllllllllllIlIllllllIlIIIlII, String lllllllllllllllIlIllllllIlIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIllllllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllllIlIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllllIlIIIllI.init(lIllIlIIIllI[5], lllllllllllllllIlIllllllIlIIIlll);
            return new String(lllllllllllllllIlIllllllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllllIlIIIlIl) {
            lllllllllllllllIlIllllllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIllIllI(String lllllllllllllllIlIllllllIIllIlll, String lllllllllllllllIlIllllllIIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllIIllIllI.getBytes(StandardCharsets.UTF_8)), lIllIlIIIllI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIIllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllllIIlllIII) {
            lllllllllllllllIlIllllllIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIllIlll(String lllllllllllllllIlIllllllIlIlIlII, String lllllllllllllllIlIllllllIlIllIII) {
        String lllllllllllllllIlIllllllIlIlIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllllIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllllllIlIlIllI = lllllllllllllllIlIllllllIlIllIII.toCharArray();
        int lllllllllllllllIlIllllllIlIlIlIl = lIllIlIIIllI[1];
        char[] charArray = lllllllllllllllIlIllllllIlIlIlII2.toCharArray();
        int length = charArray.length;
        int i = lIllIlIIIllI[1];
        while (lllIIllIllllIl(i, length)) {
            char lllllllllllllllIlIllllllIlIllIlI = charArray[i];
            sb.append((char) (lllllllllllllllIlIllllllIlIllIlI ^ lllllllllllllllIlIllllllIlIlIllI[lllllllllllllllIlIllllllIlIlIlIl % lllllllllllllllIlIllllllIlIlIllI.length]));
            "".length();
            lllllllllllllllIlIllllllIlIlIlIl++;
            i++;
            "".length();
            if (((239 ^ 177) ^ (234 ^ 176)) == (((((17 + 119) - 10) + 12) ^ (((43 + 129) - 82) + 55)) & (((((113 + 96) - 67) + 12) ^ (((32 + 115) - 72) + 54)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllIIllIlllIlI() {
        lIllIlIIIllI = new int[10];
        lIllIlIIIllI[0] = (3 ^ 47) ^ (4 ^ 34);
        lIllIlIIIllI[1] = ((((57 + 10) - (-40)) + 47) ^ (((117 + 40) - 0) + 26)) & (((((54 + 66) - 23) + 43) ^ (((112 + 130) - 220) + 139)) ^ (-" ".length()));
        lIllIlIIIllI[2] = ((134 + 79) - 36) + 16;
        lIllIlIIIllI[3] = (((68 + 26) - (-11)) + 24) ^ (((56 + 47) - 40) + 86);
        lIllIlIIIllI[4] = " ".length();
        lIllIlIIIllI[5] = "  ".length();
        lIllIlIIIllI[6] = "   ".length();
        lIllIlIIIllI[7] = 173 ^ 169;
        lIllIlIIIllI[8] = (45 ^ 31) ^ (188 ^ 139);
        lIllIlIIIllI[9] = (((109 + 24) - 124) + 153) ^ (((53 + 147) - 89) + 59);
    }

    @Inject
    public SquireDukeSucellusInfoBox(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig, C0000a c0000a) {
        this.ac = squireDukeSucellus;
        this.ad = squireDukeSucellus.getManager();
        this.ae = squireDukeSucellusConfig;
        this.u = c0000a;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lllIIllIllllII(int i) {
        return i == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lllIIllIlllIll(this.ac.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIlIIIllI[0], lIllIlIIIllI[0], lIllIlIIIllI[0], lIllIlIIIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIlIIIlIl[lIllIlIIIllI[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIllIlIIIllI[2] + lIllIlIIIllI[3], lIllIlIIIllI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[4]]).right(Time.format(Duration.between(this.ac.getStarted(), Instant.now()))).build());
        "".length();
        int o = this.ac.o();
        double f = f(o);
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[5]]);
        String str = lIllIlIIIlIl[lIllIlIIIllI[6]];
        Object[] objArr = new Object[lIllIlIIIllI[5]];
        objArr[lIllIlIIIllI[1]] = Integer.valueOf(o);
        objArr[lIllIlIIIllI[4]] = Double.valueOf(f);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[7]]).right(this.ad.getCurrentTask()).build());
        "".length();
        int tickCount = Static.getClient().getTickCount();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Last spike: " + (tickCount - this.u.D())).right("Last Gaze: " + (tickCount - this.u.C())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.ac.l()).left("Banking: " + this.ac.p()).build());
        "".length();
        return super.render(graphics2D);
    }

    static {
        lllIIllIlllIlI();
        lllIIllIlllIIl();
    }
}
