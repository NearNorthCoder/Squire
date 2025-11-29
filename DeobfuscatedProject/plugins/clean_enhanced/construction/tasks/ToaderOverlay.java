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
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.minigames.toader.overlay;

import com.google.inject.Inject;
import gg.squire.basics.minigames.toader.SquireToadKiller;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class ToaderOverlay
extends OverlayPanel {
    private final  SquireToadKiller fl;
    private static  String[] lllIlIlll;
    private static  int[] lllIllIII;
    private final  TaskManager fm;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    private ToaderOverlay(SquireToadKiller squireToadKiller) {
        this.fl = squireToadKiller;
        this.fm = squireToadKiller.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.fl.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.fl.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlll[0]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[1]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[2]).right(lllIlIlll[3]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[4]).right(this.fm.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlll[5]).right(String.valueOf(this.fl.cs())).build());
        0;
        int n2 = 6;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 7, 0));
        return super.render(graphics2D);
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = 0;
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = 0;
        while (var21 < var20) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (-1 <= (0x11 ^ 0x15)) continue;
            return null;
        }
        return String.valueOf(var16);
    }

}

