/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNet;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Banking", priority=35, blocking=true)
public class BankingTask
extends Task {

    private  Player r;
    private final  Client q;
    private final  SquireDriftNet p;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < lllllllllllllllIlllIIlllllIllllI2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public boolean run() {
        c var19;
        if ((this.q.isInInstancedRegion( != 0) ? 1 : 0)) {
            return 0;
        }
        var19.r = Players.getLocal();
        if (!(var19.r != null) || (var19.r.getPlane( != 0))) {
            return 0;
        }
        Item var20 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if var20 != null {
            if ((Inventory.getFreeSlots( > 0))) {
                var20.interact(var2[0]);
                return 1;
            }
            String[] stringArray = new String[1];
            stringArray[0] = var2[1];
            Item var21 = Inventory.getFirst((String[])stringArray);
            if var21 != null {
                var21.interact(var2[2]);
                return 1;
            }
            String[] stringArray2 = new String[1];
            stringArray2[0] = var2[3];
            Item var22 = Inventory.getFirst((String[])stringArray2);
            if var22 != null {
                var22.interact(var2[4]);
            }
            return 1;
        }
        if ((var19.p.g( != 0).matchesInventory() ? 1 : 0)) {
            if ((Dialog.isEnterInputOpen( != 0) ? 1 : 0)) {
                Dialog.enterAmount((int)0);
            }
            if ((Bank.isOpen( != 0) ? 1 : 0)) {
                Bank.close();
                return 1;
            }
            if ((Movement.isRunEnabled( == 0) ? 1 : 0)) {
                Movement.toggleRun();
                return 1;
            }
            TileObject var21 = TileObjects.getNearest(tileObject -> {
                int n;
                String[] stringArray = new String[1];
                stringArray[0] = var2[8];
                if ((tileObject.hasActionstringArray) && (tileObject.getName( != 0).contains(var2[9]) ? 1 : 0)) {
                    n = 1;
                    0;
                    if (((84 + 30 - 52 + 75 ^ 18 + 127 - -15 + 3) & (0x79 ^ 1 ^ (0xE5 ^ 0xB7) ^ -1)) < 0) {
                        return ((89 + 17 - 61 + 130 ^ 60 + 185 - 60 + 6) & (0x66 ^ 0xF ^ (5 ^ 0x7C) ^ -1)) != 0;
                    }
                } else {
                    n = 0;
                }
                return n != 0;
            });
            if var21 != null {
                if ((var19.q.getWeight() < var19.q.getWeight()2)) {
                    var21.interact(var2[6]);
                    return 1;
                }
                Log.error((String)var2[7]);
                var19.p.forceStop();
                return 1;
            }
            return 1;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            if ((var19.p.g( == 0).matchesInventory() ? 1 : 0)) {
                var19.p.g().withdraw();
                0;
                var19.sleep(6);
            }
            return 1;
        }
        Bank.open();
        0;
        this.sleep(3);
        return 1;
    }

    @Inject
    public BankingTask(SquireDriftNet squireDriftNet, Client client) {
        this.p = squireDriftNet;
        this.q = client;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

}

