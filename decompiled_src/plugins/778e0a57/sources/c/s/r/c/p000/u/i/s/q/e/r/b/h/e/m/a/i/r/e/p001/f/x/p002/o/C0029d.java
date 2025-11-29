package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
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
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.client.game.WorldService;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/d.class */
public class C0029d extends OverlayPanel {
    private static final /* synthetic */ int s;
    private final /* synthetic */ SquireChambersConfig w;
    private static final /* synthetic */ String t;
    private final /* synthetic */ Client u;
    private final /* synthetic */ SquireChambersPlugin v;
    private /* synthetic */ boolean y;
    private final /* synthetic */ WorldService x;
    private static /* synthetic */ String[] lIlIIlIlIllI;
    private static /* synthetic */ int[] lIlIIlIlIlll;

    private static void llIllIIlIllIII() {
        lIlIIlIlIllI = new String[lIlIIlIlIlll[16]];
        lIlIIlIlIllI[lIlIIlIlIlll[0]] = llIllIIlIlIlIl("hsxPvU4yA8QL+PWgd+BSxw==", "yybGX");
        lIlIIlIlIllI[lIlIIlIlIlll[1]] = llIllIIlIlIlIl("QYhFgohBeatwa5cTF6uqCw==", "gnHXl");
        lIlIIlIlIllI[lIlIIlIlIlll[3]] = llIllIIlIlIllI("FDAZDT0iYS8MLiojCRY8", "GAldO");
        lIlIIlIlIllI[lIlIIlIlIlll[6]] = llIllIIlIlIlIl("UzqQDrbINEKcf8Qh7nIhxQ==", "lpXhL");
        lIlIIlIlIllI[lIlIIlIlIlll[7]] = llIllIIlIlIlll("YB4zeRpcddY=", "YLzlT");
        lIlIIlIlIllI[lIlIIlIlIlll[8]] = llIllIIlIlIlll("37IX2vPG8xPOIsrmIJepZg==", "thKjW");
        lIlIIlIlIllI[lIlIIlIlIlll[9]] = llIllIIlIlIlll("JPPRDB/2YJk=", "wOvWT");
        lIlIIlIlIllI[lIlIIlIlIlll[10]] = llIllIIlIlIlIl("OY60JF8fhzo=", "QLFlc");
        lIlIIlIlIllI[lIlIIlIlIlll[11]] = llIllIIlIlIllI("UgNsXFZZVipbG14=", "wgLts");
        lIlIIlIlIllI[lIlIIlIlIlll[12]] = llIllIIlIlIlll("fcOxKcbpnwpE1reEp5SSPA==", "vmCYU");
        lIlIIlIlIllI[lIlIIlIlIlll[2]] = llIllIIlIlIlll("QYSlNaFgp+04lYCB8GD23Q==", "iXRjc");
        lIlIIlIlIllI[lIlIIlIlIlll[14]] = llIllIIlIlIllI("", "BsBWa");
        lIlIIlIlIllI[lIlIIlIlIlll[15]] = llIllIIlIlIlll("f2LLFyjee0paHqw4bt8egQ==", "KcsiV");
    }

