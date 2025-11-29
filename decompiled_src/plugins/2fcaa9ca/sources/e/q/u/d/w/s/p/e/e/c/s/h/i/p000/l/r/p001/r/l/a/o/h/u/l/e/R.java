package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Loot Handler", priority = 50, blocking = true)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.R  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/R.class */
public class R extends Task {
    private final /* synthetic */ SquireSepulchreConfig av;
    private /* synthetic */ Player ai;
    private final /* synthetic */ C0003d aw;
    private final /* synthetic */ SquireSepulchre au;
    private static /* synthetic */ int[] lllIIIIIIlII;
    private /* synthetic */ J aq;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        int c = this.au.c();
        Player local = Players.getLocal();
        System.out.println("Time: " + c);
        if (lIIIlIIIIIIlIll(local)) {
            return lllIIIIIIlII[0];
        }
        EnumC0019t[] values = EnumC0019t.values();
        int lllllllllllllllIIlllIIllIlIlllIl = values.length;
        int i = lllIIIIIIlII[0];
        while (lIIIlIIIIIIllII(i, lllllllllllllllIIlllIIllIlIlllIl)) {
            EnumC0019t enumC0019t = values[i];
            if (lIIIlIIIIIIllIl(enumC0019t.a(this.aw, this.au) ? 1 : 0)) {
                System.out.println(enumC0019t.name());
                return lllIIIIIIlII[1];
            }
            i++;
            "".length();
            if ("  ".length() == 0) {
                return ((115 ^ 64) ^ (179 ^ 139)) & (((26 ^ 114) ^ (10 ^ 105)) ^ (-" ".length()));
            }
        }
        return lllIIIIIIlII[0];
    }

    static {
        lIIIlIIIIIIlIlI();
    }

    private static void lIIIlIIIIIIlIlI() {
        lllIIIIIIlII = new int[2];
        lllIIIIIIlII[0] = ((((126 + 4) - 18) + 119) ^ (((34 + 16) - (-3)) + 145)) & (("   ".length() ^ (130 ^ 160)) ^ (-" ".length()));
        lllIIIIIIlII[1] = " ".length();
    }

    private static boolean lIIIlIIIIIIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIIIIIllIl(int i) {
        return i != 0;
    }

    @Inject
    public R(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, C0003d c0003d) {
        this.av = squireSepulchreConfig;
        this.au = squireSepulchre;
        this.aw = c0003d;
    }

    private static boolean lIIIlIIIIIIlIll(Object obj) {
        return obj == null;
    }
}
