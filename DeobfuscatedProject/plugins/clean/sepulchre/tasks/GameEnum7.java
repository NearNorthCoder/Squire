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

import gg.squire.sepulchre.tasks.GameEnum10;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum9;
import gg.squire.sepulchre.tasks.GameEnum35;
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

public final class GameEnum7
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
        if (n.lIIIlIIIlIIlIll(var3_3)) {
            return null;
        }
        var1 = I.aC();
        var2 = new ArrayList<WorldPoint>();
        var3 = n.lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var3, var4.size())) {
            var5 = (WorldPoint)var4.get(var3);
            if (n.lIIIlIIIlIIlIll(var5)) {

                if (((135 ^ 155 ^ (231 ^ 190)) & (88 ^ 79 ^ (2 ^ 80) ^ -1)) != 0) {
                    return null;
                }
            } else if (n.lIIIlIIIlIIllII((int)var1.contains(var5)) && n.lIIIlIIIlIIllll((Object)p.FINAL, (Object)var6.type)) {
                var2.add(var5.dx(n.lllIIIIllIIl[0]));

                if (2 > 2) {
                    return null;
                }
            } else {
                var2.add(var5);

            }
            ++var3;

            return null;
        }
        var3 = var6.startPoint.get();
        var5 = var3.getWorldY() - n.lllIIIIllIIl[0];
        var7 = var3.getWorldY() + n.lllIIIIllIIl[5];
        var8 = TileObjects.getNearest((WorldPoint)new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var5, var3.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, h(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)var9));
        var10 = TileObjects.getNearest((WorldPoint)new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var7, var3.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, g(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)var9));
        if (n.lIIIlIIIlIIlIll(var8)) {
            return var2;
        }
        if (n.lIIIlIIIlIIlIll(var10)) {
            return var2;
        }
        var11 = var12.b(var8);
        var13 = var12.b(var10);
        if (n.lIIIlIIIlIIlIll(var11)) {
            return var2;
        }
        if (n.lIIIlIIIlIIlIll(var13)) {
            return var2;
        }
        var14 = new ArrayList<WorldPoint>();
        var15 = n.lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var15, var2.size())) {
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
                                                        var16 = (WorldPoint)var2.get(var15);
                                                        var17 = var6.dartArea.get().getX();
                                                        if (!n.lIIIlIIIlIIlIll(var16)) break block44;

                                                        }
                                                        break block45;
                                                    }
                                                    if (!n.lIIIlIIIlIlIlII(var17 + n.lllIIIIllIIl[6], var9.getWorldX())) break block46;
                                                    if (!n.lIIIlIIIlIIllII((int)var6.north)) break block47;
                                                    if (!n.lIIIlIIIlIlIIII(var17 + n.lllIIIIllIIl[7], var9.getWorldX())) break block48;
                                                    if (n.lIIIlIIIlIlIIII(var13.aG(), b.o) && n.lIIIlIIIlIlIIII(var13.aF(), n.lllIIIIllIIl[0])) {
                                                        var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var16.getY(), var9.getPlane());
                                                        var14.add(var18);

                                                        if (((80 + 7 - 28 + 89 ^ 39 + 68 - 60 + 134) & (76 ^ 83 ^ (20 ^ 42) ^ -1)) != 0) {
                                                            return null;
                                                        }
                                                    } else if (n.lIIIlIIIlIlIIII(var11.aG(), b.o) && n.lIIIlIIIlIlIIII(var11.aF(), n.lllIIIIllIIl[0])) {
                                                        var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var16.getY(), var9.getPlane());
                                                        var14.add(var18);

                                                        if (3 == 0) {
                                                            return null;
                                                        }
                                                    } else {
                                                        var18 = new WorldPoint(var9.getWorldX(), var16.getY(), var9.getPlane());
                                                        var14.add(var18);

                                                        }
                                                    }
                                                    break block45;
                                                }
                                                if (!n.lIIIlIIIlIlIIII(var17 + n.lllIIIIllIIl[8], var9.getWorldX())) break block47;
                                                var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var16.getY(), var9.getPlane());
                                                var14.add(var18);

                                                if (-1 >= (79 ^ 75)) {
                                                    return null;
                                                }
                                                break block45;
                                            }
                                            if (!n.lIIIlIIIlIlIIII(var17 + n.lllIIIIllIIl[8], var9.getWorldX())) break block49;
                                            if (n.lIIIlIIIlIlIIII(var13.aG(), b.o) && n.lIIIlIIIlIlIIII(var13.aF(), n.lllIIIIllIIl[0])) {
                                                var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var16.getY(), var9.getPlane());
                                                var14.add(var18);

                                                if ((152 ^ 156) == 0) {
                                                    return null;
                                                }
                                            } else if (n.lIIIlIIIlIlIIII(var11.aG(), b.o) && n.lIIIlIIIlIlIIII(var11.aF(), n.lllIIIIllIIl[0])) {
                                                var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var16.getY(), var9.getPlane());
                                                var14.add(var18);

                                                }
                                            } else {
                                                var18 = new WorldPoint(var9.getWorldX(), var16.getY(), var9.getPlane());
                                                var14.add(var18);

                                                if (2 < 0) {
                                                    return null;
                                                }
                                            }
                                            break block45;
                                        }
                                        if (!n.lIIIlIIIlIlIIII(var17 + n.lllIIIIllIIl[9], var9.getWorldX())) break block46;
                                        var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var16.getY(), var9.getPlane());
                                        var14.add(var18);

                                        if (1 == 3) {
                                            return null;
                                        }
                                        break block45;
                                    }
                                    if (!n.lIIIlIIIlIlIIII(var17 + n.lllIIIIllIIl[10], var9.getWorldX())) break block50;
                                    var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var16.getY(), var9.getPlane());
                                    var14.add(var18);

                                    if ((3 ^ (50 ^ 53)) < 0) {
                                        return null;
                                    }
                                    break block45;
                                }
                                if (!n.lIIIlIIIlIlIIII(var17 + n.lllIIIIllIIl[6], var9.getWorldX())) break block51;
                                if (n.lIIIlIIIlIlIIII(var13.aG(), b.o) && n.lIIIlIIIlIlIIII(var13.aF(), n.lllIIIIllIIl[0])) {
                                    var6.north = n.lllIIIIllIIl[0];
                                    var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var16.getY(), var9.getPlane());
                                    var14.add(var18);

                                    }
                                } else if (n.lIIIlIIIlIlIIII(var11.aG(), b.o) && n.lIIIlIIIlIlIIII(var11.aF(), n.lllIIIIllIIl[0])) {
                                    var6.north = n.lllIIIIllIIl[1];
                                    var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[3], var16.getY(), var9.getPlane());
                                    var14.add(var18);

                                    if (-1 >= ((52 ^ 14) & ~(155 ^ 161))) {
                                        return null;
                                    }
                                } else {
                                    var18 = new WorldPoint(var9.getWorldX(), var16.getY(), var9.getPlane());
                                    var14.add(var18);

                                    if (3 == 0) {
                                        return null;
                                    }
                                }
                                break block45;
                            }
                            var19 = Math.abs(var9.getWorldX() - var8.getWorldX());
                            if ((!n.lIIIlIIIlIlIlIl(var19, n.lllIIIIllIIl[4]) || n.lIIIlIIIlIlIIlI(var17 + n.lllIIIIllIIl[11], var9.getWorldX())) && (!n.lIIIlIIIlIlIIlI(var19, n.lllIIIIllIIl[3]) || !n.lIIIlIIIlIlIlIl(var19, n.lllIIIIllIIl[5]) || !n.lIIIlIIIlIlIIIl(var17 + n.lllIIIIllIIl[12], var9.getWorldX()) || !n.lIIIlIIIlIlIlII(var17 + n.lllIIIIllIIl[11], var9.getWorldX()))) ** GOTO lbl-1000
                            if (n.lIIIlIIIlIlIIll(var11.aG(), b.r) && !n.lIIIlIIIlIlIIII(var11.aG(), b.q)) break block52;
                            var18 = new WorldPoint(var9.getWorldX(), var16.getY(), var9.getPlane());
                            var14.add(var18);

                            if ((140 + 165 - 214 + 89 ^ 162 + 127 - 282 + 170) == 0) {
                                return null;
                            }
                            break block45;
                        }
                        if (n.lIIIlIIIlIlIIll(var13.aG(), b.r) && !n.lIIIlIIIlIlIIII(var13.aG(), b.q)) break block53;
                        var18 = new WorldPoint(var9.getWorldX(), var16.getY(), var9.getPlane());
                        var14.add(var18);

                        }
                        break block45;
                    }
                    if (!n.lIIIlIIIlIlIIIl(var17 + n.lllIIIIllIIl[11], var9.getWorldX())) ** GOTO lbl-1000
                    if (!n.lIIIlIIIlIlIIII(var9.getWorldX() % n.lllIIIIllIIl[3], n.lllIIIIllIIl[0])) break block54;
                    if ((!n.lIIIlIIIlIlIIII(var11.aG(), b.o) || n.lIIIlIIIlIlIlIl(var11.aF(), n.lllIIIIllIIl[0])) && !n.lIIIlIIIlIlIIII(var11.aG(), b.n)) ** GOTO lbl-1000
                    var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var16.getY(), var9.getPlane());
                    var14.add(var18);

                    if ((22 ^ 86 ^ (84 ^ 16)) < -1) {
                        return null;
                    }
                    break block45;
                }
                if (n.lIIIlIIIlIlIIII(var13.aG(), b.o) && !n.lIIIlIIIlIlIlIl(var13.aF(), n.lllIIIIllIIl[0]) || n.lIIIlIIIlIlIIII(var13.aG(), b.n)) {
                    var18 = new WorldPoint(var9.getWorldX() - n.lllIIIIllIIl[0], var16.getY(), var9.getPlane());
                    var14.add(var18);

                    if (-1 >= (165 ^ 161)) {
                        return null;
                    }
                } else lbl-1000:
                // 4 sources

                {
                    var14.add(var16);

                }
            }
            ++var15;

            return null;
        }
        return var13_15;
    }

    private static boolean lIIIlIIIlIIllII(int n2) {
        return n2 != 0;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

        return String.valueOf(var20);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var21;
        n var22;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllll((Object)var22.type, (Object)p.FINAL) && n.lIIIlIIIlIlIIIl(var22.Q().get().getWorldX(), var21.getWorldX())) {
            return lllIIIIllIIl[1];
        }
        List<TileObject> var23 = var22.M();
        int var24 = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var24, var23.size()) && n.lIIIlIIIlIlIIIl(var24, lllIIIIllIIl[4])) {
            void var25;
            if (n.lIIIlIIIlIlIIlI(var24, var23.size())) {

                if (-2 <= 0) break;
                return false;
            }
            TileObject var26 = var23.get(var24);
            int var27 = c.a(var26);
            if (!n.lIIIlIIIlIlIIll(var27, b.y) || n.lIIIlIIIlIlIIII((int)var25, lllIIIIllIIl[4])) {
                return lllIIIIllIIl[0];
            }
            ++var24;

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
        n var28;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)var28.type, (Object)p.FINAL)) {
            void var29;
            return NPCs.getAll(arg_0 -> n.l((Player)var29, arg_0));
        }
        return null;
    }

    private static void lIIIlIIIlIIlIIl() {
        lllIIIIllIII = new String[lllIIIIllIIl[26]];
        n.lllIIIIllIII[n.lllIIIIllIIl[1]] = "should finish is false";
        n.lllIIIIllIII[n.lllIIIIllIIl[0]] = "ShouldFinish!";
        n.lllIIIIllIII[n.lllIIIIllIIl[3]] = "Statues: Walking ahead";
        n.lllIIIIllIII[n.lllIIIIllIIl[4]] = "Darts: walking ahead";
        n.lllIIIIllIII[n.lllIIIIllIIl[5]] = "error!";
        n.lllIIIIllIII[n.lllIIIIllIIl[13]] = "Wizard Statue";
        n.lllIIIIllIII[n.lllIIIIllIIl[14]] = "Wizard Statue";
        n.lllIIIIllIII[n.lllIIIIllIIl[16]] = "Crossbowman Statue";
        n.lllIIIIllIII[n.lllIIIIllIIl[17]] = "BOTTOM_V_II";
    }

    private static boolean lIIIlIIIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static  int k(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static  boolean g(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[13]]) ? 1 : 0) && n.lIIIlIIIlIlIIIl(tileObject.getWorldX(), player.getWorldX())) {
            n2 = lllIIIIllIIl[0];

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
        n var30;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)var30.type, (Object)p.FINAL) && n.lIIIlIIIlIIllll((Object)var30.entry, (Object)o.SOUTH)) {
            void var31;
            WorldPoint var32 = new WorldPoint(var31.getWorldX() - lllIIIIllIIl[3], var30.startPoint.get().getWorldY() + lllIIIIllIIl[0], var31.getPlane());
            return new WorldArea(var32, lllIIIIllIIl[0], lllIIIIllIIl[4]).toWorldPointList();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var33;
        void var34;
        void var35;
        n var36;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllII(var36.b((Locatable)var35) ? 1 : 0)) {
            var36.a((SquireSepulchre)var34);
            if (n.lIIIlIIIlIIllII(var36.b((SepulchreManager) ar33) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var36.startDestination.get());
                return lllIIIIllIIl[0];
            }
            Movement.setDestination((WorldPoint)var36.startPoint.get());
            return lllIIIIllIIl[0];
        }
        if (n.lIIIlIIIlIIllII(var36.c((Locatable)var35) ? 1 : 0)) {
            var36.b((SquireSepulchre)var34);
            var36.e((SepulchreManager) ar33);

            return lllIIIIllIIl[0];
        }
        return lllIIIIllIIl[1];
    }

    private GameEnum7(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, p p2, o o2) {
        this.north = lllIIIIllIIl[0];
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var37 = list.iterator();
            while (n.lIIIlIIIlIIllII(var37.hasNext() ? 1 : 0)) {
                void var38;
                Triple var39 = (Triple)var37.next();
                var38.add(new WorldArea(SquireSepulchre.a((RegionPoint)var39.getFirst()), ((Integer)var39.getSecond()).intValue(), ((Integer)var39.getThird()).intValue()));

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
        BOTTOM_V_II = new GameEnum7(new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[19], lllIIIIllIIl[1], b.N), lllIIIIllIIl[4], lllIIIIllIIl[20], new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[21], lllIIIIllIIl[1], b.N), new RegionPoint(lllIIIIllIIl[22], lllIIIIllIIl[23], lllIIIIllIIl[1], b.N), new RegionPoint(lllIIIIllIIl[1], lllIIIIllIIl[23], lllIIIIllIIl[1], b.N), lllIIIIllIIl[24], lllIIIIllIIl[4], new RegionPoint(lllIIIIllIIl[13], lllIIIIllIIl[25], lllIIIIllIIl[1], b.N), p.FINAL, o.SOUTH);
        n[] nArray = new n[lllIIIIllIIl[0]];
        nArray[n.lllIIIIllIIl[1]] = BOTTOM_V_II;
        $VALUES = nArray;
    }

    /*
     * WARNING - void declaration
     */
    private List<TileObject> M() {
        n var40;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)var40.type, (Object)p.FINAL)) {
            void var41;
            return TileObjects.getAll(arg_0 -> n.d((Player)var41, arg_0));
        }
        return null;
    }

    private static boolean lIIIlIIIlIIlllI(Object object) {
        return object != null;
    }

    private static  boolean d(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIlIIIl(player.getWorldX() - tileObject.getWorldX(), lllIIIIllIIl[15]) && n.lIIIlIIIlIlIIIl(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIIllIIl[4]) && n.lIIIlIIIlIlIIII(player.getPlane(), tileObject.getPlane()) && n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[16]]) ? 1 : 0)) {
            n2 = lllIIIIllIIl[0];

            if (-1 == 2) {
                return false;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static  int c(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private GameEnum7(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, p p2, o o2) {
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
        Iterator<WorldArea> var42 = this.startAreas.get().iterator();
        while (n.lIIIlIIIlIIllII(var42.hasNext() ? 1 : 0)) {
            void var43;
            WorldArea var44 = var42.next();
            if (n.lIIIlIIIlIIllII(var44.contains((Locatable)var43) ? 1 : 0)) {
                return lllIIIIllIIl[0];
            }

            return false;
        }
        return lllIIIIllIIl[1];
    }

    private static  int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(d d2) {
        void var45;
        void var46;
        n var47;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        List<WorldPoint> var48 = var47.L();
        List<WorldPoint> var49 = var47.a(var48, (SepulchreManager) ar46);
        List<TileObject> var50 = var47.M();
        ArrayList<Integer> var51 = new ArrayList<Integer>();
        if (n.lIIIlIIIlIlIllI(var50.size())) {
            int var52 = lllIIIIllIIl[1];
            int var53 = lllIIIIllIIl[1];
            Iterator<TileObject> var54 = var50.iterator();
            while (n.lIIIlIIIlIIllII(var54.hasNext() ? 1 : 0)) {
                TileObject var55 = var54.next();
                int var56 = c.a(var55);
                if (n.lIIIlIIIlIlIIII(var56, b.x)) {
                    ++var53;
                }
                if (n.lIIIlIIIlIlIIll(var56, b.x)) {
                    if (n.lIIIlIIIlIIllll((Object)var47.type, (Object)p.FINAL)) {
                        var51.add(var55.getWorldY());

                    }
                    ++var52;

                    if (((102 + 146 - 180 + 156 ^ 40 + 71 - 47 + 106) & (0x6E ^ 0x25 ^ 1 ^ -1)) == 0) continue;
                    return ((0x38 ^ 2 ^ (0xBA ^ 0x9E)) & (38 + 127 - 5 + 23 ^ 12 + 41 - 30 + 146 ^ -1)) != 0;
                }
                if (n.lIIIlIIIlIIllII(var47.a(var53) ? 1 : 0)) {
                    System.out.println(lllIIIIllIII[lllIIIIllIIl[0]]);
                    Movement.setDestination((WorldPoint)var47.dartDestination.get());
                    return lllIIIIllIIl[0];
                }
                ++var53;

                if (-1 == -1) continue;
                return ((0xD ^ 0x1E ^ (0xCE ^ 0x9D)) & (36 + 145 - 151 + 182 ^ 81 + 22 - 16 + 61 ^ -1)) != 0;
            }
            if (n.lIIIlIIIlIIllll((Object)var47.type, (Object)p.FINAL)) {
                var49.removeIf(worldPoint -> var51.contains(worldPoint.getWorldY()));

            }
            if (n.lIIIlIIIlIIllII(var49.size())) {
                var49.sort(Comparator.comparingInt(arg_0 -> n.d((Player)var45, arg_0)));
                System.out.println(lllIIIIllIII[lllIIIIllIIl[3]]);
                Movement.setDestination((WorldPoint)var49.get(lllIIIIllIIl[1]));
                return lllIIIIllIIl[0];
            }
            if (n.lIIIlIIIlIIllll((Object)var47.type, (Object)p.FINAL)) {
                Movement.setDestination((WorldPoint)var45.getWorldLocation());
            }
            return lllIIIIllIIl[0];
        }
        List<NPC> var52 = var47.N();
        var52.sort(Comparator.comparingInt(arg_0 -> n.k((Player)var45, arg_0)));
        var51.clear();
        int var53 = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(var53, lllIIIIllIIl[3])) {
            if (n.lIIIlIIIlIlIlIl(var52.size(), var53)) {

                if (3 != (0x66 ^ 0x62)) break;
                return false;
            }
            NPC var54 = var52.get(var53);
            if (n.lIIIlIIIlIIlIll(var54)) {
                var52.remove(var53);

                if (-1 <= -1) continue;
                return false;
            }
            if (n.lIIIlIIIlIIllll((Object)var47.type, (Object)p.FINAL)) {
                if (n.lIIIlIIIlIlIIIl(var54.getWorldX(), var45.getWorldX())) {
                    var51.add(var54.getWorldY());

                    ++var53;

                    if (2 > 0) continue;
                    return false;
                }
                var52.remove(var53);

            }

            if (3 != -1) continue;
            return false;
        }
        if (n.lIIIlIIIlIIllll((Object)var47.type, (Object)p.FINAL)) {
            var49.removeIf(worldPoint -> var51.contains(worldPoint.getWorldY()));

        }
        if (n.lIIIlIIIlIIllII(var49.size())) {
            var49.sort(Comparator.comparingInt(arg_0 -> n.c((Player)var45, arg_0)));
            System.out.println(lllIIIIllIII[lllIIIIllIIl[4]]);
            Movement.setDestination((WorldPoint)var49.get(lllIIIIllIIl[1]));
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
        n var57;
        void var58;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllIl(var58.getWorldLocation().equals((Object)var57.startPoint.get()) ? 1 : 0)) {
            return lllIIIIllIIl[1];
        }
        List<NPC> var59 = var57.N();
        var59.sort(Comparator.comparingInt(arg_0 -> n.f((Player)var58, arg_0)));
        if (n.lIIIlIIIlIIllIl(var59.size())) {
            return lllIIIIllIIl[0];
        }
        NPC var60 = var59.get(lllIIIIllIIl[1]);
        if (n.lIIIlIIIlIIlllI(var60)) {
            if (n.lIIIlIIIlIIllll((Object)var57.type, (Object)p.FINAL)) {
                int var61 = Math.abs(var60.getWorldX() - var58.getWorldX());
                if (n.lIIIlIIIlIlIIII(var60.getWorldY(), var57.P().get().getWorldY()) && n.lIIIlIIIlIlIIIl(var61, lllIIIIllIIl[2])) {
                    return lllIIIIllIIl[1];
                }
                return lllIIIIllIIl[0];
            }
            return lllIIIIllIIl[1];
        }
        return lllIIIIllIIl[1];
    }

    private static  boolean l(Player player, NPC nPC) {
        int n2;
        if (n.lIIIlIIIlIlIIIl(nPC.getWorldX(), player.getWorldX() + lllIIIIllIIl[0]) && n.lIIIlIIIlIlIIIl(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIIIllIIl[5]) && n.lIIIlIIIlIlIlII(nPC.getWorldX(), player.getWorldX() - lllIIIIllIIl[6]) && n.lIIIlIIIlIIllII(b.z.contains(nPC.getId()) ? 1 : 0)) {
            n2 = lllIIIIllIIl[0];

            if (1 == 0) {
                return false;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static  boolean h(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[14]]) ? 1 : 0) && n.lIIIlIIIlIlIIIl(tileObject.getWorldX(), player.getWorldX())) {
            n2 = lllIIIIllIIl[0];

            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }
}

