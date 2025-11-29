package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.util.Objects;
import net.runelite.api.Player;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.B  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/B.class */
public class B {
    private final /* synthetic */ C bT;
    private static /* synthetic */ int[] lIlIIIIllIII;
    private /* synthetic */ int bU;
    private final /* synthetic */ Player bS;

    private static void llIlIlIIllllII() {
        lIlIIIIllIII = new int[3];
        lIlIIIIllIII[0] = " ".length();
        lIlIIIIllIII[1] = "  ".length();
        lIlIIIIllIII[2] = (51 ^ 3) & ((103 ^ 87) ^ (-1));
    }

    private static boolean llIlIlIlIIIIIl(int i) {
        return i != 0;
    }

    static {
        llIlIlIIllllII();
    }

    public int bB() {
        return this.bU;
    }

    public B(Player player, C c2) {
        this.bS = player;
        this.bT = c2;
        this.bU = c2.bB();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean equals(Object obj) {
        if (llIlIlIIlllllI(this, obj)) {
            return lIlIIIIllIII[0];
        }
        if (!llIlIlIIllllll(obj) || llIlIlIlIIIIII(getClass(), obj.getClass())) {
            return lIlIIIIllIII[2];
        }
        B b = (B) obj;
        if (llIlIlIlIIIIIl(Objects.equals(this.bS.getName(), b.bS.getName()) ? 1 : 0) && llIlIlIIlllllI(this.bT, b.bT)) {
            ?? r0 = lIlIIIIllIII[0];
            "".length();
            return "  ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIIllIII[2];
    }

    private static boolean llIlIlIIllllIl(int i) {
        return i > 0;
    }

    public Player bz() {
        return this.bS;
    }

    public void by() {
        if (llIlIlIIllllIl(this.bU)) {
            this.bU -= lIlIIIIllIII[0];
        }
    }

    private static boolean llIlIlIlIIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlIlIIllllll(Object obj) {
        return obj != null;
    }

    public C bA() {
        return this.bT;
    }

    public int hashCode() {
        Object[] objArr = new Object[lIlIIIIllIII[1]];
        objArr[lIlIIIIllIII[2]] = this.bS.getName();
        objArr[lIlIIIIllIII[0]] = this.bT;
        return Objects.hash(objArr);
    }

    private static boolean llIlIlIIlllllI(Object obj, Object obj2) {
        return obj == obj2;
    }
}
