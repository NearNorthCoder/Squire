/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Dialog
 */
package i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Getting bird -> GettingbirdTask */
@TaskDesc(name="Getting bird", priority=6, blocking=true)
public class GettingBirdTask
extends Task {
    private static /* synthetic */ String[] lIlIllIIlll;
    private static /* synthetic */ int[] lIlIllIlIII;

    private static String lIIlIIllIllllI(String var14, String var4) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIllIlIII[3], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIlllll(String var12, String var10) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var8 = var10.toCharArray();
        int var6 = lIlIllIlIII[1];
        char[] var11 = var12.toCharArray();
        int var15 = var11.length;
        int var9 = lIlIllIlIII[1];
        while (d.lIIlIIlllIIlII(var9, var15)) {
            char var5 = var11[var9];
            var2.append((char)(var5 ^ var8[var6 % var8.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (((0xD2 ^ 0x86) & ~(0xEB ^ 0xBF)) == 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static void lIIlIIlllIIIIl() {
        lIlIllIlIII = new int[4];
        d.lIlIllIlIII[0] = 1;
        d.lIlIllIlIII[1] = (0x95 ^ 0x9A ^ (0xF9 ^ 0xA4)) & (73 + 23 - -126 + 2 ^ 172 + 99 - 144 + 51 ^ -1);
        d.lIlIllIlIII[2] = 0xFFFFF35B & 0x2DED;
        d.lIlIllIlIII[3] = 2;
    }

    private static boolean lIIlIIlllIIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIIlllIIIlI(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        String[] stringArray = new String[lIlIllIlIII[0]];
        stringArray[d.lIlIllIlIII[1]] = lIlIllIIlll[lIlIllIlIII[1]];
        if (d.lIIlIIlllIIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            return lIlIllIlIII[1];
        }
        if (d.lIIlIIlllIIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIllIlIII[0];
        }
        int[] nArray = new int[lIlIllIlIII[0]];
        nArray[d.lIlIllIlIII[1]] = lIlIllIlIII[2];
        NPC var13 = NPCs.getNearest((int[])nArray);
        if (d.lIIlIIlllIIIll(var13)) {
            return lIlIllIlIII[1];
        }
        var1_1.interact(lIlIllIIlll[lIlIllIlIII[0]]);
        return lIlIllIlIII[0];
    }

    private static boolean lIIlIIlllIIIll(Object object) {
        return object == null;
    }

    static {
        d.lIIlIIlllIIIIl();
        d.lIIlIIlllIIIII();
    }

    private static void lIIlIIlllIIIII() {
        lIlIllIIlll = new String[lIlIllIlIII[3]];
        d.lIlIllIIlll[d.lIlIllIlIII[1]] = d."Cormorant's glove";
        d.lIlIllIIlll[d.lIlIllIlIII[0]] = d."Get bird";
    }
}

