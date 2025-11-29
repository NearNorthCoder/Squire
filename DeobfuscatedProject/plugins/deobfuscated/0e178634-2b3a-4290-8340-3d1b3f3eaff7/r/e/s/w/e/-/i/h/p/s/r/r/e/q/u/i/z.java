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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Restoring prayer", priority=50)
public class z
extends u {
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
        Item llllllllllllllIllIIlllllIlIllIIl = Inventory.getFirst(item -> {
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
        if (z.llIIIIlIlIIllll(llllllllllllllIllIIlllllIlIllIIl)) {
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

    private static String llIIIIlIlIIlIII(String llllllllllllllIllIIlllllIlIIIlll, String llllllllllllllIllIIlllllIlIIlIll) {
        llllllllllllllIllIIlllllIlIIIlll = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllllIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllllIlIIlIlI = new StringBuilder();
        char[] llllllllllllllIllIIlllllIlIIlIIl = llllllllllllllIllIIlllllIlIIlIll.toCharArray();
        int llllllllllllllIllIIlllllIlIIlIII = lIlIlllIlllII[0];
        char[] llllllllllllllIllIIlllllIlIIIIlI = llllllllllllllIllIIlllllIlIIIlll.toCharArray();
        int llllllllllllllIllIIlllllIlIIIIIl = llllllllllllllIllIIlllllIlIIIIlI.length;
        int llllllllllllllIllIIlllllIlIIIIII = lIlIlllIlllII[0];
        while (z.llIIIIlIlIlIIlI(llllllllllllllIllIIlllllIlIIIIII, llllllllllllllIllIIlllllIlIIIIIl)) {
            char llllllllllllllIllIIlllllIlIIllIl = llllllllllllllIllIIlllllIlIIIIlI[llllllllllllllIllIIlllllIlIIIIII];
            llllllllllllllIllIIlllllIlIIlIlI.append((char)(llllllllllllllIllIIlllllIlIIllIl ^ llllllllllllllIllIIlllllIlIIlIIl[llllllllllllllIllIIlllllIlIIlIII % llllllllllllllIllIIlllllIlIIlIIl.length]));
            0;
            ++llllllllllllllIllIIlllllIlIIlIII;
            ++llllllllllllllIllIIlllllIlIIIIII;
            0;
            if (((3 ^ 0x1F) & ~(0x3D ^ 0x21)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlllllIlIIlIlI);
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

    private static String llIIIIlIlIIlIIl(String llllllllllllllIllIIlllllIIllIlIl, String llllllllllllllIllIIlllllIIllIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlllllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllllIIllIllI.getBytes(StandardCharsets.UTF_8)), lIlIlllIlllII[5]), "DES");
            Cipher llllllllllllllIllIIlllllIIlllIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIlllllIIlllIIl.init(lIlIlllIlllII[3], llllllllllllllIllIIlllllIIlllIlI);
            return new String(llllllllllllllIllIIlllllIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllllIIlllIII) {
            llllllllllllllIllIIlllllIIlllIII.printStackTrace();
            return null;
        }
    }
}

