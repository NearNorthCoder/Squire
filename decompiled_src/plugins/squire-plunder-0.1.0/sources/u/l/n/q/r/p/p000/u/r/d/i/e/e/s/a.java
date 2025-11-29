package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import com.google.common.collect.ImmutableSet;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.a  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/a.class */
public class a {
    private static final /* synthetic */ Logger g;
    private static /* synthetic */ int[] llllllIllIll;
    private final /* synthetic */ Client j;
    private static /* synthetic */ String[] llllllIllIlI;
    private final /* synthetic */ SquirePlunderConfig i;
    public final /* synthetic */ Set<Integer> h = ImmutableSet.of(Integer.valueOf(llllllIllIll[0]), Integer.valueOf(llllllIllIll[1]), Integer.valueOf(llllllIllIll[2]));
    private final /* synthetic */ List<GameObject> k = new ArrayList();
    private /* synthetic */ int l = llllllIllIll[3];
    private /* synthetic */ int m = llllllIllIll[3];

    public int d() {
        return this.l;
    }

    private static boolean lIIlIlIIlIIlIlI(Object obj) {
        return obj == null;
    }

    @Inject
    public a(SquirePlunderConfig squirePlunderConfig, Client client) {
        this.i = squirePlunderConfig;
        this.j = client;
    }

    private static String lIIlIlIIlIIIllI(String lllllllllllllllIIlIIllIlIlllIlll, String lllllllllllllllIIlIIllIlIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIlIllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIlIllllIIl.init(llllllIllIll[6], secretKeySpec);
            return new String(lllllllllllllllIIlIIllIlIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIllllIII) {
            lllllllllllllllIIlIIllIlIllllIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (!lIIlIlIIlIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), llllllIllIll[4]) && !lIIlIlIIlIIlIlI(c.f()) && lIIlIlIIlIIlIll(c.f().i().contains(gameObject) ? 1 : 0) && lIIlIlIIlIIlIll(gameObject.getName().toLowerCase().contains(llllllIllIlI[llllllIllIll[3]]) ? 1 : 0)) {
            this.k.add(gameObject);
            "".length();
        }
    }

    private static void lIIlIlIIlIIIlll() {
        llllllIllIlI = new String[llllllIllIll[5]];
        llllllIllIlI[llllllIllIll[3]] = lIIlIlIIlIIIllI("sdZOOJy3raI=", "IHqmj");
    }

    private static boolean lIIlIlIIlIIlIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean a(c cVar) {
        switch (b.n[cVar.ordinal()]) {
            case 1:
                return this.i.plunderChestOne();
            case 2:
                return this.i.plunderChestTwo();
            case 3:
                return this.i.plunderChestThree();
            case 4:
                return this.i.plunderChestFour();
            case 5:
                return this.i.plunderChestFive();
            case 6:
                return this.i.plunderChestSix();
            case 7:
                return this.i.plunderChestSeven();
            case 8:
                return this.i.plunderChestEight();
            default:
                return llllllIllIll[3];
        }
    }

    public List<GameObject> c() {
        return this.k;
    }

    private static boolean lIIlIlIIlIIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean b(c cVar) {
        switch (b.n[cVar.ordinal()]) {
            case 1:
                return this.i.plunderUrnsOne();
            case 2:
                return this.i.plunderUrnsTwo();
            case 3:
                return this.i.plunderUrnsThree();
            case 4:
                return this.i.plunderUrnsFour();
            case 5:
                return this.i.plunderUrnsFive();
            case 6:
                return this.i.plunderUrnsSix();
            case 7:
                return this.i.plunderUrnsSeven();
            case 8:
                return this.i.plunderUrnsEight();
            default:
                return llllllIllIll[3];
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIIlIlIIlIIllII(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.k.clear();
        }
    }

    private static boolean lIIlIlIIlIIlIIl(int i, int i2) {
        return i != i2;
    }

    public void b(int i) {
        this.m = i;
    }

    private static void lIIlIlIIlIIlIII() {
        llllllIllIll = new int[7];
        llllllIllIll[0] = (-((-21821) & 32127)) & (-1201) & 32767;
        llllllIllIll[1] = (-((-12951) & 16087)) & (-177) & 24574;
        llllllIllIll[2] = (-(((141 + 80) - 67) + 71)) & (-8193) & 29679;
        llllllIllIll[3] = ((((88 + 169) - 248) + 185) ^ (((115 + 62) - 39) + 22)) & (((232 ^ 178) ^ (98 ^ 90)) ^ (-" ".length()));
        llllllIllIll[4] = (-24987) & 32735;
        llllllIllIll[5] = " ".length();
        llllllIllIll[6] = "  ".length();
    }

    public int e() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean c(c cVar) {
        switch (b.n[cVar.ordinal()]) {
            case 1:
                return this.i.plunderSarcophagusOne();
            case 2:
                return this.i.plunderSarcophagusTwo();
            case 3:
                return this.i.plunderSarcophagusThree();
            case 4:
                return this.i.plunderSarcophagusFour();
            case 5:
                return this.i.plunderSarcophagusFive();
            case 6:
                return this.i.plunderSarcophagusSix();
            case 7:
                return this.i.plunderSarcophagusSeven();
            case 8:
                return this.i.plunderSarcophagusEight();
            default:
                return llllllIllIll[3];
        }
    }

    public void a(int i) {
        this.l = i;
    }

    static {
        lIIlIlIIlIIlIII();
        lIIlIlIIlIIIlll();
        g = LoggerFactory.getLogger(a.class);
    }
}
