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
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.whisperer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.whisperer.SquireWhisperer;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.whisperer.overlay.WhispererManager;
import gg.squire.whisperer.overlay.WhispererManager;
import gg.squire.whisperer.overlay.RechargingTridentTask;
import gg.squire.whisperer.overlay.DodgingTentaclesTask;

public class WhispererInfoBox
extends OverlayPanel {
    private final  j v;
    private final  TaskManager s;
    private final  SquireWhisperer q;
    private final  a u;

    private final  d r;
    private final  p t;

    private static void llIIIIlIIIlIlIl() {
        lIlIlllIIlIIl = new String[lIlIlllIIllIl[11]];
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[0]] = "Squire Whisperer";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[4]] = "Version:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[5]] = "1.0.0";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[6]] = "Runtime:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[7]] = "Currently:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[8]] = "Kills:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[9]] = "Banking:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[10]] = "Has recharged trident:";
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        if (WhispererInfoBox.llIIIIlIIlIIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIIIIlIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WhispererInfoBox(SquireWhisperer squireWhisperer, d d2, p p2, a a2, j j2) {
        this.q = squireWhisperer;
        this.r = d2;
        this.s = squireWhisperer.getManager();
        this.t = p2;
        this.u = a2;
        this.v = j2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (WhispererInfoBox.llIIIIlIIlIIIIl(this.q.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        String string = lIlIlllIIlIIl[lIlIlllIIllIl[0]];
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lIlIlllIIllIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlllIIllIl[3], lIlIlllIIllIl[0]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[4]]).right(lIlIlllIIlIIl[lIlIlllIIllIl[5]]).build());

        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[6]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[7]]).right(this.s.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[8]]).right(String.valueOf(this.q.a())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[9]]).right(String.valueOf(this.u.b())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[10]]).right(String.valueOf(this.v.q())).build());

        return super.render(graphics2D);
    }

        return String.valueOf(var1);
    }

    static {
        WhispererInfoBox.llIIIIlIIlIIIII();
        WhispererInfoBox.llIIIIlIIIlIlIl();
    }

    private static boolean llIIIIlIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIlIIIIl(int n2) {
        return n2 != 0;
    }
}

