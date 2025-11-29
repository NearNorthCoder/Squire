package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

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
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.at  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/at.class */
public class C0020at {
    private static /* synthetic */ int[] lIlIlIlIIIIl;
    private final /* synthetic */ HashMap<String, Object> dr = new HashMap<>();
    private static /* synthetic */ String[] lIlIlIlIIIII;

    static {
        llIlllIllIIlll();
        llIlllIllIIllI();
    }

    private static void llIlllIllIIllI() {
        lIlIlIlIIIII = new String[lIlIlIlIIIIl[8]];
        lIlIlIlIIIII[lIlIlIlIIIIl[0]] = llIlllIllIIIll("UE1jz+5MqDo=", "jbBaU");
        lIlIlIlIIIII[lIlIlIlIIIIl[1]] = llIlllIllIIlII("oDokRZju738=", "AfgCB");
        lIlIlIlIIIII[lIlIlIlIIIIl[2]] = llIlllIllIIlIl("Fw==", "LDXnb");
        lIlIlIlIIIII[lIlIlIlIIIIl[3]] = llIlllIllIIIll("JWuFcrQBrh8=", "vOxfz");
        lIlIlIlIIIII[lIlIlIlIIIIl[4]] = llIlllIllIIIll("4ZrLuNUvf5M=", "jjcDX");
        lIlIlIlIIIII[lIlIlIlIIIIl[5]] = llIlllIllIIlII("LUO8kHPjRm0=", "hSJAi");
        lIlIlIlIIIII[lIlIlIlIIIIl[6]] = llIlllIllIIIll("ot8pvY5Bq5Q=", "oIQTJ");
        lIlIlIlIIIII[lIlIlIlIIIIl[7]] = llIlllIllIIlII("ZanBUT6biPg=", "aefpY");
    }

    private static String llIlllIllIIlII(String lllllllllllllllIllIlIIIIllIIIlll, String lllllllllllllllIllIlIIIIllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIIllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIIIIl[2], lllllllllllllllIllIlIIIIllIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIIllIIlIII) {
            lllllllllllllllIllIlIIIIllIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIllIlIll(int i, int i2) {
        return i != i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Object obj) {
        if (llIlllIllIlIII(obj)) {
            this.dr.put(str, obj);
            "".length();
        }
    }

    private static String llIlllIllIIIll(String lllllllllllllllIllIlIIIIlIlllIlI, String lllllllllllllllIllIlIIIIlIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIIlIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIIl[8]), "DES");
            Cipher lllllllllllllllIllIlIIIIlIllllII = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIIIlIllllII.init(lIlIlIlIIIIl[2], lllllllllllllllIllIlIIIIlIllllIl);
            return new String(lllllllllllllllIllIlIIIIlIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIIlIlllIll) {
            lllllllllllllllIllIlIIIIlIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIllIlIlI(int i, int i2) {
        return i < i2;
    }

    private String k(String str) {
        return "\"" + str + "\"";
    }

    private static String llIlllIllIIlIl(String lllllllllllllllIllIlIIIIllIlllII, String lllllllllllllllIllIlIIIIllIllIll) {
        String lllllllllllllllIllIlIIIIllIlllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIIIIllIllIll.toCharArray();
        int lllllllllllllllIllIlIIIIllIllIII = lIlIlIlIIIIl[0];
        char[] charArray2 = lllllllllllllllIllIlIIIIllIlllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIlIIIIl[0];
        while (llIlllIllIlIlI(i, length)) {
            char lllllllllllllllIllIlIIIIllIlllIl = charArray2[i];
            sb.append((char) (lllllllllllllllIllIlIIIIllIlllIl ^ charArray[lllllllllllllllIllIlIIIIllIllIII % charArray.length]));
            "".length();
            lllllllllllllllIllIlIIIIllIllIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, Object>> entrySet = this.dr.entrySet();
        sb.append(lIlIlIlIIIII[lIlIlIlIIIIl[0]]);
        "".length();
        int i = lIlIlIlIIIIl[0];
        for (Map.Entry<String, Object> entry : entrySet) {
            Object value = entry.getValue();
            sb.append(k(entry.getKey())).append(lIlIlIlIIIII[lIlIlIlIIIIl[1]]);
            "".length();
            if (llIlllIllIlIIl(value instanceof String ? 1 : 0)) {
                sb.append(k(String.valueOf(value)));
                "".length();
                "".length();
                if ("   ".length() <= ((72 ^ 40) & ((12 ^ 108) ^ (-1)))) {
                    return null;
                }
            } else if (llIlllIllIlIIl(value instanceof Integer ? 1 : 0)) {
                sb.append(Integer.valueOf(String.valueOf(value)));
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            } else if (llIlllIllIlIIl(value instanceof Boolean ? 1 : 0)) {
                sb.append(value);
                "".length();
                "".length();
                if ((40 ^ 44) <= ((8 ^ 18) & ((136 ^ 146) ^ (-1)))) {
                    return null;
                }
            } else if (llIlllIllIlIIl(value instanceof C0020at ? 1 : 0)) {
                sb.append(value.toString());
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            } else if (llIlllIllIlIIl(value.getClass().isArray() ? 1 : 0)) {
                sb.append(lIlIlIlIIIII[lIlIlIlIIIIl[2]]);
                "".length();
                int length = Array.getLength(value);
                int i2 = lIlIlIlIIIIl[0];
                while (llIlllIllIlIlI(i2, length)) {
                    StringBuilder append = sb.append(Array.get(value, i2).toString());
                    if (llIlllIllIlIll(i2, length - lIlIlIlIIIIl[1])) {
                        str = lIlIlIlIIIII[lIlIlIlIIIIl[3]];
                        "".length();
                        if (0 != 0) {
                            return null;
                        }
                    } else {
                        str = lIlIlIlIIIII[lIlIlIlIIIIl[4]];
                    }
                    append.append(str);
                    "".length();
                    i2++;
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return null;
                    }
                }
                sb.append(lIlIlIlIIIII[lIlIlIlIIIIl[5]]);
                "".length();
            }
            i++;
            if (llIlllIllIllII(i, entrySet.size())) {
                str2 = lIlIlIlIIIII[lIlIlIlIIIIl[6]];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            } else {
                str2 = lIlIlIlIIIII[lIlIlIlIIIIl[7]];
            }
            sb.append(str2);
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlllIllIllII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllIllIlIIl(int i) {
        return i != 0;
    }

    private static boolean llIlllIllIlIII(Object obj) {
        return obj != null;
    }

    private static void llIlllIllIIlll() {
        lIlIlIlIIIIl = new int[9];
        lIlIlIlIIIIl[0] = (57 ^ 34) & ((103 ^ 124) ^ (-1));
        lIlIlIlIIIIl[1] = " ".length();
        lIlIlIlIIIIl[2] = "  ".length();
        lIlIlIlIIIIl[3] = "   ".length();
        lIlIlIlIIIIl[4] = (251 ^ 183) ^ (40 ^ 96);
        lIlIlIlIIIIl[5] = (101 ^ 57) ^ (99 ^ 58);
        lIlIlIlIIIIl[6] = 110 ^ 104;
        lIlIlIlIIIIl[7] = 120 ^ 127;
        lIlIlIlIIIIl[8] = (90 ^ 92) ^ (123 ^ 117);
    }
}
