/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<o> {
    public static final  /* enum */ o RIGOUR;
    public static final  /* enum */ o EAGLE_EYE;
    private final  Prayer mapped;

    private static final  o[] $VALUES;

    private static void var3() {
        var2 = new String[var1[2]];
        o.var2[o.var1[0]] = "RIGOUR";
        o.var2[o.var1[1]] = "EAGLE_EYE";
    }

    static {
        o.var4();
        o.var3();
        RIGOUR = new GameEnum2(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum2(Prayer.EAGLE_EYE);
        o[] oArray = new o[var1[2]];
        oArray[o.var1[0]] = RIGOUR;
        oArray[o.var1[1]] = EAGLE_EYE;
        $VALUES = oArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (o.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-(46 + 104 - 53 + 40 ^ 72 + 76 - 113 + 106) < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    public Prayer z() {
        return this.mapped;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var1 = new int[4];
        o.var1[0] = (93 + 136 - 184 + 148 ^ 2 + 114 - 67 + 90) & (0xD1 ^ 0x86 ^ (0x4E ^ 0x53) ^ -1);
        o.var1[1] = 1;
        o.var1[2] = 2;
        o.var1[3] = 126 + 163 - 184 + 79 ^ 57 + 77 - 28 + 70;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private GameEnum2(Prayer prayer) {
        this.mapped = prayer;
    }
}

