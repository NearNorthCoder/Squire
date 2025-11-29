/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging floor tiles", priority=105, blocking=true)
public class aO
extends aI {
    private static final /* synthetic */ int ef;
    private static final /* synthetic */ List<Integer> ee;
    private static /* synthetic */ int[] llIIIIIIlII;

    private static boolean lIIlllIIIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIlllIIIllIIl() {
        llIIIIIIlII = new int[8];
        aO.llIIIIIIlII[0] = (197 + 46 - 55 + 39 ^ 88 + 82 - 144 + 152) & (80 + 34 - 95 + 178 ^ 110 + 131 - 203 + 110 ^ -" ".length());
        aO.llIIIIIIlII[1] = 0x94 ^ 0x86 ^ (0x44 ^ 0x52);
        aO.llIIIIIIlII[2] = " ".length();
        aO.llIIIIIIlII[3] = -(37 + 128 - 124 + 106 ^ 134 + 104 - 142 + 55);
        aO.llIIIIIIlII[4] = "  ".length();
        aO.llIIIIIIlII[5] = "   ".length();
        aO.llIIIIIIlII[6] = -(0xFFFFFC1E & 0x1BF7) & (0xFFFFFDBD & 0x1FFF);
        aO.llIIIIIIlII[7] = -(0xFFFFDFC7 & 0x7779) & (0xFFFFFFFF & 0x5F7F);
    }

    static {
        aO.lIIlllIIIllIIl();
        ef = llIIIIIIlII[6];
        ee = List.of(Integer.valueOf(llIIIIIIlII[7]));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var4_4;
        aO llllllllllllllllIlIIIlllllIlllll;
        if (aO.lIIlllIIIllIlI(this.cW.redX() ? 1 : 0)) {
            return llIIIIIIlII[0];
        }
        ArrayList llllllllllllllllIlIIIlllllIllllI = new ArrayList();
        AtomicReference<Object> llllllllllllllllIlIIIlllllIlllIl = new AtomicReference<Object>(null);
        llllllllllllllllIlIIIlllllIlllll.cu.getGraphicsObjects().forEach(graphicsObject -> {
            void llllllllllllllllIlIIIlllllIIllll;
            if (aO.lIIlllIIIllIlI(ee.contains(graphicsObject.getId()) ? 1 : 0)) {
                llllllllllllllllIlIIIlllllIllllI.add(WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObject.getLocation()));
                "".length();
            }
            if (aO.lIIlllIIIlllIl(llllllllllllllllIlIIIlllllIIllll.getId(), llIIIIIIlII[6])) {
                void llllllllllllllllIlIIIlllllIlIIII;
                llllllllllllllllIlIIIlllllIlIIII.set(llllllllllllllllIlIIIlllllIIllll.getLocation());
            }
        });
        if (!aO.lIIlllIIIllIll(llllllllllllllllIlIIIlllllIllllI.isEmpty() ? 1 : 0) || aO.lIIlllIIIlllII(llllllllllllllllIlIIIlllllIlllIl.get())) {
            return llIIIIIIlII[0];
        }
        WorldPoint llllllllllllllllIlIIIlllllIlllII = WorldPoint.fromLocal((Client)llllllllllllllllIlIIIlllllIlllll.cu, (LocalPoint)llllllllllllllllIlIIIlllllIlllIl.get());
        WorldPoint[] worldPointArray = new WorldPoint[llIIIIIIlII[1]];
        worldPointArray[aO.llIIIIIIlII[0]] = llllllllllllllllIlIIIlllllIlllII.dx(llIIIIIIlII[1]);
        worldPointArray[aO.llIIIIIIlII[2]] = llllllllllllllllIlIIIlllllIlllII.dx(llIIIIIIlII[3]);
        worldPointArray[aO.llIIIIIIlII[4]] = llllllllllllllllIlIIIlllllIlllII.dy(llIIIIIIlII[1]);
        worldPointArray[aO.llIIIIIIlII[5]] = llllllllllllllllIlIIIlllllIlllII.dy(llIIIIIIlII[3]);
        WorldPoint llllllllllllllllIlIIIlllllIllIll = Stream.of(worldPointArray).filter(worldPoint -> {
            boolean bl2;
            if (aO.lIIlllIIIllIll(llllllllllllllllIlIIIlllllIllllI.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIIIIIlII[2];
                "".length();
                if (null != null) {
                    return ((0x1D ^ 0x57) & ~(0x2F ^ 0x65)) != 0;
                }
            } else {
                bl2 = llIIIIIIlII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
        if (aO.lIIlllIIIlllII(llllllllllllllllIlIIIlllllIllIll)) {
            return llIIIIIIlII[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        return llIIIIIIlII[2];
    }

    @Inject
    protected aO(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlllIIIlllII(Object object) {
        return object == null;
    }
}

