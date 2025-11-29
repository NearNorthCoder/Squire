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
package gg.squire.tempoross.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tempoross.SquireTempoross;
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
import gg.squire.tempoross.overlay.TemporossManager;

public class TemporossInfoBox
extends OverlayPanel {
    private final  TaskManager ad;
    private final  a ac;
    private final  SquireTempoross ab;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        TemporossInfoBox.var4();
        TemporossInfoBox.var5();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[1];
        while (TemporossInfoBox.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.ab.getStarted(), Instant.now());
        if (TemporossInfoBox.var17(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (TemporossInfoBox.var3(this.ab.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        String string = var2[var1[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = var1[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var1[3], var1[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(String.valueOf(this.ac.B().toElapsedString())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(this.ad.getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[var1[5]];
        objectArray[TemporossInfoBox.var1[1]] = this.ac.D();
        objectArray[TemporossInfoBox.var1[4]] = this.g(this.ac.D());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.format(var2[var1[7]], objectArray)).build());
        0;
        Object[] objectArray2 = new Object[var1[5]];
        objectArray2[TemporossInfoBox.var1[1]] = this.ac.C();
        objectArray2[TemporossInfoBox.var1[4]] = this.g(this.ac.C());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(String.format(var2[var1[9]], objectArray2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(String.valueOf(this.ac.E())).build());
        0;
        return super.render(graphics2D);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Inject
    public TemporossInfoBox(SquireTempoross squireTempoross, a a2) {
        this.ab = squireTempoross;
        this.ac = a2;
        this.ad = squireTempoross.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var1 = new int[12];
        TemporossInfoBox.var1[0] = 0x2E ^ 0x24;
        TemporossInfoBox.var1[1] = (0x5D ^ 0x15 ^ (0x11 ^ 0x15)) & (0x4E ^ 0x69 ^ (0x42 ^ 0x29) ^ -1);
        TemporossInfoBox.var1[2] = 2 + 80 - -5 + 106;
        TemporossInfoBox.var1[3] = 0xB6 ^ 0xC3 ^ (0xDF ^ 0xBE);
        TemporossInfoBox.var1[4] = 1;
        TemporossInfoBox.var1[5] = 2;
        TemporossInfoBox.var1[6] = 3;
        TemporossInfoBox.var1[7] = 0xD9 ^ 0x9C ^ (0x53 ^ 0x12);
        TemporossInfoBox.var1[8] = 0x90 ^ 0x95;
        TemporossInfoBox.var1[9] = 1 ^ (0x87 ^ 0x80);
        TemporossInfoBox.var1[10] = 0xB7 ^ 0xB0;
        TemporossInfoBox.var1[11] = 0x6D ^ 0x43 ^ (4 ^ 0x22);
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var2 = new String[var1[11]];
        TemporossInfoBox.var2[TemporossInfoBox.var1[1]] = "Squire Tempoross";
        TemporossInfoBox.var2[TemporossInfoBox.var1[4]] = "Runtime:";
        TemporossInfoBox.var2[TemporossInfoBox.var1[5]] = "Task: ";
        TemporossInfoBox.var2[TemporossInfoBox.var1[6]] = "Number of games:";
        TemporossInfoBox.var2[TemporossInfoBox.var1[7]] = "%d (%.1f/h)";
        TemporossInfoBox.var2[TemporossInfoBox.var1[8]] = "Permits gained:";
        TemporossInfoBox.var2[TemporossInfoBox.var1[9]] = "%d (%.1f/h)";
        TemporossInfoBox.var2[TemporossInfoBox.var1[10]] = "Phase: ";
    }
}

