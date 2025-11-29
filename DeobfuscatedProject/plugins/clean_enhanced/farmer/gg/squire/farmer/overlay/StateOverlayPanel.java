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
 */
package gg.squire.farmer.overlay;

import gg.squire.farmer.overlay.FarmerManager;
import gg.squire.farmer.overlay.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class StateOverlayPanel
extends OverlayPanel {
    private final  SquireFarmer bP;

    private final  SquireFarmerConfig bO;
    private final  b bN;
    private final  f bM;
    private final  TaskManager bQ;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String string = var1[1];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[2]).right(var1[3]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(String.valueOf(this.bQ.getCurrentTask())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(String.valueOf((Object)this.bP.a())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right(String.valueOf(this.bM.x())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[7]).right(String.valueOf(this.bM.v())).build());
        0;
        return super.render(graphics2D);
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    public StateOverlayPanel(f f2, b b2, SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer) {
        this.bM = f2;
        this.bN = b2;
        this.bO = squireFarmerConfig;
        this.bP = squireFarmer;
        this.bQ = squireFarmer.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
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
            
            return null;
        }
        return String.valueOf(var18);
    }
}

