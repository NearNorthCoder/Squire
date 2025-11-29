/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import i.i.b.s.c.q.r.s.s.-.u.a.e.p;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=1337, blocking=true)
public class o
extends p {
    private static /* synthetic */ int[] lIIlIIIlI;
    private static /* synthetic */ String[] lIIlIIIIl;

    static {
        o.lllllIllII();
        o.lllllIlIll();
    }

    @Inject
    public o(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        super(squireCerberus, squireCerberusConfig, a2);
    }

    private static void lllllIlIll() {
        lIIlIIIIl = new String[lIIlIIIlI[4]];
        o.lIIlIIIIl[o.lIIlIIIlI[0]] = o."We don't need to bank";
        o.lIIlIIIIl[o.lIIlIIIlI[1]] = o."Pin window is open... waiting";
        o.lIIlIIIIl[o.lIIlIIIlI[3]] = o."After 5 tries, still not equipping the right stuff";
    }

    private static boolean lllllIllIl(int n2) {
        return n2 == 0;
    }

    private static String lllllIlIII(String llIIlIIllIllIII, String llIIlIIllIlIlll) {
        try {
            SecretKeySpec llIIlIIllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIllIllIlI = Cipher.getInstance("Blowfish");
            llIIlIIllIllIlI.init(lIIlIIIlI[3], llIIlIIllIllIll);
            return new String(llIIlIIllIllIlI.doFinal(Base64.getDecoder().decode(llIIlIIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIllIllIIl) {
            llIIlIIllIllIIl.printStackTrace();
            return null;
        }
    }

    private static void lllllIllII() {
        lIIlIIIlI = new int[6];
        o.lIIlIIIlI[0] = (0xF2 ^ 0xA2 ^ (0x76 ^ 0x12)) & (81 + 145 - 146 + 111 ^ 5 + 134 - 40 + 40 ^ -1);
        o.lIIlIIIlI[1] = 1;
        o.lIIlIIIlI[2] = 0x31 ^ 0x51 ^ (0xCE ^ 0xAB);
        o.lIIlIIIlI[3] = 2;
        o.lIIlIIIlI[4] = 3;
        o.lIIlIIIlI[5] = 0x6E ^ 0x66;
    }

    private static boolean lllllIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean V() {
        void llIIlIIlllIllIl;
        BankLoadout bankLoadout = (BankLoadout)this.av.bankLoadout().selected(BankLoadout.class);
        if (o.lllllIllIl(bankLoadout.needsToBank() ? 1 : 0)) {
            Log.info((String)lIIlIIIIl[lIIlIIIlI[0]]);
            this.at.b(lIIlIIIlI[0]);
            return lIIlIIIlI[0];
        }
        if (o.lllllIlllI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)lIIlIIIIl[lIIlIIIlI[1]]);
            return lIIlIIIlI[0];
        }
        if (o.lllllIllIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lIIlIIIlI[1];
        }
        if (o.lllllIllIl(BankLoadouts.withdrawWithRetries((BankLoadout)llIIlIIlllIllIl, (int)lIIlIIIlI[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIIlIIIIl[lIIlIIIlI[3]]);
            return lIIlIIIlI[0];
        }
        return lIIlIIIlI[0];
    }

    private static String lllllIlIlI(String llIIlIIlllIIlIl, String llIIlIIlllIIlII) {
        try {
            SecretKeySpec llIIlIIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlllIIlII.getBytes(StandardCharsets.UTF_8)), lIIlIIIlI[5]), "DES");
            Cipher llIIlIIlllIIlll = Cipher.getInstance("DES");
            llIIlIIlllIIlll.init(lIIlIIIlI[3], llIIlIIlllIlIII);
            return new String(llIIlIIlllIIlll.doFinal(Base64.getDecoder().decode(llIIlIIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIlllIIllI) {
            llIIlIIlllIIllI.printStackTrace();
            return null;
        }
    }
}

