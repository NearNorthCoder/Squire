/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import javax.inject.Singleton;

@Singleton
public class a_Unknown {
    private static /* synthetic */ int[] lIlIllIllIlII;
    private /* synthetic */ boolean h;

    public void a(boolean bl) {
        this.h = bl;
    }

    private static void llIIIIIllIIIllI() {
        lIlIllIllIlII = new int[1];
        a.lIlIllIllIlII[0] = (0xD5 ^ 0x83 ^ (0x40 ^ 6)) & (0xC4 ^ 0x95 ^ (0x61 ^ 0x20) ^ -1);
    }

    static {
        a.llIIIIIllIIIllI();
    }

    public a() {
        this.h = lIlIllIllIlII[0];
    }

    public boolean b() {
        return this.h;
    }
}

