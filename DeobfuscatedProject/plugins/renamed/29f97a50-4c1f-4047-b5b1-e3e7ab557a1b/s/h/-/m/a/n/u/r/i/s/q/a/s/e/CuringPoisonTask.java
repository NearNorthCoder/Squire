/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Curing Poison -> CuringpoisonTask */
@TaskDesc(name="Curing Poison", priority=2)
public class CuringPoisonTask
extends Task {
    private static /* synthetic */ int[] lIIllIIIIIlIl;
    private static /* synthetic */ String[] lIIllIIIIIlII;
    private static final /* synthetic */ Logger X;

    private static boolean lIlIlllIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static String lIlIlllIlIIIIII(String var4, String var2) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIlIl[4]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIllIIIIIlIl[2], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    static {
        m.lIlIlllIlIIIIlI();
        m.lIlIlllIlIIIIIl();
        X = LoggerFactory.getLogger(m.class);
    }

    private static String lIlIlllIIllllll(String var1, String var15) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var13 = var15.toCharArray();
        int var5 = lIIllIIIIIlIl[0];
        char[] var3 = var1.toCharArray();
        int var7 = var3.length;
        int var6 = lIIllIIIIIlIl[0];
        while (m.lIlIlllIlIIIllI(var6, var7)) {
            char var8 = var3[var6];
            var14.append((char)(var8 ^ var13[var5 % var13.length]));
            0;
            ++var5;
            ++var6;
            0;
            if (((0x33 ^ 0x24) & ~(0x4E ^ 0x59)) == ((0x1C ^ 7) & ~(0x8F ^ 0x94))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIlIlllIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIlIIIlII(Object object) {
        return object == null;
    }

    private static void lIlIlllIlIIIIlI() {
        lIIllIIIIIlIl = new int[5];
        m.lIIllIIIIIlIl[0] = (119 + 29 - 111 + 124 ^ 65 + 42 - 29 + 62) & (0x64 ^ 0x3C ^ (0xB5 ^ 0xC0) ^ -1);
        m.lIIllIIIIIlIl[1] = 1;
        m.lIIllIIIIIlIl[2] = 2;
        m.lIIllIIIIIlIl[3] = 3;
        m.lIIllIIIIIlIl[4] = 11 + 42 - 13 + 109 ^ 40 + 93 - 43 + 67;
    }

    private static void lIlIlllIlIIIIIl() {
        lIIllIIIIIlII = new String[lIIllIIIIIlIl[3]];
        m.lIIllIIIIIlII[m.lIIllIIIIIlIl[0]] = m."Drink";
        m.lIIllIIIIIlII[m.lIIllIIIIIlIl[1]] = m."anti";
        m.lIIllIIIIIlII[m.lIIllIIIIIlIl[2]] = m."Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIlIlllIlIIIIll(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIIIIIlIl[0];
        }
        Item var9 = Inventory.getFirst(item -> {
            int n2;
            if (m.lIlIlllIlIIIlIl(item.getName().toLowerCase().contains(lIIllIIIIIlII[lIIllIIIIIlIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIIIIlIl[1]];
                stringArray[m.lIIllIIIIIlIl[0]] = lIIllIIIIIlII[lIIllIIIIIlIl[2]];
                if (m.lIlIlllIlIIIlIl(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIIIIlIl[1];
                    0;
                    if ((3 ^ 0x1D ^ (0x62 ^ 0x79)) > 0) return n2 != 0;
                    return ((2 ^ (0x82 ^ 0xC4)) & (0x8C ^ 0xB8 ^ (0x32 ^ 0x42) ^ -1)) != 0;
                }
            }
            n2 = lIIllIIIIIlIl[0];
            return n2 != 0;
        });
        if (m.lIlIlllIlIIIlII(var9)) {
            return lIIllIIIIIlIl[0];
        }
        var1_1.interact(lIIllIIIIIlII[lIIllIIIIIlIl[0]]);
        return lIIllIIIIIlIl[1];
    }

    private static boolean lIlIlllIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

