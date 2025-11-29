/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum12
extends Enum<H> {
    
    private static final  H[] $VALUES;
    public static final  /* enum */ H BLADE_STRANGE_TILES;
    
    public static final  /* enum */ H STRANGE_TILES;
    public static final  /* enum */ H DART_STRANGE_TILES;

    static {
        H.var3();
        H.var4();
        STRANGE_TILES = new GameEnum12();
        DART_STRANGE_TILES = new GameEnum12();
        BLADE_STRANGE_TILES = new GameEnum12();
        H[] hArray = new H[var2[3]];
        hArray[H.var2[0]] = STRANGE_TILES;
        hArray[H.var2[1]] = DART_STRANGE_TILES;
        hArray[H.var2[2]] = BLADE_STRANGE_TILES;
        $VALUES = hArray;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (H.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x83 ^ 0x87) >= (0x15 ^ 0x11)) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    private static void var4() {
        var1 = new String[var2[3]];
        H.var1[H.var2[0]] = "STRANGE_TILES";
        H.var1[H.var2[1]] = "DART_STRANGE_TILES";
        H.var1[H.var2[2]] = "BLADE_STRANGE_TILES";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var2 = new int[5];
        H.var2[0] = (0x7D ^ 0x55) & ~(0xB1 ^ 0x99);
        H.var2[1] = 1;
        H.var2[2] = 2;
        H.var2[3] = 3;
        H.var2[4] = 0xD ^ 0x5C ^ (0x98 ^ 0xC1);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }
}

