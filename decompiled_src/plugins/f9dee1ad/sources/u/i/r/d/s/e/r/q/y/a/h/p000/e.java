package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.MenuActionProcessed;
@Singleton
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.e  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/e.class */
public class e {
    private static /* synthetic */ String[] llllIIIlllII;
    private /* synthetic */ int z;
    private final /* synthetic */ SquireAlchemicalHydraConfig y;
    private static /* synthetic */ int[] llllIIIlllIl;
    private /* synthetic */ int B;
    private /* synthetic */ int A;
    private final /* synthetic */ Client x;
    private /* synthetic */ int p;

    public int l() {
        return this.p;
    }

    static {
        lIIIllllIlIIIIl();
        lIIIllllIlIIIII();
    }

    private void s() {
        if (lIIIllllIlIlIlI(this.p)) {
            this.B = this.x.getTickCount() - this.p;
            "".length();
            if ((-"  ".length()) > 0) {
                return;
            }
        } else {
            this.B = llllIIIlllIl[4];
        }
        this.p = this.x.getTickCount();
    }

    public void f(int i) {
        this.z = i;
    }

    public int w() {
        return this.B;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        Actor actor = hitsplatApplied.getActor();
        if (lIIIllllIlIIlIl(actor)) {
            return;
        }
        if (!lIIIllllIlIIlll(actor, Players.getLocal().getInteracting())) {
            if (lIIIllllIlIlIII(hitsplatApplied.getHitsplat().getHitsplatType(), llllIIIlllIl[1])) {
            }
        } else if (lIIIllllIlIIlII(this.A)) {
            s();
        }
    }

    private static boolean lIIIllllIlIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllllIlIlIII(int i, int i2) {
        return i == i2;
    }

    public SquireAlchemicalHydraConfig t() {
        return this.y;
    }

