/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.cleaner.tasks;

import com.google.inject.Inject;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    
    private final  SquireAccountCleanerConfig d;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[1];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[1];
        while (a.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void var15() {
        var2 = new String[var1[6]];
        a.var2[a.var1[1]] = "Banker";
        a.var2[a.var1[0]] = "Bank";
        a.var2[a.var1[2]] = ",";
        a.var2[a.var1[4]] = "Members";
    }

    private static boolean var16(int n, int n2) {
        return n != n2;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Inject
    public BankingTask(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.d = squireAccountCleanerConfig;
    }

    private static void var23() {
        var1 = new int[7];
        a.var1[0] = 1;
        a.var1[1] = (0x71 ^ 0x6D) & ~(0x98 ^ 0x84);
        a.var1[2] = 2;
        a.var1[3] = 113 + 62 - 137 + 131 ^ 118 + 58 - 78 + 63;
        a.var1[4] = 3;
        a.var1[5] = -(0xFFFFF99D & 0x6E6F) & (0xFFFFEFEF & 0x7BFF);
        a.var1[6] = 3 ^ (0x5C ^ 0x5B);
    }

    private boolean BankingTask(Item item) {
        if (a.var24(item.getName().contains(var2[var1[4]]) ? 1 : 0)) {
            return var1[1];
        }
        ItemComposition itemComposition = Static.getClient().getItemComposition(item.getId());
        return itemComposition.isTradeable();
    }

    private int b(Item item) {
        ItemComposition itemComposition = Static.getClient().getItemDefinition(item.getId());
        String string = itemComposition.getName().toLowerCase();
        int n = Prices.getItemPrice((int)item.getId()) * item.getQuantity();
        return n;
    }

    public boolean run() {
        Object var25;
        a var26;
        if (a.var24(Inventory.contains(item -> {
            boolean bl;
            if (a.var16(item.getId(), var1[5])) {
                bl = var1[0];
                0;
                if ((0x55 ^ 0x5C ^ (0xCE ^ 0xC2)) <= 0) {
                    return ((0xA8 ^ 0xB7 ^ (0x54 ^ 0x28)) & (0xE2 ^ 0x8A ^ (0x50 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }) ? 1 : 0) && a.var24(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var1[0]];
            stringArray[a.var1[1]] = var2[var1[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (a.var3(nPC) && a.var27(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(var2[var1[0]]);
                return var1[1];
            }
        }
        String var28 = var26.d.ignoreList();
        ArrayList<Integer> var29 = new ArrayList<Integer>();
        if (a.var24(var28.isEmpty() ? 1 : 0)) {
            var25 = var28.split(var2[var1[2]]);
            String[] var30 = var25;
            int var31 = var30.length;
            int var32 = var1[1];
            while (a.var13(var32, var31)) {
                String var33 = var30[var32];
                Integer var34 = Integer.parseInt(var33);
                var29.add(var34);
                0;
                ++var32;
                0;
                if (3 == 3) continue;
                return ((0x2B ^ 0x38) & ~(0x4C ^ 0x5F)) != 0;
            }
        }
        if (a.var27(Bank.isOpen() ? 1 : 0) && a.var24(Inventory.isFull() ? 1 : 0)) {
            var25 = Bank.getAll(item -> {
                int n;
                if (a.var35(this.b((Item)item), this.d.sellValue()) && a.var24(var29.contains(item.getId()) ? 1 : 0) && (!a.var24(item.isTradable() ? 1 : 0) || a.var27(this.BankingTask((Item)item) ? 1 : 0))) {
                    n = var1[0];
                    0;
                    if (2 <= 0) {
                        return ((167 + 117 - 246 + 130 ^ 62 + 76 - 38 + 34) & (63 + 17 - -29 + 31 ^ 147 + 59 - 70 + 26 ^ -1)) != 0;
                    }
                } else {
                    n = var1[1];
                }
                return n != 0;
            });
            int var30 = var1[1];
            Iterator var31 = var25.iterator();
            while (a.var27(var31.hasNext() ? 1 : 0)) {
                Item var32 = (Item)var31.next();
                if (a.var35(var30, var1[3])) {
                    0;
                    if ((0x29 ^ 0x2C) > 0) break;
                    return ((0x8B ^ 0x98) & ~(0x65 ^ 0x76)) != 0;
                }
                ++var30;
                Bank.withdrawAll((int)var32.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                0;
                if (1 == 1) continue;
                return ((117 + 166 - 259 + 167 ^ 144 + 137 - 119 + 17) & (0x66 ^ 0x69 ^ 3 ^ -1)) != 0;
            }
        }
        return var1[0];
    }

    private static boolean var24(int n) {
        return n == 0;
    }

    private static boolean var35(int n, int n2) {
        return n > n2;
    }

        catch (Exception var41) {
            var41.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n, int n2) {
        return n < n2;
    }

    static {
        a.var23();
        a.var15();
    }

    private static boolean var27(int n) {
        return n != 0;
    }
}

