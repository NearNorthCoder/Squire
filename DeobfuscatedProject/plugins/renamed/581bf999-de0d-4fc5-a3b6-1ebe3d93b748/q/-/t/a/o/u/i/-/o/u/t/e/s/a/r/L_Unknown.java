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

public class L_Unknown {
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

    private static String lIlIlIIlllIlII(String var19, String var20) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llIllIlIlII[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIllIlIlII[2], var27);
            return new String(var8.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIlllIIll(String var28, String var3) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIllIlIlII[2], var2);
            return new String(var4.doFinal(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
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

    private static String lIlIlIIlllIIlI(String var21, String var9) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var26 = var9.toCharArray();
        int var5 = llIllIlIlII[0];
        char[] var24 = var21.toCharArray();
        int var23 = var24.length;
        int var7 = llIllIlIlII[0];
        while (L.lIlIlIIllllIIl(var7, var23)) {
            char var11 = var24[var7];
            var1.append((char)(var11 ^ var26[var5 % var26.length]));
            0;
            ++var5;
            ++var7;
            0;
            if (((0xAE ^ 0xB0) & ~(0x57 ^ 0x49)) == 0) continue;
            return null;
        }
        return String.valueOf(var1);
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
        Iterator<Map.Entry<String, Object>> var17 = set.iterator();
        while (L.lIlIlIIllllIII(var17.hasNext() ? 1 : 0)) {
            String string;
            void var25;
            void var15;
            L var16;
            void var18;
            Map.Entry<String, Object> var10 = var17.next();
            Object var13 = var10.getValue();
            var18.append(var16.i(var10.getKey())).append(llIllIlIIll[llIllIlIlII[1]]);
            0;
            if (L.lIlIlIIllllIII(var13 instanceof String)) {
                var18.append(var16.i(String.valueOf(var13)));
                0;
                0;
                
                }
            } else if (L.lIlIlIIllllIII(var13 instanceof Integer)) {
                var18.append(Integer.valueOf(String.valueOf(var13)));
                0;
                0;
                
                }
            } else if (L.lIlIlIIllllIII(var13 instanceof Boolean)) {
                var18.append(var13);
                0;
                0;
                if (2 == 0) {
                    return null;
                }
            } else if (L.lIlIlIIllllIII(var13 instanceof L)) {
                var18.append(var13.toString());
                0;
                0;
                if (1 == 0) {
                    return null;
                }
            } else if (L.lIlIlIIllllIII(var13.getClass().isArray() ? 1 : 0)) {
                var18.append(llIllIlIIll[llIllIlIlII[2]]);
                0;
                int var12 = Array.getLength(var13);
                int var6 = llIllIlIlII[0];
                while (L.lIlIlIIllllIIl(var6, var12)) {
                    String string2;
                    StringBuilder stringBuilder2 = var18.append(Array.get(var13, var6).toString());
                    if (L.lIlIlIIllllIlI(var6, var12 - llIllIlIlII[1])) {
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
                    ++var6;
                    0;
                    if (1 <= (0xE6 ^ 0xC0 ^ (0x42 ^ 0x60))) continue;
                    return null;
                }
                var18.append(llIllIlIIll[llIllIlIlII[5]]);
                0;
            }
            if (L.lIlIlIIllllIll((int)(++var15), var25.size())) {
                string = llIllIlIIll[llIllIlIlII[6]];
                0;
                if (-1 >= 0) {
                    return null;
                }
            } else {
                string = llIllIlIIll[llIllIlIlII[7]];
            }
            var18.append(string);
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

