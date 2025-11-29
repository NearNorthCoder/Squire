package gg.squire.farmer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0027b;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0031f;
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:gg/squire/farmer/overlay/StateOverlayPanel.class */
public class StateOverlayPanel extends OverlayPanel {
    private final /* synthetic */ SquireFarmer bP;
    private static /* synthetic */ String[] lIllllIllllI;
    private static /* synthetic */ int[] lIlllllIIIII;
    private final /* synthetic */ SquireFarmerConfig bO;
    private final /* synthetic */ C0027b bN;
    private final /* synthetic */ C0031f bM;
    private final /* synthetic */ TaskManager bQ;

    private static String lllIlllIlllIIl(String lllllllllllllllIlIllIIIlIlIllIlI, String lllllllllllllllIlIllIIIlIlIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIlIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllIIIII[3], lllllllllllllllIlIllIIIlIlIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIlIlIllIll) {
            lllllllllllllllIlIllIIIlIlIllIll.printStackTrace();
            return null;
        }
    }

    static {
        lllIllllIIlIIl();
        lllIlllIllllII();
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.setBorder(new Rectangle(lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllllIllllI[lIlllllIIIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[2]]).right(lIllllIllllI[lIlllllIIIII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[4]]).right(String.valueOf(this.bQ.getCurrentTask())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[5]]).right(String.valueOf(this.bP.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[6]]).right(String.valueOf(this.bM.x())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[7]]).right(String.valueOf(this.bM.v())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String lllIlllIlllIlI(String lllllllllllllllIlIllIIIlIlIIllIl, String lllllllllllllllIlIllIIIlIlIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), lIlllllIIIII[9]), "DES");
            Cipher lllllllllllllllIlIllIIIlIlIIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIIlIlIIllll.init(lIlllllIIIII[3], secretKeySpec);
            return new String(lllllllllllllllIlIllIIIlIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIlIlIIlllI) {
            lllllllllllllllIlIllIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public StateOverlayPanel(C0031f c0031f, C0027b c0027b, SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer) {
        this.bM = c0031f;
        this.bN = c0027b;
        this.bO = squireFarmerConfig;
        this.bP = squireFarmer;
        this.bQ = squireFarmer.getManager();
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lllIlllIllllII() {
        lIllllIllllI = new String[lIlllllIIIII[8]];
        lIllllIllllI[lIlllllIIIII[1]] = lllIlllIlllIII("Pj4nOgMIbxQyAwAqIA==", "mORSq");
        lIllllIllllI[lIlllllIIIII[2]] = lllIlllIlllIIl("jhiG2NtabI45/QbE4CL/uw==", "ZutAU");
        lIllllIllllI[lIlllllIIIII[3]] = lllIlllIlllIlI("Zop6UFqzbAk=", "YsSCa");
        lIllllIllllI[lIlllllIIIII[4]] = lllIlllIlllIIl("wmzu3FyqqqeotLRPwT7sPA==", "NLSOK");
        lIllllIllllI[lIlllllIIIII[5]] = lllIlllIlllIII("FD0hVzs/OCo=", "FHOwO");
        lIllllIllllI[lIlllllIIIII[6]] = lllIlllIlllIIl("PgMIbfbkG/M=", "SKPYi");
        lIllllIllllI[lIlllllIIIII[7]] = lllIlllIlllIIl("Ac54Zh+cQZ0=", "ngTLC");
    }

    private static boolean lllIllllIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static String lllIlllIlllIII(String lllllllllllllllIlIllIIIlIllIllll, String lllllllllllllllIlIllIIIlIllIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIIlIllIllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIIIlIllIlllI.toCharArray();
        int lllllllllllllllIlIllIIIlIllIlIll = lIlllllIIIII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlllllIIIII[1];
        while (lllIllllIIlIlI(i, length)) {
            char lllllllllllllllIlIllIIIlIlllIIII = charArray2[i];
            lllllllllllllllIlIllIIIlIllIllIl.append((char) (lllllllllllllllIlIllIIIlIlllIIII ^ charArray[lllllllllllllllIlIllIIIlIllIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlIllIIIlIllIlIll++;
            i++;
            "".length();
            if (" ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIIIlIllIllIl);
    }

    private static void lllIllllIIlIIl() {
        lIlllllIIIII = new int[10];
        lIlllllIIIII[0] = 116 ^ 126;
        lIlllllIIIII[1] = (245 ^ 166) & ((51 ^ 96) ^ (-1));
        lIlllllIIIII[2] = " ".length();
        lIlllllIIIII[3] = "  ".length();
        lIlllllIIIII[4] = "   ".length();
        lIlllllIIIII[5] = 175 ^ 171;
        lIlllllIIIII[6] = (((63 + 174) - 236) + 198) ^ (((15 + 105) - (-41)) + 33);
        lIlllllIIIII[7] = (151 ^ 199) ^ (205 ^ 155);
        lIlllllIIIII[8] = (((45 + 19) - 41) + 145) ^ (((131 + 93) - 114) + 65);
        lIlllllIIIII[9] = 121 ^ 113;
    }
}
