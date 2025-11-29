/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre.tasks;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import net.runelite.api.TileObject;
import net.unethicalite.client.Static;

public class J {
    private  TileObject W;
    private  int Z;
    private  int Y;
    private  int X;

    public TileObject aI() {
        return this.W;
    }

    public int aG() {
        return this.Y;
    }

    public J(TileObject tileObject) {
        this.W = tileObject;
        this.X = lllIIIIlIlIl[0];
        this.Z = lllIIIIlIlIl[1];
    }

    public int aF() {
        return Static.getClient().getTickCount() - this.X;
    }

    private static boolean lIIIlIIIlIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        J.lIIIlIIIlIIIIII();
    }

    public int aH() {
        return this.Z;
    }

    public void aE() {
        int n2 = Static.getClient().getTickCount();
        int n3 = c.a(this.W);
        if (J.lIIIlIIIlIIIIIl(this.Y, n3)) {
            return;
        }
        this.Z = this.Y;
        this.X = n2;
        this.Y = n3;
    }
}

