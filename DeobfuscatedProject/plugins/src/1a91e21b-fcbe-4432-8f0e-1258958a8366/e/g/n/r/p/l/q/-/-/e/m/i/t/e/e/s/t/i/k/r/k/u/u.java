/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.t;
import java.util.Comparator;
import net.runelite.api.TileObject;

public class u
implements Comparator<TileObject> {
    private static /* synthetic */ int[] lIIllIIllIIll;
    final /* synthetic */ t ae;

    static {
        u.lIlIlllllllIlIl();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((TileObject)object, (TileObject)object2);
    }

    public int a(TileObject tileObject, TileObject tileObject2) {
        Integer n2 = -tileObject.getWorldY() * lIIllIIllIIll[0] + tileObject.getWorldX();
        Integer n3 = -tileObject2.getWorldY() * lIIllIIllIIll[0] + tileObject2.getWorldX();
        return n2.compareTo(n3);
    }

    public u(t t2) {
        this.ae = t2;
    }

    private static void lIlIlllllllIlIl() {
        lIIllIIllIIll = new int[1];
        u.lIIllIIllIIll[0] = 0x37 ^ 0x3D;
    }
}

