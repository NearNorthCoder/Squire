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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bQ_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Clearing boulder -> ClearingboulderTask */
@TaskDesc(name="Clearing boulder", priority=150, blocking=true)
public class ClearingBoulderTask
extends bX_Unknown {
    private static /* synthetic */ int[] llIIlIIIlIl;
    private static final /* synthetic */ int gT;
    private static /* synthetic */ String[] llIIlIIIlII;
    private /* synthetic */ bQ gY;
    private static final /* synthetic */ int gW;
    private static final /* synthetic */ int gV;
    private final /* synthetic */ SquireAutoTOA gX;
    private static final /* synthetic */ int gS;
    private static final /* synthetic */ int gU;

    static {
        bP.lIlIIIIIIlIIII();
        bP.lIlIIIIIIIllll();
        gV = llIIlIIIlIl[5];
        gU = llIIlIIIlIl[18];
        gW = llIIlIIIlIl[6];
        gS = llIIlIIIlIl[7];
        gT = llIIlIIIlIl[17];
    }

    private static String lIlIIIIIIIlllI(String var19, String var18) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIlIIIlIl[4], var26);
            return new String(var3.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bP(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.gX = squireAutoTOA;
    }

    private static boolean lIlIIIIIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean c(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = llIIlIIIlIl[0];
            0;
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
        void var21;
        bP var22;
        int[] nArray = new int[llIIlIIIlIl[0]];
        nArray[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.lIlIIIIIIlIIIl(list.isEmpty() ? 1 : 0)) {
            this.gY = null;
            return llIIlIIIlIl[1];
        }
        if (bP.lIlIIIIIIlIIlI(var22.cG().isEmpty() ? 1 : 0)) {
            return llIIlIIIlIl[1];
        }
        var22.gX.a(llIIlIIIlIl[3]);
        NPC var31 = var21.stream().filter(nPC -> this.F((NPC)nPC).stream().anyMatch(worldPoint -> {
            boolean bl2;
            if (bP.lIlIIIIIIlIIlI(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIIlIIIlIl[0];
                0;
                if (((3 ^ 7) & ~(0x3A ^ 0x3E)) == 3) {
                    return false;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        })).findFirst().orElse(null);
        WorldPoint var29 = Players.getLocal().getWorldLocation();
        if (bP.lIlIIIIIIlIIll(var31)) {
            WorldPoint var25 = var31.getWorldLocation().dx(llIIlIIIlIl[0]);
            Iterator<WorldPoint> var5 = var22.F(var31).iterator();
            while (bP.lIlIIIIIIlIIIl(var5.hasNext() ? 1 : 0)) {
                WorldPoint var8 = var5.next();
                if (bP.lIlIIIIIIlIIlI(var22.p(var8) ? 1 : 0)) {
                    var25 = var8;
                }
                0;
                if (3 > 0) continue;
                return ((8 ^ 0x18 ^ (0x17 ^ 0x3D)) & (91 + 88 - 142 + 100 ^ 96 + 136 - 230 + 177 ^ -1)) != 0;
            }
            if (bP.lIlIIIIIIlIIIl(var29.equals((Object)var25) ? 1 : 0)) {
                var22.gX.c();
                return llIIlIIIlIl[1];
            }
            var22.a(var25, var22::P);
            return llIIlIIIlIl[0];
        }
        NPC var25 = NPCs.getNearest(nPC -> {
            boolean bl2;
            if (!bP.lIlIIIIIIlIlll(nPC.getId(), llIIlIIIlIl[17]) || bP.lIlIIIIIIllIII(nPC.getId(), llIIlIIIlIl[18])) {
                bl2 = llIIlIIIlIl[0];
                0;
                if (1 > 3) {
                    return ((82 + 108 - 125 + 70 ^ 30 + 159 - 124 + 95) & (0x29 ^ 0x21 ^ (0x9C ^ 0xB3) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        });
        if (bP.lIlIIIIIIlIIll(var25)) {
            if (bP.lIlIIIIIIlIIll(var22.gY) && bP.lIlIIIIIIlIIlI(var22.gY.hd ? 1 : 0)) {
                WorldPoint var5 = var22.gY.ct();
                List<TileObject> var8 = var22.cC();
                WorldPoint var6 = var5.createWorldArea(llIIlIIIlIl[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bP.lIlIIIIIIlIIlI(this.k(var8, (WorldPoint)worldPoint) ? 1 : 0)) {
                        bl2 = llIIlIIIlIl[0];
                        0;
                        
                        }
                    } else {
                        bl2 = llIIlIIIlIl[1];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var5))).orElse(null);
                NPC var23 = var22.cB();
                WorldArea var9 = var23.getWorldArea();
                var22.a(var6, worldPoint -> {
                    int n2;
                    if (bP.lIlIIIIIIlIIlI(this.k(var8, (WorldPoint)worldPoint) ? 1 : 0) && bP.lIlIIIIIIlIIlI(var9.isInMeleeDistance(worldPoint) ? 1 : 0) && bP.lIlIIIIIIlIllI(var9.distanceTo2D(worldPoint), llIIlIIIlIl[0])) {
                        n2 = llIIlIIIlIl[0];
                        0;
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
            NPC var5 = var21.stream().min(Comparator.comparingDouble(nPC2 -> nPC2.distanceTo((Locatable)var25))).orElse(null);
            if (bP.lIlIIIIIIlIlII(var5)) {
                boolean bl2;
                if (bP.lIlIIIIIIlIlII(var22.cA())) {
                    bl2 = llIIlIIIlIl[0];
                    0;
                    if (((20 + 149 - 53 + 78 ^ 108 + 85 - 85 + 32) & (0x11 ^ 0x73 ^ (0x52 ^ 0x7E) ^ -1)) > 1) {
                        return ((0xFB ^ 0xA8 ^ (0x64 ^ 0xD)) & (108 + 132 - 110 + 50 ^ 84 + 63 - 29 + 24 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }
            Iterator<WorldPoint> var8 = var22.F(var5).iterator();
            while (bP.lIlIIIIIIlIIIl(var8.hasNext() ? 1 : 0)) {
                WorldPoint var6 = var8.next();
                if (bP.lIlIIIIIIlIlIl(var25.distanceTo(var6), llIIlIIIlIl[5]) && (!bP.lIlIIIIIIlIIll(var22.gY) || bP.lIlIIIIIIlIIIl(var22.gY.hd ? 1 : 0))) {
                    var22.bp();
                    var25.interact(llIIlIIIlII[llIIlIIIlIl[1]]);
                    return llIIlIIIlIl[0];
                }
                0;
                if (1 == 1) continue;
                return false;
            }
            return llIIlIIIlIl[0];
        }
        if (bP.lIlIIIIIIlIlII(var22.gY)) {
            var22.gY = var22.p(llIIlIIIlIl[6]);
            return llIIlIIIlIl[0];
        }
        NPC var5 = var22.gY.cv();
        if (bP.lIlIIIIIIlIlII(var5)) {
            return llIIlIIIlIl[1];
        }
        NPC var8 = var22.gY.cu();
        if (bP.lIlIIIIIIlIlII(var8)) {
            return llIIlIIIlIl[1];
        }
        WorldPoint var6 = var22.gY.ct();
        if (bP.lIlIIIIIIlIIIl(var29.equals((Object)var6) ? 1 : 0)) {
            if (bP.lIlIIIIIIlIlIl(var5.getWorldLocation().distanceTo(var22.gY.cw()), llIIlIIIlIl[0]) && bP.lIlIIIIIIlIIIl(var22.gY.hd ? 1 : 0)) {
                var5.interact(llIIlIIIlII[llIIlIIIlIl[0]]);
                0;
                if (3 <= 1) {
                    return false;
                }
            } else {
                var5.interact(llIIlIIIlII[llIIlIIIlIl[4]]);
                0;
                if (3 != 3) {
                    return ((0x15 ^ 0x42 ^ (0xC9 ^ 0x86)) & (0x9A ^ 0x93 ^ (0x47 ^ 0x56) ^ -1)) != 0;
                }
            }
        } else {
            var22.a(var6, var22::P);
        }
        return llIIlIIIlIl[0];
    }

    private static /* synthetic */ boolean i(WorldPoint worldPoint, NPC nPC) {
        boolean bl2;
        if (!bP.lIlIIIIIIlIlll(nPC.getWorldX(), worldPoint.getWorldX()) || bP.lIlIIIIIIllIII(nPC.getWorldY(), worldPoint.getWorldY())) {
            bl2 = llIIlIIIlIl[0];
            0;
            
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
        void var17;
        Object var12;
        NPC var24;
        bP var15;
        NPC var13;
        void var10;
        int[] nArray = new int[llIIlIIIlIl[0]];
        nArray[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.lIlIIIIIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        ArrayList<Object> var16 = new ArrayList<Object>();
        Player llllllllllllllllIlIIIIIIllIIIIlI = Players.getLocal();
        int[] nArray2 = new int[llIIlIIIlIl[0]];
        nArray2[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[7];
        List var27 = NPCs.getAll((int[])nArray2);
        Iterator var7 = var10.iterator();
        while (bP.lIlIIIIIIlIIIl(var7.hasNext() ? 1 : 0)) {
            var13 = (NPC)var7.next();
            var24 = var15.F(var13).iterator();
            while (bP.lIlIIIIIIlIIIl(var24.hasNext() ? 1 : 0)) {
                var12 = var24.next();
                if (bP.lIlIIIIIIlIIlI(var15.p((WorldPoint)var12) ? 1 : 0)) {
                    var16.add(new bQ(var13, null, var13.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]));
                    0;
                }
                0;
                if (-1 <= 0) continue;
                return null;
            }
            var24 = var27.stream().filter(arg_0 -> bP.c(var13, (int)var17, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (!bP.lIlIIIIIIlIlll(nPC2.getWorldY(), var13.getWorldY()) || bP.lIlIIIIIIllIII(nPC2.getWorldX(), var13.getWorldX())) {
                    bl2 = llIIlIIIlIl[0];
                    0;
                    if (2 <= -1) {
                        return ((0x90 ^ 0xC5 ^ (0x9C ^ 0x9B)) & (105 + 40 - -4 + 54 ^ 103 + 113 - 101 + 38 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.lIlIIIIIIlIIll(var24)) {
                var12 = new bQ(var13, var24, var13.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]);
                if (bP.lIlIIIIIIlIIIl(var15.p(((bQ)var12).ct()) ? 1 : 0)) {
                    0;
                    if (2 != 3) continue;
                    return null;
                }
                var16.add(var12);
                0;
            }
            0;
            if (((0x63 ^ 0x3D) & ~(0xDF ^ 0x81)) <= 0) continue;
            return null;
        }
        var7 = var10.iterator();
        while (bP.lIlIIIIIIlIIIl(var7.hasNext() ? 1 : 0)) {
            var13 = (NPC)var7.next();
            var24 = var27.stream().filter(arg_0 -> bP.b(var13, (int)var17, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (bP.lIlIIIIIIllIII(Math.abs(nPC2.getWorldX() - var13.getWorldX()), Math.abs(nPC2.getWorldY() - var13.getWorldY()))) {
                    bl2 = llIIlIIIlIl[0];
                    0;
                    if (3 > 3) {
                        return ((33 + 160 - 128 + 150 ^ 79 + 43 - -9 + 14) & (0x26 ^ 0xF ^ (0xF4 ^ 0x9B) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.lIlIIIIIIlIIll(var24)) {
                var12 = new bQ(var13, var24, var13.getWorldLocation(), llIIlIIIlIl[0], llIIlIIIlIl[1]);
                if (bP.lIlIIIIIIlIIIl(var15.p(((bQ)var12).ct()) ? 1 : 0)) {
                    0;
                    if (-(46 + 152 - 66 + 40 ^ 25 + 23 - 41 + 162) < 0) continue;
                    return null;
                }
                var16.add(var12);
                0;
            }
            0;
            if (((0x7E ^ 7 ^ (0x7D ^ 0x45)) & (0x5C ^ 0x34 ^ (0x62 ^ 0x4B) ^ -1)) == 0) continue;
            return null;
        }
        var7 = var10.iterator();
        while (bP.lIlIIIIIIlIIIl(var7.hasNext() ? 1 : 0)) {
            var13 = (NPC)var7.next();
            var24 = var15.E(var13).iterator();
            while (bP.lIlIIIIIIlIIIl(var24.hasNext() ? 1 : 0)) {
                var12 = (WorldPoint)var24.next();
                NPC var28 = var27.stream().filter(arg_0 -> bP.a((WorldPoint)var12, (int)var17, arg_0)).filter(arg_0 -> bP.i((WorldPoint)var12, arg_0)).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
                if (bP.lIlIIIIIIlIIll(var28)) {
                    bQ var4 = new bQ(var13, var28, (WorldPoint)var12, llIIlIIIlIl[1], llIIlIIIlIl[0]);
                    if (bP.lIlIIIIIIlIIIl(var15.p(var4.ct()) ? 1 : 0)) {
                        0;
                        
                        return null;
                    }
                    var16.add(var4);
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
            if (!bP.lIlIIIIIIlIIIl(bQ2.hd ? 1 : 0) || bP.lIlIIIIIIlIllI(bQ2.hb.distanceTo((Locatable)bQ2.ha), llIIlIIIlIl[0])) {
                bl2 = llIIlIIIlIl[0];
                0;
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
        bP.llIIlIIIlII[bP.llIIlIIIlIl[1]] = bP."Attack";
        bP.llIIlIIIlII[bP.llIIlIIIlIl[0]] = bP."Hit";
        bP.llIIlIIIlII[bP.llIIlIIIlIl[4]] = bP."Push";
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

    private static void lIlIIIIIIlIIII() {
        llIIlIIIlIl = new int[19];
        bP.llIIlIIIlIl[0] = 1;
        bP.llIIlIIIlIl[1] = (162 + 90 - 207 + 123 ^ 75 + 138 - 44 + 5) & (0x6D ^ 0x32 ^ (0xDC ^ 0x85) ^ -1);
        bP.llIIlIIIlIl[2] = -(0xFFFFDB85 & 0x767F) & (0xFFFFFFDD & Short.MAX_VALUE);
        bP.llIIlIIIlIl[3] = 103 + 3 - -50 + 5 ^ 116 + 123 - 213 + 111;
        bP.llIIlIIIlIl[4] = 2;
        bP.llIIlIIIlIl[5] = 3;
        bP.llIIlIIIlIl[6] = 0x38 ^ 0x3F;
        bP.llIIlIIIlIl[7] = 0xFFFFFFFF & 0x2DD7;
        bP.llIIlIIIlIl[8] = -1;
        bP.llIIlIIIlIl[9] = 0x19 ^ 0x7F ^ (0x4B ^ 0x21);
        bP.llIIlIIIlIl[10] = 0x27 ^ 0x23;
        bP.llIIlIIIlIl[11] = 0x4F ^ 0x4A;
        bP.llIIlIIIlIl[12] = 0x80 ^ 0x86;
        bP.llIIlIIIlIl[13] = 0xFD ^ 0x8E ^ (0x4F ^ 0x34);
        bP.llIIlIIIlIl[14] = 58 + 143 - 134 + 92 ^ 9 + 63 - -58 + 20;
        bP.llIIlIIIlIl[15] = 0x7C ^ 0x76;
        bP.llIIlIIIlIl[16] = 0x3E ^ 0x35;
        bP.llIIlIIIlIl[17] = 0xFFFFEDD8 & 0x3FFF;
        bP.llIIlIIIlIl[18] = -(0x88 ^ 0x93) & (0xFFFFAFFF & 0x7DFB);
    }

    private static /* synthetic */ boolean b(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = llIIlIIIlIl[0];
            0;
            if (-1 != -1) {
                return ((0xCD ^ 0xB3 ^ (0x81 ^ 0xC4)) & ((0x5A ^ 0x61) & ~(0xBD ^ 0x86) ^ (0x93 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, int n2, NPC nPC) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), n2)) {
            bl2 = llIIlIIIlIl[0];
            0;
            if (2 <= ((0x18 ^ 0x5E ^ (0x36 ^ 0x3E)) & (0x71 ^ 0x42 ^ (0xD8 ^ 0xA5) ^ -1))) {
                return ((41 + 106 - 125 + 122 ^ 115 + 122 - 89 + 47) & (9 ^ 0x4A ^ (0xA0 ^ 0xB0) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static String lIlIIIIIIIllIl(String var30, String var14) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIl[13]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llIIlIIIlIl[4], var2);
            return new String(var20.doFinal(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    public void r() {
        this.gX.c();
        this.gY = null;
    }
}

