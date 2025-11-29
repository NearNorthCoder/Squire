/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum6
extends Enum<d> {
    
    public static final  /* enum */ d CREATE_PASTE;
    private static final  d[] $VALUES;
    public static final  /* enum */ d MINIGAME;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (d.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    static {
        d.var14();
        d.var15();
        MINIGAME = new GameEnum6();
        CREATE_PASTE = new GameEnum6();
        d[] dArray = new d[var2[2]];
        dArray[d.var2[0]] = MINIGAME;
        dArray[d.var2[1]] = CREATE_PASTE;
        $VALUES = dArray;
    }

    private static void var15() {
        var1 = new String[var2[2]];
        d.var1[d.var2[0]] = "MINIGAME";
        d.var1[d.var2[1]] = "CREATE_PASTE";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var14() {
        var2 = new int[3];
        d.var2[0] = (0x38 ^ 0x5B ^ (0xC4 ^ 0xBA)) & (69 + 108 - 71 + 41 ^ 128 + 38 - 129 + 105 ^ -1);
        d.var2[1] = 1;
        d.var2[2] = 2;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }
}

