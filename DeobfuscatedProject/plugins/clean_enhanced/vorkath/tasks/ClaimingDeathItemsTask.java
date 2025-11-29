/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Claiming death items", priority=125, register=true, blocking=true)
public class ClaimingDeathItemsTask
extends Task {
    private final  SquireVorkathPlugin x;
    
    private static final  int u;
    private final  SquireVorkathConfig y;
    private static final  int w;
    private static final  int t;
    
    private static final  int v;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2) {
        return n2 > 0;
    }

    @Inject
    public ClaimingDeathItemsTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig) {
        this.x = squireVorkathPlugin;
        this.y = squireVorkathConfig;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (b.var12(chatMessage.getMessage().contains(var2[var1[14]]) ? 1 : 0)) {
            this.x.ClaimingDeathItemsTask(var1[1]);
        }
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (b.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if ((0x11 ^ 0xF ^ (0x5D ^ 0x46)) > 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private void h() {
        int n2;
        if (b.var10(RunePouch.hasPouch() ? 1 : 0)) {
            return;
        }
        if (b.var10(Inventory.contains(item -> item.getName().toLowerCase().endsWith(var2[var1[17]])) ? 1 : 0)) {
            return;
        }
        Item var25 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[16]]));
        String[] stringArray = new String[var1[1]];
        stringArray[b.var1[0]] = var2[var1[13]];
        if (b.var12(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            n2 = var1[5];
            0;
            if (((47 + 131 - 89 + 54 ^ 155 + 91 - 157 + 78) & (0x68 ^ 0x4E ^ (0x8E ^ 0x80) ^ -1)) != 0) {
                return;
            }
        } else {
            n2 = var1[4];
        }
        int var26 = n2;
        int var27 = var1[0];
        while (b.var22(var27, var26)) {
            RunePouch.RuneSlot var28 = RunePouch.RuneSlot.values()[var27];
            if (b.var11(var28.getQuantity())) {
                0;
                if null != null {
                    return;
                }
            } else {
                Item var29 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(var2[var1[15]]));
                if (b.var24(var29)) {
                    return;
                }
                var29.useOn(var25);
                return;
            }
            ++var27;
            0;
            if (-1 != 2) continue;
            return;
        }
    }

    private static void var30() {
        var1 = new int[22];
        b.var1[0] = (0x4C ^ 0x7B ^ 2) & (0xCC ^ 0x99 ^ (0x44 ^ 0x24) ^ -1);
        b.var1[1] = 1;
        b.var1[2] = 2;
        b.var1[3] = -(0xFFFFEBE6 & 0x7D9F) & (0xFFFFEFDF & 0x7BFF);
        b.var1[4] = 3;
        b.var1[5] = 0x3C ^ 0x38;
        b.var1[6] = 0xBF ^ 0xBA;
        b.var1[7] = 0x1C ^ 0x41 ^ (0x22 ^ 0x79);
        b.var1[8] = 0x3A ^ 0x3D;
        b.var1[9] = 0x61 ^ 0x69;
        b.var1[10] = 0x68 ^ 0x61;
        b.var1[11] = 0x4C ^ 0x46;
        b.var1[12] = 90 + 156 - 144 + 89 ^ 131 + 18 - 56 + 87;
        b.var1[13] = 0xCD ^ 0xC1;
        b.var1[14] = 0xB5 ^ 0x8C ^ (0x8B ^ 0xBF);
        b.var1[15] = 33 + 102 - 100 + 104 ^ 102 + 55 - 59 + 35;
        b.var1[16] = 0xCD ^ 0xC2;
        b.var1[17] = 0xD ^ 0x1D;
        b.var1[18] = 0xD4 ^ 0x9C ^ (0x35 ^ 0x6C);
        b.var1[19] = 35 + 184 - 125 + 115 ^ 81 + 168 - 89 + 35;
        b.var1[20] = 0xFFFFBBFF & 0xF7FE;
        b.var1[21] = 0xAF ^ 0xBC;
    }

    private static void var31() {
        var2 = new String[var1[21]];
        b.var2[b.var1[0]] = "in window is open, waiting...";
        b.var2[b.var1[1]] = "Equipping gear for space";
        b.var2[b.var1[2]] = "Trying to fill rune pouch for space";
        b.var2[b.var1[4]] = "Opening death torfih";
        b.var2[b.var1[5]] = "Collect";
        b.var2[b.var1[6]] = "Setting died to false";
        b.var2[b.var1[7]] = "Unlock";
        b.var2[b.var1[8]] = "Unlocking death chest";
        b.var2[b.var1[9]] = "Unlock";
        b.var2[b.var1[10]] = "Take-All";
        b.var2[b.var1[11]] = "Taking all items from death chest";
        b.var2[b.var1[12]] = "Take-All";
        b.var2[b.var1[13]] = "Divine rune pouch";
        b.var2[b.var1[14]] = "You have items stored in an item retrieval";
        b.var2[b.var1[15]] = "rune";
        b.var2[b.var1[16]] = "rune pouch";
        b.var2[b.var1[17]] = "rune";
        b.var2[b.var1[18]] = "Collect";
        b.var2[b.var1[19]] = "Torfinn";
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    static {
        b.var30();
        b.var31();
        w = var1[20];
        v = var1[7];
        u = var1[4];
        t = var1[3];
    }

    public boolean run() {
        b var38;
        if (b.var10(this.x.f() ? 1 : 0)) {
            return var1[0];
        }
        if (b.var12(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            return var1[1];
        }
        if (b.var12(Dialog.canContinue() ? 1 : 0)) {
            var38.x.ClaimingDeathItemsTask(var1[0]);
            return var1[0];
        }
        if (b.var12(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)var1[2]);
            0;
            return var1[1];
        }
        if (b.var12(Inventory.isFull() ? 1 : 0)) {
            EquipmentSetup var39 = ((BankLoadout)var38.y.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            int[] var40 = var39.getIds();
            if (b.var12(Inventory.contains((int[])var40) ? 1 : 0)) {
                Log.info((String)var2[var1[1]]);
                Gear.swapTo((int[])var40);
                0;
                0;
                if null != null {
                    return ((2 + 74 - -52 + 13 ^ 74 + 16 - 32 + 92) & (133 + 94 - 151 + 65 ^ 131 + 133 - 174 + 60 ^ -1)) != 0;
                }
            } else {
                Log.info((String)var2[var1[2]]);
                var38.h();
            }
            return var1[1];
        }
        Widget var39 = Widgets.get((int)var1[3], (int)var1[4]);
        if (b.var10(Widgets.isVisible((Widget)var39) ? 1 : 0)) {
            Log.info((String)var2[var1[4]]);
            NPC var40 = NPCs.getNearest(nPC -> {
                int n2;
                String[] stringArray = new String[var1[1]];
                stringArray[b.var1[0]] = var2[var1[18]];
                if (b.var12(nPC.hasAction(stringArray) ? 1 : 0) && b.var12(nPC.getName().equals(var2[var1[19]]) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if ((2 ^ (0x99 ^ 0x9F)) < 0) {
                        return ((210 + 242 - 447 + 246 ^ 146 + 130 - 189 + 94) & (126 + 80 - 175 + 187 ^ 75 + 142 - 88 + 19 ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
            if (b.var24(var40)) {
                return var1[0];
            }
            var40.interact(var2[var1[5]]);
            return var1[1];
        }
        Widget[] var40 = var39.getChildren();
        if (!b.var9(var40) || !b.var12(var40.length) || b.var12(var38.a(var40) ? 1 : 0)) {
            Log.info((String)var2[var1[6]]);
            var38.x.ClaimingDeathItemsTask(var1[0]);
            return var1[1];
        }
        Widget var41 = Widgets.get((int)var1[3], (int)var1[7]);
        if (b.var12(Widgets.isVisible((Widget)var41) ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[b.var1[0]] = var2[var1[7]];
            if (b.var12(var41.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)var2[var1[8]]);
                var41.interact(var2[var1[9]]);
                return var1[1];
            }
        }
        if (b.var12(Widgets.isVisible((Widget)var41) ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[b.var1[0]] = var2[var1[10]];
            if (b.var12(var41.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)var2[var1[11]]);
                var41.interact(var2[var1[12]]);
                return var1[1];
            }
        }
        return var1[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget[] widgetArray) {
        void var42;
        Widget[] widgetArray2 = widgetArray;
        int n2 = widgetArray2.length;
        int var43 = var1[0];
        while (b.var22(var43, (int)var42)) {
            void var44;
            void var45 = var44[var43];
            if (b.var12(Widgets.isVisible((Widget)var45) ? 1 : 0)) {
                return var1[0];
            }
            ++var43;
            0;
            if ((0x13 ^ 0x70 ^ (0x47 ^ 0x20)) >= 0) continue;
            return ((50 + 132 - 166 + 125 ^ 24 + 113 - 16 + 62) & (0x93 ^ 0x95 ^ (0x25 ^ 0x19) ^ -1)) != 0;
        }
        return var1[1];
    }
}

