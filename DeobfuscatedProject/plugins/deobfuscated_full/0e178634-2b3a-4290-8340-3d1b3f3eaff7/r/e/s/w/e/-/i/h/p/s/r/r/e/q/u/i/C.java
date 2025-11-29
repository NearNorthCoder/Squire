/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

/* TASK: Walking on green orbs -> WalkingongreenorbsTask */
@TaskDesc(name="Walking on green orbs", priority=50, blocking=true)
public class C
extends u {
    private static /* synthetic */ int[] lIlIlllIlIIII;
    private static final /* synthetic */ int ah;
    private static final /* synthetic */ int ag;

    private static boolean llIIIIlIIlIllII(Object object, Object object2) {
        return object != object2;
    }

    static {
        C.llIIIIlIIlIIlll();
        ag = lIlIlllIlIIII[4];
        ah = lIlIlllIlIIII[4];
    }

    private static boolean llIIIIlIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlIIlIlIIl(Object object) {
        return object == null;
    }

    private static void llIIIIlIIlIIlll() {
        lIlIlllIlIIII = new int[6];
        C.lIlIlllIlIIII[0] = (73 + 173 - 60 + 45 ^ 95 + 32 - -30 + 17) & (66 + 136 - 192 + 133 ^ 164 + 10 - 170 + 194 ^ -1);
        C.lIlIlllIlIIII[1] = -2;
        C.lIlIlllIlIIII[2] = 134 + 25 - -5 + 32 ^ 78 + 45 - -12 + 58;
        C.lIlIlllIlIIII[3] = 1;
        C.lIlIlllIlIIII[4] = -(0xFFFFEE53 & 0x53AF) & (0xFFFFFFFF & 0xFBD7);
        C.lIlIlllIlIIII[5] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var5_6;
        C llllllllllllllIllIlIIIIIIIIllllI;
        if (C.llIIIIlIIlIlIII(this.W.f() ? 1 : 0)) {
            return lIlIlllIlIIII[0];
        }
        Player var2 = Players.getLocal();
        List var3 = var2.getWorldLocation().dx(lIlIlllIlIIII[1]).dy(lIlIlllIlIIII[1]).createWorldArea(lIlIlllIlIIII[2], lIlIlllIlIIII[2]).toWorldPointList().stream().filter(Reachable::isWalkable).collect(Collectors.toList());
        int[] nArray = new int[lIlIlllIlIIII[3]];
        nArray[C.lIlIlllIlIIII[0]] = lIlIlllIlIIII[4];
        int[] nArray2 = new int[lIlIlllIlIIII[3]];
        nArray2[C.lIlIlllIlIIII[0]] = lIlIlllIlIIII[4];
        TileObject var6 = TileObjects.getAll((int[])nArray).stream().filter(tileObject -> var3.contains(tileObject.getWorldLocation())).max(Comparator.comparingDouble(tileObject -> tileObject.getWorldLocation().distanceTo2DHypotenuse(this.W.j().getWorldLocation()))).orElse(TileObjects.getNearest((int[])nArray2));
        if (C.llIIIIlIIlIlIIl(var6)) {
            return lIlIlllIlIIII[0];
        }
        int var5 = var6.distanceTo((Locatable)var2);
        if (C.llIIIIlIIlIlIlI(var5, lIlIlllIlIIII[5])) {
            WorldPoint var1 = var6.getWorldLocation();
            if (C.llIIIIlIIlIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] nArray3 = new int[lIlIlllIlIIII[3]];
                nArray3[C.lIlIlllIlIIII[0]] = lIlIlllIlIIII[4];
                TileObject var4 = TileObjects.getAll((int[])nArray3).stream().filter(tileObject -> var3.contains(tileObject.getWorldLocation())).filter(tileObject2 -> {
                    boolean bl;
                    if (C.llIIIIlIIlIllII(tileObject2, var6)) {
                        bl = lIlIlllIlIIII[3];
                        0;
                        if (((48 + 52 - 55 + 191 ^ 34 + 77 - -43 + 39) & (89 + 119 - 114 + 38 ^ 111 + 20 - 83 + 121 ^ -1)) != 0) {
                            return ((20 + 22 - -111 + 27 ^ 69 + 129 - 56 + 22) & (0x6B ^ 0x62 ^ (0xB ^ 0x12) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIlllIlIIII[0];
                    }
                    return bl;
                }).max(Comparator.comparingDouble(tileObject -> tileObject.getWorldLocation().distanceTo2DHypotenuse(this.W.j().getWorldLocation()))).orElse(var6);
                var1 = var4.getWorldLocation();
            }
            Movement.setDestination((WorldPoint)var1);
            return lIlIlllIlIIII[3];
        }
        WorldPoint var1 = var3.stream().filter(worldPoint -> TileObjects.getAll(tileObject -> tileObject.getWorldLocation().equals(worldPoint)).isEmpty()).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var6.getWorldLocation()))).orElse(null);
        if (C.llIIIIlIIlIlIIl(var1)) {
            return lIlIlllIlIIII[0];
        }
        Movement.setDestination((WorldPoint)var5_6);
        return lIlIlllIlIIII[3];
    }
}

