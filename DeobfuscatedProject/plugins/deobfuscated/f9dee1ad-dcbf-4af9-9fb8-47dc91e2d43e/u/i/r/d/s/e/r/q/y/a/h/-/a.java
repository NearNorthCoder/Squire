/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.OverheadTextChanged
 *  net.runelite.api.events.ProjectileMoved
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import u.i.r.d.s.e.r.q.y.a.h.-.b;
import u.i.r.d.s.e.r.q.y.a.h.-.h;
import u.i.r.d.s.e.r.q.y.a.h.-.j;
import u.i.r.d.s.e.r.q.y.a.h.-.k;

@Singleton
public class a {
    private static /* synthetic */ int[] llllIIlIlIII;
    private final /* synthetic */ Map<LocalPoint, Projectile> l;
    private /* synthetic */ int r;
    private static /* synthetic */ String[] llllIIlIIlll;
    private static final /* synthetic */ int[] k;
    private static final /* synthetic */ String j;
    private /* synthetic */ int s;
    private static final /* synthetic */ String i;
    private /* synthetic */ int q;
    private /* synthetic */ int p;
    private final /* synthetic */ Set<LocalPoint> m;
    private final /* synthetic */ Client n;
    private /* synthetic */ h o;

    public void b(int n2) {
        this.p = n2;
    }

    private static boolean lIIIlllllIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllllllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private void a(int n2) {
        if (a.lIIIllllllIIIIl(n2, this.o.L().W())) {
            this.o.D();
            0;
            if (-(0x2F ^ 0x2B) >= 0) {
                return;
            }
        } else {
            a lllllllllllllllIIlIlIlIlllllIlIl;
            lllllllllllllllIIlIlIlIlllllIlIl.o.s();
        }
    }

    public Map<LocalPoint, Projectile> i() {
        return this.l;
    }

    public int n() {
        return this.r;
    }

    public boolean g() {
        int n2;
        if (a.lIIIlllllIllIlI(this.n.isInInstancedRegion() ? 1 : 0) && a.lIIIlllllIllIlI(Arrays.equals(this.n.getMapRegions(), k) ? 1 : 0)) {
            n2 = llllIIlIlIII[1];
            0;
            if (2 <= 0) {
                return ((0x4D ^ 0x4A ^ (0x1E ^ 0x4A)) & (1 ^ 0x37 ^ (0x1C ^ 0x79) ^ -1)) != 0;
            }
        } else {
            n2 = llllIIlIlIII[0];
        }
        return n2 != 0;
    }

    public int m() {
        return this.q;
    }

    private static boolean lIIIlllllIllllI(Object object, Object object2) {
        return object == object2;
    }

    public int o() {
        return this.s;
    }

    public void d(int n2) {
        this.r = n2;
    }

