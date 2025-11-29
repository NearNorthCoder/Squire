/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class WithdrawingItemsTask
extends VardorvisTaskBase {

    private static void lIllllIlIIlIIlI() {
        lIlIlIIIIllII = new String[lIlIlIIIIllIl[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllII[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."No bank loadout selected";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllII[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Banking failed 5 times in a row, stopping";
    }

    private static boolean lIllllIlIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIIlIlIl(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        t var1;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlII(this.P() ? 1 : 0)) {
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlIl(var1.Q())) {
            Log.error((String)lIlIlIIIIllII[lIlIlIIIIllIl[0]]);
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlII(var1.Q().needsToBank() ? 1 : 0)) {
            var1.s.c(lIlIlIIIIllIl[0]);
            Bank.close();
            var1.sleep(lIlIlIIIIllIl[1]);
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlII(BankLoadouts.withdrawWithRetries((BankLoadout)var1.Q(), (int)lIlIlIIIIllIl[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIlIIIIllII[lIlIlIIIIllIl[3]]);
            return lIlIlIIIIllIl[0];
        }
        this.sleep(lIlIlIIIIllIl[4]);
        return lIlIlIIIIllIl[3];
    }

    private static boolean lIllllIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIIll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIIlI();
    }

}

