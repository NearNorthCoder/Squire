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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck_Unknown;

/* TASK: Banking to go back in -> BankingtogobackinTask */
@TaskDesc(name="Banking to go back in", priority=10, blocking=true)
public class BankingToGoBackInTask
extends ck_Unknown {
    private static /* synthetic */ int[] llIIIllIIII;
    private static /* synthetic */ String[] llIIIlIllll;

    private static void lIIllllIlIlIII() {
        llIIIllIIII = new int[7];
        ce.llIIIllIIII[0] = (0x1E ^ 0x21 ^ (0x4D ^ 0x40)) & (0xCD ^ 0xBC ^ (0x61 ^ 0x22) ^ -1);
        ce.llIIIllIIII[1] = 1;
        ce.llIIIllIIII[2] = 2;
        ce.llIIIllIIII[3] = 3;
        ce.llIIIllIIII[4] = 0x86 ^ 0x94 ^ (0x75 ^ 0x62);
        ce.llIIIllIIII[5] = 0x3B ^ 0x3F;
        ce.llIIIllIIII[6] = 0x6B ^ 0x63;
    }

    private static String lIIllllIlIIllI(String var11, String var10) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llIIIllIIII[6]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(llIIIllIIII[2], var1);
            return new String(var15.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
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
        void var12;
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
            TileObject var16 = TileObjects.getNearest((String[])stringArray);
            if (ce.lIIllllIlIlIll(var16)) {
                return llIIIllIIII[0];
            }
            var16.interact(llIIIlIllll[llIIIllIIII[3]]);
            return llIIIllIIII[1];
        }
        if (ce.lIIllllIlIlIIl(BankLoadouts.withdrawWithRetries((BankLoadout)var12, (int)llIIIllIIII[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[5]]);
            return llIIIllIIII[0];
        }
        return llIIIllIIII[1];
    }

    private static String lIIllllIlIIlIl(String var13, String var5) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var6 = var5.toCharArray();
        int var8 = llIIIllIIII[0];
        char[] var4 = var13.toCharArray();
        int var2 = var4.length;
        int var3 = llIIIllIIII[0];
        while (ce.lIIllllIlIllII(var3, var2)) {
            char var7 = var4[var3];
            var9.append((char)(var7 ^ var6[var8 % var6.length]));
            0;
            ++var8;
            ++var3;
            0;
            if (((3 + 72 - -6 + 120 ^ 125 + 98 - 172 + 83) & (0x89 ^ 0x8D ^ (0x13 ^ 0x58) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void lIIllllIlIIlll() {
        llIIIlIllll = new String[llIIIllIIII[4]];
        ce.llIIIlIllll[ce.llIIIllIIII[0]] = ce."[BankForItems] We don't need to bank";
        ce.llIIIlIllll[ce.llIIIllIIII[1]] = ce."[BankForItems] Pin window is open... waiting";
        ce.llIIIlIllll[ce.llIIIllIIII[2]] = ce."Bank Camel";
        ce.llIIIlIllll[ce.llIIIllIIII[3]] = ce."Bank";
        ce.llIIIlIllll[ce.llIIIllIIII[5]] = ce."[BankForItems] After 5 tries, still not equipping the right stuff";
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

