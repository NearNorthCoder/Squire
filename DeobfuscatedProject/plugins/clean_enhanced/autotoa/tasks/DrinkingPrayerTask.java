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

@TaskDesc(name="Drinking prayer", priority=85)
public class DrinkingPrayerTask
extends AutotoaManager {
    private final  C cK;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Inject
    protected DrinkingPrayerTask(Client client, C c2) {
        super(client);
        this.cK = c2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        ag.var5();
        ag.var6();
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        ag var13;
        int var14;
        int n2;
        if (ag.var3(this.aq() ? 1 : 0)) {
            n2 = var2[0];
            0;
            if (-1 >= 0) {
                return ((171 + 118 - 154 + 38 ^ 9 + 48 - 48 + 123) & (49 + 20 - 67 + 184 ^ 113 + 114 - 196 + 116 ^ -1)) != 0;
            }
        } else {
            n2 = var14 = var2[1];
        }
        if (ag.var15(Prayers.getPoints(), var14)) {
            return var2[1];
        }
        Item var16 = Inventory.getFirst(item -> {
            int n2;
            if (!ag.var4(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !ag.var4(item.getName().contains(var1[var2[2]]) ? 1 : 0) || !ag.var4(item.getName().contains(var1[var2[3]]) ? 1 : 0) || ag.var3(item.getName().contains(var1[var2[4]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((18 + 124 - 5 + 1 ^ 146 + 13 - 115 + 146) & (0x3E ^ 0x48 ^ (0x6D ^ 0x2F) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (ag.var17(var16) && ag.var3(var13.cK.am() ? 1 : 0)) {
            var16.interact(var1[var2[1]]);
            var13.cK.ao();
            return var2[2];
        }
        return var2[1];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    private static void var6() {
        var1 = new String[var2[5]];
        ag.var1[ag.var2[1]] = "Drink";
        ag.var1[ag.var2[2]] = "restore";
        ag.var1[ag.var2[3]] = "Prayer";
        ag.var1[ag.var2[4]] = "Sanfew";
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static void var5() {
        var2 = new int[7];
        ag.var2[0] = 0x75 ^ 0x50 ^ (0x90 ^ 0x86);
        ag.var2[1] = 2 & (2 ^ -1);
        ag.var2[2] = 1;
        ag.var2[3] = 2;
        ag.var2[4] = 3;
        ag.var2[5] = 0x3F ^ 0x3B;
        ag.var2[6] = 79 + 33 - 12 + 31 ^ 37 + 54 - 78 + 126;
    }
}

