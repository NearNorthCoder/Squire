/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bY;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging wave", priority=150, blocking=true)
public class bS
extends bX {
    private static /* synthetic */ int[] llIllIlllIl;
    private static final /* synthetic */ RegionPoint he;

    private static /* synthetic */ int e(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo((Locatable)player);
    }

    private static boolean lIlIlIlIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIlIlIlIIIII() {
        llIllIlllIl = new int[11];
        bS.llIllIlllIl[0] = 0x98 ^ 0x9F;
        bS.llIllIlllIl[1] = " ".length();
        bS.llIllIlllIl[2] = (0x10 ^ 0x55 ^ (0xFE ^ 0xB2)) & (58 + 34 - 80 + 146 ^ 68 + 56 - -16 + 11 ^ -" ".length());
        bS.llIllIlllIl[3] = 0x3C ^ 0x45 ^ (0x53 ^ 0x22);
        bS.llIllIlllIl[4] = -" ".length();
        bS.llIllIlllIl[5] = "   ".length();
        bS.llIllIlllIl[6] = 0x2F ^ 0x29;
        bS.llIllIlllIl[7] = -"  ".length();
        bS.llIllIlllIl[8] = 137 + 91 - 96 + 14 ^ 23 + 83 - 97 + 128;
        bS.llIllIlllIl[9] = 0xAD ^ 0x8C;
        bS.llIllIlllIl[10] = -(0xFFFFE2A6 & 0x5FFB) & (0xFFFFFFF5 & Short.MAX_VALUE);
    }

    private static boolean lIlIlIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private /* synthetic */ boolean h(List list, WorldPoint worldPoint3) {
        return worldPoint3.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (bS.lIlIlIlIlIIlIl(worldPoint2.getWorldX(), worldPoint3.getWorldX())) {
                bl2 = llIllIlllIl[1];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((83 + 1 - -39 + 64 ^ 7 + 7 - -118 + 4) & (40 + 37 - -89 + 15 ^ 51 + 99 - 116 + 100 ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        }).noneMatch(worldPoint -> this.k(list, (WorldPoint)worldPoint));
    }

    private /* synthetic */ boolean g(List list, WorldPoint worldPoint) {
        boolean bl2;
        if (bS.lIlIlIlIlIIlII(this.k(list, worldPoint) ? 1 : 0)) {
            bl2 = llIllIlllIl[1];
            "".length();
            if (null != null) {
                return ((0x58 ^ 0x38) & ~(0x78 ^ 0x18)) != 0;
            }
        } else {
            bl2 = llIllIlllIl[2];
        }
        return bl2;
    }

    private static boolean lIlIlIlIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIlIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private /* synthetic */ boolean j(List list, WorldPoint worldPoint) {
        boolean bl2;
        if (bS.lIlIlIlIlIIlII(this.k(list, worldPoint) ? 1 : 0)) {
            bl2 = llIllIlllIl[1];
            "".length();
            if ("   ".length() > "   ".length()) {
                return ((0x5A ^ 0x4B ^ (0x71 ^ 0x4B)) & (128 + 45 - 111 + 172 ^ 35 + 89 - 18 + 87 ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIllIlllIl[2];
        }
        return bl2;
    }

    private static /* synthetic */ boolean d(Player player, NPC nPC) {
        boolean bl2;
        if (bS.lIlIlIlIlIlIII(nPC.getWorldY(), player.getWorldY())) {
            bl2 = llIllIlllIl[1];
            "".length();
            if (-" ".length() == "   ".length()) {
                return ((0x1C ^ 0x56) & ~(0x23 ^ 0x69)) != 0;
            }
        } else {
            bl2 = llIllIlllIl[2];
        }
        return bl2;
    }

    private int L(WorldPoint worldPoint) {
        return worldPoint.distanceTo(this.c(he));
    }

    private static boolean lIlIlIlIlIIlII(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ boolean b(Player player, NPC nPC) {
        boolean bl2;
        if (bS.lIlIlIlIlIIlIl(nPC.getWorldX(), player.getWorldX())) {
            bl2 = llIllIlllIl[1];
            "".length();
            if (null != null) {
                return ((0xD2 ^ 0x88 ^ (0xF5 ^ 0x81)) & (0x42 ^ 0x4C ^ (0x52 ^ 0x72) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIllIlllIl[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        int llllllllllllllllIIlIllIIIIllllIl;
        int n2;
        void llllllllllllllllIIlIllIIIlIIIIlI;
        bS llllllllllllllllIIlIllIIIlIIIlIl;
        NPC llllllllllllllllIIlIllIIIlIIIIIl;
        void llllllllllllllllIIlIllIIIlIIIlII;
        List<NPC> llllllllllllllllIIlIllIIIlIIIIll;
        Player player = Players.getLocal();
        List<NPC> list = this.cD();
        List<TileObject> list2 = this.cC();
        if (bS.lIlIlIlIlIIIIl(this.cz() ? 1 : 0)) {
            NPC nPC3 = list.stream().filter(nPC -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlll(nPC.getWorldY(), player.getWorldY())) {
                    bl2 = llIllIlllIl[1];
                    "".length();
                    if ("   ".length() < 0) {
                        return ((0x33 ^ 0x1D ^ (0x34 ^ 0x32)) & (141 + 62 - 135 + 96 ^ 106 + 44 - 112 + 102 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo2D(player.getWorldLocation()))).orElse(null);
            "".length();
            if (null != null) {
                return ((0xF7 ^ 0xC5 ^ (0xC7 ^ 0xA9)) & (14 + 99 - -105 + 12 ^ 33 + 109 - 44 + 88 ^ -" ".length())) != 0;
            }
        } else {
            llllllllllllllllIIlIllIIIlIIIIIl = llllllllllllllllIIlIllIIIlIIIIll.stream().filter(arg_0 -> bS.d((Player)llllllllllllllllIIlIllIIIlIIIlII, arg_0)).min(Comparator.comparingInt(arg_0 -> bS.c((Player)llllllllllllllllIIlIllIIIlIIIlII, arg_0))).orElse(null);
        }
        if (bS.lIlIlIlIlIIIlI(llllllllllllllllIIlIllIIIlIIIIIl)) {
            WorldPoint llllllllllllllllIIlIllIIIlIIIIII = Players.getLocal().getWorldLocation();
            if (bS.lIlIlIlIlIIIll(llllllllllllllllIIlIllIIIlIIIlIl.L(llllllllllllllllIIlIllIIIlIIIIII), llIllIlllIl[0])) {
                llllllllllllllllIIlIllIIIlIIIlIl.a(llllllllllllllllIIlIllIIIlIIIlIl.c(he), arg_0 -> llllllllllllllllIIlIllIIIlIIIlIl.j((List)llllllllllllllllIIlIllIIIlIIIIlI, arg_0));
                return llIllIlllIl[1];
            }
            return llIllIlllIl[2];
        }
        llllllllllllllllIIlIllIIIlIIIIll = llllllllllllllllIIlIllIIIlIIIIll.stream().filter(nPC2 -> {
            boolean bl2;
            if (bS.lIlIlIlIlIIlIl(nPC2.getWorldY(), llllllllllllllllIIlIllIIIlIIIIIl.getWorldY())) {
                bl2 = llIllIlllIl[1];
                "".length();
                if ("  ".length() < ((0xB4 ^ 0xC3 ^ (0xDB ^ 0x9C)) & (0x35 ^ 3 ^ (0x2B ^ 0x2D) ^ -" ".length()))) {
                    return ((0x75 ^ 0x46 ^ (0x42 ^ 0x53)) & (9 + 100 - 79 + 106 ^ 127 + 3 - 66 + 106 ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        }).collect(Collectors.toList());
        NPC llllllllllllllllIIlIllIIIlIIIIII = llllllllllllllllIIlIllIIIlIIIlIl.cB();
        WorldArea llllllllllllllllIIlIllIIIIllllll = llllllllllllllllIIlIllIIIlIIIIII.getWorldArea();
        int llllllllllllllllIIlIllIIIIlllllI = llllllllllllllllIIlIllIIIIllllll.getX() + llllllllllllllllIIlIllIIIIllllll.getWidth();
        if (bS.lIlIlIlIlIIIIl(llllllllllllllllIIlIllIIIlIIIIll.stream().noneMatch(arg_0 -> bS.b((Player)llllllllllllllllIIlIllIIIlIIIlII, arg_0)) ? 1 : 0)) {
            boolean bl2;
            if (bS.lIlIlIlIlIIIll(Math.abs(llllllllllllllllIIlIllIIIIlllllI - llllllllllllllllIIlIllIIIlIIIlII.getWorldX()), llIllIlllIl[3])) {
                bl2 = llIllIlllIl[1];
                "".length();
                if (-" ".length() > 0) {
                    return ((0xB4 ^ 0xAC) & ~(0xA9 ^ 0xB1)) != 0;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        }
        f.b(llllllllllllllllIIlIllIIIlIIIIll);
        if (bS.lIlIlIlIlIIIIl(llllllllllllllllIIlIllIIIlIIIlIl.cz() ? 1 : 0)) {
            n2 = llIllIlllIl[1];
            "".length();
            if (((1 + 5 - -124 + 4 ^ 3 + 115 - 58 + 94) & (0x4B ^ 0x77 ^ (0x45 ^ 0x65) ^ -" ".length())) >= (0xDD ^ 0xBF ^ (0x7A ^ 0x1C))) {
                return ((35 + 124 - 109 + 139 ^ 0 + 139 - 57 + 95) & (0x86 ^ 0xA6 ^ (0x22 ^ 0xE) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlIllIIIIllllIl = llIllIlllIl[4];
        }
        if (bS.lIlIlIlIlIIIll(llllllllllllllllIIlIllIIIlIIIIIl.distanceTo((Locatable)llllllllllllllllIIlIllIIIlIIIlII), llIllIlllIl[5])) {
            WorldPoint llllllllllllllllIIlIllIIIIllllII = Players.getLocal().getWorldLocation();
            if (bS.lIlIlIlIlIIIIl(llllllllllllllllIIlIllIIIIllllII.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlIl(worldPoint2.getWorldX(), llllllllllllllllIIlIllIIIIllllII.getWorldX())) {
                    bl2 = llIllIlllIl[1];
                    "".length();
                    if ((0xCE ^ 0x9F ^ (0x1E ^ 0x4B)) <= ((90 + 183 - 95 + 7 ^ 96 + 8 - -36 + 2) & (0x3C ^ 0x42 ^ (0x5C ^ 0x15) ^ -" ".length()))) {
                        return ((0x2C ^ 0x28 ^ (0xB9 ^ 0xB6)) & (0x68 ^ 0x53 ^ (0x8C ^ 0xBC) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).allMatch(worldPoint -> {
                int n2;
                if (bS.lIlIlIlIlIIIIl(this.P((WorldPoint)worldPoint) ? 1 : 0) && bS.lIlIlIlIlIIlll(this.L((WorldPoint)worldPoint), llIllIlllIl[0])) {
                    n2 = llIllIlllIl[1];
                    "".length();
                    if (-(0x8C ^ 0x9D ^ (3 ^ 0x17)) >= 0) {
                        return ((0 ^ 0x49 ^ (0xE3 ^ 0xBB)) & (0x41 ^ 0x7C ^ (0x67 ^ 0x4B) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIllIlllIl[2];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                return llIllIlllIl[2];
            }
            List llllllllllllllllIIlIllIIIIlllIll = llllllllllllllllIIlIllIIIlIIIlIl.c(he).toWorldArea().offset(llIllIlllIl[6]).toWorldPointList();
            WorldPoint llllllllllllllllIIlIllIIIIlllIlI = llllllllllllllllIIlIllIIIIlllIll.stream().filter(worldPoint -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlll(this.L((WorldPoint)worldPoint), llIllIlllIl[6])) {
                    bl2 = llIllIlllIl[1];
                    "".length();
                    if (((32 + 82 - 108 + 146 ^ 118 + 39 - 63 + 53) & (" ".length() ^ (0x8D ^ 0x87) ^ -" ".length())) != 0) {
                        return ((150 + 50 - 124 + 105 ^ 89 + 51 - 81 + 109) & (38 + 166 - 133 + 111 ^ 21 + 33 - -95 + 22 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).filter(worldPoint -> {
                void llllllllllllllllIIlIllIIIIlIIlIl;
                void llllllllllllllllIIlIllIIIIlIIlII;
                boolean bl2;
                if (bS.lIlIlIlIlIIIIl(this.cz() ? 1 : 0)) {
                    if (bS.lIlIlIlIlIIIll(worldPoint.getWorldY(), llllllllllllllllIIlIllIIIlIIIIIl.getWorldY())) {
                        bl2 = llIllIlllIl[1];
                        "".length();
                        if ((0x78 ^ 0x20 ^ (0x48 ^ 0x15)) <= 0) {
                            return ((191 + 65 - 194 + 145 ^ 127 + 25 - 127 + 104) & (168 + 189 - 252 + 126 ^ 105 + 124 - 94 + 34 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl2 = llIllIlllIl[2];
                        "".length();
                        if ("  ".length() <= ((0x36 ^ 0x22) & ~(0x80 ^ 0x94))) {
                            return ((0x45 ^ 0x55) & ~(0x4F ^ 0x5F)) != 0;
                        }
                    }
                } else if (bS.lIlIlIlIlIIllI(llllllllllllllllIIlIllIIIIlIIlII.getWorldY(), llllllllllllllllIIlIllIIIIlIIlIl.getWorldY())) {
                    bl2 = llIllIlllIl[1];
                    "".length();
                    if ("  ".length() == 0) {
                        return ((0x39 ^ 0x41 ^ (0xD1 ^ 0xA3)) & (0xB4 ^ 0xA5 ^ (0x42 ^ 0x59) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).filter(arg_0 -> llllllllllllllllIIlIllIIIlIIIlIl.h((List)llllllllllllllllIIlIllIIIlIIIIlI, arg_0)).filter(worldPoint -> worldPoint.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlIl(worldPoint2.getWorldX(), worldPoint.getWorldX())) {
                    bl2 = llIllIlllIl[1];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x3F ^ 0x20) & ~(0x7C ^ 0x63)) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).allMatch(Reachable::isWalkable)).filter(llllllllllllllllIIlIllIIIlIIIlIl::P).filter(Reachable::isWalkable).min(Comparator.comparingInt(arg_0 -> bS.e((Player)llllllllllllllllIIlIllIIIlIIIlII, arg_0))).orElse(null);
            if (bS.lIlIlIlIlIIIlI(llllllllllllllllIIlIllIIIIlllIlI)) {
                return llIllIlllIl[2];
            }
            f.a(llllllllllllllllIIlIllIIIIlllIlI);
            if (bS.lIlIlIlIlIIlII(llllllllllllllllIIlIllIIIIlllIlI.equals((Object)llllllllllllllllIIlIllIIIIllllII) ? 1 : 0)) {
                llllllllllllllllIIlIllIIIlIIIlIl.a(llllllllllllllllIIlIllIIIIlllIlI, arg_0 -> llllllllllllllllIIlIllIIIlIIIlIl.g((List)llllllllllllllllIIlIllIIIlIIIIlI, arg_0));
                return llIllIlllIl[1];
            }
            return llIllIlllIl[2];
        }
        if (bS.lIlIlIlIlIIIll(llllllllllllllllIIlIllIIIlIIIIIl.distanceTo((Locatable)llllllllllllllllIIlIllIIIlIIIlII), llIllIlllIl[1])) {
            return llIllIlllIl[2];
        }
        if (bS.lIlIlIlIlIIlII(llllllllllllllllIIlIllIIIlIIIlII.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllllIIlIllIIIlIIIlII.getWorldLocation().dy(llllllllllllllllIIlIllIIIIllllIl));
            "".length();
            "".length();
            if ((21 + 8 - 8 + 142 ^ 59 + 157 - 60 + 11) <= 0) {
                return ((73 + 62 - 84 + 78 ^ 178 + 55 - 201 + 148) & (2 + 130 - 3 + 23 ^ 21 + 129 - 47 + 70 ^ -" ".length())) != 0;
            }
        } else {
            Movement.walkTo((WorldPoint)llllllllllllllllIIlIllIIIlIIIlII.getWorldLocation().dy(llllllllllllllllIIlIllIIIIllllIl * llIllIlllIl[7]));
            "".length();
        }
        return llIllIlllIl[1];
    }

    static {
        bS.lIlIlIlIlIIIII();
        he = new RegionPoint(llIllIlllIl[8], llIllIlllIl[9], llIllIlllIl[2], llIllIlllIl[10]);
    }

    private static /* synthetic */ int c(Player player, NPC nPC) {
        return nPC.getWorldLocation().distanceTo2D(player.getWorldLocation());
    }

    @Inject
    protected bS(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bY.WAVE);
    }

    private boolean cz() {
        return this.cD().stream().noneMatch(nPC -> {
            boolean bl2;
            if (bS.lIlIlIlIlIIlII(nPC.getOrientation())) {
                bl2 = llIllIlllIl[1];
                "".length();
                if (-(0x36 ^ 0x32) >= 0) {
                    return ((0xE2 ^ 0xAF) & ~(0x8E ^ 0xC3)) != 0;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        });
    }
}

