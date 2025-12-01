package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging wave", priority = 150, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bS  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bS.class */
public class bS extends bX {
    private static /* synthetic */ int[] llIllIlllIl;
    private static final /* synthetic */ RegionPoint he;

    private static boolean lIlIlIlIlIIlll(int i, int i2) {
        return i <= i2;
    }

    private static void lIlIlIlIlIIIII() {
        llIllIlllIl = new int[11];
        llIllIlllIl[0] = 152 ^ 159;
        llIllIlllIl[1] = " ".length();
        llIllIlllIl[2] = ((16 ^ 85) ^ (254 ^ 178)) & (((((58 + 34) - 80) + 146) ^ (((68 + 56) - (-16)) + 11)) ^ (-" ".length()));
        llIllIlllIl[3] = (60 ^ 69) ^ (83 ^ 34);
        llIllIlllIl[4] = -" ".length();
        llIllIlllIl[5] = "   ".length();
        llIllIlllIl[6] = 47 ^ 41;
        llIllIlllIl[7] = -"  ".length();
        llIllIlllIl[8] = (((137 + 91) - 96) + 14) ^ (((23 + 83) - 97) + 128);
        llIllIlllIl[9] = 173 ^ 140;
        llIllIlllIl[10] = (-((-7514) & 24571)) & (-11) & 32767;
    }

    private static boolean lIlIlIlIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlIlIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIlIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIlIlIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIlIlIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlIlIIlIl(int i, int i2) {
        return i == i2;
    }

    private int L(WorldPoint worldPoint) {
        return worldPoint.distanceTo(c(he));
    }

