package gg.squire.basics.cerberus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.TaskManager;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0000a;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/cerberus/overlay/CerberusOverlay.class */
public class CerberusOverlay extends OverlayPanel {
    private final /* synthetic */ C0000a ai;
    private final /* synthetic */ TaskManager aj;
    private final /* synthetic */ SquireCerberus ah;
    private static /* synthetic */ String[] lllIIllII;
    private static /* synthetic */ int[] lllIIllIl;

    private static boolean llIIIlIlIll(int i2) {
        return i2 != 0;
    }

    private static void llIIIlIlIlI() {
        lllIIllIl = new int[21];
        lllIIllIl[0] = ((67 ^ 6) ^ (126 ^ 9)) & (((((44 + 45) - (-8)) + 43) ^ (((95 + 53) - 54) + 96)) ^ (-" ".length()));
        lllIIllIl[1] = " ".length();
        lllIIllIl[2] = "  ".length();
        lllIIllIl[3] = "   ".length();
        lllIIllIl[4] = (125 ^ 46) ^ (41 ^ 126);
        lllIIllIl[5] = 102 ^ 99;
        lllIIllIl[6] = 106 ^ 108;
        lllIIllIl[7] = 120 ^ 127;
        lllIIllIl[8] = 69 ^ 77;
        lllIIllIl[9] = (95 ^ 55) ^ (43 ^ 74);
        lllIIllIl[10] = (234 ^ 147) ^ (246 ^ 133);
        lllIIllIl[11] = 72 ^ 67;
        lllIIllIl[12] = 131 ^ 143;
        lllIIllIl[13] = 180 ^ 185;
        lllIIllIl[14] = 35 ^ 45;
        lllIIllIl[15] = (89 ^ 13) ^ (98 ^ 57);
        lllIIllIl[16] = 110 ^ 126;
        lllIIllIl[17] = (179 ^ 167) ^ (23 ^ 18);
        lllIIllIl[18] = (-((-2825) & 28461)) & (-6786) & 32679;
        lllIIllIl[19] = (41 ^ 107) ^ (254 ^ 168);
        lllIIllIl[20] = 22 ^ 4;
    }

