/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging dung attack", priority=8, blocking=true)
public class be
extends bh {
    private static final /* synthetic */ int eG;
    private static /* synthetic */ int[] lIlllIIllIl;

    private static boolean lIIllIIlIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIlIIIIlI(Object object) {
        return object == null;
    }

    private static void lIIllIIlIIIIII() {
        lIlllIIllIl = new int[3];
        be.lIlllIIllIl[0] = (32 + 89 - -25 + 51 ^ 34 + 19 - -31 + 46) & (0x95 ^ 0xA8 ^ (0x21 ^ 0x5B) ^ -" ".length());
        be.lIlllIIllIl[1] = " ".length();
        be.lIlllIIllIl[2] = 0xFFFFB7F7 & 0xF9C8;
    }

    private static boolean lIIllIIlIIIIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var1_1;
        be llllllllllllllllIlIIlllIIIIIIIIl;
        if (be.lIIllIIlIIIIIl(this.bR() ? 1 : 0)) {
            return lIlllIIllIl[0];
        }
        WorldPoint llllllllllllllllIlIIlllIIIIIIIII = llllllllllllllllIlIIlllIIIIIIIIl.bT();
        if (be.lIIllIIlIIIIlI(llllllllllllllllIlIIlllIIIIIIIII)) {
            return lIlllIIllIl[0];
        }
        be.f(lIlllIIllIl[1]);
        Movement.setDestination((WorldPoint)var1_1);
        return lIlllIIllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    private int u(WorldPoint worldPoint) {
        double d2 = 0.0;
        Iterator<TileObject> llllllllllllllllIlIIllIlllllIllI = this.bM().iterator();
        while (be.lIIllIIlIIIIll(llllllllllllllllIlIIllIlllllIllI.hasNext() ? 1 : 0)) {
            void llllllllllllllllIlIIllIllllllIII;
            TileObject llllllllllllllllIlIIllIlllllIlIl = llllllllllllllllIlIIllIlllllIllI.next();
            WorldPoint llllllllllllllllIlIIllIlllllIlII = llllllllllllllllIlIIllIlllllIlIl.getWorldLocation();
            llllllllllllllllIlIIllIlllllIlll += (double)llllllllllllllllIlIIllIlllllIlII.distanceToHypotenuse((WorldPoint)llllllllllllllllIlIIllIllllllIII);
            "".length();
            if (" ".length() > -" ".length()) continue;
            return (0xF2 ^ 0xAD) & ~(0x9A ^ 0xC5);
        }
        return (int)d2;
    }

    @Inject
    protected be(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        be.lIIllIIlIIIIII();
        eG = lIlllIIllIl[2];
    }
}

