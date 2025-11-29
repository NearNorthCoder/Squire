/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

public final class GameEnum11
extends Enum<x> {
    public static final  /* enum */ x NONE;
    public static final  /* enum */ x BLOWPIPE;
    public static final  /* enum */ x WEBWEAVER_BOW;
    
    private static final  x[] $VALUES;
    public static final  /* enum */ x CHINCHOMPA;
    public static final  /* enum */ x HUNTER_CROSSBOW;
    
    private final  String itemName;
    public static final  /* enum */ x CRAWS_BOW;

    public String bP() {
        return this.itemName;
    }

    static {
        x.var3();
        x.var4();
        HUNTER_CROSSBOW = new GameEnum11(var2[var1[1]]);
        BLOWPIPE = new GameEnum11(var2[var1[3]]);
        CHINCHOMPA = new GameEnum11(var2[var1[5]]);
        CRAWS_BOW = new GameEnum11(var2[var1[7]]);
        WEBWEAVER_BOW = new GameEnum11(var2[var1[9]]);
        NONE = new GameEnum11(var2[var1[11]]);
        x[] xArray = new x[var1[6]];
        xArray[x.var1[0]] = HUNTER_CROSSBOW;
        xArray[x.var1[1]] = BLOWPIPE;
        xArray[x.var1[2]] = CHINCHOMPA;
        xArray[x.var1[3]] = CRAWS_BOW;
        xArray[x.var1[4]] = WEBWEAVER_BOW;
        xArray[x.var1[5]] = NONE;
        $VALUES = xArray;
    }

    private static void var3() {
        var1 = new int[13];
        x.var1[0] = (187 + 78 - 155 + 99 ^ 24 + 153 - 134 + 116) & (0x7B ^ 0x6D ^ (0xF0 ^ 0xA8) ^ -1);
        x.var1[1] = 1;
        x.var1[2] = 2;
        x.var1[3] = 3;
        x.var1[4] = 135 + 136 - 96 + 22 ^ 175 + 68 - 175 + 125;
        x.var1[5] = 56 + 108 - 160 + 149 ^ 68 + 12 - -36 + 40;
        x.var1[6] = 181 + 119 - 233 + 126 ^ 117 + 34 - 13 + 61;
        x.var1[7] = 0x69 ^ 0x6E;
        x.var1[8] = 0xCF ^ 0xC7;
        x.var1[9] = 0x9F ^ 0x96;
        x.var1[10] = 0x89 ^ 0x83;
        x.var1[11] = 0x88 ^ 0x83;
        x.var1[12] = 0xCA ^ 0xAD ^ (0xFF ^ 0x94);
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static void var4() {
        var2 = new String[var1[12]];
        x.var2[x.var1[0]] = "HUNTER_CROSSBOW";
        x.var2[x.var1[1]] = "Hunters' crossbow";
        x.var2[x.var1[2]] = "BLOWPIPE";
        x.var2[x.var1[3]] = "blowpipe";
        x.var2[x.var1[4]] = "CHINCHOMPA";
        x.var2[x.var1[5]] = "Chinchompa";
        x.var2[x.var1[6]] = "CRAWS_BOW";
        x.var2[x.var1[7]] = "Craw's bow";
        x.var2[x.var1[8]] = "WEBWEAVER_BOW";
        x.var2[x.var1[9]] = "Webweaver bow";
        x.var2[x.var1[10]] = "NONE";
        x.var2[x.var1[11]] = "none";
    }

    private GameEnum11(String string2) {
        this.itemName = string2;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (x.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }
}

