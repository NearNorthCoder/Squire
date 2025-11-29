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
package gg.squire.corp.overlay;

import gg.squire.corp.overlay.CorpManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.corp.SquireCorp;
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

public class CorpInfoBox
extends OverlayPanel {
    private final  SquireCorp j;
    private final  s l;

    private final  TaskManager k;

    public String a(int n2) {
        Duration duration = Duration.between(this.j.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            Object[] objectArray = new Object[2];
            objectArray[1] = (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
            return String.format(var2[0], objectArray);
        }
        return var2[var1[11]];
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.j.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String string = var2[1];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[2]).right(this.k.getCurrentTask()).build());
        0;
        Duration duration = Duration.between(this.j.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[3]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(this.j.a() + " (" + this.a(this.j.a()) + "/h)").build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(this.j.e() + " (" + this.a(this.j.e()) + "/h)").build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(String.valueOf(this.j.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[7]).right(String.valueOf(this.j.d())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[8]).right(String.valueOf(this.l.r())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[9]).right(String.valueOf(this.l.s())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(String.valueOf(this.l.q())).build());
        0;
        return super.render(graphics2D);
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    public CorpInfoBox(SquireCorp squireCorp, s s2) {
        this.j = squireCorp;
        this.k = squireCorp.getManager();
        this.l = s2;
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
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

}

