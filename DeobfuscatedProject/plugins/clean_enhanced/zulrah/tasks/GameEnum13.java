/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum13
extends Enum<d> {
    public static final  /* enum */ d RING_OF_RECOIL;
    public static final  /* enum */ d CHAOS_RUNE;
    private  int amount;
    public static final  /* enum */ d ANTI_VENOM;
    public static final  /* enum */ d FIRE_RUNE;
    public static final  /* enum */ d DEATH_RUNE;
    public static final  /* enum */ d ZUL_ANDRA_TELEPORT;
    public static final  /* enum */ d RANGING_POTION;
    public static final  /* enum */ d RING_OF_WEALTH;
    
    private  int id;
    
    private  int price;
    public static final  /* enum */ d SHARK;
    private  String name;
    public static final  /* enum */ d PRAYER_POTION;
    public static final  /* enum */ d ADAMANT_DART;
    public static final  /* enum */ d COOKED_KARAMBWAN;
    public static final  /* enum */ d ZULRAH_SCALES;
    public static final  /* enum */ d LUMBRIDGE_TELEPORT;
    public static final  /* enum */ d RING_OF_DUELING;
    private static final  d[] $VALUES;
    public static final  /* enum */ d MAGIC_POTION;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int o() {
        return this.price;
    }

    public void a(String string) {
        this.name = string;
    }

    static {
        d.var3();
        d.var4();
        RING_OF_DUELING = new GameEnum13(1, 2, 0, var1[3]);
        RING_OF_RECOIL = new GameEnum13(5, 6, 0, var1[7]);
        RING_OF_WEALTH = new GameEnum13(9, var2[10], 0, var1[var2[10]]);
        LUMBRIDGE_TELEPORT = new GameEnum13(var2[12], var2[13], 0, var1[var2[14]]);
        ZUL_ANDRA_TELEPORT = new GameEnum13(var2[16], var2[17], 0, var1[var2[18]]);
        FIRE_RUNE = new GameEnum13(var2[19], var2[20], 0, var1[var2[21]]);
        CHAOS_RUNE = new GameEnum13(var2[23], var2[24], 0, var1[var2[25]]);
        DEATH_RUNE = new GameEnum13(var2[27], var2[24], 0, var1[2]);
        SHARK = new GameEnum13(var2[29], var2[30], 0, var1[var2[31]]);
        ANTI_VENOM = new GameEnum13(var2[33], var2[17], 0, var1[var2[34]]);
        RANGING_POTION = new GameEnum13(var2[36], var2[17], 0, var1[var2[37]]);
        MAGIC_POTION = new GameEnum13(var2[39], var2[17], 0, var1[var2[40]]);
        PRAYER_POTION = new GameEnum13(var2[42], var2[17], 0, var1[var2[43]]);
        ADAMANT_DART = new GameEnum13(var2[45], var2[46], 0, var1[var2[47]]);
        COOKED_KARAMBWAN = new GameEnum13(var2[49], var2[50], 0, var1[var2[51]]);
        ZULRAH_SCALES = new GameEnum13(var2[52], var2[46], 0, var1[var2[53]]);
        d[] dArray = new d[var2[28]];
        dArray[0] = RING_OF_DUELING;
        dArray[3] = RING_OF_RECOIL;
        dArray[4] = RING_OF_WEALTH;
        dArray[7] = LUMBRIDGE_TELEPORT;
        dArray[8] = ZUL_ANDRA_TELEPORT;
        dArray[d.var2[10]] = FIRE_RUNE;
        dArray[d.var2[11]] = CHAOS_RUNE;
        dArray[d.var2[14]] = DEATH_RUNE;
        dArray[d.var2[15]] = SHARK;
        dArray[d.var2[18]] = ANTI_VENOM;
        dArray[d.var2[13]] = RANGING_POTION;
        dArray[d.var2[21]] = MAGIC_POTION;
        dArray[d.var2[22]] = PRAYER_POTION;
        dArray[d.var2[25]] = ADAMANT_DART;
        dArray[d.var2[26]] = COOKED_KARAMBWAN;
        dArray[2] = ZULRAH_SCALES;
        $VALUES = dArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public int n() {
        return this.amount;
    }

    /*
     * WARNING - void declaration
     */
    public static d b(int n2) {
        void var11;
        d[] dArray = d.values();
        int n3 = dArray.length;
        int var12 = 0;
        while ((var12 < (int)var11)) {
            int var13;
            void var14;
            void var15 = var14[var12];
            if ((var15.m() == var13)) {
                return var15;
            }
            ++var12;
            0;
            if ((0x64 ^ 0x7D ^ (0xDE ^ 0xC3)) >= 2) continue;
            return null;
        }
        return null;
    }

    public void c(int n2) {
        this.id = n2;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 0;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 0;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public String k() {
        return this.name;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public void GameEnum13(int n2) {
        this.amount = n2;
    }

    public int m() {
        return this.id;
    }

    public void e(int n2) {
        this.price = n2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    private GameEnum13(int n3, int n4, int n5, String string2) {
        this.id = n3;
        this.amount = n4;
        this.price = n5;
        this.name = string2;
    }
}

