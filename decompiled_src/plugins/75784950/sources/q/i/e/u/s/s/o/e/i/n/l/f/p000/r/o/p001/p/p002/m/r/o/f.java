package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "PrayFlick", priority = 2147483646)
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.f  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/f.class */
public class f extends Task {
    private static /* synthetic */ String[] lIIIIIIIllIII;
    private static /* synthetic */ int[] lIIIIIIIllIlI;
    private final /* synthetic */ SquireMoonsOfPerilConfig N;

    private static String lIIlIllIllIIlIl(String lllllllllllllllIIIlllllIllIIIIll, String lllllllllllllllIIIlllllIllIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllllIllIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllllIllIIIlIl.init(lIIIIIIIllIlI[2], secretKeySpec);
            return new String(lllllllllllllllIIIlllllIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllIllIIIlII) {
            lllllllllllllllIIIlllllIllIIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIllIlIII() {
        lIIIIIIIllIlI = new int[9];
        lIIIIIIIllIlI[0] = " ".length();
        lIIIIIIIllIlI[1] = ((((130 + 137) - 141) + 33) ^ (((122 + 20) - (-39)) + 0)) & (((((30 + 88) - 56) + 74) ^ (((152 + 136) - 286) + 160)) ^ (-" ".length()));
        lIIIIIIIllIlI[2] = "  ".length();
        lIIIIIIIllIlI[3] = "   ".length();
        lIIIIIIIllIlI[4] = 108 ^ 104;
        lIIIIIIIllIlI[5] = (101 ^ 123) ^ (36 ^ 63);
        lIIIIIIIllIlI[6] = 57 ^ 63;
        lIIIIIIIllIlI[7] = (50 ^ 126) ^ (4 ^ 79);
        lIIIIIIIllIlI[8] = 88 ^ 80;
    }

    private static boolean lIIlIllIllIllII(int i) {
        return i >= 0;
    }

    private static String lIIlIllIllIIIll(String lllllllllllllllIIIlllllIlllIIlIl, String lllllllllllllllIIIlllllIllIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIlllllIllIlllll.toCharArray();
        int lllllllllllllllIIIlllllIlllIIIIl = lIIIIIIIllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIllIlI[1];
        while (lIIlIllIlllIIIl(i, length)) {
            char lllllllllllllllIIIlllllIlllIIllI = charArray2[i];
            sb.append((char) (lllllllllllllllIIIlllllIlllIIllI ^ charArray[lllllllllllllllIIIlllllIlllIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIIlllllIlllIIIIl++;
            i++;
            "".length();
            if ("   ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public f(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.N = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIllIllIlIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    public boolean run() {
        double lllllllllllllllIIIlllllIllllIIIl = l.k();
        double eatAtHpPercent = this.N.eatAtHpPercent();
        String[] strArr = new String[lIIIIIIIllIlI[0]];
        strArr[lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[1]];
        if (lIIlIllIllIlIll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIIIIIllIlI[0]];
            strArr2[lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[0]];
            Inventory.getFirst(strArr2).interact(lIIIIIIIllIII[lIIIIIIIllIlI[2]]);
            return lIIIIIIIllIlI[1];
        } else if (lIIlIllIllIllII(lIIlIllIllIlIIl(lllllllllllllllIIIlllllIllllIIIl, eatAtHpPercent))) {
            return lIIIIIIIllIlI[1];
        } else {
            String[] strArr3 = new String[lIIIIIIIllIlI[0]];
            strArr3[lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[3]];
            if (lIIlIllIllIlIll(Inventory.contains(strArr3) ? 1 : 0)) {
                System.out.println(lIIIIIIIllIII[lIIIIIIIllIlI[4]]);
                SquireMoonsOfPeril.g = lIIIIIIIllIII[lIIIIIIIllIlI[5]];
                String[] strArr4 = new String[lIIIIIIIllIlI[0]];
                strArr4[lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[6]];
                Inventory.getFirst(strArr4).interact(lIIIIIIIllIII[lIIIIIIIllIlI[7]]);
                return lIIIIIIIllIlI[0];
            }
            return lIIIIIIIllIlI[0];
        }
    }

    private static int lIIlIllIllIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIlIllIllIIllI() {
        lIIIIIIIllIII = new String[lIIIIIIIllIlI[8]];
        lIIIIIIIllIII[lIIIIIIIllIlI[1]] = lIIlIllIllIIIll("AwANHA==", "Uilpy");
        lIIIIIIIllIII[lIIIIIIIllIlI[0]] = lIIlIllIllIIIll("GAQnKw==", "NmFGw");
        lIIIIIIIllIII[lIIIIIIIllIlI[2]] = lIIlIllIllIIlII("babD6SBXuZE=", "Ygpuc");
        lIIIIIIIllIII[lIIIIIIIllIlI[3]] = lIIlIllIllIIlII("B7weJAZX/tkKFPAGuDt+5Q==", "NvNGh");
        lIIIIIIIllIII[lIIIIIIIllIlI[4]] = lIIlIllIllIIlIl("P9GrPxPmAeE=", "qaDdN");
        lIIIIIIIllIII[lIIIIIIIllIlI[5]] = lIIlIllIllIIIll("LDUZOjsO", "iTmSU");
        lIIIIIIIllIII[lIIIIIIIllIlI[6]] = lIIlIllIllIIIll("DA48KgcrQTEzBy4M", "OaSAb");
        lIIIIIIIllIII[lIIIIIIIllIlI[7]] = lIIlIllIllIIlII("zuVo/kS/UB0=", "ALBZM");
    }

    static {
        lIIlIllIllIlIII();
        lIIlIllIllIIllI();
    }

    private static boolean lIIlIllIlllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllIllIIlII(String lllllllllllllllIIIlllllIllIlIIII, String lllllllllllllllIIIlllllIllIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIllIIllll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllIllIlIIIl) {
            lllllllllllllllIIIlllllIllIlIIIl.printStackTrace();
            return null;
        }
    }
}
