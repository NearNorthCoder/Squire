/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

/* TASK: Curing poison -> CurePoisonTask */
@TaskDesc(name="Curing poison", priority=20)
public class o
extends Task {
    private final /* synthetic */ a aq;
    private static /* synthetic */ int[] llllIlIlIIll;
    private static /* synthetic */ String[] llllIlIlIIlI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (o.lIIlIIIIlllIIll(this.aq.g() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        if (o.lIIlIIIIlllIIll(Combat.isPoisoned() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIlIlIIll[2]];
            stringArray[o.llllIlIlIIll[0]] = llllIlIlIIlI[llllIlIlIIll[2]];
            if (o.lIIlIIIIlllIlIl(item.hasAction(stringArray) ? 1 : 0) && o.lIIlIIIIlllIlIl(item.getName().toLowerCase().contains(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0)) {
                n2 = llllIlIlIIll[2];
                0;
                if ((152 + 117 - 198 + 124 ^ 79 + 197 - 129 + 51) <= 0) {
                    return false;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        });
        if (o.lIIlIIIIlllIlII(var8)) {
            return llllIlIlIIll[0];
        }
        var1_1.interact(llllIlIlIIlI[llllIlIlIIll[0]]);
        this.sleep(llllIlIlIIll[1]);
        return llllIlIlIIll[2];
    }

    private static String lIIlIIIIlllIIII(String var7, String var3) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var12 = var3.toCharArray();
        int var9 = llllIlIlIIll[0];
        char[] var1 = var7.toCharArray();
        int var15 = var1.length;
        int var13 = llllIlIlIIll[0];
        while (o.lIIlIIIIlllIllI(var13, var15)) {
            char var5 = var1[var13];
            var4.append((char)(var5 ^ var12[var9 % var12.length]));
            0;
            ++var9;
            ++var13;
            0;
            if (1 < 2) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static String lIIlIIIIllIllll(String var14, String var11) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llllIlIlIIll[5]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llllIlIlIIll[3], var10);
            return new String(var6.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlllIIIl() {
        llllIlIlIIlI = new String[llllIlIlIIll[4]];
        o.llllIlIlIIlI[o.llllIlIlIIll[0]] = o."Drink";
        o.llllIlIlIIlI[o.llllIlIlIIll[2]] = o."Drink";
        o.llllIlIlIIlI[o.llllIlIlIIll[3]] = o."anti";
    }

    private static boolean lIIlIIIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.lIIlIIIIlllIIlI();
        o.lIIlIIIIlllIIIl();
    }

    private static boolean lIIlIIIIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIlllIIlI() {
        llllIlIlIIll = new int[6];
        o.llllIlIlIIll[0] = (0xDF ^ 0x86) & ~(0x9D ^ 0xC4);
        o.llllIlIlIIll[1] = 0x55 ^ 0x51;
        o.llllIlIlIIll[2] = 1;
        o.llllIlIlIIll[3] = 2;
        o.llllIlIlIIll[4] = 3;
        o.llllIlIlIIll[5] = 0x56 ^ 0x5E;
    }

    @Inject
    public o(a a2) {
        this.aq = a2;
    }

    private static boolean lIIlIIIIlllIlII(Object object) {
        return object == null;
    }
}

