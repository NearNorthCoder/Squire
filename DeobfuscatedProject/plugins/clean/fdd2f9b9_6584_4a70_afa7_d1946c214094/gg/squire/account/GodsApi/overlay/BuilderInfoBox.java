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
import gg.squire.account.GodsApi.overlay.EHelper;
import gg.squire.account.AccBuilderRogues;
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
    
    private final  AccBuilderRogues bo;
    
    private final  BuilderConfig bp;

        return String.valueOf(var1);
    }

    private static void lllllllIIIll() {
        lIIlIlIlIl = new String[lIIlIlIllI[9]];
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[1]] = "Squire Rogues Outfit Builder";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[2]] = "Version";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[3]] = "Runtime";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[4]] = "Status:";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[5]] = "Current Quest:";
        BuilderInfoBox.lIIlIlIlIl[BuilderInfoBox.lIIlIlIllI[6]] = "Tasks Completed:";
    }

    @Inject
    private BuilderInfoBox(AccBuilderRogues accBuilderRogues, BuilderConfig builderConfig) {
        this.bo = accBuilderRogues;
        this.bp = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderRogues.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIIlIlIllI[0], lIIlIlIllI[0], lIIlIlIllI[0], lIIlIlIllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIlIlIl[lIIlIlIllI[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[4]]).right(AccBuilderRogues.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[5]]).right(String.valueOf(AccBuilderRogues.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIlIlIl[lIIlIlIllI[6]]).right(String.valueOf(AccBuilderRogues.f)).build());

        int n2 = lIIlIlIllI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlIlIllI[8], lIIlIlIllI[1]));
        return super.render(graphics2D);
    }

    private static boolean lllllllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        BuilderInfoBox.lllllllIIlII();
        BuilderInfoBox.lllllllIIIll();
    }
}

