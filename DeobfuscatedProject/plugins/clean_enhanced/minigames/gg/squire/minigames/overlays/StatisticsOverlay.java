/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlays;

import gg.squire.minigames.overlays.MinigamesManager;
import gg.squire.minigames.overlays.MinigamesManager;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class StatisticsOverlay
extends OverlayPanel {
    
    @Inject
    private  SquireBlastFurnaceConfig i;
    
    private final  TaskManager bZ;
    private final  SquireBlastFurnace ca;
    @Inject
    private  G u;
    public static final  String bY;

    static {
        StatisticsOverlay.var3();
        StatisticsOverlay.var4();
        bY = var1[9];
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.ca.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        int n2 = 0;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 1, 2));
        this.panelComponent.setBorder(new Rectangle(3, 3, 3, 3));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[2]).build());
        0;
        Duration duration = Duration.between(this.ca.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(F.h(this.u.aa())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right(F.h(this.u.ah())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[7]).right(F.a(this.u.ab())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[8]).right(F.h(this.u.ai())).build());
        0;
        return super.render(graphics2D);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    StatisticsOverlay(SquireBlastFurnace squireBlastFurnace) {
        super((Plugin)squireBlastFurnace);
        this.ca = squireBlastFurnace;
        this.bZ = squireBlastFurnace.getManager();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 2;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 2;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }
}

