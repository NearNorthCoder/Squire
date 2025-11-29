/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.UHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class DHelper
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
        d.var2();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public w a(o o2) {
        d var3;
        void var4;
        if ((o2.o( != 0).G() ? 1 : 0)) {
            int[] nArray = new int[7];
            nArray[1] = 8;
            nArray[0] = 2;
            nArray[9] = 3;
            nArray[d.var1[10]] = 4;
            nArray[d.var1[11]] = 5;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                return this.Y;
            }
        }
        if (!(Bank.isOpen( != 0) ? 1 : 0) || (var4.o( != 0).G() ? 1 : 0)) {
            return null;
        }
        int[] nArray = new int[var1[11]];
        nArray[1] = 2;
        nArray[0] = 3;
        nArray[9] = 4;
        nArray[d.var1[10]] = 5;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0) && (Inventory.isFull( != 0) ? 1 : 0)) {
            return var3.Y;
        }
        int[] nArray2 = new int[0];
        nArray2[1] = 2;
        if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
            return var3.z;
        }
        int[] nArray3 = new int[0];
        nArray3[1] = 3;
        if ((Inventory.contains((int[] != 0)nArray3) ? 1 : 0)) {
            return var3.A;
        }
        int[] nArray4 = new int[0];
        nArray4[1] = 4;
        if ((Inventory.contains((int[] != 0)nArray4) ? 1 : 0)) {
            return var3.B;
        }
        int[] nArray5 = new int[0];
        nArray5[1] = 5;
        if ((Inventory.contains((int[] != 0)nArray5) ? 1 : 0)) {
            return var3.C;
        }
        int[] nArray6 = new int[0];
        nArray6[1] = 2;
        if ((Bank.contains((int[] != 0)nArray6) ? 1 : 0)) {
            return var3.v;
        }
        int[] nArray7 = new int[0];
        nArray7[1] = 3;
        if ((Bank.contains((int[] != 0)nArray7) ? 1 : 0)) {
            return var3.w;
        }
        int[] nArray8 = new int[0];
        nArray8[1] = 4;
        if ((Bank.contains((int[] != 0)nArray8) ? 1 : 0)) {
            return var3.x;
        }
        int[] nArray9 = new int[0];
        nArray9[1] = 5;
        if ((Bank.contains((int[] != 0)nArray9) ? 1 : 0)) {
            return var3.y;
        }
        return this.D;
    }

    public DHelper() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        this.v = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bD, nArray);
        int[] nArray2 = new int[0];
        nArray2[1] = 3;
        this.w = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bE, nArray2);
        int[] nArray3 = new int[0];
        nArray3[1] = 4;
        this.x = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bF, nArray3);
        int[] nArray4 = new int[0];
        nArray4[1] = 5;
        this.y = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bG, nArray4);
        int[] nArray5 = new int[0];
        nArray5[1] = 2;
        this.z = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bH, nArray5);
        int[] nArray6 = new int[0];
        nArray6[1] = 3;
        this.A = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bI, nArray6);
        int[] nArray7 = new int[0];
        nArray7[1] = 4;
        this.B = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bJ, nArray7);
        int[] nArray8 = new int[0];
        nArray8[1] = 5;
        this.C = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bK, nArray8);
        int[] nArray9 = new int[0];
        nArray9[1] = 6;
        this.D = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bL, nArray9);
    }

}

