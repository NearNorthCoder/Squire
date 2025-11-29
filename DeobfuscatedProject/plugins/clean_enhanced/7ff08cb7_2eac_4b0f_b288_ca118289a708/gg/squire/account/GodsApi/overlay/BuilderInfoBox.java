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

import gg.squire.account.GodsApi.overlay.7ff08cb7-2eac-4b0f-b288-ca118289a708Manager;
import com.google.inject.Inject;
import gg.squire.account.AccBuilderGWD;
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
    private static  String[] llllIlIll;
    private static  int[] llllIllII;
    private final  AccBuilderGWD cf;
    private final  BuilderConfig cg;

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

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderGWD.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlIll[1]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[2]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[3]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[4]).right(AccBuilderGWD.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[5]).right(String.valueOf(AccBuilderGWD.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[6]).right(String.valueOf(AccBuilderGWD.f)).build());
        0;
        int n2 = 7;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 8, 1));
        return super.render(graphics2D);
    }

    @Inject
    private BuilderInfoBox(AccBuilderGWD accBuilderGWD, BuilderConfig builderConfig) {
        this.cf = accBuilderGWD;
        this.cg = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

