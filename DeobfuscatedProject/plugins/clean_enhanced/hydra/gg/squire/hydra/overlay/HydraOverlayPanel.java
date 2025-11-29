/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.client.Static
 */
package gg.squire.hydra.overlay;

import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;
import gg.squire.hydra.overlay.HydraManager;
import gg.squire.hydra.overlay.HydraManager;
import gg.squire.hydra.overlay.HydraManager;

public class HydraOverlayPanel
extends OverlayPanel {
    private final  SquireAlchemicalHydraPlugin am;
    private final  e al;

    private final  SquireAlchemicalHydraConfig an;
    private final  a ak;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new String[var2[22]];
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[2]] = "Squire Hydra";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[3]] = "Currently";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[4]] = "Kills";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[5]] = "Global tick count";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[6]] = "Death tick";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[7]] = "Ticks until respawn";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[8]] = "Hydra Phase";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[9]] = "Special (%s)";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[10]] = "Hydra Attack";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[11]] = "Hydra Attack Count";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[12]] = "Hydra Immunity";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[13]] = "Hydra Target";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[14]] = "Nothing";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[15]] = "Us";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[16]] = "Hydra Moving";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[17]] = "Yes";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[18]] = "No";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[19]] = "Stunned";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[20]] = "Yes";
        HydraOverlayPanel.var1[HydraOverlayPanel.var2[21]] = "No";
    }

    @Inject
    public HydraOverlayPanel(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.am = squireAlchemicalHydraPlugin;
        this.an = squireAlchemicalHydraConfig;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.ak = squireAlchemicalHydraPlugin.a();
        this.al = squireAlchemicalHydraPlugin.b();
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var2[2];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var2[2];
        while (HydraOverlayPanel.var12(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (((105 + 175 - 137 + 56 ^ 26 + 27 - -85 + 9) & (0x31 ^ 0x5B ^ (0x54 ^ 0x6A) ^ -1)) == ((0xF4 ^ 0xBF ^ (0x6E ^ 0x10)) & (0x63 ^ 0x22 ^ (0x3D ^ 0x49) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean var29(int n2, int n3) {
        return n2 == n3;
    }

    static {
        HydraOverlayPanel.var30();
        HydraOverlayPanel.var9();
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        String string;
        String string2;
        String string3;
        String string4;
        void var31;
        HydraOverlayPanel var32;
        if (HydraOverlayPanel.var10(this.am.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        int var33 = var2[0];
        var32.panelComponent.setPreferredSize(new Dimension(var2[1], var2[2]));
        var32.panelComponent.getChildren().add(TitleComponent.builder().text(var1[var2[2]]).color(ColorScheme.BRAND_ORANGE).build());
        0;
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(String.valueOf(var32.am.getManager().getCurrentTask())).build());
        0;
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(String.valueOf(var32.ak.o())).build());
        0;
        if (HydraOverlayPanel.var34(var32.ak.g() ? 1 : 0)) {
            return super.render((Graphics2D)var31);
        }
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.valueOf(Static.getClient().getTickCount())).build());
        0;
        h var35 = var32.ak.k();
        if (!HydraOverlayPanel.var36(var35) || HydraOverlayPanel.var11(var35.K())) {
            var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(String.valueOf(var32.ak.n())).build());
            0;
            var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(String.valueOf(var32.ak.e())).build());
            0;
            return super.render((Graphics2D)var31);
        }
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(String.valueOf((Object)var35.S())).build());
        0;
        if (HydraOverlayPanel.var29(var35.O(), Static.getClient().getTickCount())) {
            Object[] objectArray = new Object[var2[3]];
            objectArray[HydraOverlayPanel.var2[2]] = var35.S();
            string4 = String.format(var1[var2[9]], objectArray);
            0;
            if (2 != 2) {
                return null;
            }
        } else {
            string4 = String.format(String.valueOf((Object)var35.L()), new Object[var2[2]]);
        }
        String var37 = string4;
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[10]]).right(var37).build());
        0;
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[11]]).right(String.valueOf(var35.N())).build());
        0;
        var32.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[12]]).right(String.valueOf(var35.Q())).build());
        0;
        Actor var38 = var35.K().getInteracting();
        List list = var32.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(var1[var2[13]]);
        if (HydraOverlayPanel.var11(var38)) {
            string3 = var1[var2[14]];
            0;
            if (3 > 3) {
                return null;
            }
        } else {
            string3 = var1[var2[15]];
        }
        list.add(lineComponentBuilder.right(string3).build());
        0;
        List list2 = var32.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(var1[var2[16]]);
        if (HydraOverlayPanel.var10(var35.K().isMoving() ? 1 : 0)) {
            string2 = var1[var2[17]];
            0;
            if (1 == (0x5B ^ 0x5F)) {
                return null;
            }
        } else {
            string2 = var1[var2[18]];
        }
        list2.add(lineComponentBuilder2.right(string2).build());
        0;
        List list3 = var32.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder3 = LineComponent.builder().left(var1[var2[19]]);
        if (HydraOverlayPanel.var10(var35.B() ? 1 : 0)) {
            string = var1[var2[20]];
            0;
            if ((1 & ~1) == 2) {
                return null;
            }
        } else {
            string = var1[var2[21]];
        }
        list3.add(lineComponentBuilder3.right(string).build());
        0;
        return super.render(graphics2D);
    }

    private static void var30() {
        var2 = new int[23];
        HydraOverlayPanel.var2[0] = 13 + 129 - 116 + 167;
        HydraOverlayPanel.var2[1] = (0x63 ^ 0x75) + (0xD3 ^ 0x90) - (0x6A ^ 0x64) + (108 + 43 - 28 + 15);
        HydraOverlayPanel.var2[2] = (1 ^ 4 ^ (0x50 ^ 0x16)) & (2 ^ 0x19 ^ (0x56 ^ 0xE) ^ -1);
        HydraOverlayPanel.var2[3] = 1;
        HydraOverlayPanel.var2[4] = 2;
        HydraOverlayPanel.var2[5] = 3;
        HydraOverlayPanel.var2[6] = 0x41 ^ 0x45;
        HydraOverlayPanel.var2[7] = 0x6E ^ 0x6B;
        HydraOverlayPanel.var2[8] = 0x37 ^ 0x31;
        HydraOverlayPanel.var2[9] = 103 + 81 - 150 + 127 ^ 68 + 98 - 28 + 28;
        HydraOverlayPanel.var2[10] = 0xAE ^ 0xA6;
        HydraOverlayPanel.var2[11] = 0x33 ^ 0x3A;
        HydraOverlayPanel.var2[12] = 123 + 45 - 62 + 54 ^ 16 + 165 - 45 + 34;
        HydraOverlayPanel.var2[13] = 0x46 ^ 0x4D;
        HydraOverlayPanel.var2[14] = 0xC5 ^ 0xBD ^ (0xFF ^ 0x8B);
        HydraOverlayPanel.var2[15] = 0x27 ^ 0x2A;
        HydraOverlayPanel.var2[16] = 99 + 137 - 86 + 40 ^ 124 + 73 - 68 + 47;
        HydraOverlayPanel.var2[17] = 148 + 125 - 91 + 7 ^ 135 + 89 - 94 + 48;
        HydraOverlayPanel.var2[18] = 0xAF ^ 0xBF;
        HydraOverlayPanel.var2[19] = 0xA1 ^ 0xB0;
        HydraOverlayPanel.var2[20] = 0x95 ^ 0x87;
        HydraOverlayPanel.var2[21] = 0x81 ^ 0xC1 ^ (0xA ^ 0x59);
        HydraOverlayPanel.var2[22] = 0xB2 ^ 0xA6;
    }

    private static boolean var36(Object object) {
        return object != null;
    }

    private static boolean var34(int n2) {
        return n2 == 0;
    }
}

