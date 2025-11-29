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

public class CHelper
implements o {
    private final  SquireTutorialIsland as;

    @Inject
    public CHelper(SquireTutorialIsland squireTutorialIsland) {
        this.as = squireTutorialIsland;
    }

    private static void var2() {
        var1 = new int[2];
        C.var1[0] = (0x37 ^ 0x60) & ~(0xF2 ^ 0xA5);
        C.var1[1] = 1;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    @Override
    public boolean D() {
        if (C.var3(this.as.c())) {
            return var1[0];
        }
        this.as.b(Highscores.getRandomUsername());
        return var1[1];
    }

    static {
        C.var2();
    }
}

