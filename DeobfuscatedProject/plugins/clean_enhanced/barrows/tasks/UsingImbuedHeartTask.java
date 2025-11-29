/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using imbued heart", priority=13337, blocking=true)
public class UsingImbuedHeartTask
extends Task {
    
    private final  SquireBarrows aa;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (r.var3(this.aa.m() ? 1 : 0) && r.var3(this.aa.h() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[r.var1[0]] = var1[2];
        nArray[r.var1[3]] = var1[4];
        Item var4 = Inventory.getFirst((int[])nArray);
        if (r.var5(var4)) {
            return var1[0];
        }
        int var6 = Vars.getBit((int)var1[5]);
        if (r.var7(var6)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[3];
    }

    private static boolean var7(int n2) {
        return n2 > 0;
    }

    private static void var8() {
        var2 = new String[var1[3]];
        r.var2[r.var1[0]] = "Invigorate";
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        r.var15();
        r.var8();
    }

    @Inject
    public UsingImbuedHeartTask(SquireBarrows squireBarrows) {
        this.aa = squireBarrows;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var15() {
        var1 = new int[6];
        r.var1[0] = (0x77 ^ 0x30) & ~(0x43 ^ 4);
        r.var1[1] = 2;
        r.var1[2] = -(0xFFFFFFA7 & 0x2E5B) & (0xFFFFFFFF & 0x7EF6);
        r.var1[3] = 1;
        r.var1[4] = -1 & (0xFFFFFBFB & 0x6FFD);
        r.var1[5] = -(0xFFFFEB7D & 0x7F8B) & (0xFFFFFFFD & 0x7FFB);
    }
}

