package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.k  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/k.class */
public class k extends AbstractC0004e {
    private final /* synthetic */ List<C0003d> ac;
    private static /* synthetic */ int[] lIIIllIlIIIll;
    private /* synthetic */ String ae;
    private final /* synthetic */ boolean ad;
    private static /* synthetic */ String[] lIIIllIlIIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public k(WorldPoint... worldPointArr) {
        this.ac = (List) Stream.of((Object[]) worldPointArr).map(C0003d::new).collect(i.w());
        this.ad = lIIIllIlIIIll[1];
    }

    private static boolean lIlIIIlIIlllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIlIIlllIlI(int i) {
        return i == 0;
    }

    static {
        lIlIIIlIIlllIIl();
        lIlIIIlIIlllIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, boolean z, C0003d c0003d) {
        boolean z2;
        this.ae = str;
        if (lIlIIIlIIlllIlI(z ? 1 : 0)) {
            int i = lIIIllIlIIIll[1];
            "".length();
            z2 = i;
            if ("  ".length() != "  ".length()) {
                throw null;
            }
        } else {
            z2 = lIIIllIlIIIll[0];
        }
        this.ad = z2;
        C0003d[] c0003dArr = new C0003d[lIIIllIlIIIll[1]];
        c0003dArr[lIIIllIlIIIll[0]] = c0003d;
        this.ac = i.a(c0003dArr);
    }

    public k(boolean z, WorldPoint... worldPointArr) {
        this.ac = (List) Stream.of((Object[]) worldPointArr).map(C0003d::new).collect(i.w());
        this.ad = z;
    }

    private static String lIlIIIlIIllIlll(String lllllllllllllllIIIIlIIllIIIIlIIl, String lllllllllllllllIIIIlIIllIIIIlIII) {
        String lllllllllllllllIIIIlIIllIIIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIllIIIIIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIIllIIIIlIII.toCharArray();
        int lllllllllllllllIIIIlIIllIIIIIlIl = lIIIllIlIIIll[0];
        char[] charArray2 = lllllllllllllllIIIIlIIllIIIIlIIl2.toCharArray();
        int lllllllllllllllIIIIlIIlIlllllllI = charArray2.length;
        int i = lIIIllIlIIIll[0];
        while (lIlIIIlIIlllllI(i, lllllllllllllllIIIIlIIlIlllllllI)) {
            char lllllllllllllllIIIIlIIllIIIIlIlI = charArray2[i];
            lllllllllllllllIIIIlIIllIIIIIlll.append((char) (lllllllllllllllIIIIlIIllIIIIlIlI ^ charArray[lllllllllllllllIIIIlIIllIIIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIIllIIIIIlIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIIllIIIIIlll);
    }

    private static void lIlIIIlIIlllIII() {
        lIIIllIlIIIlI = new String[lIIIllIlIIIll[1]];
        lIIIllIlIIIlI[lIIIllIlIIIll[0]] = lIlIIIlIIllIlll("", "WAWrD");
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.AbstractC0004e, q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    @Nonnull
    public String j() {
        if (lIlIIIlIIllllIl(this.ae)) {
            String str = lIIIllIlIIIlI[lIIIllIlIIIll[0]];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
            return str;
        }
        return this.ae;
    }

    private static boolean lIlIIIlIIllllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public k(String str, C0003d c0003d) {
        this(str, lIIIllIlIIIll[0], c0003d);
    }

    private static boolean lIlIIIlIIlllllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public k(C0003d... c0003dArr) {
        this.ac = i.a(c0003dArr);
        this.ad = lIIIllIlIIIll[1];
    }

    private static void lIlIIIlIIlllIIl() {
        lIIIllIlIIIll = new int[2];
        lIIIllIlIIIll[0] = (121 ^ 109) & ((191 ^ 171) ^ (-1));
        lIIIllIlIIIll[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.AbstractC0004e, q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public boolean a(Client client) {
        Player localPlayer = client.getLocalPlayer();
        if (lIlIIIlIIlllIll(localPlayer) && lIlIIIlIIlllIll(this.ac)) {
            WorldPoint fromLocalInstance = WorldPoint.fromLocalInstance(client, localPlayer.getLocalLocation());
            if (lIlIIIlIIllllII(this.ac.stream().anyMatch(c0003d -> {
                return c0003d.a(fromLocalInstance);
            }) ? 1 : 0, this.ad ? 1 : 0)) {
                ?? r0 = lIIIllIlIIIll[1];
                "".length();
                return "   ".length() == 0 ? ((((119 + 107) - 127) + 123) ^ (((60 + 101) - 49) + 31)) & (((37 ^ 20) ^ (23 ^ 119)) ^ (-" ".length())) : r0;
            }
            return lIIIllIlIIIll[0];
        }
        return lIIIllIlIIIll[0];
    }

    public k(boolean z, C0003d... c0003dArr) {
        this.ac = i.a(c0003dArr);
        this.ad = z;
    }

    private static boolean lIlIIIlIIllllII(int i, int i2) {
        return i == i2;
    }
}
