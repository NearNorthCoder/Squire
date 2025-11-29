package gg.squire.basics.minigames.toader.overlay;

import com.google.inject.Inject;
import gg.squire.basics.minigames.toader.SquireToadKiller;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/minigames/toader/overlay/ToaderOverlay.class */
public class ToaderOverlay extends OverlayPanel {
    private final /* synthetic */ SquireToadKiller fl;
    private static /* synthetic */ String[] lllIlIlll;
    private static /* synthetic */ int[] lllIllIII;
    private final /* synthetic */ TaskManager fm;

    private static boolean llIIlIllIlI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        llIIlIllIII();
        llIIlIlIlll();
    }

    private static String llIIlIlIlIl(String lIlIlIIlIllllIl, String lIlIlIIlIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIlIlllllI.getBytes(StandardCharsets.UTF_8)), lllIllIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIllIIIIII) {
            lIlIlIIllIIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIlII(String lIlIlIIlIIllIlI, String lIlIlIIlIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIlIIlllII = Cipher.getInstance("Blowfish");
            lIlIlIIlIIlllII.init(lllIllIII[2], secretKeySpec);
            return new String(lIlIlIIlIIlllII.doFinal(Base64.getDecoder().decode(lIlIlIIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIlIIllIll) {
            lIlIlIIlIIllIll.printStackTrace();
            return null;
        }
    }

    @Inject
    private ToaderOverlay(SquireToadKiller squireToadKiller) {
        this.fl = squireToadKiller;
        this.fm = squireToadKiller.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIlIllIIl(this.fl.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.fl.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlll[lllIllIII[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[2]]).right(lllIlIlll[lllIllIII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[4]]).right(this.fm.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[5]]).right(String.valueOf(this.fl.cs())).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIllIII[6] + lllIllIII[7], lllIllIII[0]));
        return super.render(graphics2D);
    }

    private static void llIIlIlIlll() {
        lllIlIlll = new String[lllIllIII[8]];
        lllIlIlll[lllIllIII[0]] = llIIlIlIlII("7HKXc/B/RItUr3uhrmjMitLsGqjYe7TM", "sTwfp");
        lllIlIlll[lllIllIII[1]] = llIIlIlIlIl("2eWjqyeKVBY=", "haBiN");
        lllIlIlll[lllIllIII[2]] = llIIlIlIlIl("Wn9qEczaYnQ=", "NwvqJ");
        lllIlIlll[lllIllIII[3]] = llIIlIlIlII("p6nwf1LOOTM=", "dMMXf");
        lllIlIlll[lllIllIII[4]] = llIIlIlIllI("Ixc/PUNX", "wvLVy");
        lllIlIlll[lllIllIII[5]] = llIIlIlIlIl("ZGi58OsV0JNcLajFKRGTng==", "qVIQj");
    }

    private static void llIIlIllIII() {
        lllIllIII = new int[10];
        lllIllIII[0] = (36 ^ 34) & ((67 ^ 69) ^ (-1));
        lllIllIII[1] = " ".length();
        lllIllIII[2] = "  ".length();
        lllIllIII[3] = "   ".length();
        lllIllIII[4] = 165 ^ 161;
        lllIllIII[5] = (51 ^ 114) ^ (38 ^ 98);
        lllIllIII[6] = (-((-4353) & 32253)) & (-4609) & 32766;
        lllIllIII[7] = (((5 + 79) - 79) + 178) ^ (((67 + 144) - 204) + 156);
        lllIllIII[8] = (70 ^ 53) ^ (82 ^ 39);
        lllIllIII[9] = (181 ^ 164) ^ (10 ^ 19);
    }

    private static String llIIlIlIllI(String lIlIlIIlIlIllll, String lIlIlIIlIlIlllI) {
        String lIlIlIIlIlIllll2 = new String(Base64.getDecoder().decode(lIlIlIIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIlIlIllIl = new StringBuilder();
        char[] lIlIlIIlIlIllII = lIlIlIIlIlIlllI.toCharArray();
        int lIlIlIIlIlIlIll = lllIllIII[0];
        char[] charArray = lIlIlIIlIlIllll2.toCharArray();
        int length = charArray.length;
        int i2 = lllIllIII[0];
        while (llIIlIllIlI(i2, length)) {
            lIlIlIIlIlIllIl.append((char) (charArray[i2] ^ lIlIlIIlIlIllII[lIlIlIIlIlIlIll % lIlIlIIlIlIllII.length]));
            "".length();
            lIlIlIIlIlIlIll++;
            i2++;
            "".length();
            if ((-" ".length()) > (17 ^ 21)) {
                return null;
            }
        }
        return String.valueOf(lIlIlIIlIlIllIl);
    }

    private static boolean llIIlIllIIl(int i2) {
        return i2 != 0;
    }
}
