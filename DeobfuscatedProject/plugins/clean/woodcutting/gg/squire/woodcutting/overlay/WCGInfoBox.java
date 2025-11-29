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
package gg.squire.woodcutting.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
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

public class WCGInfoBox
extends OverlayPanel {

    private final  SquireWoodcutterConfig q;
    private final  TaskManager r;
    private final  SquireWoodcutterPlugin p;

    static {
        WCGInfoBox.llIIIlIIIIlIllI();
        WCGInfoBox.llIIIlIIIIlIlIl();
    }

    private static boolean llIIIlIIIIllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIIlIIIIlIlll(int n) {
        return n != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIlIIIIllIII(int n) {
        return n == 0;
    }

    @Inject
    private WCGInfoBox(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.p = squireWoodcutterPlugin;
        this.q = squireWoodcutterConfig;
        this.r = squireWoodcutterPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (WCGInfoBox.llIIIlIIIIlIlll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIllIIIIlIIII[0], lIllIIIIlIIII[0], lIllIIIIlIIII[0], lIllIIIIlIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIIllII[lIllIIIIlIIII[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[2]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[3]]).right(lIllIIIIIllII[lIllIIIIlIIII[4]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[5]]).right(this.r.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[6]]).right("" + SquireWoodcutterPlugin.b).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[7]]).right("" + this.d(SquireWoodcutterPlugin.b)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIIllII[lIllIIIIlIIII[8]]).right("" + SquireWoodcutterPlugin.c).build());

        int n = lIllIIIIlIIII[9];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIIIlIIII[10], lIllIIIIlIIII[1]));
        return super.render(graphics2D);
    }

    private static void llIIIlIIIIlIlIl() {
        lIllIIIIIllII = new String[lIllIIIIlIIII[11]];
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[1]] = "Squire Woodcutting";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[2]] = "Runtime";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[3]] = "Version";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[4]] = "1.1.7";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[5]] = "Task: ";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[6]] = "Logs";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[7]] = "Logs Per Hour";
        WCGInfoBox.lIllIIIIIllII[WCGInfoBox.lIllIIIIlIIII[8]] = "Birds Nest";
    }

    public long d(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (WCGInfoBox.llIIIlIIIIllIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }
}

