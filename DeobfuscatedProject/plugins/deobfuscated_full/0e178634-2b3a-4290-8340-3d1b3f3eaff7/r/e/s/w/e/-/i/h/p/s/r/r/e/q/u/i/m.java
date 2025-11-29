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
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i;

/* TASK: Withdrawing items -> WithdrawingitemsTask */
@TaskDesc(name="Withdrawing items")
public class m
extends i {
    @Inject
    private /* synthetic */ SquireWhisperer Q;
    private static /* synthetic */ int[] lIlIllllIIIIl;
    private /* synthetic */ int R;
    private /* synthetic */ CompletableFuture<Boolean> S;
    private static /* synthetic */ String[] lIlIllllIIIII;

    static {
        m.llIIIIlIlIllIII();
        m.llIIIIlIlIlIlll();
    }

    private static String llIIIIlIlIlIllI(String var12, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIllllIIIIl[3], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean p() {
        m var10;
        if (m.llIIIIlIlIllIIl(this.n() ? 1 : 0)) {
            return lIlIllllIIIIl[0];
        }
        BankLoadout var9 = var10.o();
        if (m.llIIIIlIlIllIlI(var9)) {
            Log.error((String)lIlIllllIIIII[lIlIllllIIIIl[0]]);
            return lIlIllllIIIIl[0];
        }
        Object[] objectArray = new Object[lIlIllllIIIIl[1]];
        objectArray[m.lIlIllllIIIIl[0]] = var9.needsToBank();
        Log.info((String)lIlIllllIIIII[lIlIllllIIIIl[1]], (Object[])objectArray);
        if (m.llIIIIlIlIllIIl(var9.needsToBank() ? 1 : 0)) {
            var10.f.a(lIlIllllIIIIl[0]);
            return lIlIllllIIIIl[0];
        }
        if (m.llIIIIlIlIllIIl(BankLoadouts.withdrawWithRetries((BankLoadout)var9, (int)lIlIllllIIIIl[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIllllIIIII[lIlIllllIIIIl[3]]);
            var10.sleep(lIlIllllIIIIl[2]);
            return lIlIllllIIIIl[0];
        }
        return lIlIllllIIIIl[0];
    }

    private static String llIIIIlIlIlIlIl(String var7, String var5) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIllllIIIIl[5]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlIllllIIIIl[3], var3);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlIllIIl(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlIlIlIlll() {
        lIlIllllIIIII = new String[lIlIllllIIIIl[4]];
        m.lIlIllllIIIII[m.lIlIllllIIIIl[0]] = m."No bank loadout selected";
        m.lIlIllllIIIII[m.lIlIllllIIIIl[1]] = m."Need to bank: {}";
        m.lIlIllllIIIII[m.lIlIllllIIIIl[3]] = m."Failed to withdraw loadout after 5 tries, pausing for 5 ticks";
    }

    private static void llIIIIlIlIllIII() {
        lIlIllllIIIIl = new int[6];
        m.lIlIllllIIIIl[0] = (0x49 ^ 0x46 ^ (0x3E ^ 8)) & (76 + 10 - 24 + 87 ^ 20 + 6 - -11 + 135 ^ -1);
        m.lIlIllllIIIIl[1] = 1;
        m.lIlIllllIIIIl[2] = 0x7E ^ 0x7B;
        m.lIlIllllIIIIl[3] = 2;
        m.lIlIllllIIIIl[4] = 3;
        m.lIlIllllIIIIl[5] = 0xBF ^ 0xB3 ^ (0x22 ^ 0x26);
    }

    public m() {
        this.S = null;
    }

    private static boolean llIIIIlIlIllIlI(Object object) {
        return object == null;
    }
}

