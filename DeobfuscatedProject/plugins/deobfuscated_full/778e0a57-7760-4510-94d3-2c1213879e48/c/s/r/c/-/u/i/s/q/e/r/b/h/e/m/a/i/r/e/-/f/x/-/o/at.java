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

    private static String llIlllIllIIlII(String var21, String var8) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIlIlIIIIl[2], var15);
            return new String(var12.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
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

    private static String llIlllIllIIIll(String var19, String var26) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIIl[8]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIlIlIIIIl[2], var4);
            return new String(var9.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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

    private static String llIlllIllIIlIl(String var23, String var1) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var3 = var1.toCharArray();
        int var5 = lIlIlIlIIIIl[0];
        char[] var11 = var23.toCharArray();
        int var7 = var11.length;
        int var10 = lIlIlIlIIIIl[0];
        while (at.llIlllIllIlIlI(var10, var7)) {
            char var13 = var11[var10];
            var28.append((char)(var13 ^ var3[var5 % var3.length]));
            0;
            ++var5;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var28);
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
        Iterator<Map.Entry<String, Object>> var18 = set.iterator();
        while (at.llIlllIllIlIIl(var18.hasNext() ? 1 : 0)) {
            String string;
            void var20;
            void var17;
            at var14;
            void var16;
            Map.Entry<String, Object> var27 = var18.next();
            Object var22 = var27.getValue();
            var16.append(var14.k(var27.getKey())).append(lIlIlIlIIIII[lIlIlIlIIIIl[1]]);
            0;
            if (at.llIlllIllIlIIl(var22 instanceof String)) {
                var16.append(var14.k(String.valueOf(var22)));
                0;
                0;
                if (3 <= ((0x48 ^ 0x28) & ~(0xC ^ 0x6C))) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var22 instanceof Integer)) {
                var16.append(Integer.valueOf(String.valueOf(var22)));
                0;
                0;
                if (3 < 0) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var22 instanceof Boolean)) {
                var16.append(var22);
                0;
                0;
                if ((0x28 ^ 0x2C) <= ((8 ^ 0x12) & ~(0x88 ^ 0x92))) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var22 instanceof at)) {
                var16.append(var22.toString());
                0;
                0;
                if (2 < 0) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var22.getClass().isArray() ? 1 : 0)) {
                var16.append(lIlIlIlIIIII[lIlIlIlIIIIl[2]]);
                0;
                int var24 = Array.getLength(var22);
                int var2 = lIlIlIlIIIIl[0];
                while (at.llIlllIllIlIlI(var2, var24)) {
                    String string2;
                    StringBuilder stringBuilder2 = var16.append(Array.get(var22, var2).toString());
                    if (at.llIlllIllIlIll(var2, var24 - lIlIlIlIIIIl[1])) {
                        string2 = lIlIlIlIIIII[lIlIlIlIIIIl[3]];
                        0;
                        
                        }
                    } else {
                        string2 = lIlIlIlIIIII[lIlIlIlIIIIl[4]];
                    }
                    stringBuilder2.append(string2);
                    0;
                    ++var2;
                    0;
                    if (-3 <= 0) continue;
                    return null;
                }
                var16.append(lIlIlIlIIIII[lIlIlIlIIIIl[5]]);
                0;
            }
            if (at.llIlllIllIllII((int)(++var17), var20.size())) {
                string = lIlIlIlIIIII[lIlIlIlIIIIl[6]];
                0;
                if (1 >= 3) {
                    return null;
                }
            } else {
                string = lIlIlIlIIIII[lIlIlIlIIIIl[7]];
            }
            var16.append(string);
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

