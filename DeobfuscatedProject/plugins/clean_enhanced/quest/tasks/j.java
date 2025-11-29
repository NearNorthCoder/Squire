/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.runelite.api.Client
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.runelite.api.Client;

public interface j {
    default public void a(j j2) {
    }

    default public void d(@Nullable String string) {
    }

    default public boolean j() {
        return ((0x70 ^ 0x52) & ~(0xA2 ^ 0x80)) != 0;
    }

    default public boolean b(Client client) {
        return 1 != 0;
    }

    @Nullable
    default public String m() {
        return null;
    }

    @Nonnull
    public String k();

    @Nullable
    default public String l() {
        return null;
    }

    public boolean a(Client var1);

    default public void c(@Nullable String string) {
    }

    default public j n() {
        return null;
    }
}

