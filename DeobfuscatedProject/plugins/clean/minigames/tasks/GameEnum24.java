/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum24
extends Enum<C> {
    public static final  /* enum */ C CAPE;
    
    public static final  /* enum */ C HEAD;
    public final  int boost;
    public static final  /* enum */ C BODY;
    public static final  /* enum */ C BOOTS;
    private static final  C[] $VALUES;
    
    public static final  /* enum */ C LEGS;
    public static final  /* enum */ C GLOVES;
    public final  int[] items;

    private static boolean llIIlllIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    private static void llIIlllIIlIIlI() {
        lIIllIIIllll = new String[lIIllIIlIIII[13]];
        C.lIIllIIIllll[C.lIIllIIlIIII[0]] = "HEAD";
        C.lIIllIIIllll[C.lIIllIIlIIII[3]] = "BODY";
        C.lIIllIIIllll[C.lIIllIIlIIII[5]] = "LEGS";
        C.lIIllIIIllll[C.lIIllIIlIIII[7]] = "GLOVES";
        C.lIIllIIIllll[C.lIIllIIlIIII[9]] = "BOOTS";
        C.lIIllIIIllll[C.lIIllIIlIIII[11]] = "CAPE";
    }

    static {
        C.llIIlllIIlIIll();
        C.llIIlllIIlIIlI();
        int[] nArray = new int[lIIllIIlIIII[1]];
        nArray[C.lIIllIIlIIII[0]] = lIIllIIlIIII[2];
        nArray[C.lIIllIIlIIII[3]] = lIIllIIlIIII[4];
        nArray[C.lIIllIIlIIII[5]] = lIIllIIlIIII[6];
        nArray[C.lIIllIIlIIII[7]] = lIIllIIlIIII[8];
        nArray[C.lIIllIIlIIII[9]] = lIIllIIlIIII[10];
        nArray[C.lIIllIIlIIII[11]] = lIIllIIlIIII[12];
        nArray[C.lIIllIIlIIII[13]] = lIIllIIlIIII[14];
        nArray[C.lIIllIIlIIII[15]] = lIIllIIlIIII[16];
        nArray[C.lIIllIIlIIII[17]] = lIIllIIlIIII[18];
        nArray[C.lIIllIIlIIII[19]] = lIIllIIlIIII[20];
        nArray[C.lIIllIIlIIII[21]] = lIIllIIlIIII[22];
        nArray[C.lIIllIIlIIII[23]] = lIIllIIlIIII[24];
        nArray[C.lIIllIIlIIII[25]] = lIIllIIlIIII[26];
        nArray[C.lIIllIIlIIII[27]] = lIIllIIlIIII[28];
        nArray[C.lIIllIIlIIII[29]] = lIIllIIlIIII[30];
        nArray[C.lIIllIIlIIII[31]] = lIIllIIlIIII[32];
        nArray[C.lIIllIIlIIII[33]] = lIIllIIlIIII[34];
        nArray[C.lIIllIIlIIII[35]] = lIIllIIlIIII[36];
        nArray[C.lIIllIIlIIII[37]] = lIIllIIlIIII[38];
        HEAD = new GameEnum24(nArray, lIIllIIlIIII[7]);
        int[] nArray2 = new int[lIIllIIlIIII[1]];
        nArray2[C.lIIllIIlIIII[0]] = lIIllIIlIIII[39];
        nArray2[C.lIIllIIlIIII[3]] = lIIllIIlIIII[40];
        nArray2[C.lIIllIIlIIII[5]] = lIIllIIlIIII[41];
        nArray2[C.lIIllIIlIIII[7]] = lIIllIIlIIII[42];
        nArray2[C.lIIllIIlIIII[9]] = lIIllIIlIIII[43];
        nArray2[C.lIIllIIlIIII[11]] = lIIllIIlIIII[44];
        nArray2[C.lIIllIIlIIII[13]] = lIIllIIlIIII[45];
        nArray2[C.lIIllIIlIIII[15]] = lIIllIIlIIII[46];
        nArray2[C.lIIllIIlIIII[17]] = lIIllIIlIIII[47];
        nArray2[C.lIIllIIlIIII[19]] = lIIllIIlIIII[48];
        nArray2[C.lIIllIIlIIII[21]] = lIIllIIlIIII[49];
        nArray2[C.lIIllIIlIIII[23]] = lIIllIIlIIII[50];
        nArray2[C.lIIllIIlIIII[25]] = lIIllIIlIIII[51];
        nArray2[C.lIIllIIlIIII[27]] = lIIllIIlIIII[52];
        nArray2[C.lIIllIIlIIII[29]] = lIIllIIlIIII[53];
        nArray2[C.lIIllIIlIIII[31]] = lIIllIIlIIII[54];
        nArray2[C.lIIllIIlIIII[33]] = lIIllIIlIIII[55];
        nArray2[C.lIIllIIlIIII[35]] = lIIllIIlIIII[56];
        nArray2[C.lIIllIIlIIII[37]] = lIIllIIlIIII[57];
        BODY = new GameEnum24(nArray2, lIIllIIlIIII[9]);
        int[] nArray3 = new int[lIIllIIlIIII[1]];
        nArray3[C.lIIllIIlIIII[0]] = lIIllIIlIIII[58];
        nArray3[C.lIIllIIlIIII[3]] = lIIllIIlIIII[59];
        nArray3[C.lIIllIIlIIII[5]] = lIIllIIlIIII[60];
        nArray3[C.lIIllIIlIIII[7]] = lIIllIIlIIII[61];
        nArray3[C.lIIllIIlIIII[9]] = lIIllIIlIIII[62];
        nArray3[C.lIIllIIlIIII[11]] = lIIllIIlIIII[63];
        nArray3[C.lIIllIIlIIII[13]] = lIIllIIlIIII[64];
        nArray3[C.lIIllIIlIIII[15]] = lIIllIIlIIII[65];
        nArray3[C.lIIllIIlIIII[17]] = lIIllIIlIIII[66];
        nArray3[C.lIIllIIlIIII[19]] = lIIllIIlIIII[67];
        nArray3[C.lIIllIIlIIII[21]] = lIIllIIlIIII[68];
        nArray3[C.lIIllIIlIIII[23]] = lIIllIIlIIII[69];
        nArray3[C.lIIllIIlIIII[25]] = lIIllIIlIIII[70];
        nArray3[C.lIIllIIlIIII[27]] = lIIllIIlIIII[71];
        nArray3[C.lIIllIIlIIII[29]] = lIIllIIlIIII[72];
        nArray3[C.lIIllIIlIIII[31]] = lIIllIIlIIII[73];
        nArray3[C.lIIllIIlIIII[33]] = lIIllIIlIIII[74];
        nArray3[C.lIIllIIlIIII[35]] = lIIllIIlIIII[75];
        nArray3[C.lIIllIIlIIII[37]] = lIIllIIlIIII[76];
        LEGS = new GameEnum24(nArray3, lIIllIIlIIII[9]);
        int[] nArray4 = new int[lIIllIIlIIII[1]];
        nArray4[C.lIIllIIlIIII[0]] = lIIllIIlIIII[77];
        nArray4[C.lIIllIIlIIII[3]] = lIIllIIlIIII[78];
        nArray4[C.lIIllIIlIIII[5]] = lIIllIIlIIII[79];
        nArray4[C.lIIllIIlIIII[7]] = lIIllIIlIIII[80];
        nArray4[C.lIIllIIlIIII[9]] = lIIllIIlIIII[81];
        nArray4[C.lIIllIIlIIII[11]] = lIIllIIlIIII[82];
        nArray4[C.lIIllIIlIIII[13]] = lIIllIIlIIII[83];
        nArray4[C.lIIllIIlIIII[15]] = lIIllIIlIIII[84];
        nArray4[C.lIIllIIlIIII[17]] = lIIllIIlIIII[85];
        nArray4[C.lIIllIIlIIII[19]] = lIIllIIlIIII[86];
        nArray4[C.lIIllIIlIIII[21]] = lIIllIIlIIII[87];
        nArray4[C.lIIllIIlIIII[23]] = lIIllIIlIIII[88];
        nArray4[C.lIIllIIlIIII[25]] = lIIllIIlIIII[89];
        nArray4[C.lIIllIIlIIII[27]] = lIIllIIlIIII[90];
        nArray4[C.lIIllIIlIIII[29]] = lIIllIIlIIII[91];
        nArray4[C.lIIllIIlIIII[31]] = lIIllIIlIIII[92];
        nArray4[C.lIIllIIlIIII[33]] = lIIllIIlIIII[93];
        nArray4[C.lIIllIIlIIII[35]] = lIIllIIlIIII[94];
        nArray4[C.lIIllIIlIIII[37]] = lIIllIIlIIII[95];
        GLOVES = new GameEnum24(nArray4, lIIllIIlIIII[7]);
        int[] nArray5 = new int[lIIllIIlIIII[1]];
        nArray5[C.lIIllIIlIIII[0]] = lIIllIIlIIII[96];
        nArray5[C.lIIllIIlIIII[3]] = lIIllIIlIIII[97];
        nArray5[C.lIIllIIlIIII[5]] = lIIllIIlIIII[98];
        nArray5[C.lIIllIIlIIII[7]] = lIIllIIlIIII[99];
        nArray5[C.lIIllIIlIIII[9]] = lIIllIIlIIII[100];
        nArray5[C.lIIllIIlIIII[11]] = lIIllIIlIIII[101];
        nArray5[C.lIIllIIlIIII[13]] = lIIllIIlIIII[102];
        nArray5[C.lIIllIIlIIII[15]] = lIIllIIlIIII[103];
        nArray5[C.lIIllIIlIIII[17]] = lIIllIIlIIII[104];
        nArray5[C.lIIllIIlIIII[19]] = lIIllIIlIIII[105];
        nArray5[C.lIIllIIlIIII[21]] = lIIllIIlIIII[106];
        nArray5[C.lIIllIIlIIII[23]] = lIIllIIlIIII[107];
        nArray5[C.lIIllIIlIIII[25]] = lIIllIIlIIII[108];
        nArray5[C.lIIllIIlIIII[27]] = lIIllIIlIIII[109];
        nArray5[C.lIIllIIlIIII[29]] = lIIllIIlIIII[110];
        nArray5[C.lIIllIIlIIII[31]] = lIIllIIlIIII[111];
        nArray5[C.lIIllIIlIIII[33]] = lIIllIIlIIII[112];
        nArray5[C.lIIllIIlIIII[35]] = lIIllIIlIIII[113];
        nArray5[C.lIIllIIlIIII[37]] = lIIllIIlIIII[114];
        BOOTS = new GameEnum24(nArray5, lIIllIIlIIII[7]);
        int[] nArray6 = new int[lIIllIIlIIII[115]];
        nArray6[C.lIIllIIlIIII[0]] = lIIllIIlIIII[116];
        nArray6[C.lIIllIIlIIII[3]] = lIIllIIlIIII[117];
        nArray6[C.lIIllIIlIIII[5]] = lIIllIIlIIII[118];
        nArray6[C.lIIllIIlIIII[7]] = lIIllIIlIIII[119];
        nArray6[C.lIIllIIlIIII[9]] = lIIllIIlIIII[120];
        nArray6[C.lIIllIIlIIII[11]] = lIIllIIlIIII[121];
        nArray6[C.lIIllIIlIIII[13]] = lIIllIIlIIII[122];
        nArray6[C.lIIllIIlIIII[15]] = lIIllIIlIIII[123];
        nArray6[C.lIIllIIlIIII[17]] = lIIllIIlIIII[124];
        nArray6[C.lIIllIIlIIII[19]] = lIIllIIlIIII[125];
        nArray6[C.lIIllIIlIIII[21]] = lIIllIIlIIII[126];
        nArray6[C.lIIllIIlIIII[23]] = lIIllIIlIIII[127];
        nArray6[C.lIIllIIlIIII[25]] = lIIllIIlIIII[128];
        nArray6[C.lIIllIIlIIII[27]] = lIIllIIlIIII[129];
        nArray6[C.lIIllIIlIIII[29]] = lIIllIIlIIII[130];
        nArray6[C.lIIllIIlIIII[31]] = lIIllIIlIIII[131];
        nArray6[C.lIIllIIlIIII[33]] = lIIllIIlIIII[132];
        nArray6[C.lIIllIIlIIII[35]] = lIIllIIlIIII[133];
        nArray6[C.lIIllIIlIIII[37]] = lIIllIIlIIII[134];
        nArray6[C.lIIllIIlIIII[1]] = lIIllIIlIIII[135];
        nArray6[C.lIIllIIlIIII[136]] = lIIllIIlIIII[137];
        nArray6[C.lIIllIIlIIII[138]] = lIIllIIlIIII[139];
        CAPE = new GameEnum24(nArray6, lIIllIIlIIII[7]);
        C[] cArray = new C[lIIllIIlIIII[13]];
        cArray[C.lIIllIIlIIII[0]] = HEAD;
        cArray[C.lIIllIIlIIII[3]] = BODY;
        cArray[C.lIIllIIlIIII[5]] = LEGS;
        cArray[C.lIIllIIlIIII[7]] = GLOVES;
        cArray[C.lIIllIIlIIII[9]] = BOOTS;
        cArray[C.lIIllIIlIIII[11]] = CAPE;
        $VALUES = cArray;
    }

    private GameEnum24(int[] nArray, int n3) {
        this.items = nArray;
        this.boost = n3;
    }

        return String.valueOf(var1);
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

}

