package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
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
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.v  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/v.class */
public class C0021v {
    private static final /* synthetic */ RegionPoint C;
    private static /* synthetic */ int[] lIllIllllIllI;
    private static final /* synthetic */ C0012m D;
    private /* synthetic */ WorldPoint H;
    private /* synthetic */ C0011l F;
    @Inject
    private /* synthetic */ SquireZulrah E;
    public static final /* synthetic */ int A;
    private static /* synthetic */ String[] lIllIllllIlIl;
    private /* synthetic */ int I;
    public static final /* synthetic */ int B;
    private /* synthetic */ int K;
    private /* synthetic */ int J;
    private /* synthetic */ NPC G;

    private static boolean llIIlIIlllIllll(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (llIIlIIlllIllII(npc.getName().equals(lIllIllllIlIl[lIllIllllIllI[0]]) ? 1 : 0)) {
            return;
        }
        this.G = npc;
        this.F = D.F();
        this.H = Players.getLocal().getWorldLocation();
    }

    public int Y() {
        return this.I;
    }

    public WorldPoint X() {
        return this.H;
    }

    private static boolean llIIlIIllllIIII(int i) {
        return i != 0;
    }

    private static boolean llIIlIIllllIIIl(int i, int i2) {
        return i != i2;
    }

    private static void llIIlIIlllIlIlI() {
        lIllIllllIlIl = new String[lIllIllllIllI[1]];
        lIllIllllIlIl[lIllIllllIllI[0]] = llIIlIIlllIlIIl("yVUfEWmtgUw=", "ceqJV");
    }

    public void T() {
        this.G = null;
        this.H = null;
        this.F = null;
        this.I = lIllIllllIllI[0];
    }

    private static boolean llIIlIIlllIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void R() {
        this.F = D.F();
        this.H = Players.getLocal().getWorldLocation();
    }

