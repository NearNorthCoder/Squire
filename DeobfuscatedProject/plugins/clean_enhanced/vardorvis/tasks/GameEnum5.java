/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vardorvis.tasks;

public final class GameEnum5
extends Enum<d> {
    
    public static final  /* enum */ d NOT_ATTACKING;
    public static final  /* enum */ d DELAYED;
    
    private static final  d[] $VALUES;

    private static void var3() {
        var1 = new String[var2[2]];
        d.var1[d.var2[0]] = "NOT_ATTACKING";
        d.var1[d.var2[1]] = "DELAYED";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.var4();
        d.var3();
        NOT_ATTACKING = new GameEnum5();
        DELAYED = new GameEnum5();
        d[] dArray = new d[var2[2]];
        dArray[d.var2[0]] = NOT_ATTACKING;
        dArray[d.var2[1]] = DELAYED;
        $VALUES = dArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (d.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var4() {
        var2 = new int[3];
        d.var2[0] = (0xAC ^ 0x97) & ~(0x2C ^ 0x17);
        d.var2[1] = 1;
        d.var2[2] = 2;
    }
}

