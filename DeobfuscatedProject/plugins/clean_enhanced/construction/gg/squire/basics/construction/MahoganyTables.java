/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.basics.construction;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@SquireUtil
@PluginDescriptor(name="Squire Mahogany Tables", enabledByDefault=false)
public class MahoganyTables
extends SquirePlugin {
    private static  String[] llIlIlIl;
    private static  int[] llIlIllI;

    protected Class<?>[] tasks() {
        return new Class[llIlIllI[1]];
    }

    private static void var1() {
        llIlIllI = new int[14];
        MahoganyTables.llIlIllI[0] = 1;
        MahoganyTables.llIlIllI[1] = (0x59 ^ 0x1A) & ~(0xF0 ^ 0xB3);
        MahoganyTables.llIlIllI[2] = 106 + 108 - 32 + 47;
        MahoganyTables.llIlIllI[3] = 0xFFFFB7DF & 0x6A6E;
        MahoganyTables.llIlIllI[4] = 138 + 43 - 27 + 28 ^ 82 + 128 - 75 + 43;
        MahoganyTables.llIlIllI[5] = 2;
        MahoganyTables.llIlIllI[6] = 3;
        MahoganyTables.llIlIllI[7] = 0xD6 ^ 0xBD ^ (0xCD ^ 0xB4);
        MahoganyTables.llIlIllI[8] = -(0xFFFFDD9D & 0x7A73) & (0xFFFFFDFE & 0x5BDB);
        MahoganyTables.llIlIllI[9] = 0x90 ^ 0x96;
        MahoganyTables.llIlIllI[10] = 0xFFFFFBFE & 0x3FC3;
        MahoganyTables.llIlIllI[11] = -(0xFFFFEAC9 & 0x5D3F) & (0xFFFFFFFA & 0x7BFF);
        MahoganyTables.llIlIllI[12] = 0x13 ^ 0x16;
        MahoganyTables.llIlIllI[13] = 146 + 127 - 162 + 73 ^ 123 + 6 - 32 + 79;
    }

    static {
        MahoganyTables.var1();
        MahoganyTables.var2();
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
        int var14 = llIlIllI[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = llIlIllI[1];
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    protected void onStart() {
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static void var2() {
        llIlIlIl = new String[llIlIllI[12]];
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[1]] = "Talk-to";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[0]] = "Talk-to";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[5]] = "Build";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[6]] = "Yes";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[4]] = "Remove";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Widget var20;
        void var21;
        void var22;
        int[] nArray = new int[llIlIllI[0]];
        nArray[MahoganyTables.llIlIllI[1]] = llIlIllI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[llIlIllI[0]];
        nArray2[MahoganyTables.llIlIllI[1]] = llIlIllI[3];
        int n2 = Inventory.getCount((int[])nArray2);
        if (MahoganyTables.var19(n2)) {
            if (MahoganyTables.var23(nPC)) {
                return;
            }
            if (MahoganyTables.var24(Dialog.canContinue() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[llIlIllI[4]];
                dialogOptionArray[MahoganyTables.llIlIllI[1]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[MahoganyTables.llIlIllI[0]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[MahoganyTables.llIlIllI[5]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[MahoganyTables.llIlIllI[6]] = DialogOption.NPC_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return;
            }
            var22.interact(llIlIlIl[llIlIllI[1]]);
            return;
        }
        if (((int)var21 == llIlIllI[7])) {
            if (MahoganyTables.var24(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)llIlIllI[0]);
                0;
                return;
            }
            if var22 != null {
                var22.interact(llIlIlIl[llIlIllI[0]]);
                return;
            }
        }
        if (MahoganyTables.var24(Widgets.isVisible((Widget)(var20 = Widgets.get((int)llIlIllI[8], (int)llIlIllI[5]))) ? 1 : 0)) {
            Keyboard.type((int)llIlIllI[9]);
            return;
        }
        int[] nArray3 = new int[llIlIllI[0]];
        nArray3[MahoganyTables.llIlIllI[1]] = llIlIllI[10];
        TileObject var25 = TileObjects.getNearest((int[])nArray3);
        if var25 != null {
            var25.interact(llIlIlIl[llIlIllI[5]]);
            Keyboard.type((int)llIlIllI[9]);
            return;
        }
        int[] nArray4 = new int[llIlIllI[0]];
        nArray4[MahoganyTables.llIlIllI[1]] = llIlIllI[11];
        TileObject var26 = TileObjects.getNearest((int[])nArray4);
        if var26 != null {
            if (MahoganyTables.var24(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[llIlIllI[0]];
                stringArray[MahoganyTables.llIlIllI[1]] = llIlIlIl[llIlIllI[6]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return;
            }
            var26.interact(llIlIlIl[llIlIllI[4]]);
            return;
        }
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }

    protected void onStop() {
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }
}

