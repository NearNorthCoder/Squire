/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.zammy.SquireZammy;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.overlay.PlacingCannonBaseTask;
import gg.squire.zammy.overlay.KHelper;
import gg.squire.zammy.overlay.LHelper;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;

public class ZammyInfoBox
extends OverlayPanel {
    private final  B G;
    private final  k E;
    private final  TaskManager F;
    private final  SquireZammy C;
    
    private final  l D;

    static {
        ZammyInfoBox.llIIIllIIlIIlll();
        ZammyInfoBox.llIIIllIIlIIllI();
    }

    private static boolean llIIIllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIllIIlIIllI() {
        lIllIIlIllIII = new String[lIllIIlIllIll[7]];
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[1]] = "Squire Zamorak";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[2]] = "Kril alive";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[3]] = "Inside room";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[4]] = "Zammy Kills";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[5]] = "Cannon base expires in:";
        ZammyInfoBox.lIllIIlIllIII[ZammyInfoBox.lIllIIlIllIll[6]] = "Current Task";
    }

        return String.valueOf(var1);
    }

    @Inject
    public ZammyInfoBox(SquireZammy squireZammy, l l2, k k2, B b2) {
        this.C = squireZammy;
        this.D = l2;
        this.E = k2;
        this.F = squireZammy.getManager();
        this.G = b2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ZammyInfoBox.llIIIllIIlIlIII(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIIlIllIll[0], lIllIIlIllIll[0], lIllIIlIllIll[0], lIllIIlIllIll[0]));
        String string = lIllIIlIllIII[lIllIIlIllIll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[2]]).right(String.valueOf(this.D.A())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[3]]).right(String.valueOf(this.D.B())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[4]]).right(String.valueOf(this.D.J())).build());

        int n2 = Math.max(lIllIIlIllIll[1], this.G.Q() - Static.getClient().getTickCount());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[5]]).right(String.valueOf(n2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[6]]).right(this.F.getCurrentTask()).build());

        return super.render(graphics2D);
    }

    private static boolean llIIIllIIlIlIII(int n2) {
        return n2 != 0;
    }

}

