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
package gg.squire.slayer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.slayer.SquireSkipperPlugin;
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
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class SkipperOverlay
extends OverlayPanel {
    
    private final  SquireSkipperPlugin p;
    private final  TaskManager q;

        return String.valueOf(var1);
    }

    private static boolean lIlllIlIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        SkipperOverlay.lIlllIlIlIllIII();
        SkipperOverlay.lIlllIlIlIlIlll();
    }

    private static boolean lIlllIlIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    private SkipperOverlay(SquireSkipperPlugin squireSkipperPlugin) {
        this.p = squireSkipperPlugin;
        this.q = squireSkipperPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIlllIlIlIlIlll() {
        lIlIIlIIllIIl = new String[lIlIIlIIllIlI[12]];
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[0]] = "Squire Task Skipper";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[1]] = "Runtime";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[2]] = "Version";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[3]] = "2.1.0";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[4]] = "Task: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[5]] = "Slayer Task: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[6]] = "Need supplies: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[7]] = "Task Completed: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[8]] = "Task Completed Per Hour: ";
        SkipperOverlay.lIlIIlIIllIIl[SkipperOverlay.lIlIIlIIllIlI[9]] = "Current Streak: ";
    }

    public long f(int n2) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (SkipperOverlay.lIlllIlIlIllIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        SkipperOverlay var2;
        if (SkipperOverlay.lIlllIlIlIllIIl(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var3 = Duration.between(var2.p.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIlIIllIIl[lIlIIlIIllIlI[0]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[1]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[2]]).right(lIlIIlIIllIIl[lIlIIlIIllIlI[3]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[4]]).right(var2.q.getCurrentTask()).build());

        if (SkipperOverlay.lIlllIlIlIllIlI((Object)var2.p.b())) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[5]]).right(var2.p.b().toString()).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[6]]).right(String.valueOf(var2.p.h())).build());

        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[7]]).right(String.valueOf(this.p.f())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[8]]).right(String.valueOf(this.f(this.p.f()))).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIIllIIl[lIlIIlIIllIlI[9]]).right(String.valueOf(this.p.g())).build());

        int n2 = lIlIIlIIllIlI[10];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIIlIIllIlI[11], lIlIIlIIllIlI[0]));
        return super.render(graphics2D);
    }

    private static boolean lIlllIlIlIllIlI(Object object) {
        return object != null;
    }

}

