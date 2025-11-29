/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

public final class GameEnum5
extends Enum<f> {
    public static final  /* enum */ f VYRE;
    public static final  /* enum */ f ELF;
    public static final  /* enum */ f MAN;
    private static final  f[] $VALUES;

    public static final  /* enum */ f ARDY_KNIGHT;
    private final  String name;
    public static final  /* enum */ f MASTER_FARMER;
    public static final  /* enum */ f TZHAAR;

    static {
        f.var3();
        f.var4();
        ARDY_KNIGHT = new GameEnum5(var2[var1[1]]);
        MASTER_FARMER = new GameEnum5(var2[var1[3]]);
        MAN = new GameEnum5(var2[var1[5]]);
        VYRE = new GameEnum5(var2[var1[7]]);
        ELF = new GameEnum5(var2[var1[9]]);
        TZHAAR = new GameEnum5(var2[var1[11]]);
        f[] fArray = new f[var1[6]];
        fArray[f.var1[0]] = ARDY_KNIGHT;
        fArray[f.var1[1]] = MASTER_FARMER;
        fArray[f.var1[2]] = MAN;
        fArray[f.var1[3]] = VYRE;
        fArray[f.var1[4]] = ELF;
        fArray[f.var1[5]] = TZHAAR;
        $VALUES = fArray;
    }

    private static void var3() {
        var1 = new int[13];
        f.var1[0] = (0xC4 ^ 0x99) & ~(0xC5 ^ 0x98);
        f.var1[1] = 1;
        f.var1[2] = 2;
        f.var1[3] = 3;
        f.var1[4] = 0xA ^ 0xE;
        f.var1[5] = 0x47 ^ 0x42;
        f.var1[6] = 0xA7 ^ 0xA1;
        f.var1[7] = 91 + 90 - 91 + 41 ^ 22 + 65 - 42 + 87;
        f.var1[8] = 0x8B ^ 0x83;
        f.var1[9] = 0xCA ^ 0xC3;
        f.var1[10] = 0x9D ^ 0x97;
        f.var1[11] = 28 + 86 - 54 + 115 ^ 93 + 0 - 37 + 108;
        f.var1[12] = 0x3B ^ 0x7E ^ (0x12 ^ 0x5B);
    }

    private GameEnum5(String string2) {
        this.name = string2;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public String v() {
        return this.name;
    }

    private static void var4() {
        var2 = new String[var1[12]];
        f.var2[f.var1[0]] = "ARDY_KNIGHT";
        f.var2[f.var1[1]] = "Knight of Ardougne";
        f.var2[f.var1[2]] = "MASTER_FARMER";
        f.var2[f.var1[3]] = "Master Farmer";
        f.var2[f.var1[4]] = "MAN";
        f.var2[f.var1[5]] = "Man";
        f.var2[f.var1[6]] = "VYRE";
        f.var2[f.var1[7]] = "Vyre";
        f.var2[f.var1[8]] = "ELF";
        f.var2[f.var1[9]] = "Elf";
        f.var2[f.var1[10]] = "TZHAAR";
        f.var2[f.var1[11]] = "TzHaar-Hur";
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (f.var11(var20, var19)) {
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

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }
}

