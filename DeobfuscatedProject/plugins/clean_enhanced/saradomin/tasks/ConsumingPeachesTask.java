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
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class ConsumingPeachesTask
extends Task {
    private final  g aA;
    
    private final  a aB;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new int[4];
        B.var1[0] = (0x7B ^ 0x63) & ~(0x8C ^ 0x94);
        B.var1[1] = 0x6F ^ 0x67;
        B.var1[2] = 1;
        B.var1[3] = 2;
    }

    private static void var5() {
        var2 = new String[var1[3]];
        B.var2[B.var1[0]] = "Eat";
        B.var2[B.var1[2]] = "peach";
    }

    static {
        B.var4();
        B.var5();
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Inject
    public ConsumingPeachesTask(g g2, a a2) {
        this.aA = g2;
        this.aB = a2;
    }

    private static boolean var7(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        B var14;
        if (!B.var15(this.aA.m() ? 1 : 0) || B.var15(this.aA.l() ? 1 : 0)) {
            return var1[0];
        }
        if (!B.var7(Combat.getMissingHealth(), var1[1]) || B.var3(var14.aB.d() ? 1 : 0)) {
            return var1[0];
        }
        if (B.var15(var14.aA.o() ? 1 : 0)) {
            return var1[0];
        }
        Item var16 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[2]]));
        if (B.var6(var16)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.aB.c();
        return var1[2];
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