    private static boolean lIlIlIlIlIIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        NPC orElse;
        int i;
        Player local = Players.getLocal();
        List<NPC> cD = cD();
        List<TileObject> cC = cC();
        if (lIlIlIlIlIIIIl(cz() ? 1 : 0)) {
            orElse = cD.stream().filter(npc -> {
                if (lIlIlIlIlIIlll(npc.getWorldY(), local.getWorldY())) {
                    ?? r0 = llIllIlllIl[1];
                    "".length();
                    return "   ".length() < 0 ? ((51 ^ 29) ^ (52 ^ 50)) & (((((141 + 62) - 135) + 96) ^ (((106 + 44) - 112) + 102)) ^ (-" ".length())) : r0;
                }
                return llIllIlllIl[2];
            }).min(Comparator.comparingInt(npc2 -> {
                return npc2.getWorldLocation().distanceTo2D(local.getWorldLocation());
            })).orElse(null);
            "".length();
            if (0 != 0) {
                return ((247 ^ 197) ^ (199 ^ 169)) & (((((14 + 99) - (-105)) + 12) ^ (((33 + 109) - 44) + 88)) ^ (-" ".length()));
            }
        } else {
            orElse = cD.stream().filter(npc3 -> {
                if (lIlIlIlIlIlIII(npc3.getWorldY(), local.getWorldY())) {
                    ?? r0 = llIllIlllIl[1];
                    "".length();
                    return (-" ".length()) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIllIlllIl[2];
            }).min(Comparator.comparingInt(npc4 -> {
                return npc4.getWorldLocation().distanceTo2D(local.getWorldLocation());
            })).orElse(null);
        }
        if (lIlIlIlIlIIIlI(orElse)) {
            if (lIlIlIlIlIIIll(L(Players.getLocal().getWorldLocation()), llIllIlllIl[0])) {
                a(c(he), worldPoint -> {
                    if (lIlIlIlIlIIlII(k(cC, worldPoint) ? 1 : 0)) {
                        ?? r0 = llIllIlllIl[1];
                        "".length();
                        return "   ".length() > "   ".length() ? ((90 ^ 75) ^ (113 ^ 75)) & (((((128 + 45) - 111) + 172) ^ (((35 + 89) - 18) + 87)) ^ (-" ".length())) : r0;
                    }
                    return llIllIlllIl[2];
                });
                return llIllIlllIl[1];
            }
            return llIllIlllIl[2];
        }
        NPC npc5 = orElse;
        List list = (List) cD.stream().filter(npc6 -> {
            if (lIlIlIlIlIIlIl(npc6.getWorldY(), npc5.getWorldY())) {
                ?? r0 = llIllIlllIl[1];
                "".length();
                return "  ".length() < (((180 ^ 195) ^ (219 ^ 156)) & (((53 ^ 3) ^ (43 ^ 45)) ^ (-" ".length()))) ? ((117 ^ 70) ^ (66 ^ 83)) & (((((9 + 100) - 79) + 106) ^ (((127 + 3) - 66) + 106)) ^ (-" ".length())) : r0;
            }
            return llIllIlllIl[2];
        }).collect(Collectors.toList());
        WorldArea worldArea = cB().getWorldArea();
        int x = worldArea.getX() + worldArea.getWidth();
        if (lIlIlIlIlIIIIl(list.stream().noneMatch(npc7 -> {
            if (lIlIlIlIlIIlIl(npc7.getWorldX(), local.getWorldX())) {
                ?? r0 = llIllIlllIl[1];
                "".length();
                return 0 != 0 ? ((210 ^ 136) ^ (245 ^ 129)) & (((66 ^ 76) ^ (82 ^ 114)) ^ (-" ".length())) : r0;
            }
            return llIllIlllIl[2];
        }) ? 1 : 0)) {
            if (lIlIlIlIlIIIll(Math.abs(x - local.getWorldX()), llIllIlllIl[3])) {
                ?? r0 = llIllIlllIl[1];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIllIlllIl[2];
        }
        C0057f.b(list);
        if (lIlIlIlIlIIIIl(cz() ? 1 : 0)) {
            i = llIllIlllIl[1];
            "".length();
            if ((((((1 + 5) - (-124)) + 4) ^ (((3 + 115) - 58) + 94)) & (((75 ^ 119) ^ (69 ^ 101)) ^ (-" ".length()))) >= ((221 ^ 191) ^ (122 ^ 28))) {
                return ((((35 + 124) - 109) + 139) ^ (((0 + 139) - 57) + 95)) & (((134 ^ 166) ^ (34 ^ 14)) ^ (-" ".length()));
            }
        } else {
            i = llIllIlllIl[4];
        }
        int i2 = i;
        if (!lIlIlIlIlIIIll(orElse.distanceTo(local), llIllIlllIl[5])) {
            if (lIlIlIlIlIIIll(orElse.distanceTo(local), llIllIlllIl[1])) {
                return llIllIlllIl[2];
            }
            if (lIlIlIlIlIIlII(local.isMoving() ? 1 : 0)) {
                Movement.walkTo(local.getWorldLocation().dy(i2));
                "".length();
                "".length();
                if (((((21 + 8) - 8) + 142) ^ (((59 + 157) - 60) + 11)) <= 0) {
                    return ((((73 + 62) - 84) + 78) ^ (((178 + 55) - 201) + 148)) & (((((2 + 130) - 3) + 23) ^ (((21 + 129) - 47) + 70)) ^ (-" ".length()));
                }
            } else {
                Movement.walkTo(local.getWorldLocation().dy(i2 * llIllIlllIl[7]));
                "".length();
            }
            return llIllIlllIl[1];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIlIlIlIlIIIIl(worldLocation.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (lIlIlIlIlIIlIl(worldPoint2.getWorldX(), worldLocation.getWorldX())) {
                ?? r02 = llIllIlllIl[1];
                "".length();
                return ((206 ^ 159) ^ (30 ^ 75)) <= (((((90 + 183) - 95) + 7) ^ (((96 + 8) - (-36)) + 2)) & (((60 ^ 66) ^ (92 ^ 21)) ^ (-" ".length()))) ? ((44 ^ 40) ^ (185 ^ 182)) & (((104 ^ 83) ^ (140 ^ 188)) ^ (-" ".length())) : r02;
            }
            return llIllIlllIl[2];
        }).allMatch(worldPoint3 -> {
            if (lIlIlIlIlIIIIl(P(worldPoint3) ? 1 : 0) && lIlIlIlIlIIlll(L(worldPoint3), llIllIlllIl[0])) {
                ?? r02 = llIllIlllIl[1];
                "".length();
                return (-((140 ^ 157) ^ (3 ^ 23))) >= 0 ? ((0 ^ 73) ^ (227 ^ 187)) & (((65 ^ 124) ^ (103 ^ 75)) ^ (-" ".length())) : r02;
            }
            return llIllIlllIl[2];
        }) ? 1 : 0)) {
            return llIllIlllIl[2];
        }
        NPC npc8 = orElse;
        WorldPoint worldPoint4 = (WorldPoint) c(he).toWorldArea().offset(llIllIlllIl[6]).toWorldPointList().stream().filter(worldPoint5 -> {
            if (lIlIlIlIlIIlll(L(worldPoint5), llIllIlllIl[6])) {
                ?? r02 = llIllIlllIl[1];
                "".length();
                return (((((32 + 82) - 108) + 146) ^ (((118 + 39) - 63) + 53)) & ((" ".length() ^ (141 ^ 135)) ^ (-" ".length()))) != 0 ? ((((150 + 50) - 124) + 105) ^ (((89 + 51) - 81) + 109)) & (((((38 + 166) - 133) + 111) ^ (((21 + 33) - (-95)) + 22)) ^ (-" ".length())) : r02;
            }
            return llIllIlllIl[2];
        }).filter(worldPoint6 -> {
            if (!lIlIlIlIlIIIIl(cz() ? 1 : 0)) {
                if (lIlIlIlIlIIllI(worldPoint6.getWorldY(), npc8.getWorldY())) {
                    ?? r02 = llIllIlllIl[1];
                    "".length();
                    return "  ".length() == 0 ? ((57 ^ 65) ^ (209 ^ 163)) & (((180 ^ 165) ^ (66 ^ 89)) ^ (-" ".length())) : r02;
                }
                return llIllIlllIl[2];
            } else if (lIlIlIlIlIIIll(worldPoint6.getWorldY(), npc8.getWorldY())) {
                ?? r03 = llIllIlllIl[1];
                "".length();
                return ((120 ^ 32) ^ (72 ^ 21)) <= 0 ? ((((191 + 65) - 194) + 145) ^ (((127 + 25) - 127) + 104)) & (((((168 + 189) - 252) + 126) ^ (((105 + 124) - 94) + 34)) ^ (-" ".length())) : r03;
            } else {
                ?? r04 = llIllIlllIl[2];
                "".length();
                return "  ".length() <= ((54 ^ 34) & ((128 ^ 148) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r04;
            }
        }).filter(worldPoint7 -> {
            return worldPoint7.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint7 -> {
                if (lIlIlIlIlIIlIl(worldPoint7.getWorldX(), worldPoint7.getWorldX())) {
                    ?? r02 = llIllIlllIl[1];
                    "".length();
                    return "  ".length() != "  ".length() ? ((((83 + 1) - (-39)) + 64) ^ (((7 + 7) - (-118)) + 4)) & (((((40 + 37) - (-89)) + 15) ^ (((51 + 99) - 116) + 100)) ^ (-" ".length())) : r02;
                }
                return llIllIlllIl[2];
            }).noneMatch(worldPoint8 -> {
                return k(cC, worldPoint8);
            });
        }).filter(worldPoint8 -> {
            return worldPoint8.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint8 -> {
                if (lIlIlIlIlIIlIl(worldPoint8.getWorldX(), worldPoint8.getWorldX())) {
                    ?? r02 = llIllIlllIl[1];
                    "".length();
                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return llIllIlllIl[2];
            }).allMatch(Reachable::isWalkable);
        }).filter(this::P).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint9 -> {
            return worldPoint9.distanceTo(local);
        })).orElse(null);
        if (lIlIlIlIlIIIlI(worldPoint4)) {
            return llIllIlllIl[2];
        }
        C0057f.a(worldPoint4);
        if (lIlIlIlIlIIlII(worldPoint4.equals(worldLocation) ? 1 : 0)) {
            a(worldPoint4, worldPoint10 -> {
                if (lIlIlIlIlIIlII(k(cC, worldPoint10) ? 1 : 0)) {
                    ?? r02 = llIllIlllIl[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return llIllIlllIl[2];
            });
            return llIllIlllIl[1];
        }
        return llIllIlllIl[2];
    }

    static {
        lIlIlIlIlIIIII();
        he = new RegionPoint(llIllIlllIl[8], llIllIlllIl[9], llIllIlllIl[2], llIllIlllIl[10]);
    }

    @Inject
    protected bS(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, bY.WAVE);
    }

    private boolean cz() {
        return cD().stream().noneMatch(npc -> {
            if (lIlIlIlIlIIlII(npc.getOrientation())) {
                ?? r0 = llIllIlllIl[1];
                "".length();
                return (-(54 ^ 50)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIllIlllIl[2];
        });
    }
}
