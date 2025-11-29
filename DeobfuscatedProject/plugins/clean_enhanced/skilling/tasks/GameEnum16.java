/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum16
extends Enum<f> {
    
    public static final  /* enum */ f FIRE;
    public static final  /* enum */ f AIR;
    
    private final  int orbId;
    private static final  f[] $VALUES;
    public static final  /* enum */ f WATER;
    public static final  /* enum */ f EARTH;

    public int x() {
        return this.orbId;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    static {
        f.var4();
        f.var5();
        AIR = new GameEnum16(var2[1]);
        EARTH = new GameEnum16(var2[3]);
        WATER = new GameEnum16(var2[5]);
        FIRE = new GameEnum16(var2[7]);
        f[] fArray = new f[var2[8]];
        fArray[f.var2[0]] = AIR;
        fArray[f.var2[2]] = EARTH;
        fArray[f.var2[4]] = WATER;
        fArray[f.var2[6]] = FIRE;
        $VALUES = fArray;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (f.var3(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((124 + 121 - 173 + 77 ^ 84 + 105 - 155 + 111) != ((0x28 ^ 0x19 ^ (0x1B ^ 9)) & (0xDE ^ 0x84 ^ (0x7C ^ 5) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void var4() {
        var2 = new int[10];
        f.var2[0] = (0x41 ^ 0x59) & ~(0x25 ^ 0x3D);
        f.var2[1] = -(0xFFFFBD87 & 0x5F7B) & (0xFFFFFF7F & 0x1FBF);
        f.var2[2] = 1;
        f.var2[3] = -(0xFFFFFF89 & 0x4F7) & (0xFFFF96BF & 0x6FFF);
        f.var2[4] = 2;
        f.var2[5] = 0xFFFF8EBB & 0x737F;
        f.var2[6] = 3;
        f.var2[7] = -(0xFFFFABC3 & 0x7DFF) & (0xFFFFBFFB & 0x6BFF);
        f.var2[8] = 79 + 177 - 83 + 12 ^ 153 + 128 - 124 + 32;
        f.var2[9] = 0x34 ^ 0x6C ^ (4 ^ 0x54);
    }

    private GameEnum16(int n3) {
        this.orbId = n3;
    }

    private static void var5() {
        var1 = new String[var2[8]];
        f.var1[f.var2[0]] = "AIR";
        f.var1[f.var2[2]] = "EARTH";
        f.var1[f.var2[4]] = "WATER";
        f.var1[f.var2[6]] = "FIRE";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

