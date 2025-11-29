/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Dropping empty vials -> DroppingemptyvialsTask */
@TaskDesc(name="Dropping empty vials", priority=15)
public class DroppingEmptyVialsTask
extends Task {
    private static /* synthetic */ String[] lIlIllIlIlIlI;
    private static /* synthetic */ int[] lIlIllIlIlIll;

    static {
        x.llIIIIIlIllIIII();
        x.llIIIIIlIlIllll();
    }

    private static boolean llIIIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIlIlIllll() {
        lIlIllIlIlIlI = new String[lIlIllIlIlIll[2]];
        x.lIlIllIlIlIlI[x.lIlIllIlIlIll[1]] = x."Vial";
        x.lIlIllIlIlIlI[x.lIlIllIlIlIll[0]] = x."Drop";
    }

    private static String llIIIIIlIlIllIl(String var10, String var2) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var6 = var2.toCharArray();
        int var7 = lIlIllIlIlIll[1];
        char[] var9 = var10.toCharArray();
        int var13 = var9.length;
        int var14 = lIlIllIlIlIll[1];
        while (x.llIIIIIlIllIIlI(var14, var13)) {
            char var4 = var9[var14];
            var8.append((char)(var4 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var14;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void llIIIIIlIllIIII() {
        lIlIllIlIlIll = new int[4];
        x.lIlIllIlIlIll[0] = 1;
        x.lIlIllIlIlIll[1] = (0xA0 ^ 0x94 ^ (0x80 ^ 0xA9)) & (0xF5 ^ 0x8E ^ (0x31 ^ 0x57) ^ -1);
        x.lIlIllIlIlIll[2] = 2;
        x.lIlIllIlIlIll[3] = 0xA3 ^ 0xAB;
    }

    public boolean run() {
        String[] stringArray = new String[lIlIllIlIlIll[0]];
        stringArray[x.lIlIllIlIlIll[1]] = lIlIllIlIlIlI[lIlIllIlIlIll[1]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (x.llIIIIIlIllIIIl(item)) {
            return lIlIllIlIlIll[1];
        }
        item.interact(lIlIllIlIlIlI[lIlIllIlIlIll[0]]);
        return lIlIllIlIlIll[0];
    }

    private static boolean llIIIIIlIllIIIl(Object object) {
        return object == null;
    }

    private static String llIIIIIlIlIlllI(String var3, String var11) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIll[3]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIllIlIlIll[2], var12);
            return new String(var5.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

