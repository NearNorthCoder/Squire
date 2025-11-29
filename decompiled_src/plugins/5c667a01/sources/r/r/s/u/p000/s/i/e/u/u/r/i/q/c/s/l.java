package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Withdrawing items", priority = 2147482647, blocking = true)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.l  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/l.class */
public class l extends i {
    private static /* synthetic */ String[] lIIlIllIllllI;
    private static /* synthetic */ int[] lIIlIllIlllll;

    static {
        lIlIllIllIIIIII();
        lIlIllIlIllllll();
    }

    private static String lIlIllIlIllllIl(String llllllllllllllIllllIlIIlIlIIlllI, String llllllllllllllIllllIlIIlIlIIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIlIlIIllII = new StringBuilder();
        char[] llllllllllllllIllllIlIIlIlIIlIll = llllllllllllllIllllIlIIlIlIIllIl.toCharArray();
        int llllllllllllllIllllIlIIlIlIIlIlI = lIIlIllIlllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIllIlllll[0];
        while (lIlIllIllIIIIll(i, length)) {
            llllllllllllllIllllIlIIlIlIIllII.append((char) (charArray[i] ^ llllllllllllllIllllIlIIlIlIIlIll[llllllllllllllIllllIlIIlIlIIlIlI % llllllllllllllIllllIlIIlIlIIlIll.length]));
            "".length();
            llllllllllllllIllllIlIIlIlIIlIlI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIIlIlIIllII);
    }

    private static boolean lIlIllIllIIIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIlIllllll() {
        lIIlIllIllllI = new String[lIIlIllIlllll[3]];
        lIIlIllIllllI[lIIlIllIlllll[0]] = lIlIllIlIllllIl("HB55Bik8GnkIJzMVNhE8cgI8CC0xBTwA", "RqYdH");
        lIIlIllIllllI[lIIlIllIlllll[2]] = lIlIllIlIlllllI("ej2P1TQ9bFkfppdtmSKUiQDJZy9FibeO9lCMCSCcA5xTEnHsMswGMQSwEgv0sJWR", "XHvEA");
    }

    private static void lIlIllIllIIIIII() {
        lIIlIllIlllll = new int[5];
        lIIlIllIlllll[0] = ((((69 + 187) - 223) + 220) ^ (((76 + 122) - 112) + 75)) & (((((3 + 181) - 144) + 195) ^ (((160 + 17) - 23) + 29)) ^ (-" ".length()));
        lIIlIllIlllll[1] = 178 ^ 183;
        lIIlIllIlllll[2] = " ".length();
        lIIlIllIlllll[3] = "  ".length();
        lIIlIllIlllll[4] = 20 ^ 28;
    }

    private static String lIlIllIlIlllllI(String llllllllllllllIllllIlIIlIIlllIIl, String llllllllllllllIllllIlIIlIIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIlIIlllIII.getBytes(StandardCharsets.UTF_8)), lIIlIllIlllll[4]), "DES");
            Cipher llllllllllllllIllllIlIIlIIlllIll = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIlIIlllIll.init(lIIlIllIlllll[3], secretKeySpec);
            return new String(llllllllllllllIllllIlIIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIlIIlllIlI) {
            llllllllllllllIllllIlIIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.i
    public boolean a() {
        if (lIlIllIllIIIIIl(s() ? 1 : 0)) {
            return lIIlIllIlllll[0];
        }
        if (lIlIllIllIIIIlI(t())) {
            Log.error(lIIlIllIllllI[lIIlIllIlllll[0]]);
            return lIIlIllIlllll[0];
        } else if (lIlIllIllIIIIIl(t().needsToBank() ? 1 : 0)) {
            this.a.e((boolean) lIIlIllIlllll[0]);
            Bank.close();
            return lIIlIllIlllll[0];
        } else if (lIlIllIllIIIIIl(BankLoadouts.withdrawWithRetries(t(), lIIlIllIlllll[1]).booleanValue() ? 1 : 0)) {
            Log.info(lIIlIllIllllI[lIIlIllIlllll[2]]);
            return lIIlIllIlllll[0];
        } else {
            sleep(lIIlIllIlllll[3]);
            return lIIlIllIlllll[2];
        }
    }

    private static boolean lIlIllIllIIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIllIllIIIIlI(Object obj) {
        return obj == null;
    }
}
