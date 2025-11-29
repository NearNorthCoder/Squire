package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GroundObject;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;
@Singleton
@TaskDesc(name = "Escaping hazard", priority = 8)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/u.class */
public class C0020u extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlllIIIlI;
    private final /* synthetic */ C0001b bD;

    private static boolean lllllllIlIllIl(int i) {
        return i != 0;
    }

    public List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        WorldPoint worldPoint3 = worldPoint2;
        int i = llIIlllIIIlI[1];
        LinkedList linkedList = new LinkedList();
        linkedList.add(worldPoint2);
        "".length();
        do {
            WorldPoint dy = worldPoint3.dx((int) Math.signum(worldPoint.getX() - worldPoint3.getX())).dy((int) Math.signum(worldPoint.getY() - worldPoint3.getY()));
            worldPoint3 = dy;
            if (lllllllIlIllll(dy.equals(worldPoint) ? 1 : 0)) {
                int i2 = i;
                i++;
                if (lllllllIllIIlI(i2, llIIlllIIIlI[8])) {
                    linkedList.add(worldPoint3);
                    "".length();
                    "".length();
                }
            }
            linkedList.add(worldPoint);
            "".length();
            Collections.reverse(linkedList);
            return linkedList;
        } while (0 == 0);
        return null;
    }

    private static boolean lllllllIllIIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean j(WorldPoint worldPoint) {
        C0007h V = this.ba.V();
        if (lllllllIlIlIll(V)) {
            return llIIlllIIIlI[1];
        }
        C0011l aq = V.aq();
        int aM = aq.aM() + llIIlllIIIlI[4];
        int aN = aq.aN() + llIIlllIIIlI[4];
        int i = aM + llIIlllIIIlI[6];
        int i2 = aN + llIIlllIIIlI[6];
        if (lllllllIllIIll(worldPoint.getX(), aM) && lllllllIllIIll(worldPoint.getY(), aN) && lllllllIlIlllI(worldPoint.getX(), i) && lllllllIlIlllI(worldPoint.getY(), i2)) {
            ?? r0 = llIIlllIIIlI[0];
            "".length();
            return (164 ^ 160) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlllIIIlI[1];
    }

    private static boolean lllllllIllIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllllIlIlIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Player local = Players.getLocal();
        if (lllllllIlIlIll(local)) {
            return llIIlllIIIlI[1];
        }
        WorldPoint destination = Movement.getDestination();
        NPC m = m(local.getWorldLocation());
        boolean n2 = n(local.getWorldLocation());
        if (lllllllIlIllII(m)) {
            i = m.getWorldLocation().distanceTo(local.getWorldLocation());
            "".length();
            if (("  ".length() & ("  ".length() ^ (-1)) & (((6 ^ 13) & ((203 ^ 192) ^ (-1))) ^ (-1))) > " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIlllIIIlI[2];
        }
        int i7 = i;
        boolean safeBossFight = this.ba.h().safeBossFight();
        if (lllllllIlIllIl(safeBossFight ? 1 : 0)) {
            i2 = llIIlllIIIlI[3];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = llIIlllIIIlI[4];
        }
        int i8 = i2;
        if (lllllllIlIllII(m) && lllllllIlIlllI(i7, i8)) {
            i3 = llIIlllIIIlI[0];
            "".length();
            if (!(true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i3 = llIIlllIIIlI[1];
        }
        int i9 = i3;
        if (lllllllIlIllll(l(local.getWorldLocation()) ? 1 : 0)) {
            i4 = llIIlllIIIlI[0];
            "".length();
            if ((((((73 + 88) - 88) + 57) ^ (((5 + 42) - (-43)) + 70)) & (((((28 + 55) - 16) + 63) ^ (((118 + 16) - 79) + 105)) ^ (-" ".length()))) != 0) {
                return ((31 ^ 51) ^ (89 ^ 32)) & (((((108 + 133) - 195) + 209) ^ (((105 + 142) - 85) + 8)) ^ (-" ".length()));
            }
        } else {
            i4 = llIIlllIIIlI[1];
        }
        int i10 = i4;
        if (lllllllIlIllII(destination) && lllllllIlIlIll(local.getInteracting()) && lllllllIlIllIl(local.isMoving() ? 1 : 0) && lllllllIlIllll(destination.equals(local.getWorldLocation()) ? 1 : 0) && lllllllIlIllIl(d(c(destination, local.getWorldLocation())) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        if (!lllllllIlIllll(i10) || lllllllIlIllIl(n2 ? 1 : 0)) {
            WorldPoint k = k(local.getWorldLocation());
            if (!lllllllIlIllll(n2 ? 1 : 0) || lllllllIllIIII(this.bD.z(), this.ba.X().aK() + llIIlllIIIlI[3])) {
                i5 = llIIlllIIIlI[0];
                "".length();
                if ((-"  ".length()) >= 0) {
                    return ((((107 + 4) - 18) + 125) ^ (((30 + 107) - 64) + 74)) & (((((83 + 117) - 157) + 151) ^ (((128 + 128) - 208) + 91)) ^ (-" ".length()));
                }
            } else {
                i5 = llIIlllIIIlI[1];
            }
            if (lllllllIlIllII(k) && (!lllllllIlIllIl(k.equals(destination) ? 1 : 0) || lllllllIlIllll(local.isMoving() ? 1 : 0))) {
                ScenePoint fromWorld = ScenePoint.fromWorld(k);
                Movement.setDestination(fromWorld.getX(), fromWorld.getY());
                return llIIlllIIIlI[0];
            }
        }
        if (lllllllIlIllII(m)) {
            if (lllllllIllIIIl(this.ba.X().aD(), HeadIcon.RANGED) && lllllllIlIlIll(Equipment.fromSlot(EquipmentInventorySlot.WEAPON)) && lllllllIlIllll(safeBossFight ? 1 : 0)) {
                i6 = llIIlllIIIlI[0];
                "".length();
                if ((-((162 ^ 177) ^ (37 ^ 50))) >= 0) {
                    return ((((55 + 52) - 59) + 84) ^ (((61 + 38) - 84) + 146)) & (((((177 + 183) - 206) + 77) ^ (((24 + 68) - (-43)) + 59)) ^ (-" ".length()));
                }
            } else {
                i6 = llIIlllIIIlI[1];
            }
            int i11 = i6;
            WorldPoint i12 = i(local.getWorldLocation());
            if (lllllllIlIllII(i12)) {
                int distanceTo = m.getWorldLocation().distanceTo(i12);
                if (!lllllllIlIllll(i9) || (lllllllIlIllll(i11) && lllllllIlIllIl(this.bD.t() ? 1 : 0) && lllllllIllIIII(distanceTo, i7))) {
                    ScenePoint fromWorld2 = ScenePoint.fromWorld(i12);
                    Movement.setDestination(fromWorld2.getX(), fromWorld2.getY());
                    return llIIlllIIIlI[0];
                }
            }
        }
        return llIIlllIIIlI[1];
    }

    static {
        lllllllIlIlIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean n(WorldPoint worldPoint) {
        C0009j X = this.ba.X();
        if (lllllllIlIlIll(X)) {
            return llIIlllIIIlI[1];
        }
        NPC aI = X.aI();
        return lllllllIlIlIll(aI) ? llIIlllIIIlI[1] : aI.getWorldArea().toWorldPointList().contains(worldPoint);
    }

    private static boolean lllllllIllIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0020u(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllIIIlI[0]];
        enumC0003dArr[llIIlllIIIlI[1]] = EnumC0003d.BOSS_FIGHT;
        this.bD = c0001b;
    }

    private static void lllllllIlIlIlI() {
        llIIlllIIIlI = new int[10];
        llIIlllIIIlI[0] = " ".length();
        llIIlllIIIlI[1] = (147 ^ 183) & ((51 ^ 23) ^ (-1));
        llIIlllIIIlI[2] = (-17433) & 18431;
        llIIlllIIIlI[3] = "   ".length();
        llIIlllIIIlI[4] = "  ".length();
        llIIlllIIIlI[5] = -" ".length();
        llIIlllIIIlI[6] = 26 ^ 17;
        llIIlllIIIlI[7] = (72 ^ 40) ^ (71 ^ 43);
        llIIlllIIIlI[8] = (((53 + 143) - (-4)) + 1) ^ (((118 + 116) - 120) + 59);
        llIIlllIIIlI[9] = -"   ".length();
    }

    private static boolean lllllllIlIlllI(int i, int i2) {
        return i <= i2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lllllllIlIllIl(C0004e.ax.contains(Integer.valueOf(npcSpawned.getNpc().getId())) ? 1 : 0)) {
            this.bD.a(npcSpawned.getNpc());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean o(WorldPoint worldPoint) {
        if (lllllllIlIllIl(j(worldPoint) ? 1 : 0) && lllllllIlIllIl(l(worldPoint) ? 1 : 0) && lllllllIlIllll(n(worldPoint) ? 1 : 0)) {
            ?? r0 = llIIlllIIIlI[0];
            "".length();
            return (106 ^ 110) < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlllIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorldPoint k(WorldPoint worldPoint) {
        if (lllllllIlIlIll(worldPoint)) {
            return null;
        }
        int i = llIIlllIIIlI[0];
        while (lllllllIlIlllI(i, llIIlllIIIlI[7])) {
            int i2 = -i;
            while (lllllllIlIlllI(i2, i)) {
                int i3 = -i;
                while (lllllllIlIlllI(i3, i)) {
                    if (lllllllIllIlII(Math.abs(i2), i) && lllllllIllIlII(Math.abs(i3), i)) {
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return null;
                        }
                    } else {
                        WorldPoint dy = worldPoint.dx(i2).dy(i3);
                        if (lllllllIlIllIl(j(dy) ? 1 : 0) && lllllllIlIllIl(l(dy) ? 1 : 0) && lllllllIlIllll(n(dy) ? 1 : 0)) {
                            return dy;
                        }
                    }
                    i3++;
                    "".length();
                    if (((4 ^ 36) & ((187 ^ 155) ^ (-1))) < 0) {
                        return null;
                    }
                }
                i2++;
                "".length();
                if (" ".length() < (-" ".length())) {
                    return null;
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return null;
    }

    public WorldPoint i(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        int i = llIIlllIIIlI[5];
        while (lllllllIlIlllI(i, llIIlllIIIlI[0])) {
            int i2 = llIIlllIIIlI[5];
            while (lllllllIlIlllI(i2, llIIlllIIIlI[0])) {
                linkedList.add(a(new AbstractMap.SimpleEntry<>(worldPoint, Integer.valueOf(llIIlllIIIlI[2])), i, i2));
                "".length();
                i2++;
                "".length();
                if ((((((175 + 25) - 143) + 136) ^ (((49 + 42) - 87) + 144)) & (((((199 + 81) - 211) + 157) ^ (((45 + 154) - 22) + 6)) ^ (-" ".length()))) != 0) {
                    return null;
                }
            }
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        Comparator comparingInt = Comparator.comparingInt((v0) -> {
            return v0.getValue();
        });
        Comparator.comparingInt(simpleEntry -> {
            return (int) ((WorldPoint) simpleEntry.getKey()).distanceToHypotenuse(worldPoint);
        });
        C0009j X = this.ba.X();
        return (WorldPoint) linkedList.stream().filter((v0) -> {
            return Objects.nonNull(v0);
        }).filter(simpleEntry2 -> {
            if (lllllllIlIllll(((WorldPoint) simpleEntry2.getKey()).equals(worldPoint) ? 1 : 0)) {
                ?? r0 = llIIlllIIIlI[0];
                "".length();
                return (((((21 + 49) - 42) + 185) ^ (((97 + 23) - 61) + 94)) & (((196 ^ 141) ^ (89 ^ 92)) ^ (-" ".length()))) >= "  ".length() ? ((((220 + 228) - 375) + 171) ^ (((33 + 103) - (-35)) + 23)) & (((10 ^ 49) ^ (117 ^ 120)) ^ (-" ".length())) : r0;
            }
            return llIIlllIIIlI[1];
        }).max(comparingInt.thenComparing(Comparator.comparingInt(simpleEntry3 -> {
            return (int) ((WorldPoint) simpleEntry3.getKey()).distanceToHypotenuse(X.aI().getWorldLocation());
        }))).map((v0) -> {
            return v0.getKey();
        }).orElse(null);
    }

    private static boolean lllllllIllIIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v93, types: [boolean] */
    public boolean d(List<WorldPoint> list) {
        int i;
        int i2;
        boolean n2 = n(list.get(llIIlllIIIlI[1]));
        if (lllllllIlIllll(l(list.get(llIIlllIIIlI[1])) ? 1 : 0)) {
            i = llIIlllIIIlI[0];
            "".length();
            if ((((251 ^ 148) ^ (100 ^ 17)) & (((82 ^ 118) ^ (46 ^ 16)) ^ (-" ".length()))) >= "  ".length()) {
                return ((((143 + 115) - 194) + 157) ^ (((89 + 46) - 84) + 107)) & (((121 ^ 88) ^ (204 ^ 174)) ^ (-" ".length()));
            }
        } else {
            i = llIIlllIIIlI[1];
        }
        int i3 = i;
        for (WorldPoint worldPoint : list) {
            if (lllllllIlIllll(l(worldPoint) ? 1 : 0)) {
                i2 = llIIlllIIIlI[0];
                "".length();
                if ("   ".length() <= (-" ".length())) {
                    return ((8 ^ 91) ^ (25 ^ 3)) & (((249 ^ 158) ^ (11 ^ 37)) ^ (-" ".length()));
                }
            } else {
                i2 = llIIlllIIIlI[1];
            }
            int i4 = i2;
            boolean n3 = n(worldPoint);
            if (lllllllIlIllIl(i3) && lllllllIlIllll(i4)) {
                i3 = llIIlllIIIlI[1];
                "".length();
                if ((((100 ^ 127) ^ (1 ^ 30)) & (((((44 + 89) - 8) + 29) ^ (((51 + 44) - 80) + 143)) ^ (-" ".length()))) != 0) {
                    return ((((38 + 143) - 149) + 137) ^ (((7 + 36) - (-76)) + 22)) & (((((147 + 114) - 234) + 153) ^ (((91 + 70) - 100) + 83)) ^ (-" ".length()));
                }
            } else if (lllllllIlIllIl(i4)) {
                return llIIlllIIIlI[1];
            }
            if (lllllllIlIllIl(n2 ? 1 : 0) && lllllllIlIllll(n3 ? 1 : 0)) {
                n2 = llIIlllIIIlI[1];
                "".length();
                if (0 != 0) {
                    return ((((51 + 52) - (-29)) + 48) ^ (((63 + 54) - (-42)) + 30)) & (((51 ^ 28) ^ (60 ^ 26)) ^ (-" ".length()));
                }
            } else if (lllllllIlIllIl(n3 ? 1 : 0)) {
                return llIIlllIIIlI[1];
            }
            "".length();
            if (" ".length() == ((104 ^ 65) & ((68 ^ 109) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lllllllIlIllll(n(list.get(list.size() - llIIlllIIIlI[0])) ? 1 : 0) && lllllllIlIllIl(l(list.get(list.size() - llIIlllIIIlI[0])) ? 1 : 0)) {
            ?? r0 = llIIlllIIIlI[0];
            "".length();
            return (((10 ^ 34) ^ (150 ^ 132)) & (((94 ^ 68) ^ (189 ^ 157)) ^ (-" ".length()))) < 0 ? ((204 ^ 184) ^ (90 ^ 24)) & (((((99 + 25) - 68) + 114) ^ (((74 + 92) - 30) + 20)) ^ (-" ".length())) : r0;
        }
        return llIIlllIIIlI[1];
    }

    private static boolean lllllllIlIllII(Object obj) {
        return obj != null;
    }

    private AbstractMap.SimpleEntry<WorldPoint, Integer> a(AbstractMap.SimpleEntry<WorldPoint, Integer> simpleEntry, int i, int i2) {
        int i3;
        int intValue;
        if (lllllllIlIllll(i) && lllllllIlIllll(i2)) {
            return null;
        }
        WorldPoint dy = simpleEntry.getKey().dx(i).dy(i2);
        if (lllllllIlIllll(n(dy) ? 1 : 0) && lllllllIlIllIl(l(dy) ? 1 : 0) && !lllllllIlIllll(j(dy) ? 1 : 0)) {
            NPC m = m(dy);
            if (lllllllIlIllII(m)) {
                i3 = (int) m.getWorldLocation().distanceToHypotenuse(dy);
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                i3 = llIIlllIIIlI[2];
            }
            int i4 = i3;
            if (lllllllIllIIlI(i4, simpleEntry.getValue().intValue())) {
                intValue = i4;
                "".length();
                if (((((36 + 15) - (-111)) + 24) ^ (((159 + 55) - 166) + 142)) < "   ".length()) {
                    return null;
                }
            } else {
                intValue = simpleEntry.getValue().intValue();
            }
            int lllllllllllllllIlIIlIIlllIIllIII = intValue;
            AbstractMap.SimpleEntry<WorldPoint, Integer> simpleEntry2 = new AbstractMap.SimpleEntry<>(dy, Integer.valueOf(lllllllllllllllIlIIlIIlllIIllIII));
            LinkedList linkedList = new LinkedList();
            linkedList.add(a(simpleEntry2, i, i2));
            "".length();
            if (lllllllIlIllll(i)) {
                linkedList.add(a(simpleEntry2, llIIlllIIIlI[0], i2));
                "".length();
                linkedList.add(a(simpleEntry2, llIIlllIIIlI[5], i2));
                "".length();
            }
            if (lllllllIlIllll(i2)) {
                linkedList.add(a(simpleEntry2, i, llIIlllIIIlI[0]));
                "".length();
                linkedList.add(a(simpleEntry2, i, llIIlllIIIlI[5]));
                "".length();
            }
            return (AbstractMap.SimpleEntry) linkedList.stream().filter((v0) -> {
                return Objects.nonNull(v0);
            }).max(Comparator.comparingInt((v0) -> {
                return v0.getValue();
            }).thenComparing(Comparator.comparingInt(simpleEntry3 -> {
                return (int) ((WorldPoint) simpleEntry3.getKey()).distanceToHypotenuse((WorldPoint) simpleEntry.getKey());
            }))).orElse(null);
        }
        return simpleEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean l(WorldPoint worldPoint) {
        Tile at = Tiles.getAt(worldPoint);
        if (lllllllIlIlIll(at)) {
            return llIIlllIIIlI[0];
        }
        GroundObject groundObject = at.getGroundObject();
        return lllllllIlIlIll(groundObject) ? llIIlllIIIlI[0] : C0004e.ay.contains(Integer.valueOf(groundObject.getId()));
    }

    private static boolean lllllllIllIlII(int i, int i2) {
        return i != i2;
    }

    public NPC m(WorldPoint worldPoint) {
        return NPCs.getNearest(worldPoint, npc -> {
            return C0004e.ax.contains(Integer.valueOf(npc.getId()));
        });
    }

    public List<WorldPoint> bu() {
        C0007h V = this.ba.V();
        if (lllllllIlIlIll(V)) {
            return Collections.emptyList();
        }
        WorldPoint aQ = V.aq().aQ();
        if (lllllllIlIlIll(Static.getClient().getLocalPlayer())) {
            return Collections.emptyList();
        }
        List all = TileObjects.getAll(tileObject -> {
            return Predicates.ids(C0004e.O).test(tileObject);
        });
        int x = aQ.getX();
        int y = aQ.getY();
        return (List) all.stream().map(tileObject2 -> {
            WorldPoint worldLocation = tileObject2.getWorldLocation();
            return lllllllIllIIII(worldLocation.getX(), x + llIIlllIIIlI[3]) ? worldLocation.dx(llIIlllIIIlI[9]) : lllllllIllIIlI(worldLocation.getX(), x - llIIlllIIIlI[3]) ? worldLocation.dx(llIIlllIIIlI[3]) : lllllllIllIIII(worldLocation.getY(), y + llIIlllIIIlI[3]) ? worldLocation.dy(llIIlllIIIlI[9]) : worldLocation.dy(llIIlllIIIlI[3]);
        }).collect(Collectors.toList());
    }

    private static boolean lllllllIlIllll(int i) {
        return i == 0;
    }
}
