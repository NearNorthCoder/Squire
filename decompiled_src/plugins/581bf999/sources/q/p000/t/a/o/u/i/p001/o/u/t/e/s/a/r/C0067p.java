package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/p.class */
public class C0067p {
    private static final /* synthetic */ int ar;
    private static final /* synthetic */ int ap;
    private /* synthetic */ int aN;
    private static final /* synthetic */ int az;
    private static final /* synthetic */ int av;
    private static /* synthetic */ String[] llIIIlIlIll;
    private static final /* synthetic */ int ay;
    private static final /* synthetic */ int au;
    private static final /* synthetic */ int aq;
    private static final /* synthetic */ int as;
    private static final /* synthetic */ int aw;
    private final /* synthetic */ Client aK;
    private static final /* synthetic */ int ao;
    private /* synthetic */ int aL;
    private /* synthetic */ int aM;
    private static /* synthetic */ int[] llIIIlIllII;
    private static final /* synthetic */ int at;
    private static final /* synthetic */ int ax;
    private final /* synthetic */ Map<GroundObject, Integer> aA = new HashMap();
    private final /* synthetic */ Set<GroundObject> aB = new HashSet();
    private final /* synthetic */ Queue<WorldPoint> aC = new LinkedList();
    private final /* synthetic */ List<Projectile> aD = new ArrayList();
    private final /* synthetic */ List<Projectile> aE = new ArrayList();
    private final /* synthetic */ Set<GroundObject> aF = new HashSet();
    private final /* synthetic */ List<WorldPoint> aG = new ArrayList();
    private final /* synthetic */ Set<GameObject> aH = new HashSet();
    private final /* synthetic */ Map<GroundObject, Integer> aI = new HashMap();
    private final /* synthetic */ Map<GroundObject, Integer> aJ = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        int tickCount = this.aK.getTickCount();
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[7])) {
            if (lIIllllIIIlllI(tickCount - this.aM, llIIIlIllII[8])) {
                this.aC.clear();
            }
            this.aM = tickCount;
            this.aC.add(gameObjectSpawned.getTile().getWorldLocation());
            "".length();
        }
        if (lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[9]) && lIIllllIIlIlII(this.aN, tickCount)) {
            this.aN = tickCount;
            this.aG.clear();
        }
        if (lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[10])) {
            this.aH.add(gameObject);
            "".length();
        }
        Iterator<GroundObject> it = this.aI.keySet().iterator();
        do {
            if (lIIllllIIlIlIl(it.hasNext() ? 1 : 0)) {
                GroundObject next = it.next();
                if (lIIllllIIlIlIl(next.getWorldLocation().equals(gameObject.getWorldLocation()) ? 1 : 0)) {
                    this.aI.remove(next);
                    "".length();
                    "".length();
                    if ((((86 ^ 114) ^ (15 ^ 96)) & (((((136 + 246) - 310) + 181) ^ (((88 + 142) - 143) + 95)) ^ (-" ".length()))) < 0) {
                        return;
                    }
                } else {
                    "".length();
                }
            }
            for (GroundObject groundObject : this.aJ.keySet()) {
                if (lIIllllIIlIlIl(groundObject.getWorldLocation().equals(gameObject.getWorldLocation()) ? 1 : 0)) {
                    this.aJ.remove(groundObject);
                    "".length();
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                    return;
                }
                "".length();
                if (((47 ^ 97) & ((67 ^ 13) ^ (-1))) > 0) {
                    return;
                }
            }
            return;
        } while (0 == 0);
    }

    public Queue<WorldPoint> R() {
        return this.aC;
    }

    private static boolean lIIllllIIlIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int Z() {
        return this.aL;
    }

    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (lIIllllIIIlllI(groundObject.getId(), llIIIlIllII[1]) && lIIllllIIIllll(groundObject.getId(), llIIIlIllII[2])) {
            this.aA.put(groundObject, Integer.valueOf(f(groundObject.getId())));
            "".length();
        }
        if (lIIllllIIlIIII(groundObject.getId(), llIIIlIllII[1])) {
            this.aF.add(groundObject);
            "".length();
        }
        if (lIIllllIIlIIIl(groundObject.getId(), llIIIlIllII[3]) && lIIllllIIlIIlI(groundObject.getId(), llIIIlIllII[4])) {
            this.aJ.put(groundObject, Integer.valueOf((llIIIlIllII[5] + groundObject.getId()) - llIIIlIllII[3]));
            "".length();
        }
        if (lIIllllIIlIIIl(groundObject.getId(), llIIIlIllII[4]) && lIIllllIIlIIlI(groundObject.getId(), llIIIlIllII[6])) {
            this.aI.put(groundObject, Integer.valueOf((llIIIlIllII[5] + groundObject.getId()) - llIIIlIllII[4]));
            "".length();
        }
    }

    @Inject
    public C0067p(Client client) {
        this.aK = client;
    }

    private static void lIIllllIIIllIl() {
        llIIIlIllII = new int[17];
        llIIIlIllII[0] = ((157 ^ 174) ^ (251 ^ 146)) & (((21 ^ 36) ^ (24 ^ 115)) ^ (-" ".length()));
        llIIIlIllII[1] = (-20187) & 65530;
        llIIIlIllII[2] = (-19029) & 64381;
        llIIIlIllII[3] = (-17539) & 62894;
        llIIIlIllII[4] = (-((-13233) & 30649)) & (-2241) & 65021;
        llIIIlIllII[5] = " ".length();
        llIIIlIllII[6] = (-((-21419) & 23467)) & (-1601) & 49023;
        llIIIlIllII[7] = (-((-29085) & 32767)) & (-16385) & 65407;
        llIIIlIllII[8] = 183 ^ 191;
        llIIIlIllII[9] = (-((-20490) & 23099)) & (-129) & 48121;
        llIIIlIllII[10] = (-24195) & 24511;
        llIIIlIllII[11] = (-((-4698) & 24155)) & (-161) & 64955;
        llIIIlIllII[12] = (-12321) & 14586;
        llIIIlIllII[13] = (-16513) & 18659;
        llIIIlIllII[14] = 177 ^ 143;
        llIIIlIllII[15] = (-6729) & 8175;
        llIIIlIllII[16] = "  ".length();
    }

    private static boolean lIIllllIIlIlll(int i) {
        return i < 0;
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (lIIllllIIlIIll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.aA.clear();
            this.aB.clear();
            this.aG.clear();
            this.aI.clear();
            this.aJ.clear();
        }
    }

    private static boolean lIIllllIIllIII(int i) {
        return i >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public List<WorldPoint> O() {
        boolean z;
        int[] iArr = new int[llIIIlIllII[5]];
        iArr[llIIIlIllII[0]] = llIIIlIllII[1];
        List<TileObject> all = TileObjects.getAll(iArr);
        HashMap hashMap = new HashMap();
        for (TileObject tileObject : all) {
            WorldPoint worldLocation = tileObject.getWorldLocation();
            if (lIIllllIIllIIl(TileObjects.getAll(tileObject2 -> {
                if (lIIllllIIlIlIl(tileObject2.getWorldLocation().equals(tileObject.getWorldLocation()) ? 1 : 0) && lIIllllIIlIIII(tileObject2.getId(), llIIIlIllII[9])) {
                    ?? r0 = llIIIlIllII[5];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((119 ^ 11) ^ (98 ^ 1)) & (((((6 + 65) - (-24)) + 39) ^ (((14 + 60) - 57) + 136)) ^ (-" ".length())) : r0;
                }
                return llIIIlIllII[0];
            }).size())) {
                int i = llIIIlIllII[5];
                "".length();
                z = i;
                if ((-" ".length()) > 0) {
                    return null;
                }
            } else {
                z = llIIIlIllII[0];
            }
            hashMap.put(worldLocation, Boolean.valueOf(z));
            "".length();
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return lIIllllIIllIlI(hashMap.containsValue(Boolean.valueOf((boolean) llIIIlIllII[0])) ? 1 : 0) ? new ArrayList() : new C0070s(hashMap).af();
    }

    private static boolean lIIllllIIllIlI(int i) {
        return i == 0;
    }

    public void w() {
        this.aA.clear();
        this.aB.clear();
        this.aF.clear();
        this.aG.clear();
        this.aC.clear();
        this.aD.clear();
        this.aE.clear();
        this.aH.clear();
        this.aI.clear();
        this.aJ.clear();
        this.aL = llIIIlIllII[0];
        this.aM = llIIIlIllII[0];
        this.aN = llIIIlIllII[0];
    }

    private static boolean lIIllllIIlIIII(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(ProjectileMoved projectileMoved) {
        Projectile projectile = projectileMoved.getProjectile();
        if (!lIIllllIIIlllI(projectile.getEndCycle(), this.aK.getGameCycle()) && lIIllllIIlIIII(projectile.getId(), llIIIlIllII[12])) {
            this.aD.remove(projectile);
            "".length();
        }
    }

    private static String lIIllllIIIlIlI(String llllllllllllllllIlIIIlIIlIlIIIIl, String llllllllllllllllIlIIIlIIlIlIIIII) {
        String llllllllllllllllIlIIIlIIlIlIIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIlIIlIlIIIII.toCharArray();
        int llllllllllllllllIlIIIlIIlIIlllIl = llIIIlIllII[0];
        char[] charArray2 = llllllllllllllllIlIIIlIIlIlIIIIl2.toCharArray();
        int length = charArray2.length;
        int i = llIIIlIllII[0];
        while (lIIllllIIlIIlI(i, length)) {
            char llllllllllllllllIlIIIlIIlIlIIIlI = charArray2[i];
            sb.append((char) (llllllllllllllllIlIIIlIIlIlIIIlI ^ charArray[llllllllllllllllIlIIIlIIlIIlllIl % charArray.length]));
            "".length();
            llllllllllllllllIlIIIlIIlIIlllIl++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public List<Projectile> S() {
        return this.aD;
    }

    public Set<GroundObject> Q() {
        return this.aB;
    }

    private int f(int i) {
        return i - llIIIlIllII[1];
    }

    public Map<GroundObject, Integer> P() {
        return this.aA;
    }

    private static boolean lIIllllIIlIlII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIllllIIlIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIIllllIIIllII() {
        llIIIlIlIll = new String[llIIIlIllII[16]];
        llIIIlIlIll[llIIIlIllII[0]] = lIIllllIIIlIlI("EysmOzsVJ28iJQQsbz8jFWM8PyQeJg==", "pCOKK");
        llIIIlIlIll[llIIIlIllII[5]] = lIIllllIIIlIll("CEizmqsiNmU=", "OnrGw");
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.aK.getTickCount();
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[11])) {
            this.aC.clear();
        }
        if (lIIllllIIlIIII(gameObject.getId(), llIIIlIllII[10])) {
            this.aH.add(gameObject);
            "".length();
        }
    }

    public Map<GroundObject, Integer> X() {
        return this.aI;
    }

    private static boolean lIIllllIIlIlIl(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIllllIIlIIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (lIIllllIIlIlIl(message.contains(llIIIlIlIll[llIIIlIllII[0]]) ? 1 : 0)) {
            String[] split = message.split(llIIIlIlIll[llIIIlIllII[5]]);
            int parseInt = Integer.parseInt(split[llIIIlIllII[0]].substring(split[llIIIlIllII[0]].indexOf(llIIIlIllII[14]) + llIIIlIllII[5]));
            List<GroundObject> list = (List) P().keySet().stream().sorted(Comparator.comparingInt((v0) -> {
                return v0.getX();
            })).collect(Collectors.toList());
            for (GroundObject groundObject : list) {
                int intValue = P().get(groundObject).intValue();
                if (lIIllllIIlIlll(parseInt - intValue)) {
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                } else if (lIIllllIIllIII(lIIllllIIlIllI(list.stream().filter(groundObject2 -> {
                    if (lIIllllIIlIIII(groundObject2.getWorldLocation().distanceTo2D(groundObject.getWorldLocation()), llIIIlIllII[5])) {
                        ?? r0 = llIIIlIllII[5];
                        "".length();
                        return (-" ".length()) >= "  ".length() ? ((((75 + 67) - 102) + 92) ^ (((9 + 160) - 155) + 152)) & (((((34 + 62) - 86) + 134) ^ (((63 + 79) - (-17)) + 19)) ^ (-" ".length())) : r0;
                    }
                    return llIIIlIllII[0];
                }).count(), 8L))) {
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                } else {
                    this.aB.add(groundObject);
                    "".length();
                    parseInt -= intValue;
                    "".length();
                    if ("   ".length() == " ".length()) {
                        return;
                    }
                }
            }
        }
    }

    public void g(int i) {
        this.aL = i;
    }

    private static String lIIllllIIIlIll(String llllllllllllllllIlIIIlIIlIllIIIl, String llllllllllllllllIlIIIlIIlIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIIlIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIIlIllIIll.init(llIIIlIllII[16], llllllllllllllllIlIIIlIIlIllIlII);
            return new String(llllllllllllllllIlIIIlIIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIIlIllIIlI) {
            llllllllllllllllIlIIIlIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    public Set<GameObject> W() {
        return this.aH;
    }

    private static boolean lIIllllIIllIIl(int i) {
        return i > 0;
    }

    static {
        lIIllllIIIllIl();
        lIIllllIIIllII();
        au = llIIIlIllII[9];
        ay = llIIIlIllII[15];
        ao = llIIIlIllII[3];
        ar = llIIIlIllII[7];
        av = llIIIlIllII[1];
        aw = llIIIlIllII[12];
        at = llIIIlIllII[2];
        az = llIIIlIllII[10];
        ap = llIIIlIllII[4];
        as = llIIIlIllII[1];
        aq = llIIIlIllII[11];
        ax = llIIIlIllII[13];
    }

    @Subscribe
    public void a(GameTick gameTick) {
        int[] iArr = new int[llIIIlIllII[5]];
        iArr[llIIIlIllII[0]] = llIIIlIllII[1];
        if (lIIllllIIlIlIl(TileObjects.getAll(iArr).isEmpty() ? 1 : 0)) {
        }
    }

    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        GroundObject groundObject = groundObjectDespawned.getGroundObject();
        this.aA.remove(groundObject);
        "".length();
        this.aF.remove(groundObject);
        "".length();
        if (lIIllllIIlIIIl(groundObject.getId(), llIIIlIllII[3]) && lIIllllIIlIIlI(groundObject.getId(), llIIIlIllII[4])) {
            this.aJ.remove(groundObject);
            "".length();
        }
        if (lIIllllIIlIIIl(groundObject.getId(), llIIIlIllII[4]) && lIIllllIIlIIlI(groundObject.getId(), llIIIlIllII[6])) {
            this.aI.remove(groundObject);
            "".length();
        }
    }

    private static int lIIllllIIlIllI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public List<WorldPoint> V() {
        return this.aG;
    }

    private static boolean lIIllllIIIlllI(int i, int i2) {
        return i > i2;
    }

    public List<Projectile> T() {
        return this.aE;
    }

    public Map<GroundObject, Integer> Y() {
        return this.aJ;
    }

    public Set<GroundObject> U() {
        return this.aF;
    }

    private static boolean lIIllllIIIllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllllIIlIIlI(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (lIIllllIIlIIII(projectile.getId(), llIIIlIllII[12])) {
            this.aD.add(projectile);
            "".length();
        }
        if (lIIllllIIlIIII(projectile.getId(), llIIIlIllII[13])) {
            this.aE.add(projectile);
            "".length();
        }
    }
}
