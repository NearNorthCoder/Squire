/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.s;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class p {
    private  int am;
    
    private  int al;
    private  int ak;
    private static final  int aj;
    @Inject
    private  s ae;

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

    public void c(int ... nArray) {
        if (p.llIIllllIlllll(nArray.length)) {
            this.am = nArray[lIIllIlIlIII[1]];

            if (2 < 0) {
                return;
            }
        } else {
            var1.am += lIIllIlIlIII[2];
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

            if (-1 >= ((0x28 ^ 0x66) & ~(0x31 ^ 0x7F))) {
                return false;
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

            if ((0x87 ^ 0x83) != (3 ^ 7)) {
                return false;
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

