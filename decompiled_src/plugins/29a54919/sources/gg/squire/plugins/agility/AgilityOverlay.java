package gg.squire.plugins.agility;

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
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:gg/squire/plugins/agility/AgilityOverlay.class */
public class AgilityOverlay extends OverlayPanel {
    private final /* synthetic */ TaskManager c;
    private static /* synthetic */ int[] lIllIIIIlll;
    private final /* synthetic */ AgilityConfig b;
    private static /* synthetic */ String[] lIllIIIIlIl;
    private final /* synthetic */ SquireAgilityPlugin a;

    private static String lIIlIlIIllllll(String llllllllllllllllIlIlIlIlIIlllIll, String llllllllllllllllIlIlIlIlIIlllIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIlIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), lIllIIIIlll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIIlll[2], llllllllllllllllIlIlIlIlIIlllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIlIIllllII) {
            llllllllllllllllIlIlIlIlIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIlIlIIIIII() {
        lIllIIIIlIl = new String[lIllIIIIlll[9]];
        lIllIIIIlIl[lIllIIIIlll[0]] = lIIlIlIIllllIl("AuNvk9UUgnfROd6VwHgFHw==", "Yprpc");
        lIllIIIIlIl[lIllIIIIlll[1]] = lIIlIlIIlllllI("FCE8GyQrMQ==", "FTRoM");
        lIllIIIIlIl[lIllIIIIlll[2]] = lIIlIlIIlllllI("ARweISs4Fw==", "WylRB");
        lIllIIIIlIl[lIllIIIIlll[3]] = lIIlIlIIlllllI("fG9RTWg=", "MAbcX");
        lIllIIIIlIl[lIllIIIIlll[4]] = lIIlIlIIllllIl("zHNbKAoMuIA=", "tjkoO");
        lIllIIIIlIl[lIllIIIIlll[5]] = lIIlIlIIllllll("DyqtaAnPC/c=", "okIWA");
        lIllIIIIlIl[lIllIIIIlll[6]] = lIIlIlIIllllIl("JdGosUq7d8s=", "rXeih");
    }

    private static String lIIlIlIIlllllI(String llllllllllllllllIlIlIlIlIIlIlIll, String llllllllllllllllIlIlIlIlIIlIlIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIlIIlIlIIl = new StringBuilder();
        char[] llllllllllllllllIlIlIlIlIIlIlIII = llllllllllllllllIlIlIlIlIIlIlIlI.toCharArray();
        int llllllllllllllllIlIlIlIlIIlIIlll = lIllIIIIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIlll[0];
        while (lIIlIlIlIIIllI(i, length)) {
            char llllllllllllllllIlIlIlIlIIlIllII = charArray[i];
            llllllllllllllllIlIlIlIlIIlIlIIl.append((char) (llllllllllllllllIlIlIlIlIIlIllII ^ llllllllllllllllIlIlIlIlIIlIlIII[llllllllllllllllIlIlIlIlIIlIIlll % llllllllllllllllIlIlIlIlIIlIlIII.length]));
            "".length();
            llllllllllllllllIlIlIlIlIIlIIlll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIlIlIIlIlIIl);
    }

    private static boolean lIIlIlIlIIIlIl(int i) {
        return i != 0;
    }

    private static void lIIlIlIlIIIlII() {
        lIllIIIIlll = new int[11];
        lIllIIIIlll[0] = ((146 ^ 158) ^ (249 ^ 179)) & (((((166 + 141) - 229) + 132) ^ (((54 + 137) - 69) + 26)) ^ (-" ".length())) & (((((200 ^ 189) ^ (85 ^ 29)) & (((151 ^ 177) ^ (39 ^ 60)) ^ (-" ".length()))) & ((((((90 + 166) - 108) + 63) ^ (((53 + 130) - 123) + 118)) & (((((74 + 92) - 18) + 67) ^ (((52 + 176) - 148) + 102)) ^ (-" ".length()))) ^ (-" ".length()))) ^ (-" ".length()));
        lIllIIIIlll[1] = " ".length();
        lIllIIIIlll[2] = "  ".length();
        lIllIIIIlll[3] = "   ".length();
        lIllIIIIlll[4] = (54 ^ 48) ^ "  ".length();
        lIllIIIIlll[5] = (66 ^ 47) ^ (173 ^ 197);
        lIllIIIIlll[6] = (((118 + 57) - 39) + 37) ^ (((71 + 137) - 200) + 163);
        lIllIIIIlll[7] = (-31941) & 32198;
        lIllIIIIlll[8] = 11 ^ 31;
        lIllIIIIlll[9] = (175 ^ 195) ^ (13 ^ 102);
        lIllIIIIlll[10] = 0 ^ 8;
    }

    public Dimension render(Graphics2D graphics2D) {
        String bVar;
        if (lIIlIlIlIIIlIl(this.a.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIlIl[lIllIIIIlll[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[1]]).right(Time.format(Duration.between(this.a.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[2]]).right(lIllIIIIlIl[lIllIIIIlll[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[4]]).right(this.c.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[5]]).right(this.a.b() + " (" + a(this.a.b()) + "/h)").build());
        "".length();
        if (lIIlIlIlIIIlIl(this.b.progressive() ? 1 : 0)) {
            bVar = "Progressive (" + String.valueOf(this.a.a()) + ")";
            "".length();
            if (((((78 + 149) - 80) + 25) ^ (((149 + 72) - 81) + 28)) < ((82 ^ 90) ^ (69 ^ 73))) {
                return null;
            }
        } else {
            bVar = this.a.a().toString();
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[6]]).right(bVar).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIllIIIIlll[7] + lIllIIIIlll[8], lIllIIIIlll[0]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIIllllIl(String llllllllllllllllIlIlIlIlIIIlIllI, String llllllllllllllllIlIlIlIlIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIlIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIlIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIlIIIllIII.init(lIllIIIIlll[2], llllllllllllllllIlIlIlIlIIIllIIl);
            return new String(llllllllllllllllIlIlIlIlIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIlIIIlIlll) {
            llllllllllllllllIlIlIlIlIIIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIlIIIlII();
        lIIlIlIlIIIIII();
    }

    private long a(int i) {
        Duration between = Duration.between(this.a.getStarted(), Instant.now());
        if (lIIlIlIlIIIlIl(between.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
    }

    @Inject
    private AgilityOverlay(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.a = squireAgilityPlugin;
        this.b = agilityConfig;
        this.c = squireAgilityPlugin.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}
