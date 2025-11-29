/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bL;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.i;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging lightning", priority=50, blocking=true, register=true)
public class bJ
extends bM {
    private /* synthetic */ int gC;
    @Inject
    private /* synthetic */ bL gB;
    private static /* synthetic */ String[] llIIllIIlll;
    private static final /* synthetic */ int gy;
    private static final /* synthetic */ int gv;
    private final /* synthetic */ Map<GraphicsObject, Integer> gA;
    @Inject
    private /* synthetic */ i i;
    private static /* synthetic */ int[] llIIllIlIII;
    private static final /* synthetic */ int gz;
    private static final /* synthetic */ Point gw;
    private static final /* synthetic */ int gx;

    static {
        bJ.lIlIIIlIlIIIlI();
        bJ.lIlIIIlIlIIIIl();
        gz = llIIllIlIII[3];
        gx = llIIllIlIII[1];
        gv = llIIllIlIII[2];
        gy = llIIllIlIII[4];
        gw = new Point(llIIllIlIII[11], llIIllIlIII[12]);
    }

    private static boolean lIlIIIlIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIIIlIIllllI(String llllllllllllllllIIllllIIIlIllIlI, String llllllllllllllllIIllllIIIlIllllI) {
        llllllllllllllllIIllllIIIlIllIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIllllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllllIIIlIlllIl = new StringBuilder();
        char[] llllllllllllllllIIllllIIIlIlllII = llllllllllllllllIIllllIIIlIllllI.toCharArray();
        int llllllllllllllllIIllllIIIlIllIll = llIIllIlIII[0];
        char[] llllllllllllllllIIllllIIIlIlIlIl = llllllllllllllllIIllllIIIlIllIlI.toCharArray();
        int llllllllllllllllIIllllIIIlIlIlII = llllllllllllllllIIllllIIIlIlIlIl.length;
        int llllllllllllllllIIllllIIIlIlIIll = llIIllIlIII[0];
        while (bJ.lIlIIIlIlIIlll(llllllllllllllllIIllllIIIlIlIIll, llllllllllllllllIIllllIIIlIlIlII)) {
            char llllllllllllllllIIllllIIIllIIIII = llllllllllllllllIIllllIIIlIlIlIl[llllllllllllllllIIllllIIIlIlIIll];
            llllllllllllllllIIllllIIIlIlllIl.append((char)(llllllllllllllllIIllllIIIllIIIII ^ llllllllllllllllIIllllIIIlIlllII[llllllllllllllllIIllllIIIlIllIll % llllllllllllllllIIllllIIIlIlllII.length]));
            "".length();
            ++llllllllllllllllIIllllIIIlIllIll;
            ++llllllllllllllllIIllllIIIlIlIIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllllIIIlIlllIl);
    }

    private static boolean lIlIIIlIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIIlIlIIIIl() {
        llIIllIIlll = new String[llIIllIlIII[13]];
        bJ.llIIllIIlll[bJ.llIIllIlIII[0]] = bJ.lIlIIIlIIllllI("GTc+VjY5eCsYeSI2ORc/MngvGDYiPyJWLT40L1YtOHgiFy8yeD4ZeTo3PBM=", "WXJvY");
        bJ.llIIllIIlll[bJ.llIIllIlIII[6]] = bJ.lIlIIIlIIlllll("Q29MUdDnUPNZUfg+mFsseN+SHqBeL4l0veZSBc19taqrQ8rv2QZ328s1HQnx4XPzKIeOJ2bzM0o=", "XeuoQ");
        bJ.llIIllIIlll[bJ.llIIllIlIII[5]] = bJ.lIlIIIlIlIIIII("cucK0Gw1jDndhjbWnuSSCy2TjPnX2PyqgBbQUJL64i+/QoZ0AvK7SPRqUI3+BHgJyWKzjvM3RLz668Vj0z++xdUXuX/2UXWt", "LXJnN");
        bJ.llIIllIIlll[bJ.llIIllIlIII[7]] = bJ.lIlIIIlIIlllll("Edrk+IaqWZX+JVYKiOy4YodvgcjIYLIVMqX2v7yaSEiY64j4Rq77/Q==", "daJCy");
        bJ.llIIllIIlll[bJ.llIIllIlIII[3]] = bJ.lIlIIIlIIlllll("c19O4uCSKBIZkJLfwMqtSG+sfVceDaIlOnTIpBEl74Dfls5A7bv0m0KIE13c1VHWCFyjQCvuR1s=", "PtHox");
    }

    private int b(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        return Optional.ofNullable(map.get(worldPoint)).map(GraphicsObject::getFrame).orElse(llIIllIlIII[10]);
    }

    private static boolean lIlIIIlIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (bJ.lIlIIIlIlIIlIl(graphicsObject.getId(), llIIllIlIII[2])) {
            this.gA.put(graphicsObject, this.cu.getTickCount() + llIIllIlIII[7]);
            "".length();
            return;
        }
        this.gA.put(graphicsObject, this.cu.getTickCount() + llIIllIlIII[8]);
        "".length();
    }

    private int a(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        int n2 = worldPoint.equals((Object)Players.getLocal().getWorldLocation());
        int n3 = this.b(map, worldPoint);
        if (bJ.lIlIIIlIlIIIll(n2) && bJ.lIlIIIlIlIlIlI(n3, llIIllIlIII[9])) {
            return llIIllIlIII[10];
        }
        return n3;
    }

    private static String lIlIIIlIIlllll(String llllllllllllllllIIllllIIIIlllIll, String llllllllllllllllIIllllIIIIlllIlI) {
        try {
            SecretKeySpec llllllllllllllllIIllllIIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), llIIllIlIII[14]), "DES");
            Cipher llllllllllllllllIIllllIIIIllllll = Cipher.getInstance("DES");
            llllllllllllllllIIllllIIIIllllll.init(llIIllIlIII[5], llllllllllllllllIIllllIIIlIIIIII);
            return new String(llllllllllllllllIIllllIIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllllIIIIlllllI) {
            llllllllllllllllIIllllIIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected bJ(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gA = new HashMap<GraphicsObject, Integer>();
    }

    private static boolean lIlIIIlIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIlIIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var6_6;
        WorldPoint llllllllllllllllIIllllIIlIIlIIll;
        Object llllllllllllllllIIllllIIlIIlIlII;
        bJ llllllllllllllllIIllllIIlIIllIIl;
        if (bJ.lIlIIIlIlIIIll(this.cq() ? 1 : 0)) {
            return llIIllIlIII[0];
        }
        HashSet<WorldPoint> llllllllllllllllIIllllIIlIIllIII = new HashSet<WorldPoint>();
        HashSet<WorldPoint> llllllllllllllllIIllllIIlIIlIlll = new HashSet<WorldPoint>();
        HashMap<WorldPoint, GraphicsObject> llllllllllllllllIIllllIIlIIlIllI = new HashMap<WorldPoint, GraphicsObject>();
        Iterator llllllllllllllllIIllllIIlIIlIlIl = llllllllllllllllIIllllIIlIIllIIl.cu.getGraphicsObjects().iterator();
        while (bJ.lIlIIIlIlIIlII(llllllllllllllllIIllllIIlIIlIlIl.hasNext() ? 1 : 0)) {
            llllllllllllllllIIllllIIlIIlIlII = (GraphicsObject)llllllllllllllllIIllllIIlIIlIlIl.next();
            llllllllllllllllIIllllIIlIIlIIll = WorldPoint.fromLocal((Client)llllllllllllllllIIllllIIlIIllIIl.cu, (LocalPoint)llllllllllllllllIIllllIIlIIlIlII.getLocation());
            if (bJ.lIlIIIlIlIIlIl(llllllllllllllllIIllllIIlIIlIlII.getId(), llIIllIlIII[1])) {
                llllllllllllllllIIllllIIlIIlIlll.add(llllllllllllllllIIllllIIlIIlIIll);
                "".length();
                "".length();
                if ("  ".length() != "   ".length()) continue;
                return ((0x2E ^ 0x24) & ~(0xA ^ 0)) != 0;
            }
            if (bJ.lIlIIIlIlIIlIl(llllllllllllllllIIllllIIlIIlIlII.getId(), llIIllIlIII[2]) && bJ.lIlIIIlIlIIllI(llllllllllllllllIIllllIIlIIlIlII.getFrame(), llIIllIlIII[3])) {
                llllllllllllllllIIllllIIlIIllIII.add(llllllllllllllllIIllllIIlIIlIIll);
                "".length();
            }
            if (bJ.lIlIIIlIlIIlIl(llllllllllllllllIIllllIIlIIlIlII.getId(), llIIllIlIII[2])) {
                "".length();
                if (-" ".length() < "   ".length()) continue;
                return ((132 + 185 - 265 + 138 ^ 168 + 174 - 310 + 155) & (0xA8 ^ 0x94 ^ (0x56 ^ 0x6F) ^ -" ".length())) != 0;
            }
            if (bJ.lIlIIIlIlIIlll(llllllllllllllllIIllllIIlIIlIlII.getFrame(), llIIllIlIII[4])) {
                llllllllllllllllIIllllIIlIIlIllI.put(llllllllllllllllIIllllIIlIIlIIll, (GraphicsObject)llllllllllllllllIIllllIIlIIlIlII);
                "".length();
            }
            "".length();
            if (" ".length() != ((0xC7 ^ 0x83) & ~(0x22 ^ 0x66))) continue;
            return ((0x42 ^ 2) & ~(0xCF ^ 0x8F)) != 0;
        }
        llllllllllllllllIIllllIIlIIlIlIl = Players.getLocal().getWorldLocation();
        llllllllllllllllIIllllIIlIIlIlII = Comparator.comparingDouble(object -> this.a((Map<WorldPoint, GraphicsObject>)llllllllllllllllIIllllIIlIIlIllI, (WorldPoint)object)).thenComparingDouble(object -> ((WorldPoint)object).distanceToHypotenuse(this.co().getWorldArea().getCenter()));
        llllllllllllllllIIllllIIlIIlIIll = llllllllllllllllIIllllIIlIIlIlIl.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bJ.lIlIIIlIlIIIll(llllllllllllllllIIllllIIlIIllIII.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIllIlIII[6];
                "".length();
                if ("  ".length() < 0) {
                    return ((71 + 90 - 65 + 56 ^ 67 + 2 - 15 + 104) & (0x46 ^ 0x66 ^ (0x7D ^ 0x5B) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            boolean bl2;
            if (bJ.lIlIIIlIlIIlIl(this.a(gw).getWorldY(), worldPoint.getWorldY())) {
                bl2 = llIIllIlIII[6];
                "".length();
                if (" ".length() <= 0) {
                    return ((0x4E ^ 0x71 ^ (0x6A ^ 0x1F)) & (0xF3 ^ 0x96 ^ (0x84 ^ 0xAB) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)llllllllllllllllIIllllIIlIIlIlII).orElse(null);
        int llllllllllllllllIIllllIIlIIlIIlI = llllllllllllllllIIllllIIlIIllIIl.a(llllllllllllllllIIllllIIlIIlIllI, (WorldPoint)llllllllllllllllIIllllIIlIIlIlIl);
        if (bJ.lIlIIIlIlIIIll(llllllllllllllllIIllllIIlIIllIII.contains(llllllllllllllllIIllllIIlIIlIlIl) ? 1 : 0) && bJ.lIlIIIlIlIlIII(llllllllllllllllIIllllIIlIIlIIlI, llIIllIlIII[3])) {
            Log.info((String)llIIllIIlll[llIIllIlIII[0]]);
            return llIIllIlIII[0];
        }
        if (bJ.lIlIIIlIlIlIIl(llllllllllllllllIIllllIIlIIlIIll)) {
            if (bJ.lIlIIIlIlIIIll(llllllllllllllllIIllllIIlIIllIII.contains(llllllllllllllllIIllllIIlIIlIlIl) ? 1 : 0)) {
                Log.info((String)llIIllIIlll[llIIllIlIII[6]]);
                return llIIllIlIII[0];
            }
            Log.info((String)llIIllIIlll[llIIllIlIII[5]]);
            llllllllllllllllIIllllIIlIIlIIll = llllllllllllllllIIllllIIlIIlIlIl.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIIll(worldPoint.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bl2 = llIIllIlIII[6];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x59 ^ 0x66) & ~(0x3F ^ 0)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIIll(llllllllllllllllIIllllIIlIIllIII.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIIllIlIII[6];
                    "".length();
                    if (((0xE ^ 5) & ~(0x3C ^ 0x37)) <= -" ".length()) {
                        return ((0xB8 ^ 0xB1) & ~(0x9E ^ 0x97)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIlIl(this.a(gw).getWorldY(), worldPoint.getWorldY())) {
                    bl2 = llIIllIlIII[6];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return ((0xAB ^ 0xC1 ^ (0xC ^ 0x70)) & (0x80 ^ 0xC6 ^ (0x79 ^ 0x29) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)llllllllllllllllIIllllIIlIIlIlII).orElse(null);
            if (bJ.lIlIIIlIlIlIIl(llllllllllllllllIIllllIIlIIlIIll)) {
                Log.info((String)llIIllIIlll[llIIllIlIII[7]]);
                return llIIllIlIII[0];
            }
        }
        if (bJ.lIlIIIlIlIIlII(llllllllllllllllIIllllIIlIIlIIll.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            boolean bl2;
            Log.info((String)llIIllIIlll[llIIllIlIII[3]]);
            if (bJ.lIlIIIlIlIIllI(llllllllllllllllIIllllIIlIIlIIlI, llIIllIlIII[8])) {
                bl2 = llIIllIlIII[6];
                "".length();
                if ("  ".length() == ((210 + 16 - 202 + 230 ^ 113 + 11 - 23 + 90) & (153 + 212 - 163 + 39 ^ 136 + 6 - 100 + 134 ^ -" ".length()))) {
                    return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }
        Movement.setDestination((WorldPoint)var6_6);
        this.gC = this.cu.getTickCount();
        return llIIllIlIII[6];
    }

    private static void lIlIIIlIlIIIlI() {
        llIIllIlIII = new int[15];
        bJ.llIIllIlIII[0] = (0x40 ^ 0x13) & ~(0xD8 ^ 0x8B);
        bJ.llIIllIlIII[1] = 0xFFFFCDB7 & 0x3ADD;
        bJ.llIIllIlIII[2] = -(0xFFFFCB4D & 0x77B3) & (0xFFFFCBFF & 0x7FCB);
        bJ.llIIllIlIII[3] = 0xCD ^ 0x9F ^ (0x3E ^ 0x68);
        bJ.llIIllIlIII[4] = 7 ^ 0xA;
        bJ.llIIllIlIII[5] = "  ".length();
        bJ.llIIllIlIII[6] = " ".length();
        bJ.llIIllIlIII[7] = "   ".length();
        bJ.llIIllIlIII[8] = 0xB6 ^ 0xB0;
        bJ.llIIllIlIII[9] = 0x80 ^ 0x8A;
        bJ.llIIllIlIII[10] = -" ".length();
        bJ.llIIllIlIII[11] = 0x1C ^ 0x61 ^ (0xCC ^ 0xAE);
        bJ.llIIllIlIII[12] = 0x7C ^ 0x59;
        bJ.llIIllIlIII[13] = 0xA8 ^ 0xAD;
        bJ.llIIllIlIII[14] = 0xB ^ 0x67 ^ (0x11 ^ 0x75);
    }

    private static String lIlIIIlIlIIIII(String llllllllllllllllIIllllIIIlIIlIII, String llllllllllllllllIIllllIIIlIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIllllIIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllllIIIlIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllllIIIlIIllII.init(llIIllIlIII[5], llllllllllllllllIIllllIIIlIIllIl);
            return new String(llllllllllllllllIIllllIIIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllllIIIlIIlIll) {
            llllllllllllllllIIllllIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlIlIIl(Object object) {
        return object == null;
    }

    private boolean c(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        boolean bl2;
        if (bJ.lIlIIIlIlIIlll(this.a(map, worldPoint), llIIllIlIII[3])) {
            bl2 = llIIllIlIII[6];
            "".length();
            if (-(0xC5 ^ 0xC1) >= 0) {
                return ((0x5B ^ 0x66) & ~(0x47 ^ 0x7A)) != 0;
            }
        } else {
            bl2 = llIIllIlIII[0];
        }
        return bl2;
    }
}

