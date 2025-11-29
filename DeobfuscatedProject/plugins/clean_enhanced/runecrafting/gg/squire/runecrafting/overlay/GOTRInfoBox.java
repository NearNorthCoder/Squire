/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import gg.squire.runecrafting.overlay.GameEnum2;
import gg.squire.runecrafting.overlay.GameEnum4;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class GOTRInfoBox
extends OverlayPanel {
    private final  SquireGOTRPlugin aJ;
    
    private final  TaskManager aK;
    private final  SquireGOTRConfig aL;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0x2F ^ 0x3D) & ~(0x43 ^ 0x51)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        GOTRInfoBox var19;
        if ((this.aJ.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        var19.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        var19.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[1]).build());
        0;
        int var20 = 2;
        var19.panelComponent.setPreferredSize(new Dimension(var20 + 3, 1));
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(var2[5]).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(String.valueOf((Object)var19.aJ.Q())).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[7]).right(var19.aK.getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[5];
        objectArray[1] = var19.aJ.p();
        objectArray[4] = var19.aJ.q();
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[8]).right(String.format(var2[9], objectArray)).build());
        0;
        if (((Object)var19.aJ.m() == (Object)var19.aJ.m()2)c.ACTIVE)) {
            String string;
            d var21 = var19.aJ.h();
            List list = var19.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var2[var1[10]]);
            if ((var19.aJ.R( != 0) ? 1 : 0)) {
                string = var2[var1[11]];
                0;
                if (((0x5A ^ 0x55 ^ (0x3E ^ 0x2E)) & (0x71 ^ 0x57 ^ (0xB5 ^ 0x8C) ^ -1)) < 0) {
                    return null;
                }
            } else {
                string = var2[var1[12]];
            }
            list.add(lineComponentBuilder.right(string).build());
            0;
            if ((Object != nulllllllllllllllllIlIIllIlIIllIIlIl)) {
                var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[0]).right(var21.U() + " runes - " + var21.Z()).build());
                0;
            }
            Object[] objectArray2 = new Object[5];
            objectArray2[1] = var19.aJ.H();
            objectArray2[4] = var19.aJ.I();
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[13]]).right(String.format(var2[var1[14]], objectArray2)).build());
            0;
        }
        Object[] objectArray3 = new Object[5];
        objectArray3[1] = this.aJ.F();
        objectArray3[4] = this.aJ.G();
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[15]]).right(String.format(var2[var1[16]], objectArray3)).build());
        0;
        return super.render(graphics2D);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    @Inject
    private GOTRInfoBox(SquireGOTRPlugin squireGOTRPlugin, SquireGOTRConfig squireGOTRConfig) {
        this.aJ = squireGOTRPlugin;
        this.aK = squireGOTRPlugin.getManager();
        this.aL = squireGOTRConfig;
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

}

