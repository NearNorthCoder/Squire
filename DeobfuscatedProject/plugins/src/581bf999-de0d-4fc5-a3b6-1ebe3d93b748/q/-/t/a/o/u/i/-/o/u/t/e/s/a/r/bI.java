/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging ba-ba boulder", priority=101)
public class bI
extends bM {
    private static /* synthetic */ int[] llIIIllIlIl;

    private static boolean lIIlllllIIIlll(Object object) {
        return object == null;
    }

    private static void lIIlllllIIIlII() {
        llIIIllIlIl = new int[3];
        bI.llIIIllIlIl[0] = (0x17 ^ 0x47) & ~(0x71 ^ 0x21);
        bI.llIIIllIlIl[1] = 0x6F ^ 0x67;
        bI.llIIIllIlIl[2] = " ".length();
    }

    private static boolean lIIlllllIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected bI(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        bI.lIIlllllIIIlII();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var3_3;
        bI llllllllllllllllIlIIIIllIIlIIIIl;
        if (bI.lIIlllllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        if (bI.lIIlllllIIIlIl(llllllllllllllllIlIIIIllIIlIIIIl.be() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        Set<WorldPoint> llllllllllllllllIlIIIIllIIlIIIII = llllllllllllllllIlIIIIllIIlIIIIl.o(llIIIllIlIl[1]);
        if (bI.lIIlllllIIIlIl(llllllllllllllllIlIIIIllIIlIIIII.isEmpty() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        WorldPoint llllllllllllllllIlIIIIllIIIlllll = Players.getLocal().getWorldLocation();
        if (bI.lIIlllllIIIllI(llllllllllllllllIlIIIIllIIlIIIII.contains(llllllllllllllllIlIIIIllIIIlllll) ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        if (bI.lIIlllllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        WorldPoint llllllllllllllllIlIIIIllIIIllllI = Stream.of(llllllllllllllllIlIIIIllIIIlllll.dy(llIIIllIlIl[2])).filter(Reachable::isWalkable).findFirst().orElse(null);
        if (bI.lIIlllllIIIlll(llllllllllllllllIlIIIIllIIIllllI)) {
            return llIIIllIlIl[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return llIIIllIlIl[2];
    }

    private static boolean lIIlllllIIIlIl(int n2) {
        return n2 != 0;
    }
}

