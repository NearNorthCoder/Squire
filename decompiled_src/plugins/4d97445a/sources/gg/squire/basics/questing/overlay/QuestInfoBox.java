package gg.squire.basics.questing.overlay;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.TaskManager;
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
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/questing/overlay/QuestInfoBox.class */
public class QuestInfoBox extends OverlayPanel {
    private static final /* synthetic */ String fF;
    private /* synthetic */ Object fJ;
    private static /* synthetic */ String[] llIlIIIII;
    private /* synthetic */ Object fI;
    private final /* synthetic */ SquireQuestHelper fG;
    private static /* synthetic */ int[] llIlIIIIl;
    private final /* synthetic */ TaskManager fH;

    @Inject
    private QuestInfoBox(SquireQuestHelper squireQuestHelper) {
        this.fG = squireQuestHelper;
        this.fH = squireQuestHelper.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.fI = this.fG.cw();
        this.fJ = this.fG.cz();
    }

    private static boolean lIllIllIIIl(int i2) {
        return i2 == 0;
    }

    static {
        lIllIlIllll();
        lIllIlIlllI();
        fF = llIlIIIII[llIlIIIIl[7]];
    }

    private static String lIllIlIllIl(String lIllIIIlllIIlII, String lIllIIIlllIIIll) {
        try {
            SecretKeySpec lIllIIIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), llIlIIIIl[8]), "DES");
            Cipher lIllIIIlllIIllI = Cipher.getInstance("DES");
            lIllIIIlllIIllI.init(llIlIIIIl[2], lIllIIIlllIIlll);
            return new String(lIllIIIlllIIllI.doFinal(Base64.getDecoder().decode(lIllIIIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIlllIIIII) {
            lIllIIIlllIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dimension render(Graphics2D graphics2D) {
        String str;
        if (lIllIllIIII(this.fG.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration.between(this.fG.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIIIII[llIlIIIIl[0]]).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(llIlIIIII[llIlIIIIl[1]]);
        if (lIllIllIIII(this.fG.isEnabled() ? 1 : 0)) {
            str = llIlIIIII[llIlIIIIl[2]];
            "".length();
            if (((100 ^ 123) ^ (54 ^ 45)) < 0) {
                return null;
            }
        } else {
            str = llIlIIIII[llIlIIIIl[3]];
        }
        children.add(left.right(str).build());
        "".length();
        if (lIllIllIIIl(this.fG.isEnabled() ? 1 : 0)) {
            return super.render(graphics2D);
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[4]]).right(String.valueOf(this.fI)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[5]]).right(String.valueOf(this.fJ)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[6]]).right(this.fH.getCurrentTask()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean lIllIllIIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIllIllIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIllIlIlllI() {
        llIlIIIII = new String[llIlIIIIl[8]];
        llIlIIIII[llIlIIIIl[0]] = lIllIlIlIll("HhcMGSUoRigFMj4SWSEYAQ==", "MfypW");
        llIlIIIII[llIlIIIIl[1]] = lIllIlIlIll("EiUaNDQm", "BDoGQ");
        llIlIIIII[llIlIIIIl[2]] = lIllIlIlIll("Jho=", "huTka");
        llIlIIIII[llIlIIIIl[3]] = lIllIlIllII("22w6SEAGecc=", "onTVx");
        llIlIIIII[llIlIIIIl[4]] = lIllIlIlIll("LQERBSkAAEMmOQsHFw==", "ntcwL");
        llIlIIIII[llIlIIIIl[5]] = lIllIlIllIl("JV05JpzyUhlUrmwQ1nNn3Q==", "XYsFT");
        llIlIIIII[llIlIIIIl[6]] = lIllIlIlIll("ATcVKj8sNkcMOzEp", "BBgXZ");
        llIlIIIII[llIlIIIIl[7]] = lIllIlIlIll("R1VDRHpHVUNEekdVQ0R6R1VDRHpHVUNEekdVQ0R6R1VDRHpH", "jxniW");
    }

    private static String lIllIlIlIll(String lIllIIIlllllIIl, String lIllIIIlllllIII) {
        String lIllIIIlllllIIl2 = new String(Base64.getDecoder().decode(lIllIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIllIIIllllIllI = lIllIIIlllllIII.toCharArray();
        int lIllIIIllllIlIl = llIlIIIIl[0];
        char[] charArray = lIllIIIlllllIIl2.toCharArray();
        int lIllIIIlllIlllI = charArray.length;
        int i2 = llIlIIIIl[0];
        while (lIllIllIIlI(i2, lIllIIIlllIlllI)) {
            char lIllIIIlllllIlI = charArray[i2];
            sb.append((char) (lIllIIIlllllIlI ^ lIllIIIllllIllI[lIllIIIllllIlIl % lIllIIIllllIllI.length]));
            "".length();
            lIllIIIllllIlIl++;
            i2++;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIlIllII(String lIllIIlIIIIlIIl, String lIllIIlIIIIIllI) {
        try {
            SecretKeySpec lIllIIlIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIIl[2], lIllIIlIIIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIIIIlIlI) {
            lIllIIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllll() {
        llIlIIIIl = new int[9];
        llIlIIIIl[0] = ((104 ^ 4) ^ (204 ^ 137)) & (((161 ^ 183) ^ (249 ^ 198)) ^ (-" ".length()));
        llIlIIIIl[1] = " ".length();
        llIlIIIIl[2] = "  ".length();
        llIlIIIIl[3] = "   ".length();
        llIlIIIIl[4] = (86 ^ 99) ^ (170 ^ 155);
        llIlIIIIl[5] = 38 ^ 35;
        llIlIIIIl[6] = (191 ^ 168) ^ (37 ^ 52);
        llIlIIIIl[7] = (123 ^ 93) ^ (181 ^ 148);
        llIlIIIIl[8] = 200 ^ 192;
    }
}
