/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Handling dodgy necklaces", priority=50, blocking=true)
public class HandlingDodgyNecklacesTask
extends Task {
    private final  SquireThievingConfig am;
    private final  SquireThieving an;
    
    private static final  Logger al;

    static {
        y.var3();
        y.var4();
        al = LoggerFactory.getLogger(HandlingDodgyNecklacesTask.class);
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    @Inject
    public HandlingDodgyNecklacesTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.am = squireThievingConfig;
        this.an = squireThieving;
    }

    private static void var3() {
        var2 = new int[5];
        y.var2[0] = (0x53 ^ 0x72 ^ (0xAB ^ 0x85)) & (5 + 119 - 12 + 35 ^ 68 + 16 - -27 + 45 ^ -1);
        y.var2[1] = 1;
        y.var2[2] = -(0xFFFFFD3D & 0x2FEB) & (0xFFFFFFFF & 0x7FBF);
        y.var2[3] = 0x99 ^ 0x91;
        y.var2[4] = 2;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new String[var2[1]];
        y.var1[y.var2[0]] = "Wear";
    }

    private static boolean var7(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        y var8;
        if (y.var5(this.am.dodgyNecklace() ? 1 : 0)) {
            return var2[0];
        }
        if (y.var7(var8.am.dodgyNecklaceAmount())) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[y.var2[0]] = var2[2];
        if (y.var6(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray2 = new int[var2[1]];
        nArray2[y.var2[0]] = var2[2];
        if (y.var5(Equipment.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var2[1]];
            nArray3[y.var2[0]] = var2[2];
            if (y.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[var2[1]];
                nArray4[y.var2[0]] = var2[2];
                Inventory.getFirst((int[])nArray4).interact(var1[var2[0]]);
                return var2[1];
            }
        }
        return var2[0];
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

