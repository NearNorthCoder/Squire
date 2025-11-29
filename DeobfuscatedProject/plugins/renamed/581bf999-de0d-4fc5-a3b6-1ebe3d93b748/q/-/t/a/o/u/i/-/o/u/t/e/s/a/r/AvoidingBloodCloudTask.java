/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Avoiding Blood Cloud -> AvoidingbloodcloudTask */
@TaskDesc(name="Avoiding Blood Cloud", priority=15, blocking=true)
public class AvoidingBloodCloudTask
extends bX_Unknown {
    private static /* synthetic */ int[] llIIIIIIlll;

    private static void lIIlllIIlIIIII() {
        llIIIIIIlll = new int[4];
        bO.llIIIIIIlll[0] = (0x7A ^ 0x26) & ~(0x35 ^ 0x69);
        bO.llIIIIIIlll[1] = 2;
        bO.llIIIIIIlll[2] = 3;
        bO.llIIIIIIlll[3] = 1;
    }

    @Inject
    protected bO(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlllIIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        bO.lIIlllIIlIIIII();
    }

    private static boolean lIIlllIIlIIIIl(Object object) {
        return object == null;
    }

    private static /* synthetic */ double h(NPC nPC, WorldPoint worldPoint) {
        return worldPoint.distanceTo2DHypotenuse(nPC.getWorldLocation());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        void var2_2;
        bO llllllllllllllllIlIIIllllIllllll;
        void var4;
        NPC nPC = this.cA();
        if (bO.lIIlllIIlIIIIl(nPC)) {
            return llIIIIIIlll[0];
        }
        Player var2 = Players.getLocal();
        if (bO.lIIlllIIlIIIlI(var4.distanceTo((Locatable)var2), llIIIIIIlll[1])) {
            return llIIIIIIlll[0];
        }
        WorldArea var3 = var2.getWorldArea().offset(llIIIIIIlll[2]);
        WorldPoint var1 = var3.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bO.lIIlllIIlIIIll(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIIIIIIlll[3];
                0;
                if (1 == 2) {
                    return false;
                }
            } else {
                bl2 = llIIIIIIlll[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).max(Comparator.comparingDouble(arg_0 -> bO.h((NPC)var4, arg_0))).orElse(null);
        if (bO.lIIlllIIlIIIIl(var1)) {
            return llIIIIIIlll[0];
        }
        worldPoint2 = this.C(var2_2.getWorldLocation(), worldPoint2);
        Movement.setDestination((WorldPoint)worldPoint2);
        return llIIIIIIlll[3];
    }
}

