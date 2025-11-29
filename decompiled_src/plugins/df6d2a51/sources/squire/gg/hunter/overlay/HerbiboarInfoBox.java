package squire.gg.hunter.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.b;
import squire.gg.hunter.SquireHerbiboarPlugin;
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:squire/gg/hunter/overlay/HerbiboarInfoBox.class */
public class HerbiboarInfoBox extends OverlayPanel {
    private final /* synthetic */ TaskManager aa;
    private final /* synthetic */ SquireHerbiboarPlugin Z;
    private static /* synthetic */ int[] lllIIllIIlII;
    private static /* synthetic */ String[] lllIIllIIIll;
    private final /* synthetic */ b ab;

    @Inject
    private HerbiboarInfoBox(SquireHerbiboarPlugin squireHerbiboarPlugin, b bVar) {
        this.Z = squireHerbiboarPlugin;
        this.aa = squireHerbiboarPlugin.getManager();
        this.ab = bVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIIlIlIIllllII(int i) {
        return i != 0;
    }

    private static void lIIIlIlIIlllIll() {
        lllIIllIIlII = new int[12];
        lllIIllIIlII[0] = ((((149 + 113) - 164) + 77) ^ (((162 + 26) - 158) + 137)) & (((((8 + 123) - 58) + 112) ^ (((110 + 7) - (-44)) + 16)) ^ (-" ".length()));
        lllIIllIIlII[1] = " ".length();
        lllIIllIIlII[2] = "  ".length();
        lllIIllIIlII[3] = "   ".length();
        lllIIllIIlII[4] = 191 ^ 187;
        lllIIllIIlII[5] = 108 ^ 105;
        lllIIllIIlII[6] = 194 ^ 196;
        lllIIllIIlII[7] = (119 ^ 1) ^ (111 ^ 30);
        lllIIllIIlII[8] = (((114 + 39) - 90) + 90) ^ (((34 + 96) - 67) + 82);
        lllIIllIIlII[9] = (-((-35) & 1791)) & (-22529) & 24542;
        lllIIllIIlII[10] = 139 ^ 159;
        lllIIllIIlII[11] = (((145 + 120) - 255) + 162) ^ (((62 + 83) - 10) + 30);
    }

    static {
        lIIIlIlIIlllIll();
        lIIIlIlIIlllIlI();
    }

    private static void lIIIlIlIIlllIlI() {
        lllIIllIIIll = new String[lllIIllIIlII[11]];
        lllIIllIIIll[lllIIllIIlII[0]] = lIIIlIlIIllIlll("9hvXCr+qfU0PsCa1fYxArZ8MQYMcyZdV", "aClSV");
        lllIIllIIIll[lllIIllIIlII[1]] = lIIIlIlIIlllIII("MLDRK8VfBB0=", "bNCcR");
        lllIIllIIIll[lllIIllIIlII[2]] = lIIIlIlIIlllIIl("AyY2OQA6LQ==", "UCDJi");
        lllIIllIIIll[lllIIllIIlII[3]] = lIIIlIlIIlllIII("XfE8O3hsQk8=", "gePiR");
        lllIIllIIIll[lllIIllIIlII[4]] = lIIIlIlIIlllIIl("JTILHRcIM1kcBgczHFVS", "fGyor");
        lllIIllIIIll[lllIIllIIlII[5]] = lIIIlIlIIllIlll("vbyUfJgoneAtlUTuKudxog==", "eagxQ");
        lllIIllIIIll[lllIIllIIlII[6]] = lIIIlIlIIlllIIl("MxIGKnZH", "gsuAL");
        lllIIllIIIll[lllIIllIIlII[7]] = lIIIlIlIIlllIIl("ASQ3MysrLiQjYgIoKT0x", "IAEQB");
        lllIIllIIIll[lllIIllIIlII[8]] = lIIIlIlIIlllIII("qyycfxcG4we4bOgcrqV25OsJhzGr+EBg01PFsuMW1ck=", "wEwCa");
    }

    private static String lIIIlIlIIlllIIl(String lllllllllllllllIIllIlIIIllllllIl, String lllllllllllllllIIllIlIIIllllllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIlllllIll = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIlllllIlI = lllllllllllllllIIllIlIIIllllllII.toCharArray();
        int lllllllllllllllIIllIlIIIlllllIIl = lllIIllIIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllIIlII[0];
        while (lIIIlIlIIlllllI(i, length)) {
            lllllllllllllllIIllIlIIIlllllIll.append((char) (charArray[i] ^ lllllllllllllllIIllIlIIIlllllIlI[lllllllllllllllIIllIlIIIlllllIIl % lllllllllllllllIIllIlIIIlllllIlI.length]));
            "".length();
            lllllllllllllllIIllIlIIIlllllIIl++;
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIIlllllIll);
    }

    private static String lIIIlIlIIlllIII(String lllllllllllllllIIllIlIIIllIllIll, String lllllllllllllllIIllIlIIIllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), lllIIllIIlII[8]), "DES");
            Cipher lllllllllllllllIIllIlIIIllIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIllIlllIl.init(lllIIllIIlII[2], lllllllllllllllIIllIlIIIllIllllI);
            return new String(lllllllllllllllIIllIlIIIllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIllIlllII) {
            lllllllllllllllIIllIlIIIllIlllII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIIlIlIIllllII(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllIIIll[lllIIllIIlII[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[2]]).right(lllIIllIIIll[lllIIllIIlII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[4]]).right(this.ab.i().toString()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[5]]).right(String.valueOf(this.Z.f())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[6]]).right(this.aa.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[7]]).right(SquireHerbiboarPlugin.e()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[8]]).right(c(SquireHerbiboarPlugin.e())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIIllIIlII[9] + lllIIllIIlII[10], lllIIllIIlII[0]));
        return super.render(graphics2D);
    }

    public long c(int i) {
        Duration between = Duration.between(this.Z.getStarted(), Instant.now());
        if (lIIIlIlIIllllIl(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIllllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlIlIIlllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIlIIllIlll(String lllllllllllllllIIllIlIIIlllIlIII, String lllllllllllllllIIllIlIIIlllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIlllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIlllIlIlI.init(lllIIllIIlII[2], lllllllllllllllIIllIlIIIlllIlIll);
            return new String(lllllllllllllllIIllIlIIIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlllIlIIl) {
            lllllllllllllllIIllIlIIIlllIlIIl.printStackTrace();
            return null;
        }
    }
}