    private static boolean llIIlIIlllIlllI(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIllllIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean U() {
        if (!llIIlIIlllIllIl(this.F.C(), EnumC0010k.MAGMA_CENTER_NW) || llIIlIIllllIIlI(this.F.C(), EnumC0010k.MAGMA_CENTER_NE)) {
            ?? r0 = lIllIllllIllI[1];
            "".length();
            return ("   ".length() & ("   ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIllllIllI[0];
    }

    private static void llIIlIIlllIlIll() {
        lIllIllllIllI = new int[10];
        lIllIllllIllI[0] = ((((226 + 128) - 274) + 160) ^ (((59 + 138) - 104) + 78)) & (((((137 + 108) - 90) + 3) ^ (((66 + 15) - (-4)) + 112)) ^ (-" ".length()));
        lIllIllllIllI[1] = " ".length();
        lIllIllllIllI[2] = (-9225) & 14296;
        lIllIllllIllI[3] = (-2087) & 7159;
        lIllIllllIllI[4] = (-((-4365) & 31693)) & (-4394) & 32765;
        lIllIllllIllI[5] = (-((-16453) & 26861)) & (-21314) & 32767;
        lIllIllllIllI[6] = (((160 + 74) - 99) + 30) ^ (((125 + 4) - (-24)) + 32);
        lIllIllllIllI[7] = (13 ^ 16) ^ (129 ^ 160);
        lIllIllllIllI[8] = (-5313) & 14319;
        lIllIllllIllI[9] = "  ".length();
    }

    static {
        llIIlIIlllIlIll();
        llIIlIIlllIlIlI();
        B = lIllIllllIllI[3];
        A = lIllIllllIllI[2];
        C = new RegionPoint(lIllIllllIllI[6], lIllIllllIllI[7], lIllIllllIllI[0], lIllIllllIllI[8]);
        C0011l c0011l = new C0011l(EnumC0010k.INITIAL, null);
        c0011l.a(EnumC0010k.GREEN_EAST_NE).a(EnumC0010k.MAGMA_CENTER_NW).a(EnumC0010k.TANZ_WEST_W).a(EnumC0010k.GREEN_SOUTH_W).a(EnumC0010k.TANZ_EAST_E).a(EnumC0010k.GREEN_CENTER_W).a(EnumC0010k.GREEN_WEST_W).a(EnumC0010k.TANZ_CENTER_E).a(EnumC0010k.JAD_PHASE_E).a(EnumC0010k.TANZ_CENTER_NE);
        "".length();
        c0011l.a(EnumC0010k.TANZ_EAST_NE).a(EnumC0010k.GREEN_SOUTH_W).a(EnumC0010k.TANZ_WEST_W).a(EnumC0010k.MAGMA_CENTER_E).a(EnumC0010k.GREEN_EAST_E).a(EnumC0010k.GREEN_SOUTH_W).a(EnumC0010k.TANZ_WEST_W).a(EnumC0010k.GREEN_CENTER_E).a(EnumC0010k.TANZ_CENTER_E).a(EnumC0010k.JAD_PHASE_E).a(EnumC0010k.TANZ_CENTER_NE);
        "".length();
        C0011l a2 = c0011l.a(EnumC0010k.MAGMA_CENTER_NE).a(EnumC0010k.TANZ_CENTER_E);
        a2.a(EnumC0010k.GREEN_SOUTH_W).a(EnumC0010k.MAGMA_CENTER_W).a(EnumC0010k.TANZ_WEST_W).a(EnumC0010k.GREEN_SOUTH_E).a(EnumC0010k.TANZ_SOUTH_CW).a(EnumC0010k.JAD_PHASE_W).a(EnumC0010k.MAGMA_CENTER_NE);
        "".length();
        a2.a(EnumC0010k.GREEN_WEST_W).a(EnumC0010k.TANZ_SOUTH_C).a(EnumC0010k.MAGMA_CENTER_W).a(EnumC0010k.GREEN_EAST_CE).a(EnumC0010k.TANZ_SOUTH_CW).a(EnumC0010k.JAD_PHASE_W).a(EnumC0010k.MAGMA_CENTER_NE);
        "".length();
        D = new C0012m(c0011l);
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (llIIlIIlllIlllI(this.G)) {
            return;
        }
        this.H = S();
        if (!llIIlIIlllIllll(this.F.C().w().L(), this.G.getId()) || llIIlIIlllIllII(this.F.C().b(this.H).equals(this.G.getWorldLocation()) ? 1 : 0)) {
            C0011l E = this.F.E();
            if (llIIlIIlllIlllI(E)) {
                return;
            }
            for (C0011l c0011l : new ArrayList(E.D())) {
                if (llIIlIIllllIIII(c0011l.C().b(this.H).equals(this.G.getWorldLocation()) ? 1 : 0) && llIIlIIlllIllll(c0011l.C().w().L(), this.G.getId())) {
                    this.F = c0011l;
                    return;
                }
                "".length();
                if ((-(66 ^ 70)) > 0) {
                    return;
                }
            }
        }
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (llIIlIIlllIllIl(actor, this.G)) {
            return;
        }
        int llllllllllllllIllIIIlIIIIIIIllIl = actor.getAnimation();
        if (llIIlIIllllIIIl(llllllllllllllIllIIIlIIIIIIIllIl, lIllIllllIllI[2])) {
            if (llIIlIIlllIllll(llllllllllllllIllIIIlIIIIIIIllIl, lIllIllllIllI[3])) {
                this.J = Static.getClient().getTickCount();
                this.K = lIllIllllIllI[0];
            }
        } else if (!llIIlIIllllIIII(this.F.C().b(this.H).equals(this.G.getWorldLocation()) ? 1 : 0) || llIIlIIllllIIIl(this.F.C().w().L(), this.G.getId())) {
        } else {
            List<C0011l> D2 = this.F.D();
            if (llIIlIIllllIIII(D2.isEmpty() ? 1 : 0)) {
                this.F = D.F();
            } else {
                this.F = D2.get(lIllIllllIllI[0]);
            }
        }
    }

    private WorldPoint S() {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, C.toWorld()).stream().filter(worldPoint -> {
            if (llIIlIIlllIllll(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIllIllllIllI[1];
                "".length();
                return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIllllIllI[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    public C0011l V() {
        return this.F;
    }

    public NPC W() {
        return this.G;
    }

    public int Z() {
        return this.J;
    }

    private static String llIIlIIlllIlIIl(String llllllllllllllIllIIIIlllllllIIlI, String llllllllllllllIllIIIIlllllllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIIlllllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIlllllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIIlllllllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIIlllllllIlII.init(lIllIllllIllI[9], llllllllllllllIllIIIIlllllllIlIl);
            return new String(llllllllllllllIllIIIIlllllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIlllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIIlllllllIIll) {
            llllllllllllllIllIIIIlllllllIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (llIIlIIlllIllIl(npcDespawned.getNpc(), this.G)) {
            return;
        }
        this.I += lIllIllllIllI[1];
        this.E.b(lIllIllllIllI[1]);
        this.G = null;
        this.H = null;
        this.F = null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (!llIIlIIlllIllll(projectile.getId(), lIllIllllIllI[4])) {
            if (llIIlIIlllIllll(projectile.getId(), lIllIllllIllI[5])) {
                this.K += lIllIllllIllI[1];
                return;
            }
            return;
        }
        this.K += lIllIllllIllI[1];
        "".length();
        if ((-(27 ^ 30)) >= 0) {
        }
    }

    public int aa() {
        return this.K;
    }

    private static boolean llIIlIIlllIllII(int i) {
        return i == 0;
    }
}
