package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/m.class */
public class C0064m {
    private /* synthetic */ NPC ak;
    private /* synthetic */ int am;
    private static final /* synthetic */ int ae;
    public static final /* synthetic */ int ad;
    private static /* synthetic */ int[] llIIlIIIIIl;
    private static /* synthetic */ String[] llIIlIIIIII;
    private /* synthetic */ GameObject al;
    private /* synthetic */ int aj;
    private /* synthetic */ boolean an;
    @Inject
    private /* synthetic */ Client ai;
    private final /* synthetic */ Queue<EnumC0065n> af = new LinkedList();
    private final /* synthetic */ Set<TileObject> ag = new HashSet();
    private final /* synthetic */ List<NPC> ah = new ArrayList();

    static {
        lIIllllllIlllI();
        lIIllllllIllIl();
        ad = llIIlIIIIIl[7];
        ae = llIIlIIIIIl[2];
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        TileObject gameObject = gameObjectSpawned.getGameObject();
        if (lIIlllllllIIll(gameObject.getId(), llIIlIIIIIl[2])) {
            this.ag.add(gameObject);
            "".length();
        }
        EnumC0065n e = EnumC0065n.e(gameObject.getId());
        if (lIIlllllllIlII(e)) {
            this.af.add(e);
            "".length();
            this.am = this.ai.getTickCount();
        }
        if (lIIlllllllIIll(gameObject.getId(), llIIlIIIIIl[7])) {
            this.al = gameObject;
        }
    }

    private static boolean lIIlllllllIllI(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (lIIlllllllIIll(gameObject.getId(), llIIlIIIIIl[2])) {
            this.ag.remove(gameObject);
            "".length();
        }
        if (lIIlllllllIIll(gameObject.getId(), llIIlIIIIIl[7])) {
            this.al = null;
        }
    }

    private static String lIIllllllIllII(String llllllllllllllllIlIIIIIlIIIlIIll, String llllllllllllllllIlIIIIIlIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIIIIIl[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIIIl[12], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIlIIIlIlII) {
            llllllllllllllllIlIIIIIlIIIlIlII.printStackTrace();
            return null;
        }
    }

    public boolean K() {
        return this.an;
    }

    public void w() {
        Set<TileObject> set = this.ag;
        int[] iArr = new int[llIIlIIIIIl[0]];
        iArr[llIIlIIIIIl[1]] = llIIlIIIIIl[2];
        set.addAll(TileObjects.getAll(iArr));
        "".length();
        this.af.clear();
    }

    private static boolean lIIlllllllIIII(int i, int i2) {
        return i > i2;
    }

    private static void lIIllllllIllIl() {
        llIIlIIIIII = new String[llIIlIIIIIl[13]];
        llIIlIIIIII[llIIlIIIIIl[1]] = lIIllllllIlIll("w4/LAeL6Aim7K9rZIiH71ejtk0WfdM2Z", "ZFXAa");
        llIIlIIIIII[llIIlIIIIIl[0]] = lIIllllllIllII("Bfcv5tmK593P4h/Dy1utQrwXV0KAtSPx", "FAggq");
        llIIlIIIIII[llIIlIIIIIl[12]] = lIIllllllIllII("CyFmMr7Yk/rL9fymn+07YA==", "LjozP");
    }

