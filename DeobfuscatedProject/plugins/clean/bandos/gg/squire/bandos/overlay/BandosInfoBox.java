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
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.client.Static
 */
package gg.squire.bandos.overlay;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.client.plugins.fw.TaskManager;
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
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
import gg.squire.bandos.overlay.EHelper;
import gg.squire.bandos.overlay.KHelper;
import gg.squire.bandos.overlay.PlacingCannonBaseTask;

public class BandosInfoBox
extends OverlayPanel {
    private final  TaskManager G;
    private final  k F;
    private final  e E;
    private final  SquireBandos D;
    private final  w H;

    private static void lIlIllIIlIllII() {
        lllIIIIIIIl = new String[lllIIIIIIlI[8]];
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[1]] = "Squire Bandos";
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[2]] = "Bandos alive";
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[3]] = "Inside room";
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[4]] = "Bandos Kills";
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[5]] = "Cannon base expires in:";
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[6]] = "Can cast b2p";
        BandosInfoBox.lllIIIIIIIl[BandosInfoBox.lllIIIIIIlI[7]] = "Current Task";
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BandosInfoBox.lIlIllIIlIllll(this.D.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIIIIIlI[0], lllIIIIIIlI[0], lllIIIIIIlI[0], lllIIIIIIlI[0]));
        String string = lllIIIIIIIl[lllIIIIIIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[2]]).right(String.valueOf(this.E.s())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[3]]).right(String.valueOf(this.E.t())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[4]]).right(String.valueOf(this.E.A())).build());

        int n2 = Math.max(lllIIIIIIlI[1], this.H.Q() - Static.getClient().getTickCount());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[5]]).right(String.valueOf(n2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[6]]).right(String.valueOf(SpellBook.Standard.BONES_TO_PEACHES.canCast())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[7]]).right(this.G.getCurrentTask()).build());

        return super.render(graphics2D);
    }

    private static boolean lIlIllIIlIllll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    @Inject
    public BandosInfoBox(SquireBandos squireBandos, e e2, k k2, w w2) {
        this.D = squireBandos;
        this.E = e2;
        this.F = k2;
        this.G = squireBandos.getManager();
        this.H = w2;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlIllIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        BandosInfoBox.lIlIllIIlIlllI();
        BandosInfoBox.lIlIllIIlIllII();
    }

}

