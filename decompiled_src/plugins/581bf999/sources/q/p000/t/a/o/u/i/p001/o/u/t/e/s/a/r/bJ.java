package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging lightning", priority = 50, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bJ  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bJ.class */
public class bJ extends bM {
    private /* synthetic */ int gC;
    @Inject
    private /* synthetic */ bL gB;
    private static /* synthetic */ String[] llIIllIIlll;
    private static final /* synthetic */ int gy;
    private static final /* synthetic */ int gv;
    private final /* synthetic */ Map<GraphicsObject, Integer> gA;
    @Inject
    private /* synthetic */ C0060i i;
    private static /* synthetic */ int[] llIIllIlIII;
    private static final /* synthetic */ int gz;
    private static final /* synthetic */ Point gw;
    private static final /* synthetic */ int gx;

    static {
        lIlIIIlIlIIIlI();
        lIlIIIlIlIIIIl();
        gz = llIIllIlIII[3];
        gx = llIIllIlIII[1];
        gv = llIIllIlIII[2];
        gy = llIIllIlIII[4];
        gw = new Point(llIIllIlIII[11], llIIllIlIII[12]);
    }

    private static boolean lIlIIIlIlIlIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIIIlIIllllI(String llllllllllllllllIIllllIIIlIlllll, String llllllllllllllllIIllllIIIlIllIIl) {
        String llllllllllllllllIIllllIIIlIlllll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllllIIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllllIIIlIlllIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIllllIIIlIllIIl.toCharArray();
        int llllllllllllllllIIllllIIIlIllIll = llIIllIlIII[0];
        char[] charArray2 = llllllllllllllllIIllllIIIlIlllll2.toCharArray();
        int length = charArray2.length;
        int i = llIIllIlIII[0];
        while (lIlIIIlIlIIlll(i, length)) {
            char llllllllllllllllIIllllIIIllIIIII = charArray2[i];
            llllllllllllllllIIllllIIIlIlllIl.append((char) (llllllllllllllllIIllllIIIllIIIII ^ charArray[llllllllllllllllIIllllIIIlIllIll % charArray.length]));
            "".length();
            llllllllllllllllIIllllIIIlIllIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllllIIIlIlllIl);
    }

    private static boolean lIlIIIlIlIIlIl(int i, int i2) {
        return i == i2;
    }

    private static void lIlIIIlIlIIIIl() {
        llIIllIIlll = new String[llIIllIlIII[13]];
        llIIllIIlll[llIIllIlIII[0]] = lIlIIIlIIllllI("GTc+VjY5eCsYeSI2ORc/MngvGDYiPyJWLT40L1YtOHgiFy8yeD4ZeTo3PBM=", "WXJvY");
        llIIllIIlll[llIIllIlIII[6]] = lIlIIIlIIlllll("Q29MUdDnUPNZUfg+mFsseN+SHqBeL4l0veZSBc19taqrQ8rv2QZ328s1HQnx4XPzKIeOJ2bzM0o=", "XeuoQ");
        llIIllIIlll[llIIllIlIII[5]] = lIlIIIlIlIIIII("cucK0Gw1jDndhjbWnuSSCy2TjPnX2PyqgBbQUJL64i+/QoZ0AvK7SPRqUI3+BHgJyWKzjvM3RLz668Vj0z++xdUXuX/2UXWt", "LXJnN");
        llIIllIIlll[llIIllIlIII[7]] = lIlIIIlIIlllll("Edrk+IaqWZX+JVYKiOy4YodvgcjIYLIVMqX2v7yaSEiY64j4Rq77/Q==", "daJCy");
        llIIllIIlll[llIIllIlIII[3]] = lIlIIIlIIlllll("c19O4uCSKBIZkJLfwMqtSG+sfVceDaIlOnTIpBEl74Dfls5A7bv0m0KIE13c1VHWCFyjQCvuR1s=", "PtHox");
    }

    private int b(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        return ((Integer) Optional.ofNullable(map.get(worldPoint)).map((v0) -> {
            return v0.getFrame();
        }).orElse(Integer.valueOf(llIIllIlIII[10]))).intValue();
    }

