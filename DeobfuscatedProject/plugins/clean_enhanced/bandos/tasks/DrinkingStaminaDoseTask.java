/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.MovingToNextTileTask;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {
    private final  f Q;
    
    private final  r R;
    
    private final  e O;
    private final  d P;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var9;
        if (!n.var10(this.O.t() ? 1 : 0) || n.var11(this.O.y() ? 1 : 0)) {
            return var2[0];
        }
        if (!n.var10(var9.O.s() ? 1 : 0) || n.var12(var9.P.m())) {
            return var2[0];
        }
        if (!n.var13(Movement.getRunEnergy(), var2[1]) || n.var10(Movement.isStaminaBoosted() ? 1 : 0)) {
            return var2[0];
        }
        if (n.var10(var9.R.O() ? 1 : 0)) {
            return var2[0];
        }
        Item var14 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[3]]));
        if (!n.var12(var14) || n.var11(var9.Q.E() ? 1 : 0)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        this.Q.B();
        this.sleep(var2[2]);
        return var2[3];
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var2[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var2[0];
        while (n.var13(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static void var25() {
        var1 = new String[var2[4]];
        n.var1[n.var2[0]] = "Drink";
        n.var1[n.var2[3]] = "Stamina";
    }

    @Inject
    public DrinkingStaminaDoseTask(e e2, d d2, f f2, r r2) {
        this.O = e2;
        this.P = d2;
        this.Q = f2;
        this.R = r2;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    static {
        n.var26();
        n.var25();
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static void var26() {
        var2 = new int[5];
        n.var2[0] = (0x5D ^ 0x3C ^ (0xB4 ^ 0x86)) & (129 + 69 - 125 + 166 ^ 138 + 135 - 135 + 50 ^ -1);
        n.var2[1] = 0x88 ^ 0x96;
        n.var2[2] = 3;
        n.var2[3] = 1;
        n.var2[4] = 2;
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

