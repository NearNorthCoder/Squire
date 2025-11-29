/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.unethicalite.api.jsoup.Highscores
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.quest.SquireTutorialIsland;
import net.unethicalite.api.jsoup.Highscores;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class C
implements o {
    private final /* synthetic */ SquireTutorialIsland as;
    private static /* synthetic */ int[] lIlIIlIIlIIlI;

    @Inject
    public C(SquireTutorialIsland squireTutorialIsland) {
        this.as = squireTutorialIsland;
    }

    private static void lIlllIIlIIlIlII() {
        lIlIIlIIlIIlI = new int[2];
        C.lIlIIlIIlIIlI[0] = (0x37 ^ 0x60) & ~(0xF2 ^ 0xA5);
        C.lIlIIlIIlIIlI[1] = " ".length();
    }

    private static boolean lIlllIIlIIlIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean D() {
        if (C.lIlllIIlIIlIlIl(this.as.c())) {
            return lIlIIlIIlIIlI[0];
        }
        this.as.b(Highscores.getRandomUsername());
        return lIlIIlIIlIIlI[1];
    }

    static {
        C.lIlllIIlIIlIlII();
    }
}

