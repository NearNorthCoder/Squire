/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Dodging falling boulder -> DodgingfallingboulderTask */
@TaskDesc(name="Dodging falling boulder", priority=5)
public class DodgingFallingBoulderTask
extends aI_Unknown {
    private static /* synthetic */ int[] llIIIlllIll;

    @Inject
    protected aN(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        aN.lIIlllllIlIllI();
    }

    @Override
    public boolean bC() {
        aN var1;
        NPC nPC = this.bB();
        if (!aN.lIIlllllIlIlll(nPC) || aN.lIIlllllIllIII(nPC.getWorldArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIlllIll[0];
        }
        int var4 = llIIIlllIll[0];
        Iterator var3 = var1.cu.getGraphicsObjects().iterator();
        while (aN.lIIlllllIllIII(var3.hasNext() ? 1 : 0)) {
            GraphicsObject var2 = (GraphicsObject)var3.next();
            WorldPoint var5 = WorldPoint.fromLocal((Client)var1.cu, (LocalPoint)var2.getLocation());
            if (aN.lIIlllllIllIIl(var2.getId(), llIIIlllIll[1])) {
                0;
                if (3 > 2) continue;
                return false;
            }
            if (aN.lIIlllllIllIlI(var2.getFrame(), llIIIlllIll[2])) {
                0;
                if (((0x7E ^ 0x30) & ~(0x39 ^ 0x77)) <= ((0x5B ^ 0x5F) & ~(0xA6 ^ 0xA2))) continue;
                return false;
            }
            if (aN.lIIlllllIllIII(var5.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var4 = llIIIlllIll[3];
                0;
                if ((87 + 32 - 96 + 158 ^ 20 + 14 - -24 + 119) >= 0) break;
                return (1 & (1 ^ -1)) != 0;
            }
            0;
            if (-(0x54 ^ 0x50) <= 0) continue;
            return false;
        }
        if (aN.lIIlllllIllIII(var4)) {
            var3 = Players.getLocal().getWorldLocation().dx(llIIIlllIll[4]);
            Movement.setDestination((WorldPoint)var3);
            return llIIIlllIll[3];
        }
        return llIIIlllIll[0];
    }

    private static boolean lIIlllllIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllllIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllllIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIlllllIlIllI() {
        llIIIlllIll = new int[5];
        aN.llIIIlllIll[0] = (0xC7 ^ 0x85) & ~(0x3F ^ 0x7D);
        aN.llIIIlllIll[1] = -(0xFFFFCBB7 & 0x7779) & (0xFFFFCBFF & 0x7FFB);
        aN.llIIIlllIll[2] = 0x8E ^ 0xA3;
        aN.llIIIlllIll[3] = 1;
        aN.llIIIlllIll[4] = -1;
    }

    private static boolean lIIlllllIlIlll(Object object) {
        return object != null;
    }
}

