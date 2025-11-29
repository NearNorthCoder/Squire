/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.IHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.UHelper;
import gg.squire.minigames.tasks.VHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class d
extends MinigamesTaskBase {
    private final  w B;
    private final  w w;
    private final  w z;
    private final  w x;
    private final  w A;
    
    private final  w v;
    private final  w C;
    private final  w D;
    private final  w y;

    @Override
    public String g() {
        return a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bp;
    }

    static {
        d.llIIllIlIlIllI();
    }

    private static boolean llIIllIlIllIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public w a(o o2) {
        d var1;
        void var2;
        if (d.llIIllIlIlIlll(o2.o().G() ? 1 : 0)) {
            int[] nArray = new int[lIIlIlllIIII[7]];
            nArray[d.lIIlIlllIIII[1]] = lIIlIlllIIII[8];
            nArray[d.lIIlIlllIIII[0]] = lIIlIlllIIII[2];
            nArray[d.lIIlIlllIIII[9]] = lIIlIlllIIII[3];
            nArray[d.lIIlIlllIIII[10]] = lIIlIlllIIII[4];
            nArray[d.lIIlIlllIIII[11]] = lIIlIlllIIII[5];
            if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return this.Y;
            }
        }
        if (!d.llIIllIlIlIlll(Bank.isOpen() ? 1 : 0) || d.llIIllIlIlIlll(var2.o().G() ? 1 : 0)) {
            return null;
        }
        int[] nArray = new int[lIIlIlllIIII[11]];
        nArray[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        nArray[d.lIIlIlllIIII[0]] = lIIlIlllIIII[3];
        nArray[d.lIIlIlllIIII[9]] = lIIlIlllIIII[4];
        nArray[d.lIIlIlllIIII[10]] = lIIlIlllIIII[5];
        if (d.llIIllIlIllIII(Inventory.contains((int[])nArray) ? 1 : 0) && d.llIIllIlIlIlll(Inventory.isFull() ? 1 : 0)) {
            return var1.Y;
        }
        int[] nArray2 = new int[lIIlIlllIIII[0]];
        nArray2[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return var1.z;
        }
        int[] nArray3 = new int[lIIlIlllIIII[0]];
        nArray3[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return var1.A;
        }
        int[] nArray4 = new int[lIIlIlllIIII[0]];
        nArray4[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return var1.B;
        }
        int[] nArray5 = new int[lIIlIlllIIII[0]];
        nArray5[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            return var1.C;
        }
        int[] nArray6 = new int[lIIlIlllIIII[0]];
        nArray6[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            return var1.v;
        }
        int[] nArray7 = new int[lIIlIlllIIII[0]];
        nArray7[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            return var1.w;
        }
        int[] nArray8 = new int[lIIlIlllIIII[0]];
        nArray8[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            return var1.x;
        }
        int[] nArray9 = new int[lIIlIlllIIII[0]];
        nArray9[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            return var1.y;
        }
        return this.D;
    }

    public d() {
        int[] nArray = new int[lIIlIlllIIII[0]];
        nArray[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        this.v = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bD, nArray);
        int[] nArray2 = new int[lIIlIlllIIII[0]];
        nArray2[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        this.w = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bE, nArray2);
        int[] nArray3 = new int[lIIlIlllIIII[0]];
        nArray3[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        this.x = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bF, nArray3);
        int[] nArray4 = new int[lIIlIlllIIII[0]];
        nArray4[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        this.y = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bG, nArray4);
        int[] nArray5 = new int[lIIlIlllIIII[0]];
        nArray5[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        this.z = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bH, nArray5);
        int[] nArray6 = new int[lIIlIlllIIII[0]];
        nArray6[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        this.A = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bI, nArray6);
        int[] nArray7 = new int[lIIlIlllIIII[0]];
        nArray7[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        this.B = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bJ, nArray7);
        int[] nArray8 = new int[lIIlIlllIIII[0]];
        nArray8[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        this.C = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bK, nArray8);
        int[] nArray9 = new int[lIIlIlllIIII[0]];
        nArray9[d.lIIlIlllIIII[1]] = lIIlIlllIIII[6];
        this.D = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bL, nArray9);
    }

    private static boolean llIIllIlIlIlll(int n2) {
        return n2 != 0;
    }

}

