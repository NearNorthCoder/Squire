package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Safe Spotting Task")
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.l  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/l.class */
public class l extends Task {
    private final /* synthetic */ n ai;
    private final /* synthetic */ SquireFightCavesConfig ah;
    private static /* synthetic */ int[] llIIIlllllIl;
    private static /* synthetic */ String[] llIIIllllIll;
    private final /* synthetic */ f ag;

    private static boolean llllIllllIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIllllIIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean a(b bVar) {
        switch (m.aj[bVar.f().ordinal()]) {
            case 1:
            case 2:
                return llIIIlllllIl[2];
            case 3:
                return A();
            case 4:
                return llIIIlllllIl[2];
            case 5:
                return llIIIlllllIl[1];
            default:
                return llIIIlllllIl[2];
        }
    }

    private static boolean llllIllllIIllI(int i, int i2) {
        return i != i2;
    }

    private static void llllIlllIllIll() {
        llIIIlllllIl = new int[8];
        llIIIlllllIl[0] = 70 ^ 64;
        llIIIlllllIl[1] = ((((26 + 34) - (-25)) + 102) ^ (((39 + 59) - (-51)) + 22)) & (((((43 + 119) - 57) + 84) ^ (((9 + 98) - 23) + 89)) ^ (-" ".length()));
        llIIIlllllIl[2] = " ".length();
        llIIIlllllIl[3] = (-9236) & 12243;
        llIIIlllllIl[4] = "   ".length();
        llIIIlllllIl[5] = "  ".length();
        llIIIlllllIl[6] = (27 ^ 54) ^ (183 ^ 144);
        llIIIlllllIl[7] = 95 ^ 80;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean c(NPC npc) {
        if (llllIllllIlIll(b.a(npc.getId()).b(), a.RANGED)) {
            ?? r0 = llIIIlllllIl[2];
            "".length();
            return "  ".length() < (-" ".length()) ? ((134 ^ 178) ^ (201 ^ 199)) & (((232 ^ 138) ^ (197 ^ 157)) ^ (-" ".length())) : r0;
        }
        return llIIIlllllIl[1];
    }

    private Tile a(Client client, WorldPoint worldPoint) {
        LocalPoint fromWorld = LocalPoint.fromWorld(client, worldPoint);
        if (llllIllllIIIlI(fromWorld)) {
            return null;
        }
        return client.getScene().getTiles()[worldPoint.getPlane()][fromWorld.getSceneX()][fromWorld.getSceneY()];
    }

    private static boolean llllIlllIlllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllIlllIlllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean c(Tile tile, Client client) {
        if (!llllIllllIIIlI(tile.getWallObject()) || llllIllllIIIII(tile.getDecorativeObject())) {
            return llIIIlllllIl[2];
        }
        GameObject[] gameObjects = tile.getGameObjects();
        int length = gameObjects.length;
        int i = llIIIlllllIl[1];
        while (llllIllllIlIII(i, length)) {
            if (llllIllllIIIII(gameObjects[i])) {
                return llIIIlllllIl[2];
            }
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIlllllIl[1];
    }

    private static String llllIlllIIllll(String lllllllllllllllIlIlIIIIIllIllIlI, String lllllllllllllllIlIlIIIIIllIllIIl) {
        String lllllllllllllllIlIlIIIIIllIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIIIIIllIllIIl.toCharArray();
        int lllllllllllllllIlIlIIIIIllIlIllI = llIIIlllllIl[1];
        char[] charArray2 = lllllllllllllllIlIlIIIIIllIllIlI2.toCharArray();
        int length = charArray2.length;
        int i = llIIIlllllIl[1];
        while (llllIllllIlIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlIIIIIllIlIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlIIIIIllIlIllI++;
            i++;
            "".length();
            if (((99 ^ 88) & ((140 ^ 183) ^ (-1))) < ((72 ^ 102) & ((18 ^ 60) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    private boolean a(Tile tile, Client client) {
        int x = tile.getSceneLocation().getX();
        int y = tile.getSceneLocation().getY();
        int plane = client.getPlane();
        if (llllIllllIIIII(client.getCollisionMaps()) && llllIllllIlIIl(plane) && !llllIllllIlIlI(plane, client.getCollisionMaps().length)) {
            int[][] flags = client.getCollisionMaps()[plane].getFlags();
            if (llllIllllIlIIl(x) && llllIllllIlIIl(y) && llllIllllIlIII(x, flags.length) && !llllIllllIlIlI(y, flags[x].length)) {
                if (llllIlllIlllIl(flags[x][y])) {
                    ?? r0 = llIIIlllllIl[2];
                    "".length();
                    return ((61 ^ 93) & ((99 ^ 3) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIlllllIl[1];
            }
            return llIIIlllllIl[1];
        }
        return llIIIlllllIl[1];
    }

    private boolean a(Tile tile, NPC npc, Client client) {
        return tile.hasLineOfSightTo(a(client, npc.getWorldLocation()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    private boolean a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        int abs = Math.abs(worldPoint.getX() - worldPoint2.getX());
        int abs2 = Math.abs(worldPoint.getY() - worldPoint2.getY());
        if (llllIlllIlllll(abs, llIIIlllllIl[2]) && llllIlllIlllll(abs2, llIIIlllllIl[2])) {
            ?? r0 = llIIIlllllIl[2];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlllllIl[1];
    }

    private WorldArea a(NPC npc) {
        if (llllIllllIIIlI(npc)) {
            return null;
        }
        int i = llIIIlllllIl[4];
        return new WorldArea(npc.getWorldLocation().dx(-i).dy(-i), (llIIIlllllIl[5] * i) + npc.getWorldArea().getWidth(), (llIIIlllllIl[5] * i) + npc.getWorldArea().getWidth());
    }

    private static String llllIlllIlIIII(String lllllllllllllllIlIlIIIIIlllIlIII, String lllllllllllllllIlIlIIIIIlllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIlllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIlllIllII.init(llIIIlllllIl[5], secretKeySpec);
            return new String(lllllllllllllllIlIlIIIIIlllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIlllIlIll) {
            lllllllllllllllIlIlIIIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllllIlIIl(int i) {
        return i >= 0;
    }

    private static boolean llllIllllIIIlI(Object obj) {
        return obj == null;
    }

    private List<WorldPoint> b(List<NPC> list) {
        WorldPoint worldLocation = Static.getClient().getLocalPlayer().getWorldLocation();
        ArrayList arrayList = new ArrayList();
        int i = llIIIlllllIl[7];
        int i2 = -i;
        while (llllIlllIlllll(i2, i)) {
            int i3 = -i;
            while (llllIlllIlllll(i3, i)) {
                WorldPoint dy = worldLocation.dx(i2).dy(i3);
                Tile a = a(Static.getClient(), dy);
                if (llllIllllIIIII(a) && llllIlllIllllI(a(a) ? 1 : 0) && llllIlllIllllI(a(a, list) ? 1 : 0)) {
                    arrayList.add(dy);
                    "".length();
                }
                i3++;
                "".length();
                if (("  ".length() & ("  ".length() ^ (-1))) != 0) {
                    return null;
                }
            }
            i2++;
            "".length();
            if ((-((((30 + 53) - 64) + 116) ^ (((78 + 97) - 63) + 19))) >= 0) {
                return null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean b(NPC npc) {
        if (llllIllllIlIll(b.a(npc.getId()).b(), a.MELEE)) {
            ?? r0 = llIIIlllllIl[2];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(Tile tile) {
        return llllIlllIllllI(Arrays.stream(tile.getGameObjects()).anyMatch(gameObject -> {
            if (llllIllllIIIII(gameObject) && llllIlllIlllIl(b((TileObject) gameObject) ? 1 : 0)) {
                ?? r0 = llIIIlllllIl[2];
                "".length();
                return (136 ^ 140) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlllllIl[1];
        }) ? 1 : 0) ? llIIIlllllIl[1] : a(tile, Static.getClient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    public boolean run() {
        f.b(llIIIlllllIl[0]);
        if (llllIlllIlllIl(z() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[1]]);
            return llIIIlllllIl[1];
        }
        Client client = Static.getClient();
        List<NPC> a = a(client);
        WorldPoint worldLocation = client.getLocalPlayer().getWorldLocation();
        new ArrayList();
        if (llllIlllIllllI(a.isEmpty() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[2]]);
            return llIIIlllllIl[1];
        }
        System.out.println("Varbit: " + Vars.getBit(llIIIlllllIl[3]));
        System.out.println("Setting: " + String.valueOf(GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(llIIIlllllIl[3]));
        })));
        if (llllIlllIlllll(a.get(llIIIlllllIl[1]).getWorldArea().distanceTo(worldLocation), llIIIlllllIl[4])) {
            WorldPoint worldPoint = (WorldPoint) a(a.get(llIIIlllllIl[1])).toWorldPointList().stream().filter(worldPoint2 -> {
                if (llllIlllIllllI(Reachable.isWalkable(worldPoint2) ? 1 : 0) && llllIllllIlIII(((NPC) a.get(llIIIlllllIl[1])).getWorldArea().distanceTo(worldPoint2), llIIIlllllIl[0])) {
                    ?? r0 = llIIIlllllIl[2];
                    "".length();
                    return (" ".length() ^ (92 ^ 88)) == 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                }
                return llIIIlllllIl[1];
            }).max(Comparator.comparingInt(obj -> {
                return ((NPC) a.get(llIIIlllllIl[1])).getWorldArea().distanceTo((WorldPoint) obj);
            }).thenComparingDouble(obj2 -> {
                return (-1.0f) * ((WorldPoint) obj2).distanceToHypotenuse(worldLocation.getWorldLocation());
            })).orElse(null);
            if (llllIllllIIIII(worldPoint)) {
                System.out.println("Player: " + String.valueOf(worldLocation.getWorldLocation()) + String.valueOf(a.get(llIIIlllllIl[1]).getWorldLocation()));
                Movement.setDestination(worldPoint);
                return llIIIlllllIl[2];
            }
            System.out.println(llIIIllllIll[llIIIlllllIl[5]]);
        }
        return llIIIlllllIl[2];
    }

    private List<NPC> a(Client client) {
        e eVar = e.values()[f.p()];
        return (List) NPCs.getAll().stream().filter(npc -> {
            return Arrays.stream(eVar.h()).anyMatch(bVar -> {
                if (llllIlllIllllI(Arrays.stream(bVar.c()).anyMatch(i -> {
                    if (llllIllllIIlll(i, npc.getId())) {
                        ?? r0 = llIIIlllllIl[2];
                        "".length();
                        return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIlllllIl[1];
                }) ? 1 : 0) && llllIlllIlllIl(n.g(npc) ? 1 : 0)) {
                    ?? r0 = llIIIlllllIl[2];
                    "".length();
                    return ((94 ^ 85) ^ (83 ^ 92)) < ((((63 + 121) - 87) + 34) ^ (((47 + 96) - 68) + 60)) ? ((191 ^ 187) ^ (151 ^ 139)) & (((((58 + 143) - 163) + 121) ^ (((124 + 80) - 162) + 93)) ^ (-" ".length())) : r0;
                }
                return llIIIlllllIl[1];
            });
        }).collect(Collectors.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean b(TileObject tileObject) {
        return llIIIlllllIl[2];
    }

    private static void llllIlllIlIIIl() {
        llIIIllllIll = new String[llIIIlllllIl[4]];
        llIIIllllIll[llIIIlllllIl[1]] = llllIlllIIllll("HxxFKR4mXhFtHy0cAW0FJ1kCKAVoGEU+EC4cRT4BJw1L", "HyeMq");
        llIIIllllIll[llIIIlllllIl[2]] = llllIlllIlIIII("2SyGvUY+OGswisZF82UHFg==", "LKwVK");
        llIIIllllIll[llIIIlllllIl[5]] = llllIlllIIllll("IxANAk9NUQUSAxw=", "pqkgo");
    }

    @Inject
    public l(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.ag = fVar;
        this.ah = squireFightCavesConfig;
        this.ai = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int a(WorldPoint worldPoint, Client client, List<NPC> list) {
        int i;
        int i2 = llIIIlllllIl[1];
        Tile a = a(client, worldPoint);
        if (llllIlllIlllIl(a(a) ? 1 : 0)) {
            return Integer.MIN_VALUE;
        }
        int i3 = i2 + 100;
        if (llllIlllIlllIl(c(a, client) ? 1 : 0)) {
            i = i3 - 500;
            "".length();
            if ((-(52 ^ 48)) > 0) {
                return (6 ^ 68) & ((99 ^ 33) ^ (-1));
            }
        } else {
            i = i3 + 200;
        }
        for (NPC npc : list) {
            i += Math.max(llIIIlllllIl[1], llIIIlllllIl[6] - worldPoint.distanceTo(npc.getWorldLocation()));
            "".length();
            if (((205 ^ 174) & ((124 ^ 31) ^ (-1))) >= (159 ^ 155)) {
                return (2 ^ 5) & ((144 ^ 151) ^ (-1));
            }
        }
        WorldPoint worldLocation = client.getLocalPlayer().getWorldLocation();
        if (!llllIllllIIllI(worldPoint.getX(), worldLocation.getX()) || llllIllllIIlll(worldPoint.getY(), worldLocation.getY())) {
            i += 50;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(Tile tile, List<NPC> list) {
        if (llllIlllIlllIl(b(tile, Static.getClient()) ? 1 : 0)) {
            return llIIIlllllIl[1];
        }
        for (NPC npc : list) {
            if (llllIlllIllllI(b(npc) ? 1 : 0) && llllIlllIllllI(a(tile.getWorldLocation(), npc.getWorldLocation()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            if ((!llllIlllIlllIl(c(npc) ? 1 : 0) || llllIlllIllllI(d(npc) ? 1 : 0)) && llllIlllIllllI(a(tile, npc, Static.getClient()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            "".length();
            if ((132 ^ 128) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIlllllIl[2];
    }

    private static boolean llllIllllIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIllllIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIllllIlIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    private boolean z() {
        f fVar = this.ag;
        "".length();
        e eVar = e.values()[f.p()];
        List<NPC> all = NPCs.getAll();
        b[] h2 = eVar.h();
        int length = h2.length;
        int lllllllllllllllIlIlIIIIlIllIllll = llIIIlllllIl[1];
        while (llllIllllIlIII(lllllllllllllllIlIlIIIIlIllIllll, length)) {
            b bVar = h2[lllllllllllllllIlIlIIIIlIllIllll];
            for (NPC npc : all) {
                n nVar = this.ai;
                "".length();
                boolean g = n.g(npc);
                boolean a = a(bVar);
                PrintStream printStream = System.out;
                int id = npc.getId();
                byte lllllllllllllllIlIlIIIIlIllIlIll = g ? 1 : 0;
                printStream.println("NPC ID: " + id + " isSafeSpotted: " + lllllllllllllllIlIlIIIIlIllIlIll + " shouldSafeSpot: " + a);
                if (llllIlllIllllI(Arrays.stream(bVar.c()).anyMatch(i -> {
                    if (llllIllllIIlll(i, npc.getId())) {
                        ?? r0 = llIIIlllllIl[2];
                        "".length();
                        return " ".length() < 0 ? ((98 ^ 47) ^ (98 ^ 101)) & (((225 ^ 140) ^ (75 ^ 108)) ^ (-" ".length())) : r0;
                    }
                    return llIIIlllllIl[1];
                }) ? 1 : 0) && llllIlllIlllIl(g ? 1 : 0)) {
                    return a;
                }
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (true ^ true) & ((false ^ true) ^ true);
                }
            }
            lllllllllllllllIlIlIIIIlIllIllll++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIlllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean d(NPC npc) {
        if (llllIllllIlIll(b.a(npc.getId()).b(), a.MAGIC)) {
            ?? r0 = llIIIlllllIl[2];
            "".length();
            return "   ".length() <= ((157 ^ 129) & ((189 ^ 161) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlllllIl[1];
    }

    static {
        llllIlllIllIll();
        llllIlllIlIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    private boolean b(Tile tile, Client client) {
        int x = tile.getSceneLocation().getX();
        int lllllllllllllllIlIlIIIIlIIlIlIII = tile.getSceneLocation().getY();
        int plane = client.getPlane();
        if (llllIllllIIIII(client.getCollisionMaps()) && llllIllllIlIIl(plane) && !llllIllllIlIlI(plane, client.getCollisionMaps().length)) {
            int[][] flags = client.getCollisionMaps()[plane].getFlags();
            if (llllIllllIlIIl(x) && llllIllllIlIIl(lllllllllllllllIlIlIIIIlIIlIlIII) && llllIllllIlIII(x, flags.length) && !llllIllllIlIlI(lllllllllllllllIlIlIIIIlIIlIlIII, flags[x].length)) {
                if (llllIlllIlllIl(flags[x][lllllllllllllllIlIlIIIIlIIlIlIII])) {
                    ?? r0 = llIIIlllllIl[2];
                    "".length();
                    return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIlllllIl[1];
            }
            return llIIIlllllIl[1];
        }
        return llIIIlllllIl[1];
    }

    private static boolean llllIlllIllllI(int i) {
        return i != 0;
    }

    private Optional<WorldPoint> a(List<WorldPoint> list, Client client, WorldPoint worldPoint, List<NPC> list2) {
        return list.stream().min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(worldPoint);
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    private boolean A() {
        Client client = Static.getClient();
        if (llllIlllIlllll(client.getBoostedSkillLevel(Skill.HITPOINTS), (int) (0.05d * client.getRealSkillLevel(Skill.HITPOINTS)))) {
            ?? r0 = llIIIlllllIl[2];
            "".length();
            return " ".length() < 0 ? ((((109 + 219) - 81) + 6) ^ (((87 + 48) - (-19)) + 39)) & (((((86 + 121) - 136) + 98) ^ (((57 + 72) - 39) + 59)) ^ (-" ".length())) : r0;
        }
        return llIIIlllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean b(Tile tile) {
        if (!llllIllllIIIlI(tile.getWallObject()) || llllIlllIllllI(Arrays.stream(tile.getGameObjects()).anyMatch((v0) -> {
            return Objects.nonNull(v0);
        }) ? 1 : 0)) {
            ?? r0 = llIIIlllllIl[2];
            "".length();
            return (-(120 ^ 124)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlllllIl[1];
    }
}
