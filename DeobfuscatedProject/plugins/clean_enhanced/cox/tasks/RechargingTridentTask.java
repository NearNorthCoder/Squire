/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Recharging trident", priority=19010, blocking=true, register=true)
public class RechargingTridentTask
extends CoxTaskBase {

    public int h(boolean bl2) {
        int n2;
        if (bl2 != 0) {
            n2 = 4;
            0;
            if (-1 > 1) {
                return (0xD ^ 0x5F ^ (0x67 ^ 0x6F)) & (100 + 108 - 53 + 66 ^ 86 + 35 - 50 + 64 ^ -1);
            }
        } else {
            n2 = 5;
        }
        int var3 = n2;
        int[] nArray = new int[1];
        nArray[0] = var3;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return var3;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = 8;
        if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
            return 8;
        }
        int[] nArray3 = new int[1];
        nArray3[0] = var1[10];
        if ((Inventory.contains((int[] == 0)nArray3) ? 1 : 0)) {
            return var1[10];
        }
        int[] nArray4 = new int[1];
        nArray4[0] = var1[12];
        if ((Inventory.contains((int[] == 0)nArray4) ? 1 : 0)) {
            return var1[12];
        }
        return 6;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if ((this.u.isInInstancedRegion( != 0) ? 1 : 0)) {
            cw = 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        void var5_7;
        int var26;
        int n2;
        Z var27;
        int n3;
        if ((this.cr( == 0) ? 1 : 0)) {
            return 0;
        }
        if (cw != 0) {
            return 0;
        }
        if ((Dialog.canContinue( != 0) ? 1 : 0)) {
            cw = 1;
        }
        if ((Dialog.isEnterInputOpen( != 0) ? 1 : 0)) {
            Dialog.enterAmount((int)2);
            return 1;
        }
        Item var28 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[13]]));
        if var28 == null {
            Item var29 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(var2[7]));
            if var29 == null {
                cw = 1;
                return 0;
            }
            var29.interact(var2[0]);
            return 1;
        }
        if ((var28.getName( == 0).toLowerCase().contains(var2[1]) ? 1 : 0) && (var28.getName( == 0).toLowerCase().contains(var2[3]) ? 1 : 0)) {
            n3 = 1;
            0;
            if (((0x7E ^ 0x31 ^ (0x78 ^ 0x56)) & (0xEE ^ 0x98 ^ (0x95 ^ 0x82) ^ -1)) > 0) {
                return ((0x70 ^ 0x3D ^ 2) & (32 + 86 - -83 + 16 ^ 9 + 80 - -3 + 58 ^ -1)) != 0;
            }
        } else {
            n3 = 0;
        }
        int var29 = n3;
        int var30 = var27.hlllllllllllllllIllIIlIlIlIllllIl;
        if var29 {
            n2 = 4;
            0;
            
        } else {
            n2 = var26 = 5;
        }
        if (var30 != 6) {
            if ((Bank.isEmpty( == 0) ? 1 : 0)) {
                int[] nArray = new int[1];
                nArray[0] = var30;
                if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                    cw = 1;
                }
            }
            if ((Bank.isOpen( != 0) ? 1 : 0)) {
                if ((Inventory.getFreeSlots() < 7)) {
                    int[] nArray = new int[7];
                    nArray[0] = var28.getId();
                    nArray[1] = var26;
                    nArray[3] = 8;
                    nArray[9] = var1[10];
                    nArray[Z.var1[11]] = var1[12];
                    Bank.depositAllExcept((int[])nArray);
                    return 1;
                }
                Bank.withdrawAll((int)var30, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return 1;
            }
            int[] nArray = new int[1];
            nArray[0] = var30;
            if (!(Bank.contains((int[] == 0)nArray) ? 1 : 0) || (Bank.isEmpty( != 0) ? 1 : 0)) {
                TileObject var31 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if ((tileObject.getName( != 0).equals(var2[9]) ? 1 : 0)) {
                        String[] stringArray = new String[1];
                        stringArray[0] = var2[var1[11]];
                        if ((tileObject.hasActionstringArray)) {
                            n2 = 1;
                            0;
                            if (((0x4F ^ 0x11) & ~(8 ^ 0x56)) == 0) return n2 != 0;
                            return ((0x95 ^ 0x8E) & ~(0x25 ^ 0x3E)) != 0;
                        }
                    }
                    n2 = 0;
                    return n2 != 0;
                });
                if (var31 != null && (Players.getLocal().distanceTo((Locatable)var31) > var1[13])) {
                    Movement.setDestination((WorldPoint)var31.getWorldLocation());
                    return 1;
                }
                Bank.open();
                0;
                return 1;
            }
        }
        int[] nArray = new int[1];
        nArray[0] = var26;
        Item var31 = Inventory.getFirst((int[])nArray);
        if var31 == null {
            return 0;
        }
        var5_7.useOn((Item)var1_1);
        return 1;
    }

}

