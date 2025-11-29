/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.unethicalite.api.jsoup.Highscores
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.quest.SquireTutorialIsland;
import net.unethicalite.api.jsoup.Highscores;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class C
implements o {
    private final  SquireTutorialIsland as;

    @Inject
    public C(SquireTutorialIsland squireTutorialIsland) {
        this.as = squireTutorialIsland;
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

