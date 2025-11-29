/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.client.Static
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import net.runelite.api.TileObject;
import net.unethicalite.client.Static;

public class J {
    private /* synthetic */ TileObject W;
    private /* synthetic */ int Z;
    private /* synthetic */ int Y;
    private /* synthetic */ int X;
    private static /* synthetic */ int[] lllIIIIlIlIl;

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

    private static void lIIIlIIIlIIIIII() {
        lllIIIIlIlIl = new int[2];
        J.lllIIIIlIlIl[0] = (60 + 97 - 60 + 156 ^ 9 + 173 - 59 + 72) & (0xC9 ^ 0xC6 ^ (0x6D ^ 0x5C) ^ -1);
        J.lllIIIIlIlIl[1] = -1;
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

