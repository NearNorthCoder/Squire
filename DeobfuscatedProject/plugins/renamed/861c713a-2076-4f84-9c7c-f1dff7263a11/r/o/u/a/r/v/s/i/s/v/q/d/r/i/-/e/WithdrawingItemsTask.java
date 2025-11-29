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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q_Unknown;

/* TASK: Withdrawing items -> WithdrawingitemsTask */
@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class WithdrawingItemsTask
extends q_Unknown {
    private static /* synthetic */ int[] lIlIlIIIIllIl;
    private static /* synthetic */ String[] lIlIlIIIIllII;

    private static void lIllllIlIIlIIlI() {
        lIlIlIIIIllII = new String[lIlIlIIIIllIl[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllII[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask."No bank loadout selected";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllII[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask."Banking failed 5 times in a row, stopping";
    }

    private static boolean lIllllIlIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIIlIlIl(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        t var6;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIlII(this.P() ? 1 : 0)) {
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIlIl(var6.Q())) {
            Log.error((String)lIlIlIIIIllII[lIlIlIIIIllIl[0]]);
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIlII(var6.Q().needsToBank() ? 1 : 0)) {
            var6.s.c(lIlIlIIIIllIl[0]);
            Bank.close();
            var6.sleep(lIlIlIIIIllIl[1]);
            return lIlIlIIIIllIl[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIlII(BankLoadouts.withdrawWithRetries((BankLoadout)var6.Q(), (int)lIlIlIIIIllIl[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIlIIIIllII[lIlIlIIIIllIl[3]]);
            return lIlIlIIIIllIl[0];
        }
        this.sleep(lIlIlIIIIllIl[4]);
        return lIlIlIIIIllIl[3];
    }

    private static String lIllllIlIIlIIIl(String var15, String var14) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIllIl[5]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIlIIIIllIl[4], var1);
            return new String(var3.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIlIIlIIII(String var9, String var4) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var8 = var4.toCharArray();
        int var2 = lIlIlIIIIllIl[0];
        char[] var10 = var9.toCharArray();
        int var11 = var10.length;
        int var5 = lIlIlIIIIllIl[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIllI(var5, var11)) {
            char var7 = var10[var5];
            var13.append((char)(var7 ^ var8[var2 % var8.length]));
            0;
            ++var2;
            ++var5;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIIll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIllllIlIIlIIlI();
    }

    private static void lIllllIlIIlIIll() {
        lIlIlIIIIllIl = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[0] = (0xB6 ^ 0x8B) & ~(0x94 ^ 0xA9);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[1] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[2] = 0xC2 ^ 0xC7;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[3] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[4] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.WithdrawingItemsTask.lIlIlIIIIllIl[5] = 1 + 86 - 46 + 162 ^ 190 + 122 - 185 + 68;
    }
}

