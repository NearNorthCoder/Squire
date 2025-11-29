/*
 * Decompiled with CFR 0.152.
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class a {
    static final /* synthetic */ int o;
    private static /* synthetic */ String[] lIIllIlIlIlIl;
    private static /* synthetic */ int[] lIIllIlIlIllI;

    private static boolean lIllIIIIllIllIl(int n2) {
        return n2 != 0;
    }

    public static boolean a(int[][] nArray, int n2, int n3, int[][] nArray2) {
        int n4;
        if (a.lIllIIIIllIlIlI(n2) && a.lIllIIIIllIlIIl(n2, lIIllIlIlIllI[1]) && a.lIllIIIIllIlIlI(n3) && a.lIllIIIIllIlIIl(n3, lIIllIlIlIllI[1]) && a.lIllIIIIllIlIll(nArray[n2][n3], lIIllIlIlIllI[2]) && a.lIllIIIIllIllII(nArray2[n2][n3])) {
            n4 = lIIllIlIlIllI[2];
            0;
            
            }
        } else {
            n4 = lIIllIlIlIllI[4];
        }
        return n4 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] a(int[][] nArray) {
        int[][] nArray2 = new int[lIIllIlIlIllI[0]][lIIllIlIlIllI[1]];
        int var8 = lIIllIlIlIllI[2];
        while (a.lIllIIIIllIlIIl(var8, lIIllIlIlIllI[3])) {
            void var2;
            int[][] var7;
            System.arraycopy(var7[var8], lIIllIlIlIllI[4], var2[var8 - lIIllIlIlIllI[2]], lIIllIlIlIllI[4], lIIllIlIlIllI[1]);
            ++var8;
            0;
            
            return null;
        }
        return nArray2;
    }

    private static boolean lIllIIIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIllIlIII() {
        lIIllIlIlIllI = new int[8];
        a.lIIllIlIlIllI[0] = 0x63 ^ 0x14 ^ (0x41 ^ 0x33);
        a.lIIllIlIlIllI[1] = 0x5F ^ 0x70 ^ (0x91 ^ 0xB4);
        a.lIIllIlIlIllI[2] = 1;
        a.lIIllIlIlIllI[3] = 0x92 ^ 0xA7 ^ (0xB8 ^ 0x8B);
        a.lIIllIlIlIllI[4] = ((0x76 ^ 0x60) & ~(0xAA ^ 0xBC) ^ (0x7F ^ 0x66)) & (0x26 ^ 0x15 ^ (0x47 ^ 0x6D) ^ -1);
        a.lIIllIlIlIllI[5] = 0x9F ^ 0x96;
        a.lIIllIlIlIllI[6] = 25 + 99 - 77 + 110 ^ 129 + 68 - 112 + 64;
        a.lIIllIlIlIllI[7] = 2;
    }

    public static int[][] b(int[][] nArray) {
        int[][] nArray2 = new int[lIIllIlIlIllI[1]][lIIllIlIlIllI[1]];
        int[][] nArray3 = new int[lIIllIlIlIllI[1]][lIIllIlIlIllI[1]];
        if (a.lIllIIIIllIllII(a.a(nArray, lIIllIlIlIllI[4], lIIllIlIlIllI[4], nArray2, nArray3) ? 1 : 0)) {
            System.out.print(lIIllIlIlIlIl[lIIllIlIlIllI[4]]);
            return new int[lIIllIlIlIllI[0]][lIIllIlIlIllI[1]];
        }
        return a.a(nArray2);
    }

    private static void lIllIIIIllIIlll() {
        lIIllIlIlIlIl = new String[lIIllIlIlIllI[2]];
        a.lIIllIlIlIlIl[a.lIIllIlIlIllI[4]] = a."Solution doesn't exist";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(int[][] nArray, int n2, int n3, int[][] nArray2, int[][] nArray3) {
        void var11;
        void var13;
        void var1;
        int[][] var9;
        if (a.lIllIIIIllIlIll(n2, lIIllIlIlIllI[5]) && a.lIllIIIIllIlIll(n3, lIIllIlIlIllI[5]) && a.lIllIIIIllIlIll(nArray[n2][n3], lIIllIlIlIllI[2])) {
            nArray2[n2][n3] = lIIllIlIlIllI[2];
            return lIIllIlIlIllI[2];
        }
        if (a.lIllIIIIllIllIl(a.a(var9, (int)var1, (int)var13, (int[][])var11) ? 1 : 0)) {
            void var6;
            var6[var1][var13] = lIIllIlIlIllI[2];
            var11[var1][var13] = lIIllIlIlIllI[2];
            if (a.lIllIIIIllIllIl(a.a(var9, (int)var1, (int)(var13 + lIIllIlIlIllI[2]), (int[][])var6, (int[][])var11) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            if (a.lIllIIIIllIllIl(a.a(var9, (int)(var1 + lIIllIlIlIllI[2]), (int)var13, (int[][])var6, (int[][])var11) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            if (a.lIllIIIIllIllIl(a.a(var9, (int)(var1 - lIIllIlIlIllI[2]), (int)var13, (int[][])var6, (int[][])var11) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            if (a.lIllIIIIllIllIl(a.a(var9, (int)var1, (int)(var13 - lIIllIlIlIllI[2]), (int[][])var6, (int[][])var11) ? 1 : 0)) {
                return lIIllIlIlIllI[2];
            }
            var6[var1][var13] = lIIllIlIlIllI[4];
            return lIIllIlIlIllI[4];
        }
        return lIIllIlIlIllI[4];
    }

    private static String lIllIIIIllIIllI(String var4, String var3) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIllI[6]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIIllIlIlIllI[7], var5);
            return new String(var12.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
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

