/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.herblore.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import gg.squire.herblore.tasks.GameEnum3;

public abstract class HerbloreTaskBase
extends Task {
    
    private final  SquireHerblore j;
    private final  HerbloreConfig i;
    private final  List<c> h;

    public abstract boolean h();

    private static boolean lIIIlIlllIIIIIl(int n) {
        return n != 0;
    }

    public List<c> i() {
        return this.h;
    }

    public boolean run() {
        if (d.lIIIlIlllIIIIIl(this.h.contains((Object)this.i.method()) ? 1 : 0)) {
            return this.h();
        }
        return lllIlIIIIllI[0];
    }

    public SquireHerblore k() {
        return this.j;
    }

    static {
        d.lIIIlIllIllllll();
    }

    private static boolean lIIIlIlllIIIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public HerbloreTaskBase(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, c ... cArray) {
        List list;
        this.j = squireHerblore;
        if (d.lIIIlIlllIIIIII(cArray)) {
            list = Collections.emptyList();

            if (3 == 0) {
                throw null;
            }
        } else {
            void var1;
            list = Arrays.asList(var1);
        }
        this.h = list;
        this.i = herbloreConfig;
    }

    public HerbloreConfig j() {
        return this.i;
    }
}

