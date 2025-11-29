/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mining.tasks;

public final class GameEnum8
extends Enum<h> {
    public static final  /* enum */ h TIN_ORE;
    private final  int oreID;
    public static final  /* enum */ h COPPER_ORE;
    
    public static final  /* enum */ h IRON_ORE;
    
    private static final  h[] $VALUES;
    private final  int[] objectID;

    static {
        h.var3();
        h.var4();
        int[] nArray = new int[var2[2]];
        nArray[h.var2[0]] = var2[3];
        nArray[h.var2[4]] = var2[5];
        COPPER_ORE = new GameEnum8(var2[1], nArray);
        int[] nArray2 = new int[var2[2]];
        nArray2[h.var2[0]] = var2[7];
        nArray2[h.var2[4]] = var2[8];
        TIN_ORE = new GameEnum8(var2[6], nArray2);
        int[] nArray3 = new int[var2[2]];
        nArray3[h.var2[0]] = var2[10];
        nArray3[h.var2[4]] = var2[11];
        IRON_ORE = new GameEnum8(var2[9], nArray3);
        h[] hArray = new h[var2[12]];
        hArray[h.var2[0]] = COPPER_ORE;
        hArray[h.var2[4]] = TIN_ORE;
        hArray[h.var2[2]] = IRON_ORE;
        $VALUES = hArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var1 = new String[var2[12]];
        h.var1[h.var2[0]] = "COPPER_ORE";
        h.var1[h.var2[4]] = "TIN_ORE";
        h.var1[h.var2[2]] = "IRON_ORE";
    }

    public int m() {
        return this.oreID;
    }

    private GameEnum8(int n3, int ... nArray) {
        this.oreID = n3;
        this.objectID = nArray;
    }

    public int[] l() {
        return this.objectID;
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static void var3() {
        var2 = new int[14];
        h.var2[0] = (0xA7 ^ 0xC5) & ~(0xE7 ^ 0x85);
        h.var2[1] = 0xFFFFCDFF & 0x33B4;
        h.var2[2] = 2;
        h.var2[3] = -(0xFFFFD0C7 & 0x7F7D) & (0xFFFFFFFD & 0x7BDF);
        h.var2[4] = 1;
        h.var2[5] = 0xFFFFFBFF & 0x2EBF;
        h.var2[6] = 0xFFFFEBBE & 0x15F7;
        h.var2[7] = 0xFFFFBEE8 & 0x6D77;
        h.var2[8] = 0xFFFFBE71 & 0x6DEF;
        h.var2[9] = -(0xFFFFE36A & 0x3CD7) & (0xFFFFE3FF & 0x3DF9);
        h.var2[10] = -(0xFFFFCB29 & 0x36DF) & (0xFFFFAF7F & 0x7EED);
        h.var2[11] = 0xFFFFAEF7 & 0x7D6C;
        h.var2[12] = 3;
        h.var2[13] = 76 + 2 - -45 + 32 ^ 100 + 6 - 85 + 126;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (h.var17(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

