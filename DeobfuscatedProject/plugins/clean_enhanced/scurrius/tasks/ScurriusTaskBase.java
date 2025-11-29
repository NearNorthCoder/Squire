/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import gg.squire.scurrius.tasks.ScurriusManager;

public abstract class ScurriusTaskBase
extends Task {
    @Inject
    protected  SquireScurriusConfig b;
    @Inject
    protected  SquireScurrius a;
    
    @Inject
    protected  Client d;

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    protected boolean s() {
        int n2;
        if (i.var3(this.d(this.b.bank().q()) ? 1 : 0) && i.var4(Players.getLocal().distanceTo(this.b.bank().r()), var1[1])) {
            n2 = var1[2];
            0;
            if (2 > 3) {
                return ((0x6A ^ 0x5B) & ~(0x91 ^ 0xA0)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    protected BankLoadout t() {
        return (BankLoadout)this.b.bankLoadout().selected(BankLoadout.class);
    }

    protected abstract boolean a();

    public boolean d(int n2) {
        boolean bl;
        if (i.var2(this.q(), n2)) {
            bl = var1[2];
            0;
            if (-1 > -1) {
                return ((0x8E ^ 0xB9) & ~(0xF0 ^ 0xC7)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static void var5() {
        var1 = new int[3];
        i.var1[0] = (0x17 ^ 0xF) & ~(0x1D ^ 5);
        i.var1[1] = 14 + 146 - 130 + 124 ^ 33 + 86 - -29 + 0;
        i.var1[2] = 1;
    }

    public int q() {
        WorldPoint worldPoint = this.d.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.d.getLocalPlayer().getLocalLocation();
        if (i.var3(this.d.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.d, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    static {
        i.var5();
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (i.var6(this.a.m() ? 1 : 0)) {
            return var1[0];
        }
        return this.a();
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    protected boolean c() {
        if (i.var3(this.d.isInInstancedRegion() ? 1 : 0)) {
            return var1[2];
        }
        if (i.var3(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.F.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return var1[2];
        }
        return var1[0];
    }
}

