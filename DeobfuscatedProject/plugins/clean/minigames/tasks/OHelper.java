/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.NHelper;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.p;
import gg.squire.minigames.tasks.QHelper;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.r;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.s;
import gg.squire.minigames.tasks.THelper;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@Singleton
public class OHelper {
    @Inject
    private  n af;
    @Inject
    private  SquireBlastFurnaceConfig i;
    @Inject
    private  p ad;
    @Inject
    private  s ae;
    @Inject
    private  r ai;
    @Inject
    private  q ag;
    @Inject
    private  t ah;

    public r p() {
        return this.ai;
    }

    public void i() {
        o var1;
        if (!(!o.llIIllllllllll(this.ah.F() ? 1 : 0) || o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[0]) ? 1 : 0) && o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[1]) ? 1 : 0) && o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[2]) ? 1 : 0) && o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[3]) ? 1 : 0) && !o.llIIllllllllll(this.ae.f(lIIllIlllllI[4]) ? 1 : 0))) {
            var1.ah.a(lIIllIlllllI[5]);

        }
        int[] nArray = new int[lIIllIlllllI[6]];
        nArray[o.lIIllIlllllI[7]] = lIIllIlllllI[8];
        nArray[o.lIIllIlllllI[5]] = lIIllIlllllI[9];
        nArray[o.lIIllIlllllI[10]] = lIIllIlllllI[11];
        nArray[o.lIIllIlllllI[12]] = lIIllIlllllI[13];
        nArray[o.lIIllIlllllI[14]] = lIIllIlllllI[15];
        if (o.llIIllllllllll(var1.ai.b(nArray) ? 1 : 0)) {
            var1.ah.a(lIIllIlllllI[7]);

        }
        int[] nArray2 = new int[lIIllIlllllI[12]];
        nArray2[o.lIIllIlllllI[7]] = lIIllIlllllI[16];
        nArray2[o.lIIllIlllllI[5]] = lIIllIlllllI[17];
        nArray2[o.lIIllIlllllI[10]] = lIIllIlllllI[18];
        if (o.llIIllllllllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
            var1.ad.a(lIIllIlllllI[19]);

            if (-1 == 1) {
                return;
            }
        } else {
            var1.ad.a(lIIllIlllllI[20]);
        }
        if (o.llIlIIIIIIIIIl(var1.ad.x()) && o.llIIllllllllll(Bank.isOpen() ? 1 : 0) && o.llIIllllllllll(var1.ae.f(lIIllIlllllI[21]) ? 1 : 0)) {
            int[] nArray3 = new int[lIIllIlllllI[5]];
            nArray3[o.lIIllIlllllI[7]] = lIIllIlllllI[21];
            if (o.llIIllllllllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIllIlllllI[5]];
                nArray4[o.lIIllIlllllI[7]] = lIIllIlllllI[7];
                var1.ad.c(nArray4);
            }
        }
        this.ae.i();
        this.ai.i();
    }

    static {
        o.llIIlllllllllI();
    }

    private static boolean llIIllllllllll(int n2) {
        return n2 != 0;
    }

    public s l() {
        return this.ae;
    }

    public n m() {
        return this.af;
    }

    public q n() {
        return this.ag;
    }

    private static boolean llIlIIIIIIIIIl(int n2) {
        return n2 > 0;
    }

    public void j() {
        this.ai.j();
        this.ae.j();
    }

    public p k() {
        return this.ad;
    }

    public SquireBlastFurnaceConfig q() {
        return this.i;
    }

    private static boolean llIlIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    public t OHelper() {
        return this.ah;
    }
}

