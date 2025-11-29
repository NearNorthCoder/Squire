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
package gg.squire.hunter.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.hunter.SquireHunter;
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

public class HunterInfoBox
extends OverlayPanel {
    private final  TaskManager t;

    private final  SquireHunter s;

    public long c(int n2) {
        Duration duration = Duration.between(this.s.getStarted(), Instant.now());
        if (HunterInfoBox.lIIIllIllIlIllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIllIllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIllIlIIll() {
        lllIlllIIIII = new String[lllIlllIIIIl[9]];
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[1]] = "Squire Hunter";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[2]] = "Version";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[3]] = "1.4.2";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[4]] = "Runtime";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[5]] = "Task: ";
        HunterInfoBox.lllIlllIIIII[HunterInfoBox.lllIlllIIIIl[6]] = "Caught: ";
    }

    static {
        HunterInfoBox.lIIIllIllIlIlII();
        HunterInfoBox.lIIIllIllIlIIll();
    }

    private static boolean lIIIllIllIlIllI(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HunterInfoBox.lIIIllIllIlIlIl(this.s.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.s.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlllIIIIl[0], lllIlllIIIIl[0], lllIlllIIIIl[0], lllIlllIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(lllIlllIIIII[lllIlllIIIIl[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[2]]).right(lllIlllIIIII[lllIlllIIIIl[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[5]]).right(this.t.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlllIIIII[lllIlllIIIIl[6]]).right(this.s.a() + " (" + this.c(this.s.a()) + "/hr)").build());

        int n2 = lllIlllIIIIl[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlllIIIIl[8], lllIlllIIIIl[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HunterInfoBox(SquireHunter squireHunter) {
        this.s = squireHunter;
        this.t = squireHunter.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

}

