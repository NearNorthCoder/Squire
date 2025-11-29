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
package gg.squire.account.overlay;

import com.google.inject.Inject;
import gg.squire.account.AccBuilderRat;
import gg.squire.account.BuilderConfig;
import gg.squire.account.overlay.EHelper;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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

    private final  BuilderConfig bu;
    private final  AccBuilderRat bt;

    private static void lIlIIIlllIlIIll() {
        lIIIlllIIIlII = new String[lIIIlllIIIllI[9]];
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[1]] = "Squire Rat King Builder";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[2]] = "Version";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[3]] = "Runtime";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[4]] = "Status:";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[5]] = "Current Quest:";
        BuilderInfoBox.lIIIlllIIIlII[BuilderInfoBox.lIIIlllIIIllI[6]] = "Tasks Completed:";
    }

    static {
        BuilderInfoBox.lIlIIIlllIlllll();
        BuilderInfoBox.lIlIIIlllIlIIll();
    }

        return String.valueOf(var1);
    }

    @Inject
    private BuilderInfoBox(AccBuilderRat accBuilderRat, BuilderConfig builderConfig) {
        this.bt = accBuilderRat;
        this.bu = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIlIIIllllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderRat.b;
        double d2 = 0.14;
        this.panelComponent.setBorder(new Rectangle(lIIIlllIIIllI[0], lIIIlllIIIllI[0], lIIIlllIIIllI[0], lIIIlllIIIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlllIIIlII[lIIIlllIIIllI[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[4]]).right(AccBuilderRat.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[5]]).right(String.valueOf(AccBuilderRat.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlllIIIlII[lIIIlllIIIllI[6]]).right(String.valueOf(AccBuilderRat.f)).build());

        int n2 = lIIIlllIIIllI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIIlllIIIllI[8], lIIIlllIIIllI[1]));
        return super.render(graphics2D);
    }
}

