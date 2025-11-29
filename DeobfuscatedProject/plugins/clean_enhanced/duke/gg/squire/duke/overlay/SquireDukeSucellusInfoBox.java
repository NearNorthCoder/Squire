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
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import gg.squire.duke.overlay.DukeManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class SquireDukeSucellusInfoBox
extends OverlayPanel {
    private  a u;

    private final  TaskManager ad;
    private final  SquireDukeSucellus ac;
    private final  SquireDukeSucellusConfig ae;

    public long e(int n2) {
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public double f(int n2) {
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
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
            if ((0xEF ^ 0xB1 ^ (0xEA ^ 0xB0)) != ((17 + 119 - 10 + 12 ^ 43 + 129 - 82 + 55) & (113 + 96 - 67 + 12 ^ 32 + 115 - 72 + 54 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    @Inject
    public SquireDukeSucellusInfoBox(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig, a a2) {
        this.ac = squireDukeSucellus;
        this.ad = squireDukeSucellus.getManager();
        this.ae = squireDukeSucellusConfig;
        this.u = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if ((this.ac.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String string = var1[1];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = 2;
        this.panelComponent.setPreferredSize(new Dimension(n2 + 3, 1));
        Duration duration = Duration.between(this.ac.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(Time.format((Duration)duration)).build());
        0;
        int n3 = this.ac.o();
        double d2 = this.f(n3);
        Object[] objectArray = new Object[5];
        objectArray[1] = n3;
        objectArray[4] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(String.format(var1[6], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[7]).right(this.ad.getCurrentTask()).build());
        0;
        int n4 = Static.getClient().getTickCount();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Last spike: " + (n4 - this.u.D())).right("Last Gaze: " + (n4 - this.u.C())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.ac.l()).left("Banking: " + this.ac.p()).build());
        0;
        return super.render(graphics2D);
    }

}

