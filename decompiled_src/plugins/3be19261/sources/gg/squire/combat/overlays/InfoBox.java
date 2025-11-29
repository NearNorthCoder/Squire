package gg.squire.combat.overlays;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
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
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:gg/squire/combat/overlays/InfoBox.class */
public class InfoBox extends OverlayPanel {
    private final /* synthetic */ SquireBlueDragonKiller p;
    private final /* synthetic */ SquireBlueDragonKiller r;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIIlllIlIIll;
    private static /* synthetic */ String[] lIIlllIlIIlI;
    private final /* synthetic */ SquireBlueDragonKillerConfig s;

    public long g(int i) {
        Duration between = Duration.between(this.r.getStarted(), Instant.now());
        if (llIlIIIIllIlII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean llIlIIIIllIlII(int i) {
        return i == 0;
    }

    static {
        llIlIIIIllIIlI();
        llIlIIIIllIIIl();
    }

    private static boolean llIlIIIIllIIll(int i) {
        return i != 0;
    }

    private static boolean llIlIIIIllIlIl(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIIIllIIIl() {
        lIIlllIlIIlI = new String[lIIlllIlIIll[10]];
        lIIlllIlIIlI[lIIlllIlIIll[0]] = llIlIIIIlIlllI("zHySRUOaNPUFlJ8KkO/sovi+etU8LF9UPynTDmOMuto=", "gfklr");
        lIIlllIlIIlI[lIIlllIlIIll[1]] = llIlIIIIlIllll("k6QEkwmBDaPVuc+ADSjzww==", "eAwlZ");
        lIIlllIlIIlI[lIIlllIlIIll[2]] = llIlIIIIlIllll("EBkNoiP2eZA=", "rPVsy");
        lIIlllIlIIlI[lIIlllIlIIll[3]] = llIlIIIIllIIII("f3dHV0M=", "NYvys");
        lIIlllIlIIlI[lIIlllIlIIll[4]] = llIlIIIIllIIII("MS0ZJENF", "eLjOy");
        lIIlllIlIIlI[lIIlllIlIIll[5]] = llIlIIIIlIlllI("KFwtVkDYsNRIBk58911Imw==", "aBWYA");
        lIIlllIlIIlI[lIIlllIlIIll[6]] = llIlIIIIlIllll("5GnkO1TRNPS/bsiB5eIsd2WKOdp1SVOb", "sJFHr");
        lIIlllIlIIlI[lIIlllIlIIll[7]] = llIlIIIIlIllll("9VZbJ9eXD0pNnidhwW6pj/aCi4E4UjEI", "XvDpY");
        lIIlllIlIIlI[lIIlllIlIIll[8]] = llIlIIIIllIIII("Ehg1CTY7EyJGCzIXIhVjeFYOXGM=", "WvFfC");
    }

    private static String llIlIIIIllIIII(String lllllllllllllllIlllIlIllIIlIlIll, String lllllllllllllllIlllIlIllIIlIlIlI) {
        String lllllllllllllllIlllIlIllIIlIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlIllIIlIlIlI.toCharArray();
        int lllllllllllllllIlllIlIllIIlIIlll = lIIlllIlIIll[0];
        char[] charArray2 = lllllllllllllllIlllIlIllIIlIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIlIIll[0];
        while (llIlIIIIllIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlllIlIllIIlIIlll % charArray.length]));
            "".length();
            lllllllllllllllIlllIlIllIIlIIlll++;
            i++;
            "".length();
            if (((((69 + 73) - 74) + 87) ^ (((78 + 13) - 56) + 124)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlIIIIlIlllI(String lllllllllllllllIlllIlIllIIIlIllI, String lllllllllllllllIlllIlIllIIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIlIIll[2], lllllllllllllllIlllIlIllIIIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIllIIIlIlll) {
            lllllllllllllllIlllIlIllIIIlIlll.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIlIIIIllIIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllIlIIlI[lIIlllIlIIll[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[2]]).right(lIIlllIlIIlI[lIIlllIlIIll[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[4]]).right(this.q.getCurrentTask()).build());
        "".length();
        if (llIlIIIIllIIll(this.s.lootBones() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[5]]).right(this.r.d() + " (" + g(this.r.d()) + "/h)").build());
            "".length();
        }
        if (llIlIIIIllIIll(this.s.lootHides() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[6]]).right(this.r.e() + " (" + g(this.r.e()) + "/h)").build());
            "".length();
        }
        if (llIlIIIIllIIll(this.s.lootScales() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[7]]).right(this.r.f() + " (" + g(this.r.f()) + "/h)").build());
            "".length();
        }
        if (llIlIIIIllIIll(this.s.lootEnsouled() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[8]]).right(this.r.g() + " (" + g(this.r.g()) + "/h)").build());
            "".length();
        }
        this.panelComponent.setPreferredSize(new Dimension(lIIlllIlIIll[9], lIIlllIlIIll[0]));
        return super.render(graphics2D);
    }

    private static String llIlIIIIlIllll(String lllllllllllllllIlllIlIllIIIIlIIl, String lllllllllllllllIlllIlIllIIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIlllIlIIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIlIIll[2], lllllllllllllllIlllIlIllIIIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIllIIIIlIlI) {
            lllllllllllllllIlllIlIllIIIIlIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public InfoBox(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKiller squireBlueDragonKiller2, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.p = squireBlueDragonKiller;
        this.q = squireBlueDragonKiller.getManager();
        this.r = squireBlueDragonKiller2;
        this.s = squireBlueDragonKillerConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void llIlIIIIllIIlI() {
        lIIlllIlIIll = new int[11];
        lIIlllIlIIll[0] = (118 ^ 115) & ((52 ^ 49) ^ (-1));
        lIIlllIlIIll[1] = " ".length();
        lIIlllIlIIll[2] = "  ".length();
        lIIlllIlIIll[3] = "   ".length();
        lIIlllIlIIll[4] = (((25 + 156) - 93) + 101) ^ (((157 + 140) - 181) + 69);
        lIIlllIlIIll[5] = 0 ^ 5;
        lIIlllIlIIll[6] = 82 ^ 84;
        lIIlllIlIIll[7] = (19 ^ 51) ^ (57 ^ 30);
        lIIlllIlIIll[8] = (149 ^ 196) ^ (30 ^ 71);
        lIIlllIlIIll[9] = (-29229) & 29486;
        lIIlllIlIIll[10] = 187 ^ 178;
    }
}
