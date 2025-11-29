/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.client.Static
 */
package gg.squire.driftnet.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.driftnet.SquireDriftNet;
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
import net.unethicalite.client.Static;
import gg.squire.driftnet.overlay.AHelper;

@Singleton
public class DriftNetInfoBox
extends OverlayPanel {
    private final  TaskManager o;
    private final  SquireDriftNet m;
    
    private final  a n;

        return String.valueOf(var1);
    }

    @Inject
    public DriftNetInfoBox(SquireDriftNet squireDriftNet, a a2) {
        this.m = squireDriftNet;
        this.n = a2;
        this.o = squireDriftNet.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (DriftNetInfoBox.llIlIlIIIIllll(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIIIIllIlI[0], lIlIIIIllIlI[0], lIlIIIIllIlI[0], lIlIIIIllIlI[0]));
        String string = lIlIIIIlIlll[lIlIIIIllIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n = lIlIIIIllIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlIIIIllIlI[3], lIlIIIIllIlI[1]));
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[5]]).right(this.o.getCurrentTask()).build());

        int n2 = (int)this.a(this.n.i());
        Object[] objectArray = new Object[lIlIIIIllIlI[5]];
        objectArray[DriftNetInfoBox.lIlIIIIllIlI[1]] = this.n.i();
        objectArray[DriftNetInfoBox.lIlIIIIllIlI[4]] = n2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[6]]).right(String.format(lIlIIIIlIlll[lIlIIIIllIlI[7]], objectArray)).build());

        int n3 = Static.getClient().getVarbitValue(lIlIIIIllIlI[8]);
        int n4 = Static.getClient().getVarbitValue(lIlIIIIllIlI[9]);
        int n5 = Static.getClient().getVarbitValue(lIlIIIIllIlI[10]);
        int n6 = Static.getClient().getVarbitValue(lIlIIIIllIlI[11]);
        Object[] objectArray2 = new Object[lIlIIIIllIlI[5]];
        objectArray2[DriftNetInfoBox.lIlIIIIllIlI[1]] = n3;
        objectArray2[DriftNetInfoBox.lIlIIIIllIlI[4]] = n5;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[12]]).right(String.format(lIlIIIIlIlll[lIlIIIIllIlI[13]], objectArray2)).build());

        Object[] objectArray3 = new Object[lIlIIIIllIlI[5]];
        objectArray3[DriftNetInfoBox.lIlIIIIllIlI[1]] = n4;
        objectArray3[DriftNetInfoBox.lIlIIIIllIlI[4]] = n6;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[14]]).right(String.format(lIlIIIIlIlll[lIlIIIIllIlI[15]], objectArray3)).build());

        return super.render(graphics2D);
    }

    private static boolean llIlIlIIIIllll(int n) {
        return n != 0;
    }

    static {
        DriftNetInfoBox.llIlIlIIIIlllI();
        DriftNetInfoBox.llIlIlIIIIlIll();
    }

    private static void llIlIlIIIIlIll() {
        lIlIIIIlIlll = new String[lIlIIIIllIlI[16]];
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[1]] = "Squire Drift Net Fisher";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[4]] = "Runtime:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[5]] = "Task: ";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[6]] = "Fish caught:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[7]] = "%d (%d/h)";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[12]] = "North:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[13]] = "%d (%d)";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[14]] = "South:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[15]] = "%d (%d)";
    }

    private static boolean llIlIlIIIlIIII(int n) {
        return n == 0;
    }

    private static boolean llIlIlIIIlIIIl(int n, int n2) {
        return n < n2;
    }

    public long a(int n) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (DriftNetInfoBox.llIlIlIIIlIIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

}

