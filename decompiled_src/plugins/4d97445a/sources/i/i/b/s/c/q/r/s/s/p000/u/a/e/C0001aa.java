package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import net.runelite.api.NPC;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aa  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aa.class */
public class C0001aa {
    public static final /* synthetic */ int cw;
    private static /* synthetic */ int[] lIIIllIII;
    private final /* synthetic */ NPC cx;

    private static void llllIIlIII() {
        lIIIllIII = new int[3];
        lIIIllIII[0] = (-((-24579) & 31023)) & (-24577) & 32254;
        lIIIllIII[1] = " ".length();
        lIIIllIII[2] = (135 ^ 148) & ((91 ^ 72) ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bc() {
        if (!llllIIlIIl(this.cx) || (llllIIlIlI(this.cx.isDead() ? 1 : 0) && !llllIIllII(this.cx.getAnimation(), lIIIllIII[0]))) {
            return lIIIllIII[2];
        }
        ?? r0 = lIIIllIII[1];
        "".length();
        return ((67 ^ 108) & ((128 ^ 175) ^ (-1))) >= (32 ^ 36) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bb() {
        if (llllIIlIIl(this.cx) && llllIIlIlI(this.cx.isDead() ? 1 : 0) && llllIIlIll(this.cx.getAnimation(), lIIIllIII[0])) {
            ?? r0 = lIIIllIII[1];
            "".length();
            return (true ^ true) == ((true ^ true) & ((false ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllIII[2];
    }

    public C0001aa(NPC npc) {
        this.cx = npc;
    }

    private static boolean llllIIlIll(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean llllIIlIIl(Object obj) {
        return obj != null;
    }

    public NPC y() {
        return this.cx;
    }

    static {
        llllIIlIII();
        cw = lIIIllIII[0];
    }

    private static boolean llllIIlIlI(int i2) {
        return i2 == 0;
    }

    private static boolean llllIIllII(int i2, int i3) {
        return i2 == i3;
    }
}
