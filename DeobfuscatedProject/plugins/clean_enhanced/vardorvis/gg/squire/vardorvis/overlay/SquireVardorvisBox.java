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
package gg.squire.vardorvis.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
import gg.squire.vardorvis.overlay.VardorvisManager;

public class SquireVardorvisBox
extends OverlayPanel {
    
    private final  SquireVardorvisConfig ab;
    private final  TaskManager aa;
    private final  SquireVardorvis Z;
    private  e l;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        SquireVardorvisBox.var9();
        SquireVardorvisBox.var10();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public SquireVardorvisBox(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2) {
        this.Z = squireVardorvis;
        this.aa = squireVardorvis.getManager();
        this.ab = squireVardorvisConfig;
        this.l = e2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[1];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[1];
        while (SquireVardorvisBox.var17(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0xB1 ^ 0x88 ^ (0x9F ^ 0xA2)) > 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireVardorvisBox.var28(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        String string = var1[var2[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = var2[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[3], var2[1]));
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)duration)).build());
        0;
        int n3 = this.Z.g();
        double d2 = this.g(n3);
        Object[] objectArray = new Object[var2[5]];
        objectArray[SquireVardorvisBox.var2[1]] = n3;
        objectArray[SquireVardorvisBox.var2[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.format(var1[var2[6]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(this.aa.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.Z.f()).left("Banking: " + this.Z.h()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(String.valueOf(this.Z.i())).build());
        0;
        return super.render(graphics2D);
    }

    private static void var10() {
        var1 = new String[var2[9]];
        SquireVardorvisBox.var1[SquireVardorvisBox.var2[1]] = "Squire Vardorvis";
        SquireVardorvisBox.var1[SquireVardorvisBox.var2[4]] = "Runtime:";
        SquireVardorvisBox.var1[SquireVardorvisBox.var2[5]] = "Kills: ";
        SquireVardorvisBox.var1[SquireVardorvisBox.var2[6]] = "%d (%.1f/h)";
        SquireVardorvisBox.var1[SquireVardorvisBox.var2[7]] = "Task:";
        SquireVardorvisBox.var1[SquireVardorvisBox.var2[8]] = "Died:";
    }

    private static void var9() {
        var2 = new int[11];
        SquireVardorvisBox.var2[0] = 0x3E ^ 0x34;
        SquireVardorvisBox.var2[1] = (180 + 144 - 191 + 60 ^ 5 + 101 - 64 + 97) & (10 + 153 - 48 + 95 ^ 97 + 70 - 128 + 113 ^ -1);
        SquireVardorvisBox.var2[2] = 145 + 79 - 86 + 55;
        SquireVardorvisBox.var2[3] = 2 ^ (0x57 ^ 0x41);
        SquireVardorvisBox.var2[4] = 1;
        SquireVardorvisBox.var2[5] = 2;
        SquireVardorvisBox.var2[6] = 3;
        SquireVardorvisBox.var2[7] = 0x82 ^ 0x86;
        SquireVardorvisBox.var2[8] = 0x9D ^ 0x98;
        SquireVardorvisBox.var2[9] = 159 + 129 - 101 + 3 ^ 152 + 109 - 78 + 1;
        SquireVardorvisBox.var2[10] = 0x1A ^ 0x12;
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (SquireVardorvisBox.var29(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean var29(int n2) {
        return n2 == 0;
    }

    private static boolean var28(int n2) {
        return n2 != 0;
    }

    public long f(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (SquireVardorvisBox.var29(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }
}

