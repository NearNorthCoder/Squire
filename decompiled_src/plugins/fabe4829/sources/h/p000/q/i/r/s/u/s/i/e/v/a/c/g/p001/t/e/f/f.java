package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/f.class */
public class f {
    public static /* synthetic */ int G;
    public static /* synthetic */ int J;
    public static /* synthetic */ boolean z;
    public static /* synthetic */ boolean y;
    private static final /* synthetic */ Logger x;
    static final /* synthetic */ int L;
    private static /* synthetic */ int[] llIIIlllllll;
    public static /* synthetic */ int D;
    public static /* synthetic */ int K;
    public static /* synthetic */ boolean B;
    public static /* synthetic */ int F;
    public static /* synthetic */ int I;
    public static /* synthetic */ int E;
    public static /* synthetic */ e C;
    public static /* synthetic */ int H;
    public static /* synthetic */ boolean A;

    public static void f(int i) {
        H = i;
    }

    public static int s() {
        return G;
    }

    public static void b(int i) {
        D = i;
    }

    public static void e(int i) {
        G = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    public static boolean a(Client client, b bVar, Player player) {
        int lllllllllllllllIlIlIIIIllIlllIIl;
        switch (g.M[bVar.ordinal()]) {
            case 1:
            case 2:
                int i = llIIIlllllll[2];
                int i2 = llIIIlllllll[2];
                NPC b = n.b(bVar);
                if (llllIllllIIIIl(b) && llllIllllIIIIl(player)) {
                    boolean c = n.c(b.getWorldArea().toWorldPointList());
                    if (llllIllllIIIll(b.getLocalLocation().distanceTo(player.getLocalLocation()), llIIIlllllll[3])) {
                        i = llIIIlllllll[1];
                    }
                    if (llllIllllIIlII(bVar.equals(b.BLOB) ? 1 : 0)) {
                        lllllllllllllllIlIlIIIIllIlllIIl = client.getTickCount() - w();
                        "".length();
                        if (((78 ^ 95) & ((40 ^ 57) ^ (-1))) < 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        lllllllllllllllIlIlIIIIllIlllIIl = client.getTickCount() - r();
                    }
                    if (llllIllllIIlIl(lllllllllllllllIlIlIIIIllIlllIIl, llIIIlllllll[4])) {
                        i2 = llIIIlllllll[1];
                    }
                    if (llllIllllIIlII(i) && llllIllllIIlII(i2) && llllIllllIIlII(c ? 1 : 0)) {
                        ?? r0 = llIIIlllllll[1];
                        "".length();
                        return "  ".length() < 0 ? ((((72 + 183) - 83) + 19) ^ (((91 + 38) - 65) + 85)) & (((((14 + 44) - 21) + 107) ^ (((127 + 58) - 59) + 60)) ^ (-" ".length())) : r0;
                    }
                    return llIIIlllllll[2];
                }
                break;
            case 3:
                NPC b2 = n.b(bVar);
                if (llllIllllIIIIl(b2) && llllIllllIIIIl(player)) {
                    if (llllIlllIlllII(b2.getId(), llIIIlllllll[5])) {
                        if (llllIllllIIlIl(client.getTickCount() - u(), llIIIlllllll[4])) {
                            ?? r02 = llIIIlllllll[1];
                            "".length();
                            return " ".length() <= 0 ? ((((174 + 185) - 170) + 2) ^ (((126 + 16) - (-19)) + 16)) & (((((66 + 3) - 4) + 64) ^ (((91 + 41) - 121) + 132)) ^ (-" ".length())) : r02;
                        }
                        return llIIIlllllll[2];
                    } else if (llllIllllIIlIl(client.getTickCount() - u(), llIIIlllllll[4])) {
                        ?? r03 = llIIIlllllll[1];
                        "".length();
                        return " ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                    } else {
                        return llIIIlllllll[2];
                    }
                }
                break;
            case 4:
                if (llllIllllIIIIl(n.b(bVar)) && llllIllllIIIIl(player)) {
                    if (llllIllllIIlIl(client.getTickCount() - t(), llIIIlllllll[4])) {
                        ?? r04 = llIIIlllllll[1];
                        "".length();
                        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                    }
                    return llIIIlllllll[2];
                }
                break;
        }
        return llIIIlllllll[2];
    }

    public static boolean k() {
        return y;
    }

    private static boolean llllIllllIIIll(int i, int i2) {
        return i <= i2;
    }

    public static int r() {
        return F;
    }

    public static void h(int i) {
        J = i;
    }

    public static boolean l() {
        return z;
    }

    public static int v() {
        return J;
    }

    public static void a(e eVar) {
        C = eVar;
    }

    public static boolean n() {
        return B;
    }

    public static void d(int i) {
        F = i;
    }

    public static void i(int i) {
        K = i;
    }

    public static void b(boolean z2) {
        z = z2;
    }

    public static e o() {
        return C;
    }

    public static void c(boolean z2) {
        A = z2;
    }

    public static void d(boolean z2) {
        B = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean j() {
        if (llllIlllIlllII(Players.getLocal().getWorldLocation().getRegionID(), llIIIlllllll[0])) {
            ?? r0 = llIIIlllllll[1];
            "".length();
            return 0 != 0 ? ((29 ^ 79) ^ (10 ^ 119)) & (((67 ^ 122) ^ (79 ^ 89)) ^ (-" ".length())) : r0;
        }
        return llIIIlllllll[2];
    }

    private static boolean llllIllllIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llllIllllIIIIl(Object obj) {
        return obj != null;
    }

    public static int q() {
        return E;
    }

    private static boolean llllIllllIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    static {
        llllIlllIllIlI();
        L = llIIIlllllll[0];
        x = LoggerFactory.getLogger(f.class);
        y = llIIIlllllll[2];
        z = llIIIlllllll[2];
        A = llIIIlllllll[2];
    }

    private static boolean llllIlllIlllII(int i, int i2) {
        return i == i2;
    }

    public static int p() {
        return D;
    }

    public static void g(int i) {
        I = i;
    }

    public static int u() {
        return I;
    }

    public static void a(boolean z2) {
        y = z2;
    }

    private static void llllIlllIllIlI() {
        llIIIlllllll = new int[6];
        llIIIlllllll[0] = (-5377) & 32013;
        llIIIlllllll[1] = " ".length();
        llIIIlllllll[2] = (79 ^ 67) & ((154 ^ 150) ^ (-1));
        llIIIlllllll[3] = (-((-8375) & 27831)) & (-1) & 19966;
        llIIIlllllll[4] = "   ".length();
        llIIIlllllll[5] = (-16847) & 19967;
    }

    public static int w() {
        return K;
    }

    public static int t() {
        return H;
    }

    public static void c(int i) {
        E = i;
    }

    public static boolean m() {
        return A;
    }
}
