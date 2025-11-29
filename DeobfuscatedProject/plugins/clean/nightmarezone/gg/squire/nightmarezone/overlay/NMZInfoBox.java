/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.nightmarezone.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmarezone.SquireNightmareZone;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class NMZInfoBox
extends OverlayPanel {

    private final  SquireNightmareZone z;
    private final  TaskManager A;

    private static boolean lIIllllIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIlIlIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    public NMZInfoBox(SquireNightmareZone squireNightmareZone) {
        this.z = squireNightmareZone;
        this.A = squireNightmareZone.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        return String.valueOf(var1);
    }

    private static void lIIllllIlIlIIIl() {
        lIIIlIIIllIIl = new String[lIIIlIIIllIlI[6]];
        NMZInfoBox.lIIIlIIIllIIl[NMZInfoBox.lIIIlIIIllIlI[1]] = "Squire NMZ";
        NMZInfoBox.lIIIlIIIllIIl[NMZInfoBox.lIIIlIIIllIlI[4]] = "Runtime:";
        NMZInfoBox.lIIIlIIIllIIl[NMZInfoBox.lIIIlIIIllIlI[5]] = "Task: ";
    }

    static {
        NMZInfoBox.lIIllllIlIlIIlI();
        NMZInfoBox.lIIllllIlIlIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (NMZInfoBox.lIIllllIlIlIIll(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIIlIIIllIlI[0], lIIIlIIIllIlI[0], lIIIlIIIllIlI[0], lIIIlIIIllIlI[0]));
        String string = lIIIlIIIllIIl[lIIIlIIIllIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lIIIlIIIllIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIIlIIIllIlI[3], lIIIlIIIllIlI[1]));
        Duration duration = Duration.between(this.z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIIllIIl[lIIIlIIIllIlI[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIIllIIl[lIIIlIIIllIlI[5]]).right(this.A.getCurrentTask()).build());

        return super.render(graphics2D);
    }
}

