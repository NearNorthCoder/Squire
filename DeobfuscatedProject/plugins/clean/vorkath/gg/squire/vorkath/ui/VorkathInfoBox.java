/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.runelite.client.util.QuantityFormatter
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.client.Static
 */
package gg.squire.vorkath.ui;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.ui.VorkathManager;
import gg.squire.vorkath.ui.VorkathManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.util.QuantityFormatter;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class VorkathInfoBox
extends OverlayPanel {
    private final  d cL;
    
    private final  SquireVorkathPlugin cK;
    
    private  SquireVorkathConfig y;
    private final  f cM;

    private static boolean lIlllllIlllllIl(Object object) {
        return object != null;
    }

    static {
        VorkathInfoBox.lIlllllIllllIll();
        VorkathInfoBox.lIlllllIllIlllI();
    }

    private static void lIlllllIllIlllI() {
        lIlIlIlIlIIII = new String[lIlIlIlIlIIlI[17]];
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[2]] = "Squire Vorkath";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[3]] = "Version";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[4]] = "0.3.1";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[5]] = "Runtime";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[6]] = "Performing Task";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[7]] = "Kills";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[8]] = "%d (%d/h)";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[9]] = "Money";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[10]] = "%s (%s/h)";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[11]] = "Deaths";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[0]] = "%d";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[12]] = "Bakning";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[13]] = "Vorkath Frame";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[14]] = "Ticks since attack";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[15]] = "Ice spawn";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[16]] = "Special";
    }

    private static boolean lIlllllIlllllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public VorkathInfoBox(SquireVorkathPlugin squireVorkathPlugin, d d2, f f2, SquireVorkathConfig squireVorkathConfig) {
        this.cK = squireVorkathPlugin;
        this.cL = d2;
        this.cM = f2;
        this.y = squireVorkathConfig;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlllllIllllllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlllllIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        VorkathInfoBox var2;
        if (VorkathInfoBox.lIlllllIlllllII(this.cK.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.setBorder(new Rectangle(lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0]));
        var2.panelComponent.setPreferredSize(new Dimension(lIlIlIlIlIIlI[1], lIlIlIlIlIIlI[2]));
        String var3 = lIlIlIlIlIIII[lIlIlIlIlIIlI[2]];
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var3).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[3]]).right(lIlIlIlIlIIII[lIlIlIlIlIIlI[4]]).build());

        Duration var4 = Duration.between(var2.cK.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[5]]).right(Time.format((Duration)var4)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[6]]).right(var2.cK.getManager().getCurrentTask()).build());

        Object[] objectArray = new Object[lIlIlIlIlIIlI[4]];
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[2]] = var2.cK.e();
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[3]] = var2.g(var2.cK.e());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[7]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[8]], objectArray)).build());

        Object[] objectArray2 = new Object[lIlIlIlIlIIlI[4]];
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[2]] = QuantityFormatter.quantityToRSDecimalStack((int)var2.cK.g());
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[3]] = QuantityFormatter.quantityToRSDecimalStack((int)var2.g(var2.cK.g()));
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[9]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[10]], objectArray2)).build());

        Object[] objectArray3 = new Object[lIlIlIlIlIIlI[3]];
        objectArray3[VorkathInfoBox.lIlIlIlIlIIlI[2]] = var2.cK.d();
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[11]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[0]], objectArray3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[12]]).right(String.valueOf(var2.cK.c())).build());

        NPC var5 = var2.cM.c(lIlIlIlIlIIlI[3]);
        if (VorkathInfoBox.lIlllllIlllllIl(var5) && VorkathInfoBox.lIlllllIlllllII(var2.y.debug() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[13]]).right(String.valueOf(var5.getActionFrame())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[14]]).right(String.valueOf(Static.getClient().getTickCount() - var2.cM.H())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[15]]).right(String.valueOf(var2.cM.I())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[16]]).right(String.valueOf((Object)var2.cM.B())).build());

        }
        return super.render(graphics2D);
    }

    public int g(int n2) {
        Duration duration = Duration.between(this.cK.getStarted(), Instant.now());
        if (VorkathInfoBox.lIlllllIllllllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return lIlIlIlIlIIlI[2];
    }

}

