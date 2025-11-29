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
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum6;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.CHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum5;
import gg.squire.sepulchre.tasks.GameEnum27;
import gg.squire.sepulchre.SquireSepulchre;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
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

public final class GameEnum4
extends Enum<n> {
     Supplier<WorldPoint> dartDestination;
    private static final  n[] $VALUES;
    public static final  /* enum */ n BOTTOM_V_II;
    private  boolean north;
    
     Supplier<WorldArea> dartArea;
     p type;
     Supplier<List<WorldArea>> startAreas;
    
    public  Supplier<TileObject> object;
     o entry;
     Supplier<WorldPoint> startPoint;
     Supplier<WorldPoint> startDestination;

    /*
     * Unable to fully structure code
     */
    private List<WorldPoint> a(List<WorldPoint> var1_1, d var2_2) {
        var3_3 = Players.getLocal();
        if (n.var3(var3_3)) {
            return null;
        }
        var4 = I.aC();
        var5 = new ArrayList<WorldPoint>();
        var6 = n.var1[1];
        while (n.var7(var6, var8.size())) {
            var9 = (WorldPoint)var8.get(var6);
            if (n.var3(var9)) {
                0;
                if (((135 ^ 155 ^ (231 ^ 190)) & (88 ^ 79 ^ (2 ^ 80) ^ -1)) != 0) {
                    return null;
                }
            } else if (n.var10((int)var4.contains(var9)) && n.var11((Object)p.FINAL, (Object)var12.type)) {
                var5.add(var9.dx(n.var1[0]));
                0;
                0;
                if (2 > 2) {
                    return null;
                }
            } else {
                var5.add(var9);
                0;
            }
            ++var6;
            0;
            if null == null continue;
            return null;
        }
        var6 = var12.startPoint.get();
        var9 = var6.getWorldY() - n.var1[0];
        var13 = var6.getWorldY() + n.var1[5];
        var14 = TileObjects.getNearest((WorldPoint)new WorldPoint(var15.getWorldX() - n.var1[0], var9, var6.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, h(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)var15));
        var16 = TileObjects.getNearest((WorldPoint)new WorldPoint(var15.getWorldX() - n.var1[0], var13, var6.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, g(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)var15));
        if (n.var3(var14)) {
            return var5;
        }
        if (n.var3(var16)) {
            return var5;
        }
        var17 = var18.b(var14);
        var19 = var18.b(var16);
        if (n.var3(var17)) {
            return var5;
        }
        if (n.var3(var19)) {
            return var5;
        }
        var20 = new ArrayList<WorldPoint>();
        var21 = n.var1[1];
        while (n.var7(var21, var5.size())) {
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
                                                        var22 = (WorldPoint)var5.get(var21);
                                                        var23 = var12.dartArea.get().getX();
                                                        if (!n.var3(var22)) break block44;
                                                        0;
                                                        if null != null {
                                                            return null;
                                                        }
                                                        break block45;
                                                    }
                                                    if (!n.var24(var23 + n.var1[6], var15.getWorldX())) break block46;
                                                    if (!n.var10((int)var12.north)) break block47;
                                                    if (!n.var25(var23 + n.var1[7], var15.getWorldX())) break block48;
                                                    if (n.var25(var19.aG(), b.o) && n.var25(var19.aF(), n.var1[0])) {
                                                        var26 = new WorldPoint(var15.getWorldX() - n.var1[3], var22.getY(), var15.getPlane());
                                                        var20.add(var26);
                                                        0;
                                                        0;
                                                        if (((80 + 7 - 28 + 89 ^ 39 + 68 - 60 + 134) & (76 ^ 83 ^ (20 ^ 42) ^ -1)) != 0) {
                                                            return null;
                                                        }
                                                    } else if (n.var25(var17.aG(), b.o) && n.var25(var17.aF(), n.var1[0])) {
                                                        var26 = new WorldPoint(var15.getWorldX() - n.var1[3], var22.getY(), var15.getPlane());
                                                        var20.add(var26);
                                                        0;
                                                        0;
                                                        
                                                    } else {
                                                        var26 = new WorldPoint(var15.getWorldX(), var22.getY(), var15.getPlane());
                                                        var20.add(var26);
                                                        0;
                                                        0;
                                                        if null != null {
                                                            return null;
                                                        }
                                                    }
                                                    break block45;
                                                }
                                                if (!n.var25(var23 + n.var1[8], var15.getWorldX())) break block47;
                                                var26 = new WorldPoint(var15.getWorldX() - n.var1[0], var22.getY(), var15.getPlane());
                                                var20.add(var26);
                                                0;
                                                0;
                                                if (-1 >= (79 ^ 75)) {
                                                    return null;
                                                }
                                                break block45;
                                            }
                                            if (!n.var25(var23 + n.var1[8], var15.getWorldX())) break block49;
                                            if (n.var25(var19.aG(), b.o) && n.var25(var19.aF(), n.var1[0])) {
                                                var26 = new WorldPoint(var15.getWorldX() - n.var1[3], var22.getY(), var15.getPlane());
                                                var20.add(var26);
                                                0;
                                                0;
                                                if ((152 ^ 156) == 0) {
                                                    return null;
                                                }
                                            } else if (n.var25(var17.aG(), b.o) && n.var25(var17.aF(), n.var1[0])) {
                                                var26 = new WorldPoint(var15.getWorldX() - n.var1[3], var22.getY(), var15.getPlane());
                                                var20.add(var26);
                                                0;
                                                0;
                                                if null != null {
                                                    return null;
                                                }
                                            } else {
                                                var26 = new WorldPoint(var15.getWorldX(), var22.getY(), var15.getPlane());
                                                var20.add(var26);
                                                0;
                                                0;
                                                if (2 < 0) {
                                                    return null;
                                                }
                                            }
                                            break block45;
                                        }
                                        if (!n.var25(var23 + n.var1[9], var15.getWorldX())) break block46;
                                        var26 = new WorldPoint(var15.getWorldX() - n.var1[0], var22.getY(), var15.getPlane());
                                        var20.add(var26);
                                        0;
                                        0;
                                        if (1 == 3) {
                                            return null;
                                        }
                                        break block45;
                                    }
                                    if (!n.var25(var23 + n.var1[10], var15.getWorldX())) break block50;
                                    var26 = new WorldPoint(var15.getWorldX() - n.var1[0], var22.getY(), var15.getPlane());
                                    var20.add(var26);
                                    0;
                                    0;
                                    if ((3 ^ (50 ^ 53)) < 0) {
                                        return null;
                                    }
                                    break block45;
                                }
                                if (!n.var25(var23 + n.var1[6], var15.getWorldX())) break block51;
                                if (n.var25(var19.aG(), b.o) && n.var25(var19.aF(), n.var1[0])) {
                                    var12.north = n.var1[0];
                                    var26 = new WorldPoint(var15.getWorldX() - n.var1[3], var22.getY(), var15.getPlane());
                                    var20.add(var26);
                                    0;
                                    0;
                                    if null != null {
                                        return null;
                                    }
                                } else if (n.var25(var17.aG(), b.o) && n.var25(var17.aF(), n.var1[0])) {
                                    var12.north = n.var1[1];
                                    var26 = new WorldPoint(var15.getWorldX() - n.var1[3], var22.getY(), var15.getPlane());
                                    var20.add(var26);
                                    0;
                                    0;
                                    if (-1 >= ((52 ^ 14) & ~(155 ^ 161))) {
                                        return null;
                                    }
                                } else {
                                    var26 = new WorldPoint(var15.getWorldX(), var22.getY(), var15.getPlane());
                                    var20.add(var26);
                                    0;
                                    0;
                                    
                                }
                                break block45;
                            }
                            var27 = Math.abs(var15.getWorldX() - var14.getWorldX());
                            if ((!n.var28(var27, n.var1[4]) || n.var29(var23 + n.var1[11], var15.getWorldX())) && (!n.var29(var27, n.var1[3]) || !n.var28(var27, n.var1[5]) || !n.var7(var23 + n.var1[12], var15.getWorldX()) || !n.var24(var23 + n.var1[11], var15.getWorldX()))) ** GOTO lbl-1000
                            if (n.var30(var17.aG(), b.r) && !n.var25(var17.aG(), b.q)) break block52;
                            var26 = new WorldPoint(var15.getWorldX(), var22.getY(), var15.getPlane());
                            var20.add(var26);
                            0;
                            0;
                            if ((140 + 165 - 214 + 89 ^ 162 + 127 - 282 + 170) == 0) {
                                return null;
                            }
                            break block45;
                        }
                        if (n.var30(var19.aG(), b.r) && !n.var25(var19.aG(), b.q)) break block53;
                        var26 = new WorldPoint(var15.getWorldX(), var22.getY(), var15.getPlane());
                        var20.add(var26);
                        0;
                        0;
                        if null != null {
                            return null;
                        }
                        break block45;
                    }
                    if (!n.var7(var23 + n.var1[11], var15.getWorldX())) ** GOTO lbl-1000
                    if (!n.var25(var15.getWorldX() % n.var1[3], n.var1[0])) break block54;
                    if ((!n.var25(var17.aG(), b.o) || n.var28(var17.aF(), n.var1[0])) && !n.var25(var17.aG(), b.n)) ** GOTO lbl-1000
                    var26 = new WorldPoint(var15.getWorldX() - n.var1[0], var22.getY(), var15.getPlane());
                    var20.add(var26);
                    0;
                    0;
                    if ((22 ^ 86 ^ (84 ^ 16)) < -1) {
                        return null;
                    }
                    break block45;
                }
                if (n.var25(var19.aG(), b.o) && !n.var28(var19.aF(), n.var1[0]) || n.var25(var19.aG(), b.n)) {
                    var26 = new WorldPoint(var15.getWorldX() - n.var1[0], var22.getY(), var15.getPlane());
                    var20.add(var26);
                    0;
                    0;
                    if (-1 >= (165 ^ 161)) {
                        return null;
                    }
                } else lbl-1000:
                // 4 sources

                {
                    var20.add(var22);
                    0;
                }
            }
            ++var21;
            0;
            if null == null continue;
            return null;
        }
        return var13_15;
    }

    private static void var31() {
        var1 = new int[27];
        n.var1[0] = 1;
        n.var1[1] = (0x37 ^ 0x71) & ~(0xFF ^ 0xB9);
        n.var1[2] = 0x86 ^ 0x89;
        n.var1[3] = 2;
        n.var1[4] = 3;
        n.var1[5] = 2 ^ 0x19 ^ (0xAE ^ 0xB1);
        n.var1[6] = 178 + 27 - 145 + 124 ^ 113 + 70 - 166 + 155;
        n.var1[7] = 0x69 ^ 0x65;
        n.var1[8] = 0x30 ^ 0x3D;
        n.var1[9] = 0xAD ^ 0xA3;
        n.var1[10] = 0xE1 ^ 0x8A ^ (0x13 ^ 0x6D);
        n.var1[11] = 0xDB ^ 0x8D ^ (0x73 ^ 0xD);
        n.var1[12] = 70 + 80 - 49 + 29 ^ 7 + 13 - -95 + 39;
        n.var1[13] = 0xAF ^ 0xAA;
        n.var1[14] = 2 + 69 - 18 + 92 ^ 128 + 134 - 179 + 68;
        n.var1[15] = 0x13 ^ 1;
        n.var1[16] = 0x2F ^ 4 ^ (0xE ^ 0x22);
        n.var1[17] = 0x7D ^ 0x75;
        n.var1[18] = 0xB9 ^ 0x96 ^ (0xD6 ^ 0xC2);
        n.var1[19] = 0x5F ^ 0x76;
        n.var1[20] = 0x24 ^ 0x2E;
        n.var1[21] = 0x6C ^ 0x5E;
        n.var1[22] = 0x7B ^ 0x41;
        n.var1[23] = 0x79 ^ 0x58 ^ (0x4E ^ 0x5C);
        n.var1[24] = 0x3F ^ 0x7F;
        n.var1[25] = 39 + 113 - 54 + 74 ^ 123 + 74 - 170 + 102;
        n.var1[26] = 0x15 ^ 0x1F ^ 3;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static String var38(String var39, String var40) {
        var39 = new String(Base64.getDecoder().decode(var39.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var41 = new StringBuilder();
        char[] var42 = var40.toCharArray();
        int var43 = var1[1];
        char[] var44 = var39.toCharArray();
        int var45 = var44.length;
        int var46 = var1[1];
        while (n.var7(var46, var45)) {
            char var47 = var44[var46];
            var41.append((char)(var47 ^ var42[var43 % var42.length]));
            0;
            ++var43;
            ++var46;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var41);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var48;
        n var49;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return var1[1];
        }
        if (n.var11((Object)var49.type, (Object)p.FINAL) && n.var7(var49.Q().get().getWorldX(), var48.getWorldX())) {
            return var1[1];
        }
        List<TileObject> var50 = var49.M();
        int var51 = var1[1];
        while (n.var7(var51, var50.size()) && n.var7(var51, var1[4])) {
            void var52;
            if (n.var29(var51, var50.size())) {
                0;
                if (-2 <= 0) break;
                return ((127 + 132 - 224 + 120 ^ 120 + 117 - 235 + 143) & (139 + 179 - 292 + 154 ^ 33 + 163 - 120 + 114 ^ -1)) != 0;
            }
            TileObject var53 = var50.get(var51);
            int var54 = c.a(var53);
            if (!n.var30(var54, b.y) || n.var25((int)var52, var1[4])) {
                return var1[0];
            }
            ++var51;
            0;
            if (2 <= 2) continue;
            return ((154 + 46 - 140 + 159 ^ 13 + 56 - 68 + 132) & (1 ^ (0x62 ^ 0x3D) ^ -1)) != 0;
        }
        System.out.println(var2[var1[1]]);
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> N() {
        n var55;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return null;
        }
        if (n.var11((Object)var55.type, (Object)p.FINAL)) {
            void var56;
            return NPCs.getAll(arg_0 -> n.l((Player)var56, arg_0));
        }
        return null;
    }

    private static void var57() {
        var2 = new String[var1[26]];
        n.var2[n.var1[1]] = "should finish is false";
        n.var2[n.var1[0]] = "ShouldFinish!";
        n.var2[n.var1[3]] = "Statues: Walking ahead";
        n.var2[n.var1[4]] = "Darts: walking ahead";
        n.var2[n.var1[5]] = "error!";
        n.var2[n.var1[13]] = "Wizard Statue";
        n.var2[n.var1[14]] = "Wizard Statue";
        n.var2[n.var1[16]] = "Crossbowman Statue";
        n.var2[n.var1[17]] = "BOTTOM_V_II";
    }

        catch (Exception var63) {
            var63.printStackTrace();
            return null;
        }
    }

    private static boolean var64(int n2) {
        return n2 > 0;
    }

    private static  int k(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static  boolean g(Player player, TileObject tileObject) {
        int n2;
        if (n.var10(tileObject.getName().equals(var2[var1[13]]) ? 1 : 0) && n.var7(tileObject.getWorldX(), player.getWorldX())) {
            n2 = var1[0];
            0;
            if (-1 >= 1) {
                return ((6 ^ 0x52) & ~(0xDB ^ 0x8F)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static boolean var25(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> L() {
        n var65;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return null;
        }
        if (n.var11((Object)var65.type, (Object)p.FINAL) && n.var11((Object)var65.entry, (Object)o.SOUTH)) {
            void var66;
            WorldPoint var67 = new WorldPoint(var66.getWorldX() - var1[3], var65.startPoint.get().getWorldY() + var1[0], var66.getPlane());
            return new WorldArea(var67, var1[0], var1[4]).toWorldPointList();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var68;
        void var69;
        void var70;
        n var71;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return var1[1];
        }
        if (n.var10(var71.b((Locatable)var70) ? 1 : 0)) {
            var71.a((SquireSepulchre)var69);
            if (n.var10(var71.b((d)var68) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var71.startDestination.get());
                return var1[0];
            }
            Movement.setDestination((WorldPoint)var71.startPoint.get());
            return var1[0];
        }
        if (n.var10(var71.c((Locatable)var70) ? 1 : 0)) {
            var71.b((SquireSepulchre)var69);
            var71.e((d)var68);
            0;
            return var1[0];
        }
        return var1[1];
    }

    private GameEnum4(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, p p2, o o2) {
        this.north = var1[0];
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var72 = list.iterator();
            while (n.var10(var72.hasNext() ? 1 : 0)) {
                void var73;
                Triple var74 = (Triple)var72.next();
                var73.add(new WorldArea(SquireSepulchre.a((RegionPoint)var74.getFirst()), ((Integer)var74.getSecond()).intValue(), ((Integer)var74.getThird()).intValue()));
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

    private static  int d(Player player, WorldPoint worldPoint) {
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

    private static boolean var28(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var24(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var30(int n2, int n3) {
        return n2 != n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    static {
        n.var31();
        n.var57();
        BOTTOM_V_II = new GameEnum4(new RegionPoint(var1[18], var1[19], var1[1], b.N), var1[4], var1[20], new RegionPoint(var1[18], var1[21], var1[1], b.N), new RegionPoint(var1[22], var1[23], var1[1], b.N), new RegionPoint(var1[1], var1[23], var1[1], b.N), var1[24], var1[4], new RegionPoint(var1[13], var1[25], var1[1], b.N), p.FINAL, o.SOUTH);
        n[] nArray = new n[var1[0]];
        nArray[n.var1[1]] = BOTTOM_V_II;
        $VALUES = nArray;
    }

    /*
     * WARNING - void declaration
     */
    private List<TileObject> M() {
        n var75;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return null;
        }
        if (n.var11((Object)var75.type, (Object)p.FINAL)) {
            void var76;
            return TileObjects.getAll(arg_0 -> n.d((Player)var76, arg_0));
        }
        return null;
    }

    private static boolean var77(Object object) {
        return object != null;
    }

    private static  boolean d(Player player, TileObject tileObject) {
        int n2;
        if (n.var7(player.getWorldX() - tileObject.getWorldX(), var1[15]) && n.var7(Math.abs(player.getWorldY() - tileObject.getWorldY()), var1[4]) && n.var25(player.getPlane(), tileObject.getPlane()) && n.var10(tileObject.getName().equals(var2[var1[16]]) ? 1 : 0)) {
            n2 = var1[0];
            0;
            if (-1 == 2) {
                return ((0x5B ^ 0x53) & ~(1 ^ 9)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static  int c(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private GameEnum4(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, p p2, o o2) {
        this.north = var1[0];
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.type = p2;
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.entry = o2;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var78(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var79 = this.startAreas.get().iterator();
        while (n.var10(var79.hasNext() ? 1 : 0)) {
            void var80;
            WorldArea var81 = var79.next();
            if (n.var10(var81.contains((Locatable)var80) ? 1 : 0)) {
                return var1[0];
            }
            0;
            if null == null continue;
            return ((0x6D ^ 0x58) & ~(0x95 ^ 0xA0)) != 0;
        }
        return var1[1];
    }

    private static  int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(d d2) {
        void var82;
        void var83;
        n var84;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return var1[1];
        }
        List<WorldPoint> var85 = var84.L();
        List<WorldPoint> var86 = var84.a(var85, (d)var83);
        List<TileObject> var87 = var84.M();
        ArrayList<Integer> var88 = new ArrayList<Integer>();
        if (n.var64(var87.size())) {
            int var89 = var1[1];
            int var90 = var1[1];
            Iterator<TileObject> var91 = var87.iterator();
            while (n.var10(var91.hasNext() ? 1 : 0)) {
                TileObject var92 = var91.next();
                int var93 = c.a(var92);
                if (n.var25(var93, b.x)) {
                    ++var90;
                }
                if (n.var30(var93, b.x)) {
                    if (n.var11((Object)var84.type, (Object)p.FINAL)) {
                        var88.add(var92.getWorldY());
                        0;
                    }
                    ++var89;
                    0;
                    if (((102 + 146 - 180 + 156 ^ 40 + 71 - 47 + 106) & (0x6E ^ 0x25 ^ 1 ^ -1)) == 0) continue;
                    return ((0x38 ^ 2 ^ (0xBA ^ 0x9E)) & (38 + 127 - 5 + 23 ^ 12 + 41 - 30 + 146 ^ -1)) != 0;
                }
                if (n.var10(var84.a(var90) ? 1 : 0)) {
                    System.out.println(var2[var1[0]]);
                    Movement.setDestination((WorldPoint)var84.dartDestination.get());
                    return var1[0];
                }
                ++var90;
                0;
                if (-1 == -1) continue;
                return ((0xD ^ 0x1E ^ (0xCE ^ 0x9D)) & (36 + 145 - 151 + 182 ^ 81 + 22 - 16 + 61 ^ -1)) != 0;
            }
            if (n.var11((Object)var84.type, (Object)p.FINAL)) {
                var86.removeIf(worldPoint -> var88.contains(worldPoint.getWorldY()));
                0;
            }
            if (n.var10(var86.size())) {
                var86.sort(Comparator.comparingInt(arg_0 -> n.d((Player)var82, arg_0)));
                System.out.println(var2[var1[3]]);
                Movement.setDestination((WorldPoint)var86.get(var1[1]));
                return var1[0];
            }
            if (n.var11((Object)var84.type, (Object)p.FINAL)) {
                Movement.setDestination((WorldPoint)var82.getWorldLocation());
            }
            return var1[0];
        }
        List<NPC> var89 = var84.N();
        var89.sort(Comparator.comparingInt(arg_0 -> n.k((Player)var82, arg_0)));
        var88.clear();
        int var90 = var1[1];
        while (n.var7(var90, var1[3])) {
            if (n.var28(var89.size(), var90)) {
                0;
                if (3 != (0x66 ^ 0x62)) break;
                return ((0xED ^ 0xB7) & ~(0x18 ^ 0x42)) != 0;
            }
            NPC var91 = var89.get(var90);
            if (n.var3(var91)) {
                var89.remove(var90);
                0;
                0;
                if (-1 <= -1) continue;
                return ((0x4B ^ 0xA) & ~(0x81 ^ 0xC0)) != 0;
            }
            if (n.var11((Object)var84.type, (Object)p.FINAL)) {
                if (n.var7(var91.getWorldX(), var82.getWorldX())) {
                    var88.add(var91.getWorldY());
                    0;
                    ++var90;
                    0;
                    if (2 > 0) continue;
                    return ((0x2A ^ 0x6F) & ~(0x32 ^ 0x77)) != 0;
                }
                var89.remove(var90);
                0;
            }
            0;
            if (3 != -1) continue;
            return ((0x4F ^ 0x11) & ~(0x79 ^ 0x27)) != 0;
        }
        if (n.var11((Object)var84.type, (Object)p.FINAL)) {
            var86.removeIf(worldPoint -> var88.contains(worldPoint.getWorldY()));
            0;
        }
        if (n.var10(var86.size())) {
            var86.sort(Comparator.comparingInt(arg_0 -> n.c((Player)var82, arg_0)));
            System.out.println(var2[var1[4]]);
            Movement.setDestination((WorldPoint)var86.get(var1[1]));
        }
        System.out.println(var2[var1[5]]);
        return var1[1];
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var29(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(d d2) {
        n var94;
        void var95;
        Player player = Players.getLocal();
        if (n.var3(player)) {
            return var1[1];
        }
        if (n.var78(var95.getWorldLocation().equals((Object)var94.startPoint.get()) ? 1 : 0)) {
            return var1[1];
        }
        List<NPC> var96 = var94.N();
        var96.sort(Comparator.comparingInt(arg_0 -> n.f((Player)var95, arg_0)));
        if (n.var78(var96.size())) {
            return var1[0];
        }
        NPC var97 = var96.get(var1[1]);
        if (n.var77(var97)) {
            if (n.var11((Object)var94.type, (Object)p.FINAL)) {
                int var98 = Math.abs(var97.getWorldX() - var95.getWorldX());
                if (n.var25(var97.getWorldY(), var94.P().get().getWorldY()) && n.var7(var98, var1[2])) {
                    return var1[1];
                }
                return var1[0];
            }
            return var1[1];
        }
        return var1[1];
    }

    private static  boolean l(Player player, NPC nPC) {
        int n2;
        if (n.var7(nPC.getWorldX(), player.getWorldX() + var1[0]) && n.var7(Math.abs(nPC.getWorldY() - player.getWorldY()), var1[5]) && n.var24(nPC.getWorldX(), player.getWorldX() - var1[6]) && n.var10(b.z.contains(nPC.getId()) ? 1 : 0)) {
            n2 = var1[0];
            0;
            
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static  boolean h(Player player, TileObject tileObject) {
        int n2;
        if (n.var10(tileObject.getName().equals(var2[var1[14]]) ? 1 : 0) && n.var7(tileObject.getWorldX(), player.getWorldX())) {
            n2 = var1[0];
            0;
            if null != null {
                return (2 & ~2 & ~((0x13 ^ 2) & ~(6 ^ 0x17))) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }
}

