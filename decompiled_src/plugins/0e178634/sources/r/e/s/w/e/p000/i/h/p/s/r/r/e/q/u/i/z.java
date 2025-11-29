package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

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
@TaskDesc(name = "Restoring prayer", priority = 50)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.z  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/z.class */
public class z extends u {
    private static /* synthetic */ String[] lIlIlllIllIll;
    private static /* synthetic */ int[] lIlIlllIlllII;

    static {
        llIIIIlIlIIllIl();
        llIIIIlIlIIlIlI();
    }

    private static boolean llIIIIlIlIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        if (llIIIIlIlIIlllI(Prayers.getPoints(), this.i.drinkPrayerAt())) {
            return lIlIlllIlllII[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlllIlllII[2]];
            strArr[lIlIlllIlllII[0]] = lIlIlllIllIll[lIlIlllIlllII[2]];
            if (!llIIIIlIlIlIIII(item.hasAction(strArr) ? 1 : 0) || (llIIIIlIlIlIIIl(item.getName().toLowerCase().contains(lIlIlllIllIll[lIlIlllIlllII[3]]) ? 1 : 0) && !llIIIIlIlIlIIII(item.getName().toLowerCase().contains(lIlIlllIllIll[lIlIlllIlllII[4]]) ? 1 : 0))) {
                return lIlIlllIlllII[0];
            }
            ?? r0 = lIlIlllIlllII[2];
            "".length();
            return "   ".length() != "   ".length() ? ((118 ^ 67) ^ (50 ^ 17)) & (((183 ^ 140) ^ (182 ^ 155)) ^ (-" ".length())) : r0;
        });
        if (llIIIIlIlIIllll(first)) {
            return lIlIlllIlllII[0];
        }
        first.interact(lIlIlllIllIll[lIlIlllIlllII[0]]);
        sleep(lIlIlllIlllII[1]);
        return lIlIlllIlllII[2];
    }

    private static boolean llIIIIlIlIlIIII(int i) {
        return i != 0;
    }

    private static void llIIIIlIlIIllIl() {
        lIlIlllIlllII = new int[6];
        lIlIlllIlllII[0] = ("  ".length() ^ (19 ^ 29)) & (((117 ^ 11) ^ (213 ^ 167)) ^ (-" ".length()));
        lIlIlllIlllII[1] = 27 ^ 31;
        lIlIlllIlllII[2] = " ".length();
        lIlIlllIlllII[3] = "  ".length();
        lIlIlllIlllII[4] = "   ".length();
        lIlIlllIlllII[5] = (((135 + 126) - 172) + 48) ^ (((46 + 124) - 159) + 118);
    }

    private static String llIIIIlIlIIlIII(String llllllllllllllIllIIlllllIlIIllII, String llllllllllllllIllIIlllllIlIIlIll) {
        String llllllllllllllIllIIlllllIlIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllllIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllllIlIIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlllllIlIIlIll.toCharArray();
        int llllllllllllllIllIIlllllIlIIIIll = lIlIlllIlllII[0];
        char[] charArray2 = llllllllllllllIllIIlllllIlIIllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlllIlllII[0];
        while (llIIIIlIlIlIIlI(i, length)) {
            llllllllllllllIllIIlllllIlIIlIlI.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIlllllIlIIIIll % charArray.length]));
            "".length();
            llllllllllllllIllIIlllllIlIIIIll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlllllIlIIlIlI);
    }

    private static void llIIIIlIlIIlIlI() {
        lIlIlllIllIll = new String[lIlIlllIlllII[1]];
        lIlIlllIllIll[lIlIlllIlllII[0]] = llIIIIlIlIIlIII("MgIqHS8=", "vpCsD");
        lIlIlllIllIll[lIlIlllIlllII[2]] = llIIIIlIlIIlIII("FzkGGB0=", "SKovv");
        lIlIlllIllIll[lIlIlllIlllII[3]] = llIIIIlIlIIlIII("BBEEITwG", "tceXY");
        lIlIlllIllIll[lIlIlllIlllII[4]] = llIIIIlIlIIlIIl("VMTR0v9v6Ds=", "EqTqO");
    }

    private static boolean llIIIIlIlIIllll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIlIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIlIlIIlllI(int i, int i2) {
        return i > i2;
    }

    private static String llIIIIlIlIIlIIl(String llllllllllllllIllIIlllllIIllIlll, String llllllllllllllIllIIlllllIIllIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlllllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllllIIllIllI.getBytes(StandardCharsets.UTF_8)), lIlIlllIlllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIlllII[3], llllllllllllllIllIIlllllIIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllllIIlllIII) {
            llllllllllllllIllIIlllllIIlllIII.printStackTrace();
            return null;
        }
    }
}
