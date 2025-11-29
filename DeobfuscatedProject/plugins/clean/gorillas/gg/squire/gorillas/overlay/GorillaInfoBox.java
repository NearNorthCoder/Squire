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
package gg.squire.gorillas.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.gorillas.SquireGorillaPlugin;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class GorillaInfoBox
extends OverlayPanel {
    
    private final  TaskManager Q;
    private final  SquireGorillaPlugin P;

    public Dimension render(Graphics2D graphics2D) {
        if (GorillaInfoBox.lllllIlIlIIIIl(this.P.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.P.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llIIlIlIIIlI[0], llIIlIlIIIlI[0], llIIlIlIIIlI[0], llIIlIlIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIlIlIIIIl[llIIlIlIIIlI[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[2]]).right(llIIlIlIIIIl[llIIlIlIIIlI[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[5]]).right(this.Q.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[6]]).right(String.valueOf(this.P.i())).build());

        int n2 = llIIlIlIIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIIlIlIIIlI[8], llIIlIlIIIlI[1]));
        return super.render(graphics2D);
    }

    static {
        GorillaInfoBox.lllllIlIlIIIII();
        GorillaInfoBox.lllllIlIIlllll();
    }

    private static boolean lllllIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllllIlIIlllll() {
        llIIlIlIIIIl = new String[llIIlIlIIIlI[9]];
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[1]] = "Squire Gorillas";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[2]] = "Version";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[3]] = "0.3.1";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[4]] = "Runtime";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[5]] = "Task";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[6]] = "Kills";
    }

    @Inject
    private GorillaInfoBox(SquireGorillaPlugin squireGorillaPlugin) {
        this.P = squireGorillaPlugin;
        this.Q = squireGorillaPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lllllIlIlIIIIl(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

}

