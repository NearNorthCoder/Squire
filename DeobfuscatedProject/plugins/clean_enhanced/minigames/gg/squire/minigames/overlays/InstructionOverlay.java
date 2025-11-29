/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.MenuAction
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayMenuEntry
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.minigames.overlays;

import gg.squire.minigames.overlays.MinigamesManager;
import gg.squire.minigames.overlays.MinigamesTaskBase;
import gg.squire.minigames.overlays.MinigamesManager;
import gg.squire.minigames.overlays.MinigamesTaskBase;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import net.runelite.api.MenuAction;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

@Singleton
public class InstructionOverlay
extends OverlayPanel {
    @Inject
    private  o j;
    @Inject
    private  D aG;
    @Inject
    private  SquireBlastFurnaceConfig i;

    private static final  Color bU;
    public static final  String bT;
    private final  SquireBlastFurnace bV;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        InstructionOverlay.var9();
        InstructionOverlay.var10();
        bT = var2[7];
        bU = new Color(8, 8, 8);
    }

    @Inject
    InstructionOverlay(SquireBlastFurnace squireBlastFurnace) {
        super((Plugin)squireBlastFurnace);
        this.bV = squireBlastFurnace;
        this.getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY, var2[0], var2[1]));
        0;
        this.getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, var2[2], var2[3]));
        0;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0xA4 ^ 0x96) & ~(0xA6 ^ 0x94)) == 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        String string;
        void var27;
        String string2;
        h h2 = this.aG.X();
        w w2 = this.aG.Y();
        if h2 != null {
            string2 = h2.g();
            0;
            if (-(0x55 ^ 0x51) > 0) {
                return null;
            }
        } else {
            String var28;
            string2 = var28 = var2[4];
        }
        if var27 != null {
            string = var27.J();
            0;
            if (-1 >= 1) {
                return null;
            }
        } else {
            string = var2[5];
        }
        String string3 = string;
        this.panelComponent.getChildren().add(TitleComponent.builder().text(var2[6]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left((String)var4_4).leftColor(ColorScheme.PROGRESS_COMPLETE_COLOR).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(string3).leftColor(bU).build());
        0;
        return super.render(graphics2D);
    }

}

