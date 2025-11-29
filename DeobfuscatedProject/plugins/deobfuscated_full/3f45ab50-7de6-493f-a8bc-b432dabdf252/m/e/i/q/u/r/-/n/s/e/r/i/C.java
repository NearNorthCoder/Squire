/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public abstract class C
extends Task {
    protected final /* synthetic */ SquireMiner Y;
    protected final /* synthetic */ T Z;
    protected final /* synthetic */ SquireMinerConfig X;
    private static /* synthetic */ int[] lllllIlllIIl;

    protected TileObject v() {
        WorldPoint worldPoint = new WorldPoint(lllllIlllIIl[1], lllllIlllIIl[2], lllllIlllIIl[0]);
        int[] nArray = new int[lllllIlllIIl[3]];
        nArray[C.lllllIlllIIl[0]] = lllllIlllIIl[4];
        return TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
    }

    private static void lIIlIIllllIIlll() {
        lllllIlllIIl = new int[7];
        C.lllllIlllIIl[0] = (0x62 ^ 0x2C ^ (0xB1 ^ 0xBE)) & (0x39 ^ 0x7D ^ (0x46 ^ 0x43) ^ -1);
        C.lllllIlllIIl[1] = 0xFFFFCFAF & 0x3EFB;
        C.lllllIlllIIl[2] = -(0xFFFFE58F & 0x7A73) & (0xFFFFF66E & 0x7FBF);
        C.lllllIlllIIl[3] = 1;
        C.lllllIlllIIl[4] = 0xFFFFEEF3 & 0x793E;
        C.lllllIlllIIl[5] = -(0xFFFFFD49 & 0x73F7) & (0xFFFFFFF5 & 0x7FEF);
        C.lllllIlllIIl[6] = 0xFFFF96EA & 0x7F3D;
    }

    private static boolean lIIlIIllllIlIIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        C var1;
        if (C.lIIlIIllllIlIII((Object)this.X.activity(), (Object)a.MOTHERLODE_MINE)) {
            return lllllIlllIIl[0];
        }
        if (C.lIIlIIllllIlIIl(var1.Z.K() ? 1 : 0)) {
            return lllllIlllIIl[0];
        }
        return this.t();
    }

    static {
        C.lIIlIIllllIIlll();
    }

    private static boolean lIIlIIllllIlIll(int n2) {
        return n2 != 0;
    }

    protected TileObject u() {
        return this.Z.a(this.X.mlmArea());
    }

    @Inject
    public C(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        this.X = squireMinerConfig;
        this.Y = squireMiner;
        this.Z = t2;
    }

    public abstract boolean t();

    protected TileObject w() {
        WorldPoint worldPoint = new WorldPoint(lllllIlllIIl[5], lllllIlllIIl[6], lllllIlllIIl[0]);
        int[] nArray = new int[lllllIlllIIl[3]];
        nArray[C.lllllIlllIIl[0]] = lllllIlllIIl[4];
        return TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
    }

    private static boolean lIIlIIllllIlIlI(int n2) {
        return n2 <= 0;
    }

    protected TileObject x() {
        C var2;
        if (C.lIIlIIllllIlIlI(this.Z.E())) {
            return this.w();
        }
        if (C.lIIlIIllllIlIll(var2.X.depositUpstairs() ? 1 : 0)) {
            return var2.v();
        }
        return this.w();
    }

    private static boolean lIIlIIllllIlIII(Object object, Object object2) {
        return object != object2;
    }
}

