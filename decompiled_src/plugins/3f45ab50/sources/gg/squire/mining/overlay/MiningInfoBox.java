package gg.squire.mining.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
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
import m.e.i.q.u.r.p000.n.s.e.r.i.EnumC0000a;
import m.e.i.q.u.r.p000.n.s.e.r.i.T;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:gg/squire/mining/overlay/MiningInfoBox.class */
public class MiningInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireMinerConfig n;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ TaskManager f0m;
    private final /* synthetic */ SquireMiner l;
    private static /* synthetic */ int[] lllllIllIIll;
    private static /* synthetic */ String[] lllllIlIlIIl;
    private final /* synthetic */ T o;

    private static boolean lIIlIIlllIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlllIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIllIlIllII(String lllllllllllllllIIlIIlIIllIIIlIll, String lllllllllllllllIIlIIlIIllIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIllIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllllIllIIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIllIIll[2], lllllllllllllllIIlIIlIIllIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIllIIIllII) {
            lllllllllllllllIIlIIlIIllIIIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllIIllII() {
        lllllIlIlIIl = new String[lllllIllIIll[14]];
        lllllIlIlIIl[lllllIllIIll[0]] = lIIlIIllIlIlIll("GishLB4sehksAiwo", "IZTEl");
        lllllIlIlIIl[lllllIllIIll[1]] = lIIlIIllIlIllII("UDEjFL/7twA=", "yJEZn");
        lllllIlIlIIl[lllllIllIIll[2]] = lIIlIIllIlIlIll("JzYzHi8ePQ==", "qSAmF");
        lllllIlIlIIl[lllllIllIIll[3]] = lIIlIIllIlIllIl("Q8gMUu5TLV8=", "OKijU");
        lllllIlIlIIl[lllllIllIIll[4]] = lIIlIIllIlIllII("HB+IxjNbsgA=", "KizxD");
        lllllIlIlIIl[lllllIllIIll[7]] = lIIlIIllIlIllII("adzXfFD8Y9/nAE5J42Ywfw==", "eprmp");
        lllllIlIlIIl[lllllIllIIll[8]] = lIIlIIllIlIlIll("XS1GD1FdLUYPUV0t", "xIfsq");
        lllllIlIlIIl[lllllIllIIll[9]] = lIIlIIllIlIlIll("CTsxDVcpMygDTXo=", "ZZRfw");
        lllllIlIlIIl[lllllIllIIll[10]] = lIIlIIllIlIllIl("U38Q5d2VavJQ/rokXXKWTA==", "tpYHq");
        lllllIlIlIIl[lllllIllIIll[11]] = lIIlIIllIlIlIll("AhkCIA8=", "OplEk");
        lllllIlIlIIl[lllllIllIIll[12]] = lIIlIIllIlIlIll("HzovDTA=", "RSAhT");
        lllllIlIlIIl[lllllIllIIll[13]] = lIIlIIllIlIllII("9K7KGyNSpPI0FKLXaBLQUg==", "aNPDW");
    }

    public long a(int i) {
        Duration between = Duration.between(this.l.getStarted(), Instant.now());
        if (lIIlIIlllIlIIII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static String lIIlIIllIlIlIll(String lllllllllllllllIIlIIlIIllIlIIIII, String lllllllllllllllIIlIIlIIllIIlllll) {
        String lllllllllllllllIIlIIlIIllIlIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIlIIllIIlllIl = lllllllllllllllIIlIIlIIllIIlllll.toCharArray();
        int lllllllllllllllIIlIIlIIllIIlllII = lllllIllIIll[0];
        char[] charArray = lllllllllllllllIIlIIlIIllIlIIIII2.toCharArray();
        int length = charArray.length;
        int i = lllllIllIIll[0];
        while (lIIlIIlllIlIIIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlIIlIIllIIlllIl[lllllllllllllllIIlIIlIIllIIlllII % lllllllllllllllIIlIIlIIllIIlllIl.length]));
            "".length();
            lllllllllllllllIIlIIlIIllIIlllII++;
            i++;
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlllIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIIlIIlllIIllIl();
        lIIlIIlllIIllII();
    }

    private static String lIIlIIllIlIllIl(String lllllllllllllllIIlIIlIIllIllIIII, String lllllllllllllllIIlIIlIIllIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIllIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIllIllIIlI.init(lllllIllIIll[2], secretKeySpec);
            return new String(lllllllllllllllIIlIIlIIllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIllIllIIIl) {
            lllllllllllllllIIlIIlIIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private void b(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[11]]).right(String.valueOf(this.l.b())).build());
        "".length();
    }

    private void c(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[12]]).right(String.valueOf(this.l.b())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[13]]).right(String.valueOf(a(this.l.b()))).build());
        "".length();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIlIIlllIIlllI(this.l.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.l.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllIlIlIIl[lllllIllIIll[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[2]]).right(lllllIlIlIIl[lllllIllIIll[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[4]]).right(this.f0m.getCurrentTask()).build());
        "".length();
        if (lIIlIIlllIIllll(this.n.activity(), EnumC0000a.GRANITE)) {
            c(graphics2D);
        }
        if (lIIlIIlllIIllll(this.n.activity(), EnumC0000a.SANDSTONE)) {
            b(graphics2D);
            "".length();
            if (0 != 0) {
                return null;
            }
        } else if (lIIlIIlllIIllll(this.n.activity(), EnumC0000a.MOTHERLODE_MINE)) {
            a(graphics2D);
        }
        this.panelComponent.setPreferredSize(new Dimension(lllllIllIIll[5] + lllllIllIIll[6], lllllIllIIll[0]));
        return super.render(graphics2D);
    }

    private static void lIIlIIlllIIllIl() {
        lllllIllIIll = new int[15];
        lllllIllIIll[0] = (97 ^ 63) & ((120 ^ 38) ^ (-1));
        lllllIllIIll[1] = " ".length();
        lllllIllIIll[2] = "  ".length();
        lllllIllIIll[3] = "   ".length();
        lllllIllIIll[4] = (((186 + 183) - 320) + 142) ^ (((185 + 147) - 248) + 103);
        lllllIllIIll[5] = (-((-11) & 28255)) & (-170) & 28671;
        lllllIllIIll[6] = 159 ^ 139;
        lllllIllIIll[7] = 24 ^ 29;
        lllllIllIIll[8] = 1 ^ 7;
        lllllIllIIll[9] = (231 ^ 189) ^ (47 ^ 114);
        lllllIllIIll[10] = 95 ^ 87;
        lllllIllIIll[11] = (((102 + 33) - 9) + 5) ^ (((125 + 35) - 38) + 16);
        lllllIllIIll[12] = (((29 + 132) - 27) + 22) ^ (((134 + 80) - 151) + 87);
        lllllIllIIll[13] = (((90 + 67) - 115) + 163) ^ (((63 + 126) - 23) + 32);
        lllllIllIIll[14] = (241 ^ 151) ^ (71 ^ 45);
    }

    private static boolean lIIlIIlllIIlllI(int i) {
        return i != 0;
    }

    @Inject
    private MiningInfoBox(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig, T t) {
        this.l = squireMiner;
        this.f0m = squireMiner.getManager();
        this.n = squireMinerConfig;
        this.o = t;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private void a(Graphics2D graphics2D) {
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[7]]);
        String str = lllllIlIlIIl[lllllIllIIll[8]];
        Object[] objArr = new Object[lllllIllIIll[3]];
        objArr[lllllIllIIll[0]] = Integer.valueOf(this.o.C());
        objArr[lllllIllIIll[1]] = Integer.valueOf(this.o.N());
        objArr[lllllIllIIll[2]] = Integer.valueOf(this.o.M());
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[9]]).right(String.valueOf(this.o.H())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[10]]).right(String.valueOf(this.o.O())).build());
        "".length();
    }
}
