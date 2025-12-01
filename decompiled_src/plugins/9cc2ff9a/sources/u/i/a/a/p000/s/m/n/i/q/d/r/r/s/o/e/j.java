package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import net.runelite.api.NPC;
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.j  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/j.class */
public class j {
    private final /* synthetic */ NPC x;
    private static /* synthetic */ int[] lIIlIlIlIIlll;
    public static final /* synthetic */ int w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean B() {
        if (!lIlIlIlllllllIl(this.x) || (lIlIlIllllllllI(this.x.isDead() ? 1 : 0) && !lIlIllIIIIIIIII(this.x.getAnimation(), lIIlIlIlIIlll[0]))) {
            return lIIlIlIlIIlll[2];
        }
        ?? r0 = lIIlIlIlIIlll[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean lIlIlIlllllllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean A() {
        if (lIlIlIlllllllIl(this.x) && lIlIlIllllllllI(this.x.isDead() ? 1 : 0) && lIlIlIlllllllll(this.x.getAnimation(), lIIlIlIlIIlll[0])) {
            ?? r0 = lIIlIlIlIIlll[1];
            "".length();
            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIlIlIIlll[2];
    }

    private static boolean lIlIlIllllllllI(int i) {
        return i == 0;
    }

    public j(NPC npc) {
        this.x = npc;
    }

    private static void lIlIlIlllllllII() {
        lIIlIlIlIIlll = new int[3];
        lIIlIlIlIIlll[0] = (-24648) & 31615;
        lIIlIlIlIIlll[1] = " ".length();
        lIIlIlIlIIlll[2] = (41 ^ 113) & ((28 ^ 68) ^ (-1));
    }

    private static boolean lIlIlIlllllllll(int i, int i2) {
        return i != i2;
    }

    public NPC C() {
        return this.x;
    }

    private static boolean lIlIllIIIIIIIII(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIlIlllllllII();
        w = lIIlIlIlIIlll[0];
    }
}
