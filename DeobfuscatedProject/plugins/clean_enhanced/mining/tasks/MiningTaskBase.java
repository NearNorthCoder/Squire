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
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public abstract class MiningTaskBase
extends Task {
    protected final  SquireMiner Y;
    protected final  T Z;
    protected final  SquireMinerConfig X;

    protected TileObject v() {
        WorldPoint worldPoint = new WorldPoint(var1[1], var1[2], var1[0]);
        int[] nArray = new int[var1[3]];
        nArray[C.var1[0]] = var1[4];
        return TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
    }

    private static void var2() {
        var1 = new int[7];
        C.var1[0] = (0x62 ^ 0x2C ^ (0xB1 ^ 0xBE)) & (0x39 ^ 0x7D ^ (0x46 ^ 0x43) ^ -1);
        C.var1[1] = 0xFFFFCFAF & 0x3EFB;
        C.var1[2] = -(0xFFFFE58F & 0x7A73) & (0xFFFFF66E & 0x7FBF);
        C.var1[3] = 1;
        C.var1[4] = 0xFFFFEEF3 & 0x793E;
        C.var1[5] = -(0xFFFFFD49 & 0x73F7) & (0xFFFFFFF5 & 0x7FEF);
        C.var1[6] = 0xFFFF96EA & 0x7F3D;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        C var4;
        if (C.var5((Object)this.X.activity(), (Object)a.MOTHERLODE_MINE)) {
            return var1[0];
        }
        if (C.var3(var4.Z.K() ? 1 : 0)) {
            return var1[0];
        }
        return this.t();
    }

    static {
        C.var2();
    }

    private static boolean var6(int n2) {
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
        WorldPoint worldPoint = new WorldPoint(var1[5], var1[6], var1[0]);
        int[] nArray = new int[var1[3]];
        nArray[C.var1[0]] = var1[4];
        return TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
    }

    private static boolean var7(int n2) {
        return n2 <= 0;
    }

    protected TileObject x() {
        C var8;
        if (C.var7(this.Z.E())) {
            return this.w();
        }
        if (C.var6(var8.X.depositUpstairs() ? 1 : 0)) {
            return var8.v();
        }
        return this.w();
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }
}

