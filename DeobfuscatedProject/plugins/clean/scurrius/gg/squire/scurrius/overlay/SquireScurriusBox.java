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
package gg.squire.scurrius.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
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
import gg.squire.scurrius.overlay.BHelper;

public class SquireScurriusBox
extends OverlayPanel {
    private final  SquireScurriusConfig K;

    private  b c;
    private final  SquireScurrius I;
    private final  TaskManager J;

    @Inject
    public SquireScurriusBox(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2) {
        this.I = squireScurrius;
        this.J = squireScurrius.getManager();
        this.K = squireScurriusConfig;
        this.c = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIllIIllIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIllIlIII() {
        lIIlIllIIIlll = new String[lIIlIllIIlIII[8]];
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[1]] = "Squire Scurrius";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[4]] = "Runtime:";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[5]] = "Kills: ";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[6]] = "%d (%.1f/h)";
        SquireScurriusBox.lIIlIllIIIlll[SquireScurriusBox.lIIlIllIIlIII[7]] = "Task:";
    }

        return String.valueOf(var1);
    }

    public double c(int n2) {
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        if (SquireScurriusBox.lIlIllIIllIlIll(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireScurriusBox.lIlIllIIllIlIlI(this.I.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlIllIIlIII[0], lIIlIllIIlIII[0], lIIlIllIIlIII[0], lIIlIllIIlIII[0]));
        String string = lIIlIllIIIlll[lIIlIllIIlIII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lIIlIllIIlIII[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlIllIIlIII[3], lIIlIllIIlIII[1]));
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[4]]).right(Time.format((Duration)duration)).build());

        int n3 = this.I.l();
        double d2 = this.c(n3);
        Object[] objectArray = new Object[lIIlIllIIlIII[5]];
        objectArray[SquireScurriusBox.lIIlIllIIlIII[1]] = n3;
        objectArray[SquireScurriusBox.lIIlIllIIlIII[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[5]]).right(String.format(lIIlIllIIIlll[lIIlIllIIlIII[6]], objectArray)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllIIIlll[lIIlIllIIlIII[7]]).right(this.J.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.I.j()).left("Banking: " + this.I.m()).build());

        return super.render(graphics2D);
    }

    private static boolean lIlIllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.I.getStarted(), Instant.now());
        if (SquireScurriusBox.lIlIllIIllIlIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        SquireScurriusBox.lIlIllIIllIlIIl();
        SquireScurriusBox.lIlIllIIllIlIII();
    }

    private static boolean lIlIllIIllIllII(int n2, int n3) {
        return n2 < n3;
    }

}

