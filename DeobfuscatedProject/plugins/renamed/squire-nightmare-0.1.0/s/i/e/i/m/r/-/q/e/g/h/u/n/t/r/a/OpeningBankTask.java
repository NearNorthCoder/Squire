/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.unethicalite.api.items.Bank;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.BankingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;

/* TASK: Opening bank -> OpenBankTask */
@TaskDesc(name="Opening bank", priority=500, blocking=true)
public class OpeningBankTask
extends BankingTask {
    private static /* synthetic */ int[] lllIllIllIII;

    @Inject
    protected I(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIIllIlIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIllIlIlIIIll() {
        lllIllIllIII = new int[1];
        I.lllIllIllIII[0] = (4 ^ 0 ^ (0x33 ^ 0x10)) & (0xE9 ^ 0xA2 ^ (0x68 ^ 4) ^ -1);
    }

    @Override
    public boolean bY() {
        I var1;
        if (I.lIIIllIlIlIIlII(this.cW.ae() ? 1 : 0)) {
            return lllIllIllIII[0];
        }
        if (I.lIIIllIlIlIIlIl(var1.cc() ? 1 : 0)) {
            return lllIllIllIII[0];
        }
        if (I.lIIIllIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
            return lllIllIllIII[0];
        }
        if (I.lIIIllIlIlIIlIl(var1.ce().needsToBank() ? 1 : 0)) {
            return lllIllIllIII[0];
        }
        return this.cV.bankLocation().bK().getAsBoolean();
    }

    private static boolean lIIIllIlIlIIlII(int n2) {
        return n2 != 0;
    }

    static {
        I.lIIIllIlIlIIIll();
    }
}

