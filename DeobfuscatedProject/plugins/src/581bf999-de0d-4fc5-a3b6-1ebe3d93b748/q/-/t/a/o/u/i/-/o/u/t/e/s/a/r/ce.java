/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

@TaskDesc(name="Banking to go back in", priority=10, blocking=true)
public class ce
extends ck {
    private static /* synthetic */ int[] llIIIllIIII;
    private static /* synthetic */ String[] llIIIlIllll;

    private static void lIIllllIlIlIII() {
        llIIIllIIII = new int[7];
        ce.llIIIllIIII[0] = (0x1E ^ 0x21 ^ (0x4D ^ 0x40)) & (0xCD ^ 0xBC ^ (0x61 ^ 0x22) ^ -" ".length());
        ce.llIIIllIIII[1] = " ".length();
        ce.llIIIllIIII[2] = "  ".length();
        ce.llIIIllIIII[3] = "   ".length();
        ce.llIIIllIIII[4] = 0x86 ^ 0x94 ^ (0x75 ^ 0x62);
        ce.llIIIllIIII[5] = 0x3B ^ 0x3F;
        ce.llIIIllIIII[6] = 0x6B ^ 0x63;
    }

    private static String lIIllllIlIIllI(String llllllllllllllllIlIIIlIIIIIIIllI, String llllllllllllllllIlIIIlIIIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIIIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), llIIIllIIII[6]), "DES");
            Cipher llllllllllllllllIlIIIlIIIIIIlIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlIIIIIIlIII.init(llIIIllIIII[2], llllllllllllllllIlIIIlIIIIIIlIIl);
            return new String(llllllllllllllllIlIIIlIIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlIIIIIIIlll) {
            llllllllllllllllIlIIIlIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIlIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void llllllllllllllllIlIIIlIIIIlIIlll;
        BankLoadout bankLoadout = (BankLoadout)this.hY.loadout().selected(BankLoadout.class);
        if (ce.lIIllllIlIlIIl(bankLoadout.needsToBank() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[0]]);
            return llIIIllIIII[0];
        }
        if (ce.lIIllllIlIlIlI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[1]]);
            return llIIIllIIII[0];
        }
        if (ce.lIIllllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIIIllIIII[1]];
            stringArray[ce.llIIIllIIII[0]] = llIIIlIllll[llIIIllIIII[2]];
            TileObject llllllllllllllllIlIIIlIIIIlIIllI = TileObjects.getNearest((String[])stringArray);
            if (ce.lIIllllIlIlIll(llllllllllllllllIlIIIlIIIIlIIllI)) {
                return llIIIllIIII[0];
            }
            llllllllllllllllIlIIIlIIIIlIIllI.interact(llIIIlIllll[llIIIllIIII[3]]);
            return llIIIllIIII[1];
        }
        if (ce.lIIllllIlIlIIl(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllllIlIIIlIIIIlIIlll, (int)llIIIllIIII[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[5]]);
            return llIIIllIIII[0];
        }
        return llIIIllIIII[1];
    }

    private static String lIIllllIlIIlIl(String llllllllllllllllIlIIIlIIIIIllIll, String llllllllllllllllIlIIIlIIIIIllIlI) {
        llllllllllllllllIlIIIlIIIIIllIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlIIIIIllIIl = new StringBuilder();
        char[] llllllllllllllllIlIIIlIIIIIllIII = llllllllllllllllIlIIIlIIIIIllIlI.toCharArray();
        int llllllllllllllllIlIIIlIIIIIlIlll = llIIIllIIII[0];
        char[] llllllllllllllllIlIIIlIIIIIlIIIl = llllllllllllllllIlIIIlIIIIIllIll.toCharArray();
        int llllllllllllllllIlIIIlIIIIIlIIII = llllllllllllllllIlIIIlIIIIIlIIIl.length;
        int llllllllllllllllIlIIIlIIIIIIllll = llIIIllIIII[0];
        while (ce.lIIllllIlIllII(llllllllllllllllIlIIIlIIIIIIllll, llllllllllllllllIlIIIlIIIIIlIIII)) {
            char llllllllllllllllIlIIIlIIIIIlllII = llllllllllllllllIlIIIlIIIIIlIIIl[llllllllllllllllIlIIIlIIIIIIllll];
            llllllllllllllllIlIIIlIIIIIllIIl.append((char)(llllllllllllllllIlIIIlIIIIIlllII ^ llllllllllllllllIlIIIlIIIIIllIII[llllllllllllllllIlIIIlIIIIIlIlll % llllllllllllllllIlIIIlIIIIIllIII.length]));
            "".length();
            ++llllllllllllllllIlIIIlIIIIIlIlll;
            ++llllllllllllllllIlIIIlIIIIIIllll;
            "".length();
            if (((3 + 72 - -6 + 120 ^ 125 + 98 - 172 + 83) & (0x89 ^ 0x8D ^ (0x13 ^ 0x58) ^ -" ".length())) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIlIIIIIllIIl);
    }

    private static void lIIllllIlIIlll() {
        llIIIlIllll = new String[llIIIllIIII[4]];
        ce.llIIIlIllll[ce.llIIIllIIII[0]] = ce.lIIllllIlIIlIl("MCcsFi4tCj8xMQ4IPiVlPABtHCoFQjlYKw4AKVgxBEUvGSsA", "keMxE");
        ce.llIIIlIllll[ce.llIIIllIIII[1]] = ce.lIIllllIlIIllI("6rfNnrbya+DF2OpPx9SKpUzOHrwz4IduVTctTcnK4s3sJT0D4zQubyJ3RBmUX4MT", "JUKYK");
        ce.llIIIlIllll[ce.llIIIllIIII[2]] = ce.lIIllllIlIIlIl("DSsXPWUMKxQzKQ==", "OJyVE");
        ce.llIIIlIllll[ce.llIIIllIIII[3]] = ce.lIIllllIlIIllI("DjGSMTy5B9U=", "XQsLN");
        ce.llIIIlIllll[ce.llIIIllIIII[5]] = ce.lIIllllIlIIlIl("CBsXIikVNgQFNjY0BRFiEj8CKTBzbFY4MDo8BWBiIC0fIC5zNxk4YjYoAyUyIzAYK2InMRNsMDo+HjhiIC0DKiQ=", "SYvLB");
    }

    private static boolean lIIllllIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlIlIIl(int n2) {
        return n2 == 0;
    }

    static {
        ce.lIIllllIlIlIII();
        ce.lIIllllIlIIlll();
    }

    @Inject
    protected ce(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIIllllIlIllII(int n2, int n3) {
        return n2 < n3;
    }
}

