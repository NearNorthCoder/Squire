/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hydra.tasks;

public final class GameEnum4
extends Enum<l> {
    
    public static final  /* enum */ l DONE;
    public static final  /* enum */ l MOVING;
    private static final  l[] $VALUES;
    
    public static final  /* enum */ l WAITING;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        l.var9();
        l.var10();
        WAITING = new GameEnum4();
        MOVING = new GameEnum4();
        DONE = new GameEnum4();
        l[] lArray = new l[var1[3]];
        lArray[l.var1[0]] = WAITING;
        lArray[l.var1[1]] = MOVING;
        lArray[l.var1[2]] = DONE;
        $VALUES = lArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (l.var17(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static void var10() {
        var2 = new String[var1[3]];
        l.var2[l.var1[0]] = "WAITING";
        l.var2[l.var1[1]] = "MOVING";
        l.var2[l.var1[2]] = "DONE";
    }

    private static void var9() {
        var1 = new int[5];
        l.var1[0] = (0x1A ^ 0x67 ^ (0x51 ^ 0xE)) & (162 + 99 - 168 + 77 ^ 56 + 1 - -73 + 6 ^ -1);
        l.var1[1] = 1;
        l.var1[2] = 2;
        l.var1[3] = 3;
        l.var1[4] = 0x9F ^ 0x97;
    }
}

