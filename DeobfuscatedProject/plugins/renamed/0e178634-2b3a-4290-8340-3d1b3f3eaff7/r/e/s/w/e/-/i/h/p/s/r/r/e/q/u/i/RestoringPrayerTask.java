/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Restoring prayer -> RestoringprayerTask */
@TaskDesc(name="Restoring prayer", priority=50)
public class RestoringPrayerTask
extends u_Unknown {
    private static /* synthetic */ String[] lIlIlllIllIll;
    private static /* synthetic */ int[] lIlIlllIlllII;

    static {
        z.llIIIIlIlIIllIl();
        z.llIIIIlIlIIlIlI();
    }

    private static boolean llIIIIlIlIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        if (z.llIIIIlIlIIlllI(Prayers.getPoints(), this.i.drinkPrayerAt())) {
            return lIlIlllIlllII[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIlllIlllII[2]];
            stringArray[z.lIlIlllIlllII[0]] = lIlIlllIllIll[lIlIlllIlllII[2]];
            if (z.llIIIIlIlIlIIII(item.hasAction(stringArray) ? 1 : 0) && (!z.llIIIIlIlIlIIIl(item.getName().toLowerCase().contains(lIlIlllIllIll[lIlIlllIlllII[3]]) ? 1 : 0) || z.llIIIIlIlIlIIII(item.getName().toLowerCase().contains(lIlIlllIllIll[lIlIlllIlllII[4]]) ? 1 : 0))) {
                n2 = lIlIlllIlllII[2];
                0;
                if (3 != 3) {
                    return ((0x76 ^ 0x43 ^ (0x32 ^ 0x11)) & (0xB7 ^ 0x8C ^ (0xB6 ^ 0x9B) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllIlllII[0];
            }
            return n2 != 0;
        });
        if (z.llIIIIlIlIIllll(var4)) {
            return lIlIlllIlllII[0];
        }
        var1_1.interact(lIlIlllIllIll[lIlIlllIlllII[0]]);
        this.sleep(lIlIlllIlllII[1]);
        return lIlIlllIlllII[2];
    }

    private static boolean llIIIIlIlIlIIII(int n2) {
        return n2 != 0;
    }

    private static void llIIIIlIlIIllIl() {
        lIlIlllIlllII = new int[6];
        z.lIlIlllIlllII[0] = (2 ^ (0x13 ^ 0x1D)) & (0x75 ^ 0xB ^ (0xD5 ^ 0xA7) ^ -1);
        z.lIlIlllIlllII[1] = 0x1B ^ 0x1F;
        z.lIlIlllIlllII[2] = 1;
        z.lIlIlllIlllII[3] = 2;
        z.lIlIlllIlllII[4] = 3;
        z.lIlIlllIlllII[5] = 135 + 126 - 172 + 48 ^ 46 + 124 - 159 + 118;
    }

    private static String llIIIIlIlIIlIII(String var13, String var10) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var15 = var10.toCharArray();
        int var9 = lIlIlllIlllII[0];
        char[] var7 = var13.toCharArray();
        int var5 = var7.length;
        int var11 = lIlIlllIlllII[0];
        while (z.llIIIIlIlIlIIlI(var11, var5)) {
            char var6 = var7[var11];
            var12.append((char)(var6 ^ var15[var9 % var15.length]));
            0;
            ++var9;
            ++var11;
            0;
            if (((3 ^ 0x1F) & ~(0x3D ^ 0x21)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static void llIIIIlIlIIlIlI() {
        lIlIlllIllIll = new String[lIlIlllIlllII[1]];
        z.lIlIlllIllIll[z.lIlIlllIlllII[0]] = z."Drink";
        z.lIlIlllIllIll[z.lIlIlllIlllII[2]] = z."Drink";
        z.lIlIlllIllIll[z.lIlIlllIlllII[3]] = z."prayer";
        z.lIlIlllIllIll[z.lIlIlllIlllII[4]] = z."restore";
    }

    private static boolean llIIIIlIlIIllll(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlIlIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIIIIlIlIIlIIl(String var1, String var3) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlIlllIlllII[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIlllIlllII[3], var8);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

