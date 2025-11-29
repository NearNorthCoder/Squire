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
package gg.squire.farmer.overlay;

import gg.squire.farmer.overlay.FarmerManager;
import gg.squire.farmer.overlay.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
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

public class StateOverlayPanel
extends OverlayPanel {
    private final  SquireFarmer bP;

    private final  SquireFarmerConfig bO;
    private final  b bN;
    private final  f bM;
    private final  TaskManager bQ;

    static {
        StateOverlayPanel.lllIllllIIlIIl();
        StateOverlayPanel.lllIlllIllllII();
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.setBorder(new Rectangle(lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0]));
        String string = lIllllIllllI[lIlllllIIIII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[2]]).right(lIllllIllllI[lIlllllIIIII[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[4]]).right(String.valueOf(this.bQ.getCurrentTask())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[5]]).right(String.valueOf((Object)this.bP.a())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[6]]).right(String.valueOf(this.bM.x())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[7]]).right(String.valueOf(this.bM.v())).build());

        return super.render(graphics2D);
    }

    @Inject
    public StateOverlayPanel(f f2, b b2, SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer) {
        this.bM = f2;
        this.bN = b2;
        this.bO = squireFarmerConfig;
        this.bP = squireFarmer;
        this.bQ = squireFarmer.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lllIlllIllllII() {
        lIllllIllllI = new String[lIlllllIIIII[8]];
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[1]] = "Squire Farmer";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[2]] = "Version:";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[3]] = "1.4.8";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[4]] = "Currently";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[5]] = "Run type";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[6]] = "Region";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[7]] = "Patch";
    }

    private static boolean lllIllllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

}