    static {
        llIllIIlIllIIl();
        llIllIIlIllIII();
        s = lIlIIlIlIlll[0];
        t = lIlIIlIlIllI[lIlIIlIlIlll[15]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    private C0029d(Client client, SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, WorldService worldService) {
        super(squireChambersPlugin);
        this.y = lIlIIlIlIlll[0];
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPriority(OverlayPriority.LOW);
        this.u = client;
        this.v = squireChambersPlugin;
        this.w = squireChambersConfig;
        this.x = worldService;
        addMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, lIlIIlIlIllI[lIlIIlIlIlll[0]], lIlIIlIlIllI[lIlIIlIlIlll[1]]);
        "".length();
    }

    public long d(int i) {
        Duration between = Duration.between(this.v.getStarted(), Instant.now());
        if (llIllIIlIllIll(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIllIIlIllIlI(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIIlIlIlll[2], lIlIIlIlIlll[2], lIlIIlIlIlll[2], lIlIIlIlIlll[2]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIlIlIllI[lIlIIlIlIlll[3]]).build());
        "".length();
        int lllllllllllllllIllIllIlIIIlIIllI = lIlIIlIlIlll[4];
        this.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIllIllIlIIIlIIllI + lIlIIlIlIlll[5], lIlIIlIlIlll[0]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[6]]).right(lIlIIlIlIllI[lIlIIlIlIlll[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[8]]).right(Time.format(Duration.between(this.v.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[9]]).right(this.v.getManager().getCurrentTask()).build());
        "".length();
        if (llIllIIlIllIll(this.w.extraInfo() ? 1 : 0)) {
            return super.render(graphics2D);
        }
        double e = e(this.v.B().W());
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[10]]);
        String str = lIlIIlIlIllI[lIlIIlIlIlll[11]];
        Object[] objArr = new Object[lIlIIlIlIlll[3]];
        objArr[lIlIIlIlIlll[0]] = Integer.valueOf(this.v.B().W());
        objArr[lIlIIlIlIlll[1]] = Double.valueOf(e);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        long d = d(this.v.B().U());
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[12]]);
        String str2 = lIlIIlIlIllI[lIlIIlIlIlll[2]];
        Object[] objArr2 = new Object[lIlIIlIlIlll[3]];
        objArr2[lIlIIlIlIlll[0]] = Integer.valueOf(this.v.B().U() / lIlIIlIlIlll[13]);
        objArr2[lIlIIlIlIlll[1]] = Long.valueOf(d / 1000);
        children2.add(left2.right(String.format(str2, objArr2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Left HP: " + this.v.y().aG()).right("Right HP: " + this.v.y().aH()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Private Storage: " + D.bC().bF().size()).right(lIlIIlIlIllI[lIlIIlIlIlll[14]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Kindling dep: " + this.v.K()).right("Grubs dep: " + this.v.J()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean llIllIIlIlllII(int i, int i2) {
        return i < i2;
    }

    public boolean p() {
        return this.y;
    }

    private static String llIllIIlIlIllI(String lllllllllllllllIllIllIlIIIIIllII, String lllllllllllllllIllIllIlIIIIIlIll) {
        String lllllllllllllllIllIllIlIIIIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIlIIIIIlIlI = new StringBuilder();
        char[] lllllllllllllllIllIllIlIIIIIlIIl = lllllllllllllllIllIllIlIIIIIlIll.toCharArray();
        int lllllllllllllllIllIllIlIIIIIlIII = lIlIIlIlIlll[0];
        char[] charArray = lllllllllllllllIllIllIlIIIIIllII2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIllIllIlIIIIIIIII = lIlIIlIlIlll[0];
        while (llIllIIlIlllII(lllllllllllllllIllIllIlIIIIIIIII, length)) {
            char lllllllllllllllIllIllIlIIIIIllIl = charArray[lllllllllllllllIllIllIlIIIIIIIII];
            lllllllllllllllIllIllIlIIIIIlIlI.append((char) (lllllllllllllllIllIllIlIIIIIllIl ^ lllllllllllllllIllIllIlIIIIIlIIl[lllllllllllllllIllIllIlIIIIIlIII % lllllllllllllllIllIllIlIIIIIlIIl.length]));
            "".length();
            lllllllllllllllIllIllIlIIIIIlIII++;
            lllllllllllllllIllIllIlIIIIIIIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllIlIIIIIlIlI);
    }

    private static String llIllIIlIlIlll(String lllllllllllllllIllIllIIlllllIlll, String lllllllllllllllIllIllIIlllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIlllllIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlll[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIllllllIII) {
            lllllllllllllllIllIllIIllllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlIllIlI(int i) {
        return i != 0;
    }

    private static String llIllIIlIlIlIl(String lllllllllllllllIllIllIIllllIlIlI, String lllllllllllllllIllIllIIllllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIlIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIllllIlIll) {
            lllllllllllllllIllIllIIllllIlIll.printStackTrace();
            return null;
        }
    }

    private static void llIllIIlIllIIl() {
        lIlIIlIlIlll = new int[17];
        lIlIIlIlIlll[0] = (28 ^ 44) & ((132 ^ 180) ^ (-1));
        lIlIIlIlIlll[1] = " ".length();
        lIlIIlIlIlll[2] = (91 ^ 76) ^ (171 ^ 182);
        lIlIIlIlIlll[3] = "  ".length();
        lIlIIlIlIlll[4] = ((13 + 172) - 154) + 162;
        lIlIIlIlIlll[5] = 83 ^ 71;
        lIlIIlIlIlll[6] = "   ".length();
        lIlIIlIlIlll[7] = (((98 + 13) - (-23)) + 36) ^ (((77 + 47) - 94) + 144);
        lIlIIlIlIlll[8] = (115 ^ 26) ^ (66 ^ 46);
        lIlIIlIlIlll[9] = 185 ^ 191;
        lIlIIlIlIlll[10] = 86 ^ 81;
        lIlIIlIlIlll[11] = (99 ^ 124) ^ (121 ^ 110);
        lIlIIlIlIlll[12] = 207 ^ 198;
        lIlIIlIlIlll[13] = (-10241) & 11240;
        lIlIIlIlIlll[14] = 171 ^ 160;
        lIlIIlIlIlll[15] = (((176 + 79) - 158) + 90) ^ (((53 + 44) - (-63)) + 23);
        lIlIIlIlIlll[16] = 95 ^ 82;
    }

    private static boolean llIllIIlIllIll(int i) {
        return i == 0;
    }

    public double e(int i) {
        Duration between = Duration.between(this.v.getStarted(), Instant.now());
        if (llIllIIlIllIll(between.isZero() ? 1 : 0)) {
            return (i * Duration.ofHours(1L).toMillis()) / between.toMillis();
        }
        return 0.0d;
    }
}
