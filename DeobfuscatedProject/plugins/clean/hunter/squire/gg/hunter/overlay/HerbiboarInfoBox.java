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
package gg.squire.hunter.tasks;

import com.google.inject.Inject;
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
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.hunter.tasks.BHelper;
import squire.gg.hunter.SquireHerbiboarPlugin;

public class HerbiboarInfoBox
extends OverlayPanel {
    private final  TaskManager aa;
    private final  SquireHerbiboarPlugin Z;

    private final  b ab;

    @Inject
    private HerbiboarInfoBox(SquireHerbiboarPlugin squireHerbiboarPlugin, b b2) {
        this.Z = squireHerbiboarPlugin;
        this.aa = squireHerbiboarPlugin.getManager();
        this.ab = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIIlIlIIllllII(int n2) {
        return n2 != 0;
    }

    static {
        HerbiboarInfoBox.lIIIlIlIIlllIll();
        HerbiboarInfoBox.lIIIlIlIIlllIlI();
    }

    private static void lIIIlIlIIlllIlI() {
        lllIIllIIIll = new String[lllIIllIIlII[11]];
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[0]] = "Squire Herbiboar";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[1]] = "Runtime";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[2]] = "Version";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[3]] = "1.1.5";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[4]] = "Current state: ";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[5]] = "Needs restock: ";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[6]] = "Task: ";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[7]] = "Herbiboar Kills";
        HerbiboarInfoBox.lllIIllIIIll[HerbiboarInfoBox.lllIIllIIlII[8]] = "Herbiboar Kills Per Hour";
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HerbiboarInfoBox.lIIIlIlIIllllII(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllIIIll[lllIIllIIlII[0]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[1]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[2]]).right(lllIIllIIIll[lllIIllIIlII[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[4]]).right(this.ab.i().toString()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[5]]).right(String.valueOf(this.Z.f())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[6]]).right(this.aa.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[7]]).right("" + SquireHerbiboarPlugin.e()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllIIIll[lllIIllIIlII[8]]).right("" + this.c(SquireHerbiboarPlugin.e())).build());

        int n2 = lllIIllIIlII[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIllIIlII[10], lllIIllIIlII[0]));
        return super.render(graphics2D);
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (HerbiboarInfoBox.lIIIlIlIIllllIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

}

