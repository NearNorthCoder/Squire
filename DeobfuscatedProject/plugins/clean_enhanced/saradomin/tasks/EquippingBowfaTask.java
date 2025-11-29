/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Equipping Bowfa")
public class EquippingBowfaTask
extends Task {
    
    private final  g aR;
    private final  SquireSaraConfig aQ;

    private static void var3() {
        var2 = new String[var1[3]];
        I.var2[I.var1[0]] = "Wield";
        I.var2[I.var1[2]] = "faerdhinen";
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        I.var6();
        I.var3();
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    @Inject
    public EquippingBowfaTask(SquireSaraConfig squireSaraConfig, g g2) {
        this.aQ = squireSaraConfig;
        this.aR = g2;
    }

    private static void var6() {
        var1 = new int[4];
        I.var1[0] = (0xED ^ 0xB7) & ~(0xEF ^ 0xB5);
        I.var1[1] = 38 + 30 - 14 + 151 ^ 26 + 30 - 6 + 149;
        I.var1[2] = 1;
        I.var1[3] = 2;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        I var14;
        if (I.var5(this.aQ.useBlowpipe() ? 1 : 0)) {
            return var1[0];
        }
        if (I.var7(var14.aR.o() ? 1 : 0) && I.var5(var14.aR.l() ? 1 : 0) && I.var4(var14.aR.k(), var1[1])) {
            return var1[0];
        }
        if (I.var15(var14.aR.t()) && I.var7(var14.aR.t().B() ? 1 : 0)) {
            return var1[0];
        }
        Item var16 = Inventory.getFirst(item -> item.getName().contains(var2[var1[2]]));
        if (I.var15(var16)) {
            var16.interact(var2[var1[0]]);
            return var1[2];
        }
        return var1[0];
    }

    private static boolean var15(Object object) {
        return object != null;
    }
}

