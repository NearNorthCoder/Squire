/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Checking state -> CheckingstateTask */
@TaskDesc(name="Checking state", priority=133337, register=true)
public class h
extends Task {
    private static /* synthetic */ String[] lIllIIIlIIIlI;
    private static /* synthetic */ int[] lIllIIIlIIIll;
    private final /* synthetic */ SquireWoodcutterConfig H;
    private final /* synthetic */ SquireWoodcutterPlugin G;

    public boolean run() {
        h var12;
        if (h.llIIIlIIllIIIlI(this.G.g() ? 1 : 0) && h.llIIIlIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
            Log.info((String)lIllIIIlIIIlI[lIllIIIlIIIll[0]]);
            this.G.a(lIllIIIlIIIll[0]);
            Bank.close();
        }
        if (h.llIIIlIIllIIIlI(var12.G.p() ? 1 : 0)) {
            return lIllIIIlIIIll[0];
        }
        if (h.llIIIlIIllIIIlI(Inventory.isFull() ? 1 : 0) && h.llIIIlIIllIIIlI(var12.H.bank() ? 1 : 0)) {
            Log.info((String)lIllIIIlIIIlI[lIllIIIlIIIll[1]]);
            var12.G.a(lIllIIIlIIIll[1]);
            return lIllIIIlIIIll[1];
        }
        if (h.llIIIlIIllIIIll(var12.G.d() ? 1 : 0) && (!h.llIIIlIIllIIIll(var12.H.fastTickChop() ? 1 : 0) || h.llIIIlIIllIIIlI(var12.H.tickChop() ? 1 : 0))) {
            Log.info((String)lIllIIIlIIIlI[lIllIIIlIIIll[2]]);
            var12.G.a(lIllIIIlIIIll[1]);
            return lIllIIIlIIIll[1];
        }
        return lIllIIIlIIIll[0];
    }

    private static boolean llIIIlIIllIIIll(int n) {
        return n == 0;
    }

    @Inject
    public h(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.G = squireWoodcutterPlugin;
        this.H = squireWoodcutterConfig;
    }

    private static String llIIIlIIlIlllll(String var9, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIllIIIlIIIll[2], var4);
            return new String(var11.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIIlIllllI(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var5 = var6.toCharArray();
        int var7 = lIllIIIlIIIll[0];
        char[] var14 = var10.toCharArray();
        int var15 = var14.length;
        int var1 = lIllIIIlIIIll[0];
        while (h.llIIIlIIllIIlII(var1, var15)) {
            char var8 = var14[var1];
            var13.append((char)(var8 ^ var5[var7 % var5.length]));
            0;
            ++var7;
            ++var1;
            0;
            if ((0xA4 ^ 0xA1) != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean llIIIlIIllIIlII(int n, int n2) {
        return n < n2;
    }

    private static void llIIIlIIllIIIIl() {
        lIllIIIlIIIll = new int[4];
        h.lIllIIIlIIIll[0] = (0x48 ^ 0x6C ^ (0x2E ^ 0x55)) & (3 ^ (0x30 ^ 0x6C) ^ -1);
        h.lIllIIIlIIIll[1] = 1;
        h.lIllIIIlIIIll[2] = 2;
        h.lIllIIIlIIIll[3] = 3;
    }

    private static boolean llIIIlIIllIIIlI(int n) {
        return n != 0;
    }

    static {
        h.llIIIlIIllIIIIl();
        h.llIIIlIIllIIIII();
    }

    private static void llIIIlIIllIIIII() {
        lIllIIIlIIIlI = new String[lIllIIIlIIIll[3]];
        h.lIllIIIlIIIlI[h.lIllIIIlIIIll[0]] = h."Done banking, closing bank.";
        h.lIllIIIlIIIlI[h.lIllIIIlIIIll[1]] = h."Inventory is full, going to bank.";
        h.lIllIIIlIIIlI[h.lIllIIIlIIIll[2]] = h."We have lost our tick manipulation items, going to bank.";
    }
}

