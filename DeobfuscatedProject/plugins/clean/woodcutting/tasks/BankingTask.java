/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
import gg.squire.woodcutting.tasks.GameEnum6;

@TaskDesc(name="Banking", priority=100)
public class BankingTask
extends Task {
    private final  SquireWoodcutterPlugin s;

    private final  SquireWoodcutterConfig t;

    private static boolean llIIIlIIIlIllll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlIIIlIllII(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIIlIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIlIIIlIlIll(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIIlIlllI(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIIllIIII(int n, int n2) {
        return n < n2;
    }

    static {
        b.llIIIlIIIlIlIlI();
        b.llIIIlIIIlIlIII();
    }

    @Inject
    public BankingTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.s = squireWoodcutterPlugin;
        this.t = squireWoodcutterConfig;
    }

    public boolean run() {
        b var1;
        if (!b.llIIIlIIIlIlIll(this.t.bank() ? 1 : 0) || b.llIIIlIIIlIlIll(this.t.cutLogs() ? 1 : 0)) {
            return lIllIIIIlIlIl[0];
        }
        if (b.llIIIlIIIlIllII(var1.s.p() ? 1 : 0)) {
            if (b.llIIIlIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lIllIIIIlIlIl[1];
            }
            return lIllIIIIlIlIl[0];
        }
        if (b.llIIIlIIIlIlIll(Inventory.isEmpty() ? 1 : 0)) {
            var1.s.a(lIllIIIIlIlIl[0]);
            return lIllIIIIlIlIl[1];
        }
        if (b.llIIIlIIIlIllII(Bank.isOpen() ? 1 : 0)) {
            BankLocation var2;
            BankLocation bankLocation;
            if (b.llIIIlIIIlIlIll(Bank.open() ? 1 : 0)) {
                return lIllIIIIlIlIl[1];
            }
            if (b.llIIIlIIIlIlIll(var1.t.fastTickChop() ? 1 : 0)) {
                bankLocation = BankLocation.FOSSIL_ISLAND_CAMP;

                if (-1 > ((68 + 78 - 77 + 137 ^ 0 + 6 - -145 + 22) & (51 + 57 - 95 + 150 ^ 10 + 24 - -113 + 45 ^ -1))) {
                    return ((0x55 ^ 0x38 ^ (0xB1 ^ 0x8B)) & (0x8E ^ 0x9D ^ (0xEE ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                bankLocation = var2 = BankLocation.getNearest();
            }
            if (b.llIIIlIIIlIllIl((Object)var1.t.tree(), (Object)a.REDWOOD) && b.llIIIlIIIlIlIll(Static.getClient().getPlane())) {
                TileObject var3 = TileObjects.getNearest(tileObject -> {
                    String[] stringArray = new String[lIllIIIIlIlIl[1]];
                    stringArray[b.lIllIIIIlIlIl[0]] = lIllIIIIlIIll[lIllIIIIlIlIl[13]];
                    return tileObject.hasAction(stringArray);
                });
                if (b.llIIIlIIIlIlllI(var3)) {
                    var3.interact(lIllIIIIlIIll[lIllIIIIlIlIl[0]]);
                    return lIllIIIIlIlIl[1];
                }
                Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[1]]);
                return lIllIIIIlIlIl[0];
            }
            Movement.walkTo((WorldPoint)var2.getArea().getCenter());

            return lIllIIIIlIlIl[1];
        }
        if (b.llIIIlIIIlIlIll(Inventory.contains(item -> item.getName().contains(lIllIIIIlIIll[lIllIIIIlIlIl[12]])) ? 1 : 0) && b.llIIIlIIIlIllII(Inventory.isFull() ? 1 : 0)) {
            Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[2]]);
            String var2 = Inventory.getFirst(item -> item.getName().contains(lIllIIIIlIIll[lIllIIIIlIlIl[11]])).getName();
            if (b.llIIIlIIIlIlIll(var2.contains(lIllIIIIlIIll[lIllIIIIlIlIl[3]]) ? 1 : 0)) {
                int[] nArray = new int[lIllIIIIlIlIl[1]];
                nArray[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[4];
                if (b.llIIIlIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIIIIlIlIl[1]];
                    nArray2[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[4];
                    if (b.llIIIlIIIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[5]]);
                        var1.s.forceStop();
                        return lIllIIIIlIlIl[1];
                    }
                    Bank.withdraw((int)lIllIIIIlIlIl[4], (int)lIllIIIIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return lIllIIIIlIlIl[1];
                }
            }
            if (b.llIIIlIIIlIlIll(var2.contains(lIllIIIIlIIll[lIllIIIIlIlIl[6]]) ? 1 : 0)) {
                int[] nArray = new int[lIllIIIIlIlIl[1]];
                nArray[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[7];
                if (b.llIIIlIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllIIIIlIlIl[1]];
                    nArray3[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[7];
                    if (b.llIIIlIIIlIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[8]]);
                        var1.s.forceStop();
                        return lIllIIIIlIlIl[1];
                    }
                    Bank.withdraw((int)lIllIIIIlIlIl[7], (int)lIllIIIIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return lIllIIIIlIlIl[1];
                }
            }
        }
        Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[9]]);
        Bank.depositAllExcept(item -> {
            boolean bl;
            if (!b.llIIIlIIIlIllII(item.getName().toLowerCase().contains(lIllIIIIlIIll[lIllIIIIlIlIl[10]]) ? 1 : 0) || b.llIIIlIIIlIlIll(IntStream.of(this.s.i()).anyMatch(n -> {
                boolean bl;
                if (b.llIIIlIIIlIllll(item.getId(), n)) {
                    bl = lIllIIIIlIlIl[1];

                    if ((0x60 ^ 0x64) == 0) {
                        return false;
                    }
                } else {
                    bl = lIllIIIIlIlIl[0];
                }
                return bl;
            }) ? 1 : 0)) {
                bl = lIllIIIIlIlIl[1];

                if (((0x8A ^ 0x9E) & ~(0x5B ^ 0x4F)) > 0) {
                    return false;
                }
            } else {
                bl = lIllIIIIlIlIl[0];
            }
            return bl;
        });
        return lIllIIIIlIlIl[1];
    }

    private static void llIIIlIIIlIlIII() {
        lIllIIIIlIIll = new String[lIllIIIIlIlIl[14]];
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[0]] = "Climb-down";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[1]] = "Cannot find the ladder to go down to the bank";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[2]] = "We failed a 3t cycle, trying to withdraw a new log.";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[3]] = "Mahogany";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[5]] = "We are out of mahogany logs, stopping the script.";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[6]] = "Teak";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[8]] = "We are out of teak logs, stopping the script.";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[9]] = "Depositing all items except for the exceptions";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[10]] = "axe";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[11]] = "stock";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[12]] = "stock";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[13]] = "Climb-down";
    }

        return String.valueOf(var4);
    }

}

