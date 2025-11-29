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
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping useless items", priority=5)
public class i
extends Task {
    private static /* synthetic */ int[] lIIllIlIlIlll;
    private final /* synthetic */ int[] u;

    public i() {
        int[] nArray = new int[lIIllIlIlIlll[0]];
        nArray[i.lIIllIlIlIlll[1]] = lIIllIlIlIlll[2];
        nArray[i.lIIllIlIlIlll[3]] = lIIllIlIlIlll[4];
        nArray[i.lIIllIlIlIlll[5]] = lIIllIlIlIlll[6];
        this.u = nArray;
    }

    public boolean run() {
        i llllllllllllllIllllIIIIIlIlIIIIl;
        if (i.lIllIIIIlIIlllI(Game.getState(), GameState.LOGGED_IN)) {
            return lIIllIlIlIlll[1];
        }
        if (i.lIllIIIIlIIllll(Inventory.contains((int[])llllllllllllllIllllIIIIIlIlIIIIl.u) ? 1 : 0)) {
            return lIIllIlIlIlll[1];
        }
        Inventory.dropAll((int[])this.u);
        "".length();
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

    private static void lIllIIIIlIIllIl() {
        lIIllIlIlIlll = new int[7];
        i.lIIllIlIlIlll[0] = "   ".length();
        i.lIIllIlIlIlll[1] = (0x81 ^ 0xB2) & ~(0xAB ^ 0x98);
        i.lIIllIlIlIlll[2] = 0xFFFFBF8F & 0x47FF;
        i.lIIllIlIlIlll[3] = " ".length();
        i.lIIllIlIlIlll[4] = 0xFFFFE6DF & 0x79E6;
        i.lIIllIlIlIlll[5] = "  ".length();
        i.lIIllIlIlIlll[6] = 0xFFFF977F & 0x6FFF;
    }
}

