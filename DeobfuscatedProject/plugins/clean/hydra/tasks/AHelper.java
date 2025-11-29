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
package gg.squire.hydra.tasks;

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
import gg.squire.hydra.tasks.BHelper;
import gg.squire.hydra.tasks.HHelper;
import gg.squire.hydra.tasks.GameEnum11;
import gg.squire.hydra.tasks.GameEnum;

@Singleton
public class AHelper {
    
    private final  Map<LocalPoint, Projectile> l;
    private  int r;
    
    private static final  int[] k;
    private static final  String j;
    private  int s;
    private static final  String i;
    private  int q;
    private  int p;
    private final  Set<LocalPoint> m;
    private final  Client n;
    private  h o;

    public void b(int n2) {
        this.p = n2;
    }

    private static boolean lIIIlllllIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllllllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private void AHelper(int n2) {
        if (a.lIIIllllllIIIIl(n2, this.o.L().W())) {
            this.o.D();

            if (-(0x2F ^ 0x2B) >= 0) {
                return;
            }
        } else {
            a var1;
            var1.o.s();
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

    protected boolean AHelper(Object object) {
        return object instanceof a;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block37: {
            block38: {
                h var2;
                h var3;
                block36: {
                    a var4;
                    a var5;
                    block34: {
                        block35: {
                            Client var6;
                            Client var7;
                            block33: {
                                block31: {
                                    block32: {
                                        Set<LocalPoint> var8;
                                        Set<LocalPoint> var9;
                                        block30: {
                                            block28: {
                                                block29: {
                                                    Map<LocalPoint, Projectile> var10;
                                                    Map<LocalPoint, Projectile> var11;
                                                    block27: {
                                                        void var12;
                                                        if (a.lIIIlllllIllllI(object, this)) {
                                                            return llllIIlIlIII[1];
                                                        }
                                                        if (a.lIIIlllllIlllll(var12 instanceof a)) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        var5 = (AHelper) ar12;
                                                        if (a.lIIIlllllIlllll(var5.AHelper(var4) ? 1 : 0)) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(var4.l(), var5.l())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(var4.m(), var5.m())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(var4.n(), var5.n())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        if (a.lIIIllllllIIIIl(var4.o(), var5.o())) {
                                                            return llllIIlIlIII[0];
                                                        }
                                                        var11 = var4.i();
                                                        var10 = var5.i();
                                                        if (!a.lIIIllllllIIIlI(var11)) break block27;
                                                        if (!a.lIIIlllllIllIll(var10)) break block28;

                                                        }
                                                        break block29;
                                                    }
                                                    if (!a.lIIIlllllIlllll(((Object)var11).equals(var10) ? 1 : 0)) break block28;
                                                }
                                                return llllIIlIlIII[0];
                                            }
                                            var9 = var4.f();
                                            var8 = var5.f();
                                            if (!a.lIIIllllllIIIlI(var9)) break block30;
                                            if (!a.lIIIlllllIllIll(var8)) break block31;

                                            if (3 < 0) {
                                                return false;
                                            }
                                            break block32;
                                        }
                                        if (!a.lIIIlllllIlllll(((Object)var9).equals(var8) ? 1 : 0)) break block31;
                                    }
                                    return llllIIlIlIII[0];
                                }
                                var7 = var4.j();
                                var6 = var5.j();
                                if (!a.lIIIllllllIIIlI(var7)) break block33;
                                if (!a.lIIIlllllIllIll(var6)) break block34;

                                break block35;
                            }
                            if (!a.lIIIlllllIlllll(var7.equals(var6) ? 1 : 0)) break block34;
                        }
                        return llllIIlIlIII[0];
                    }
                    var3 = var4.k();
                    var2 = var5.k();
                    if (!a.lIIIllllllIIIlI(var3)) break block36;
                    if (!a.lIIIlllllIllIll(var2)) break block37;

                    if (((0x54 ^ 7) & ~(0xDB ^ 0x88)) != 0) {
                        return false;
                    }
                    break block38;
                }
                if (!a.lIIIlllllIlllll(((Object)var3).equals(var2) ? 1 : 0)) break block37;
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
    public void AHelper(NpcChanged npcChanged) {
        void var13;
        a var14;
        NPC nPC = npcChanged.getNpc();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIlllllIlllII(nPC, this.o.K())) {
            return;
        }
        k var15 = var14.o.S();
        switch (var13.getId()) {
            case 8619: {
                var14.o.AHelper(u.i.r.d.s.e.r.q.y.a.h.-.k.LIGHTNING);

                if ((3 & ~3) == 0) break;
                return;
            }
            case 8620: {
                var14.o.AHelper(u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME);

                if ((0x3D ^ 0x39) > 1) break;
                return;
            }
            case 8621: {
                var14.o.AHelper(u.i.r.d.s.e.r.q.y.a.h.-.k.ENRAGED);
            }
        }
    }

    public void AHelper(h h2) {
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
        a.llllIIlIIlll[a.llllIIlIlIII[0]] = "Alchemical Hydra";
        a.llllIIlIIlll[a.llllIIlIlIII[1]] = "Roa";
        a.llllIIlIIlll[a.llllIIlIlIII[4]] = "The chemicals neutralise the Alchemical Hydra's defences!";
        a.llllIIlIIlll[a.llllIIlIlIII[5]] = "The Alchemical Hydra temporarily stuns you.";
        a.llllIIlIIlll[a.llllIIlIlIII[9]] = "The chemicals neutralise the Alchemical Hydra's defences!";
        a.llllIIlIIlll[a.llllIIlIlIII[10]] = "The Alchemical Hydra temporarily stuns you.";
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
    private void AHelper(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (a.lIIIlllllIllIlI(h.AHelper((Actor)nPC) ? 1 : 0)) {
            this.o = new HHelper(nPC);
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
        this.o = new HHelper(nPC);
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        int n4;
        a var16;
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

            if ((0xA0 ^ 0xA9 ^ (0x19 ^ 0x14)) == 1) {
                return (0x9D ^ 0x8F ^ (0x1C ^ 0x28)) & (0x59 ^ 0x1B ^ (0x31 ^ 0x55) ^ -1);
            }
        } else {
            void var17;
            n5 = var17.hashCode();
        }
        int var18 = n8 + n5;
        Set<LocalPoint> var19 = var16.f();
        int n9 = var18 * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(var19)) {
            n4 = llllIIlIlIII[8];

            if (-1 == ((0xA5 ^ 0x96) & ~(0x22 ^ 0x11))) {
                return (0x4A ^ 0x7A) & ~(0x99 ^ 0xA9);
            }
        } else {
            n4 = ((Object)var19).hashCode();
        }
        var18 = n9 + n4;
        Client var20 = var16.j();
        int n10 = var18 * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(var20)) {
            n3 = llllIIlIlIII[8];

            if (((0xB3 ^ 0xA3) & ~(0x11 ^ 1)) != 0) {
                return (0x9A ^ 0xA5) & ~(0xB9 ^ 0x86);
            }
        } else {
            n3 = var20.hashCode();
        }
        var18 = n10 + n3;
        h var21 = var16.k();
        int n11 = var18 * llllIIlIlIII[7];
        if (a.lIIIllllllIIIlI(var21)) {
            n2 = llllIIlIlIII[8];

            if (2 == (104 + 182 - 131 + 34 ^ 138 + 28 - 130 + 149)) {
                return (94 + 45 - 68 + 103 ^ 15 + 28 - -69 + 30) & (0x58 ^ 3 ^ (0x43 ^ 0x38) ^ -1);
            }
        } else {
            n2 = ((Object)var21).hashCode();
        }
        n7 = n11 + n2;
        return n7;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void AHelper(AnimationChanged animationChanged) {
        void var22;
        a var23;
        Actor actor = animationChanged.getActor();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIlllllIlllII(actor, this.o.K())) {
            return;
        }
        k var24 = var23.o.S();
        int var25 = var22.getAnimation();
        if (a.lIIIlllllIlllIl(var25, var24.ac()) && !a.lIIIlllllIllllI((Object)var24, (Object)u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME) || a.lIIIlllllIlllIl(var25, var24.ab()) && a.lIIIlllllIllllI((Object)var24, (Object)u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME)) {
            switch (b.t[var24.ordinal()]) {
                case 1: {
                    var23.o.AHelper(u.i.r.d.s.e.r.q.y.a.h.-.k.LIGHTNING);

                    if (null == null) break;
                    return;
                }
                case 2: {
                    var23.o.AHelper(u.i.r.d.s.e.r.q.y.a.h.-.k.FLAME);

                    if (-(65 + 79 - 105 + 150 ^ 12 + 132 - 131 + 172) <= 0) break;
                    return;
                }
                case 3: {
                    var23.o.AHelper(u.i.r.d.s.e.r.q.y.a.h.-.k.ENRAGED);

                    if (-1 < (0x24 ^ 0x21 ^ 1)) break;
                    return;
                }
                case 4: {
                    var23.o = null;
                    var23.l.clear();
                }
            }

            if (1 >= 2) {
                return;
            }
        } else if (a.lIIIlllllIlllIl(var25, var24.ae()) && a.lIIIlllllIllIlI(var24.ae())) {
            var23.o.A();
        }
        if (a.lIIIlllllIllIll(var22.getOverheadText()) && a.lIIIlllllIllIlI(var22.getOverheadText().contains(llllIIlIIlll[llllIIlIlIII[1]]) ? 1 : 0)) {
            var23.o.d(llllIIlIlIII[0]);
        }
        if (a.lIIIlllllIlllll(var23.l.isEmpty() ? 1 : 0)) {
            var23.l.values().removeIf(projectile -> {
                boolean bl;
                if (a.lIIIllllllIIIll(projectile.getEndCycle(), this.n.getGameCycle())) {
                    bl = llllIIlIlIII[1];

                    if (-(0xBC ^ 0xB8) >= 0) {
                        return false;
                    }
                } else {
                    bl = llllIIlIlIII[0];
                }
                return bl;
            });

        }
    }

    private static boolean lIIIllllllIIIlI(Object object) {
        return object == null;
    }

        return String.valueOf(var26);
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
    public void AHelper(ProjectileMoved projectileMoved) {
        a var27;
        void var28;
        Projectile projectile = projectileMoved.getProjectile();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIllllllIIIII(this.n.getGameCycle(), projectile.getStartCycle())) {
            return;
        }
        int var29 = var28.getId();
        if (a.lIIIlllllIlllIl(var27.o.S().ad(), var29)) {
            if (a.lIIIllllllIIIII(var27.o.N(), var27.o.O())) {
                var27.o.A();
            }
            if (a.lIIIlllllIlllIl(var29, llllIIlIlIII[3])) {
                void var30;
                var27.l.put(var30.getPosition(), (Projectile)var28);

                var27.m.add(var30.getPosition());

                var27.q = var27.n.getTickCount();

                if (-(3 ^ (0x16 ^ 0x11)) > 0) {
                    return;
                }
            }
        } else if (a.lIIIllllllIIIIl(var27.n.getTickCount(), var27.p) && (!a.lIIIllllllIIIIl(var29, u.i.r.d.s.e.r.q.y.a.h.-.j.MAGIC.W()) || a.lIIIlllllIlllIl(var29, u.i.r.d.s.e.r.q.y.a.h.-.j.RANGED.W()))) {
            var27.AHelper(var29);
            var27.p = var27.n.getTickCount();
        }
    }

    public int d() {
        return this.n.getTickCount() - this.r;
    }

    @Subscribe
    private void AHelper(NpcDespawned npcDespawned) {
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
    private void AHelper(ChatMessage chatMessage) {
        a var31;
        void var32;
        String string = chatMessage.getMessage();
        if (a.lIIIllllllIIIlI(this.o)) {
            return;
        }
        if (a.lIIIlllllIllIlI(var32.equals(llllIIlIIlll[llllIIlIlIII[4]]) ? 1 : 0)) {
            var31.o.d(llllIIlIlIII[0]);

            if (((51 + 46 - -36 + 90 ^ 12 + 138 - -37 + 9) & (4 + 86 - 8 + 75 ^ 62 + 79 - 138 + 131 ^ -1)) > ((39 + 128 - 97 + 98 ^ 123 + 6 - 19 + 39) & (58 + 55 - -54 + 2 ^ 35 + 21 - -57 + 35 ^ -1))) {
                return;
            }
        } else if (a.lIIIlllllIllIlI(var32.equals(llllIIlIIlll[llllIIlIlIII[5]]) ? 1 : 0)) {
            var31.o.l(var31.n.getTickCount());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void AHelper(OverheadTextChanged overheadTextChanged) {
        void var33;
        Actor actor = overheadTextChanged.getActor();
        if (!a.lIIIlllllIllIll(this.o) || a.lIIIlllllIlllII(actor, this.o.K())) {
            return;
        }
        String var34 = var33.getOverheadText();
        if (a.lIIIllllllIIIlI(var34)) {
            return;
        }
        this.o.d(llllIIlIlIII[0]);
    }

    @Inject
    public AHelper(Client client) {
        this.l = new HashMap<LocalPoint, Projectile>();
        this.m = new HashSet<LocalPoint>();
        this.o = null;
        this.s = llllIIlIlIII[0];
        this.n = client;
    }
}

