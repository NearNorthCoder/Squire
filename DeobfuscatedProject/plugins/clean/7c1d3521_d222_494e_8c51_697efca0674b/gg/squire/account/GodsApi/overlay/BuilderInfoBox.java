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
import gg.squire.account.AccBuilderSotf;
import gg.squire.account.BuilderConfig;
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
import gg.squire.account.GodsApi.overlay.EHelper;

public class BuilderInfoBox
extends OverlayPanel {
    private final  BuilderConfig ce;

    private final  AccBuilderSotf cd;

    static {
        BuilderInfoBox.lIllIlllllllI();
        BuilderInfoBox.lIllIllllllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderSotf.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llIllIllII[0], llIllIllII[0], llIllIllII[0], llIllIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIllIlIll[llIllIllII[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[4]]).right(AccBuilderSotf.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[5]]).right(String.valueOf(AccBuilderSotf.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[6]]).right(String.valueOf(AccBuilderSotf.f)).build());

        int n2 = llIllIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIllIllII[8], llIllIllII[1]));
        return super.render(graphics2D);
    }

        return String.valueOf(var1);
    }

    private static void lIllIllllllIl() {
        llIllIlIll = new String[llIllIllII[9]];
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[1]] = "Squire Sotf Builder";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[2]] = "Version";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[3]] = "Runtime";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[4]] = "Status:";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[5]] = "Current Quest:";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[6]] = "Tasks Completed:";
    }

    private static boolean lIllIllllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private BuilderInfoBox(AccBuilderSotf accBuilderSotf, BuilderConfig builderConfig) {
        this.cd = accBuilderSotf;
        this.ce = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