    private static boolean lIlIIIlIlIlIlI(int i, int i2) {
        return i >= i2;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (lIlIIIlIlIIlIl(graphicsObject.getId(), llIIllIlIII[2])) {
            this.gA.put(graphicsObject, Integer.valueOf(this.cu.getTickCount() + llIIllIlIII[7]));
            "".length();
            return;
        }
        this.gA.put(graphicsObject, Integer.valueOf(this.cu.getTickCount() + llIIllIlIII[8]));
        "".length();
    }

    private int a(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        boolean equals = worldPoint.equals(Players.getLocal().getWorldLocation());
        int b = b(map, worldPoint);
        return (lIlIIIlIlIIIll(equals ? 1 : 0) && lIlIIIlIlIlIlI(b, llIIllIlIII[9])) ? llIIllIlIII[10] : b;
    }

    private static String lIlIIIlIIlllll(String llllllllllllllllIIllllIIIIllllIl, String llllllllllllllllIIllllIIIIllllII) {
        try {
            SecretKeySpec llllllllllllllllIIllllIIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIIIllllII.getBytes(StandardCharsets.UTF_8)), llIIllIlIII[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIlIII[5], llllllllllllllllIIllllIIIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIIIIlllIIl) {
            llllllllllllllllIIllllIIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlll(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected bJ(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.gA = new HashMap();
    }

    private static boolean lIlIIIlIlIIIll(int i) {
        return i == 0;
    }

    private static boolean lIlIIIlIlIIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (lIlIIIlIlIIIll(cq() ? 1 : 0)) {
            return llIIllIlIII[0];
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (GraphicsObject graphicsObject : this.cu.getGraphicsObjects()) {
            WorldPoint fromLocal = WorldPoint.fromLocal(this.cu, graphicsObject.getLocation());
            if (lIlIIIlIlIIlIl(graphicsObject.getId(), llIIllIlIII[1])) {
                hashSet2.add(fromLocal);
                "".length();
                "".length();
                if ("  ".length() == "   ".length()) {
                    return (true ^ true) & (true ^ true);
                }
            } else {
                if (lIlIIIlIlIIlIl(graphicsObject.getId(), llIIllIlIII[2]) && lIlIIIlIlIIllI(graphicsObject.getFrame(), llIIllIlIII[3])) {
                    hashSet.add(fromLocal);
                    "".length();
                }
                if (lIlIIIlIlIIlIl(graphicsObject.getId(), llIIllIlIII[2])) {
                    "".length();
                    if ((-" ".length()) >= "   ".length()) {
                        return ((((132 + 185) - 265) + 138) ^ (((168 + 174) - 310) + 155)) & (((168 ^ 148) ^ (86 ^ 111)) ^ (-" ".length()));
                    }
                } else {
                    if (lIlIIIlIlIIlll(graphicsObject.getFrame(), llIIllIlIII[4])) {
                        hashMap.put(fromLocal, graphicsObject);
                        "".length();
                    }
                    "".length();
                    if (" ".length() == ((199 ^ 131) & ((34 ^ 102) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        Comparator thenComparingDouble = Comparator.comparingDouble(obj -> {
            return a((Map<WorldPoint, GraphicsObject>) hashMap, (WorldPoint) obj);
        }).thenComparingDouble(obj2 -> {
            return ((WorldPoint) obj2).distanceToHypotenuse(co().getWorldArea().getCenter());
        });
        WorldPoint worldPoint = (WorldPoint) worldLocation.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (lIlIIIlIlIIIll(hashSet.contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIllIlIII[6];
                "".length();
                return "  ".length() < 0 ? ((((71 + 90) - 65) + 56) ^ (((67 + 2) - 15) + 104)) & (((70 ^ 102) ^ (125 ^ 91)) ^ (-" ".length())) : r0;
            }
            return llIIllIlIII[0];
        }).filter(worldPoint3 -> {
            if (lIlIIIlIlIIlIl(a(gw).getWorldY(), worldPoint3.getWorldY())) {
                ?? r0 = llIIllIlIII[6];
                "".length();
                return " ".length() <= 0 ? ((78 ^ 113) ^ (106 ^ 31)) & (((243 ^ 150) ^ (132 ^ 171)) ^ (-" ".length())) : r0;
            }
            return llIIllIlIII[0];
        }).filter(Reachable::isWalkable).min(thenComparingDouble).orElse(null);
        int a = a((Map<WorldPoint, GraphicsObject>) hashMap, worldLocation);
        if (lIlIIIlIlIIIll(hashSet.contains(worldLocation) ? 1 : 0) && lIlIIIlIlIlIII(a, llIIllIlIII[3])) {
            Log.info(llIIllIIlll[llIIllIlIII[0]]);
            return llIIllIlIII[0];
        }
        if (lIlIIIlIlIlIIl(worldPoint)) {
            if (lIlIIIlIlIIIll(hashSet.contains(worldLocation) ? 1 : 0)) {
                Log.info(llIIllIIlll[llIIllIlIII[6]]);
                return llIIllIlIII[0];
            }
            Log.info(llIIllIIlll[llIIllIlIII[5]]);
            worldPoint = (WorldPoint) worldLocation.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint4 -> {
                if (lIlIIIlIlIIIll(worldPoint4.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = llIIllIlIII[6];
                    "".length();
                    return (-"   ".length()) > 0 ? (true ^ true) & (true ^ true) : r0;
                }
                return llIIllIlIII[0];
            }).filter(worldPoint5 -> {
                if (lIlIIIlIlIIIll(hashSet.contains(worldPoint5) ? 1 : 0)) {
                    ?? r0 = llIIllIlIII[6];
                    "".length();
                    return ((14 ^ 5) & ((60 ^ 55) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIlIII[0];
            }).filter(worldPoint6 -> {
                if (lIlIIIlIlIIlIl(a(gw).getWorldY(), worldPoint6.getWorldY())) {
                    ?? r0 = llIIllIlIII[6];
                    "".length();
                    return "  ".length() < (-" ".length()) ? ((171 ^ 193) ^ (12 ^ 112)) & (((128 ^ 198) ^ (121 ^ 41)) ^ (-" ".length())) : r0;
                }
                return llIIllIlIII[0];
            }).filter(Reachable::isWalkable).min(thenComparingDouble).orElse(null);
            if (lIlIIIlIlIlIIl(worldPoint)) {
                Log.info(llIIllIIlll[llIIllIlIII[7]]);
                return llIIllIlIII[0];
            }
        }
        if (!lIlIIIlIlIIlII(worldPoint.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination(worldPoint);
            this.gC = this.cu.getTickCount();
            return llIIllIlIII[6];
        }
        Log.info(llIIllIIlll[llIIllIlIII[3]]);
        if (lIlIIIlIlIIllI(a, llIIllIlIII[8])) {
            ?? r0 = llIIllIlIII[6];
            "".length();
            return "  ".length() == (((((210 + 16) - 202) + 230) ^ (((113 + 11) - 23) + 90)) & (((((153 + 212) - 163) + 39) ^ (((136 + 6) - 100) + 134)) ^ (-" ".length()))) ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
        }
        return llIIllIlIII[0];
    }

    private static void lIlIIIlIlIIIlI() {
        llIIllIlIII = new int[15];
        llIIllIlIII[0] = (64 ^ 19) & ((216 ^ 139) ^ (-1));
        llIIllIlIII[1] = (-12873) & 15069;
        llIIllIlIII[2] = (-((-13491) & 30643)) & (-13313) & 32715;
        llIIllIlIII[3] = (205 ^ 159) ^ (62 ^ 104);
        llIIllIlIII[4] = 7 ^ 10;
        llIIllIlIII[5] = "  ".length();
        llIIllIlIII[6] = " ".length();
        llIIllIlIII[7] = "   ".length();
        llIIllIlIII[8] = 182 ^ 176;
        llIIllIlIII[9] = 128 ^ 138;
        llIIllIlIII[10] = -" ".length();
        llIIllIlIII[11] = (28 ^ 97) ^ (204 ^ 174);
        llIIllIlIII[12] = 124 ^ 89;
        llIIllIlIII[13] = 168 ^ 173;
        llIIllIlIII[14] = (11 ^ 103) ^ (17 ^ 117);
    }

    private static String lIlIIIlIlIIIII(String llllllllllllllllIIllllIIIlIIlIlI, String llllllllllllllllIIllllIIIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllllIIIlIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllllIIIlIIllII.init(llIIllIlIII[5], secretKeySpec);
            return new String(llllllllllllllllIIllllIIIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIIIlIIlIll) {
            llllllllllllllllIIllllIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlII(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIlIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean c(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        if (lIlIIIlIlIIlll(a(map, worldPoint), llIIllIlIII[3])) {
            ?? r0 = llIIllIlIII[6];
            "".length();
            return (-(197 ^ 193)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIlIII[0];
    }
}
