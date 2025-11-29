/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import gg.squire.runecrafting.overlay.RunecraftingManager;
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

@Singleton
public class RunecrafterInfoBox
extends OverlayPanel {

    private final  SquireZeahRunecrafter m;
    private final  a o;
    private final  TaskManager n;

    public Dimension render(Graphics2D graphics2D) {
        if ((this.m.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String string = var1[1];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n = 2;
        this.panelComponent.setPreferredSize(new Dimension(n + 3, 1));
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[4]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[5]).right(this.n.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right(this.m.b() + " (" + this.d(this.m.b()) + "/h)").build());
        0;
        Object[] objectArray = new Object[4];
        objectArray[1] = this.m.c();
        Object[] objectArray2 = new Object[4];
        objectArray2[1] = this.d(this.m.c());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[7]).right(String.format(var1[8], objectArray) + " (" + String.format(var1[9], objectArray2) + "/h)").build());
        0;
        return super.render(graphics2D);
    }

    public long d(int n) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < llllllllllllllIllIIlIIIllllllIIl2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((4 + 29 - -151 + 4 ^ 102 + 138 - 163 + 107) >= 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public RunecrafterInfoBox(SquireZeahRunecrafter squireZeahRunecrafter, a a2) {
        this.m = squireZeahRunecrafter;
        this.n = squireZeahRunecrafter.getManager();
        this.o = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

