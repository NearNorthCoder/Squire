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
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class t
extends q {
    private static /* synthetic */ int[] lIlIlIIIIllIl;
    private static /* synthetic */ String[] lIlIlIIIIllII;

    private static void lIllllIlIIlIIlI() {
        lIlIlIIIIllII = new String[lIlIlIIIIllIl[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllII[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIIII("PwxTESAfCFMfLhAHHAY1URAWHyQSFxYX", "qcssA");
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllII[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIIIl("R3rv7af9Vgl2eFMa3LG9LuI3LHnjH0lFvJbeXq0ifY/g0oXhC/MPIuZzSfOnGKgJ", "vXtfg");
    }

    private static boolean lIllllIlIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIIlIlIl(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        t llllllllllllllIllIllIIlIIIIlIIll;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlII(this.P() ? 1 : 0)) {
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlIl(llllllllllllllIllIllIIlIIIIlIIll.Q())) {
            Log.error((String)lIlIlIIIIllII[lIlIlIIIIllIl[0]]);
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlII(llllllllllllllIllIllIIlIIIIlIIll.Q().needsToBank() ? 1 : 0)) {
            llllllllllllllIllIllIIlIIIIlIIll.s.c(lIlIlIIIIllIl[0]);
            Bank.close();
            llllllllllllllIllIllIIlIIIIlIIll.sleep(lIlIlIIIIllIl[1]);
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIlII(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllIllIllIIlIIIIlIIll.Q(), (int)lIlIlIIIIllIl[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIlIIIIllII[lIlIlIIIIllIl[3]]);
            return lIlIlIIIIllIl[0];
        }
        this.sleep(lIlIlIIIIllIl[4]);
        return lIlIlIIIIllIl[3];
    }

    private static String lIllllIlIIlIIIl(String llllllllllllllIllIllIIlIIIIIlIIl, String llllllllllllllIllIllIIlIIIIIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIllIl[5]), "DES");
            Cipher llllllllllllllIllIllIIlIIIIIllIl = Cipher.getInstance("DES");
            llllllllllllllIllIllIIlIIIIIllIl.init(lIlIlIIIIllIl[4], llllllllllllllIllIllIIlIIIIIlllI);
            return new String(llllllllllllllIllIllIIlIIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIlIIIIIllII) {
            llllllllllllllIllIllIIlIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIlIIlIIII(String llllllllllllllIllIllIIIllllllIll, String llllllllllllllIllIllIIIlllllIlIl) {
        llllllllllllllIllIllIIIllllllIll = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIIllllllIIl = new StringBuilder();
        char[] llllllllllllllIllIllIIIllllllIII = llllllllllllllIllIllIIIlllllIlIl.toCharArray();
        int llllllllllllllIllIllIIIlllllIlll = lIlIlIIIIllIl[0];
        char[] llllllllllllllIllIllIIIlllllIIIl = llllllllllllllIllIllIIIllllllIll.toCharArray();
        int llllllllllllllIllIllIIIlllllIIII = llllllllllllllIllIllIIIlllllIIIl.length;
        int llllllllllllllIllIllIIIllllIllll = lIlIlIIIIllIl[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIllI(llllllllllllllIllIllIIIllllIllll, llllllllllllllIllIllIIIlllllIIII)) {
            char llllllllllllllIllIllIIIlllllllII = llllllllllllllIllIllIIIlllllIIIl[llllllllllllllIllIllIIIllllIllll];
            llllllllllllllIllIllIIIllllllIIl.append((char)(llllllllllllllIllIllIIIlllllllII ^ llllllllllllllIllIllIIIllllllIII[llllllllllllllIllIllIIIlllllIlll % llllllllllllllIllIllIIIllllllIII.length]));
            "".length();
            ++llllllllllllllIllIllIIIlllllIlll;
            ++llllllllllllllIllIllIIIllllIllll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIllIIIllllllIIl);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIIll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIllllIlIIlIIlI();
    }

    private static void lIllllIlIIlIIll() {
        lIlIlIIIIllIl = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[0] = (0xB6 ^ 0x8B) & ~(0x94 ^ 0xA9);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[1] = "   ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[2] = 0xC2 ^ 0xC7;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[3] = " ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[4] = "  ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.lIlIlIIIIllIl[5] = 1 + 86 - 46 + 162 ^ 190 + 122 - 185 + 68;
    }
}

