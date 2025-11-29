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
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.woodcutting.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class WCGInfoBox
extends OverlayPanel {

    private final  SquireWoodcutterConfig q;
    private final  TaskManager r;
    private final  SquireWoodcutterPlugin p;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < llllllllllllllIllIIllIlIIIIlIlll2) {
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

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    private WCGInfoBox(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.p = squireWoodcutterPlugin;
        this.q = squireWoodcutterConfig;
        this.r = squireWoodcutterPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.p.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[1]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[2]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[3]).right(var1[4]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(this.r.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right("" + SquireWoodcutterPlugin.b).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[7]).right("" + this.d(SquireWoodcutterPlugin.b)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[8]).right("" + SquireWoodcutterPlugin.c).build());
        0;
        int n = 9;
        this.panelComponent.setPreferredSize(new Dimension(n + var2[10], 1));
        return super.render(graphics2D);
    }

    public long d(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }
}

