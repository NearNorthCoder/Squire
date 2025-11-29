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
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Clearing boulder", priority=150, blocking=true)
public class ClearingBoulderTask
extends AutotoaManager {
    
    private static final  int gT;
    
    private  bQ gY;
    private static final  int gW;
    private static final  int gV;
    private final  SquireAutoTOA gX;
    private static final  int gS;
    private static final  int gU;

    static {
        bP.var3();
        bP.var4();
        gV = var1[5];
        gU = var1[18];
        gW = var1[6];
        gS = var1[7];
        gT = var1[17];
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    protected ClearingBoulderTask(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.gX = squireAutoTOA;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static  boolean c(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.var13(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = var1[0];
            0;
            if (((68 + 11 - -3 + 149 ^ 159 + 121 - 250 + 164) & (113 + 35 - 143 + 144 ^ 71 + 30 - 97 + 172 ^ -1)) >= 2) {
                return ((0x23 ^ 0x42 ^ (0x3D ^ 0x61)) & (0x72 ^ 2 ^ (0x77 ^ 0x3A) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[1];
        }
        return bl2;
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var15;
        bP var16;
        int[] nArray = new int[var1[0]];
        nArray[bP.var1[1]] = var1[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.var12(list.isEmpty() ? 1 : 0)) {
            this.gY = null;
            return var1[1];
        }
        if (bP.var17(var16.cG().isEmpty() ? 1 : 0)) {
            return var1[1];
        }
        var16.gX.a(var1[3]);
        NPC var18 = var15.stream().filter(nPC -> this.F((NPC)nPC).stream().anyMatch(worldPoint -> {
            boolean bl2;
            if (bP.var17(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = var1[0];
                0;
                if (((3 ^ 7) & ~(0x3A ^ 0x3E)) == 3) {
                    return ((0xB0 ^ 0x98) & ~(0xBE ^ 0x96)) != 0;
                }
            } else {
                bl2 = var1[1];
            }
            return bl2;
        })).findFirst().orElse(null);
        WorldPoint var19 = Players.getLocal().getWorldLocation();
        if (bP.var20(var18)) {
            WorldPoint var21 = var18.getWorldLocation().dx(var1[0]);
            Iterator<WorldPoint> var22 = var16.F(var18).iterator();
            while (bP.var12(var22.hasNext() ? 1 : 0)) {
                WorldPoint var23 = var22.next();
                if (bP.var17(var16.p(var23) ? 1 : 0)) {
                    var21 = var23;
                }
                0;
                if (3 > 0) continue;
                return ((8 ^ 0x18 ^ (0x17 ^ 0x3D)) & (91 + 88 - 142 + 100 ^ 96 + 136 - 230 + 177 ^ -1)) != 0;
            }
            if (bP.var12(var19.equals((Object)var21) ? 1 : 0)) {
                var16.gX.c();
                return var1[1];
            }
            var16.a(var21, var16::P);
            return var1[0];
        }
        NPC var21 = NPCs.getNearest(nPC -> {
            boolean bl2;
            if (!bP.var24(nPC.getId(), var1[17]) || bP.var11(nPC.getId(), var1[18])) {
                bl2 = var1[0];
                0;
                if (1 > 3) {
                    return ((82 + 108 - 125 + 70 ^ 30 + 159 - 124 + 95) & (0x29 ^ 0x21 ^ (0x9C ^ 0xB3) ^ -1)) != 0;
                }
            } else {
                bl2 = var1[1];
            }
            return bl2;
        });
        if (bP.var20(var21)) {
            if (bP.var20(var16.gY) && bP.var17(var16.gY.hd)) {
                WorldPoint var22 = var16.gY.ct();
                List<TileObject> var23 = var16.cC();
                WorldPoint var25 = var22.createWorldArea(var1[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bP.var17(this.k(var23, (WorldPoint)worldPoint) ? 1 : 0)) {
                        bl2 = var1[0];
                        0;
                        if null != null {
                            return ((0xA1 ^ 0xC5 ^ (0xD3 ^ 0x86)) & (0x14 ^ 0x77 ^ (0x5B ^ 9) ^ -1)) != 0;
                        }
                    } else {
                        bl2 = var1[1];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var22))).orElse(null);
                NPC var26 = var16.cB();
                WorldArea var27 = var26.getWorldArea();
                var16.a(var25, worldPoint -> {
                    int n2;
                    if (bP.var17(this.k(var23, (WorldPoint)worldPoint) ? 1 : 0) && bP.var17(var27.isInMeleeDistance(worldPoint) ? 1 : 0) && bP.var28(var27.distanceTo2D(worldPoint), var1[0])) {
                        n2 = var1[0];
                        0;
                        if (2 >= (84 + 63 - 86 + 94 ^ 69 + 76 - 20 + 34)) {
                            return ((0x6C ^ 0x5A ^ (5 ^ 0x1F)) & (0xC4 ^ 0xC1 ^ (0x7C ^ 0x55) ^ -1)) != 0;
                        }
                    } else {
                        n2 = var1[1];
                    }
                    return n2 != 0;
                });
                return var1[0];
            }
            NPC var22 = var15.stream().min(Comparator.comparingDouble(nPC2 -> nPC2.distanceTo((Locatable)var21))).orElse(null);
            if (bP.var14(var22)) {
                boolean bl2;
                if (bP.var14(var16.cA())) {
                    bl2 = var1[0];
                    0;
                    if (((20 + 149 - 53 + 78 ^ 108 + 85 - 85 + 32) & (0x11 ^ 0x73 ^ (0x52 ^ 0x7E) ^ -1)) > 1) {
                        return ((0xFB ^ 0xA8 ^ (0x64 ^ 0xD)) & (108 + 132 - 110 + 50 ^ 84 + 63 - 29 + 24 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[1];
                }
                return bl2;
            }
            Iterator<WorldPoint> var23 = var16.F(var22).iterator();
            while (bP.var12(var23.hasNext() ? 1 : 0)) {
                WorldPoint var25 = var23.next();
                if (bP.var13(var21.distanceTo(var25), var1[5]) && (!bP.var20(var16.gY) || bP.var12(var16.gY.hd))) {
                    var16.bp();
                    var21.interact(var2[var1[1]]);
                    return var1[0];
                }
                0;
                if (1 == 1) continue;
                return ((0x21 ^ 0x29) & ~(0x71 ^ 0x79)) != 0;
            }
            return var1[0];
        }
        if (bP.var14(var16.gY)) {
            var16.gY = var16.p(var1[6]);
            return var1[0];
        }
        NPC var22 = var16.gY.cv();
        if (bP.var14(var22)) {
            return var1[1];
        }
        NPC var23 = var16.gY.cu();
        if (bP.var14(var23)) {
            return var1[1];
        }
        WorldPoint var25 = var16.gY.ct();
        if (bP.var12(var19.equals((Object)var25) ? 1 : 0)) {
            if (bP.var13(var22.getWorldLocation().distanceTo(var16.gY.cw()), var1[0]) && bP.var12(var16.gY.hd)) {
                var22.interact(var2[var1[0]]);
                0;
                if (3 <= 1) {
                    return ((0x31 ^ 0x3D) & ~(0x6C ^ 0x60)) != 0;
                }
            } else {
                var22.interact(var2[var1[4]]);
                0;
                if (3 != 3) {
                    return ((0x15 ^ 0x42 ^ (0xC9 ^ 0x86)) & (0x9A ^ 0x93 ^ (0x47 ^ 0x56) ^ -1)) != 0;
                }
            }
        } else {
            var16.a(var25, var16::P);
        }
        return var1[0];
    }

    private static  boolean i(WorldPoint worldPoint, NPC nPC) {
        boolean bl2;
        if (!bP.var24(nPC.getWorldX(), worldPoint.getWorldX()) || bP.var11(nPC.getWorldY(), worldPoint.getWorldY())) {
            bl2 = var1[0];
            0;
            if null != null {
                return ((0xA7 ^ 0xB6) & ~(0x8F ^ 0x9E)) != 0;
            }
        } else {
            bl2 = var1[1];
        }
        return bl2;
    }

    private static boolean var13(int n2, int n3) {
        return n2 <= n3;
    }

    private List<WorldPoint> E(NPC nPC) {
        WorldPoint worldPoint = nPC.getWorldLocation();
        WorldPoint worldPoint2 = worldPoint.getWorldLocation().dy(var1[0]);
        WorldPoint worldPoint3 = worldPoint.getWorldLocation().dy(var1[8]);
        WorldPoint[] worldPointArray = new WorldPoint[var1[9]];
        worldPointArray[bP.var1[1]] = worldPoint.dx(var1[0]);
        worldPointArray[bP.var1[0]] = worldPoint.dx(var1[4]);
        worldPointArray[bP.var1[4]] = worldPoint.dx(var1[5]);
        worldPointArray[bP.var1[5]] = worldPoint.dx(var1[10]);
        worldPointArray[bP.var1[10]] = worldPoint2.dx(var1[0]);
        worldPointArray[bP.var1[11]] = worldPoint2.dx(var1[4]);
        worldPointArray[bP.var1[12]] = worldPoint2.dx(var1[5]);
        worldPointArray[bP.var1[6]] = worldPoint2.dx(var1[10]);
        worldPointArray[bP.var1[13]] = worldPoint3.dx(var1[0]);
        worldPointArray[bP.var1[14]] = worldPoint3.dx(var1[4]);
        worldPointArray[bP.var1[15]] = worldPoint3.dx(var1[5]);
        worldPointArray[bP.var1[16]] = worldPoint3.dx(var1[10]);
        return List.of(worldPointArray);
    }

    /*
     * WARNING - void declaration
     */
    private bQ p(int n2) {
        void var3_3;
        void var29;
        Object var30;
        NPC var31;
        bP var32;
        NPC var33;
        void var34;
        int[] nArray = new int[var1[0]];
        nArray[bP.var1[1]] = var1[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.var12(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        ArrayList<Object> var35 = new ArrayList<Object>();
        Player var36 = Players.getLocal();
        int[] nArray2 = new int[var1[0]];
        nArray2[bP.var1[1]] = var1[7];
        List var37 = NPCs.getAll((int[])nArray2);
        Iterator var38 = var34.iterator();
        while (bP.var12(var38.hasNext() ? 1 : 0)) {
            var33 = (NPC)var38.next();
            var31 = var32.F(var33).iterator();
            while (bP.var12(var31.hasNext() ? 1 : 0)) {
                var30 = var31.next();
                if (bP.var17(var32.p((WorldPoint)var30) ? 1 : 0)) {
                    var35.add(new bQ(var33, null, var33.getWorldLocation(), var1[1], var1[1]));
                    0;
                }
                0;
                if (-1 <= 0) continue;
                return null;
            }
            var31 = var37.stream().filter(arg_0 -> bP.c(var33, (int)var29, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (!bP.var24(nPC2.getWorldY(), var33.getWorldY()) || bP.var11(nPC2.getWorldX(), var33.getWorldX())) {
                    bl2 = var1[0];
                    0;
                    if (2 <= -1) {
                        return ((0x90 ^ 0xC5 ^ (0x9C ^ 0x9B)) & (105 + 40 - -4 + 54 ^ 103 + 113 - 101 + 38 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.var20(var31)) {
                var30 = new bQ(var33, var31, var33.getWorldLocation(), var1[1], var1[1]);
                if (bP.var12(var32.p(((bQ)var30).ct()) ? 1 : 0)) {
                    0;
                    if (2 != 3) continue;
                    return null;
                }
                var35.add(var30);
                0;
            }
            0;
            if (((0x63 ^ 0x3D) & ~(0xDF ^ 0x81)) <= 0) continue;
            return null;
        }
        var38 = var34.iterator();
        while (bP.var12(var38.hasNext() ? 1 : 0)) {
            var33 = (NPC)var38.next();
            var31 = var37.stream().filter(arg_0 -> bP.b(var33, (int)var29, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (bP.var11(Math.abs(nPC2.getWorldX() - var33.getWorldX()), Math.abs(nPC2.getWorldY() - var33.getWorldY()))) {
                    bl2 = var1[0];
                    0;
                    if (3 > 3) {
                        return ((33 + 160 - 128 + 150 ^ 79 + 43 - -9 + 14) & (0x26 ^ 0xF ^ (0xF4 ^ 0x9B) ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.var20(var31)) {
                var30 = new bQ(var33, var31, var33.getWorldLocation(), var1[0], var1[1]);
                if (bP.var12(var32.p(((bQ)var30).ct()) ? 1 : 0)) {
                    0;
                    if (-(46 + 152 - 66 + 40 ^ 25 + 23 - 41 + 162) < 0) continue;
                    return null;
                }
                var35.add(var30);
                0;
            }
            0;
            if (((0x7E ^ 7 ^ (0x7D ^ 0x45)) & (0x5C ^ 0x34 ^ (0x62 ^ 0x4B) ^ -1)) == 0) continue;
            return null;
        }
        var38 = var34.iterator();
        while (bP.var12(var38.hasNext() ? 1 : 0)) {
            var33 = (NPC)var38.next();
            var31 = var32.E(var33).iterator();
            while (bP.var12(var31.hasNext() ? 1 : 0)) {
                var30 = (WorldPoint)var31.next();
                NPC var39 = var37.stream().filter(arg_0 -> bP.a((WorldPoint)var30, (int)var29, arg_0)).filter(arg_0 -> bP.i((WorldPoint)var30, arg_0)).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
                if (bP.var20(var39)) {
                    bQ var40 = new bQ(var33, var39, (WorldPoint)var30, var1[1], var1[0]);
                    if (bP.var12(var32.p(var40.ct()) ? 1 : 0)) {
                        0;
                        if null == null continue;
                        return null;
                    }
                    var35.add(var40);
                    0;
                }
                0;
                if (-1 != 3) continue;
                return null;
            }
            0;
            if (1 > -1) continue;
            return null;
        }
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return var3_3.stream().filter(bQ2 -> {
            boolean bl2;
            if (!bP.var12(bQ2.hd) || bP.var28(bQ2.hb.distanceTo((Locatable)bQ2.ha), var1[0])) {
                bl2 = var1[0];
                0;
                if (3 >= (0x22 ^ 0x26)) {
                    return ((0xD9 ^ 0xC0) & ~(0xA4 ^ 0xBD)) != 0;
                }
            } else {
                bl2 = var1[1];
            }
            return bl2;
        }).min(Comparator.comparingInt(bQ2 -> bQ2.hb.distanceTo(worldPoint) + bQ2.ha.getWorldLocation().distanceTo((Locatable)bQ2.gZ))).orElse(null);
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private static boolean var24(int n2, int n3) {
        return n2 != n3;
    }

    private static void var4() {
        var2 = new String[var1[5]];
        bP.var2[bP.var1[1]] = "Attack";
        bP.var2[bP.var1[0]] = "Hit";
        bP.var2[bP.var1[4]] = "Push";
    }

    private static boolean var28(int n2, int n3) {
        return n2 > n3;
    }

    private List<WorldPoint> F(NPC nPC) {
        WorldPoint worldPoint = nPC.getWorldLocation();
        return List.of(worldPoint.dx(var1[0]), worldPoint.dx(var1[4]), worldPoint.dx(var1[5]));
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[19];
        bP.var1[0] = 1;
        bP.var1[1] = (162 + 90 - 207 + 123 ^ 75 + 138 - 44 + 5) & (0x6D ^ 0x32 ^ (0xDC ^ 0x85) ^ -1);
        bP.var1[2] = -(0xFFFFDB85 & 0x767F) & (0xFFFFFFDD & Short.MAX_VALUE);
        bP.var1[3] = 103 + 3 - -50 + 5 ^ 116 + 123 - 213 + 111;
        bP.var1[4] = 2;
        bP.var1[5] = 3;
        bP.var1[6] = 0x38 ^ 0x3F;
        bP.var1[7] = 0xFFFFFFFF & 0x2DD7;
        bP.var1[8] = -1;
        bP.var1[9] = 0x19 ^ 0x7F ^ (0x4B ^ 0x21);
        bP.var1[10] = 0x27 ^ 0x23;
        bP.var1[11] = 0x4F ^ 0x4A;
        bP.var1[12] = 0x80 ^ 0x86;
        bP.var1[13] = 0xFD ^ 0x8E ^ (0x4F ^ 0x34);
        bP.var1[14] = 58 + 143 - 134 + 92 ^ 9 + 63 - -58 + 20;
        bP.var1[15] = 0x7C ^ 0x76;
        bP.var1[16] = 0x3E ^ 0x35;
        bP.var1[17] = 0xFFFFEDD8 & 0x3FFF;
        bP.var1[18] = -(0x88 ^ 0x93) & (0xFFFFAFFF & 0x7DFB);
    }

    private static  boolean b(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.var13(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = var1[0];
            0;
            if (-1 != -1) {
                return ((0xCD ^ 0xB3 ^ (0x81 ^ 0xC4)) & ((0x5A ^ 0x61) & ~(0xBD ^ 0x86) ^ (0x93 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[1];
        }
        return bl2;
    }

    private static  boolean a(WorldPoint worldPoint, int n2, NPC nPC) {
        boolean bl2;
        if (bP.var13(nPC.getWorldLocation().distanceTo(worldPoint), n2)) {
            bl2 = var1[0];
            0;
            if (2 <= ((0x18 ^ 0x5E ^ (0x36 ^ 0x3E)) & (0x71 ^ 0x42 ^ (0xD8 ^ 0xA5) ^ -1))) {
                return ((41 + 106 - 125 + 122 ^ 115 + 122 - 89 + 47) & (9 ^ 0x4A ^ (0xA0 ^ 0xB0) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[1];
        }
        return bl2;
    }

        catch (Exception var46) {
            var46.printStackTrace();
            return null;
        }
    }

    @Override
    public void r() {
        this.gX.c();
        this.gY = null;
    }
}

