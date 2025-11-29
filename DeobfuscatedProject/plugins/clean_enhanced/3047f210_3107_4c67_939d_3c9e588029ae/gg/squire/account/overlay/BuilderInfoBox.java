/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.account.overlay;

import com.google.inject.Inject;
import gg.squire.account.overlay.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.AccBuilderTempleTrek;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {
    
    private final  AccBuilderTempleTrek bn;
    
    private final  BuilderConfig bo;

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
            if ((0x2E ^ 0x2A) == (0x61 ^ 0x65)) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    @Inject
    private BuilderInfoBox(AccBuilderTempleTrek accBuilderTempleTrek, BuilderConfig builderConfig) {
        this.bn = accBuilderTempleTrek;
        this.bo = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderTempleTrek.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[1]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[2]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[3]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(AccBuilderTempleTrek.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(String.valueOf(AccBuilderTempleTrek.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right(String.valueOf(AccBuilderTempleTrek.f)).build());
        0;
        int n2 = 7;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 8, 1));
        return super.render(graphics2D);
    }
}

