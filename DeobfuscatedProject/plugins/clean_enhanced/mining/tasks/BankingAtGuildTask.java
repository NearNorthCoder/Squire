/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.util.HashSet;
import java.util.Iterator;
import gg.squire.mining.tasks.GameEnum5;
import gg.squire.mining.tasks.GameEnum;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Banking at guild")
public class BankingAtGuildTask
extends Task {

    private final  SquireMinerConfig E;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (u.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        u.var14();
        u.var15();
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var18(Object object, Object object2) {
        return object != object2;
    }

    private static void var15() {
        var1 = new String[var2[1]];
        u.var1[u.var2[0]] = "pickaxe";
    }

    private static void var14() {
        var2 = new int[2];
        u.var2[0] = (114 + 55 - 31 + 68 ^ 36 + 29 - -7 + 56) & (0x92 ^ 0x96 ^ (0x5F ^ 0x15) ^ -1);
        u.var2[1] = 1;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    @Inject
    public BankingAtGuildTask(SquireMinerConfig squireMinerConfig) {
        this.E = squireMinerConfig;
    }

    public boolean run() {
        u var20;
        if (u.var18((Object)this.E.activity(), (Object)a.AMETHYST) && u.var18((Object)this.E.activity(), (Object)a.GUILD_IRON)) {
            return var2[0];
        }
        if (u.var18((Object)var20.E.craft(), (Object)b.DISABLE) && u.var16((Object)var20.E.activity(), (Object)a.AMETHYST)) {
            return var2[0];
        }
        if (u.var19(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        if (u.var19(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var2[1];
        }
        HashSet<Item> var21 = new HashSet<Item>();
        Iterator var22 = Inventory.getAll().iterator();
        while (u.var17(var22.hasNext() ? 1 : 0)) {
            Item var23 = (Item)var22.next();
            if (u.var17(var21.contains(var23) ? 1 : 0)) {
                0;
                if (1 != 2) continue;
                return ((8 ^ 0x3F ^ (0x78 ^ 0xA)) & (197 + 127 - 216 + 98 ^ 80 + 94 - 137 + 102 ^ -1)) != 0;
            }
            if (u.var17(var23.getName().contains(var1[var2[0]]) ? 1 : 0)) {
                0;
                if null == null continue;
                return ((0x3D ^ 7) & ~(0xC ^ 0x36)) != 0;
            }
            var21.add(var23);
            0;
            int[] nArray = new int[var2[1]];
            nArray[u.var2[0]] = var23.getId();
            Bank.depositAll((int[])nArray);
            0;
            if ((0x70 ^ 0x53 ^ (0x80 ^ 0xA7)) != -1) continue;
            return ((81 + 109 - 48 + 15 ^ 10 + 100 - -7 + 29) & (0xCC ^ 0xC3 ^ (0x5C ^ 0x5A) & ~(0x30 ^ 0x36) ^ -1)) != 0;
        }
        return var2[1];
    }
}

