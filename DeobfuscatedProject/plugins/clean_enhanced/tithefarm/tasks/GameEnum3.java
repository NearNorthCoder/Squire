/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.tithefarm.tasks;

public final class GameEnum3
extends Enum<a> {
    public static final  /* enum */ a HERB_BOX;
    public static final  /* enum */ a SEED_PACK;
    public static final  /* enum */ a NONE;
    
    private static final  a[] $VALUES;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (a.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 >= ((0x39 ^ 0x59 ^ (0xD8 ^ 0x89)) & (0x11 ^ 0x3E ^ (0x34 ^ 0x2A) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        a.var20();
        a.var21();
        NONE = new GameEnum3();
        HERB_BOX = new GameEnum3();
        SEED_PACK = new GameEnum3();
        a[] aArray = new a[var1[3]];
        aArray[a.var1[0]] = NONE;
        aArray[a.var1[1]] = HERB_BOX;
        aArray[a.var1[2]] = SEED_PACK;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var21() {
        var2 = new String[var1[3]];
        a.var2[a.var1[0]] = "NONE";
        a.var2[a.var1[1]] = "HERB_BOX";
        a.var2[a.var1[2]] = "SEED_PACK";
    }

    private static void var20() {
        var1 = new int[4];
        a.var1[0] = (0x10 ^ 0x4A ^ (0x4B ^ 0x3F)) & (142 + 104 - 83 + 10 ^ 59 + 123 - 73 + 22 ^ -1);
        a.var1[1] = 1;
        a.var1[2] = 2;
        a.var1[3] = 3;
    }
}

