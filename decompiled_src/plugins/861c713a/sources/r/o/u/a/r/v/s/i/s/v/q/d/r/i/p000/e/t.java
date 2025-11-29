package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

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
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/t.class */
public class t extends q {
    private static /* synthetic */ int[] lIlIlIIIIllIl;
    private static /* synthetic */ String[] lIlIlIIIIllII;

    private static void lIllllIlIIlIIlI() {
        lIlIlIIIIllII = new String[lIlIlIIIIllIl[4]];
        lIlIlIIIIllII[lIlIlIIIIllIl[0]] = lIllllIlIIlIIII("PwxTESAfCFMfLhAHHAY1URAWHyQSFxYX", "qcssA");
        lIlIlIIIIllII[lIlIlIIIIllIl[3]] = lIllllIlIIlIIIl("R3rv7af9Vgl2eFMa3LG9LuI3LHnjH0lFvJbeXq0ifY/g0oXhC/MPIuZzSfOnGKgJ", "vXtfg");
    }

    private static boolean lIllllIlIIlIlII(int i) {
        return i == 0;
    }

    private static boolean lIllllIlIIlIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.q
    public boolean l() {
        if (lIllllIlIIlIlII(P() ? 1 : 0)) {
            return lIlIlIIIIllIl[0];
        }
        if (lIllllIlIIlIlIl(Q())) {
            Log.error(lIlIlIIIIllII[lIlIlIIIIllIl[0]]);
            return lIlIlIIIIllIl[0];
        } else if (lIllllIlIIlIlII(Q().needsToBank() ? 1 : 0)) {
            this.s.c((boolean) lIlIlIIIIllIl[0]);
            Bank.close();
            sleep(lIlIlIIIIllIl[1]);
            return lIlIlIIIIllIl[0];
        } else if (lIllllIlIIlIlII(BankLoadouts.withdrawWithRetries(Q(), lIlIlIIIIllIl[2]).booleanValue() ? 1 : 0)) {
            Log.info(lIlIlIIIIllII[lIlIlIIIIllIl[3]]);
            return lIlIlIIIIllIl[0];
        } else {
            sleep(lIlIlIIIIllIl[4]);
            return lIlIlIIIIllIl[3];
        }
    }

    private static String lIllllIlIIlIIIl(String llllllllllllllIllIllIIlIIIIIlIll, String llllllllllllllIllIllIIlIIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIllIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIIllIl[4], llllllllllllllIllIllIIlIIIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIIIIIllII) {
            llllllllllllllIllIllIIlIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIlIllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllllIlIIlIIII(String llllllllllllllIllIllIIIllllllIll, String llllllllllllllIllIllIIIllllllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIllIIIllllllIII = llllllllllllllIllIllIIIllllllIlI.toCharArray();
        int llllllllllllllIllIllIIIlllllIlll = lIlIlIIIIllIl[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllIllIllIIIlllllIIII = charArray.length;
        int i = lIlIlIIIIllIl[0];
        while (lIllllIlIIlIllI(i, llllllllllllllIllIllIIIlllllIIII)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIllIIIllllllIII[llllllllllllllIllIllIIIlllllIlll % llllllllllllllIllIllIIIllllllIII.length]));
            "".length();
            llllllllllllllIllIllIIIlllllIlll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllllIlIIlIIll();
        lIllllIlIIlIIlI();
    }

    private static void lIllllIlIIlIIll() {
        lIlIlIIIIllIl = new int[6];
        lIlIlIIIIllIl[0] = (182 ^ 139) & ((148 ^ 169) ^ (-1));
        lIlIlIIIIllIl[1] = "   ".length();
        lIlIlIIIIllIl[2] = 194 ^ 199;
        lIlIlIIIIllIl[3] = " ".length();
        lIlIlIIIIllIl[4] = "  ".length();
        lIlIlIIIIllIl[5] = (((1 + 86) - 46) + 162) ^ (((190 + 122) - 185) + 68);
    }
}
