package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Using Shadow Veil", priority = 350, register = true, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.z  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/z.class */
public class z extends AbstractC0000a {
    private static final /* synthetic */ Logger ao;
    private static /* synthetic */ int[] lIIllIlIlIIIl;

    private static boolean lIllIIIIIlllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIIIllIlll(int i) {
        return i != 0;
    }

    private static void lIllIIIIIllIlIl() {
        lIIllIlIlIIIl = new int[4];
        lIIllIlIlIIIl[0] = ((87 ^ 104) ^ (116 ^ 86)) & (((((90 + 128) - 196) + 152) ^ (((47 + 82) - 1) + 51)) ^ (-" ".length()));
        lIIllIlIlIIIl[1] = (-2493) & 14783;
        lIIllIlIlIIIl[2] = " ".length();
        lIIllIlIlIIIl[3] = (-1538) & 13951;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        if (!lIllIIIIIllIllI(this.p.shadowVeil() ? 1 : 0) && !lIllIIIIIllIlll(this.o.j() ? 1 : 0)) {
            if (!lIllIIIIIlllIII(SpellBook.getCurrent(), SpellBook.NECROMANCY) || lIllIIIIIllIllI(SpellBook.Necromancy.SHADOW_VEIL.canCast() ? 1 : 0)) {
                return lIIllIlIlIIIl[0];
            }
            if (!lIllIIIIIlllIIl(a(this.p.pickpocketTarget())) && !lIllIIIIIlllIlI(Vars.getBit(lIIllIlIlIIIl[1]), lIIllIlIlIIIl[2]) && !lIllIIIIIlllIlI(Vars.getBit(lIIllIlIlIIIl[3]), lIIllIlIlIIIl[2])) {
                Magic.cast(SpellBook.Necromancy.SHADOW_VEIL, lIIllIlIlIIIl[2], (boolean) lIIllIlIlIIIl[2]);
                return lIIllIlIlIIIl[2];
            }
            return lIIllIlIlIIIl[0];
        }
        return lIIllIlIlIIIl[0];
    }

    private static boolean lIllIIIIIlllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIIIlllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public z(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    static {
        lIllIIIIIllIlIl();
        ao = LoggerFactory.getLogger(z.class);
    }

    private static boolean lIllIIIIIllIllI(int i) {
        return i == 0;
    }
}
