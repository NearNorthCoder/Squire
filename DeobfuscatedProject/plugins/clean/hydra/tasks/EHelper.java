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
package gg.squire.hydra.tasks;

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
public class EHelper {
    
    private  int z;
    private final  SquireAlchemicalHydraConfig y;
    
    private  int B;
    private  int A;
    private final  Client x;
    private  int p;

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

        } else {
            var1.B = llllIIIlllIl[4];
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
        void var2;
        void var3;
        Actor actor = hitsplatApplied.getActor();
        if (e.lIIIllllIlIIlIl(actor)) {
            return;
        }
        if (e.lIIIllllIlIIlll(var3, Players.getLocal().getInteracting())) {
            e var4;
            if (e.lIIIllllIlIIlII(var4.A)) {
                var4.s();
            }
            return;
        }
        if (e.lIIIllllIlIlIII(var2.getHitsplat().getHitsplatType(), llllIIIlllIl[1])) {
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
        e var5;
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

            if (((0x15 ^ 0x19) & ~(0x72 ^ 0x7E)) != 0) {
                return (0xE5 ^ 0xBA) & ~(0x64 ^ 0x3B);
            }
        } else {
            void var6;
            n3 = var6.hashCode();
        }
        int var7 = n6 + n3;
        SquireAlchemicalHydraConfig var8 = var5.t();
        int n7 = var7 * llllIIIlllIl[5];
        if (e.lIIIllllIlIIlIl(var8)) {
            n2 = llllIIIlllIl[6];

            if (-1 >= (0x10 ^ 0x5C ^ (0x88 ^ 0xC0))) {
                return (51 + 36 - 65 + 113 ^ 29 + 44 - 21 + 105) & (0x4D ^ 0x47 ^ (0x78 ^ 0x68) ^ -1);
            }
        } else {
            n2 = var8.hashCode();
        }
        n5 = n7 + n2;
        return n5;
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
        void var9;
        if (!e.lIIIllllIlIIIlI(menuActionProcessed.getOption()) || e.lIIIllllIlIIlII(menuActionProcessed.getOption().contains(llllIIIlllII[llllIIIlllIl[0]]) ? 1 : 0)) {
            return;
        }
        Actor var10 = Players.getLocal().getInteracting();
        if (e.lIIIllllIlIIlIl(var10)) {
            return;
        }
        if (e.lIIIllllIlIIllI(Objects.equals(var10.getName(), var9.getTarget()) ? 1 : 0)) {
            e var11;
            var11.z = var11.x.getTickCount();
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
                SquireAlchemicalHydraConfig var12;
                SquireAlchemicalHydraConfig var13;
                block20: {
                    e var14;
                    e var15;
                    block18: {
                        block19: {
                            Client var16;
                            Client var17;
                            block17: {
                                void var18;
                                if (e.lIIIllllIlIIlll(object, this)) {
                                    return llllIIIlllIl[3];
                                }
                                if (e.lIIIllllIlIIlII(var18 instanceof e)) {
                                    return llllIIIlllIl[0];
                                }
                                var15 = (EHelper) ar18;
                                if (e.lIIIllllIlIIlII(var15.a(var14) ? 1 : 0)) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var14.l(), var15.l())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var14.u(), var15.u())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var14.v(), var15.v())) {
                                    return llllIIIlllIl[0];
                                }
                                if (e.lIIIllllIlIlIll(var14.w(), var15.w())) {
                                    return llllIIIlllIl[0];
                                }
                                var17 = var14.j();
                                var16 = var15.j();
                                if (!e.lIIIllllIlIIlIl(var17)) break block17;
                                if (!e.lIIIllllIlIIIlI(var16)) break block18;

                                if (2 <= 1) {
                                    return false;
                                }
                                break block19;
                            }
                            if (!e.lIIIllllIlIIlII(var17.equals(var16) ? 1 : 0)) break block18;
                        }
                        return llllIIIlllIl[0];
                    }
                    var13 = var14.t();
                    var12 = var15.t();
                    if (!e.lIIIllllIlIIlIl(var13)) break block20;
                    if (!e.lIIIllllIlIIIlI(var12)) break block21;

                    if ((0x3E ^ 0x3A) <= 0) {
                        return false;
                    }
                    break block22;
                }
                if (!e.lIIIllllIlIIlII(var13.equals(var12) ? 1 : 0)) break block21;
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

    private static void lIIIllllIlIIIII() {
        llllIIIlllII = new String[llllIIIlllIl[3]];
        e.llllIIIlllII[e.llllIIIlllIl[0]] = "Attack";
    }

    @Inject
    public EHelper(Client client, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
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
        e var19;
        int var20;
        int n3;
        if (e.lIIIllllIlIIllI(bl ? 1 : 0)) {
            n3 = llllIIIlllIl[2];

            if (1 == ((0xE7 ^ 0xB1) & ~(0x25 ^ 0x73))) {
                return false;
            }
        } else {
            n3 = var20 = llllIIIlllIl[3];
        }
        if (!e.lIIIllllIlIIllI(var19.p) || e.lIIIllllIlIlIIl(var19.x.getTickCount() - var19.p, var20 * (var19.B - llllIIIlllIl[3]))) {
            n2 = llllIIIlllIl[3];

            }
        } else {
            n2 = llllIIIlllIl[0];
        }
        return n2 != 0;
    }
}

