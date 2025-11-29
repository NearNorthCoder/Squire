/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum2;
import gg.squire.hunter.tasks.GameEnum4;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Checking Supplies", priority=1337)
public class CheckingSuppliesTask
extends Task {
    private final  b q;
    private final  SquireHerbiboarPlugin o;
    private final  SquireHerbiboarConfig p;

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public CheckingSuppliesTask(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b b2) {
        this.o = squireHerbiboarPlugin;
        this.p = squireHerbiboarConfig;
        this.q = b2;
    }

    private static void var4() {
        var2 = new int[4];
        d.var2[0] = (0x62 ^ 0x57) & ~(2 ^ 0x37);
        d.var2[1] = 1;
        d.var2[2] = 0xF ^ 0x2D ^ (0xBD ^ 0x9A);
        d.var2[3] = 2;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static void var6() {
        var1 = new String[var2[3]];
        d.var1[d.var2[0]] = "We need to withdraw energy potions from the bank";
        d.var1[d.var2[1]] = "We need to deposit stuff to the bank!";
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var2[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var2[0];
        while (d.var5(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if ((0x50 ^ 0x55) > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        int var19;
        d var20;
        if (d.var3((Object)this.q.i(), (Object)c.STARTING)) {
            return var2[0];
        }
        e var21 = var20.p.useEnergyRestoration();
        if (d.var3((Object)var21, (Object)e.NONE) && d.var17(var19 = Inventory.getCount((int[])var21.j()))) {
            Log.info((String)var1[var2[0]]);
            var20.o.a(var2[1]);
            return var2[0];
        }
        if (d.var18(Inventory.getFreeSlots(), var2[2])) {
            Log.info((String)var1[var2[1]]);
            var20.o.a(var2[1]);
        }
        return var2[0];
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    static {
        d.var4();
        d.var6();
    }
}

