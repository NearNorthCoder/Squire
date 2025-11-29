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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class NHelper {
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
        n.lllllIIlIIIIlI();
        n.lllllIIlIIIIIl();
        ak = LoggerFactory.getLogger(NHelper.class);
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

    private static boolean lllllIIlIIlIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2) {
        void var1;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int var2 = -n2;
        while (n.lllllIIlIIIIll(var2, (int)var1)) {
            void var3 = -var1;
            while (n.lllllIIlIIIIll((int)var3, (int)var1)) {
                WorldPoint var4;
                void var5;
                var5.add(new WorldPoint(var4.dx(var2).getX(), var4.dy((int)var3).getY(), var4.getPlane()));

                ++var3;

                if (((0xF4 ^ 0xB8) & ~(0xEC ^ 0xA0)) < 2) continue;
                return null;
            }
            ++var2;

            if (2 > 1) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean lllllIIlIIllIl(Object object, Object object2) {
        return object == object2;
    }

    public static NPC b(b b2) {
        Iterator var6 = Static.getClient().getTopLevelWorldView().npcs().iterator();
        while (n.lllllIIlIIIlll(var6.hasNext() ? 1 : 0)) {
            b var7;
            NPC var8 = (NPC)var6.next();
            if (n.lllllIIlIIIlII(var8) && n.lllllIIlIIIlII(var8.getName()) && n.lllllIIlIIIlll(var7.d().toLowerCase().equals(var8.getName().toLowerCase()) ? 1 : 0)) {
                return var8;
            }

            if (-(0x56 ^ 0x52) <= 0) continue;
            return null;
        }
        return null;
    }

    @Inject
    public NHelper(SquireFightCavesConfig squireFightCavesConfig) {
        this.as = squireFightCavesConfig;
    }

    public static boolean F() {
        boolean bl;
        if (!n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)am) ? 1 : 0) || n.lllllIIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)an) ? 1 : 0)) {
            bl = llIIlIIlIIII[3];

            if (2 > 2) {
                return ((78 + 29 - -36 + 23 ^ 39 + 67 - -26 + 30) & (0x6C ^ 0x12 ^ (0x4E ^ 0x34) ^ -1)) != 0;
            }
        } else {
            bl = llIIlIIlIIII[1];
        }
        return bl;
    }

    private static boolean lllllIIlIIllII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static int lllllIIlIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public CompletableFuture<WorldPoint> C() {
        return CompletableFuture.supplyAsync(() -> {
            List list = Tiles.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)llIIlIIlIIII[7]);
            if (n.lllllIIlIIIlIl(list.isEmpty() ? 1 : 0)) {
                list = list.stream().sorted(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal().getWorldLocation()))).collect(Collectors.toList());
                NPC nPC2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (n.lllllIIlIIIlll(nPC.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[32]]) ? 1 : 0) && n.lllllIIlIIllIl(nPC.getInteracting(), Players.getLocal())) {
                        n2 = llIIlIIlIIII[3];

                        if (((0xF5 ^ 0x96) & ~(0x7D ^ 0x1E)) > 0) {
                            return false;
                        }
                    } else {
                        n2 = llIIlIIlIIII[1];
                    }
                    return n2 != 0;
                });
                if (n.lllllIIlIIIlII(nPC2)) {
                    void var9;
                    WorldPoint worldPoint = nPC2.getWorldLocation();
                    WorldPoint worldPoint3 = list.stream().map(Tile::getWorldLocation).filter(worldPoint2 -> {
                        int n2;
                        NPC var10;
                        int var11;
                        void var12;
                        void var13;
                        if (!n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)worldPoint2) ? 1 : 0) || !n.lllllIIlIIIlIl(worldPoint2.equals((Object)nPC2.getWorldLocation()) ? 1 : 0) || n.lllllIIlIIIlll(nPC2.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                            return llIIlIIlIIII[1];
                        }
                        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
                        worldPointArray[n.llIIlIIlIIII[1]] = var13;
                        TilePath var14 = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)var12);
                        int var15 = var14.size();
                        if (n.lllllIIlIIlIII(var15, (var11 = var12.distanceTo((WorldPoint)var13)) + llIIlIIlIIII[5]) && n.lllllIIlIIIlIl(var10.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), var12.toWorldArea()) ? 1 : 0)) {
                            n2 = llIIlIIlIIII[3];

                            }
                        } else {
                            n2 = llIIlIIlIIII[1];
                        }
                        return n2 != 0;
                    }).findFirst().orElse(null);
                    return var9;
                }
            }
            return null;
        });
    }

    public static boolean a(WorldPoint worldPoint) {
        if (n.lllllIIlIIIIll(worldPoint.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[3])) {
            return llIIlIIlIIII[3];
        }
        return llIIlIIlIIII[1];
    }

    private static boolean lllllIIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllllIIlIIIIIl() {
        llIIlIIIlllI = new String[llIIlIIlIIII[33]];
        n.llIIlIIIlllI[n.llIIlIIlIIII[1]] = "objs not null";
        n.llIIlIIIlllI[n.llIIlIIlIIII[3]] = "tArea: ";
        n.llIIlIIIlllI[n.llIIlIIlIIII[5]] = "End of calc2";
        n.llIIlIIIlllI[n.llIIlIIlIIII[0]] = "Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[8]] = "IN SAFE SPOT";
        n.llIIlIIIlllI[n.llIIlIIlIIII[9]] = "------------------------------";
        n.llIIlIIIlllI[n.llIIlIIlIIII[12]] = "Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[13]] = "Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[14]] = "Move to safespot";
        n.llIIlIIIlllI[n.llIIlIIlIIII[15]] = "Inside line 326 move safe spot method";
        n.llIIlIIIlllI[n.llIIlIIlIIII[16]] = "east tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[17]] = "south tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[19]] = "east tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[20]] = "south tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[21]] = "Can melee me";
        n.llIIlIIIlllI[n.llIIlIIlIIII[26]] = "blowpipe";
        n.llIIlIIIlllI[n.llIIlIIlIIII[29]] = "Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[30]] = "Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[32]] = "Guard";
    }

    public static boolean h(NPC nPC) {
        if (n.lllllIIlIIlIlI(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[9]) && n.lllllIIlIIIlIl(nPC.isMoving() ? 1 : 0)) {
            return llIIlIIlIIII[3];
        }
        return llIIlIIlIIII[1];
    }

    private static boolean lllllIIlIIllll(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int b(int n2, int n3) {
        void var16;
        int var17;
        int var18;
        int n4 = n3 - n2;
        if (n.lllllIIlIIIlIl(n4)) {
            return var18;
        }
        if (n.lllllIIlIIlllI(Math.abs(var17), llIIlIIlIIII[3])) {
            int n5;
            if (n.lllllIIlIIIlll(at.nextBoolean() ? 1 : 0)) {
                n5 = var18;

                if (1 < 1) {
                    return (0 ^ 0x17 ^ (0x57 ^ 0x4D)) & (0xD ^ 0x4D ^ (0xD9 ^ 0x94) ^ -1);
                }
            } else {
                n5 = var16;
            }
            return n5;
        }
        if (n.lllllIIlIIllll(var17)) {
            var17 = var18;
            var18 = var16;
            n3 = var17;
        }
        return n2 + at.nextInt(n3 - n2 + llIIlIIlIIII[3]);
    }

    /*
     * WARNING - void declaration
     */
    public static void D() {
        int[] nArray = new int[llIIlIIlIIII[0]];
        nArray[n.llIIlIIlIIII[1]] = llIIlIIlIIII[2];
        nArray[n.llIIlIIlIIII[3]] = llIIlIIlIIII[4];
        nArray[n.llIIlIIlIIII[5]] = llIIlIIlIIII[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        long l2 = System.currentTimeMillis();
        if (n.lllllIIlIIIlII(tileObject)) {
            System.out.println(llIIlIIIlllI[llIIlIIlIIII[1]]);
            NPC nPC2 = NPCs.getNearest(nPC -> {
                int n2;
                if (n.lllllIIlIIlllI(nPC.getId(), llIIlIIlIIII[31]) && n.lllllIIlIIllIl(nPC.getInteracting(), Players.getLocal())) {
                    n2 = llIIlIIlIIII[3];

                    if (3 <= 2) {
                        return ((0x47 ^ 0x36 ^ (0x7B ^ 0x47)) & (0xF2 ^ 0xB6 ^ (0x19 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIlIIII[1];
                }
                return n2 != 0;
            });
            if (n.lllllIIlIIIlII(nPC2) && n.lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                void var19;
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                System.out.println("npc distance to me: " + worldPoint2.distanceTo(Players.getLocal().getWorldLocation()));
                List<WorldPoint> list = n.a(tileObject.getWorldLocation(), llIIlIIlIIII[0]);
                System.out.println(llIIlIIIlllI[llIIlIIlIIII[3]]);
                list.forEach(worldPoint -> System.out.println(worldPoint.getWorldLocation()));
                System.out.println("OBJ LOC: " + String.valueOf(tileObject.getWorldLocation()));
                int var20 = llIIlIIlIIII[1];
                while (n.lllllIIlIIIllI(var20, var19.size())) {
                    void var21;
                    WorldPoint var22 = ((WorldPoint)var19.get(var20)).getWorldLocation();
                    if (n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)var22) ? 1 : 0) && n.lllllIIlIIIlIl(var21.equals((Object)var22) ? 1 : 0)) {
                        void var23;
                        if (n.lllllIIlIIIlll(var23.contains(var22) ? 1 : 0)) {

                            if (((0x7F ^ 0x4C) & ~(0x38 ^ 0xB)) != 0) {
                                return;
                            }
                        } else {
                            int var24;
                            WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
                            worldPointArray[n.llIIlIIlIIII[1]] = var21;
                            TilePath var25 = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)var22);
                            int var26 = var25.size();
                            if (n.lllllIIlIIlIII(var26, var24 = var22.distanceTo((WorldPoint)var21)) && n.lllllIIlIIIlIl(var23.canMelee(Static.getClient().getTopLevelWorldView(), var22.toWorldArea()) ? 1 : 0)) {
                                System.out.println("Found safe spot: " + String.valueOf(var22));
                                Movement.setDestination((WorldPoint)var22);

                                if (((0x18 ^ 0x22 ^ (0xAC ^ 0x99)) & (0x4A ^ 0x41 ^ (0xBE ^ 0xBA) ^ -1)) < 2) break;
                                return;
                            }
                        }
                    }
                    ++var20;

                    if (-1 < ((0x75 ^ 0x64 ^ (0xD3 ^ 0x95)) & (210 + 204 - 289 + 95 ^ 32 + 15 - 4 + 96 ^ -1))) continue;
                    return;
                }
            }
        }
        long l3 = System.currentTimeMillis();
        long l4 = l3 - l2;
        System.out.println("Execution time: " + l4 + " milliseconds");
        System.out.println(llIIlIIIlllI[llIIlIIlIIII[5]]);
    }

    private static boolean lllllIIlIIlllI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var27);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g(NPC nPC) {
        void var2_2;
        NPC var28;
        void var29;
        List list = nPC.getWorldArea().toWorldPointList();
        int var30 = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(var30, var29.size())) {
            if (n.lllllIIlIIIIll(((WorldPoint)var29.get(var30)).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[3])) {
                return llIIlIIlIIII[1];
            }
            ++var30;

            if (1 > -1) continue;
            return false;
        }
        var30 = var28.getWorldArea().canMelee(var28.getWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0;
        if (n.lllllIIlIIIlll(var30)) {
            System.out.println(llIIlIIIlllI[llIIlIIlIIII[21]]);
        }
        return (boolean)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean c(NPC nPC, int n2) {
        int n3 = llIIlIIlIIII[1];
        int n4 = llIIlIIlIIII[1];
        Player player = Static.getClient().getLocalPlayer();
        List list = Static.getClient().getNpcs();
        if (n.lllllIIlIIIlII(nPC) && n.lllllIIlIIIlII(player) && n.lllllIIlIIIlII(list)) {
            boolean bl;
            int var31;
            void var32;
            void var33;
            void var34;
            void var35;
            void var36;
            int var37;
            NPC var38;
            NPC var39;
            int n5 = Static.getClient().getPlane();
            int n6 = llIIlIIlIIII[22];
            int n7 = nPC.getLocalLocation().getX() / n6;
            int n8 = nPC.getLocalLocation().getY() / n6;
            int n9 = player.getLocalLocation().getX() / n6;
            int n10 = player.getLocalLocation().getY() / n6;
            WorldPoint worldPoint = nPC.getWorldLocation();
            WorldPoint worldPoint2 = player.getWorldLocation();
            Tile var40 = list.iterator();
            while (n.lllllIIlIIIlll(var40.hasNext() ? 1 : 0)) {
                void var41;
                WorldPoint var42;
                void var43;
                var39 = (NPC)var40.next();
                if (n.lllllIIlIIIlII(var39) && n.lllllIIlIIIlIl(n.lllllIIlIIlIll(n.c((WorldPoint)var43, var42 = var39.getWorldLocation()) + n.c((WorldPoint)var41, var42), n.c((WorldPoint)var43, (WorldPoint)var41))) && n.lllllIIlIIllII(var39, var38)) {
                    var37 = llIIlIIlIIII[3];
                }

                if (-(0x46 ^ 0x42) <= 0) continue;
                return false;
            }
            var40 = Static.getClient().getScene().getTiles()[var36][var35][var34];
            if (n.lllllIIlIIIlIl(var40.hasLineOfSightTo((Tile)(var39 = Static.getClient().getScene().getTiles()[var36][var33][var32])) ? 1 : 0)) {
                var31 = llIIlIIlIIII[3];
            }
            if (!n.lllllIIlIIllII(var38, n.b(b.RANGER)) || !n.lllllIIlIIllII(var38, n.b(b.MAGER)) || n.lllllIIlIIllIl(var38, n.b(b.JAD))) {
                return var31 != 0;
            }
            if (!n.lllllIIlIIIlIl(var37) || n.lllllIIlIIIlll(var31)) {
                bl = llIIlIIlIIII[3];

                if (1 == 0) {
                    return ((0x94 ^ 0x9C ^ (5 ^ 0x3C)) & (106 + 58 - 81 + 102 ^ 77 + 129 - 100 + 30 ^ -1)) != 0;
                }
            } else {
                bl = llIIlIIlIIII[1];
            }
            return bl;
        }
        return llIIlIIlIIII[1];
    }

    public static void G() {
        int[] nArray = new int[llIIlIIlIIII[3]];
        nArray[n.llIIlIIlIIII[1]] = llIIlIIlIIII[23];
        if (n.lllllIIlIIIlll(Equipment.contains((int[])nArray) ? 1 : 0) && n.lllllIIlIIIlIl(Combat.isSpecEnabled() ? 1 : 0) && n.lllllIIlIIlIlI(Combat.getSpecEnergy(), llIIlIIlIIII[24])) {
            Combat.toggleSpec();
        }
        if (n.lllllIIlIIIlll(Equipment.contains(item -> item.getName().contains(llIIlIIIlllI[llIIlIIlIIII[26]])) ? 1 : 0) && n.lllllIIlIIIlIl(Combat.isSpecEnabled() ? 1 : 0) && n.lllllIIlIIlIlI(Combat.getMissingHealth(), llIIlIIlIIII[16]) && n.lllllIIlIIlIlI(Combat.getSpecEnergy(), llIIlIIlIIII[25])) {
            Combat.toggleSpec();
        }
    }

    private static boolean lllllIIlIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static void E() {
        void var44;
        WorldPoint var45;
        WorldPoint var46;
        Object var47;
        long l2 = System.currentTimeMillis();
        List list = Tiles.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)llIIlIIlIIII[7]);
        if (n.lllllIIlIIIlIl(list.isEmpty() ? 1 : 0)) {
            list = list.stream().sorted(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal().getWorldLocation()))).collect(Collectors.toList());
            System.out.println(list.size());
            WorldPoint worldPoint = NPCs.getNearest(nPC -> {
                int n2;
                if (n.lllllIIlIIIlll(nPC.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[30]]) ? 1 : 0) && n.lllllIIlIIllIl(nPC.getInteracting(), Players.getLocal())) {
                    n2 = llIIlIIlIIII[3];

                    if (3 == -1) {
                        return false;
                    }
                } else {
                    n2 = llIIlIIlIIII[1];
                }
                return n2 != 0;
            }).getWorldLocation();
            WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
            worldPointArray[n.llIIlIIlIIII[1]] = worldPoint;
            System.out.println("NPC Path size to me: " + Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)Players.getLocal().getWorldLocation()).size());
            NPC nPC2 = NPCs.getNearest(nPC -> {
                int n2;
                if (n.lllllIIlIIIlll(nPC.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[29]]) ? 1 : 0) && n.lllllIIlIIllIl(nPC.getInteracting(), Players.getLocal())) {
                    n2 = llIIlIIlIIII[3];

                    if (3 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlIIlIIII[1];
                }
                return n2 != 0;
            });
            if (n.lllllIIlIIIlII(nPC2) && n.lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                var47 = list.iterator();
                while (n.lllllIIlIIIlll(var47.hasNext() ? 1 : 0)) {
                    int var48;
                    void var49;
                    void var50;
                    void var51;
                    var46 = (Tile)var47.next();
                    var45 = var46.getWorldLocation();
                    if (!n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)var45) ? 1 : 0) || !n.lllllIIlIIIlIl(var45.equals((Object)var51) ? 1 : 0)) continue;
                    if (n.lllllIIlIIIlll(var50.contains(var45) ? 1 : 0)) {

                        if (-(0x2F ^ 0x2B) <= 0) continue;
                        return;
                    }
                    WorldPoint[] worldPointArray2 = new WorldPoint[llIIlIIlIIII[3]];
                    worldPointArray2[n.llIIlIIlIIII[1]] = var49;
                    TilePath var52 = Movement.getPath(Arrays.asList(worldPointArray2), (WorldPoint)var45);
                    int var53 = var52.size();
                    if (n.lllllIIlIIlIII(var53, (var48 = var46.distanceTo((WorldPoint)var49)) + llIIlIIlIIII[5]) && n.lllllIIlIIIlIl(var50.canMelee(Static.getClient().getTopLevelWorldView(), var45.toWorldArea()) ? 1 : 0)) {
                        System.out.println("Found safe spot: " + String.valueOf(var45));
                        Movement.setDestination((WorldPoint)var45);

                        if (null == null) break;
                        return;
                    }

                    if (2 >= 2) continue;
                    return;
                }
            }
            String[] stringArray = new String[llIIlIIlIIII[3]];
            stringArray[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[0]];
            if (n.lllllIIlIIIlIl(NPCs.getNearest((String[])stringArray).getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation().toWorldArea()) ? 1 : 0)) {
                System.out.println(llIIlIIIlllI[llIIlIIlIIII[8]]);
            }
            System.out.println(llIIlIIIlllI[llIIlIIlIIII[9]]);
        }
        long var49 = System.currentTimeMillis();
        long var51 = var49 - var44;
        System.out.println("Execution time: " + var51 + " milliseconds");
        var47 = new WorldPoint(llIIlIIlIIII[10], llIIlIIlIIII[11], llIIlIIlIIII[1]);
        String[] stringArray = new String[llIIlIIlIIII[3]];
        stringArray[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[12]];
        var46 = NPCs.getNearest((String[])stringArray).getWorldLocation();
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
        worldPointArray[n.llIIlIIlIIII[1]] = var46;
        if (n.lllllIIlIIlIII(Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)Players.getLocal().getWorldLocation()).size(), llIIlIIlIIII[3])) {
            // empty if block
        }
        String[] stringArray2 = new String[llIIlIIlIIII[3]];
        stringArray2[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[13]];
        var45 = NPCs.getNearest((String[])stringArray2);
        if (n.lllllIIlIIIlll(var45.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
            // empty if block
        }
        if (!n.lllllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var47), llIIlIIlIIII[3]) || n.lllllIIlIIlIII(Movement.getPath((WorldPoint)var47).size(), llIIlIIlIIII[3])) {
            // empty if block
        }
    }

    public static void e(NPC var54) {
        try {
            if (!n.lllllIIlIIIlIl(n.c(var54.getWorldArea().toWorldPointList()) ? 1 : 0) || n.lllllIIlIIIlll(var54.isMoving() ? 1 : 0)) {
                int var55;
                List var56;
                SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[14]];
                WorldPoint var57 = an;
                WorldPoint var58 = an;
                WorldPoint var59 = am;
                int var60 = llIIlIIlIIII[1];
                NPC var61 = NPCs.getNearest(nPC -> {
                    boolean bl;
                    NPC var62;
                    if ((!n.lllllIIlIlIIII(nPC.getId(), llIIlIIlIIII[27]) || n.lllllIIlIIlllI(nPC.getId(), llIIlIIlIIII[28])) && n.lllllIIlIIIlIl(var62.isDead() ? 1 : 0)) {
                        bl = llIIlIIlIIII[3];

                        if (2 != 2) {
                            return false;
                        }
                    } else {
                        bl = llIIlIIlIIII[1];
                    }
                    return bl;
                });
                if (n.lllllIIlIIIlII(var61)) {
                    var56 = var61.getWorldArea().toWorldPointList();
                    var55 = llIIlIIlIIII[1];
                    while (n.lllllIIlIIIllI(var55, var56.size())) {
                        if (!n.lllllIIlIIlIII(((WorldPoint)var56.get(var55)).distanceTo(an), llIIlIIlIIII[12]) || n.lllllIIlIIIIll(((WorldPoint)var56.get(var55)).distanceTo(am), llIIlIIlIIII[12])) {
                            System.out.println(llIIlIIIlllI[llIIlIIlIIII[15]]);
                            List var63 = var54.getWorldArea().toWorldPointList();
                            int var64 = llIIlIIlIIII[1];
                            while (n.lllllIIlIIIllI(var64, var63.size())) {
                                if (n.lllllIIlIIIIll(((WorldPoint)var63.get(var64)).distanceTo(ap), llIIlIIlIIII[5])) {
                                    SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[16]];
                                    var57 = aq;
                                    if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var57) ? 1 : 0)) {
                                        Movement.setDestination((WorldPoint)var57);
                                        var60 = llIIlIIlIIII[3];

                                        if (-(0x30 ^ 0x22 ^ (0x9E ^ 0x88)) < 0) break;
                                        return;
                                    }
                                }
                                ++var64;

                                if (1 != 0) continue;
                                return;
                            }
                            if (n.lllllIIlIIIlll(var60)) {

                                if ((0xBC ^ 0x8E ^ (0x35 ^ 3)) == (87 + 37 - 46 + 65 ^ 1 + 132 - -2 + 4)) break;
                                return;
                            }
                            if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var57) ? 1 : 0)) {
                                var57 = ap;
                                SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[17]];
                                Movement.setDestination((WorldPoint)var57);

                                if (null == null) break;
                                return;
                            }
                        }
                        ++var55;

                        if (-1 != (0x31 ^ 0x35)) continue;
                        return;
                    }
                }
                if (n.lllllIIlIIIlll(var60)) {
                    return;
                }
                var56 = var54.getWorldArea().toWorldPointList();
                var55 = llIIlIIlIIII[1];
                while (n.lllllIIlIIIllI(var55, var56.size())) {
                    if (n.lllllIIlIIIIll(var54.getWorldLocation().getY(), al.getY() - llIIlIIlIIII[18])) {
                        var57 = am;
                        Movement.setDestination((WorldPoint)var57);
                        return;
                    }
                    if (n.lllllIIlIIIIll(((WorldPoint)var56.get(var55)).distanceTo(an), llIIlIIlIIII[5])) {
                        SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[19]];
                        var57 = am;
                        if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var57) ? 1 : 0)) {
                            Movement.setDestination((WorldPoint)var57);
                            return;
                        }
                    }
                    ++var55;

                    return;
                }
                if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var57) ? 1 : 0)) {
                    SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[20]];
                    Movement.setDestination((WorldPoint)var57);
                    return;
                }
            }

        }
        catch (Exception var57) {
            var57.printStackTrace();
            System.out.println(var57.getMessage());
            System.out.println(var57.getStackTrace());
        }
        if (1 <= 0) {
            return;
        }
    }

    private static boolean lllllIIlIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIIlIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    public static boolean f(NPC nPC) {
        if (n.lllllIIlIIlIIl(nPC)) {
            return llIIlIIlIIII[1];
        }
        return nPC.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea());
    }

    public static boolean c(List<WorldPoint> list) {
        List<WorldPoint> var65;
        int var66 = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(var66, var65.size())) {
            if (n.lllllIIlIIIIll(var65.get(var66).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[5])) {
                return llIIlIIlIIII[3];
            }
            ++var66;

            if (1 != ((1 ^ 0x4F) & ~(0xC1 ^ 0x8F))) continue;
            return false;
        }
        return llIIlIIlIIII[1];
    }

    private static boolean lllllIIlIlIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllllIIlIIIlll(int n2) {
        return n2 != 0;
    }
}

