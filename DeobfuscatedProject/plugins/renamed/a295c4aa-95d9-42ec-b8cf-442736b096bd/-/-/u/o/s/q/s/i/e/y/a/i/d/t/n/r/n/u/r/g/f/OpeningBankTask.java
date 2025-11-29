/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Opening bank -> OpenBankTask */
@TaskDesc(name="Opening bank", priority=50)
public class OpeningBankTask
extends j_Unknown {
    private static /* synthetic */ int[] llIlIlIlIllI;

    static {
        v.lIIIIIllIIlIIll();
    }

    @Inject
    public v(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void lIIIIIllIIlIIll() {
        llIlIlIlIllI = new int[2];
        v.llIlIlIlIllI[0] = (60 + 15 - -119 + 31 ^ 15 + 51 - 16 + 143) & (57 + 129 - 84 + 31 ^ 125 + 132 - 118 + 26 ^ -1);
        v.llIlIlIlIllI[1] = 1;
    }

    @Override
    public boolean M() {
        v var1;
        if (v.lIIIIIllIIlIlII(this.T.g() ? 1 : 0)) {
            return llIlIlIlIllI[0];
        }
        if (v.lIIIIIllIIlIlII(var1.T.d() ? 1 : 0)) {
            return llIlIlIlIllI[0];
        }
        int[] nArray = new int[llIlIlIlIllI[1]];
        nArray[v.llIlIlIlIllI[0]] = var1.V.primaryBar().v();
        if (v.lIIIIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIlIlIlIllI[1]];
            nArray2[v.llIlIlIlIllI[0]] = var1.V.secondaryBar().v();
            if (v.lIIIIIllIIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return llIlIlIlIllI[0];
            }
        }
        if (v.lIIIIIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return llIlIlIlIllI[1];
        }
        return llIlIlIlIllI[0];
    }

    private static boolean lIIIIIllIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIllIIlIlII(int n2) {
        return n2 == 0;
    }
}

