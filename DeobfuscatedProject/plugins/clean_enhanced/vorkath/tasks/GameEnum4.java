/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

import java.util.ArrayList;
import java.util.List;

public final class GameEnum4
extends Enum<l> {
    public static final  /* enum */ l ANTI_VENOM;
    
    private final  String name;
    public static final  /* enum */ l ANTI_VENOM_PLUS;
    
    public static final  /* enum */ l CURE_SELF;
    private final  List<Integer> items;
    public static final  /* enum */ l IGNORE;
    public static final  /* enum */ l ANTI_DOTE;
    private static final  l[] $VALUES;
    public static final  /* enum */ l ANTI_POISON;

    static {
        l.var3();
        l.var4();
        int[] nArray = new int[var1[3]];
        nArray[l.var1[0]] = var1[4];
        nArray[l.var1[1]] = var1[5];
        nArray[l.var1[2]] = var1[6];
        nArray[l.var1[7]] = var1[8];
        ANTI_VENOM_PLUS = new GameEnum4(var2[var1[2]], nArray);
        int[] nArray2 = new int[var1[3]];
        nArray2[l.var1[0]] = var1[9];
        nArray2[l.var1[1]] = var1[10];
        nArray2[l.var1[2]] = var1[11];
        nArray2[l.var1[7]] = var1[12];
        ANTI_VENOM = new GameEnum4(var2[var1[3]], nArray2);
        int[] nArray3 = new int[var1[2]];
        nArray3[l.var1[0]] = var1[15];
        nArray3[l.var1[1]] = var1[16];
        ANTI_DOTE = new GameEnum4(var2[var1[14]], nArray3);
        int[] nArray4 = new int[var1[2]];
        nArray4[l.var1[0]] = var1[19];
        nArray4[l.var1[1]] = var1[20];
        ANTI_POISON = new GameEnum4(var2[var1[18]], nArray4);
        int[] nArray5 = new int[var1[2]];
        nArray5[l.var1[0]] = var1[22];
        nArray5[l.var1[1]] = var1[23];
        CURE_SELF = new GameEnum4(nArray5);
        IGNORE = new GameEnum4(new int[var1[0]]);
        l[] lArray = new l[var1[14]];
        lArray[l.var1[0]] = ANTI_VENOM_PLUS;
        lArray[l.var1[1]] = ANTI_VENOM;
        lArray[l.var1[2]] = ANTI_DOTE;
        lArray[l.var1[7]] = ANTI_POISON;
        lArray[l.var1[3]] = CURE_SELF;
        lArray[l.var1[13]] = IGNORE;
        $VALUES = lArray;
    }

    public String M() {
        return this.name;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (l.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var2 = new String[var1[25]];
        l.var2[l.var1[0]] = l.var5("", "szBRv");
        l.var2[l.var1[1]] = "ANTI_VENOM_PLUS";
        l.var2[l.var1[2]] = "Anti-venom";
        l.var2[l.var1[7]] = "ANTI_VENOM";
        l.var2[l.var1[3]] = "Anti-venom";
        l.var2[l.var1[13]] = "ANTI_DOTE";
        l.var2[l.var1[14]] = "Antidote";
        l.var2[l.var1[17]] = "ANTI_POISON";
        l.var2[l.var1[18]] = "Antipoison";
        l.var2[l.var1[21]] = "CURE_SELF";
        l.var2[l.var1[24]] = "IGNORE";
    }

    public List<Integer> P() {
        return this.items;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var1 = new int[26];
        l.var1[0] = (14 + 109 - 77 + 96 ^ 24 + 100 - -34 + 41) & (0x2A ^ 0x1F ^ (0x3E ^ 0x42) ^ -1);
        l.var1[1] = 1;
        l.var1[2] = 2;
        l.var1[3] = 0x61 ^ 0x32 ^ (0xEF ^ 0xB8);
        l.var1[4] = -(0xFFFFBFEB & 0x451F) & (0xFFFFB77F & 0x7FFB);
        l.var1[5] = 0xFFFFB6FF & 0x7B73;
        l.var1[6] = 0xFFFFB775 & 0x7AFF;
        l.var1[7] = 3;
        l.var1[8] = -(0xFFFFCEAF & 0x7DD9) & (0xFFFFFEFF & Short.MAX_VALUE);
        l.var1[9] = 0xFFFFF7F9 & 0x3A6F;
        l.var1[10] = -(0xFFFFCBCD & 0x3D33) & (0xFFFFBFFF & 0x7B6F);
        l.var1[11] = -(0xFFFFB7CB & 0x4CB5) & (0xFFFFB7ED & 0x7EFF);
        l.var1[12] = -(0xFFFFEAFF & 0x5D95) & (0xFFFFFAFF & Short.MAX_VALUE);
        l.var1[13] = 0x90 ^ 0x95;
        l.var1[14] = 0x2D ^ 0x2B;
        l.var1[15] = 0xFFFFD7B7 & 0x3F7F;
        l.var1[16] = 0xFFFFF7DB & 0x1F64;
        l.var1[17] = 0xAB ^ 0xAC;
        l.var1[18] = 0x70 ^ 0x78;
        l.var1[19] = -(0xFFFFB77F & 0x58EE) & (0xFFFFDDFD & 0x3BFF);
        l.var1[20] = -(0xFFFF9FF6 & 0x626B) & (0xFFFFEFEF & 0x1BFF);
        l.var1[21] = 0x6C ^ 0x71 ^ (0x8E ^ 0x9A);
        l.var1[22] = 0xFFFFF9F7 & 0x37FF;
        l.var1[23] = 0xFFFFEEBF & 0x7BD1;
        l.var1[24] = 121 + 91 - 70 + 64 ^ 151 + 176 - 238 + 107;
        l.var1[25] = 0x56 ^ 0x5D;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private GameEnum4(int ... nArray) {
        this(var2[var1[0]], nArray);
    }

    /*
     * WARNING - void declaration
     */
    private GameEnum4(String string2, int ... nArray) {
        void var28;
        this.name = string2;
        this.items = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var29 = var1[0];
        while (l.var14(var29, (int)var28)) {
            l var30;
            void var31;
            void var32 = var31[var29];
            var30.items.add((int)var32);
            0;
            ++var29;
            0;
            if ((0x36 ^ 0x32) > 0) continue;
            throw null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }
}

