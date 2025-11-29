/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.util.List;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class y
implements o {
    private static /* synthetic */ int[] lIlIIlIIIlIII;
    private final /* synthetic */ String aq;
    private final /* synthetic */ WorldPoint ap;
    private static /* synthetic */ int ah;

    private static boolean lIlllIIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIIllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIIIllllIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        y.lIlllIIIllllIII();
    }

    public y(WorldPoint worldPoint, String string) {
        this.ap = worldPoint;
        this.aq = string;
    }

    private static void lIlllIIIllllIII() {
        lIlIIlIIIlIII = new int[4];
        y.lIlIIlIIIlIII[0] = (0x31 ^ 0x25) & ~(0xBC ^ 0xA8);
        y.lIlIIlIIIlIII[1] = " ".length();
        y.lIlIIlIIIlIII[2] = -" ".length();
        y.lIlIIlIIIlIII[3] = 0x51 ^ 0x6B ^ (0x8E ^ 0xB0);
    }

    @Override
    public boolean D() {
        if (y.lIlllIIIllllIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIIlIII[0];
        }
        if (y.lIlllIIIllllIlI(ah, lIlIIlIIIlIII[1])) {
            ah -= lIlIIlIIIlIII[1];
            return lIlIIlIIIlIII[0];
        }
        if (y.lIlllIIIllllIll(Players.getLocal().getAnimation(), lIlIIlIIIlIII[2])) {
            return lIlIIlIIIlIII[0];
        }
        String[] stringArray = new String[lIlIIlIIIlIII[1]];
        stringArray[y.lIlIIlIIIlIII[0]] = this.aq;
        List list = TileObjects.getAt((WorldPoint)this.ap, (String[])stringArray);
        ((TileObject)list.get(lIlIIlIIIlIII[0])).interact(lIlIIlIIIlIII[0]);
        ah = M.a(lIlIIlIIIlIII[1], lIlIIlIIIlIII[3]);
        return lIlIIlIIIlIII[1];
    }
}

