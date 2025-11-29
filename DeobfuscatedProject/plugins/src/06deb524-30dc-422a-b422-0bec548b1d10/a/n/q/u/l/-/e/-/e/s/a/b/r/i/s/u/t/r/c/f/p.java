/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.s;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class p {
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIIllIlIlIII;
    private /* synthetic */ int al;
    private /* synthetic */ int ak;
    private static final /* synthetic */ int aj;
    @Inject
    private /* synthetic */ s ae;

    public int w() {
        return this.al;
    }

    public p() {
        this.al = lIIllIlIlIII[0];
        this.am = lIIllIlIlIII[1];
    }

    public int v() {
        return this.ak;
    }

    private static boolean llIIllllIlllll(int n2) {
        return n2 > 0;
    }

    public void t() {
        if (p.llIIllllIllllI(Bank.isOpen() ? 1 : 0)) {
            this.b(lIIllIlIlIII[1]);
            return;
        }
        this.b(this.ak - Inventory.getFreeSlots());
    }

    public void a(int n2) {
        this.al = n2;
    }

    private static boolean llIIllllIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIllllIllIll() {
        lIIllIlIlIII = new int[4];
        p.lIIllIlIlIII[0] = 112 + 14 - 121 + 215 ^ 129 + 191 - 301 + 180;
        p.lIIllIlIlIII[1] = (0xA5 ^ 0xB9) & ~(0x87 ^ 0x9B);
        p.lIIllIlIlIII[2] = " ".length();
        p.lIIllIlIlIII[3] = -(0xFFFFFA5F & 0x3FBB) & (0xFFFFFBDF & 0x3FFF);
    }

    public void c(int ... nArray) {
        if (p.llIIllllIlllll(nArray.length)) {
            this.am = nArray[lIIllIlIlIII[1]];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        } else {
            lllllllllllllllIlllIllIlIlIIllll.am += lIIllIlIlIII[2];
        }
    }

    private static boolean llIIllllIlllII(int n2) {
        return n2 == 0;
    }

    public void u() {
        if (p.llIIllllIllllI(Bank.isOpen() ? 1 : 0)) {
            this.b(this.al);
            return;
        }
        this.am = lIIllIlIlIII[1];
        int[] nArray = new int[lIIllIlIlIII[2]];
        nArray[p.lIIllIlIlIII[1]] = lIIllIlIlIII[3];
        this.b(this.ak + Inventory.getCount((int[])nArray));
    }

    private static boolean llIIllllIllllI(int n2) {
        return n2 != 0;
    }

    public boolean s() {
        boolean bl;
        if (p.llIIllllIlllIl(this.ak, this.al)) {
            bl = lIIllIlIlIII[2];
            "".length();
            if (-" ".length() >= ((0x28 ^ 0x66) & ~(0x31 ^ 0x7F))) {
                return ((0x69 ^ 0x3D) & ~(0x5E ^ 0xA)) != 0;
            }
        } else {
            bl = lIIllIlIlIII[1];
        }
        return bl;
    }

    static {
        p.llIIllllIllIll();
        aj = lIIllIlIlIII[1];
    }

    public boolean r() {
        boolean bl;
        if (p.llIIllllIlllII(this.ak)) {
            bl = lIIllIlIlIII[2];
            "".length();
            if ((0x87 ^ 0x83) != (3 ^ 7)) {
                return ((0xF1 ^ 0xBB) & ~(0x5B ^ 0x11)) != 0;
            }
        } else {
            bl = lIIllIlIlIII[1];
        }
        return bl;
    }

    public int x() {
        return this.am;
    }

    public void b(int n2) {
        this.ak = Math.min(Math.max(n2, lIIllIlIlIII[1]), this.al);
    }
}

