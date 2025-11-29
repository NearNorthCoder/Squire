/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package gg.squire.vardorvis.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.vardorvis.tasks.GameEnum8;

public final class GameEnum18
extends Enum<l> {
    public static final  /* enum */ l TYPE_19;
    public static final  /* enum */ l TYPE_11;
    public static final  /* enum */ l TYPE_6;
    private static final  l[] $VALUES;
    public static final  /* enum */ l TYPE_24;
    public static final  /* enum */ l TYPE_2;
    public static final  /* enum */ l TYPE_16;
    public static final  /* enum */ l TYPE_27;
    public static final  /* enum */ l TYPE_4;
    public static final  /* enum */ l TYPE_7;
    private static final  Map<Integer, l> weaponTypes;
    
    public static final  /* enum */ l TYPE_12;
    public static final  /* enum */ l TYPE_18;
    public static final  /* enum */ l TYPE_29;
    private final  k[] attackStyles;
    public static final  /* enum */ l TYPE_17;
    public static final  /* enum */ l TYPE_28;
    public static final  /* enum */ l TYPE_0;
    public static final  /* enum */ l TYPE_22;
    public static final  /* enum */ l TYPE_26;
    public static final  /* enum */ l TYPE_10;
    public static final  /* enum */ l TYPE_20;
    public static final  /* enum */ l TYPE_8;
    
    public static final  /* enum */ l TYPE_21;
    public static final  /* enum */ l TYPE_9;
    public static final  /* enum */ l TYPE_5;
    public static final  /* enum */ l TYPE_1;
    public static final  /* enum */ l TYPE_13;
    public static final  /* enum */ l TYPE_3;
    public static final  /* enum */ l TYPE_25;
    public static final  /* enum */ l TYPE_23;
    public static final  /* enum */ l TYPE_14;
    public static final  /* enum */ l TYPE_15;

    private static boolean lIllllIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void var1;
            l.lIllllIllIlIlII();
            l.lIllllIllIlIIll();
            k[] kArray = new k[lIlIlIIIlllIl[1]];
            kArray[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray[l.lIlIlIIIlllIl[3]] = null;
            kArray[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_0 = new GameEnum18(kArray);
            k[] kArray2 = new k[lIlIlIIIlllIl[1]];
            kArray2[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray2[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray2[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray2[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_1 = new GameEnum18(kArray2);
            k[] kArray3 = new k[lIlIlIIIlllIl[1]];
            kArray3[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray3[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray3[l.lIlIlIIIlllIl[3]] = null;
            kArray3[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_2 = new GameEnum18(kArray3);
            k[] kArray4 = new k[lIlIlIIIlllIl[1]];
            kArray4[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray4[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray4[l.lIlIlIIIlllIl[3]] = null;
            kArray4[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_3 = new GameEnum18(kArray4);
            k[] kArray5 = new k[lIlIlIIIlllIl[1]];
            kArray5[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray5[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray5[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray5[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_4 = new GameEnum18(kArray5);
            k[] kArray6 = new k[lIlIlIIIlllIl[1]];
            kArray6[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray6[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray6[l.lIlIlIIIlllIl[3]] = null;
            kArray6[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_5 = new GameEnum18(kArray6);
            k[] kArray7 = new k[lIlIlIIIlllIl[1]];
            kArray7[l.lIlIlIIIlllIl[0]] = k.AGGRESSIVE;
            kArray7[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray7[l.lIlIlIIIlllIl[3]] = k.CASTING;
            kArray7[l.lIlIlIIIlllIl[4]] = null;
            TYPE_6 = new GameEnum18(kArray7);
            k[] kArray8 = new k[lIlIlIIIlllIl[1]];
            kArray8[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray8[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray8[l.lIlIlIIIlllIl[3]] = null;
            kArray8[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_7 = new GameEnum18(kArray8);
            k[] kArray9 = new k[lIlIlIIIlllIl[1]];
            kArray9[l.lIlIlIIIlllIl[0]] = k.OTHER;
            kArray9[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray9[l.lIlIlIIIlllIl[3]] = null;
            kArray9[l.lIlIlIIIlllIl[4]] = null;
            TYPE_8 = new GameEnum18(kArray9);
            k[] kArray10 = new k[lIlIlIIIlllIl[1]];
            kArray10[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray10[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray10[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray10[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_9 = new GameEnum18(kArray10);
            k[] kArray11 = new k[lIlIlIIIlllIl[1]];
            kArray11[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray11[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray11[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray11[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_10 = new GameEnum18(kArray11);
            k[] kArray12 = new k[lIlIlIIIlllIl[1]];
            kArray12[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray12[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray12[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray12[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_11 = new GameEnum18(kArray12);
            k[] kArray13 = new k[lIlIlIIIlllIl[1]];
            kArray13[l.lIlIlIIIlllIl[0]] = k.CONTROLLED;
            kArray13[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray13[l.lIlIlIIIlllIl[3]] = null;
            kArray13[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_12 = new GameEnum18(kArray13);
            k[] kArray14 = new k[lIlIlIIIlllIl[1]];
            kArray14[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray14[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray14[l.lIlIlIIIlllIl[3]] = null;
            kArray14[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_13 = new GameEnum18(kArray14);
            k[] kArray15 = new k[lIlIlIIIlllIl[1]];
            kArray15[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray15[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray15[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray15[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_14 = new GameEnum18(kArray15);
            k[] kArray16 = new k[lIlIlIIIlllIl[1]];
            kArray16[l.lIlIlIIIlllIl[0]] = k.CONTROLLED;
            kArray16[l.lIlIlIIIlllIl[2]] = k.CONTROLLED;
            kArray16[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray16[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_15 = new GameEnum18(kArray16);
            k[] kArray17 = new k[lIlIlIIIlllIl[1]];
            kArray17[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray17[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray17[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray17[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_16 = new GameEnum18(kArray17);
            k[] kArray18 = new k[lIlIlIIIlllIl[1]];
            kArray18[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray18[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray18[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray18[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_17 = new GameEnum18(kArray18);
            k[] kArray19 = new k[lIlIlIIIlllIl[6]];
            kArray19[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray19[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray19[l.lIlIlIIIlllIl[3]] = null;
            kArray19[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            kArray19[l.lIlIlIIIlllIl[1]] = k.CASTING;
            kArray19[l.lIlIlIIIlllIl[5]] = k.DEFENSIVE_CASTING;
            TYPE_18 = new GameEnum18(kArray19);
            k[] kArray20 = new k[lIlIlIIIlllIl[1]];
            kArray20[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray20[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray20[l.lIlIlIIIlllIl[3]] = null;
            kArray20[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_19 = new GameEnum18(kArray20);
            k[] kArray21 = new k[lIlIlIIIlllIl[1]];
            kArray21[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray21[l.lIlIlIIIlllIl[2]] = k.CONTROLLED;
            kArray21[l.lIlIlIIIlllIl[3]] = null;
            kArray21[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_20 = new GameEnum18(kArray21);
            k[] kArray22 = new k[lIlIlIIIlllIl[6]];
            kArray22[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray22[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray22[l.lIlIlIIIlllIl[3]] = null;
            kArray22[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            kArray22[l.lIlIlIIIlllIl[1]] = k.CASTING;
            kArray22[l.lIlIlIIIlllIl[5]] = k.DEFENSIVE_CASTING;
            TYPE_21 = new GameEnum18(kArray22);
            k[] kArray23 = new k[lIlIlIIIlllIl[1]];
            kArray23[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray23[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray23[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray23[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_22 = new GameEnum18(kArray23);
            k[] kArray24 = new k[lIlIlIIIlllIl[1]];
            kArray24[l.lIlIlIIIlllIl[0]] = k.CASTING;
            kArray24[l.lIlIlIIIlllIl[2]] = k.CASTING;
            kArray24[l.lIlIlIIIlllIl[3]] = null;
            kArray24[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE_CASTING;
            TYPE_23 = new GameEnum18(kArray24);
            k[] kArray25 = new k[lIlIlIIIlllIl[1]];
            kArray25[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray25[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray25[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray25[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_24 = new GameEnum18(kArray25);
            k[] kArray26 = new k[lIlIlIIIlllIl[1]];
            kArray26[l.lIlIlIIIlllIl[0]] = k.CONTROLLED;
            kArray26[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray26[l.lIlIlIIIlllIl[3]] = null;
            kArray26[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_25 = new GameEnum18(kArray26);
            k[] kArray27 = new k[lIlIlIIIlllIl[1]];
            kArray27[l.lIlIlIIIlllIl[0]] = k.AGGRESSIVE;
            kArray27[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray27[l.lIlIlIIIlllIl[3]] = null;
            kArray27[l.lIlIlIIIlllIl[4]] = k.AGGRESSIVE;
            TYPE_26 = new GameEnum18(kArray27);
            k[] kArray28 = new k[lIlIlIIIlllIl[1]];
            kArray28[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray28[l.lIlIlIIIlllIl[2]] = null;
            kArray28[l.lIlIlIIIlllIl[3]] = null;
            kArray28[l.lIlIlIIIlllIl[4]] = k.OTHER;
            TYPE_27 = new GameEnum18(kArray28);
            k[] kArray29 = new k[lIlIlIIIlllIl[4]];
            kArray29[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray29[l.lIlIlIIIlllIl[2]] = k.ACCURATE;
            kArray29[l.lIlIlIIIlllIl[3]] = k.LONGRANGE;
            TYPE_28 = new GameEnum18(kArray29);
            k[] kArray30 = new k[lIlIlIIIlllIl[1]];
            kArray30[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray30[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray30[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray30[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_29 = new GameEnum18(kArray30);
            l[] lArray = new l[lIlIlIIIlllIl[30]];
            lArray[l.lIlIlIIIlllIl[0]] = TYPE_0;
            lArray[l.lIlIlIIIlllIl[2]] = TYPE_1;
            lArray[l.lIlIlIIIlllIl[3]] = TYPE_2;
            lArray[l.lIlIlIIIlllIl[4]] = TYPE_3;
            lArray[l.lIlIlIIIlllIl[1]] = TYPE_4;
            lArray[l.lIlIlIIIlllIl[5]] = TYPE_5;
            lArray[l.lIlIlIIIlllIl[6]] = TYPE_6;
            lArray[l.lIlIlIIIlllIl[7]] = TYPE_7;
            lArray[l.lIlIlIIIlllIl[8]] = TYPE_8;
            lArray[l.lIlIlIIIlllIl[9]] = TYPE_9;
            lArray[l.lIlIlIIIlllIl[10]] = TYPE_10;
            lArray[l.lIlIlIIIlllIl[11]] = TYPE_11;
            lArray[l.lIlIlIIIlllIl[12]] = TYPE_12;
            lArray[l.lIlIlIIIlllIl[13]] = TYPE_13;
            lArray[l.lIlIlIIIlllIl[14]] = TYPE_14;
            lArray[l.lIlIlIIIlllIl[15]] = TYPE_15;
            lArray[l.lIlIlIIIlllIl[16]] = TYPE_16;
            lArray[l.lIlIlIIIlllIl[17]] = TYPE_17;
            lArray[l.lIlIlIIIlllIl[18]] = TYPE_18;
            lArray[l.lIlIlIIIlllIl[19]] = TYPE_19;
            lArray[l.lIlIlIIIlllIl[20]] = TYPE_20;
            lArray[l.lIlIlIIIlllIl[21]] = TYPE_21;
            lArray[l.lIlIlIIIlllIl[22]] = TYPE_22;
            lArray[l.lIlIlIIIlllIl[23]] = TYPE_23;
            lArray[l.lIlIlIIIlllIl[24]] = TYPE_24;
            lArray[l.lIlIlIIIlllIl[25]] = TYPE_25;
            lArray[l.lIlIlIIIlllIl[26]] = TYPE_26;
            lArray[l.lIlIlIIIlllIl[27]] = TYPE_27;
            lArray[l.lIlIlIIIlllIl[28]] = TYPE_28;
            lArray[l.lIlIlIIIlllIl[29]] = TYPE_29;
            $VALUES = lArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            l[] lArray2 = l.values();
            int n2 = lArray2.length;
            int var2 = lIlIlIIIlllIl[0];
            while (l.lIllllIllIlIlIl(var2, (int)var1)) {
                void var3;
                void var4;
                void var5 = var4[var2];
                var3.put((Object)var5.ordinal(), (Object)var5);

                ++var2;

                if ((4 ^ 0) > 2) continue;
                break block1;
            }
            weaponTypes = builder.build();
        }
    }

    private static void lIllllIllIlIIll() {
        lIlIlIIIllIll = new String[lIlIlIIIlllIl[30]];
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[0]] = "TYPE_0";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[2]] = "TYPE_1";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[3]] = "TYPE_2";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[4]] = "TYPE_3";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[1]] = "TYPE_4";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[5]] = "TYPE_5";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[6]] = "TYPE_6";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[7]] = "TYPE_7";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[8]] = "TYPE_8";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[9]] = "TYPE_9";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[10]] = "TYPE_10";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[11]] = "TYPE_11";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[12]] = "TYPE_12";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[13]] = "TYPE_13";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[14]] = "TYPE_14";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[15]] = "TYPE_15";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[16]] = "TYPE_16";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[17]] = "TYPE_17";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[18]] = "TYPE_18";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[19]] = "TYPE_19";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[20]] = "TYPE_20";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[21]] = "TYPE_21";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[22]] = "TYPE_22";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[23]] = "TYPE_23";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[24]] = "TYPE_24";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[25]] = "TYPE_25";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[26]] = "TYPE_26";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[27]] = "TYPE_27";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[28]] = "TYPE_28";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[29]] = "TYPE_29";
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

        return String.valueOf(var6);
    }

    private GameEnum18(k ... kArray) {
        this.attackStyles = kArray;
    }

    public k[] O() {
        return this.attackStyles;
    }

    public static l e(int n2) {
        return weaponTypes.get(n2);
    }
}

