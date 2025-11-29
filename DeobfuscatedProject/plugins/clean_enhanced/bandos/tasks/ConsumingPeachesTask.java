/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class ConsumingPeachesTask
extends Task {
    
    private final  e aj;
    
    private final  f ak;

    private static void var3() {
        var1 = new String[var2[3]];
        t.var1[t.var2[0]] = "Eat";
        t.var1[t.var2[2]] = "peach";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (t.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    private static boolean var22(int n2) {
        return n2 == 0;
    }

    static {
        t.var23();
        t.var3();
    }

    private static boolean var24(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var25;
        if (!t.var26(this.aj.ConsumingPeachesTask() ? 1 : 0) || t.var26(this.aj.s() ? 1 : 0)) {
            return var2[0];
        }
        if (!t.var24(Combat.getMissingHealth(), var2[1]) || t.var22(var25.ak.D() ? 1 : 0)) {
            return var2[0];
        }
        Item var27 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[2]]));
        if (t.var21(var27)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        this.ak.C();
        return var2[2];
    }

    private static void var23() {
        var2 = new int[4];
        t.var2[0] = (0x3A ^ 0x7C) & ~(0xE8 ^ 0xAE);
        t.var2[1] = 0xDD ^ 0xBD ^ (0xE9 ^ 0x81);
        t.var2[2] = 1;
        t.var2[3] = 2;
    }

    private static boolean var26(int n2) {
        return n2 != 0;
    }

    @Inject
    public ConsumingPeachesTask(e e2, f f2) {
        this.aj = e2;
        this.ak = f2;
    }
}

