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

    private static String llIIIIlIlIlIllI(String llllllllllllllIllIIllllIlllIIIII, String llllllllllllllIllIIllllIllIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIlllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllIlllIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllIlllIIlII.init(lIlIllllIIIIl[3], llllllllllllllIllIIllllIlllIIlIl);
            return new String(llllllllllllllIllIIllllIlllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllIlllIIIll) {
            llllllllllllllIllIIllllIlllIIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean p() {
        m llllllllllllllIllIIllllIlllllIII;
        if (m.llIIIIlIlIllIIl(this.n() ? 1 : 0)) {
            return lIlIllllIIIIl[0];
        }
        BankLoadout llllllllllllllIllIIllllIllllIlll = llllllllllllllIllIIllllIlllllIII.o();
        if (m.llIIIIlIlIllIlI(llllllllllllllIllIIllllIllllIlll)) {
            Log.error((String)lIlIllllIIIII[lIlIllllIIIIl[0]]);
            return lIlIllllIIIIl[0];
        }
        Object[] objectArray = new Object[lIlIllllIIIIl[1]];
        objectArray[m.lIlIllllIIIIl[0]] = llllllllllllllIllIIllllIllllIlll.needsToBank();
        Log.info((String)lIlIllllIIIII[lIlIllllIIIIl[1]], (Object[])objectArray);
        if (m.llIIIIlIlIllIIl(llllllllllllllIllIIllllIllllIlll.needsToBank() ? 1 : 0)) {
            llllllllllllllIllIIllllIlllllIII.f.a(lIlIllllIIIIl[0]);
            return lIlIllllIIIIl[0];
        }
        if (m.llIIIIlIlIllIIl(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllIllIIllllIllllIlll, (int)lIlIllllIIIIl[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIllllIIIII[lIlIllllIIIIl[3]]);
            llllllllllllllIllIIllllIlllllIII.sleep(lIlIllllIIIIl[2]);
            return lIlIllllIIIIl[0];
        }
        return lIlIllllIIIIl[0];
    }

    private static String llIIIIlIlIlIlIl(String llllllllllllllIllIIllllIlllIllIl, String llllllllllllllIllIIllllIlllIllII) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIlllIllII.getBytes(StandardCharsets.UTF_8)), lIlIllllIIIIl[5]), "DES");
            Cipher llllllllllllllIllIIllllIllllIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIllllIllllIIIl.init(lIlIllllIIIIl[3], llllllllllllllIllIIllllIllllIIlI);
            return new String(llllllllllllllIllIIllllIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllIllllIIII) {
            llllllllllllllIllIIllllIllllIIII.printStackTrace();
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

