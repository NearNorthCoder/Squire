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
package gg.squire.plugins.agility;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
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

public class AgilityOverlay
extends OverlayPanel {
    private final  TaskManager c;
    
    private final  AgilityConfig b;
    
    private final  SquireAgilityPlugin a;

    private static boolean lIIlIlIlIIIllI(int n, int n2) {
        return n < n2;
    }

    private static void lIIlIlIlIIIIII() {
        lIllIIIIlIl = new String[lIllIIIIlll[9]];
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[0]] = "Squire Agility";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[1]] = "Runtime";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[2]] = "Version";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[3]] = "1.3.0";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[4]] = "Status";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[5]] = "Laps";
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[6]] = "Course";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIlIIIlIl(int n) {
        return n != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        AgilityOverlay var2;
        if (AgilityOverlay.lIIlIlIlIIIlIl(this.a.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIlIl[lIllIIIIlll[0]]).build());

        Duration var3 = Duration.between(var2.a.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[1]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[2]]).right(lIllIIIIlIl[lIllIIIIlll[3]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[4]]).right(var2.c.getCurrentTask()).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[5]]).right(var2.a.b() + " (" + var2.a(var2.a.b()) + "/h)").build());

        if (AgilityOverlay.lIIlIlIlIIIlIl(var2.b.progressive() ? 1 : 0)) {
            object = "Progressive (" + String.valueOf((Object)var2.a.a()) + ")";

            if ((78 + 149 - 80 + 25 ^ 149 + 72 - 81 + 28) < (0x52 ^ 0x5A ^ (0x45 ^ 0x49))) {
                return null;
            }
        } else {
            object = var2.a.a().toString();
        }
        Object object2 = object;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[6]]).right((String)object2).build());

        int n = lIllIIIIlll[7];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIIIlll[8], lIllIIIIlll[0]));
        return super.render(graphics2D);
    }

    static {
        AgilityOverlay.lIIlIlIlIIIlII();
        AgilityOverlay.lIIlIlIlIIIIII();
    }

    private long a(int n) {
        Duration duration = Duration.between(this.a.getStarted(), Instant.now());
        if (AgilityOverlay.lIIlIlIlIIIlIl(duration.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

    @Inject
    private AgilityOverlay(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.a = squireAgilityPlugin;
        this.b = agilityConfig;
        this.c = squireAgilityPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

