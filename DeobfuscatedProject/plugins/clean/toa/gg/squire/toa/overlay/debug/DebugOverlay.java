/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.toa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.toa.SquireTOA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

@Singleton
public class DebugOverlay
extends OverlayPanel {
    private final  TaskManager aK;

    private final  SquireTOA aJ;

    private static boolean lIllIlIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        DebugOverlay.lIllIlIlIlIIIll();
        DebugOverlay.lIllIlIlIlIIIlI();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (DebugOverlay.lIllIlIlIlIIlII(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIII[0]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIII[1]]).right(this.aK.getCurrentTask()).build());

        return super.render(graphics2D);
    }

    private static boolean lIllIlIlIlIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected DebugOverlay(SquireTOA squireTOA) {
        this.aJ = squireTOA;
        this.aK = squireTOA.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static void lIllIlIlIlIIIlI() {
        lIIlllllIllll = new String[lIIllllllIIII[2]];
        DebugOverlay.lIIlllllIllll[DebugOverlay.lIIllllllIIII[0]] = "Squire TOA";
        DebugOverlay.lIIlllllIllll[DebugOverlay.lIIllllllIIII[1]] = "Performing Task";
    }

        return String.valueOf(var1);
    }
}

