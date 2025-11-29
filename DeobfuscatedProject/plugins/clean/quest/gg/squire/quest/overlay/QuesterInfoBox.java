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
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireTutorialIsland;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
import net.unethicalite.api.game.Vars;

public class QuesterInfoBox
extends OverlayPanel {
    
    private final  TaskManager ag;

    private static void lIllIlllllIllII() {
        lIlIIIlIIllII = new String[lIlIIIlIIllll[7]];
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[0]] = "Squire Quester";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[1]] = "Version";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[2]] = "0.1.3";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[3]] = "Task: ";
        QuesterInfoBox.lIlIIIlIIllII[QuesterInfoBox.lIlIIIlIIllll[4]] = "Current Step: ";
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIIlIIllII[lIlIIIlIIllll[0]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[1]]).right(lIlIIIlIIllII[lIlIIIlIIllll[2]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[3]]).right(this.ag.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIlIIllII[lIlIIIlIIllll[4]]).right(String.valueOf(Vars.getVarp((int)lIlIIIlIIllll[5]))).build());

        int n2 = lIlIIIlIIllll[6];
        this.panelComponent.setPreferredSize(new Dimension(n2, lIlIIIlIIllll[0]));
        return super.render(graphics2D);
    }

    static {
        QuesterInfoBox.lIllIlllllIllIl();
        QuesterInfoBox.lIllIlllllIllII();
    }

    private static boolean lIllIlllllIlllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Inject
    public QuesterInfoBox(SquireTutorialIsland squireTutorialIsland) {
        this.ag = squireTutorialIsland.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }
}

