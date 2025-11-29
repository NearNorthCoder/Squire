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
package gg.squire.gorillas.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.gorillas.SquireGorillaPlugin;
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

public class GorillaInfoBox
extends OverlayPanel {
    
    private final  TaskManager Q;
    private final  SquireGorillaPlugin P;

    public Dimension render(Graphics2D graphics2D) {
        if ((this.P.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.P.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[1]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[2]).right(var1[3]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(this.Q.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right(String.valueOf(this.P.i())).build());
        0;
        int n2 = 7;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 8, 1));
        return super.render(graphics2D);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    private GorillaInfoBox(SquireGorillaPlugin squireGorillaPlugin) {
        this.P = squireGorillaPlugin;
        this.Q = squireGorillaPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 1;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 1;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var18);
    }
}