    public int u() {
        return this.z;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = llllIIIlllIl[5];
        int l = (((((((llllIIIlllIl[3] * llllIIIlllIl[5]) + l()) * llllIIIlllIl[5]) + u()) * llllIIIlllIl[5]) + v()) * llllIIIlllIl[5]) + w();
        Client j = j();
        int i2 = l * llllIIIlllIl[5];
        if (lIIIllllIlIIlIl(j)) {
            hashCode = llllIIIlllIl[6];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (229 ^ 186) & ((100 ^ 59) ^ (-1));
            }
        } else {
            hashCode = j.hashCode();
        }
        int i3 = i2 + hashCode;
        SquireAlchemicalHydraConfig t = t();
        int i4 = i3 * llllIIIlllIl[5];
        if (lIIIllllIlIIlIl(t)) {
            hashCode2 = llllIIIlllIl[6];
            "".length();
            if ((-" ".length()) >= ((16 ^ 92) ^ (136 ^ 192))) {
                return ((((51 + 36) - 65) + 113) ^ (((29 + 44) - 21) + 105)) & (((77 ^ 71) ^ (120 ^ 104)) ^ (-" ".length()));
            }
        } else {
            hashCode2 = t.hashCode();
        }
        return i4 + hashCode2;
    }

    private static void lIIIllllIlIIIIl() {
        llllIIIlllIl = new int[8];
        llllIIIlllIl[0] = (122 ^ 62) & ((3 ^ 71) ^ (-1));
        llllIIIlllIl[1] = 24 ^ 89;
        llllIIIlllIl[2] = "  ".length();
        llllIIIlllIl[3] = " ".length();
        llllIIIlllIl[4] = 178 ^ 182;
        llllIIIlllIl[5] = (((35 + 74) - 46) + 82) ^ (((83 + 2) - (-37)) + 48);
        llllIIIlllIl[6] = (((31 + 109) - 130) + 149) ^ (((14 + 119) - 94) + 141);
        llllIIIlllIl[7] = 51 ^ 59;
    }

    protected boolean a(Object obj) {
        return obj instanceof e;
    }

    private static boolean lIIIllllIlIIlII(int i) {
        return i == 0;
    }

    public void g(int i) {
        this.A = i;
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        if (!lIIIllllIlIIIlI(menuActionProcessed.getOption()) || lIIIllllIlIIlII(menuActionProcessed.getOption().contains(llllIIIlllII[llllIIIlllIl[0]]) ? 1 : 0)) {
            return;
        }
        Actor interacting = Players.getLocal().getInteracting();
        if (!lIIIllllIlIIlIl(interacting) && lIIIllllIlIIllI(Objects.equals(interacting.getName(), menuActionProcessed.getTarget()) ? 1 : 0)) {
            this.z = this.x.getTickCount();
        }
    }

    public int v() {
        return this.A;
    }

    private static boolean lIIIllllIlIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIllllIlIIllI(int i) {
        return i != 0;
    }

    public void h(int i) {
        this.B = i;
    }

    private static boolean lIIIllllIlIIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (lIIIllllIlIIlII(r0.equals(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
        if (lIIIllllIlIIlII(r0.equals(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIllllIlIIlll(obj, this)) {
            return llllIIIlllIl[3];
        }
        if (lIIIllllIlIIlII(obj instanceof e ? 1 : 0)) {
            return llllIIIlllIl[0];
        }
        e eVar = (e) obj;
        if (!lIIIllllIlIIlII(eVar.a(this) ? 1 : 0) && !lIIIllllIlIlIll(l(), eVar.l()) && !lIIIllllIlIlIll(u(), eVar.u()) && !lIIIllllIlIlIll(v(), eVar.v()) && !lIIIllllIlIlIll(w(), eVar.w())) {
            Client j = j();
            Client j2 = eVar.j();
            if (lIIIllllIlIIlIl(j)) {
                if (lIIIllllIlIIIlI(j2)) {
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llllIIIlllIl[0];
                }
                SquireAlchemicalHydraConfig t = t();
                SquireAlchemicalHydraConfig t2 = eVar.t();
                if (lIIIllllIlIIlIl(t)) {
                    if (lIIIllllIlIIIlI(t2)) {
                        "".length();
                        if ((62 ^ 58) <= 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return llllIIIlllIl[0];
                    }
                    return llllIIIlllIl[3];
                }
            }
        }
        return llllIIIlllIl[0];
    }

    private static boolean lIIIllllIlIlIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIllllIlIlIlI(int i) {
        return i > 0;
    }

    public Client j() {
        return this.x;
    }

    public void b(int i) {
        this.p = i;
    }

    private static boolean lIIIllllIlIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIIIllllIIlllll(String lllllllllllllllIIlIlIllllIIIIllI, String lllllllllllllllIIlIlIllllIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllllIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllllIIIIlIl.getBytes(StandardCharsets.UTF_8)), llllIIIlllIl[7]), "DES");
            Cipher lllllllllllllllIIlIlIllllIIIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIllllIIIlIII.init(llllIIIlllIl[2], lllllllllllllllIIlIlIllllIIIlIIl);
            return new String(lllllllllllllllIIlIlIllllIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllllIIIIlll) {
            lllllllllllllllIIlIlIllllIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllIlIIIII() {
        llllIIIlllII = new String[llllIIIlllIl[3]];
        llllIIIlllII[llllIIIlllIl[0]] = lIIIllllIIlllll("XdMUFJuDops=", "PhDtH");
    }

    @Inject
    public e(Client client, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.x = client;
        this.y = squireAlchemicalHydraConfig;
    }

    public String toString() {
        return "PlayerHandler(client=" + String.valueOf(j()) + ", config=" + String.valueOf(t()) + ", lastAttackTick=" + l() + ", lastAttackClickTick=" + u() + ", lastProjectileAttackTick=" + v() + ", attackSpeed=" + w() + ")";
    }

    private static boolean lIIIllllIlIIIlI(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor interacting = projectileSpawned.getProjectile().getInteracting();
        if (!lIIIllllIlIIIlI(interacting) || lIIIllllIlIIIll(interacting, Players.getLocal().getInteracting())) {
            return;
        }
        this.A = this.x.getTickCount();
        s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(boolean z) {
        int i;
        if (lIIIllllIlIIllI(z ? 1 : 0)) {
            i = llllIIIlllIl[2];
            "".length();
            if (" ".length() == ((231 ^ 177) & ((37 ^ 115) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llllIIIlllIl[3];
        }
        int i2 = i;
        if (!lIIIllllIlIIllI(this.p) || lIIIllllIlIlIIl(this.x.getTickCount() - this.p, i2 * (this.B - llllIIIlllIl[3]))) {
            ?? r0 = llllIIIlllIl[3];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIIlllIl[0];
    }
}
