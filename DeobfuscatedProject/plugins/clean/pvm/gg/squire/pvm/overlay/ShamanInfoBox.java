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
package gg.squire.pvm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.pvm.SquireShamansPlugin;
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
import gg.squire.pvm.overlay.AHelper;
import gg.squire.pvm.overlay.CHelper;

public class ShamanInfoBox
extends OverlayPanel {
    
    private final  c L;
    private final  TaskManager K;
    private final  SquireShamansPlugin J;
    
    private  a M;

    @Inject
    private ShamanInfoBox(SquireShamansPlugin squireShamansPlugin, c c2, a a2) {
        this.J = squireShamansPlugin;
        this.K = squireShamansPlugin.getManager();
        this.L = c2;
        this.M = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIlllIIllIIIl(int n2) {
        return n2 != 0;
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        if (ShamanInfoBox.lIlIlllIIllIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        ShamanInfoBox.lIlIlllIIllIIII();
        ShamanInfoBox.lIlIlllIIlIllll();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ShamanInfoBox.lIlIlllIIllIIIl(this.J.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIllllllll[lIIllIIIIIIII[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[2]]).right(lIIlIllllllll[lIIllIIIIIIII[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[5]]).right(this.K.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[6]]).right(String.valueOf(this.M.m())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[7]]).right(String.valueOf(this.J.a())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[8]]).right("" + this.c(this.J.a())).build());

        int n2 = lIIllIIIIIIII[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllIIIIIIII[10], lIIllIIIIIIII[1]));
        return super.render(graphics2D);
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlllIIlIllll() {
        lIIlIllllllll = new String[lIIllIIIIIIII[11]];
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[1]] = "Squire Shamans";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[2]] = "Version";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[3]] = "0.2.7";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[4]] = "Runtime";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[5]] = "Task: ";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[6]] = "Looting: ";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[7]] = "Kills";
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[8]] = "Kills Per Hour";
    }

    private static boolean lIlIlllIIllIIlI(int n2) {
        return n2 == 0;
    }
}

