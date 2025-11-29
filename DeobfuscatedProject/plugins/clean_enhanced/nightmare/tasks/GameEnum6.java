/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

public final class GameEnum6
extends Enum<v> {
    public static final  /* enum */ v INQUISITORS_MACE;
    public static final  /* enum */ v SARADOMIN_GODSWORD;
    private static final  v[] $VALUES;
    private final  int itemID;
    public static final  /* enum */ v DRAGON_MACE;
    public static final  /* enum */ v NONE;
    
    public static final  /* enum */ v ARMADYL_GODSWORD;
    public static final  /* enum */ v BANDOS_GODSWORD;
    public static final  /* enum */ v ELDER_MAUL;
    public static final  /* enum */ v TZHAAR_KET_OM;
    
    public static final  /* enum */ v ANCIENT_GODSWORD;
    public static final  /* enum */ v DRAGON_WARHAMMER;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (v.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((154 + 94 - 130 + 45 ^ 91 + 1 - 40 + 115) != 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private GameEnum6(int n3) {
        this.itemID = n3;
    }

    private static void var14() {
        var1 = new String[var2[20]];
        v.var1[v.var2[0]] = "ELDER_MAUL";
        v.var1[v.var2[2]] = "SARADOMIN_GODSWORD";
        v.var1[v.var2[4]] = "ARMADYL_GODSWORD";
        v.var1[v.var2[6]] = "BANDOS_GODSWORD";
        v.var1[v.var2[8]] = "ANCIENT_GODSWORD";
        v.var1[v.var2[10]] = "TZHAAR_KET_OM";
        v.var1[v.var2[12]] = "INQUISITORS_MACE";
        v.var1[v.var2[14]] = "DRAGON_MACE";
        v.var1[v.var2[16]] = "DRAGON_WARHAMMER";
        v.var1[v.var2[18]] = "NONE";
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public int bH() {
        return this.itemID;
    }

    static {
        v.var21();
        v.var14();
        ELDER_MAUL = new GameEnum6(var2[1]);
        SARADOMIN_GODSWORD = new GameEnum6(var2[3]);
        ARMADYL_GODSWORD = new GameEnum6(var2[5]);
        BANDOS_GODSWORD = new GameEnum6(var2[7]);
        ANCIENT_GODSWORD = new GameEnum6(var2[9]);
        TZHAAR_KET_OM = new GameEnum6(var2[11]);
        INQUISITORS_MACE = new GameEnum6(var2[13]);
        DRAGON_MACE = new GameEnum6(var2[15]);
        DRAGON_WARHAMMER = new GameEnum6(var2[17]);
        NONE = new GameEnum6(var2[19]);
        v[] vArray = new v[var2[20]];
        vArray[v.var2[0]] = ELDER_MAUL;
        vArray[v.var2[2]] = SARADOMIN_GODSWORD;
        vArray[v.var2[4]] = ARMADYL_GODSWORD;
        vArray[v.var2[6]] = BANDOS_GODSWORD;
        vArray[v.var2[8]] = ANCIENT_GODSWORD;
        vArray[v.var2[10]] = TZHAAR_KET_OM;
        vArray[v.var2[12]] = INQUISITORS_MACE;
        vArray[v.var2[14]] = DRAGON_MACE;
        vArray[v.var2[16]] = DRAGON_WARHAMMER;
        vArray[v.var2[18]] = NONE;
        $VALUES = vArray;
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static v valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    private static void var21() {
        var2 = new int[21];
        v.var2[0] = (0x46 ^ 0x15 ^ (0x77 ^ 0x3C)) & (163 + 134 - 287 + 162 ^ 133 + 28 - 76 + 95 ^ -1);
        v.var2[1] = 0xFFFFFA1F & 0x57EB;
        v.var2[2] = 1;
        v.var2[3] = 0xFFFFEE9F & 0x3F7E;
        v.var2[4] = 2;
        v.var2[5] = 0xFFFFEEFB & 0x3F1E;
        v.var2[6] = 3;
        v.var2[7] = -(0xFFFFDE67 & 0x61F9) & (0xFFFFEEFE & 0x7F7D);
        v.var2[8] = 0xEA ^ 0x83 ^ (0xFA ^ 0x97);
        v.var2[9] = -(0xFFFF9DB7 & 0x734D) & (0xFFFFFF7F & 0x77FD);
        v.var2[10] = 85 + 152 - 233 + 184 ^ 102 + 121 - 49 + 11;
        v.var2[11] = 0xFFFFB9EE & 0x5F91;
        v.var2[12] = 0x3B ^ 0x73 ^ (0x66 ^ 0x28);
        v.var2[13] = -(111 + 27 - 79 + 70) & (0xFFFFFFE5 & 0x5FFB);
        v.var2[14] = 2 ^ (0xA ^ 0xF);
        v.var2[15] = 0xFFFFE5FF & 0x1F9A;
        v.var2[16] = 105 + 173 - 102 + 27 ^ 161 + 60 - 200 + 174;
        v.var2[17] = 0xFFFFF71A & 0x3DED;
        v.var2[18] = 0xE5 ^ 0xA4 ^ (0x37 ^ 0x7F);
        v.var2[19] = -1;
        v.var2[20] = 38 + 70 - 78 + 111 ^ 29 + 78 - 83 + 111;
    }
}

