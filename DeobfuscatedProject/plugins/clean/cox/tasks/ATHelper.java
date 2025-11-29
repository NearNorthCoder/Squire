/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

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

public class ATHelper {
    
    private final  HashMap<String, Object> dr;

    static {
        at.llIlllIllIIlll();
        at.llIlllIllIIllI();
    }

    private static void llIlllIllIIllI() {
        lIlIlIlIIIII = new String[lIlIlIlIIIIl[8]];
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[0]] = "{";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[1]] = ":";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[2]] = "[";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[3]] = ",";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[4]] = at.llIlllIllIIIll("4ZrLuNUvf5M=", "jjcDX");
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[5]] = "]";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[6]] = "}";
        at.lIlIlIlIIIII[at.lIlIlIlIIIIl[7]] = ",";
    }

    private static boolean llIlllIllIlIll(int n2, int n3) {
        return n2 != n3;
    }

    void a(String string, Object object) {
        if (at.llIlllIllIlIII(object)) {
            this.dr.put(string, object);

        }
    }

    private static boolean llIlllIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public ATHelper() {
        this.dr = new HashMap();
    }

    private String k(String string) {
        return "\"" + string + "\"";
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<String, Object>> set = this.dr.entrySet();
        stringBuilder.append(lIlIlIlIIIII[lIlIlIlIIIIl[0]]);

        int n2 = lIlIlIlIIIIl[0];
        Iterator<Map.Entry<String, Object>> var2 = set.iterator();
        while (at.llIlllIllIlIIl(var2.hasNext() ? 1 : 0)) {
            String string;
            void var3;
            void var4;
            at var5;
            void var6;
            Map.Entry<String, Object> var7 = var2.next();
            Object var8 = var7.getValue();
            var6.append(var5.k(var7.getKey())).append(lIlIlIlIIIII[lIlIlIlIIIIl[1]]);

            if (at.llIlllIllIlIIl(var8 instanceof String)) {
                var6.append(var5.k(String.valueOf(var8)));

                if (3 <= ((0x48 ^ 0x28) & ~(0xC ^ 0x6C))) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var8 instanceof Integer)) {
                var6.append(Integer.valueOf(String.valueOf(var8)));

                if (3 < 0) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var8 instanceof Boolean)) {
                var6.append(var8);

                if ((0x28 ^ 0x2C) <= ((8 ^ 0x12) & ~(0x88 ^ 0x92))) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var8 instanceof at)) {
                var6.append(var8.toString());

                if (2 < 0) {
                    return null;
                }
            } else if (at.llIlllIllIlIIl(var8.getClass().isArray() ? 1 : 0)) {
                var6.append(lIlIlIlIIIII[lIlIlIlIIIIl[2]]);

                int var9 = Array.getLength(var8);
                int var10 = lIlIlIlIIIIl[0];
                while (at.llIlllIllIlIlI(var10, var9)) {
                    String string2;
                    StringBuilder stringBuilder2 = var6.append(Array.get(var8, var10).toString());
                    if (at.llIlllIllIlIll(var10, var9 - lIlIlIlIIIIl[1])) {
                        string2 = lIlIlIlIIIII[lIlIlIlIIIIl[3]];

                        }
                    } else {
                        string2 = lIlIlIlIIIII[lIlIlIlIIIIl[4]];
                    }
                    stringBuilder2.append(string2);

                    ++var10;

                    if (-3 <= 0) continue;
                    return null;
                }
                var6.append(lIlIlIlIIIII[lIlIlIlIIIIl[5]]);

            }
            if (at.llIlllIllIllII((int)(++var4), var3.size())) {
                string = lIlIlIlIIIII[lIlIlIlIIIIl[6]];

                if (1 >= 3) {
                    return null;
                }
            } else {
                string = lIlIlIlIIIII[lIlIlIlIIIIl[7]];
            }
            var6.append(string);

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

}

