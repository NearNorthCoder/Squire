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
package gg.squire.vardorvis.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
import gg.squire.vardorvis.overlay.VardorvisManager;

public class SquireVardorvisBox
extends OverlayPanel {
    
    private final  SquireVardorvisConfig ab;
    private final  TaskManager aa;
    private final  SquireVardorvis Z;
    private  e l;

    static {
        SquireVardorvisBox.lIlllllIIIIIIIl();
        SquireVardorvisBox.lIlllllIIIIIIII();
    }

    private static boolean lIlllllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public SquireVardorvisBox(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2) {
        this.Z = squireVardorvis;
        this.aa = squireVardorvis.getManager();
        this.ab = squireVardorvisConfig;
        this.l = e2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireVardorvisBox.lIlllllIIIIIIlI(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlIllIl[0], lIlIlIIlIllIl[0], lIlIlIIlIllIl[0], lIlIlIIlIllIl[0]));
        String string = lIlIlIIlIllII[lIlIlIIlIllIl[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lIlIlIIlIllIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlIIlIllIl[3], lIlIlIIlIllIl[1]));
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[4]]).right(Time.format((Duration)duration)).build());

        int n3 = this.Z.g();
        double d2 = this.g(n3);
        Object[] objectArray = new Object[lIlIlIIlIllIl[5]];
        objectArray[SquireVardorvisBox.lIlIlIIlIllIl[1]] = n3;
        objectArray[SquireVardorvisBox.lIlIlIIlIllIl[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[5]]).right(String.format(lIlIlIIlIllII[lIlIlIIlIllIl[6]], objectArray)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[7]]).right(this.aa.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.Z.f()).left("Banking: " + this.Z.h()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[8]]).right(String.valueOf(this.Z.i())).build());

        return super.render(graphics2D);
    }

    private static void lIlllllIIIIIIII() {
        lIlIlIIlIllII = new String[lIlIlIIlIllIl[9]];
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[1]] = "Squire Vardorvis";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[4]] = "Runtime:";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[5]] = "Kills: ";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[6]] = "%d (%.1f/h)";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[7]] = "Task:";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[8]] = "Died:";
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (SquireVardorvisBox.lIlllllIIIIIIll(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean lIlllllIIIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllIIIIIIlI(int n2) {
        return n2 != 0;
    }

    public long f(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (SquireVardorvisBox.lIlllllIIIIIIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }
}

