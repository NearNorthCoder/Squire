/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.IEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.OEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.PEnum;
import gg.squire.sepulchre.SquireSepulchre;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class NEnum
extends Enum<n> {
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n BOTTOM_V_II;
    private /* synthetic */ boolean north;
    private static /* synthetic */ int[] lllIIIIllIIl;
    /* synthetic */ Supplier<WorldArea> dartArea;
    /* synthetic */ p type;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    private static /* synthetic */ String[] lllIIIIllIII;
    public /* synthetic */ Supplier<TileObject> object;
    /* synthetic */ o entry;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldPoint> startDestination;

    /*
     * Unable to fully structure code
     */
    private List<WorldPoint> a(List<WorldPoint> var1_1, d var2_2) {
        var3_3 = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(var3_3)) {
            return null;
        }
        var2 = I.aC();
        var36 = new ArrayList<WorldPoint>();
        var11 = n.lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var11, var14.size())) {
            var45 = (WorldPoint)var14.get(var11);
            if (n.lIIIlIIIlIIlIll(var45)) {
                0;
                if (((135 ^ 155 ^ (231 ^ 190)) & (88 ^ 79 ^ (2 ^ 80) ^ -1)) != 0) {
                    return null;
                }
            } else if (n.lIIIlIIIlIIllII((int)var2.contains(var45)) && n.lIIIlIIIlIIllll((Object)p.FINAL, (Object)var31.type)) {
                var36.add(var45.dx(n.lllIIIIllIIl[0]));
                0;
                0;
                if (2 > 2) {
                    return null;
                }
            } else {
                var36.add(var45);
                0;
            }
            ++var11;
            0;
            
            return null;
        }
        var11 = var31.startPoint.get();
        var45 = var11.getWorldY() - n.lllIIIIllIIl[0];
        var57 = var11.getWorldY() + n.lllIIIIllIIl[5];
        var34 = TileObjects.getNearest((WorldPoint)new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var45, var11.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, h(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)var9));
        var24 = TileObjects.getNearest((WorldPoint)new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var57, var11.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, g(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)var9));
        if (n.lIIIlIIIlIIlIll(var34)) {
            return var36;
        }
        if (n.lIIIlIIIlIIlIll(var24)) {
            return var36;
        }
        var19 = var5.b(var34);
        var25 = var5.b(var24);
        if (n.lIIIlIIIlIIlIll(var19)) {
            return var36;
        }
        if (n.lIIIlIIIlIIlIll(var25)) {
            return var36;
        }
        var4 = new ArrayList<WorldPoint>();
        var52 = n.lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var52, var36.size())) {
            block45: {
                block54: {
                    block53: {
                        block52: {
                            block51: {
                                block50: {
                                    block46: {
                                        block49: {
                                            block47: {
                                                block48: {
                                                    block44: {
                                                        var46 = (WorldPoint)var36.get(var52);
                                                        var62 = var31.dartArea.get().getX();
                                                        if (!n.lIIIlIIIlIIlIll(var46)) break block44;
                                                        0;
                                                        
                                                        }
                                                        break block45;
                                                    }
                                                    if (!n.lIIIlIIIlIlIlII(var62 + n.lllIIIIllIIl[6], var9.getWorldX())) break block46;
                                                    if (!n.lIIIlIIIlIIllII((int)var31.north)) break block47;
                                                    if (!n.lIIIlIIIlIlIIII(var62 + n.lllIIIIllIIl[7], var9.getWorldX())) break block48;
                                                    if (n.lIIIlIIIlIlIIII(var25.aG(), b.o) && n.lIIIlIIIlIlIIII(var25.aF(), n.lllIIIIllIIl[0])) {
                                                        var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var46.getY(), var9.getPlane());
                                                        var4.add(var50);
                                                        0;
                                                        0;
                                                        if (((80 + 7 - 28 + 89 ^ 39 + 68 - 60 + 134) & (76 ^ 83 ^ (20 ^ 42) ^ -1)) != 0) {
                                                            return null;
                                                        }
                                                    } else if (n.lIIIlIIIlIlIIII(var19.aG(), b.o) && n.lIIIlIIIlIlIIII(var19.aF(), n.lllIIIIllIIl[0])) {
                                                        var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var46.getY(), var9.getPlane());
                                                        var4.add(var50);
                                                        0;
                                                        0;
                                                        if (3 == 0) {
                                                            return null;
                                                        }
                                                    } else {
                                                        var50 = new WorldPoint(var9.getWorldX(), var46.getY(), var9.getPlane());
                                                        var4.add(var50);
                                                        0;
                                                        0;
                                                        
                                                        }
                                                    }
                                                    break block45;
                                                }
                                                if (!n.lIIIlIIIlIlIIII(var62 + n.lllIIIIllIIl[8], var9.getWorldX())) break block47;
                                                var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var46.getY(), var9.getPlane());
                                                var4.add(var50);
                                                0;
                                                0;
                                                if (-1 >= (79 ^ 75)) {
                                                    return null;
                                                }
                                                break block45;
                                            }
                                            if (!n.lIIIlIIIlIlIIII(var62 + n.lllIIIIllIIl[8], var9.getWorldX())) break block49;
                                            if (n.lIIIlIIIlIlIIII(var25.aG(), b.o) && n.lIIIlIIIlIlIIII(var25.aF(), n.lllIIIIllIIl[0])) {
                                                var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var46.getY(), var9.getPlane());
                                                var4.add(var50);
                                                0;
                                                0;
                                                if ((152 ^ 156) == 0) {
                                                    return null;
                                                }
                                            } else if (n.lIIIlIIIlIlIIII(var19.aG(), b.o) && n.lIIIlIIIlIlIIII(var19.aF(), n.lllIIIIllIIl[0])) {
                                                var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var46.getY(), var9.getPlane());
                                                var4.add(var50);
                                                0;
                                                0;
                                                
                                                }
                                            } else {
                                                var50 = new WorldPoint(var9.getWorldX(), var46.getY(), var9.getPlane());
                                                var4.add(var50);
                                                0;
                                                0;
                                                if (2 < 0) {
                                                    return null;
                                                }
                                            }
                                            break block45;
                                        }
                                        if (!n.lIIIlIIIlIlIIII(var62 + n.lllIIIIllIIl[9], var9.getWorldX())) break block46;
                                        var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var46.getY(), var9.getPlane());
                                        var4.add(var50);
                                        0;
                                        0;
                                        if (1 == 3) {
                                            return null;
                                        }
                                        break block45;
                                    }
                                    if (!n.lIIIlIIIlIlIIII(var62 + n.lllIIIIllIIl[10], var9.getWorldX())) break block50;
                                    var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var46.getY(), var9.getPlane());
                                    var4.add(var50);
                                    0;
                                    0;
                                    if ((3 ^ (50 ^ 53)) < 0) {
                                        return null;
                                    }
                                    break block45;
                                }
                                if (!n.lIIIlIIIlIlIIII(var62 + n.lllIIIIllIIl[6], var9.getWorldX())) break block51;
                                if (n.lIIIlIIIlIlIIII(var25.aG(), b.o) && n.lIIIlIIIlIlIIII(var25.aF(), n.lllIIIIllIIl[0])) {
                                    var31.north = n.lllIIIIllIIl[0];
                                    var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var46.getY(), var9.getPlane());
                                    var4.add(var50);
                                    0;
                                    0;
                                    
                                    }
                                } else if (n.lIIIlIIIlIlIIII(var19.aG(), b.o) && n.lIIIlIIIlIlIIII(var19.aF(), n.lllIIIIllIIl[0])) {
                                    var31.north = n.lllIIIIllIIl[1];
                                    var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var46.getY(), var9.getPlane());
                                    var4.add(var50);
                                    0;
                                    0;
                                    if (-1 >= ((52 ^ 14) & ~(155 ^ 161))) {
                                        return null;
                                    }
                                } else {
                                    var50 = new WorldPoint(var9.getWorldX(), var46.getY(), var9.getPlane());
                                    var4.add(var50);
                                    0;
                                    0;
                                    if (3 == 0) {
                                        return null;
                                    }
                                }
                                break block45;
                            }
                            var22 = Math.abs(var9.getWorldX() - var34.getWorldX());
                            if ((!n.lIIIlIIIlIlIlIl(var22, n.lllIIIIllIIl[4]) || n.lIIIlIIIlIlIIlI(var62 + n.lllIIIIllIIl[11], var9.getWorldX())) && (!n.lIIIlIIIlIlIIlI(var22, n.lllIIIIllIIl[3]) || !n.lIIIlIIIlIlIlIl(var22, n.lllIIIIllIIl[5]) || !n.lIIIlIIIlIlIIIl(var62 + n.lllIIIIllIIl[12], var9.getWorldX()) || !n.lIIIlIIIlIlIlII(var62 + n.lllIIIIllIIl[11], var9.getWorldX()))) ** GOTO lbl-1000
                            if (n.lIIIlIIIlIlIIll(var19.aG(), b.r) && !n.lIIIlIIIlIlIIII(var19.aG(), b.q)) break block52;
                            var50 = new WorldPoint(var9.getWorldX(), var46.getY(), var9.getPlane());
                            var4.add(var50);
                            0;
                            0;
                            if ((140 + 165 - 214 + 89 ^ 162 + 127 - 282 + 170) == 0) {
                                return null;
                            }
                            break block45;
                        }
                        if (n.lIIIlIIIlIlIIll(var25.aG(), b.r) && !n.lIIIlIIIlIlIIII(var25.aG(), b.q)) break block53;
                        var50 = new WorldPoint(var9.getWorldX(), var46.getY(), var9.getPlane());
                        var4.add(var50);
                        0;
                        0;
                        
                        }
                        break block45;
                    }
                    if (!n.lIIIlIIIlIlIIIl(var62 + n.lllIIIIllIIl[11], var9.getWorldX())) ** GOTO lbl-1000
                    if (!n.lIIIlIIIlIlIIII(var9.getWorldX() % n.lllIIIIllIIl[3], n.lllIIIIllIIl[0])) break block54;
                    if ((!n.lIIIlIIIlIlIIII(var19.aG(), b.o) || n.lIIIlIIIlIlIlIl(var19.aF(), n.lllIIIIllIIl[0])) && !n.lIIIlIIIlIlIIII(var19.aG(), b.n)) ** GOTO lbl-1000
                    var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var46.getY(), var9.getPlane());
                    var4.add(var50);
                    0;
                    0;
                    if ((22 ^ 86 ^ (84 ^ 16)) < -1) {
                        return null;
                    }
                    break block45;
                }
                if (n.lIIIlIIIlIlIIII(var25.aG(), b.o) && !n.lIIIlIIIlIlIlIl(var25.aF(), n.lllIIIIllIIl[0]) || n.lIIIlIIIlIlIIII(var25.aG(), b.n)) {
                    var50 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var46.getY(), var9.getPlane());
                    var4.add(var50);
                    0;
                    0;
                    if (-1 >= (165 ^ 161)) {
                        return null;
                    }
                } else lbl-1000:
                // 4 sources

                {
                    var4.add(var46);
                    0;
                }
            }
            ++var52;
            0;
            
            return null;
        }
        return var13_15;
    }

    private static void lIIIlIIIlIIlIlI() {
        lllIIIIllIIl = new int[27];
        n.lllIIIIllIIl[0] = 1;
        n.lllIIIIllIIl[1] = (0x37 ^ 0x71) & ~(0xFF ^ 0xB9);
        n.lllIIIIllIIl[2] = 0x86 ^ 0x89;
        n.lllIIIIllIIl[3] = 2;
        n.lllIIIIllIIl[4] = 3;
        n.lllIIIIllIIl[5] = 2 ^ 0x19 ^ (0xAE ^ 0xB1);
        n.lllIIIIllIIl[6] = 178 + 27 - 145 + 124 ^ 113 + 70 - 166 + 155;
        n.lllIIIIllIIl[7] = 0x69 ^ 0x65;
        n.lllIIIIllIIl[8] = 0x30 ^ 0x3D;
        n.lllIIIIllIIl[9] = 0xAD ^ 0xA3;
        n.lllIIIIllIIl[10] = 0xE1 ^ 0x8A ^ (0x13 ^ 0x6D);
        n.lllIIIIllIIl[11] = 0xDB ^ 0x8D ^ (0x73 ^ 0xD);
        n.lllIIIIllIIl[12] = 70 + 80 - 49 + 29 ^ 7 + 13 - -95 + 39;
        n.lllIIIIllIIl[13] = 0xAF ^ 0xAA;
        n.lllIIIIllIIl[14] = 2 + 69 - 18 + 92 ^ 128 + 134 - 179 + 68;
        n.lllIIIIllIIl[15] = 0x13 ^ 1;
        n.lllIIIIllIIl[16] = 0x2F ^ 4 ^ (0xE ^ 0x22);
        n.lllIIIIllIIl[17] = 0x7D ^ 0x75;
        n.lllIIIIllIIl[18] = 0xB9 ^ 0x96 ^ (0xD6 ^ 0xC2);
        n.lllIIIIllIIl[19] = 0x5F ^ 0x76;
        n.lllIIIIllIIl[20] = 0x24 ^ 0x2E;
        n.lllIIIIllIIl[21] = 0x6C ^ 0x5E;
        n.lllIIIIllIIl[22] = 0x7B ^ 0x41;
        n.lllIIIIllIIl[23] = 0x79 ^ 0x58 ^ (0x4E ^ 0x5C);
        n.lllIIIIllIIl[24] = 0x3F ^ 0x7F;
        n.lllIIIIllIIl[25] = 39 + 113 - 54 + 74 ^ 123 + 74 - 170 + 102;
        n.lllIIIIllIIl[26] = 0x15 ^ 0x1F ^ 3;
    }

    private static String lIIIlIIIlIIIlll(String var58, String var76) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var76.getBytes(StandardCharsets.UTF_8)), lllIIIIllIIl[17]), "DES");
            Cipher var70 = Cipher.getInstance("DES");
            var70.init(lllIIIIllIIl[3], var12);
            return new String(var70.doFinal(Base64.getDecoder().decode(var58.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var41) {
            var41.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIIllII(int n2) {
        return n2 != 0;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static String lIIIlIIIlIIlIII(String var77, String var38) {
        var77 = new String(Base64.getDecoder().decode(var77.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var71 = new StringBuilder();
        char[] var8 = var38.toCharArray();
        int var55 = lllIIIIllIIl[1];
        char[] var35 = var77.toCharArray();
        int var65 = var35.length;
        int var28 = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var28, var65)) {
            char var53 = var35[var28];
            var71.append((char)(var53 ^ var8[var55 % var8.length]));
            0;
            ++var55;
            ++var28;
            0;
            
            return null;
        }
        return String.valueOf(var71);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var66;
        n var40;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllll((Object)var40.type, (Object)p.FINAL) && n.lIIIlIIIlIlIIIl(var40.Q().get().getWorldX(), var66.getWorldX())) {
            return lllIIIIllIIl[1];
        }
        List<TileObject> var64 = var40.M();
        int var1 = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var1, var64.size()) && n.lIIIlIIIlIlIIIl(var1, lllIIIIllIIl[4])) {
            void var78;
            if (n.lIIIlIIIlIlIIlI(var1, var64.size())) {
                0;
                if (-2 <= 0) break;
                return false;
            }
            TileObject var18 = var64.get(var1);
            int var49 = c.a(var18);
            if (!n.lIIIlIIIlIlIIll(var49, b.y) || n.lIIIlIIIlIlIIII((int)var78, lllIIIIllIIl[4])) {
                return lllIIIIllIIl[0];
            }
            ++var1;
            0;
            if (2 <= 2) continue;
            return ((154 + 46 - 140 + 159 ^ 13 + 56 - 68 + 132) & (1 ^ (0x62 ^ 0x3D) ^ -1)) != 0;
        }
        System.out.println(lllIIIIllIII[lllIIIIllIIl[1]]);
        return lllIIIIllIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> N() {
        n var17;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)var17.type, (Object)p.FINAL)) {
            void var51;
            return NPCs.getAll(arg_0 -> n.l((Player)var51, arg_0));
        }
        return null;
    }

    private static void lIIIlIIIlIIlIIl() {
        lllIIIIllIII = new String[lllIIIIllIIl[26]];
        n.lllIIIIllIII[n.lllIIIIllIIl[1]] = n."should finish is false";
        n.lllIIIIllIII[n.lllIIIIllIIl[0]] = n."ShouldFinish!";
        n.lllIIIIllIII[n.lllIIIIllIIl[3]] = n."Statues: Walking ahead";
        n.lllIIIIllIII[n.lllIIIIllIIl[4]] = n."Darts: walking ahead";
        n.lllIIIIllIII[n.lllIIIIllIIl[5]] = n."error!";
        n.lllIIIIllIII[n.lllIIIIllIIl[13]] = n."Wizard Statue";
        n.lllIIIIllIII[n.lllIIIIllIIl[14]] = n."Wizard Statue";
        n.lllIIIIllIII[n.lllIIIIllIIl[16]] = n."Crossbowman Statue";
        n.lllIIIIllIII[n.lllIIIIllIIl[17]] = n."BOTTOM_V_II";
    }

    private static String lIIIlIIIlIIIllI(String var54, String var60) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var60.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllIIIIllIIl[3], var13);
            return new String(var15.doFinal(Base64.getDecoder().decode(var54.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static /* synthetic */ int k(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static /* synthetic */ boolean g(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[13]]) ? 1 : 0) && n.lIIIlIIIlIlIIIl(tileObject.getWorldX(), player.getWorldX())) {
            n2 = lllIIIIllIIl[0];
            0;
            if (-1 >= 1) {
                return false;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIIIlIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIIIlIIllll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> L() {
        n var16;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)var16.type, (Object)p.FINAL) && n.lIIIlIIIlIIllll((Object)var16.entry, (Object)o.SOUTH)) {
            void var79;
            WorldPoint var3 = new WorldPoint(var79.getWorldX() - lllIIIIllIIl[3], var16.startPoint.get().getWorldY() + lllIIIIllIIl[0], var79.getPlane());
            return new WorldArea(var3, lllIIIIllIIl[0], lllIIIIllIIl[4]).toWorldPointList();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var23;
        void var47;
        void var20;
        n var56;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllII(var56.b((Locatable)var20) ? 1 : 0)) {
            var56.a((SquireSepulchre)var47);
            if (n.lIIIlIIIlIIllII(var56.b((d)var23) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var56.startDestination.get());
                return lllIIIIllIIl[0];
            }
            Movement.setDestination((WorldPoint)var56.startPoint.get());
            return lllIIIIllIIl[0];
        }
        if (n.lIIIlIIIlIIllII(var56.c((Locatable)var20) ? 1 : 0)) {
            var56.b((SquireSepulchre)var47);
            var56.e((d)var23);
            0;
            return lllIIIIllIIl[0];
        }
        return lllIIIIllIIl[1];
    }

    private n(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, p p2, o o2) {
        this.north = lllIIIIllIIl[0];
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var67 = list.iterator();
            while (n.lIIIlIIIlIIllII(var67.hasNext() ? 1 : 0)) {
                void var10;
                Triple var29 = (Triple)var67.next();
                var10.add(new WorldArea(SquireSepulchre.a((RegionPoint)var29.getFirst()), ((Integer)var29.getSecond()).intValue(), ((Integer)var29.getThird()).intValue()));
                0;
                0;
                if (1 > ((0x8B ^ 0xB3) & ~(0xA2 ^ 0x9A))) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.startDestination = () -> SquireSepulchre.a(regionPoint2);
        this.type = p2;
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint3), n3, n4);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint4);
        this.entry = o2;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static /* synthetic */ int d(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static boolean lIIIlIIIlIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIIIlIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    static {
        n.lIIIlIIIlIIlIlI();
        n.lIIIlIIIlIIlIIl();
        BOTTOM_V_II = new n(new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[19], lllIIIIllIIl[1], b.N), lllIIIIllIIl[4], lllIIIIllIIl[20], new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[21], lllIIIIllIIl[1], b.N), new RegionPoint(lllIIIIllIIl[22], lllIIIIllIIl[23], lllIIIIllIIl[1], b.N), new RegionPoint(lllIIIIllIIl[1], lllIIIIllIIl[23], lllIIIIllIIl[1], b.N), lllIIIIllIIl[24], lllIIIIllIIl[4], new RegionPoint(lllIIIIllIIl[13], lllIIIIllIIl[25], lllIIIIllIIl[1], b.N), p.FINAL, o.SOUTH);
        n[] nArray = new n[lllIIIIllIIl[0]];
        nArray[n.lllIIIIllIIl[1]] = BOTTOM_V_II;
        $VALUES = nArray;
    }

    /*
     * WARNING - void declaration
     */
    private List<TileObject> M() {
        n var6;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)var6.type, (Object)p.FINAL)) {
            void var59;
            return TileObjects.getAll(arg_0 -> n.d((Player)var59, arg_0));
        }
        return null;
    }

    private static boolean lIIIlIIIlIIlllI(Object object) {
        return object != null;
    }

    private static /* synthetic */ boolean d(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIlIIIl(player.getWorldX() - tileObject.getWorldX(), lllIIIIllIIl[15]) && n.lIIIlIIIlIlIIIl(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIIllIIl[4]) && n.lIIIlIIIlIlIIII(player.getPlane(), tileObject.getPlane()) && n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[16]]) ? 1 : 0)) {
            n2 = lllIIIIllIIl[0];
            0;
            if (-1 == 2) {
                return false;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ int c(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private n(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, p p2, o o2) {
        this.north = lllIIIIllIIl[0];
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.type = p2;
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.entry = o2;
    }

    private static boolean lIIIlIIIlIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIIlIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var68 = this.startAreas.get().iterator();
        while (n.lIIIlIIIlIIllII(var68.hasNext() ? 1 : 0)) {
            void var37;
            WorldArea var30 = var68.next();
            if (n.lIIIlIIIlIIllII(var30.contains((Locatable)var37) ? 1 : 0)) {
                return lllIIIIllIIl[0];
            }
            0;
            
            return false;
        }
        return lllIIIIllIIl[1];
    }

    private static /* synthetic */ int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(d d2) {
        void var7;
        void var26;
        n var63;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        List<WorldPoint> var75 = var63.L();
        List<WorldPoint> var32 = var63.a(var75, (d)var26);
        List<TileObject> var48 = var63.M();
        ArrayList<Integer> var44 = new ArrayList<Integer>();
        if (n.lIIIlIIIlIlIllI(var48.size())) {
            int var72 = lllIIIIllIIl[1];
            int var33 = lllIIIIllIIl[1];
            Iterator<TileObject> var42 = var48.iterator();
            while (n.lIIIlIIIlIIllII(var42.hasNext() ? 1 : 0)) {
                TileObject var73 = var42.next();
                int var69 = c.a(var73);
                if (n.lIIIlIIIlIlIIII(var69, b.x)) {
                    ++var33;
                }
                if (n.lIIIlIIIlIlIIll(var69, b.x)) {
                    if (n.lIIIlIIIlIIllll((Object)var63.type, (Object)p.FINAL)) {
                        var44.add(var73.getWorldY());
                        0;
                    }
                    ++var72;
                    0;
                    if (((102 + 146 - 180 + 156 ^ 40 + 71 - 47 + 106) & (0x6E ^ 0x25 ^ 1 ^ -1)) == 0) continue;
                    return ((0x38 ^ 2 ^ (0xBA ^ 0x9E)) & (38 + 127 - 5 + 23 ^ 12 + 41 - 30 + 146 ^ -1)) != 0;
                }
                if (n.lIIIlIIIlIIllII(var63.a(var33) ? 1 : 0)) {
                    System.out.println(lllIIIIllIII[lllIIIIllIIl[0]]);
                    Movement.setDestination((WorldPoint)var63.dartDestination.get());
                    return lllIIIIllIIl[0];
                }
                ++var33;
                0;
                if (-1 == -1) continue;
                return ((0xD ^ 0x1E ^ (0xCE ^ 0x9D)) & (36 + 145 - 151 + 182 ^ 81 + 22 - 16 + 61 ^ -1)) != 0;
            }
            if (n.lIIIlIIIlIIllll((Object)var63.type, (Object)p.FINAL)) {
                var32.removeIf(worldPoint -> var44.contains(worldPoint.getWorldY()));
                0;
            }
            if (n.lIIIlIIIlIIllII(var32.size())) {
                var32.sort(Comparator.comparingInt(arg_0 -> n.d((Player)var7, arg_0)));
                System.out.println(lllIIIIllIII[lllIIIIllIIl[3]]);
                Movement.setDestination((WorldPoint)var32.get(lllIIIIllIIl[1]));
                return lllIIIIllIIl[0];
            }
            if (n.lIIIlIIIlIIllll((Object)var63.type, (Object)p.FINAL)) {
                Movement.setDestination((WorldPoint)var7.getWorldLocation());
            }
            return lllIIIIllIIl[0];
        }
        List<NPC> var72 = var63.N();
        var72.sort(Comparator.comparingInt(arg_0 -> n.k((Player)var7, arg_0)));
        var44.clear();
        int var33 = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var33, lllIIIIllIIl[3])) {
            if (n.lIIIlIIIlIlIlIl(var72.size(), var33)) {
                0;
                if (3 != (0x66 ^ 0x62)) break;
                return false;
            }
            NPC var42 = var72.get(var33);
            if (n.lIIIlIIIlIIlIll(var42)) {
                var72.remove(var33);
                0;
                0;
                if (-1 <= -1) continue;
                return false;
            }
            if (n.lIIIlIIIlIIllll((Object)var63.type, (Object)p.FINAL)) {
                if (n.lIIIlIIIlIlIIIl(var42.getWorldX(), var7.getWorldX())) {
                    var44.add(var42.getWorldY());
                    0;
                    ++var33;
                    0;
                    if (2 > 0) continue;
                    return false;
                }
                var72.remove(var33);
                0;
            }
            0;
            if (3 != -1) continue;
            return false;
        }
        if (n.lIIIlIIIlIIllll((Object)var63.type, (Object)p.FINAL)) {
            var32.removeIf(worldPoint -> var44.contains(worldPoint.getWorldY()));
            0;
        }
        if (n.lIIIlIIIlIIllII(var32.size())) {
            var32.sort(Comparator.comparingInt(arg_0 -> n.c((Player)var7, arg_0)));
            System.out.println(lllIIIIllIII[lllIIIIllIIl[4]]);
            Movement.setDestination((WorldPoint)var32.get(lllIIIIllIIl[1]));
        }
        System.out.println(lllIIIIllIII[lllIIIIllIIl[5]]);
        return lllIIIIllIIl[1];
    }

    private static boolean lIIIlIIIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(d d2) {
        n var27;
        void var61;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllIl(var61.getWorldLocation().equals((Object)var27.startPoint.get()) ? 1 : 0)) {
            return lllIIIIllIIl[1];
        }
        List<NPC> var74 = var27.N();
        var74.sort(Comparator.comparingInt(arg_0 -> n.f((Player)var61, arg_0)));
        if (n.lIIIlIIIlIIllIl(var74.size())) {
            return lllIIIIllIIl[0];
        }
        NPC var21 = var74.get(lllIIIIllIIl[1]);
        if (n.lIIIlIIIlIIlllI(var21)) {
            if (n.lIIIlIIIlIIllll((Object)var27.type, (Object)p.FINAL)) {
                int var43 = Math.abs(var21.getWorldX() - var61.getWorldX());
                if (n.lIIIlIIIlIlIIII(var21.getWorldY(), var27.P().get().getWorldY()) && n.lIIIlIIIlIlIIIl(var43, lllIIIIllIIl[2])) {
                    return lllIIIIllIIl[1];
                }
                return lllIIIIllIIl[0];
            }
            return lllIIIIllIIl[1];
        }
        return lllIIIIllIIl[1];
    }

    private static /* synthetic */ boolean l(Player player, NPC nPC) {
        int n2;
        if (n.lIIIlIIIlIlIIIl(nPC.getWorldX(), player.getWorldX() + lllIIIIllIIl[0]) && n.lIIIlIIIlIlIIIl(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIIIllIIl[5]) && n.lIIIlIIIlIlIlII(nPC.getWorldX(), player.getWorldX() - lllIIIIllIIl[6]) && n.lIIIlIIIlIIllII(b.z.contains(nPC.getId()) ? 1 : 0)) {
            n2 = lllIIIIllIIl[0];
            0;
            if (1 == 0) {
                return false;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean h(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[14]]) ? 1 : 0) && n.lIIIlIIIlIlIIIl(tileObject.getWorldX(), player.getWorldX())) {
            n2 = lllIIIIllIIl[0];
            0;
            
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }
}

