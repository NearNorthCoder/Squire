/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Using special attack", priority=6)
public class UsingSpecialAttackTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        int[] nArray = new int[var1[0]];
        nArray[f.var1[1]] = var1[2];
        return Equipment.contains((int[])nArray);
    }

    private static boolean var2(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean al() {
        f var5;
        if (f.var4(this.ar.L() ? 1 : 0)) {
            return var1[1];
        }
        int var6 = var5.au.c();
        if (f.var3(var6, var1[3])) {
            return var1[1];
        }
        if (f.var2(Combat.getSpecEnergy(), var1[4])) {
            return var1[1];
        }
        Combat.toggleSpec();
        return var1[0];
    }

    static {
        f.var7();
    }

    private static void var7() {
        var1 = new int[5];
        f.var1[0] = 1;
        f.var1[1] = (10 + 4 - -140 + 75 ^ 64 + 95 - 65 + 97) & (179 + 56 - 103 + 79 ^ 93 + 124 - 110 + 30 ^ -1);
        f.var1[2] = 0xFFFFD3F7 & 0x7E2C;
        f.var1[3] = 0xDD ^ 0x87;
        f.var1[4] = 0xFA ^ 0x9E;
    }

    @Inject
    protected UsingSpecialAttackTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }
}

