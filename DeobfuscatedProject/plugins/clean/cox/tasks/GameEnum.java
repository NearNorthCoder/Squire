/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

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
        void var1;
        int n3 = n2 >> lIlIllIllIIl[0] & lIlIllIllIIl[1];
        int n4 = (n2 >> lIlIllIllIIl[1] & lIlIllIllIIl[2]) * lIlIllIllIIl[3];
        int n5 = (n2 >> lIlIllIllIIl[4] & lIlIllIllIIl[5]) * lIlIllIllIIl[3];
        int n6 = n2 >> lIlIllIllIIl[6] & lIlIllIllIIl[1];
        M[] mArray = M.values();
        int n7 = mArray.length;
        int var2 = lIlIllIllIIl[7];
        while (M.lllIIIIIlllIll(var2, (int)var1)) {
            void var3;
            void var4;
            void var5;
            void var6;
            void var7 = var6[var2];
            if (M.lllIIIIIllllII((int)var5, var7.bU()) && M.lllIIIIIllllIl((int)var4, var7.bS()) && M.lllIIIIIlllIll((int)var4, var7.bS() + var7.bV()) && M.lllIIIIIllllIl((int)var3, var7.bT()) && M.lllIIIIIlllIll((int)var3, var7.bT() + var7.bW())) {
                return var7;
            }
            ++var2;

            if (2 != 0) continue;
            return null;
        }
        return null;
    }

        return String.valueOf(var8);
    }

    private static boolean lllIIIIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIIIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIIIIlllIIl() {
        lIlIllIlIllI = new String[lIlIllIllIIl[73]];
        M.lIlIllIlIllI[M.lIlIllIllIIl[7]] = "RAIDS_LOBBY1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[0]] = "RAIDS_LOBBY2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[12]] = "RAIDS_LOBBY3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[1]] = "RAIDS_START1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[15]] = "RAIDS_START2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[16]] = "RAIDS_START3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[17]] = "RAIDS_END1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[19]] = "RAIDS_END2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[3]] = "RAIDS_END3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[20]] = "RAIDS_SCAVENGERS11";
        M.lIlIllIlIllI[M.lIlIllIllIIl[22]] = "RAIDS_SCAVENGERS12";
        M.lIlIllIlIllI[M.lIlIllIllIIl[23]] = "RAIDS_SCAVENGERS13";
        M.lIlIllIlIllI[M.lIlIllIllIIl[24]] = "RAIDS_SHAMANS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[26]] = "RAIDS_SHAMANS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[4]] = "RAIDS_SHAMANS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[27]] = "RAIDS_VASA1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[29]] = "RAIDS_VASA2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[30]] = "RAIDS_VASA3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[31]] = "RAIDS_VANGUARDS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[33]] = "RAIDS_VANGUARDS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[34]] = "RAIDS_VANGUARDS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[35]] = "RAIDS_ICE_DEMON1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[37]] = "RAIDS_ICE_DEMON2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[38]] = "RAIDS_ICE_DEMON3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[6]] = "RAIDS_THIEVING1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[40]] = "RAIDS_THIEVING2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[41]] = "RAIDS_THIEVING3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[42]] = "RAIDS_FARMING11";
        M.lIlIllIlIllI[M.lIlIllIllIIl[44]] = "RAIDS_FARMING12";
        M.lIlIllIlIllI[M.lIlIllIllIIl[45]] = "RAIDS_FARMING13";
        M.lIlIllIlIllI[M.lIlIllIllIIl[46]] = "RAIDS_SCAVENGERS21";
        M.lIlIllIlIllI[M.lIlIllIllIIl[47]] = "RAIDS_SCAVENGERS22";
        M.lIlIllIlIllI[M.lIlIllIllIIl[8]] = "RAIDS_SCAVENGERS23";
        M.lIlIllIlIllI[M.lIlIllIllIIl[48]] = "RAIDS_MUTTADILES1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[49]] = "RAIDS_MUTTADILES2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[50]] = "RAIDS_MUTTADILES3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[51]] = "RAIDS_MYSTICS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[52]] = "RAIDS_MYSTICS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[53]] = "RAIDS_MYSTICS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[54]] = "RAIDS_TEKTON1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[55]] = "RAIDS_TEKTON2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[56]] = "RAIDS_TEKTON3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[57]] = "RAIDS_TIGHTROPE1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[58]] = "RAIDS_TIGHTROPE2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[59]] = "RAIDS_TIGHTROPE3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[60]] = "RAIDS_FARMING21";
        M.lIlIllIlIllI[M.lIlIllIllIIl[61]] = "RAIDS_FARMING22";
        M.lIlIllIlIllI[M.lIlIllIllIIl[62]] = "RAIDS_FARMING23";
        M.lIlIllIlIllI[M.lIlIllIllIIl[63]] = "RAIDS_GUARDIANS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[64]] = "RAIDS_GUARDIANS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[65]] = "RAIDS_GUARDIANS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[66]] = "RAIDS_VESPULA1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[67]] = "RAIDS_VESPULA2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[68]] = "RAIDS_VESPULA3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[69]] = "RAIDS_CRABS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[70]] = "RAIDS_CRABS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[71]] = "RAIDS_CRABS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[72]] = "RAIDS_EMPTY";
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
        this.width = lIlIllIllIIl[8];
        this.height = lIlIllIllIIl[8];
    }

    public int bT() {
        return this.baseY;
    }

    static {
        M.lllIIIIIlllIlI();
        M.lllIIIIIlllIIl();
        RAIDS_LOBBY1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_LOBBY2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_LOBBY3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_START1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_START2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_START3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_END1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_END2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_END3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS11 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS12 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS13 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SHAMANS1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_SHAMANS2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_SHAMANS3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_VASA1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VASA2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VASA3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_THIEVING1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_THIEVING2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_THIEVING3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_FARMING11 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_FARMING12 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_FARMING13 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS21 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_SCAVENGERS22 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_SCAVENGERS23 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MYSTICS1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_MYSTICS2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_MYSTICS3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_TEKTON1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TEKTON2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TEKTON3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_FARMING21 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_FARMING22 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_FARMING23 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_GUARDIANS1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_GUARDIANS2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_GUARDIANS3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_VESPULA1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_VESPULA2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_VESPULA3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_CRABS1 = new GameEnum(lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_CRABS2 = new GameEnum(lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_CRABS3 = new GameEnum(lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_EMPTY = new GameEnum(lIlIllIllIIl[7], lIlIllIllIIl[7], lIlIllIllIIl[7]);
        M[] mArray = new M[lIlIllIllIIl[73]];
        mArray[M.lIlIllIllIIl[7]] = RAIDS_LOBBY1;
        mArray[M.lIlIllIllIIl[0]] = RAIDS_LOBBY2;
        mArray[M.lIlIllIllIIl[12]] = RAIDS_LOBBY3;
        mArray[M.lIlIllIllIIl[1]] = RAIDS_START1;
        mArray[M.lIlIllIllIIl[15]] = RAIDS_START2;
        mArray[M.lIlIllIllIIl[16]] = RAIDS_START3;
        mArray[M.lIlIllIllIIl[17]] = RAIDS_END1;
        mArray[M.lIlIllIllIIl[19]] = RAIDS_END2;
        mArray[M.lIlIllIllIIl[3]] = RAIDS_END3;
        mArray[M.lIlIllIllIIl[20]] = RAIDS_SCAVENGERS11;
        mArray[M.lIlIllIllIIl[22]] = RAIDS_SCAVENGERS12;
        mArray[M.lIlIllIllIIl[23]] = RAIDS_SCAVENGERS13;
        mArray[M.lIlIllIllIIl[24]] = RAIDS_SHAMANS1;
        mArray[M.lIlIllIllIIl[26]] = RAIDS_SHAMANS2;
        mArray[M.lIlIllIllIIl[4]] = RAIDS_SHAMANS3;
        mArray[M.lIlIllIllIIl[27]] = RAIDS_VASA1;
        mArray[M.lIlIllIllIIl[29]] = RAIDS_VASA2;
        mArray[M.lIlIllIllIIl[30]] = RAIDS_VASA3;
        mArray[M.lIlIllIllIIl[31]] = RAIDS_VANGUARDS1;
        mArray[M.lIlIllIllIIl[33]] = RAIDS_VANGUARDS2;
        mArray[M.lIlIllIllIIl[34]] = RAIDS_VANGUARDS3;
        mArray[M.lIlIllIllIIl[35]] = RAIDS_ICE_DEMON1;
        mArray[M.lIlIllIllIIl[37]] = RAIDS_ICE_DEMON2;
        mArray[M.lIlIllIllIIl[38]] = RAIDS_ICE_DEMON3;
        mArray[M.lIlIllIllIIl[6]] = RAIDS_THIEVING1;
        mArray[M.lIlIllIllIIl[40]] = RAIDS_THIEVING2;
        mArray[M.lIlIllIllIIl[41]] = RAIDS_THIEVING3;
        mArray[M.lIlIllIllIIl[42]] = RAIDS_FARMING11;
        mArray[M.lIlIllIllIIl[44]] = RAIDS_FARMING12;
        mArray[M.lIlIllIllIIl[45]] = RAIDS_FARMING13;
        mArray[M.lIlIllIllIIl[46]] = RAIDS_SCAVENGERS21;
        mArray[M.lIlIllIllIIl[47]] = RAIDS_SCAVENGERS22;
        mArray[M.lIlIllIllIIl[8]] = RAIDS_SCAVENGERS23;
        mArray[M.lIlIllIllIIl[48]] = RAIDS_MUTTADILES1;
        mArray[M.lIlIllIllIIl[49]] = RAIDS_MUTTADILES2;
        mArray[M.lIlIllIllIIl[50]] = RAIDS_MUTTADILES3;
        mArray[M.lIlIllIllIIl[51]] = RAIDS_MYSTICS1;
        mArray[M.lIlIllIllIIl[52]] = RAIDS_MYSTICS2;
        mArray[M.lIlIllIllIIl[53]] = RAIDS_MYSTICS3;
        mArray[M.lIlIllIllIIl[54]] = RAIDS_TEKTON1;
        mArray[M.lIlIllIllIIl[55]] = RAIDS_TEKTON2;
        mArray[M.lIlIllIllIIl[56]] = RAIDS_TEKTON3;
        mArray[M.lIlIllIllIIl[57]] = RAIDS_TIGHTROPE1;
        mArray[M.lIlIllIllIIl[58]] = RAIDS_TIGHTROPE2;
        mArray[M.lIlIllIllIIl[59]] = RAIDS_TIGHTROPE3;
        mArray[M.lIlIllIllIIl[60]] = RAIDS_FARMING21;
        mArray[M.lIlIllIllIIl[61]] = RAIDS_FARMING22;
        mArray[M.lIlIllIllIIl[62]] = RAIDS_FARMING23;
        mArray[M.lIlIllIllIIl[63]] = RAIDS_GUARDIANS1;
        mArray[M.lIlIllIllIIl[64]] = RAIDS_GUARDIANS2;
        mArray[M.lIlIllIllIIl[65]] = RAIDS_GUARDIANS3;
        mArray[M.lIlIllIllIIl[66]] = RAIDS_VESPULA1;
        mArray[M.lIlIllIllIIl[67]] = RAIDS_VESPULA2;
        mArray[M.lIlIllIllIIl[68]] = RAIDS_VESPULA3;
        mArray[M.lIlIllIllIIl[69]] = RAIDS_CRABS1;
        mArray[M.lIlIllIllIIl[70]] = RAIDS_CRABS2;
        mArray[M.lIlIllIllIIl[71]] = RAIDS_CRABS3;
        mArray[M.lIlIllIllIIl[72]] = RAIDS_EMPTY;
        $VALUES = mArray;
    }

    private static boolean lllIIIIIllllII(int n2, int n3) {
        return n2 == n3;
    }
}

