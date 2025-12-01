package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Handling Elidinis P3 Prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aF  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aF.class */
public class aF extends W {
    private /* synthetic */ Prayer dE;
    private static /* synthetic */ int[] lIllIIllIII;

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Prayer prayer;
        Actor actor = animationChanged.getActor();
        if (lIIlIllIIIIllI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        if (!lIIlIllIIIIlll(actor.getAnimation(), lIllIIllIII[6])) {
            if (!lIIlIllIIIIlll(actor.getAnimation(), lIllIIllIII[7])) {
                if (lIIlIllIIIIlll(actor.getAnimation(), lIllIIllIII[8])) {
                    this.dE = Prayer.PROTECT_FROM_MAGIC;
                    return;
                }
                return;
            }
            this.dE = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return;
            }
            return;
        }
        if (lIIlIllIIIlIII(this.dE, Prayer.PROTECT_FROM_MISSILES)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if (((37 ^ 13) & ((108 ^ 68) ^ (-1))) < (-" ".length())) {
                return;
            }
        } else {
            prayer = Prayer.PROTECT_FROM_MISSILES;
        }
        this.dE = prayer;
        "".length();
        if ((-" ".length()) != (-" ".length())) {
        }
    }

    private static void lIIlIllIIIIlII() {
        lIllIIllIII = new int[10];
        lIllIIllIII[0] = (-((-3089) & 19641)) & (-514) & 32761;
        lIllIIllIII[1] = "  ".length();
        lIllIIllIII[2] = (0 ^ 34) & ((120 ^ 90) ^ (-1));
        lIllIIllIII[3] = (-" ".length()) & (-4617) & 16377;
        lIllIIllIII[4] = " ".length();
        lIllIIllIII[5] = (-((-8163) & 24555)) & (-1) & 28155;
        lIllIIllIII[6] = (-22987) & 32763;
        lIllIIllIII[7] = (-((-3074) & 7509)) & (-2049) & 16255;
        lIllIIllIII[8] = (-16834) & 26607;
        lIllIIllIII[9] = (-241) & 12017;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIIlIllIIIIlll(npcSpawned.getNpc().getId(), lIllIIllIII[9])) {
            this.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean lIIlIllIIIIlIl(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        return lIIlIllIIIIlIl(this.dE) ? List.of(aQ()) : List.of(aQ(), this.dE);
    }

    private static boolean lIIlIllIIIIllI(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return aL();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return lIllIIllIII[0];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    @Inject
    public aF(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = null;
    }

    private static boolean lIIlIllIIIIlll(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        SquireAutoTOA squireAutoTOA = this.cm;
        int[] iArr = new int[lIllIIllIII[1]];
        iArr[lIllIIllIII[2]] = lIllIIllIII[3];
        iArr[lIllIIllIII[4]] = lIllIIllIII[5];
        return squireAutoTOA.a(iArr);
    }

    private static boolean lIIlIllIIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIIlIllIIIIlII();
    }
}
