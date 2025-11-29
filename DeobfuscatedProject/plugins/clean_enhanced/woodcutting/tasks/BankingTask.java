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
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
import gg.squire.woodcutting.tasks.GameEnum2;

@TaskDesc(name="Banking", priority=100)
public class BankingTask
extends Task {
    private final  SquireWoodcutterPlugin s;

    private final  SquireWoodcutterConfig t;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public BankingTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.s = squireWoodcutterPlugin;
        this.t = squireWoodcutterConfig;
    }

    public boolean run() {
        b var9;
        if (!(this.t.bank( != 0) ? 1 : 0) || (this.t.cutLogs( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var9.s.p( == 0) ? 1 : 0)) {
            if ((Bank.isOpen( != 0) ? 1 : 0)) {
                Bank.close();
                return 1;
            }
            return 0;
        }
        if ((Inventory.isEmpty( != 0) ? 1 : 0)) {
            var9.s.a(0);
            return 1;
        }
        if ((Bank.isOpen( == 0) ? 1 : 0)) {
            BankLocation var10;
            BankLocation bankLocation;
            if ((Bank.open( != 0) ? 1 : 0)) {
                return 1;
            }
            if ((var9.t.fastTickChop( != 0) ? 1 : 0)) {
                bankLocation = BankLocation.FOSSIL_ISLAND_CAMP;
                0;
                if (-1 > ((68 + 78 - 77 + 137 ^ 0 + 6 - -145 + 22) & (51 + 57 - 95 + 150 ^ 10 + 24 - -113 + 45 ^ -1))) {
                    return ((0x55 ^ 0x38 ^ (0xB1 ^ 0x8B)) & (0x8E ^ 0x9D ^ (0xEE ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                bankLocation = var10 = BankLocation.getNearest();
            }
            if (((Object)var9.t.tree() == (Object)var9.t.tree()2)a.REDWOOD) && (Static.getClient( != 0).getPlane())) {
                TileObject var11 = TileObjects.getNearest(tileObject -> {
                    String[] stringArray = new String[1];
                    stringArray[0] = var1[var2[13]];
                    return tileObject.hasAction(stringArray);
                });
                if var11 != null {
                    var11.interact(var1[0]);
                    return 1;
                }
                Log.info((String)var1[1]);
                return 0;
            }
            Movement.walkTo((WorldPoint)var10.getArea().getCenter());
            0;
            return 1;
        }
        if ((Inventory.contains(item -> item.getName( != 0).contains(var1[var2[12]])) ? 1 : 0) && (Inventory.isFull( == 0) ? 1 : 0)) {
            Log.info((String)var1[2]);
            String var10 = Inventory.getFirst(item -> item.getName().contains(var1[var2[11]])).getName();
            if ((var10.contains(var1[3] != 0) ? 1 : 0)) {
                int[] nArray = new int[1];
                nArray[0] = 4;
                if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[1];
                    nArray2[0] = 4;
                    if ((Bank.contains((int[] == 0)nArray2) ? 1 : 0)) {
                        Log.info((String)var1[5]);
                        var9.s.forceStop();
                        return 1;
                    }
                    Bank.withdraw((int)4, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return 1;
                }
            }
            if ((var10.contains(var1[6] != 0) ? 1 : 0)) {
                int[] nArray = new int[1];
                nArray[0] = 7;
                if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[1];
                    nArray3[0] = 7;
                    if ((Bank.contains((int[] == 0)nArray3) ? 1 : 0)) {
                        Log.info((String)var1[8]);
                        var9.s.forceStop();
                        return 1;
                    }
                    Bank.withdraw((int)7, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return 1;
                }
            }
        }
        Log.info((String)var1[9]);
        Bank.depositAllExcept(item -> {
            boolean bl;
            if (!(item.getName( == 0).toLowerCase().contains(var1[var2[10]]) ? 1 : 0) || (IntStream.of(this.s.i( != 0)).anyMatch(n -> {
                boolean bl;
                if ((item.getId() == item.getId()2)) {
                    bl = 1;
                    0;
                    if ((0x60 ^ 0x64) == 0) {
                        return ((0x18 ^ 0x59) & ~(0xD2 ^ 0x93)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            }) ? 1 : 0)) {
                bl = 1;
                0;
                if (((0x8A ^ 0x9E) & ~(0x5B ^ 0x4F)) > 0) {
                    return ((0xAC ^ 0xB0) & ~(0x4D ^ 0x51)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        return 1;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 0;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 0;
        while (var26 < llllllllllllllIllIIllIIlIllIIlll2) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

