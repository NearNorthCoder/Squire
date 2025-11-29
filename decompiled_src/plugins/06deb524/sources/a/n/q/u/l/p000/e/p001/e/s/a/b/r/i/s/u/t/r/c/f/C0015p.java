package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/p.class */
public class C0015p {
    private static /* synthetic */ int[] lIIllIlIlIII;
    private /* synthetic */ int ak;
    private static final /* synthetic */ int aj;
    @Inject
    private /* synthetic */ C0018s ae;
    private /* synthetic */ int al = lIIllIlIlIII[0];
    private /* synthetic */ int am = lIIllIlIlIII[1];

    public int w() {
        return this.al;
    }

    public int v() {
        return this.ak;
    }

    private static boolean llIIllllIlllll(int i) {
        return i > 0;
    }

    public void t() {
        if (llIIllllIllllI(Bank.isOpen() ? 1 : 0)) {
            b(lIIllIlIlIII[1]);
        } else {
            b(this.ak - Inventory.getFreeSlots());
        }
    }

    public void a(int i) {
        this.al = i;
    }

    private static boolean llIIllllIlllIl(int i, int i2) {
        return i == i2;
    }

    private static void llIIllllIllIll() {
        lIIllIlIlIII = new int[4];
        lIIllIlIlIII[0] = (((112 + 14) - 121) + 215) ^ (((129 + 191) - 301) + 180);
        lIIllIlIlIII[1] = (165 ^ 185) & ((135 ^ 155) ^ (-1));
        lIIllIlIlIII[2] = " ".length();
        lIIllIlIlIII[3] = (-((-1441) & 16315)) & (-1057) & 16383;
    }

    public void c(int... iArr) {
        if (!llIIllllIlllll(iArr.length)) {
            this.am += lIIllIlIlIII[2];
            return;
        }
        this.am = iArr[lIIllIlIlIII[1]];
        "".length();
        if ("  ".length() < 0) {
        }
    }

    private static boolean llIIllllIlllII(int i) {
        return i == 0;
    }

    public void u() {
        if (llIIllllIllllI(Bank.isOpen() ? 1 : 0)) {
            b(this.al);
            return;
        }
        this.am = lIIllIlIlIII[1];
        int i = this.ak;
        int[] iArr = new int[lIIllIlIlIII[2]];
        iArr[lIIllIlIlIII[1]] = lIIllIlIlIII[3];
        b(i + Inventory.getCount(iArr));
    }

    private static boolean llIIllllIllllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean s() {
        if (llIIllllIlllIl(this.ak, this.al)) {
            ?? r0 = lIIllIlIlIII[2];
            "".length();
            return (-" ".length()) >= ((40 ^ 102) & ((49 ^ 127) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIlIlIII[1];
    }

    static {
        llIIllllIllIll();
        aj = lIIllIlIlIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean r() {
        if (llIIllllIlllII(this.ak)) {
            ?? r0 = lIIllIlIlIII[2];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIlIlIII[1];
    }

    public int x() {
        return this.am;
    }

    public void b(int i) {
        this.ak = Math.min(Math.max(i, lIIllIlIlIII[1]), this.al);
    }
}
