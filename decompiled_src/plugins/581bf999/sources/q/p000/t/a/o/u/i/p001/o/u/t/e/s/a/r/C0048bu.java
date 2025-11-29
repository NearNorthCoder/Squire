package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;
@TaskDesc(name = "Puzzle Prayer Handler", priority = 100)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bu  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bu.class */
public class C0048bu extends W {
    private static /* synthetic */ int[] llIIllllIlI;

    @Inject
    public C0048bu(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        return llIIllllIlI[1];
    }

    private static void lIlIIIlllIllll() {
        llIIllllIlI = new int[2];
        llIIllllIlI[0] = (-((-9614) & 28079)) & (-141) & 32767;
        llIIllllIlI[1] = " ".length();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return llIIllllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return llIIllllIlI[1];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    static {
        lIlIIIlllIllll();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        return List.of(Prayer.PROTECT_FROM_MISSILES);
    }
}
