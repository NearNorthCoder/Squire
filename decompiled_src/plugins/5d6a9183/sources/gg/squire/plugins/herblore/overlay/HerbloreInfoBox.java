package gg.squire.plugins.herblore.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:gg/squire/plugins/herblore/overlay/HerbloreInfoBox.class */
public class HerbloreInfoBox extends OverlayPanel {
    private final /* synthetic */ HerbloreConfig m;
    private static /* synthetic */ String[] lllIlIIIlIll;
    private static /* synthetic */ int[] lllIlIIIllII;
    private final /* synthetic */ TaskManager l;
    private final /* synthetic */ SquireHerblore k;

    private static boolean lIIIlIlllIlIlII(int i) {
        return i == 0;
    }

    private static boolean lIIIlIlllIlIIll(int i) {
        return i != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIIlIlllIlIIll(this.k.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIlIIIllII[0], lllIlIIIllII[0], lllIlIIIllII[0], lllIlIIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIIIlIll[lllIlIIIllII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIIIlIll[lllIlIIIllII[2]]).right(Time.format(Duration.between(this.k.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIIIlIll[lllIlIIIllII[3]]).right(this.l.getCurrentTask()).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lllIlIIIllII[4] + lllIlIIIllII[5], lllIlIIIllII[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HerbloreInfoBox(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        this.k = squireHerblore;
        this.l = squireHerblore.getManager();
        this.m = herbloreConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIIlIlllIlIIlI() {
        lllIlIIIllII = new int[7];
        lllIlIIIllII[0] = (218 ^ 133) ^ (35 ^ 118);
        lllIlIIIllII[1] = ((((89 + 71) - 71) + 58) ^ (((97 + 77) - 149) + 113)) & (((((127 + 154) - 270) + 150) ^ (((64 + 145) - 138) + 113)) ^ (-" ".length()));
        lllIlIIIllII[2] = " ".length();
        lllIlIIIllII[3] = "  ".length();
        lllIlIIIllII[4] = ((176 + 140) - 137) + 14;
        lllIlIIIllII[5] = 172 ^ 184;
        lllIlIIIllII[6] = "   ".length();
    }

    public long c(int i) {
        Duration between = Duration.between(this.k.getStarted(), Instant.now());
        if (lIIIlIlllIlIlII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlllIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIlllIlIIIl() {
        lllIlIIIlIll = new String[lllIlIIIllII[6]];
        lllIlIIIlIll[lllIlIIIllII[1]] = lIIIlIlllIlIIII("PSs5LQULegQhBQw2IzYS", "nZLDw");
        lllIlIIIlIll[lllIlIIIllII[2]] = lIIIlIlllIlIIII("Ig0dBhwdHUlS", "pxsru");
        lllIlIIIlIll[lllIlIIIllII[3]] = lIIIlIlllIlIIII("ATsfOVJ1", "UZlRh");
    }

    private static String lIIIlIlllIlIIII(String lllllllllllllllIIllIIlIIIIllIIlI, String lllllllllllllllIIllIIlIIIIllIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIIIIllIIII = new StringBuilder();
        char[] lllllllllllllllIIllIIlIIIIlIllll = lllllllllllllllIIllIIlIIIIllIIIl.toCharArray();
        int lllllllllllllllIIllIIlIIIIlIlllI = lllIlIIIllII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIIIllII[1];
        while (lIIIlIlllIlIlIl(i, length)) {
            char lllllllllllllllIIllIIlIIIIlIIlIl = charArray[i];
            lllllllllllllllIIllIIlIIIIllIIII.append((char) (lllllllllllllllIIllIIlIIIIlIIlIl ^ lllllllllllllllIIllIIlIIIIlIllll[lllllllllllllllIIllIIlIIIIlIlllI % lllllllllllllllIIllIIlIIIIlIllll.length]));
            "".length();
            lllllllllllllllIIllIIlIIIIlIlllI++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIIIIllIIII);
    }

    static {
        lIIIlIlllIlIIlI();
        lIIIlIlllIlIIIl();
    }
}
