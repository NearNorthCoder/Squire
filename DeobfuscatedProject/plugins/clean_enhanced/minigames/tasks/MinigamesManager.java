/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.TilePath
 *  net.unethicalite.api.scene.Tiles
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.GameEnum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.TilePath;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinigamesManager {
    private static final  Logger ak;
    public static  CompletableFuture<WorldPoint> ar;
    private final  SquireFightCavesConfig as;
    
    public static  WorldPoint aq;
    public static  WorldPoint am;
    public static final  ThreadLocalRandom at;
    public static  WorldPoint ap;
    public static  WorldPoint al;
    
    public static  WorldPoint ao;
    public static  WorldPoint an;

    static {
        n.var3();
        n.var4();
        ak = LoggerFactory.getLogger(MinigamesManager.class);
        al = null;
        am = null;
        an = null;
        ao = null;
        ap = null;
        aq = null;
        ar = null;
        at = ThreadLocalRandom.current();
    }

    static double c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return Math.sqrt((worldPoint2.getY() - worldPoint.getY()) * (worldPoint2.getY() - worldPoint.getY()) + (worldPoint2.getX() - worldPoint.getX()) * (worldPoint2.getX() - worldPoint.getX()));
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2) {
        void var5;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int var6 = -n2;
        while ((var6 <= (int)var5)) {
            void var7 = -var5;
            while (((int)var7 <= (int)var5)) {
                WorldPoint var8;
                void var9;
                var9.add(new WorldPoint(var8.dx(var6).getX(), var8.dy((int)var7).getY(), var8.getPlane()));
                0;
                ++var7;
                0;
                if (((0xF4 ^ 0xB8) & ~(0xEC ^ 0xA0)) < 2) continue;
                return null;
            }
            ++var6;
            0;
            if (2 > 1) continue;
            return null;
        }
        return arrayList;
    }

    public static NPC b(b b2) {
        Iterator var10 = Static.getClient().getTopLevelWorldView().npcs().iterator();
        while ((var10.hasNext( != 0) ? 1 : 0)) {
            b var11;
            NPC var12 = (NPC)var10.next();
            if (var12 != null && (var12.getName( != null)) && (var11.d( != 0).toLowerCase().equals(var12.getName().toLowerCase()) ? 1 : 0)) {
                return var12;
            }
            0;
            if (-(0x56 ^ 0x52) <= 0) continue;
            return null;
        }
        return null;
    }

    @Inject
    public MinigamesManager(SquireFightCavesConfig squireFightCavesConfig) {
        this.as = squireFightCavesConfig;
    }

    public static boolean F() {
        boolean bl;
        if (!(Players.getLocal( == 0).getWorldLocation().equals((Object)am) ? 1 : 0) || (Players.getLocal( != 0).getWorldLocation().equals((Object)an) ? 1 : 0)) {
            bl = 3;
            0;
            if (2 > 2) {
                return ((78 + 29 - -36 + 23 ^ 39 + 67 - -26 + 30) & (0x6C ^ 0x12 ^ (0x4E ^ 0x34) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private static int var13(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public CompletableFuture<WorldPoint> C() {
        return CompletableFuture.supplyAsync(() -> {
            List list = Tiles.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)7);
            if ((list.isEmpty( == 0) ? 1 : 0)) {
                list = list.stream().sorted(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal().getWorldLocation()))).collect(Collectors.toList());
                NPC nPC2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if ((nPC.getName( != 0).equalsIgnoreCase(var2[var1[32]]) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2))) {
                        n2 = 3;
                        0;
                        if (((0xF5 ^ 0x96) & ~(0x7D ^ 0x1E)) > 0) {
                            return ((0x1F ^ 0x57) & ~(0x6B ^ 0x23)) != 0;
                        }
                    } else {
                        n2 = 1;
                    }
                    return n2 != 0;
                });
                if nPC2 != null {
                    void var14;
                    WorldPoint worldPoint = nPC2.getWorldLocation();
                    WorldPoint worldPoint3 = list.stream().map(Tile::getWorldLocation).filter(worldPoint2 -> {
                        int n2;
                        NPC var15;
                        int var16;
                        void var17;
                        void var18;
                        if (!(Reachable.isWalkable(WorldPointworldPoint2) ? 1 : 0) || !(worldPoint2.equals((Object == 0)nPC2.getWorldLocation()) ? 1 : 0) || (nPC2.getWorldArea( != 0).contains(worldPoint2) ? 1 : 0)) {
                            return 1;
                        }
                        WorldPoint[] worldPointArray = new WorldPoint[3];
                        worldPointArray[1] = var18;
                        TilePath var19 = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)var17);
                        int var20 = var19.size();
                        if ((var20 > (var16 = var17.distanceTo((WorldPoint)var18)) + 5) && (var15.getWorldArea( == 0).canMelee(Static.getClient().getTopLevelWorldView(), var17.toWorldArea()) ? 1 : 0)) {
                            n2 = 3;
                            0;
                            if null != null {
                                return ((0x5F ^ 0xF) & ~(0x4D ^ 0x1D)) != 0;
                            }
                        } else {
                            n2 = 1;
                        }
                        return n2 != 0;
                    }).findFirst().orElse(null);
                    return var14;
                }
            }
            return null;
        });
    }

    public static boolean a(WorldPoint worldPoint) {
        if ((worldPoint.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 3)) {
            return 3;
        }
        return 1;
    }

    public static boolean h(NPC nPC) {
        if ((nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) >= 9) && (nPC.isMoving( == 0) ? 1 : 0)) {
            return 3;
        }
        return 1;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int b(int n2, int n3) {
        void var27;
        int var28;
        int var29;
        int n4 = n3 - n2;
        if (n4 == 0) {
            return var29;
        }
        if ((Math.abs(var28) == 3)) {
            int n5;
            if ((at.nextBoolean( != 0) ? 1 : 0)) {
                n5 = var29;
                0;
                if (1 < 1) {
                    return (0 ^ 0x17 ^ (0x57 ^ 0x4D)) & (0xD ^ 0x4D ^ (0xD9 ^ 0x94) ^ -1);
                }
            } else {
                n5 = var27;
            }
            return n5;
        }
        if (var28 < 0) {
            var28 = var29;
            var29 = var27;
            n3 = var28;
        }
        return n2 + at.nextInt(n3 - n2 + 3);
    }

    /*
     * WARNING - void declaration
     */
    public static void D() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        nArray[3] = 4;
        nArray[5] = 6;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        long l2 = System.currentTimeMillis();
        if tileObject != null {
            System.out.println(var2[1]);
            NPC nPC2 = NPCs.getNearest(nPC -> {
                int n2;
                if ((nPC.getId() == var1[31]) && (nPC.getInteracting() == nPC.getInteracting()2))) {
                    n2 = 3;
                    0;
                    if (3 <= 2) {
                        return ((0x47 ^ 0x36 ^ (0x7B ^ 0x47)) & (0xF2 ^ 0xB6 ^ (0x19 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if (nPC2 != null && (Players.getLocal( == 0).isMoving() ? 1 : 0)) {
                void var30;
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                System.out.println("npc distance to me: " + worldPoint2.distanceTo(Players.getLocal().getWorldLocation()));
                List<WorldPoint> list = n.a(tileObject.getWorldLocation(), 0);
                System.out.println(var2[3]);
                list.forEach(worldPoint -> System.out.println(worldPoint.getWorldLocation()));
                System.out.println("OBJ LOC: " + String.valueOf(tileObject.getWorldLocation()));
                int var31 = 1;
                while ((var31 < var30.size())) {
                    void var32;
                    WorldPoint var33 = ((WorldPoint)var30.get(var31)).getWorldLocation();
                    if ((Reachable.isWalkable(WorldPointlllllllllllllllIlIIllllIIlIIIIlI) ? 1 : 0) && (var32.equals((Object == 0)var33) ? 1 : 0)) {
                        void var34;
                        if ((var34.containslllllllllllllllIlIIllllIIlIIIIlI)) {
                            0;
                            if (((0x7F ^ 0x4C) & ~(0x38 ^ 0xB)) != 0) {
                                return;
                            }
                        } else {
                            int var35;
                            WorldPoint[] worldPointArray = new WorldPoint[3];
                            worldPointArray[1] = var32;
                            TilePath var36 = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)var33);
                            int var37 = var36.size();
                            if ((var37 > var35 = var33.distanceTo((WorldPoint)var32)) && (var34.canMelee(Static.getClient( == 0).getTopLevelWorldView(), var33.toWorldArea()) ? 1 : 0)) {
                                System.out.println("Found safe spot: " + String.valueOf(var33));
                                Movement.setDestination((WorldPoint)var33);
                                0;
                                if (((0x18 ^ 0x22 ^ (0xAC ^ 0x99)) & (0x4A ^ 0x41 ^ (0xBE ^ 0xBA) ^ -1)) < 2) break;
                                return;
                            }
                        }
                    }
                    ++var31;
                    0;
                    if (-1 < ((0x75 ^ 0x64 ^ (0xD3 ^ 0x95)) & (210 + 204 - 289 + 95 ^ 32 + 15 - 4 + 96 ^ -1))) continue;
                    return;
                }
            }
        }
        long l3 = System.currentTimeMillis();
        long l4 = l3 - l2;
        System.out.println("Execution time: " + l4 + " milliseconds");
        System.out.println(var2[5]);
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    private static String var44(String var45, String var46) {
        var45 = new String(Base64.getDecoder().decode(var45.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var47 = new StringBuilder();
        char[] var48 = var46.toCharArray();
        int var49 = 1;
        char[] var50 = var45.toCharArray();
        int var51 = var50.length;
        int var52 = 1;
        while (var52 < var51) {
            char var53 = var50[var52];
            var47.append((char)(var53 ^ var48[var49 % var48.length]));
            0;
            ++var49;
            ++var52;
            0;
            if (((0x64 ^ 0x52) & ~(0x51 ^ 0x67)) <= 0) continue;
            return null;
        }
        return String.valueOf(var47);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g(NPC nPC) {
        void var2_2;
        NPC var54;
        void var55;
        List list = nPC.getWorldArea().toWorldPointList();
        int var56 = 1;
        while ((var56 < var55.size())) {
            if ((((WorldPoint)var55.get(var56)).distanceTo(Players.getLocal().getWorldLocation()) <= 3)) {
                return 1;
            }
            ++var56;
            0;
            if (1 > -1) continue;
            return ((0x69 ^ 0x6C) & ~(0xAD ^ 0xA8)) != 0;
        }
        var56 = var54.getWorldArea().canMelee(var54.getWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0;
        if var56 {
            System.out.println(var2[var1[21]]);
        }
        return (boolean)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean c(NPC nPC, int n2) {
        int n3 = 1;
        int n4 = 1;
        Player player = Static.getClient().getLocalPlayer();
        List list = Static.getClient().getNpcs();
        if (nPC != null && player != null && list != null) {
            boolean bl;
            int var57;
            void var58;
            void var59;
            void var60;
            void var61;
            void var62;
            int var63;
            NPC var64;
            NPC var65;
            int n5 = Static.getClient().getPlane();
            int n6 = var1[22];
            int n7 = nPC.getLocalLocation().getX() / n6;
            int n8 = nPC.getLocalLocation().getY() / n6;
            int n9 = player.getLocalLocation().getX() / n6;
            int n10 = player.getLocalLocation().getY() / n6;
            WorldPoint worldPoint = nPC.getWorldLocation();
            WorldPoint worldPoint2 = player.getWorldLocation();
            Tile var66 = list.iterator();
            while ((var66.hasNext( != 0) ? 1 : 0)) {
                void var67;
                WorldPoint var68;
                void var69;
                var65 = (NPC)var66.next();
                if (var65 != null && (n.var13(n.c((WorldPoint == 0)var69, var68 = var65.getWorldLocation()) + n.c((WorldPoint)var67, var68), n.c((WorldPoint)var69, (WorldPoint)var67))) && (var65 != lllllllllllllllIlIIlllIlllIllllI2)) {
                    var63 = 3;
                }
                0;
                if (-(0x46 ^ 0x42) <= 0) continue;
                return ((0x7F ^ 0x2F) & ~(0x50 ^ 0)) != 0;
            }
            var66 = Static.getClient().getScene().getTiles()[var62][var61][var60];
            if ((var66.hasLineOfSightTo((Tile == 0)(var65 = Static.getClient().getScene().getTiles()[var62][var59][var58])) ? 1 : 0)) {
                var57 = 3;
            }
            if (!(var64 != lllllllllllllllIlIIlllIllllIllII2)) || !(var64 != lllllllllllllllIlIIlllIllllIllII2)) || (var64 == lllllllllllllllIlIIlllIllllIllII2))) {
                return var57 != 0;
            }
            if (!(var63 == 0) || var57) {
                bl = 3;
                0;
                
            } else {
                bl = 1;
            }
            return bl;
        }
        return 1;
    }

    public static void G() {
        int[] nArray = new int[3];
        nArray[1] = var1[23];
        if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0) && (Combat.isSpecEnabled( == 0) ? 1 : 0) && (Combat.getSpecEnergy() >= var1[24])) {
            Combat.toggleSpec();
        }
        if ((Equipment.contains(item -> item.getName( != 0).contains(var2[var1[26]])) ? 1 : 0) && (Combat.isSpecEnabled( == 0) ? 1 : 0) && (Combat.getMissingHealth() >= var1[16]) && (Combat.getSpecEnergy() >= var1[25])) {
            Combat.toggleSpec();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void E() {
        void var70;
        WorldPoint var71;
        WorldPoint var72;
        Object var73;
        long l2 = System.currentTimeMillis();
        List list = Tiles.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)7);
        if ((list.isEmpty( == 0) ? 1 : 0)) {
            list = list.stream().sorted(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal().getWorldLocation()))).collect(Collectors.toList());
            System.out.println(list.size());
            WorldPoint worldPoint = NPCs.getNearest(nPC -> {
                int n2;
                if ((nPC.getName( != 0).equalsIgnoreCase(var2[var1[30]]) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2))) {
                    n2 = 3;
                    0;
                    if (3 == -1) {
                        return ((108 + 110 - 206 + 215 ^ 57 + 112 - 134 + 139) & (168 + 206 - 239 + 106 ^ 130 + 165 - 125 + 18 ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).getWorldLocation();
            WorldPoint[] worldPointArray = new WorldPoint[3];
            worldPointArray[1] = worldPoint;
            System.out.println("NPC Path size to me: " + Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)Players.getLocal().getWorldLocation()).size());
            NPC nPC2 = NPCs.getNearest(nPC -> {
                int n2;
                if ((nPC.getName( != 0).equalsIgnoreCase(var2[var1[29]]) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2))) {
                    n2 = 3;
                    0;
                    if (3 <= 0) {
                        return ((0xC3 ^ 0x92) & ~(0x7C ^ 0x2D)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if (nPC2 != null && (Players.getLocal( == 0).isMoving() ? 1 : 0)) {
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                var73 = list.iterator();
                while ((var73.hasNext( != 0) ? 1 : 0)) {
                    int var74;
                    void var75;
                    void var76;
                    void var77;
                    var72 = (Tile)var73.next();
                    var71 = var72.getWorldLocation();
                    if (!(Reachable.isWalkable(WorldPointlllllllllllllllIlIIllllIIIlIlIlI) ? 1 : 0) || !(var71.equals((Object == 0)var77) ? 1 : 0)) continue;
                    if ((var76.containslllllllllllllllIlIIllllIIIlIlIlI)) {
                        0;
                        if (-(0x2F ^ 0x2B) <= 0) continue;
                        return;
                    }
                    WorldPoint[] worldPointArray2 = new WorldPoint[3];
                    worldPointArray2[1] = var75;
                    TilePath var78 = Movement.getPath(Arrays.asList(worldPointArray2), (WorldPoint)var71);
                    int var79 = var78.size();
                    if ((var79 > (var74 = var72.distanceTo((WorldPoint)var75)) + 5) && (var76.canMelee(Static.getClient( == 0).getTopLevelWorldView(), var71.toWorldArea()) ? 1 : 0)) {
                        System.out.println("Found safe spot: " + String.valueOf(var71));
                        Movement.setDestination((WorldPoint)var71);
                        0;
                        if null == null break;
                        return;
                    }
                    0;
                    
                    return;
                }
            }
            String[] stringArray = new String[3];
            stringArray[1] = var2[0];
            if ((NPCs.getNearest((String[] == 0)stringArray).getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation().toWorldArea()) ? 1 : 0)) {
                System.out.println(var2[8]);
            }
            System.out.println(var2[9]);
        }
        long var75 = System.currentTimeMillis();
        long var77 = var75 - var70;
        System.out.println("Execution time: " + var77 + " milliseconds");
        var73 = new WorldPoint(var1[10], var1[11], 1);
        String[] stringArray = new String[3];
        stringArray[1] = var2[var1[12]];
        var72 = NPCs.getNearest((String[])stringArray).getWorldLocation();
        WorldPoint[] worldPointArray = new WorldPoint[3];
        worldPointArray[1] = var72;
        if ((Movement.getPath(Arrays.asList(worldPointArray) > (WorldPoint)Players.getLocal().getWorldLocation()).size(), 3)) {
            // empty if block
        }
        String[] stringArray2 = new String[3];
        stringArray2[1] = var2[var1[13]];
        var71 = NPCs.getNearest((String[])stringArray2);
        if ((var71.getWorldArea( != 0).canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
            // empty if block
        }
        if (!(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var73) <= 3) || (Movement.getPath((WorldPoint)var73).size() > 3)) {
            // empty if block
        }
    }

    public static void e(NPC var80) {
        try {
            if (!(n.c(var80.getWorldArea( == 0).toWorldPointList()) ? 1 : 0) || (var80.isMoving( != 0) ? 1 : 0)) {
                int var81;
                List var82;
                SquireFightCavesPlugin.h = var2[var1[14]];
                WorldPoint var83 = an;
                WorldPoint var84 = an;
                WorldPoint var85 = am;
                int var86 = 1;
                NPC var87 = NPCs.getNearest(nPC -> {
                    boolean bl;
                    NPC var88;
                    if ((!(nPC.getId() != var1[27]) || (nPC.getId() == var1[28])) && (var88.isDead( == 0) ? 1 : 0)) {
                        bl = 3;
                        0;
                        if (2 != 2) {
                            return ((0x60 ^ 0x71) & ~(0x4D ^ 0x5C)) != 0;
                        }
                    } else {
                        bl = 1;
                    }
                    return bl;
                });
                if var87 != null {
                    var82 = var87.getWorldArea().toWorldPointList();
                    var81 = 1;
                    while ((var81 < var82.size())) {
                        if (!(((WorldPoint)var82.get(var81)).distanceTo(an) > var1[12]) || (((WorldPoint)var82.get(var81)).distanceTo(am) <= var1[12])) {
                            System.out.println(var2[var1[15]]);
                            List var89 = var80.getWorldArea().toWorldPointList();
                            int var90 = 1;
                            while ((var90 < var89.size())) {
                                if ((((WorldPoint)var89.get(var90)).distanceTo(ap) <= 5)) {
                                    SquireFightCavesPlugin.h = var2[var1[16]];
                                    var83 = aq;
                                    if ((Players.getLocal( == 0).getWorldLocation().equals((Object)var83) ? 1 : 0)) {
                                        Movement.setDestination((WorldPoint)var83);
                                        var86 = 3;
                                        0;
                                        if (-(0x30 ^ 0x22 ^ (0x9E ^ 0x88)) < 0) break;
                                        return;
                                    }
                                }
                                ++var90;
                                0;
                                if (1 != 0) continue;
                                return;
                            }
                            if var86 {
                                0;
                                if ((0xBC ^ 0x8E ^ (0x35 ^ 3)) == (87 + 37 - 46 + 65 ^ 1 + 132 - -2 + 4)) break;
                                return;
                            }
                            if ((Players.getLocal( == 0).getWorldLocation().equals((Object)var83) ? 1 : 0)) {
                                var83 = ap;
                                SquireFightCavesPlugin.h = var2[var1[17]];
                                Movement.setDestination((WorldPoint)var83);
                                0;
                                if null == null break;
                                return;
                            }
                        }
                        ++var81;
                        0;
                        if (-1 != (0x31 ^ 0x35)) continue;
                        return;
                    }
                }
                if var86 {
                    return;
                }
                var82 = var80.getWorldArea().toWorldPointList();
                var81 = 1;
                while ((var81 < var82.size())) {
                    if ((var80.getWorldLocation().getY() <= al.getY() - var1[18])) {
                        var83 = am;
                        Movement.setDestination((WorldPoint)var83);
                        return;
                    }
                    if ((((WorldPoint)var82.get(var81)).distanceTo(an) <= 5)) {
                        SquireFightCavesPlugin.h = var2[var1[19]];
                        var83 = am;
                        if ((Players.getLocal( == 0).getWorldLocation().equals((Object)var83) ? 1 : 0)) {
                            Movement.setDestination((WorldPoint)var83);
                            return;
                        }
                    }
                    ++var81;
                    0;
                    if null == null continue;
                    return;
                }
                if ((Players.getLocal( == 0).getWorldLocation().equals((Object)var83) ? 1 : 0)) {
                    SquireFightCavesPlugin.h = var2[var1[20]];
                    Movement.setDestination((WorldPoint)var83);
                    return;
                }
            }
            0;
        }
        catch (Exception var83) {
            var83.printStackTrace();
            System.out.println(var83.getMessage());
            System.out.println(var83.getStackTrace());
        }
        if (1 <= 0) {
            return;
        }
    }

    public static boolean f(NPC nPC) {
        if nPC == null {
            return 1;
        }
        return nPC.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea());
    }

    public static boolean c(List<WorldPoint> list) {
        List<WorldPoint> var91;
        int var92 = 1;
        while ((var92 < var91.size())) {
            if ((var91.get(var92).distanceTo(Players.getLocal().getWorldLocation()) <= 5)) {
                return 3;
            }
            ++var92;
            0;
            if (1 != ((1 ^ 0x4F) & ~(0xC1 ^ 0x8F))) continue;
            return ((0xD8 ^ 0x8B) & ~(0xC8 ^ 0x9B)) != 0;
        }
        return 1;
    }

}

