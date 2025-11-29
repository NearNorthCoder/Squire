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
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.BEnum;
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

public class n_Unknown {
    private static final /* synthetic */ Logger ak;
    public static /* synthetic */ CompletableFuture<WorldPoint> ar;
    private final /* synthetic */ SquireFightCavesConfig as;
    private static /* synthetic */ int[] llIIlIIlIIII;
    public static /* synthetic */ WorldPoint aq;
    public static /* synthetic */ WorldPoint am;
    public static final /* synthetic */ ThreadLocalRandom at;
    public static /* synthetic */ WorldPoint ap;
    public static /* synthetic */ WorldPoint al;
    private static /* synthetic */ String[] llIIlIIIlllI;
    public static /* synthetic */ WorldPoint ao;
    public static /* synthetic */ WorldPoint an;

    static {
        n.lllllIIlIIIIlI();
        n.lllllIIlIIIIIl();
        ak = LoggerFactory.getLogger(n.class);
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
        void var81;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int var43 = -n2;
        while (n.lllllIIlIIIIll(var43, (int)var81)) {
            void var18 = -var81;
            while (n.lllllIIlIIIIll((int)var18, (int)var81)) {
                WorldPoint var5;
                void var23;
                var23.add(new WorldPoint(var5.dx(var43).getX(), var5.dy((int)var18).getY(), var5.getPlane()));
                0;
                ++var18;
                0;
                if (((0xF4 ^ 0xB8) & ~(0xEC ^ 0xA0)) < 2) continue;
                return null;
            }
            ++var43;
            0;
            if (2 > 1) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean lllllIIlIIllIl(Object object, Object object2) {
        return object == object2;
    }

    public static NPC b(b b2) {
        Iterator var50 = Static.getClient().getTopLevelWorldView().npcs().iterator();
        while (n.lllllIIlIIIlll(var50.hasNext() ? 1 : 0)) {
            b var68;
            NPC var39 = (NPC)var50.next();
            if (n.lllllIIlIIIlII(var39) && n.lllllIIlIIIlII(var39.getName()) && n.lllllIIlIIIlll(var68.d().toLowerCase().equals(var39.getName().toLowerCase()) ? 1 : 0)) {
                return var39;
            }
            0;
            if (-(0x56 ^ 0x52) <= 0) continue;
            return null;
        }
        return null;
    }

    @Inject
    public n(SquireFightCavesConfig squireFightCavesConfig) {
        this.as = squireFightCavesConfig;
    }

    public static boolean F() {
        boolean bl;
        if (!n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)am) ? 1 : 0) || n.lllllIIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)an) ? 1 : 0)) {
            bl = llIIlIIlIIII[3];
            0;
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
                        0;
                        if (((0xF5 ^ 0x96) & ~(0x7D ^ 0x1E)) > 0) {
                            return false;
                        }
                    } else {
                        n2 = llIIlIIlIIII[1];
                    }
                    return n2 != 0;
                });
                if (n.lllllIIlIIIlII(nPC2)) {
                    void var78;
                    WorldPoint worldPoint = nPC2.getWorldLocation();
                    WorldPoint worldPoint3 = list.stream().map(Tile::getWorldLocation).filter(worldPoint2 -> {
                        int n2;
                        NPC var64;
                        int var20;
                        void var55;
                        void var2;
                        if (!n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)worldPoint2) ? 1 : 0) || !n.lllllIIlIIIlIl(worldPoint2.equals((Object)nPC2.getWorldLocation()) ? 1 : 0) || n.lllllIIlIIIlll(nPC2.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                            return llIIlIIlIIII[1];
                        }
                        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
                        worldPointArray[n.llIIlIIlIIII[1]] = var2;
                        TilePath var42 = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)var55);
                        int var57 = var42.size();
                        if (n.lllllIIlIIlIII(var57, (var20 = var55.distanceTo((WorldPoint)var2)) + llIIlIIlIIII[5]) && n.lllllIIlIIIlIl(var64.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), var55.toWorldArea()) ? 1 : 0)) {
                            n2 = llIIlIIlIIII[3];
                            0;
                            
                            }
                        } else {
                            n2 = llIIlIIlIIII[1];
                        }
                        return n2 != 0;
                    }).findFirst().orElse(null);
                    return var78;
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
        n.llIIlIIIlllI[n.llIIlIIlIIII[1]] = n."objs not null";
        n.llIIlIIIlllI[n.llIIlIIlIIII[3]] = n."tArea: ";
        n.llIIlIIIlllI[n.llIIlIIlIIII[5]] = n."End of calc2";
        n.llIIlIIIlllI[n.llIIlIIlIIII[0]] = n."Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[8]] = n."IN SAFE SPOT";
        n.llIIlIIIlllI[n.llIIlIIlIIII[9]] = n."------------------------------";
        n.llIIlIIIlllI[n.llIIlIIlIIII[12]] = n."Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[13]] = n."Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[14]] = n."Move to safespot";
        n.llIIlIIIlllI[n.llIIlIIlIIII[15]] = n."Inside line 326 move safe spot method";
        n.llIIlIIIlllI[n.llIIlIIlIIII[16]] = n."east tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[17]] = n."south tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[19]] = n."east tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[20]] = n."south tile";
        n.llIIlIIIlllI[n.llIIlIIlIIII[21]] = n."Can melee me";
        n.llIIlIIIlllI[n.llIIlIIlIIII[26]] = n."blowpipe";
        n.llIIlIIIlllI[n.llIIlIIlIIII[29]] = n."Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[30]] = n."Guard";
        n.llIIlIIIlllI[n.llIIlIIlIIII[32]] = n."Guard";
    }

    public static boolean h(NPC nPC) {
        if (n.lllllIIlIIlIlI(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[9]) && n.lllllIIlIIIlIl(nPC.isMoving() ? 1 : 0)) {
            return llIIlIIlIIII[3];
        }
        return llIIlIIlIIII[1];
    }

    private static String lllllIIIlllIll(String var45, String var80) {
        try {
            SecretKeySpec var82 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var80.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIlIIlIIII[5], var82);
            return new String(var4.doFinal(Base64.getDecoder().decode(var45.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIlIIllll(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int b(int n2, int n3) {
        void var47;
        int var13;
        int var25;
        int n4 = n3 - n2;
        if (n.lllllIIlIIIlIl(n4)) {
            return var25;
        }
        if (n.lllllIIlIIlllI(Math.abs(var13), llIIlIIlIIII[3])) {
            int n5;
            if (n.lllllIIlIIIlll(at.nextBoolean() ? 1 : 0)) {
                n5 = var25;
                0;
                if (1 < 1) {
                    return (0 ^ 0x17 ^ (0x57 ^ 0x4D)) & (0xD ^ 0x4D ^ (0xD9 ^ 0x94) ^ -1);
                }
            } else {
                n5 = var47;
            }
            return n5;
        }
        if (n.lllllIIlIIllll(var13)) {
            var13 = var25;
            var25 = var47;
            n3 = var13;
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
                    0;
                    if (3 <= 2) {
                        return ((0x47 ^ 0x36 ^ (0x7B ^ 0x47)) & (0xF2 ^ 0xB6 ^ (0x19 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIlIIII[1];
                }
                return n2 != 0;
            });
            if (n.lllllIIlIIIlII(nPC2) && n.lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                void var58;
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                System.out.println("npc distance to me: " + worldPoint2.distanceTo(Players.getLocal().getWorldLocation()));
                List<WorldPoint> list = n.a(tileObject.getWorldLocation(), llIIlIIlIIII[0]);
                System.out.println(llIIlIIIlllI[llIIlIIlIIII[3]]);
                list.forEach(worldPoint -> System.out.println(worldPoint.getWorldLocation()));
                System.out.println("OBJ LOC: " + String.valueOf(tileObject.getWorldLocation()));
                int var28 = llIIlIIlIIII[1];
                while (n.lllllIIlIIIllI(var28, var58.size())) {
                    void var27;
                    WorldPoint var14 = ((WorldPoint)var58.get(var28)).getWorldLocation();
                    if (n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)var14) ? 1 : 0) && n.lllllIIlIIIlIl(var27.equals((Object)var14) ? 1 : 0)) {
                        void var29;
                        if (n.lllllIIlIIIlll(var29.contains(var14) ? 1 : 0)) {
                            0;
                            if (((0x7F ^ 0x4C) & ~(0x38 ^ 0xB)) != 0) {
                                return;
                            }
                        } else {
                            int var65;
                            WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
                            worldPointArray[n.llIIlIIlIIII[1]] = var27;
                            TilePath var56 = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)var14);
                            int var70 = var56.size();
                            if (n.lllllIIlIIlIII(var70, var65 = var14.distanceTo((WorldPoint)var27)) && n.lllllIIlIIIlIl(var29.canMelee(Static.getClient().getTopLevelWorldView(), var14.toWorldArea()) ? 1 : 0)) {
                                System.out.println("Found safe spot: " + String.valueOf(var14));
                                Movement.setDestination((WorldPoint)var14);
                                0;
                                if (((0x18 ^ 0x22 ^ (0xAC ^ 0x99)) & (0x4A ^ 0x41 ^ (0xBE ^ 0xBA) ^ -1)) < 2) break;
                                return;
                            }
                        }
                    }
                    ++var28;
                    0;
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

    private static String lllllIIIllllll(String var46, String var6) {
        try {
            SecretKeySpec var38 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlIIlIIII[14]), "DES");
            Cipher var41 = Cipher.getInstance("DES");
            var41.init(llIIlIIlIIII[5], var38);
            return new String(var41.doFinal(Base64.getDecoder().decode(var46.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var61) {
            var61.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIllllII(String var67, String var26) {
        var67 = new String(Base64.getDecoder().decode(var67.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var32 = var26.toCharArray();
        int var53 = llIIlIIlIIII[1];
        char[] var31 = var67.toCharArray();
        int var52 = var31.length;
        int var9 = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(var9, var52)) {
            char var49 = var31[var9];
            var17.append((char)(var49 ^ var32[var53 % var32.length]));
            0;
            ++var53;
            ++var9;
            0;
            if (((0x64 ^ 0x52) & ~(0x51 ^ 0x67)) <= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g(NPC nPC) {
        void var2_2;
        NPC var40;
        void var10;
        List list = nPC.getWorldArea().toWorldPointList();
        int var7 = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(var7, var10.size())) {
            if (n.lllllIIlIIIIll(((WorldPoint)var10.get(var7)).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[3])) {
                return llIIlIIlIIII[1];
            }
            ++var7;
            0;
            if (1 > -1) continue;
            return false;
        }
        var7 = var40.getWorldArea().canMelee(var40.getWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0;
        if (n.lllllIIlIIIlll(var7)) {
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
            int var75;
            void var51;
            void var35;
            void var21;
            void var48;
            void var54;
            int var71;
            NPC var44;
            NPC var8;
            int n5 = Static.getClient().getPlane();
            int n6 = llIIlIIlIIII[22];
            int n7 = nPC.getLocalLocation().getX() / n6;
            int n8 = nPC.getLocalLocation().getY() / n6;
            int n9 = player.getLocalLocation().getX() / n6;
            int n10 = player.getLocalLocation().getY() / n6;
            WorldPoint worldPoint = nPC.getWorldLocation();
            WorldPoint worldPoint2 = player.getWorldLocation();
            Tile var24 = list.iterator();
            while (n.lllllIIlIIIlll(var24.hasNext() ? 1 : 0)) {
                void var76;
                WorldPoint var22;
                void var66;
                var8 = (NPC)var24.next();
                if (n.lllllIIlIIIlII(var8) && n.lllllIIlIIIlIl(n.lllllIIlIIlIll(n.c((WorldPoint)var66, var22 = var8.getWorldLocation()) + n.c((WorldPoint)var76, var22), n.c((WorldPoint)var66, (WorldPoint)var76))) && n.lllllIIlIIllII(var8, var44)) {
                    var71 = llIIlIIlIIII[3];
                }
                0;
                if (-(0x46 ^ 0x42) <= 0) continue;
                return false;
            }
            var24 = Static.getClient().getScene().getTiles()[var54][var48][var21];
            if (n.lllllIIlIIIlIl(var24.hasLineOfSightTo((Tile)(var8 = Static.getClient().getScene().getTiles()[var54][var35][var51])) ? 1 : 0)) {
                var75 = llIIlIIlIIII[3];
            }
            if (!n.lllllIIlIIllII(var44, n.b(b.RANGER)) || !n.lllllIIlIIllII(var44, n.b(b.MAGER)) || n.lllllIIlIIllIl(var44, n.b(b.JAD))) {
                return var75 != 0;
            }
            if (!n.lllllIIlIIIlIl(var71) || n.lllllIIlIIIlll(var75)) {
                bl = llIIlIIlIIII[3];
                0;
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
        void var72;
        WorldPoint var59;
        WorldPoint var60;
        Object var37;
        long l2 = System.currentTimeMillis();
        List list = Tiles.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)llIIlIIlIIII[7]);
        if (n.lllllIIlIIIlIl(list.isEmpty() ? 1 : 0)) {
            list = list.stream().sorted(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal().getWorldLocation()))).collect(Collectors.toList());
            System.out.println(list.size());
            WorldPoint worldPoint = NPCs.getNearest(nPC -> {
                int n2;
                if (n.lllllIIlIIIlll(nPC.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[30]]) ? 1 : 0) && n.lllllIIlIIllIl(nPC.getInteracting(), Players.getLocal())) {
                    n2 = llIIlIIlIIII[3];
                    0;
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
                    0;
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
                var37 = list.iterator();
                while (n.lllllIIlIIIlll(var37.hasNext() ? 1 : 0)) {
                    int var12;
                    void var77;
                    void var11;
                    void var69;
                    var60 = (Tile)var37.next();
                    var59 = var60.getWorldLocation();
                    if (!n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)var59) ? 1 : 0) || !n.lllllIIlIIIlIl(var59.equals((Object)var69) ? 1 : 0)) continue;
                    if (n.lllllIIlIIIlll(var11.contains(var59) ? 1 : 0)) {
                        0;
                        if (-(0x2F ^ 0x2B) <= 0) continue;
                        return;
                    }
                    WorldPoint[] worldPointArray2 = new WorldPoint[llIIlIIlIIII[3]];
                    worldPointArray2[n.llIIlIIlIIII[1]] = var77;
                    TilePath var74 = Movement.getPath(Arrays.asList(worldPointArray2), (WorldPoint)var59);
                    int var62 = var74.size();
                    if (n.lllllIIlIIlIII(var62, (var12 = var60.distanceTo((WorldPoint)var77)) + llIIlIIlIIII[5]) && n.lllllIIlIIIlIl(var11.canMelee(Static.getClient().getTopLevelWorldView(), var59.toWorldArea()) ? 1 : 0)) {
                        System.out.println("Found safe spot: " + String.valueOf(var59));
                        Movement.setDestination((WorldPoint)var59);
                        0;
                        if (null == null) break;
                        return;
                    }
                    0;
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
        long var77 = System.currentTimeMillis();
        long var69 = var77 - var72;
        System.out.println("Execution time: " + var69 + " milliseconds");
        var37 = new WorldPoint(llIIlIIlIIII[10], llIIlIIlIIII[11], llIIlIIlIIII[1]);
        String[] stringArray = new String[llIIlIIlIIII[3]];
        stringArray[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[12]];
        var60 = NPCs.getNearest((String[])stringArray).getWorldLocation();
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
        worldPointArray[n.llIIlIIlIIII[1]] = var60;
        if (n.lllllIIlIIlIII(Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)Players.getLocal().getWorldLocation()).size(), llIIlIIlIIII[3])) {
            // empty if block
        }
        String[] stringArray2 = new String[llIIlIIlIIII[3]];
        stringArray2[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[13]];
        var59 = NPCs.getNearest((String[])stringArray2);
        if (n.lllllIIlIIIlll(var59.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
            // empty if block
        }
        if (!n.lllllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), llIIlIIlIIII[3]) || n.lllllIIlIIlIII(Movement.getPath((WorldPoint)var37).size(), llIIlIIlIIII[3])) {
            // empty if block
        }
    }

    public static void e(NPC var16) {
        try {
            if (!n.lllllIIlIIIlIl(n.c(var16.getWorldArea().toWorldPointList()) ? 1 : 0) || n.lllllIIlIIIlll(var16.isMoving() ? 1 : 0)) {
                int var79;
                List var63;
                SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[14]];
                WorldPoint var30 = an;
                WorldPoint lllllllllllllllIlIIllllIIIIlIlII = an;
                WorldPoint lllllllllllllllIlIIllllIIIIlIIll = am;
                int var36 = llIIlIIlIIII[1];
                NPC var15 = NPCs.getNearest(nPC -> {
                    boolean bl;
                    NPC var33;
                    if ((!n.lllllIIlIlIIII(nPC.getId(), llIIlIIlIIII[27]) || n.lllllIIlIIlllI(nPC.getId(), llIIlIIlIIII[28])) && n.lllllIIlIIIlIl(var33.isDead() ? 1 : 0)) {
                        bl = llIIlIIlIIII[3];
                        0;
                        if (2 != 2) {
                            return false;
                        }
                    } else {
                        bl = llIIlIIlIIII[1];
                    }
                    return bl;
                });
                if (n.lllllIIlIIIlII(var15)) {
                    var63 = var15.getWorldArea().toWorldPointList();
                    var79 = llIIlIIlIIII[1];
                    while (n.lllllIIlIIIllI(var79, var63.size())) {
                        if (!n.lllllIIlIIlIII(((WorldPoint)var63.get(var79)).distanceTo(an), llIIlIIlIIII[12]) || n.lllllIIlIIIIll(((WorldPoint)var63.get(var79)).distanceTo(am), llIIlIIlIIII[12])) {
                            System.out.println(llIIlIIIlllI[llIIlIIlIIII[15]]);
                            List var3 = var16.getWorldArea().toWorldPointList();
                            int var19 = llIIlIIlIIII[1];
                            while (n.lllllIIlIIIllI(var19, var3.size())) {
                                if (n.lllllIIlIIIIll(((WorldPoint)var3.get(var19)).distanceTo(ap), llIIlIIlIIII[5])) {
                                    SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[16]];
                                    var30 = aq;
                                    if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        Movement.setDestination((WorldPoint)var30);
                                        var36 = llIIlIIlIIII[3];
                                        0;
                                        if (-(0x30 ^ 0x22 ^ (0x9E ^ 0x88)) < 0) break;
                                        return;
                                    }
                                }
                                ++var19;
                                0;
                                if (1 != 0) continue;
                                return;
                            }
                            if (n.lllllIIlIIIlll(var36)) {
                                0;
                                if ((0xBC ^ 0x8E ^ (0x35 ^ 3)) == (87 + 37 - 46 + 65 ^ 1 + 132 - -2 + 4)) break;
                                return;
                            }
                            if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                var30 = ap;
                                SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[17]];
                                Movement.setDestination((WorldPoint)var30);
                                0;
                                if (null == null) break;
                                return;
                            }
                        }
                        ++var79;
                        0;
                        if (-1 != (0x31 ^ 0x35)) continue;
                        return;
                    }
                }
                if (n.lllllIIlIIIlll(var36)) {
                    return;
                }
                var63 = var16.getWorldArea().toWorldPointList();
                var79 = llIIlIIlIIII[1];
                while (n.lllllIIlIIIllI(var79, var63.size())) {
                    if (n.lllllIIlIIIIll(var16.getWorldLocation().getY(), al.getY() - llIIlIIlIIII[18])) {
                        var30 = am;
                        Movement.setDestination((WorldPoint)var30);
                        return;
                    }
                    if (n.lllllIIlIIIIll(((WorldPoint)var63.get(var79)).distanceTo(an), llIIlIIlIIII[5])) {
                        SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[19]];
                        var30 = am;
                        if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                            Movement.setDestination((WorldPoint)var30);
                            return;
                        }
                    }
                    ++var79;
                    0;
                    
                    return;
                }
                if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                    SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[20]];
                    Movement.setDestination((WorldPoint)var30);
                    return;
                }
            }
            0;
        }
        catch (Exception var30) {
            var30.printStackTrace();
            System.out.println(var30.getMessage());
            System.out.println(var30.getStackTrace());
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

    private static void lllllIIlIIIIlI() {
        llIIlIIlIIII = new int[34];
        n.llIIlIIlIIII[0] = 3;
        n.llIIlIIlIIII[1] = (0x8A ^ 0x91) & ~(0x9F ^ 0x84);
        n.llIIlIIlIIII[2] = 0xFFFFF3FB & 0xE9C;
        n.llIIlIIlIIII[3] = 1;
        n.llIIlIIlIIII[4] = -(0xFFFFBF6F & 0x4DB7) & (0xFFFFEFFF & 0x1FBF);
        n.llIIlIIlIIII[5] = 2;
        n.llIIlIIlIIII[6] = -(0xFFFFEDD4 & 0x13BF) & (0xFFFFEFDF & 0x3FFF);
        n.llIIlIIlIIII[7] = 0x45 ^ 0x7C ^ (0x6D ^ 0x40);
        n.llIIlIIlIIII[8] = 0x3C ^ 0x12 ^ (0xE8 ^ 0xC2);
        n.llIIlIIlIIII[9] = 0x1C ^ 0x33 ^ (0x9B ^ 0xB1);
        n.llIIlIIlIIII[10] = -(0xFFFFFFF5 & 0x600F) & (0xFFFFEF7D & 0x7CE7);
        n.llIIlIIlIIII[11] = 0xFFFFFF6B & 0xDF6;
        n.llIIlIIlIIII[12] = 0x41 ^ 0x70 ^ (2 ^ 0x35);
        n.llIIlIIlIIII[13] = 104 + 132 - 197 + 107 ^ 94 + 11 - 8 + 52;
        n.llIIlIIlIIII[14] = 17 + 151 - 66 + 63 ^ 101 + 67 - 89 + 94;
        n.llIIlIIlIIII[15] = 0xA9 ^ 0x8C ^ (0xB3 ^ 0x9F);
        n.llIIlIIlIIII[16] = 0x87 ^ 0x83 ^ (0x9D ^ 0x93);
        n.llIIlIIlIIII[17] = 0x7E ^ 0x23 ^ (0x60 ^ 0x36);
        n.llIIlIIlIIII[18] = 0xA6 ^ 0xB9;
        n.llIIlIIlIIII[19] = 0x7A ^ 0x76;
        n.llIIlIIlIIII[20] = 0x37 ^ 0x3A;
        n.llIIlIIlIIII[21] = 0x32 ^ 0x3C;
        n.llIIlIIlIIII[22] = (0x23 ^ 0x1A) + 2 - -(0xB2 ^ 0x84) + (0x77 ^ 0x78);
        n.llIIlIIlIIII[23] = -(0xFFFFFCFF & 0x7FA1) & (0xFFFFFFFD & Short.MAX_VALUE);
        n.llIIlIIlIIII[24] = 0xA ^ 0x3D;
        n.llIIlIIlIIII[25] = 0x19 ^ 0x47 ^ (0x42 ^ 0x2E);
        n.llIIlIIlIIII[26] = 0x9B ^ 0x94;
        n.llIIlIIlIIII[27] = -(0xFFFFE7CF & 0x1AF9) & (0xFFFFBFFD & 0x4EFF);
        n.llIIlIIlIIII[28] = -(0xFFFFF3EB & 0x6F1D) & (0xFFFFEFBF & 0x7F7E);
        n.llIIlIIlIIII[29] = 0x69 ^ 0x12 ^ (0xF6 ^ 0x9D);
        n.llIIlIIlIIII[30] = 0xB8 ^ 0x9E ^ (0x34 ^ 3);
        n.llIIlIIlIIII[31] = 0xFFFFBE2F & 0x4DFE;
        n.llIIlIIlIIII[32] = 0x5C ^ 0x4E;
        n.llIIlIIlIIII[33] = 0x9B ^ 0x88;
    }

    public static boolean c(List<WorldPoint> list) {
        List<WorldPoint> var34;
        int var73 = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(var73, var34.size())) {
            if (n.lllllIIlIIIIll(var34.get(var73).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[5])) {
                return llIIlIIlIIII[3];
            }
            ++var73;
            0;
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

