/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class at {
    private static /* synthetic */ int[] lIlIlIlIIIIl;
    private final /* synthetic */ HashMap<String, Object> dr;
    private static /* synthetic */ String[] lIlIlIlIIIII;

    static {
        at.llIlllIllIIlll();
        at.llIlllIllIIllI();
    }

    private static void llIlllIllIIllI() {
        lIlIlIlIIIII = new String[lIlIlIlIIIIl[8]];
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[0]] = at."{";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[1]] = at.":";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[2]] = at."[";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[3]] = at.",";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[4]] = at."";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[5]] = at."]";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[6]] = at."}";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[7]] = at.",";
    }

    private static String llIlllIllIIlII(String lllllllllllllllIllIlIIIIllIIIlll, String lllllllllllllllIllIlIIIIllIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIIllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIIIllIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIIIllIIlIIl.init(lIlIlIlIIIIl[2], lllllllllllllllIllIlIIIIllIIlIlI);
            return new String(lllllllllllllllIllIlIIIIllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIIIllIIlIII) {
            lllllllllllllllIllIlIIIIllIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIllIlIll(int n2, int n3) {
        return n2 != n3;
    }

    void a(String string, Object object) {
        if (at.llIlllIllIlIII(object)) {
            this.dr.put(string, object);
            0;
        }
    }

    private static String llIlllIllIIIll(String lllllllllllllllIllIlIIIIlIlllIII, String lllllllllllllllIllIlIIIIlIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIIlIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIIl[8]), "DES");
            Cipher lllllllllllllllIllIlIIIIlIllllII = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIIIlIllllII.init(lIlIlIlIIIIl[2], lllllllllllllllIllIlIIIIlIllllIl);
            return new String(lllllllllllllllIllIlIIIIlIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIIIlIlllIll) {
            lllllllllllllllIllIlIIIIlIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public at() {
        this.dr = new HashMap();
    }

    private String k(String string) {
        return "\"" + string + "\"";
    }

    private static String llIlllIllIIlIl(String lllllllllllllllIllIlIIIIllIlIlll, String lllllllllllllllIllIlIIIIllIlIllI) {
        lllllllllllllllIllIlIIIIllIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIIIllIllIlI = new StringBuilder();
        char[] lllllllllllllllIllIlIIIIllIllIIl = lllllllllllllllIllIlIIIIllIlIllI.toCharArray();
        int lllllllllllllllIllIlIIIIllIllIII = lIlIlIlIIIIl[0];
        char[] lllllllllllllllIllIlIIIIllIlIIlI = lllllllllllllllIllIlIIIIllIlIlll.toCharArray();
        int lllllllllllllllIllIlIIIIllIlIIIl = lllllllllllllllIllIlIIIIllIlIIlI.length;
        int lllllllllllllllIllIlIIIIllIlIIII = lIlIlIlIIIIl[0];
        while (at.llIlllIllIlIlI(lllllllllllllllIllIlIIIIllIlIIII, lllllllllllllllIllIlIIIIllIlIIIl)) {
            char lllllllllllllllIllIlIIIIllIlllIl = lllllllllllllllIllIlIIIIllIlIIlI[lllllllllllllllIllIlIIIIllIlIIII];
            lllllllllllllllIllIlIIIIllIllIlI.append((char)(lllllllllllllllIllIlIIIIllIlllIl ^ lllllllllllllllIllIlIIIIllIllIIl[lllllllllllllllIllIlIIIIllIllIII % lllllllllllllllIllIlIIIIllIllIIl.length]));
            0;
            ++lllllllllllllllIllIlIIIIllIllIII;
            ++lllllllllllllllIllIlIIIIllIlIIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIIIIllIllIlI);
    }

    /*
     * WARNING - void declaration
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<String, Object>> set = this.dr.entrySet();
        stringBuilder.append(lIlIlIlIIIII[lIlIlIlIIIIl[0]]);
        0;
        int n2 = lIlIlIlIIIIl[0];
        Iterator<Map.Entry<String, Object>> lllllllllllllllIllIlIIIIlllIlIll = set.iterator();
        while (at.llIlllIllIlIIl(lllllllllllllllIllIlIIIIlllIlIll.hasNext() ? 1 : 0)) {
            String string;
            void lllllllllllllllIllIlIIIIlllIllIl;
            void lllllllllllllllIllIlIIIIlllIllII;
            at lllllllllllllllIllIlIIIIlllIllll;
            void lllllllllllllllIllIlIIIIlllIlllI;
            Map.Entry<String, Object> lllllllllllllllIllIlIIIIlllIlIlI = lllllllllllllllIllIlIIIIlllIlIll.next();
            Object lllllllllllllllIllIlIIIIlllIlIIl = lllllllllllllllIllIlIIIIlllIlIlI.getValue();
            lllllllllllllllIllIlIIIIlllIlllI.append(lllllllllllllllIllIlIIIIlllIllll.k(lllllllllllllllIllIlIIIIlllIlIlI.getKey())).append(lIlIlIlIIIII[lIlIlIlIIIIl[1]]);
            0;
            if (at.llIlllIllIlIIl(lllllllllllllllIllIlIIIIlllIlIIl instanceof String)) {
                lllllllllllllllIllIlIIIIlllIlllI.append(lllllllllllllllIllIlIIIIlllIllll.k(String.valueOf(lllllllllllllllIllIlIIIIlllIlIIl)));
                0;
                0;
                if (3 <= ((0x48 ^ 0x28) & ~(0xC ^ 0x6C))) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(lllllllllllllllIllIlIIIIlllIlIIl instanceof Integer)) {
                lllllllllllllllIllIlIIIIlllIlllI.append(Integer.valueOf(String.valueOf(lllllllllllllllIllIlIIIIlllIlIIl)));
                0;
                0;
                if (3 < 0) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(lllllllllllllllIllIlIIIIlllIlIIl instanceof Boolean)) {
                lllllllllllllllIllIlIIIIlllIlllI.append(lllllllllllllllIllIlIIIIlllIlIIl);
                0;
                0;
                if ((0x28 ^ 0x2C) <= ((8 ^ 0x12) & ~(0x88 ^ 0x92))) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(lllllllllllllllIllIlIIIIlllIlIIl instanceof at)) {
                lllllllllllllllIllIlIIIIlllIlllI.append(lllllllllllllllIllIlIIIIlllIlIIl.toString());
                0;
                0;
                if (2 < 0) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(lllllllllllllllIllIlIIIIlllIlIIl.getClass().isArray() ? 1 : 0)) {
                lllllllllllllllIllIlIIIIlllIlllI.append(lIlIlIlIIIII[lIlIlIlIIIIl[2]]);
                0;
                int lllllllllllllllIllIlIIIIlllIlIII = Array.getLength(lllllllllllllllIllIlIIIIlllIlIIl);
                int lllllllllllllllIllIlIIIIlllIIlll = lIlIlIlIIIIl[0];
                while (at.llIlllIllIlIlI(lllllllllllllllIllIlIIIIlllIIlll, lllllllllllllllIllIlIIIIlllIlIII)) {
                    String string2;
                    StringBuilder stringBuilder2 = lllllllllllllllIllIlIIIIlllIlllI.append(Array.get(lllllllllllllllIllIlIIIIlllIlIIl, lllllllllllllllIllIlIIIIlllIIlll).toString());
                    if (at.llIlllIllIlIll(lllllllllllllllIllIlIIIIlllIIlll, lllllllllllllllIllIlIIIIlllIlIII - lIlIlIlIIIIl[1])) {
                        string2 = lIlIlIlIIIII[lIlIlIlIIIIl[3]];
                        0;
                        if (null != null) {
                            return null;
                        }
                    } else {
                        string2 = lIlIlIlIIIII[lIlIlIlIIIIl[4]];
                    }
                    stringBuilder2.append(string2);
                    0;
                    ++lllllllllllllllIllIlIIIIlllIIlll;
                    0;
                    if (-3 <= 0) continue;
                    return null;
                }
                lllllllllllllllIllIlIIIIlllIlllI.append(lIlIlIlIIIII[lIlIlIlIIIIl[5]]);
                0;
            }
            if (at.llIlllIllIllII((int)(++lllllllllllllllIllIlIIIIlllIllII), lllllllllllllllIllIlIIIIlllIllIl.size())) {
                string = lIlIlIlIIIII[lIlIlIlIIIIl[6]];
                0;
                if (1 >= 3) {
                    return null;
                }
            } else {
                string = lIlIlIlIIIII[lIlIlIlIIIIl[7]];
            }
            lllllllllllllllIllIlIIIIlllIlllI.append(string);
            0;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(stringBuilder);
    }

    private static boolean llIlllIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIllIlIII(Object object) {
        return object != null;
    }

    private static void llIlllIllIIlll() {
        lIlIlIlIIIIl = new int[9];
        at.lIlIlIlIIIIl[0] = (0x39 ^ 0x22) & ~(0x67 ^ 0x7C);
        at.lIlIlIlIIIIl[1] = 1;
        at.lIlIlIlIIIIl[2] = 2;
        at.lIlIlIlIIIIl[3] = 3;
        at.lIlIlIlIIIIl[4] = 0xFB ^ 0xB7 ^ (0x28 ^ 0x60);
        at.lIlIlIlIIIIl[5] = 0x65 ^ 0x39 ^ (0x63 ^ 0x3A);
        at.lIlIlIlIIIIl[6] = 0x6E ^ 0x68;
        at.lIlIlIlIIIIl[7] = 0x78 ^ 0x7F;
        at.lIlIlIlIIIIl[8] = 0x5A ^ 0x5C ^ (0x7B ^ 0x75);
    }
}

