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
import java.util.Collections;
import java.util.List;
import gg.squire.herblore.tasks.GameEnum2;

public abstract class HerbloreTaskBase
extends Task {
    
    private final  SquireHerblore j;
    private final  HerbloreConfig i;
    private final  List<c> h;

    public abstract boolean h();

    private static boolean var2(int n) {
        return n != 0;
    }

    public List<c> i() {
        return this.h;
    }

    public boolean run() {
        if (d.var2(this.h.contains((Object)this.i.method()) ? 1 : 0)) {
            return this.h();
        }
        return var1[0];
    }

    private static void var3() {
        var1 = new int[1];
        d.var1[0] = (0x61 ^ 0x45) & ~(0x21 ^ 5);
    }

    public SquireHerblore k() {
        return this.j;
    }

    static {
        d.var3();
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public HerbloreTaskBase(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, c ... cArray) {
        List list;
        this.j = squireHerblore;
        if (d.var4(cArray)) {
            list = Collections.emptyList();
            0;
            
        } else {
            void var5;
            list = Arrays.asList(var5);
        }
        this.h = list;
        this.i = herbloreConfig;
    }

    public HerbloreConfig j() {
        return this.i;
    }
}

