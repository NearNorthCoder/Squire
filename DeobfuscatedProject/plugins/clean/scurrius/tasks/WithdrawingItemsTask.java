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
package gg.squire.scurrius.tasks;

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
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class WithdrawingItemsTask
extends ScurriusTaskBase {

    static {
        l.lIlIllIllIIIIII();
        l.lIlIllIlIllllll();
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIllIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlIllllll() {
        lIIlIllIllllI = new String[lIIlIllIlllll[3]];
        l.lIIlIllIllllI[l.lIIlIllIlllll[0]] = "No bank loadout selected";
        l.lIIlIllIllllI[l.lIIlIllIlllll[2]] = "Banking failed 5 times in a row, stopping";
    }

    @Override
    public boolean a() {
        l var2;
        if (l.lIlIllIllIIIIIl(this.s() ? 1 : 0)) {
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIlI(var2.t())) {
            Log.error((String)lIIlIllIllllI[lIIlIllIlllll[0]]);
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIIl(var2.t().needsToBank() ? 1 : 0)) {
            var2.a.e(lIIlIllIlllll[0]);
            Bank.close();
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIIl(BankLoadouts.withdrawWithRetries((BankLoadout)var2.t(), (int)lIIlIllIlllll[1]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIIlIllIllllI[lIIlIllIlllll[2]]);
            return lIIlIllIlllll[0];
        }
        this.sleep(lIIlIllIlllll[3]);
        return lIIlIllIlllll[2];
    }

    private static boolean lIlIllIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIllIIIIlI(Object object) {
        return object == null;
    }
}

