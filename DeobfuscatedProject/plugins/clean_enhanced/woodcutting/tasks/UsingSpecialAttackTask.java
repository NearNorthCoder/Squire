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
        g var2;
        if ((this.t( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.E.p( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Combat.getSpecEnergy() != Combat.getSpecEnergy()2)) {
            return 0;
        }
        Combat.toggleSpec();
        return 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t() {
        int n;
        block3: {
            block2: {
                int[] nArray = new int[2];
                nArray[0] = 3;
                if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[2];
                nArray2[0] = 4;
                if (!(Equipment.contains((int[] == 0)nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[2];
                nArray3[0] = 5;
                if (!(Equipment.contains((int[] == 0)nArray3) ? 1 : 0)) break block2;
                int[] nArray4 = new int[2];
                nArray4[0] = 6;
                if (!(Equipment.contains((int[] == 0)nArray4) ? 1 : 0)) break block2;
                int[] nArray5 = new int[2];
                nArray5[0] = 7;
                if (!(Equipment.contains((int[] == 0)nArray5) ? 1 : 0)) break block2;
                int[] nArray6 = new int[2];
                nArray6[0] = 8;
                if (!(Equipment.contains((int[] == 0)nArray6) ? 1 : 0)) break block2;
                int[] nArray7 = new int[2];
                nArray7[0] = 9;
                if (!(Equipment.contains((int[] == 0)nArray7) ? 1 : 0)) break block2;
                int[] nArray8 = new int[2];
                nArray8[0] = var1[10];
                if (!(Equipment.contains((int[] != 0)nArray8) ? 1 : 0)) break block3;
            }
            n = 2;
            0;
            if (((2 ^ (0x3F ^ 0x18)) & (0xC7 ^ 0x9B ^ (0x7C ^ 5) ^ -1)) <= 1) return n != 0;
            return ((0x78 ^ 0x28 ^ (0x15 ^ 0x64)) & (0x1D ^ 0x43 ^ 34 + 51 - 26 + 68 ^ -1)) != 0;
        }
        n = 0;
        return n != 0;
    }

    @Inject
    public UsingSpecialAttackTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.E = squireWoodcutterPlugin;
        this.F = squireWoodcutterConfig;
    }

    static {
        g.var3();
    }

}

