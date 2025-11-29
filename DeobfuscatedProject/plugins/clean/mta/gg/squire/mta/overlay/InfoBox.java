/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.mta.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mta.SquireMTA;
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
import gg.squire.mta.overlay.GameEnum8;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {

    private final  SquireMTA ao;
    private final  TaskManager ap;

    private static void lIIIllIIIllIlII() {
        lllIlIlIllll = new String[lllIlIllIIII[10]];
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[1]] = "Squire MTA";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[2]] = "Runtime:";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[3]] = "Currently";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[4]] = "Alchemy points: ";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[5]] = "Enchantment points: ";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[6]] = "Graveyard points: ";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[7]] = "Telekinetic points: ";
    }

    static {
        InfoBox.lIIIllIIIllIlIl();
        InfoBox.lIIIllIIIllIlII();
    }

    private static boolean lIIIllIIIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    private InfoBox(SquireMTA squireMTA) {
        this.ao = squireMTA;
        this.ap = squireMTA.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIIllIIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (InfoBox.lIIIllIIIllIllI(this.ao.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.ao.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlIllIIII[0], lllIlIllIIII[0], lllIlIllIIII[0], lllIlIllIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIllll[lllIlIllIIII[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[2]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[3]]).right(String.valueOf(this.ap.getCurrentTask())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[4]]).right(this.ao.c(c.ALCHEMY) + "/" + this.ao.d(c.ALCHEMY)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[5]]).right(this.ao.c(c.ENCHANTMENT) + "/" + this.ao.d(c.ENCHANTMENT)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[6]]).right(this.ao.c(c.GRAVEYARD) + "/" + this.ao.d(c.GRAVEYARD)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[7]]).right(this.ao.c(c.TELEKENETIC) + "/" + this.ao.d(c.TELEKENETIC)).build());

        int n2 = lllIlIllIIII[8];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlIllIIII[9], lllIlIllIIII[1]));
        return super.render(graphics2D);
    }

}

