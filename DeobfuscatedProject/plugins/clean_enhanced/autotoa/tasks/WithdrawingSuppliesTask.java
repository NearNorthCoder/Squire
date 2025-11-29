/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Withdrawing supplies", priority=5000, blocking=true)
public class WithdrawingSuppliesTask
extends AutotoaManager {

    private final  C hK;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static  boolean a(e e2, Item item) {
        return e2.p().contains(item.getId());
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void var12() {
        var1 = new String[var2[8]];
        cd.var1[cd.var2[1]] = "Supplies";
        cd.var1[cd.var2[0]] = "Open";
        cd.var1[cd.var2[2]] = "Withdraw All";
        cd.var1[cd.var2[3]] = "Supplies";
        cd.var1[cd.var2[4]] = "Open";
        cd.var1[cd.var2[5]] = "restore";
        cd.var1[cd.var2[6]] = "prayer";
        cd.var1[cd.var2[7]] = "sanfew";
    }

    static {
        cd.var13();
        cd.var12();
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var15(int n2) {
        return n2 <= 0;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[1];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[1];
        while (cd.var4(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-(0xD5 ^ 0x9C ^ (0x3A ^ 0x77)) < 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static void var13() {
        var2 = new int[9];
        cd.var2[0] = 1;
        cd.var2[1] = (0x1A ^ 0) & ~(0x83 ^ 0x99);
        cd.var2[2] = 2;
        cd.var2[3] = 3;
        cd.var2[4] = 0xCC ^ 0xC0 ^ (0x3A ^ 0x32);
        cd.var2[5] = 0xE3 ^ 0xB6 ^ (0xC6 ^ 0x96);
        cd.var2[6] = 0x43 ^ 0x32 ^ (0x50 ^ 0x27);
        cd.var2[7] = 0x73 ^ 0x74;
        cd.var2[8] = 0x84 ^ 0xB8 ^ (0x85 ^ 0xB1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(e e2) {
        void var26;
        cd var27;
        String[] stringArray = new String[var2[0]];
        stringArray[cd.var2[1]] = var1[var2[3]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (cd.var3(item)) {
            return var2[1];
        }
        if (cd.var15(var27.hK.av().getOrDefault(var26, var2[1]))) {
            return var2[1];
        }
        Item var28 = Inventory.getFirst(arg_0 -> cd.a((e)var26, arg_0));
        if (cd.var3(var28)) {
            void var29;
            if (cd.var14(Inventory.isFull() ? 1 : 0)) {
                return var2[1];
            }
            if (cd.var5(var27.aX())) {
                return var2[1];
            }
            if (cd.var14(var27.hK.au() ? 1 : 0)) {
                var27.hK.a((e)var26);
                return var2[0];
            }
            var29.interact(var1[var2[4]]);
            return var2[0];
        }
        return var2[1];
    }

    private static boolean var30(int n2) {
        return n2 == 0;
    }

    private static boolean var31(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var32;
        cd var33;
        String[] stringArray = new String[var2[0]];
        stringArray[cd.var2[1]] = var1[var2[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cd.var3(item2)) {
            return var2[1];
        }
        if (cd.var14(var33.hK.av().isEmpty() ? 1 : 0)) {
            var32.interact(var1[var2[0]]);
            return var2[0];
        }
        if (cd.var14(var33.b(e.SMELLING_SALTS) ? 1 : 0)) {
            return var2[0];
        }
        if (cd.var30(var33.aq() ? 1 : 0)) {
            return var2[1];
        }
        if (cd.var14(Inventory.isFull() ? 1 : 0) && cd.var30(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            var33.b((Item item) -> {
                boolean bl2;
                if (!cd.var30(item.getName().toLowerCase().contains(var1[var2[5]]) ? 1 : 0) || !cd.var30(item.getName().toLowerCase().contains(var1[var2[6]]) ? 1 : 0) || cd.var14(item.getName().toLowerCase().contains(var1[var2[7]]) ? 1 : 0)) {
                    bl2 = var2[0];
                    0;
                    if (((0xB ^ 0x63 ^ (0x7F ^ 0x46)) & (2 ^ (0x6B ^ 0x38) ^ -1)) > 0) {
                        return ((0x2D ^ 1 ^ (0x43 ^ 0x48)) & (80 + 35 - 30 + 45 ^ 147 + 77 - 120 + 61 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var2[1];
                }
                return bl2;
            });
        }
        if (cd.var14(var33.aq() ? 1 : 0) && cd.var31(Inventory.getFreeSlots(), var2[0]) && cd.var14(Prayers.anyActive() ? 1 : 0)) {
            var32.interact(var1[var2[2]]);
        }
        if (cd.var14(var33.b(e.LIQUID_ADRENALINE) ? 1 : 0)) {
            return var2[0];
        }
        if (cd.var14(var33.b(e.AMBROSIA) ? 1 : 0)) {
            return var2[0];
        }
        if (cd.var14(var33.b(e.NECTAR) ? 1 : 0)) {
            return var2[0];
        }
        if (cd.var14(var33.b(e.SILK_DRESSING) ? 1 : 0)) {
            return var2[0];
        }
        if (cd.var14(var33.b(e.TEARS_OF_ELIDINIS) ? 1 : 0)) {
            return var2[0];
        }
        return var2[1];
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    @Inject
    protected WithdrawingSuppliesTask(Client client, C c2) {
        super(client);
        this.hK = c2;
    }
}

