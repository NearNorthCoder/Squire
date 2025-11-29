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
 */
package gg.squire.saradomin.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.saradomin.SquireSaradomin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import gg.squire.saradomin.overlay.SaradominManager;
import gg.squire.saradomin.overlay.SaradominManager;

public class SaraInfoBox
extends OverlayPanel {
    
    private final  g F;
    
    private final  f G;
    private final  SquireSaradomin E;
    private final  TaskManager H;

    public Dimension render(Graphics2D graphics2D) {
        if (SaraInfoBox.lIlIlIlllllIIII(this.E.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlIlIlIIIll[0], lIIlIlIlIIIll[0], lIIlIlIlIIIll[0], lIIlIlIlIIIll[0]));
        String string = lIIlIlIlIIIIl[lIIlIlIlIIIll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[2]]).right(String.valueOf(this.F.l())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[3]]).right(String.valueOf(this.F.m())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[4]]).right(String.valueOf(this.F.u())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[5]]).right(this.H.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIIIIl[lIIlIlIlIIIll[6]]).right(String.valueOf(this.E.a())).build());

        return super.render(graphics2D);
    }

        return String.valueOf(var1);
    }

    private static void lIlIlIllllIlllI() {
        lIIlIlIlIIIIl = new String[lIIlIlIlIIIll[7]];
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[1]] = "Squire Saradomin";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[2]] = "Zily alive";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[3]] = "Inside room";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[4]] = "Sara Kills";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[5]] = "Current Task";
        SaraInfoBox.lIIlIlIlIIIIl[SaraInfoBox.lIIlIlIlIIIll[6]] = "Banking";
    }

    @Inject
    public SaraInfoBox(SquireSaradomin squireSaradomin, g g2, f f2) {
        this.E = squireSaradomin;
        this.F = g2;
        this.G = f2;
        this.H = squireSaradomin.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlIlIlllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlllllIIII(int n2) {
        return n2 != 0;
    }

    static {
        SaraInfoBox.lIlIlIllllIllll();
        SaraInfoBox.lIlIlIllllIlllI();
    }

}

