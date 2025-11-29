/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.k;

public final class l
extends Enum<l> {
    public static final /* synthetic */ /* enum */ l TYPE_19;
    public static final /* synthetic */ /* enum */ l TYPE_11;
    public static final /* synthetic */ /* enum */ l TYPE_6;
    private static final /* synthetic */ l[] $VALUES;
    public static final /* synthetic */ /* enum */ l TYPE_24;
    public static final /* synthetic */ /* enum */ l TYPE_2;
    public static final /* synthetic */ /* enum */ l TYPE_16;
    public static final /* synthetic */ /* enum */ l TYPE_27;
    public static final /* synthetic */ /* enum */ l TYPE_4;
    public static final /* synthetic */ /* enum */ l TYPE_7;
    private static final /* synthetic */ Map<Integer, l> weaponTypes;
    private static /* synthetic */ String[] lIlIlIIIllIll;
    public static final /* synthetic */ /* enum */ l TYPE_12;
    public static final /* synthetic */ /* enum */ l TYPE_18;
    public static final /* synthetic */ /* enum */ l TYPE_29;
    private final /* synthetic */ k[] attackStyles;
    public static final /* synthetic */ /* enum */ l TYPE_17;
    public static final /* synthetic */ /* enum */ l TYPE_28;
    public static final /* synthetic */ /* enum */ l TYPE_0;
    public static final /* synthetic */ /* enum */ l TYPE_22;
    public static final /* synthetic */ /* enum */ l TYPE_26;
    public static final /* synthetic */ /* enum */ l TYPE_10;
    public static final /* synthetic */ /* enum */ l TYPE_20;
    public static final /* synthetic */ /* enum */ l TYPE_8;
    private static /* synthetic */ int[] lIlIlIIIlllIl;
    public static final /* synthetic */ /* enum */ l TYPE_21;
    public static final /* synthetic */ /* enum */ l TYPE_9;
    public static final /* synthetic */ /* enum */ l TYPE_5;
    public static final /* synthetic */ /* enum */ l TYPE_1;
    public static final /* synthetic */ /* enum */ l TYPE_13;
    public static final /* synthetic */ /* enum */ l TYPE_3;
    public static final /* synthetic */ /* enum */ l TYPE_25;
    public static final /* synthetic */ /* enum */ l TYPE_23;
    public static final /* synthetic */ /* enum */ l TYPE_14;
    public static final /* synthetic */ /* enum */ l TYPE_15;

    private static boolean lIllllIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void var17;
            l.lIllllIllIlIlII();
            l.lIllllIllIlIIll();
            k[] kArray = new k[lIlIlIIIlllIl[1]];
            kArray[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray[l.lIlIlIIIlllIl[3]] = null;
            kArray[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_0 = new l(kArray);
            k[] kArray2 = new k[lIlIlIIIlllIl[1]];
            kArray2[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray2[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray2[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray2[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_1 = new l(kArray2);
            k[] kArray3 = new k[lIlIlIIIlllIl[1]];
            kArray3[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray3[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray3[l.lIlIlIIIlllIl[3]] = null;
            kArray3[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_2 = new l(kArray3);
            k[] kArray4 = new k[lIlIlIIIlllIl[1]];
            kArray4[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray4[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray4[l.lIlIlIIIlllIl[3]] = null;
            kArray4[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_3 = new l(kArray4);
            k[] kArray5 = new k[lIlIlIIIlllIl[1]];
            kArray5[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray5[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray5[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray5[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_4 = new l(kArray5);
            k[] kArray6 = new k[lIlIlIIIlllIl[1]];
            kArray6[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray6[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray6[l.lIlIlIIIlllIl[3]] = null;
            kArray6[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_5 = new l(kArray6);
            k[] kArray7 = new k[lIlIlIIIlllIl[1]];
            kArray7[l.lIlIlIIIlllIl[0]] = k.AGGRESSIVE;
            kArray7[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray7[l.lIlIlIIIlllIl[3]] = k.CASTING;
            kArray7[l.lIlIlIIIlllIl[4]] = null;
            TYPE_6 = new l(kArray7);
            k[] kArray8 = new k[lIlIlIIIlllIl[1]];
            kArray8[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray8[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray8[l.lIlIlIIIlllIl[3]] = null;
            kArray8[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_7 = new l(kArray8);
            k[] kArray9 = new k[lIlIlIIIlllIl[1]];
            kArray9[l.lIlIlIIIlllIl[0]] = k.OTHER;
            kArray9[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray9[l.lIlIlIIIlllIl[3]] = null;
            kArray9[l.lIlIlIIIlllIl[4]] = null;
            TYPE_8 = new l(kArray9);
            k[] kArray10 = new k[lIlIlIIIlllIl[1]];
            kArray10[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray10[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray10[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray10[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_9 = new l(kArray10);
            k[] kArray11 = new k[lIlIlIIIlllIl[1]];
            kArray11[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray11[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray11[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray11[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_10 = new l(kArray11);
            k[] kArray12 = new k[lIlIlIIIlllIl[1]];
            kArray12[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray12[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray12[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray12[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_11 = new l(kArray12);
            k[] kArray13 = new k[lIlIlIIIlllIl[1]];
            kArray13[l.lIlIlIIIlllIl[0]] = k.CONTROLLED;
            kArray13[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray13[l.lIlIlIIIlllIl[3]] = null;
            kArray13[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_12 = new l(kArray13);
            k[] kArray14 = new k[lIlIlIIIlllIl[1]];
            kArray14[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray14[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray14[l.lIlIlIIIlllIl[3]] = null;
            kArray14[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_13 = new l(kArray14);
            k[] kArray15 = new k[lIlIlIIIlllIl[1]];
            kArray15[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray15[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray15[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray15[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_14 = new l(kArray15);
            k[] kArray16 = new k[lIlIlIIIlllIl[1]];
            kArray16[l.lIlIlIIIlllIl[0]] = k.CONTROLLED;
            kArray16[l.lIlIlIIIlllIl[2]] = k.CONTROLLED;
            kArray16[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray16[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_15 = new l(kArray16);
            k[] kArray17 = new k[lIlIlIIIlllIl[1]];
            kArray17[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray17[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray17[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray17[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_16 = new l(kArray17);
            k[] kArray18 = new k[lIlIlIIIlllIl[1]];
            kArray18[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray18[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray18[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray18[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_17 = new l(kArray18);
            k[] kArray19 = new k[lIlIlIIIlllIl[6]];
            kArray19[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray19[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray19[l.lIlIlIIIlllIl[3]] = null;
            kArray19[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            kArray19[l.lIlIlIIIlllIl[1]] = k.CASTING;
            kArray19[l.lIlIlIIIlllIl[5]] = k.DEFENSIVE_CASTING;
            TYPE_18 = new l(kArray19);
            k[] kArray20 = new k[lIlIlIIIlllIl[1]];
            kArray20[l.lIlIlIIIlllIl[0]] = k.RANGING;
            kArray20[l.lIlIlIIIlllIl[2]] = k.RANGING;
            kArray20[l.lIlIlIIIlllIl[3]] = null;
            kArray20[l.lIlIlIIIlllIl[4]] = k.LONGRANGE;
            TYPE_19 = new l(kArray20);
            k[] kArray21 = new k[lIlIlIIIlllIl[1]];
            kArray21[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray21[l.lIlIlIIIlllIl[2]] = k.CONTROLLED;
            kArray21[l.lIlIlIIIlllIl[3]] = null;
            kArray21[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_20 = new l(kArray21);
            k[] kArray22 = new k[lIlIlIIIlllIl[6]];
            kArray22[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray22[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray22[l.lIlIlIIIlllIl[3]] = null;
            kArray22[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            kArray22[l.lIlIlIIIlllIl[1]] = k.CASTING;
            kArray22[l.lIlIlIIIlllIl[5]] = k.DEFENSIVE_CASTING;
            TYPE_21 = new l(kArray22);
            k[] kArray23 = new k[lIlIlIIIlllIl[1]];
            kArray23[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray23[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray23[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray23[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_22 = new l(kArray23);
            k[] kArray24 = new k[lIlIlIIIlllIl[1]];
            kArray24[l.lIlIlIIIlllIl[0]] = k.CASTING;
            kArray24[l.lIlIlIIIlllIl[2]] = k.CASTING;
            kArray24[l.lIlIlIIIlllIl[3]] = null;
            kArray24[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE_CASTING;
            TYPE_23 = new l(kArray24);
            k[] kArray25 = new k[lIlIlIIIlllIl[1]];
            kArray25[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray25[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray25[l.lIlIlIIIlllIl[3]] = k.CONTROLLED;
            kArray25[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_24 = new l(kArray25);
            k[] kArray26 = new k[lIlIlIIIlllIl[1]];
            kArray26[l.lIlIlIIIlllIl[0]] = k.CONTROLLED;
            kArray26[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray26[l.lIlIlIIIlllIl[3]] = null;
            kArray26[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_25 = new l(kArray26);
            k[] kArray27 = new k[lIlIlIIIlllIl[1]];
            kArray27[l.lIlIlIIIlllIl[0]] = k.AGGRESSIVE;
            kArray27[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray27[l.lIlIlIIIlllIl[3]] = null;
            kArray27[l.lIlIlIIIlllIl[4]] = k.AGGRESSIVE;
            TYPE_26 = new l(kArray27);
            k[] kArray28 = new k[lIlIlIIIlllIl[1]];
            kArray28[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray28[l.lIlIlIIIlllIl[2]] = null;
            kArray28[l.lIlIlIIIlllIl[3]] = null;
            kArray28[l.lIlIlIIIlllIl[4]] = k.OTHER;
            TYPE_27 = new l(kArray28);
            k[] kArray29 = new k[lIlIlIIIlllIl[4]];
            kArray29[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray29[l.lIlIlIIIlllIl[2]] = k.ACCURATE;
            kArray29[l.lIlIlIIIlllIl[3]] = k.LONGRANGE;
            TYPE_28 = new l(kArray29);
            k[] kArray30 = new k[lIlIlIIIlllIl[1]];
            kArray30[l.lIlIlIIIlllIl[0]] = k.ACCURATE;
            kArray30[l.lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
            kArray30[l.lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
            kArray30[l.lIlIlIIIlllIl[4]] = k.DEFENSIVE;
            TYPE_29 = new l(kArray30);
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
            int var24 = lIlIlIIIlllIl[0];
            while (l.lIllllIllIlIlIl(var24, (int)var17)) {
                void var23;
                void var19;
                void var11 = var19[var24];
                var23.put((Object)var11.ordinal(), (Object)var11);
                0;
                ++var24;
                0;
                if ((4 ^ 0) > 2) continue;
                break block1;
            }
            weaponTypes = builder.build();
        }
    }

    private static String lIllllIllIIlIIl(String var5, String var20) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlllIl[8]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIlIlIIIlllIl[3], var8);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lIllllIllIlIIll() {
        lIlIlIIIllIll = new String[lIlIlIIIlllIl[30]];
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[0]] = l."TYPE_0";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[2]] = l."TYPE_1";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[3]] = l."TYPE_2";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[4]] = l."TYPE_3";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[1]] = l."TYPE_4";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[5]] = l."TYPE_5";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[6]] = l."TYPE_6";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[7]] = l."TYPE_7";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[8]] = l."TYPE_8";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[9]] = l."TYPE_9";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[10]] = l."TYPE_10";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[11]] = l."TYPE_11";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[12]] = l."TYPE_12";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[13]] = l."TYPE_13";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[14]] = l."TYPE_14";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[15]] = l."TYPE_15";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[16]] = l."TYPE_16";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[17]] = l."TYPE_17";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[18]] = l."TYPE_18";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[19]] = l."TYPE_19";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[20]] = l."TYPE_20";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[21]] = l."TYPE_21";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[22]] = l."TYPE_22";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[23]] = l."TYPE_23";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[24]] = l."TYPE_24";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[25]] = l."TYPE_25";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[26]] = l."TYPE_26";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[27]] = l."TYPE_27";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[28]] = l."TYPE_28";
        l.lIlIlIIIllIll[l.lIlIlIIIlllIl[29]] = l."TYPE_29";
    }

    private static void lIllllIllIlIlII() {
        lIlIlIIIlllIl = new int[31];
        l.lIlIlIIIlllIl[0] = 2 & ~2;
        l.lIlIlIIIlllIl[1] = 0xB8 ^ 0xBC;
        l.lIlIlIIIlllIl[2] = 1;
        l.lIlIlIIIlllIl[3] = 2;
        l.lIlIlIIIlllIl[4] = 3;
        l.lIlIlIIIlllIl[5] = 0xB0 ^ 0xB4 ^ 1;
        l.lIlIlIIIlllIl[6] = 10 + 126 - 10 + 32 ^ 110 + 149 - 124 + 17;
        l.lIlIlIIIlllIl[7] = 0xB4 ^ 0x96 ^ (0x22 ^ 7);
        l.lIlIlIIIlllIl[8] = 0x88 ^ 0x80;
        l.lIlIlIIIlllIl[9] = 0x72 ^ 0x7B;
        l.lIlIlIIIlllIl[10] = 0x7B ^ 0x6E ^ (0x22 ^ 0x3D);
        l.lIlIlIIIlllIl[11] = 190 + 95 - 192 + 112 ^ 20 + 70 - -56 + 52;
        l.lIlIlIIIlllIl[12] = 0x28 ^ 0x24;
        l.lIlIlIIIlllIl[13] = 132 + 87 - 122 + 48 ^ 9 + 69 - 46 + 124;
        l.lIlIlIIIlllIl[14] = 0x9F ^ 0x91;
        l.lIlIlIIIlllIl[15] = 0x95 ^ 0x9A;
        l.lIlIlIIIlllIl[16] = 0x38 ^ 0x28;
        l.lIlIlIIIlllIl[17] = 0x6D ^ 0x7C;
        l.lIlIlIIIlllIl[18] = 0x74 ^ 0x6F ^ (0x36 ^ 0x3F);
        l.lIlIlIIIlllIl[19] = 6 + 210 - 103 + 98 ^ 96 + 111 - 170 + 155;
        l.lIlIlIIIlllIl[20] = 0xB8 ^ 0xAC;
        l.lIlIlIIIlllIl[21] = 0xAB ^ 0xBE;
        l.lIlIlIIIlllIl[22] = 0xB8 ^ 0xC2 ^ (0x79 ^ 0x15);
        l.lIlIlIIIlllIl[23] = 80 + 137 - 172 + 108 ^ 20 + 45 - -12 + 65;
        l.lIlIlIIIlllIl[24] = 2 + 182 - 34 + 38 ^ 81 + 120 - 176 + 139;
        l.lIlIlIIIlllIl[25] = 50 + 121 - 144 + 113 ^ 29 + 148 - 169 + 141;
        l.lIlIlIIIlllIl[26] = 0x8A ^ 0xBA ^ (7 ^ 0x2D);
        l.lIlIlIIIlllIl[27] = 0xB6 ^ 0x9C ^ (0x41 ^ 0x70);
        l.lIlIlIIIlllIl[28] = 0x1B ^ 7;
        l.lIlIlIIIlllIl[29] = 0x6F ^ 0x72;
        l.lIlIlIIIlllIl[30] = 0x12 ^ 0x71 ^ (0xF2 ^ 0x8F);
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIllllIllIIlIlI(String var14, String var13) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var18 = var13.toCharArray();
        int var12 = lIlIlIIIlllIl[0];
        char[] var1 = var14.toCharArray();
        int var3 = var1.length;
        int var16 = lIlIlIIIlllIl[0];
        while (l.lIllllIllIlIlIl(var16, var3)) {
            char var7 = var1[var16];
            var10.append((char)(var7 ^ var18[var12 % var18.length]));
            0;
            ++var12;
            ++var16;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private l(k ... kArray) {
        this.attackStyles = kArray;
    }

    public k[] O() {
        return this.attackStyles;
    }

    private static String lIllllIllIIlIll(String var9, String var22) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIlIIIlllIl[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static l e(int n2) {
        return weaponTypes.get(n2);
    }
}

