package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/g.class */
public final class g {
    private final /* synthetic */ h temperature;
    private static /* synthetic */ int[] llIlIlllllII;
    private final /* synthetic */ int spriteId;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ g POLISH;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ g GRINDSTONE;
    public static final /* synthetic */ g HAMMER;
    private static /* synthetic */ String[] llIlIllllIll;

    static {
        lIIIIlIIIIlIlII();
        lIIIIlIIIIlIIll();
        HAMMER = new g(llIlIllllIll[llIlIlllllII[0]], llIlIlllllII[0], h.RED, llIlIlllllII[1], llIlIlllllII[2]);
        GRINDSTONE = new g(llIlIllllIll[llIlIlllllII[3]], llIlIlllllII[3], h.YELLOW, llIlIlllllII[4], llIlIlllllII[5]);
        POLISH = new g(llIlIllllIll[llIlIlllllII[6]], llIlIlllllII[6], h.GREEN, llIlIlllllII[7], llIlIlllllII[8]);
        g[] gVarArr = new g[llIlIlllllII[9]];
        gVarArr[llIlIlllllII[0]] = HAMMER;
        gVarArr[llIlIlllllII[3]] = GRINDSTONE;
        gVarArr[llIlIlllllII[6]] = POLISH;
        $VALUES = gVarArr;
    }

    private static void lIIIIlIIIIlIlII() {
        llIlIlllllII = new int[11];
        llIlIlllllII[0] = (219 ^ 186) & ((213 ^ 180) ^ (-1));
        llIlIlllllII[1] = (-((-1417) & 20394)) & (-8193) & 31611;
        llIlIlllllII[2] = (-20661) & 65279;
        llIlIlllllII[3] = " ".length();
        llIlIlllllII[4] = (-((-4161) & 4833)) & (-17409) & 22523;
        llIlIlllllII[5] = (-((-7693) & 24349)) & (-4131) & 65406;
        llIlIlllllII[6] = "  ".length();
        llIlIlllllII[7] = (-((-2649) & 28380)) & (-2593) & 32767;
        llIlIlllllII[8] = (-20483) & 65103;
        llIlIlllllII[9] = "   ".length();
        llIlIlllllII[10] = 90 ^ 82;
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public h H() {
        return this.temperature;
    }

    private static String lIIIIlIIIIlIIIl(String lllllllllllllllIlIIIIIIllllIIlII, String lllllllllllllllIlIIIIIIllllIIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIIIllllIIIll.toCharArray();
        int lllllllllllllllIlIIIIIIllllIIIII = llIlIlllllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIlllllII[0];
        while (lIIIIlIIIIlIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIIIIIllllIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIIIllllIIIII++;
            i++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIIlIIIIlIIll() {
        llIlIllllIll = new String[llIlIlllllII[9]];
        llIlIllllIll[llIlIlllllII[0]] = lIIIIlIIIIlIIII("8+WWXjpgjKE=", "XzBsm");
        llIlIllllIll[llIlIlllllII[3]] = lIIIIlIIIIlIIIl("DRMAHiIZFQYeIw==", "JAIPf");
        llIlIllllIll[llIlIlllllII[6]] = lIIIIlIIIIlIIlI("en+y0Mq1d1k=", "xxFNG");
    }

    private static String lIIIIlIIIIlIIlI(String lllllllllllllllIlIIIIIIlllllllll, String lllllllllllllllIlIIIIIlIIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIIIIIIII.getBytes(StandardCharsets.UTF_8)), llIlIlllllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlllllII[6], lllllllllllllllIlIIIIIlIIIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIIIIIIIlI) {
            lllllllllllllllIlIIIIIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    private static String lIIIIlIIIIlIIII(String lllllllllllllllIlIIIIIIlllllIlII, String lllllllllllllllIlIIIIIIlllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIIlllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIIlllllIllI.init(llIlIlllllII[6], lllllllllllllllIlIIIIIIlllllIlll);
            return new String(lllllllllllllllIlIIIIIIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIIlllllIlIl) {
            lllllllllllllllIlIIIIIIlllllIlIl.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.objectId;
    }

    private g(String str, int i, h hVar, int i2, int i3) {
        this.temperature = hVar;
        this.spriteId = i2;
        this.objectId = i3;
    }

    public int I() {
        return this.spriteId;
    }
}
