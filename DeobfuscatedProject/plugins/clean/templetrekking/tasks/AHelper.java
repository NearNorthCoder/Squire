/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.templetrekking.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AHelper {
    static final  int o;

    private static boolean lIllIIIIllIllIl(int n2) {
        return n2 != 0;
    }

    public static boolean AHelper(int[][] nArray, int n2, int n3, int[][] nArray2) {
        int n4;
        if (a.lIllIIIIllIlIlI(n2) && a.lIllIIIIllIlIIl(n2, lIIllIlIlIllI[1]) && a.lIllIIIIllIlIlI(n3) && a.lIllIIIIllIlIIl(n3, lIIllIlIlIllI[1]) && a.lIllIIIIllIlIll(nArray[n2][n3], lIIllIlIlIllI[2]) && a.lIllIIIIllIllII(nArray2[n2][n3])) {
            n4 = lIIllIlIlIllI[2];

            }
        } else {
            n4 = lIIllIlIlIllI[4];
        }
        return n4 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] AHelper(int[][] nArray) {
        int[][] nArray2 = new int[lIIllIlIlIllI[0]][lIIllIlIlIllI[1]];
        int var1 = lIIllIlIlIllI[2];
        while (a.lIllIIIIllIlIIl(var1, lIIllIlIlIllI[3])) {
            void var2;
            int[][] var3;
            System.arraycopy(var3[var1], lIIllIlIlIllI[4], var2[var1 - lIIllIlIlIllI[2]], lIIllIlIlIllI[4], lIIllIlIlIllI[1]);
            ++var1;

            return null;
        }
        return nArray2;
    }

    private static boolean lIllIIIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static int[][] b(int[][] nArray) {
        int[][] nArray2 = new int[lIIllIlIlIllI[1]][lIIllIlIlIllI[1]];
        int[][] nArray3 = new int[lIIllIlIlIllI[1]][lIIllIlIlIllI[1]];
        if (a.lIllIIIIllIllII(a.AHelper(nArray, lIIllIlIlIllI[4], lIIllIlIlIllI[4], nArray2, nArray3) ? 1 : 0)) {
            System.out.print(lIIllIlIlIlIl[lIIllIlIlIllI[4]]);
            return new int[lIIllIlIlIllI[0]][lIIllIlIlIllI[1]];
        }
        return a.AHelper(nArray2);
    }

    private static void lIllIIIIllIIlll() {
        lIIllIlIlIlIl = new String[lIIllIlIlIllI[2]];
        a.lIIllIlIlIlIl[a.lIIllIlIlIllI[4]] = "Solution doesn't exist";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean AHelper(int[][] nArray, int n2, int n3, int[][] nArray2, int[][] nArray3) {
        void var4;
        void var5;
        void var6;
        int[][] var7;
        if (a.lIllIIIIllIlIll(n2, lIIllIlIlIllI[5]) && a.lIllIIIIllIlIll(n3, lIIllIlIlIllI[5]) && a.lIllIIIIllIlIll(nArray[n2][n3], lIIllIlIlIllI[2])) {
            nArray2[n2][n3] = lIIllIlIlIllI[2];
            return lIIllIlIlIllI[2];
        }
        if (a.lIllIIIIllIllIl(a.AHelper(var7, (int)var6, (int)var5, (int[][])var4) ? 1 : 0)) {
            void var8;
            var8[var6][var5] = lIIllIlIlIllI[2];
            var4[var6][var5] = lIIllIlIlIllI[2];
            if (a.lIllIIIIllIllIl(a.AHelper(var7, (int)var6, (int)(var5 + lIIllIlIlIllI[2]), (int[][])var8, (int[][])var4) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            if (a.lIllIIIIllIllIl(a.AHelper(var7, (int)(var6 + lIIllIlIlIllI[2]), (int)var5, (int[][])var8, (int[][])var4) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            if (a.lIllIIIIllIllIl(a.AHelper(var7, (int)(var6 - lIIllIlIlIllI[2]), (int)var5, (int[][])var8, (int[][])var4) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            if (a.lIllIIIIllIllIl(a.AHelper(var7, (int)var6, (int)(var5 - lIIllIlIlIllI[2]), (int[][])var8, (int[][])var4) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            var8[var6][var5] = lIIllIlIlIllI[4];
            return lIIllIlIlIllI[4];
        }
        return lIIllIlIlIllI[4];
    }

    private static boolean lIllIIIIllIlIlI(int n2) {
        return n2 >= 0;
    }

    static {
        a.lIllIIIIllIlIII();
        a.lIllIIIIllIIlll();
        o = lIIllIlIlIllI[1];
    }

    private static boolean lIllIIIIllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIllIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

