/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Checking state", priority=133337, register=true)
public class CheckingStateTask
extends Task {

    private final  SquireWoodcutterConfig H;
    private final  SquireWoodcutterPlugin G;

    public boolean run() {
        h var1;
        if (h.llIIIlIIllIIIlI(this.G.g() ? 1 : 0) && h.llIIIlIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
            Log.info((String)lIllIIIlIIIlI[lIllIIIlIIIll[0]]);
            this.G.a(lIllIIIlIIIll[0]);
            Bank.close();
        }
        if (h.llIIIlIIllIIIlI(var1.G.p() ? 1 : 0)) {
            return lIllIIIlIIIll[0];
        }
        if (h.llIIIlIIllIIIlI(Inventory.isFull() ? 1 : 0) && h.llIIIlIIllIIIlI(var1.H.bank() ? 1 : 0)) {
            Log.info((String)lIllIIIlIIIlI[lIllIIIlIIIll[1]]);
            var1.G.a(lIllIIIlIIIll[1]);
            return lIllIIIlIIIll[1];
        }
        if (h.llIIIlIIllIIIll(var1.G.d() ? 1 : 0) && (!h.llIIIlIIllIIIll(var1.H.fastTickChop() ? 1 : 0) || h.llIIIlIIllIIIlI(var1.H.tickChop() ? 1 : 0))) {
            Log.info((String)lIllIIIlIIIlI[lIllIIIlIIIll[2]]);
            var1.G.a(lIllIIIlIIIll[1]);
            return lIllIIIlIIIll[1];
        }
        return lIllIIIlIIIll[0];
    }

    private static boolean llIIIlIIllIIIll(int n) {
        return n == 0;
    }

    @Inject
    public CheckingStateTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.G = squireWoodcutterPlugin;
        this.H = squireWoodcutterConfig;
    }

        return String.valueOf(var2);
    }

    private static boolean llIIIlIIllIIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIIlIIllIIIlI(int n) {
        return n != 0;
    }

    static {
        h.llIIIlIIllIIIIl();
        h.llIIIlIIllIIIII();
    }

    private static void llIIIlIIllIIIII() {
        lIllIIIlIIIlI = new String[lIllIIIlIIIll[3]];
        h.lIllIIIlIIIlI[h.lIllIIIlIIIll[0]] = "Done banking, closing bank.";
        h.lIllIIIlIIIlI[h.lIllIIIlIIIll[1]] = "Inventory is full, going to bank.";
        h.lIllIIIlIIIlI[h.lIllIIIlIIIll[2]] = "We have lost our tick manipulation items, going to bank.";
    }
}

