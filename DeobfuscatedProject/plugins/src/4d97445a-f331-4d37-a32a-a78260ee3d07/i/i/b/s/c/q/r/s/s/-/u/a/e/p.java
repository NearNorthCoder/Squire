/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.unethicalite.api.items.Bank
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import net.unethicalite.api.items.Bank;

public abstract class p
extends Task {
    protected final /* synthetic */ SquireCerberusConfig av;
    private static /* synthetic */ int[] lIlIlllII;
    protected final /* synthetic */ a au;
    protected final /* synthetic */ SquireCerberus at;

    private static boolean lIIllIIllIl(int n2) {
        return n2 != 0;
    }

    static {
        p.lIIllIIlIll();
    }

    private static void lIIllIIlIll() {
        lIlIlllII = new int[1];
        p.lIlIlllII[0] = (2 ^ 0x1E) & ~(0x8E ^ 0x92);
    }

    private static boolean lIIllIIllII(int n2) {
        return n2 == 0;
    }

    protected p(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.at = squireCerberus;
        this.av = squireCerberusConfig;
        this.au = a2;
    }

    public boolean run() {
        p lIlllllIIllIIII;
        if (p.lIIllIIllII(this.av.bankLoadout().isSelected() ? 1 : 0)) {
            return lIlIlllII[0];
        }
        if (p.lIIllIIllII(lIlllllIIllIIII.at.r() ? 1 : 0)) {
            return lIlIlllII[0];
        }
        if (p.lIIllIIllII(Bank.isOpen() ? 1 : 0)) {
            return lIlIlllII[0];
        }
        if (p.lIIllIIllIl(lIlllllIIllIIII.au.l() ? 1 : 0)) {
            lIlllllIIllIIII.au.a(lIlIlllII[0]);
        }
        return this.V();
    }

    public abstract boolean V();
}

