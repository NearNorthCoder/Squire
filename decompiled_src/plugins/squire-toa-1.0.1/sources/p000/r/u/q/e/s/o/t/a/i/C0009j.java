package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
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
/* renamed from: -.r.u.q.e.s.o.t.a.i.j  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/j.class */
public class C0009j {
    private static final /* synthetic */ int ac;
    private static final /* synthetic */ int Y;
    private /* synthetic */ int ao;
    private static /* synthetic */ int[] lIlIIIIIllIlI;
    private static /* synthetic */ String[] lIlIIIIIllIIl;
    private static final /* synthetic */ int R;
    private static final /* synthetic */ int S;
    private static final /* synthetic */ int V;
    private static final /* synthetic */ int X;
    private static final /* synthetic */ int aa;
    private final /* synthetic */ Client an;
    private /* synthetic */ int ap;
    private static final /* synthetic */ int U;
    private static final /* synthetic */ int W;
    private static final /* synthetic */ int Z;
    private static final /* synthetic */ int ab;
    private static final /* synthetic */ int T;
    private final /* synthetic */ Map<GroundObject, Integer> ad = new HashMap();
    private final /* synthetic */ Set<GroundObject> ae = new HashSet();
    private final /* synthetic */ Queue<WorldPoint> af = new LinkedList();
    private final /* synthetic */ List<Projectile> ag = new ArrayList();
    private final /* synthetic */ List<Projectile> ah = new ArrayList();
    private final /* synthetic */ Set<GroundObject> ai = new HashSet();
    private final /* synthetic */ List<WorldPoint> aj = new ArrayList();
    private final /* synthetic */ Set<GameObject> ak = new HashSet();
    private final /* synthetic */ Map<GroundObject, Integer> al = new HashMap();
    private final /* synthetic */ Map<GroundObject, Integer> am = new HashMap();

    private static boolean lIllIllIIllIllI(int i) {
        return i != 0;
    }

    public Set<GameObject> v() {
        return this.ak;
    }

    public Set<GroundObject> t() {
        return this.ai;
    }

    public List<Projectile> r() {
        return this.ag;
    }

    private static boolean lIllIllIIlllIII(int i) {
        return i < 0;
    }

