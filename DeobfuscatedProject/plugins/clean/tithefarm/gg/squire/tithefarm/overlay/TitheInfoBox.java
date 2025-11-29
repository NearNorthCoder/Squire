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
package gg.squire.tithefarm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tithefarm.SquireTitheFarm;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
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
import gg.squire.tithefarm.overlay.IHelper;

public class TitheInfoBox
extends OverlayPanel {
    private final  i x;
    private final  TaskManager w;

    private final  SquireTitheFarm v;

    public long e(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (TitheInfoBox.lIllIllIIIlIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        return String.valueOf(var1);
    }

    private static void lIllIllIIIIIlII() {
        lIIlllllIllll = new String[lIIllllllIIlI[14]];
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[0]] = "Squire Tithe Farm";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[1]] = "Runtime";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[2]] = "Version";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[3]] = "0.0.1";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[4]] = "Task: ";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[5]] = "Harvested";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[6]] = "Harvested Per Hour";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[7]] = "Current patch";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[8]] = "Watering can charges";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[9]] = "Have enough water?";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[10]] = "NO (please get more water)";
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[11]] = "Yes";
    }

    private static boolean lIllIllIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        TitheInfoBox.lIllIllIIIIlllI();
        TitheInfoBox.lIllIllIIIIIlII();
    }

    @Inject
    private TitheInfoBox(SquireTitheFarm squireTitheFarm, i i2) {
        this.v = squireTitheFarm;
        this.w = squireTitheFarm.getManager();
        this.x = i2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIllIIIIllll(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        TitheInfoBox var2;
        if (TitheInfoBox.lIllIllIIIIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var3 = Duration.between(var2.v.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIlI[0]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[1]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[2]]).right(lIIlllllIllll[lIIllllllIIlI[3]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[4]]).right(var2.w.getCurrentTask()).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[5]]).right(String.valueOf(var2.v.a())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[6]]).right(String.valueOf(var2.e(var2.v.a()))).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[7]]).right(String.valueOf(var2.x.q())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[8]]).right(String.valueOf(var2.x.v())).build());

        List list = var2.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[9]]);
        if (TitheInfoBox.lIllIllIIIlIIII(var2.x.v(), lIIllllllIIlI[4] * var2.x.u())) {
            string = lIIlllllIllll[lIIllllllIIlI[10]];

            if (((0xE2 ^ 0xC6) & ~(0x65 ^ 0x41)) != ((0x78 ^ 0x49) & ~(0xA1 ^ 0x90))) {
                return null;
            }
        } else {
            string = lIIlllllIllll[lIIllllllIIlI[11]];
        }
        list.add(lineComponentBuilder.right(string).build());

        int n2 = lIIllllllIIlI[12];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllllllIIlI[13], lIIllllllIIlI[0]));
        return super.render(graphics2D);
    }

    private static boolean lIllIllIIIlIIIl(int n2) {
        return n2 == 0;
    }
}

