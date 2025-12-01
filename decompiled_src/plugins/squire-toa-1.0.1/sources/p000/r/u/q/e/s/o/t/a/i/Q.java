package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Gear Swapping Zebak", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.Q  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/Q.class */
public class Q extends y {
    private static /* synthetic */ int[] lIIlllllIllII;
    private static /* synthetic */ String[] lIIlllllIlIll;

    private static boolean lIllIlIlIIllIII(int i) {
        return i != 0;
    }

    private static boolean lIllIlIlIIllIll(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIlIIlIllI() {
        lIIlllllIlIll = new String[lIIlllllIllII[4]];
        lIIlllllIlIll[lIIlllllIllII[0]] = lIllIlIlIIlIIll("E38M/n5NgNo=", "GpcJR");
        lIIlllllIlIll[lIIlllllIllII[2]] = lIllIlIlIIlIlII("P0NhEAFAO3Q=", "VgEHV");
        lIIlllllIlIll[lIIlllllIllII[1]] = lIllIlIlIIlIIll("NQLU6tJrBT8=", "hDnDh");
        lIIlllllIlIll[lIIlllllIllII[3]] = lIllIlIlIIlIlIl("Aj8dEi4lJB4U", "AMrqA");
    }

    static {
        lIllIlIlIIlIlll();
        lIllIlIlIIlIllI();
    }

    @Inject
    public Q(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static String lIllIlIlIIlIlII(String llllllllllllllIlllIlIIIIIIlIIIlI, String llllllllllllllIlllIlIIIIIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllllIllII[5]), "DES");
            Cipher llllllllllllllIlllIlIIIIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIIIIlIIlII.init(lIIlllllIllII[1], llllllllllllllIlllIlIIIIIIlIIlIl);
            return new String(llllllllllllllIlllIlIIIIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIIIlIIIll) {
            llllllllllllllIlllIlIIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIIllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        if (!lIllIlIlIIllIlI(this.aL.gearSwapZebak().isSelected() ? 1 : 0) || lIllIlIlIIllIII(this.aL.gearSwapCrocodile().isSelected() ? 1 : 0)) {
            ?? r0 = lIIlllllIllII[2];
            "".length();
            return (((53 ^ 31) ^ (50 ^ 55)) & (((((99 + 44) - 65) + 49) ^ (2 ^ 82)) ^ (-" ".length()))) > 0 ? ((((156 + 155) - 309) + 237) ^ (((122 + 154) - 142) + 59)) & (((75 ^ 35) ^ (109 ^ 43)) ^ (-" ".length())) : r0;
        }
        return lIIlllllIllII[0];
    }

    private static void lIllIlIlIIlIlll() {
        lIIlllllIllII = new int[6];
        lIIlllllIllII[0] = ((225 ^ 130) ^ (70 ^ 122)) & (((((38 + 203) - 193) + 156) ^ (((80 + 80) - 101) + 88)) ^ (-" ".length()));
        lIIlllllIllII[1] = "  ".length();
        lIIlllllIllII[2] = " ".length();
        lIIlllllIllII[3] = "   ".length();
        lIIlllllIllII[4] = (((113 + 52) - 127) + 110) ^ (((59 + 60) - 99) + 124);
        lIIlllllIllII[5] = 35 ^ 43;
    }

    private static boolean lIllIlIlIIllIIl(Object obj) {
        return obj != null;
    }

    private static String lIllIlIlIIlIIll(String llllllllllllllIlllIlIIIIIIIlIlIl, String llllllllllllllIlllIlIIIIIIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllIllII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIIIIlIllI) {
            llllllllllllllIlllIlIIIIIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIIlIlIl(String llllllllllllllIlllIlIIIIIIIIIlIl, String llllllllllllllIlllIlIIIIIIIIIlII) {
        String llllllllllllllIlllIlIIIIIIIIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlIIIIIIIIIlII.toCharArray();
        int llllllllllllllIlllIlIIIIIIIIIIIl = lIIlllllIllII[0];
        char[] charArray2 = llllllllllllllIlllIlIIIIIIIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIllII[0];
        while (lIllIlIlIIllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIlIIIIIIIIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIlIIIIIIIIIIIl++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String str) {
        if (!lIllIlIlIIllIII(str.equals(lIIlllllIlIll[lIIlllllIllII[0]]) ? 1 : 0)) {
            return lIllIlIlIIllIII(str.equals(lIIlllllIlIll[lIIlllllIllII[3]]) ? 1 : 0) ? a(this.aL.gearSwapCrocodile()) : new int[lIIlllllIllII[0]];
        }
        String[] strArr = new String[lIIlllllIllII[1]];
        strArr[lIIlllllIllII[0]] = lIIlllllIlIll[lIIlllllIllII[2]];
        strArr[lIIlllllIllII[2]] = lIIlllllIlIll[lIIlllllIllII[1]];
        return lIllIlIlIIllIIl(NPCs.getNearest(strArr)) ? a(this.aL.gearSwapZebak()) : a(this.aL.specGearZebak(), this.aL.gearSwapZebak(), this.aL.specGearZebakReq());
    }
}
