package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

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
@TaskDesc(name = "Drinking Stamina Potion")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.g  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/g.class */
public class g extends Task {
    private static /* synthetic */ int[] lIlIllIllIlll;
    private static /* synthetic */ String[] lIlIllIllIllI;

    private static boolean llIIIIIllIlIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIIIllIlIlII(int i) {
        return i != 0;
    }

    private static boolean llIIIIIllIlIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void llIIIIIllIIlllI() {
        lIlIllIllIllI = new String[lIlIllIllIlll[5]];
        lIlIllIllIllI[lIlIllIllIlll[1]] = llIIIIIllIIlIIl("NSo8FyM=", "qXUyH");
        lIlIllIllIllI[lIlIllIllIlll[3]] = llIIIIIllIIlIIl("MDoeNgY=", "tHwXm");
        lIlIllIllIllI[lIlIllIllIlll[4]] = llIIIIIllIIlIll("hM/85LE7l5o=", "hgBIA");
        lIlIllIllIllI[lIlIllIllIlll[2]] = llIIIIIllIIlIIl("JxsANQUaDg==", "toaXl");
    }

    private static void llIIIIIllIlIIII() {
        lIlIllIllIlll = new int[7];
        lIlIllIllIlll[0] = (212 ^ 176) ^ (222 ^ 164);
        lIlIllIllIlll[1] = (128 ^ 192) & ((84 ^ 20) ^ (-1));
        lIlIllIllIlll[2] = "   ".length();
        lIlIllIllIlll[3] = " ".length();
        lIlIllIllIlll[4] = "  ".length();
        lIlIllIllIlll[5] = 128 ^ 132;
        lIlIllIllIlll[6] = (((3 + 29) - (-65)) + 42) ^ (((17 + 68) - 18) + 64);
    }

    private static boolean llIIIIIllIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIllIlIIll(Object obj) {
        return obj == null;
    }

    private static String llIIIIIllIIlIll(String llllllllllllllIllIlIIIIlllllIlII, String llllllllllllllIllIlIIIIlllllIIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIlllllIIll.getBytes(StandardCharsets.UTF_8)), lIlIllIllIlll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIllIlll[4], llllllllllllllIllIlIIIIlllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIlllllIlIl) {
            llllllllllllllIllIlIIIIlllllIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIllIIlIIl(String llllllllllllllIllIlIIIlIIIIIlIIl, String llllllllllllllIllIlIIIlIIIIIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIlIIIIIIlll = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIIIIIIllI = llllllllllllllIllIlIIIlIIIIIlIII.toCharArray();
        int llllllllllllllIllIlIIIlIIIIIIlIl = lIlIllIllIlll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIllIllIlll[1];
        while (llIIIIIllIlIlIl(i, length)) {
            llllllllllllllIllIlIIIlIIIIIIlll.append((char) (charArray[i] ^ llllllllllllllIllIlIIIlIIIIIIllI[llllllllllllllIllIlIIIlIIIIIIlIl % llllllllllllllIllIlIIIlIIIIIIllI.length]));
            "".length();
            llllllllllllllIllIlIIIlIIIIIIlIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIIlIIIIIIlll);
    }

    static {
        llIIIIIllIlIIII();
        llIIIIIllIIlllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean run() {
        if (!llIIIIIllIlIIIl(Movement.isStaminaBoosted() ? 1 : 0) || llIIIIIllIlIIlI(Movement.getRunEnergy(), lIlIllIllIlll[0])) {
            return lIlIllIllIlll[1];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIlIllIllIllI[lIlIllIllIlll[2]]);
        });
        if (llIIIIIllIlIIll(first)) {
            first = Inventory.getFirst(item2 -> {
                String[] strArr = new String[lIlIllIllIlll[3]];
                strArr[lIlIllIllIlll[1]] = lIlIllIllIllI[lIlIllIllIlll[3]];
                if (llIIIIIllIlIlII(item2.hasAction(strArr) ? 1 : 0) && llIIIIIllIlIlII(item2.getName().contains(lIlIllIllIllI[lIlIllIllIlll[4]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIllIlll[3];
                    "".length();
                    return (((((158 + 151) - 153) + 33) ^ (((120 + 104) - 156) + 63)) & (((((117 + 9) - 102) + 115) ^ (((17 + 162) - 6) + 8)) ^ (-" ".length()))) < 0 ? ((95 ^ 80) ^ (204 ^ 155)) & (((((136 + 76) - 92) + 89) ^ (((83 + 12) - 59) + 101)) ^ (-" ".length())) : r0;
                }
                return lIlIllIllIlll[1];
            });
            if (llIIIIIllIlIIll(first)) {
                return lIlIllIllIlll[1];
            }
        }
        first.interact(lIlIllIllIllI[lIlIllIllIlll[1]]);
        sleep(lIlIllIllIlll[2]);
        return lIlIllIllIlll[3];
    }
}
