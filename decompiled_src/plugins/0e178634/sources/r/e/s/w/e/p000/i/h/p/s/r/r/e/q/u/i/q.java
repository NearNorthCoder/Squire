package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Handling prayers", priority = Integer.MAX_VALUE, instant = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.q  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/q.class */
public class q extends u {
    private static /* synthetic */ int[] lIlIllIllllIl;

    private static boolean llIIIIIlllIIlII(int i) {
        return i > 0;
    }

    private static boolean llIIIIIlllIIIll(int i) {
        return i != 0;
    }

    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean run() {
        boolean run = super.run();
        if (llIIIIIlllIIIlI(run ? 1 : 0)) {
            Prayers.disableAll();
        }
        return run;
    }

    private static void llIIIIIlllIIIIl() {
        lIlIllIllllIl = new int[3];
        lIlIllIllllIl[0] = " ".length();
        lIlIllIllllIl[1] = (-((-4164) & 31447)) & (-33) & 32767;
        lIlIllIllllIl[2] = (246 ^ 169) ^ (147 ^ 129);
    }

    private static boolean llIIIIIlllIIIlI(int i) {
        return i == 0;
    }

    private static boolean llIIIIIlllIIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.W.k());
        "".length();
        arrayList.add(s());
        "".length();
        if (llIIIIIlllIIIll(Prayers.flick(arrayList) ? 1 : 0)) {
            sleep(lIlIllIllllIl[0]);
        }
        return lIlIllIllllIl[0];
    }

    private Prayer s() {
        return (llIIIIIlllIIlII(Vars.getBit(lIlIllIllllIl[1])) && llIIIIIlllIIlIl(Skills.getLevel(Skill.PRAYER), lIlIllIllllIl[2])) ? Prayer.AUGURY : Prayer.MYSTIC_MIGHT;
    }

    static {
        llIIIIIlllIIIIl();
    }
}
