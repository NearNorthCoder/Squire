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

        return String.valueOf(var1);
    }

    public boolean run() {
        c var2;
        if (c.llIlIIlllIIlII(this.q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlllI[0];
        }
        var2.r = Players.getLocal();
        if (!c.llIlIIlllIIlIl(var2.r) || c.llIlIIlllIIlII(var2.r.getPlane())) {
            return lIlIIIIIlllI[0];
        }
        Item var3 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (c.llIlIIlllIIlIl(var3)) {
            if (c.llIlIIlllIIllI(Inventory.getFreeSlots())) {
                var3.interact(lIlIIIIIlIlI[lIlIIIIIlllI[0]]);
                return lIlIIIIIlllI[1];
            }
            String[] stringArray = new String[lIlIIIIIlllI[1]];
            stringArray[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[1]];
            Item var4 = Inventory.getFirst((String[])stringArray);
            if (c.llIlIIlllIIlIl(var4)) {
                var4.interact(lIlIIIIIlIlI[lIlIIIIIlllI[2]]);
                return lIlIIIIIlllI[1];
            }
            String[] stringArray2 = new String[lIlIIIIIlllI[1]];
            stringArray2[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[3]];
            Item var5 = Inventory.getFirst((String[])stringArray2);
            if (c.llIlIIlllIIlIl(var5)) {
                var5.interact(lIlIIIIIlIlI[lIlIIIIIlllI[4]]);
            }
            return lIlIIIIIlllI[1];
        }
        if (c.llIlIIlllIIlII(var2.p.g().matchesInventory() ? 1 : 0)) {
            if (c.llIlIIlllIIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)lIlIIIIIlllI[0]);
            }
            if (c.llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lIlIIIIIlllI[1];
            }
            if (c.llIlIIlllIIlll(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIlIIIIIlllI[1];
            }
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n;
                String[] stringArray = new String[lIlIIIIIlllI[1]];
                stringArray[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[8]];
                if (c.llIlIIlllIIlII(tileObject.hasAction(stringArray) ? 1 : 0) && c.llIlIIlllIIlII(tileObject.getName().contains(lIlIIIIIlIlI[lIlIIIIIlllI[9]]) ? 1 : 0)) {
                    n = lIlIIIIIlllI[1];

                    if (((84 + 30 - 52 + 75 ^ 18 + 127 - -15 + 3) & (0x79 ^ 1 ^ (0xE5 ^ 0xB7) ^ -1)) < 0) {
                        return ((89 + 17 - 61 + 130 ^ 60 + 185 - 60 + 6) & (0x66 ^ 0xF ^ (5 ^ 0x7C) ^ -1)) != 0;
                    }
                } else {
                    n = lIlIIIIIlllI[0];
                }
                return n != 0;
            });
            if (c.llIlIIlllIIlIl(var4)) {
                if (c.llIlIIlllIlIII(var2.q.getWeight(), lIlIIIIIlllI[5])) {
                    var4.interact(lIlIIIIIlIlI[lIlIIIIIlllI[6]]);
                    return lIlIIIIIlllI[1];
                }
                Log.error((String)lIlIIIIIlIlI[lIlIIIIIlllI[7]]);
                var2.p.forceStop();
                return lIlIIIIIlllI[1];
            }
            return lIlIIIIIlllI[1];
        }
        if (c.llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
            if (c.llIlIIlllIIlll(var2.p.g().matchesInventory() ? 1 : 0)) {
                var2.p.g().withdraw();

                var2.sleep(lIlIIIIIlllI[6]);
            }
            return lIlIIIIIlllI[1];
        }
        Bank.open();

        this.sleep(lIlIIIIIlllI[3]);
        return lIlIIIIIlllI[1];
    }

    private static boolean llIlIIlllIIlIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIlllIlIII(int n, int n2) {
        return n < n2;
    }

    @Inject
    public BankingTask(SquireDriftNet squireDriftNet, Client client) {
        this.p = squireDriftNet;
        this.q = client;
    }

    private static boolean llIlIIlllIIlll(int n) {
        return n == 0;
    }

    private static boolean llIlIIlllIIllI(int n) {
        return n > 0;
    }

    private static void llIlIIllIlllII() {
        lIlIIIIIlIlI = new String[lIlIIIIIlllI[10]];
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[0]] = "Remove";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[1]] = "Vial";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[2]] = "Drop";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[3]] = "Drift net";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[4]] = "Drop";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[6]] = "Dive";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[7]] = "You are too heavy! Total weight has to be under 28kg";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[8]] = "Travel";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[9]] = "Rowboat";
    }

    private static boolean llIlIIlllIIlII(int n) {
        return n != 0;
    }

    static {
        c.llIlIIlllIIIll();
        c.llIlIIllIlllII();
    }
}