    public Queue<EnumC0065n> G() {
        return this.af;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIIlllllllIIll(npcDespawned.getNpc().getId(), llIIlIIIIIl[11])) {
            this.ah.remove(npcDespawned.getNpc());
            "".length();
        }
    }

    private static boolean lIIlllllllIIll(int i, int i2) {
        return i == i2;
    }

    private static String lIIllllllIlIll(String llllllllllllllllIlIIIIIlIIIIIllI, String llllllllllllllllIlIIIIIlIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIIIlIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIIIlIIIIlIII.init(llIIlIIIIIl[12], secretKeySpec);
            return new String(llllllllllllllllIlIIIIIlIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIlIIIIIlll) {
            llllllllllllllllIlIIIIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllllIIIl(int i, int i2) {
        return i <= i2;
    }

    public NPC J() {
        return this.ak;
    }

    public List<NPC> I() {
        return this.ah;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIIlllllllIlIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            w();
        }
    }

    private static void lIIllllllIlllI() {
        llIIlIIIIIl = new int[15];
        llIIlIIIIIl[0] = " ".length();
        llIIlIIIIIl[1] = ((0 ^ 19) ^ (239 ^ 156)) & (((22 ^ 60) ^ (137 ^ 195)) ^ (-" ".length()));
        llIIlIIIIIl[2] = (-1601) & 47055;
        llIIlIIIIIl[3] = (-20517) & 22775;
        llIIlIIIIIl[4] = (-29190) & 31447;
        llIIlIIIIIl[5] = (-((-2117) & 7493)) & (-25125) & 32757;
        llIIlIIIIIl[6] = (-(1 ^ 34)) & (-8457) & 10746;
        llIIlIIIIIl[7] = (-((-9345) & 27843)) & (-1025) & 64990;
        llIIlIIIIIl[8] = (-4242) & 16031;
        llIIlIIIIIl[9] = (-16833) & 28623;
        llIIlIIIIIl[10] = (-((-3354) & 24061)) & (-13) & 32511;
        llIIlIIIIIl[11] = (-((-499) & 5110)) & (-16385) & 32703;
        llIIlIIIIIl[12] = "  ".length();
        llIIlIIIIIl[13] = "   ".length();
        llIIlIIIIIl[14] = (((121 + 9) - 67) + 72) ^ (((84 + 122) - 74) + 11);
    }

    public Set<TileObject> H() {
        return this.ag;
    }

    private static boolean lIIlllllllIIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlllllllIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllllIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (!lIIllllllIllll(npcSpawned.getNpc().getId(), llIIlIIIIIl[8]) || !lIIllllllIllll(npcSpawned.getNpc().getId(), llIIlIIIIIl[9]) || lIIlllllllIIll(npcSpawned.getNpc().getId(), llIIlIIIIIl[10])) {
            this.ak = npcSpawned.getNpc();
            this.af.clear();
        }
        if (lIIlllllllIIll(npcSpawned.getNpc().getId(), llIIlIIIIIl[11])) {
            this.ah.add(npcSpawned.getNpc());
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIIlllllllIllI(message.contains(llIIlIIIIII[llIIlIIIIIl[1]]) ? 1 : 0)) {
            this.an = llIIlIIIIIl[0];
            "".length();
            if ("   ".length() < 0) {
            }
        } else if (!lIIlllllllIllI(message.contains(llIIlIIIIII[llIIlIIIIIl[0]]) ? 1 : 0)) {
            if (lIIlllllllIllI(message.contains(llIIlIIIIII[llIIlIIIIIl[12]]) ? 1 : 0)) {
                this.af.clear();
            }
        } else {
            this.an = llIIlIIIIIl[1];
            "".length();
            if (0 != 0) {
            }
        }
    }

    private static boolean lIIllllllIllll(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint.fromLocal(this.ai, graphicsObjectCreated.getGraphicsObject().getLocation());
        int llllllllllllllllIlIIIIIlIIllllII = this.ai.getTickCount();
        int id = graphicsObjectCreated.getGraphicsObject().getId();
        if ((lIIllllllIllll(id, llIIlIIIIIl[3]) && lIIllllllIllll(id, llIIlIIIIIl[4]) && lIIllllllIllll(id, llIIlIIIIIl[5]) && lIIllllllIllll(id, llIIlIIIIIl[6])) || !lIIlllllllIIII(llllllllllllllllIlIIIIIlIIllllII - this.aj, llIIlIIIIIl[0]) || lIIlllllllIIIl(llllllllllllllllIlIIIIIlIIllllII - this.am, llIIlIIIIIl[0])) {
            return;
        }
        this.aj = llllllllllllllllIlIIIIIlIIllllII;
        if (lIIlllllllIIlI(this.af.isEmpty() ? 1 : 0)) {
            this.af.remove();
            "".length();
        }
    }
}
