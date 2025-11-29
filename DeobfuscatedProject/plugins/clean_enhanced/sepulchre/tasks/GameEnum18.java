/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum18
extends Enum<y> {
    public static final  /* enum */ y MAHOGANY_RUNE;
    public static final  /* enum */ y REGULAR_STEEL;
    public static final  /* enum */ y NONE;
    public static final  /* enum */ y OAK_MITHRIL;
    public static final  /* enum */ y TEAK_ADAMANT;
    private static final  y[] $VALUES;
    
     String name;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new String[var2[10]];
        y.var1[y.var2[0]] = "NONE";
        y.var1[y.var2[1]] = y.var10("", "cQpgg");
        y.var1[y.var2[2]] = "REGULAR_STEEL";
        y.var1[y.var2[3]] = y.var11("AgcO4NW/zDA=", "UNgQI");
        y.var1[y.var2[4]] = "OAK_MITHRIL";
        y.var1[y.var2[5]] = y.var11("AbBifuy7EEg=", "TzZOJ");
        y.var1[y.var2[6]] = "TEAK_ADAMANT";
        y.var1[y.var2[7]] = y.var11("m6lWtxjJnq8=", "FnxZn");
        y.var1[y.var2[8]] = "MAHOGANY_RUNE";
        y.var1[y.var2[9]] = y.var11("E8W3bkJzcLw=", "DUsns");
    }

    static {
        y.var12();
        y.var9();
        NONE = new GameEnum18(var1[var2[1]]);
        REGULAR_STEEL = new GameEnum18(var1[var2[3]]);
        OAK_MITHRIL = new GameEnum18(var1[var2[5]]);
        TEAK_ADAMANT = new GameEnum18(var1[var2[7]]);
        MAHOGANY_RUNE = new GameEnum18(var1[var2[9]]);
        y[] yArray = new y[var2[5]];
        yArray[y.var2[0]] = NONE;
        yArray[y.var2[1]] = REGULAR_STEEL;
        yArray[y.var2[2]] = OAK_MITHRIL;
        yArray[y.var2[3]] = TEAK_ADAMANT;
        yArray[y.var2[4]] = MAHOGANY_RUNE;
        $VALUES = yArray;
    }

    private static String var10(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (y.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((116 + 20 - 11 + 50 ^ 102 + 149 - 181 + 100) > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static void var12() {
        var2 = new int[11];
        y.var2[0] = (0x67 ^ 0x22 ^ (0x19 ^ 0x1F)) & (0x16 ^ 0x61 ^ (0x4E ^ 0x7A) ^ -1);
        y.var2[1] = 1;
        y.var2[2] = 2;
        y.var2[3] = 3;
        y.var2[4] = 73 + 24 - -35 + 8 ^ 82 + 47 - 128 + 135;
        y.var2[5] = 0x9F ^ 0x9A;
        y.var2[6] = 0xC1 ^ 0xC7;
        y.var2[7] = 0x76 ^ 0x4A ^ (0x35 ^ 0xE);
        y.var2[8] = 0x53 ^ 0x48 ^ (0xBF ^ 0xAC);
        y.var2[9] = 0xE0 ^ 0xAD ^ (0x57 ^ 0x13);
        y.var2[10] = 0 ^ 0xA;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    private GameEnum18(String string2) {
        this.name = string2;
    }
}

