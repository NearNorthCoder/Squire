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
package gg.squire.basics.minigames.toader.overlay;

import com.google.inject.Inject;
import gg.squire.basics.minigames.toader.SquireToadKiller;
import gg.squire.client.plugins.fw.TaskManager;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class ToaderOverlay
extends OverlayPanel {
    private final  SquireToadKiller fl;

    private final  TaskManager fm;

    private static boolean llIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ToaderOverlay.llIIlIllIII();
        ToaderOverlay.llIIlIlIlll();
    }

    @Inject
    private ToaderOverlay(SquireToadKiller squireToadKiller) {
        this.fl = squireToadKiller;
        this.fm = squireToadKiller.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ToaderOverlay.llIIlIllIIl(this.fl.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.fl.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlll[lllIllIII[0]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[1]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[2]]).right(lllIlIlll[lllIllIII[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[4]]).right(this.fm.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[lllIllIII[5]]).right(String.valueOf(this.fl.cs())).build());

        int n2 = lllIllIII[6];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIllIII[7], lllIllIII[0]));
        return super.render(graphics2D);
    }

    private static void llIIlIlIlll() {
        lllIlIlll = new String[lllIllIII[8]];
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[0]] = "Squire Toad Killer";
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[1]] = "Runtime";
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[2]] = "Version";
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[3]] = "1.0.0";
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[4]] = "Task: ";
        ToaderOverlay.lllIlIlll[ToaderOverlay.lllIllIII[5]] = "Killed birds: ";
    }

        return String.valueOf(lIlIlIIlIlIllIl);
    }

    private static boolean llIIlIllIIl(int n2) {
        return n2 != 0;
    }
}

