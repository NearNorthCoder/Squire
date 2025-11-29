/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum
extends Enum<a> {
    private final  int plankCost;
    public static final  /* enum */ a TEAK;
    public static final  /* enum */ a NORMAL;
    public static final  /* enum */ a MAHOGANY;
    private final  int plankID;
    private final  int itemID;
    
    public static final  /* enum */ a OAK;
    private static final  a[] $VALUES;

    private static boolean var3(int n, int n2) {
        return n < n2;
    }

    static {
        a.var4();
        a.var5();
        NORMAL = new GameEnum(var1[1], var1[2], var1[3]);
        OAK = new GameEnum(var1[5], var1[6], var1[7]);
        TEAK = new GameEnum(var1[9], var1[10], var1[11]);
        MAHOGANY = new GameEnum(var1[13], var1[14], var1[15]);
        a[] aArray = new a[var1[16]];
        aArray[a.var1[0]] = NORMAL;
        aArray[a.var1[4]] = OAK;
        aArray[a.var1[8]] = TEAK;
        aArray[a.var1[12]] = MAHOGANY;
        $VALUES = aArray;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void var5() {
        var2 = new String[var1[16]];
        a.var2[a.var1[0]] = "NORMAL";
        a.var2[a.var1[4]] = "OAK";
        a.var2[a.var1[8]] = "TEAK";
        a.var2[a.var1[12]] = "MAHOGANY";
    }

    private static void var4() {
        var1 = new int[18];
        a.var1[0] = (0xC2 ^ 0xA6 ^ (0x11 ^ 0x3F)) & (81 + 160 - 203 + 154 ^ 60 + 29 - -25 + 24 ^ -1);
        a.var1[1] = -(0xFFFF9721 & 0x78DF) & (0xFFFFF5E7 & 0x1FFF);
        a.var1[2] = -(0xFFFFB846 & 0x77BF) & (0xFFFFFB6D & 0x3DF7);
        a.var1[3] = -(0xFFFFD6FC & 0x7D2F) & (0xFFFFFFFF & 0x57EB);
        a.var1[4] = 1;
        a.var1[5] = -(0xFFFFBE9B & 0x7B6F) & (0xFFFFFFFB & 0x3FFF);
        a.var1[6] = -(0xFFFFE4F7 & 0x7B8F) & (0xFFFFF7FE & 0x7FF7);
        a.var1[7] = -(0xFFFFE337 & 0x5DFE) & (0xFFFFF37F & 0x6FFF);
        a.var1[8] = 2;
        a.var1[9] = -(0xFFFFFD3F & 0x66C3) & (0xFFFFFEFF & 0x7DBF);
        a.var1[10] = 0xFFFFAEFF & 0x7FE0;
        a.var1[11] = 0xFFFFBBDD & 0x666E;
        a.var1[12] = 3;
        a.var1[13] = -(0xFFFFCDAD & 0x7253) & (0xFFFFD9BC & 0x7EFF);
        a.var1[14] = -(0xFFFFE1FE & 0x7F5B) & (0xFFFFEFF9 & 0xFDFF);
        a.var1[15] = 0xFFFFBE6F & 0x63DE;
        a.var1[16] = 0x36 ^ 0x18 ^ (0x51 ^ 0x7B);
        a.var1[17] = 0xA8 ^ 0xA0;
    }

    private GameEnum(int n2, int n3, int n4) {
        this.itemID = n2;
        this.plankCost = n3;
        this.plankID = n4;
    }

    public int e() {
        return this.plankCost;
    }

    public int f() {
        return this.plankID;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (a.var3(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public int d() {
        return this.itemID;
    }
}

