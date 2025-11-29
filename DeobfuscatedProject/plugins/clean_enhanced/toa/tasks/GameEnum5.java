/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import net.runelite.api.Prayer;

public final class GameEnum5
extends Enum<l> {
    
    private final  Prayer mapped;
    public static final  /* enum */ l MYSTIC_MIGHT;
    public static final  /* enum */ l AUGURY;
    private static final  l[] $VALUES;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (l.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var1 = new String[var2[2]];
        l.var1[l.var2[0]] = "AUGURY";
        l.var1[l.var2[1]] = "MYSTIC_MIGHT";
    }

    static {
        l.var15();
        l.var14();
        AUGURY = new GameEnum5(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum5(Prayer.MYSTIC_MIGHT);
        l[] lArray = new l[var2[2]];
        lArray[l.var2[0]] = AUGURY;
        lArray[l.var2[1]] = MYSTIC_MIGHT;
        $VALUES = lArray;
    }

    public Prayer z() {
        return this.mapped;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var2 = new int[4];
        l.var2[0] = (0xD ^ 0x4E) & ~(0x7D ^ 0x3E);
        l.var2[1] = 1;
        l.var2[2] = 2;
        l.var2[3] = 0xBC ^ 0xB4;
    }

    private GameEnum5(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }
}

