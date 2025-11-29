/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Keep Back Akkha -> KeepbackakkhaTask */
@TaskDesc(name="Keep Back Akkha", register=true, priority=100, blocking=true)
public class au
extends ap {
    private /* synthetic */ int dj;
    private static /* synthetic */ int[] llIIIIlIIlI;

    private static boolean lIIlllIlIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlllIlIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        boolean var3;
        boolean bl2;
        au var1;
        if (au.lIIlllIlIIIlII(this.cW.keepBack() ? 1 : 0)) {
            return llIIIIlIIlI[0];
        }
        if (au.lIIlllIlIIIllI(var1.bu() ? 1 : 0)) {
            return llIIIIlIIlI[0];
        }
        NPC var8 = var1.J();
        if (au.lIIlllIlIIIlll(var8)) {
            return llIIIIlIIlI[0];
        }
        Log.info((String)(var1.cu.getTickCount() - var1.dj + " since akkha attack"));
        WorldPoint var5 = Players.getLocal().getWorldLocation();
        if (au.lIIlllIlIIIlII(var1.cu.getTickCount() - var1.dj)) {
            bl2 = llIIIIlIIlI[1];
            0;
            if (((0x3A ^ 0x5B ^ (0x10 ^ 0x2B)) & (0x1A ^ 0x72 ^ (0x43 ^ 0x71) ^ -1)) == 3) {
                return ((0xDB ^ 0xB6 ^ 69 + 79 - 134 + 113) & (0x16 ^ 0x6A ^ (0x27 ^ 0x49) ^ -1)) != 0;
            }
        } else {
            bl2 = var3 = llIIIIlIIlI[0];
        }
        if (au.lIIlllIlIIIlII(var8.getWorldArea().isInMeleeDistance(var5) ? 1 : 0) && au.lIIlllIlIIIlII(var3 ? 1 : 0)) {
            return llIIIIlIIlI[0];
        }
        if (au.lIIlllIlIIlIII(var1.cu.getTickCount() - var1.dj, llIIIIlIIlI[2]) && au.lIIlllIlIIIlII(var3 ? 1 : 0)) {
            return llIIIIlIIlI[0];
        }
        if (!au.lIIlllIlIIlIIl(var8.getId(), llIIIIlIIlI[3]) || au.lIIlllIlIIlIlI(var8.getId(), llIIIIlIIlI[4])) {
            return llIIIIlIIlI[0];
        }
        WorldPoint var7 = var5.createWorldArea(llIIIIlIIlI[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (au.lIIlllIlIIIlII(worldPoint2.equals((Object)var5) ? 1 : 0)) {
                bl2 = llIIIIlIIlI[1];
                0;
                if (2 == ((0x51 ^ 0x6C ^ (0xC9 ^ 0xA1)) & (0x95 ^ 0x92 ^ (0xC9 ^ 0x9B) ^ -1))) {
                    return ((0x99 ^ 0xA8 ^ (0x7A ^ 0x53)) & (0x32 ^ 0x12 ^ (0xA6 ^ 0x9E) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIIIlIIlI[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            void var4;
            void var6;
            boolean bl3;
            if (au.lIIlllIlIIIllI(var3 ? 1 : 0)) {
                bl3 = var8.getWorldArea().isInMeleeDistance(worldPoint);
                0;
                if (-(0xA0 ^ 0xA4) >= 0) {
                    return (3 & ~3) != 0;
                }
            } else if (au.lIIlllIlIIllII(var6.getWorldArea().distanceTo((WorldPoint)var4), llIIIIlIIlI[1])) {
                bl3 = llIIIIlIIlI[1];
                0;
                if ((0x6C ^ 0x68) <= ((0x7B ^ 0x41) & ~(0x7C ^ 0x46))) {
                    return false;
                }
            } else {
                bl3 = llIIIIlIIlI[0];
            }
            return bl3;
        }).filter(worldPoint -> NPCs.getAll(nPC -> nPC.getWorldLocation().equals(worldPoint)).isEmpty()).filter(worldPoint -> {
            boolean bl2;
            if (au.lIIlllIlIIIlII(var8.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIIIlIIlI[1];
                0;
                if (1 == 0) {
                    return false;
                }
            } else {
                bl2 = llIIIIlIIlI[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).filter(worldPoint2 -> {
            boolean bl2;
            if (!au.lIIlllIlIIlIIl(worldPoint2.getWorldX(), var5.getWorldX()) || au.lIIlllIlIIlIlI(worldPoint2.getWorldY(), var5.getWorldY())) {
                bl2 = llIIIIlIIlI[1];
                0;
                if (-1 >= 2) {
                    return ((6 ^ 0x6A ^ (8 ^ 0x73)) & (193 + 45 - 228 + 201 ^ 139 + 23 - 23 + 57 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIIIlIIlI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(var8.getWorldLocation()))).orElse(null);
        if (au.lIIlllIlIIIlll(var7)) {
            return llIIIIlIIlI[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(llIIIIlIIlI[1]);
        return llIIIIlIIlI[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2;
        NPC nPC = this.J();
        if (au.lIIlllIlIIlIll(animationChanged.getActor(), nPC)) {
            return;
        }
        if (au.lIIlllIlIIlIlI(var2.getAnimation(), llIIIIlIIlI[5])) {
            return;
        }
        this.dj = this.cu.getTickCount();
    }

    @Inject
    protected au(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlllIlIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIlIIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlllIlIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        au.lIIlllIlIIIIll();
    }

    private static boolean lIIlllIlIIIlll(Object object) {
        return object == null;
    }

    private static boolean lIIlllIlIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlllIlIIIIll() {
        llIIIIlIIlI = new int[6];
        au.llIIIIlIIlI[0] = (0x59 ^ 0x52 ^ (9 ^ 0x41)) & (0x97 ^ 0xB1 ^ (0xF6 ^ 0x93) ^ -1);
        au.llIIIIlIIlI[1] = 1;
        au.llIIIIlIIlI[2] = 0x2E ^ 0x2A;
        au.llIIIIlIIlI[3] = -(0xFFFFDB9B & 0x75E5) & (0xFFFFFFDF & 0x7FAE);
        au.llIIIIlIIlI[4] = -(0xFFFFF4E1 & 0x1B7F) & (0xFFFFBF7F & 0x7EF3);
        au.llIIIIlIIlI[5] = -1;
    }
}

