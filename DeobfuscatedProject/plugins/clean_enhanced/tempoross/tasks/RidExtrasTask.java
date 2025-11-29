/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Rid extras", priority=50)
public class RidExtrasTask
extends TemporossTaskBase {

    private static void var3() {
        var1 = new String[var2[4]];
        u.var1[u.var2[1]] = "Drop";
        u.var1[u.var2[0]] = "Drop";
    }

    @Override
    public boolean al() {
        u var4;
        int[] nArray = new int[var2[0]];
        nArray[u.var2[1]] = var2[2];
        if (u.var5(Inventory.getCount((int[])nArray), var2[0])) {
            int[] nArray2 = new int[var2[0]];
            nArray2[u.var2[1]] = var2[2];
            Inventory.getFirst((int[])nArray2).interact(var1[var2[1]]);
            return var2[0];
        }
        if (u.var5(var4.ar.n(), var4.as.numberOfBuckets())) {
            int[] nArray3 = new int[var2[0]];
            nArray3[u.var2[1]] = var2[3];
            Inventory.getFirst((int[])nArray3).interact(var1[var2[0]]);
        }
        return var2[1];
    }

    @Inject
    protected RidExtrasTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void var6() {
        var2 = new int[6];
        u.var2[0] = 1;
        u.var2[1] = (0x4E ^ 0 ^ (0x72 ^ 0x5C)) & (121 + 21 - -7 + 106 ^ 69 + 53 - 0 + 37 ^ -1);
        u.var2[2] = 0xFFFF9FBA & 0x63FF;
        u.var2[3] = -(0xFFFFD9D7 & 0x6639) & (0xFFFFCF9F & 0x7EFF);
        u.var2[4] = 2;
        u.var2[5] = 0x68 ^ 1 ^ (0xA0 ^ 0xC1);
    }

    static {
        u.var6();
        u.var3();
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ak() {
        int n2;
        int[] nArray = new int[var2[0]];
        nArray[u.var2[1]] = var2[2];
        if (!u.var7(Inventory.getCount((int[])nArray), var2[0]) || u.var5(this.ar.n(), this.as.numberOfBuckets())) {
            n2 = var2[0];
            0;
            if null != null {
                return ((0xB3 ^ 0x91 ^ (0xBC ^ 0x8B)) & (0xA8 ^ 0x8D ^ (0x25 ^ 0x15) ^ -1)) != 0;
            }
        } else {
            n2 = var2[1];
        }
        return n2 != 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }
}

