package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.L  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/L.class */
public class L {
    private final /* synthetic */ HashMap<String, Object> bE = new HashMap<>();
    private static /* synthetic */ int[] llIllIlIlII;
    private static /* synthetic */ String[] llIllIlIIll;

    private static void lIlIlIIlllIlIl() {
        llIllIlIIll = new String[llIllIlIlII[8]];
        llIllIlIIll[llIllIlIlII[0]] = lIlIlIIlllIIlI("Nw==", "LLeek");
        llIllIlIIll[llIllIlIlII[1]] = lIlIlIIlllIIll("8bDJnT3BxQM=", "NjiUV");
        llIllIlIIll[llIllIlIlII[2]] = lIlIlIIlllIIlI("Dg==", "UnSzw");
        llIllIlIIll[llIllIlIlII[3]] = lIlIlIIlllIlII("HOMXL4cLsGs=", "IFVBu");
        llIllIlIIll[llIllIlIlII[4]] = lIlIlIIlllIlII("pPuiMiC/QI8=", "ojxHs");
        llIllIlIIll[llIllIlIlII[5]] = lIlIlIIlllIIlI("BA==", "YkIft");
        llIllIlIIll[llIllIlIlII[6]] = lIlIlIIlllIlII("6CS+TRimnN0=", "IRdpl");
        llIllIlIIll[llIllIlIlII[7]] = lIlIlIIlllIIll("ul+LiI3SRFk=", "RULBQ");
    }

    private static boolean lIlIlIIllllIII(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIlllIlll(Object obj) {
        return obj != null;
    }

    private static String lIlIlIIlllIlII(String llllllllllllllllIIlIllIlIlIIIlII, String llllllllllllllllIIlIllIlIlIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), llIllIlIlII[8]), "DES");
            Cipher llllllllllllllllIIlIllIlIlIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIlIlIIIllI.init(llIllIlIlII[2], secretKeySpec);
            return new String(llllllllllllllllIIlIllIlIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIlIlIIIlIl) {
            llllllllllllllllIIlIllIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIlllIIll(String llllllllllllllllIIlIllIlIlIIllll, String llllllllllllllllIIlIllIlIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIlIlII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIlIlIlIIlI) {
            llllllllllllllllIIlIllIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIIlllIllI();
        lIlIlIIlllIlIl();
    }

    private static boolean lIlIlIIllllIll(int i, int i2) {
        return i == i2;
    }

    private String i(String str) {
        return "\"" + str + "\"";
    }

    private static String lIlIlIIlllIIlI(String llllllllllllllllIIlIllIlIIllIlII, String llllllllllllllllIIlIllIlIIllIIll) {
        String llllllllllllllllIIlIllIlIIllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIlIIllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIllIlIIllIIIl = llllllllllllllllIIlIllIlIIllIIll.toCharArray();
        int llllllllllllllllIIlIllIlIIllIIII = llIllIlIlII[0];
        char[] charArray = llllllllllllllllIIlIllIlIIllIlII2.toCharArray();
        int length = charArray.length;
        int i = llIllIlIlII[0];
        while (lIlIlIIllllIIl(i, length)) {
            char llllllllllllllllIIlIllIlIIllIlIl = charArray[i];
            llllllllllllllllIIlIllIlIIllIIlI.append((char) (llllllllllllllllIIlIllIlIIllIlIl ^ llllllllllllllllIIlIllIlIIllIIIl[llllllllllllllllIIlIllIlIIllIIII % llllllllllllllllIIlIllIlIIllIIIl.length]));
            "".length();
            llllllllllllllllIIlIllIlIIllIIII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIllIlIIllIIlI);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Object obj) {
        if (lIlIlIIlllIlll(obj)) {
            this.bE.put(str, obj);
            "".length();
        }
    }

    private static boolean lIlIlIIllllIIl(int i, int i2) {
        return i < i2;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, Object>> entrySet = this.bE.entrySet();
        sb.append(llIllIlIIll[llIllIlIlII[0]]);
        "".length();
        int llllllllllllllllIIlIllIlIlIllllI = llIllIlIlII[0];
        for (Map.Entry<String, Object> entry : entrySet) {
            Object value = entry.getValue();
            sb.append(i(entry.getKey())).append(llIllIlIIll[llIllIlIlII[1]]);
            "".length();
            if (lIlIlIIllllIII(value instanceof String ? 1 : 0)) {
                sb.append(i(String.valueOf(value)));
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else if (lIlIlIIllllIII(value instanceof Integer ? 1 : 0)) {
                sb.append(Integer.valueOf(String.valueOf(value)));
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else if (lIlIlIIllllIII(value instanceof Boolean ? 1 : 0)) {
                sb.append(value);
                "".length();
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            } else if (lIlIlIIllllIII(value instanceof L ? 1 : 0)) {
                sb.append(value.toString());
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            } else if (lIlIlIIllllIII(value.getClass().isArray() ? 1 : 0)) {
                sb.append(llIllIlIIll[llIllIlIlII[2]]);
                "".length();
                int length = Array.getLength(value);
                int i = llIllIlIlII[0];
                while (lIlIlIIllllIIl(i, length)) {
                    StringBuilder append = sb.append(Array.get(value, i).toString());
                    if (lIlIlIIllllIlI(i, length - llIllIlIlII[1])) {
                        str = llIllIlIIll[llIllIlIlII[3]];
                        "".length();
                        if ("  ".length() <= 0) {
                            return null;
                        }
                    } else {
                        str = llIllIlIIll[llIllIlIlII[4]];
                    }
                    append.append(str);
                    "".length();
                    i++;
                    "".length();
                    if (" ".length() > ((230 ^ 192) ^ (66 ^ 96))) {
                        return null;
                    }
                }
                sb.append(llIllIlIIll[llIllIlIlII[5]]);
                "".length();
            }
            llllllllllllllllIIlIllIlIlIllllI++;
            if (lIlIlIIllllIll(llllllllllllllllIIlIllIlIlIllllI, entrySet.size())) {
                str2 = llIllIlIIll[llIllIlIlII[6]];
                "".length();
                if ((-" ".length()) >= 0) {
                    return null;
                }
            } else {
                str2 = llIllIlIIll[llIllIlIlII[7]];
            }
            sb.append(str2);
            "".length();
            "".length();
            if (" ".length() >= (29 ^ 25)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIlIIlllIllI() {
        llIllIlIlII = new int[9];
        llIllIlIlII[0] = ((102 ^ 65) ^ (58 ^ 55)) & (((((28 + 71) - 42) + 105) ^ (((73 + 7) - 5) + 61)) ^ (-" ".length()));
        llIllIlIlII[1] = " ".length();
        llIllIlIlII[2] = "  ".length();
        llIllIlIlII[3] = "   ".length();
        llIllIlIlII[4] = 136 ^ 140;
        llIllIlIlII[5] = (41 ^ 8) ^ (144 ^ 180);
        llIllIlIlII[6] = (231 ^ 194) ^ (152 ^ 187);
        llIllIlIlII[7] = (116 ^ 17) ^ (89 ^ 59);
        llIllIlIlII[8] = 172 ^ 164;
    }

    private static boolean lIlIlIIllllIlI(int i, int i2) {
        return i != i2;
    }
}
