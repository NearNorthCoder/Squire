/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum3
extends Enum<c> {
    public static final  /* enum */ c AVANTOE;
    public static final  /* enum */ c TOADFLAX;
    public static final  /* enum */ c KWUARM;
    public static final  /* enum */ c KWUARM_POT_UNF;
    
    public static final  /* enum */ c SNAPDRAGON_POT_UNF;
    public static final  /* enum */ c SNAPDRAGON;
    public static final  /* enum */ c RANARR_POT_UNF;
    public static final  /* enum */ c AVANTOE_POT_UNF;
    private final  String name;
    public static final  /* enum */ c RANARR_WEED;
    private final  int herbId;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c TOADFLAX_POT_UNF;

    static {
        c.var3();
        c.var4();
        RANARR_WEED = new GameEnum3(var2[var1[1]], var1[2]);
        TOADFLAX = new GameEnum3(var2[var1[4]], var1[5]);
        AVANTOE = new GameEnum3(var2[var1[7]], var1[8]);
        KWUARM = new GameEnum3(var2[var1[10]], var1[11]);
        SNAPDRAGON = new GameEnum3(var2[var1[13]], var1[14]);
        RANARR_POT_UNF = new GameEnum3(var2[var1[16]], var1[17]);
        TOADFLAX_POT_UNF = new GameEnum3(var2[var1[19]], var1[20]);
        AVANTOE_POT_UNF = new GameEnum3(var2[var1[22]], var1[23]);
        KWUARM_POT_UNF = new GameEnum3(var2[var1[25]], var1[26]);
        SNAPDRAGON_POT_UNF = new GameEnum3(var2[var1[28]], var1[29]);
        c[] cArray = new c[var1[15]];
        cArray[c.var1[0]] = RANARR_WEED;
        cArray[c.var1[1]] = TOADFLAX;
        cArray[c.var1[3]] = AVANTOE;
        cArray[c.var1[4]] = KWUARM;
        cArray[c.var1[6]] = SNAPDRAGON;
        cArray[c.var1[7]] = RANARR_POT_UNF;
        cArray[c.var1[9]] = TOADFLAX_POT_UNF;
        cArray[c.var1[10]] = AVANTOE_POT_UNF;
        cArray[c.var1[12]] = KWUARM_POT_UNF;
        cArray[c.var1[13]] = SNAPDRAGON_POT_UNF;
        $VALUES = cArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (c.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public int b() {
        return this.herbId;
    }

    private static void var4() {
        var2 = new String[var1[30]];
        c.var2[c.var1[0]] = "RANARR_WEED";
        c.var2[c.var1[1]] = "Ranarr weed";
        c.var2[c.var1[3]] = "TOADFLAX";
        c.var2[c.var1[4]] = "Toadflax";
        c.var2[c.var1[6]] = "AVANTOE";
        c.var2[c.var1[7]] = "Avantoe";
        c.var2[c.var1[9]] = "KWUARM";
        c.var2[c.var1[10]] = "Kwuarm";
        c.var2[c.var1[12]] = "SNAPDRAGON";
        c.var2[c.var1[13]] = "Snapdragon";
        c.var2[c.var1[15]] = "RANARR_POT_UNF";
        c.var2[c.var1[16]] = "Ranarr potion (unf)";
        c.var2[c.var1[18]] = "TOADFLAX_POT_UNF";
        c.var2[c.var1[19]] = "Toadflax potion (unf)";
        c.var2[c.var1[21]] = "AVANTOE_POT_UNF";
        c.var2[c.var1[22]] = "Avantoe potion (unf)";
        c.var2[c.var1[24]] = "KWUARM_POT_UNF";
        c.var2[c.var1[25]] = "Kwuarm potion (unf)";
        c.var2[c.var1[27]] = "SNAPDRAGON_POT_UNF";
        c.var2[c.var1[28]] = "Snapdragon potion (unf)";
    }

    private static void var3() {
        var1 = new int[31];
        c.var1[0] = (1 ^ 0x10) & ~(0x7F ^ 0x6E);
        c.var1[1] = 1;
        c.var1[2] = 0xFFFF93DD & 0x6D23;
        c.var1[3] = 2;
        c.var1[4] = 3;
        c.var1[5] = 0xFFFFCFFF & 0x3BB6;
        c.var1[6] = 151 + 134 - 251 + 155 ^ 180 + 61 - 99 + 43;
        c.var1[7] = 0xDA ^ 0xA7 ^ (0x60 ^ 0x18);
        c.var1[8] = 0xFFFFA5F5 & 0x5B0F;
        c.var1[9] = 0x1B ^ 0x2C ^ (0x4F ^ 0x7E);
        c.var1[10] = 0x2E ^ 0x29;
        c.var1[11] = 0xFFFF8DCF & 0x7337;
        c.var1[12] = 0x22 ^ 0x2A;
        c.var1[13] = 0xB4 ^ 0xAA ^ (0x54 ^ 0x43);
        c.var1[14] = -(0xFFFF95E7 & 0x6E5F) & (0xFFFF8FFF & 0x7FFE);
        c.var1[15] = 0xB1 ^ 0xBB;
        c.var1[16] = 0x6A ^ 0x61;
        c.var1[17] = 138 + 19 - 143 + 211 ^ 24 + 94 - -3 + 9;
        c.var1[18] = 0x51 ^ 0x29 ^ (0x5A ^ 0x2E);
        c.var1[19] = 0x22 ^ 0x2F;
        c.var1[20] = -(0xFFFFFF4F & 0x24B2) & (0xFFFFBFBB & 0x6FFF);
        c.var1[21] = 0xAD ^ 0xA3;
        c.var1[22] = 0x5F ^ 0x50;
        c.var1[23] = 0x49 ^ 0x2E;
        c.var1[24] = 0x42 ^ 0xA ^ (0xEC ^ 0xB4);
        c.var1[25] = 7 + 126 - 68 + 88 ^ 88 + 8 - 59 + 99;
        c.var1[26] = 156 + 102 - 189 + 148 ^ 134 + 161 - 186 + 67;
        c.var1[27] = 133 + 31 - 132 + 111 ^ 71 + 80 - 55 + 61;
        c.var1[28] = 0x63 ^ 0x74 ^ (0x60 ^ 0x64);
        c.var1[29] = -(0xFFFFDF97 & 0x346B) & (0xFFFFFFFE & 0x1FBF);
        c.var1[30] = 76 + 104 - 10 + 6 ^ 109 + 127 - 222 + 150;
    }

    public String a() {
        return this.name;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum3(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

