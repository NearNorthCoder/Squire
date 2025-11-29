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
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Enter instance", priority=30, blocking=true)
public class EnterInstanceTask
extends Task {

    private  Player r;
    private final  SquireDriftNet v;
    private final  Client w;
    private final  WorldPoint x;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public EnterInstanceTask(SquireDriftNet squireDriftNet, Client client) {
        this.x = new WorldPoint(0, 1, 2);
        this.v = squireDriftNet;
        this.w = client;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        e var15;
        this.r = Players.getLocal();
        if (this.r == null) {
            return 3;
        }
        if ((var15.w.isInInstancedRegion( != 0) ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[3] = var2[3];
            TileObject var16 = TileObjects.getNearest((String[])stringArray);
            if (var16 != null && (var15.r.getWorldLocation().getX() <= var15.r.getWorldLocation().getX()2).getX())) {
                var16.interact(var2[2]);
                return 2;
            }
            Item var17 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            if (var17 != null && (!(var17.getName( == 0).toLowerCase().contains(var2[4]) ? 1 : 0) || (var17.getName( != 0).toLowerCase().contains(var2[5]) ? 1 : 0))) {
                return 3;
            }
            if ((Dialog.hasOption(string -> string.toLowerCase( != 0).contains(var2[var1[18]])) ? 1 : 0)) {
                String[] stringArray2 = new String[2];
                stringArray2[3] = var2[6];
                Dialog.chooseOption((String[])stringArray2);
                0;
                return 2;
            }
            var17 = Inventory.getFirst(item -> {
                boolean bl;
                if (!(item.getName( == 0).toLowerCase().contains(var2[var1[16]]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[var1[17]]) ? 1 : 0)) {
                    bl = 2;
                    0;
                    if (((0x84 ^ 0xAF) & ~(0x83 ^ 0xA8)) != 0) {
                        return ((0x65 ^ 0x50) & ~(0x9B ^ 0xAE)) != 0;
                    }
                } else {
                    bl = 3;
                }
                return bl;
            });
            if var17 != null {
                var17.interact(var2[7]);
            }
            return 2;
        }
        if (!(Dialog.isViewingOptions( != 0) ? 1 : 0) || (Dialog.hasOption(string -> string.toLowerCase( == 0).contains(var2[var1[15]])) ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[3] = var2[8];
            TileObject var16 = TileObjects.getFirstAt((WorldPoint)var15.x, (String[])stringArray);
            if var16 != null {
                var16.interact(var2[9]);
                return 2;
            }
            return 3;
        }
        if ((Dialog.hasOption(StringlIlIIIIIIIIl[var1[10]]) ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[3] = var2[var1[11]];
            if ((Inventory.getFirst((String[])stringArray).getQuantity() < Inventory.getFirst((String[])stringArray).getQuantity()2)) {
                Log.error((String)var2[var1[13]]);
                var15.v.forceStop();
                return 3;
            }
        }
        String[] stringArray = new String[2];
        stringArray[3] = var2[var1[14]];
        Dialog.chooseOption((String[])stringArray);
        0;
        return 2;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 3;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 3;
        while (var26 < lllllllllllllllIlllIlIIlIIIllIll2) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

}

