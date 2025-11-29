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
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b;
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

public class n {
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
        void lllllllllllllllIlIIllllIIlIllIII;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int lllllllllllllllIlIIllllIIlIlIllI = -n2;
        while (n.lllllIIlIIIIll(lllllllllllllllIlIIllllIIlIlIllI, (int)lllllllllllllllIlIIllllIIlIllIII)) {
            void lllllllllllllllIlIIllllIIlIlIlIl = -lllllllllllllllIlIIllllIIlIllIII;
            while (n.lllllIIlIIIIll((int)lllllllllllllllIlIIllllIIlIlIlIl, (int)lllllllllllllllIlIIllllIIlIllIII)) {
                WorldPoint lllllllllllllllIlIIllllIIlIllIIl;
                void lllllllllllllllIlIIllllIIlIlIlll;
                lllllllllllllllIlIIllllIIlIlIlll.add(new WorldPoint(lllllllllllllllIlIIllllIIlIllIIl.dx(lllllllllllllllIlIIllllIIlIlIllI).getX(), lllllllllllllllIlIIllllIIlIllIIl.dy((int)lllllllllllllllIlIIllllIIlIlIlIl).getY(), lllllllllllllllIlIIllllIIlIllIIl.getPlane()));
                "".length();
                ++lllllllllllllllIlIIllllIIlIlIlIl;
                "".length();
                if (((0xF4 ^ 0xB8) & ~(0xEC ^ 0xA0)) < "  ".length()) continue;
                return null;
            }
            ++lllllllllllllllIlIIllllIIlIlIllI;
            "".length();
            if ("  ".length() > " ".length()) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean lllllIIlIIllIl(Object object, Object object2) {
        return object == object2;
    }

    public static NPC b(b b2) {
        Iterator lllllllllllllllIlIIllllIIIlIIIlI = Static.getClient().getTopLevelWorldView().npcs().iterator();
        while (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIlIIIlI.hasNext() ? 1 : 0)) {
            b lllllllllllllllIlIIllllIIIlIIIll;
            NPC lllllllllllllllIlIIllllIIIlIIIIl = (NPC)lllllllllllllllIlIIllllIIIlIIIlI.next();
            if (n.lllllIIlIIIlII(lllllllllllllllIlIIllllIIIlIIIIl) && n.lllllIIlIIIlII(lllllllllllllllIlIIllllIIIlIIIIl.getName()) && n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIlIIIll.d().toLowerCase().equals(lllllllllllllllIlIIllllIIIlIIIIl.getName().toLowerCase()) ? 1 : 0)) {
                return lllllllllllllllIlIIllllIIIlIIIIl;
            }
            "".length();
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
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((78 + 29 - -36 + 23 ^ 39 + 67 - -26 + 30) & (0x6C ^ 0x12 ^ (0x4E ^ 0x34) ^ -" ".length())) != 0;
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
                        "".length();
                        if (((0xF5 ^ 0x96) & ~(0x7D ^ 0x1E)) > 0) {
                            return ((0x1F ^ 0x57) & ~(0x6B ^ 0x23)) != 0;
                        }
                    } else {
                        n2 = llIIlIIlIIII[1];
                    }
                    return n2 != 0;
                });
                if (n.lllllIIlIIIlII(nPC2)) {
                    void lllllllllllllllIlIIlllIlllIIIlll;
                    WorldPoint worldPoint = nPC2.getWorldLocation();
                    WorldPoint worldPoint3 = list.stream().map(Tile::getWorldLocation).filter(worldPoint2 -> {
                        int n2;
                        NPC lllllllllllllllIlIIlllIlllIIIIII;
                        int lllllllllllllllIlIIlllIllIlllIll;
                        void lllllllllllllllIlIIlllIllIlllllI;
                        void lllllllllllllllIlIIlllIllIllllll;
                        if (!n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)worldPoint2) ? 1 : 0) || !n.lllllIIlIIIlIl(worldPoint2.equals((Object)nPC2.getWorldLocation()) ? 1 : 0) || n.lllllIIlIIIlll(nPC2.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                            return llIIlIIlIIII[1];
                        }
                        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
                        worldPointArray[n.llIIlIIlIIII[1]] = lllllllllllllllIlIIlllIllIllllll;
                        TilePath lllllllllllllllIlIIlllIllIllllIl = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)lllllllllllllllIlIIlllIllIlllllI);
                        int lllllllllllllllIlIIlllIllIllllII = lllllllllllllllIlIIlllIllIllllIl.size();
                        if (n.lllllIIlIIlIII(lllllllllllllllIlIIlllIllIllllII, (lllllllllllllllIlIIlllIllIlllIll = lllllllllllllllIlIIlllIllIlllllI.distanceTo((WorldPoint)lllllllllllllllIlIIlllIllIllllll)) + llIIlIIlIIII[5]) && n.lllllIIlIIIlIl(lllllllllllllllIlIIlllIlllIIIIII.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), lllllllllllllllIlIIlllIllIlllllI.toWorldArea()) ? 1 : 0)) {
                            n2 = llIIlIIlIIII[3];
                            "".length();
                            if (null != null) {
                                return ((0x5F ^ 0xF) & ~(0x4D ^ 0x1D)) != 0;
                            }
                        } else {
                            n2 = llIIlIIlIIII[1];
                        }
                        return n2 != 0;
                    }).findFirst().orElse(null);
                    return lllllllllllllllIlIIlllIlllIIIlll;
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
        n.llIIlIIIlllI[n.llIIlIIlIIII[1]] = n.lllllIIIlllIll("W8+WSQoJ5ikNd+RqhB8Rcg==", "wVYpp");
        n.llIIlIIIlllI[n.llIIlIIlIIII[3]] = n.lllllIIIlllIll("H3NuqY7gCIc=", "gqxca");
        n.llIIlIIIlllI[n.llIIlIIlIIII[5]] = n.lllllIIIllllII("DCM3YjUvbTAjNip/", "IMSBZ");
        n.llIIlIIIlllI[n.llIIlIIlIIII[0]] = n.lllllIIIlllIll("5HzRs5j0MRc=", "QdECO");
        n.llIIlIIIlllI[n.llIIlIIlIIII[8]] = n.lllllIIIlllIll("kjNVsmcUyDYiscR8YzE9qw==", "kHfDm");
        n.llIIlIIIlllI[n.llIIlIIlIIII[9]] = n.lllllIIIlllIll("NMM+7JxVpRQ0wz7snFWlFDTDPuycVaUUjmIe9IJ8Fqw=", "LSZvl");
        n.llIIlIIIlllI[n.llIIlIIlIIII[12]] = n.lllllIIIllllll("FfAyClLdq+Q=", "lewsE");
        n.llIIlIIIlllI[n.llIIlIIlIIII[13]] = n.lllllIIIllllll("OnRvKVnB6Tw=", "ItshX");
        n.llIIlIIIlllI[n.llIIlIIlIIII[14]] = n.lllllIIIllllII("HBkDBmMlGVUQIjcTBhMsJQ==", "QvucC");
        n.llIIlIIIlllI[n.llIIlIIlIIII[15]] = n.lllllIIIllllll("lS/5094Ji90QMX+U6NzBRmhWrRLOTphB5jVi/JvHSQZSktGAlRLhXQ==", "pqdNd");
        n.llIIlIIIlllI[n.llIIlIIlIIII[16]] = n.lllllIIIllllII("JjcHAVo3PxgQ", "CVtuz");
        n.llIIlIIIlllI[n.llIIlIIlIIII[17]] = n.lllllIIIllllII("BAwMJSpXFxA9Jw==", "wcyQB");
        n.llIIlIIIlllI[n.llIIlIIlIIII[19]] = n.lllllIIIlllIll("pDJdRR7hfDuITmO3i0eJCA==", "jCyLx");
        n.llIIlIIIlllI[n.llIIlIIlIIII[20]] = n.lllllIIIlllIll("Sozlz0RJ76le2MBAASnz9w==", "ExYAo");
        n.llIIlIIIlllI[n.llIIlIIlIIII[21]] = n.lllllIIIllllII("FSoJUw8zJwIWQjsu", "VKgsb");
        n.llIIlIIIlllI[n.llIIlIIlIIII[26]] = n.lllllIIIllllII("FCcsHzgfOyY=", "vKChH");
        n.llIIlIIIlllI[n.llIIlIIlIIII[29]] = n.lllllIIIlllIll("t5ltUwv8/KI=", "JTlft");
        n.llIIlIIIlllI[n.llIIlIIlIIII[30]] = n.lllllIIIllllll("6xFS642PGiA=", "tRpdE");
        n.llIIlIIIlllI[n.llIIlIIlIIII[32]] = n.lllllIIIlllIll("E2nuuteh3BM=", "ibbBL");
    }

    public static boolean h(NPC nPC) {
        if (n.lllllIIlIIlIlI(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[9]) && n.lllllIIlIIIlIl(nPC.isMoving() ? 1 : 0)) {
            return llIIlIIlIIII[3];
        }
        return llIIlIIlIIII[1];
    }

    private static String lllllIIIlllIll(String lllllllllllllllIlIIlllIllIllIIIl, String lllllllllllllllIlIIlllIllIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIllIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIllIllIIll.init(llIIlIIlIIII[5], lllllllllllllllIlIIlllIllIllIlII);
            return new String(lllllllllllllllIlIIlllIllIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIllIllIIlI) {
            lllllllllllllllIlIIlllIllIllIIlI.printStackTrace();
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
        void lllllllllllllllIlIIlllIlllIllIII;
        int lllllllllllllllIlIIlllIlllIlIlll;
        int lllllllllllllllIlIIlllIlllIllIIl;
        int n4 = n3 - n2;
        if (n.lllllIIlIIIlIl(n4)) {
            return lllllllllllllllIlIIlllIlllIllIIl;
        }
        if (n.lllllIIlIIlllI(Math.abs(lllllllllllllllIlIIlllIlllIlIlll), llIIlIIlIIII[3])) {
            int n5;
            if (n.lllllIIlIIIlll(at.nextBoolean() ? 1 : 0)) {
                n5 = lllllllllllllllIlIIlllIlllIllIIl;
                "".length();
                if (" ".length() < " ".length()) {
                    return (0 ^ 0x17 ^ (0x57 ^ 0x4D)) & (0xD ^ 0x4D ^ (0xD9 ^ 0x94) ^ -" ".length());
                }
            } else {
                n5 = lllllllllllllllIlIIlllIlllIllIII;
            }
            return n5;
        }
        if (n.lllllIIlIIllll(lllllllllllllllIlIIlllIlllIlIlll)) {
            lllllllllllllllIlIIlllIlllIlIlll = lllllllllllllllIlIIlllIlllIllIIl;
            lllllllllllllllIlIIlllIlllIllIIl = lllllllllllllllIlIIlllIlllIllIII;
            n3 = lllllllllllllllIlIIlllIlllIlIlll;
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
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return ((0x47 ^ 0x36 ^ (0x7B ^ 0x47)) & (0xF2 ^ 0xB6 ^ (0x19 ^ 0x10) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIlIIlIIII[1];
                }
                return n2 != 0;
            });
            if (n.lllllIIlIIIlII(nPC2) && n.lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                void lllllllllllllllIlIIllllIIlIIIlII;
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                System.out.println("npc distance to me: " + worldPoint2.distanceTo(Players.getLocal().getWorldLocation()));
                List<WorldPoint> list = n.a(tileObject.getWorldLocation(), llIIlIIlIIII[0]);
                System.out.println(llIIlIIIlllI[llIIlIIlIIII[3]]);
                list.forEach(worldPoint -> System.out.println(worldPoint.getWorldLocation()));
                System.out.println("OBJ LOC: " + String.valueOf(tileObject.getWorldLocation()));
                int lllllllllllllllIlIIllllIIlIIIIll = llIIlIIlIIII[1];
                while (n.lllllIIlIIIllI(lllllllllllllllIlIIllllIIlIIIIll, lllllllllllllllIlIIllllIIlIIIlII.size())) {
                    void lllllllllllllllIlIIllllIIlIIIllI;
                    WorldPoint lllllllllllllllIlIIllllIIlIIIIlI = ((WorldPoint)lllllllllllllllIlIIllllIIlIIIlII.get(lllllllllllllllIlIIllllIIlIIIIll)).getWorldLocation();
                    if (n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)lllllllllllllllIlIIllllIIlIIIIlI) ? 1 : 0) && n.lllllIIlIIIlIl(lllllllllllllllIlIIllllIIlIIIllI.equals((Object)lllllllllllllllIlIIllllIIlIIIIlI) ? 1 : 0)) {
                        void lllllllllllllllIlIIllllIIlIIIlIl;
                        if (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIlIIIlIl.contains(lllllllllllllllIlIIllllIIlIIIIlI) ? 1 : 0)) {
                            "".length();
                            if (((0x7F ^ 0x4C) & ~(0x38 ^ 0xB)) != 0) {
                                return;
                            }
                        } else {
                            int lllllllllllllllIlIIllllIIIllllll;
                            WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
                            worldPointArray[n.llIIlIIlIIII[1]] = lllllllllllllllIlIIllllIIlIIIllI;
                            TilePath lllllllllllllllIlIIllllIIlIIIIIl = Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)lllllllllllllllIlIIllllIIlIIIIlI);
                            int lllllllllllllllIlIIllllIIlIIIIII = lllllllllllllllIlIIllllIIlIIIIIl.size();
                            if (n.lllllIIlIIlIII(lllllllllllllllIlIIllllIIlIIIIII, lllllllllllllllIlIIllllIIIllllll = lllllllllllllllIlIIllllIIlIIIIlI.distanceTo((WorldPoint)lllllllllllllllIlIIllllIIlIIIllI)) && n.lllllIIlIIIlIl(lllllllllllllllIlIIllllIIlIIIlIl.canMelee(Static.getClient().getTopLevelWorldView(), lllllllllllllllIlIIllllIIlIIIIlI.toWorldArea()) ? 1 : 0)) {
                                System.out.println("Found safe spot: " + String.valueOf(lllllllllllllllIlIIllllIIlIIIIlI));
                                Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIlIIIIlI);
                                "".length();
                                if (((0x18 ^ 0x22 ^ (0xAC ^ 0x99)) & (0x4A ^ 0x41 ^ (0xBE ^ 0xBA) ^ -" ".length())) < "  ".length()) break;
                                return;
                            }
                        }
                    }
                    ++lllllllllllllllIlIIllllIIlIIIIll;
                    "".length();
                    if (-" ".length() < ((0x75 ^ 0x64 ^ (0xD3 ^ 0x95)) & (210 + 204 - 289 + 95 ^ 32 + 15 - 4 + 96 ^ -" ".length()))) continue;
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

    private static String lllllIIIllllll(String lllllllllllllllIlIIlllIllIIIllII, String lllllllllllllllIlIIlllIllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIlIIII[14]), "DES");
            Cipher lllllllllllllllIlIIlllIllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIlllIllIIIlllI.init(llIIlIIlIIII[5], lllllllllllllllIlIIlllIllIIIllll);
            return new String(lllllllllllllllIlIIlllIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIllIIIllIl) {
            lllllllllllllllIlIIlllIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIllllII(String lllllllllllllllIlIIlllIllIlIIIIl, String lllllllllllllllIlIIlllIllIIllIll) {
        lllllllllllllllIlIIlllIllIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIllIIlllll = new StringBuilder();
        char[] lllllllllllllllIlIIlllIllIIllllI = lllllllllllllllIlIIlllIllIIllIll.toCharArray();
        int lllllllllllllllIlIIlllIllIIlllIl = llIIlIIlIIII[1];
        char[] lllllllllllllllIlIIlllIllIIlIlll = lllllllllllllllIlIIlllIllIlIIIIl.toCharArray();
        int lllllllllllllllIlIIlllIllIIlIllI = lllllllllllllllIlIIlllIllIIlIlll.length;
        int lllllllllllllllIlIIlllIllIIlIlIl = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(lllllllllllllllIlIIlllIllIIlIlIl, lllllllllllllllIlIIlllIllIIlIllI)) {
            char lllllllllllllllIlIIlllIllIlIIIlI = lllllllllllllllIlIIlllIllIIlIlll[lllllllllllllllIlIIlllIllIIlIlIl];
            lllllllllllllllIlIIlllIllIIlllll.append((char)(lllllllllllllllIlIIlllIllIlIIIlI ^ lllllllllllllllIlIIlllIllIIllllI[lllllllllllllllIlIIlllIllIIlllIl % lllllllllllllllIlIIlllIllIIllllI.length]));
            "".length();
            ++lllllllllllllllIlIIlllIllIIlllIl;
            ++lllllllllllllllIlIIlllIllIIlIlIl;
            "".length();
            if (((0x64 ^ 0x52) & ~(0x51 ^ 0x67)) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllIllIIlllll);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g(NPC nPC) {
        void var2_2;
        NPC lllllllllllllllIlIIllllIIIIIIIIl;
        void lllllllllllllllIlIIllllIIIIIIIII;
        List list = nPC.getWorldArea().toWorldPointList();
        int lllllllllllllllIlIIlllIlllllllll = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(lllllllllllllllIlIIlllIlllllllll, lllllllllllllllIlIIllllIIIIIIIII.size())) {
            if (n.lllllIIlIIIIll(((WorldPoint)lllllllllllllllIlIIllllIIIIIIIII.get(lllllllllllllllIlIIlllIlllllllll)).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[3])) {
                return llIIlIIlIIII[1];
            }
            ++lllllllllllllllIlIIlllIlllllllll;
            "".length();
            if (" ".length() > -" ".length()) continue;
            return ((0x69 ^ 0x6C) & ~(0xAD ^ 0xA8)) != 0;
        }
        lllllllllllllllIlIIlllIlllllllll = lllllllllllllllIlIIllllIIIIIIIIl.getWorldArea().canMelee(lllllllllllllllIlIIllllIIIIIIIIl.getWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0;
        if (n.lllllIIlIIIlll(lllllllllllllllIlIIlllIlllllllll)) {
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
            int lllllllllllllllIlIIlllIllllIlIlI;
            void lllllllllllllllIlIIlllIllllIIIlI;
            void lllllllllllllllIlIIlllIllllIIIll;
            void lllllllllllllllIlIIlllIllllIIlII;
            void lllllllllllllllIlIIlllIllllIIlIl;
            void lllllllllllllllIlIIlllIllllIIlll;
            int lllllllllllllllIlIIlllIllllIlIll;
            NPC lllllllllllllllIlIIlllIllllIllII;
            NPC lllllllllllllllIlIIlllIlllIllllI;
            int n5 = Static.getClient().getPlane();
            int n6 = llIIlIIlIIII[22];
            int n7 = nPC.getLocalLocation().getX() / n6;
            int n8 = nPC.getLocalLocation().getY() / n6;
            int n9 = player.getLocalLocation().getX() / n6;
            int n10 = player.getLocalLocation().getY() / n6;
            WorldPoint worldPoint = nPC.getWorldLocation();
            WorldPoint worldPoint2 = player.getWorldLocation();
            Tile lllllllllllllllIlIIlllIlllIlllll = list.iterator();
            while (n.lllllIIlIIIlll(lllllllllllllllIlIIlllIlllIlllll.hasNext() ? 1 : 0)) {
                void lllllllllllllllIlIIlllIllllIIIII;
                WorldPoint lllllllllllllllIlIIlllIlllIlllIl;
                void lllllllllllllllIlIIlllIllllIIIIl;
                lllllllllllllllIlIIlllIlllIllllI = (NPC)lllllllllllllllIlIIlllIlllIlllll.next();
                if (n.lllllIIlIIIlII(lllllllllllllllIlIIlllIlllIllllI) && n.lllllIIlIIIlIl(n.lllllIIlIIlIll(n.c((WorldPoint)lllllllllllllllIlIIlllIllllIIIIl, lllllllllllllllIlIIlllIlllIlllIl = lllllllllllllllIlIIlllIlllIllllI.getWorldLocation()) + n.c((WorldPoint)lllllllllllllllIlIIlllIllllIIIII, lllllllllllllllIlIIlllIlllIlllIl), n.c((WorldPoint)lllllllllllllllIlIIlllIllllIIIIl, (WorldPoint)lllllllllllllllIlIIlllIllllIIIII))) && n.lllllIIlIIllII(lllllllllllllllIlIIlllIlllIllllI, lllllllllllllllIlIIlllIllllIllII)) {
                    lllllllllllllllIlIIlllIllllIlIll = llIIlIIlIIII[3];
                }
                "".length();
                if (-(0x46 ^ 0x42) <= 0) continue;
                return ((0x7F ^ 0x2F) & ~(0x50 ^ 0)) != 0;
            }
            lllllllllllllllIlIIlllIlllIlllll = Static.getClient().getScene().getTiles()[lllllllllllllllIlIIlllIllllIIlll][lllllllllllllllIlIIlllIllllIIlIl][lllllllllllllllIlIIlllIllllIIlII];
            if (n.lllllIIlIIIlIl(lllllllllllllllIlIIlllIlllIlllll.hasLineOfSightTo((Tile)(lllllllllllllllIlIIlllIlllIllllI = Static.getClient().getScene().getTiles()[lllllllllllllllIlIIlllIllllIIlll][lllllllllllllllIlIIlllIllllIIIll][lllllllllllllllIlIIlllIllllIIIlI])) ? 1 : 0)) {
                lllllllllllllllIlIIlllIllllIlIlI = llIIlIIlIIII[3];
            }
            if (!n.lllllIIlIIllII(lllllllllllllllIlIIlllIllllIllII, n.b(b.RANGER)) || !n.lllllIIlIIllII(lllllllllllllllIlIIlllIllllIllII, n.b(b.MAGER)) || n.lllllIIlIIllIl(lllllllllllllllIlIIlllIllllIllII, n.b(b.JAD))) {
                return lllllllllllllllIlIIlllIllllIlIlI != 0;
            }
            if (!n.lllllIIlIIIlIl(lllllllllllllllIlIIlllIllllIlIll) || n.lllllIIlIIIlll(lllllllllllllllIlIIlllIllllIlIlI)) {
                bl = llIIlIIlIIII[3];
                "".length();
                if (" ".length() == 0) {
                    return ((0x94 ^ 0x9C ^ (5 ^ 0x3C)) & (106 + 58 - 81 + 102 ^ 77 + 129 - 100 + 30 ^ -" ".length())) != 0;
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
        void lllllllllllllllIlIIllllIIIllIIlI;
        WorldPoint lllllllllllllllIlIIllllIIIlIlIlI;
        WorldPoint lllllllllllllllIlIIllllIIIlIlIll;
        Object lllllllllllllllIlIIllllIIIlIllII;
        long l2 = System.currentTimeMillis();
        List list = Tiles.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)llIIlIIlIIII[7]);
        if (n.lllllIIlIIIlIl(list.isEmpty() ? 1 : 0)) {
            list = list.stream().sorted(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal().getWorldLocation()))).collect(Collectors.toList());
            System.out.println(list.size());
            WorldPoint worldPoint = NPCs.getNearest(nPC -> {
                int n2;
                if (n.lllllIIlIIIlll(nPC.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[30]]) ? 1 : 0) && n.lllllIIlIIllIl(nPC.getInteracting(), Players.getLocal())) {
                    n2 = llIIlIIlIIII[3];
                    "".length();
                    if ("   ".length() == -" ".length()) {
                        return ((108 + 110 - 206 + 215 ^ 57 + 112 - 134 + 139) & (168 + 206 - 239 + 106 ^ 130 + 165 - 125 + 18 ^ -" ".length())) != 0;
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
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0xC3 ^ 0x92) & ~(0x7C ^ 0x2D)) != 0;
                    }
                } else {
                    n2 = llIIlIIlIIII[1];
                }
                return n2 != 0;
            });
            if (n.lllllIIlIIIlII(nPC2) && n.lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                WorldPoint worldPoint2 = nPC2.getWorldLocation();
                WorldArea worldArea = nPC2.getWorldArea();
                lllllllllllllllIlIIllllIIIlIllII = list.iterator();
                while (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIlIllII.hasNext() ? 1 : 0)) {
                    int lllllllllllllllIlIIllllIIIlIIlll;
                    void lllllllllllllllIlIIllllIIIllIIII;
                    void lllllllllllllllIlIIllllIIIlIllIl;
                    void lllllllllllllllIlIIllllIIIlIlllI;
                    lllllllllllllllIlIIllllIIIlIlIll = (Tile)lllllllllllllllIlIIllllIIIlIllII.next();
                    lllllllllllllllIlIIllllIIIlIlIlI = lllllllllllllllIlIIllllIIIlIlIll.getWorldLocation();
                    if (!n.lllllIIlIIIlll(Reachable.isWalkable((WorldPoint)lllllllllllllllIlIIllllIIIlIlIlI) ? 1 : 0) || !n.lllllIIlIIIlIl(lllllllllllllllIlIIllllIIIlIlIlI.equals((Object)lllllllllllllllIlIIllllIIIlIlllI) ? 1 : 0)) continue;
                    if (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIlIllIl.contains(lllllllllllllllIlIIllllIIIlIlIlI) ? 1 : 0)) {
                        "".length();
                        if (-(0x2F ^ 0x2B) <= 0) continue;
                        return;
                    }
                    WorldPoint[] worldPointArray2 = new WorldPoint[llIIlIIlIIII[3]];
                    worldPointArray2[n.llIIlIIlIIII[1]] = lllllllllllllllIlIIllllIIIllIIII;
                    TilePath lllllllllllllllIlIIllllIIIlIlIIl = Movement.getPath(Arrays.asList(worldPointArray2), (WorldPoint)lllllllllllllllIlIIllllIIIlIlIlI);
                    int lllllllllllllllIlIIllllIIIlIlIII = lllllllllllllllIlIIllllIIIlIlIIl.size();
                    if (n.lllllIIlIIlIII(lllllllllllllllIlIIllllIIIlIlIII, (lllllllllllllllIlIIllllIIIlIIlll = lllllllllllllllIlIIllllIIIlIlIll.distanceTo((WorldPoint)lllllllllllllllIlIIllllIIIllIIII)) + llIIlIIlIIII[5]) && n.lllllIIlIIIlIl(lllllllllllllllIlIIllllIIIlIllIl.canMelee(Static.getClient().getTopLevelWorldView(), lllllllllllllllIlIIllllIIIlIlIlI.toWorldArea()) ? 1 : 0)) {
                        System.out.println("Found safe spot: " + String.valueOf(lllllllllllllllIlIIllllIIIlIlIlI));
                        Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIIlIlIlI);
                        "".length();
                        if (null == null) break;
                        return;
                    }
                    "".length();
                    if ("  ".length() >= "  ".length()) continue;
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
        long lllllllllllllllIlIIllllIIIllIIII = System.currentTimeMillis();
        long lllllllllllllllIlIIllllIIIlIlllI = lllllllllllllllIlIIllllIIIllIIII - lllllllllllllllIlIIllllIIIllIIlI;
        System.out.println("Execution time: " + lllllllllllllllIlIIllllIIIlIlllI + " milliseconds");
        lllllllllllllllIlIIllllIIIlIllII = new WorldPoint(llIIlIIlIIII[10], llIIlIIlIIII[11], llIIlIIlIIII[1]);
        String[] stringArray = new String[llIIlIIlIIII[3]];
        stringArray[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[12]];
        lllllllllllllllIlIIllllIIIlIlIll = NPCs.getNearest((String[])stringArray).getWorldLocation();
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIlIIII[3]];
        worldPointArray[n.llIIlIIlIIII[1]] = lllllllllllllllIlIIllllIIIlIlIll;
        if (n.lllllIIlIIlIII(Movement.getPath(Arrays.asList(worldPointArray), (WorldPoint)Players.getLocal().getWorldLocation()).size(), llIIlIIlIIII[3])) {
            // empty if block
        }
        String[] stringArray2 = new String[llIIlIIlIIII[3]];
        stringArray2[n.llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[13]];
        lllllllllllllllIlIIllllIIIlIlIlI = NPCs.getNearest((String[])stringArray2);
        if (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIlIlIlI.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
            // empty if block
        }
        if (!n.lllllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIlIIllllIIIlIllII), llIIlIIlIIII[3]) || n.lllllIIlIIlIII(Movement.getPath((WorldPoint)lllllllllllllllIlIIllllIIIlIllII).size(), llIIlIIlIIII[3])) {
            // empty if block
        }
    }

    public static void e(NPC lllllllllllllllIlIIllllIIIIlIllI) {
        try {
            if (!n.lllllIIlIIIlIl(n.c(lllllllllllllllIlIIllllIIIIlIllI.getWorldArea().toWorldPointList()) ? 1 : 0) || n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIIlIllI.isMoving() ? 1 : 0)) {
                int lllllllllllllllIlIIllllIIIIIllll;
                List lllllllllllllllIlIIllllIIIIlIIII;
                SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[14]];
                WorldPoint lllllllllllllllIlIIllllIIIIlIlIl = an;
                WorldPoint lllllllllllllllIlIIllllIIIIlIlII = an;
                WorldPoint lllllllllllllllIlIIllllIIIIlIIll = am;
                int lllllllllllllllIlIIllllIIIIlIIlI = llIIlIIlIIII[1];
                NPC lllllllllllllllIlIIllllIIIIlIIIl = NPCs.getNearest(nPC -> {
                    boolean bl;
                    NPC lllllllllllllllIlIIlllIlllIlIlIl;
                    if ((!n.lllllIIlIlIIII(nPC.getId(), llIIlIIlIIII[27]) || n.lllllIIlIIlllI(nPC.getId(), llIIlIIlIIII[28])) && n.lllllIIlIIIlIl(lllllllllllllllIlIIlllIlllIlIlIl.isDead() ? 1 : 0)) {
                        bl = llIIlIIlIIII[3];
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return ((0x60 ^ 0x71) & ~(0x4D ^ 0x5C)) != 0;
                        }
                    } else {
                        bl = llIIlIIlIIII[1];
                    }
                    return bl;
                });
                if (n.lllllIIlIIIlII(lllllllllllllllIlIIllllIIIIlIIIl)) {
                    lllllllllllllllIlIIllllIIIIlIIII = lllllllllllllllIlIIllllIIIIlIIIl.getWorldArea().toWorldPointList();
                    lllllllllllllllIlIIllllIIIIIllll = llIIlIIlIIII[1];
                    while (n.lllllIIlIIIllI(lllllllllllllllIlIIllllIIIIIllll, lllllllllllllllIlIIllllIIIIlIIII.size())) {
                        if (!n.lllllIIlIIlIII(((WorldPoint)lllllllllllllllIlIIllllIIIIlIIII.get(lllllllllllllllIlIIllllIIIIIllll)).distanceTo(an), llIIlIIlIIII[12]) || n.lllllIIlIIIIll(((WorldPoint)lllllllllllllllIlIIllllIIIIlIIII.get(lllllllllllllllIlIIllllIIIIIllll)).distanceTo(am), llIIlIIlIIII[12])) {
                            System.out.println(llIIlIIIlllI[llIIlIIlIIII[15]]);
                            List lllllllllllllllIlIIllllIIIIIlllI = lllllllllllllllIlIIllllIIIIlIllI.getWorldArea().toWorldPointList();
                            int lllllllllllllllIlIIllllIIIIIllIl = llIIlIIlIIII[1];
                            while (n.lllllIIlIIIllI(lllllllllllllllIlIIllllIIIIIllIl, lllllllllllllllIlIIllllIIIIIlllI.size())) {
                                if (n.lllllIIlIIIIll(((WorldPoint)lllllllllllllllIlIIllllIIIIIlllI.get(lllllllllllllllIlIIllllIIIIIllIl)).distanceTo(ap), llIIlIIlIIII[5])) {
                                    SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[16]];
                                    lllllllllllllllIlIIllllIIIIlIlIl = aq;
                                    if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIlIIllllIIIIlIlIl) ? 1 : 0)) {
                                        Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIIIlIlIl);
                                        lllllllllllllllIlIIllllIIIIlIIlI = llIIlIIlIIII[3];
                                        "".length();
                                        if (-(0x30 ^ 0x22 ^ (0x9E ^ 0x88)) < 0) break;
                                        return;
                                    }
                                }
                                ++lllllllllllllllIlIIllllIIIIIllIl;
                                "".length();
                                if (" ".length() != 0) continue;
                                return;
                            }
                            if (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIIlIIlI)) {
                                "".length();
                                if ((0xBC ^ 0x8E ^ (0x35 ^ 3)) == (87 + 37 - 46 + 65 ^ 1 + 132 - -2 + 4)) break;
                                return;
                            }
                            if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIlIIllllIIIIlIlIl) ? 1 : 0)) {
                                lllllllllllllllIlIIllllIIIIlIlIl = ap;
                                SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[17]];
                                Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIIIlIlIl);
                                "".length();
                                if (null == null) break;
                                return;
                            }
                        }
                        ++lllllllllllllllIlIIllllIIIIIllll;
                        "".length();
                        if (-" ".length() != (0x31 ^ 0x35)) continue;
                        return;
                    }
                }
                if (n.lllllIIlIIIlll(lllllllllllllllIlIIllllIIIIlIIlI)) {
                    return;
                }
                lllllllllllllllIlIIllllIIIIlIIII = lllllllllllllllIlIIllllIIIIlIllI.getWorldArea().toWorldPointList();
                lllllllllllllllIlIIllllIIIIIllll = llIIlIIlIIII[1];
                while (n.lllllIIlIIIllI(lllllllllllllllIlIIllllIIIIIllll, lllllllllllllllIlIIllllIIIIlIIII.size())) {
                    if (n.lllllIIlIIIIll(lllllllllllllllIlIIllllIIIIlIllI.getWorldLocation().getY(), al.getY() - llIIlIIlIIII[18])) {
                        lllllllllllllllIlIIllllIIIIlIlIl = am;
                        Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIIIlIlIl);
                        return;
                    }
                    if (n.lllllIIlIIIIll(((WorldPoint)lllllllllllllllIlIIllllIIIIlIIII.get(lllllllllllllllIlIIllllIIIIIllll)).distanceTo(an), llIIlIIlIIII[5])) {
                        SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[19]];
                        lllllllllllllllIlIIllllIIIIlIlIl = am;
                        if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIlIIllllIIIIlIlIl) ? 1 : 0)) {
                            Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIIIlIlIl);
                            return;
                        }
                    }
                    ++lllllllllllllllIlIIllllIIIIIllll;
                    "".length();
                    if (null == null) continue;
                    return;
                }
                if (n.lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIlIIllllIIIIlIlIl) ? 1 : 0)) {
                    SquireFightCavesPlugin.h = llIIlIIIlllI[llIIlIIlIIII[20]];
                    Movement.setDestination((WorldPoint)lllllllllllllllIlIIllllIIIIlIlIl);
                    return;
                }
            }
            "".length();
        }
        catch (Exception lllllllllllllllIlIIllllIIIIlIlIl) {
            lllllllllllllllIlIIllllIIIIlIlIl.printStackTrace();
            System.out.println(lllllllllllllllIlIIllllIIIIlIlIl.getMessage());
            System.out.println(lllllllllllllllIlIIllllIIIIlIlIl.getStackTrace());
        }
        if (" ".length() <= 0) {
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
        n.llIIlIIlIIII[0] = "   ".length();
        n.llIIlIIlIIII[1] = (0x8A ^ 0x91) & ~(0x9F ^ 0x84);
        n.llIIlIIlIIII[2] = 0xFFFFF3FB & 0xE9C;
        n.llIIlIIlIIII[3] = " ".length();
        n.llIIlIIlIIII[4] = -(0xFFFFBF6F & 0x4DB7) & (0xFFFFEFFF & 0x1FBF);
        n.llIIlIIlIIII[5] = "  ".length();
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
        n.llIIlIIlIIII[22] = (0x23 ^ 0x1A) + "  ".length() - -(0xB2 ^ 0x84) + (0x77 ^ 0x78);
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
        List<WorldPoint> lllllllllllllllIlIIllllIIIIIlIII;
        int lllllllllllllllIlIIllllIIIIIIlll = llIIlIIlIIII[1];
        while (n.lllllIIlIIIllI(lllllllllllllllIlIIllllIIIIIIlll, lllllllllllllllIlIIllllIIIIIlIII.size())) {
            if (n.lllllIIlIIIIll(lllllllllllllllIlIIllllIIIIIlIII.get(lllllllllllllllIlIIllllIIIIIIlll).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[5])) {
                return llIIlIIlIIII[3];
            }
            ++lllllllllllllllIlIIllllIIIIIIlll;
            "".length();
            if (" ".length() != ((1 ^ 0x4F) & ~(0xC1 ^ 0x8F))) continue;
            return ((0xD8 ^ 0x8B) & ~(0xC8 ^ 0x9B)) != 0;
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

