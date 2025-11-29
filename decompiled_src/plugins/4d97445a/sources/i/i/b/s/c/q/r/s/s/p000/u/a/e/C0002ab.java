package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import net.runelite.api.NPC;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ab  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ab.class */
public class C0002ab {
    private static /* synthetic */ int[] lIllIllll;
    private final /* synthetic */ NPC cz;
    public static final /* synthetic */ int cy;

    private static void lIIlllllIII() {
        lIllIllll = new int[3];
        lIllIllll[0] = (-((-5187) & 32591)) & (-4130) & 32767;
        lIllIllll[1] = " ".length();
        lIllIllll[2] = (234 ^ 181) & ((11 ^ 84) ^ (-1));
    }

    private static boolean lIIlllllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllIlI(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bc() {
        if (!lIIlllllIIl(this.cz) || (lIIlllllIlI(this.cz.isDead() ? 1 : 0) && !lIIllllllII(this.cz.getAnimation(), lIllIllll[0]))) {
            return lIllIllll[2];
        }
        ?? r0 = lIllIllll[1];
        "".length();
        return (((243 ^ 141) ^ (253 ^ 189)) & (((210 ^ 183) ^ (206 ^ 149)) ^ (-" ".length()))) > (((((95 + 175) - 104) + 84) ^ (((67 + 56) - 44) + 75)) & (((7 ^ 13) ^ (0 ^ 106)) ^ (-" ".length()))) ? ((113 ^ 87) ^ (118 ^ 64)) & (((((175 + 4) - 67) + 64) ^ (((33 + 81) - 101) + 147)) ^ (-" ".length())) : r0;
    }

    private static boolean lIIllllllII(int i2, int i3) {
        return i2 == i3;
    }

    static {
        lIIlllllIII();
        cy = lIllIllll[0];
    }

    public C0002ab(NPC npc) {
        this.cz = npc;
    }

    private static boolean lIIlllllIll(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bb() {
        if (lIIlllllIIl(this.cz) && lIIlllllIlI(this.cz.isDead() ? 1 : 0) && lIIlllllIll(this.cz.getAnimation(), lIllIllll[0])) {
            ?? r0 = lIllIllll[1];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIllll[2];
    }

    public NPC y() {
        return this.cz;
    }
}
