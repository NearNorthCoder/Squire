/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum16
extends Enum<h> {
    public static final  /* enum */ h ZULANDRA_TELEPORT;
    public static final  /* enum */ h CONSTRUCTION_CAPE;
    private static final  h[] $VALUES;
    public static final  /* enum */ h ARDOUGNE_CLOAK;
    
    public static final  /* enum */ h QUEST_CAPE;
    public static final  /* enum */ h HOUSE_TELEPORT;
    public static final  /* enum */ h EXPLORERS_RING;
    public static final  /* enum */ h RING_OF_DUELING;
    public static final  /* enum */ h MAX_CAPE;
    public static final  /* enum */ h ROYAL_SEED_POD;
    public static final  /* enum */ h ECTOPHIAL;
    public static final  /* enum */ h FISHING_CAPE;
    public static final  /* enum */ h AMULET_OF_GLORY;
    public static final  /* enum */ h CRAFTING_CAPE;
    private  int[] itemID;
    private  boolean mustBeEquipped;
    private  String teleportOption;
    public static final  /* enum */ h RADAS_BLESSING;

    private GameEnum16(String string2, int ... nArray) {
        this.itemID = nArray;
        this.teleportOption = string2;
    }

    public String s() {
        return this.teleportOption;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public int[] u() {
        return this.itemID;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        h.var25();
        h.var26();
        int[] nArray = new int[2];
        nArray[0] = 3;
        nArray[1] = 4;
        nArray[5] = 6;
        nArray[7] = 8;
        nArray[9] = var1[10];
        nArray[h.var1[11]] = var1[12];
        nArray[h.var1[13]] = var1[14];
        nArray[h.var1[15]] = var1[16];
        RING_OF_DUELING = new GameEnum16(var2[1], 1, nArray);
        int[] nArray2 = new int[7];
        nArray2[0] = var1[17];
        nArray2[1] = var1[18];
        nArray2[5] = var1[19];
        ARDOUGNE_CLOAK = new GameEnum16(var2[7], nArray2);
        int[] nArray3 = new int[var1[15]];
        nArray3[0] = var1[20];
        nArray3[1] = var1[21];
        nArray3[5] = var1[22];
        nArray3[7] = var1[23];
        nArray3[9] = var1[24];
        nArray3[h.var1[11]] = var1[25];
        nArray3[h.var1[13]] = var1[26];
        AMULET_OF_GLORY = new GameEnum16(var2[var1[11]], 1, nArray3);
        int[] nArray4 = new int[1];
        nArray4[0] = var1[27];
        RADAS_BLESSING = new GameEnum16(var2[var1[15]], 1, nArray4);
        int[] nArray5 = new int[1];
        nArray5[0] = var1[29];
        HOUSE_TELEPORT = new GameEnum16(var2[var1[28]], nArray5);
        int[] nArray6 = new int[1];
        nArray6[0] = var1[32];
        ZULANDRA_TELEPORT = new GameEnum16(var2[var1[31]], nArray6);
        int[] nArray7 = new int[1];
        nArray7[0] = var1[35];
        ROYAL_SEED_POD = new GameEnum16(var2[var1[34]], nArray7);
        int[] nArray8 = new int[1];
        nArray8[0] = var1[38];
        ECTOPHIAL = new GameEnum16(var2[var1[37]], nArray8);
        int[] nArray9 = new int[5];
        nArray9[0] = var1[41];
        nArray9[1] = var1[42];
        CONSTRUCTION_CAPE = new GameEnum16(var2[var1[40]], nArray9);
        int[] nArray10 = new int[5];
        nArray10[0] = var1[45];
        nArray10[1] = var1[46];
        QUEST_CAPE = new GameEnum16(var2[var1[44]], nArray10);
        int[] nArray11 = new int[7];
        nArray11[0] = var1[49];
        nArray11[1] = var1[50];
        nArray11[5] = var1[51];
        MAX_CAPE = new GameEnum16(var2[var1[48]], nArray11);
        int[] nArray12 = new int[5];
        nArray12[0] = var1[54];
        nArray12[1] = var1[55];
        CRAFTING_CAPE = new GameEnum16(var2[var1[53]], nArray12);
        int[] nArray13 = new int[5];
        nArray13[0] = var1[58];
        nArray13[1] = var1[59];
        FISHING_CAPE = new GameEnum16(var2[var1[57]], nArray13);
        int[] nArray14 = new int[5];
        nArray14[0] = var1[62];
        nArray14[1] = var1[63];
        EXPLORERS_RING = new GameEnum16(var2[var1[61]], nArray14);
        h[] hArray = new h[var1[36]];
        hArray[0] = RING_OF_DUELING;
        hArray[1] = ARDOUGNE_CLOAK;
        hArray[5] = AMULET_OF_GLORY;
        hArray[7] = RADAS_BLESSING;
        hArray[9] = HOUSE_TELEPORT;
        hArray[h.var1[11]] = ZULANDRA_TELEPORT;
        hArray[h.var1[13]] = ROYAL_SEED_POD;
        hArray[h.var1[15]] = ECTOPHIAL;
        hArray[2] = CONSTRUCTION_CAPE;
        hArray[h.var1[28]] = QUEST_CAPE;
        hArray[h.var1[30]] = MAX_CAPE;
        hArray[h.var1[31]] = CRAFTING_CAPE;
        hArray[h.var1[33]] = FISHING_CAPE;
        hArray[h.var1[34]] = EXPLORERS_RING;
        $VALUES = hArray;
    }

    private GameEnum16(String string2, boolean bl, int ... nArray) {
        this.itemID = nArray;
        this.mustBeEquipped = bl;
        this.teleportOption = string2;
    }

    public boolean t() {
        return this.mustBeEquipped;
    }
}

