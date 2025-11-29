/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Pair
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

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum30;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
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

public final class GameEnum27
extends Enum<l> {
     Supplier<List<WorldArea>> startAreas;
     List<Pair<Integer, Integer>> waitPairs;
    public static final  /* enum */ l SOUTH_III_I;
    private static final  l[] $VALUES;
     Supplier<WorldPoint> dartDestination;
     Supplier<WorldPoint> startDestination;
    
     m type;
     Supplier<WorldArea> dartArea;
    
     Supplier<WorldPoint> startPoint;
    public  Supplier<TileObject> object;

    private static boolean lIIIlIIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static  int g(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static boolean lIIIlIIllIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIllIIIllI(Object object) {
        return object != null;
    }

    private static void lIIIlIIlIlllllI() {
        lllIIIllIlIl = new String[lllIIIlllIII[13]];
        l.lllIIIllIlIl[l.lllIIIlllIII[0]] = "Wizard Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[1]] = "Wizard Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[4]] = "Crossbowman Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[3]] = "Crossbowman Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[11]] = "SOUTH_III_I";
    }

    /*
     * WARNING - void declaration
     */
    private boolean T() {
        l var1;
        void var2;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        int var3 = var2.getWorldY();
        int var4 = lllIIIlllIII[4];
        Iterator<Pair<Integer, Integer>> var5 = var1.waitPairs.iterator();
        while (l.lIIIlIIllIIIIll(var5.hasNext() ? 1 : 0)) {
            void var6;
            Pair<Integer, Integer> var7 = var5.next();
            if (!l.lIIIlIIllIIllIl(var3, (Integer)var7.getFirst() + var6)) continue;
            if (l.lIIIlIIllIIlIll(var3, (Integer)var7.getSecond() + var6)) {

                if (-3 < 0) continue;
                return false;
            }
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    private int U() {
        l var8;
        void var9;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[5];
        }
        int var10 = var9.getWorldY();
        int var11 = lllIIIlllIII[4];
        Iterator<Pair<Integer, Integer>> var12 = var8.waitPairs.iterator();
        while (l.lIIIlIIllIIIIll(var12.hasNext() ? 1 : 0)) {
            void var13;
            Pair<Integer, Integer> var14 = var12.next();
            if (!l.lIIIlIIllIIllIl(var10, (Integer)var14.getFirst() + var13)) continue;
            if (l.lIIIlIIllIIlIll(var10, (Integer)var14.getSecond() + var13)) {

                if (2 != 0) continue;
                return (0x15 ^ 0x66 ^ (0x7B ^ 0x38)) & (187 + 156 - 213 + 59 ^ 33 + 118 - 106 + 96 ^ -1);
            }
            if (l.lIIIlIIllIIlIII(var10, (int)(var13 + (Integer)var14.getSecond()))) {
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[5];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    static {
        l.lIIIlIIllIIIIIl();
        l.lIIIlIIlIlllllI();
        SOUTH_III_I = new GameEnum27(List.of(new Triple((Object)new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[4], lllIIIlllIII[1], b.J), (Object)lllIIIlllIII[1], (Object)lllIIIlllIII[11]), new Triple((Object)new RegionPoint(lllIIIlllIII[12], lllIIIlllIII[4], lllIIIlllIII[1], b.J), (Object)lllIIIlllIII[1], (Object)lllIIIlllIII[11])), new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[13], lllIIIlllIII[1], b.J), new RegionPoint(lllIIIlllIII[14], lllIIIlllIII[15], lllIIIlllIII[4], b.J), List.of(new Pair((Object)lllIIIlllIII[16], (Object)lllIIIlllIII[1]), new Pair((Object)lllIIIlllIII[10], (Object)lllIIIlllIII[2])), new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[18], lllIIIlllIII[1], b.K), lllIIIlllIII[3], lllIIIlllIII[19], new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[12], lllIIIlllIII[4], b.J), m.NORTH_BACK);
        l[] lArray = new l[lllIIIlllIII[1]];
        lArray[l.lllIIIlllIII[0]] = SOUTH_III_I;
        $VALUES = lArray;
    }

    private static boolean lIIIlIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var15);
    }

    private boolean d(d var16) {
        String[] stringArray = new String[lllIIIlllIII[1]];
        stringArray[l.lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[0]];
        TileObject var17 = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIII[6], lllIIIlllIII[7], lllIIIlllIII[1], b.J)), (String[])stringArray);
        String[] stringArray2 = new String[lllIIIlllIII[1]];
        stringArray2[l.lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[1]];
        TileObject var18 = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[7], lllIIIlllIII[1], b.J)), (String[])stringArray2);
        if (!l.lIIIlIIllIIIllI(var17) || l.lIIIlIIllIIIIlI(var18)) {
            return lllIIIlllIII[0];
        }
        J var19 = var16.b(var17);
        J var20 = var16.b(var18);
        int var21 = var19.aG();
        int var22 = var20.aG();
        if (l.lIIIlIIllIIIlll(var21, b.o) && !l.lIIIlIIllIIlllI(var19.aF(), lllIIIlllIII[4]) || l.lIIIlIIllIIIlll(var22, b.o) && l.lIIIlIIllIIIlll(var20.aF(), lllIIIlllIII[4])) {
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var23 = this.startAreas.get().iterator();
        while (l.lIIIlIIllIIIIll(var23.hasNext() ? 1 : 0)) {
            void var24;
            WorldArea var25 = var23.next();
            if (l.lIIIlIIllIIIIll(var25.contains((Locatable)var24) ? 1 : 0)) {
                return lllIIIlllIII[1];
            }

            if (3 > 0) continue;
            return false;
        }
        return lllIIIlllIII[0];
    }

    private GameEnum27(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, List<Pair<Integer, Integer>> list, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, m m2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.type = m2;
    }

    private GameEnum27(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, List<Pair<Integer, Integer>> list2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, m m2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var26 = list.iterator();
            while (l.lIIIlIIllIIIIll(var26.hasNext() ? 1 : 0)) {
                void var27;
                Triple var28 = (Triple)var26.next();
                var27.add(new WorldArea(SquireSepulchre.a((RegionPoint)var28.getFirst()), ((Integer)var28.getSecond()).intValue(), ((Integer)var28.getThird()).intValue()));

                if (-1 <= (0xB2 ^ 0xB6)) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.startDestination = () -> SquireSepulchre.a(regionPoint2);
        this.type = m2;
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint3), n3, n4);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint4);
        this.waitPairs = list2;
    }

    private static  boolean j(Player player, NPC nPC) {
        boolean bl;
        if (l.lIIIlIIllIIlIII(nPC.getWorldY(), player.getWorldY() + lllIIIlllIII[4])) {
            bl = lllIIIlllIII[1];

            if ((0x99 ^ 0x9D) < 0) {
                return false;
            }
        } else {
            bl = lllIIIlllIII[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(d d2) {
        void var29;
        l var30;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        int var31 = lllIIIlllIII[4];
        if (l.lIIIlIIllIIIIll(var30.T() ? 1 : 0)) {
            void var32;
            if (l.lIIIlIIllIIIIll(var30.d((SepulchreManager) ar32) ? 1 : 0)) {
                var31 = lllIIIlllIII[4];

                if (3 <= 1) {
                    return false;
                }
            } else {
                var31 = var30.U();
            }
        }
        WorldPoint var33 = new WorldPoint(var30.startPoint.get().getWorldX() - lllIIIlllIII[3], var29.getWorldY() + var31, var29.getPlane());
        List var34 = new WorldArea(var33, lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List var35 = TileObjects.getAll(arg_0 -> l.e((Player)var29, arg_0));
        ArrayList<Integer> var36 = new ArrayList<Integer>();
        if (l.lIIIlIIllIIlIlI(var35.size())) {
            int var37 = lllIIIlllIII[0];
            int var38 = lllIIIlllIII[0];
            Iterator var39 = var35.iterator();
            while (l.lIIIlIIllIIIIll(var39.hasNext() ? 1 : 0)) {
                TileObject var40 = (TileObject)var39.next();
                int var41 = c.a(var40);
                if (l.lIIIlIIllIIIlll(var41, b.x)) {
                    ++var38;
                }
                if (l.lIIIlIIllIIlIll(var41, b.y)) {
                    ++var37;
                    var36.add(var40.getWorldX());

                    if ((0x39 ^ 0x5F ^ (0x55 ^ 0x37)) != 0) continue;
                    return ((174 + 197 - 319 + 146 ^ 20 + 24 - -40 + 61) & (0x3C ^ 0x62 ^ (0xBA ^ 0xB3) ^ -1)) != 0;
                }
                ++var38;

                return ((41 + 66 - 23 + 51 ^ 132 + 24 - 81 + 74) & (0x8C ^ 0xB5 ^ (0xA1 ^ 0x8A) ^ -1)) != 0;
            }
            var34.removeIf(worldPoint -> var36.contains(worldPoint.getWorldX()));

            if (l.lIIIlIIllIIIlll(var34.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var34.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[1];
        }
        List var37 = NPCs.getAll(arg_0 -> l.h((Player)var29, arg_0));
        var37.sort(Comparator.comparingInt(arg_0 -> l.g((Player)var29, arg_0)));
        var36.clear();
        Iterator var38 = var37.iterator();
        while (l.lIIIlIIllIIIIll(var38.hasNext() ? 1 : 0)) {
            NPC var39 = (NPC)var38.next();
            if (l.lIIIlIIllIIlIII(var36.size(), lllIIIlllIII[4]) && l.lIIIlIIllIIIlIl(var36.contains(var39.getWorldX()) ? 1 : 0) && l.lIIIlIIllIIlIII(var39.getWorldY(), var29.getWorldY() + lllIIIlllIII[4])) {
                var36.add(var39.getWorldX());

            }

            if (-1 < 0) continue;
            return ((0x47 ^ 0x70 ^ (0x75 ^ 0x4D)) & (0 + 119 - 56 + 74 ^ 115 + 66 - 121 + 74 ^ -1)) != 0;
        }
        var36.stream().sorted();

        var34.removeIf(worldPoint -> var36.contains(worldPoint.getWorldX()));

        if (l.lIIIlIIllIIIIll(var34.size())) {
            if (l.lIIIlIIllIIIlll(var34.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var34.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint)((WorldPoint)var34.get(lllIIIlllIII[0])));
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static  boolean e(Player player, TileObject tileObject) {
        int n2;
        if (l.lIIIlIIllIIlIII(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && l.lIIIlIIllIIlIll(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[4]) && l.lIIIlIIllIIIlll(player.getPlane(), tileObject.getPlane()) && l.lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[4]]) ? 1 : 0)) {
            n2 = lllIIIlllIII[1];

            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    private static  boolean f(Player player, TileObject tileObject) {
        int n2;
        if (l.lIIIlIIllIIlIII(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && l.lIIIlIIllIIlIII(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIIlllIII[11]) && l.lIIIlIIllIIIlll(player.getPlane(), tileObject.getPlane()) && l.lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[3]]) ? 1 : 0)) {
            n2 = lllIIIlllIII[1];

            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    private static boolean lIIIlIIllIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllIIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean S() {
        l var42;
        void var43;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIlIl(var43.getWorldLocation().equals((Object)var42.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIII[0];
        }
        WorldPoint var44 = new WorldPoint(var42.startPoint.get().getWorldX() - lllIIIlllIII[3], var43.getWorldY() + lllIIIlllIII[1], var43.getPlane());
        List var45 = new WorldArea(var44, lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List var46 = TileObjects.getAll(arg_0 -> l.f((Player)var43, arg_0));
        ArrayList<Integer> var47 = new ArrayList<Integer>();
        if (l.lIIIlIIllIIlIlI(var46.size())) {
            int var48 = lllIIIlllIII[0];
            int var49 = lllIIIlllIII[0];
            Iterator var50 = var46.iterator();
            while (l.lIIIlIIllIIIIll(var50.hasNext() ? 1 : 0)) {
                TileObject var51 = (TileObject)var50.next();
                int var52 = c.a(var51);
                if (l.lIIIlIIllIIIlll(var52, b.x)) {
                    ++var49;
                }
                if (l.lIIIlIIllIIlIll(var52, b.x)) {
                    ++var48;
                    var47.add(var51.getWorldX());

                    if (-1 <= 0) continue;
                    return false;
                }
                ++var49;

                if ((0xC1 ^ 0xB5 ^ (0 ^ 0x71)) > 0) continue;
                return ((0xA9 ^ 0x97 ^ (0x1E ^ 0x76)) & (0x8F ^ 0x9E ^ (0x25 ^ 0x62) ^ -1)) != 0;
            }
            var45.removeIf(worldPoint -> var47.contains(worldPoint.getWorldX()));

            if (l.lIIIlIIllIIIlll(var45.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var45.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var53;
        void var54;
        l var55;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIIll(var55.b((Locatable)var54) ? 1 : 0)) {
            var55.a((SquireSepulchre)var53);
            if (l.lIIIlIIllIIIlII((Object)var55.type, (Object)m.NORTH_BACK) && l.lIIIlIIllIIIIll(var55.S() ? 1 : 0)) {
                var55.b((SquireSepulchre)var53);
                return lllIIIlllIII[1];
            }
            if (l.lIIIlIIllIIIIll(var55.R() ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var55.startDestination.get());
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint)var55.startPoint.get());
            return lllIIIlllIII[1];
        }
        if (l.lIIIlIIllIIIIll(var55.c((Locatable)var54) ? 1 : 0)) {
            var55.b((SquireSepulchre)var53);
            if (l.lIIIlIIllIIIlII((Object)var55.type, (Object)m.NORTH_BACK)) {
                void var56;
                var55.c((SepulchreManager) ar56);

                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[0];
    }

    private static  int i(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum27.class, string);
    }

    private static boolean lIIIlIIllIIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlIIllIIIlII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean R() {
        l var57;
        void var58;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIlIl(var58.getWorldLocation().equals((Object)var57.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIII[0];
        }
        List var59 = NPCs.getAll(arg_0 -> l.j((Player)var58, arg_0));
        var59.sort(Comparator.comparingInt(arg_0 -> l.i((Player)var58, arg_0)));
        NPC var60 = (NPC)var59.get(lllIIIlllIII[0]);
        if (l.lIIIlIIllIIIllI(var60)) {
            int var61 = Math.abs(var60.getWorldY() - var58.getWorldY());
            if (l.lIIIlIIllIIIlll(var60.getWorldX(), var57.P().get().getWorldX()) && l.lIIIlIIllIIlIII(var61, lllIIIlllIII[2])) {
                return lllIIIlllIII[0];
            }
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    private static boolean lIIIlIIllIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    private static  boolean h(Player player, NPC nPC) {
        int n2;
        if (l.lIIIlIIllIIIIll(b.z.contains(nPC.getId()) ? 1 : 0) && l.lIIIlIIllIIlIII(nPC.getWorldY(), player.getWorldY() + lllIIIlllIII[4]) && l.lIIIlIIllIIlIII(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIIlllIII[3]) && l.lIIIlIIllIIlIll(nPC.getWorldY(), player.getWorldY() - lllIIIlllIII[9]) && l.lIIIlIIllIIIlll(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIIlllIII[1];

            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static boolean lIIIlIIllIIlIlI(int n2) {
        return n2 > 0;
    }
}

