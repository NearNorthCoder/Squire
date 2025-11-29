/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.util.List;

public final class GameEnum12
extends Enum<e> {
    public static final  /* enum */ e NECTAR;
    
    private final  List<Integer> ids;
    public static final  /* enum */ e SILK_DRESSING;
    
    public static final  /* enum */ e BLESSED_CRYSTAL_SCARAB;
    public static final  /* enum */ e TEARS_OF_ELIDINIS;
    public static final  /* enum */ e SMELLING_SALTS;
    public static final  /* enum */ e LIQUID_ADRENALINE;
    private static final  e[] $VALUES;
    public static final  /* enum */ e AMBROSIA;

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        void var3;
        e[] eArray = e.values();
        int n3 = eArray.length;
        int var4 = var2[0];
        while (e.var5(var4, (int)var3)) {
            int var6;
            void var7;
            void var8 = var7[var4];
            if (e.var9(var8.p().contains(var6) ? 1 : 0)) {
                return var8;
            }
            ++var4;
            0;
            if null == null continue;
            return null;
        }
        return null;
    }

    private static void var10() {
        var2 = new int[27];
        e.var2[0] = (0x83 ^ 0x8E) & ~(0xCC ^ 0xC1);
        e.var2[1] = 0xFFFFEFBF & 0x7AFF;
        e.var2[2] = -1 & (0xFFFFEAC3 & 0x7FFD);
        e.var2[3] = 0xFFFFEEE7 & 0x7BDB;
        e.var2[4] = -(0xFFFFD46F & 0x3F9B) & (0xFFFFFECF & Short.MAX_VALUE);
        e.var2[5] = 1;
        e.var2[6] = 0xFFFFEFFB & 0x7AB7;
        e.var2[7] = 0xFFFFEBF5 & 0x7EBF;
        e.var2[8] = 0xFFFFFBF7 & 0x6EBF;
        e.var2[9] = -(0xFFFFF84F & 0x17F5) & (0xFFFFFBFF & 0x7EFD);
        e.var2[10] = 2;
        e.var2[11] = -(0xFFFFBDFD & 0x5603) & (0xFFFFFEFF & 0x7FCF);
        e.var2[12] = 0xFFFFFAF7 & 0x6FD9;
        e.var2[13] = 3;
        e.var2[14] = -(0xFFFFD015 & 0x3FFF) & (0xFFFFFBFF & 0x7EDF);
        e.var2[15] = 0xFFFFFFFF & 0x6ACD;
        e.var2[16] = 90 + 125 - 154 + 133 ^ 107 + 79 - 162 + 174;
        e.var2[17] = -(0xFFFFB777 & 0x5CA9) & (0xFFFFFEF3 & Short.MAX_VALUE);
        e.var2[18] = -(0xFFFF9C6F & 0x77B9) & (0xFFFFFFFF & 0x7EFD);
        e.var2[19] = 0x70 ^ 0x75;
        e.var2[20] = 0xFFFFEBCF & 0x7EF7;
        e.var2[21] = 0xFFFFEBFF & 0x7EC9;
        e.var2[22] = 0x96 ^ 0x90;
        e.var2[23] = 0xFFFFFEBB & 0x6BFF;
        e.var2[24] = -(0xFFFFC95B & 0x37A7) & (0xFFFFEBBF & Short.MAX_VALUE);
        e.var2[25] = 0x94 ^ 0x93;
        e.var2[26] = 0x6D ^ 0x65;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private GameEnum12(List<Integer> list) {
        this.ids = list;
    }

    public boolean d(int n2) {
        return this.ids.contains(n2);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.var10();
        e.var11();
        TEARS_OF_ELIDINIS = new GameEnum12(List.of(Integer.valueOf(var2[1]), Integer.valueOf(var2[2]), Integer.valueOf(var2[3]), Integer.valueOf(var2[4])));
        NECTAR = new GameEnum12(List.of(Integer.valueOf(var2[6]), Integer.valueOf(var2[7]), Integer.valueOf(var2[8]), Integer.valueOf(var2[9])));
        SMELLING_SALTS = new GameEnum12(List.of(Integer.valueOf(var2[11]), Integer.valueOf(var2[12])));
        LIQUID_ADRENALINE = new GameEnum12(List.of(Integer.valueOf(var2[14]), Integer.valueOf(var2[15])));
        AMBROSIA = new GameEnum12(List.of(Integer.valueOf(var2[17]), Integer.valueOf(var2[18])));
        BLESSED_CRYSTAL_SCARAB = new GameEnum12(List.of(Integer.valueOf(var2[20]), Integer.valueOf(var2[21])));
        SILK_DRESSING = new GameEnum12(List.of(Integer.valueOf(var2[23]), Integer.valueOf(var2[24])));
        e[] eArray = new e[var2[25]];
        eArray[e.var2[0]] = TEARS_OF_ELIDINIS;
        eArray[e.var2[5]] = NECTAR;
        eArray[e.var2[10]] = SMELLING_SALTS;
        eArray[e.var2[13]] = LIQUID_ADRENALINE;
        eArray[e.var2[16]] = AMBROSIA;
        eArray[e.var2[19]] = BLESSED_CRYSTAL_SCARAB;
        eArray[e.var2[22]] = SILK_DRESSING;
        $VALUES = eArray;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (e.var5(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var21);
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var1 = new String[var2[25]];
        e.var1[e.var2[0]] = "TEARS_OF_ELIDINIS";
        e.var1[e.var2[5]] = "NECTAR";
        e.var1[e.var2[10]] = "SMELLING_SALTS";
        e.var1[e.var2[13]] = "LIQUID_ADRENALINE";
        e.var1[e.var2[16]] = "AMBROSIA";
        e.var1[e.var2[19]] = "BLESSED_CRYSTAL_SCARAB";
        e.var1[e.var2[22]] = "SILK_DRESSING";
    }

    public List<Integer> p() {
        return this.ids;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }
}

