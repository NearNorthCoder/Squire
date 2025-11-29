package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import java.io.PrintStream;
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
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/n.class */
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
        lllllIIlIIIIlI();
        lllllIIlIIIIIl();
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
        return Math.sqrt(((worldPoint2.getY() - worldPoint.getY()) * (worldPoint2.getY() - worldPoint.getY())) + ((worldPoint2.getX() - worldPoint.getX()) * (worldPoint2.getX() - worldPoint.getX())));
    }

    private static boolean lllllIIlIIlIIl(Object obj) {
        return obj == null;
    }

    public static List<WorldPoint> a(WorldPoint worldPoint, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = -i;
        while (lllllIIlIIIIll(i2, i)) {
            int i3 = -i;
            while (lllllIIlIIIIll(i3, i)) {
                arrayList.add(new WorldPoint(worldPoint.dx(i2).getX(), worldPoint.dy(i3).getY(), worldPoint.getPlane()));
                "".length();
                i3++;
                "".length();
                if (((244 ^ 184) & ((236 ^ 160) ^ (-1))) >= "  ".length()) {
                    return null;
                }
            }
            i2++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean lllllIIlIIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static NPC b(b bVar) {
        for (NPC npc : Static.getClient().getTopLevelWorldView().npcs()) {
            if (lllllIIlIIIlII(npc) && lllllIIlIIIlII(npc.getName()) && lllllIIlIIIlll(bVar.d().toLowerCase().equals(npc.getName().toLowerCase()) ? 1 : 0)) {
                return npc;
            }
            "".length();
            if ((-(86 ^ 82)) > 0) {
                return null;
            }
        }
        return null;
    }

    @Inject
    public n(SquireFightCavesConfig squireFightCavesConfig) {
        this.as = squireFightCavesConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean F() {
        if (!lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals(am) ? 1 : 0) || lllllIIlIIIlll(Players.getLocal().getWorldLocation().equals(an) ? 1 : 0)) {
            ?? r0 = llIIlIIlIIII[3];
            "".length();
            return "  ".length() > "  ".length() ? ((((78 + 29) - (-36)) + 23) ^ (((39 + 67) - (-26)) + 30)) & (((108 ^ 18) ^ (78 ^ 52)) ^ (-" ".length())) : r0;
        }
        return llIIlIIlIIII[1];
    }

    private static boolean lllllIIlIIllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllllIIlIIIIll(int i, int i2) {
        return i <= i2;
    }

    private static int lllllIIlIIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public CompletableFuture<WorldPoint> C() {
        return CompletableFuture.supplyAsync(() -> {
            List surrounding = Tiles.getSurrounding(Players.getLocal().getWorldLocation(), llIIlIIlIIII[7]);
            if (lllllIIlIIIlIl(surrounding.isEmpty() ? 1 : 0)) {
                List list = (List) surrounding.stream().sorted(Comparator.comparingInt(tile -> {
                    return tile.distanceTo(Players.getLocal().getWorldLocation());
                })).collect(Collectors.toList());
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lllllIIlIIIlll(npc.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[32]]) ? 1 : 0) && lllllIIlIIllIl(npc.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIIlIIlIIII[3];
                        "".length();
                        return ((245 ^ 150) & ((125 ^ 30) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIIlIIII[1];
                });
                if (lllllIIlIIIlII(nearest)) {
                    WorldPoint worldLocation = nearest.getWorldLocation();
                    return (WorldPoint) list.stream().map((v0) -> {
                        return v0.getWorldLocation();
                    }).filter(worldPoint -> {
                        if (lllllIIlIIIlll(Reachable.isWalkable(worldPoint) ? 1 : 0) && lllllIIlIIIlIl(worldPoint.equals(nearest.getWorldLocation()) ? 1 : 0) && !lllllIIlIIIlll(nearest.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                            WorldPoint[] worldPointArr = new WorldPoint[llIIlIIlIIII[3]];
                            worldPointArr[llIIlIIlIIII[1]] = worldLocation;
                            if (lllllIIlIIlIII(Movement.getPath(Arrays.asList(worldPointArr), worldPoint).size(), worldPoint.distanceTo(worldLocation) + llIIlIIlIIII[5]) && lllllIIlIIIlIl(nearest.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), worldPoint.toWorldArea()) ? 1 : 0)) {
                                ?? r0 = llIIlIIlIIII[3];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIlIIlIIII[1];
                        }
                        return llIIlIIlIIII[1];
                    }).findFirst().orElse(null);
                }
                return null;
            }
            return null;
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean a(WorldPoint worldPoint) {
        return lllllIIlIIIIll(worldPoint.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[3]) ? llIIlIIlIIII[3] : llIIlIIlIIII[1];
    }

    private static boolean lllllIIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lllllIIlIIIIIl() {
        llIIlIIIlllI = new String[llIIlIIlIIII[33]];
        llIIlIIIlllI[llIIlIIlIIII[1]] = lllllIIIlllIll("W8+WSQoJ5ikNd+RqhB8Rcg==", "wVYpp");
        llIIlIIIlllI[llIIlIIlIIII[3]] = lllllIIIlllIll("H3NuqY7gCIc=", "gqxca");
        llIIlIIIlllI[llIIlIIlIIII[5]] = lllllIIIllllII("DCM3YjUvbTAjNip/", "IMSBZ");
        llIIlIIIlllI[llIIlIIlIIII[0]] = lllllIIIlllIll("5HzRs5j0MRc=", "QdECO");
        llIIlIIIlllI[llIIlIIlIIII[8]] = lllllIIIlllIll("kjNVsmcUyDYiscR8YzE9qw==", "kHfDm");
        llIIlIIIlllI[llIIlIIlIIII[9]] = lllllIIIlllIll("NMM+7JxVpRQ0wz7snFWlFDTDPuycVaUUjmIe9IJ8Fqw=", "LSZvl");
        llIIlIIIlllI[llIIlIIlIIII[12]] = lllllIIIllllll("FfAyClLdq+Q=", "lewsE");
        llIIlIIIlllI[llIIlIIlIIII[13]] = lllllIIIllllll("OnRvKVnB6Tw=", "ItshX");
        llIIlIIIlllI[llIIlIIlIIII[14]] = lllllIIIllllII("HBkDBmMlGVUQIjcTBhMsJQ==", "QvucC");
        llIIlIIIlllI[llIIlIIlIIII[15]] = lllllIIIllllll("lS/5094Ji90QMX+U6NzBRmhWrRLOTphB5jVi/JvHSQZSktGAlRLhXQ==", "pqdNd");
        llIIlIIIlllI[llIIlIIlIIII[16]] = lllllIIIllllII("JjcHAVo3PxgQ", "CVtuz");
        llIIlIIIlllI[llIIlIIlIIII[17]] = lllllIIIllllII("BAwMJSpXFxA9Jw==", "wcyQB");
        llIIlIIIlllI[llIIlIIlIIII[19]] = lllllIIIlllIll("pDJdRR7hfDuITmO3i0eJCA==", "jCyLx");
        llIIlIIIlllI[llIIlIIlIIII[20]] = lllllIIIlllIll("Sozlz0RJ76le2MBAASnz9w==", "ExYAo");
        llIIlIIIlllI[llIIlIIlIIII[21]] = lllllIIIllllII("FSoJUw8zJwIWQjsu", "VKgsb");
        llIIlIIIlllI[llIIlIIlIIII[26]] = lllllIIIllllII("FCcsHzgfOyY=", "vKChH");
        llIIlIIIlllI[llIIlIIlIIII[29]] = lllllIIIlllIll("t5ltUwv8/KI=", "JTlft");
        llIIlIIIlllI[llIIlIIlIIII[30]] = lllllIIIllllll("6xFS642PGiA=", "tRpdE");
        llIIlIIIlllI[llIIlIIlIIII[32]] = lllllIIIlllIll("E2nuuteh3BM=", "ibbBL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean h(NPC npc) {
        return (lllllIIlIIlIlI(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[9]) && lllllIIlIIIlIl(npc.isMoving() ? 1 : 0)) ? llIIlIIlIIII[3] : llIIlIIlIIII[1];
    }

    private static String lllllIIIlllIll(String lllllllllllllllIlIIlllIllIllIIIl, String lllllllllllllllIlIIlllIllIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIllIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIllIllIIll.init(llIIlIIlIIII[5], secretKeySpec);
            return new String(lllllllllllllllIlIIlllIllIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIllIllIIlI) {
            lllllllllllllllIlIIlllIllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIlIIllll(int i) {
        return i < 0;
    }

    public static int b(int i, int i2) {
        int i3 = i2 - i;
        if (lllllIIlIIIlIl(i3)) {
            return i;
        }
        if (lllllIIlIIlllI(Math.abs(i3), llIIlIIlIIII[3])) {
            if (lllllIIlIIIlll(at.nextBoolean() ? 1 : 0)) {
                "".length();
                return " ".length() < " ".length() ? ((0 ^ 23) ^ (87 ^ 77)) & (((13 ^ 77) ^ (217 ^ 148)) ^ (-" ".length())) : i;
            }
            return i2;
        }
        if (lllllIIlIIllll(i3)) {
            i = i2;
            i2 = i;
        }
        return i + at.nextInt((i2 - i) + llIIlIIlIIII[3]);
    }

    public static void D() {
        int[] iArr = new int[llIIlIIlIIII[0]];
        iArr[llIIlIIlIIII[1]] = llIIlIIlIIII[2];
        iArr[llIIlIIlIIII[3]] = llIIlIIlIIII[4];
        iArr[llIIlIIlIIII[5]] = llIIlIIlIIII[6];
        TileObject nearest = TileObjects.getNearest(iArr);
        long currentTimeMillis = System.currentTimeMillis();
        if (lllllIIlIIIlII(nearest)) {
            System.out.println(llIIlIIIlllI[llIIlIIlIIII[1]]);
            NPC nearest2 = NPCs.getNearest(npc -> {
                if (lllllIIlIIlllI(npc.getId(), llIIlIIlIIII[31]) && lllllIIlIIllIl(npc.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIIlIIlIIII[3];
                    "".length();
                    return "   ".length() <= "  ".length() ? ((71 ^ 54) ^ (123 ^ 71)) & (((242 ^ 182) ^ (25 ^ 16)) ^ (-" ".length())) : r0;
                }
                return llIIlIIlIIII[1];
            });
            if (lllllIIlIIIlII(nearest2) && lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                WorldPoint worldLocation = nearest2.getWorldLocation();
                WorldArea worldArea = nearest2.getWorldArea();
                System.out.println("npc distance to me: " + worldLocation.distanceTo(Players.getLocal().getWorldLocation()));
                List<WorldPoint> a = a(nearest.getWorldLocation(), llIIlIIlIIII[0]);
                System.out.println(llIIlIIIlllI[llIIlIIlIIII[3]]);
                a.forEach(worldPoint -> {
                    System.out.println(worldPoint.getWorldLocation());
                });
                System.out.println("OBJ LOC: " + String.valueOf(nearest.getWorldLocation()));
                int i = llIIlIIlIIII[1];
                do {
                    if (lllllIIlIIIllI(i, a.size())) {
                        WorldPoint worldLocation2 = a.get(i).getWorldLocation();
                        if (lllllIIlIIIlll(Reachable.isWalkable(worldLocation2) ? 1 : 0) && lllllIIlIIIlIl(worldLocation.equals(worldLocation2) ? 1 : 0)) {
                            if (lllllIIlIIIlll(worldArea.contains(worldLocation2) ? 1 : 0)) {
                                "".length();
                                if ((true ^ true) & ((true ^ true) ^ true)) {
                                    return;
                                }
                            } else {
                                WorldPoint[] worldPointArr = new WorldPoint[llIIlIIlIIII[3]];
                                worldPointArr[llIIlIIlIIII[1]] = worldLocation;
                                int size = Movement.getPath(Arrays.asList(worldPointArr), worldLocation2).size();
                                int lllllllllllllllIlIIllllIIIllllll = worldLocation2.distanceTo(worldLocation);
                                if (lllllIIlIIlIII(size, lllllllllllllllIlIIllllIIIllllll) && lllllIIlIIIlIl(worldArea.canMelee(Static.getClient().getTopLevelWorldView(), worldLocation2.toWorldArea()) ? 1 : 0)) {
                                    System.out.println("Found safe spot: " + String.valueOf(worldLocation2));
                                    Movement.setDestination(worldLocation2);
                                    "".length();
                                    if ((((24 ^ 34) ^ (172 ^ 153)) & (((74 ^ 65) ^ (190 ^ 186)) ^ (-" ".length()))) >= "  ".length()) {
                                        return;
                                    }
                                }
                            }
                        }
                        i++;
                        "".length();
                    }
                } while ((-" ".length()) < (((117 ^ 100) ^ (211 ^ 149)) & (((((210 + 204) - 289) + 95) ^ (((32 + 15) - 4) + 96)) ^ (-" ".length()))));
                return;
            }
        }
        System.out.println("Execution time: " + (System.currentTimeMillis() - currentTimeMillis) + " milliseconds");
        System.out.println(llIIlIIIlllI[llIIlIIlIIII[5]]);
    }

    private static boolean lllllIIlIIlllI(int i, int i2) {
        return i == i2;
    }

    private static String lllllIIIllllll(String lllllllllllllllIlIIlllIllIIIllII, String lllllllllllllllIlIIlllIllIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIIIlIll.getBytes(StandardCharsets.UTF_8)), llIIlIIlIIII[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIlIIII[5], lllllllllllllllIlIIlllIllIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIllIIIllIl) {
            lllllllllllllllIlIIlllIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIllllII(String lllllllllllllllIlIIlllIllIlIIIIl, String lllllllllllllllIlIIlllIllIlIIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIlllIllIIllllI = lllllllllllllllIlIIlllIllIlIIIII.toCharArray();
        int lllllllllllllllIlIIlllIllIIlllIl = llIIlIIlIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlIIlIIII[1];
        while (lllllIIlIIIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIIlllIllIIllllI[lllllllllllllllIlIIlllIllIIlllIl % lllllllllllllllIlIIlllIllIIllllI.length]));
            "".length();
            lllllllllllllllIlIIlllIllIIlllIl++;
            i++;
            "".length();
            if (((100 ^ 82) & ((81 ^ 103) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public static boolean g(NPC npc) {
        List worldPointList = npc.getWorldArea().toWorldPointList();
        int i = llIIlIIlIIII[1];
        while (lllllIIlIIIllI(i, worldPointList.size())) {
            if (lllllIIlIIIIll(((WorldPoint) worldPointList.get(i)).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[3])) {
                return llIIlIIlIIII[1];
            }
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        boolean canMelee = npc.getWorldArea().canMelee(npc.getWorldView(), Players.getLocal().getWorldArea());
        if (lllllIIlIIIlll(canMelee ? 1 : 0)) {
            System.out.println(llIIlIIIlllI[llIIlIIlIIII[21]]);
        }
        return canMelee;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    public static boolean c(NPC npc, int i) {
        int i2 = llIIlIIlIIII[1];
        int i3 = llIIlIIlIIII[1];
        Player localPlayer = Static.getClient().getLocalPlayer();
        List<NPC> npcs = Static.getClient().getNpcs();
        if (lllllIIlIIIlII(npc) && lllllIIlIIIlII(localPlayer) && lllllIIlIIIlII(npcs)) {
            int plane = Static.getClient().getPlane();
            int i4 = llIIlIIlIIII[22];
            int x = npc.getLocalLocation().getX() / i4;
            int y = npc.getLocalLocation().getY() / i4;
            int x2 = localPlayer.getLocalLocation().getX() / i4;
            int lllllllllllllllIlIIlllIllllIIIlI = localPlayer.getLocalLocation().getY() / i4;
            WorldPoint worldLocation = npc.getWorldLocation();
            WorldPoint worldLocation2 = localPlayer.getWorldLocation();
            for (NPC npc2 : npcs) {
                if (lllllIIlIIIlII(npc2)) {
                    WorldPoint worldLocation3 = npc2.getWorldLocation();
                    if (lllllIIlIIIlIl(lllllIIlIIlIll(c(worldLocation, worldLocation3) + c(worldLocation2, worldLocation3), c(worldLocation, worldLocation2))) && lllllIIlIIllII(npc2, npc)) {
                        i2 = llIIlIIlIIII[3];
                    }
                }
                "".length();
                if ((-(70 ^ 66)) > 0) {
                    return (true ^ true) & (true ^ true);
                }
            }
            if (lllllIIlIIIlIl(Static.getClient().getScene().getTiles()[plane][x][y].hasLineOfSightTo(Static.getClient().getScene().getTiles()[plane][x2][lllllllllllllllIlIIlllIllllIIIlI]) ? 1 : 0)) {
                i3 = llIIlIIlIIII[3];
            }
            if (lllllIIlIIllII(npc, b(b.RANGER)) && lllllIIlIIllII(npc, b(b.MAGER)) && !lllllIIlIIllIl(npc, b(b.JAD))) {
                if (!lllllIIlIIIlIl(i2) || lllllIIlIIIlll(i3)) {
                    ?? r0 = llIIlIIlIIII[3];
                    "".length();
                    return " ".length() == 0 ? ((148 ^ 156) ^ (5 ^ 60)) & (((((106 + 58) - 81) + 102) ^ (((77 + 129) - 100) + 30)) ^ (-" ".length())) : r0;
                }
                return llIIlIIlIIII[1];
            }
            return i3;
        }
        return llIIlIIlIIII[1];
    }

    public static void G() {
        int[] iArr = new int[llIIlIIlIIII[3]];
        iArr[llIIlIIlIIII[1]] = llIIlIIlIIII[23];
        if (lllllIIlIIIlll(Equipment.contains(iArr) ? 1 : 0) && lllllIIlIIIlIl(Combat.isSpecEnabled() ? 1 : 0) && lllllIIlIIlIlI(Combat.getSpecEnergy(), llIIlIIlIIII[24])) {
            Combat.toggleSpec();
        }
        if (lllllIIlIIIlll(Equipment.contains(item -> {
            return item.getName().contains(llIIlIIIlllI[llIIlIIlIIII[26]]);
        }) ? 1 : 0) && lllllIIlIIIlIl(Combat.isSpecEnabled() ? 1 : 0) && lllllIIlIIlIlI(Combat.getMissingHealth(), llIIlIIlIIII[16]) && lllllIIlIIlIlI(Combat.getSpecEnergy(), llIIlIIlIIII[25])) {
            Combat.toggleSpec();
        }
    }

    private static boolean lllllIIlIIIlII(Object obj) {
        return obj != null;
    }

    public static void E() {
        long currentTimeMillis = System.currentTimeMillis();
        List surrounding = Tiles.getSurrounding(Players.getLocal().getWorldLocation(), llIIlIIlIIII[7]);
        if (lllllIIlIIIlIl(surrounding.isEmpty() ? 1 : 0)) {
            List list = (List) surrounding.stream().sorted(Comparator.comparingInt(tile -> {
                return tile.distanceTo(Players.getLocal().getWorldLocation());
            })).collect(Collectors.toList());
            System.out.println(list.size());
            WorldPoint worldLocation = NPCs.getNearest(npc -> {
                if (lllllIIlIIIlll(npc.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[30]]) ? 1 : 0) && lllllIIlIIllIl(npc.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIIlIIlIIII[3];
                    "".length();
                    return "   ".length() == (-" ".length()) ? ((((108 + 110) - 206) + 215) ^ (((57 + 112) - 134) + 139)) & (((((168 + 206) - 239) + 106) ^ (((130 + 165) - 125) + 18)) ^ (-" ".length())) : r0;
                }
                return llIIlIIlIIII[1];
            }).getWorldLocation();
            PrintStream printStream = System.out;
            WorldPoint[] worldPointArr = new WorldPoint[llIIlIIlIIII[3]];
            worldPointArr[llIIlIIlIIII[1]] = worldLocation;
            printStream.println("NPC Path size to me: " + Movement.getPath(Arrays.asList(worldPointArr), Players.getLocal().getWorldLocation()).size());
            NPC nearest = NPCs.getNearest(npc2 -> {
                if (lllllIIlIIIlll(npc2.getName().equalsIgnoreCase(llIIlIIIlllI[llIIlIIlIIII[29]]) ? 1 : 0) && lllllIIlIIllIl(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIIlIIlIIII[3];
                    "".length();
                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIlIIII[1];
            });
            if (lllllIIlIIIlII(nearest) && lllllIIlIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                WorldPoint worldLocation2 = nearest.getWorldLocation();
                WorldArea worldArea = nearest.getWorldArea();
                Iterator it = list.iterator();
                while (true) {
                    if (!lllllIIlIIIlll(it.hasNext() ? 1 : 0)) {
                        break;
                    }
                    Tile tile2 = (Tile) it.next();
                    WorldPoint worldLocation3 = tile2.getWorldLocation();
                    if (lllllIIlIIIlll(Reachable.isWalkable(worldLocation3) ? 1 : 0) && lllllIIlIIIlIl(worldLocation3.equals(worldLocation2) ? 1 : 0)) {
                        if (lllllIIlIIIlll(worldArea.contains(worldLocation3) ? 1 : 0)) {
                            "".length();
                            if ((-(47 ^ 43)) > 0) {
                                return;
                            }
                        } else {
                            WorldPoint[] worldPointArr2 = new WorldPoint[llIIlIIlIIII[3]];
                            worldPointArr2[llIIlIIlIIII[1]] = worldLocation;
                            if (lllllIIlIIlIII(Movement.getPath(Arrays.asList(worldPointArr2), worldLocation3).size(), tile2.distanceTo(worldLocation) + llIIlIIlIIII[5]) && lllllIIlIIIlIl(worldArea.canMelee(Static.getClient().getTopLevelWorldView(), worldLocation3.toWorldArea()) ? 1 : 0)) {
                                System.out.println("Found safe spot: " + String.valueOf(worldLocation3));
                                Movement.setDestination(worldLocation3);
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            } else {
                                "".length();
                                if ("  ".length() < "  ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            String[] strArr = new String[llIIlIIlIIII[3]];
            strArr[llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[0]];
            if (lllllIIlIIIlIl(NPCs.getNearest(strArr).getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation().toWorldArea()) ? 1 : 0)) {
                System.out.println(llIIlIIIlllI[llIIlIIlIIII[8]]);
            }
            System.out.println(llIIlIIIlllI[llIIlIIlIIII[9]]);
        }
        System.out.println("Execution time: " + (System.currentTimeMillis() - currentTimeMillis) + " milliseconds");
        WorldPoint worldPoint = new WorldPoint(llIIlIIlIIII[10], llIIlIIlIIII[11], llIIlIIlIIII[1]);
        String[] strArr2 = new String[llIIlIIlIIII[3]];
        strArr2[llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[12]];
        WorldPoint worldLocation4 = NPCs.getNearest(strArr2).getWorldLocation();
        WorldPoint[] worldPointArr3 = new WorldPoint[llIIlIIlIIII[3]];
        worldPointArr3[llIIlIIlIIII[1]] = worldLocation4;
        if (lllllIIlIIlIII(Movement.getPath(Arrays.asList(worldPointArr3), Players.getLocal().getWorldLocation()).size(), llIIlIIlIIII[3])) {
        }
        String[] strArr3 = new String[llIIlIIlIIII[3]];
        strArr3[llIIlIIlIIII[1]] = llIIlIIIlllI[llIIlIIlIIII[13]];
        if (lllllIIlIIIlll(NPCs.getNearest(strArr3).getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
        }
        if (!lllllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIlIIlIIII[3]) || lllllIIlIIlIII(Movement.getPath(worldPoint).size(), llIIlIIlIIII[3])) {
        }
    }

    public static void e(NPC npc) {
        try {
            if (!lllllIIlIIIlIl(c(npc.getWorldArea().toWorldPointList()) ? 1 : 0) || lllllIIlIIIlll(npc.isMoving() ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIlIIIlllI[llIIlIIlIIII[14]];
                WorldPoint worldPoint = an;
                WorldPoint worldPoint2 = an;
                WorldPoint worldPoint3 = am;
                int lllllllllllllllIlIIllllIIIIlIIlI = llIIlIIlIIII[1];
                NPC nearest = NPCs.getNearest(npc2 -> {
                    if ((!lllllIIlIlIIII(npc2.getId(), llIIlIIlIIII[27]) || lllllIIlIIlllI(npc2.getId(), llIIlIIlIIII[28])) && lllllIIlIIIlIl(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = llIIlIIlIIII[3];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIIlIIII[1];
                });
                if (lllllIIlIIIlII(nearest)) {
                    List worldPointList = nearest.getWorldArea().toWorldPointList();
                    int i = llIIlIIlIIII[1];
                    do {
                        if (lllllIIlIIIllI(i, worldPointList.size())) {
                            if (!lllllIIlIIlIII(((WorldPoint) worldPointList.get(i)).distanceTo(an), llIIlIIlIIII[12]) || lllllIIlIIIIll(((WorldPoint) worldPointList.get(i)).distanceTo(am), llIIlIIlIIII[12])) {
                                System.out.println(llIIlIIIlllI[llIIlIIlIIII[15]]);
                                List worldPointList2 = npc.getWorldArea().toWorldPointList();
                                int i2 = llIIlIIlIIII[1];
                                while (true) {
                                    if (!lllllIIlIIIllI(i2, worldPointList2.size())) {
                                        break;
                                    }
                                    if (lllllIIlIIIIll(((WorldPoint) worldPointList2.get(i2)).distanceTo(ap), llIIlIIlIIII[5])) {
                                        SquireFightCavesPlugin.f0h = llIIlIIIlllI[llIIlIIlIIII[16]];
                                        worldPoint = aq;
                                        if (lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                            Movement.setDestination(worldPoint);
                                            lllllllllllllllIlIIllllIIIIlIIlI = llIIlIIlIIII[3];
                                            "".length();
                                            if ((-((48 ^ 34) ^ (158 ^ 136))) >= 0) {
                                                return;
                                            }
                                        }
                                    }
                                    i2++;
                                    "".length();
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                }
                                if (lllllIIlIIIlll(lllllllllllllllIlIIllllIIIIlIIlI)) {
                                    "".length();
                                    if (((188 ^ 142) ^ (53 ^ 3)) != ((((87 + 37) - 46) + 65) ^ (((1 + 132) - (-2)) + 4))) {
                                        return;
                                    }
                                } else if (lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    worldPoint = ap;
                                    SquireFightCavesPlugin.f0h = llIIlIIIlllI[llIIlIIlIIII[17]];
                                    Movement.setDestination(worldPoint);
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            i++;
                            "".length();
                        }
                    } while ((-" ".length()) != (49 ^ 53));
                    return;
                }
                if (lllllIIlIIIlll(lllllllllllllllIlIIllllIIIIlIIlI)) {
                    return;
                }
                List worldPointList3 = npc.getWorldArea().toWorldPointList();
                int i3 = llIIlIIlIIII[1];
                while (lllllIIlIIIllI(i3, worldPointList3.size())) {
                    if (lllllIIlIIIIll(npc.getWorldLocation().getY(), al.getY() - llIIlIIlIIII[18])) {
                        Movement.setDestination(am);
                        return;
                    }
                    if (lllllIIlIIIIll(((WorldPoint) worldPointList3.get(i3)).distanceTo(an), llIIlIIlIIII[5])) {
                        SquireFightCavesPlugin.f0h = llIIlIIIlllI[llIIlIIlIIII[19]];
                        worldPoint = am;
                        if (lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                            Movement.setDestination(worldPoint);
                            return;
                        }
                    }
                    i3++;
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
                if (lllllIIlIIIlIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                    SquireFightCavesPlugin.f0h = llIIlIIIlllI[llIIlIIlIIII[20]];
                    Movement.setDestination(worldPoint);
                    return;
                }
            }
            "".length();
            if (" ".length() <= 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    private static boolean lllllIIlIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lllllIIlIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllllIIlIIlIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean f(NPC npc) {
        return lllllIIlIIlIIl(npc) ? llIIlIIlIIII[1] : npc.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea());
    }

    private static void lllllIIlIIIIlI() {
        llIIlIIlIIII = new int[34];
        llIIlIIlIIII[0] = "   ".length();
        llIIlIIlIIII[1] = (138 ^ 145) & ((159 ^ 132) ^ (-1));
        llIIlIIlIIII[2] = (-3077) & 3740;
        llIIlIIlIIII[3] = " ".length();
        llIIlIIlIIII[4] = (-((-16529) & 19895)) & (-4097) & 8127;
        llIIlIIlIIII[5] = "  ".length();
        llIIlIIlIIII[6] = (-((-4652) & 5055)) & (-4129) & 16383;
        llIIlIIlIIII[7] = (69 ^ 124) ^ (109 ^ 64);
        llIIlIIlIIII[8] = (60 ^ 18) ^ (232 ^ 194);
        llIIlIIlIIII[9] = (28 ^ 51) ^ (155 ^ 177);
        llIIlIIlIIII[10] = (-((-11) & 24591)) & (-4227) & 31975;
        llIIlIIlIIII[11] = (-149) & 3574;
        llIIlIIlIIII[12] = (65 ^ 112) ^ (2 ^ 53);
        llIIlIIlIIII[13] = (((104 + 132) - 197) + 107) ^ (((94 + 11) - 8) + 52);
        llIIlIIlIIII[14] = (((17 + 151) - 66) + 63) ^ (((101 + 67) - 89) + 94);
        llIIlIIlIIII[15] = (169 ^ 140) ^ (179 ^ 159);
        llIIlIIlIIII[16] = (135 ^ 131) ^ (157 ^ 147);
        llIIlIIlIIII[17] = (126 ^ 35) ^ (96 ^ 54);
        llIIlIIlIIII[18] = 166 ^ 185;
        llIIlIIlIIII[19] = 122 ^ 118;
        llIIlIIlIIII[20] = 55 ^ 58;
        llIIlIIlIIII[21] = 50 ^ 60;
        llIIlIIlIIII[22] = (((35 ^ 26) + "  ".length()) - (-(178 ^ 132))) + (119 ^ 120);
        llIIlIIlIIII[23] = (-((-769) & 32673)) & (-3) & 32767;
        llIIlIIlIIII[24] = 10 ^ 61;
        llIIlIIlIIII[25] = (25 ^ 71) ^ (66 ^ 46);
        llIIlIIlIIII[26] = 155 ^ 148;
        llIIlIIlIIII[27] = (-((-6193) & 6905)) & (-16387) & 20223;
        llIIlIIlIIII[28] = (-((-3093) & 28445)) & (-4161) & 32638;
        llIIlIIlIIII[29] = (105 ^ 18) ^ (246 ^ 157);
        llIIlIIlIIII[30] = (184 ^ 158) ^ (52 ^ 3);
        llIIlIIlIIII[31] = (-16849) & 19966;
        llIIlIIlIIII[32] = 92 ^ 78;
        llIIlIIlIIII[33] = 155 ^ 136;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean c(List<WorldPoint> list) {
        int lllllllllllllllIlIIllllIIIIIIlll = llIIlIIlIIII[1];
        while (lllllIIlIIIllI(lllllllllllllllIlIIllllIIIIIIlll, list.size())) {
            if (lllllIIlIIIIll(list.get(lllllllllllllllIlIIllllIIIIIIlll).distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlIIII[5])) {
                return llIIlIIlIIII[3];
            }
            lllllllllllllllIlIIllllIIIIIIlll++;
            "".length();
            if (" ".length() == ((1 ^ 79) & ((193 ^ 143) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIlIIlIIII[1];
    }

    private static boolean lllllIIlIlIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lllllIIlIIIlll(int i) {
        return i != 0;
    }
}
