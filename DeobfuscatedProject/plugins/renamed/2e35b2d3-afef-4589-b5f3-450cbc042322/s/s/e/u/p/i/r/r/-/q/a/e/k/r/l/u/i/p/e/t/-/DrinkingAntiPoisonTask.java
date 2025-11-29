/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Drinking Anti Poison -> DrinkingantipoisonTask */
@TaskDesc(name="Drinking Anti Poison")
public class DrinkingAntiPoisonTask
extends Task {
    private static /* synthetic */ int[] lIlIIlIIIllll;
    private static /* synthetic */ String[] lIlIIlIIIlllI;

    private static String lIlllIlIIlIIIll(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var7 = var6.toCharArray();
        int var9 = lIlIIlIIIllll[0];
        char[] var13 = var10.toCharArray();
        int var4 = var13.length;
        int var2 = lIlIIlIIIllll[0];
        while (f.lIlllIlIIlIlIIl(var2, var4)) {
            char var5 = var13[var2];
            var14.append((char)(var5 ^ var7[var9 % var7.length]));
            0;
            ++var9;
            ++var2;
            0;
            if (((0xEB ^ 0x9A ^ (0xD0 ^ 0xB7)) & (0x6C ^ 0x67 ^ (0x57 ^ 0x4A) ^ -1)) < 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIlllIlIIlIIllI() {
        lIlIIlIIIllll = new int[5];
        f.lIlIIlIIIllll[0] = (0x31 ^ 0x27) & ~(0x5C ^ 0x4A);
        f.lIlIIlIIIllll[1] = 1;
        f.lIlIIlIIIllll[2] = 2;
        f.lIlIIlIIIllll[3] = 3;
        f.lIlIIlIIIllll[4] = 0xC4 ^ 0x81 ^ (0xFB ^ 0xBA);
    }

    private static void lIlllIlIIlIIlIl() {
        lIlIIlIIIlllI = new String[lIlIIlIIIllll[4]];
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[0]] = f."Drink";
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[1]] = f."anti";
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[2]] = f."anti";
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[3]] = f."Drink";
    }

    private static boolean lIlllIlIIlIIlll(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (f.lIlllIlIIlIIlll(Combat.isPoisoned() ? 1 : 0)) {
            return lIlIIlIIIllll[0];
        }
        if (f.lIlllIlIIlIIlll(Inventory.contains(item -> {
            int n2;
            if (f.lIlllIlIIlIlIII(item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIllll[1]];
                stringArray[f.lIlIIlIIIllll[0]] = lIlIIlIIIlllI[lIlIIlIIIllll[3]];
                if (f.lIlllIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIllll[1];
                    0;
                    if (-1 <= (0x99 ^ 0x9D)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIIIllll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIIlIIIllll[0];
        }
        Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[1]])).interact(lIlIIlIIIlllI[lIlIIlIIIllll[0]]);
        return lIlIIlIIIllll[1];
    }

    private static String lIlllIlIIlIIlII(String var11, String var12) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlIIlIIIllll[2], var3);
            return new String(var8.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIIlIlIII(int n2) {
        return n2 != 0;
    }

    static {
        f.lIlllIlIIlIIllI();
        f.lIlllIlIIlIIlIl();
    }
}

