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
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
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
import gg.squire.duke.overlay.DukeManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class SquireDukeSucellusInfoBox
extends OverlayPanel {
    private  a u;

    private final  TaskManager ad;
    private final  SquireDukeSucellus ac;
    private final  SquireDukeSucellusConfig ae;

    private static void lllIIllIlllIIl() {
        lIllIlIIIlIl = new String[lIllIlIIIllI[8]];
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[1]] = "Squire Duke Sucellus";
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[4]] = "Runtime:";
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[5]] = "Kills: ";
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[6]] = "%d (%.1f/h)";
        SquireDukeSucellusInfoBox.lIllIlIIIlIl[SquireDukeSucellusInfoBox.lIllIlIIIllI[7]] = "Task:";
    }

    public long e(int n2) {
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        if (SquireDukeSucellusInfoBox.lllIIllIllllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lllIIllIlllIll(int n2) {
        return n2 != 0;
    }

    public double f(int n2) {
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        if (SquireDukeSucellusInfoBox.lllIIllIllllII(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean lllIIllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Inject
    public SquireDukeSucellusInfoBox(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig, a a2) {
        this.ac = squireDukeSucellus;
        this.ad = squireDukeSucellus.getManager();
        this.ae = squireDukeSucellusConfig;
        this.u = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lllIIllIllllII(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireDukeSucellusInfoBox.lllIIllIlllIll(this.ac.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIlIIIllI[0], lIllIlIIIllI[0], lIllIlIIIllI[0], lIllIlIIIllI[0]));
        String string = lIllIlIIIlIl[lIllIlIIIllI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lIllIlIIIllI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIllIlIIIllI[3], lIllIlIIIllI[1]));
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[4]]).right(Time.format((Duration)duration)).build());

        int n3 = this.ac.o();
        double d2 = this.f(n3);
        Object[] objectArray = new Object[lIllIlIIIllI[5]];
        objectArray[SquireDukeSucellusInfoBox.lIllIlIIIllI[1]] = n3;
        objectArray[SquireDukeSucellusInfoBox.lIllIlIIIllI[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[5]]).right(String.format(lIllIlIIIlIl[lIllIlIIIllI[6]], objectArray)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIIIlIl[lIllIlIIIllI[7]]).right(this.ad.getCurrentTask()).build());

        int n4 = Static.getClient().getTickCount();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Last spike: " + (n4 - this.u.D())).right("Last Gaze: " + (n4 - this.u.C())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.ac.l()).left("Banking: " + this.ac.p()).build());

        return super.render(graphics2D);
    }

    static {
        SquireDukeSucellusInfoBox.lllIIllIlllIlI();
        SquireDukeSucellusInfoBox.lllIIllIlllIIl();
    }
}

