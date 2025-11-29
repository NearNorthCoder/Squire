package gg.squire.minigames.overlays;

import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.F;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.G;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
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
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
@Singleton
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:gg/squire/minigames/overlays/StatisticsOverlay.class */
public class StatisticsOverlay extends OverlayPanel {
    private static /* synthetic */ String[] lIIllIIlllll;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    private static /* synthetic */ int[] lIIllIlIIIII;
    private final /* synthetic */ TaskManager bZ;
    private final /* synthetic */ SquireBlastFurnace ca;
    @Inject
    private /* synthetic */ G u;
    public static final /* synthetic */ String bY;

    static {
        llIIllllIIIIll();
        llIIllllIIIIlI();
        bY = lIIllIIlllll[lIIllIlIIIII[9]];
    }

    private static boolean llIIllllIIIlII(int i) {
        return i != 0;
    }

    private static void llIIllllIIIIll() {
        lIIllIlIIIII = new int[12];
        lIIllIlIIIII[0] = (((((53 + 45) - 79) + 119) + (((43 + 53) - 22) + 57)) - (4 ^ 126)) + (155 ^ 156);
        lIIllIlIIIII[1] = 88 ^ 76;
        lIIllIlIIIII[2] = (95 ^ 114) & ((94 ^ 115) ^ (-1));
        lIIllIlIIIII[3] = (8 ^ 114) ^ (224 ^ 144);
        lIIllIlIIIII[4] = " ".length();
        lIIllIlIIIII[5] = "  ".length();
        lIIllIlIIIII[6] = "   ".length();
        lIIllIlIIIII[7] = (216 ^ 135) ^ (224 ^ 187);
        lIIllIlIIIII[8] = (39 ^ 20) ^ (136 ^ 190);
        lIIllIlIIIII[9] = 126 ^ 120;
        lIIllIlIIIII[10] = 28 ^ 27;
        lIIllIlIIIII[11] = 42 ^ 34;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIllllIIIlII(this.ca.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setPreferredSize(new Dimension(lIIllIlIIIII[0] + lIIllIlIIIII[1], lIIllIlIIIII[2]));
        this.panelComponent.setBorder(new Rectangle(lIIllIlIIIII[3], lIIllIlIIIII[3], lIIllIlIIIII[3], lIIllIlIIIII[3]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlllll[lIIllIlIIIII[2]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[4]]).right(Time.format(Duration.between(this.ca.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[5]]).right(F.h(this.u.aa())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[6]]).right(F.h(this.u.ah())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[7]]).right(F.a(this.u.ab())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[8]]).right(F.h(this.u.ai())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void llIIllllIIIIlI() {
        lIIllIIlllll = new String[lIIllIlIIIII[10]];
        lIIllIIlllll[lIIllIlIIIII[2]] = llIIlllIllllll("btAvPGgkjkwbXFOSmNLMslUIQYIPbJYD", "vDQik");
        lIIllIIlllll[lIIllIlIIIII[4]] = llIIllllIIIIII("GQ8AIAomHw==", "KznTc");
        lIIllIIlllll[lIIllIlIIIII[5]] = llIIllllIIIIII("BzY6BksoNiwQUQ==", "EWHuk");
        lIIllIIlllll[lIIllIlIIIII[6]] = llIIllllIIIIIl("Gu9yR4cMcfdTMsyBwrs6rw==", "OYixV");
        lIIllIIlllll[lIIllIlIIIII[7]] = llIIllllIIIIII("LCdWNgIdGRM1WQ==", "twvQc");
        lIIllIIlllll[lIIllIlIIIII[8]] = llIIlllIllllll("hx+V/+xmZrY=", "ldrjY");
        lIIllIIlllll[lIIllIlIIIII[9]] = llIIllllIIIIII("CCU2Ihk=", "KISCk");
    }

    private static String llIIllllIIIIIl(String lllllllllllllllIlllIlllIIIlIIlII, String lllllllllllllllIlllIlllIIIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllIIIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllIIIlIIllI.init(lIIllIlIIIII[5], lllllllllllllllIlllIlllIIIlIIlll);
            return new String(lllllllllllllllIlllIlllIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllIIIlIIlIl) {
            lllllllllllllllIlllIlllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllllIIIlIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    StatisticsOverlay(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace);
        this.ca = squireBlastFurnace;
        this.bZ = squireBlastFurnace.getManager();
    }

    private static String llIIlllIllllll(String lllllllllllllllIlllIlllIIIIlIlll, String lllllllllllllllIlllIlllIIIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIII[11]), "DES");
            Cipher lllllllllllllllIlllIlllIIIIllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllIIIIllIIl.init(lIIllIlIIIII[5], secretKeySpec);
            return new String(lllllllllllllllIlllIlllIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllIIIIllIII) {
            lllllllllllllllIlllIlllIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static String llIIllllIIIIII(String lllllllllllllllIlllIlllIIIIIIlll, String lllllllllllllllIlllIlllIIIIIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlllIIIIIIllI.toCharArray();
        int lllllllllllllllIlllIlllIIIIIIIll = lIIllIlIIIII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlIIIII[2];
        while (llIIllllIIIlIl(i, length)) {
            char lllllllllllllllIlllIlllIIIIIlIII = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIlllIIIIIlIII ^ charArray[lllllllllllllllIlllIlllIIIIIIIll % charArray.length]));
            "".length();
            lllllllllllllllIlllIlllIIIIIIIll++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
