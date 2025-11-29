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

@TaskDesc(name="Using Bankloadout", priority=80, blocking=true)
public class n
extends o {
    private static /* synthetic */ int[] lIlIllIIIlIll;
    private static /* synthetic */ String[] lIlIllIIIlIlI;

    private static String llIIIIIIIlIlIIl(String llllllllllllllIllIlIIllIlIlllllI, String llllllllllllllIllIlIIllIlIllllIl) {
        llllllllllllllIllIlIIllIlIlllllI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIllIllIIIIIl = new StringBuilder();
        char[] llllllllllllllIllIlIIllIllIIIIII = llllllllllllllIllIlIIllIlIllllIl.toCharArray();
        int llllllllllllllIllIlIIllIlIllllll = lIlIllIIIlIll[0];
        char[] llllllllllllllIllIlIIllIlIlllIIl = llllllllllllllIllIlIIllIlIlllllI.toCharArray();
        int llllllllllllllIllIlIIllIlIlllIII = llllllllllllllIllIlIIllIlIlllIIl.length;
        int llllllllllllllIllIlIIllIlIllIlll = lIlIllIIIlIll[0];
        while (n.llIIIIIIIlIllIl(llllllllllllllIllIlIIllIlIllIlll, llllllllllllllIllIlIIllIlIlllIII)) {
            char llllllllllllllIllIlIIllIllIIIlII = llllllllllllllIllIlIIllIlIlllIIl[llllllllllllllIllIlIIllIlIllIlll];
            llllllllllllllIllIlIIllIllIIIIIl.append((char)(llllllllllllllIllIlIIllIllIIIlII ^ llllllllllllllIllIlIIllIllIIIIII[llllllllllllllIllIlIIllIlIllllll % llllllllllllllIllIlIIllIllIIIIII.length]));
            0;
            ++llllllllllllllIllIlIIllIlIllllll;
            ++llllllllllllllIllIlIIllIlIllIlll;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIllIllIIIIIl);
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
        n llllllllllllllIllIlIIllIllIIlllI;
        if (n.llIIIIIIIlIllII(this.R() ? 1 : 0)) {
            return lIlIllIIIlIll[0];
        }
        if (n.llIIIIIIIlIllII(llllllllllllllIllIlIIllIllIIlllI.T().needsToBank() ? 1 : 0)) {
            Bank.close();
            return lIlIllIIIlIll[0];
        }
        if (n.llIIIIIIIlIllII(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllIllIlIIllIllIIlllI.T(), (int)lIlIllIIIlIll[1]).booleanValue() ? 1 : 0)) {
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

