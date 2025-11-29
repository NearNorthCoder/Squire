/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Reloading cannon -> ReloadingcannonTask */
@TaskDesc(name="Reloading cannon")
public class K
extends Task {
    private final /* synthetic */ CannonReloader bQ;
    private static /* synthetic */ int[] lllIIIll;
    private static final /* synthetic */ int bP;
    private /* synthetic */ int bR;

    static {
        K.llIIlIIIlI();
        bP = lllIIIll[4];
    }

    private static boolean llIIlIIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        K llIlIIlllllllIl;
        if (K.llIIlIIIll(this.bQ.aA() ? 1 : 0)) {
            return lllIIIll[2];
        }
        if (K.llIIlIIlII(llIlIIlllllllIl.bQ.az(), llIlIIlllllllIl.bR)) {
            return lllIIIll[2];
        }
        int[] nArray = new int[lllIIIll[3]];
        nArray[K.lllIIIll[2]] = lllIIIll[4];
        TileObject llIlIIlllllllII = TileObjects.getNearest((int[])nArray);
        if (K.llIIlIIlIl(llIlIIlllllllII)) {
            return lllIIIll[2];
        }
        int[] nArray2 = new int[lllIIIll[5]];
        nArray2[K.lllIIIll[2]] = lllIIIll[5];
        nArray2[K.lllIIIll[3]] = lllIIIll[6];
        Item llIlIIllllllIll = Inventory.getFirst((int[])nArray2);
        if (K.llIIlIIlIl(llIlIIllllllIll)) {
            return lllIIIll[2];
        }
        var2_2.useOn((TileObject)var1_1);
        this.bR = Rand.nextInt((int)lllIIIll[0], (int)lllIIIll[1]);
        return lllIIIll[3];
    }

    private static void llIIlIIIlI() {
        lllIIIll = new int[7];
        K.lllIIIll[0] = 0xDF ^ 0xA4 ^ (0x12 ^ 0x61);
        K.lllIIIll[1] = 0x7A ^ 0x68;
        K.lllIIIll[2] = (0x39 ^ 0x73 ^ 82 + 101 - 105 + 49) & (0x1D ^ 0x39 ^ (0x5B ^ 0x4A) ^ -1);
        K.lllIIIll[3] = 1;
        K.lllIIIll[4] = 0x61 ^ 0x5A ^ (0x30 ^ 0xD);
        K.lllIIIll[5] = 2;
        K.lllIIIll[6] = 0xFFFFFEED & 0x55F2;
    }

    @Inject
    public K(CannonReloader cannonReloader) {
        this.bR = Rand.nextInt((int)lllIIIll[0], (int)lllIIIll[1]);
        this.bQ = cannonReloader;
    }
}

