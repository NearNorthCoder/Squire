package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@Singleton
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.e  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/e.class */
public class e {
    private /* synthetic */ int s;
    private static final /* synthetic */ RectangularArea o;
    private static /* synthetic */ int[] lllIIIIllII;
    private /* synthetic */ C0000a r;
    private static /* synthetic */ String[] lllIIIIlIll;

    /* renamed from: q  reason: collision with root package name */
    private /* synthetic */ int f0q = lllIIIIllII[0];
    private final /* synthetic */ Client p;
    private static final /* synthetic */ int n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean y() {
        int[] iArr = new int[lllIIIIllII[3]];
        iArr[lllIIIIllII[1]] = lllIIIIllII[6];
        iArr[lllIIIIllII[2]] = lllIIIIllII[7];
        if (lIlIllIlIIllll(TileObjects.getNearest(iArr))) {
            ?? r0 = lllIIIIllII[2];
            "".length();
            return (-"   ".length()) > 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
        }
        return lllIIIIllII[1];
    }

    private static void lIlIllIlIIllII() {
        lllIIIIllII = new int[14];
        lllIIIIllII[0] = -" ".length();
        lllIIIIllII[1] = ((83 ^ 93) ^ (224 ^ 176)) & (((((17 + 115) - 96) + 199) ^ (((119 + 48) - 73) + 87)) ^ (-" ".length()));
        lllIIIIllII[2] = " ".length();
        lllIIIIllII[3] = "  ".length();
        lllIIIIllII[4] = (((62 ^ 12) + (206 ^ 176)) - (((105 + 96) - 125) + 64)) + (46 ^ 92);
        lllIIIIllII[5] = (-((-9891) & 30371)) & (-8193) & 32647;
        lllIIIIllII[6] = 10 ^ 13;
        lllIIIIllII[7] = (-((-25089) & 30571)) & (-17025) & 65535;
        lllIIIIllII[8] = 32 ^ 16;
        lllIIIIllII[9] = 52 ^ 19;
        lllIIIIllII[10] = (108 ^ 43) ^ (237 ^ 150);
        lllIIIIllII[11] = (85 ^ 11) ^ (100 ^ 3);
        lllIIIIllII[12] = "   ".length();
        lllIIIIllII[13] = 190 ^ 182;
    }

