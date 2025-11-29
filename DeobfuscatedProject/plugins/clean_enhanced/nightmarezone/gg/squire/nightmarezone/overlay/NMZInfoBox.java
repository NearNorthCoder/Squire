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
package gg.squire.nightmarezone.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmarezone.SquireNightmareZone;
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
public class NMZInfoBox
extends OverlayPanel {

    private final  SquireNightmareZone z;
    private final  TaskManager A;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static void var11() {
        var2 = new int[7];
        NMZInfoBox.var2[0] = 0x5D ^ 0x57;
        NMZInfoBox.var2[1] = (0x43 ^ 0x7B ^ (0x68 ^ 0xD)) & (0xC ^ 0x1A ^ (0xE6 ^ 0xAD) ^ -1);
        NMZInfoBox.var2[2] = 76 + 147 - 44 + 14;
        NMZInfoBox.var2[3] = 0x75 ^ 7 ^ (0xF8 ^ 0x9E);
        NMZInfoBox.var2[4] = 1;
        NMZInfoBox.var2[5] = 2;
        NMZInfoBox.var2[6] = 3;
    }

    @Inject
    public NMZInfoBox(SquireNightmareZone squireNightmareZone) {
        this.z = squireNightmareZone;
        this.A = squireNightmareZone.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[1];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[1];
        while (NMZInfoBox.var9(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x11 ^ 4 ^ (0x76 ^ 0x67)) > 3) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var22() {
        var1 = new String[var2[6]];
        NMZInfoBox.var1[NMZInfoBox.var2[1]] = "Squire NMZ";
        NMZInfoBox.var1[NMZInfoBox.var2[4]] = "Runtime:";
        NMZInfoBox.var1[NMZInfoBox.var2[5]] = "Task: ";
    }

    static {
        NMZInfoBox.var11();
        NMZInfoBox.var22();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (NMZInfoBox.var10(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        String string = var1[var2[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = var2[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[3], var2[1]));
        Duration duration = Duration.between(this.z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(this.A.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }
}

