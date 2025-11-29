/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

public final class GameEnum
extends Enum<M> {
    public static final  /* enum */ M RAIDS_SHAMANS1;
    public static final  /* enum */ M RAIDS_SCAVENGERS12;
    public static final  /* enum */ M RAIDS_GUARDIANS2;
    public static final  /* enum */ M RAIDS_TEKTON1;
    public static final  /* enum */ M RAIDS_LOBBY2;
    public static final  /* enum */ M RAIDS_FARMING12;
    public static final  /* enum */ M RAIDS_EMPTY;
    public static final  /* enum */ M RAIDS_VANGUARDS2;
    public static final  /* enum */ M RAIDS_FARMING23;
    public static final  /* enum */ M RAIDS_END2;
    public static final  /* enum */ M RAIDS_VESPULA1;
    public static final  /* enum */ M RAIDS_VASA3;
    public static final  /* enum */ M RAIDS_VANGUARDS1;
    
    public static final  /* enum */ M RAIDS_END3;
    public static final  /* enum */ M RAIDS_FARMING21;
    public static final  /* enum */ M RAIDS_MYSTICS3;
    public static final  /* enum */ M RAIDS_GUARDIANS1;
    public static final  /* enum */ M RAIDS_VASA2;
    public static final  /* enum */ M RAIDS_MYSTICS2;
    public static final  /* enum */ M RAIDS_START3;
    public static final  /* enum */ M RAIDS_LOBBY1;
    private static final  M[] $VALUES;
    public static final  /* enum */ M RAIDS_START2;
    public static final  /* enum */ M RAIDS_LOBBY3;
    public static final  /* enum */ M RAIDS_CRABS2;
    public static final  /* enum */ M RAIDS_CRABS3;
    public static final  /* enum */ M RAIDS_VESPULA2;
    public static final  /* enum */ M RAIDS_THIEVING2;
    public static final  /* enum */ M RAIDS_END1;
    public static final  /* enum */ M RAIDS_FARMING13;
    public static final  /* enum */ M RAIDS_ICE_DEMON1;
    public static final  /* enum */ M RAIDS_TEKTON2;
    private final  int baseY;
    public static final  /* enum */ M RAIDS_VASA1;
    public static final  /* enum */ M RAIDS_ICE_DEMON2;
    private final  int width;
    public static final  /* enum */ M RAIDS_ICE_DEMON3;
    public static final  /* enum */ M RAIDS_TIGHTROPE2;
    private final  int baseX;
    public static final  /* enum */ M RAIDS_MUTTADILES2;
    public static final  /* enum */ M RAIDS_SCAVENGERS11;
    public static final  /* enum */ M RAIDS_SHAMANS2;
    public static final  /* enum */ M RAIDS_MUTTADILES1;
    public static final  /* enum */ M RAIDS_TIGHTROPE1;
    public static final  /* enum */ M RAIDS_THIEVING3;
    public static final  /* enum */ M RAIDS_CRABS1;
    public static final  /* enum */ M RAIDS_SHAMANS3;
    public static final  /* enum */ M RAIDS_MUTTADILES3;
    
    public static final  /* enum */ M RAIDS_FARMING11;
    public static final  /* enum */ M RAIDS_TIGHTROPE3;
    public static final  /* enum */ M RAIDS_MYSTICS1;
    public static final  /* enum */ M RAIDS_SCAVENGERS23;
    public static final  /* enum */ M RAIDS_TEKTON3;
    public static final  /* enum */ M RAIDS_VESPULA3;
    public static final  /* enum */ M RAIDS_SCAVENGERS13;
    private final  int height;
    public static final  /* enum */ M RAIDS_SCAVENGERS21;
    public static final  /* enum */ M RAIDS_SCAVENGERS22;
    private final  int plane;
    public static final  /* enum */ M RAIDS_START1;
    public static final  /* enum */ M RAIDS_VANGUARDS3;
    public static final  /* enum */ M RAIDS_FARMING22;
    public static final  /* enum */ M RAIDS_THIEVING1;
    public static final  /* enum */ M RAIDS_GUARDIANS3;

    public static M[] values() {
        return (M[])$VALUES.clone();
    }

    public int bS() {
        return this.baseX;
    }

    public int bU() {
        return this.plane;
    }

    public int bV() {
        return this.width;
    }

    /*
     * WARNING - void declaration
     */
    public static M x(int n2) {
        void var3;
        int n3 = n2 >> 0 & 1;
        int n4 = (n2 >> 1 & 2) * 3;
        int n5 = (n2 >> 4 & 5) * 3;
        int n6 = n2 >> 6 & 1;
        M[] mArray = M.values();
        int n7 = mArray.length;
        int var4 = 7;
        while ((var4 < (int)var3)) {
            void var5;
            void var6;
            void var7;
            void var8;
            void var9 = var8[var4];
            if (((int)var7 == var9.bU()) && ((int)var6 >= var9.bS()) && ((int)var6 < var9.bS() + var9.bV()) && ((int)var5 >= var9.bT()) && ((int)var5 < var9.bT() + var9.bW())) {
                return var9;
            }
            ++var4;
            0;
            if (2 != 0) continue;
            return null;
        }
        return null;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 7;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 7;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (((54 + 88 - 105 + 90 ^ (0x66 ^ 0x7B)) & (0xBC ^ 0xB4 ^ (0xFB ^ 0x91) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    public static M valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public int bW() {
        return this.height;
    }

    private GameEnum(int n3, int n4, int n5) {
        this.baseX = n3;
        this.baseY = n4;
        this.plane = n5;
        this.width = 8;
        this.height = 8;
    }

    public int bT() {
        return this.baseY;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    static {
        M.var32();
        M.var33();
        RAIDS_LOBBY1 = new GameEnum(9, var2[10], 7);
        RAIDS_LOBBY2 = new GameEnum(var2[11], var2[10], 7);
        RAIDS_LOBBY3 = new GameEnum(var2[13], var2[10], 7);
        RAIDS_START1 = new GameEnum(9, var2[14], 7);
        RAIDS_START2 = new GameEnum(var2[11], var2[14], 7);
        RAIDS_START3 = new GameEnum(var2[13], var2[14], 7);
        RAIDS_END1 = new GameEnum(9, var2[18], 7);
        RAIDS_END2 = new GameEnum(var2[11], var2[18], 7);
        RAIDS_END3 = new GameEnum(var2[13], var2[18], 7);
        RAIDS_SCAVENGERS11 = new GameEnum(9, var2[21], 7);
        RAIDS_SCAVENGERS12 = new GameEnum(var2[11], var2[21], 7);
        RAIDS_SCAVENGERS13 = new GameEnum(var2[13], var2[21], 7);
        RAIDS_SHAMANS1 = new GameEnum(9, var2[25], 7);
        RAIDS_SHAMANS2 = new GameEnum(var2[11], var2[25], 7);
        RAIDS_SHAMANS3 = new GameEnum(var2[13], var2[25], 7);
        RAIDS_VASA1 = new GameEnum(9, var2[28], 7);
        RAIDS_VASA2 = new GameEnum(var2[11], var2[28], 7);
        RAIDS_VASA3 = new GameEnum(var2[13], var2[28], 7);
        RAIDS_VANGUARDS1 = new GameEnum(9, var2[32], 7);
        RAIDS_VANGUARDS2 = new GameEnum(var2[11], var2[32], 7);
        RAIDS_VANGUARDS3 = new GameEnum(var2[13], var2[32], 7);
        RAIDS_ICE_DEMON1 = new GameEnum(9, var2[36], 7);
        RAIDS_ICE_DEMON2 = new GameEnum(var2[11], var2[36], 7);
        RAIDS_ICE_DEMON3 = new GameEnum(var2[13], var2[36], 7);
        RAIDS_THIEVING1 = new GameEnum(9, var2[39], 7);
        RAIDS_THIEVING2 = new GameEnum(var2[11], var2[39], 7);
        RAIDS_THIEVING3 = new GameEnum(var2[13], var2[39], 7);
        RAIDS_FARMING11 = new GameEnum(9, var2[43], 7);
        RAIDS_FARMING12 = new GameEnum(var2[11], var2[43], 7);
        RAIDS_FARMING13 = new GameEnum(var2[13], var2[43], 7);
        RAIDS_SCAVENGERS21 = new GameEnum(9, var2[21], 0);
        RAIDS_SCAVENGERS22 = new GameEnum(var2[11], var2[21], 0);
        RAIDS_SCAVENGERS23 = new GameEnum(var2[13], var2[21], 0);
        RAIDS_MUTTADILES1 = new GameEnum(9, var2[32], 0);
        RAIDS_MUTTADILES2 = new GameEnum(var2[11], var2[32], 0);
        RAIDS_MUTTADILES3 = new GameEnum(var2[13], var2[32], 0);
        RAIDS_MYSTICS1 = new GameEnum(9, var2[25], 0);
        RAIDS_MYSTICS2 = new GameEnum(var2[11], var2[25], 0);
        RAIDS_MYSTICS3 = new GameEnum(var2[13], var2[25], 0);
        RAIDS_TEKTON1 = new GameEnum(9, var2[28], 0);
        RAIDS_TEKTON2 = new GameEnum(var2[11], var2[28], 0);
        RAIDS_TEKTON3 = new GameEnum(var2[13], var2[28], 0);
        RAIDS_TIGHTROPE1 = new GameEnum(9, var2[36], 0);
        RAIDS_TIGHTROPE2 = new GameEnum(var2[11], var2[36], 0);
        RAIDS_TIGHTROPE3 = new GameEnum(var2[13], var2[36], 0);
        RAIDS_FARMING21 = new GameEnum(9, var2[43], 0);
        RAIDS_FARMING22 = new GameEnum(var2[11], var2[43], 0);
        RAIDS_FARMING23 = new GameEnum(var2[13], var2[43], 0);
        RAIDS_GUARDIANS1 = new GameEnum(9, var2[25], var2[12]);
        RAIDS_GUARDIANS2 = new GameEnum(var2[11], var2[25], var2[12]);
        RAIDS_GUARDIANS3 = new GameEnum(var2[13], var2[25], var2[12]);
        RAIDS_VESPULA1 = new GameEnum(9, var2[28], var2[12]);
        RAIDS_VESPULA2 = new GameEnum(var2[11], var2[28], var2[12]);
        RAIDS_VESPULA3 = new GameEnum(var2[13], var2[28], var2[12]);
        RAIDS_CRABS1 = new GameEnum(9, var2[36], var2[12]);
        RAIDS_CRABS2 = new GameEnum(var2[11], var2[36], var2[12]);
        RAIDS_CRABS3 = new GameEnum(var2[13], var2[36], var2[12]);
        RAIDS_EMPTY = new GameEnum(7, 7, 7);
        M[] mArray = new M[var2[73]];
        mArray[7] = RAIDS_LOBBY1;
        mArray[0] = RAIDS_LOBBY2;
        mArray[M.var2[12]] = RAIDS_LOBBY3;
        mArray[1] = RAIDS_START1;
        mArray[M.var2[15]] = RAIDS_START2;
        mArray[M.var2[16]] = RAIDS_START3;
        mArray[M.var2[17]] = RAIDS_END1;
        mArray[M.var2[19]] = RAIDS_END2;
        mArray[3] = RAIDS_END3;
        mArray[M.var2[20]] = RAIDS_SCAVENGERS11;
        mArray[M.var2[22]] = RAIDS_SCAVENGERS12;
        mArray[M.var2[23]] = RAIDS_SCAVENGERS13;
        mArray[M.var2[24]] = RAIDS_SHAMANS1;
        mArray[M.var2[26]] = RAIDS_SHAMANS2;
        mArray[4] = RAIDS_SHAMANS3;
        mArray[M.var2[27]] = RAIDS_VASA1;
        mArray[M.var2[29]] = RAIDS_VASA2;
        mArray[M.var2[30]] = RAIDS_VASA3;
        mArray[M.var2[31]] = RAIDS_VANGUARDS1;
        mArray[M.var2[33]] = RAIDS_VANGUARDS2;
        mArray[M.var2[34]] = RAIDS_VANGUARDS3;
        mArray[M.var2[35]] = RAIDS_ICE_DEMON1;
        mArray[M.var2[37]] = RAIDS_ICE_DEMON2;
        mArray[M.var2[38]] = RAIDS_ICE_DEMON3;
        mArray[6] = RAIDS_THIEVING1;
        mArray[M.var2[40]] = RAIDS_THIEVING2;
        mArray[M.var2[41]] = RAIDS_THIEVING3;
        mArray[M.var2[42]] = RAIDS_FARMING11;
        mArray[M.var2[44]] = RAIDS_FARMING12;
        mArray[M.var2[45]] = RAIDS_FARMING13;
        mArray[M.var2[46]] = RAIDS_SCAVENGERS21;
        mArray[M.var2[47]] = RAIDS_SCAVENGERS22;
        mArray[8] = RAIDS_SCAVENGERS23;
        mArray[M.var2[48]] = RAIDS_MUTTADILES1;
        mArray[M.var2[49]] = RAIDS_MUTTADILES2;
        mArray[M.var2[50]] = RAIDS_MUTTADILES3;
        mArray[M.var2[51]] = RAIDS_MYSTICS1;
        mArray[M.var2[52]] = RAIDS_MYSTICS2;
        mArray[M.var2[53]] = RAIDS_MYSTICS3;
        mArray[M.var2[54]] = RAIDS_TEKTON1;
        mArray[M.var2[55]] = RAIDS_TEKTON2;
        mArray[M.var2[56]] = RAIDS_TEKTON3;
        mArray[M.var2[57]] = RAIDS_TIGHTROPE1;
        mArray[M.var2[58]] = RAIDS_TIGHTROPE2;
        mArray[M.var2[59]] = RAIDS_TIGHTROPE3;
        mArray[M.var2[60]] = RAIDS_FARMING21;
        mArray[M.var2[61]] = RAIDS_FARMING22;
        mArray[M.var2[62]] = RAIDS_FARMING23;
        mArray[M.var2[63]] = RAIDS_GUARDIANS1;
        mArray[M.var2[64]] = RAIDS_GUARDIANS2;
        mArray[M.var2[65]] = RAIDS_GUARDIANS3;
        mArray[M.var2[66]] = RAIDS_VESPULA1;
        mArray[M.var2[67]] = RAIDS_VESPULA2;
        mArray[M.var2[68]] = RAIDS_VESPULA3;
        mArray[M.var2[69]] = RAIDS_CRABS1;
        mArray[M.var2[70]] = RAIDS_CRABS2;
        mArray[M.var2[71]] = RAIDS_CRABS3;
        mArray[M.var2[72]] = RAIDS_EMPTY;
        $VALUES = mArray;
    }

}

