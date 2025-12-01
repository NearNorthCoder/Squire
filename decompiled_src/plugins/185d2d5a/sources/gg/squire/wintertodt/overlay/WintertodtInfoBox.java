package gg.squire.wintertodt.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.wintertodt.SquireWintertodt;
import gg.squire.wintertodt.SquireWintertodtConfig;
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
import net.runelite.api.Skill;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Skills;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.d;
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:gg/squire/wintertodt/overlay/WintertodtInfoBox.class */
public class WintertodtInfoBox extends OverlayPanel {
    private final /* synthetic */ b y;
    private final /* synthetic */ SquireWintertodtConfig w;
    private static /* synthetic */ String[] lIlIllllIIllI;
    private final /* synthetic */ SquireWintertodt v;
    private final /* synthetic */ TaskManager x;
    private static /* synthetic */ int[] lIlIllllIlIII;

    private static String llIIIIlIllIIlII(String llllllllllllllIllIIllllIIlIlllII, String llllllllllllllIllIIllllIIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllIIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllIIlIllllI.init(lIlIllllIlIII[3], llllllllllllllIllIIllllIIlIlllll);
            return new String(llllllllllllllIllIIllllIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIIlIlllIl) {
            llllllllllllllIllIIllllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIIIlIllIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.v.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIlIllllIlIII[0], lIlIllllIlIII[0], lIlIllllIlIII[0], lIlIllllIlIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIllllIIllI[lIlIllllIlIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[2]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[3]]).right(d.a(z()) + " (" + A() + "/hr)").build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIllllIlIII[4] + lIlIllllIlIII[5], lIlIllllIlIII[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[6]]).right(lIlIllllIIllI[lIlIllllIlIII[7]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[8]]).right(this.x.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[9]]).right(String.valueOf(this.y.i())).build());
        "".length();
        if (llIIIIlIllIllll(this.y.i() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[10]]).right(String.valueOf(this.y.f())).build());
            "".length();
            List children = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[11]]);
            String str = lIlIllllIIllI[lIlIllllIlIII[12]];
            Object[] objArr = new Object[lIlIllllIlIII[3]];
            objArr[lIlIllllIlIII[1]] = Integer.valueOf(this.y.p());
            objArr[lIlIllllIlIII[2]] = Integer.valueOf(this.w.foodAmount());
            children.add(left.right(String.format(str, objArr)).build());
            "".length();
        }
        return super.render(graphics2D);
    }

    private static void llIIIIlIllIlIll() {
        lIlIllllIIllI = new String[lIlIllllIlIII[0]];
        lIlIllllIIllI[lIlIllllIlIII[1]] = llIIIIlIllIIIIl("u02C12Hw3SCvV1sU7g+UO5WHWTCJ+gLC", "mySqo");
        lIlIllllIIllI[lIlIllllIlIII[2]] = llIIIIlIllIIlII("aVyEpkgFMp0=", "nlRGR");
        lIlIllllIIllI[lIlIllllIlIII[3]] = llIIIIlIllIIlII("AsdJQSOGkHpoJRH2T4a3CA==", "PquQH");
        lIlIllllIIllI[lIlIllllIlIII[6]] = llIIIIlIllIIIIl("meleH03IC3I=", "ChDUK");
        lIlIllllIIllI[lIlIllllIlIII[7]] = llIIIIlIllIIIIl("0w98l2zgk4c=", "jaJKQ");
        lIlIllllIIllI[lIlIllllIlIII[8]] = llIIIIlIllIIIIl("JCj3BCjCF4pca6jdh8IVkw==", "VeaGS");
        lIlIllllIIllI[lIlIllllIlIII[9]] = llIIIIlIllIIlII("MBQmgleWuqEfwV089ax0PrU1to+N2lMo", "faSiL");
        lIlIllllIIllI[lIlIllllIlIII[10]] = llIIIIlIllIIIIl("haHo12MfZAQ=", "HYwDl");
        lIlIllllIIllI[lIlIllllIlIII[11]] = llIIIIlIllIIIIl("84zjkyLglKA=", "bPnel");
        lIlIllllIIllI[lIlIllllIlIII[12]] = llIIIIlIllIlIlI("RyNmK2VHIw==", "bGFWE");
    }

    private int A() {
        Duration between = Duration.between(this.v.getStarted(), Instant.now());
        double millis = (between.toMillis() / 1000) / 3600.0d;
        return (llIIIIlIlllIIlI(between.isNegative() ? 1 : 0) && llIIIIlIllIllll(llIIIIlIlllIIIl(millis, 0.0d))) ? (int) Math.floor(z() / millis) : lIlIllllIlIII[1];
    }

    static {
        llIIIIlIllIllIl();
        llIIIIlIllIlIll();
    }

    private static String llIIIIlIllIIIIl(String llllllllllllllIllIIllllIIlIIllll, String llllllllllllllIllIIllllIIlIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllllIlIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllllIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIIlIlIIII) {
            llllllllllllllIllIIllllIIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static int llIIIIlIlllIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String llIIIIlIllIlIlI(String llllllllllllllIllIIllllIIlllIIIl, String llllllllllllllIllIIllllIIlllIIII) {
        String llllllllllllllIllIIllllIIlllIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllllIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIllllIIllIlllI = llllllllllllllIllIIllllIIlllIIII.toCharArray();
        int llllllllllllllIllIIllllIIllIllIl = lIlIllllIlIII[1];
        char[] charArray = llllllllllllllIllIIllllIIlllIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIllllIlIII[1];
        while (llIIIIlIlllIIll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIllllIIllIlllI[llllllllllllllIllIIllllIIllIllIl % llllllllllllllIllIIllllIIllIlllI.length]));
            "".length();
            llllllllllllllIllIIllllIIllIllIl++;
            i++;
            "".length();
            if (" ".length() == ((203 ^ 142) ^ (9 ^ 72))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIIlIlllIIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public WintertodtInfoBox(SquireWintertodt squireWintertodt, SquireWintertodtConfig squireWintertodtConfig, SquireWintertodt squireWintertodt2, b bVar) {
        this.v = squireWintertodt;
        this.w = squireWintertodtConfig;
        this.x = squireWintertodt2.getManager();
        this.y = bVar;
        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        setLayer(OverlayLayer.ALWAYS_ON_TOP);
        setPriority(OverlayPriority.MED);
    }

    private static boolean llIIIIlIllIllll(int i) {
        return i != 0;
    }

    private int z() {
        return Skills.getExperience(Skill.FIREMAKING) - this.v.a();
    }

    private static void llIIIIlIllIllIl() {
        lIlIllllIlIII = new int[13];
        lIlIllllIlIII[0] = 9 ^ 3;
        lIlIllllIlIII[1] = ((((23 + 167) - 49) + 43) ^ (((75 + 21) - (-19)) + 24)) & (((79 ^ 17) ^ (193 ^ 172)) ^ (-" ".length()));
        lIlIllllIlIII[2] = " ".length();
        lIlIllllIlIII[3] = "  ".length();
        lIlIllllIlIII[4] = (-((-11275) & 32511)) & (-8193) & 29686;
        lIlIllllIlIII[5] = 86 ^ 66;
        lIlIllllIlIII[6] = "   ".length();
        lIlIllllIlIII[7] = (((21 + 30) - (-101)) + 3) ^ (((133 + 25) - 74) + 75);
        lIlIllllIlIII[8] = 106 ^ 111;
        lIlIllllIlIII[9] = (((105 + 129) - 137) + 55) ^ (((110 + 115) - 155) + 88);
        lIlIllllIlIII[10] = 166 ^ 161;
        lIlIllllIlIII[11] = (((82 + 152) - 118) + 40) ^ (((68 + 73) - 66) + 73);
        lIlIllllIlIII[12] = 167 ^ 174;
    }

    private static boolean llIIIIlIlllIIlI(int i) {
        return i == 0;
    }
}
