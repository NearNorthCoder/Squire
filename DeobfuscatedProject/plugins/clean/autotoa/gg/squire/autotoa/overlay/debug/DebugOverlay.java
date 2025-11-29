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
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.autotoa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.autotoa.overlay.debug.AutotoaManager;
import gg.squire.autotoa.overlay.debug.GameEnum95;

@Singleton
public class DebugOverlay
extends OverlayPanel {
    private final  C cb;
    private final  SquireAutoTOA bZ;
    private final  TaskManager ca;

    @Inject
    protected DebugOverlay(SquireAutoTOA squireAutoTOA, C c2) {
        this.bZ = squireAutoTOA;
        this.ca = squireAutoTOA.getManager();
        this.cb = c2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

        return String.valueOf(var1);
    }

    private static boolean lIIllllIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIlIIIIl() {
        llIIIlIIIIl = new String[llIIIlIlllI[8]];
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[0]] = "Squire Auto TOA";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[1]] = "Runtime";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[2]] = "Version";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[3]] = "2.10.3";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[4]] = "Performing Task";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[5]] = "Completed Raids";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[6]] = "Deaths (this raid)";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[7]] = "Failed Raids";
    }

    static {
        DebugOverlay.lIIllllIlIIIlI();
        DebugOverlay.lIIllllIlIIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        DebugOverlay var2;
        if (DebugOverlay.lIIllllIlIIIll(this.bZ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var3 = Duration.between(var2.bZ.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIIlIIIIl[llIIIlIlllI[0]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[1]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[2]]).right(llIIIlIIIIl[llIIIlIlllI[3]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[4]]).right(var2.ca.getCurrentTask()).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[5]]).right(String.valueOf(var2.bZ.i())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[6]]).right(String.valueOf(var2.bZ.k())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[7]]).right(String.valueOf(var2.bZ.j())).build());

        Iterator<e> var4 = var2.cb.av().keySet().iterator();
        while (DebugOverlay.lIIllllIlIIIll(var4.hasNext() ? 1 : 0)) {
            e var5 = var4.next();
            var2.panelComponent.getChildren().add(LineComponent.builder().left(var5.toString()).right(var2.cb.av().get((Object)var5).toString()).build());

            if (((0x72 ^ 0x36) & ~(0x31 ^ 0x75)) == 0) continue;
            return null;
        }
        return super.render(graphics2D);
    }
}

