package m.e.a.i.z.m.r.p000.q.s.y.u;

import net.runelite.api.NPC;
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.d  reason: invalid package and case insensitive filesystem */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/d.class */
public class C0003d {
    public static final /* synthetic */ int l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ NPC f0m;
    private static /* synthetic */ int[] lIllIIllIIlII;

    private static boolean llIIIllIlIIIIll(int i) {
        return i == 0;
    }

    private static boolean llIIIllIlIIIIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean l() {
        if (!llIIIllIlIIIIlI(this.f0m) || (llIIIllIlIIIIll(this.f0m.isDead() ? 1 : 0) && !llIIIllIlIIIlIl(this.f0m.getAnimation(), lIllIIllIIlII[0]))) {
            return lIllIIllIIlII[2];
        }
        ?? r0 = lIllIIllIIlII[1];
        "".length();
        return " ".length() <= ((156 ^ 128) & ((148 ^ 136) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean k() {
        if (llIIIllIlIIIIlI(this.f0m) && llIIIllIlIIIIll(this.f0m.isDead() ? 1 : 0) && llIIIllIlIIIlII(this.f0m.getAnimation(), lIllIIllIIlII[0])) {
            ?? r0 = lIllIIllIIlII[1];
            "".length();
            return ((178 ^ 162) ^ (214 ^ 195)) <= 0 ? ((((34 + 66) - (-83)) + 25) ^ (((106 + 105) - 192) + 110)) & (((232 ^ 183) ^ (26 ^ 20)) ^ (-" ".length())) : r0;
        }
        return lIllIIllIIlII[2];
    }

    static {
        llIIIllIlIIIIIl();
        l = lIllIIllIIlII[0];
    }

    private static void llIIIllIlIIIIIl() {
        lIllIIllIIlII = new int[3];
        lIllIIllIIlII[0] = (-((-3297) & 27891)) & (-1217) & 32759;
        lIllIIllIIlII[1] = " ".length();
        lIllIIllIIlII[2] = ((217 ^ 198) ^ (103 ^ 86)) & (((231 ^ 137) ^ (23 ^ 87)) ^ (-" ".length()));
    }

    private static boolean llIIIllIlIIIlIl(int i, int i2) {
        return i == i2;
    }

    public C0003d(NPC npc) {
        this.f0m = npc;
    }

    public NPC m() {
        return this.f0m;
    }

    private static boolean llIIIllIlIIIlII(int i, int i2) {
        return i != i2;
    }
}
