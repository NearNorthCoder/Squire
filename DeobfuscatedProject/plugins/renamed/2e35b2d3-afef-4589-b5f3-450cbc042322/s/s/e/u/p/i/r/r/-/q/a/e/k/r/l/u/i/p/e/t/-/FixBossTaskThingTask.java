/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.unethicalite.api.widgets.Dialog
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Fix Boss Task Thing -> FixbosstaskthingTask */
@TaskDesc(name="Fix Boss Task Thing", priority=10, blocking=true)
public class FixBossTaskThingTask
extends Task {
    private static /* synthetic */ int[] lIlIIlIIlIllI;
    private static /* synthetic */ String[] lIlIIlIIlIlII;

    static {
        i.lIlllIlIlIIIIlI();
        i.lIlllIlIIlllllI();
    }

    private static void lIlllIlIIlllllI() {
        lIlIIlIIlIlII = new String[lIlIIlIIlIllI[5]];
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[0]] = i."I've got a boss assignment";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[1]] = i."Fixing boss task";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[2]] = i."Oh yes,";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[3]] = i."Fixing boss task";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[4]] = i."Fixing boss task";
    }

    private static void lIlllIlIlIIIIlI() {
        lIlIIlIIlIllI = new int[7];
        i.lIlIIlIIlIllI[0] = (0x29 ^ 0x69 ^ (0xC7 ^ 0xA2)) & (0x23 ^ 0x6F ^ (0xEE ^ 0x87) ^ -1);
        i.lIlIIlIIlIllI[1] = 1;
        i.lIlIIlIIlIllI[2] = 2;
        i.lIlIIlIIlIllI[3] = 3;
        i.lIlIIlIIlIllI[4] = 51 + 99 - 63 + 79 ^ 57 + 1 - 0 + 104;
        i.lIlIIlIIlIllI[5] = 0x46 ^ 0x43;
        i.lIlIIlIIlIllI[6] = 0xBB ^ 0xB3;
    }

    private static boolean lIlllIlIlIIIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (i.lIlllIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
            return lIlIIlIIlIllI[0];
        }
        if (i.lIlllIlIlIIIlII(Dialog.getText().contains(lIlIIlIIlIlII[lIlIIlIIlIllI[0]]) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlII[lIlIIlIIlIllI[1]]);
            Dialog.continueSpace();
            return lIlIIlIIlIllI[1];
        }
        if (i.lIlllIlIlIIIlII(Dialog.getText().contains(lIlIIlIIlIlII[lIlIIlIIlIllI[2]]) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlII[lIlIIlIIlIllI[3]]);
            Dialog.continueSpace();
            return lIlIIlIIlIllI[1];
        }
        if (i.lIlllIlIlIIIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlII[lIlIIlIIlIllI[4]]);
            Dialog.enterAmount((int)lIlIIlIIlIllI[5]);
            return lIlIIlIIlIllI[1];
        }
        return lIlIIlIIlIllI[0];
    }

    @Inject
    public i() {
    }

    private static boolean lIlllIlIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static String lIlllIlIIlllIll(String var18, String var12) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIllI[6]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIlIIlIIlIllI[2], var6);
            return new String(var16.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIIllllIl(String var7, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlIIlIIlIllI[2], var10);
            return new String(var19.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIIllllII(String var14, String var11) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var9 = var11.toCharArray();
        int var15 = lIlIIlIIlIllI[0];
        char[] var4 = var14.toCharArray();
        int var3 = var4.length;
        int var13 = lIlIIlIIlIllI[0];
        while (i.lIlllIlIlIIIlIl(var13, var3)) {
            char var8 = var4[var13];
            var17.append((char)(var8 ^ var9[var15 % var9.length]));
            0;
            ++var15;
            ++var13;
            0;
            if (((18 + 21 - -47 + 163 ^ 88 + 91 - 26 + 16) & (196 + 100 - 242 + 197 ^ 138 + 142 - 161 + 52 ^ -1)) <= (98 + 41 - 48 + 62 ^ 37 + 75 - 87 + 132)) continue;
            return null;
        }
        return String.valueOf(var17);
    }
}

