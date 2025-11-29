package gg.squire.corp.overlay;

import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.s;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.corp.SquireCorp;
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
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:gg/squire/corp/overlay/CorpInfoBox.class */
public class CorpInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireCorp j;
    private final /* synthetic */ s l;
    private static /* synthetic */ int[] lIlIlllIIlII;
    private static /* synthetic */ String[] lIlIlllIIIll;
    private final /* synthetic */ TaskManager k;

    private static void lllIIIIlIllIll() {
        lIlIlllIIlII = new int[13];
        lIlIlllIIlII[0] = 173 ^ 167;
        lIlIlllIIlII[1] = ((32 ^ 48) ^ (89 ^ 27)) & (((127 ^ 79) ^ (104 ^ 10)) ^ (-" ".length()));
        lIlIlllIIlII[2] = " ".length();
        lIlIlllIIlII[3] = "  ".length();
        lIlIlllIIlII[4] = "   ".length();
        lIlIlllIIlII[5] = 197 ^ 193;
        lIlIlllIIlII[6] = (90 ^ 116) ^ (123 ^ 80);
        lIlIlllIIlII[7] = 69 ^ 67;
        lIlIlllIIlII[8] = (173 ^ 131) ^ (109 ^ 68);
        lIlIlllIIlII[9] = (24 ^ 83) ^ (106 ^ 41);
        lIlIlllIIlII[10] = (((170 + 2) - 27) + 30) ^ (((16 + 162) - 137) + 125);
        lIlIlllIIlII[11] = 39 ^ 44;
        lIlIlllIIlII[12] = 168 ^ 164;
    }

    public String a(int i) {
        Duration between = Duration.between(this.j.getStarted(), Instant.now());
        if (lllIIIIlIlllIl(between.isZero() ? 1 : 0)) {
            String str = lIlIlllIIIll[lIlIlllIIlII[0]];
            Object[] objArr = new Object[lIlIlllIIlII[2]];
            objArr[lIlIlllIIlII[1]] = Double.valueOf((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
            return String.format(str, objArr);
        }
        return lIlIlllIIIll[lIlIlllIIlII[11]];
    }

    private static String lllIIIIlIllIIl(String lllllllllllllllIllIIlIIIlIlIIlll, String lllllllllllllllIllIIlIIIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIIIlIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIIIlIlIlIIl.init(lIlIlllIIlII[3], lllllllllllllllIllIIlIIIlIlIlIlI);
            return new String(lllllllllllllllIllIIlIIIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIlIlIlIII) {
            lllllllllllllllIllIIlIIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lllIIIIlIlllII(this.j.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIlII[0], lIlIlllIIlII[0], lIlIlllIIlII[0], lIlIlllIIlII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlllIIIll[lIlIlllIIlII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[2]]).right(this.k.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[3]]).right(Time.format(Duration.between(this.j.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[4]]).right(this.j.a() + " (" + a(this.j.a()) + "/h)").build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[5]]).right(this.j.e() + " (" + a(this.j.e()) + "/h)").build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[6]]).right(String.valueOf(this.j.b())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[7]]).right(String.valueOf(this.j.d())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[8]]).right(String.valueOf(this.l.r())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[9]]).right(String.valueOf(this.l.s())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[10]]).right(String.valueOf(this.l.q())).build());
        "".length();
        return super.render(graphics2D);
    }

    static {
        lllIIIIlIllIll();
        lllIIIIlIllIlI();
    }

    private static String lllIIIIlIllIII(String lllllllllllllllIllIIlIIIlIIllIlI, String lllllllllllllllIllIIlIIIlIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIlllIIlII[9]), "DES");
            Cipher lllllllllllllllIllIIlIIIlIIlllII = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIIIlIIlllII.init(lIlIlllIIlII[3], lllllllllllllllIllIIlIIIlIIlllIl);
            return new String(lllllllllllllllIllIIlIIIlIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIlIIllIll) {
            lllllllllllllllIllIIlIIIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlIlllIl(int i) {
        return i == 0;
    }

    @Inject
    public CorpInfoBox(SquireCorp squireCorp, s sVar) {
        this.j = squireCorp;
        this.k = squireCorp.getManager();
        this.l = sVar;
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lllIIIIlIlllII(int i) {
        return i != 0;
    }

    private static String lllIIIIlIlIlll(String lllllllllllllllIllIIlIIIlIIIlIlI, String lllllllllllllllIllIIlIIIlIIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIlIIIlIIIIlll = lllllllllllllllIllIIlIIIlIIIlIIl.toCharArray();
        int lllllllllllllllIllIIlIIIlIIIIllI = lIlIlllIIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIIlII[1];
        while (lllIIIIlIllllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIIlIIIlIIIIlll[lllllllllllllllIllIIlIIIlIIIIllI % lllllllllllllllIllIIlIIIlIIIIlll.length]));
            "".length();
            lllllllllllllllIllIIlIIIlIIIIllI++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllIIIIlIllIlI() {
        lIlIlllIIIll = new String[lIlIlllIIlII[12]];
        lIlIlllIIIll[lIlIlllIIlII[1]] = lllIIIIlIlIlll("MhgXGx8ESSEdHxEGEBcMDUkgFwwSHQ==", "aibrm");
        lIlIlllIIIll[lIlIlllIIlII[2]] = lllIIIIlIllIII("/pL/mBRer+EIGXhE03wOSw==", "AYZKv");
        lIlIlllIIIll[lIlIlllIIlII[3]] = lllIIIIlIlIlll("IDAAAxkfIA==", "rEnwp");
        lIlIlllIIIll[lIlIlllIIlII[4]] = lllIIIIlIlIlll("MQ4rHjE=", "zgGrB");
        lIlIlllIIIll[lIlIlllIIlII[5]] = lllIIIIlIllIIl("jppmPYPAnXw=", "ivoos");
        lIlIlllIIIll[lIlIlllIIlII[6]] = lllIIIIlIlIlll("EAM9Hj08BQ==", "RbSuT");
        lIlIlllIIIll[lIlIlllIIlII[7]] = lllIIIIlIlIlll("JSgFNxADIA==", "mGuGy");
        lIlIlllIIIll[lIlIlllIIlII[8]] = lllIIIIlIllIIl("nJDEM0J+Jijk0F1GogTu3w==", "EsBfw");
        lIlIlllIIIll[lIlIlllIIlII[9]] = lllIIIIlIllIII("NrZCfy8Vs+OHIsYlQvQ6Tw==", "JkKAX");
        lIlIlllIIIll[lIlIlllIIlII[10]] = lllIIIIlIlIlll("Lz4/SycMFA0MJg==", "mylkC");
        lIlIlllIIIll[lIlIlllIIlII[0]] = lllIIIIlIlIlll("TWp/AQ==", "hDMgN");
        lIlIlllIIIll[lIlIlllIIlII[11]] = lllIIIIlIllIIl("wvV01I9c64Y=", "bAiAC");
    }

    private static boolean lllIIIIlIllllI(int i, int i2) {
        return i < i2;
    }
}
