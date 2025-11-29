/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.o;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;

/* TASK: Using Bankloadout -> UsingbankloadoutTask */
@TaskDesc(name="Using Bankloadout", priority=80, blocking=true)
public class n
extends o {
    private static /* synthetic */ int[] lIlIllIIIlIll;
    private static /* synthetic */ String[] lIlIllIIIlIlI;

    private static String llIIIIIIIlIlIIl(String var1, String var8) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var4 = var8.toCharArray();
        int var9 = lIlIllIIIlIll[0];
        char[] var2 = var1.toCharArray();
        int var10 = var2.length;
        int var7 = lIlIllIIIlIll[0];
        while (n.llIIIIIIIlIllIl(var7, var10)) {
            char var5 = var2[var7];
            var6.append((char)(var5 ^ var4[var9 % var4.length]));
            0;
            ++var9;
            ++var7;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void llIIIIIIIlIlIlI() {
        lIlIllIIIlIlI = new String[lIlIllIIIlIll[2]];
        n.lIlIllIIIlIlI[n.lIlIllIIIlIll[0]] = n."Banking failed 5 times in a row, stopping";
    }

    private static boolean llIIIIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIIIlIlIll() {
        lIlIllIIIlIll = new int[3];
        n.lIlIllIIIlIll[0] = (0x4B ^ 0x2B) & ~(0xDC ^ 0xBC);
        n.lIlIllIIIlIll[1] = 82 + 14 - 51 + 122 ^ 128 + 122 - 102 + 14;
        n.lIlIllIIIlIll[2] = 1;
    }

    private static boolean llIIIIIIIlIllII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean Q() {
        n var3;
        if (n.llIIIIIIIlIllII(this.R() ? 1 : 0)) {
            return lIlIllIIIlIll[0];
        }
        if (n.llIIIIIIIlIllII(var3.T().needsToBank() ? 1 : 0)) {
            Bank.close();
            return lIlIllIIIlIll[0];
        }
        if (n.llIIIIIIIlIllII(BankLoadouts.withdrawWithRetries((BankLoadout)var3.T(), (int)lIlIllIIIlIll[1]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIllIIIlIlI[lIlIllIIIlIll[0]]);
            return lIlIllIIIlIll[0];
        }
        return lIlIllIIIlIll[2];
    }

    @Inject
    protected n(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        n.llIIIIIIIlIlIll();
        n.llIIIIIIIlIlIlI();
    }
}

