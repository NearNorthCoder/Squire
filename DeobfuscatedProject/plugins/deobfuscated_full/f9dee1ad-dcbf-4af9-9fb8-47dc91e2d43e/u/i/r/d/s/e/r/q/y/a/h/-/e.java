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
            0;
            if (-2 > 0) {
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
        void var3;
        void var22;
        Actor actor = hitsplatApplied.getActor();
        if (e.lIIIllllIlIIlIl(actor)) {
            return;
        }
        if (e.lIIIllllIlIIlll(var22, Players.getLocal().getInteracting())) {
            e var4;
            if (e.lIIIllllIlIIlII(var4.A)) {
                var4.s();
            }
            return;
        }
        if (e.lIIIllllIlIlIII(var3.getHitsplat().getHitsplatType(), llllIIIlllIl[1])) {
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
        e var21;
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
            0;
            if (((0x15 ^ 0x19) & ~(0x72 ^ 0x7E)) != 0) {
                return (0xE5 ^ 0xBA) & ~(0x64 ^ 0x3B);
            }
        } else {
            void var10;
            n3 = var10.hashCode();
        }
        int var19 = n6 + n3;
        SquireAlchemicalHydraConfig var15 = var21.t();
        int n7 = var19 * llllIIIlllIl[5];
        if (e.lIIIllllIlIIlIl(var15)) {
            n2 = llllIIIlllIl[6];
            0;
            if (-1 >= (0x10 ^ 0x5C ^ (0x88 ^ 0xC0))) {
                return (51 + 36 - 65 + 113 ^ 29 + 44 - 21 + 105) & (0x4D ^ 0x47 ^ (0x78 ^ 0x68) ^ -1);
            }
        } else {
            n2 = var15.hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    private static void lIIIllllIlIIIIl() {
        llllIIIlllIl = new int[8];
        e.llllIIIlllIl[0] = (0x7A ^ 0x3E) & ~(3 ^ 0x47);
        e.llllIIIlllIl[1] = 0x18 ^ 0x59;
        e.llllIIIlllIl[2] = 2;
        e.llllIIIlllIl[3] = 1;
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
        void var20;
        if (!e.lIIIllllIlIIIlI(menuActionProcessed.getOption()) || e.lIIIllllIlIIlII(menuActionProcessed.getOption().contains(llllIIIlllII[llllIIIlllIl[0]]) ? 1 : 0)) {
            return;
        }
        Actor var23 = Players.getLocal().getInteracting();
        if (e.lIIIllllIlIIlIl(var23)) {
            return;
        }
        if (e.lIIIllllIlIIllI(Objects.equals(var23.getName(), var20.getTarget()) ? 1 : 0)) {
            e var18;
            var18.z = var18.x.getTickCount();
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
                SquireAlchemicalHydraConfig var7;
                SquireAlchemicalHydraConfig var16;
                block20: {
                    e var12;
                    e var5;
                    block18: {
                        block19: {
                            Client var8;
                            Client var11;
                            block17: {
                                void var24;
                                if (e.lIIIllllIlIIlll(object, this)) {
                                    return llllIIIlllIl[3];
                                }
                                if (e.lIIIllllIlIIlII(var24 instanceof e)) {
                                    return llllIIIlllIl[0];
                                }
                                var5 = (e)var24;
                                if (e.lIIIllllIlIIlII(var5.a(var12) ? 1 : 0)) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var12.l(), var5.l())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var12.u(), var5.u())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var12.v(), var5.v())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var12.w(), var5.w())) {
                                    return llllIIIlllIl[0];
                                }
                                var11 = var12.j();
                                var8 = var5.j();
                                if (!e.lIIIllllIlIIlIl(var11)) break block17;
                                if (!e.lIIIllllIlIIIlI(var8)) break block18;
                                0;
                                if (2 <= 1) {
                                    return false;
                                }
                                break block19;
                            }
                            if (!e.lIIIllllIlIIlII(var11.equals(var8) ? 1 : 0)) break block18;
                        }
                        return llllIIIlllIl[0];
                    }
                    var16 = var12.t();
                    var7 = var5.t();
                    if (!e.lIIIllllIlIIlIl(var16)) break block20;
                    if (!e.lIIIllllIlIIIlI(var7)) break block21;
                    0;
                    if ((0x3E ^ 0x3A) <= 0) {
                        return false;
                    }
                    break block22;
                }
                if (!e.lIIIllllIlIIlII(var16.equals(var7) ? 1 : 0)) break block21;
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

    private static String lIIIllllIIlllll(String var17, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llllIIIlllIl[7]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllIIIlllIl[2], var1);
            return new String(var14.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllIlIIIII() {
        llllIIIlllII = new String[llllIIIlllIl[3]];
        e.llllIIIlllII[e.llllIIIlllIl[0]] = e."Attack";
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
        e var9;
        int var6;
        int n3;
        if (e.lIIIllllIlIIllI(bl ? 1 : 0)) {
            n3 = llllIIIlllIl[2];
            0;
            if (1 == ((0xE7 ^ 0xB1) & ~(0x25 ^ 0x73))) {
                return false;
            }
        } else {
            n3 = var6 = llllIIIlllIl[3];
        }
        if (!e.lIIIllllIlIIllI(var9.p) || e.lIIIllllIlIlIIl(var9.x.getTickCount() - var9.p, var6 * (var9.B - llllIIIlllIl[3]))) {
            n2 = llllIIIlllIl[3];
            0;
            
            }
        } else {
            n2 = llllIIIlllIl[0];
        }
        return n2 != 0;
    }
}

