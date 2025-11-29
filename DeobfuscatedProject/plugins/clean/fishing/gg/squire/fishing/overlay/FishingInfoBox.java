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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.fishing.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class FishingInfoBox
extends OverlayPanel {
    
    private final  TaskManager D;
    private final  SquireFisherConfig E;
    private final  SquireFisherPlugin C;

    @Inject
    private FishingInfoBox(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.C = squireFisherPlugin;
        this.D = squireFisherPlugin.getManager();
        this.E = squireFisherConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n) {
        Duration duration = Duration.between(this.C.getStarted(), Instant.now());
        if (FishingInfoBox.lllIllIIIIIlll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lllIllIIIIIlll(int n) {
        return n == 0;
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        FishingInfoBox var2;
        if (FishingInfoBox.lllIllIIIIIllI(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var3 = Duration.between(var2.C.getStarted(), Instant.now()).minus(SquireFisherPlugin.c(), ChronoUnit.MILLIS);
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlllIlllIII[lIlllIlllIIl[0]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[1]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[2]]).right(lIlllIlllIII[lIlllIlllIIl[3]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[4]]).right(var2.D.getCurrentTask()).build());

        if (FishingInfoBox.lllIllIIIIIlll(var2.E.fishingTrawler() ? 1 : 0)) {
            String string;
            List list = var2.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[5]]);
            if (FishingInfoBox.lllIllIIIIIllI(var2.E.tickFishing() ? 1 : 0)) {
                string = lIlllIlllIII[lIlllIlllIIl[6]];

                if (3 == 0) {
                    return null;
                }
            } else {
                string = lIlllIlllIII[lIlllIlllIIl[7]];
            }
            list.add(lineComponentBuilder.right(string).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[8]]).right("" + SquireFisherPlugin.d).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[9]]).right("" + var2.b(SquireFisherPlugin.d)).build());

            if ((0x83 ^ 0xAB ^ (0x7B ^ 0x57)) != (0x2F ^ 0x65 ^ (0x76 ^ 0x38))) {
                return null;
            }
        } else {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[10]]).right("" + SquireFisherPlugin.c).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[11]]).right("" + var2.b(SquireFisherPlugin.c)).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlllIlllIII[lIlllIlllIIl[12]]).right("" + SquireFisherPlugin.b).build());

        }
        int n = lIlllIlllIIl[13];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlllIlllIIl[14], lIlllIlllIIl[0]));
        return super.render(graphics2D);
    }

    static {
        FishingInfoBox.lllIllIIIIIlIl();
        FishingInfoBox.lllIllIIIIIlII();
    }

    private static boolean lllIllIIIIlIII(int n, int n2) {
        return n < n2;
    }

    private static void lllIllIIIIIlII() {
        lIlllIlllIII = new String[lIlllIlllIIl[15]];
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[0]] = "Squire Fisher";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[1]] = "Runtime";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[2]] = "Version";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[3]] = "1.2.1";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[4]] = "Task: ";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[5]] = "3 ticking:";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[6]] = "Yes";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[7]] = "No";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[8]] = "Fish Caught";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[9]] = "Fish Per Hour";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[10]] = "Trawler Games";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[11]] = "Trawler Games Per Hour";
        FishingInfoBox.lIlllIlllIII[FishingInfoBox.lIlllIlllIIl[12]] = "Gear Collected";
    }

    private static boolean lllIllIIIIIllI(int n) {
        return n != 0;
    }
}

