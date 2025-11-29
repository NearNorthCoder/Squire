/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.fishing.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class FishingInfoBox
extends OverlayPanel {
    
    private final  TaskManager D;
    private final  SquireFisherConfig E;
    private final  SquireFisherPlugin C;

    @Inject
    private FishingInfoBox(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.C = squireFisherPlugin;
        this.D = squireFisherPlugin.getManager();
        this.E = squireFisherConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n) {
        Duration duration = Duration.between(this.C.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < lllllllllllllllIlIlllIIllllllIIl2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public Dimension render(Graphics2D graphics2D) {
        FishingInfoBox var19;
        if ((this.C.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration var20 = Duration.between(var19.C.getStarted(), Instant.now()).minus(SquireFisherPlugin.c(), ChronoUnit.MILLIS);
        var19.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[0]).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[1]).right(Time.format((Duration)var20)).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[2]).right(var1[3]).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(var19.D.getCurrentTask()).build());
        0;
        if ((var19.E.fishingTrawler( == 0) ? 1 : 0)) {
            String string;
            List list = var19.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var1[5]);
            if ((var19.E.tickFishing( != 0) ? 1 : 0)) {
                string = var1[6];
                0;
                
            } else {
                string = var1[7];
            }
            list.add(lineComponentBuilder.right(string).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[8]).right("" + SquireFisherPlugin.d).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[9]).right("" + var19.b(SquireFisherPlugin.d)).build());
            0;
            0;
            if ((0x83 ^ 0xAB ^ (0x7B ^ 0x57)) != (0x2F ^ 0x65 ^ (0x76 ^ 0x38))) {
                return null;
            }
        } else {
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[10]]).right("" + SquireFisherPlugin.c).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[11]]).right("" + var19.b(SquireFisherPlugin.c)).build());
            0;
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[12]]).right("" + SquireFisherPlugin.b).build());
            0;
        }
        int n = var2[13];
        this.panelComponent.setPreferredSize(new Dimension(n + var2[14], 0));
        return super.render(graphics2D);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

}

