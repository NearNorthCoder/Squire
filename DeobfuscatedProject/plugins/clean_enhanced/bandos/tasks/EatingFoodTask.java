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
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.MovingToNextTileTask;

@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {
    private final  f U;
    private final  d T;
    
    private final  e S;
    private final  r V;

    static {
        o.var3();
        o.var4();
    }

    @Inject
    public EatingFoodTask(e e2, d d2, f f2, r r2) {
        this.S = e2;
        this.T = d2;
        this.U = f2;
        this.V = r2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var5;
        if (!o.var6(this.S.t() ? 1 : 0) || o.var7(this.S.y() ? 1 : 0)) {
            return var1[0];
        }
        if (o.var6(var5.S.s() ? 1 : 0) && o.var8(var5.T.m())) {
            return var1[0];
        }
        if (!o.var9(Combat.getCurrentHealth(), var1[1]) || o.var7(var5.U.D() ? 1 : 0)) {
            return var1[0];
        }
        if (o.var6(var5.V.O() ? 1 : 0) && o.var6(var5.S.s() ? 1 : 0)) {
            return var1[0];
        }
        Item var10 = Inventory.getFirst(item -> {
            int n2;
            if (o.var7(item.getName().equals(var2[var1[3]]) ? 1 : 0) && o.var6(item.hasAction(var2[var1[4]]::equals) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if ((89 + 46 - 50 + 89 ^ 166 + 6 - 111 + 109) <= -1) {
                    return ((101 + 218 - 248 + 159 ^ 6 + 24 - -62 + 81) & (0x43 ^ 0 ^ (0xBB ^ 0xB3) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (o.var11(var10)) {
            String[] stringArray = new String[var1[2]];
            stringArray[o.var1[0]] = var2[var1[0]];
            var10 = Inventory.getFirst((String[])stringArray);
        }
        if (o.var11(var10)) {
            return var5.M();
        }
        var1_1.interact(var2[var1[2]]);
        this.U.C();
        return var1[2];
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private boolean M() {
        return var1[0];
    }

    private static boolean var9(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static void var3() {
        var1 = new int[7];
        o.var1[0] = (1 ^ 0x32) & ~(0xA4 ^ 0x97);
        o.var1[1] = 0xC5 ^ 0x84;
        o.var1[2] = 1;
        o.var1[3] = 2;
        o.var1[4] = 3;
        o.var1[5] = 93 + 93 - 41 + 9 ^ 98 + 51 - 131 + 140;
        o.var1[6] = 88 + 99 - 71 + 75 ^ 79 + 121 - 92 + 75;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new String[var1[5]];
        o.var2[o.var1[0]] = "Peach";
        o.var2[o.var1[2]] = "Eat";
        o.var2[o.var1[3]] = "Peach";
        o.var2[o.var1[4]] = "Eat";
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }
}

