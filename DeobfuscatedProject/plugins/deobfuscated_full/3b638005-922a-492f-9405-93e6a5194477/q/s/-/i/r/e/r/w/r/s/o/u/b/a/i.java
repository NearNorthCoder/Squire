/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.unethicalite.api.items.Bank
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import net.unethicalite.api.items.Bank;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.a;

public abstract class i
extends Task {
    protected final /* synthetic */ SquireBarrowsConfig H;
    private static /* synthetic */ int[] llllIlIIIlI;
    protected final /* synthetic */ a I;
    protected final /* synthetic */ SquireBarrows G;

    public boolean run() {
        i var1;
        if (i.lIllIlIlIIlIlI(this.H.useBank() ? 1 : 0)) {
            return llllIlIIIlI[0];
        }
        if (i.lIllIlIlIIlIlI(var1.G.u() ? 1 : 0)) {
            return llllIlIIIlI[0];
        }
        if (i.lIllIlIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
            return llllIlIIIlI[0];
        }
        return this.K();
    }

    protected i(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.G = squireBarrows;
        this.H = squireBarrowsConfig;
        this.I = squireBarrows.t();
    }

    private static void lIllIlIlIIlIIl() {
        llllIlIIIlI = new int[1];
        i.llllIlIIIlI[0] = (4 ^ 0x77 ^ (0x2D ^ 0x61)) & (0xA0 ^ 0x9D ^ 2 ^ -1);
    }

    static {
        i.lIllIlIlIIlIIl();
    }

    public abstract boolean K();

    private static boolean lIllIlIlIIlIlI(int n2) {
        return n2 == 0;
    }
}

