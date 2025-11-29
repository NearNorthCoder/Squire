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
package gg.squire.barrows.overlay;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
import gg.squire.barrows.overlay.BarrowsManager;

public class BarrowsInfoBox
extends OverlayPanel {
    private final  int B = 77566;
    private final  SquireBarrows y;
    private final  TaskManager z;
    private final  c A;

    private static int lIllIIllIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    static {
        BarrowsInfoBox.lIllIIllIllllI();
        BarrowsInfoBox.lIllIIlIlllIII();
    }

    private static void lIllIIlIlllIII() {
        lllIllllllI = new String[llllIIIlIIl[22]];
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[1]] = "%.0fK";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[2]] = "%.0fK";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[3]] = "%.1fK";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[4]] = "%.0f";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[5]] = "%.1f";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[7]] = "Squire Barrows";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[8]] = "Runtime";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[9]] = "Version";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[10]] = "1.3.1";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[11]] = "Task: ";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[6]] = "Missing Potential:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[12]] = "Chests:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[13]] = "%d (%d/h)";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[14]] = "Est. GP/H:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[15]] = "Uniques:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[16]] = "%d (%d/h)";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[17]] = "Claimed chest:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[18]] = "Should bank:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[19]] = "Should claim chest:";
    }

    @Inject
    private BarrowsInfoBox(SquireBarrows squireBarrows, c c2) {
        this.B = llllIIIlIIl[0];
        this.y = squireBarrows;
        this.z = squireBarrows.getManager();
        this.A = c2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private String f(int n2) {
        double d2 = this.e(n2);
        return BarrowsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double var1;
        if (BarrowsInfoBox.lIllIIlllIIIII(BarrowsInfoBox.lIllIIllIlllll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = d3;
            return String.format(lllIllllllI[llllIIIlIIl[1]], objectArray);
        }
        if (BarrowsInfoBox.lIllIIlllIIIII(BarrowsInfoBox.lIllIIllIlllll(var1, 1000.0))) {
            double var2 = var1 / 1000.0;
            if (BarrowsInfoBox.lIllIIlllIIIIl(BarrowsInfoBox.lIllIIllIlllll(var2 % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllIIIlIIl[2]];
                objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = var2;
                return String.format(lllIllllllI[llllIIIlIIl[2]], objectArray);
            }
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = var2;
            return String.format(lllIllllllI[llllIIIlIIl[3]], objectArray);
        }
        if (BarrowsInfoBox.lIllIIlllIIIIl(BarrowsInfoBox.lIllIIllIlllll(var1 % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = var1;
            return String.format(lllIllllllI[llllIIIlIIl[4]], objectArray);
        }
        Object[] objectArray = new Object[llllIIIlIIl[2]];
        objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = d2;
        return String.format(lllIllllllI[llllIIIlIIl[5]], objectArray);
    }

    private static boolean lIllIIlllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.lIllIIlllIIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public double e(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.lIllIIlllIIIIl(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

        return String.valueOf(var3);
    }

    private static boolean lIllIIlllIIIlI(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BarrowsInfoBox.lIllIIlllIIIlI(this.y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllllllI[llllIIIlIIl[7]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[8]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[9]]).right(lllIllllllI[llllIIIlIIl[10]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[11]]).right(this.z.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[6]]).right(String.valueOf(this.A.d())).build());

        Object[] objectArray = new Object[llllIIIlIIl[3]];
        objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = this.y.w();
        objectArray[BarrowsInfoBox.llllIIIlIIl[2]] = this.d(this.y.w());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[12]]).right(String.format(lllIllllllI[llllIIIlIIl[13]], objectArray)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[14]]).right(this.f(this.y.w() * llllIIIlIIl[0])).build());

        Object[] objectArray2 = new Object[llllIIIlIIl[3]];
        objectArray2[BarrowsInfoBox.llllIIIlIIl[1]] = this.y.x();
        objectArray2[BarrowsInfoBox.llllIIIlIIl[2]] = this.d(this.y.x());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[15]]).right(String.format(lllIllllllI[llllIIIlIIl[16]], objectArray2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[17]]).right(String.valueOf(this.y.v())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[18]]).right(String.valueOf(this.y.u())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[19]]).right(String.valueOf(this.y.g())).build());

        int n2 = llllIIIlIIl[20];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIIIlIIl[21], llllIIIlIIl[1]));
        return super.render(graphics2D);
    }
}

