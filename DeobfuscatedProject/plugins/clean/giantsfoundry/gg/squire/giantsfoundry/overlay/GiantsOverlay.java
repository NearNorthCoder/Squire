/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Point
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.giantsfoundry.overlay;

import gg.squire.giantsfoundry.overlay.GiantsfoundryManager;
import gg.squire.giantsfoundry.overlay.GameEnum21;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Point;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class GiantsOverlay
extends OverlayPanel {
    private final  a Z;
    private final  SquireGiantsFoundry Y;

    private static boolean lIIIIlIIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlIIIIllIII(Object object) {
        return object == null;
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        GiantsOverlay var1;
        if (GiantsOverlay.lIIIIlIIIIlIlll(this.Y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var1.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIlllIlIl[llIlIllllllI[0]]).build());

        Duration var2 = Duration.between(var1.Y.getStarted(), Instant.now());
        var1.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[1]]).right(Time.format((Duration)var2)).build());

        List list = var1.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[2]]);
        if (GiantsOverlay.lIIIIlIIIIllIII((Object)var1.Z.k())) {
            object = llIlIlllIlIl[llIlIllllllI[3]];

            if (((0xD2 ^ 0x9B) & ~(0x52 ^ 0x1B)) > (0x91 ^ 0x95)) {
                return null;
            }
        } else {
            object = var1.Z.k();
        }
        list.add(lineComponentBuilder.right(String.valueOf(object)).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[4]]).right(String.valueOf(var1.Y.getManager().getCurrentTask())).build());

        if (GiantsOverlay.lIIIIlIIIIllIIl(var1.Z.l(), llIlIllllllI[5])) {
            String string;
            var1.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[6]]).right(String.valueOf(var1.Z.l())).build());

            List list2 = var1.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[7]]);
            if (GiantsOverlay.lIIIIlIIIIlIlll(var1.Z.n() ? 1 : 0)) {
                string = llIlIlllIlIl[llIlIllllllI[8]];

            } else {
                string = llIlIlllIlIl[llIlIllllllI[9]];
            }
            list2.add(lineComponentBuilder2.right(string).build());

            var1.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[10]]).right(String.valueOf(var1.Z.m())).build());

            Map<h, Point> var3 = var1.Z.o();
            h[] var4 = h.values();
            int var5 = var4.length;
            int var6 = llIlIllllllI[0];
            while (GiantsOverlay.lIIIIlIIIIllIlI(var6, var5)) {
                h var7 = var4[var6];
                Object[] objectArray = new Object[llIlIllllllI[1]];
                objectArray[GiantsOverlay.llIlIllllllI[0]] = var7;
                Object[] objectArray2 = new Object[llIlIllllllI[2]];
                objectArray2[GiantsOverlay.llIlIllllllI[0]] = var3.get((Object)var7).getX();
                objectArray2[GiantsOverlay.llIlIllllllI[1]] = var3.get((Object)var7).getY();
                var1.panelComponent.getChildren().add(LineComponent.builder().left(String.format(llIlIlllIlIl[llIlIllllllI[11]], objectArray)).right(String.format(llIlIlllIlIl[llIlIllllllI[12]], objectArray2)).build());

                ++var6;

                return null;
            }
        }
        int n2 = llIlIllllllI[13];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIlIllllllI[14], llIlIllllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIIIIlllllllll() {
        llIlIlllIlIl = new String[llIlIllllllI[15]];
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[0]] = "Squire Giants Foundry";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[1]] = "Runtime";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[2]] = "Current Sword Task";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[3]] = "None";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[4]] = "Current Actual Task";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[6]] = "Current Temperature";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[7]] = "Is Temperature Correct";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[8]] = "Yes";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[9]] = "No";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[10]] = "Optimal Temperature";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[11]] = "%s zone:";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[12]] = "%d - %d";
    }

    @Inject
    public GiantsOverlay(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.Y = squireGiantsFoundry;
        this.Z = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        return String.valueOf(var8);
    }

    static {
        GiantsOverlay.lIIIIlIIIIlIllI();
        GiantsOverlay.lIIIIIlllllllll();
    }

    private static boolean lIIIIlIIIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIlIIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

}

