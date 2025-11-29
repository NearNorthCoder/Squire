package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
@Singleton
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.l  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/l.class */
public class l {
    private /* synthetic */ int z = lIllIIllIIlIl[0];
    private static final /* synthetic */ int w;
    private static /* synthetic */ int[] lIllIIllIIlIl;
    private static /* synthetic */ String[] lIllIIlIlllII;
    private /* synthetic */ C0003d A;
    private final /* synthetic */ Client y;
    private /* synthetic */ int B;
    private static final /* synthetic */ RectangularArea x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean G() {
        int[] iArr = new int[lIllIIllIIlIl[3]];
        iArr[lIllIIllIIlIl[1]] = lIllIIllIIlIl[6];
        iArr[lIllIIllIIlIl[2]] = lIllIIllIIlIl[7];
        if (llIIIllIlIIlIIl(TileObjects.getNearest(iArr))) {
            ?? r0 = lIllIIllIIlIl[2];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllIIlIl[1];
    }

    public C0003d I() {
        return this.A;
    }

    private static void llIIIllIlIIIllI() {
        lIllIIllIIlIl = new int[14];
        lIllIIllIIlIl[0] = -" ".length();
        lIllIIllIIlIl[1] = ((101 ^ 85) ^ (104 ^ 85)) & (((((68 + 108) - 8) + 36) ^ (((180 + 19) - 156) + 150)) ^ (-" ".length()));
        lIllIIllIIlIl[2] = " ".length();
        lIllIIllIIlIl[3] = "  ".length();
        lIllIIllIIlIl[4] = (((((5 + 10) - (-20)) + 93) + (((128 + 123) - 135) + 29)) - (((78 + 203) - 56) + 20)) + (56 ^ 66);
        lIllIIllIIlIl[5] = (-28694) & 32669;
        lIllIIllIIlIl[6] = 181 ^ 178;
        lIllIIllIIlIl[7] = (-((-2789) & 24559)) & (-33) & 64831;
        lIllIIllIIlIl[8] = (118 ^ 1) ^ (196 ^ 185);
        lIllIIllIIlIl[9] = 121 ^ 90;
        lIllIIllIIlIl[10] = (36 ^ 124) ^ (20 ^ 72);
        lIllIIllIIlIl[11] = 158 ^ 162;
        lIllIIllIIlIl[12] = (15 ^ 56) ^ (151 ^ 180);
        lIllIIllIIlIl[13] = "   ".length();
    }

    private static boolean llIIIllIlIIlIlI(Object obj) {
        return obj == null;
    }

    static {
        llIIIllIlIIIllI();
        llIIIllIIlIllII();
        w = lIllIIllIIlIl[4];
        x = new RectangularArea(lIllIIllIIlIl[9], lIllIIllIIlIl[10], lIllIIllIIlIl[11], lIllIIllIIlIl[12]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean A() {
        if (llIIIllIlIIlIIl(this.A) && llIIIllIlIIlIII(this.A.k() ? 1 : 0)) {
            ?? r0 = lIllIIllIIlIl[2];
            "".length();
            return "  ".length() >= (52 ^ 48) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllIIlIl[1];
    }

    public int F() {
        return Vars.getBit(lIllIIllIIlIl[5]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean D() {
        if (llIIIllIlIIlIIl(NPCs.getNearest(npc -> {
            if (llIIIllIlIIIlll(npc.isDead() ? 1 : 0) && llIIIllIlIIlIIl(EnumC0004e.a(npc))) {
                ?? r0 = lIllIIllIIlIl[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIllIIlIl[1];
        }))) {
            ?? r0 = lIllIIllIIlIl[2];
            "".length();
            return ((2 ^ 72) ^ (20 ^ 91)) <= 0 ? ("   ".length() ^ (61 ^ 109)) & (((((188 + 208) - 187) + 23) ^ (((85 + 31) - (-27)) + 44)) ^ (-" ".length())) : r0;
        }
        return lIllIIllIIlIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean E() {
        if (llIIIllIlIIlIIl(NPCs.getNearest(npc -> {
            if (llIIIllIlIIlIIl(EnumC0004e.a(npc))) {
                ?? r0 = lIllIIllIIlIl[2];
                "".length();
                return "   ".length() > ((212 ^ 172) ^ (191 ^ 195)) ? ((163 ^ 166) ^ (62 ^ 14)) & (("   ".length() ^ (65 ^ 119)) ^ (-" ".length())) : r0;
            }
            return lIllIIllIIlIl[1];
        }))) {
            ?? r0 = lIllIIllIIlIl[2];
            "".length();
            return " ".length() == 0 ? ((((10 + 60) - (-58)) + 49) ^ (((132 + 76) - 51) + 17)) & (((81 ^ 85) ^ (100 ^ 127)) ^ (-" ".length())) : r0;
        }
        return lIllIIllIIlIl[1];
    }

    private static boolean llIIIllIlIIllIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean C() {
        int[] mapRegions = this.y.getMapRegions();
        int length = mapRegions.length;
        int i = lIllIIllIIlIl[1];
        while (llIIIllIlIIlllI(i, length)) {
            if (llIIIllIlIIlIll(mapRegions[i], C0002c.b())) {
                return lIllIIllIIlIl[2];
            }
            i++;
            "".length();
            if (((5 ^ 62) & ((141 ^ 182) ^ (-1))) < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIllIIllIIlIl[1];
    }

    private static boolean llIIIllIlIIIlll(int i) {
        return i == 0;
    }

    private static String llIIIllIIlIlIlI(String llllllllllllllIllIIlIIlIIlIllIll, String llllllllllllllIllIIlIIlIIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIlIIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIlIIlIlllIl.init(lIllIIllIIlIl[3], secretKeySpec);
            return new String(llllllllllllllIllIIlIIlIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIlIIlIlllII) {
            llllllllllllllIllIIlIIlIIlIlllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(WorldPoint worldPoint) {
        RegionPoint fromWorld = RegionPoint.fromWorld(worldPoint);
        if (llIIIllIlIIIlll(C() ? 1 : 0)) {
            return lIllIIllIIlIl[1];
        }
        if (llIIIllIlIIllII(fromWorld.getX(), x.getMinX()) && llIIIllIlIIllIl(fromWorld.getX(), x.getMaxX()) && llIIIllIlIIllII(fromWorld.getY(), x.getMinY()) && llIIIllIlIIllIl(fromWorld.getY(), x.getMaxY())) {
            ?? r0 = lIllIIllIIlIl[2];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllIIlIl[1];
    }

    private static boolean llIIIllIlIIlllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean H() {
        if (llIIIllIlIIllIl(z(), lIllIIllIIlIl[8])) {
            return lIllIIllIIlIl[1];
        }
        List all = NPCs.getAll(npc -> {
            if (llIIIllIlIIIlll(npc.isDead() ? 1 : 0) && llIIIllIlIIlIIl(EnumC0004e.a(npc))) {
                ?? r0 = lIllIIllIIlIl[2];
                "".length();
                return "  ".length() < ((69 ^ 75) & ((123 ^ 117) ^ (-1))) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
            }
            return lIllIIllIIlIl[1];
        });
        if (!llIIIllIlIIllll(all.size(), lIllIIllIIlIl[3]) || (llIIIllIlIlIIII(Combat.getMissingHealth()) && llIIIllIlIIlIll(all.size(), lIllIIllIIlIl[2]))) {
            ?? r0 = lIllIIllIIlIl[2];
            "".length();
            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllIIlIl[1];
    }

    private static String llIIIllIIlIlIll(String llllllllllllllIllIIlIIlIIlIIlIll, String llllllllllllllIllIIlIIlIIlIIlIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIIlIIlIIlIlI.toCharArray();
        int llllllllllllllIllIIlIIlIIlIIIlll = lIllIIllIIlIl[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllIIlIIlIIlIIIIII = charArray2.length;
        int i = lIllIIllIIlIl[1];
        while (llIIIllIlIIlllI(i, llllllllllllllIllIIlIIlIIlIIIIII)) {
            char llllllllllllllIllIIlIIlIIlIIllII = charArray2[i];
            sb.append((char) (llllllllllllllIllIIlIIlIIlIIllII ^ charArray[llllllllllllllIllIIlIIlIIlIIIlll % charArray.length]));
            "".length();
            llllllllllllllIllIIlIIlIIlIIIlll++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIllIlIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIllIlIIllll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIllIlIIlIIl(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (llIIIllIlIIlIIl(this.A)) {
            return;
        }
        String[] strArr = new String[lIllIIllIIlIl[2]];
        strArr[lIllIIllIIlIl[1]] = lIllIIlIlllII[lIllIIllIIlIl[3]];
        NPC nearest = NPCs.getNearest(strArr);
        if (llIIIllIlIIlIlI(nearest)) {
            return;
        }
        this.A = new C0003d(nearest);
    }

    public boolean B() {
        return b(Players.getLocal().getWorldLocation());
    }

    private static boolean llIIIllIlIIlIll(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (llIIIllIlIIIlll(npcSpawned.getNpc().getName().equals(lIllIIlIlllII[lIllIIllIIlIl[1]]) ? 1 : 0)) {
            return;
        }
        this.A = new C0003d(npcSpawned.getNpc());
    }

    public int J() {
        return this.B;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (llIIIllIlIIIlll(npcDespawned.getNpc().getName().equals(lIllIIlIlllII[lIllIIllIIlIl[2]]) ? 1 : 0)) {
            return;
        }
        if (llIIIllIlIIlIII(B() ? 1 : 0)) {
            this.B += lIllIIllIIlIl[2];
        }
        this.z = this.y.getTickCount();
        this.A = null;
    }

    @Inject
    public l(Client client) {
        this.y = client;
    }

    private static boolean llIIIllIlIIlIII(int i) {
        return i != 0;
    }

    private static void llIIIllIIlIllII() {
        lIllIIlIlllII = new String[lIllIIllIIlIl[13]];
        lIllIIlIlllII[lIllIIllIIlIl[1]] = llIIIllIIlIlIlI("nL2irJOPUoenxvefbwAhCmUCYZ0xq4ur", "buZaf");
        lIllIIlIlllII[lIllIIllIIlIl[2]] = llIIIllIIlIlIll("AmwxGSdpHzAFPzoqMR8/IQ==", "IKCpK");
        lIllIIlIlllII[lIllIIllIIlIl[3]] = llIIIllIIlIlIlI("v7UHAfydmS1WofDW7FqQDSCj3h8aJ6gP", "iPTaV");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean a(String str) {
        return lIllIIllIIlIl[1];
    }

    public int z() {
        return llIIIllIlIIlIll(this.z, lIllIIllIIlIl[0]) ? lIllIIllIIlIl[0] : (this.z + lIllIIllIIlIl[4]) - this.y.getTickCount();
    }

    private static boolean llIIIllIlIlIIII(int i) {
        return i > 0;
    }
}
