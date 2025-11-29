/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.runelite.api.Client
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.runelite.api.Client;

public interface j {
    default public void b(@Nullable String string) {
    }

    default public void a(j j2) {
    }

    public boolean a(Client var1);

    default public void c(@Nullable String string) {
    }

    @Nullable
    default public String k() {
        return null;
    }

    default public boolean i() {
        return ((0x31 ^ 0x27 ^ (0x5D ^ 0x16)) & (102 + 196 - 267 + 186 ^ 37 + 86 - 3 + 12 ^ -" ".length())) != 0;
    }

    @Nonnull
    public String j();

    @Nullable
    default public String l() {
        return null;
    }

    default public boolean b(Client client) {
        return " ".length() != 0;
    }

    default public j m() {
        return null;
    }
}

