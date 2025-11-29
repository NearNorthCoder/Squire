/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.PanelComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
import com.google.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.plugins.logout.Clues;

public class 7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager
extends Overlay {
    
    private final  PanelComponent D;
    private final  Clues C;
    
    private final  Client B;

    private static void lIIIIIl() {
        llII = new String[llIl[10]];
        b.llII[b.llIl[0]] = "#.00";
        b.llII[b.llIl[2]] = "Squire Easy Clues";
        b.llII[b.llIl[3]] = "Version";
        b.llII[b.llIl[4]] = "Runtime";
        b.llII[b.llIl[5]] = "Status:";
        b.llII[b.llIl[6]] = "Clues completed:";
        b.llII[b.llIl[7]] = "Profit:";
    }

    private static boolean lIIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    private 7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager(Client client, Clues clues) {
        this.D = new PanelComponent();
        this.B = client;
        this.C = clues;
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static double a(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(llII[llIl[0]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    static {
        b.lIIIIlI();
        b.lIIIIIl();
    }

    private static boolean lIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.D.getChildren().clear();
        long l2 = System.currentTimeMillis() - Clues.m;
        int n2 = (int)((double)Clues.n * 3600000.0 / (double)l2);
        double d2 = 0.32;
        this.D.setBorder(new Rectangle(llIl[1], llIl[1], llIl[1], llIl[1]));
        this.D.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llII[llIl[2]]).build());

        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[3]]).right("1." + d2).build());

        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[4]]).right(k.7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager(l2)).build());

        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[5]]).right(Clues.c).build());

        this.D.getChildren().add(LineComponent.builder().left(llII[llIl[6]]).right(k.f(Clues.i) + " (" + b.a(Clues.i, l2) + "/hr)").build());

        if (b.lIIIIll(Clues.f ? 1 : 0)) {
            this.D.getChildren().add(LineComponent.builder().left(llII[llIl[7]]).right(k.f(Clues.n) + " (" + k.f(n2) + "/hr)").build());

        }
        int n3 = llIl[8];
        this.D.setPreferredSize(new Dimension(n3 + llIl[9], llIl[0]));
        return this.D.render(graphics2D);
    }

        return String.valueOf(lllllIlllIIIlIl);
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return b.a(d3);
    }
}