    private long i(int i2) {
        Duration between = Duration.between(this.ah.getStarted(), Instant.now());
        if (llIIIlIlIll(between.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int) ((i2 * Duration.ofHours(1L).toMillis()) / between.toMillis());
    }

    private static String llIIIlIlIII(String lIlIlIlllIIIIII, String lIlIlIllIllllll) {
        String str = new String(Base64.getDecoder().decode(lIlIlIlllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIllIlllllI = new StringBuilder();
        char[] lIlIlIllIllllIl = lIlIlIllIllllll.toCharArray();
        int lIlIlIllIllllII = lllIIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lllIIllIl[0];
        while (llIIIlIllIl(i2, length)) {
            char lIlIlIlllIIIIIl = charArray[i2];
            lIlIlIllIlllllI.append((char) (lIlIlIlllIIIIIl ^ lIlIlIllIllllIl[lIlIlIllIllllII % lIlIlIllIllllIl.length]));
            "".length();
            lIlIlIllIllllII++;
            i2++;
            "".length();
            if ((-(100 ^ 96)) > 0) {
                return null;
            }
        }
        return String.valueOf(lIlIlIllIlllllI);
    }

    private static String llIIIlIIllI(String lIlIlIlllIlIIII, String lIlIlIlllIIllll) {
        try {
            SecretKeySpec lIlIlIlllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlllIIllll.getBytes(StandardCharsets.UTF_8)), lllIIllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIl[2], lIlIlIlllIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlllIlIIIl) {
            lIlIlIlllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String llIIIlIIlll(String lIlIlIllIlIlIll, String lIlIlIllIlIlIlI) {
        try {
            SecretKeySpec lIlIlIllIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIllIlIllIl = Cipher.getInstance("Blowfish");
            lIlIlIllIlIllIl.init(lllIIllIl[2], lIlIlIllIlIlllI);
            return new String(lIlIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lIlIlIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIllIlIllII) {
            lIlIlIllIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlIlIlI();
        llIIIlIlIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        String str2;
        String str3;
        String str4;
        if (llIIIlIlIll(this.ah.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllII[lllIIllIl[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[1]]).right(Time.format(Duration.between(this.ah.getStarted(), Instant.now()))).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lllIIllII[lllIIllIl[2]]);
        if (llIIIlIllII(this.ai.k())) {
            str = lllIIllII[lllIIllIl[3]];
            "".length();
            if (((151 ^ 162) & ((154 ^ 175) ^ (-1))) >= " ".length()) {
                return null;
            }
        } else {
            str = lllIIllII[lllIIllIl[4]];
        }
        children.add(left.right(str).build());
        "".length();
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lllIIllII[lllIIllIl[5]]);
        if (llIIIlIlIll(this.ah.r() ? 1 : 0)) {
            str2 = lllIIllII[lllIIllIl[6]];
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        } else {
            str2 = lllIIllII[lllIIllIl[7]];
        }
        children2.add(left2.right(str2).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[8]]).right(this.ah.q() + " (" + i(this.ah.q()) + "/hr)").build());
        "".length();
        List children3 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(lllIIllII[lllIIllIl[9]]);
        if (llIIIlIlIll(this.ai.h().isEmpty() ? 1 : 0)) {
            str3 = lllIIllII[lllIIllIl[10]];
            "".length();
            if (0 != 0) {
                return null;
            }
        } else {
            str3 = lllIIllII[lllIIllIl[11]];
        }
        children3.add(left3.right(str3).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[12]]).right(String.valueOf(this.ai.n())).build());
        "".length();
        List children4 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left4 = LineComponent.builder().left(lllIIllII[lllIIllIl[13]]);
        if (llIIIlIlIll(this.ai.l() ? 1 : 0)) {
            str4 = lllIIllII[lllIIllIl[14]];
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return null;
            }
        } else {
            str4 = lllIIllII[lllIIllIl[15]];
        }
        children4.add(left4.right(str4).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[16]]).right(String.valueOf(this.ai.o())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[17]]).right(this.aj.getCurrentTask()).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIIllIl[18] + lllIIllIl[19], lllIIllIl[0]));
        return super.render(graphics2D);
    }

    private static void llIIIlIlIIl() {
        lllIIllII = new String[lllIIllIl[20]];
        lllIIllII[lllIIllIl[0]] = llIIIlIIllI("baVGYaIeynLRmrUbBMCrDg==", "Gswhm");
        lllIIllII[lllIIllIl[1]] = llIIIlIIllI("y2QYchTL+G4=", "KFqHJ");
        lllIIllII[lllIIllIl[2]] = llIIIlIIllI("trUymvw7lbW46i3YGgEDgw==", "vgGQn");
        lllIIllII[lllIIllIl[3]] = llIIIlIIllI("h2yJu2DDzwo=", "Zhizc");
        lllIIllII[lllIIllIl[4]] = llIIIlIIlll("qwYNHZZY6325DIJ+YZF2ww==", "PTmwI");
        lllIIllII[lllIIllIl[5]] = llIIIlIIlll("oFqQBaOOrzM=", "LVRGS");
        lllIIllII[lllIIllIl[6]] = llIIIlIIlll("TN7mR9Dggos=", "sBtqw");
        lllIIllII[lllIIllIl[7]] = llIIIlIIlll("LcHNadnZiGLRul8Ki02jnA==", "IupkB");
        lllIIllII[lllIIllIl[8]] = llIIIlIlIII("HygjORVuYQ==", "TAOUf");
        lllIIllII[lllIIllIl[9]] = llIIIlIlIII("FhUCIAZ3PgM5ECMKUXY=", "WykVc");
        lllIIllII[lllIIllIl[10]] = llIIIlIIlll("kSII9z421NU=", "iKiVt");
        lllIIllII[lllIIllIl[11]] = llIIIlIIlll("XZkLGE8q5hs=", "Ehput");
        lllIIllII[lllIIllIl[12]] = llIIIlIlIII("NB4INBBTJQQ1ARIbRxMNEB1dZw==", "svgGd");
        lllIIllII[lllIIllIl[13]] = llIIIlIIlll("RfVVfRHlIkdqK7efsDYE2A==", "IAeyg");
        lllIIllII[lllIIllIl[14]] = llIIIlIIlll("QelzKvpZED4=", "nzJTH");
        lllIIllII[lllIIllIl[15]] = llIIIlIlIII("BwU=", "IjVFw");
        lllIIllII[lllIIllIl[16]] = llIIIlIIlll("f41fLdJt6EIQHC0IBaOgNQ==", "dnpgr");
        lllIIllII[lllIIllIl[17]] = llIIIlIIlll("UlzWjfVglp8=", "axeRO");
    }

    private static boolean llIIIlIllII(Object obj) {
        return obj != null;
    }

    @Inject
    private CerberusOverlay(SquireCerberus squireCerberus, C0000a c0000a) {
        this.ah = squireCerberus;
        this.ai = c0000a;
        this.aj = squireCerberus.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}
