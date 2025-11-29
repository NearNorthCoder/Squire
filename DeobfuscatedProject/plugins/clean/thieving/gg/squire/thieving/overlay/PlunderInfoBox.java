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
package gg.squire.thieving.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquirePlunder;
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
import gg.squire.thieving.overlay.ThievingManager;

public class PlunderInfoBox
extends OverlayPanel {
    private final  SquirePlunder o;
    private final  a q;
    
    private final  TaskManager p;

    private static boolean lIIlIlIIIIllIll(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlunderInfoBox.lIIlIlIIIIllIll(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIllII[0], llllllIIllII[0], llllllIIllII[0], llllllIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(llllllIIlIll[llllllIIllII[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[2]]).right(llllllIIlIll[llllllIIllII[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[5]]).right(String.valueOf(this.q.e())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[6]]).right(this.p.getCurrentTask()).build());

        int n2 = llllllIIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllllIIllII[8], llllllIIllII[1]));
        return super.render(graphics2D);
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIlIll = new String[llllllIIllII[9]];
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[1]] = "Squire Pyramid Plunder";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[2]] = "Version";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[3]] = "1.0.0";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[4]] = "Runtime";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[5]] = "Sceptres found: ";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[6]] = "Task: ";
    }

    @Inject
    private PlunderInfoBox(SquirePlunder squirePlunder, a a2) {
        this.o = squirePlunder;
        this.p = squirePlunder.getManager();
        this.q = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        PlunderInfoBox.lIIlIlIIIIllIlI();
        PlunderInfoBox.lIIlIlIIIIllIIl();
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

