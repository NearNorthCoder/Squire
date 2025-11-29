package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.N  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/N.class */
public class N {
    private /* synthetic */ C0042q bv;
    private /* synthetic */ int bw;
    private final /* synthetic */ P bu;
    private static /* synthetic */ int[] lIllllIIIlII;
    private final /* synthetic */ String bs;
    private static /* synthetic */ String[] lIllllIIIIll;
    private final /* synthetic */ int bt;
    public static final /* synthetic */ Predicate<String> br;

    public C0042q aM() {
        return this.bv;
    }

    private static boolean lllIllIllIlIIl(int i) {
        return i != 0;
    }

    public void d(C0042q c0042q) {
        this.bv = c0042q;
    }

    private static String lllIllIllIIlII(String lllllllllllllllIlIllIlIIIIIIIlII, String lllllllllllllllIlIllIlIIIIIIIIll) {
        String lllllllllllllllIlIllIlIIIIIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIlIIIIIIIIll.toCharArray();
        int lllllllllllllllIlIllIlIIIIIIIIII = lIllllIIIlII[1];
        char[] charArray2 = lllllllllllllllIlIllIlIIIIIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIllllIIIlII[1];
        while (lllIllIllIllIl(i, length)) {
            char lllllllllllllllIlIllIlIIIIIIIlIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlIllIlIIIIIIIlIl ^ charArray[lllllllllllllllIlIllIlIIIIIIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIllIlIIIIIIIIII++;
            i++;
            "".length();
            if ("  ".length() == ((135 ^ 163) & ((24 ^ 60) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public N(String str, int i, P p) {
        this.bw = lIllllIIIlII[2];
        this.bs = str;
        this.bt = i;
        this.bu = p;
    }

    public TileObject b(Client client) {
        if (!lllIllIllIIlll(this.bu, P.COMPOST) || lllIllIllIlIII(this.bu, P.GIANT_COMPOST)) {
            String[] strArr = new String[lIllllIIIlII[0]];
            strArr[lIllllIIIlII[1]] = this.bu.ac();
            return TileObjects.getNearest(strArr);
        }
        return TileObjects.getNearest(tileObject -> {
            String str = lIllllIIIIll[lIllllIIIlII[1]];
            if (lllIllIllIlIIl(tileObject.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0) && lllIllIllIlIlI(client.getObjectDefinition(tileObject.getId()).getVarbitId(), this.bt)) {
                ?? r0 = lIllllIIIlII[0];
                "".length();
                return (-"  ".length()) > 0 ? ((28 ^ 47) ^ (115 ^ 35)) & (((((98 + 8) - (-79)) + 11) ^ (((130 + 95) - 213) + 155)) ^ (-" ".length())) : r0;
            }
            return lIllllIIIlII[1];
        });
    }

    static {
        lllIllIllIIllI();
        lllIllIllIIlIl();
        br = str -> {
            if (!lllIllIllIlIll(str) || (lllIllIllIllII(str.equals(lIllllIIIIll[lIllllIIIlII[0]]) ? 1 : 0) && lllIllIllIllII(str.equals(lIllllIIIIll[lIllllIIIlII[3]]) ? 1 : 0) && !lllIllIllIlIIl(str.equals(lIllllIIIIll[lIllllIIIlII[4]]) ? 1 : 0))) {
                return lIllllIIIlII[1];
            }
            ?? r0 = lIllllIIIlII[0];
            "".length();
            return (-"  ".length()) >= 0 ? ((7 ^ 83) ^ (187 ^ 175)) & (((((67 + 204) - 268) + 230) ^ (((14 + 40) - (-87)) + 28)) ^ (-" ".length())) : r0;
        };
    }

    private static boolean lllIllIllIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public C0014an aI() {
        return this.bu.f(Vars.getBit(this.bt));
    }

    private static boolean lllIllIllIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIllIllIllII(int i) {
        return i == 0;
    }

    private static boolean lllIllIllIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lllIllIllIlIlI(int i, int i2) {
        return i == i2;
    }

    public P aL() {
        return this.bu;
    }

    private static void lllIllIllIIllI() {
        lIllllIIIlII = new int[7];
        lIllllIIIlII[0] = " ".length();
        lIllllIIIlII[1] = ((73 ^ 20) ^ (110 ^ 23)) & (((((101 + 9) - 29) + 54) ^ (((41 + 153) - 32) + 1)) ^ (-" ".length()));
        lIllllIIIlII[2] = -" ".length();
        lIllllIIIlII[3] = "  ".length();
        lIllllIIIlII[4] = "   ".length();
        lIllllIIIlII[5] = 174 ^ 170;
        lIllllIIIlII[6] = 168 ^ 160;
    }

    private static void lllIllIllIIlIl() {
        lIllllIIIIll = new String[lIllllIIIlII[5]];
        lIllllIIIIll[lIllllIIIlII[1]] = lllIllIllIIIlI("MNTNBQ/09jM=", "vVGNM");
        lIllllIIIIll[lIllllIIIlII[0]] = lllIllIllIIIll("uRRcdLVcn+4=", "qrKLf");
        lIllllIIIIll[lIllllIIIlII[3]] = lllIllIllIIlII("OhwXGw==", "jutpb");
        lIllllIIIIll[lIllllIIIlII[4]] = lllIllIllIIIlI("kjAQpFeCY/S3gurMiH3gtA==", "nDRXn");
    }

    public N(String str, int i, P p, int i2) {
        this(str, i, p);
        this.bw = i2;
    }

    public String aJ() {
        return this.bv.X() + "." + this.bt;
    }

    private static String lllIllIllIIIll(String lllllllllllllllIlIllIlIIIIIlIlII, String lllllllllllllllIlIllIlIIIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlIIIIIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlIIIIIlIllI.init(lIllllIIIlII[3], secretKeySpec);
            return new String(lllllllllllllllIlIllIlIIIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIIIIIlIlIl) {
            lllllllllllllllIlIllIlIIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    public int aN() {
        return this.bw;
    }

    private static boolean lllIllIllIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lllIllIllIIIlI(String lllllllllllllllIlIllIIlllllIllll, String lllllllllllllllIlIllIIlllllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlllllIlllI.getBytes(StandardCharsets.UTF_8)), lIllllIIIlII[6]), "DES");
            Cipher lllllllllllllllIlIllIIllllllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIllllllIIIl.init(lIllllIIIlII[3], secretKeySpec);
            return new String(lllllllllllllllIlIllIIllllllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlllllIlIll) {
            lllllllllllllllIlIllIIlllllIlIll.printStackTrace();
            return null;
        }
    }

    public EnumC0041p aK() {
        return EnumC0041p.b(this.bv.X());
    }

    public String toString() {
        return "FarmingPatch(name=" + ac() + ", implementation=" + String.valueOf(aL()) + ", region=" + String.valueOf(aM()) + ")";
    }

    public int aO() {
        return this.bt;
    }

    public String ac() {
        return this.bs;
    }
}
