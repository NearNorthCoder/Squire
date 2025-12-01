package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@TaskDesc(name = "Using dragon pickaxe special", priority = 13, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.i  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/i.class */
public class i extends h {
    private static /* synthetic */ int[] llIIllIlllII;

    private static boolean llllllIlllIIII(int i, int i2) {
        return i != i2;
    }

    private static void llllllIllIlllI() {
        llIIllIlllII = new int[10];
        llIIllIlllII[0] = " ".length();
        llIIllIlllII[1] = ((35 ^ 75) ^ (67 ^ 26)) & (((34 ^ 51) ^ (178 ^ 146)) ^ (-" ".length()));
        llIIllIlllII[2] = 54 ^ 82;
        llIIllIlllII[3] = (168 ^ 179) ^ (189 ^ 162);
        llIIllIlllII[4] = (-4386) & 16305;
        llIIllIlllII[5] = (-((-23633) & 23889)) & (-8323) & 32255;
        llIIllIlllII[6] = "  ".length();
        llIIllIlllII[7] = (-2049) & 15291;
        llIIllIlllII[8] = "   ".length();
        llIIllIlllII[9] = (-((-28709) & 30269)) & (-4097) & 30719;
    }

    private static boolean llllllIllIllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIIllIlllII[0];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllIlllII[0]];
        enumC0002cArr[llIIllIlllII[1]] = EnumC0002c.COUNTDOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!llllllIllIllll(Combat.isSpecEnabled() ? 1 : 0) || llllllIlllIIII(Combat.getSpecEnergy(), llIIllIlllII[2])) {
            return llIIllIlllII[1];
        }
        int[] iArr = new int[llIIllIlllII[3]];
        iArr[llIIllIlllII[1]] = llIIllIlllII[4];
        iArr[llIIllIlllII[0]] = llIIllIlllII[5];
        iArr[llIIllIlllII[6]] = llIIllIlllII[7];
        iArr[llIIllIlllII[8]] = llIIllIlllII[9];
        if (llllllIllIllll(Equipment.contains(iArr) ? 1 : 0)) {
            return llIIllIlllII[1];
        }
        Combat.toggleSpec();
        return llIIllIlllII[0];
    }

    static {
        llllllIllIlllI();
    }
}
