/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.whisperer.SquireWhisperer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Withdrawing items")
public class WithdrawingItemsTask
extends WhispererTaskBase {
    @Inject
    private  SquireWhisperer Q;
    
    private  int R;
    private  CompletableFuture<Boolean> S;

    static {
        m.llIIIIlIlIllIII();
        m.llIIIIlIlIlIlll();
    }

    @Override
    public boolean p() {
        m var1;
        if (m.llIIIIlIlIllIIl(this.n() ? 1 : 0)) {
            return lIlIllllIIIIl[0];
        }
        BankLoadout var2 = var1.o();
        if (m.llIIIIlIlIllIlI(var2)) {
            Log.error((String)lIlIllllIIIII[lIlIllllIIIIl[0]]);
            return lIlIllllIIIIl[0];
        }
        Object[] objectArray = new Object[lIlIllllIIIIl[1]];
        objectArray[m.lIlIllllIIIIl[0]] = var2.needsToBank();
        Log.info((String)lIlIllllIIIII[lIlIllllIIIIl[1]], (Object[])objectArray);
        if (m.llIIIIlIlIllIIl(var2.needsToBank() ? 1 : 0)) {
            var1.f.a(lIlIllllIIIIl[0]);
            return lIlIllllIIIIl[0];
        }
        if (m.llIIIIlIlIllIIl(BankLoadouts.withdrawWithRetries((BankLoadout)var2, (int)lIlIllllIIIIl[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIllllIIIII[lIlIllllIIIIl[3]]);
            var1.sleep(lIlIllllIIIIl[2]);
            return lIlIllllIIIIl[0];
        }
        return lIlIllllIIIIl[0];
    }

    private static boolean llIIIIlIlIllIIl(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlIlIlIlll() {
        lIlIllllIIIII = new String[lIlIllllIIIIl[4]];
        m.lIlIllllIIIII[m.lIlIllllIIIIl[0]] = "No bank loadout selected";
        m.lIlIllllIIIII[m.lIlIllllIIIIl[1]] = "Need to bank: {}";
        m.lIlIllllIIIII[m.lIlIllllIIIIl[3]] = "Failed to withdraw loadout after 5 tries, pausing for 5 ticks";
    }

    public WithdrawingItemsTask() {
        this.S = null;
    }

    private static boolean llIIIIlIlIllIlI(Object object) {
        return object == null;
    }
}

