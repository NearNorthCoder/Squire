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
        int[] nArray = new int[lIIlllIIlIlIl[0]];
        nArray[f.lIIlllIIlIlIl[1]] = lIIlllIIlIlIl[2];
        return Equipment.contains((int[])nArray);
    }

    private static boolean lIllIIlIlIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIlIlIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIlIlIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean al() {
        f var1;
        if (f.lIllIIlIlIlIIlI(this.ar.L() ? 1 : 0)) {
            return lIIlllIIlIlIl[1];
        }
        int var2 = var1.au.c();
        if (f.lIllIIlIlIlIIll(var2, lIIlllIIlIlIl[3])) {
            return lIIlllIIlIlIl[1];
        }
        if (f.lIllIIlIlIlIlII(Combat.getSpecEnergy(), lIIlllIIlIlIl[4])) {
            return lIIlllIIlIlIl[1];
        }
        Combat.toggleSpec();
        return lIIlllIIlIlIl[0];
    }

    static {
        f.lIllIIlIlIlIIIl();
    }

    @Inject
    protected UsingSpecialAttackTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }
}

