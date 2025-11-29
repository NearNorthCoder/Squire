/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Retrieving teleport for death walking.", priority=0x7FFFFFFF, blocking=true)
public class RetrievingTeleportForDeathWalkingTask
extends NightmareTaskBase {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Inject
    protected RetrievingTeleportForDeathWalkingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean bY() {
        BankLocation var4;
        X var5;
        if (X.var6(this.cV.enableBanking() ? 1 : 0)) {
            return var1[0];
        }
        if (X.var6(var5.cW.ad() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[X.var1[0]] = var1[2];
        nArray[X.var1[3]] = var1[4];
        if (X.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[0];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var2[var1[6]]));
        if (X.var8(var7)) {
            return var1[0];
        }
        if (X.var3(Bank.isOpen() ? 1 : 0)) {
            var4 = item -> {
                int n2;
                if (X.var3(item.getName().toLowerCase().contains(var2[var1[1]]) ? 1 : 0) && X.var6(item.isPlaceholder() ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if ((0x47 ^ 0x40 ^ 3) == 1) {
                        return ((0x59 ^ 0x35 ^ (0x4C ^ 0x11)) & (21 + 166 - 70 + 57 ^ 150 + 12 - 133 + 130 ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            };
            if (X.var3(var5.cb() ? 1 : 0) && X.var3(Bank.contains((Predicate)var4) ? 1 : 0)) {
                return var5.a((Predicate<Item>)var4);
            }
            if (X.var3(j.aU() ? 1 : 0)) {
                int[] nArray2 = new int[var1[3]];
                nArray2[X.var1[0]] = var1[4];
                Item var9 = Bank.getFirst((int[])nArray2);
                if (X.var10(var9)) {
                    int[] nArray3 = new int[var1[3]];
                    nArray3[X.var1[0]] = var1[2];
                    var9 = Bank.getFirst((int[])nArray3);
                }
                if (X.var8(var9)) {
                    Bank.withdraw((int)var9.getId(), (int)var1[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var5.sleep(var1[1]);
                    return var1[3];
                }
                0;
                if (((0 ^ 0x33) & ~(0x9D ^ 0xAE)) != 0) {
                    return ((0xB0 ^ 0x89) & ~(0x92 ^ 0xAB)) != 0;
                }
            } else {
                int[] nArray4 = new int[var1[3]];
                nArray4[X.var1[0]] = var1[2];
                Item var9 = Bank.getFirst((int[])nArray4);
                if (X.var10(var9)) {
                    int[] nArray5 = new int[var1[3]];
                    nArray5[X.var1[0]] = var1[4];
                    var9 = Bank.getFirst((int[])nArray5);
                }
                if (X.var8(var9)) {
                    Bank.withdraw((int)var9.getId(), (int)var1[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var5.sleep(var1[1]);
                    return var1[3];
                }
            }
        }
        if (X.var6(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        var4 = BankLocation.getNearest();
        if (X.var11(var4.getArea().distanceTo(Players.getLocal().getWorldLocation()), var1[5])) {
            Movement.walkTo((WorldArea)var4.getArea());
            0;
            return var1[3];
        }
        return Bank.open();
    }

    private static void var12() {
        var2 = new String[var1[5]];
        X.var2[X.var1[0]] = "Drink";
        X.var2[X.var1[3]] = "Eat";
        X.var2[X.var1[1]] = "stamina potion";
        X.var2[X.var1[6]] = "Pool of Nightmares";
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (X.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((0x53 ^ 0x43) & ~(0x76 ^ 0x66)) >= ((0x99 ^ 0xBF) & ~(0x4A ^ 0x6C))) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    static {
        X.var24();
        X.var12();
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    protected boolean a(Predicate<Item> predicate) {
        if (X.var8(Bank.Inventory.getFirst(predicate))) {
            String[] stringArray = new String[var1[1]];
            stringArray[X.var1[0]] = var2[var1[0]];
            stringArray[X.var1[3]] = var2[var1[3]];
            Bank.Inventory.getFirst(predicate).interact(stringArray);
            return var1[3];
        }
        if (X.var22(Inventory.getFreeSlots(), var1[3])) {
            Bank.depositInventory();
            return var1[3];
        }
        Bank.withdraw(predicate, (int)var1[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var1[3];
    }

    private static void var24() {
        var1 = new int[8];
        X.var1[0] = (0xA5 ^ 0x83) & ~(0x5B ^ 0x7D);
        X.var1[1] = 2;
        X.var1[2] = 0xFFFF999B & 0x76FF;
        X.var1[3] = 1;
        X.var1[4] = 0xFFFFF7B8 & 0x5FC7;
        X.var1[5] = 107 + 131 - 139 + 82 ^ 35 + 22 - 39 + 159;
        X.var1[6] = 3;
        X.var1[7] = 146 + 148 - 206 + 119 ^ 57 + 132 - 140 + 150;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }
}

