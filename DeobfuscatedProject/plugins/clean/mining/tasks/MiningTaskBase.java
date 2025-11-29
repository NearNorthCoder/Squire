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
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.MiningManager;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public abstract class MiningTaskBase
extends Task {
    protected final  SquireMiner Y;
    protected final  T Z;
    protected final  SquireMinerConfig X;

    protected TileObject v() {
        WorldPoint worldPoint = new WorldPoint(lllllIlllIIl[1], lllllIlllIIl[2], lllllIlllIIl[0]);
        int[] nArray = new int[lllllIlllIIl[3]];
        nArray[C.lllllIlllIIl[0]] = lllllIlllIIl[4];
        return TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
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
    public MiningTaskBase(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
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

