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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean llIlIIlIlllIII(Object object) {
        return object == null;
    }

    @Inject
    public EnterInstanceTask(SquireDriftNet squireDriftNet, Client client) {
        this.x = new WorldPoint(lIlIIIIIIlIl[0], lIlIIIIIIlIl[1], lIlIIIIIIlIl[2]);
        this.v = squireDriftNet;
        this.w = client;
    }

    static {
        e.llIlIIlIllIlll();
        e.llIlIIlIllIIll();
    }

    private static boolean llIlIIlIllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIlIlllIlI(Object object) {
        return object != null;
    }

    public boolean run() {
        e var1;
        this.r = Players.getLocal();
        if (e.llIlIIlIlllIII(this.r)) {
            return lIlIIIIIIlIl[3];
        }
        if (e.llIlIIlIlllIIl(var1.w.isInInstancedRegion() ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIIIIlIl[2]];
            stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[3]];
            TileObject var2 = TileObjects.getNearest((String[])stringArray);
            if (e.llIlIIlIlllIlI(var2) && e.llIlIIlIlllIll(var1.r.getWorldLocation().getX(), var2.getWorldLocation().getX())) {
                var2.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[2]]);
                return lIlIIIIIIlIl[2];
            }
            Item var3 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            if (e.llIlIIlIlllIlI(var3) && (!e.llIlIIlIllllII(var3.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[4]]) ? 1 : 0) || e.llIlIIlIlllIIl(var3.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[5]]) ? 1 : 0))) {
                return lIlIIIIIIlIl[3];
            }
            if (e.llIlIIlIlllIIl(Dialog.hasOption(string -> string.toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[18]])) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlIIIIIIlIl[2]];
                stringArray2[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[6]];
                Dialog.chooseOption((String[])stringArray2);

                return lIlIIIIIIlIl[2];
            }
            var3 = Inventory.getFirst(item -> {
                boolean bl;
                if (!e.llIlIIlIllllII(item.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[16]]) ? 1 : 0) || e.llIlIIlIlllIIl(item.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[17]]) ? 1 : 0)) {
                    bl = lIlIIIIIIlIl[2];

                    if (((0x84 ^ 0xAF) & ~(0x83 ^ 0xA8)) != 0) {
                        return false;
                    }
                } else {
                    bl = lIlIIIIIIlIl[3];
                }
                return bl;
            });
            if (e.llIlIIlIlllIlI(var3)) {
                var3.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[7]]);
            }
            return lIlIIIIIIlIl[2];
        }
        if (!e.llIlIIlIlllIIl(Dialog.isViewingOptions() ? 1 : 0) || e.llIlIIlIllllII(Dialog.hasOption(string -> string.toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[15]])) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIIIIlIl[2]];
            stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[8]];
            TileObject var2 = TileObjects.getFirstAt((WorldPoint)var1.x, (String[])stringArray);
            if (e.llIlIIlIlllIlI(var2)) {
                var2.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[9]]);
                return lIlIIIIIIlIl[2];
            }
            return lIlIIIIIIlIl[3];
        }
        if (e.llIlIIlIlllIIl(Dialog.hasOption((String)lIlIIIIIIIIl[lIlIIIIIIlIl[10]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIIIIlIl[2]];
            stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[11]];
            if (e.llIlIIlIllllIl(Inventory.getFirst((String[])stringArray).getQuantity(), lIlIIIIIIlIl[12])) {
                Log.error((String)lIlIIIIIIIIl[lIlIIIIIIlIl[13]]);
                var1.v.forceStop();
                return lIlIIIIIIlIl[3];
            }
        }
        String[] stringArray = new String[lIlIIIIIIlIl[2]];
        stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[14]];
        Dialog.chooseOption((String[])stringArray);

        return lIlIIIIIIlIl[2];
    }

    private static boolean llIlIIlIlllIll(int n, int n2) {
        return n <= n2;
    }

        return String.valueOf(var4);
    }

    private static boolean llIlIIlIlllIIl(int n) {
        return n != 0;
    }

    private static void llIlIIlIllIIll() {
        lIlIIIIIIIIl = new String[lIlIIIIIIlIl[19]];
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[3]] = "Plant door";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[2]] = "Navigate";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[4]] = "trident";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[5]] = "harpoon";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[6]] = "wield";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[7]] = "Wield";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[8]] = "Tunnel";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[9]] = "Enter";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[10]] = "200";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[11]] = "Numulite";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[13]] = "Not enough numulite to pay entry fee";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[14]] = "nter instance";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[15]] = "enter instance";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[16]] = "trident";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[17]] = "harpoon";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[18]] = "wield";
    }

    private static boolean llIlIIlIllllII(int n) {
        return n == 0;
    }
}

