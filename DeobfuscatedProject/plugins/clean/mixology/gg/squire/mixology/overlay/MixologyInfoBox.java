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
 *  net.unethicalite.client.Static
 */
package gg.squire.mixology.overlay;

import com.google.inject.Inject;
import gg.squire.mixology.SquireMixology;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class MixologyInfoBox
extends OverlayPanel {
    private final  SquireMixology B;
    private final  int C = 403886;
    public static  int D;
    public static  int E;

    public static  int F;

    private static boolean lIIlIlIllIIIIII(int n2) {
        return n2 >= 0;
    }

        return String.valueOf(var1);
    }

    public double b(int n2) {
        Duration duration = Duration.between(this.B.getStarted(), Instant.now());
        if (MixologyInfoBox.lIIlIlIllIIIIIl(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static void lIIlIlIlIllllIl() {
        lllllllIllll = new String[llllllllIIII[18]];
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[1]] = "%.0fK";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[2]] = "%.0fK";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[3]] = "%.1fK";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[4]] = "%.0f";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[5]] = "%.1f";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[7]] = "[B]uire Mixology";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[8]] = "Runtime";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[9]] = "Version";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[10]] = "Task: ";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[11]] = "Current potion: ";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[6]] = "Gained mox/aga/lye: ";
        MixologyInfoBox.lllllllIllll[MixologyInfoBox.llllllllIIII[17]] = "#.0";
    }

    private static boolean lIIlIlIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static double b(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(lllllllIllll[llllllllIIII[17]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    private static int lIIlIlIlIllllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIlIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private String c(int n2) {
        double d2 = this.b(n2);
        return MixologyInfoBox.a(d2);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return MixologyInfoBox.b(d3);
    }

    public static String a(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    static {
        MixologyInfoBox.lIIlIlIlIlllllI();
        MixologyInfoBox.lIIlIlIlIllllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (MixologyInfoBox.lIIlIlIllIIIIlI(this.B.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long l2 = System.currentTimeMillis() - SquireMixology.l;
        Duration duration = Duration.between(this.B.getStarted(), Instant.now());
        int n2 = (int)((double)SquireMixology.i * 3600000.0 / (double)l2);
        this.panelComponent.setBorder(new Rectangle(llllllllIIII[6], llllllllIIII[6], llllllllIIII[6], llllllllIIII[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllllIllll[llllllllIIII[7]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[8]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[9]]).right(SquireMixology.f).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[10]]).right(SquireMixology.g).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[11]]).right(SquireMixology.p).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllllIllll[llllllllIIII[6]]).right(Static.getClient().getVarpValue(llllllllIIII[12]) - F + "/" + (Static.getClient().getVarpValue(llllllllIIII[13]) - E) + "/" + (Static.getClient().getVarpValue(llllllllIIII[14]) - D)).build());

        int n3 = llllllllIIII[15];
        this.panelComponent.setPreferredSize(new Dimension(n3 + llllllllIIII[16], llllllllIIII[1]));
        return super.render(graphics2D);
    }

    public static String a(double d2) {
        double var2;
        if (MixologyInfoBox.lIIlIlIllIIIIII(MixologyInfoBox.lIIlIlIlIllllll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllllllIIII[2]];
            objectArray[MixologyInfoBox.llllllllIIII[1]] = d3;
            return String.format(lllllllIllll[llllllllIIII[1]], objectArray);
        }
        if (MixologyInfoBox.lIIlIlIllIIIIII(MixologyInfoBox.lIIlIlIlIllllll(var2, 1000.0))) {
            double var3 = var2 / 1000.0;
            if (MixologyInfoBox.lIIlIlIllIIIIIl(MixologyInfoBox.lIIlIlIlIllllll(var3 % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllllllIIII[2]];
                objectArray[MixologyInfoBox.llllllllIIII[1]] = var3;
                return String.format(lllllllIllll[llllllllIIII[2]], objectArray);
            }
            Object[] objectArray = new Object[llllllllIIII[2]];
            objectArray[MixologyInfoBox.llllllllIIII[1]] = var3;
            return String.format(lllllllIllll[llllllllIIII[3]], objectArray);
        }
        if (MixologyInfoBox.lIIlIlIllIIIIIl(MixologyInfoBox.lIIlIlIlIllllll(var2 % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllllllIIII[2]];
            objectArray[MixologyInfoBox.llllllllIIII[1]] = var2;
            return String.format(lllllllIllll[llllllllIIII[4]], objectArray);
        }
        Object[] objectArray = new Object[llllllllIIII[2]];
        objectArray[MixologyInfoBox.llllllllIIII[1]] = d2;
        return String.format(lllllllIllll[llllllllIIII[5]], objectArray);
    }

    @Inject
    private MixologyInfoBox(SquireMixology squireMixology) {
        this.C = llllllllIIII[0];
        this.B = squireMixology;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

