/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum;
import java.util.stream.Stream;

public final class GameEnum3
extends Enum<e> {
    public static final  /* enum */ e WAVE21;
    public static final  /* enum */ e WAVE23;
    public static final  /* enum */ e WAVE42;
    public static final  /* enum */ e WAVE61;
    private static final  e[] $VALUES;
    public static final  /* enum */ e WAVE57;
    final  int waveNumber;
    public static final  /* enum */ e WAVE9;
    public static final  /* enum */ e WAVE51;
    public static final  /* enum */ e WAVE46;
    public static final  /* enum */ e WAVE40;
    public static final  /* enum */ e WAVE15;
    public static final  /* enum */ e WAVE8;
    public static final  /* enum */ e WAVE44;
    public static final  /* enum */ e WAVE41;
    public static final  /* enum */ e WAVE36;
    public static final  /* enum */ e WAVE13;
    public static final  /* enum */ e WAVE62;
    public static final  /* enum */ e WAVE47;
    public static final  /* enum */ e WAVE48;
    public static final  /* enum */ e WAVE24;
    private final  b[] monstersInWave;
    
    public static final  /* enum */ e WAVE5;
    public static final  /* enum */ e WAVE17;
    public static final  /* enum */ e WAVE55;
    public static final  /* enum */ e WAVE59;
    public static final  /* enum */ e WAVE31;
    public static final  /* enum */ e WAVE18;
    public static final  /* enum */ e WAVE16;
    public static final  /* enum */ e WAVE30;
    public static final  /* enum */ e WAVE63;
    public static final  /* enum */ e WAVE43;
    public static final  /* enum */ e WAVE11;
    public static final  /* enum */ e WAVE56;
    public static final  /* enum */ e WAVE60;
    public static final  /* enum */ e WAVE27;
    public static final  /* enum */ e WAVE58;
    public static final  /* enum */ e WAVE37;
    public static final  /* enum */ e WAVE7;
    public static final  /* enum */ e WAVE50;
    public static final  /* enum */ e WAVE29;
    
    public static final  /* enum */ e WAVE34;
    public static final  /* enum */ e WAVE3;
    public static final  /* enum */ e WAVE35;
    public static final  /* enum */ e WAVE52;
    public static final  /* enum */ e WAVE49;
    public static final  /* enum */ e WAVE4;
    public static final  /* enum */ e WAVE22;
    public static final  /* enum */ e WAVE20;
    public static final  /* enum */ e WAVE26;
    public static final  /* enum */ e WAVE19;
    public static final  /* enum */ e WAVE38;
    public static final  /* enum */ e WAVE32;
    public static final  /* enum */ e WAVE33;
    public static final  /* enum */ e NONE;
    public static final  /* enum */ e WAVE28;
    public static final  /* enum */ e WAVE2;
    public static final  /* enum */ e WAVE6;
    public static final  /* enum */ e WAVE45;
    public static final  /* enum */ e WAVE1;
    public static final  /* enum */ e WAVE12;
    public static final  /* enum */ e WAVE14;
    public static final  /* enum */ e WAVE25;
    public static final  /* enum */ e WAVE10;
    public static final  /* enum */ e WAVE39;
    public static final  /* enum */ e WAVE53;
    public static final  /* enum */ e WAVE54;

    public b[] h() {
        return this.monstersInWave;
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
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private GameEnum3(b[] bArray, int n3) {
        this.monstersInWave = bArray;
        this.waveNumber = n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        e.var25();
        e.var26();
        NONE = new GameEnum3(new b[0], 0);
        b[] bArray = new b[1];
        bArray[0] = b.BAT;
        WAVE1 = new GameEnum3(bArray, 1);
        b[] bArray2 = new b[2];
        bArray2[0] = b.BAT;
        bArray2[1] = b.BAT;
        WAVE2 = new GameEnum3(bArray2, 2);
        b[] bArray3 = new b[1];
        bArray3[0] = b.BLOB;
        WAVE3 = new GameEnum3(bArray3, 3);
        b[] bArray4 = new b[2];
        bArray4[0] = b.BAT;
        bArray4[1] = b.BLOB;
        WAVE4 = new GameEnum3(bArray4, 4);
        b[] bArray5 = new b[3];
        bArray5[0] = b.BAT;
        bArray5[1] = b.BAT;
        bArray5[2] = b.BLOB;
        WAVE5 = new GameEnum3(bArray5, 5);
        b[] bArray6 = new b[2];
        bArray6[0] = b.BLOB;
        bArray6[1] = b.BLOB;
        WAVE6 = new GameEnum3(bArray6, 6);
        b[] bArray7 = new b[1];
        bArray7[0] = b.RANGER;
        WAVE7 = new GameEnum3(bArray7, 7);
        b[] bArray8 = new b[2];
        bArray8[0] = b.BAT;
        bArray8[1] = b.RANGER;
        WAVE8 = new GameEnum3(bArray8, 8);
        b[] bArray9 = new b[3];
        bArray9[0] = b.BAT;
        bArray9[1] = b.BAT;
        bArray9[2] = b.RANGER;
        WAVE9 = new GameEnum3(bArray9, 9);
        b[] bArray10 = new b[2];
        bArray10[0] = b.BLOB;
        bArray10[1] = b.RANGER;
        WAVE10 = new GameEnum3(bArray10, var2[10]);
        b[] bArray11 = new b[3];
        bArray11[0] = b.BAT;
        bArray11[1] = b.BLOB;
        bArray11[2] = b.RANGER;
        WAVE11 = new GameEnum3(bArray11, var2[11]);
        b[] bArray12 = new b[4];
        bArray12[0] = b.BAT;
        bArray12[1] = b.BAT;
        bArray12[2] = b.BLOB;
        bArray12[3] = b.RANGER;
        WAVE12 = new GameEnum3(bArray12, var2[12]);
        b[] bArray13 = new b[3];
        bArray13[0] = b.BLOB;
        bArray13[1] = b.BLOB;
        bArray13[2] = b.RANGER;
        WAVE13 = new GameEnum3(bArray13, var2[13]);
        b[] bArray14 = new b[2];
        bArray14[0] = b.RANGER;
        bArray14[1] = b.RANGER;
        WAVE14 = new GameEnum3(bArray14, var2[14]);
        b[] bArray15 = new b[1];
        bArray15[0] = b.MELEER;
        WAVE15 = new GameEnum3(bArray15, var2[15]);
        b[] bArray16 = new b[2];
        bArray16[0] = b.BAT;
        bArray16[1] = b.MELEER;
        WAVE16 = new GameEnum3(bArray16, var2[16]);
        b[] bArray17 = new b[3];
        bArray17[0] = b.BAT;
        bArray17[1] = b.BAT;
        bArray17[2] = b.MELEER;
        WAVE17 = new GameEnum3(bArray17, var2[17]);
        b[] bArray18 = new b[2];
        bArray18[0] = b.BLOB;
        bArray18[1] = b.MELEER;
        WAVE18 = new GameEnum3(bArray18, var2[18]);
        b[] bArray19 = new b[3];
        bArray19[0] = b.BAT;
        bArray19[1] = b.BLOB;
        bArray19[2] = b.MELEER;
        WAVE19 = new GameEnum3(bArray19, var2[19]);
        b[] bArray20 = new b[4];
        bArray20[0] = b.BAT;
        bArray20[1] = b.BAT;
        bArray20[2] = b.BLOB;
        bArray20[3] = b.MELEER;
        WAVE20 = new GameEnum3(bArray20, var2[20]);
        b[] bArray21 = new b[3];
        bArray21[0] = b.BLOB;
        bArray21[1] = b.BLOB;
        bArray21[2] = b.MELEER;
        WAVE21 = new GameEnum3(bArray21, var2[21]);
        b[] bArray22 = new b[2];
        bArray22[0] = b.RANGER;
        bArray22[1] = b.MELEER;
        WAVE22 = new GameEnum3(bArray22, var2[22]);
        b[] bArray23 = new b[3];
        bArray23[0] = b.BAT;
        bArray23[1] = b.RANGER;
        bArray23[2] = b.MELEER;
        WAVE23 = new GameEnum3(bArray23, var2[23]);
        b[] bArray24 = new b[4];
        bArray24[0] = b.BAT;
        bArray24[1] = b.BAT;
        bArray24[2] = b.RANGER;
        bArray24[3] = b.MELEER;
        WAVE24 = new GameEnum3(bArray24, var2[24]);
        b[] bArray25 = new b[3];
        bArray25[0] = b.BLOB;
        bArray25[1] = b.RANGER;
        bArray25[2] = b.MELEER;
        WAVE25 = new GameEnum3(bArray25, var2[25]);
        b[] bArray26 = new b[4];
        bArray26[0] = b.BAT;
        bArray26[1] = b.BLOB;
        bArray26[2] = b.RANGER;
        bArray26[3] = b.MELEER;
        WAVE26 = new GameEnum3(bArray26, var2[26]);
        b[] bArray27 = new b[5];
        bArray27[0] = b.BAT;
        bArray27[1] = b.BAT;
        bArray27[2] = b.BLOB;
        bArray27[3] = b.RANGER;
        bArray27[4] = b.MELEER;
        WAVE27 = new GameEnum3(bArray27, var2[27]);
        b[] bArray28 = new b[4];
        bArray28[0] = b.BLOB;
        bArray28[1] = b.BLOB;
        bArray28[2] = b.RANGER;
        bArray28[3] = b.MELEER;
        WAVE28 = new GameEnum3(bArray28, var2[28]);
        b[] bArray29 = new b[3];
        bArray29[0] = b.RANGER;
        bArray29[1] = b.RANGER;
        bArray29[2] = b.MELEER;
        WAVE29 = new GameEnum3(bArray29, var2[29]);
        b[] bArray30 = new b[2];
        bArray30[0] = b.MELEER;
        bArray30[1] = b.MELEER;
        WAVE30 = new GameEnum3(bArray30, var2[30]);
        b[] bArray31 = new b[1];
        bArray31[0] = b.MAGER;
        WAVE31 = new GameEnum3(bArray31, var2[31]);
        b[] bArray32 = new b[1];
        bArray32[0] = b.MAGER;
        WAVE32 = new GameEnum3(bArray32, var2[32]);
        b[] bArray33 = new b[1];
        bArray33[0] = b.MAGER;
        WAVE33 = new GameEnum3(bArray33, var2[33]);
        b[] bArray34 = new b[1];
        bArray34[0] = b.MAGER;
        WAVE34 = new GameEnum3(bArray34, var2[34]);
        b[] bArray35 = new b[1];
        bArray35[0] = b.MAGER;
        WAVE35 = new GameEnum3(bArray35, var2[35]);
        b[] bArray36 = new b[1];
        bArray36[0] = b.MAGER;
        WAVE36 = new GameEnum3(bArray36, var2[36]);
        b[] bArray37 = new b[1];
        bArray37[0] = b.MAGER;
        WAVE37 = new GameEnum3(bArray37, var2[37]);
        b[] bArray38 = new b[1];
        bArray38[0] = b.MAGER;
        WAVE38 = new GameEnum3(bArray38, var2[38]);
        b[] bArray39 = new b[1];
        bArray39[0] = b.MAGER;
        WAVE39 = new GameEnum3(bArray39, var2[39]);
        b[] bArray40 = new b[1];
        bArray40[0] = b.MAGER;
        WAVE40 = new GameEnum3(bArray40, var2[40]);
        b[] bArray41 = new b[1];
        bArray41[0] = b.MAGER;
        WAVE41 = new GameEnum3(bArray41, var2[41]);
        b[] bArray42 = new b[1];
        bArray42[0] = b.MAGER;
        WAVE42 = new GameEnum3(bArray42, var2[42]);
        b[] bArray43 = new b[1];
        bArray43[0] = b.MAGER;
        WAVE43 = new GameEnum3(bArray43, var2[43]);
        b[] bArray44 = new b[1];
        bArray44[0] = b.MAGER;
        WAVE44 = new GameEnum3(bArray44, var2[44]);
        b[] bArray45 = new b[1];
        bArray45[0] = b.MAGER;
        WAVE45 = new GameEnum3(bArray45, var2[45]);
        b[] bArray46 = new b[1];
        bArray46[0] = b.MAGER;
        WAVE46 = new GameEnum3(bArray46, var2[46]);
        b[] bArray47 = new b[1];
        bArray47[0] = b.MAGER;
        WAVE47 = new GameEnum3(bArray47, var2[47]);
        b[] bArray48 = new b[1];
        bArray48[0] = b.MAGER;
        WAVE48 = new GameEnum3(bArray48, var2[48]);
        b[] bArray49 = new b[1];
        bArray49[0] = b.MAGER;
        WAVE49 = new GameEnum3(bArray49, var2[49]);
        b[] bArray50 = new b[1];
        bArray50[0] = b.MAGER;
        WAVE50 = new GameEnum3(bArray50, var2[50]);
        b[] bArray51 = new b[1];
        bArray51[0] = b.MAGER;
        WAVE51 = new GameEnum3(bArray51, var2[51]);
        b[] bArray52 = new b[1];
        bArray52[0] = b.MAGER;
        WAVE52 = new GameEnum3(bArray52, var2[52]);
        b[] bArray53 = new b[1];
        bArray53[0] = b.MAGER;
        WAVE53 = new GameEnum3(bArray53, var2[53]);
        b[] bArray54 = new b[1];
        bArray54[0] = b.MAGER;
        WAVE54 = new GameEnum3(bArray54, var2[54]);
        b[] bArray55 = new b[1];
        bArray55[0] = b.MAGER;
        WAVE55 = new GameEnum3(bArray55, var2[55]);
        b[] bArray56 = new b[1];
        bArray56[0] = b.MAGER;
        WAVE56 = new GameEnum3(bArray56, var2[56]);
        b[] bArray57 = new b[1];
        bArray57[0] = b.MAGER;
        WAVE57 = new GameEnum3(bArray57, var2[57]);
        b[] bArray58 = new b[1];
        bArray58[0] = b.MAGER;
        WAVE58 = new GameEnum3(bArray58, var2[58]);
        b[] bArray59 = new b[1];
        bArray59[0] = b.MAGER;
        WAVE59 = new GameEnum3(bArray59, var2[59]);
        b[] bArray60 = new b[1];
        bArray60[0] = b.MAGER;
        WAVE60 = new GameEnum3(bArray60, var2[60]);
        b[] bArray61 = new b[1];
        bArray61[0] = b.MAGER;
        WAVE61 = new GameEnum3(bArray61, var2[61]);
        b[] bArray62 = new b[1];
        bArray62[0] = b.MAGER;
        WAVE62 = new GameEnum3(bArray62, var2[62]);
        b[] bArray63 = new b[1];
        bArray63[0] = b.MAGER;
        WAVE63 = new GameEnum3(bArray63, var2[63]);
        e[] eArray = new e[var2[64]];
        eArray[0] = NONE;
        eArray[1] = WAVE1;
        eArray[2] = WAVE2;
        eArray[3] = WAVE3;
        eArray[4] = WAVE4;
        eArray[5] = WAVE5;
        eArray[6] = WAVE6;
        eArray[7] = WAVE7;
        eArray[8] = WAVE8;
        eArray[9] = WAVE9;
        eArray[e.var2[10]] = WAVE10;
        eArray[e.var2[11]] = WAVE11;
        eArray[e.var2[12]] = WAVE12;
        eArray[e.var2[13]] = WAVE13;
        eArray[e.var2[14]] = WAVE14;
        eArray[e.var2[15]] = WAVE15;
        eArray[e.var2[16]] = WAVE16;
        eArray[e.var2[17]] = WAVE17;
        eArray[e.var2[18]] = WAVE18;
        eArray[e.var2[19]] = WAVE19;
        eArray[e.var2[20]] = WAVE20;
        eArray[e.var2[21]] = WAVE21;
        eArray[e.var2[22]] = WAVE22;
        eArray[e.var2[23]] = WAVE23;
        eArray[e.var2[24]] = WAVE24;
        eArray[e.var2[25]] = WAVE25;
        eArray[e.var2[26]] = WAVE26;
        eArray[e.var2[27]] = WAVE27;
        eArray[e.var2[28]] = WAVE28;
        eArray[e.var2[29]] = WAVE29;
        eArray[e.var2[30]] = WAVE30;
        eArray[e.var2[31]] = WAVE31;
        eArray[e.var2[32]] = WAVE32;
        eArray[e.var2[33]] = WAVE33;
        eArray[e.var2[34]] = WAVE34;
        eArray[e.var2[35]] = WAVE35;
        eArray[e.var2[36]] = WAVE36;
        eArray[e.var2[37]] = WAVE37;
        eArray[e.var2[38]] = WAVE38;
        eArray[e.var2[39]] = WAVE39;
        eArray[e.var2[40]] = WAVE40;
        eArray[e.var2[41]] = WAVE41;
        eArray[e.var2[42]] = WAVE42;
        eArray[e.var2[43]] = WAVE43;
        eArray[e.var2[44]] = WAVE44;
        eArray[e.var2[45]] = WAVE45;
        eArray[e.var2[46]] = WAVE46;
        eArray[e.var2[47]] = WAVE47;
        eArray[e.var2[48]] = WAVE48;
        eArray[e.var2[49]] = WAVE49;
        eArray[e.var2[50]] = WAVE50;
        eArray[e.var2[51]] = WAVE51;
        eArray[e.var2[52]] = WAVE52;
        eArray[e.var2[53]] = WAVE53;
        eArray[e.var2[54]] = WAVE54;
        eArray[e.var2[55]] = WAVE55;
        eArray[e.var2[56]] = WAVE56;
        eArray[e.var2[57]] = WAVE57;
        eArray[e.var2[58]] = WAVE58;
        eArray[e.var2[59]] = WAVE59;
        eArray[e.var2[60]] = WAVE60;
        eArray[e.var2[61]] = WAVE61;
        eArray[e.var2[62]] = WAVE62;
        eArray[e.var2[63]] = WAVE63;
        $VALUES = eArray;
    }

    public int i() {
        return this.waveNumber;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public static Stream<e> g() {
        return Stream.of(e.values());
    }
}

