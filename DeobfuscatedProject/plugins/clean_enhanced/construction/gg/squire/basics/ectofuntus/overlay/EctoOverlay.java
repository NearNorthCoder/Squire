/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.ectofuntus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class EctoOverlay
extends OverlayPanel {
    private static  String[] lllIllIIl;
    private final  SquireEcto cW;
    private final  TaskManager cX;
    private static  int[] lllIllIlI;

    public long u(int n2) {
        Duration duration = Duration.between(this.cW.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        EctoOverlay var7;
        if ((this.cW.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration var8 = Duration.between(var7.cW.getStarted(), Instant.now());
        var7.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllIIl[0]).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[1]).right(Time.format((Duration)var8)).build());
        0;
        var7.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[2]).right(var7.cX.getCurrentTask()).build());
        0;
        List list = var7.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lllIllIIl[3]);
        if ((var7.cW.r( != 0) ? 1 : 0)) {
            string = lllIllIIl[4];
            0;
            if (1 < 0) {
                return null;
            }
        } else {
            string = lllIllIIl[5];
        }
        list.add(lineComponentBuilder.right(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[6]).right(this.cW.bm() + " (" + this.u(this.cW.bm()) + "/h)").build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[7]).right(this.cW.bl() + " (" + this.u(this.cW.bl()) + "/h)").build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllIIl[8]).right(this.cW.bn() + " (" + this.u(this.cW.bn()) + "/h)").build());
        0;
        int n2 = 9;
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIllIlI[10], 0));
        return super.render(graphics2D);
    }

    @Inject
    private EctoOverlay(SquireEcto squireEcto) {
        this.cW = squireEcto;
        this.cX = squireEcto.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

}

