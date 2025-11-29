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
 */
package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderShamans;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.EHelper;
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

public class BuilderInfoBox
extends OverlayPanel {
    
    private final  AccBuilderShamans bX;
    private final  BuilderConfig bY;

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderShamans.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIllIIlIll[0], lIllIIlIll[0], lIllIIlIll[0], lIllIIlIll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIlIII[lIllIIlIll[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[4]]).right(AccBuilderShamans.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[5]]).right(String.valueOf(AccBuilderShamans.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIII[lIllIIlIll[6]]).right(String.valueOf(AccBuilderShamans.f)).build());

        int n2 = lIllIIlIll[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIllIIlIll[8], lIllIIlIll[1]));
        return super.render(graphics2D);
    }

    private static boolean lIIlIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIlllIlllI() {
        lIllIIlIII = new String[lIllIIlIll[9]];
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[1]] = "Squire Shamans Builder";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[2]] = "Version";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[3]] = "Runtime";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[4]] = "Status:";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[5]] = "Current Quest:";
        BuilderInfoBox.lIllIIlIII[BuilderInfoBox.lIllIIlIll[6]] = "Tasks Completed:";
    }

    @Inject
    private BuilderInfoBox(AccBuilderShamans accBuilderShamans, BuilderConfig builderConfig) {
        this.bX = accBuilderShamans;
        this.bY = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.lIIlIlllIllll();
        BuilderInfoBox.lIIlIlllIlllI();
    }

        return String.valueOf(var1);
    }
}

