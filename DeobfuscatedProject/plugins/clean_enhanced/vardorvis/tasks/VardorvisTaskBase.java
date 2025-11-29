/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import javax.inject.Inject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

public abstract class VardorvisTaskBase
extends Task {
    
    @Inject
    protected  SquireVardorvis aw;
    protected static final  WorldArea av;

    private static void var2() {
        var1 = new int[10];
        E.var1[0] = (0x33 ^ 0x2F) & ~(9 ^ 0x15);
        E.var1[1] = 1;
        E.var1[2] = 0xFFFFD19B & 0x3FF6;
        E.var1[3] = 2;
        E.var1[4] = 0xFFFFDB5E & 0x27A5;
        E.var1[5] = -(0xFFFF8CD3 & 0x7FAF) & (0xFFFFEFFE & 0x3FFF);
        E.var1[6] = 0xFFFFAC7D & 0x57DB;
        E.var1[7] = 0xFFFFFD77 & 0xFEB;
        E.var1[8] = 0xFFFF8563 & 0x7EFC;
        E.var1[9] = -(0xFFFFFE4D & 0x73B7) & (0xFFFFFF7F & 0x7FEF);
    }

    public boolean run() {
        if (E.var3(this.aw.i() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var4(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return var1[1];
        }
        return this.l();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        E.var2();
        av = new WorldArea(new WorldPoint(var1[6], var1[7], var1[0]), new WorldPoint(var1[8], var1[9], var1[0]));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean X() {
        int n2;
        block3: {
            block2: {
                if (!E.var5(Vars.getBit((int)var1[2]))) break block2;
                int[] nArray = new int[var1[3]];
                nArray[E.var1[0]] = var1[4];
                nArray[E.var1[1]] = var1[5];
                if (!E.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var1[3]];
                nArray2[E.var1[0]] = var1[4];
                nArray2[E.var1[1]] = var1[5];
                if (!E.var4(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = var1[1];
            0;
            if (-(0x21 ^ 0x24) < 0) return n2 != 0;
            return ((0xB1 ^ 0xAC) & ~(0x62 ^ 0x7F)) != 0;
        }
        n2 = var1[0];
        return n2 != 0;
    }

    public abstract boolean l();

    private static boolean var5(int n2) {
        return n2 <= 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }
}

