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
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

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
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.i;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class l
extends i {
    private static /* synthetic */ String[] lIIlIllIllllI;
    private static /* synthetic */ int[] lIIlIllIlllll;

    static {
        l.lIlIllIllIIIIII();
        l.lIlIllIlIllllll();
    }

    private static String lIlIllIlIllllIl(String llllllllllllllIllllIlIIlIlIIlllI, String llllllllllllllIllllIlIIlIlIIllIl) {
        llllllllllllllIllllIlIIlIlIIlllI = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIlIlIIllII = new StringBuilder();
        char[] llllllllllllllIllllIlIIlIlIIlIll = llllllllllllllIllllIlIIlIlIIllIl.toCharArray();
        int llllllllllllllIllllIlIIlIlIIlIlI = lIIlIllIlllll[0];
        char[] llllllllllllllIllllIlIIlIlIIIlII = llllllllllllllIllllIlIIlIlIIlllI.toCharArray();
        int llllllllllllllIllllIlIIlIlIIIIll = llllllllllllllIllllIlIIlIlIIIlII.length;
        int llllllllllllllIllllIlIIlIlIIIIlI = lIIlIllIlllll[0];
        while (l.lIlIllIllIIIIll(llllllllllllllIllllIlIIlIlIIIIlI, llllllllllllllIllllIlIIlIlIIIIll)) {
            char llllllllllllllIllllIlIIlIlIIllll = llllllllllllllIllllIlIIlIlIIIlII[llllllllllllllIllllIlIIlIlIIIIlI];
            llllllllllllllIllllIlIIlIlIIllII.append((char)(llllllllllllllIllllIlIIlIlIIllll ^ llllllllllllllIllllIlIIlIlIIlIll[llllllllllllllIllllIlIIlIlIIlIlI % llllllllllllllIllllIlIIlIlIIlIll.length]));
            0;
            ++llllllllllllllIllllIlIIlIlIIlIlI;
            ++llllllllllllllIllllIlIIlIlIIIIlI;
            0;
            if (((0xE4 ^ 0xB9) & ~(0xCA ^ 0x97)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIIlIlIIllII);
    }

    private static boolean lIlIllIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlIllllll() {
        lIIlIllIllllI = new String[lIIlIllIlllll[3]];
        l.lIIlIllIllllI[l.lIIlIllIlllll[0]] = l."No bank loadout selected";
        l.lIIlIllIllllI[l.lIIlIllIlllll[2]] = l."Banking failed 5 times in a row, stopping";
    }

    private static void lIlIllIllIIIIII() {
        lIIlIllIlllll = new int[5];
        l.lIIlIllIlllll[0] = (69 + 187 - 223 + 220 ^ 76 + 122 - 112 + 75) & (3 + 181 - 144 + 195 ^ 160 + 17 - 23 + 29 ^ -1);
        l.lIIlIllIlllll[1] = 0xB2 ^ 0xB7;
        l.lIIlIllIlllll[2] = 1;
        l.lIIlIllIlllll[3] = 2;
        l.lIIlIllIlllll[4] = 0x14 ^ 0x1C;
    }

    private static String lIlIllIlIlllllI(String llllllllllllllIllllIlIIlIIllIlll, String llllllllllllllIllllIlIIlIIlllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIlIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIlIIlllIII.getBytes(StandardCharsets.UTF_8)), lIIlIllIlllll[4]), "DES");
            Cipher llllllllllllllIllllIlIIlIIlllIll = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIlIIlllIll.init(lIIlIllIlllll[3], llllllllllllllIllllIlIIlIIllllII);
            return new String(llllllllllllllIllllIlIIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIlIIlllIlI) {
            llllllllllllllIllllIlIIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean a() {
        l llllllllllllllIllllIlIIlIlIllIIl;
        if (l.lIlIllIllIIIIIl(this.s() ? 1 : 0)) {
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIlI(llllllllllllllIllllIlIIlIlIllIIl.t())) {
            Log.error((String)lIIlIllIllllI[lIIlIllIlllll[0]]);
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIIl(llllllllllllllIllllIlIIlIlIllIIl.t().needsToBank() ? 1 : 0)) {
            llllllllllllllIllllIlIIlIlIllIIl.a.e(lIIlIllIlllll[0]);
            Bank.close();
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIIl(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllIllllIlIIlIlIllIIl.t(), (int)lIIlIllIlllll[1]).booleanValue() ? 1 : 0)) {
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

