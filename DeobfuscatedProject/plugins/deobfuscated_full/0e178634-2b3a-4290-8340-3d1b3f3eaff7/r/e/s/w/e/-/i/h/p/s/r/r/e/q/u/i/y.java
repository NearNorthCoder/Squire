/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food")
public class y
extends u {
    private static /* synthetic */ int[] lIlIllIlllIll;
    private static /* synthetic */ String[] lIlIllIlllIlI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        if (y.llIIIIIllIlllll(Combat.getCurrentHealth(), this.i.eatAt())) {
            return lIlIllIlllIll[0];
        }
        Item var10 = Inventory.getFirst(item -> item.hasAction(lIlIllIlllIlI[lIlIllIlllIll[1]]::equals));
        if (y.llIIIIIlllIIIII(var10)) {
            return lIlIllIlllIll[0];
        }
        var1_1.interact(lIlIllIlllIlI[lIlIllIlllIll[0]]);
        return lIlIllIlllIll[1];
    }

    private static boolean llIIIIIlllIIIII(Object object) {
        return object == null;
    }

    private static String llIIIIIllIllIll(String var9, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlIllIlllIll[2], var5);
            return new String(var11.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIllIllllI() {
        lIlIllIlllIll = new int[4];
        y.lIlIllIlllIll[0] = (0x3A ^ 0x69 ^ (0xC6 ^ 0x8A)) & (0x81 ^ 0x8C ^ (0x49 ^ 0x5B) ^ -1);
        y.lIlIllIlllIll[1] = 1;
        y.lIlIllIlllIll[2] = 2;
        y.lIlIllIlllIll[3] = 0x5B ^ 0x45 ^ (0xBF ^ 0xA9);
    }

    private static boolean llIIIIIllIlllll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.llIIIIIllIllllI();
        y.llIIIIIllIlllIl();
    }

    private static void llIIIIIllIlllIl() {
        lIlIllIlllIlI = new String[lIlIllIlllIll[2]];
        y.lIlIllIlllIlI[y.lIlIllIlllIll[0]] = y."Eat";
        y.lIlIllIlllIlI[y.lIlIllIlllIll[1]] = y."Eat";
    }

    private static String llIIIIIllIlllII(String var2, String var1) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlIllIlllIll[3]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIllIlllIll[2], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}

