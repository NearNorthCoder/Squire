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
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.n;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.p;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.q;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.r;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.s;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.t;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@Singleton
public class o {
    @Inject
    private /* synthetic */ n af;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ p ad;
    @Inject
    private /* synthetic */ s ae;
    @Inject
    private /* synthetic */ r ai;
    @Inject
    private /* synthetic */ q ag;
    @Inject
    private /* synthetic */ t ah;
    private static /* synthetic */ int[] lIIllIlllllI;

    public r p() {
        return this.ai;
    }

    public void i() {
        o lllllllllllllllIlllIllIIlIlIlIII;
        if (!(!o.llIIllllllllll(this.ah.F() ? 1 : 0) || o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[0]) ? 1 : 0) && o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[1]) ? 1 : 0) && o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[2]) ? 1 : 0) && o.llIlIIIIIIIIII(this.ae.f(lIIllIlllllI[3]) ? 1 : 0) && !o.llIIllllllllll(this.ae.f(lIIllIlllllI[4]) ? 1 : 0))) {
            lllllllllllllllIlllIllIIlIlIlIII.ah.a(lIIllIlllllI[5]);
            "".length();
        }
        int[] nArray = new int[lIIllIlllllI[6]];
        nArray[o.lIIllIlllllI[7]] = lIIllIlllllI[8];
        nArray[o.lIIllIlllllI[5]] = lIIllIlllllI[9];
        nArray[o.lIIllIlllllI[10]] = lIIllIlllllI[11];
        nArray[o.lIIllIlllllI[12]] = lIIllIlllllI[13];
        nArray[o.lIIllIlllllI[14]] = lIIllIlllllI[15];
        if (o.llIIllllllllll(lllllllllllllllIlllIllIIlIlIlIII.ai.b(nArray) ? 1 : 0)) {
            lllllllllllllllIlllIllIIlIlIlIII.ah.a(lIIllIlllllI[7]);
            "".length();
        }
        int[] nArray2 = new int[lIIllIlllllI[12]];
        nArray2[o.lIIllIlllllI[7]] = lIIllIlllllI[16];
        nArray2[o.lIIllIlllllI[5]] = lIIllIlllllI[17];
        nArray2[o.lIIllIlllllI[10]] = lIIllIlllllI[18];
        if (o.llIIllllllllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllIlllIllIIlIlIlIII.ad.a(lIIllIlllllI[19]);
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        } else {
            lllllllllllllllIlllIllIIlIlIlIII.ad.a(lIIllIlllllI[20]);
        }
        if (o.llIlIIIIIIIIIl(lllllllllllllllIlllIllIIlIlIlIII.ad.x()) && o.llIIllllllllll(Bank.isOpen() ? 1 : 0) && o.llIIllllllllll(lllllllllllllllIlllIllIIlIlIlIII.ae.f(lIIllIlllllI[21]) ? 1 : 0)) {
            int[] nArray3 = new int[lIIllIlllllI[5]];
            nArray3[o.lIIllIlllllI[7]] = lIIllIlllllI[21];
            if (o.llIIllllllllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIllIlllllI[5]];
                nArray4[o.lIIllIlllllI[7]] = lIIllIlllllI[7];
                lllllllllllllllIlllIllIIlIlIlIII.ad.c(nArray4);
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

    private static void llIIlllllllllI() {
        lIIllIlllllI = new int[22];
        o.lIIllIlllllI[0] = -(0xFFFFF44F & 0x7FF4) & (0xFFFFF5FF & Short.MAX_VALUE);
        o.lIIllIlllllI[1] = 0xFFFFB1BE & 0x4FF9;
        o.lIIllIlllllI[2] = -(0xFFFFB77F & 0x6CC1) & (0xFFFFA5FF & Short.MAX_VALUE);
        o.lIIllIlllllI[3] = -(0xFFFFEE3F & 0x7FCD) & (0xFFFFFFCF & 0x6FFD);
        o.lIIllIlllllI[4] = -(0xFFFFFC1D & 0x3FF7) & (0xFFFFBDDF & 0x7FF7);
        o.lIIllIlllllI[5] = " ".length();
        o.lIIllIlllllI[6] = 0x25 ^ 0x20;
        o.lIIllIlllllI[7] = (0xB3 ^ 0x8D ^ (0xA4 ^ 0xC6)) & (77 + 164 - 215 + 225 ^ 96 + 133 - 77 + 15 ^ -" ".length());
        o.lIIllIlllllI[8] = -(0xFFFFF3F9 & 0x2E0F) & (0xFFFFFB3F & 0x2FFD);
        o.lIIllIlllllI[9] = 0xFFFFFDB7 & 0xB79;
        o.lIIllIlllllI[10] = "  ".length();
        o.lIIllIlllllI[11] = 0xFFFFAF37 & 0x59FF;
        o.lIIllIlllllI[12] = "   ".length();
        o.lIIllIlllllI[13] = -(0xFFFFF4C5 & 0x3FBB) & (0xFFFFBFF9 & 0x7DBF);
        o.lIIllIlllllI[14] = 0x47 ^ 0x43;
        o.lIIllIlllllI[15] = -(0xFFFFAFC7 & 0x76BD) & (0xFFFFBFFF & 0x6FBF);
        o.lIIllIlllllI[16] = 0xFFFFFFE3 & 0x265F;
        o.lIIllIlllllI[17] = -(0xFFFFFABB & 0x55FE) & (0xFFFFFFFD & 0x76FF);
        o.lIIllIlllllI[18] = 0xFFFFFFFC & 0x33E3;
        o.lIIllIlllllI[19] = 0x19 ^ 0x3D;
        o.lIIllIlllllI[20] = 0x52 ^ 0x49;
        o.lIIllIlllllI[21] = -(0xFFFFFBDB & 0x3427) & (0xFFFFB7E7 & 0x79DF);
    }

    public SquireBlastFurnaceConfig q() {
        return this.i;
    }

    private static boolean llIlIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    public t o() {
        return this.ah;
    }
}

