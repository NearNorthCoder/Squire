/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping useless items", priority=5)
public class DroppingUselessItemsTask
extends Task {
    
    private final  int[] u;

    public DroppingUselessItemsTask() {
        int[] nArray = new int[lIIllIlIlIlll[0]];
        nArray[i.lIIllIlIlIlll[1]] = lIIllIlIlIlll[2];
        nArray[i.lIIllIlIlIlll[3]] = lIIllIlIlIlll[4];
        nArray[i.lIIllIlIlIlll[5]] = lIIllIlIlIlll[6];
        this.u = nArray;
    }

    public boolean run() {
        i var1;
        if (i.lIllIIIIlIIlllI(Game.getState(), GameState.LOGGED_IN)) {
            return lIIllIlIlIlll[1];
        }
        if (i.lIllIIIIlIIllll(Inventory.contains((int[])var1.u) ? 1 : 0)) {
            return lIIllIlIlIlll[1];
        }
        Inventory.dropAll((int[])this.u);

        return lIIllIlIlIlll[3];
    }

    private static boolean lIllIIIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlIIlllI(Object object, Object object2) {
        return object != object2;
    }

    static {
        i.lIllIIIIlIIllIl();
    }

}

