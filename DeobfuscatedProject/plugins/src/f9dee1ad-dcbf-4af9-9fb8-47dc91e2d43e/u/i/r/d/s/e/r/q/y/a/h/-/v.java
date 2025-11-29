/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.h;
import u.i.r.d.s.e.r.q.y.a.h.-.k;
import u.i.r.d.s.e.r.q.y.a.h.-.l;

@TaskDesc(name="Dodging lightning", priority=5, blocking=true, register=true)
public class v
extends Task {
    private static final /* synthetic */ Point aH;
    private final /* synthetic */ SquireAlchemicalHydraConfig aK;
    private static final /* synthetic */ Point[] aI;
    private final /* synthetic */ a aJ;
    private static /* synthetic */ int[] llllIIIllIII;

    private static boolean lIIIllllIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIlIIll(Object object) {
        return object == null;
    }

    @Inject
    public v(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aJ = a2;
        this.aK = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIllllIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIIllllIIIllII() {
        llllIIIllIII = new int[11];
        v.llllIIIllIII[0] = (0xE1 ^ 0xA6) & ~(0x6A ^ 0x2D);
        v.llllIIIllIII[1] = " ".length();
        v.llllIIIllIII[2] = 0xA6 ^ 0x80;
        v.llllIIIllIII[3] = 0x37 ^ 1;
        v.llllIIIllIII[4] = "   ".length();
        v.llllIIIllIII[5] = 0xCD ^ 0xB9 ^ (0x1B ^ 0x4A);
        v.llllIIIllIII[6] = 0 + 121 - 41 + 101 ^ 121 + 3 - 113 + 142;
        v.llllIIIllIII[7] = 0x5C ^ 0x73;
        v.llllIIIllIII[8] = "  ".length();
        v.llllIIIllIII[9] = 0x87 ^ 0xAC;
        v.llllIIIllIII[10] = 182 + 133 - 248 + 118 ^ 135 + 106 - 104 + 14;
    }

    private static boolean lIIIllllIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIIlIIIl(Object object) {
        return object != null;
    }

    static {
        v.lIIIllllIIIllII();
        aH = new Point(llllIIIllIII[2], llllIIIllIII[3]);
        Point[] pointArray = new Point[llllIIIllIII[4]];
        pointArray[v.llllIIIllIII[0]] = new Point(llllIIIllIII[5], llllIIIllIII[3]);
        pointArray[v.llllIIIllIII[1]] = new Point(llllIIIllIII[6], llllIIIllIII[7]);
        pointArray[v.llllIIIllIII[8]] = new Point(llllIIIllIII[9], llllIIIllIII[10]);
        aI = pointArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var1_1;
        v lllllllllllllllIIlIllIIIIlIlIlIl;
        if (!v.lIIIllllIIIllll(this.aJ.g() ? 1 : 0) || v.lIIIllllIIlIIII(this.aK.attack() ? 1 : 0)) {
            return llllIIIllIII[0];
        }
        h lllllllllllllllIIlIllIIIIlIlIlII = lllllllllllllllIIlIllIIIIlIlIlIl.aJ.k();
        if (!v.lIIIllllIIlIIIl(lllllllllllllllIIlIllIIIIlIlIlII) || v.lIIIllllIIlIIlI((Object)lllllllllllllllIIlIllIIIIlIlIlII.S(), (Object)k.LIGHTNING)) {
            return llllIIIllIII[0];
        }
        NPC lllllllllllllllIIlIllIIIIlIlIIll = lllllllllllllllIIlIllIIIIlIlIlII.K();
        if (v.lIIIllllIIlIIll(lllllllllllllllIIlIllIIIIlIlIIll)) {
            return llllIIIllIII[0];
        }
        if (v.lIIIllllIIlIIlI((Object)lllllllllllllllIIlIllIIIIlIlIlII.R(), (Object)l.MOVING)) {
            return llllIIIllIII[0];
        }
        WorldPoint lllllllllllllllIIlIllIIIIlIlIIlI = Players.getLocal().getWorldLocation();
        RegionPoint lllllllllllllllIIlIllIIIIlIlIIIl = new RegionPoint(aH.getX(), aH.getY(), lllllllllllllllIIlIllIIIIlIlIIlI.getPlane(), lllllllllllllllIIlIllIIIIlIlIIlI.getRegionID());
        WorldPoint lllllllllllllllIIlIllIIIIlIlIIII = lllllllllllllllIIlIllIIIIlIlIIIl.toWorld();
        if (v.lIIIllllIIIllll(lllllllllllllllIIlIllIIIIlIlIIII.equals((Object)lllllllllllllllIIlIllIIIIlIlIIlI) ? 1 : 0)) {
            lllllllllllllllIIlIllIIIIlIlIlII.a(l.DONE);
            return llllIIIllIII[0];
        }
        var1_1.d(llllIIIllIII[0]);
        Movement.setDestination((WorldPoint)var5_5);
        return llllIIIllIII[1];
    }
}

