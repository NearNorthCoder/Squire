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
import gg.squire.account.AccBuilderEasyClues;
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
import gg.squire.account.GodsApi.overlay.EHelper;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {
    private final  AccBuilderEasyClues bo;
    private final  BuilderConfig bp;

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderEasyClues.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0], lIlIlIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlIIIl[lIlIlIIlI[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[2]]).right("1." + d2).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[3]]).right(e.b(l2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[4]]).right(AccBuilderEasyClues.c).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[5]]).right(String.valueOf(AccBuilderEasyClues.l)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIIl[lIlIlIIlI[6]]).right(String.valueOf(AccBuilderEasyClues.f)).build());

        int n2 = lIlIlIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlIIlI[8], lIlIlIIlI[1]));
        return super.render(graphics2D);
    }

    private static void lIIIlllIlIIl() {
        lIlIlIIIl = new String[lIlIlIIlI[9]];
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[1]] = "Squire Easy Clue Builder";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[2]] = "Version";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[3]] = "Runtime";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[4]] = "Status:";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[5]] = "Current Quest:";
        BuilderInfoBox.lIlIlIIIl[BuilderInfoBox.lIlIlIIlI[6]] = "Tasks Completed:";
    }

        return String.valueOf(lllIlIIIlIlllI);
    }

    @Inject
    private BuilderInfoBox(AccBuilderEasyClues accBuilderEasyClues, BuilderConfig builderConfig) {
        this.bo = accBuilderEasyClues;
        this.bp = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        BuilderInfoBox.lIIIlllIlIlI();
        BuilderInfoBox.lIIIlllIlIIl();
    }

    private static boolean lIIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

