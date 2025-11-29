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

/* TASK: Withdrawing items -> WithdrawingitemsTask */
@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class l
extends i {
    private static /* synthetic */ String[] lIIlIllIllllI;
    private static /* synthetic */ int[] lIIlIllIlllll;

    static {
        l.lIlIllIllIIIIII();
        l.lIlIllIlIllllll();
    }

    private static String lIlIllIlIllllIl(String var1, String var11) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var15 = lIIlIllIlllll[0];
        char[] var2 = var1.toCharArray();
        int var12 = var2.length;
        int var4 = lIIlIllIlllll[0];
        while (l.lIlIllIllIIIIll(var4, var12)) {
            char var6 = var2[var4];
            var7.append((char)(var6 ^ var13[var15 % var13.length]));
            0;
            ++var15;
            ++var4;
            0;
            if (((0xE4 ^ 0xB9) & ~(0xCA ^ 0x97)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
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

    private static String lIlIllIlIlllllI(String var3, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIIlIllIlllll[4]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIlIllIlllll[3], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean a() {
        l var5;
        if (l.lIlIllIllIIIIIl(this.s() ? 1 : 0)) {
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIlI(var5.t())) {
            Log.error((String)lIIlIllIllllI[lIIlIllIlllll[0]]);
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIIl(var5.t().needsToBank() ? 1 : 0)) {
            var5.a.e(lIIlIllIlllll[0]);
            Bank.close();
            return lIIlIllIlllll[0];
        }
        if (l.lIlIllIllIIIIIl(BankLoadouts.withdrawWithRetries((BankLoadout)var5.t(), (int)lIIlIllIlllll[1]).booleanValue() ? 1 : 0)) {
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

