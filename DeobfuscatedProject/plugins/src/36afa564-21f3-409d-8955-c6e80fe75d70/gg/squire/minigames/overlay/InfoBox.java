/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
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

public class InfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireSorceressGarden p;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIIllIIlIIlll;
    private final /* synthetic */ SquireSorceressGardenConfig r;
    private static /* synthetic */ String[] lIIllIIlIIlIl;

    public long n(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (InfoBox.lIlIlllllIlllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static void lIlIlllllIllIII() {
        lIIllIIlIIlIl = new String[lIIllIIlIIlll[19]];
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[1]] = InfoBox.lIlIlllllIlIIII("ByM8ECMxchoWIzc3OxwiJ3IOGCMwNyc=", "TRIyQ");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[2]] = InfoBox.lIlIlllllIlIIII("GyEdIhskMQ==", "ITsVr");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[3]] = InfoBox.lIlIlllllIlIIIl("2Qpa0SwBjJE=", "yLzJU");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[4]] = InfoBox.lIlIlllllIlIIlI("DQwwqIgBDup2uvyQIqq7pTP42oX/ytL/", "hlzui");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[5]] = InfoBox.lIlIlllllIlIIIl("4VieOh3bwaM=", "nniUZ");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[6]] = InfoBox.lIlIlllllIlIIIl("jDpZp/XCf3tXNaSUV3bdMlgmbc0JTqxb", "loDuU");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[7]] = InfoBox.lIlIlllllIlIIlI("BZivkh83bPNCLcNue4vVplalfHeLckXK", "vHwOk");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[8]] = InfoBox.lIlIlllllIlIIlI("DczrFwIZHD5yLq+Gckey+A97kpVhBbsA", "dzMXD");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[9]] = InfoBox.lIlIlllllIlIIIl("nmGVyAXDf+gvZZrqljvGVuWPIS+Ima39", "tFHTE");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[10]] = InfoBox.lIlIlllllIlIIIl("4g0gB/OCPWGhBkrUT6JFlbtVccZSa9SrEY42stAcMgI=", "GcKow");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[0]] = InfoBox.lIlIlllllIlIIlI("c7uVzCT7fzAAbNZqu8W7OMHn4L2lFjYT", "Qexem");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[11]] = InfoBox.lIlIlllllIlIIlI("H12Y327ztHJ1Opo0QHfVavVzDZhCiwtT", "ywNkT");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[12]] = InfoBox.lIlIlllllIlIIII("Ixk+CB8DC3AqAh0UNQoZFBxqSQ==", "qxPim");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[13]] = InfoBox.lIlIlllllIlIIII("Ay00MDUlKWESKCQ2JDIzLT57cQ==", "HZAQG");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[14]] = InfoBox.lIlIlllllIlIIIl("v+bD3gNIbKGZmcOOF0KPmsLXoq/mBhRY", "FBIfu");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[15]] = InfoBox.lIlIlllllIlIIlI("iFE4FKpxnodGJJOZ+GXR0gWxG5IElIUs", "YMNiM");
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[16]] = InfoBox.lIlIlllllIlIIII("MTkVIB9VGRE3HQZuNz0VGSsXJhwRdFQ=", "uNtRy");
    }

    @Inject
    private InfoBox(SquireSorceressGarden squireSorceressGarden, SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.p = squireSorceressGarden;
        this.q = squireSorceressGarden.getManager();
        this.r = squireSorceressGardenConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIlIlllllIlIIlI(String llllllllllllllIllllIIIIllIllIIlI, String llllllllllllllIllllIIIIllIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIllIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIllIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIllIllIlII.init(lIIllIIlIIlll[3], llllllllllllllIllllIIIIllIllIlIl);
            return new String(llllllllllllllIllllIIIIllIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIllIllIIll) {
            llllllllllllllIllllIIIIllIllIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIlIIIl(String llllllllllllllIllllIIIIllIlIIIll, String llllllllllllllIllllIIIIllIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIllIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlll[9]), "DES");
            Cipher llllllllllllllIllllIIIIllIlIIlll = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIllIlIIlll.init(lIIllIIlIIlll[3], llllllllllllllIllllIIIIllIlIlIII);
            return new String(llllllllllllllIllllIIIIllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIllIlIIllI) {
            llllllllllllllIllllIIIIllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIlIIII(String llllllllllllllIllllIIIIlllIIIIlI, String llllllllllllllIllllIIIIlllIIIIIl) {
        llllllllllllllIllllIIIIlllIIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIlllIIIlIl = new StringBuilder();
        char[] llllllllllllllIllllIIIIlllIIIlII = llllllllllllllIllllIIIIlllIIIIIl.toCharArray();
        int llllllllllllllIllllIIIIlllIIIIll = lIIllIIlIIlll[1];
        char[] llllllllllllllIllllIIIIllIllllIl = llllllllllllllIllllIIIIlllIIIIlI.toCharArray();
        int llllllllllllllIllllIIIIllIllllII = llllllllllllllIllllIIIIllIllllIl.length;
        int llllllllllllllIllllIIIIllIlllIll = lIIllIIlIIlll[1];
        while (InfoBox.lIlIlllllIlllIl(llllllllllllllIllllIIIIllIlllIll, llllllllllllllIllllIIIIllIllllII)) {
            char llllllllllllllIllllIIIIlllIIlIII = llllllllllllllIllllIIIIllIllllIl[llllllllllllllIllllIIIIllIlllIll];
            llllllllllllllIllllIIIIlllIIIlIl.append((char)(llllllllllllllIllllIIIIlllIIlIII ^ llllllllllllllIllllIIIIlllIIIlII[llllllllllllllIllllIIIIlllIIIIll % llllllllllllllIllllIIIIlllIIIlII.length]));
            "".length();
            ++llllllllllllllIllllIIIIlllIIIIll;
            ++llllllllllllllIllllIIIIllIlllIll;
            "".length();
            if (((0xEB ^ 0xA3) & ~(0x8E ^ 0xC6)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIlllIIIlIl);
    }

    private static boolean lIlIlllllIllIll(int n) {
        return n != 0;
    }

    static {
        InfoBox.lIlIlllllIllIlI();
        InfoBox.lIlIlllllIllIII();
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox llllllllllllllIllllIIIIlllIllIll;
        if (InfoBox.lIlIlllllIllIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration llllllllllllllIllllIIIIlllIllIIl = Duration.between(llllllllllllllIllllIIIIlllIllIll.p.getStarted(), Instant.now());
        llllllllllllllIllllIIIIlllIllIll.panelComponent.setBorder(new Rectangle(lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0]));
        llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlIIlIl[lIIllIIlIIlll[1]]).build());
        "".length();
        llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[2]]).right(Time.format((Duration)llllllllllllllIllllIIIIlllIllIIl)).build());
        "".length();
        llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[3]]).right(llllllllllllllIllllIIIIlllIllIll.q.getCurrentTask()).build());
        "".length();
        if (InfoBox.lIlIlllllIlllII(llllllllllllllIllllIIIIlllIllIll.r.pickHerbs() ? 1 : 0)) {
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[4]]).right(llllllllllllllIllllIIIIlllIllIll.p.a() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.a()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[5]]).right(NumberFormat.getIntegerInstance().format(llllllllllllllIllllIIIIlllIllIll.n())).build());
            "".length();
            "".length();
            if (((0x42 ^ 0x18) & ~(0x3B ^ 0x61)) >= "  ".length()) {
                return null;
            }
        } else if (InfoBox.lIlIlllllIlllII(llllllllllllllIllllIIIIlllIllIll.r.breakDownHerbs() ? 1 : 0)) {
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[6]]).right(llllllllllllllIllllIIIIlllIllIll.p.b() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.b()) + "/h)").build());
            "".length();
            "".length();
            if ((66 + 72 - 116 + 109 ^ 37 + 62 - 21 + 57) <= 0) {
                return null;
            }
        } else {
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[7]]).right(llllllllllllllIllllIIIIlllIllIll.p.c() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.c()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[8]]).right(llllllllllllllIllllIIIIlllIllIll.p.d() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.d()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[9]]).right(llllllllllllllIllllIIIIlllIllIll.p.e() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.e()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[10]]).right(llllllllllllllIllllIIIIlllIllIll.p.f() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.f()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[0]]).right(llllllllllllllIllllIIIIlllIllIll.p.g() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.g()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[11]]).right(llllllllllllllIllllIIIIlllIllIll.p.h() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.h()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[12]]).right(llllllllllllllIllllIIIIlllIllIll.p.i() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.i()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[13]]).right(llllllllllllllIllllIIIIlllIllIll.p.j() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.j()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[14]]).right(llllllllllllllIllllIIIIlllIllIll.p.k() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.k()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[15]]).right(llllllllllllllIllllIIIIlllIllIll.p.l() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.l()) + "/h)").build());
            "".length();
            llllllllllllllIllllIIIIlllIllIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[16]]).right(llllllllllllllIllllIIIIlllIllIll.p.m() + " (" + llllllllllllllIllllIIIIlllIllIll.n(llllllllllllllIllllIIIIlllIllIll.p.m()) + "/h)").build());
            "".length();
        }
        int n = lIIllIIlIIlll[17];
        this.panelComponent.setPreferredSize(new Dimension(n + lIIllIIlIIlll[18], lIIllIIlIIlll[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIlllllIlllII(int n) {
        return n == 0;
    }

    public long n() {
        int n = (int)this.n(this.p.a());
        return (long)n * 1500L;
    }

    private static boolean lIlIlllllIlllIl(int n, int n2) {
        return n < n2;
    }

    private static void lIlIlllllIllIlI() {
        lIIllIIlIIlll = new int[20];
        InfoBox.lIIllIIlIIlll[0] = 65 + 123 - 111 + 94 ^ 133 + 29 - 68 + 67;
        InfoBox.lIIllIIlIIlll[1] = (0x93 ^ 0xBA) & ~(0x25 ^ 0xC);
        InfoBox.lIIllIIlIIlll[2] = " ".length();
        InfoBox.lIIllIIlIIlll[3] = "  ".length();
        InfoBox.lIIllIIlIIlll[4] = "   ".length();
        InfoBox.lIIllIIlIIlll[5] = 0x5E ^ 0x5A;
        InfoBox.lIIllIIlIIlll[6] = 0x2A ^ 3 ^ (0x7D ^ 0x51);
        InfoBox.lIIllIIlIIlll[7] = 0xC0 ^ 0xC6;
        InfoBox.lIIllIIlIIlll[8] = 0x68 ^ 0x6F;
        InfoBox.lIIllIIlIIlll[9] = 0 ^ 0x57 ^ (0x26 ^ 0x79);
        InfoBox.lIIllIIlIIlll[10] = 0x43 ^ 0x2E ^ (0x32 ^ 0x56);
        InfoBox.lIIllIIlIIlll[11] = 0x68 ^ 0x56 ^ (0x85 ^ 0xB0);
        InfoBox.lIIllIIlIIlll[12] = 0xB1 ^ 0xBD;
        InfoBox.lIIllIIlIIlll[13] = 0x6E ^ 0x63;
        InfoBox.lIIllIIlIIlll[14] = 0xBA ^ 0xB4;
        InfoBox.lIIllIIlIIlll[15] = 0x35 ^ 8 ^ (0xAD ^ 0x9F);
        InfoBox.lIIllIIlIIlll[16] = 0x39 ^ 0x29;
        InfoBox.lIIllIIlIIlll[17] = 0xFFFF9B3E & 0x65C3;
        InfoBox.lIIllIIlIIlll[18] = 0 ^ 0x14;
        InfoBox.lIIllIIlIIlll[19] = 0x19 ^ 0x23 ^ (0x34 ^ 0x1F);
    }
}

