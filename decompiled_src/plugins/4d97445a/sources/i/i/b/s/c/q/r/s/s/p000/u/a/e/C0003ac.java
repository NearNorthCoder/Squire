package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import net.runelite.api.NPC;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ac  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ac.class */
public class C0003ac {
    public static final /* synthetic */ int cA;
    private final /* synthetic */ NPC cB;
    private static /* synthetic */ int[] lIIIIlIl;

    public NPC y() {
        return this.cB;
    }

    public C0003ac(NPC npc) {
        this.cB = npc;
    }

    private static boolean lIIIIIIIll(int i2, int i3) {
        return i2 == i3;
    }

    private static void lllllllll() {
        lIIIIlIl = new int[3];
        lIIIIlIl[0] = (-((-3154) & 32603)) & (-2081) & 32763;
        lIIIIlIl[1] = " ".length();
        lIIIIlIl[2] = (42 ^ 116) & ((64 ^ 30) ^ (-1));
    }

    static {
        lllllllll();
        cA = lIIIIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bc() {
        if (!lIIIIIIIII(this.cB) || (lIIIIIIIIl(this.cB.isDead() ? 1 : 0) && !lIIIIIIIll(this.cB.getAnimation(), lIIIIlIl[0]))) {
            return lIIIIlIl[2];
        }
        ?? r0 = lIIIIlIl[1];
        "".length();
        return 0 != 0 ? true & ((true ^ true) ^ true) : r0;
    }

    private static boolean lIIIIIIIlI(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIIIIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bb() {
        if (lIIIIIIIII(this.cB) && lIIIIIIIIl(this.cB.isDead() ? 1 : 0) && lIIIIIIIlI(this.cB.getAnimation(), lIIIIlIl[0])) {
            ?? r0 = lIIIIlIl[1];
            "".length();
            return "  ".length() == 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
        }
        return lIIIIlIl[2];
    }
}
