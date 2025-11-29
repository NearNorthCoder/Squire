/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.ectofuntus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class EctoOverlay
extends OverlayPanel {
    
    private final  SquireEcto cW;
    private final  TaskManager cX;

    public long u(int n2) {
        Duration duration = Duration.between(this.cW.getStarted(), Instant.now());
        if (EctoOverlay.llIIllIIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIllIIIIl(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        EctoOverlay lIlIlIIlIIIlIlI;
        if (EctoOverlay.llIIllIIIII(this.cW.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lIlIlIIlIIIlIII = Duration.between(lIlIlIIlIIIlIlI.cW.getStarted(), Instant.now());
        lIlIlIIlIIIlIlI.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllIIl[lllIllIlI[0]]).build());

        lIlIlIIlIIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[1]]).right(Time.format((Duration)lIlIlIIlIIIlIII)).build());

        lIlIlIIlIIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[2]]).right(lIlIlIIlIIIlIlI.cX.getCurrentTask()).build());

        List list = lIlIlIIlIIIlIlI.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lllIllIIl[lllIllIlI[3]]);
        if (EctoOverlay.llIIllIIIII(lIlIlIIlIIIlIlI.cW.r() ? 1 : 0)) {
            string = lllIllIIl[lllIllIlI[4]];

            if (1 < 0) {
                return null;
            }
        } else {
            string = lllIllIIl[lllIllIlI[5]];
        }
        list.add(lineComponentBuilder.right(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[6]]).right(this.cW.bm() + " (" + this.u(this.cW.bm()) + "/h)").build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[7]]).right(this.cW.bl() + " (" + this.u(this.cW.bl()) + "/h)").build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[lllIllIlI[8]]).right(this.cW.bn() + " (" + this.u(this.cW.bn()) + "/h)").build());

        int n2 = lllIllIlI[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIllIlI[10], lllIllIlI[0]));
        return super.render(graphics2D);
    }

    static {
        EctoOverlay.llIIlIlllll();
        EctoOverlay.llIIlIllllI();
    }

    @Inject
    private EctoOverlay(SquireEcto squireEcto) {
        this.cW = squireEcto;
        this.cX = squireEcto.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

        return String.valueOf(lIlIlIIIlllIlII);
    }

    private static void llIIlIllllI() {
        lllIllIIl = new String[lllIllIlI[11]];
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[0]] = "Squire Ectofuntus";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[1]] = "Runtime: ";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[2]] = "Current Task: ";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[3]] = "Banking: ";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[4]] = "Yes";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[5]] = "No";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[6]] = "Prayed Bones: ";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[7]] = "Ground Bones: ";
        EctoOverlay.lllIllIIl[EctoOverlay.lllIllIlI[8]] = "Slime Collected: ";
    }

    private static boolean llIIllIIIII(int n2) {
        return n2 != 0;
    }
}

