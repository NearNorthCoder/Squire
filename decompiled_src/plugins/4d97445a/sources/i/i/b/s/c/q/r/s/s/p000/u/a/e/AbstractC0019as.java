package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.Task;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.as  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/as.class */
public abstract class AbstractC0019as extends Task {
    private static /* synthetic */ int[] lIllllIl;
    protected final /* synthetic */ SquireEctoConfig de;
    protected final /* synthetic */ SquireEcto dd;

    public abstract boolean bB();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        return lIlIIlllII(bC() ? 1 : 0) ? lIllllIl[0] : bB();
    }

    private static boolean lIlIIlllIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    protected boolean bC() {
        int[] iArr = new int[lIllllIl[1]];
        iArr[lIllllIl[0]] = lIllllIl[2];
        if (lIlIIlllIl(Inventory.contains(iArr) ? 1 : 0) && lIlIIlllIl(Inventory.contains(this.de.bankItem().br()) ? 1 : 0)) {
            ?? r0 = lIllllIl[1];
            "".length();
            return (-" ".length()) != (-" ".length()) ? ((182 ^ 145) ^ (152 ^ 180)) & (("   ".length() ^ (160 ^ 168)) ^ (-" ".length())) : r0;
        }
        return lIllllIl[0];
    }

    private static boolean lIlIIlllII(int i2) {
        return i2 == 0;
    }

    private static void lIlIIllIll() {
        lIllllIl = new int[3];
        lIllllIl[0] = (171 ^ 179) & ((151 ^ 143) ^ (-1));
        lIllllIl[1] = " ".length();
        lIllllIl[2] = (-25189) & 29439;
    }

    static {
        lIlIIllIll();
    }

    @Inject
    public AbstractC0019as(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.dd = squireEcto;
        this.de = squireEctoConfig;
    }
}
