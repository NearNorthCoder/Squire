/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

public final class GameEnum2
extends Enum<c> {
    public static final  /* enum */ c ALL_STAGES;
    
    public static final  /* enum */ c FINISH_POTS;
    public static final  /* enum */ c CLEAN_HERBS;
    private static final  c[] $VALUES;
    public static final  /* enum */ c MAKE_UNF_POTS;
    public static final  /* enum */ c ALL_STAGES_ALL_HERBS;

    private static void var3() {
        var1 = new int[6];
        c.var1[0] = (0xB2 ^ 0x8B ^ (0x4C ^ 0x6B)) & (0x75 ^ 0x7F ^ (0x70 ^ 0x64) ^ -1);
        c.var1[1] = 1;
        c.var1[2] = 2;
        c.var1[3] = 3;
        c.var1[4] = 0x5A ^ 0x2D ^ (0x5B ^ 0x28);
        c.var1[5] = 0xC7 ^ 0x80 ^ (0x14 ^ 0x56);
    }

    private static void var4() {
        var2 = new String[var1[5]];
        c.var2[c.var1[0]] = "CLEAN_HERBS";
        c.var2[c.var1[1]] = "MAKE_UNF_POTS";
        c.var2[c.var1[2]] = "FINISH_POTS";
        c.var2[c.var1[3]] = "ALL_STAGES";
        c.var2[c.var1[4]] = "ALL_STAGES_ALL_HERBS";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static boolean var5(int n, int n2) {
        return n < n2;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    static {
        c.var3();
        c.var4();
        CLEAN_HERBS = new GameEnum2();
        MAKE_UNF_POTS = new GameEnum2();
        FINISH_POTS = new GameEnum2();
        ALL_STAGES = new GameEnum2();
        ALL_STAGES_ALL_HERBS = new GameEnum2();
        c[] cArray = new c[var1[5]];
        cArray[c.var1[0]] = CLEAN_HERBS;
        cArray[c.var1[1]] = MAKE_UNF_POTS;
        cArray[c.var1[2]] = FINISH_POTS;
        cArray[c.var1[3]] = ALL_STAGES;
        cArray[c.var1[4]] = ALL_STAGES_ALL_HERBS;
        $VALUES = cArray;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (c.var5(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (((0x20 ^ 0x7E ^ (0xBA ^ 0xA5)) & (0x39 ^ 0x6E ^ (0x96 ^ 0x80) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }
}

