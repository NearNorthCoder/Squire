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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bQ;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Clearing boulder", priority=150, blocking=true)
public class ClearingBoulderTask
extends AutotoaTaskBase {
    
    private static final  int gT;
    
    private  bQ gY;
    private static final  int gW;
    private static final  int gV;
    private final  SquireAutoTOA gX;
    private static final  int gS;
    private static final  int gU;

    static {
        bP.lIlIIIIIIlIIII();
        bP.lIlIIIIIIIllll();
        gV = llIIlIIIlIl[5];
        gU = llIIlIIIlIl[18];
        gW = llIIlIIIlIl[6];
        gS = llIIlIIIlIl[7];
        gT = llIIlIIIlIl[17];
    }

    @Inject
    protected ClearingBoulderTask(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.gX = squireAutoTOA;
    }

    private static boolean lIlIIIIIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static  boolean c(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = llIIlIIIlIl[0];

            if (((68 + 11 - -3 + 149 ^ 159 + 121 - 250 + 164) & (113 + 35 - 143 + 144 ^ 71 + 30 - 97 + 172 ^ -1)) >= 2) {
                return ((0x23 ^ 0x42 ^ (0x3D ^ 0x61)) & (0x72 ^ 2 ^ (0x77 ^ 0x3A) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static boolean lIlIIIIIIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var1;
        bP var2;
        int[] nArray = new int[llIIlIIIlIl[0]];
        nArray[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.lIlIIIIIIlIIIl(list.isEmpty() ? 1 : 0)) {
            this.gY = null;
            return llIIlIIIlIl[1];
        }
        if (bP.lIlIIIIIIlIIlI(var2.cG().isEmpty() ? 1 : 0)) {
            return llIIlIIIlIl[1];
        }
        var2.gX.a(llIIlIIIlIl[3]);
        NPC var3 = var1.stream().filter(nPC -> this.F((NPC)nPC).stream().anyMatch(worldPoint -> {
            boolean bl2;
            if (bP.lIlIIIIIIlIIlI(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIIlIIIlIl[0];

                if (((3 ^ 7) & ~(0x3A ^ 0x3E)) == 3) {
                    return false;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        })).findFirst().orElse(null);
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if (bP.lIlIIIIIIlIIll(var3)) {
            WorldPoint var5 = var3.getWorldLocation().dx(llIIlIIIlIl[0]);
            Iterator<WorldPoint> var6 = var2.F(var3).iterator();
            while (bP.lIlIIIIIIlIIIl(var6.hasNext() ? 1 : 0)) {
                WorldPoint var7 = var6.next();
                if (bP.lIlIIIIIIlIIlI(var2.p(var7) ? 1 : 0)) {
                    var5 = var7;
                }

                if (3 > 0) continue;
                return ((8 ^ 0x18 ^ (0x17 ^ 0x3D)) & (91 + 88 - 142 + 100 ^ 96 + 136 - 230 + 177 ^ -1)) != 0;
            }
            if (bP.lIlIIIIIIlIIIl(var4.equals((Object)var5) ? 1 : 0)) {
                var2.gX.c();
                return llIIlIIIlIl[1];
            }
            var2.a(var5, var2::P);
            return llIIlIIIlIl[0];
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            boolean bl2;
            if (!bP.lIlIIIIIIlIlll(nPC.getId(), llIIlIIIlIl[17]) || bP.lIlIIIIIIllIII(nPC.getId(), llIIlIIIlIl[18])) {
                bl2 = llIIlIIIlIl[0];

                if (1 > 3) {
                    return ((82 + 108 - 125 + 70 ^ 30 + 159 - 124 + 95) & (0x29 ^ 0x21 ^ (0x9C ^ 0xB3) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        });
        if (bP.lIlIIIIIIlIIll(var5)) {
            if (bP.lIlIIIIIIlIIll(var2.gY) && bP.lIlIIIIIIlIIlI(var2.gY.hd ? 1 : 0)) {
                WorldPoint var6 = var2.gY.ct();
                List<TileObject> var7 = var2.cC();
                WorldPoint var8 = var6.createWorldArea(llIIlIIIlIl[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bP.lIlIIIIIIlIIlI(this.k(var7, (WorldPoint)worldPoint) ? 1 : 0)) {
                        bl2 = llIIlIIIlIl[0];

                        }
                    } else {
                        bl2 = llIIlIIIlIl[1];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var6))).orElse(null);
                NPC var9 = var2.cB();
                WorldArea var10 = var9.getWorldArea();
                var2.a(var8, worldPoint -> {
                    int n2;
                    if (bP.lIlIIIIIIlIIlI(this.k(var7, (WorldPoint)worldPoint) ? 1 : 0) && bP.lIlIIIIIIlIIlI(var10.isInMeleeDistance(worldPoint) ? 1 : 0) && bP.lIlIIIIIIlIllI(var10.distanceTo2D(worldPoint), llIIlIIIlIl[0])) {
                        n2 = llIIlIIIlIl[0];

                        if (2 >= (84 + 63 - 86 + 94 ^ 69 + 76 - 20 + 34)) {
                            return ((0x6C ^ 0x5A ^ (5 ^ 0x1F)) & (0xC4 ^ 0xC1 ^ (0x7C ^ 0x55) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIlIIIlIl[1];
                    }
                    return n2 != 0;
                });
                return llIIlIIIlIl[0];
            }
            NPC var6 = var1.stream().min(Comparator.comparingDouble(nPC2 -> nPC2.distanceTo((Locatable)var5))).orElse(null);
            if (bP.lIlIIIIIIlIlII(var6)) {
                boolean bl2;
                if (bP.lIlIIIIIIlIlII(var2.cA())) {
                    bl2 = llIIlIIIlIl[0];

                    if (((20 + 149 - 53 + 78 ^ 108 + 85 - 85 + 32) & (0x11 ^ 0x73 ^ (0x52 ^ 0x7E) ^ -1)) > 1) {
                        return ((0xFB ^ 0xA8 ^ (0x64 ^ 0xD)) & (108 + 132 - 110 + 50 ^ 84 + 63 - 29 + 24 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }
            Iterator<WorldPoint> var7 = var2.F(var6).iterator();
            while (bP.lIlIIIIIIlIIIl(var7.hasNext() ? 1 : 0)) {
                WorldPoint var8 = var7.next();
                if (bP.lIlIIIIIIlIlIl(var5.distanceTo(var8), llIIlIIIlIl[5]) && (!bP.lIlIIIIIIlIIll(var2.gY) || bP.lIlIIIIIIlIIIl(var2.gY.hd ? 1 : 0))) {
                    var2.bp();
                    var5.interact(llIIlIIIlII[llIIlIIIlIl[1]]);
                    return llIIlIIIlIl[0];
                }

                if (1 == 1) continue;
                return false;
            }
            return llIIlIIIlIl[0];
        }
        if (bP.lIlIIIIIIlIlII(var2.gY)) {
            var2.gY = var2.p(llIIlIIIlIl[6]);
            return llIIlIIIlIl[0];
        }
        NPC var6 = var2.gY.cv();
        if (bP.lIlIIIIIIlIlII(var6)) {
            return llIIlIIIlIl[1];
        }
        NPC var7 = var2.gY.cu();
        if (bP.lIlIIIIIIlIlII(var7)) {
            return llIIlIIIlIl[1];
        }
        WorldPoint var8 = var2.gY.ct();
        if (bP.lIlIIIIIIlIIIl(var4.equals((Object)var8) ? 1 : 0)) {
            if (bP.lIlIIIIIIlIlIl(var6.getWorldLocation().distanceTo(var2.gY.cw()), llIIlIIIlIl[0]) && bP.lIlIIIIIIlIIIl(var2.gY.hd ? 1 : 0)) {
                var6.interact(llIIlIIIlII[llIIlIIIlIl[0]]);

                if (3 <= 1) {
                    return false;
                }
            } else {
                var6.interact(llIIlIIIlII[llIIlIIIlIl[4]]);

                if (3 != 3) {
                    return ((0x15 ^ 0x42 ^ (0xC9 ^ 0x86)) & (0x9A ^ 0x93 ^ (0x47 ^ 0x56) ^ -1)) != 0;
                }
            }
        } else {
            var2.a(var8, var2::P);
        }
        return llIIlIIIlIl[0];
    }

    private static  boolean i(WorldPoint worldPoint, NPC nPC) {
        boolean bl2;
        if (!bP.lIlIIIIIIlIlll(nPC.getWorldX(), worldPoint.getWorldX()) || bP.lIlIIIIIIllIII(nPC.getWorldY(), worldPoint.getWorldY())) {
            bl2 = llIIlIIIlIl[0];

            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static boolean lIlIIIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private List<WorldPoint> E(NPC nPC) {
        WorldPoint worldPoint = nPC.getWorldLocation();
        WorldPoint worldPoint2 = worldPoint.getWorldLocation().dy(llIIlIIIlIl[0]);
        WorldPoint worldPoint3 = worldPoint.getWorldLocation().dy(llIIlIIIlIl[8]);
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIIlIl[9]];
        worldPointArray[bP.llIIlIIIlIl[1]] = worldPoint.dx(llIIlIIIlIl[0]);
        worldPointArray[bP.llIIlIIIlIl[0]] = worldPoint.dx(llIIlIIIlIl[4]);
        worldPointArray[bP.llIIlIIIlIl[4]] = worldPoint.dx(llIIlIIIlIl[5]);
        worldPointArray[bP.llIIlIIIlIl[5]] = worldPoint.dx(llIIlIIIlIl[10]);
        worldPointArray[bP.llIIlIIIlIl[10]] = worldPoint2.dx(llIIlIIIlIl[0]);
        worldPointArray[bP.llIIlIIIlIl[11]] = worldPoint2.dx(llIIlIIIlIl[4]);
        worldPointArray[bP.llIIlIIIlIl[12]] = worldPoint2.dx(llIIlIIIlIl[5]);
        worldPointArray[bP.llIIlIIIlIl[6]] = worldPoint2.dx(llIIlIIIlIl[10]);
        worldPointArray[bP.llIIlIIIlIl[13]] = worldPoint3.dx(llIIlIIIlIl[0]);
        worldPointArray[bP.llIIlIIIlIl[14]] = worldPoint3.dx(llIIlIIIlIl[4]);
        worldPointArray[bP.llIIlIIIlIl[15]] = worldPoint3.dx(llIIlIIIlIl[5]);
        worldPointArray[bP.llIIlIIIlIl[16]] = worldPoint3.dx(llIIlIIIlIl[10]);
        return List.of(worldPointArray);
    }

    /*
     * WARNING - void declaration
     */
    private bQ p(int n2) {
        void var3_3;
        void var11;
        Object var12;
        NPC var13;
        bP var14;
        NPC var15;
        void var16;
        int[] nArray = new int[llIIlIIIlIl[0]];
        nArray[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.lIlIIIIIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        ArrayList<Object> var17 = new ArrayList<Object>();
        Player var18 = Players.getLocal();
        int[] nArray2 = new int[llIIlIIIlIl[0]];
        nArray2[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[7];
        List var19 = NPCs.getAll((int[])nArray2);
        Iterator var20 = var16.iterator();
        while (bP.lIlIIIIIIlIIIl(var20.hasNext() ? 1 : 0)) {
            var15 = (NPC)var20.next();
            var13 = var14.F(var15).iterator();
            while (bP.lIlIIIIIIlIIIl(var13.hasNext() ? 1 : 0)) {
                var12 = var13.next();
                if (bP.lIlIIIIIIlIIlI(var14.p((WorldPoint)var12) ? 1 : 0)) {
                    var17.add(new bQ(var15, null, var15.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]));

                }

                if (-1 <= 0) continue;
                return null;
            }
            var13 = var19.stream().filter(arg_0 -> bP.c(var15, (int)var11, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (!bP.lIlIIIIIIlIlll(nPC2.getWorldY(), var15.getWorldY()) || bP.lIlIIIIIIllIII(nPC2.getWorldX(), var15.getWorldX())) {
                    bl2 = llIIlIIIlIl[0];

                    if (2 <= -1) {
                        return ((0x90 ^ 0xC5 ^ (0x9C ^ 0x9B)) & (105 + 40 - -4 + 54 ^ 103 + 113 - 101 + 38 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.lIlIIIIIIlIIll(var13)) {
                var12 = new bQ(var15, var13, var15.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]);
                if (bP.lIlIIIIIIlIIIl(var14.p(((bQ)var12).ct()) ? 1 : 0)) {

                    if (2 != 3) continue;
                    return null;
                }
                var17.add(var12);

            }

            if (((0x63 ^ 0x3D) & ~(0xDF ^ 0x81)) <= 0) continue;
            return null;
        }
        var20 = var16.iterator();
        while (bP.lIlIIIIIIlIIIl(var20.hasNext() ? 1 : 0)) {
            var15 = (NPC)var20.next();
            var13 = var19.stream().filter(arg_0 -> bP.b(var15, (int)var11, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (bP.lIlIIIIIIllIII(Math.abs(nPC2.getWorldX() - var15.getWorldX()), Math.abs(nPC2.getWorldY() - var15.getWorldY()))) {
                    bl2 = llIIlIIIlIl[0];

                    if (3 > 3) {
                        return ((33 + 160 - 128 + 150 ^ 79 + 43 - -9 + 14) & (0x26 ^ 0xF ^ (0xF4 ^ 0x9B) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.lIlIIIIIIlIIll(var13)) {
                var12 = new bQ(var15, var13, var15.getWorldLocation(), llIIlIIIlIl[0], llIIlIIIlIl[1]);
                if (bP.lIlIIIIIIlIIIl(var14.p(((bQ)var12).ct()) ? 1 : 0)) {

                    if (-(46 + 152 - 66 + 40 ^ 25 + 23 - 41 + 162) < 0) continue;
                    return null;
                }
                var17.add(var12);

            }

            if (((0x7E ^ 7 ^ (0x7D ^ 0x45)) & (0x5C ^ 0x34 ^ (0x62 ^ 0x4B) ^ -1)) == 0) continue;
            return null;
        }
        var20 = var16.iterator();
        while (bP.lIlIIIIIIlIIIl(var20.hasNext() ? 1 : 0)) {
            var15 = (NPC)var20.next();
            var13 = var14.E(var15).iterator();
            while (bP.lIlIIIIIIlIIIl(var13.hasNext() ? 1 : 0)) {
                var12 = (WorldPoint)var13.next();
                NPC var21 = var19.stream().filter(arg_0 -> bP.a((WorldPoint)var12, (int)var11, arg_0)).filter(arg_0 -> bP.i((WorldPoint)var12, arg_0)).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
                if (bP.lIlIIIIIIlIIll(var21)) {
                    bQ var22 = new bQ(var15, var21, (WorldPoint)var12, llIIlIIIlIl[1], llIIlIIIlIl[0]);
                    if (bP.lIlIIIIIIlIIIl(var14.p(var22.ct()) ? 1 : 0)) {

                        return null;
                    }
                    var17.add(var22);

                }

                if (-1 != 3) continue;
                return null;
            }

            if (1 > -1) continue;
            return null;
        }
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return var3_3.stream().filter(bQ2 -> {
            boolean bl2;
            if (!bP.lIlIIIIIIlIIIl(bQ2.hd ? 1 : 0) || bP.lIlIIIIIIlIllI(bQ2.hb.distanceTo((Locatable)bQ2.ha), llIIlIIIlIl[0])) {
                bl2 = llIIlIIIlIl[0];

                if (3 >= (0x22 ^ 0x26)) {
                    return false;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        }).min(Comparator.comparingInt(bQ2 -> bQ2.hb.distanceTo(worldPoint) + bQ2.ha.getWorldLocation().distanceTo((Locatable)bQ2.gZ))).orElse(null);
    }

    private static boolean lIlIIIIIIlIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIIIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIIIIIIIllll() {
        llIIlIIIlII = new String[llIIlIIIlIl[5]];
        bP.llIIlIIIlII[bP.llIIlIIIlIl[1]] = "Attack";
        bP.llIIlIIIlII[bP.llIIlIIIlIl[0]] = "Hit";
        bP.llIIlIIIlII[bP.llIIlIIIlIl[4]] = "Push";
    }

    private static boolean lIlIIIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private List<WorldPoint> F(NPC nPC) {
        WorldPoint worldPoint = nPC.getWorldLocation();
        return List.of(worldPoint.dx(llIIlIIIlIl[0]), worldPoint.dx(llIIlIIIlIl[4]), worldPoint.dx(llIIlIIIlIl[5]));
    }

    private static boolean lIlIIIIIIlIIlI(int n2) {
        return n2 == 0;
    }

    private static  boolean b(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = llIIlIIIlIl[0];

            if (-1 != -1) {
                return ((0xCD ^ 0xB3 ^ (0x81 ^ 0xC4)) & ((0x5A ^ 0x61) & ~(0xBD ^ 0x86) ^ (0x93 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static  boolean a(WorldPoint worldPoint, int n2, NPC nPC) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), n2)) {
            bl2 = llIIlIIIlIl[0];

            if (2 <= ((0x18 ^ 0x5E ^ (0x36 ^ 0x3E)) & (0x71 ^ 0x42 ^ (0xD8 ^ 0xA5) ^ -1))) {
                return ((41 + 106 - 125 + 122 ^ 115 + 122 - 89 + 47) & (9 ^ 0x4A ^ (0xA0 ^ 0xB0) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    @Override
    public void r() {
        this.gX.c();
        this.gY = null;
    }
}

