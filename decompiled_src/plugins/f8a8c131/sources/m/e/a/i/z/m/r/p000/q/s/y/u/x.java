package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Equipping Mage Gear")
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.x  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/x.class */
public class x extends m {
    private static /* synthetic */ int[] lIllIIIllIIlI;

    private static void llIIIlIlIIlIIll() {
        lIllIIIllIIlI = new int[2];
        lIllIIIllIIlI[0] = (116 ^ 34) & ((38 ^ 112) ^ (-1));
        lIllIIIllIIlI[1] = " ".length();
    }

    private static boolean llIIIlIlIIlIllI(Object obj) {
        return obj != null;
    }

    static {
        llIIIlIlIIlIIll();
    }

    @Inject
    public x(SquireZammyConfig squireZammyConfig, l lVar) {
        super(squireZammyConfig, lVar);
    }

    private static boolean llIIIlIlIIlIlIl(int i) {
        return i == 0;
    }

    private static boolean llIIIlIlIIlIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlIIlIlII(this.I.B() ? 1 : 0) || llIIIlIlIIlIlII(this.I.A() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        if (!llIIIlIlIIlIlIl(this.I.D() ? 1 : 0) && !llIIIlIlIIlIlIl(this.I.H() ? 1 : 0)) {
            int[] iArr = new int[lIllIIIllIIlI[1]];
            iArr[lIllIIIllIIlI[0]] = EnumC0004e.BALFRUG_KREEYATH.n();
            NPC nearest = NPCs.getNearest(iArr);
            if (llIIIlIlIIlIllI(nearest) && llIIIlIlIIlIlIl(nearest.isDead() ? 1 : 0)) {
                return lIllIIIllIIlI[0];
            }
            int[] K = K();
            if (llIIIlIlIIlIlIl(b(K) ? 1 : 0)) {
                return lIllIIIllIIlI[0];
            }
            a(K);
            "".length();
            return lIllIIIllIIlI[1];
        }
        return lIllIIIllIIlI[0];
    }
}
