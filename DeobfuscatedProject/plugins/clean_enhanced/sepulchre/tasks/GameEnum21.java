/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum21
extends Enum<u> {
    
    public static final  /* enum */ u GRAPPLE;
    public static final  /* enum */ u FIX_BRIDGE;
    public static final  /* enum */ u CAST_PORTAL;
    public static final  /* enum */ u HOLY_BARRIER;
    public static final  /* enum */ u BRAZIER;
    
    private static final  u[] $VALUES;

    private static void var3() {
        var1 = new int[7];
        u.var1[0] = (0xFE ^ 0xA1) & ~(0xD4 ^ 0x8B);
        u.var1[1] = 1;
        u.var1[2] = 2;
        u.var1[3] = 3;
        u.var1[4] = 0x74 ^ 0x70;
        u.var1[5] = 91 + 37 - 16 + 15 ^ (0x61 ^ 0x1B);
        u.var1[6] = 0xC ^ 4;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (u.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        u.var3();
        u.var21();
        FIX_BRIDGE = new GameEnum21();
        HOLY_BARRIER = new GameEnum21();
        CAST_PORTAL = new GameEnum21();
        BRAZIER = new GameEnum21();
        GRAPPLE = new GameEnum21();
        u[] uArray = new u[var1[5]];
        uArray[u.var1[0]] = FIX_BRIDGE;
        uArray[u.var1[1]] = HOLY_BARRIER;
        uArray[u.var1[2]] = CAST_PORTAL;
        uArray[u.var1[3]] = BRAZIER;
        uArray[u.var1[4]] = GRAPPLE;
        $VALUES = uArray;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static void var21() {
        var2 = new String[var1[5]];
        u.var2[u.var1[0]] = "FIX_BRIDGE";
        u.var2[u.var1[1]] = "HOLY_BARRIER";
        u.var2[u.var1[2]] = "CAST_PORTAL";
        u.var2[u.var1[3]] = "BRAZIER";
        u.var2[u.var1[4]] = "GRAPPLE";
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }
}

