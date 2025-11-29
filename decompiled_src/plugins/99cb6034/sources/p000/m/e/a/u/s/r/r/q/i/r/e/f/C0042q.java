package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/q.class */
public class C0042q {
    private final /* synthetic */ String aJ;
    private final /* synthetic */ N[] aM;
    private final /* synthetic */ int aK;
    private static /* synthetic */ int[] lIlllIllIllI;
    private final /* synthetic */ boolean aL;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0042q(String str, int i, boolean z, N... nArr) {
        this.aJ = str;
        this.aK = i;
        this.aL = z;
        this.aM = nArr;
        int length = nArr.length;
        int i2 = lIlllIllIllI[0];
        while (lllIllIlIIIIIl(i2, length)) {
            nArr[i2].d(this);
            i2++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                throw null;
            }
        }
    }

    private static boolean lllIllIlIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIllIlIIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIllIlIIIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean c(WorldPoint worldPoint) {
        return lIlllIllIllI[1];
    }

    public N aa() {
        N[] nArr = this.aM;
        int length = nArr.length;
        int i = lIlllIllIllI[0];
        while (lllIllIlIIIIIl(i, length)) {
            N n = nArr[i];
            if (!lllIllIlIIIIll(n.aL(), P.COMPOST) || lllIllIlIIIlII(n.aL(), P.GIANT_COMPOST)) {
                return n;
            }
            i++;
            "".length();
            if ((((18 ^ 90) ^ (9 ^ 117)) & (((((82 + 83) - 161) + 241) ^ (((72 + 80) - 131) + 172)) ^ (-" ".length()))) >= " ".length()) {
                return null;
            }
        }
        return null;
    }

    private static boolean lllIllIlIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String ac() {
        return this.aJ;
    }

    public int X() {
        return this.aK;
    }

    public List<Integer> ab() {
        ArrayList arrayList = new ArrayList();
        N[] nArr = this.aM;
        int length = nArr.length;
        int i = lIlllIllIllI[0];
        while (lllIllIlIIIIIl(i, length)) {
            arrayList.add(Integer.valueOf(nArr[i].aN()));
            "".length();
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return arrayList;
    }

    private static void lllIllIlIIIIII() {
        lIlllIllIllI = new int[2];
        lIlllIllIllI[0] = ((165 ^ 139) ^ (87 ^ 33)) & (((154 ^ 158) ^ (211 ^ 143)) ^ (-" ".length()));
        lIlllIllIllI[1] = " ".length();
    }

    public String toString() {
        return this.aJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Client client) {
        if (lllIllIlIIIIlI(client.getLocalPlayer().getWorldLocation().getRegionID(), this.aK)) {
            ?? r0 = lIlllIllIllI[1];
            "".length();
            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIllIllI[0];
    }

    public N[] ae() {
        return this.aM;
    }

    public boolean ad() {
        return this.aL;
    }

    static {
        lllIllIlIIIIII();
    }
}
