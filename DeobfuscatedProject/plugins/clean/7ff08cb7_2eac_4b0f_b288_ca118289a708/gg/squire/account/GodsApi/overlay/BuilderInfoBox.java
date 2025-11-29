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

import gg.squire.account.GodsApi.overlay.EHelper;
import com.google.inject.Inject;
import gg.squire.account.AccBuilderGWD;
import gg.squire.account.BuilderConfig;
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

    private final  AccBuilderGWD cf;
    private final  BuilderConfig cg;

    private static void llIlIIlIIlll() {
        llllIlIll = new String[llllIllII[9]];
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[1]] = "Squire GWD Builder";
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[2]] = "Version";
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[3]] = "Runtime";
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[4]] = "Status:";
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[5]] = "Current Quest:";
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[6]] = "Tasks Completed:";
    }

    static {
        BuilderInfoBox.llIlIIlIlIII();
        BuilderInfoBox.llIlIIlIIlll();
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderGWD.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llllIllII[0], llllIllII[0], llllIllII[0], llllIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlIll[llllIllII[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[4]]).right(AccBuilderGWD.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[5]]).right(String.valueOf(AccBuilderGWD.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[6]]).right(String.valueOf(AccBuilderGWD.f)).build());

        int n2 = llllIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIllII[8], llllIllII[1]));
        return super.render(graphics2D);
    }

    @Inject
    private BuilderInfoBox(AccBuilderGWD accBuilderGWD, BuilderConfig builderConfig) {
        this.cf = accBuilderGWD;
        this.cg = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

