/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum7
extends Enum<I> {
    public static final  /* enum */ I ITEM;
    private static final  I[] $VALUES;
    public static final  /* enum */ I SPELL;
    private static  int[] lIllIIIl;
    private static  String[] lIllIIII;
    public static final  /* enum */ I TAB;

    private static void var1() {
        lIllIIII = new String[lIllIIIl[3]];
        I.lIllIIII[I.lIllIIIl[0]] = "SPELL";
        I.lIllIIII[I.lIllIIIl[1]] = "ITEM";
        I.lIllIIII[I.lIllIIIl[2]] = "TAB";
    }

    public static I[] values() {
        return (I[])$VALUES.clone();
    }

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static I valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    private static void var9() {
        lIllIIIl = new int[4];
        I.lIllIIIl[0] = (97 + 3 - -66 + 12 ^ 109 + 92 - 158 + 93) & (0x67 ^ 0x7D ^ (0x29 ^ 9) ^ -1);
        I.lIllIIIl[1] = 1;
        I.lIllIIIl[2] = 2;
        I.lIllIIIl[3] = 3;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIllIIIl[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIllIIIl[0];
        while (I.var2(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (((0xAD ^ 0x9B ^ (0x38 ^ 0x34)) & (0xEA ^ 0x80 ^ (0x67 ^ 0x37) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

}

