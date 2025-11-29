/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b PICKPOCKETING;
    public static final  /* enum */ b CHESTS;
    public static final  /* enum */ b BLACK_JACK;

    public static final  /* enum */ b STALLS;
    private static final  b[] $VALUES;
    public static final  /* enum */ b ROGUES_DEN;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(var1[0]);
        return c2 + string.replaceAll(var2[var1[0]], var2[var1[1]]).substring(var1[1]).toLowerCase();
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var16() {
        var1 = new int[9];
        b.var1[0] = (0x2A ^ 0x1B) & ~(0x80 ^ 0xB1);
        b.var1[1] = 1;
        b.var1[2] = 2;
        b.var1[3] = 3;
        b.var1[4] = 0x82 ^ 0x86;
        b.var1[5] = 134 + 141 - 187 + 87 ^ 134 + 31 - 154 + 159;
        b.var1[6] = 0x98 ^ 0x9E;
        b.var1[7] = 9 ^ 0xE;
        b.var1[8] = 0x62 ^ 0x4A ^ (0xA1 ^ 0x81);
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (b.var3(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if ((0xE ^ 0xA) != 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static void var27() {
        var2 = new String[var1[7]];
        b.var2[b.var1[0]] = "_";
        b.var2[b.var1[1]] = " ";
        b.var2[b.var1[2]] = "BLACK_JACK";
        b.var2[b.var1[3]] = "PICKPOCKETING";
        b.var2[b.var1[4]] = "STALLS";
        b.var2[b.var1[5]] = "CHESTS";
        b.var2[b.var1[6]] = "ROGUES_DEN";
    }

    static {
        b.var16();
        b.var27();
        BLACK_JACK = new GameEnum();
        PICKPOCKETING = new GameEnum();
        STALLS = new GameEnum();
        CHESTS = new GameEnum();
        ROGUES_DEN = new GameEnum();
        b[] bArray = new b[var1[5]];
        bArray[b.var1[0]] = BLACK_JACK;
        bArray[b.var1[1]] = PICKPOCKETING;
        bArray[b.var1[2]] = STALLS;
        bArray[b.var1[3]] = CHESTS;
        bArray[b.var1[4]] = ROGUES_DEN;
        $VALUES = bArray;
    }
}

