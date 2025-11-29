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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum6;
import gg.squire.autotoa.tasks.FHelper;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging wave", priority=150, blocking=true)
public class DodgingWaveTask
extends AutotoaManager {
    
    private static final  RegionPoint he;

    private static  int e(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo((Locatable)player);
    }

    private static boolean var2(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var3() {
        var1 = new int[11];
        bS.var1[0] = 0x98 ^ 0x9F;
        bS.var1[1] = 1;
        bS.var1[2] = (0x10 ^ 0x55 ^ (0xFE ^ 0xB2)) & (58 + 34 - 80 + 146 ^ 68 + 56 - -16 + 11 ^ -1);
        bS.var1[3] = 0x3C ^ 0x45 ^ (0x53 ^ 0x22);
        bS.var1[4] = -1;
        bS.var1[5] = 3;
        bS.var1[6] = 0x2F ^ 0x29;
        bS.var1[7] = -2;
        bS.var1[8] = 137 + 91 - 96 + 14 ^ 23 + 83 - 97 + 128;
        bS.var1[9] = 0xAD ^ 0x8C;
        bS.var1[10] = -(0xFFFFE2A6 & 0x5FFB) & (0xFFFFFFF5 & Short.MAX_VALUE);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    private  boolean h(List list, WorldPoint worldPoint3) {
        return worldPoint3.toWorldArea().offset(var1[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (bS.var6(worldPoint2.getWorldX(), worldPoint3.getWorldX())) {
                bl2 = var1[1];
                0;
                if (2 != 2) {
                    return ((83 + 1 - -39 + 64 ^ 7 + 7 - -118 + 4) & (40 + 37 - -89 + 15 ^ 51 + 99 - 116 + 100 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[2];
            }
            return bl2;
        }).noneMatch(worldPoint -> this.k(list, (WorldPoint)worldPoint));
    }

    private  boolean g(List list, WorldPoint worldPoint) {
        boolean bl2;
        if (bS.var7(this.k(list, worldPoint) ? 1 : 0)) {
            bl2 = var1[1];
            0;
            if null != null {
                return ((0x58 ^ 0x38) & ~(0x78 ^ 0x18)) != 0;
            }
        } else {
            bl2 = var1[2];
        }
        return bl2;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    private  boolean j(List list, WorldPoint worldPoint) {
        boolean bl2;
        if (bS.var7(this.k(list, worldPoint) ? 1 : 0)) {
            bl2 = var1[1];
            0;
            if (3 > 3) {
                return ((0x5A ^ 0x4B ^ (0x71 ^ 0x4B)) & (128 + 45 - 111 + 172 ^ 35 + 89 - 18 + 87 ^ -1)) != 0;
            }
        } else {
            bl2 = var1[2];
        }
        return bl2;
    }

    private static  boolean d(Player player, NPC nPC) {
        boolean bl2;
        if (bS.var9(nPC.getWorldY(), player.getWorldY())) {
            bl2 = var1[1];
            0;
            if (-1 == 3) {
                return ((0x1C ^ 0x56) & ~(0x23 ^ 0x69)) != 0;
            }
        } else {
            bl2 = var1[2];
        }
        return bl2;
    }

    private int L(WorldPoint worldPoint) {
        return worldPoint.distanceTo(this.c(he));
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static  boolean b(Player player, NPC nPC) {
        boolean bl2;
        if (bS.var6(nPC.getWorldX(), player.getWorldX())) {
            bl2 = var1[1];
            0;
            if null != null {
                return ((0xD2 ^ 0x88 ^ (0xF5 ^ 0x81)) & (0x42 ^ 0x4C ^ (0x52 ^ 0x72) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        int var11;
        int n2;
        void var12;
        bS var13;
        NPC var14;
        void var15;
        List<NPC> var16;
        Player player = Players.getLocal();
        List<NPC> list = this.cD();
        List<TileObject> list2 = this.cC();
        if (bS.var8(this.cz() ? 1 : 0)) {
            NPC nPC3 = list.stream().filter(nPC -> {
                boolean bl2;
                if (bS.var2(nPC.getWorldY(), player.getWorldY())) {
                    bl2 = var1[1];
                    0;
                    if (3 < 0) {
                        return ((0x33 ^ 0x1D ^ (0x34 ^ 0x32)) & (141 + 62 - 135 + 96 ^ 106 + 44 - 112 + 102 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[2];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo2D(player.getWorldLocation()))).orElse(null);
            0;
            if null != null {
                return ((0xF7 ^ 0xC5 ^ (0xC7 ^ 0xA9)) & (14 + 99 - -105 + 12 ^ 33 + 109 - 44 + 88 ^ -1)) != 0;
            }
        } else {
            var14 = var16.stream().filter(arg_0 -> bS.d((Player)var15, arg_0)).min(Comparator.comparingInt(arg_0 -> bS.c((Player)var15, arg_0))).orElse(null);
        }
        if (bS.var10(var14)) {
            WorldPoint var17 = Players.getLocal().getWorldLocation();
            if (bS.var5(var13.L(var17), var1[0])) {
                var13.a(var13.c(he), arg_0 -> var13.j((List)var12, arg_0));
                return var1[1];
            }
            return var1[2];
        }
        var16 = var16.stream().filter(nPC2 -> {
            boolean bl2;
            if (bS.var6(nPC2.getWorldY(), var14.getWorldY())) {
                bl2 = var1[1];
                0;
                if (2 < ((0xB4 ^ 0xC3 ^ (0xDB ^ 0x9C)) & (0x35 ^ 3 ^ (0x2B ^ 0x2D) ^ -1))) {
                    return ((0x75 ^ 0x46 ^ (0x42 ^ 0x53)) & (9 + 100 - 79 + 106 ^ 127 + 3 - 66 + 106 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[2];
            }
            return bl2;
        }).collect(Collectors.toList());
        NPC var17 = var13.cB();
        WorldArea var18 = var17.getWorldArea();
        int var19 = var18.getX() + var18.getWidth();
        if (bS.var8(var16.stream().noneMatch(arg_0 -> bS.b((Player)var15, arg_0)) ? 1 : 0)) {
            boolean bl2;
            if (bS.var5(Math.abs(var19 - var15.getWorldX()), var1[3])) {
                bl2 = var1[1];
                0;
                if (-1 > 0) {
                    return ((0xB4 ^ 0xAC) & ~(0xA9 ^ 0xB1)) != 0;
                }
            } else {
                bl2 = var1[2];
            }
            return bl2;
        }
        f.b(var16);
        if (bS.var8(var13.cz() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (((1 + 5 - -124 + 4 ^ 3 + 115 - 58 + 94) & (0x4B ^ 0x77 ^ (0x45 ^ 0x65) ^ -1)) >= (0xDD ^ 0xBF ^ (0x7A ^ 0x1C))) {
                return ((35 + 124 - 109 + 139 ^ 0 + 139 - 57 + 95) & (0x86 ^ 0xA6 ^ (0x22 ^ 0xE) ^ -1)) != 0;
            }
        } else {
            n2 = var11 = var1[4];
        }
        if (bS.var5(var14.distanceTo((Locatable)var15), var1[5])) {
            WorldPoint var20 = Players.getLocal().getWorldLocation();
            if (bS.var8(var20.toWorldArea().offset(var1[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                boolean bl2;
                if (bS.var6(worldPoint2.getWorldX(), var20.getWorldX())) {
                    bl2 = var1[1];
                    0;
                    if ((0xCE ^ 0x9F ^ (0x1E ^ 0x4B)) <= ((90 + 183 - 95 + 7 ^ 96 + 8 - -36 + 2) & (0x3C ^ 0x42 ^ (0x5C ^ 0x15) ^ -1))) {
                        return ((0x2C ^ 0x28 ^ (0xB9 ^ 0xB6)) & (0x68 ^ 0x53 ^ (0x8C ^ 0xBC) ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[2];
                }
                return bl2;
            }).allMatch(worldPoint -> {
                int n2;
                if (bS.var8(this.P((WorldPoint)worldPoint) ? 1 : 0) && bS.var2(this.L((WorldPoint)worldPoint), var1[0])) {
                    n2 = var1[1];
                    0;
                    if (-(0x8C ^ 0x9D ^ (3 ^ 0x17)) >= 0) {
                        return ((0 ^ 0x49 ^ (0xE3 ^ 0xBB)) & (0x41 ^ 0x7C ^ (0x67 ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[2];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                return var1[2];
            }
            List var21 = var13.c(he).toWorldArea().offset(var1[6]).toWorldPointList();
            WorldPoint var22 = var21.stream().filter(worldPoint -> {
                boolean bl2;
                if (bS.var2(this.L((WorldPoint)worldPoint), var1[6])) {
                    bl2 = var1[1];
                    0;
                    if (((32 + 82 - 108 + 146 ^ 118 + 39 - 63 + 53) & (1 ^ (0x8D ^ 0x87) ^ -1)) != 0) {
                        return ((150 + 50 - 124 + 105 ^ 89 + 51 - 81 + 109) & (38 + 166 - 133 + 111 ^ 21 + 33 - -95 + 22 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[2];
                }
                return bl2;
            }).filter(worldPoint -> {
                void var23;
                void var24;
                boolean bl2;
                if (bS.var8(this.cz() ? 1 : 0)) {
                    if (bS.var5(worldPoint.getWorldY(), var14.getWorldY())) {
                        bl2 = var1[1];
                        0;
                        if ((0x78 ^ 0x20 ^ (0x48 ^ 0x15)) <= 0) {
                            return ((191 + 65 - 194 + 145 ^ 127 + 25 - 127 + 104) & (168 + 189 - 252 + 126 ^ 105 + 124 - 94 + 34 ^ -1)) != 0;
                        }
                    } else {
                        bl2 = var1[2];
                        0;
                        if (2 <= ((0x36 ^ 0x22) & ~(0x80 ^ 0x94))) {
                            return ((0x45 ^ 0x55) & ~(0x4F ^ 0x5F)) != 0;
                        }
                    }
                } else if (bS.var4(var24.getWorldY(), var23.getWorldY())) {
                    bl2 = var1[1];
                    0;
                    
                } else {
                    bl2 = var1[2];
                }
                return bl2;
            }).filter(arg_0 -> var13.h((List)var12, arg_0)).filter(worldPoint -> worldPoint.toWorldArea().offset(var1[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                boolean bl2;
                if (bS.var6(worldPoint2.getWorldX(), worldPoint.getWorldX())) {
                    bl2 = var1[1];
                    0;
                    if (1 < 0) {
                        return ((0x3F ^ 0x20) & ~(0x7C ^ 0x63)) != 0;
                    }
                } else {
                    bl2 = var1[2];
                }
                return bl2;
            }).allMatch(Reachable::isWalkable)).filter(var13::P).filter(Reachable::isWalkable).min(Comparator.comparingInt(arg_0 -> bS.e((Player)var15, arg_0))).orElse(null);
            if (bS.var10(var22)) {
                return var1[2];
            }
            f.a(var22);
            if (bS.var7(var22.equals((Object)var20) ? 1 : 0)) {
                var13.a(var22, arg_0 -> var13.g((List)var12, arg_0));
                return var1[1];
            }
            return var1[2];
        }
        if (bS.var5(var14.distanceTo((Locatable)var15), var1[1])) {
            return var1[2];
        }
        if (bS.var7(var15.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var15.getWorldLocation().dy(var11));
            0;
            0;
            if ((21 + 8 - 8 + 142 ^ 59 + 157 - 60 + 11) <= 0) {
                return ((73 + 62 - 84 + 78 ^ 178 + 55 - 201 + 148) & (2 + 130 - 3 + 23 ^ 21 + 129 - 47 + 70 ^ -1)) != 0;
            }
        } else {
            Movement.walkTo((WorldPoint)var15.getWorldLocation().dy(var11 * var1[7]));
            0;
        }
        return var1[1];
    }

    static {
        bS.var3();
        he = new RegionPoint(var1[8], var1[9], var1[2], var1[10]);
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
            if (bS.var7(nPC.getOrientation())) {
                bl2 = var1[1];
                0;
                if (-(0x36 ^ 0x32) >= 0) {
                    return ((0xE2 ^ 0xAF) & ~(0x8E ^ 0xC3)) != 0;
                }
            } else {
                bl2 = var1[2];
            }
            return bl2;
        });
    }
}

