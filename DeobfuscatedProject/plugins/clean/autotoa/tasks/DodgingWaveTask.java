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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum51;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging wave", priority=150, blocking=true)
public class DodgingWaveTask
extends AutotoaTaskBase {
    
    private static final  RegionPoint he;

    private static  int e(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo((Locatable)player);
    }

    private static boolean lIlIlIlIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private  boolean h(List list, WorldPoint worldPoint3) {
        return worldPoint3.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (bS.lIlIlIlIlIIlIl(worldPoint2.getWorldX(), worldPoint3.getWorldX())) {
                bl2 = llIllIlllIl[1];

                if (2 != 2) {
                    return false;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        }).noneMatch(worldPoint -> this.k(list, (WorldPoint)worldPoint));
    }

    private  boolean g(List list, WorldPoint worldPoint) {
        boolean bl2;
        if (bS.lIlIlIlIlIIlII(this.k(list, worldPoint) ? 1 : 0)) {
            bl2 = llIllIlllIl[1];

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

    private  boolean j(List list, WorldPoint worldPoint) {
        boolean bl2;
        if (bS.lIlIlIlIlIIlII(this.k(list, worldPoint) ? 1 : 0)) {
            bl2 = llIllIlllIl[1];

            if (3 > 3) {
                return ((0x5A ^ 0x4B ^ (0x71 ^ 0x4B)) & (128 + 45 - 111 + 172 ^ 35 + 89 - 18 + 87 ^ -1)) != 0;
            }
        } else {
            bl2 = llIllIlllIl[2];
        }
        return bl2;
    }

    private static  boolean d(Player player, NPC nPC) {
        boolean bl2;
        if (bS.lIlIlIlIlIlIII(nPC.getWorldY(), player.getWorldY())) {
            bl2 = llIllIlllIl[1];

            if (-1 == 3) {
                return false;
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

    private static  boolean b(Player player, NPC nPC) {
        boolean bl2;
        if (bS.lIlIlIlIlIIlIl(nPC.getWorldX(), player.getWorldX())) {
            bl2 = llIllIlllIl[1];

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
        int var1;
        int n2;
        void var2;
        bS var3;
        NPC var4;
        void var5;
        List<NPC> var6;
        Player player = Players.getLocal();
        List<NPC> list = this.cD();
        List<TileObject> list2 = this.cC();
        if (bS.lIlIlIlIlIIIIl(this.cz() ? 1 : 0)) {
            NPC nPC3 = list.stream().filter(nPC -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlll(nPC.getWorldY(), player.getWorldY())) {
                    bl2 = llIllIlllIl[1];

                    if (3 < 0) {
                        return ((0x33 ^ 0x1D ^ (0x34 ^ 0x32)) & (141 + 62 - 135 + 96 ^ 106 + 44 - 112 + 102 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo2D(player.getWorldLocation()))).orElse(null);

            }
        } else {
            var4 = var6.stream().filter(arg_0 -> bS.d((Player)var5, arg_0)).min(Comparator.comparingInt(arg_0 -> bS.c((Player)var5, arg_0))).orElse(null);
        }
        if (bS.lIlIlIlIlIIIlI(var4)) {
            WorldPoint var7 = Players.getLocal().getWorldLocation();
            if (bS.lIlIlIlIlIIIll(var3.L(var7), llIllIlllIl[0])) {
                var3.a(var3.c(he), arg_0 -> var3.j((List)var2, arg_0));
                return llIllIlllIl[1];
            }
            return llIllIlllIl[2];
        }
        var6 = var6.stream().filter(nPC2 -> {
            boolean bl2;
            if (bS.lIlIlIlIlIIlIl(nPC2.getWorldY(), var4.getWorldY())) {
                bl2 = llIllIlllIl[1];

                if (2 < ((0xB4 ^ 0xC3 ^ (0xDB ^ 0x9C)) & (0x35 ^ 3 ^ (0x2B ^ 0x2D) ^ -1))) {
                    return ((0x75 ^ 0x46 ^ (0x42 ^ 0x53)) & (9 + 100 - 79 + 106 ^ 127 + 3 - 66 + 106 ^ -1)) != 0;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        }).collect(Collectors.toList());
        NPC var7 = var3.cB();
        WorldArea var8 = var7.getWorldArea();
        int var9 = var8.getX() + var8.getWidth();
        if (bS.lIlIlIlIlIIIIl(var6.stream().noneMatch(arg_0 -> bS.b((Player)var5, arg_0)) ? 1 : 0)) {
            boolean bl2;
            if (bS.lIlIlIlIlIIIll(Math.abs(var9 - var5.getWorldX()), llIllIlllIl[3])) {
                bl2 = llIllIlllIl[1];

            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        }
        f.b(var6);
        if (bS.lIlIlIlIlIIIIl(var3.cz() ? 1 : 0)) {
            n2 = llIllIlllIl[1];

            if (((1 + 5 - -124 + 4 ^ 3 + 115 - 58 + 94) & (0x4B ^ 0x77 ^ (0x45 ^ 0x65) ^ -1)) >= (0xDD ^ 0xBF ^ (0x7A ^ 0x1C))) {
                return ((35 + 124 - 109 + 139 ^ 0 + 139 - 57 + 95) & (0x86 ^ 0xA6 ^ (0x22 ^ 0xE) ^ -1)) != 0;
            }
        } else {
            n2 = var1 = llIllIlllIl[4];
        }
        if (bS.lIlIlIlIlIIIll(var4.distanceTo((Locatable)var5), llIllIlllIl[5])) {
            WorldPoint var10 = Players.getLocal().getWorldLocation();
            if (bS.lIlIlIlIlIIIIl(var10.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlIl(worldPoint2.getWorldX(), var10.getWorldX())) {
                    bl2 = llIllIlllIl[1];

                    if ((0xCE ^ 0x9F ^ (0x1E ^ 0x4B)) <= ((90 + 183 - 95 + 7 ^ 96 + 8 - -36 + 2) & (0x3C ^ 0x42 ^ (0x5C ^ 0x15) ^ -1))) {
                        return ((0x2C ^ 0x28 ^ (0xB9 ^ 0xB6)) & (0x68 ^ 0x53 ^ (0x8C ^ 0xBC) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).allMatch(worldPoint -> {
                int n2;
                if (bS.lIlIlIlIlIIIIl(this.P((WorldPoint)worldPoint) ? 1 : 0) && bS.lIlIlIlIlIIlll(this.L((WorldPoint)worldPoint), llIllIlllIl[0])) {
                    n2 = llIllIlllIl[1];

                    if (-(0x8C ^ 0x9D ^ (3 ^ 0x17)) >= 0) {
                        return ((0 ^ 0x49 ^ (0xE3 ^ 0xBB)) & (0x41 ^ 0x7C ^ (0x67 ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIllIlllIl[2];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                return llIllIlllIl[2];
            }
            List var11 = var3.c(he).toWorldArea().offset(llIllIlllIl[6]).toWorldPointList();
            WorldPoint var12 = var11.stream().filter(worldPoint -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlll(this.L((WorldPoint)worldPoint), llIllIlllIl[6])) {
                    bl2 = llIllIlllIl[1];

                    if (((32 + 82 - 108 + 146 ^ 118 + 39 - 63 + 53) & (1 ^ (0x8D ^ 0x87) ^ -1)) != 0) {
                        return false;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).filter(worldPoint -> {
                void var13;
                void var14;
                boolean bl2;
                if (bS.lIlIlIlIlIIIIl(this.cz() ? 1 : 0)) {
                    if (bS.lIlIlIlIlIIIll(worldPoint.getWorldY(), var4.getWorldY())) {
                        bl2 = llIllIlllIl[1];

                        if ((0x78 ^ 0x20 ^ (0x48 ^ 0x15)) <= 0) {
                            return false;
                        }
                    } else {
                        bl2 = llIllIlllIl[2];

                        if (2 <= ((0x36 ^ 0x22) & ~(0x80 ^ 0x94))) {
                            return false;
                        }
                    }
                } else if (bS.lIlIlIlIlIIllI(var14.getWorldY(), var13.getWorldY())) {
                    bl2 = llIllIlllIl[1];

                    if (2 == 0) {
                        return ((0x39 ^ 0x41 ^ (0xD1 ^ 0xA3)) & (0xB4 ^ 0xA5 ^ (0x42 ^ 0x59) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).filter(arg_0 -> var3.h((List)var2, arg_0)).filter(worldPoint -> worldPoint.toWorldArea().offset(llIllIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                boolean bl2;
                if (bS.lIlIlIlIlIIlIl(worldPoint2.getWorldX(), worldPoint.getWorldX())) {
                    bl2 = llIllIlllIl[1];

                    if (1 < 0) {
                        return false;
                    }
                } else {
                    bl2 = llIllIlllIl[2];
                }
                return bl2;
            }).allMatch(Reachable::isWalkable)).filter(var3::P).filter(Reachable::isWalkable).min(Comparator.comparingInt(arg_0 -> bS.e((Player)var5, arg_0))).orElse(null);
            if (bS.lIlIlIlIlIIIlI(var12)) {
                return llIllIlllIl[2];
            }
            f.a(var12);
            if (bS.lIlIlIlIlIIlII(var12.equals((Object)var10) ? 1 : 0)) {
                var3.a(var12, arg_0 -> var3.g((List)var2, arg_0));
                return llIllIlllIl[1];
            }
            return llIllIlllIl[2];
        }
        if (bS.lIlIlIlIlIIIll(var4.distanceTo((Locatable)var5), llIllIlllIl[1])) {
            return llIllIlllIl[2];
        }
        if (bS.lIlIlIlIlIIlII(var5.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var5.getWorldLocation().dy(var1));

            if ((21 + 8 - 8 + 142 ^ 59 + 157 - 60 + 11) <= 0) {
                return false;
            }
        } else {
            Movement.walkTo((WorldPoint)var5.getWorldLocation().dy(var1 * llIllIlllIl[7]));

        }
        return llIllIlllIl[1];
    }

    static {
        bS.lIlIlIlIlIIIII();
        he = new RegionPoint(llIllIlllIl[8], llIllIlllIl[9], llIllIlllIl[2], llIllIlllIl[10]);
    }

    private static  int c(Player player, NPC nPC) {
        return nPC.getWorldLocation().distanceTo2D(player.getWorldLocation());
    }

    @Inject
    protected DodgingWaveTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bY.WAVE);
    }

    private boolean cz() {
        return this.cD().stream().noneMatch(nPC -> {
            boolean bl2;
            if (bS.lIlIlIlIlIIlII(nPC.getOrientation())) {
                bl2 = llIllIlllIl[1];

                if (-(0x36 ^ 0x32) >= 0) {
                    return false;
                }
            } else {
                bl2 = llIllIlllIl[2];
            }
            return bl2;
        });
    }
}

