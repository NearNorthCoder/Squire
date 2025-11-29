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
import gg.squire.account.AccBuilderBarrows;
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

public class BuilderInfoBox
extends OverlayPanel {
    
    private final  BuilderConfig bv;
    
    private final  AccBuilderBarrows bu;

    private static boolean lIlIIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderBarrows.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llIIIIIl[0], llIIIIIl[0], llIIIIIl[0], llIIIIIl[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllllll[llIIIIIl[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[4]]).right(AccBuilderBarrows.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[5]]).right(String.valueOf(AccBuilderBarrows.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllll[llIIIIIl[6]]).right(String.valueOf(AccBuilderBarrows.f)).build());

        int n2 = llIIIIIl[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIIIIIl[8], llIIIIIl[1]));
        return super.render(graphics2D);
    }

    @Inject
    private BuilderInfoBox(AccBuilderBarrows accBuilderBarrows, BuilderConfig builderConfig) {
        this.bu = accBuilderBarrows;
        this.bv = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.lIlIIIlIIlI();
        BuilderInfoBox.lIlIIIIIlll();
    }

    private static void lIlIIIIIlll() {
        lIllllll = new String[llIIIIIl[9]];
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[1]] = "Squire Barrows Builder";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[2]] = "Version";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[3]] = "Runtime";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[4]] = "Status:";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[5]] = "Current Quest:";
        BuilderInfoBox.lIllllll[BuilderInfoBox.llIIIIIl[6]] = "Tasks Completed:";
    }

        return String.valueOf(lIlIllIllIIIlII);
    }

}