    private static boolean lIllIllIIllIIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIllIIlIlllI();
        lIllIllIIlIllIl();
        W = lIlIIIIIllIlI[2];
        Y = lIlIIIIIllIlI[1];
        U = lIlIIIIIllIlI[7];
        S = lIlIIIIIllIlI[4];
        X = lIlIIIIIllIlI[9];
        V = lIlIIIIIllIlI[1];
        aa = lIlIIIIIllIlI[13];
        R = lIlIIIIIllIlI[3];
        ab = lIlIIIIIllIlI[15];
        ac = lIlIIIIIllIlI[10];
        T = lIlIIIIIllIlI[11];
        Z = lIlIIIIIllIlI[12];
    }

    private static boolean lIllIllIIlllIIl(int i) {
        return i >= 0;
    }

    public Map<GroundObject, Integer> o() {
        return this.ad;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        int tickCount = this.an.getTickCount();
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[7])) {
            if (lIllIllIIlIllll(tickCount - this.ao, lIlIIIIIllIlI[8])) {
                this.af.clear();
            }
            this.ao = tickCount;
            this.af.add(gameObjectSpawned.getTile().getWorldLocation());
            "".length();
        }
        if (lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[9]) && lIllIllIIllIlIl(this.ap, tickCount)) {
            this.ap = tickCount;
            this.aj.clear();
        }
        if (lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[10])) {
            this.ak.add(gameObject);
            "".length();
        }
        Iterator<GroundObject> it = this.al.keySet().iterator();
        do {
            if (lIllIllIIllIllI(it.hasNext() ? 1 : 0)) {
                GroundObject next = it.next();
                if (lIllIllIIllIllI(next.getWorldLocation().equals(gameObject.getWorldLocation()) ? 1 : 0)) {
                    this.al.remove(next);
                    "".length();
                    "".length();
                    if (((79 ^ 82) & ((175 ^ 178) ^ (-1))) <= (-" ".length())) {
                        return;
                    }
                } else {
                    "".length();
                }
            }
            for (GroundObject groundObject : this.am.keySet()) {
                if (lIllIllIIllIllI(groundObject.getWorldLocation().equals(gameObject.getWorldLocation()) ? 1 : 0)) {
                    this.am.remove(groundObject);
                    "".length();
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return;
                    }
                    return;
                }
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return;
                }
            }
            return;
        } while ((-" ".length()) < 0);
    }

    public Map<GroundObject, Integer> x() {
        return this.am;
    }

    private static void lIllIllIIlIllIl() {
        lIlIIIIIllIIl = new String[lIlIIIIIllIlI[16]];
        lIlIIIIIllIIl[lIlIIIIIllIlI[0]] = lIllIllIIlIllII("OOLv025EVqwLD6roiIreti8FOEJhHt2C", "tEaNm");
        lIlIIIIIllIIl[lIlIIIIIllIlI[5]] = lIllIllIIlIllII("dOTkaRDz+eE=", "tMRTK");
    }

    private static boolean lIllIllIIllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (lIllIllIIllIIIl(projectile.getId(), lIlIIIIIllIlI[12])) {
            this.ag.add(projectile);
            "".length();
        }
        if (lIllIllIIllIIIl(projectile.getId(), lIlIIIIIllIlI[13])) {
            this.ah.add(projectile);
            "".length();
        }
    }

    public void c() {
        this.ad.clear();
        this.ae.clear();
        this.ai.clear();
        this.aj.clear();
        this.af.clear();
        this.ag.clear();
        this.ah.clear();
        this.ak.clear();
        this.al.clear();
        this.am.clear();
        this.ao = lIlIIIIIllIlI[0];
    }

    public Set<GroundObject> p() {
        return this.ae;
    }

    private static boolean lIllIllIIlllIlI(int i) {
        return i > 0;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.an.getTickCount();
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[11])) {
            this.af.clear();
        }
        if (lIllIllIIllIIIl(gameObject.getId(), lIlIIIIIllIlI[10])) {
            this.ak.add(gameObject);
            "".length();
        }
    }

    private static boolean lIllIllIIllIlIl(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(GroundObjectSpawned groundObjectSpawned) {
        GroundObject groundObject = groundObjectSpawned.getGroundObject();
        if (lIllIllIIlIllll(groundObject.getId(), lIlIIIIIllIlI[1]) && lIllIllIIllIIII(groundObject.getId(), lIlIIIIIllIlI[2])) {
            this.ad.put(groundObject, Integer.valueOf(b(groundObject.getId())));
            "".length();
        }
        if (lIllIllIIllIIIl(groundObject.getId(), lIlIIIIIllIlI[1])) {
            this.ai.add(groundObject);
            "".length();
        }
        if (lIllIllIIllIIlI(groundObject.getId(), lIlIIIIIllIlI[3]) && lIllIllIIllIIll(groundObject.getId(), lIlIIIIIllIlI[4])) {
            this.am.put(groundObject, Integer.valueOf((lIlIIIIIllIlI[5] + groundObject.getId()) - lIlIIIIIllIlI[3]));
            "".length();
        }
        if (lIllIllIIllIIlI(groundObject.getId(), lIlIIIIIllIlI[4]) && lIllIllIIllIIll(groundObject.getId(), lIlIIIIIllIlI[6])) {
            this.al.put(groundObject, Integer.valueOf((lIlIIIIIllIlI[5] + groundObject.getId()) - lIlIIIIIllIlI[4]));
            "".length();
        }
    }

    public List<WorldPoint> u() {
        return this.aj;
    }

    @Subscribe
    public void a(ProjectileMoved projectileMoved) {
        Projectile projectile = projectileMoved.getProjectile();
        if (!lIllIllIIlIllll(projectile.getEndCycle(), this.an.getGameCycle()) && lIllIllIIllIIIl(projectile.getId(), lIlIIIIIllIlI[12])) {
            this.ag.remove(projectile);
            "".length();
        }
    }

    @Subscribe
    public void a(GroundObjectDespawned groundObjectDespawned) {
        GroundObject groundObject = groundObjectDespawned.getGroundObject();
        this.ad.remove(groundObject);
        "".length();
        this.ai.remove(groundObject);
        "".length();
        if (lIllIllIIllIIlI(groundObject.getId(), lIlIIIIIllIlI[3]) && lIllIllIIllIIll(groundObject.getId(), lIlIIIIIllIlI[4])) {
            this.am.remove(groundObject);
            "".length();
        }
        if (lIllIllIIllIIlI(groundObject.getId(), lIlIIIIIllIlI[4]) && lIllIllIIllIIll(groundObject.getId(), lIlIIIIIllIlI[6])) {
            this.al.remove(groundObject);
            "".length();
        }
    }

    @Inject
    public C0009j(Client client) {
        this.an = client;
    }

    public List<Projectile> s() {
        return this.ah;
    }

    private static boolean lIllIllIIllIIlI(int i, int i2) {
        return i >= i2;
    }

    private int b(int i) {
        return i - lIlIIIIIllIlI[1];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIllIIllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (lIllIllIIllIllI(message.contains(lIlIIIIIllIIl[lIlIIIIIllIlI[0]]) ? 1 : 0)) {
            String[] split = message.split(lIlIIIIIllIIl[lIlIIIIIllIlI[5]]);
            int parseInt = Integer.parseInt(split[lIlIIIIIllIlI[0]].substring(split[lIlIIIIIllIlI[0]].indexOf(lIlIIIIIllIlI[14]) + lIlIIIIIllIlI[5]));
            List<GroundObject> list = (List) o().keySet().stream().sorted(Comparator.comparingInt((v0) -> {
                return v0.getX();
            })).collect(Collectors.toList());
            for (GroundObject groundObject : list) {
                int intValue = o().get(groundObject).intValue();
                if (lIllIllIIlllIII(parseInt - intValue)) {
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                } else if (lIllIllIIlllIIl(lIllIllIIllIlll(list.stream().filter(groundObject2 -> {
                    if (lIllIllIIllIIIl(groundObject2.getWorldLocation().distanceTo2D(groundObject.getWorldLocation()), lIlIIIIIllIlI[5])) {
                        ?? r0 = lIlIIIIIllIlI[5];
                        "".length();
                        return (((((32 + 37) - (-28)) + 45) ^ (((168 + 161) - 192) + 37)) & (((((57 + 108) - 123) + 101) ^ (((146 + 9) - 20) + 40)) ^ (-" ".length()))) != 0 ? ((116 ^ 60) ^ (126 ^ 2)) & (((((55 + 70) - 121) + 131) ^ (((39 + 61) - 39) + 118)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIIIllIlI[0];
                }).count(), 8L))) {
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    this.ae.add(groundObject);
                    "".length();
                    parseInt -= intValue;
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return;
                    }
                }
            }
        }
    }

    private static int lIllIllIIllIlll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static void lIllIllIIlIlllI() {
        lIlIIIIIllIlI = new int[17];
        lIlIIIIIllIlI[0] = (179 ^ 168) & ((77 ^ 86) ^ (-1));
        lIlIIIIIllIlI[1] = (-((-289) & 19371)) & (-1042) & 65467;
        lIlIIIIIllIlI[2] = (-((-4221) & 24317)) & (-17) & 65465;
        lIlIIIIIllIlI[3] = (-(((11 + 97) - 104) + 189)) & (-2051) & 47598;
        lIlIIIIIllIlI[4] = (-19459) & 64823;
        lIlIIIIIllIlI[5] = " ".length();
        lIlIIIIIllIlI[6] = (-18433) & 63807;
        lIlIIIIIllIlI[7] = (-2211) & 47551;
        lIlIIIIIllIlI[8] = 121 ^ 113;
        lIlIIIIIllIlI[9] = (-((-4129) & 23608)) & (-641) & 65503;
        lIlIIIIIllIlI[10] = (-((-2059) & 32395)) & (-2049) & 32701;
        lIlIIIIIllIlI[11] = (-2117) & 47454;
        lIlIIIIIllIlI[12] = (-((-19153) & 31734)) & (-1537) & 16383;
        lIlIIIIIllIlI[13] = (-((-23739) & 32187)) & (-17425) & 28019;
        lIlIIIIIllIlI[14] = 44 ^ 18;
        lIlIIIIIllIlI[15] = (-8193) & 9639;
        lIlIIIIIllIlI[16] = "  ".length();
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (lIllIllIIllIlII(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.ad.clear();
            this.ae.clear();
            this.aj.clear();
            this.al.clear();
            this.am.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public List<WorldPoint> n() {
        boolean z;
        int[] iArr = new int[lIlIIIIIllIlI[5]];
        iArr[lIlIIIIIllIlI[0]] = lIlIIIIIllIlI[1];
        List<TileObject> all = TileObjects.getAll(iArr);
        HashMap hashMap = new HashMap();
        for (TileObject tileObject : all) {
            WorldPoint worldLocation = tileObject.getWorldLocation();
            if (lIllIllIIlllIlI(TileObjects.getAll(tileObject2 -> {
                if (lIllIllIIllIllI(tileObject2.getWorldLocation().equals(tileObject.getWorldLocation()) ? 1 : 0) && lIllIllIIllIIIl(tileObject2.getId(), lIlIIIIIllIlI[9])) {
                    ?? r0 = lIlIIIIIllIlI[5];
                    "".length();
                    return "   ".length() >= ((99 ^ 43) ^ (1 ^ 77)) ? ((((30 + 14) - (-67)) + 83) ^ (((65 + 127) - 65) + 26)) & (((164 ^ 138) ^ (66 ^ 55)) ^ (-" ".length())) : r0;
                }
                return lIlIIIIIllIlI[0];
            }).size())) {
                int i = lIlIIIIIllIlI[5];
                "".length();
                z = i;
                if (" ".length() != " ".length()) {
                    return null;
                }
            } else {
                z = lIlIIIIIllIlI[0];
            }
            hashMap.put(worldLocation, Boolean.valueOf(z));
            "".length();
            "".length();
            if ((-(27 ^ 31)) >= 0) {
                return null;
            }
        }
        return lIllIllIIlllIll(hashMap.containsValue(Boolean.valueOf((boolean) lIlIIIIIllIlI[0])) ? 1 : 0) ? new ArrayList() : new C0010k(hashMap).y();
    }

    private static boolean lIllIllIIllIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIllIIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIllIllIIlIllII(String llllllllllllllIlllIIlIllIlIllIIl, String llllllllllllllIlllIIlIllIlIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIlI[8]), "DES");
            Cipher llllllllllllllIlllIIlIllIlIllIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllIlIllIll.init(lIlIIIIIllIlI[16], secretKeySpec);
            return new String(llllllllllllllIlllIIlIllIlIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllIlIllIlI) {
            llllllllllllllIlllIIlIllIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlllIll(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        int[] iArr = new int[lIlIIIIIllIlI[5]];
        iArr[lIlIIIIIllIlI[0]] = lIlIIIIIllIlI[1];
        if (lIllIllIIllIllI(TileObjects.getAll(iArr).isEmpty() ? 1 : 0)) {
        }
    }

    public Queue<WorldPoint> q() {
        return this.af;
    }

    private static boolean lIllIllIIlIllll(int i, int i2) {
        return i > i2;
    }

    public Map<GroundObject, Integer> w() {
        return this.al;
    }
}
