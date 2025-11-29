package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Finishing Floor", priority = 20, blocking = true)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.Q  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/Q.class */
public class Q extends Task {
    private /* synthetic */ TileObject ap;
    private final /* synthetic */ SquireSepulchre ar;
    private final /* synthetic */ C0003d at;
    private static /* synthetic */ int[] lllIIIIlIlll;
    private /* synthetic */ J aq;
    private final /* synthetic */ SquireSepulchreConfig as;
    private /* synthetic */ Player ai;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (lIIIlIIIlIIIIll(Players.getLocal())) {
            return lllIIIIlIlll[0];
        }
        EnumC0007h[] values = EnumC0007h.values();
        int length = values.length;
        int i = lllIIIIlIlll[0];
        while (lIIIlIIIlIIIlII(i, length)) {
            EnumC0007h enumC0007h = values[i];
            if (lIIIlIIIlIIIlIl(enumC0007h.J() ? 1 : 0)) {
                enumC0007h.a(this.ar);
                return lllIIIIlIlll[1];
            }
            i++;
            "".length();
            if ((((((73 + 45) - (-6)) + 30) ^ (((68 + 109) - 76) + 59)) & (((117 ^ 111) ^ (72 ^ 104)) ^ (-" ".length()))) != (((49 ^ 85) ^ (123 ^ 65)) & (((210 ^ 166) ^ (49 ^ 27)) ^ (-" ".length())))) {
                return ((37 ^ 58) ^ (82 ^ 117)) & (((((69 + 143) - 195) + 160) ^ (((80 + 114) - 70) + 13)) ^ (-" ".length()));
            }
        }
        return lllIIIIlIlll[0];
    }

    private static boolean lIIIlIIIlIIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIIlIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIIlIIIIll(Object obj) {
        return obj == null;
    }

    private static void lIIIlIIIlIIIIlI() {
        lllIIIIlIlll = new int[2];
        lllIIIIlIlll[0] = ((122 ^ 111) ^ (50 ^ 29)) & (((((15 + 36) - (-40)) + 40) ^ (((168 + 174) - 252) + 95)) ^ (-" ".length()));
        lllIIIIlIlll[1] = " ".length();
    }

    static {
        lIIIlIIIlIIIIlI();
    }

    @Inject
    public Q(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, C0003d c0003d) {
        this.as = squireSepulchreConfig;
        this.ar = squireSepulchre;
        this.at = c0003d;
    }
}
