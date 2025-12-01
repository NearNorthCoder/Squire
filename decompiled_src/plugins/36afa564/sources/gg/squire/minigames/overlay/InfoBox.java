package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireSorceressGarden;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
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
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:gg/squire/minigames/overlay/InfoBox.class */
public class InfoBox extends OverlayPanel {
    private final /* synthetic */ SquireSorceressGarden p;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIIllIIlIIlll;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ SquireSorceressGardenConfig f0r;
    private static /* synthetic */ String[] lIIllIIlIIlIl;

    public long n(int i) {
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        if (lIlIlllllIlllII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static void lIlIlllllIllIII() {
        lIIllIIlIIlIl = new String[lIIllIIlIIlll[19]];
        lIIllIIlIIlIl[lIIllIIlIIlll[1]] = lIlIlllllIlIIII("ByM8ECMxchoWIzc3OxwiJ3IOGCMwNyc=", "TRIyQ");
        lIIllIIlIIlIl[lIIllIIlIIlll[2]] = lIlIlllllIlIIII("GyEdIhskMQ==", "ITsVr");
        lIIllIIlIIlIl[lIIllIIlIIlll[3]] = lIlIlllllIlIIIl("2Qpa0SwBjJE=", "yLzJU");
        lIIllIIlIIlIl[lIIllIIlIIlll[4]] = lIlIlllllIlIIlI("DQwwqIgBDup2uvyQIqq7pTP42oX/ytL/", "hlzui");
        lIIllIIlIIlIl[lIIllIIlIIlll[5]] = lIlIlllllIlIIIl("4VieOh3bwaM=", "nniUZ");
        lIIllIIlIIlIl[lIIllIIlIIlll[6]] = lIlIlllllIlIIIl("jDpZp/XCf3tXNaSUV3bdMlgmbc0JTqxb", "loDuU");
        lIIllIIlIIlIl[lIIllIIlIIlll[7]] = lIlIlllllIlIIlI("BZivkh83bPNCLcNue4vVplalfHeLckXK", "vHwOk");
        lIIllIIlIIlIl[lIIllIIlIIlll[8]] = lIlIlllllIlIIlI("DczrFwIZHD5yLq+Gckey+A97kpVhBbsA", "dzMXD");
        lIIllIIlIIlIl[lIIllIIlIIlll[9]] = lIlIlllllIlIIIl("nmGVyAXDf+gvZZrqljvGVuWPIS+Ima39", "tFHTE");
        lIIllIIlIIlIl[lIIllIIlIIlll[10]] = lIlIlllllIlIIIl("4g0gB/OCPWGhBkrUT6JFlbtVccZSa9SrEY42stAcMgI=", "GcKow");
        lIIllIIlIIlIl[lIIllIIlIIlll[0]] = lIlIlllllIlIIlI("c7uVzCT7fzAAbNZqu8W7OMHn4L2lFjYT", "Qexem");
        lIIllIIlIIlIl[lIIllIIlIIlll[11]] = lIlIlllllIlIIlI("H12Y327ztHJ1Opo0QHfVavVzDZhCiwtT", "ywNkT");
        lIIllIIlIIlIl[lIIllIIlIIlll[12]] = lIlIlllllIlIIII("Ixk+CB8DC3AqAh0UNQoZFBxqSQ==", "qxPim");
        lIIllIIlIIlIl[lIIllIIlIIlll[13]] = lIlIlllllIlIIII("Ay00MDUlKWESKCQ2JDIzLT57cQ==", "HZAQG");
        lIIllIIlIIlIl[lIIllIIlIIlll[14]] = lIlIlllllIlIIIl("v+bD3gNIbKGZmcOOF0KPmsLXoq/mBhRY", "FBIfu");
        lIIllIIlIIlIl[lIIllIIlIIlll[15]] = lIlIlllllIlIIlI("iFE4FKpxnodGJJOZ+GXR0gWxG5IElIUs", "YMNiM");
        lIIllIIlIIlIl[lIIllIIlIIlll[16]] = lIlIlllllIlIIII("MTkVIB9VGRE3HQZuNz0VGSsXJhwRdFQ=", "uNtRy");
    }

    @Inject
    private InfoBox(SquireSorceressGarden squireSorceressGarden, SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.p = squireSorceressGarden;
        this.q = squireSorceressGarden.getManager();
        this.f0r = squireSorceressGardenConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIlIlllllIlIIlI(String llllllllllllllIllllIIIIllIllIIlI, String llllllllllllllIllllIIIIllIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIlIIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIllIllIIll) {
            llllllllllllllIllllIIIIllIllIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIlIIIl(String llllllllllllllIllllIIIIllIlIIlIl, String llllllllllllllIllllIIIIllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIllIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlll[9]), "DES");
            Cipher llllllllllllllIllllIIIIllIlIIlll = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIllIlIIlll.init(lIIllIIlIIlll[3], llllllllllllllIllllIIIIllIlIlIII);
            return new String(llllllllllllllIllllIIIIllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIllIlIIllI) {
            llllllllllllllIllllIIIIllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIlIIII(String llllllllllllllIllllIIIIlllIIIlll, String llllllllllllllIllllIIIIlllIIIllI) {
        String llllllllllllllIllllIIIIlllIIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIlllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIIlllIIIllI.toCharArray();
        int llllllllllllllIllllIIIIlllIIIIll = lIIllIIlIIlll[1];
        char[] charArray2 = llllllllllllllIllllIIIIlllIIIlll2.toCharArray();
        int llllllllllllllIllllIIIIllIllllII = charArray2.length;
        int i = lIIllIIlIIlll[1];
        while (lIlIlllllIlllIl(i, llllllllllllllIllllIIIIllIllllII)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIIIlllIIIIll % charArray.length]));
            "".length();
            llllllllllllllIllllIIIIlllIIIIll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllllIllIll(int i) {
        return i != 0;
    }

    static {
        lIlIlllllIllIlI();
        lIlIlllllIllIII();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIlllllIllIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlIIlIl[lIIllIIlIIlll[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[2]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[3]]).right(this.q.getCurrentTask()).build());
        "".length();
        if (lIlIlllllIlllII(this.f0r.pickHerbs() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[4]]).right(this.p.a() + " (" + n(this.p.a()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[5]]).right(NumberFormat.getIntegerInstance().format(n())).build());
            "".length();
            "".length();
            if (((66 ^ 24) & ((59 ^ 97) ^ (-1))) >= "  ".length()) {
                return null;
            }
        } else if (lIlIlllllIlllII(this.f0r.breakDownHerbs() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[6]]).right(this.p.b() + " (" + n(this.p.b()) + "/h)").build());
            "".length();
            "".length();
            if (((((66 + 72) - 116) + 109) ^ (((37 + 62) - 21) + 57)) <= 0) {
                return null;
            }
        } else {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[7]]).right(this.p.c() + " (" + n(this.p.c()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[8]]).right(this.p.d() + " (" + n(this.p.d()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[9]]).right(this.p.e() + " (" + n(this.p.e()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[10]]).right(this.p.f() + " (" + n(this.p.f()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[0]]).right(this.p.g() + " (" + n(this.p.g()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[11]]).right(this.p.h() + " (" + n(this.p.h()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[12]]).right(this.p.i() + " (" + n(this.p.i()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[13]]).right(this.p.j() + " (" + n(this.p.j()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[14]]).right(this.p.k() + " (" + n(this.p.k()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[15]]).right(this.p.l() + " (" + n(this.p.l()) + "/h)").build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[16]]).right(this.p.m() + " (" + n(this.p.m()) + "/h)").build());
            "".length();
        }
        this.panelComponent.setPreferredSize(new Dimension(lIIllIIlIIlll[17] + lIIllIIlIIlll[18], lIIllIIlIIlll[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIlllllIlllII(int i) {
        return i == 0;
    }

    public long n() {
        return ((int) n(this.p.a())) * 1500;
    }

    private static boolean lIlIlllllIlllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlllllIllIlI() {
        lIIllIIlIIlll = new int[20];
        lIIllIIlIIlll[0] = (((65 + 123) - 111) + 94) ^ (((133 + 29) - 68) + 67);
        lIIllIIlIIlll[1] = (147 ^ 186) & ((37 ^ 12) ^ (-1));
        lIIllIIlIIlll[2] = " ".length();
        lIIllIIlIIlll[3] = "  ".length();
        lIIllIIlIIlll[4] = "   ".length();
        lIIllIIlIIlll[5] = 94 ^ 90;
        lIIllIIlIIlll[6] = (42 ^ 3) ^ (125 ^ 81);
        lIIllIIlIIlll[7] = 192 ^ 198;
        lIIllIIlIIlll[8] = 104 ^ 111;
        lIIllIIlIIlll[9] = (0 ^ 87) ^ (38 ^ 121);
        lIIllIIlIIlll[10] = (67 ^ 46) ^ (50 ^ 86);
        lIIllIIlIIlll[11] = (104 ^ 86) ^ (133 ^ 176);
        lIIllIIlIIlll[12] = 177 ^ 189;
        lIIllIIlIIlll[13] = 110 ^ 99;
        lIIllIIlIIlll[14] = 186 ^ 180;
        lIIllIIlIIlll[15] = (53 ^ 8) ^ (173 ^ 159);
        lIIllIIlIIlll[16] = 57 ^ 41;
        lIIllIIlIIlll[17] = (-25794) & 26051;
        lIIllIIlIIlll[18] = 0 ^ 20;
        lIIllIIlIIlll[19] = (25 ^ 35) ^ (52 ^ 31);
    }
}
