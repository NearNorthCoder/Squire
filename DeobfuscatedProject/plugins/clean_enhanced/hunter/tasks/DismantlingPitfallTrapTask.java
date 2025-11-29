/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dismantling Pitfall Trap", priority=30, blocking=true)
public class DismantlingPitfallTrapTask
extends HunterManager {

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var2_2;
        TileObject var4;
        t var5;
        int[] nArray = new int[var2[0]];
        nArray[t.var2[1]] = var2[2];
        if (t.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var2[1];
        }
        TileObject var6 = var5.a(var2[1]);
        if (t.var7(var6)) {
            int[] nArray2 = new int[var2[0]];
            nArray2[t.var2[1]] = var2[2];
            if (t.var3(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                var5.sleep(var2[3]);
                return var2[1];
            }
        }
        if (t.var8(var4 = var5.a(var2[0]))) {
            return var2[1];
        }
        var2_2.interact(var1[var2[1]]);
        return var2[0];
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var2 = new int[5];
        t.var2[0] = 1;
        t.var2[1] = (0x90 ^ 0xA5 ^ (0x8C ^ 0xA4)) & (0x3B ^ 0x6E ^ (0x38 ^ 0x70) ^ -1);
        t.var2[2] = 0xFFFFBFE7 & 0x45FF;
        t.var2[3] = 93 + 10 - 35 + 60 ^ 2 + 42 - -26 + 62;
        t.var2[4] = 2;
    }

    static {
        t.var15();
        t.var16();
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    @Inject
    public DismantlingPitfallTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    private static void var16() {
        var1 = new String[var2[0]];
        t.var1[t.var2[1]] = "Dismantle";
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

