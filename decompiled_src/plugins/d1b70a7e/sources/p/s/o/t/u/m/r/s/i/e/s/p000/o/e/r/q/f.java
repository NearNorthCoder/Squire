package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@TaskDesc(name = "Using special attack", priority = 6)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.f  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/f.class */
public class f extends l {
    private static /* synthetic */ int[] lIIlllIIlIlIl;

    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        int[] iArr = new int[lIIlllIIlIlIl[0]];
        iArr[lIIlllIIlIlIl[1]] = lIIlllIIlIlIl[2];
        return Equipment.contains(iArr);
    }

    private static boolean lIllIIlIlIlIlII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIlIlIlIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIlIlIlIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        if (!lIllIIlIlIlIIlI(this.ar.L() ? 1 : 0) && !lIllIIlIlIlIIll(this.au.c(), lIIlllIIlIlIl[3]) && !lIllIIlIlIlIlII(Combat.getSpecEnergy(), lIIlllIIlIlIl[4])) {
            Combat.toggleSpec();
            return lIIlllIIlIlIl[0];
        }
        return lIIlllIIlIlIl[1];
    }

    static {
        lIllIIlIlIlIIIl();
    }

    private static void lIllIIlIlIlIIIl() {
        lIIlllIIlIlIl = new int[5];
        lIIlllIIlIlIl[0] = " ".length();
        lIIlllIIlIlIl[1] = ((((10 + 4) - (-140)) + 75) ^ (((64 + 95) - 65) + 97)) & (((((179 + 56) - 103) + 79) ^ (((93 + 124) - 110) + 30)) ^ (-" ".length()));
        lIIlllIIlIlIl[2] = (-11273) & 32300;
        lIIlllIIlIlIl[3] = 221 ^ 135;
        lIIlllIIlIlIl[4] = 250 ^ 158;
    }

    @Inject
    protected f(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }
}
