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
@TaskDesc(name = "Kephri Gear Swapping", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.O  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/O.class */
public class O extends y {
    private static /* synthetic */ int[] lIlIIIIIIIIII;
    private static /* synthetic */ String[] lIIllllllllll;

    private static String lIllIlIllIlIIll(String llllllllllllllIlllIIlllIIlIIIlll, String llllllllllllllIlllIIlllIIlIIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlllIIlIIIlIl = new StringBuilder();
        char[] llllllllllllllIlllIIlllIIlIIIlII = llllllllllllllIlllIIlllIIlIIIllI.toCharArray();
        int llllllllllllllIlllIIlllIIlIIIIll = lIlIIIIIIIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIIIII[1];
        while (lIllIlIllIllIII(i, length)) {
            char llllllllllllllIlllIIlllIIlIIlIII = charArray[i];
            llllllllllllllIlllIIlllIIlIIIlIl.append((char) (llllllllllllllIlllIIlllIIlIIlIII ^ llllllllllllllIlllIIlllIIlIIIlII[llllllllllllllIlllIIlllIIlIIIIll % llllllllllllllIlllIIlllIIlIIIlII.length]));
            "".length();
            llllllllllllllIlllIIlllIIlIIIIll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlllIIlIIIlIl);
    }

    private static boolean lIllIlIllIlIllI(int i) {
        return i != 0;
    }

    private static String lIllIlIllIlIIIl(String llllllllllllllIlllIIlllIIlIlIlll, String llllllllllllllIlllIIlllIIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIIIIII[3], llllllllllllllIlllIIlllIIlIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlllIIlIllIII) {
            llllllllllllllIlllIIlllIIlIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIllIII(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIllIlIlII() {
        lIIllllllllll = new String[lIlIIIIIIIIII[5]];
        lIIllllllllll[lIlIIIIIIIIII[1]] = lIllIlIllIlIIIl("IBU9vdPH2k67+6+U7nSQiw==", "VoWdg");
        lIIllllllllll[lIlIIIIIIIIII[2]] = lIllIlIllIlIIIl("JCbg8n5sG+Q=", "piJxE");
        lIIllllllllll[lIlIIIIIIIIII[3]] = lIllIlIllIlIIlI("ZCBlX1ZyrqCbmvVN1NTJoA==", "gDZjm");
        lIIllllllllll[lIlIIIIIIIIII[4]] = lIllIlIllIlIIll("GigpHxcraxsaFzsm", "IKHmv");
    }

    @Inject
    public O(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static void lIllIlIllIlIlIl() {
        lIlIIIIIIIIII = new int[7];
        lIlIIIIIIIIII[0] = -" ".length();
        lIlIIIIIIIIII[1] = (39 ^ 122) & ((10 ^ 87) ^ (-1));
        lIlIIIIIIIIII[2] = " ".length();
        lIlIIIIIIIIII[3] = "  ".length();
        lIlIIIIIIIIII[4] = "   ".length();
        lIlIIIIIIIIII[5] = 52 ^ 48;
        lIlIIIIIIIIII[6] = (((62 + 84) - 28) + 72) ^ (((78 + 40) - 47) + 111);
    }

    private static boolean lIllIlIllIlIlll(int i) {
        return i == 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String str) {
        float llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[0];
        switch (str.hashCode()) {
            case -2127561158:
                if (lIllIlIllIlIllI(str.equals(lIIllllllllll[lIlIIIIIIIIII[4]]) ? 1 : 0)) {
                    llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[4];
                    break;
                }
                break;
            case -2051065175:
                if (lIllIlIllIlIllI(str.equals(lIIllllllllll[lIlIIIIIIIIII[2]]) ? 1 : 0)) {
                    llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[2];
                    "".length();
                    if ((-" ".length()) > 0) {
                        return null;
                    }
                }
                break;
            case 32389500:
                if (lIllIlIllIlIllI(str.equals(lIIllllllllll[lIlIIIIIIIIII[3]]) ? 1 : 0)) {
                    llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[3];
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return null;
                    }
                }
                break;
            case 829390592:
                if (lIllIlIllIlIllI(str.equals(lIIllllllllll[lIlIIIIIIIIII[1]]) ? 1 : 0)) {
                    llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[1];
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                break;
        }
        switch (llllllllllllllIlllIIlllIIllIIIIl) {
            case 0.0f:
                return a(this.aL.kephriGearSwap());
            case Float.MIN_VALUE:
                return a(this.aL.kephriSpecialGear(), this.aL.kephriGearSwap(), this.aL.kephriSpecialReq());
            case 2.8E-45f:
                return a(this.aL.kephriMager());
            case 4.2E-45f:
                return a(this.aL.kephriSwarm());
            default:
                return new int[lIlIIIIIIIIII[1]];
        }
    }

    static {
        lIllIlIllIlIlIl();
        lIllIlIllIlIlII();
    }

    private static String lIllIlIllIlIIlI(String llllllllllllllIlllIIlllIIIllIIlI, String llllllllllllllIlllIIlllIIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlllIIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlllIIIllIlII.init(lIlIIIIIIIIII[3], secretKeySpec);
            return new String(llllllllllllllIlllIIlllIIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlllIIIlIlllI) {
            llllllllllllllIlllIIlllIIIlIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        if (lIllIlIllIlIlll(this.aL.kephriGearSwap().isSelected() ? 1 : 0) && lIllIlIllIlIlll(this.aL.kephriMager().isSelected() ? 1 : 0) && !lIllIlIllIlIllI(this.aL.kephriSwarm().isSelected() ? 1 : 0)) {
            return lIlIIIIIIIIII[1];
        }
        ?? r0 = lIlIIIIIIIIII[2];
        "".length();
        return " ".length() == ((134 ^ 182) & ((70 ^ 118) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }
}
