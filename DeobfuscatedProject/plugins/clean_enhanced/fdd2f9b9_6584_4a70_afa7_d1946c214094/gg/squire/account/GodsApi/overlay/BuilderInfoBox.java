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
package gg.squire.account.GodsApi.overlay;

import com.google.inject.Inject;
import gg.squire.account.GodsApi.overlay.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.AccBuilderRogues;
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
    
    private final  AccBuilderRogues bo;
    
    private final  BuilderConfig bp;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    private BuilderInfoBox(AccBuilderRogues accBuilderRogues, BuilderConfig builderConfig) {
        this.bo = accBuilderRogues;
        this.bp = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderRogues.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[1]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[2]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[3]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(AccBuilderRogues.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(String.valueOf(AccBuilderRogues.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(String.valueOf(AccBuilderRogues.f)).build());
        0;
        int n2 = 7;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 8, 1));
        return super.render(graphics2D);
    }

}

