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
import gg.squire.account.overlay.EHelper;
import gg.squire.account.AccBuilderTempleTrek;
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
    
    private final  AccBuilderTempleTrek bn;
    
    private final  BuilderConfig bo;

    static {
        BuilderInfoBox.llIlIIlIIIlll();
        BuilderInfoBox.llIlIIlIIIllI();
    }

        return String.valueOf(var1);
    }

    private static boolean llIlIIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private BuilderInfoBox(AccBuilderTempleTrek accBuilderTempleTrek, BuilderConfig builderConfig) {
        this.bn = accBuilderTempleTrek;
        this.bo = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderTempleTrek.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lllllIIIlI[0], lllllIIIlI[0], lllllIIIlI[0], lllllIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllIIIIl[lllllIIIlI[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[4]]).right(AccBuilderTempleTrek.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[5]]).right(String.valueOf(AccBuilderTempleTrek.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIIIIl[lllllIIIlI[6]]).right(String.valueOf(AccBuilderTempleTrek.f)).build());

        int n2 = lllllIIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllllIIIlI[8], lllllIIIlI[1]));
        return super.render(graphics2D);
    }

    private static void llIlIIlIIIllI() {
        lllllIIIIl = new String[lllllIIIlI[9]];
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[1]] = "Squire TempleTrek Builder";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[2]] = "Version";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[3]] = "Runtime";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[4]] = "Status:";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[5]] = "Current Quest:";
        BuilderInfoBox.lllllIIIIl[BuilderInfoBox.lllllIIIlI[6]] = "Tasks Completed:";
    }
}

