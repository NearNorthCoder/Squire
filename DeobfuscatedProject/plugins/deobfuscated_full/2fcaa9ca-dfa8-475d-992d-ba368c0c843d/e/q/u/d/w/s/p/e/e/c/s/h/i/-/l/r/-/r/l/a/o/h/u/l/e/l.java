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
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.m;
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

public final class l
extends Enum<l> {
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    /* synthetic */ List<Pair<Integer, Integer>> waitPairs;
    public static final /* synthetic */ /* enum */ l SOUTH_III_I;
    private static final /* synthetic */ l[] $VALUES;
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    /* synthetic */ Supplier<WorldPoint> startDestination;
    private static /* synthetic */ String[] lllIIIllIlIl;
    /* synthetic */ m type;
    /* synthetic */ Supplier<WorldArea> dartArea;
    private static /* synthetic */ int[] lllIIIlllIII;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public /* synthetic */ Supplier<TileObject> object;

    private static boolean lIIIlIIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ int g(Player player, NPC nPC) {
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
        l.lllIIIllIlIl[l.lllIIIlllIII[0]] = l."Wizard Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[1]] = l."Wizard Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[4]] = l."Crossbowman Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[3]] = l."Crossbowman Statue";
        l.lllIIIllIlIl[l.lllIIIlllIII[11]] = l."SOUTH_III_I";
    }

    /*
     * WARNING - void declaration
     */
    private boolean T() {
        l var30;
        void var52;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        int var63 = var52.getWorldY();
        int lllllllllllllllIIllIllIlIIIlIIII = lllIIIlllIII[4];
        Iterator<Pair<Integer, Integer>> var19 = var30.waitPairs.iterator();
        while (l.lIIIlIIllIIIIll(var19.hasNext() ? 1 : 0)) {
            void var50;
            Pair<Integer, Integer> var64 = var19.next();
            if (!l.lIIIlIIllIIllIl(var63, (Integer)var64.getFirst() + var50)) continue;
            if (l.lIIIlIIllIIlIll(var63, (Integer)var64.getSecond() + var50)) {
                0;
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
        l var10;
        void var69;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[5];
        }
        int var5 = var69.getWorldY();
        int lllllllllllllllIIllIllIlIIIIIIII = lllIIIlllIII[4];
        Iterator<Pair<Integer, Integer>> var66 = var10.waitPairs.iterator();
        while (l.lIIIlIIllIIIIll(var66.hasNext() ? 1 : 0)) {
            void var60;
            Pair<Integer, Integer> var62 = var66.next();
            if (!l.lIIIlIIllIIllIl(var5, (Integer)var62.getFirst() + var60)) continue;
            if (l.lIIIlIIllIIlIll(var5, (Integer)var62.getSecond() + var60)) {
                0;
                if (2 != 0) continue;
                return (0x15 ^ 0x66 ^ (0x7B ^ 0x38)) & (187 + 156 - 213 + 59 ^ 33 + 118 - 106 + 96 ^ -1);
            }
            if (l.lIIIlIIllIIlIII(var5, (int)(var60 + (Integer)var62.getSecond()))) {
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
        SOUTH_III_I = new l(List.of(new Triple((Object)new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[4], lllIIIlllIII[1], b.J), (Object)lllIIIlllIII[1], (Object)lllIIIlllIII[11]), new Triple((Object)new RegionPoint(lllIIIlllIII[12], lllIIIlllIII[4], lllIIIlllIII[1], b.J), (Object)lllIIIlllIII[1], (Object)lllIIIlllIII[11])), new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[13], lllIIIlllIII[1], b.J), new RegionPoint(lllIIIlllIII[14], lllIIIlllIII[15], lllIIIlllIII[4], b.J), List.of(new Pair((Object)lllIIIlllIII[16], (Object)lllIIIlllIII[1]), new Pair((Object)lllIIIlllIII[10], (Object)lllIIIlllIII[2])), new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[18], lllIIIlllIII[1], b.K), lllIIIlllIII[3], lllIIIlllIII[19], new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[12], lllIIIlllIII[4], b.J), m.NORTH_BACK);
        l[] lArray = new l[lllIIIlllIII[1]];
        lArray[l.lllIIIlllIII[0]] = SOUTH_III_I;
        $VALUES = lArray;
    }

    private static boolean lIIIlIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIlIIlIlllIll(String var34, String var70) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var40 = var70.toCharArray();
        int var20 = lllIIIlllIII[0];
        char[] var21 = var34.toCharArray();
        int var53 = var21.length;
        int var35 = lllIIIlllIII[0];
        while (l.lIIIlIIllIIlIII(var35, var53)) {
            char var31 = var21[var35];
            var12.append((char)(var31 ^ var40[var20 % var40.length]));
            0;
            ++var20;
            ++var35;
            0;
            if ((0x55 ^ 0x51) > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private boolean d(d var18) {
        String[] stringArray = new String[lllIIIlllIII[1]];
        stringArray[l.lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[0]];
        TileObject var9 = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIII[6], lllIIIlllIII[7], lllIIIlllIII[1], b.J)), (String[])stringArray);
        String[] stringArray2 = new String[lllIIIlllIII[1]];
        stringArray2[l.lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[1]];
        TileObject var68 = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[7], lllIIIlllIII[1], b.J)), (String[])stringArray2);
        if (!l.lIIIlIIllIIIllI(var9) || l.lIIIlIIllIIIIlI(var68)) {
            return lllIIIlllIII[0];
        }
        J var6 = var18.b(var9);
        J var65 = var18.b(var68);
        int var45 = var6.aG();
        int var43 = var65.aG();
        if (l.lIIIlIIllIIIlll(var45, b.o) && !l.lIIIlIIllIIlllI(var6.aF(), lllIIIlllIII[4]) || l.lIIIlIIllIIIlll(var43, b.o) && l.lIIIlIIllIIIlll(var65.aF(), lllIIIlllIII[4])) {
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var39 = this.startAreas.get().iterator();
        while (l.lIIIlIIllIIIIll(var39.hasNext() ? 1 : 0)) {
            void var75;
            WorldArea var71 = var39.next();
            if (l.lIIIlIIllIIIIll(var71.contains((Locatable)var75) ? 1 : 0)) {
                return lllIIIlllIII[1];
            }
            0;
            if (3 > 0) continue;
            return false;
        }
        return lllIIIlllIII[0];
    }

    private l(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, List<Pair<Integer, Integer>> list, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, m m2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.type = m2;
    }

    private l(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, List<Pair<Integer, Integer>> list2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, m m2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var26 = list.iterator();
            while (l.lIIIlIIllIIIIll(var26.hasNext() ? 1 : 0)) {
                void var27;
                Triple var56 = (Triple)var26.next();
                var27.add(new WorldArea(SquireSepulchre.a((RegionPoint)var56.getFirst()), ((Integer)var56.getSecond()).intValue(), ((Integer)var56.getThird()).intValue()));
                0;
                0;
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

    private static /* synthetic */ boolean j(Player player, NPC nPC) {
        boolean bl;
        if (l.lIIIlIIllIIlIII(nPC.getWorldY(), player.getWorldY() + lllIIIlllIII[4])) {
            bl = lllIIIlllIII[1];
            0;
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
        void var15;
        l var59;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        int var51 = lllIIIlllIII[4];
        if (l.lIIIlIIllIIIIll(var59.T() ? 1 : 0)) {
            void var14;
            if (l.lIIIlIIllIIIIll(var59.d((d)var14) ? 1 : 0)) {
                var51 = lllIIIlllIII[4];
                0;
                if (3 <= 1) {
                    return false;
                }
            } else {
                var51 = var59.U();
            }
        }
        WorldPoint var73 = new WorldPoint(var59.startPoint.get().getWorldX() - lllIIIlllIII[3], var15.getWorldY() + var51, var15.getPlane());
        List var36 = new WorldArea(var73, lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List var17 = TileObjects.getAll(arg_0 -> l.e((Player)var15, arg_0));
        ArrayList<Integer> var77 = new ArrayList<Integer>();
        if (l.lIIIlIIllIIlIlI(var17.size())) {
            int var74 = lllIIIlllIII[0];
            int var49 = lllIIIlllIII[0];
            Iterator var42 = var17.iterator();
            while (l.lIIIlIIllIIIIll(var42.hasNext() ? 1 : 0)) {
                TileObject var16 = (TileObject)var42.next();
                int var67 = c.a(var16);
                if (l.lIIIlIIllIIIlll(var67, b.x)) {
                    ++var49;
                }
                if (l.lIIIlIIllIIlIll(var67, b.y)) {
                    ++var74;
                    var77.add(var16.getWorldX());
                    0;
                    0;
                    if ((0x39 ^ 0x5F ^ (0x55 ^ 0x37)) != 0) continue;
                    return ((174 + 197 - 319 + 146 ^ 20 + 24 - -40 + 61) & (0x3C ^ 0x62 ^ (0xBA ^ 0xB3) ^ -1)) != 0;
                }
                ++var49;
                0;
                
                return ((41 + 66 - 23 + 51 ^ 132 + 24 - 81 + 74) & (0x8C ^ 0xB5 ^ (0xA1 ^ 0x8A) ^ -1)) != 0;
            }
            var36.removeIf(worldPoint -> var77.contains(worldPoint.getWorldX()));
            0;
            if (l.lIIIlIIllIIIlll(var36.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var36.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[1];
        }
        List var74 = NPCs.getAll(arg_0 -> l.h((Player)var15, arg_0));
        var74.sort(Comparator.comparingInt(arg_0 -> l.g((Player)var15, arg_0)));
        var77.clear();
        Iterator var49 = var74.iterator();
        while (l.lIIIlIIllIIIIll(var49.hasNext() ? 1 : 0)) {
            NPC var42 = (NPC)var49.next();
            if (l.lIIIlIIllIIlIII(var77.size(), lllIIIlllIII[4]) && l.lIIIlIIllIIIlIl(var77.contains(var42.getWorldX()) ? 1 : 0) && l.lIIIlIIllIIlIII(var42.getWorldY(), var15.getWorldY() + lllIIIlllIII[4])) {
                var77.add(var42.getWorldX());
                0;
            }
            0;
            if (-1 < 0) continue;
            return ((0x47 ^ 0x70 ^ (0x75 ^ 0x4D)) & (0 + 119 - 56 + 74 ^ 115 + 66 - 121 + 74 ^ -1)) != 0;
        }
        var77.stream().sorted();
        0;
        var36.removeIf(worldPoint -> var77.contains(worldPoint.getWorldX()));
        0;
        if (l.lIIIlIIllIIIIll(var36.size())) {
            if (l.lIIIlIIllIIIlll(var36.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var36.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint)((WorldPoint)var36.get(lllIIIlllIII[0])));
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

    private static /* synthetic */ boolean e(Player player, TileObject tileObject) {
        int n2;
        if (l.lIIIlIIllIIlIII(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && l.lIIIlIIllIIlIll(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[4]) && l.lIIIlIIllIIIlll(player.getPlane(), tileObject.getPlane()) && l.lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[4]]) ? 1 : 0)) {
            n2 = lllIIIlllIII[1];
            0;
            
            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    private static String lIIIlIIlIllllIl(String var2, String var57) {
        try {
            SecretKeySpec var37 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var57.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var46 = Cipher.getInstance("Blowfish");
            var46.init(lllIIIlllIII[4], var37);
            return new String(var46.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean f(Player player, TileObject tileObject) {
        int n2;
        if (l.lIIIlIIllIIlIII(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && l.lIIIlIIllIIlIII(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIIlllIII[11]) && l.lIIIlIIllIIIlll(player.getPlane(), tileObject.getPlane()) && l.lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[3]]) ? 1 : 0)) {
            n2 = lllIIIlllIII[1];
            0;
            
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
        l var23;
        void var76;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIlIl(var76.getWorldLocation().equals((Object)var23.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIII[0];
        }
        WorldPoint var28 = new WorldPoint(var23.startPoint.get().getWorldX() - lllIIIlllIII[3], var76.getWorldY() + lllIIIlllIII[1], var76.getPlane());
        List var22 = new WorldArea(var28, lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List var33 = TileObjects.getAll(arg_0 -> l.f((Player)var76, arg_0));
        ArrayList<Integer> var38 = new ArrayList<Integer>();
        if (l.lIIIlIIllIIlIlI(var33.size())) {
            int var61 = lllIIIlllIII[0];
            int var58 = lllIIIlllIII[0];
            Iterator var55 = var33.iterator();
            while (l.lIIIlIIllIIIIll(var55.hasNext() ? 1 : 0)) {
                TileObject var29 = (TileObject)var55.next();
                int var24 = c.a(var29);
                if (l.lIIIlIIllIIIlll(var24, b.x)) {
                    ++var58;
                }
                if (l.lIIIlIIllIIlIll(var24, b.x)) {
                    ++var61;
                    var38.add(var29.getWorldX());
                    0;
                    0;
                    if (-1 <= 0) continue;
                    return false;
                }
                ++var58;
                0;
                if ((0xC1 ^ 0xB5 ^ (0 ^ 0x71)) > 0) continue;
                return ((0xA9 ^ 0x97 ^ (0x1E ^ 0x76)) & (0x8F ^ 0x9E ^ (0x25 ^ 0x62) ^ -1)) != 0;
            }
            var22.removeIf(worldPoint -> var38.contains(worldPoint.getWorldX()));
            0;
            if (l.lIIIlIIllIIIlll(var22.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var22.get(lllIIIlllIII[0])));
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
        void var11;
        void var8;
        l var47;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIIll(var47.b((Locatable)var8) ? 1 : 0)) {
            var47.a((SquireSepulchre)var11);
            if (l.lIIIlIIllIIIlII((Object)var47.type, (Object)m.NORTH_BACK) && l.lIIIlIIllIIIIll(var47.S() ? 1 : 0)) {
                var47.b((SquireSepulchre)var11);
                return lllIIIlllIII[1];
            }
            if (l.lIIIlIIllIIIIll(var47.R() ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var47.startDestination.get());
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint)var47.startPoint.get());
            return lllIIIlllIII[1];
        }
        if (l.lIIIlIIllIIIIll(var47.c((Locatable)var8) ? 1 : 0)) {
            var47.b((SquireSepulchre)var11);
            if (l.lIIIlIIllIIIlII((Object)var47.type, (Object)m.NORTH_BACK)) {
                void var3;
                var47.c((d)var3);
                0;
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[0];
    }

    private static /* synthetic */ int i(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static boolean lIIIlIIllIIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIIlIIlIllllII(String var7, String var4) {
        try {
            SecretKeySpec var44 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lllIIIlllIII[20]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(lllIIIlllIII[4], var44);
            return new String(var25.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIlIIllIIIIIl() {
        lllIIIlllIII = new int[21];
        l.lllIIIlllIII[0] = (0x6B ^ 0x63 ^ (0x55 ^ 0x47)) & (71 + 56 - 122 + 175 ^ 124 + 77 - 64 + 37 ^ -1);
        l.lllIIIlllIII[1] = 1;
        l.lllIIIlllIII[2] = 0xE ^ 0x27 ^ (0x42 ^ 0x60);
        l.lllIIIlllIII[3] = 3;
        l.lllIIIlllIII[4] = 2;
        l.lllIIIlllIII[5] = -1;
        l.lllIIIlllIII[6] = 0x39 ^ 0x24;
        l.lllIIIlllIII[7] = 0xC5 ^ 0xC2;
        l.lllIIIlllIII[8] = 0xAF ^ 0x98 ^ (0x1A ^ 0xF);
        l.lllIIIlllIII[9] = 0x15 ^ 1;
        l.lllIIIlllIII[10] = 5 ^ 0xC ^ 3;
        l.lllIIIlllIII[11] = 0x3D ^ 0x39;
        l.lllIIIlllIII[12] = 154 + 151 - 243 + 119 ^ 75 + 146 - 219 + 169;
        l.lllIIIlllIII[13] = 0xB1 ^ 0xA2 ^ (0xD7 ^ 0xC1);
        l.lllIIIlllIII[14] = 0x3B ^ 1;
        l.lllIIIlllIII[15] = 0x4F ^ 0x25 ^ (0x70 ^ 0x30);
        l.lllIIIlllIII[16] = -(0xB5 ^ 0xB3);
        l.lllIIIlllIII[17] = 0xBF ^ 0xC4 ^ (0xCE ^ 0xAA);
        l.lllIIIlllIII[18] = 0xFE ^ 0xC1;
        l.lllIIIlllIII[19] = 0xA9 ^ 0xBF;
        l.lllIIIlllIII[20] = 0x48 ^ 0xE ^ (0xCC ^ 0x82);
    }

    /*
     * WARNING - void declaration
     */
    public boolean R() {
        l var32;
        void var72;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIlIl(var72.getWorldLocation().equals((Object)var32.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIII[0];
        }
        List var48 = NPCs.getAll(arg_0 -> l.j((Player)var72, arg_0));
        var48.sort(Comparator.comparingInt(arg_0 -> l.i((Player)var72, arg_0)));
        NPC var54 = (NPC)var48.get(lllIIIlllIII[0]);
        if (l.lIIIlIIllIIIllI(var54)) {
            int var41 = Math.abs(var54.getWorldY() - var72.getWorldY());
            if (l.lIIIlIIllIIIlll(var54.getWorldX(), var32.P().get().getWorldX()) && l.lIIIlIIllIIlIII(var41, lllIIIlllIII[2])) {
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

    private static /* synthetic */ boolean h(Player player, NPC nPC) {
        int n2;
        if (l.lIIIlIIllIIIIll(b.z.contains(nPC.getId()) ? 1 : 0) && l.lIIIlIIllIIlIII(nPC.getWorldY(), player.getWorldY() + lllIIIlllIII[4]) && l.lIIIlIIllIIlIII(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIIlllIII[3]) && l.lIIIlIIllIIlIll(nPC.getWorldY(), player.getWorldY() - lllIIIlllIII[9]) && l.lIIIlIIllIIIlll(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIIlllIII[1];
            0;
            
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

