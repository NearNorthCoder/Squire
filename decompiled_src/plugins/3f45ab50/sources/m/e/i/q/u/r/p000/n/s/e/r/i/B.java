package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Mining Ore Vein", priority = 5, blocking = true, register = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.B  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/B.class */
public class B extends C {
    public static final /* synthetic */ int S;
    private /* synthetic */ boolean W;
    private static /* synthetic */ String[] llllllIIlIlI;
    private final /* synthetic */ U T;
    private /* synthetic */ int V;
    private static /* synthetic */ int[] llllllIIlIll;
    private final /* synthetic */ Client U;

    private static boolean lIIlIlIIIllIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIlIIIllIIll(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIIIlIllII(String lllllllllllllllIIlIIIlllIIIlllll, String lllllllllllllllIIlIIIlllIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlllIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllIIIllllI.getBytes(StandardCharsets.UTF_8)), llllllIIlIll[6]), "DES");
            Cipher lllllllllllllllIIlIIIlllIIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlllIIlIIIIl.init(llllllIIlIll[2], lllllllllllllllIIlIIIlllIIlIIIlI);
            return new String(lllllllllllllllIIlIIIlllIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlllIIlIIIII) {
            lllllllllllllllIIlIIIlllIIlIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        if (!lIIlIlIIIlIllll(Players.getLocal()) || lIIlIlIIIllIIII(this.Z.I() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (lIIlIlIIIllIIII(Inventory.isFull() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (!lIIlIlIIIllIIIl(this.Z.G() ? 1 : 0) || lIIlIlIIIllIIII(this.Z.F() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (lIIlIlIIIllIIII(this.W ? 1 : 0) && lIIlIlIIIllIIlI(this.U.getTickCount() - this.V, llllllIIlIll[1])) {
            this.T.e(null);
        }
        TileObject P = this.T.P();
        if (!lIIlIlIIIllIIll(P)) {
            if (lIIlIlIIIllIIIl(Reachable.isInteractable(P) ? 1 : 0)) {
                this.T.e(null);
                return llllllIIlIll[0];
            }
            return llllllIIlIll[3];
        }
        TileObject u = u();
        if (!lIIlIlIIIlIllll(u) || lIIlIlIIIllIIIl(Reachable.isInteractable(u) ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        this.T.e(u);
        u.interact(llllllIIlIlI[llllllIIlIll[0]]);
        sleep(llllllIIlIll[2]);
        return llllllIIlIll[3];
    }

    private static boolean lIIlIlIIIllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIIIllIIII(int i) {
        return i != 0;
    }

    static {
        lIIlIlIIIlIlllI();
        lIIlIlIIIlIllIl();
        S = llllllIIlIll[5];
    }

    private static boolean lIIlIlIIIlIllll(Object obj) {
        return obj != null;
    }

    private static void lIIlIlIIIlIlllI() {
        llllllIIlIll = new int[7];
        llllllIIlIll[0] = (200 ^ 168) & ((221 ^ 189) ^ (-1));
        llllllIIlIll[1] = 7 ^ 1;
        llllllIIlIll[2] = "  ".length();
        llllllIIlIll[3] = " ".length();
        llllllIIlIll[4] = -" ".length();
        llllllIIlIll[5] = (-20511) & 21342;
        llllllIIlIll[6] = "  ".length() ^ (69 ^ 79);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (!lIIlIlIIIlIllll(actor) || lIIlIlIIIllIlII(actor, Players.getLocal())) {
            return;
        }
        if (!lIIlIlIIIllIlIl(actor.getAnimation(), llllllIIlIll[4])) {
            this.W = llllllIIlIll[0];
            return;
        }
        this.V = this.U.getTickCount();
        this.W = llllllIIlIll[3];
        "".length();
        if ((-"  ".length()) >= 0) {
        }
    }

    private static boolean lIIlIlIIIllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIlIIIlIllIl() {
        llllllIIlIlI = new String[llllllIIlIll[3]];
        llllllIIlIlI[llllllIIlIll[0]] = lIIlIlIIIlIllII("f32bgKU/W10=", "RcySc");
    }

    private static boolean lIIlIlIIIllIIIl(int i) {
        return i == 0;
    }

    @Inject
    public B(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t, U u, Client client) {
        super(squireMinerConfig, squireMiner, t);
        this.T = u;
        this.U = client;
    }
}
