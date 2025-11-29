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
package gg.squire.nightmare.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
import gg.squire.nightmare.overlay.NightmareManager;

public class NightmareInfoBox
extends OverlayPanel {

    private final  SquireNightmarePlugin cw;
    private final  int cy = 403886;
    private final  TaskManager cx;

    private String o(int n2) {
        double d2 = this.n(n2);
        return NightmareInfoBox.a(d2);
    }

    private static boolean lIIlIIIlllllIll(int n2) {
        return n2 >= 0;
    }

    @Inject
    private NightmareInfoBox(SquireNightmarePlugin squireNightmarePlugin, j j2) {
        this.cy = llllIlllIllI[0];
        this.cw = squireNightmarePlugin;
        this.cx = squireNightmarePlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        NightmareInfoBox.lIIlIIIlllllIIl();
        NightmareInfoBox.lIIlIIIlllllIII();
    }

    public static String a(double d2) {
        double var1;
        if (NightmareInfoBox.lIIlIIIlllllIll(NightmareInfoBox.lIIlIIIlllllIlI(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllIlllIllI[2]];
            objectArray[NightmareInfoBox.llllIlllIllI[1]] = d3;
            return String.format(llllIlllIIll[llllIlllIllI[1]], objectArray);
        }
        if (NightmareInfoBox.lIIlIIIlllllIll(NightmareInfoBox.lIIlIIIlllllIlI(var1, 1000.0))) {
            double var2 = var1 / 1000.0;
            if (NightmareInfoBox.lIIlIIIllllllII(NightmareInfoBox.lIIlIIIlllllIlI(var2 % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllIlllIllI[2]];
                objectArray[NightmareInfoBox.llllIlllIllI[1]] = var2;
                return String.format(llllIlllIIll[llllIlllIllI[2]], objectArray);
            }
            Object[] objectArray = new Object[llllIlllIllI[2]];
            objectArray[NightmareInfoBox.llllIlllIllI[1]] = var2;
            return String.format(llllIlllIIll[llllIlllIllI[3]], objectArray);
        }
        if (NightmareInfoBox.lIIlIIIllllllII(NightmareInfoBox.lIIlIIIlllllIlI(var1 % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllIlllIllI[2]];
            objectArray[NightmareInfoBox.llllIlllIllI[1]] = var1;
            return String.format(llllIlllIIll[llllIlllIllI[4]], objectArray);
        }
        Object[] objectArray = new Object[llllIlllIllI[2]];
        objectArray[NightmareInfoBox.llllIlllIllI[1]] = d2;
        return String.format(llllIlllIIll[llllIlllIllI[5]], objectArray);
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        NightmareInfoBox var3;
        if (NightmareInfoBox.lIIlIIIllllllIl(this.cw.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var4 = Duration.between(var3.cw.getStarted(), Instant.now());
        var3.panelComponent.setBorder(new Rectangle(llllIlllIllI[6], llllIlllIllI[6], llllIlllIllI[6], llllIlllIllI[6]));
        var3.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlllIIll[llllIlllIllI[7]]).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[8]]).right(Time.format((Duration)var4)).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[9]]).right(llllIlllIIll[llllIlllIllI[10]]).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[11]]).right(var3.cx.getCurrentTask()).build());

        List list = var3.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llllIlllIIll[llllIlllIllI[6]]);
        if (NightmareInfoBox.lIIlIIIllllllIl(var3.cw.ae() ? 1 : 0)) {
            string = llllIlllIIll[llllIlllIllI[12]];

            if (-1 > ((0xD4 ^ 0x98 ^ (0x10 ^ 0x1C)) & (40 + 92 - -63 + 2 ^ 125 + 18 - 26 + 16 ^ -1))) {
                return null;
            }
        } else {
            string = llllIlllIIll[llllIlllIllI[13]];
        }
        list.add(lineComponentBuilder.right(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[14]]).right(String.valueOf(this.cw.af())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[15]]).right(this.o(this.cw.af())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[16]]).right(this.o(this.cw.af() * llllIlllIllI[0])).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[17]]).right(String.valueOf(this.cw.J())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[18]]).right(String.valueOf(this.cw.K())).build());

        int n2 = llllIlllIllI[19];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIlllIllI[20], llllIlllIllI[1]));
        return super.render(graphics2D);
    }

    private static boolean lIIlIIIllllllIl(int n2) {
        return n2 != 0;
    }

    private static int lIIlIIIlllllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIIIllllllII(int n2) {
        return n2 == 0;
    }

    public double n(int n2) {
        Duration duration = Duration.between(this.cw.getStarted(), Instant.now());
        if (NightmareInfoBox.lIIlIIIllllllII(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean lIIlIIIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var5);
    }

    private static void lIIlIIIlllllIII() {
        llllIlllIIll = new String[llllIlllIllI[21]];
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[1]] = "%.0fK";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[2]] = "%.0fK";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[3]] = "%.1fK";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[4]] = "%.0f";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[5]] = "%.1f";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[7]] = "Squire Phosani's Nightmare";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[8]] = "Runtime";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[9]] = "Version";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[10]] = "3.4.2";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[11]] = "Task: ";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[6]] = "Status: ";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[12]] = "Restocking";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[13]] = "Idle";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[14]] = "Kills";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[15]] = "Kills Per Hour";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[16]] = "Est. GP/H";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[17]] = "Shrooms hit";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[18]] = "Deaths";
    }
}

