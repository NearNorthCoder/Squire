package gg.squire.thieving;

import gg.squire.client.plugins.fw.TaskManager;
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
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0001b;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0003d;
@Singleton
/* loaded from: squire-thieving-0.0.1.jar:gg/squire/thieving/ThievingOverlayPanel.class */
public class ThievingOverlayPanel extends OverlayPanel {
    private final /* synthetic */ SquireThievingConfig n;
    private static /* synthetic */ String[] lIIllIllIllIl;
    private static /* synthetic */ int[] lIIllIllIlllI;
    private final /* synthetic */ SquireThieving m;

    static {
        lIllIIIllIIIIIl();
        lIllIIIllIIIIII();
    }

    private void a(Graphics2D graphics2D) {
        EnumC0003d b = this.m.b();
        if (lIllIIIllIIIllI(b)) {
            return;
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[12]]).right(b.v()).build());
        "".length();
    }

    private static String lIllIIIlIllllll(String llllllllllllllIlllIlllIlIIlllIIl, String llllllllllllllIlllIlllIlIIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIlIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIlIIlllIll.init(lIIllIllIlllI[5], llllllllllllllIlllIlllIlIIllllII);
            return new String(llllllllllllllIlllIlllIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlIIlllIlI) {
            llllllllllllllIlllIlllIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIIlII(Object obj) {
        return obj != null;
    }

    @Inject
    public ThievingOverlayPanel(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.m = squireThieving;
        this.n = squireThievingConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIllIIIllIIIIIl() {
        lIIllIllIlllI = new int[14];
        lIIllIllIlllI[0] = 164 ^ 174;
        lIIllIllIlllI[1] = (-((-16586) & 22751)) & (-25761) & 32183;
        lIIllIllIlllI[2] = (155 ^ 164) ^ (106 ^ 65);
        lIIllIllIlllI[3] = ((17 ^ 104) ^ (240 ^ 156)) & (((((52 + 75) - 10) + 12) ^ (((116 + 52) - 57) + 37)) ^ (-" ".length()));
        lIIllIllIlllI[4] = " ".length();
        lIIllIllIlllI[5] = "  ".length();
        lIIllIllIlllI[6] = "   ".length();
        lIIllIllIlllI[7] = 70 ^ 66;
        lIIllIllIlllI[8] = 26 ^ 31;
        lIIllIllIlllI[9] = 168 ^ 174;
        lIIllIllIlllI[10] = -" ".length();
        lIIllIllIlllI[11] = (33 ^ 108) ^ (95 ^ 21);
        lIIllIllIlllI[12] = (2 ^ 42) ^ (68 ^ 100);
        lIIllIllIlllI[13] = (82 ^ 19) ^ (241 ^ 185);
    }

    private static boolean lIllIIIllIIIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIllIIIlIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIIllIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIllIIIllIIIIII() {
        lIIllIllIllIl = new String[lIIllIllIlllI[13]];
        lIIllIllIllIl[lIIllIllIlllI[3]] = lIllIIIlIllllIl("CR8hIxo/TgAiAT8YPSQP", "ZnTJh");
        lIIllIllIllIl[lIIllIllIlllI[4]] = lIllIIIlIlllllI("ujLSP3zCZpGSJq4lgWfjHw==", "kOfSQ");
        lIIllIllIllIl[lIIllIllIlllI[5]] = lIllIIIlIlllllI("MQ5BzHQmI14=", "QhxBU");
        lIIllIllIllIl[lIIllIllIlllI[6]] = lIllIIIlIllllll("/cZuha/TeXH1aydACer8Vw==", "NQgqu");
        lIIllIllIllIl[lIIllIllIlllI[7]] = lIllIIIlIllllll("zeW2+Nxa0sg=", "bWdeH");
        lIIllIllIllIl[lIIllIllIlllI[8]] = lIllIIIlIllllll("gXVtvAAr3MM0QnFnXz5eHA==", "fTIRm");
        lIIllIllIllIl[lIIllIllIlllI[9]] = lIllIIIlIlllllI("yxLoA0bgmRk/nuplGzQ4Ug==", "CHkGj");
        lIIllIllIllIl[lIIllIllIlllI[11]] = lIllIIIlIllllll("7Na5oy29idCs08jCD9RK5w==", "jPVZj");
        lIIllIllIllIl[lIIllIllIlllI[12]] = lIllIIIlIlllllI("eUndm6KMcx8=", "OMJPw");
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIllIIIllIIIIlI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIllIllIlllI[0], lIIllIllIlllI[0], lIIllIllIlllI[0], lIIllIllIlllI[0]));
        this.panelComponent.setPreferredSize(new Dimension(lIIllIllIlllI[1] + lIIllIllIlllI[2], lIIllIllIlllI[3]));
        String llllllllllllllIlllIlllIlIllIllII = lIIllIllIllIl[lIIllIllIlllI[3]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllllllllllIlllIlllIlIllIllII).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[4]]).right(lIIllIllIllIl[lIIllIllIlllI[5]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[6]]).right(Time.format(Duration.between(this.m.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[7]]).right(this.n.method().toString()).build());
        "".length();
        if (lIllIIIllIIIIll(this.n.method(), EnumC0001b.PICKPOCKETING)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[8]]).right(String.valueOf(this.m.j())).build());
            "".length();
        }
        TaskManager manager = this.m.getManager();
        if (lIllIIIllIIIlII(manager)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[9]]).right(manager.getCurrentTask()).build());
            "".length();
            if (lIllIIIllIIIIll(this.n.method(), EnumC0001b.BLACK_JACK)) {
                a(graphics2D);
            }
        }
        if (lIllIIIllIIIIlI(this.m.e()) && lIllIIIllIIIlIl(this.m.e(), lIIllIllIlllI[10])) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[11]]).right(String.valueOf(this.m.e())).build());
            "".length();
        }
        return super.render(graphics2D);
    }

    private static String lIllIIIlIlllllI(String llllllllllllllIlllIlllIlIlIlllII, String llllllllllllllIlllIlllIlIlIlllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), lIIllIllIlllI[12]), "DES");
            Cipher llllllllllllllIlllIlllIlIllIIIII = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIlIllIIIII.init(lIIllIllIlllI[5], llllllllllllllIlllIlllIlIllIIIIl);
            return new String(llllllllllllllIlllIlllIlIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlIlIlllll) {
            llllllllllllllIlllIlllIlIlIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIllllIl(String llllllllllllllIlllIlllIlIlIIlllI, String llllllllllllllIlllIlllIlIlIIllIl) {
        String llllllllllllllIlllIlllIlIlIIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllIlIlIIllIl.toCharArray();
        int llllllllllllllIlllIlllIlIlIIlIlI = lIIllIllIlllI[3];
        char[] charArray2 = llllllllllllllIlllIlllIlIlIIlllI2.toCharArray();
        int llllllllllllllIlllIlllIlIlIIIIll = charArray2.length;
        int i = lIIllIllIlllI[3];
        while (lIllIIIllIIIlll(i, llllllllllllllIlllIlllIlIlIIIIll)) {
            char llllllllllllllIlllIlllIlIlIIllll = charArray2[i];
            sb.append((char) (llllllllllllllIlllIlllIlIlIIllll ^ charArray[llllllllllllllIlllIlllIlIlIIlIlI % charArray.length]));
            "".length();
            llllllllllllllIlllIlllIlIlIIlIlI++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIllIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIllIIIIlI(int i) {
        return i != 0;
    }
}
