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
package gg.squire.whisperer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.whisperer.SquireWhisperer;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.whisperer.overlay.WhispererManager;
import gg.squire.whisperer.overlay.WhispererManager;
import gg.squire.whisperer.overlay.RechargingTridentTask;
import gg.squire.whisperer.overlay.DodgingTentaclesTask;

public class WhispererInfoBox
extends OverlayPanel {
    private final  j v;
    private final  TaskManager s;
    private final  SquireWhisperer q;
    private final  a u;

    private final  d r;
    private final  p t;

    public long d(int n2) {
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    @Inject
    public WhispererInfoBox(SquireWhisperer squireWhisperer, d d2, p p2, a a2, j j2) {
        this.q = squireWhisperer;
        this.r = d2;
        this.s = squireWhisperer.getManager();
        this.t = p2;
        this.u = a2;
        this.v = j2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.q.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        String string = var2[0];
        this.panelComponent.setBorder(new Rectangle(1, 1, 1, 1));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = 2;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 3, 0));
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(var2[5]).build());
        0;
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[7]).right(this.s.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[8]).right(String.valueOf(this.q.a())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[9]).right(String.valueOf(this.u.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(String.valueOf(this.v.q())).build());
        0;
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

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

}

