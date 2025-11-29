/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum24;
import java.util.ArrayList;
import java.util.List;

public class l {
    private final  List<l> n;
    private final  k p;
    private final  l o;

    public l E() {
        return this.o;
    }

    public k C() {
        return this.p;
    }

    public l a(k k2) {
        l l2 = new l(k2, this);
        this.n.add(l2);

        return l2;
    }

    public List<l> D() {
        return this.n;
    }

    public l(k k2, l l2) {
        this.n = new ArrayList<l>();
        this.p = k2;
        this.o = l2;
    }
}

