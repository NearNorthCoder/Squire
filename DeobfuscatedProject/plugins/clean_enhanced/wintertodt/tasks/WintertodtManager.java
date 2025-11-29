/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.wintertodt.tasks;

public class WintertodtManager {

    public static String a(double d2) {
        return d.a((int)d2);
    }

    public static String a(int n2) {
        int var3;
        if (n2 < 0) {
            Object[] objectArray = new Object[2];
            objectArray[1] = n2;
            return String.format(var1[1], objectArray);
        }
        if (var3 < 3) {
            Object[] objectArray = new Object[2];
            objectArray[1] = var3 / 4;
            return String.format(var1[2], objectArray);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = n2 / 6;
        return String.format(var1[5], objectArray);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 1;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 1;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (-(2 ^ 5 ^ 2) < 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }
}