    private static boolean lIlIllIlIlIIIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIllIlIIllII();
        lIlIllIlIIlIll();
        n = lllIIIIllII[4];
        o = new RectangularArea(lllIIIIllII[8], lllIIIIllII[9], lllIIIIllII[10], lllIIIIllII[11]);
    }

    private static boolean lIlIllIlIlIIlI(int i, int i2) {
        return i >= i2;
    }

    public int x() {
        return Vars.getBit(lllIIIIllII[5]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean u() {
        int[] mapRegions = this.p.getMapRegions();
        int length = mapRegions.length;
        int i = lllIIIIllII[1];
        while (lIlIllIlIlIlII(i, length)) {
            if (lIlIllIlIlIIIl(mapRegions[i], d.i())) {
                return lllIIIIllII[2];
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIIllII[1];
    }

    private static boolean lIlIllIlIlIIII(Object obj) {
        return obj == null;
    }

    public boolean t() {
        return b(Players.getLocal().getWorldLocation());
    }

    private static void lIlIllIlIIlIll() {
        lllIIIIlIll = new String[lllIIIIllII[12]];
        lllIIIIlIll[lllIIIIllII[1]] = lIlIllIlIIlIlI("Mtoy6v6n4RY82fQTnIi3Gt4RMl+gow7N", "ZJuwa");
        lllIIIIlIll[lllIIIIllII[2]] = lIlIllIlIIlIlI("wMV4o5Lsw7MzhaDSNYZuZePy2SuQgn4q", "ahNqy");
        lllIIIIlIll[lllIIIIllII[3]] = lIlIllIlIIlIlI("COnl5tQE6OT4mb4ssbmyKj5iHgJtzPr6", "NdjXH");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean w() {
        if (lIlIllIlIIllll(NPCs.getNearest(npc -> {
            if (lIlIllIlIIllll(b.a(npc))) {
                ?? r0 = lllIIIIllII[2];
                "".length();
                return "   ".length() <= 0 ? ((((11 + 98) - 96) + 137) ^ (((105 + 97) - 47) + 2)) & (((203 ^ 176) ^ (102 ^ 22)) ^ (-" ".length())) : r0;
            }
            return lllIIIIllII[1];
        }))) {
            ?? r0 = lllIIIIllII[2];
            "".length();
            return " ".length() == (7 ^ 3) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIllII[1];
    }

    private static boolean lIlIllIlIIllIl(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIlIllIlIIllIl(npcSpawned.getNpc().getName().equals(lllIIIIlIll[lllIIIIllII[1]]) ? 1 : 0)) {
            return;
        }
        this.r = new C0000a(npcSpawned.getNpc());
    }

    public int A() {
        return this.s;
    }

    public C0000a z() {
        return this.r;
    }

    private static boolean lIlIllIlIlIIll(int i, int i2) {
        return i <= i2;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIlIllIlIIllIl(npcDespawned.getNpc().getName().equals(lllIIIIlIll[lllIIIIllII[2]]) ? 1 : 0)) {
            return;
        }
        if (lIlIllIlIIlllI(t() ? 1 : 0)) {
            this.s += lllIIIIllII[2];
        }
        this.f0q = this.p.getTickCount();
        this.r = null;
    }

    private static boolean lIlIllIlIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(WorldPoint worldPoint) {
        RegionPoint fromWorld = RegionPoint.fromWorld(worldPoint);
        if (lIlIllIlIIllIl(u() ? 1 : 0)) {
            return lllIIIIllII[1];
        }
        if (lIlIllIlIlIIlI(fromWorld.getX(), o.getMinX()) && lIlIllIlIlIIll(fromWorld.getX(), o.getMaxX()) && lIlIllIlIlIIlI(fromWorld.getY(), o.getMinY()) && lIlIllIlIlIIll(fromWorld.getY(), o.getMaxY())) {
            ?? r0 = lllIIIIllII[2];
            "".length();
            return (140 ^ 136) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIllII[1];
    }

    private static String lIlIllIlIIlIlI(String llllllllllllllllIIlIlIIIIIIlIlIl, String llllllllllllllllIIlIlIIIIIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), lllIIIIllII[13]), "DES");
            Cipher llllllllllllllllIIlIlIIIIIIlIlll = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIIIIlIlll.init(lllIIIIllII[3], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIIIIlIllI) {
            llllllllllllllllIIlIlIIIIIIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean v() {
        if (lIlIllIlIIllll(NPCs.getNearest(npc -> {
            if (lIlIllIlIIllIl(npc.isDead() ? 1 : 0) && lIlIllIlIIllll(b.a(npc))) {
                ?? r0 = lllIIIIllII[2];
                "".length();
                return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIIllII[1];
        }))) {
            ?? r0 = lllIIIIllII[2];
            "".length();
            return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIllII[1];
    }

    private static boolean lIlIllIlIlIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean s() {
        if (lIlIllIlIIllll(this.r) && lIlIllIlIIlllI(this.r.a() ? 1 : 0)) {
            ?? r0 = lllIIIIllII[2];
            "".length();
            return (((195 ^ 189) ^ (65 ^ 51)) & (((145 ^ 176) ^ (238 ^ 195)) ^ (-" ".length()))) != 0 ? ((46 ^ 35) ^ (189 ^ 162)) & (((243 ^ 148) ^ (24 ^ 109)) ^ (-" ".length())) : r0;
        }
        return lllIIIIllII[1];
    }

    private static boolean lIlIllIlIIllll(Object obj) {
        return obj != null;
    }

    @Inject
    public e(Client client) {
        this.p = client;
    }

    public int r() {
        return lIlIllIlIlIIIl(this.f0q, lllIIIIllII[0]) ? lllIIIIllII[0] : (this.f0q + lllIIIIllII[4]) - this.p.getTickCount();
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (lIlIllIlIIllll(this.r)) {
            return;
        }
        String[] strArr = new String[lllIIIIllII[2]];
        strArr[lllIIIIllII[1]] = lllIIIIlIll[lllIIIIllII[3]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIllIlIlIIII(nearest)) {
            return;
        }
        this.r = new C0000a(nearest);
    }
}
