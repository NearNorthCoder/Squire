/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Singleton;
import java.util.HashSet;
import java.util.Set;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.LEnum;

@Singleton
public class B_Unknown {
    private /* synthetic */ l ba;
    private final /* synthetic */ Set<l> aZ;

    public void a(l l2) {
        this.aZ.add(l2);
        0;
    }

    public void b(l l2) {
        this.ba = l2;
    }

    public B() {
        this.aZ = new HashSet<l>();
    }

    public void r() {
        this.aZ.clear();
        this.ba = null;
    }

    public l ak() {
        return this.ba;
    }
}

