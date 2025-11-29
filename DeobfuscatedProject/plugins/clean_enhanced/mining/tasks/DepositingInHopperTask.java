/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing in hopper", priority=8)
public class DepositingInHopperTask
extends MiningTaskBase {

    private static void var3() {
        var1 = new int[6];
        z.var1[0] = (0xF2 ^ 0xB2) & ~(0x36 ^ 0x76);
        z.var1[1] = 1;
        z.var1[2] = 0xFFFFFFFB & 0x2EEF;
        z.var1[3] = 0x32 ^ 5 ^ (0x9B ^ 0xA8);
        z.var1[4] = 2;
        z.var1[5] = 0x89 ^ 0x94 ^ (0xE ^ 0x1B);
    }

    private static void var4() {
        var2 = new String[var1[4]];
        z.var2[z.var1[0]] = "Drop";
        z.var2[z.var1[1]] = "Deposit";
    }

    @Inject
    public DepositingInHopperTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        TileObject var17;
        z var18;
        if (!z.var19(this.Z.I() ? 1 : 0) || z.var20(this.Z.K() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var20(var18.Z.L() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var19(var18.Z.F() ? 1 : 0)) {
            int[] nArray = new int[var1[1]];
            nArray[z.var1[0]] = var1[2];
            if (z.var19(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var1[1]];
                nArray2[z.var1[0]] = var1[2];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[0]]);
                return var1[1];
            }
        }
        if (z.var21(var17 = var18.x())) {
            return var1[0];
        }
        var1_1.interact(var2[var1[1]]);
        this.sleep(var1[3]);
        return var1[1];
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }

    static {
        z.var3();
        z.var4();
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }
}

