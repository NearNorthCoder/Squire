/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using Special Attack", priority=99999)
public class UsingSpecialAttackTask
extends Task {
    private final  SquireWoodcutterConfig F;
    
    private final  SquireWoodcutterPlugin E;

    public boolean run() {
        g var1;
        if (g.llIIIlIIlIIIIII(this.t() ? 1 : 0)) {
            return lIllIIIIllIll[0];
        }
        if (g.llIIIlIIlIIIIIl(var1.E.p() ? 1 : 0)) {
            return lIllIIIIllIll[0];
        }
        if (g.llIIIlIIlIIIIIl(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIllIll[0];
        }
        if (g.llIIIlIIlIIIIlI(Combat.getSpecEnergy(), lIllIIIIllIll[1])) {
            return lIllIIIIllIll[0];
        }
        Combat.toggleSpec();
        return lIllIIIIllIll[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t() {
        int n;
        block3: {
            block2: {
                int[] nArray = new int[lIllIIIIllIll[2]];
                nArray[g.lIllIIIIllIll[0]] = lIllIIIIllIll[3];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIIllIll[2]];
                nArray2[g.lIllIIIIllIll[0]] = lIllIIIIllIll[4];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIIllIll[2]];
                nArray3[g.lIllIIIIllIll[0]] = lIllIIIIllIll[5];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray3) ? 1 : 0)) break block2;
                int[] nArray4 = new int[lIllIIIIllIll[2]];
                nArray4[g.lIllIIIIllIll[0]] = lIllIIIIllIll[6];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray4) ? 1 : 0)) break block2;
                int[] nArray5 = new int[lIllIIIIllIll[2]];
                nArray5[g.lIllIIIIllIll[0]] = lIllIIIIllIll[7];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray5) ? 1 : 0)) break block2;
                int[] nArray6 = new int[lIllIIIIllIll[2]];
                nArray6[g.lIllIIIIllIll[0]] = lIllIIIIllIll[8];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray6) ? 1 : 0)) break block2;
                int[] nArray7 = new int[lIllIIIIllIll[2]];
                nArray7[g.lIllIIIIllIll[0]] = lIllIIIIllIll[9];
                if (!g.llIIIlIIlIIIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block2;
                int[] nArray8 = new int[lIllIIIIllIll[2]];
                nArray8[g.lIllIIIIllIll[0]] = lIllIIIIllIll[10];
                if (!g.llIIIlIIlIIIIIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block3;
            }
            n = lIllIIIIllIll[2];

            if (((2 ^ (0x3F ^ 0x18)) & (0xC7 ^ 0x9B ^ (0x7C ^ 5) ^ -1)) <= 1) return n != 0;
            return ((0x78 ^ 0x28 ^ (0x15 ^ 0x64)) & (0x1D ^ 0x43 ^ 34 + 51 - 26 + 68 ^ -1)) != 0;
        }
        n = lIllIIIIllIll[0];
        return n != 0;
    }

    private static boolean llIIIlIIlIIIIlI(int n, int n2) {
        return n != n2;
    }

    @Inject
    public UsingSpecialAttackTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.E = squireWoodcutterPlugin;
        this.F = squireWoodcutterConfig;
    }

    static {
        g.llIIIlIIIllllll();
    }

    private static boolean llIIIlIIlIIIIII(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIlIIIIIl(int n) {
        return n != 0;
    }
}

