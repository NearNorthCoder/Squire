package gg.squire.vardorvis.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.C0004e;
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:gg/squire/vardorvis/overlay/SquireVardorvisBox.class */
public class SquireVardorvisBox extends OverlayPanel {
    private static /* synthetic */ String[] lIlIlIIlIllII;
    private final /* synthetic */ SquireVardorvisConfig ab;
    private final /* synthetic */ TaskManager aa;
    private final /* synthetic */ SquireVardorvis Z;
    private /* synthetic */ C0004e l;
    private static /* synthetic */ int[] lIlIlIIlIllIl;

    private static String lIllllIllllllIl(String llllllllllllllIllIlIllllIIIIllIl, String llllllllllllllIllIlIllllIIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllllIIIIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIllIl[10]), "DES");
            Cipher llllllllllllllIllIlIllllIIIIllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllllIIIIllll.init(lIlIlIIlIllIl[5], secretKeySpec);
            return new String(llllllllllllllIllIlIllllIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllllIIIIlllI) {
            llllllllllllllIllIlIllllIIIIlllI.printStackTrace();
            return null;
        }
    }

    static {
        lIlllllIIIIIIIl();
        lIlllllIIIIIIII();
    }

    private static String lIllllIlllllllI(String llllllllllllllIllIlIlllIlllIlIII, String llllllllllllllIllIlIlllIlllIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlIllIl[5], llllllllllllllIllIlIlllIlllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIlllIlIIl) {
            llllllllllllllIllIlIlllIlllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIIIIlII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public SquireVardorvisBox(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e) {
        this.Z = squireVardorvis;
        this.aa = squireVardorvis.getManager();
        this.ab = squireVardorvisConfig;
        this.l = c0004e;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIllllIllllllll(String llllllllllllllIllIlIlllIllllllIl, String llllllllllllllIllIlIlllIllllllII) {
        String llllllllllllllIllIlIlllIllllllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlllIlllllIll = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlllIllllllII.toCharArray();
        int llllllllllllllIllIlIlllIlllllIIl = lIlIlIIlIllIl[1];
        char[] charArray2 = llllllllllllllIllIlIlllIllllllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlIllIl[1];
        while (lIlllllIIIIIlII(i, length)) {
            llllllllllllllIllIlIlllIlllllIll.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIlIlllIlllllIIl % charArray.length]));
            "".length();
            llllllllllllllIllIlIlllIlllllIIl++;
            i++;
            "".length();
            if (((177 ^ 136) ^ (159 ^ 162)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlllIlllllIll);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlllllIIIIIIlI(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlIllIl[0], lIlIlIIlIllIl[0], lIlIlIIlIllIl[0], lIlIlIIlIllIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlIIlIllII[lIlIlIIlIllIl[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIlIIlIllIl[2] + lIlIlIIlIllIl[3], lIlIlIIlIllIl[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[4]]).right(Time.format(Duration.between(this.Z.getStarted(), Instant.now()))).build());
        "".length();
        int g = this.Z.g();
        double g2 = g(g);
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[5]]);
        String str = lIlIlIIlIllII[lIlIlIIlIllIl[6]];
        Object[] objArr = new Object[lIlIlIIlIllIl[5]];
        objArr[lIlIlIIlIllIl[1]] = Integer.valueOf(g);
        objArr[lIlIlIIlIllIl[4]] = Double.valueOf(g2);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[7]]).right(this.aa.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.Z.f()).left("Banking: " + this.Z.h()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[8]]).right(String.valueOf(this.Z.i())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void lIlllllIIIIIIII() {
        lIlIlIIlIllII = new String[lIlIlIIlIllIl[9]];
        lIlIlIIlIllII[lIlIlIIlIllIl[1]] = lIllllIllllllIl("C05y/FZSWy6xmKgm3jMnRnKO2XuMzfO+", "LhVXJ");
        lIlIlIIlIllII[lIlIlIIlIllIl[4]] = lIllllIllllllIl("L42rVUmabo9RNVfhFaRLqg==", "nvzUz");
        lIlIlIIlIllII[lIlIlIIlIllIl[5]] = lIllllIllllllIl("GJUb4WoYuNk=", "VAsZu");
        lIlIlIIlIllII[lIlIlIIlIllIl[6]] = lIllllIllllllIl("Cc6+/QswfCSMTVY6s/tDLw==", "NOCkO");
        lIlIlIIlIllII[lIlIlIIlIllIl[7]] = lIllllIlllllllI("WMzkoHuyUyA=", "XwumP");
        lIlIlIIlIllII[lIlIlIIlIllIl[8]] = lIllllIllllllll("LzMCHkM=", "kZgzy");
    }

    private static void lIlllllIIIIIIIl() {
        lIlIlIIlIllIl = new int[11];
        lIlIlIIlIllIl[0] = 62 ^ 52;
        lIlIlIIlIllIl[1] = ((((180 + 144) - 191) + 60) ^ (((5 + 101) - 64) + 97)) & (((((10 + 153) - 48) + 95) ^ (((97 + 70) - 128) + 113)) ^ (-" ".length()));
        lIlIlIIlIllIl[2] = ((145 + 79) - 86) + 55;
        lIlIlIIlIllIl[3] = "  ".length() ^ (87 ^ 65);
        lIlIlIIlIllIl[4] = " ".length();
        lIlIlIIlIllIl[5] = "  ".length();
        lIlIlIIlIllIl[6] = "   ".length();
        lIlIlIIlIllIl[7] = 130 ^ 134;
        lIlIlIIlIllIl[8] = 157 ^ 152;
        lIlIlIIlIllIl[9] = (((159 + 129) - 101) + 3) ^ (((152 + 109) - 78) + 1);
        lIlIlIIlIllIl[10] = 26 ^ 18;
    }

    public double g(int i) {
        Duration between = Duration.between(this.Z.getStarted(), Instant.now());
        if (lIlllllIIIIIIll(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }

    private static boolean lIlllllIIIIIIll(int i) {
        return i == 0;
    }

    private static boolean lIlllllIIIIIIlI(int i) {
        return i != 0;
    }

    public long f(int i) {
        Duration between = Duration.between(this.Z.getStarted(), Instant.now());
        if (lIlllllIIIIIIll(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }
}
