/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.unethicalite.client.Static
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Singleton;
import net.unethicalite.client.Static;

@Singleton
public class f {
    private /* synthetic */ int u;
    private static /* synthetic */ int[] llIlllllIII;
    private /* synthetic */ int t;

    private static void lIlIllIIIlIIIl() {
        llIlllllIII = new int[3];
        f.llIlllllIII[0] = 0x35 ^ 0x31;
        f.llIlllllIII[1] = " ".length();
        f.llIlllllIII[2] = (0x29 ^ 0x13 ^ (0x67 ^ 0x4A)) & (0x78 ^ 0x48 ^ (0x45 ^ 0x62) ^ -" ".length());
    }

    static {
        f.lIlIllIIIlIIIl();
    }

    private static boolean lIlIllIIIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean E() {
        int n2;
        int n3 = this.F() - this.u;
        if (f.lIlIllIIIlIIlI(this.F() - this.t, llIlllllIII[0]) && (!f.lIlIllIIIlIIll(n3) || f.lIlIllIIIlIIlI(n3, llIlllllIII[0]))) {
            n2 = llIlllllIII[1];
            "".length();
            if ((52 + 56 - 57 + 100 ^ 116 + 42 - 88 + 77) < 0) {
                return ((143 + 185 - 226 + 86 ^ 17 + 98 - -47 + 1) & (0x1A ^ 0xE ^ (0xCC ^ 0xC7) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlllllIII[2];
        }
        return n2 != 0;
    }

    public void B() {
        this.t = this.F();
    }

    public void C() {
        this.u = this.F();
    }

    private static boolean lIlIllIIIlIIll(int n2) {
        return n2 != 0;
    }

    private int F() {
        return Static.getClient().getTickCount();
    }

    public boolean D() {
        boolean bl;
        if (f.lIlIllIIIlIIlI(this.F() - Math.max(this.u, this.t), llIlllllIII[0])) {
            bl = llIlllllIII[1];
            "".length();
            if (((0x9A ^ 0x85 ^ (0xCA ^ 0xB6)) & (4 ^ 0x40 ^ (0x17 ^ 0x30) ^ -" ".length())) != 0) {
                return ((153 + 191 - 299 + 189 ^ 52 + 4 - 47 + 176) & (118 + 48 - 104 + 157 ^ 19 + 52 - 12 + 77 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlllllIII[2];
        }
        return bl;
    }
}

