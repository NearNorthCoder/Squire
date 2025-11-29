/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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

public class L {
    private final /* synthetic */ HashMap<String, Object> bE;
    private static /* synthetic */ int[] llIllIlIlII;
    private static /* synthetic */ String[] llIllIlIIll;

    private static void lIlIlIIlllIlIl() {
        llIllIlIIll = new String[llIllIlIlII[8]];
        L.llIllIlIIll[L.llIllIlIlII[0]] = L."{";
        L.llIllIlIIll[L.llIllIlIlII[1]] = L.":";
        L.llIllIlIIll[L.llIllIlIlII[2]] = L."[";
        L.llIllIlIIll[L.llIllIlIlII[3]] = L.",";
        L.llIllIlIIll[L.llIllIlIlII[4]] = L."";
        L.llIllIlIIll[L.llIllIlIlII[5]] = L."]";
        L.llIllIlIIll[L.llIllIlIlII[6]] = L."}";
        L.llIllIlIIll[L.llIllIlIlII[7]] = L.",";
    }

    private static boolean lIlIlIIllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIlllIlll(Object object) {
        return object != null;
    }

    private static String lIlIlIIlllIlII(String llllllllllllllllIIlIllIlIlIIIIlI, String llllllllllllllllIIlIllIlIlIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIlIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), llIllIlIlII[8]), "DES");
            Cipher llllllllllllllllIIlIllIlIlIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIlIlIIIllI.init(llIllIlIlII[2], llllllllllllllllIIlIllIlIlIIIlll);
            return new String(llllllllllllllllIIlIllIlIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIlIlIIIlIl) {
            llllllllllllllllIIlIllIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIlllIIll(String llllllllllllllllIIlIllIlIlIlIIIl, String llllllllllllllllIIlIllIlIlIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIlIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIlIlIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIlIlIlIIll.init(llIllIlIlII[2], llllllllllllllllIIlIllIlIlIlIlII);
            return new String(llllllllllllllllIIlIllIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIlIlIlIIlI) {
            llllllllllllllllIIlIllIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    static {
        L.lIlIlIIlllIllI();
        L.lIlIlIIlllIlIl();
    }

    private static boolean lIlIlIIllllIll(int n2, int n3) {
        return n2 == n3;
    }

    public L() {
        this.bE = new HashMap();
    }

    private String i(String string) {
        return "\"" + string + "\"";
    }

    private static String lIlIlIIlllIIlI(String llllllllllllllllIIlIllIlIIlIllll, String llllllllllllllllIIlIllIlIIllIIll) {
        llllllllllllllllIIlIllIlIIlIllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIlIIllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIllIlIIllIIIl = llllllllllllllllIIlIllIlIIllIIll.toCharArray();
        int llllllllllllllllIIlIllIlIIllIIII = llIllIlIlII[0];
        char[] llllllllllllllllIIlIllIlIIlIlIlI = llllllllllllllllIIlIllIlIIlIllll.toCharArray();
        int llllllllllllllllIIlIllIlIIlIlIIl = llllllllllllllllIIlIllIlIIlIlIlI.length;
        int llllllllllllllllIIlIllIlIIlIlIII = llIllIlIlII[0];
        while (L.lIlIlIIllllIIl(llllllllllllllllIIlIllIlIIlIlIII, llllllllllllllllIIlIllIlIIlIlIIl)) {
            char llllllllllllllllIIlIllIlIIllIlIl = llllllllllllllllIIlIllIlIIlIlIlI[llllllllllllllllIIlIllIlIIlIlIII];
            llllllllllllllllIIlIllIlIIllIIlI.append((char)(llllllllllllllllIIlIllIlIIllIlIl ^ llllllllllllllllIIlIllIlIIllIIIl[llllllllllllllllIIlIllIlIIllIIII % llllllllllllllllIIlIllIlIIllIIIl.length]));
            0;
            ++llllllllllllllllIIlIllIlIIllIIII;
            ++llllllllllllllllIIlIllIlIIlIlIII;
            0;
            if (((0xAE ^ 0xB0) & ~(0x57 ^ 0x49)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIllIlIIllIIlI);
    }

    void a(String string, Object object) {
        if (L.lIlIlIIlllIlll(object)) {
            this.bE.put(string, object);
            0;
        }
    }

    private static boolean lIlIlIIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<String, Object>> set = this.bE.entrySet();
        stringBuilder.append(llIllIlIIll[llIllIlIlII[0]]);
        0;
        int n2 = llIllIlIlII[0];
        Iterator<Map.Entry<String, Object>> llllllllllllllllIIlIllIlIlIlllIl = set.iterator();
        while (L.lIlIlIIllllIII(llllllllllllllllIIlIllIlIlIlllIl.hasNext() ? 1 : 0)) {
            String string;
            void llllllllllllllllIIlIllIlIlIlllll;
            void llllllllllllllllIIlIllIlIlIllllI;
            L llllllllllllllllIIlIllIlIllIIIIl;
            void llllllllllllllllIIlIllIlIllIIIII;
            Map.Entry<String, Object> llllllllllllllllIIlIllIlIlIlllII = llllllllllllllllIIlIllIlIlIlllIl.next();
            Object llllllllllllllllIIlIllIlIlIllIll = llllllllllllllllIIlIllIlIlIlllII.getValue();
            llllllllllllllllIIlIllIlIllIIIII.append(llllllllllllllllIIlIllIlIllIIIIl.i(llllllllllllllllIIlIllIlIlIlllII.getKey())).append(llIllIlIIll[llIllIlIlII[1]]);
            0;
            if (L.lIlIlIIllllIII(llllllllllllllllIIlIllIlIlIllIll instanceof String)) {
                llllllllllllllllIIlIllIlIllIIIII.append(llllllllllllllllIIlIllIlIllIIIIl.i(String.valueOf(llllllllllllllllIIlIllIlIlIllIll)));
                0;
                0;
                if (null != null) {
                    return null;
                }
            } else if (L.lIlIlIIllllIII(llllllllllllllllIIlIllIlIlIllIll instanceof Integer)) {
                llllllllllllllllIIlIllIlIllIIIII.append(Integer.valueOf(String.valueOf(llllllllllllllllIIlIllIlIlIllIll)));
                0;
                0;
                if (null != null) {
                    return null;
                }
            } else if (L.lIlIlIIllllIII(llllllllllllllllIIlIllIlIlIllIll instanceof Boolean)) {
                llllllllllllllllIIlIllIlIllIIIII.append(llllllllllllllllIIlIllIlIlIllIll);
                0;
                0;
                if (2 == 0) {
                    return null;
                }
            } else if (L.lIlIlIIllllIII(llllllllllllllllIIlIllIlIlIllIll instanceof L)) {
                llllllllllllllllIIlIllIlIllIIIII.append(llllllllllllllllIIlIllIlIlIllIll.toString());
                0;
                0;
                if (1 == 0) {
                    return null;
                }
            } else if (L.lIlIlIIllllIII(llllllllllllllllIIlIllIlIlIllIll.getClass().isArray() ? 1 : 0)) {
                llllllllllllllllIIlIllIlIllIIIII.append(llIllIlIIll[llIllIlIlII[2]]);
                0;
                int llllllllllllllllIIlIllIlIlIllIlI = Array.getLength(llllllllllllllllIIlIllIlIlIllIll);
                int llllllllllllllllIIlIllIlIlIllIIl = llIllIlIlII[0];
                while (L.lIlIlIIllllIIl(llllllllllllllllIIlIllIlIlIllIIl, llllllllllllllllIIlIllIlIlIllIlI)) {
                    String string2;
                    StringBuilder stringBuilder2 = llllllllllllllllIIlIllIlIllIIIII.append(Array.get(llllllllllllllllIIlIllIlIlIllIll, llllllllllllllllIIlIllIlIlIllIIl).toString());
                    if (L.lIlIlIIllllIlI(llllllllllllllllIIlIllIlIlIllIIl, llllllllllllllllIIlIllIlIlIllIlI - llIllIlIlII[1])) {
                        string2 = llIllIlIIll[llIllIlIlII[3]];
                        0;
                        if (2 <= 0) {
                            return null;
                        }
                    } else {
                        string2 = llIllIlIIll[llIllIlIlII[4]];
                    }
                    stringBuilder2.append(string2);
                    0;
                    ++llllllllllllllllIIlIllIlIlIllIIl;
                    0;
                    if (1 <= (0xE6 ^ 0xC0 ^ (0x42 ^ 0x60))) continue;
                    return null;
                }
                llllllllllllllllIIlIllIlIllIIIII.append(llIllIlIIll[llIllIlIlII[5]]);
                0;
            }
            if (L.lIlIlIIllllIll((int)(++llllllllllllllllIIlIllIlIlIllllI), llllllllllllllllIIlIllIlIlIlllll.size())) {
                string = llIllIlIIll[llIllIlIlII[6]];
                0;
                if (-1 >= 0) {
                    return null;
                }
            } else {
                string = llIllIlIIll[llIllIlIlII[7]];
            }
            llllllllllllllllIIlIllIlIllIIIII.append(string);
            0;
            0;
            if (1 < (0x1D ^ 0x19)) continue;
            return null;
        }
        return String.valueOf(stringBuilder);
    }

    private static void lIlIlIIlllIllI() {
        llIllIlIlII = new int[9];
        L.llIllIlIlII[0] = (0x66 ^ 0x41 ^ (0x3A ^ 0x37)) & (28 + 71 - 42 + 105 ^ 73 + 7 - 5 + 61 ^ -1);
        L.llIllIlIlII[1] = 1;
        L.llIllIlIlII[2] = 2;
        L.llIllIlIlII[3] = 3;
        L.llIllIlIlII[4] = 0x88 ^ 0x8C;
        L.llIllIlIlII[5] = 0x29 ^ 8 ^ (0x90 ^ 0xB4);
        L.llIllIlIlII[6] = 0xE7 ^ 0xC2 ^ (0x98 ^ 0xBB);
        L.llIllIlIlII[7] = 0x74 ^ 0x11 ^ (0x59 ^ 0x3B);
        L.llIllIlIlII[8] = 0xAC ^ 0xA4;
    }

    private static boolean lIlIlIIllllIlI(int n2, int n3) {
        return n2 != n3;
    }
}

