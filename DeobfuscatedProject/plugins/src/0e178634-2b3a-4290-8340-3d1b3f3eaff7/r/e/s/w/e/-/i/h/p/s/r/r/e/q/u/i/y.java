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
        Item llllllllllllllIllIlIIIIlllIIlIII = Inventory.getFirst(item -> item.hasAction(lIlIllIlllIlI[lIlIllIlllIll[1]]::equals));
        if (y.llIIIIIlllIIIII(llllllllllllllIllIlIIIIlllIIlIII)) {
            return lIlIllIlllIll[0];
        }
        var1_1.interact(lIlIllIlllIlI[lIlIllIlllIll[0]]);
        return lIlIllIlllIll[1];
    }

    private static boolean llIIIIIlllIIIII(Object object) {
        return object == null;
    }

    private static String llIIIIIllIllIll(String llllllllllllllIllIlIIIIllIlllllI, String llllllllllllllIllIlIIIIllIllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIlllIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIlllIIIIlI.init(lIlIllIlllIll[2], llllllllllllllIllIlIIIIlllIIIIll);
            return new String(llllllllllllllIllIlIIIIlllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIlllIIIIIl) {
            llllllllllllllIllIlIIIIlllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIllIllllI() {
        lIlIllIlllIll = new int[4];
        y.lIlIllIlllIll[0] = (0x3A ^ 0x69 ^ (0xC6 ^ 0x8A)) & (0x81 ^ 0x8C ^ (0x49 ^ 0x5B) ^ -" ".length());
        y.lIlIllIlllIll[1] = " ".length();
        y.lIlIllIlllIll[2] = "  ".length();
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
        y.lIlIllIlllIlI[y.lIlIllIlllIll[0]] = y.llIIIIIllIllIll("pB4uUTvHlhw=", "mgHMj");
        y.lIlIllIlllIlI[y.lIlIllIlllIll[1]] = y.llIIIIIllIlllII("3e+jwI6lSh8=", "lQPXj");
    }

    private static String llIIIIIllIlllII(String llllllllllllllIllIlIIIIllIllIIll, String llllllllllllllIllIlIIIIllIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIlllIll[3]), "DES");
            Cipher llllllllllllllIllIlIIIIllIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIIllIllIlIl.init(lIlIllIlllIll[2], llllllllllllllIllIlIIIIllIllIllI);
            return new String(llllllllllllllIllIlIIIIllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIllIllIlII) {
            llllllllllllllIllIlIIIIllIllIlII.printStackTrace();
            return null;
        }
    }
}

