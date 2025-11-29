/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.moons.overlay;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
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

public class MoonsInfoBox
extends OverlayPanel {
    private final  SquireMoonsOfPeril k;

    private final  int l = 403886;

    private static boolean lIIlIllllIIlllI(int n) {
        return n != 0;
    }

    public double a(int n) {
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        if (MoonsInfoBox.lIIlIllllIIllIl(duration.isZero() ? 1 : 0)) {
            return (double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static double b(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(lIIIIIIlIIlll[lIIIIIIlIlIII[6]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    public Dimension render(Graphics2D graphics2D) {
        if (MoonsInfoBox.lIIlIllllIIlllI(this.k.isPaintDisabled() ? 1 : 0)) {
            // empty if block
        }
        long l2 = System.currentTimeMillis() - SquireMoonsOfPeril.i;
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIIIIIlIlIII[6], lIIIIIIlIlIII[6], lIIIIIIlIlIII[6], lIIIIIIlIlIII[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIIIIlIIlll[lIIIIIIlIlIII[7]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[8]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[9]]).right(SquireMoonsOfPeril.f).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[10]]).right(SquireMoonsOfPeril.g).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIIIIlIIlll[lIIIIIIlIlIII[11]]).right(SquireMoonsOfPeril.h + " (" + MoonsInfoBox.a(SquireMoonsOfPeril.h, l2) + "/hr)").build());

        int n = lIIIIIIlIlIII[12];
        this.panelComponent.setPreferredSize(new Dimension(n + lIIIIIIlIlIII[13], lIIIIIIlIlIII[1]));
        return super.render(graphics2D);
    }

        return String.valueOf(var1);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return MoonsInfoBox.b(d3);
    }

    static {
        MoonsInfoBox.lIIlIllllIIlIlI();
        MoonsInfoBox.lIIlIllllIIlIIl();
    }

    private static int lIIlIllllIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIllllIIllll(int n, int n2) {
        return n < n2;
    }

    private String b(int n) {
        double d2 = this.a(n);
        return MoonsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double var2;
        if (MoonsInfoBox.lIIlIllllIIllII(MoonsInfoBox.lIIlIllllIIlIll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = d3;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[1]], objectArray);
        }
        if (MoonsInfoBox.lIIlIllllIIllII(MoonsInfoBox.lIIlIllllIIlIll(var2, 1000.0))) {
            double var3 = var2 / 1000.0;
            if (MoonsInfoBox.lIIlIllllIIllIl(MoonsInfoBox.lIIlIllllIIlIll(var3 % 1.0, 0.0))) {
                Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
                objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = var3;
                return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[2]], objectArray);
            }
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = var3;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[3]], objectArray);
        }
        if (MoonsInfoBox.lIIlIllllIIllIl(MoonsInfoBox.lIIlIllllIIlIll(var2 % 1.0, 0.0))) {
            Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
            objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = var2;
            return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[4]], objectArray);
        }
        Object[] objectArray = new Object[lIIIIIIlIlIII[2]];
        objectArray[MoonsInfoBox.lIIIIIIlIlIII[1]] = d2;
        return String.format(lIIIIIIlIIlll[lIIIIIIlIlIII[5]], objectArray);
    }

    private static boolean lIIlIllllIIllIl(int n) {
        return n == 0;
    }

    private static void lIIlIllllIIlIIl() {
        lIIIIIIlIIlll = new String[lIIIIIIlIlIII[14]];
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[1]] = "%.0fK";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[2]] = "%.0fK";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[3]] = "%.1fK";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[4]] = "%.0f";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[5]] = "%.1f";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[7]] = "Squire Moons of Peril";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[8]] = "Runtime";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[9]] = "Version";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[10]] = "Task: ";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[11]] = "Chests: ";
        MoonsInfoBox.lIIIIIIlIIlll[MoonsInfoBox.lIIIIIIlIlIII[6]] = "#.0";
    }

    @Inject
    private MoonsInfoBox(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.l = lIIIIIIlIlIII[0];
        this.k = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIlIllllIIllII(int n) {
        return n >= 0;
    }
}

