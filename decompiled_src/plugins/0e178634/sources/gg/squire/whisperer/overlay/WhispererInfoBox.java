package gg.squire.whisperer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.whisperer.SquireWhisperer;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.C0000a;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.C0003d;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.j;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.p;
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:gg/squire/whisperer/overlay/WhispererInfoBox.class */
public class WhispererInfoBox extends OverlayPanel {
    private final /* synthetic */ j v;
    private final /* synthetic */ TaskManager s;
    private final /* synthetic */ SquireWhisperer q;
    private final /* synthetic */ C0000a u;
    private static /* synthetic */ int[] lIlIlllIIllIl;
    private static /* synthetic */ String[] lIlIlllIIlIIl;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ C0003d f0r;
    private final /* synthetic */ p t;

    private static void llIIIIlIIIlIlIl() {
        lIlIlllIIlIIl = new String[lIlIlllIIllIl[11]];
        lIlIlllIIlIIl[lIlIlllIIllIl[0]] = llIIIIlIIIIllII("Z41I2hGfZH9MNKSbknXUCnI7b43j/rEx", "TCTWP");
        lIlIlllIIlIIl[lIlIlllIIllIl[4]] = llIIIIlIIIIllIl("JDQ6ABsdP3I=", "rQHsr");
        lIlIlllIIlIIl[lIlIlllIIllIl[5]] = llIIIIlIIIIlllI("4P50dWbhPCQ=", "ZNAHH");
        lIlIlllIIlIIl[lIlIlllIIllIl[6]] = llIIIIlIIIIlllI("CzJ2yN0mfWLw9dUOMIMqrg==", "UaEci");
        lIlIlllIIlIIl[lIlIlllIIllIl[7]] = llIIIIlIIIIllII("mFRlvrS30WU33acxbwHRkQ==", "sQGJA");
        lIlIlllIIlIIl[lIlIlllIIllIl[8]] = llIIIIlIIIIllII("FiJ/A9bjO20=", "IzVpZ");
        lIlIlllIIlIIl[lIlIlllIIllIl[9]] = llIIIIlIIIIllIl("LhIWPCACFEI=", "lsxWI");
        lIlIlllIIlIIl[lIlIlllIIllIl[10]] = llIIIIlIIIIlllI("3+CC1smPLXj6yKUkmUNDJVJCGc0cFLlx", "yZoqT");
    }

    public long d(int i) {
        Duration between = Duration.between(this.q.getStarted(), Instant.now());
        if (llIIIIlIIlIIIlI(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean llIIIIlIIlIIIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public WhispererInfoBox(SquireWhisperer squireWhisperer, C0003d c0003d, p pVar, C0000a c0000a, j jVar) {
        this.q = squireWhisperer;
        this.f0r = c0003d;
        this.s = squireWhisperer.getManager();
        this.t = pVar;
        this.u = c0000a;
        this.v = jVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPriority(OverlayPriority.MED);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIIIlIIlIIIIl(this.q.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        String str = lIlIlllIIlIIl[lIlIlllIIllIl[0]];
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(str).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIlllIIllIl[2] + lIlIlllIIllIl[3], lIlIlllIIllIl[0]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[4]]).right(lIlIlllIIlIIl[lIlIlllIIllIl[5]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[6]]).right(Time.format(Duration.between(this.q.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[7]]).right(this.s.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[8]]).right(String.valueOf(this.q.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[9]]).right(String.valueOf(this.u.b())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[10]]).right(String.valueOf(this.v.q())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String llIIIIlIIIIllII(String llllllllllllllIllIlIIIIIIIllIIll, String llllllllllllllIllIlIIIIIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlllIIllIl[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIIllIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIIIIllIlII) {
            llllllllllllllIllIlIIIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlIIIII() {
        lIlIlllIIllIl = new int[12];
        lIlIlllIIllIl[0] = (44 ^ 116) & ((111 ^ 55) ^ (-1));
        lIlIlllIIllIl[1] = (((100 + 115) - 30) + 20) ^ (((172 + 86) - 196) + 137);
        lIlIlllIIllIl[2] = ((140 + 68) - 156) + 141;
        lIlIlllIIllIl[3] = (((135 + 76) - 90) + 55) ^ (((64 + 64) - 37) + 73);
        lIlIlllIIllIl[4] = " ".length();
        lIlIlllIIllIl[5] = "  ".length();
        lIlIlllIIllIl[6] = "   ".length();
        lIlIlllIIllIl[7] = (87 ^ 66) ^ (79 ^ 94);
        lIlIlllIIllIl[8] = 178 ^ 183;
        lIlIlllIIllIl[9] = (((7 + 130) - 41) + 84) ^ (((128 + 96) - 60) + 14);
        lIlIlllIIllIl[10] = (128 ^ 160) ^ (110 ^ 73);
        lIlIlllIIllIl[11] = 8 ^ 0;
    }

    private static String llIIIIlIIIIlllI(String llllllllllllllIllIlIIIIIIlIllIII, String llllllllllllllIllIlIIIIIIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIIIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIIIlIllIlI.init(lIlIlllIIllIl[5], llllllllllllllIllIlIIIIIIlIllIll);
            return new String(llllllllllllllIllIlIIIIIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIIIlIllIIl) {
            llllllllllllllIllIlIIIIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIIlIIIIllIl(String llllllllllllllIllIlIIIIIIlIIlIII, String llllllllllllllIllIlIIIIIIlIIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIIIIlIIIllI = new StringBuilder();
        char[] llllllllllllllIllIlIIIIIIlIIIlIl = llllllllllllllIllIlIIIIIIlIIIlll.toCharArray();
        int llllllllllllllIllIlIIIIIIlIIIlII = lIlIlllIIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIIllIl[0];
        while (llIIIIlIIlIIIll(i, length)) {
            char llllllllllllllIllIlIIIIIIlIIlIIl = charArray[i];
            llllllllllllllIllIlIIIIIIlIIIllI.append((char) (llllllllllllllIllIlIIIIIIlIIlIIl ^ llllllllllllllIllIlIIIIIIlIIIlIl[llllllllllllllIllIlIIIIIIlIIIlII % llllllllllllllIllIlIIIIIIlIIIlIl.length]));
            "".length();
            llllllllllllllIllIlIIIIIIlIIIlII++;
            i++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIIIIIlIIIllI);
    }

    static {
        llIIIIlIIlIIIII();
        llIIIIlIIIlIlIl();
    }

    private static boolean llIIIIlIIlIIIlI(int i) {
        return i == 0;
    }

    private static boolean llIIIIlIIlIIIIl(int i) {
        return i != 0;
    }
}
