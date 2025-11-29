/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Production
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Production;

public class x
extends w {
    private final /* synthetic */ int ax;
    private static /* synthetic */ int[] lIIllIllllll;

    private static boolean llIIllllllllII(Object object) {
        return object == null;
    }

    public int K() {
        return this.ax;
    }

    @Override
    public boolean c(o o2) {
        int[] nArray = new int[lIIllIllllll[0]];
        nArray[x.lIIllIllllll[1]] = this.ax;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (x.llIIllllllllII(tileObject)) {
            return lIIllIllllll[1];
        }
        if (x.llIIllllllllIl(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lIIllIllllll[0];
        }
        tileObject.interact(lIIllIllllll[1]);
        return lIIllIllllll[0];
    }

    private static void llIIlllllllIll() {
        lIIllIllllll = new int[2];
        x.lIIllIllllll[0] = 1;
        x.lIIllIllllll[1] = (117 + 43 - 130 + 130 ^ 134 + 120 - 116 + 4) & (0x21 ^ 0x42 ^ (0x44 ^ 9) ^ -1);
    }

    public x(String string, int n2) {
        super(string);
        this.ax = n2;
    }

    private static boolean llIIllllllllIl(int n2) {
        return n2 != 0;
    }

    static {
        x.llIIlllllllIll();
    }
}

