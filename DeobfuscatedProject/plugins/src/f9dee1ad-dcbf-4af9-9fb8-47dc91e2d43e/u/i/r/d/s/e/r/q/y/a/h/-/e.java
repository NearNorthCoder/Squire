/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.events.MenuActionProcessed
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

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
        e.lIIIllllIlIIIIl();
        e.lIIIllllIlIIIII();
    }

    private void s() {
        if (e.lIIIllllIlIlIlI(this.p)) {
            this.B = this.x.getTickCount() - this.p;
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        } else {
            lllllllllllllllIIlIlIllllIlIIllI.B = llllIIIlllIl[4];
        }
        this.p = this.x.getTickCount();
    }

    public void f(int n2) {
        this.z = n2;
    }

    public int w() {
        return this.B;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void lllllllllllllllIIlIlIllllIlIllll;
        void lllllllllllllllIIlIlIllllIlIlllI;
        Actor actor = hitsplatApplied.getActor();
        if (e.lIIIllllIlIIlIl(actor)) {
            return;
        }
        if (e.lIIIllllIlIIlll(lllllllllllllllIIlIlIllllIlIlllI, Players.getLocal().getInteracting())) {
            e lllllllllllllllIIlIlIllllIllIIII;
            if (e.lIIIllllIlIIlII(lllllllllllllllIIlIlIllllIllIIII.A)) {
                lllllllllllllllIIlIlIllllIllIIII.s();
            }
            return;
        }
        if (e.lIIIllllIlIlIII(lllllllllllllllIIlIlIllllIlIllll.getHitsplat().getHitsplatType(), llllIIIlllIl[1])) {
            // empty if block
        }
    }

    private static boolean lIIIllllIlIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    public SquireAlchemicalHydraConfig t() {
        return this.y;
    }

    public int u() {
        return this.z;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        e lllllllllllllllIIlIlIllllIIlIIlI;
        int n3;
        int n4 = llllIIIlllIl[5];
        int n5 = llllIIIlllIl[3];
        n5 = n5 * llllIIIlllIl[5] + this.l();
        n5 = n5 * llllIIIlllIl[5] + this.u();
        n5 = n5 * llllIIIlllIl[5] + this.v();
        n5 = n5 * llllIIIlllIl[5] + this.w();
        Client client = this.j();
        int n6 = n5 * llllIIIlllIl[5];
        if (e.lIIIllllIlIIlIl(client)) {
            n3 = llllIIIlllIl[6];
            "".length();
            if (((0x15 ^ 0x19) & ~(0x72 ^ 0x7E)) != 0) {
                return (0xE5 ^ 0xBA) & ~(0x64 ^ 0x3B);
            }
        } else {
            void lllllllllllllllIIlIlIllllIIIllll;
            n3 = lllllllllllllllIIlIlIllllIIIllll.hashCode();
        }
        int lllllllllllllllIIlIlIllllIIlIIII = n6 + n3;
        SquireAlchemicalHydraConfig lllllllllllllllIIlIlIllllIIIlllI = lllllllllllllllIIlIlIllllIIlIIlI.t();
        int n7 = lllllllllllllllIIlIlIllllIIlIIII * llllIIIlllIl[5];
        if (e.lIIIllllIlIIlIl(lllllllllllllllIIlIlIllllIIIlllI)) {
            n2 = llllIIIlllIl[6];
            "".length();
            if (-" ".length() >= (0x10 ^ 0x5C ^ (0x88 ^ 0xC0))) {
                return (51 + 36 - 65 + 113 ^ 29 + 44 - 21 + 105) & (0x4D ^ 0x47 ^ (0x78 ^ 0x68) ^ -" ".length());
            }
        } else {
            n2 = lllllllllllllllIIlIlIllllIIIlllI.hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    private static void lIIIllllIlIIIIl() {
        llllIIIlllIl = new int[8];
        e.llllIIIlllIl[0] = (0x7A ^ 0x3E) & ~(3 ^ 0x47);
        e.llllIIIlllIl[1] = 0x18 ^ 0x59;
        e.llllIIIlllIl[2] = "  ".length();
        e.llllIIIlllIl[3] = " ".length();
        e.llllIIIlllIl[4] = 0xB2 ^ 0xB6;
        e.llllIIIlllIl[5] = 35 + 74 - 46 + 82 ^ 83 + 2 - -37 + 48;
        e.llllIIIlllIl[6] = 31 + 109 - 130 + 149 ^ 14 + 119 - 94 + 141;
        e.llllIIIlllIl[7] = 0x33 ^ 0x3B;
    }

    protected boolean a(Object object) {
        return object instanceof e;
    }

    private static boolean lIIIllllIlIIlII(int n2) {
        return n2 == 0;
    }

    public void g(int n2) {
        this.A = n2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        void lllllllllllllllIIlIlIllllIllIlIl;
        if (!e.lIIIllllIlIIIlI(menuActionProcessed.getOption()) || e.lIIIllllIlIIlII(menuActionProcessed.getOption().contains(llllIIIlllII[llllIIIlllIl[0]]) ? 1 : 0)) {
            return;
        }
        Actor lllllllllllllllIIlIlIllllIllIlII = Players.getLocal().getInteracting();
        if (e.lIIIllllIlIIlIl(lllllllllllllllIIlIlIllllIllIlII)) {
            return;
        }
        if (e.lIIIllllIlIIllI(Objects.equals(lllllllllllllllIIlIlIllllIllIlII.getName(), lllllllllllllllIIlIlIllllIllIlIl.getTarget()) ? 1 : 0)) {
            e lllllllllllllllIIlIlIllllIllIllI;
            lllllllllllllllIIlIlIllllIllIllI.z = lllllllllllllllIIlIlIllllIllIllI.x.getTickCount();
        }
    }

    public int v() {
        return this.A;
    }

    private static boolean lIIIllllIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllllIlIIllI(int n2) {
        return n2 != 0;
    }

    public void h(int n2) {
        this.B = n2;
    }

    private static boolean lIIIllllIlIIlIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block21: {
            block22: {
                SquireAlchemicalHydraConfig lllllllllllllllIIlIlIllllIIllIII;
                SquireAlchemicalHydraConfig lllllllllllllllIIlIlIllllIIllIIl;
                block20: {
                    e lllllllllllllllIIlIlIllllIIllllI;
                    e lllllllllllllllIIlIlIllllIIlllII;
                    block18: {
                        block19: {
                            Client lllllllllllllllIIlIlIllllIIllIlI;
                            Client lllllllllllllllIIlIlIllllIIllIll;
                            block17: {
                                void lllllllllllllllIIlIlIllllIIlllIl;
                                if (e.lIIIllllIlIIlll(object, this)) {
                                    return llllIIIlllIl[3];
                                }
                                if (e.lIIIllllIlIIlII(lllllllllllllllIIlIlIllllIIlllIl instanceof e)) {
                                    return llllIIIlllIl[0];
                                }
                                lllllllllllllllIIlIlIllllIIlllII = (e)lllllllllllllllIIlIlIllllIIlllIl;
                                if (e.lIIIllllIlIIlII(lllllllllllllllIIlIlIllllIIlllII.a(lllllllllllllllIIlIlIllllIIllllI) ? 1 : 0)) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(lllllllllllllllIIlIlIllllIIllllI.l(), lllllllllllllllIIlIlIllllIIlllII.l())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(lllllllllllllllIIlIlIllllIIllllI.u(), lllllllllllllllIIlIlIllllIIlllII.u())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(lllllllllllllllIIlIlIllllIIllllI.v(), lllllllllllllllIIlIlIllllIIlllII.v())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(lllllllllllllllIIlIlIllllIIllllI.w(), lllllllllllllllIIlIlIllllIIlllII.w())) {
                                    return llllIIIlllIl[0];
                                }
                                lllllllllllllllIIlIlIllllIIllIll = lllllllllllllllIIlIlIllllIIllllI.j();
                                lllllllllllllllIIlIlIllllIIllIlI = lllllllllllllllIIlIlIllllIIlllII.j();
                                if (!e.lIIIllllIlIIlIl(lllllllllllllllIIlIlIllllIIllIll)) break block17;
                                if (!e.lIIIllllIlIIIlI(lllllllllllllllIIlIlIllllIIllIlI)) break block18;
                                "".length();
                                if ("  ".length() <= " ".length()) {
                                    return ((0x5B ^ 0x1E) & ~(0x3F ^ 0x7A)) != 0;
                                }
                                break block19;
                            }
                            if (!e.lIIIllllIlIIlII(lllllllllllllllIIlIlIllllIIllIll.equals(lllllllllllllllIIlIlIllllIIllIlI) ? 1 : 0)) break block18;
                        }
                        return llllIIIlllIl[0];
                    }
                    lllllllllllllllIIlIlIllllIIllIIl = lllllllllllllllIIlIlIllllIIllllI.t();
                    lllllllllllllllIIlIlIllllIIllIII = lllllllllllllllIIlIlIllllIIlllII.t();
                    if (!e.lIIIllllIlIIlIl(lllllllllllllllIIlIlIllllIIllIIl)) break block20;
                    if (!e.lIIIllllIlIIIlI(lllllllllllllllIIlIlIllllIIllIII)) break block21;
                    "".length();
                    if ((0x3E ^ 0x3A) <= 0) {
                        return ((0x3E ^ 0x35) & ~(0x58 ^ 0x53)) != 0;
                    }
                    break block22;
                }
                if (!e.lIIIllllIlIIlII(lllllllllllllllIIlIlIllllIIllIIl.equals(lllllllllllllllIIlIlIllllIIllIII) ? 1 : 0)) break block21;
            }
            return llllIIIlllIl[0];
        }
        return llllIIIlllIl[3];
    }

    private static boolean lIIIllllIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIllllIlIlIlI(int n2) {
        return n2 > 0;
    }

    public Client j() {
        return this.x;
    }

    public void b(int n2) {
        this.p = n2;
    }

    private static boolean lIIIllllIlIIIll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIIllllIIlllll(String lllllllllllllllIIlIlIllllIIIIlII, String lllllllllllllllIIlIlIllllIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllllIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), llllIIIlllIl[7]), "DES");
            Cipher lllllllllllllllIIlIlIllllIIIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIllllIIIlIII.init(llllIIIlllIl[2], lllllllllllllllIIlIlIllllIIIlIIl);
            return new String(lllllllllllllllIIlIlIllllIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllllIIIIlll) {
            lllllllllllllllIIlIlIllllIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllIlIIIII() {
        llllIIIlllII = new String[llllIIIlllIl[3]];
        e.llllIIIlllII[e.llllIIIlllIl[0]] = e.lIIIllllIIlllll("XdMUFJuDops=", "PhDtH");
    }

    @Inject
    public e(Client client, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.x = client;
        this.y = squireAlchemicalHydraConfig;
    }

    public String toString() {
        return "PlayerHandler(client=" + String.valueOf(this.j()) + ", config=" + String.valueOf(this.t()) + ", lastAttackTick=" + this.l() + ", lastAttackClickTick=" + this.u() + ", lastProjectileAttackTick=" + this.v() + ", attackSpeed=" + this.w() + ")";
    }

    private static boolean lIIIllllIlIIIlI(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if (!e.lIIIllllIlIIIlI(actor) || e.lIIIllllIlIIIll(actor, Players.getLocal().getInteracting())) {
            return;
        }
        this.A = this.x.getTickCount();
        this.s();
    }

    public boolean b(boolean bl) {
        int n2;
        e lllllllllllllllIIlIlIllllIlIlIlI;
        int lllllllllllllllIIlIlIllllIlIlIII;
        int n3;
        if (e.lIIIllllIlIIllI(bl ? 1 : 0)) {
            n3 = llllIIIlllIl[2];
            "".length();
            if (" ".length() == ((0xE7 ^ 0xB1) & ~(0x25 ^ 0x73))) {
                return ((0xC2 ^ 0xC6) & ~(0x61 ^ 0x65)) != 0;
            }
        } else {
            n3 = lllllllllllllllIIlIlIllllIlIlIII = llllIIIlllIl[3];
        }
        if (!e.lIIIllllIlIIllI(lllllllllllllllIIlIlIllllIlIlIlI.p) || e.lIIIllllIlIlIIl(lllllllllllllllIIlIlIllllIlIlIlI.x.getTickCount() - lllllllllllllllIIlIlIllllIlIlIlI.p, lllllllllllllllIIlIlIllllIlIlIII * (lllllllllllllllIIlIlIllllIlIlIlI.B - llllIIIlllIl[3]))) {
            n2 = llllIIIlllIl[3];
            "".length();
            if (null != null) {
                return ((0x1F ^ 0x17) & ~(0x61 ^ 0x69)) != 0;
            }
        } else {
            n2 = llllIIIlllIl[0];
        }
        return n2 != 0;
    }
}

