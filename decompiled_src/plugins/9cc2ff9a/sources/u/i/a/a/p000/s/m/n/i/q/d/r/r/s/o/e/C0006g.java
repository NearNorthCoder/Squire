package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
@Singleton
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/g.class */
public class C0006g {

    /* renamed from: u  reason: collision with root package name */
    private /* synthetic */ j f0u;
    private static /* synthetic */ String[] lIIlIIllIlIII;
    private static /* synthetic */ int[] lIIlIIllIlIlI;
    private /* synthetic */ int t;
    private /* synthetic */ int v;
    private static final /* synthetic */ RectangularArea r;
    private final /* synthetic */ Client s;
    private static final /* synthetic */ int q;

    public int r() {
        return lIlIlIlIIlIllIl(this.s.getVarbitValue(lIIlIIllIlIlI[7]), lIIlIIllIlIlI[2]) ? lIIlIIllIlIlI[8] : lIlIlIlIIlIllIl(this.s.getVarbitValue(lIIlIIllIlIlI[9]), lIIlIIllIlIlI[2]) ? lIIlIIllIlIlI[10] : lIlIlIlIIlIllIl(this.s.getVarbitValue(lIIlIIllIlIlI[11]), lIIlIIllIlIlI[2]) ? lIIlIIllIlIlI[12] : lIlIlIlIIlIllIl(this.s.getVarbitValue(lIIlIIllIlIlI[13]), lIIlIIllIlIlI[2]) ? lIIlIIllIlIlI[14] : lIIlIIllIlIlI[15];
    }

    private static boolean lIlIlIlIIlIlIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIIlIllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIlIIlIllII(Object obj) {
        return obj == null;
    }

    public boolean m() {
        return a(Players.getLocal().getWorldLocation());
    }

