package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.unethicalite.api.items.Bank;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/n.class */
public class C0013n {
    private static /* synthetic */ int[] lIIlIlllIlII;

    private static void llIIllIlIllIlI() {
        lIIlIlllIlII = new int[2];
        lIIlIlllIlII[0] = " ".length();
        lIIlIlllIlII[1] = ((((22 + 87) - (-73)) + 49) ^ (((93 + 16) - 33) + 84)) & (((71 ^ 64) ^ (122 ^ 58)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean h() {
        if (!llIIllIlIllIll(Bank.isOpen() ? 1 : 0) || llIIllIlIlllII(Bank.isPinWindowOpen() ? 1 : 0)) {
            ?? r0 = lIIlIlllIlII[0];
            "".length();
            return 0 != 0 ? ((((178 + 152) - 130) + 29) ^ (((75 + 152) - 151) + 96)) & (((90 ^ 116) ^ (240 ^ 151)) ^ (-" ".length())) : r0;
        }
        return lIIlIlllIlII[1];
    }

    private static boolean llIIllIlIlllII(int i) {
        return i != 0;
    }

    private static boolean llIIllIlIllIll(int i) {
        return i == 0;
    }

    private static boolean llIIllIlIlllIl(int i, int i2) {
        return i < i2;
    }

    static {
        llIIllIlIllIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean b(int... iArr) {
        if (llIIllIlIllllI(a(iArr))) {
            ?? r0 = lIIlIlllIlII[0];
            "".length();
            return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIlllIlII[1];
    }

    public int a(int... iArr) {
        int i = lIIlIlllIlII[1];
        int length = iArr.length;
        int i2 = lIIlIlllIlII[1];
        while (llIIllIlIlllIl(i2, length)) {
            int i3 = iArr[i2];
            int[] iArr2 = new int[lIIlIlllIlII[0]];
            iArr2[lIIlIlllIlII[1]] = i3;
            i += Bank.getCount(iArr2);
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return (9 ^ 12) & ((135 ^ 130) ^ (-1));
            }
        }
        return i;
    }

    private static boolean llIIllIlIllllI(int i) {
        return i > 0;
    }
}
