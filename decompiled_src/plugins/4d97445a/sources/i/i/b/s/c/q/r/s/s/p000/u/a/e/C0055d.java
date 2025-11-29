package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/d.class */
public class C0055d {
    private /* synthetic */ EnumC0056e V;
    private final /* synthetic */ NPC R;
    private /* synthetic */ EnumC0056e Y;
    private static final /* synthetic */ int O;
    private static final /* synthetic */ int N;
    private /* synthetic */ long X;
    private /* synthetic */ int T;
    private static /* synthetic */ int[] lIIllIlll;
    private static final /* synthetic */ int P;
    private /* synthetic */ int W;
    private /* synthetic */ int S;
    private final /* synthetic */ List<EnumC0060i> Q = new ArrayList();
    private /* synthetic */ EnumC0060i U = EnumC0060i.SPAWNING;
    private /* synthetic */ int Z = lIIllIlll[0];

    public EnumC0056e F() {
        return this.Y;
    }

    public int A() {
        return this.T;
    }

    public void a(EnumC0056e enumC0056e) {
        this.Y = enumC0056e;
    }

    public void d(int i2) {
        this.W = i2;
    }

    private static void lIIIlIIIlII() {
        lIIllIlll = new int[8];
        lIIllIlll[0] = (-((-2201) & 14779)) & (-19458) & 32635;
        lIIllIlll[1] = " ".length();
        lIIllIlll[2] = -" ".length();
        lIIllIlll[3] = 156 ^ 150;
        lIIllIlll[4] = (84 ^ 18) ^ (2 ^ 67);
        lIIllIlll[5] = (-3681) & 4080;
        lIIllIlll[6] = 17 ^ 20;
        lIIllIlll[7] = ((190 + 73) - 215) + 152;
    }

    public int z() {
        return this.S;
    }

    public EnumC0056e C() {
        return this.V;
    }

    private static boolean lIIIlIIIllI(int i2) {
        return i2 == 0;
    }

    public EnumC0060i B() {
        return this.U;
    }

    public C0055d(NPC npc) {
        this.R = npc;
    }

    public void a(long j) {
        this.X = j;
    }

    public NPC y() {
        return this.R;
    }

    public int w() {
        int a = B.a(this.R.getHealthRatio(), this.R.getHealthScale(), lIIllIlll[0]);
        if (lIIIlIIIlIl(a, lIIllIlll[2])) {
            this.Z = a;
        }
        return this.Z;
    }

    public List<EnumC0060i> x() {
        return this.Q;
    }

    public void b(EnumC0060i enumC0060i) {
        this.S += lIIllIlll[1];
        this.U = enumC0060i;
    }

    static {
        lIIIlIIIlII();
        O = lIIllIlll[5];
        N = lIIllIlll[0];
        P = lIIllIlll[7];
    }

    private static boolean lIIIlIIIlll(int i2, int i3) {
        return i2 <= i3;
    }

    public EnumC0060i a(int i2, int i3) {
        int i4 = this.S + i2;
        return lIIIlIIIllI(i4) ? EnumC0060i.SPAWNING : lIIIlIIIllI((i4 - lIIllIlll[1]) % lIIllIlll[3]) ? EnumC0060i.TRIPLE : (lIIIlIIIllI(i4 % lIIllIlll[4]) && lIIIlIIIlll(i3, lIIllIlll[5])) ? EnumC0060i.GHOSTS : (lIIIlIIIllI(i4 % lIIllIlll[6]) && lIIIlIIIlll(i3, lIIllIlll[7])) ? EnumC0060i.LAVA : EnumC0060i.AUTO;
    }

    public long E() {
        return this.X;
    }

    public int D() {
        return this.W;
    }

    private static boolean lIIIlIIIlIl(int i2, int i3) {
        return i2 != i3;
    }

    public void a(int i2, EnumC0056e enumC0056e) {
        this.T = i2;
        this.V = enumC0056e;
    }
}
