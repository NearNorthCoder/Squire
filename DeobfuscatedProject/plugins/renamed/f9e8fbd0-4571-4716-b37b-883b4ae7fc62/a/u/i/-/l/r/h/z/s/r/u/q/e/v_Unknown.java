/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.KEnum;
import a.u.i.-.l.r.h.z.s.r.u.q.e.l_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.m;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@Singleton
public class v_Unknown {
    private static final /* synthetic */ RegionPoint C;
    private static /* synthetic */ int[] lIllIllllIllI;
    private static final /* synthetic */ m D;
    private /* synthetic */ WorldPoint H;
    private /* synthetic */ l F;
    @Inject
    private /* synthetic */ SquireZulrah E;
    public static final /* synthetic */ int A;
    private static /* synthetic */ String[] lIllIllllIlIl;
    private /* synthetic */ int I;
    public static final /* synthetic */ int B;
    private /* synthetic */ int K;
    private /* synthetic */ int J;
    private /* synthetic */ NPC G;

    private static boolean llIIlIIlllIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (v.llIIlIIlllIllII(nPC.getName().equals(lIllIllllIlIl[lIllIllllIllI[0]]) ? 1 : 0)) {
            return;
        }
        this.G = nPC;
        this.F = D.F();
        this.H = Players.getLocal().getWorldLocation();
    }

    public int Y() {
        return this.I;
    }

    public WorldPoint X() {
        return this.H;
    }

    private static boolean llIIlIIllllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIllllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIlIIlllIlIlI() {
        lIllIllllIlIl = new String[lIllIllllIllI[1]];
        v.lIllIllllIlIl[v.lIllIllllIllI[0]] = v."Zulrah";
    }

    public void T() {
        this.G = null;
        this.H = null;
        this.F = null;
        this.I = lIllIllllIllI[0];
    }

    private static boolean llIIlIIlllIllIl(Object object, Object object2) {
        return object != object2;
    }

    public void R() {
        this.F = D.F();
        this.H = Players.getLocal().getWorldLocation();
    }

    private static boolean llIIlIIlllIlllI(Object object) {
        return object == null;
    }

    private static boolean llIIlIIllllIIlI(Object object, Object object2) {
        return object == object2;
    }

    public boolean U() {
        boolean bl;
        if (!v.llIIlIIlllIllIl((Object)this.F.C(), (Object)k.MAGMA_CENTER_NW) || v.llIIlIIllllIIlI((Object)this.F.C(), (Object)k.MAGMA_CENTER_NE)) {
            bl = lIllIllllIllI[1];
            0;
            if ((3 & ~3) != 0) {
                return false;
            }
        } else {
            bl = lIllIllllIllI[0];
        }
        return bl;
    }

    private static void llIIlIIlllIlIll() {
        lIllIllllIllI = new int[10];
        v.lIllIllllIllI[0] = (226 + 128 - 274 + 160 ^ 59 + 138 - 104 + 78) & (137 + 108 - 90 + 3 ^ 66 + 15 - -4 + 112 ^ -1);
        v.lIllIllllIllI[1] = 1;
        v.lIllIllllIllI[2] = 0xFFFFDBF7 & 0x37D8;
        v.lIllIllllIllI[3] = 0xFFFFF7D9 & 0x1BF7;
        v.lIllIllllIllI[4] = -(0xFFFFEEF3 & 0x7BCD) & (0xFFFFEED6 & 0x7FFD);
        v.lIllIllllIllI[5] = -(0xFFFFBFBB & 0x68ED) & (0xFFFFACBE & Short.MAX_VALUE);
        v.lIllIllllIllI[6] = 160 + 74 - 99 + 30 ^ 125 + 4 - -24 + 32;
        v.lIllIllllIllI[7] = 0xD ^ 0x10 ^ (0x81 ^ 0xA0);
        v.lIllIllllIllI[8] = 0xFFFFEB3F & 0x37EF;
        v.lIllIllllIllI[9] = 2;
    }

    static {
        v.llIIlIIlllIlIll();
        v.llIIlIIlllIlIlI();
        B = lIllIllllIllI[3];
        A = lIllIllllIllI[2];
        C = new RegionPoint(lIllIllllIllI[6], lIllIllllIllI[7], lIllIllllIllI[0], lIllIllllIllI[8]);
        l l2 = new l(k.INITIAL, null);
        l l3 = l2.a(k.GREEN_EAST_NE);
        l3.a(k.MAGMA_CENTER_NW).a(k.TANZ_WEST_W).a(k.GREEN_SOUTH_W).a(k.TANZ_EAST_E).a(k.GREEN_CENTER_W).a(k.GREEN_WEST_W).a(k.TANZ_CENTER_E).a(k.JAD_PHASE_E).a(k.TANZ_CENTER_NE);
        0;
        l l4 = l2.a(k.TANZ_EAST_NE);
        l4.a(k.GREEN_SOUTH_W).a(k.TANZ_WEST_W).a(k.MAGMA_CENTER_E).a(k.GREEN_EAST_E).a(k.GREEN_SOUTH_W).a(k.TANZ_WEST_W).a(k.GREEN_CENTER_E).a(k.TANZ_CENTER_E).a(k.JAD_PHASE_E).a(k.TANZ_CENTER_NE);
        0;
        l l5 = l2.a(k.MAGMA_CENTER_NE).a(k.TANZ_CENTER_E);
        l5.a(k.GREEN_SOUTH_W).a(k.MAGMA_CENTER_W).a(k.TANZ_WEST_W).a(k.GREEN_SOUTH_E).a(k.TANZ_SOUTH_CW).a(k.JAD_PHASE_W).a(k.MAGMA_CENTER_NE);
        0;
        l5.a(k.GREEN_WEST_W).a(k.TANZ_SOUTH_C).a(k.MAGMA_CENTER_W).a(k.GREEN_EAST_CE).a(k.TANZ_SOUTH_CW).a(k.JAD_PHASE_W).a(k.MAGMA_CENTER_NE);
        0;
        D = new m(l2);
    }

    @Subscribe
    public void a(GameTick gameTick) {
        v var2;
        if (v.llIIlIIlllIlllI(this.G)) {
            return;
        }
        var2.H = var2.S();
        if (!v.llIIlIIlllIllll(var2.F.C().w().L(), var2.G.getId()) || v.llIIlIIlllIllII(var2.F.C().b(var2.H).equals((Object)var2.G.getWorldLocation()) ? 1 : 0)) {
            l var5 = var2.F.E();
            if (v.llIIlIIlllIlllI(var5)) {
                return;
            }
            ArrayList<l> var1 = new ArrayList<l>(var5.D());
            Iterator var9 = var1.iterator();
            while (v.llIIlIIllllIIII(var9.hasNext() ? 1 : 0)) {
                l var15 = (l)var9.next();
                if (v.llIIlIIllllIIII(var15.C().b(var2.H).equals((Object)var2.G.getWorldLocation()) ? 1 : 0) && v.llIIlIIlllIllll(var15.C().w().L(), var2.G.getId())) {
                    var2.F = var15;
                    return;
                }
                0;
                if (-(0x42 ^ 0x46) <= 0) continue;
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var4_4;
        v var8;
        void var11;
        Actor actor = animationChanged.getActor();
        if (v.llIIlIIlllIllIl(actor, this.G)) {
            return;
        }
        int var14 = var11.getAnimation();
        if (v.llIIlIIllllIIIl(var14, lIllIllllIllI[2])) {
            if (v.llIIlIIlllIllll(var14, lIllIllllIllI[3])) {
                var8.J = Static.getClient().getTickCount();
                var8.K = lIllIllllIllI[0];
            }
            return;
        }
        if (!v.llIIlIIllllIIII(var8.F.C().b(var8.H).equals((Object)var8.G.getWorldLocation()) ? 1 : 0) || v.llIIlIIllllIIIl(var8.F.C().w().L(), var8.G.getId())) {
            return;
        }
        List<l> var7 = var8.F.D();
        if (v.llIIlIIllllIIII(var7.isEmpty() ? 1 : 0)) {
            var8.F = D.F();
            return;
        }
        this.F = (l)var4_4.get(lIllIllllIllI[0]);
    }

    private WorldPoint S() {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = C.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (v.llIIlIIlllIllll(worldPoint.getPlane(), client.getPlane())) {
                bl = lIllIllllIllI[1];
                0;
                if (1 > 3) {
                    return false;
                }
            } else {
                bl = lIllIllllIllI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public l V() {
        return this.F;
    }

    public NPC W() {
        return this.G;
    }

    public int Z() {
        return this.J;
    }

    private static String llIIlIIlllIlIIl(String var6, String var13) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllIllllIllI[9], var4);
            return new String(var12.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        NPC nPC = npcDespawned.getNpc();
        if (v.llIIlIIlllIllIl(nPC, this.G)) {
            return;
        }
        this.I += lIllIllllIllI[1];
        this.E.b(lIllIllllIllI[1]);
        this.G = null;
        this.H = null;
        this.F = null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var3;
        Projectile projectile = projectileSpawned.getProjectile();
        if (v.llIIlIIlllIllll(projectile.getId(), lIllIllllIllI[4])) {
            this.K += lIllIllllIllI[1];
            0;
            if (-(0x1B ^ 0x1E) >= 0) {
                return;
            }
        } else if (v.llIIlIIlllIllll(var3.getId(), lIllIllllIllI[5])) {
            llllllllllllllIllIIIlIIIIIIIIIlI.K += lIllIllllIllI[1];
        }
    }

    public int aa() {
        return this.K;
    }

    private static boolean llIIlIIlllIllII(int n2) {
        return n2 == 0;
    }
}