    protected boolean a(Object object) {
        return object instanceof a;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block37: {
            block38: {
                h lllllllllllllllIIlIlIlIlllIllIlI;
                h lllllllllllllllIIlIlIlIlllIllIll;
                block36: {
                    a lllllllllllllllIIlIlIlIllllIIlII;
                    a lllllllllllllllIIlIlIlIllllIIIlI;
                    block34: {
                        block35: {
                            Client lllllllllllllllIIlIlIlIlllIlllII;
                            Client lllllllllllllllIIlIlIlIlllIlllIl;
                            block33: {
                                block31: {
                                    block32: {
                                        Set<LocalPoint> lllllllllllllllIIlIlIlIlllIllllI;
                                        Set<LocalPoint> lllllllllllllllIIlIlIlIlllIlllll;
                                        block30: {
                                            block28: {
                                                block29: {
                                                    Map<LocalPoint, Projectile> lllllllllllllllIIlIlIlIllllIIIII;
                                                    Map<LocalPoint, Projectile> lllllllllllllllIIlIlIlIllllIIIIl;
                                                    block27: {
                                                        void lllllllllllllllIIlIlIlIllllIIIll;
                                                        if (a.lIIIlllllIllllI(object, this)) {
                                                            return llllIIlIlIII[1];
                                                        }
                                                        if (a.lIIIlllllIlllll(lllllllllllllllIIlIlIlIllllIIIll instanceof a)) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        lllllllllllllllIIlIlIlIllllIIIlI = (a)lllllllllllllllIIlIlIlIllllIIIll;
                                                        if (a.lIIIlllllIlllll(lllllllllllllllIIlIlIlIllllIIIlI.a(lllllllllllllllIIlIlIlIllllIIlII) ? 1 : 0)) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(lllllllllllllllIIlIlIlIllllIIlII.l(), lllllllllllllllIIlIlIlIllllIIIlI.l())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(lllllllllllllllIIlIlIlIllllIIlII.m(), lllllllllllllllIIlIlIlIllllIIIlI.m())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(lllllllllllllllIIlIlIlIllllIIlII.n(), lllllllllllllllIIlIlIlIllllIIIlI.n())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(lllllllllllllllIIlIlIlIllllIIlII.o(), lllllllllllllllIIlIlIlIllllIIIlI.o())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        lllllllllllllllIIlIlIlIllllIIIIl = lllllllllllllllIIlIlIlIllllIIlII.i();
                                                        lllllllllllllllIIlIlIlIllllIIIII = lllllllllllllllIIlIlIlIllllIIIlI.i();
                                                        if (!a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIllllIIIIl)) break block27;
                                                        if (!a.lIIIlllllIllIll(lllllllllllllllIIlIlIlIllllIIIII)) break block28;
                                                        0;
                                                        if (null != null) {
                                                            return (2 & (2 ^ -1)) != 0;
                                                        }
                                                        break block29;
                                                    }
                                                    if (!a.lIIIlllllIlllll(((Object)lllllllllllllllIIlIlIlIllllIIIIl).equals(lllllllllllllllIIlIlIlIllllIIIII) ? 1 : 0)) break block28;
                                                }
                                                return llllIIlIlIII[0];
                                            }
                                            lllllllllllllllIIlIlIlIlllIlllll = lllllllllllllllIIlIlIlIllllIIlII.f();
                                            lllllllllllllllIIlIlIlIlllIllllI = lllllllllllllllIIlIlIlIllllIIIlI.f();
                                            if (!a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIlllIlllll)) break block30;
                                            if (!a.lIIIlllllIllIll(lllllllllllllllIIlIlIlIlllIllllI)) break block31;
                                            0;
                                            if (3 < 0) {
                                                return ((0xBC ^ 0xB5) & ~(0x30 ^ 0x39)) != 0;
                                            }
                                            break block32;
                                        }
                                        if (!a.lIIIlllllIlllll(((Object)lllllllllllllllIIlIlIlIlllIlllll).equals(lllllllllllllllIIlIlIlIlllIllllI) ? 1 : 0)) break block31;
                                    }
                                    return llllIIlIlIII[0];
                                }
                                lllllllllllllllIIlIlIlIlllIlllIl = lllllllllllllllIIlIlIlIllllIIlII.j();
                                lllllllllllllllIIlIlIlIlllIlllII = lllllllllllllllIIlIlIlIllllIIIlI.j();
                                if (!a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIlllIlllIl)) break block33;
                                if (!a.lIIIlllllIllIll(lllllllllllllllIIlIlIlIlllIlllII)) break block34;
                                0;
                                if (-3 >= 0) {
                                    return ((0x51 ^ 0x68) & ~(0x7D ^ 0x44)) != 0;
                                }
                                break block35;
                            }
                            if (!a.lIIIlllllIlllll(lllllllllllllllIIlIlIlIlllIlllIl.equals(lllllllllllllllIIlIlIlIlllIlllII) ? 1 : 0)) break block34;
                        }
                        return llllIIlIlIII[0];
                    }
                    lllllllllllllllIIlIlIlIlllIllIll = lllllllllllllllIIlIlIlIllllIIlII.k();
                    lllllllllllllllIIlIlIlIlllIllIlI = lllllllllllllllIIlIlIlIllllIIIlI.k();
                    if (!a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIlllIllIll)) break block36;
                    if (!a.lIIIlllllIllIll(lllllllllllllllIIlIlIlIlllIllIlI)) break block37;
                    0;
                    if (((0x54 ^ 7) & ~(0xDB ^ 0x88)) != 0) {
                        return ((0x1D ^ 0x17) & ~(0x88 ^ 0x82)) != 0;
                    }
                    break block38;
                }
                if (!a.lIIIlllllIlllll(((Object)lllllllllllllllIIlIlIlIlllIllIll).equals(lllllllllllllllIIlIlIlIlllIllIlI) ? 1 : 0)) break block37;
            }
            return llllIIlIlIII[0];
        }
        return llllIIlIlIII[1];
    }

    public void e(int n2) {
        this.s = n2;
    }

    public void c(int n2) {
        this.q = n2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void lllllllllllllllIIlIlIllIIIIllIIl;
        a lllllllllllllllIIlIlIllIIIIllIll;
        NPC nPC = npcChanged.getNpc();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIlllllIlllII(nPC, this.o.K())) {
            return;
        }
        k lllllllllllllllIIlIlIllIIIIllIII = lllllllllllllllIIlIlIllIIIIllIll.o.S();
        switch (lllllllllllllllIIlIlIllIIIIllIIl.getId()) {
            case 8619: {
                lllllllllllllllIIlIlIllIIIIllIll.o.a(u.i.r.d.s.e.r.q.y.a.h.-.k.LIGHTNING);
                0;
                if ((3 & ~3) == 0) break;
                return;
            }
            case 8620: {
                lllllllllllllllIIlIlIllIIIIllIll.o.a(u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME);
                0;
                if ((0x3D ^ 0x39) > 1) break;
                return;
            }
            case 8621: {
                lllllllllllllllIIlIlIllIIIIllIll.o.a(u.i.r.d.s.e.r.q.y.a.h.-.k.ENRAGED);
            }
        }
    }

    public void a(h h2) {
        this.o = h2;
    }

    public Set<LocalPoint> f() {
        if (a.lIIIllllllIIIII(this.n.getTickCount() - this.q, llllIIlIlIII[6])) {
            this.m.clear();
        }
        return this.m;
    }

    private static void lIIIlllllIllIII() {
        llllIIlIIlll = new String[llllIIlIlIII[15]];
        a.llllIIlIIlll[a.llllIIlIlIII[0]] = a."Alchemical Hydra";
        a.llllIIlIIlll[a.llllIIlIlIII[1]] = a."Roa";
        a.llllIIlIIlll[a.llllIIlIlIII[4]] = a."The chemicals neutralise the Alchemical Hydra's defences!";
        a.llllIIlIIlll[a.llllIIlIlIII[5]] = a."The Alchemical Hydra temporarily stuns you.";
        a.llllIIlIIlll[a.llllIIlIlIII[9]] = a."The chemicals neutralise the Alchemical Hydra's defences!";
        a.llllIIlIIlll[a.llllIIlIlIII[10]] = a."The Alchemical Hydra temporarily stuns you.";
    }

    private static boolean lIIIlllllIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        a.lIIIlllllIllIIl();
        a.lIIIlllllIllIII();
        i = llllIIlIIlll[llllIIlIlIII[9]];
        j = llllIIlIIlll[llllIIlIlIII[10]];
        int[] nArray = new int[llllIIlIlIII[9]];
        nArray[a.llllIIlIlIII[0]] = llllIIlIlIII[11];
        nArray[a.llllIIlIlIII[1]] = llllIIlIlIII[12];
        nArray[a.llllIIlIlIII[4]] = llllIIlIlIII[13];
        nArray[a.llllIIlIlIII[5]] = llllIIlIlIII[14];
        k = nArray;
    }

    public String toString() {
        return "HydraHandler(poisonProjectiles=" + String.valueOf(this.i()) + ", poisonTiles=" + String.valueOf(this.f()) + ", client=" + String.valueOf(this.j()) + ", hydra=" + String.valueOf(this.k()) + ", lastAttackTick=" + this.l() + ", poisonTick=" + this.m() + ", deathTick=" + this.n() + ", kills=" + this.o() + ")";
    }

    public h k() {
        return this.o;
    }

    private static boolean lIIIlllllIllIlI(int n2) {
        return n2 != 0;
    }

    @Subscribe
    private void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (a.lIIIlllllIllIlI(h.a((Actor)nPC) ? 1 : 0)) {
            this.o = new h(nPC);
        }
    }

    private static boolean lIIIlllllIllIll(Object object) {
        return object != null;
    }

    private static boolean lIIIllllllIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlllllIlllII(Object object, Object object2) {
        return object != object2;
    }

    public void h() {
        this.s = llllIIlIlIII[0];
        NPC nPC = NPCs.getNearest(h::a);
        this.o = new h(nPC);
    }

    private static void lIIIlllllIllIIl() {
        llllIIlIlIII = new int[17];
        a.llllIIlIlIII[0] = (0xA8 ^ 0xBF ^ (0x18 ^ 0x4B)) & (109 + 96 - 204 + 128 ^ 40 + 122 - -26 + 9 ^ -1);
        a.llllIIlIlIII[1] = 1;
        a.llllIIlIlIII[2] = 0x34 ^ 0x1E;
        a.llllIIlIlIII[3] = -(0xFFFFFDFA & 0x1B97) & (0xFFFF9FFD & Short.MAX_VALUE);
        a.llllIIlIlIII[4] = 2;
        a.llllIIlIlIII[5] = 3;
        a.llllIIlIlIII[6] = 0x74 ^ 0x66;
        a.llllIIlIlIII[7] = 0x2B ^ 0x10;
        a.llllIIlIlIII[8] = 0x28 ^ 3;
        a.llllIIlIlIII[9] = 0x5F ^ 0x5B;
        a.llllIIlIlIII[10] = 0x8E ^ 0x8B;
        a.llllIIlIlIII[11] = -(0xFFFFF06D & 0x4FF3) & (0xFFFFDEFF & 0x75FF);
        a.llllIIlIlIII[12] = -(0xFFFFEDCB & 0x5B75) & (0xFFFFFDF0 & 0x5FEF);
        a.llllIIlIlIII[13] = -(0xFFFFA865 & 0x5FBB) & (0xFFFFBDFF & 0x5FBF);
        a.llllIIlIlIII[14] = 0xFFFFB7EB & 0x5DB4;
        a.llllIIlIlIII[15] = 0x26 ^ 0x20;
        a.llllIIlIlIII[16] = 0x14 ^ 0x2B ^ (0x11 ^ 0x26);
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        int n4;
        a lllllllllllllllIIlIlIlIlllIlIIlI;
        int n5;
        int n6 = llllIIlIlIII[7];
        int n7 = llllIIlIlIII[1];
        n7 = n7 * llllIIlIlIII[7] + this.l();
        n7 = n7 * llllIIlIlIII[7] + this.m();
        n7 = n7 * llllIIlIlIII[7] + this.n();
        n7 = n7 * llllIIlIlIII[7] + this.o();
        Map<LocalPoint, Projectile> map = this.i();
        int n8 = n7 * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(map)) {
            n5 = llllIIlIlIII[8];
            0;
            if ((0xA0 ^ 0xA9 ^ (0x19 ^ 0x14)) == 1) {
                return (0x9D ^ 0x8F ^ (0x1C ^ 0x28)) & (0x59 ^ 0x1B ^ (0x31 ^ 0x55) ^ -1);
            }
        } else {
            void lllllllllllllllIIlIlIlIlllIIllll;
            n5 = lllllllllllllllIIlIlIlIlllIIllll.hashCode();
        }
        int lllllllllllllllIIlIlIlIlllIlIIII = n8 + n5;
        Set<LocalPoint> lllllllllllllllIIlIlIlIlllIIlllI = lllllllllllllllIIlIlIlIlllIlIIlI.f();
        int n9 = lllllllllllllllIIlIlIlIlllIlIIII * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIlllIIlllI)) {
            n4 = llllIIlIlIII[8];
            0;
            if (-1 == ((0xA5 ^ 0x96) & ~(0x22 ^ 0x11))) {
                return (0x4A ^ 0x7A) & ~(0x99 ^ 0xA9);
            }
        } else {
            n4 = ((Object)lllllllllllllllIIlIlIlIlllIIlllI).hashCode();
        }
        lllllllllllllllIIlIlIlIlllIlIIII = n9 + n4;
        Client lllllllllllllllIIlIlIlIlllIIllIl = lllllllllllllllIIlIlIlIlllIlIIlI.j();
        int n10 = lllllllllllllllIIlIlIlIlllIlIIII * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIlllIIllIl)) {
            n3 = llllIIlIlIII[8];
            0;
            if (((0xB3 ^ 0xA3) & ~(0x11 ^ 1)) != 0) {
                return (0x9A ^ 0xA5) & ~(0xB9 ^ 0x86);
            }
        } else {
            n3 = lllllllllllllllIIlIlIlIlllIIllIl.hashCode();
        }
        lllllllllllllllIIlIlIlIlllIlIIII = n10 + n3;
        h lllllllllllllllIIlIlIlIlllIIllII = lllllllllllllllIIlIlIlIlllIlIIlI.k();
        int n11 = lllllllllllllllIIlIlIlIlllIlIIII * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIlllIIllII)) {
            n2 = llllIIlIlIII[8];
            0;
            if (2 == (104 + 182 - 131 + 34 ^ 138 + 28 - 130 + 149)) {
                return (94 + 45 - 68 + 103 ^ 15 + 28 - -69 + 30) & (0x58 ^ 3 ^ (0x43 ^ 0x38) ^ -1);
            }
        } else {
            n2 = ((Object)lllllllllllllllIIlIlIlIlllIIllII).hashCode();
        }
        n7 = n11 + n2;
        return n7;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(AnimationChanged animationChanged) {
        void lllllllllllllllIIlIlIllIIIIlIIII;
        a lllllllllllllllIIlIlIllIIIIlIIlI;
        Actor actor = animationChanged.getActor();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIlllllIlllII(actor, this.o.K())) {
            return;
        }
        k lllllllllllllllIIlIlIllIIIIIllll = lllllllllllllllIIlIlIllIIIIlIIlI.o.S();
        int lllllllllllllllIIlIlIllIIIIIlllI = lllllllllllllllIIlIlIllIIIIlIIII.getAnimation();
        if (a.lIIIlllllIlllIl(lllllllllllllllIIlIlIllIIIIIlllI, lllllllllllllllIIlIlIllIIIIIllll.ac()) && !a.lIIIlllllIllllI((Object)lllllllllllllllIIlIlIllIIIIIllll, (Object)u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME) || a.lIIIlllllIlllIl(lllllllllllllllIIlIlIllIIIIIlllI, lllllllllllllllIIlIlIllIIIIIllll.ab()) && a.lIIIlllllIllllI((Object)lllllllllllllllIIlIlIllIIIIIllll, (Object)u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME)) {
            switch (b.t[lllllllllllllllIIlIlIllIIIIIllll.ordinal()]) {
                case 1: {
                    lllllllllllllllIIlIlIllIIIIlIIlI.o.a(u.i.r.d.s.e.r.q.y.a.h.-.k.LIGHTNING);
                    0;
                    if (null == null) break;
                    return;
                }
                case 2: {
                    lllllllllllllllIIlIlIllIIIIlIIlI.o.a(u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME);
                    0;
                    if (-(65 + 79 - 105 + 150 ^ 12 + 132 - 131 + 172) <= 0) break;
                    return;
                }
                case 3: {
                    lllllllllllllllIIlIlIllIIIIlIIlI.o.a(u.i.r.d.s.e.r.q.y.a.h.-.k.ENRAGED);
                    0;
                    if (-1 < (0x24 ^ 0x21 ^ 1)) break;
                    return;
                }
                case 4: {
                    lllllllllllllllIIlIlIllIIIIlIIlI.o = null;
                    lllllllllllllllIIlIlIllIIIIlIIlI.l.clear();
                }
            }
            0;
            if (1 >= 2) {
                return;
            }
        } else if (a.lIIIlllllIlllIl(lllllllllllllllIIlIlIllIIIIIlllI, lllllllllllllllIIlIlIllIIIIIllll.ae()) && a.lIIIlllllIllIlI(lllllllllllllllIIlIlIllIIIIIllll.ae())) {
            lllllllllllllllIIlIlIllIIIIlIIlI.o.A();
        }
        if (a.lIIIlllllIllIll(lllllllllllllllIIlIlIllIIIIlIIII.getOverheadText()) && a.lIIIlllllIllIlI(lllllllllllllllIIlIlIllIIIIlIIII.getOverheadText().contains(llllIIlIIlll[llllIIlIlIII[1]]) ? 1 : 0)) {
            lllllllllllllllIIlIlIllIIIIlIIlI.o.d(llllIIlIlIII[0]);
        }
        if (a.lIIIlllllIlllll(lllllllllllllllIIlIlIllIIIIlIIlI.l.isEmpty() ? 1 : 0)) {
            lllllllllllllllIIlIlIllIIIIlIIlI.l.values().removeIf(projectile -> {
                boolean bl;
                if (a.lIIIllllllIIIll(projectile.getEndCycle(), this.n.getGameCycle())) {
                    bl = llllIIlIlIII[1];
                    0;
                    if (-(0xBC ^ 0xB8) >= 0) {
                        return ((0xAE ^ 0xA9) & ~(0x3D ^ 0x3A)) != 0;
                    }
                } else {
                    bl = llllIIlIlIII[0];
                }
                return bl;
            });
            0;
        }
    }

    private static boolean lIIIllllllIIIlI(Object object) {
        return object == null;
    }

    private static String lIIIlllllIlIlIl(String lllllllllllllllIIlIlIlIllIllIIII, String lllllllllllllllIIlIlIlIllIlIlIlI) {
        lllllllllllllllIIlIlIlIllIllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIllIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlIllIlIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIlIlIllIlIllIl = lllllllllllllllIIlIlIlIllIlIlIlI.toCharArray();
        int lllllllllllllllIIlIlIlIllIlIllII = llllIIlIlIII[0];
        char[] lllllllllllllllIIlIlIlIllIlIIllI = lllllllllllllllIIlIlIlIllIllIIII.toCharArray();
        int lllllllllllllllIIlIlIlIllIlIIlIl = lllllllllllllllIIlIlIlIllIlIIllI.length;
        int lllllllllllllllIIlIlIlIllIlIIlII = llllIIlIlIII[0];
        while (a.lIIIllllllIIIll(lllllllllllllllIIlIlIlIllIlIIlII, lllllllllllllllIIlIlIlIllIlIIlIl)) {
            char lllllllllllllllIIlIlIlIllIllIIIl = lllllllllllllllIIlIlIlIllIlIIllI[lllllllllllllllIIlIlIlIllIlIIlII];
            lllllllllllllllIIlIlIlIllIlIlllI.append((char)(lllllllllllllllIIlIlIlIllIllIIIl ^ lllllllllllllllIIlIlIlIllIlIllIl[lllllllllllllllIIlIlIlIllIlIllII % lllllllllllllllIIlIlIlIllIlIllIl.length]));
            0;
            ++lllllllllllllllIIlIlIlIllIlIllII;
            ++lllllllllllllllIIlIlIlIllIlIIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIlIllIlIlllI);
    }

    public int e() {
        return llllIIlIlIII[2] - this.d();
    }

    public int l() {
        return this.p;
    }

    public Client j() {
        return this.n;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileMoved projectileMoved) {
        a lllllllllllllllIIlIlIllIIIIIlIIl;
        void lllllllllllllllIIlIlIllIIIIIIlll;
        Projectile projectile = projectileMoved.getProjectile();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIllllllIIIII(this.n.getGameCycle(), projectile.getStartCycle())) {
            return;
        }
        int lllllllllllllllIIlIlIllIIIIIIllI = lllllllllllllllIIlIlIllIIIIIIlll.getId();
        if (a.lIIIlllllIlllIl(lllllllllllllllIIlIlIllIIIIIlIIl.o.S().ad(), lllllllllllllllIIlIlIllIIIIIIllI)) {
            if (a.lIIIllllllIIIII(lllllllllllllllIIlIlIllIIIIIlIIl.o.N(), lllllllllllllllIIlIlIllIIIIIlIIl.o.O())) {
                lllllllllllllllIIlIlIllIIIIIlIIl.o.A();
            }
            if (a.lIIIlllllIlllIl(lllllllllllllllIIlIlIllIIIIIIllI, llllIIlIlIII[3])) {
                void lllllllllllllllIIlIlIllIIIIIlIII;
                lllllllllllllllIIlIlIllIIIIIlIIl.l.put(lllllllllllllllIIlIlIllIIIIIlIII.getPosition(), (Projectile)lllllllllllllllIIlIlIllIIIIIIlll);
                0;
                lllllllllllllllIIlIlIllIIIIIlIIl.m.add(lllllllllllllllIIlIlIllIIIIIlIII.getPosition());
                0;
                lllllllllllllllIIlIlIllIIIIIlIIl.q = lllllllllllllllIIlIlIllIIIIIlIIl.n.getTickCount();
                0;
                if (-(3 ^ (0x16 ^ 0x11)) > 0) {
                    return;
                }
            }
        } else if (a.lIIIllllllIIIIl(lllllllllllllllIIlIlIllIIIIIlIIl.n.getTickCount(), lllllllllllllllIIlIlIllIIIIIlIIl.p) && (!a.lIIIllllllIIIIl(lllllllllllllllIIlIlIllIIIIIIllI, u.i.r.d.s.e.r.q.y.a.h.-.j.MAGIC.W()) || a.lIIIlllllIlllIl(lllllllllllllllIIlIlIllIIIIIIllI, u.i.r.d.s.e.r.q.y.a.h.-.j.RANGED.W()))) {
            lllllllllllllllIIlIlIllIIIIIlIIl.a(lllllllllllllllIIlIlIllIIIIIIllI);
            lllllllllllllllIIlIlIllIIIIIlIIl.p = lllllllllllllllIIlIlIllIIIIIlIIl.n.getTickCount();
        }
    }

    private static String lIIIlllllIlIlll(String lllllllllllllllIIlIlIlIllIIllIIl, String lllllllllllllllIIlIlIlIllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), llllIIlIlIII[16]), "DES");
            Cipher lllllllllllllllIIlIlIlIllIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIlIllIIlllIl.init(llllIIlIlIII[4], lllllllllllllllIIlIlIlIllIIllllI);
            return new String(lllllllllllllllIIlIlIlIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlIllIIlllII) {
            lllllllllllllllIIlIlIlIllIIlllII.printStackTrace();
            return null;
        }
    }

    public int d() {
        return this.n.getTickCount() - this.r;
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        NPC nPC = npcDespawned.getNpc();
        if (a.lIIIlllllIllIlI(nPC.getName().equals(llllIIlIIlll[llllIIlIlIII[0]]) ? 1 : 0)) {
            this.r = this.n.getTickCount();
            this.o = null;
            this.l.clear();
            this.m.clear();
            this.s += llllIIlIlIII[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        a lllllllllllllllIIlIlIllIIIIIIIlI;
        void lllllllllllllllIIlIlIllIIIIIIIII;
        String string = chatMessage.getMessage();
        if (a.lIIIllllllIIIlI(this.o)) {
            return;
        }
        if (a.lIIIlllllIllIlI(lllllllllllllllIIlIlIllIIIIIIIII.equals(llllIIlIIlll[llllIIlIlIII[4]]) ? 1 : 0)) {
            lllllllllllllllIIlIlIllIIIIIIIlI.o.d(llllIIlIlIII[0]);
            0;
            if (((51 + 46 - -36 + 90 ^ 12 + 138 - -37 + 9) & (4 + 86 - 8 + 75 ^ 62 + 79 - 138 + 131 ^ -1)) > ((39 + 128 - 97 + 98 ^ 123 + 6 - 19 + 39) & (58 + 55 - -54 + 2 ^ 35 + 21 - -57 + 35 ^ -1))) {
                return;
            }
        } else if (a.lIIIlllllIllIlI(lllllllllllllllIIlIlIllIIIIIIIII.equals(llllIIlIIlll[llllIIlIlIII[5]]) ? 1 : 0)) {
            lllllllllllllllIIlIlIllIIIIIIIlI.o.l(lllllllllllllllIIlIlIllIIIIIIIlI.n.getTickCount());
        }
    }

    private static String lIIIlllllIlIllI(String lllllllllllllllIIlIlIlIlllIIIIII, String lllllllllllllllIIlIlIlIllIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIlllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIlllIIIIlI.init(llllIIlIlIII[4], lllllllllllllllIIlIlIlIlllIIIIll);
            return new String(lllllllllllllllIIlIlIlIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlIlllIIIIIl) {
            lllllllllllllllIIlIlIlIlllIIIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(OverheadTextChanged overheadTextChanged) {
        void lllllllllllllllIIlIlIlIllllllIIl;
        Actor actor = overheadTextChanged.getActor();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIlllllIlllII(actor, this.o.K())) {
            return;
        }
        String lllllllllllllllIIlIlIlIllllllIII = lllllllllllllllIIlIlIlIllllllIIl.getOverheadText();
        if (a.lIIIllllllIIIlI(lllllllllllllllIIlIlIlIllllllIII)) {
            return;
        }
        this.o.d(llllIIlIlIII[0]);
    }

    @Inject
    public a(Client client) {
        this.l = new HashMap<LocalPoint, Projectile>();
        this.m = new HashSet<LocalPoint>();
        this.o = null;
        this.s = llllIIlIlIII[0];
        this.n = client;
    }
}

