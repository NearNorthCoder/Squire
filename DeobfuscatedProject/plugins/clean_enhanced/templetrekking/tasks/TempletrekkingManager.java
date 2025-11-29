/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.templetrekking.tasks;

public class TempletrekkingManager {
    static final  int o;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public static boolean TempletrekkingManager(int[][] nArray, int n2, int n3, int[][] nArray2) {
        int n4;
        if (a.var4(n2) && a.var5(n2, var2[1]) && a.var4(n3) && a.var5(n3, var2[1]) && a.var6(nArray[n2][n3], var2[2]) && a.var7(nArray2[n2][n3])) {
            n4 = var2[2];
            0;
            if null != null {
                return ((114 + 84 - 164 + 152 ^ 75 + 34 - 42 + 66) & (0x4D ^ 0x16 ^ (0x63 ^ 7) ^ -1)) != 0;
            }
        } else {
            n4 = var2[4];
        }
        return n4 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] TempletrekkingManager(int[][] nArray) {
        int[][] nArray2 = new int[var2[0]][var2[1]];
        int var8 = var2[2];
        while (a.var5(var8, var2[3])) {
            void var9;
            int[][] var10;
            System.arraycopy(var10[var8], var2[4], var9[var8 - var2[2]], var2[4], var2[1]);
            ++var8;
            0;
            if null == null continue;
            return null;
        }
        return nArray2;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static void var11() {
        var2 = new int[8];
        a.var2[0] = 0x63 ^ 0x14 ^ (0x41 ^ 0x33);
        a.var2[1] = 0x5F ^ 0x70 ^ (0x91 ^ 0xB4);
        a.var2[2] = 1;
        a.var2[3] = 0x92 ^ 0xA7 ^ (0xB8 ^ 0x8B);
        a.var2[4] = ((0x76 ^ 0x60) & ~(0xAA ^ 0xBC) ^ (0x7F ^ 0x66)) & (0x26 ^ 0x15 ^ (0x47 ^ 0x6D) ^ -1);
        a.var2[5] = 0x9F ^ 0x96;
        a.var2[6] = 25 + 99 - 77 + 110 ^ 129 + 68 - 112 + 64;
        a.var2[7] = 2;
    }

    public static int[][] b(int[][] nArray) {
        int[][] nArray2 = new int[var2[1]][var2[1]];
        int[][] nArray3 = new int[var2[1]][var2[1]];
        if (a.var7(a.TempletrekkingManager(nArray, var2[4], var2[4], nArray2, nArray3) ? 1 : 0)) {
            System.out.print(var1[var2[4]]);
            return new int[var2[0]][var2[1]];
        }
        return a.TempletrekkingManager(nArray2);
    }

    private static void var12() {
        var1 = new String[var2[2]];
        a.var1[a.var2[4]] = "Solution doesn't exist";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean TempletrekkingManager(int[][] nArray, int n2, int n3, int[][] nArray2, int[][] nArray3) {
        void var13;
        void var14;
        void var15;
        int[][] var16;
        if (a.var6(n2, var2[5]) && a.var6(n3, var2[5]) && a.var6(nArray[n2][n3], var2[2])) {
            nArray2[n2][n3] = var2[2];
            return var2[2];
        }
        if (a.var3(a.TempletrekkingManager(var16, (int)var15, (int)var14, (int[][])var13) ? 1 : 0)) {
            void var17;
            var17[var15][var14] = var2[2];
            var13[var15][var14] = var2[2];
            if (a.var3(a.TempletrekkingManager(var16, (int)var15, (int)(var14 + var2[2]), (int[][])var17, (int[][])var13) ? 1 : 0)) {
                return var2[2];
            }
            if (a.var3(a.TempletrekkingManager(var16, (int)(var15 + var2[2]), (int)var14, (int[][])var17, (int[][])var13) ? 1 : 0)) {
                return var2[2];
            }
            if (a.var3(a.TempletrekkingManager(var16, (int)(var15 - var2[2]), (int)var14, (int[][])var17, (int[][])var13) ? 1 : 0)) {
                return var2[2];
            }
            if (a.var3(a.TempletrekkingManager(var16, (int)var15, (int)(var14 - var2[2]), (int[][])var17, (int[][])var13) ? 1 : 0)) {
                return var2[2];
            }
            var17[var15][var14] = var2[4];
            return var2[4];
        }
        return var2[4];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var4(int n2) {
        return n2 >= 0;
    }

    static {
        a.var11();
        a.var12();
        o = var2[1];
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }
}

