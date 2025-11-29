/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", blocking=true)
public class EatingTask
extends Task {

    private final  SquireSkipperConfig C;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    static {
        h.var11();
        h.var12();
    }

    private static void var11() {
        var1 = new int[4];
        h.var1[0] = 1;
        h.var1[1] = (0x58 ^ 0x65) & ~(0xB8 ^ 0x85);
        h.var1[2] = 0x8A ^ 0x82;
        h.var1[3] = 2;
    }

    @Inject
    public EatingTask(SquireSkipperConfig squireSkipperConfig) {
        this.C = squireSkipperConfig;
    }

    private static void var12() {
        var2 = new String[var1[0]];
        h.var2[h.var1[1]] = "Eat";
    }

    public boolean run() {
        h var13;
        int[] nArray = new int[var1[0]];
        nArray[h.var1[1]] = this.C.foodID();
        if (h.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[1];
        }
        if (h.var10(Combat.getCurrentHealth(), var13.C.eatHP())) {
            return var1[1];
        }
        int[] nArray2 = new int[var1[0]];
        nArray2[h.var1[1]] = this.C.foodID();
        Inventory.getFirst((int[])nArray2).interact(var2[var1[1]]);
        return var1[0];
    }
}

