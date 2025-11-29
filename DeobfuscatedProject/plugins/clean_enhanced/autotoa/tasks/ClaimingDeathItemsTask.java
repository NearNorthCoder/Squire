/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Claiming Death Items", priority=100, blocking=true, register=true)
public class ClaimingDeathItemsTask
extends ck {
    
    private static final  int hL;
    private final  z hM;
    
    private  boolean hN;

    private static void var3() {
        var1 = new String[var2[19]];
        cf.var1[cf.var2[0]] = "[ClaimDeathItems] Pin window is open, waiting...";
        cf.var1[cf.var2[1]] = "[ClaimDeathItems] Equipping kephri melee gear for space";
        cf.var1[cf.var2[2]] = "[ClaimDeathItems] Trying to fill rune pouch for space";
        cf.var1[cf.var2[4]] = "[ClaimDeathItems] Opening death chest";
        cf.var1[cf.var2[6]] = "Claim";
        cf.var1[cf.var2[7]] = "[ClaimDeathItems] Setting died to false";
        cf.var1[cf.var2[8]] = "Unlock";
        cf.var1[cf.var2[9]] = "[ClaimDeathItems] Unlocking death chest";
        cf.var1[cf.var2[10]] = "Unlock";
        cf.var1[cf.var2[11]] = "Take-All";
        cf.var1[cf.var2[12]] = "[ClaimDeathItems] Taking all items from death chest";
        cf.var1[cf.var2[13]] = "Take-All";
        cf.var1[cf.var2[14]] = "Divine rune pouch";
        cf.var1[cf.var2[15]] = "You failed to survive the Tombs";
        cf.var1[cf.var2[16]] = "rune";
        cf.var1[cf.var2[17]] = "rune pouch";
        cf.var1[cf.var2[18]] = "rune";
    }

    @Override
    public boolean bl() {
        cf var4;
        if (cf.var5(this.hN)) {
            return var2[0];
        }
        if (cf.var6(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)var1[var2[0]]);
            return var2[1];
        }
        if (cf.var6(Dialog.canContinue() ? 1 : 0)) {
            var4.hN = var2[0];
            return var2[0];
        }
        if (cf.var6(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)var2[2]);
            0;
            return var2[1];
        }
        if (cf.var6(Inventory.isFull() ? 1 : 0)) {
            ConfigStorageBox<EquipmentSetup> var7 = var4.hY.kephriMelee();
            int[] var8 = var4.hM.a(var7);
            if (cf.var6(Inventory.contains((int[])var8) ? 1 : 0)) {
                Log.info((String)var1[var2[1]]);
                var4.hM.c(var8);
                0;
                0;
                if (2 >= (0x17 ^ 0x13)) {
                    return ((0x14 ^ 0x25) & ~(0x38 ^ 9)) != 0;
                }
            } else {
                Log.info((String)var1[var2[2]]);
                var4.cL();
            }
            return var2[1];
        }
        Widget var7 = Widgets.get((int)var2[3], (int)var2[4]);
        if (cf.var5(Widgets.isVisible((Widget)var7) ? 1 : 0)) {
            Log.info((String)var1[var2[4]]);
            int[] nArray = new int[var2[1]];
            nArray[cf.var2[0]] = var2[5];
            TileObject var8 = TileObjects.getNearest((int[])nArray);
            if (cf.var9(var8)) {
                return var2[0];
            }
            var8.interact(var1[var2[6]]);
            return var2[1];
        }
        Widget[] var8 = var7.getChildren();
        if (!cf.var10(var8) || !cf.var6(var8.length) || cf.var6(var4.a(var8) ? 1 : 0)) {
            Log.info((String)var1[var2[7]]);
            var4.hN = var2[0];
            return var2[1];
        }
        Widget var11 = Widgets.get((int)var2[3], (int)var2[8]);
        if (cf.var6(Widgets.isVisible((Widget)var11) ? 1 : 0)) {
            String[] stringArray = new String[var2[1]];
            stringArray[cf.var2[0]] = var1[var2[8]];
            if (cf.var6(var11.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)var1[var2[9]]);
                var11.interact(var1[var2[10]]);
                return var2[1];
            }
        }
        if (cf.var6(Widgets.isVisible((Widget)var11) ? 1 : 0)) {
            String[] stringArray = new String[var2[1]];
            stringArray[cf.var2[0]] = var1[var2[11]];
            if (cf.var6(var11.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)var1[var2[12]]);
                var11.interact(var1[var2[13]]);
                return var2[1];
            }
        }
        return var2[0];
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (cf.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x7D ^ 0x79) != 2) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var35(int n2) {
        return n2 > 0;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static void var36() {
        var2 = new int[20];
        cf.var2[0] = (189 + 13 - 127 + 169 ^ 123 + 158 - 259 + 145) & (53 + 24 - 28 + 193 ^ 108 + 76 - 91 + 68 ^ -1);
        cf.var2[1] = 1;
        cf.var2[2] = 2;
        cf.var2[3] = -(0xFFFFF4E5 & 0x7B3F) & (0xFFFFFA7F & 0x77FE);
        cf.var2[4] = 3;
        cf.var2[5] = 0xFFFFF7FE & 0xBBFF;
        cf.var2[6] = 0x70 ^ 0x74;
        cf.var2[7] = 0x8E ^ 0x8B;
        cf.var2[8] = 0x32 ^ 0x34;
        cf.var2[9] = 0x1F ^ 0x29 ^ (0x4E ^ 0x7F);
        cf.var2[10] = 141 + 106 - 136 + 75 ^ 16 + 72 - -12 + 78;
        cf.var2[11] = 75 + 25 - 99 + 144 ^ 75 + 17 - -23 + 37;
        cf.var2[12] = 0x94 ^ 0x9E;
        cf.var2[13] = 0xB9 ^ 0xB2;
        cf.var2[14] = 0x95 ^ 0x99;
        cf.var2[15] = 0xBA ^ 0xB7;
        cf.var2[16] = 0x3E ^ 0x30;
        cf.var2[17] = 0x84 ^ 0xBC ^ (0x65 ^ 0x52);
        cf.var2[18] = 47 + 109 - 72 + 62 ^ 24 + 64 - 8 + 50;
        cf.var2[19] = 0xBB ^ 0xAA;
    }

    @Inject
    protected ClaimingDeathItemsTask(Client client, TOAConfig tOAConfig, z z2) {
        super(client, tOAConfig);
        this.hM = z2;
    }

    private void cL() {
        int n2;
        if (cf.var5(RunePouch.hasPouch() ? 1 : 0)) {
            return;
        }
        if (cf.var5(Inventory.contains(item -> item.getName().toLowerCase().endsWith(var1[var2[18]])) ? 1 : 0)) {
            return;
        }
        Item var37 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[17]]));
        String[] stringArray = new String[var2[1]];
        stringArray[cf.var2[0]] = var1[var2[14]];
        if (cf.var6(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            n2 = var2[6];
            0;
            if (3 <= 0) {
                return;
            }
        } else {
            n2 = var2[4];
        }
        int var38 = n2;
        int var39 = var2[0];
        while (cf.var21(var39, var38)) {
            RunePouch.RuneSlot var40 = RunePouch.RuneSlot.values()[var39];
            if (cf.var35(var40.getQuantity())) {
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                Item var41 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(var1[var2[16]]));
                if (cf.var9(var41)) {
                    return;
                }
                var41.useOn(var37);
                return;
            }
            ++var39;
            0;
            if (1 > ((210 + 44 - 176 + 172 ^ 100 + 122 - 158 + 115) & (0x91 ^ 0x8D ^ (0x52 ^ 7) ^ -1))) continue;
            return;
        }
    }

    static {
        cf.var36();
        cf.var3();
        hL = var2[5];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (cf.var6(chatMessage.getMessage().contains(var1[var2[15]]) ? 1 : 0)) {
            this.hN = var2[1];
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget[] widgetArray) {
        void var42;
        Widget[] widgetArray2 = widgetArray;
        int n2 = widgetArray2.length;
        int var43 = var2[0];
        while (cf.var21(var43, (int)var42)) {
            void var44;
            void var45 = var44[var43];
            if (cf.var6(Widgets.isVisible((Widget)var45) ? 1 : 0)) {
                return var2[0];
            }
            ++var43;
            0;
            if null == null continue;
            return ((0x8E ^ 0xC0) & ~(0xB ^ 0x45)) != 0;
        }
        return var2[1];
    }
}

