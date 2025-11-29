/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import com.google.inject.Inject;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

public abstract class aN
extends az {
    private static /* synthetic */ int[] llIIIIllIllI;

    public Item bu() {
        int[] nArray = new int[llIIIIllIllI[1]];
        nArray[aN.llIIIIllIllI[0]] = this.bS.compostProduce().aD().aY().au();
        return Inventory.getFirst((int[])nArray);
    }

    public abstract boolean b(TileObject var1);

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var4;
        aN var1;
        q q2 = this.bR.x();
        if (aN.llllIIllIIlllI(q2)) {
            return llIIIIllIllI[0];
        }
        if (aN.llllIIllIIllll(var1.bR.b((q)var4).ai() ? 1 : 0)) {
            return llIIIIllIllI[0];
        }
        N var2 = var4.aa();
        if (!aN.llllIIllIlIIII(var2) || aN.llllIIllIIllll(var1.I(var2) ? 1 : 0)) {
            return llIIIIllIllI[0];
        }
        TileObject var3 = var2.b(var1.bT);
        if (!aN.llllIIllIlIIII(var3) || aN.llllIIllIIllll(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            return llIIIIllIllI[0];
        }
        return this.b((TileObject)var3_3);
    }

    private static void llllIIllIIllIl() {
        llIIIIllIllI = new int[2];
        aN.llIIIIllIllI[0] = (0x99 ^ 0xAE) & ~(0x9C ^ 0xAB);
        aN.llIIIIllIllI[1] = 1;
    }

    public abstract boolean I(N var1);

    static {
        aN.llllIIllIIllIl();
    }

    private static boolean llllIIllIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIllIlIIII(Object object) {
        return object != null;
    }

    private static boolean llllIIllIIlllI(Object object) {
        return object == null;
    }

    @Inject
    public aN(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }
}

