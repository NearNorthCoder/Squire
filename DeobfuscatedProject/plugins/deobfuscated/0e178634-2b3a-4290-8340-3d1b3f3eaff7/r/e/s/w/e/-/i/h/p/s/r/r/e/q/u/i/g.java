/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking Stamina Potion")
public class g
extends Task {
    private static /* synthetic */ int[] lIlIllIllIlll;
    private static /* synthetic */ String[] lIlIllIllIllI;

    private static boolean llIIIIIllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIIIllIIlllI() {
        lIlIllIllIllI = new String[lIlIllIllIlll[5]];
        g.lIlIllIllIllI[g.lIlIllIllIlll[1]] = g."Drink";
        g.lIlIllIllIllI[g.lIlIllIllIlll[3]] = g."Drink";
        g.lIlIllIllIllI[g.lIlIllIllIlll[4]] = g."energy";
        g.lIlIllIllIllI[g.lIlIllIllIlll[2]] = g."Stamina";
    }

    private static void llIIIIIllIlIIII() {
        lIlIllIllIlll = new int[7];
        g.lIlIllIllIlll[0] = 0xD4 ^ 0xB0 ^ (0xDE ^ 0xA4);
        g.lIlIllIllIlll[1] = (0x80 ^ 0xC0) & ~(0x54 ^ 0x14);
        g.lIlIllIllIlll[2] = 3;
        g.lIlIllIllIlll[3] = 1;
        g.lIlIllIllIlll[4] = 2;
        g.lIlIllIllIlll[5] = 0x80 ^ 0x84;
        g.lIlIllIllIlll[6] = 3 + 29 - -65 + 42 ^ 17 + 68 - 18 + 64;
    }

    private static boolean llIIIIIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIllIlIIll(Object object) {
        return object == null;
    }

    private static String llIIIIIllIIlIll(String llllllllllllllIllIlIIIIlllllIlII, String llllllllllllllIllIlIIIIlllllIIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIlllllIIll.getBytes(StandardCharsets.UTF_8)), lIlIllIllIlll[6]), "DES");
            Cipher llllllllllllllIllIlIIIIlllllIllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIIlllllIllI.init(lIlIllIllIlll[4], llllllllllllllIllIlIIIIlllllIlll);
            return new String(llllllllllllllIllIlIIIIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIlllllIlIl) {
            llllllllllllllIllIlIIIIlllllIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIllIIlIIl(String llllllllllllllIllIlIIIlIIIIIlIIl, String llllllllllllllIllIlIIIlIIIIIIIll) {
        llllllllllllllIllIlIIIlIIIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIlIIIIIIlll = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIIIIIIllI = llllllllllllllIllIlIIIlIIIIIIIll.toCharArray();
        int llllllllllllllIllIlIIIlIIIIIIlIl = lIlIllIllIlll[1];
        char[] llllllllllllllIllIlIIIIlllllllll = llllllllllllllIllIlIIIlIIIIIlIIl.toCharArray();
        int llllllllllllllIllIlIIIIllllllllI = llllllllllllllIllIlIIIIlllllllll.length;
        int llllllllllllllIllIlIIIIlllllllIl = lIlIllIllIlll[1];
        while (g.llIIIIIllIlIlIl(llllllllllllllIllIlIIIIlllllllIl, llllllllllllllIllIlIIIIllllllllI)) {
            char llllllllllllllIllIlIIIlIIIIIlIlI = llllllllllllllIllIlIIIIlllllllll[llllllllllllllIllIlIIIIlllllllIl];
            llllllllllllllIllIlIIIlIIIIIIlll.append((char)(llllllllllllllIllIlIIIlIIIIIlIlI ^ llllllllllllllIllIlIIIlIIIIIIllI[llllllllllllllIllIlIIIlIIIIIIlIl % llllllllllllllIllIlIIIlIIIIIIllI.length]));
            0;
            ++llllllllllllllIllIlIIIlIIIIIIlIl;
            ++llllllllllllllIllIlIIIIlllllllIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIlIIIIIIlll);
    }

    static {
        g.llIIIIIllIlIIII();
        g.llIIIIIllIIlllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!g.llIIIIIllIlIIIl(Movement.isStaminaBoosted() ? 1 : 0) || g.llIIIIIllIlIIlI(Movement.getRunEnergy(), lIlIllIllIlll[0])) {
            return lIlIllIllIlll[1];
        }
        Item llllllllllllllIllIlIIIlIIIIlIllI = Inventory.getFirst(item -> item.getName().startsWith(lIlIllIllIllI[lIlIllIllIlll[2]]));
        if (g.llIIIIIllIlIIll(llllllllllllllIllIlIIIlIIIIlIllI) && g.llIIIIIllIlIIll(llllllllllllllIllIlIIIlIIIIlIllI = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIllIllIlll[3]];
            stringArray[g.lIlIllIllIlll[1]] = lIlIllIllIllI[lIlIllIllIlll[3]];
            if (g.llIIIIIllIlIlII(item.hasAction(stringArray) ? 1 : 0) && g.llIIIIIllIlIlII(item.getName().contains(lIlIllIllIllI[lIlIllIllIlll[4]]) ? 1 : 0)) {
                n2 = lIlIllIllIlll[3];
                0;
                if (((158 + 151 - 153 + 33 ^ 120 + 104 - 156 + 63) & (117 + 9 - 102 + 115 ^ 17 + 162 - 6 + 8 ^ -1)) < 0) {
                    return ((0x5F ^ 0x50 ^ (0xCC ^ 0x9B)) & (136 + 76 - 92 + 89 ^ 83 + 12 - 59 + 101 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIllIllIlll[1];
            }
            return n2 != 0;
        }))) {
            return lIlIllIllIlll[1];
        }
        var1_1.interact(lIlIllIllIllI[lIlIllIllIlll[1]]);
        this.sleep(lIlIllIllIlll[2]);
        return lIlIllIllIlll[3];
    }
}

