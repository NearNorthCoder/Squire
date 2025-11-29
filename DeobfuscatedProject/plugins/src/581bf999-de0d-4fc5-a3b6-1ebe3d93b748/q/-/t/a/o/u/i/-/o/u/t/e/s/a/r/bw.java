/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.by;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging ufos", priority=100)
public class bw
extends by {
    private static /* synthetic */ int[] llIIIIlllII;

    @Inject
    protected bw(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static /* synthetic */ int w(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static boolean lIIlllIllIlIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIlllIllIlIII() {
        llIIIIlllII = new int[3];
        bw.llIIIIlllII[0] = (47 + 36 - 22 + 68 ^ 5 + 58 - -69 + 28) & (0x68 ^ 0x1F ^ (0x53 ^ 5) ^ -" ".length());
        bw.llIIIIlllII[1] = 0x6A ^ 0x16 ^ (0x44 ^ 0x3D);
        bw.llIIIIlllII[2] = " ".length();
    }

    private static boolean lIIlllIllIlIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var3_3;
        void llllllllllllllllIlIIIllIIIIlIlII;
        WorldPoint worldPoint2 = Players.getLocal().getWorldLocation();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bw.lIIlllIllIlIlI(fH.contains(tileObject.getId()) ? 1 : 0) && bw.lIIlllIllIlIlI(((GameObject)tileObject).getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                n2 = llIIIIlllII[2];
                "".length();
                if (null != null) {
                    return ((18 + 171 - 38 + 36 ^ 12 + 95 - 17 + 66) & (156 + 174 - 321 + 168 ^ 64 + 0 - -5 + 81 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIIIlllII[0];
            }
            return n2 != 0;
        });
        if (bw.lIIlllIllIlIIl(tileObject2)) {
            return llIIIIlllII[0];
        }
        WorldPoint llllllllllllllllIlIIIllIIIIlIIlI = llllllllllllllllIlIIIllIIIIlIlII.createWorldArea(llIIIIlllII[1]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bw.lIIlllIllIlIIl(TileObjects.getNearest(tileObject -> {
                int n2;
                if (bw.lIIlllIllIlIlI(fH.contains(tileObject.getId()) ? 1 : 0) && bw.lIIlllIllIlIlI(((GameObject)tileObject).getWorldArea().contains(worldPoint) ? 1 : 0)) {
                    n2 = llIIIIlllII[2];
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return ((0x50 ^ 0x17 ^ (0x1E ^ 2)) & (0 ^ 0x44 ^ (0x1D ^ 2) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIIIlllII[0];
                }
                return n2 != 0;
            }))) {
                bl2 = llIIIIlllII[2];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x68 ^ 0x67) & ~(0x47 ^ 0x48)) != 0;
                }
            } else {
                bl2 = llIIIIlllII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(arg_0 -> bw.w((WorldPoint)llllllllllllllllIlIIIllIIIIlIlII, arg_0))).orElse(null);
        if (bw.lIIlllIllIlIIl(llllllllllllllllIlIIIllIIIIlIIlI)) {
            return llIIIIlllII[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return llIIIIlllII[2];
    }

    static {
        bw.lIIlllIllIlIII();
    }
}

