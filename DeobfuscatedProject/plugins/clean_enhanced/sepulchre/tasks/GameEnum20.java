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

import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.CHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum23;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
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

public final class GameEnum20
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

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static  int g(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static void var7() {
        var1 = new String[var2[13]];
        l.var1[l.var2[0]] = "Wizard Statue";
        l.var1[l.var2[1]] = "Wizard Statue";
        l.var1[l.var2[4]] = "Crossbowman Statue";
        l.var1[l.var2[3]] = "Crossbowman Statue";
        l.var1[l.var2[11]] = "SOUTH_III_I";
    }

    /*
     * WARNING - void declaration
     */
    private boolean T() {
        l var8;
        void var9;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.var10(player)) {
            return var2[0];
        }
        int var11 = var9.getWorldY();
        int var12 = var2[4];
        Iterator<Pair<Integer, Integer>> var13 = var8.waitPairs.iterator();
        while (l.var14(var13.hasNext() ? 1 : 0)) {
            void var15;
            Pair<Integer, Integer> var16 = var13.next();
            if (!l.var17(var11, (Integer)var16.getFirst() + var15)) continue;
            if (l.var4(var11, (Integer)var16.getSecond() + var15)) {
                0;
                if (-3 < 0) continue;
                return ((32 + 73 - 58 + 89 ^ 62 + 80 - 76 + 121) & (22 + 122 - 37 + 75 ^ 68 + 31 - 0 + 34 ^ -1)) != 0;
            }
            return var2[1];
        }
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    private int U() {
        l var18;
        void var19;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.var10(player)) {
            return var2[5];
        }
        int var20 = var19.getWorldY();
        int var21 = var2[4];
        Iterator<Pair<Integer, Integer>> var22 = var18.waitPairs.iterator();
        while (l.var14(var22.hasNext() ? 1 : 0)) {
            void var23;
            Pair<Integer, Integer> var24 = var22.next();
            if (!l.var17(var20, (Integer)var24.getFirst() + var23)) continue;
            if (l.var4(var20, (Integer)var24.getSecond() + var23)) {
                0;
                if (2 != 0) continue;
                return (0x15 ^ 0x66 ^ (0x7B ^ 0x38)) & (187 + 156 - 213 + 59 ^ 33 + 118 - 106 + 96 ^ -1);
            }
            if (l.var5(var20, (int)(var23 + (Integer)var24.getSecond()))) {
                return var2[1];
            }
            return var2[0];
        }
        return var2[5];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    static {
        l.var25();
        l.var7();
        SOUTH_III_I = new GameEnum20(List.of(new Triple((Object)new RegionPoint(var2[8], var2[4], var2[1], b.J), (Object)var2[1], (Object)var2[11]), new Triple((Object)new RegionPoint(var2[12], var2[4], var2[1], b.J), (Object)var2[1], (Object)var2[11])), new RegionPoint(var2[8], var2[13], var2[1], b.J), new RegionPoint(var2[14], var2[15], var2[4], b.J), List.of(new Pair((Object)var2[16], (Object)var2[1]), new Pair((Object)var2[10], (Object)var2[2])), new RegionPoint(var2[17], var2[18], var2[1], b.K), var2[3], var2[19], new RegionPoint(var2[17], var2[12], var2[4], b.J), m.NORTH_BACK);
        l[] lArray = new l[var2[1]];
        lArray[l.var2[0]] = SOUTH_III_I;
        $VALUES = lArray;
    }

    private static boolean var26(int n2, int n3) {
        return n2 == n3;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[0];
        while (l.var5(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if ((0x55 ^ 0x51) > 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private boolean d(d var37) {
        String[] stringArray = new String[var2[1]];
        stringArray[l.var2[0]] = var1[var2[0]];
        TileObject var38 = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[6], var2[7], var2[1], b.J)), (String[])stringArray);
        String[] stringArray2 = new String[var2[1]];
        stringArray2[l.var2[0]] = var1[var2[1]];
        TileObject var39 = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[8], var2[7], var2[1], b.J)), (String[])stringArray2);
        if (!l.var6(var38) || l.var10(var39)) {
            return var2[0];
        }
        J var40 = var37.b(var38);
        J var41 = var37.b(var39);
        int var42 = var40.aG();
        int var43 = var41.aG();
        if (l.var26(var42, b.o) && !l.var44(var40.aF(), var2[4]) || l.var26(var43, b.o) && l.var26(var41.aF(), var2[4])) {
            return var2[1];
        }
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var45 = this.startAreas.get().iterator();
        while (l.var14(var45.hasNext() ? 1 : 0)) {
            void var46;
            WorldArea var47 = var45.next();
            if (l.var14(var47.contains((Locatable)var46) ? 1 : 0)) {
                return var2[1];
            }
            0;
            if (3 > 0) continue;
            return ((0xA2 ^ 0xA8) & ~(0x67 ^ 0x6D)) != 0;
        }
        return var2[0];
    }

    private GameEnum20(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, List<Pair<Integer, Integer>> list, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, m m2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.type = m2;
    }

    private GameEnum20(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, List<Pair<Integer, Integer>> list2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, m m2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var48 = list.iterator();
            while (l.var14(var48.hasNext() ? 1 : 0)) {
                void var49;
                Triple var50 = (Triple)var48.next();
                var49.add(new WorldArea(SquireSepulchre.a((RegionPoint)var50.getFirst()), ((Integer)var50.getSecond()).intValue(), ((Integer)var50.getThird()).intValue()));
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

    private static  boolean j(Player player, NPC nPC) {
        boolean bl;
        if (l.var5(nPC.getWorldY(), player.getWorldY() + var2[4])) {
            bl = var2[1];
            0;
            if ((0x99 ^ 0x9D) < 0) {
                return ((0x6B ^ 0x6E) & ~(0xAE ^ 0xAB)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(d d2) {
        void var51;
        l var52;
        Player player = Players.getLocal();
        if (l.var10(player)) {
            return var2[0];
        }
        int var53 = var2[4];
        if (l.var14(var52.T() ? 1 : 0)) {
            void var54;
            if (l.var14(var52.d((d)var54) ? 1 : 0)) {
                var53 = var2[4];
                0;
                if (3 <= 1) {
                    return ((0x76 ^ 0x6B) & ~(0xAE ^ 0xB3)) != 0;
                }
            } else {
                var53 = var52.U();
            }
        }
        WorldPoint var55 = new WorldPoint(var52.startPoint.get().getWorldX() - var2[3], var51.getWorldY() + var53, var51.getPlane());
        List var56 = new WorldArea(var55, var2[3], var2[1]).toWorldPointList();
        List var57 = TileObjects.getAll(arg_0 -> l.e((Player)var51, arg_0));
        ArrayList<Integer> var58 = new ArrayList<Integer>();
        if (l.var59(var57.size())) {
            int var60 = var2[0];
            int var61 = var2[0];
            Iterator var62 = var57.iterator();
            while (l.var14(var62.hasNext() ? 1 : 0)) {
                TileObject var63 = (TileObject)var62.next();
                int var64 = c.a(var63);
                if (l.var26(var64, b.x)) {
                    ++var61;
                }
                if (l.var4(var64, b.y)) {
                    ++var60;
                    var58.add(var63.getWorldX());
                    0;
                    0;
                    if ((0x39 ^ 0x5F ^ (0x55 ^ 0x37)) != 0) continue;
                    return ((174 + 197 - 319 + 146 ^ 20 + 24 - -40 + 61) & (0x3C ^ 0x62 ^ (0xBA ^ 0xB3) ^ -1)) != 0;
                }
                ++var61;
                0;
                if null == null continue;
                return ((41 + 66 - 23 + 51 ^ 132 + 24 - 81 + 74) & (0x8C ^ 0xB5 ^ (0xA1 ^ 0x8A) ^ -1)) != 0;
            }
            var56.removeIf(worldPoint -> var58.contains(worldPoint.getWorldX()));
            0;
            if (l.var26(var56.size(), var2[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var56.get(var2[0])));
                return var2[1];
            }
            return var2[1];
        }
        List var60 = NPCs.getAll(arg_0 -> l.h((Player)var51, arg_0));
        var60.sort(Comparator.comparingInt(arg_0 -> l.g((Player)var51, arg_0)));
        var58.clear();
        Iterator var61 = var60.iterator();
        while (l.var14(var61.hasNext() ? 1 : 0)) {
            NPC var62 = (NPC)var61.next();
            if (l.var5(var58.size(), var2[4]) && l.var3(var58.contains(var62.getWorldX()) ? 1 : 0) && l.var5(var62.getWorldY(), var51.getWorldY() + var2[4])) {
                var58.add(var62.getWorldX());
                0;
            }
            0;
            if (-1 < 0) continue;
            return ((0x47 ^ 0x70 ^ (0x75 ^ 0x4D)) & (0 + 119 - 56 + 74 ^ 115 + 66 - 121 + 74 ^ -1)) != 0;
        }
        var58.stream().sorted();
        0;
        var56.removeIf(worldPoint -> var58.contains(worldPoint.getWorldX()));
        0;
        if (l.var14(var56.size())) {
            if (l.var26(var56.size(), var2[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var56.get(var2[0])));
                return var2[1];
            }
            Movement.setDestination((WorldPoint)((WorldPoint)var56.get(var2[0])));
            return var2[1];
        }
        return var2[0];
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static  boolean e(Player player, TileObject tileObject) {
        int n2;
        if (l.var5(Math.abs(player.getWorldY() - tileObject.getWorldY()), var2[10]) && l.var4(Math.abs(player.getWorldY() - tileObject.getWorldY()), var2[4]) && l.var26(player.getPlane(), tileObject.getPlane()) && l.var14(tileObject.getName().equals(var1[var2[4]]) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if null != null {
                return ((0x7F ^ 0x67 ^ (0xAA ^ 0xA1)) & (90 + 93 - 122 + 82 ^ 148 + 154 - 255 + 109 ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

        catch (Exception var70) {
            var70.printStackTrace();
            return null;
        }
    }

    private static  boolean f(Player player, TileObject tileObject) {
        int n2;
        if (l.var5(Math.abs(player.getWorldY() - tileObject.getWorldY()), var2[10]) && l.var5(Math.abs(player.getWorldX() - tileObject.getWorldX()), var2[11]) && l.var26(player.getPlane(), tileObject.getPlane()) && l.var14(tileObject.getName().equals(var1[var2[3]]) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if null != null {
                return ((0x5C ^ 7) & ~(0x38 ^ 0x63)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean S() {
        l var71;
        void var72;
        Player player = Players.getLocal();
        if (l.var10(player)) {
            return var2[0];
        }
        if (l.var3(var72.getWorldLocation().equals((Object)var71.startPoint.get()) ? 1 : 0)) {
            return var2[0];
        }
        WorldPoint var73 = new WorldPoint(var71.startPoint.get().getWorldX() - var2[3], var72.getWorldY() + var2[1], var72.getPlane());
        List var74 = new WorldArea(var73, var2[3], var2[1]).toWorldPointList();
        List var75 = TileObjects.getAll(arg_0 -> l.f((Player)var72, arg_0));
        ArrayList<Integer> var76 = new ArrayList<Integer>();
        if (l.var59(var75.size())) {
            int var77 = var2[0];
            int var78 = var2[0];
            Iterator var79 = var75.iterator();
            while (l.var14(var79.hasNext() ? 1 : 0)) {
                TileObject var80 = (TileObject)var79.next();
                int var81 = c.a(var80);
                if (l.var26(var81, b.x)) {
                    ++var78;
                }
                if (l.var4(var81, b.x)) {
                    ++var77;
                    var76.add(var80.getWorldX());
                    0;
                    0;
                    if (-1 <= 0) continue;
                    return ((11 + 158 - 94 + 149 ^ 158 + 103 - 118 + 44) & (39 + 205 - 169 + 168 ^ 31 + 50 - -73 + 14 ^ -1)) != 0;
                }
                ++var78;
                0;
                if ((0xC1 ^ 0xB5 ^ (0 ^ 0x71)) > 0) continue;
                return ((0xA9 ^ 0x97 ^ (0x1E ^ 0x76)) & (0x8F ^ 0x9E ^ (0x25 ^ 0x62) ^ -1)) != 0;
            }
            var74.removeIf(worldPoint -> var76.contains(worldPoint.getWorldX()));
            0;
            if (l.var26(var74.size(), var2[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)var74.get(var2[0])));
                return var2[1];
            }
            return var2[1];
        }
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var82;
        void var83;
        l var84;
        Player player = Players.getLocal();
        if (l.var10(player)) {
            return var2[0];
        }
        if (l.var14(var84.b((Locatable)var83) ? 1 : 0)) {
            var84.a((SquireSepulchre)var82);
            if (l.var85((Object)var84.type, (Object)m.NORTH_BACK) && l.var14(var84.S() ? 1 : 0)) {
                var84.b((SquireSepulchre)var82);
                return var2[1];
            }
            if (l.var14(var84.R() ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var84.startDestination.get());
                return var2[1];
            }
            Movement.setDestination((WorldPoint)var84.startPoint.get());
            return var2[1];
        }
        if (l.var14(var84.c((Locatable)var83) ? 1 : 0)) {
            var84.b((SquireSepulchre)var82);
            if (l.var85((Object)var84.type, (Object)m.NORTH_BACK)) {
                void var86;
                var84.c((d)var86);
                0;
                return var2[1];
            }
            return var2[0];
        }
        return var2[0];
    }

    private static  int i(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

    private static boolean var44(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var92) {
            var92.printStackTrace();
            return null;
        }
    }

    private static boolean var85(Object object, Object object2) {
        return object == object2;
    }

    private static void var25() {
        var2 = new int[21];
        l.var2[0] = (0x6B ^ 0x63 ^ (0x55 ^ 0x47)) & (71 + 56 - 122 + 175 ^ 124 + 77 - 64 + 37 ^ -1);
        l.var2[1] = 1;
        l.var2[2] = 0xE ^ 0x27 ^ (0x42 ^ 0x60);
        l.var2[3] = 3;
        l.var2[4] = 2;
        l.var2[5] = -1;
        l.var2[6] = 0x39 ^ 0x24;
        l.var2[7] = 0xC5 ^ 0xC2;
        l.var2[8] = 0xAF ^ 0x98 ^ (0x1A ^ 0xF);
        l.var2[9] = 0x15 ^ 1;
        l.var2[10] = 5 ^ 0xC ^ 3;
        l.var2[11] = 0x3D ^ 0x39;
        l.var2[12] = 154 + 151 - 243 + 119 ^ 75 + 146 - 219 + 169;
        l.var2[13] = 0xB1 ^ 0xA2 ^ (0xD7 ^ 0xC1);
        l.var2[14] = 0x3B ^ 1;
        l.var2[15] = 0x4F ^ 0x25 ^ (0x70 ^ 0x30);
        l.var2[16] = -(0xB5 ^ 0xB3);
        l.var2[17] = 0xBF ^ 0xC4 ^ (0xCE ^ 0xAA);
        l.var2[18] = 0xFE ^ 0xC1;
        l.var2[19] = 0xA9 ^ 0xBF;
        l.var2[20] = 0x48 ^ 0xE ^ (0xCC ^ 0x82);
    }

    /*
     * WARNING - void declaration
     */
    public boolean R() {
        l var93;
        void var94;
        Player player = Players.getLocal();
        if (l.var10(player)) {
            return var2[0];
        }
        if (l.var3(var94.getWorldLocation().equals((Object)var93.startPoint.get()) ? 1 : 0)) {
            return var2[0];
        }
        List var95 = NPCs.getAll(arg_0 -> l.j((Player)var94, arg_0));
        var95.sort(Comparator.comparingInt(arg_0 -> l.i((Player)var94, arg_0)));
        NPC var96 = (NPC)var95.get(var2[0]);
        if (l.var6(var96)) {
            int var97 = Math.abs(var96.getWorldY() - var94.getWorldY());
            if (l.var26(var96.getWorldX(), var93.P().get().getWorldX()) && l.var5(var97, var2[2])) {
                return var2[0];
            }
            return var2[1];
        }
        return var2[0];
    }

    private static boolean var17(int n2, int n3) {
        return n2 >= n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    private static  boolean h(Player player, NPC nPC) {
        int n2;
        if (l.var14(b.z.contains(nPC.getId()) ? 1 : 0) && l.var5(nPC.getWorldY(), player.getWorldY() + var2[4]) && l.var5(Math.abs(nPC.getWorldX() - player.getWorldX()), var2[3]) && l.var4(nPC.getWorldY(), player.getWorldY() - var2[9]) && l.var26(nPC.getPlane(), player.getPlane())) {
            n2 = var2[1];
            0;
            if null != null {
                return ((0xB0 ^ 0x84) & ~(0x44 ^ 0x70)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static boolean var59(int n2) {
        return n2 > 0;
    }
}

