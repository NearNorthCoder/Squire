/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.unethicalite.client.Static
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Singleton;
import net.unethicalite.client.Static;

@Singleton
public class a_Unknown {
    private /* synthetic */ int h;
    private static /* synthetic */ int[] lIIlIlIIIlIII;
    private /* synthetic */ int g;

    public void c() {
        this.h = this.f();
    }

    public void b() {
        this.g = this.f();
    }

    static {
        a.lIlIlIllIIIlIIl();
    }

    private static boolean lIlIlIllIIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private int f() {
        return Static.getClient().getTickCount();
    }

    public boolean e() {
        int n2;
        int n3 = this.f() - this.h;
        if (a.lIlIlIllIIIlIlI(this.f() - this.g, lIIlIlIIIlIII[0]) && (!a.lIlIlIllIIIlIll(n3) || a.lIlIlIllIIIlIlI(n3, lIIlIlIIIlIII[0]))) {
            n2 = lIIlIlIIIlIII[1];
            0;
            if (3 > 3) {
                return false;
            }
        } else {
            n2 = lIIlIlIIIlIII[2];
        }
        return n2 != 0;
    }

    public boolean d() {
        boolean bl;
        if (a.lIlIlIllIIIlIlI(this.f() - Math.max(this.h, this.g), lIIlIlIIIlIII[0])) {
            bl = lIIlIlIIIlIII[1];
            0;
            
            }
        } else {
            bl = lIIlIlIIIlIII[2];
        }
        return bl;
    }

    private static boolean lIlIlIllIIIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIllIIIlIIl() {
        lIIlIlIIIlIII = new int[3];
        a.lIIlIlIIIlIII[0] = 27 + 144 - 141 + 151 ^ 86 + 118 - 141 + 114;
        a.lIIlIlIIIlIII[1] = 1;
        a.lIIlIlIIIlIII[2] = (219 + 117 - 185 + 86 ^ 91 + 155 - 155 + 74) & (0x18 ^ 0x73 ^ (0x50 ^ 0x73) ^ -1);
    }
}

