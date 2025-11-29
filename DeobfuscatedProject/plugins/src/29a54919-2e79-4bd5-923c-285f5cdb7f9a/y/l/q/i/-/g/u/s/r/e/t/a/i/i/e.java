/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Dropping empty pies")
public class e
extends Task {
    private static final /* synthetic */ Logger t;
    private static /* synthetic */ int[] lIllIIIllll;

    private static boolean lIIlIlIllIlIlI(int n) {
        return n == 0;
    }

    private static void lIIlIlIllIlIIl() {
        lIllIIIllll = new int[3];
        e.lIllIIIllll[0] = " ".length();
        e.lIllIIIllll[1] = (0 + 6 - -10 + 111 ^ (0x46 ^ 0x1E)) & (140 + 88 - 126 + 44 ^ 110 + 55 - 58 + 74 ^ -" ".length());
        e.lIllIIIllll[2] = 0xFFFFDF7D & 0x298B;
    }

    static {
        e.lIIlIlIllIlIIl();
        t = LoggerFactory.getLogger(e.class);
    }

    public boolean run() {
        int[] nArray = new int[lIllIIIllll[0]];
        nArray[e.lIllIIIllll[1]] = lIllIIIllll[2];
        if (e.lIIlIlIllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllIIIllll[1];
        }
        int[] nArray2 = new int[lIllIIIllll[0]];
        nArray2[e.lIllIIIllll[1]] = lIllIIIllll[2];
        Inventory.dropAll((int[])nArray2);
        "".length();
        return lIllIIIllll[0];
    }
}

