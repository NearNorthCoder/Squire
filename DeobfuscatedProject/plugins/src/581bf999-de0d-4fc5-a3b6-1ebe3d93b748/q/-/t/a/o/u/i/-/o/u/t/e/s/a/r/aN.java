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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging falling boulder", priority=5)
public class aN
extends aI {
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
        aN llllllllllllllllIlIIIIlIlIllllll;
        NPC nPC = this.bB();
        if (!aN.lIIlllllIlIlll(nPC) || aN.lIIlllllIllIII(nPC.getWorldArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIlllIll[0];
        }
        int llllllllllllllllIlIIIIlIlIllllIl = llIIIlllIll[0];
        Iterator llllllllllllllllIlIIIIlIlIllllII = llllllllllllllllIlIIIIlIlIllllll.cu.getGraphicsObjects().iterator();
        while (aN.lIIlllllIllIII(llllllllllllllllIlIIIIlIlIllllII.hasNext() ? 1 : 0)) {
            GraphicsObject llllllllllllllllIlIIIIlIlIlllIll = (GraphicsObject)llllllllllllllllIlIIIIlIlIllllII.next();
            WorldPoint llllllllllllllllIlIIIIlIlIlllIlI = WorldPoint.fromLocal((Client)llllllllllllllllIlIIIIlIlIllllll.cu, (LocalPoint)llllllllllllllllIlIIIIlIlIlllIll.getLocation());
            if (aN.lIIlllllIllIIl(llllllllllllllllIlIIIIlIlIlllIll.getId(), llIIIlllIll[1])) {
                "".length();
                if ("   ".length() > "  ".length()) continue;
                return ((0xD0 ^ 0x9D) & ~(0x37 ^ 0x7A)) != 0;
            }
            if (aN.lIIlllllIllIlI(llllllllllllllllIlIIIIlIlIlllIll.getFrame(), llIIIlllIll[2])) {
                "".length();
                if (((0x7E ^ 0x30) & ~(0x39 ^ 0x77)) <= ((0x5B ^ 0x5F) & ~(0xA6 ^ 0xA2))) continue;
                return ((0xED ^ 0xA7) & ~(0x1D ^ 0x57)) != 0;
            }
            if (aN.lIIlllllIllIII(llllllllllllllllIlIIIIlIlIlllIlI.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllllllllllllllIlIIIIlIlIllllIl = llIIIlllIll[3];
                "".length();
                if ((87 + 32 - 96 + 158 ^ 20 + 14 - -24 + 119) >= 0) break;
                return (" ".length() & (" ".length() ^ -" ".length())) != 0;
            }
            "".length();
            if (-(0x54 ^ 0x50) <= 0) continue;
            return ((0xF1 ^ 0xAE) & ~(0x25 ^ 0x7A)) != 0;
        }
        if (aN.lIIlllllIllIII(llllllllllllllllIlIIIIlIlIllllIl)) {
            llllllllllllllllIlIIIIlIlIllllII = Players.getLocal().getWorldLocation().dx(llIIIlllIll[4]);
            Movement.setDestination((WorldPoint)llllllllllllllllIlIIIIlIlIllllII);
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
        aN.llIIIlllIll[3] = " ".length();
        aN.llIIIlllIll[4] = -" ".length();
    }

    private static boolean lIIlllllIlIlll(Object object) {
        return object != null;
    }
}