    static {
        lIlIlIlIIlIlIII();
        lIlIlIlIIlIIllI();
        q = lIIlIIllIlIlI[4];
        r = new RectangularArea(lIIlIIllIlIlI[18], lIIlIIllIlIlI[19], lIIlIIllIlIlI[20], lIIlIIllIlIlI[21]);
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIlIlIlIIlIlIIl(npcDespawned.getNpc().getName().equals(lIIlIIllIlIII[lIIlIIllIlIlI[1]]) ? 1 : 0)) {
            return;
        }
        if (lIlIlIlIIlIlIlI(m() ? 1 : 0)) {
            this.v += lIIlIIllIlIlI[1];
        }
        this.t = this.s.getTickCount();
        this.f0u = null;
    }

    private static boolean lIlIlIlIIlIlIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean o() {
        if (lIlIlIlIIlIlIll(NPCs.getNearest(npc -> {
            if (lIlIlIlIIlIlIIl(npc.isDead() ? 1 : 0) && lIlIlIlIIlIlIll(k.c(npc))) {
                ?? r0 = lIIlIIllIlIlI[1];
                "".length();
                return " ".length() >= (13 ^ 9) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIllIlIlI[0];
        }))) {
            ?? r0 = lIIlIIllIlIlI[1];
            "".length();
            return ((50 ^ 23) & ((95 ^ 122) ^ (-1))) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIllIlIlI[0];
    }

    private static boolean lIlIlIlIIlIlllI(int i, int i2) {
        return i >= i2;
    }

    public boolean s() {
        return Widgets.isVisible(Widgets.get(lIIlIIllIlIlI[16], lIIlIIllIlIlI[17]));
    }

    public j t() {
        return this.f0u;
    }

    private static boolean lIlIlIlIIlIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIlIIlIllIl(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlIlIIlIIIll(String llllllllllllllIlllllIIlllIlllIlI, String llllllllllllllIlllllIIlllIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIlllIllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIlllIllllII.init(lIIlIIllIlIlI[2], secretKeySpec);
            return new String(llllllllllllllIlllllIIlllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlllIlllIll) {
            llllllllllllllIlllllIIlllIlllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean p() {
        if (lIlIlIlIIlIlIll(NPCs.getNearest(npc -> {
            if (lIlIlIlIIlIlIll(k.c(npc))) {
                ?? r0 = lIIlIIllIlIlI[1];
                "".length();
                return " ".length() < 0 ? ((((109 + 130) - 60) + 0) ^ (((120 + 34) - 115) + 116)) & (((94 ^ 61) ^ (254 ^ 181)) ^ (-" ".length())) : r0;
            }
            return lIIlIIllIlIlI[0];
        }))) {
            ?? r0 = lIIlIIllIlIlI[1];
            "".length();
            return " ".length() != " ".length() ? ((139 ^ 177) ^ (113 ^ 10)) & (((34 ^ 44) ^ (117 ^ 58)) ^ (-" ".length())) : r0;
        }
        return lIIlIIllIlIlI[0];
    }

    public int q() {
        return Vars.getBit(lIIlIIllIlIlI[6]);
    }

    public int u() {
        return this.v;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIlIlIlIIlIlIIl(npcSpawned.getNpc().getName().equals(lIIlIIllIlIII[lIIlIIllIlIlI[0]]) ? 1 : 0)) {
            return;
        }
        this.f0u = new j(npcSpawned.getNpc());
    }

    public int k() {
        return lIlIlIlIIlIllIl(this.t, lIIlIIllIlIlI[3]) ? lIIlIIllIlIlI[3] : (this.t + lIIlIIllIlIlI[4]) - this.s.getTickCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean n() {
        int[] mapRegions = this.s.getMapRegions();
        int llllllllllllllIlllllIIllllIIlIlI = mapRegions.length;
        int i = lIIlIIllIlIlI[0];
        while (lIlIlIlIIllIIII(i, llllllllllllllIlllllIIllllIIlIlI)) {
            if (lIlIlIlIIlIllIl(mapRegions[i], lIIlIIllIlIlI[5])) {
                return lIIlIIllIlIlI[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((32 ^ 96) ^ (125 ^ 109)) & (((((187 + 108) - 160) + 94) ^ (((65 + 147) - 150) + 119)) ^ (-" ".length()));
            }
        }
        return lIIlIIllIlIlI[0];
    }

    private static void lIlIlIlIIlIIllI() {
        lIIlIIllIlIII = new String[lIIlIIllIlIlI[22]];
        lIIlIIllIlIII[lIIlIIllIlIlI[0]] = lIlIlIlIIlIIIll("8qF5B8tWqFS+clDDAWs8TB4+dfOvhci+", "YvpTK");
        lIIlIIllIlIII[lIIlIIllIlIlI[1]] = lIlIlIlIIlIIIll("4Us+EaU+t7rU1sd8i8LjmKMSZ8SWbzzo", "tnJzL");
        lIIlIIllIlIII[lIIlIIllIlIlI[2]] = lIlIlIlIIlIIIll("/wBTQ89bYw9jpL7rUrNwKIYC9rf+dJnv", "kfVue");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        RegionPoint fromWorld = RegionPoint.fromWorld(worldPoint);
        if (lIlIlIlIIlIlIIl(n() ? 1 : 0)) {
            return lIIlIIllIlIlI[0];
        }
        if (lIlIlIlIIlIlllI(fromWorld.getX(), r.getMinX()) && lIlIlIlIIlIllll(fromWorld.getX(), r.getMaxX()) && lIlIlIlIIlIlllI(fromWorld.getY(), r.getMinY()) && lIlIlIlIIlIllll(fromWorld.getY(), r.getMaxY())) {
            ?? r0 = lIIlIIllIlIlI[1];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIllIlIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean l() {
        if (lIlIlIlIIlIlIll(this.f0u) && lIlIlIlIIlIlIlI(this.f0u.A() ? 1 : 0)) {
            ?? r0 = lIIlIIllIlIlI[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIllIlIlI[0];
    }

    private static void lIlIlIlIIlIlIII() {
        lIIlIIllIlIlI = new int[23];
        lIIlIIllIlIlI[0] = (70 ^ 97) & ((225 ^ 198) ^ (-1));
        lIIlIIllIlIlI[1] = " ".length();
        lIIlIIllIlIlI[2] = "  ".length();
        lIIlIIllIlIlI[3] = -" ".length();
        lIIlIIllIlIlI[4] = (((92 ^ 8) + (69 ^ 65)) - (-(163 ^ 175))) + (7 ^ 53);
        lIIlIIllIlIlI[5] = (-137) & 11738;
        lIIlIIllIlIlI[6] = (-((-7621) & 15846)) & (-20561) & 32757;
        lIIlIIllIlIlI[7] = (-2308) & 15175;
        lIIlIIllIlIlI[8] = (40 ^ 46) ^ (28 ^ 21);
        lIIlIIllIlIlI[9] = (-((-12817) & 16061)) & (-1) & 16111;
        lIIlIIllIlIlI[10] = (10 ^ 24) ^ (41 ^ 34);
        lIIlIIllIlIlI[11] = (-170) & 13035;
        lIIlIIllIlIlI[12] = 40 ^ 54;
        lIIlIIllIlIlI[13] = (-((-65) & 2549)) & (-16395) & 31743;
        lIIlIIllIlIlI[14] = 18 ^ 49;
        lIIlIIllIlIlI[15] = 151 ^ 191;
        lIIlIIllIlIlI[16] = (-((-9105) & 28658)) & (-8193) & 28151;
        lIIlIIllIlIlI[17] = 47 ^ 63;
        lIIlIIllIlIlI[18] = (169 ^ 187) ^ (102 ^ 113);
        lIIlIIllIlIlI[19] = (((103 + 31) - 114) + 141) ^ (((157 + 108) - 199) + 102);
        lIIlIIllIlIlI[20] = 120 ^ 100;
        lIIlIIllIlIlI[21] = (78 ^ 86) ^ (164 ^ 156);
        lIIlIIllIlIlI[22] = "   ".length();
    }

    private static boolean lIlIlIlIIllIIII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public C0006g(Client client) {
        this.s = client;
        this.t = client.getTickCount();
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (lIlIlIlIIlIlIll(this.f0u)) {
            return;
        }
        String[] strArr = new String[lIIlIIllIlIlI[1]];
        strArr[lIIlIIllIlIlI[0]] = lIIlIIllIlIII[lIIlIIllIlIlI[2]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIlIlIIlIllII(nearest)) {
            return;
        }
        this.f0u = new j(nearest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean a(String str) {
        return lIIlIIllIlIlI[0];
    }
}
