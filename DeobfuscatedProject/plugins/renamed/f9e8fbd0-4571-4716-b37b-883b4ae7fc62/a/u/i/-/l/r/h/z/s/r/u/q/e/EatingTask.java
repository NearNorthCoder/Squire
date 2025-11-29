/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating -> EatingTask */
@TaskDesc(name="Eating", priority=50)
public class EatingTask
extends ad_Unknown {
    private static /* synthetic */ String[] lIllIlIlIllll;
    private static /* synthetic */ int[] lIllIlIllIIll;

    private static boolean llIIlIIIIlIIIIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIIlIIllI(Object object) {
        return object != null;
    }

    static {
        W.llIIlIIIIlIIIII();
        W.llIIlIIIIIlllIl();
    }

    private static void llIIlIIIIlIIIII() {
        lIllIlIllIIll = new int[10];
        W.lIllIlIllIIll[0] = (0xA8 ^ 0xC6 ^ (0x6B ^ 0x13)) & (113 + 11 - -23 + 16 ^ 106 + 166 - 162 + 71 ^ -1);
        W.lIllIlIllIIll[1] = -(0xFFFFD97B & 0x66A6) & (0xFFFFF7F7 & 0x5BF9);
        W.lIllIlIllIIll[2] = 0x96 ^ 0x82;
        W.lIllIlIllIIll[3] = 1;
        W.lIllIlIllIIll[4] = -(0xFFFFF0A6 & Short.MAX_VALUE) & (0xFFFFFEFF & 0x7DED);
        W.lIllIlIllIIll[5] = 2;
        W.lIllIlIllIIll[6] = 3;
        W.lIllIlIllIIll[7] = 172 + 14 - 81 + 80 ^ 138 + 16 - 33 + 68;
        W.lIllIlIllIIll[8] = 0x33 ^ 0x50 ^ (0x4F ^ 0x29);
        W.lIllIlIllIIll[9] = 0x31 ^ 0x39;
    }

    private static boolean llIIlIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIIlIIIIIllIII(String var2, String var11) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIllIlIllIIll[9]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllIlIllIIll[5], var21);
            return new String(var13.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIIIlllII(String var10, String var14) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var1 = var14.toCharArray();
        int var9 = lIllIlIllIIll[0];
        char[] var19 = var10.toCharArray();
        int var6 = var19.length;
        int var16 = lIllIlIllIIll[0];
        while (W.llIIlIIIIlIlIIl(var16, var6)) {
            char var22 = var19[var16];
            var17.append((char)(var22 ^ var1[var9 % var1.length]));
            0;
            ++var9;
            ++var16;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void llIIlIIIIIlllIl() {
        lIllIlIlIllll = new String[lIllIlIllIIll[8]];
        W.lIllIlIlIllll[W.lIllIlIllIIll[0]] = W."Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[3]] = W."Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[5]] = W."Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[6]] = W."Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[7]] = W."Eat";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var12;
        W var5;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (W.llIIlIIIIlIlIII(item.hasAction(lIllIlIlIllll[lIllIlIllIIll[7]]::equals) ? 1 : 0) && W.llIIlIIIIlIIlll(item.getId(), lIllIlIllIIll[4])) {
                n2 = lIllIlIllIIll[3];
                0;
                if (-(0xF ^ 0x25 ^ (0x36 ^ 0x19)) >= 0) {
                    return ((0xD0 ^ 0xB2 ^ (0x43 ^ 0xE)) & (33 + 1 - 12 + 108 ^ 66 + 119 - 131 + 119 ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlIllIIll[0];
            }
            return n2 != 0;
        });
        if (W.llIIlIIIIlIIIIl(item2) && W.llIIlIIIIlIIIIl(item2 = Inventory.getFirst(item -> item.hasAction(lIllIlIlIllll[lIllIlIllIIll[6]]::equals)))) {
            return lIllIlIllIIll[0];
        }
        if (W.llIIlIIIIlIIIll(var5.az.W().getAnimation(), lIllIlIllIIll[1])) {
            int var15 = Combat.getMissingHealth();
            if (W.llIIlIIIIlIIlII(var15, lIllIlIllIIll[2])) {
                var12.interact(lIllIlIlIllll[lIllIlIllIIll[0]]);
                return lIllIlIllIIll[3];
            }
            return lIllIlIllIIll[0];
        }
        if (W.llIIlIIIIlIIlIl(Combat.getCurrentHealth(), var5.aA.eatAtHP())) {
            var12.interact(lIllIlIlIllll[lIllIlIllIIll[3]]);
            int[] nArray = new int[lIllIlIllIIll[3]];
            nArray[W.lIllIlIllIIll[0]] = lIllIlIllIIll[4];
            Item var15 = Inventory.getFirst((int[])nArray);
            if (W.llIIlIIIIlIIllI(var15) && W.llIIlIIIIlIIlll(var12.getId(), lIllIlIllIIll[4])) {
                var15.interact(lIllIlIlIllll[lIllIlIllIIll[5]]);
            }
            return lIllIlIllIIll[3];
        }
        return lIllIlIllIIll[0];
    }

    private static boolean llIIlIIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected W(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlIIIIIllIIl(String var4, String var3) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIlIllIIll[5], var8);
            return new String(var7.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIlIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIIIIlIIlII(int n2, int n3) {
        return n2 > n3;
    }
}

