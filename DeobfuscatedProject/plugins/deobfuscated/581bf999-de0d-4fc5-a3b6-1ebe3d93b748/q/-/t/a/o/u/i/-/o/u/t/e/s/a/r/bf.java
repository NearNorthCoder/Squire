/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aZ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bb;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bd;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bl;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging projectile", priority=100, register=true, blocking=true)
public class bf
extends bh {
    @Inject
    protected /* synthetic */ bl eH;
    @Inject
    private /* synthetic */ bb eJ;
    @Inject
    private /* synthetic */ bd eK;
    private static /* synthetic */ int[] llIlIllIllI;
    @Inject
    private /* synthetic */ aZ eI;
    private static /* synthetic */ String[] llIlIllIlIl;

    private static boolean lIlIIllllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIllllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllllllIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected bf(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        bf.lIlIIlllllIlll();
        bf.lIlIIlllllIllI();
    }

    private static /* synthetic */ boolean c(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void llllllllllllllllIIllIIIlIllIIllI;
        bf llllllllllllllllIIllIIIlIllIIlll;
        Set<WorldPoint> set = this.bU();
        if (bf.lIlIIllllllIII(set.isEmpty() ? 1 : 0)) {
            return llIlIllIllI[0];
        }
        if (bf.lIlIIllllllIII(llllllllllllllllIIllIIIlIllIIlll.bR() ? 1 : 0)) {
            return llIlIllIllI[0];
        }
        Player llllllllllllllllIIllIIIlIllIIlIl = llllllllllllllllIIllIIIlIllIIlll.cu.getLocalPlayer();
        if (bf.lIlIIllllllIII(llllllllllllllllIIllIIIlIllIIllI.stream().noneMatch(worldPoint -> worldPoint.equals((Object)llllllllllllllllIIllIIIlIllIIlIl.getWorldLocation())) ? 1 : 0)) {
            return llIlIllIllI[0];
        }
        Actor llllllllllllllllIIllIIIlIllIIlII = llllllllllllllllIIllIIIlIllIIlIl.getInteracting();
        NPC llllllllllllllllIIllIIIlIllIIIll = llllllllllllllllIIllIIIlIllIIlll.bO();
        if (bf.lIlIIllllllIIl(llllllllllllllllIIllIIIlIllIIIll)) {
            return llIlIllIllI[0];
        }
        if (bf.lIlIIllllllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        llllllllllllllllIIllIIIlIllIIlll.aY.a(llIlIllIllI[1]);
        WorldPoint llllllllllllllllIIllIIIlIllIIIlI = llllllllllllllllIIllIIIlIllIIlll.bT();
        Comparator<Object> llllllllllllllllIIllIIIlIllIIIIl = Comparator.comparingDouble(object -> ((WorldPoint)object).distanceToPath(this.cu, llllllllllllllllIIllIIIlIllIIlIl.getWorldLocation())).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(llllllllllllllllIIllIIIlIllIIIlI)));
        if (!bf.lIlIIllllllIll(llllllllllllllllIIllIIIlIllIIlII, llllllllllllllllIIllIIIlIllIIIll) || !bf.lIlIIlllllllII(llllllllllllllllIIllIIIlIllIIlII) || bf.lIlIIllllllIII(llllllllllllllllIIllIIIlIllIIlII.getName().toLowerCase().contains(llIlIllIlIl[llIlIllIllI[0]]) ? 1 : 0)) {
            WorldArea llllllllllllllllIIllIIIlIllIIIII = llllllllllllllllIIllIIIlIllIIIll.getWorldArea();
            Stream<WorldPoint> stream = llllllllllllllllIIllIIIlIllIIIII.offset(llIlIllIllI[2]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bf.lIlIIllllllIlI(llllllllllllllllIIllIIIlIllIIIII.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIllIllI[2];
                    0;
                    if (-1 >= ((1 ^ 0x19 ^ (0x44 ^ 0x61)) & (54 + 116 - 112 + 69 ^ (0x10 ^ 0x52) ^ -1))) {
                        return ((0x14 ^ 0x75 ^ (0xA0 ^ 0x8C)) & (179 + 181 - 182 + 58 ^ 54 + 34 - -14 + 59 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIllIllI[0];
                }
                return bl2;
            });
            WorldArea worldArea = llllllllllllllllIIllIIIlIllIIIII;
            Objects.requireNonNull(worldArea);
            0;
            WorldPoint llllllllllllllllIIllIIIlIlIlllll = stream.filter(arg_0 -> ((WorldArea)worldArea).isInMeleeDistance(arg_0)).filter(arg_0 -> bf.e((Set)llllllllllllllllIIllIIIlIllIIllI, arg_0)).filter(Reachable::isWalkable).min(llllllllllllllllIIllIIIlIllIIIIl).orElse(null);
            if (bf.lIlIIllllllIIl(llllllllllllllllIIllIIIlIlIlllll)) {
                llllllllllllllllIIllIIIlIlIlllll = llllllllllllllllIIllIIIlIllIIIII.offset(llIlIllIllI[3]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bf.lIlIIllllllIlI(llllllllllllllllIIllIIIlIllIIIII.contains(worldPoint) ? 1 : 0)) {
                        bl2 = llIlIllIllI[2];
                        0;
                        if (null != null) {
                            return ((0x18 ^ 0x37) & ~(0x57 ^ 0x78)) != 0;
                        }
                    } else {
                        bl2 = llIlIllIllI[0];
                    }
                    return bl2;
                }).filter(arg_0 -> bf.d((Set)llllllllllllllllIIllIIIlIllIIllI, arg_0)).filter(Reachable::isWalkable).min(llllllllllllllllIIllIIIlIllIIIIl).orElse(null);
                if (bf.lIlIIllllllIIl(llllllllllllllllIIllIIIlIlIlllll) && bf.lIlIIllllllIIl(llllllllllllllllIIllIIIlIlIlllll = (WorldPoint)llllllllllllllllIIllIIIlIllIIlIl.getWorldArea().offset(llIlIllIllI[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bf.lIlIIllllllIlI(llllllllllllllllIIllIIIlIllIIIII.contains(worldPoint) ? 1 : 0)) {
                        bl2 = llIlIllIllI[2];
                        0;
                        if (-1 > ((0x9E ^ 0xC2) & ~(0x1E ^ 0x42))) {
                            return ((0x46 ^ 0x68) & ~(0xB5 ^ 0x9B)) != 0;
                        }
                    } else {
                        bl2 = llIlIllIllI[0];
                    }
                    return bl2;
                }).filter(arg_0 -> bf.c((Set)llllllllllllllllIIllIIIlIllIIllI, arg_0)).filter(Reachable::isWalkable).min(llllllllllllllllIIllIIIlIllIIIIl).orElse(null))) {
                    return llIlIllIllI[0];
                }
                llllllllllllllllIIllIIIlIllIIlll.eI.sleep(llIlIllIllI[4]);
            }
            Movement.setDestination((WorldPoint)llllllllllllllllIIllIIIlIlIlllll);
            return llIlIllIllI[2];
        }
        WorldPoint llllllllllllllllIIllIIIlIllIIIII = llllllllllllllllIIllIIIlIllIIlII.getWorldArea().offset(llIlIllIllI[2]).toWorldPointList().stream().filter(Reachable::isWalkable).filter(arg_0 -> bf.b((Set)llllllllllllllllIIllIIIlIllIIllI, arg_0)).filter(worldPoint -> llllllllllllllllIIllIIIlIllIIlII.getWorldArea().isInMeleeDistance(worldPoint)).filter(worldPoint -> {
            boolean bl2;
            if (bf.lIlIIllllllIlI(llllllllllllllllIIllIIIlIllIIlII.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = llIlIllIllI[2];
                0;
                if (2 >= (7 + 21 - -134 + 24 ^ 148 + 162 - 284 + 164)) {
                    return ((105 + 31 - 122 + 234 ^ 94 + 118 - 45 + 3) & (0x76 ^ 0x7B ^ (0xDA ^ 0x85) ^ -1)) != 0;
                }
            } else {
                bl2 = llIlIllIllI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(llllllllllllllllIIllIIIlIllIIlIl.getWorldLocation()))).orElse(llllllllllllllllIIllIIIlIllIIlII.getWorldLocation());
        Movement.setDestination((WorldPoint)llllllllllllllllIIllIIIlIllIIIII);
        if (bf.lIlIIllllllIlI(llllllllllllllllIIllIIIlIllIIlII.getWorldArea().isInMeleeDistance(llllllllllllllllIIllIIIlIllIIIII) ? 1 : 0)) {
            llllllllllllllllIIllIIIlIllIIlll.eJ.sleep(llIlIllIllI[3]);
            llllllllllllllllIIllIIIlIllIIlll.eK.sleep(llIlIllIllI[3]);
        }
        return llIlIllIllI[2];
    }

    private static /* synthetic */ boolean e(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    private static /* synthetic */ boolean d(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    private static void lIlIIlllllIllI() {
        llIlIllIlIl = new String[llIlIllIllI[2]];
        bf.llIlIllIlIl[bf.llIlIllIllI[0]] = bf."egg";
    }

    private static String lIlIIlllllIlIl(String llllllllllllllllIIllIIIlIIlllIll, String llllllllllllllllIIllIIIlIIlllIlI) {
        llllllllllllllllIIllIIIlIIlllIll = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIlIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIlIIlllllI = new StringBuilder();
        char[] llllllllllllllllIIllIIIlIIllllIl = llllllllllllllllIIllIIIlIIlllIlI.toCharArray();
        int llllllllllllllllIIllIIIlIIllllII = llIlIllIllI[0];
        char[] llllllllllllllllIIllIIIlIIllIllI = llllllllllllllllIIllIIIlIIlllIll.toCharArray();
        int llllllllllllllllIIllIIIlIIllIlIl = llllllllllllllllIIllIIIlIIllIllI.length;
        int llllllllllllllllIIllIIIlIIllIlII = llIlIllIllI[0];
        while (bf.lIlIIlllllllIl(llllllllllllllllIIllIIIlIIllIlII, llllllllllllllllIIllIIIlIIllIlIl)) {
            char llllllllllllllllIIllIIIlIlIIIIIl = llllllllllllllllIIllIIIlIIllIllI[llllllllllllllllIIllIIIlIIllIlII];
            llllllllllllllllIIllIIIlIIlllllI.append((char)(llllllllllllllllIIllIIIlIlIIIIIl ^ llllllllllllllllIIllIIIlIIllllIl[llllllllllllllllIIllIIIlIIllllII % llllllllllllllllIIllIIIlIIllllIl.length]));
            0;
            ++llllllllllllllllIIllIIIlIIllllII;
            ++llllllllllllllllIIllIIIlIIllIlII;
            0;
            if (((0x25 ^ 0x2C ^ (0x9E ^ 0x91)) & (2 ^ (0xA1 ^ 0xA5) ^ -1)) <= 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIIlIIlllllI);
    }

    private static void lIlIIlllllIlll() {
        llIlIllIllI = new int[5];
        bf.llIlIllIllI[0] = (0x75 ^ 9 ^ (0xEC ^ 0xB1)) & (0x54 ^ 0x12 ^ (0xE6 ^ 0x81) ^ -1);
        bf.llIlIllIllI[1] = 0xAE ^ 0x9E;
        bf.llIlIllIllI[2] = 1;
        bf.llIlIllIllI[3] = 3;
        bf.llIlIllIllI[4] = 0x9D ^ 0x98;
    }

    private static boolean lIlIIlllllllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIllllllIII(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean b(Set set, WorldPoint worldPoint) {
        boolean bl2;
        if (bf.lIlIIllllllIlI(set.contains(worldPoint) ? 1 : 0)) {
            bl2 = llIlIllIllI[2];
            0;
            if (1 <= ((0x3B ^ 3) & ~(0x37 ^ 0xF))) {
                return ((0xAE ^ 0xAA) & ~(0x9A ^ 0x9E)) != 0;
            }
        } else {
            bl2 = llIlIllIllI[0];
        }
        return bl2;
    }

    private static boolean lIlIIlllllllIl(int n2, int n3) {
        return n2 < n3;
    }
}

