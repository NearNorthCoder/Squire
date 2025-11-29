package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import net.runelite.api.Client;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/r.class */
public class C0017r {
    private final /* synthetic */ Map<Integer, Integer> an = new HashMap();
    static final /* synthetic */ boolean ao;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ Client g;
    private static /* synthetic */ int[] lIIlllIlIIII;

    public int a(int... iArr) {
        int i = lIIlllIlIIII[0];
        int length = iArr.length;
        int i2 = lIIlllIlIIII[0];
        while (llIlIIIIlIIlll(i2, length)) {
            int i3 = iArr[i2];
            Optional findFirst = Arrays.stream(A.values()).filter(a2 -> {
                if (llIlIIIIlIlIlI(a2.P(), i3)) {
                    ?? r0 = lIIlllIlIIII[1];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? ((43 ^ 113) ^ " ".length()) & (((((25 + 38) - 11) + 107) ^ (((56 + 46) - 41) + 135)) ^ (-" ".length())) : r0;
                }
                return lIIlllIlIIII[0];
            }).findFirst();
            if (llIlIIIIlIlIII(ao ? 1 : 0) && llIlIIIIlIlIII(findFirst.isPresent() ? 1 : 0)) {
                throw new AssertionError();
            }
            i += this.g.getVarbitValue(((A) findFirst.get()).O());
            i2++;
            "".length();
            if ((((111 ^ 12) ^ (234 ^ 182)) & (((((165 + 61) - 211) + 155) ^ (((101 + 141) - 151) + 58)) ^ (-" ".length()))) != 0) {
                return ((((72 + 52) - 104) + 160) ^ (((13 + 22) - (-13)) + 90)) & (((53 ^ 43) ^ (49 ^ 17)) ^ (-" ".length()));
            }
        }
        return i;
    }

    private static boolean llIlIIIIlIlIIl(int i) {
        return i > 0;
    }

    public void i() {
        A[] values = A.values();
        int length = values.length;
        int i = lIIlllIlIIII[0];
        while (llIlIIIIlIIlll(i, length)) {
            A a2 = values[i];
            Map<Integer, Integer> map = this.an;
            Integer valueOf = Integer.valueOf(a2.P());
            int[] iArr = new int[lIIlllIlIIII[1]];
            iArr[lIIlllIlIIII[0]] = a2.P();
            map.put(valueOf, Integer.valueOf(a(iArr)));
            "".length();
            i++;
            "".length();
            if ("   ".length() >= ((27 ^ 51) ^ (36 ^ 8))) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean b(int... iArr) {
        if (llIlIIIIlIlIIl(a(iArr))) {
            ?? r0 = lIIlllIlIIII[1];
            "".length();
            return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllIlIIII[0];
    }

    public int A() {
        return lIIlllIlIIII[0];
    }

    private static boolean llIlIIIIlIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIIIIlIlIII(int i) {
        return i == 0;
    }

    public void j() {
        this.an.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        llIlIIIIlIIllI();
        if (llIlIIIIlIlIII(C0017r.class.desiredAssertionStatus() ? 1 : 0)) {
            int i = lIIlllIlIIII[1];
            "".length();
            z = i;
            if (0 != 0) {
                return;
            }
        } else {
            z = lIIlllIlIIII[0];
        }
        ao = z;
    }

    public int c(int i) {
        int[] iArr = new int[lIIlllIlIIII[1]];
        iArr[lIIlllIlIIII[0]] = i;
        return a(iArr) - this.an.getOrDefault(Integer.valueOf(i), Integer.valueOf(lIIlllIlIIII[0])).intValue();
    }

    private static boolean llIlIIIIlIIlll(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIIIlIIllI() {
        lIIlllIlIIII = new int[4];
        lIIlllIlIIII[0] = (100 ^ 44) & ((210 ^ 154) ^ (-1));
        lIIlllIlIIII[1] = " ".length();
        lIIlllIlIIII[2] = (-((-16525) & 30911)) & (-16897) & 31735;
        lIIlllIlIIII[3] = 54 ^ 45;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean d(int i) {
        int[] iArr = new int[lIIlllIlIIII[1]];
        iArr[lIIlllIlIIII[0]] = lIIlllIlIIII[2];
        if (llIlIIIIlIIlll(a(iArr), lIIlllIlIIII[3] * (i - A()))) {
            ?? r0 = lIIlllIlIIII[1];
            "".length();
            return "  ".length() == 0 ? ((((85 + 76) - 144) + 138) ^ (((164 + 61) - 175) + 144)) & (((71 ^ 23) ^ (80 ^ 89)) ^ (-" ".length())) : r0;
        }
        return lIIlllIlIIII[0];
    }
}
