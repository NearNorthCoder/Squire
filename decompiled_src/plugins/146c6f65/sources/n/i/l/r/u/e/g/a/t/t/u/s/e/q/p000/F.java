package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(priority = 10, name = "Turning off prayers")
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.F  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/F.class */
public class F extends AbstractC0013n {
    private static /* synthetic */ int[] llIlIIIIlIll;

    private static boolean lIIIIIIIlllIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIIlIll[0]];
        enumC0003dArr[llIlIIIIlIll[1]] = EnumC0003d.FIRST_ROTATION_CREATE;
        enumC0003dArr[llIlIIIIlIll[2]] = EnumC0003d.PREPARE_BOSS_FIGHT;
        enumC0003dArr[llIlIIIIlIll[3]] = EnumC0003d.CREATING_T3_STAFF;
    }

    static {
        lIIIIIIIllIllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean bf() {
        return llIlIIIIlIll[2];
    }

    private static boolean lIIIIIIIlllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIllIllll(int i) {
        return i == 0;
    }

    private static void lIIIIIIIllIllIl() {
        llIlIIIIlIll = new int[4];
        llIlIIIIlIll[0] = "   ".length();
        llIlIIIIlIll[1] = ((((10 + 189) - 193) + 246) ^ (((10 + 124) - 73) + 100)) & (((((51 + 57) - 24) + 73) ^ (((119 + 164) - 132) + 41)) ^ (-" ".length()));
        llIlIIIIlIll[2] = " ".length();
        llIlIIIIlIll[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (!lIIIIIIIllIlllI(local) && !lIIIIIIIllIllll(this.ba.V().av().e(local.getWorldLocation()) ? 1 : 0)) {
            Prayer[] values = Prayer.values();
            int length = values.length;
            int i = llIlIIIIlIll[1];
            while (lIIIIIIIlllIIII(i, length)) {
                Prayer prayer = values[i];
                if (lIIIIIIIlllIIIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    Prayers.toggle(prayer);
                    return llIlIIIIlIll[2];
                }
                i++;
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return llIlIIIIlIll[1];
        }
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIllIlllI(Object obj) {
        return obj == null;
    }
}
