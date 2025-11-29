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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.E;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Banking", priority=10, blocking=true)
public class D
extends E {
    private static /* synthetic */ int[] lIllIlIIlIIll;
    private static /* synthetic */ String[] lIllIlIIlIIlI;

    private static boolean llIIIllllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIllllIIlllI() {
        lIllIlIIlIIlI = new String[lIllIlIIlIIll[1]];
        D.lIllIlIIlIIlI[D.lIllIlIIlIIll[0]] = D."Banking failed 5 times in a row, stopping";
    }

    private static void llIIIllllIIllll() {
        lIllIlIIlIIll = new int[4];
        D.lIllIlIIlIIll[0] = (200 + 158 - 333 + 178 ^ 50 + 139 - 43 + 52) & (0x21 ^ 6 ^ (0x45 ^ 0x6F) ^ -1);
        D.lIllIlIIlIIll[1] = 1;
        D.lIllIlIIlIIll[2] = 0x5B ^ 0x5E;
        D.lIllIlIIlIIll[3] = 2;
    }

    private static String llIIIllllIIllIl(String llllllllllllllIllIIIllllIIIlIIII, String llllllllllllllIllIIIllllIIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllllIIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllllIIIlIlII.init(lIllIlIIlIIll[3], llllllllllllllIllIIIllllIIIlIlIl);
            return new String(llllllllllllllIllIIIllllIIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllllIIIlIIll) {
            llllllllllllllIllIIIllllIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllllIlIIII(int n2) {
        return n2 == 0;
    }

    static {
        D.llIIIllllIIllll();
        D.llIIIllllIIlllI();
    }

    @Override
    public boolean ac() {
        D llllllllllllllIllIIIllllIIIllIlI;
        if (D.llIIIllllIlIIII(this.ae().needsToBank() ? 1 : 0)) {
            Bank.close();
            return lIllIlIIlIIll[0];
        }
        if (D.llIIIllllIlIIIl(llllllllllllllIllIIIllllIIIllIlI.Y.a(llllllllllllllIllIIIllllIIIllIlI.Y.O()) ? 1 : 0)) {
            return lIllIlIIlIIll[1];
        }
        if (D.llIIIllllIlIIIl(llllllllllllllIllIIIllllIIIllIlI.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIlIIll[0];
        }
        if (D.llIIIllllIlIIII(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllIllIIIllllIIIllIlI.ae(), (int)lIllIlIIlIIll[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIllIlIIlIIlI[lIllIlIIlIIll[0]]);
            return lIllIlIIlIIll[0];
        }
        this.sleep(lIllIlIIlIIll[3]);
        return lIllIlIIlIIll[1];
    }

    @Inject
    protected D(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }
}

