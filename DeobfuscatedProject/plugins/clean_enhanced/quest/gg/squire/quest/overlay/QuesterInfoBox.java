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
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireTutorialIsland;
import java.awt.Dimension;
import java.awt.Graphics2D;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.game.Vars;

public class QuesterInfoBox
extends OverlayPanel {
    
    private final  TaskManager ag;

    private static void var3() {
        var2 = new int[9];
        QuesterInfoBox.var2[0] = (5 ^ 0x69 ^ (0x4F ^ 0x34)) & (60 + 126 - 129 + 78 ^ 6 + 104 - 8 + 42 ^ -1);
        QuesterInfoBox.var2[1] = 1;
        QuesterInfoBox.var2[2] = 2;
        QuesterInfoBox.var2[3] = 3;
        QuesterInfoBox.var2[4] = 26 + 133 - 39 + 66 ^ 6 + 138 - 21 + 67;
        QuesterInfoBox.var2[5] = 0xFFFF879F & 0x7979;
        QuesterInfoBox.var2[6] = -(0xFFFFFEFD & 0x136B) & (0xFFFFB36E & 0x5FFB);
        QuesterInfoBox.var2[7] = 0 + 18 - -20 + 118 ^ 15 + 46 - -13 + 79;
        QuesterInfoBox.var2[8] = 0x7E ^ 0x15 ^ (0x46 ^ 0x25);
    }

    private static void var4() {
        var1 = new String[var2[7]];
        QuesterInfoBox.var1[QuesterInfoBox.var2[0]] = "Squire Quester";
        QuesterInfoBox.var1[QuesterInfoBox.var2[1]] = "Version";
        QuesterInfoBox.var1[QuesterInfoBox.var2[2]] = "0.1.3";
        QuesterInfoBox.var1[QuesterInfoBox.var2[3]] = "Task: ";
        QuesterInfoBox.var1[QuesterInfoBox.var2[4]] = "Current Step: ";
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[1]]).right(var1[var2[2]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(this.ag.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(String.valueOf(Vars.getVarp((int)var2[5]))).build());
        0;
        int n2 = var2[6];
        this.panelComponent.setPreferredSize(new Dimension(n2, var2[0]));
        return super.render(graphics2D);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        QuesterInfoBox.var3();
        QuesterInfoBox.var4();
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (QuesterInfoBox.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    @Inject
    public QuesterInfoBox(SquireTutorialIsland squireTutorialIsland) {
        this.ag = squireTutorialIsland.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }
}

