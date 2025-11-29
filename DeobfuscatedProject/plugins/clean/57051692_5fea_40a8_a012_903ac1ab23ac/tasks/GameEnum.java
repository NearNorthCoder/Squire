/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i KALPHITE_5;
    public static final  /* enum */ i SNAIL_2;
    public static final  /* enum */ i LEECH_6;
    public static final  /* enum */ i TORTOISE_6;
    public static final  /* enum */ i DRAGON_3;
    public static final  /* enum */ i PENGUIN_2;
    public static final  /* enum */ i WYVERN_4;
    public static final  /* enum */ i MOLE_4;
    public static final  /* enum */ i MOLE_2;
    public static final  /* enum */ i LEECH_3;
    public static final  /* enum */ i WYVERN_5;
    public static final  /* enum */ i TERRORBIRD_4;
    private static final  i[] $VALUES;
    public static final  /* enum */ i TORTOISE_3;
    public static final  /* enum */ i SLUG_5;
    public static final  /* enum */ i TERRORBIRD_6;
    public static final  /* enum */ i CAMEL_2;
    public static final  /* enum */ i PENGUIN_3;
    public static final  /* enum */ i CAMEL_6;
    public static final  /* enum */ i PENGUIN_5;
    public static final  /* enum */ i CAMEL_4;
    public static final  /* enum */ i TORTOISE_5;
    public static final  /* enum */ i SLUG_3;
    public static final  /* enum */ i SNAIL_4;
    public static final  /* enum */ i SLUG_1;
    public static final  /* enum */ i SNAKE_4;
    public static final  /* enum */ i SLUG_4;
    public static final  /* enum */ i LIZARD_3;
    public static final  /* enum */ i KALPHITE_6;
    public static final  /* enum */ i MONKEY_1;
    private final  String question;
    public static final  /* enum */ i LIZARD_2;
    public static final  /* enum */ i DRAGON_2;
    public static final  /* enum */ i MONKEY_2;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ i WYVERN_6;
    public static final  /* enum */ i MONKEY_6;
    public static final  /* enum */ i DRAGON_1;
    
    public static final  /* enum */ i PENGUIN_6;
    public static final  /* enum */ i SLUG_6;
    public static final  /* enum */ i WYVERN_3;
    public static final  /* enum */ i SNAIL_1;
    public static final  /* enum */ i MOLE_5;
    public static final  /* enum */ i SLUG_2;
    public static final  /* enum */ i SNAIL_5;
    public static final  /* enum */ i PENGUIN_1;
    public static final  /* enum */ i WYVERN_2;
    public static final  /* enum */ i MONKEY_4;
    public static final  /* enum */ i LEECH_2;
    public static final  /* enum */ i TERRORBIRD_3;
    public static final  /* enum */ i MOLE_1;
    public static final  /* enum */ i MOLE_3;
    public static final  /* enum */ i LIZARD_6;
    public static final  /* enum */ i SNAKE_6;
    public static final  /* enum */ i TORTOISE_2;
    public static final  /* enum */ i SNAKE_3;
    public static final  /* enum */ i TERRORBIRD_5;
    public static final  /* enum */ i LEECH_1;
    public static final  /* enum */ i KALPHITE_4;
    public static final  /* enum */ i LIZARD_1;
    public static final  /* enum */ i CAMEL_3;
    public static final  /* enum */ i KALPHITE_3;
    public static final  /* enum */ i TORTOISE_1;
    public static final  /* enum */ i LEECH_4;
    public static final  /* enum */ i KALPHITE_2;
    public static final  /* enum */ i SNAKE_5;
    public static final  /* enum */ i DRAGON_4;
    public static final  /* enum */ i LIZARD_5;
    public static final  /* enum */ i TERRORBIRD_2;
    public static final  /* enum */ i CAMEL_1;
    public static final  /* enum */ i WYVERN_1;
    public static final  /* enum */ i SNAKE_1;
    public static final  /* enum */ i CAMEL_5;
    
    public static final  /* enum */ i DRAGON_5;
    public static final  /* enum */ i MONKEY_3;
    public static final  /* enum */ i TORTOISE_4;
    public static final  /* enum */ i LEECH_5;
    public static final  /* enum */ i SNAKE_2;
    public static final  /* enum */ i LIZARD_4;
    public static final  /* enum */ i PENGUIN_4;
    public static final  /* enum */ i SNAIL_6;
    public static final  /* enum */ i KALPHITE_1;
    private final  String answer;
    public static final  /* enum */ i MOLE_6;
    public static final  /* enum */ i TERRORBIRD_1;
    public static final  /* enum */ i SNAIL_3;
    public static final  /* enum */ i MONKEY_5;
    public static final  /* enum */ i DRAGON_6;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void var2;
            i.lIIIlIIIIlIII();
            i.lIIIlIIIIIlII();
            LIZARD_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[1]], lIlIIIIIII[lIlIIIIIll[2]]);
            LIZARD_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[4]], lIlIIIIIII[lIlIIIIIll[5]]);
            LIZARD_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[7]], lIlIIIIIII[lIlIIIIIll[8]]);
            LIZARD_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[10]], lIlIIIIIII[lIlIIIIIll[11]]);
            LIZARD_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[13]], lIlIIIIIII[lIlIIIIIll[14]]);
            LIZARD_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[16]], lIlIIIIIII[lIlIIIIIll[17]]);
            TORTOISE_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[19]], lIlIIIIIII[lIlIIIIIll[20]]);
            TORTOISE_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[22]], lIlIIIIIII[lIlIIIIIll[23]]);
            TORTOISE_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[25]], lIlIIIIIII[lIlIIIIIll[26]]);
            TORTOISE_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[28]], lIlIIIIIII[lIlIIIIIll[29]]);
            TORTOISE_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[31]], lIlIIIIIII[lIlIIIIIll[32]]);
            TORTOISE_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[34]], lIlIIIIIII[lIlIIIIIll[35]]);
            DRAGON_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[37]], lIlIIIIIII[lIlIIIIIll[38]]);
            DRAGON_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[40]], lIlIIIIIII[lIlIIIIIll[41]]);
            DRAGON_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[43]], lIlIIIIIII[lIlIIIIIll[44]]);
            DRAGON_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[46]], lIlIIIIIII[lIlIIIIIll[47]]);
            DRAGON_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[49]], lIlIIIIIII[lIlIIIIIll[50]]);
            DRAGON_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[52]], lIlIIIIIII[lIlIIIIIll[53]]);
            WYVERN_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[55]], lIlIIIIIII[lIlIIIIIll[56]]);
            WYVERN_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[58]], lIlIIIIIII[lIlIIIIIll[59]]);
            WYVERN_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[61]], lIlIIIIIII[lIlIIIIIll[62]]);
            WYVERN_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[64]], lIlIIIIIII[lIlIIIIIll[65]]);
            WYVERN_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[67]], lIlIIIIIII[lIlIIIIIll[68]]);
            WYVERN_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[70]], lIlIIIIIII[lIlIIIIIll[71]]);
            SNAIL_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[73]], lIlIIIIIII[lIlIIIIIll[74]]);
            SNAIL_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[76]], lIlIIIIIII[lIlIIIIIll[77]]);
            SNAIL_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[79]], lIlIIIIIII[lIlIIIIIll[80]]);
            SNAIL_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[82]], lIlIIIIIII[lIlIIIIIll[83]]);
            SNAIL_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[85]], lIlIIIIIII[lIlIIIIIll[86]]);
            SNAIL_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[88]], lIlIIIIIII[lIlIIIIIll[89]]);
            SNAKE_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[91]], lIlIIIIIII[lIlIIIIIll[92]]);
            SNAKE_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[94]], lIlIIIIIII[lIlIIIIIll[95]]);
            SNAKE_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[97]], lIlIIIIIII[lIlIIIIIll[98]]);
            SNAKE_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[100]], lIlIIIIIII[lIlIIIIIll[101]]);
            SNAKE_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[103]], lIlIIIIIII[lIlIIIIIll[104]]);
            SNAKE_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[106]], lIlIIIIIII[lIlIIIIIll[107]]);
            SLUG_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[109]], lIlIIIIIII[lIlIIIIIll[110]]);
            SLUG_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[112]], lIlIIIIIII[lIlIIIIIll[113]]);
            SLUG_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[115]], lIlIIIIIII[lIlIIIIIll[116]]);
            SLUG_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[118]], lIlIIIIIII[lIlIIIIIll[119]]);
            SLUG_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[121]], lIlIIIIIII[lIlIIIIIll[122]]);
            SLUG_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[124]], lIlIIIIIII[lIlIIIIIll[125]]);
            MONKEY_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[127]], lIlIIIIIII[lIlIIIIIll[128]]);
            MONKEY_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[130]], lIlIIIIIII[lIlIIIIIll[131]]);
            MONKEY_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[133]], lIlIIIIIII[lIlIIIIIll[134]]);
            MONKEY_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[136]], lIlIIIIIII[lIlIIIIIll[137]]);
            MONKEY_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[139]], lIlIIIIIII[lIlIIIIIll[140]]);
            MONKEY_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[142]], lIlIIIIIII[lIlIIIIIll[143]]);
            KALPHITE_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[145]], lIlIIIIIII[lIlIIIIIll[146]]);
            KALPHITE_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[148]], lIlIIIIIII[lIlIIIIIll[149]]);
            KALPHITE_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[151]], lIlIIIIIII[lIlIIIIIll[152]]);
            KALPHITE_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[154]], lIlIIIIIII[lIlIIIIIll[155]]);
            KALPHITE_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[157]], lIlIIIIIII[lIlIIIIIll[158]]);
            KALPHITE_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[160]], lIlIIIIIII[lIlIIIIIll[161]]);
            TERRORBIRD_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[163]], lIlIIIIIII[lIlIIIIIll[164]]);
            TERRORBIRD_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[166]], lIlIIIIIII[lIlIIIIIll[167]]);
            TERRORBIRD_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[169]], lIlIIIIIII[lIlIIIIIll[170]]);
            TERRORBIRD_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[172]], lIlIIIIIII[lIlIIIIIll[173]]);
            TERRORBIRD_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[175]], lIlIIIIIII[lIlIIIIIll[176]]);
            TERRORBIRD_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[178]], lIlIIIIIII[lIlIIIIIll[179]]);
            PENGUIN_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[181]], lIlIIIIIII[lIlIIIIIll[182]]);
            PENGUIN_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[184]], lIlIIIIIII[lIlIIIIIll[185]]);
            PENGUIN_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[187]], lIlIIIIIII[lIlIIIIIll[188]]);
            PENGUIN_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[190]], lIlIIIIIII[lIlIIIIIll[191]]);
            PENGUIN_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[193]], lIlIIIIIII[lIlIIIIIll[194]]);
            PENGUIN_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[196]], lIlIIIIIII[lIlIIIIIll[197]]);
            MOLE_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[199]], lIlIIIIIII[lIlIIIIIll[200]]);
            MOLE_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[202]], lIlIIIIIII[lIlIIIIIll[203]]);
            MOLE_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[205]], lIlIIIIIII[lIlIIIIIll[206]]);
            MOLE_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[208]], lIlIIIIIII[lIlIIIIIll[209]]);
            MOLE_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[211]], lIlIIIIIII[lIlIIIIIll[212]]);
            MOLE_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[214]], lIlIIIIIII[lIlIIIIIll[215]]);
            CAMEL_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[217]], lIlIIIIIII[lIlIIIIIll[218]]);
            CAMEL_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[220]], lIlIIIIIII[lIlIIIIIll[221]]);
            CAMEL_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[223]], lIlIIIIIII[lIlIIIIIll[224]]);
            CAMEL_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[226]], lIlIIIIIII[lIlIIIIIll[227]]);
            CAMEL_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[229]], lIlIIIIIII[lIlIIIIIll[230]]);
            CAMEL_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[232]], lIlIIIIIII[lIlIIIIIll[233]]);
            LEECH_1 = new GameEnum(lIlIIIIIII[lIlIIIIIll[235]], lIlIIIIIII[lIlIIIIIll[236]]);
            LEECH_2 = new GameEnum(lIlIIIIIII[lIlIIIIIll[238]], lIlIIIIIII[lIlIIIIIll[239]]);
            LEECH_3 = new GameEnum(lIlIIIIIII[lIlIIIIIll[241]], lIlIIIIIII[lIlIIIIIll[242]]);
            LEECH_4 = new GameEnum(lIlIIIIIII[lIlIIIIIll[244]], lIlIIIIIII[lIlIIIIIll[245]]);
            LEECH_5 = new GameEnum(lIlIIIIIII[lIlIIIIIll[247]], lIlIIIIIII[lIlIIIIIll[248]]);
            LEECH_6 = new GameEnum(lIlIIIIIII[lIlIIIIIll[250]], lIlIIIIIII[lIlIIIIIll[251]]);
            i[] iArray = new i[lIlIIIIIll[84]];
            iArray[i.lIlIIIIIll[0]] = LIZARD_1;
            iArray[i.lIlIIIIIll[1]] = LIZARD_2;
            iArray[i.lIlIIIIIll[2]] = LIZARD_3;
            iArray[i.lIlIIIIIll[3]] = LIZARD_4;
            iArray[i.lIlIIIIIll[4]] = LIZARD_5;
            iArray[i.lIlIIIIIll[5]] = LIZARD_6;
            iArray[i.lIlIIIIIll[6]] = TORTOISE_1;
            iArray[i.lIlIIIIIll[7]] = TORTOISE_2;
            iArray[i.lIlIIIIIll[8]] = TORTOISE_3;
            iArray[i.lIlIIIIIll[9]] = TORTOISE_4;
            iArray[i.lIlIIIIIll[10]] = TORTOISE_5;
            iArray[i.lIlIIIIIll[11]] = TORTOISE_6;
            iArray[i.lIlIIIIIll[12]] = DRAGON_1;
            iArray[i.lIlIIIIIll[13]] = DRAGON_2;
            iArray[i.lIlIIIIIll[14]] = DRAGON_3;
            iArray[i.lIlIIIIIll[15]] = DRAGON_4;
            iArray[i.lIlIIIIIll[16]] = DRAGON_5;
            iArray[i.lIlIIIIIll[17]] = DRAGON_6;
            iArray[i.lIlIIIIIll[18]] = WYVERN_1;
            iArray[i.lIlIIIIIll[19]] = WYVERN_2;
            iArray[i.lIlIIIIIll[20]] = WYVERN_3;
            iArray[i.lIlIIIIIll[21]] = WYVERN_4;
            iArray[i.lIlIIIIIll[22]] = WYVERN_5;
            iArray[i.lIlIIIIIll[23]] = WYVERN_6;
            iArray[i.lIlIIIIIll[24]] = SNAIL_1;
            iArray[i.lIlIIIIIll[25]] = SNAIL_2;
            iArray[i.lIlIIIIIll[26]] = SNAIL_3;
            iArray[i.lIlIIIIIll[27]] = SNAIL_4;
            iArray[i.lIlIIIIIll[28]] = SNAIL_5;
            iArray[i.lIlIIIIIll[29]] = SNAIL_6;
            iArray[i.lIlIIIIIll[30]] = SNAKE_1;
            iArray[i.lIlIIIIIll[31]] = SNAKE_2;
            iArray[i.lIlIIIIIll[32]] = SNAKE_3;
            iArray[i.lIlIIIIIll[33]] = SNAKE_4;
            iArray[i.lIlIIIIIll[34]] = SNAKE_5;
            iArray[i.lIlIIIIIll[35]] = SNAKE_6;
            iArray[i.lIlIIIIIll[36]] = SLUG_1;
            iArray[i.lIlIIIIIll[37]] = SLUG_2;
            iArray[i.lIlIIIIIll[38]] = SLUG_3;
            iArray[i.lIlIIIIIll[39]] = SLUG_4;
            iArray[i.lIlIIIIIll[40]] = SLUG_5;
            iArray[i.lIlIIIIIll[41]] = SLUG_6;
            iArray[i.lIlIIIIIll[42]] = MONKEY_1;
            iArray[i.lIlIIIIIll[43]] = MONKEY_2;
            iArray[i.lIlIIIIIll[44]] = MONKEY_3;
            iArray[i.lIlIIIIIll[45]] = MONKEY_4;
            iArray[i.lIlIIIIIll[46]] = MONKEY_5;
            iArray[i.lIlIIIIIll[47]] = MONKEY_6;
            iArray[i.lIlIIIIIll[48]] = KALPHITE_1;
            iArray[i.lIlIIIIIll[49]] = KALPHITE_2;
            iArray[i.lIlIIIIIll[50]] = KALPHITE_3;
            iArray[i.lIlIIIIIll[51]] = KALPHITE_4;
            iArray[i.lIlIIIIIll[52]] = KALPHITE_5;
            iArray[i.lIlIIIIIll[53]] = KALPHITE_6;
            iArray[i.lIlIIIIIll[54]] = TERRORBIRD_1;
            iArray[i.lIlIIIIIll[55]] = TERRORBIRD_2;
            iArray[i.lIlIIIIIll[56]] = TERRORBIRD_3;
            iArray[i.lIlIIIIIll[57]] = TERRORBIRD_4;
            iArray[i.lIlIIIIIll[58]] = TERRORBIRD_5;
            iArray[i.lIlIIIIIll[59]] = TERRORBIRD_6;
            iArray[i.lIlIIIIIll[60]] = PENGUIN_1;
            iArray[i.lIlIIIIIll[61]] = PENGUIN_2;
            iArray[i.lIlIIIIIll[62]] = PENGUIN_3;
            iArray[i.lIlIIIIIll[63]] = PENGUIN_4;
            iArray[i.lIlIIIIIll[64]] = PENGUIN_5;
            iArray[i.lIlIIIIIll[65]] = PENGUIN_6;
            iArray[i.lIlIIIIIll[66]] = MOLE_1;
            iArray[i.lIlIIIIIll[67]] = MOLE_2;
            iArray[i.lIlIIIIIll[68]] = MOLE_3;
            iArray[i.lIlIIIIIll[69]] = MOLE_4;
            iArray[i.lIlIIIIIll[70]] = MOLE_5;
            iArray[i.lIlIIIIIll[71]] = MOLE_6;
            iArray[i.lIlIIIIIll[72]] = CAMEL_1;
            iArray[i.lIlIIIIIll[73]] = CAMEL_2;
            iArray[i.lIlIIIIIll[74]] = CAMEL_3;
            iArray[i.lIlIIIIIll[75]] = CAMEL_4;
            iArray[i.lIlIIIIIll[76]] = CAMEL_5;
            iArray[i.lIlIIIIIll[77]] = CAMEL_6;
            iArray[i.lIlIIIIIll[78]] = LEECH_1;
            iArray[i.lIlIIIIIll[79]] = LEECH_2;
            iArray[i.lIlIIIIIll[80]] = LEECH_3;
            iArray[i.lIlIIIIIll[81]] = LEECH_4;
            iArray[i.lIlIIIIIll[82]] = LEECH_5;
            iArray[i.lIlIIIIIll[83]] = LEECH_6;
            $VALUES = iArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            i[] iArray2 = i.values();
            int n2 = iArray2.length;
            int var3 = lIlIIIIIll[0];
            while (i.lIIIlIIIIlIIl(var3, (int)var2)) {
                void var4;
                void var5;
                void var6 = var5[var3];
                var4.put((Object)var6.question, (Object)var6.answer);

                ++var3;

                if (2 != 0) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

    private static boolean lIIIlIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public String Y() {
        return this.question;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean lIIIlIIIIlIlI(Object object) {
        return object != null;
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    private static boolean lIIIlIIIIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIIIlIIIIIlII() {
        lIlIIIIIII = new String[lIlIIIIIll[252]];
        i.lIlIIIIIII[i.lIlIIIIIll[0]] = "LIZARD_1";
        i.lIlIIIIIII[i.lIlIIIIIll[1]] = "How does a lizard regulate body heat?";
        i.lIlIIIIIII[i.lIlIIIIIll[2]] = "Sunlight.";
        i.lIlIIIIIII[i.lIlIIIIIll[3]] = "LIZARD_2";
        i.lIlIIIIIII[i.lIlIIIIIll[4]] = "Who discovered how to kill lizards?";
        i.lIlIIIIIII[i.lIlIIIIIll[5]] = "The Slayer Masters.";
        i.lIlIIIIIII[i.lIlIIIIIll[6]] = "LIZARD_3";
        i.lIlIIIIIII[i.lIlIIIIIll[7]] = "How many eyes does a lizard have?";
        i.lIlIIIIIII[i.lIlIIIIIll[8]] = "Three.";
        i.lIlIIIIIII[i.lIlIIIIIll[9]] = "LIZARD_4";
        i.lIlIIIIIII[i.lIlIIIIIll[10]] = "What order do lizards belong to?";
        i.lIlIIIIIII[i.lIlIIIIIll[11]] = "Squamata.";
        i.lIlIIIIIII[i.lIlIIIIIll[12]] = "LIZARD_5";
        i.lIlIIIIIII[i.lIlIIIIIll[13]] = "What happens when a lizard becomes cold?";
        i.lIlIIIIIII[i.lIlIIIIIll[14]] = "It becomes sleepy.";
        i.lIlIIIIIII[i.lIlIIIIIll[15]] = "LIZARD_6";
        i.lIlIIIIIII[i.lIlIIIIIll[16]] = "Lizard skin is made of the same substance as?";
        i.lIlIIIIIII[i.lIlIIIIIll[17]] = "Hair.";
        i.lIlIIIIIII[i.lIlIIIIIll[18]] = "TORTOISE_1";
        i.lIlIIIIIII[i.lIlIIIIIll[19]] = "What is the name of the oldest tortoise ever recorded?";
        i.lIlIIIIIII[i.lIlIIIIIll[20]] = "Mibbiwocket.";
        i.lIlIIIIIII[i.lIlIIIIIll[21]] = "TORTOISE_2";
        i.lIlIIIIIII[i.lIlIIIIIll[22]] = "What is a tortoise's favourite food?";
        i.lIlIIIIIII[i.lIlIIIIIll[23]] = "Vegetables.";
        i.lIlIIIIIII[i.lIlIIIIIll[24]] = "TORTOISE_3";
        i.lIlIIIIIII[i.lIlIIIIIll[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        i.lIlIIIIIII[i.lIlIIIIIll[26]] = "Admiral Bake.";
        i.lIlIIIIIII[i.lIlIIIIIll[27]] = "TORTOISE_4";
        i.lIlIIIIIII[i.lIlIIIIIll[28]] = "How does the tortoise protect itself?";
        i.lIlIIIIIII[i.lIlIIIIIll[29]] = "Hard shell.";
        i.lIlIIIIIII[i.lIlIIIIIll[30]] = "TORTOISE_5";
        i.lIlIIIIIII[i.lIlIIIIIll[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        i.lIlIIIIIII[i.lIlIIIIIll[32]] = "Twenty years.";
        i.lIlIIIIIII[i.lIlIIIIIll[33]] = "TORTOISE_6";
        i.lIlIIIIIII[i.lIlIIIIIll[34]] = "Which race breeds tortoises for battle?";
        i.lIlIIIIIII[i.lIlIIIIIll[35]] = "Gnomes.";
        i.lIlIIIIIII[i.lIlIIIIIll[36]] = "DRAGON_1";
        i.lIlIIIIIII[i.lIlIIIIIll[37]] = "What is considered a delicacy by dragons?";
        i.lIlIIIIIII[i.lIlIIIIIll[38]] = "Runite.";
        i.lIlIIIIIII[i.lIlIIIIIll[39]] = "DRAGON_2";
        i.lIlIIIIIII[i.lIlIIIIIll[40]] = "What is the best defence against a dragon's attack?";
        i.lIlIIIIIII[i.lIlIIIIIll[41]] = "Anti dragon-breath shield.";
        i.lIlIIIIIII[i.lIlIIIIIll[42]] = "DRAGON_3";
        i.lIlIIIIIII[i.lIlIIIIIll[43]] = "How long do dragons live?";
        i.lIlIIIIIII[i.lIlIIIIIll[44]] = "Unknown.";
        i.lIlIIIIIII[i.lIlIIIIIll[45]] = "DRAGON_4";
        i.lIlIIIIIII[i.lIlIIIIIll[46]] = "Which of these is not a type of dragon?";
        i.lIlIIIIIII[i.lIlIIIIIll[47]] = "Elemental.";
        i.lIlIIIIIII[i.lIlIIIIIll[48]] = "DRAGON_5";
        i.lIlIIIIIII[i.lIlIIIIIll[49]] = "What is the favoured territory of a dragon?";
        i.lIlIIIIIII[i.lIlIIIIIll[50]] = "Old battle sites.";
        i.lIlIIIIIII[i.lIlIIIIIll[51]] = "DRAGON_6";
        i.lIlIIIIIII[i.lIlIIIIIll[52]] = "Approximately how many feet tall do dragons stand?";
        i.lIlIIIIIII[i.lIlIIIIIll[53]] = "Twelve.";
        i.lIlIIIIIII[i.lIlIIIIIll[54]] = "WYVERN_1";
        i.lIlIIIIIII[i.lIlIIIIIll[55]] = "How did the wyverns die out?";
        i.lIlIIIIIII[i.lIlIIIIIll[56]] = "Climate change.";
        i.lIlIIIIIII[i.lIlIIIIIll[57]] = "WYVERN_2";
        i.lIlIIIIIII[i.lIlIIIIIll[58]] = "How many legs does a wyvern have?";
        i.lIlIIIIIII[i.lIlIIIIIll[59]] = "Two.";
        i.lIlIIIIIII[i.lIlIIIIIll[60]] = "WYVERN_3";
        i.lIlIIIIIII[i.lIlIIIIIll[61]] = "Where have wyvern bones been found?";
        i.lIlIIIIIII[i.lIlIIIIIll[62]] = "Asgarnia.";
        i.lIlIIIIIII[i.lIlIIIIIll[63]] = "WYVERN_4";
        i.lIlIIIIIII[i.lIlIIIIIll[64]] = "Which genus does the wyvern theoretically belong to?";
        i.lIlIIIIIII[i.lIlIIIIIll[65]] = "Reptiles.";
        i.lIlIIIIIII[i.lIlIIIIIll[66]] = "WYVERN_5";
        i.lIlIIIIIII[i.lIlIIIIIll[67]] = "What are the wyverns' closest relations?";
        i.lIlIIIIIII[i.lIlIIIIIll[68]] = "Dragons.";
        i.lIlIIIIIII[i.lIlIIIIIll[69]] = "WYVERN_6";
        i.lIlIIIIIII[i.lIlIIIIIll[70]] = "What is the ambient temperature of wyvern bones?";
        i.lIlIIIIIII[i.lIlIIIIIll[71]] = "Below room temperature.";
        i.lIlIIIIIII[i.lIlIIIIIll[72]] = "SNAIL_1";
        i.lIlIIIIIII[i.lIlIIIIIll[73]] = "What is special about the shell of the giant Morytanian snail?";
        i.lIlIIIIIII[i.lIlIIIIIll[74]] = "It is resistant to acid.";
        i.lIlIIIIIII[i.lIlIIIIIll[75]] = "SNAIL_2";
        i.lIlIIIIIII[i.lIlIIIIIll[76]] = "How do Morytanian snails capture their prey?";
        i.lIlIIIIIII[i.lIlIIIIIll[77]] = "Spitting acid.";
        i.lIlIIIIIII[i.lIlIIIIIll[78]] = "SNAIL_3";
        i.lIlIIIIIII[i.lIlIIIIIll[79]] = "Which of these is a snail byproduct?";
        i.lIlIIIIIII[i.lIlIIIIIll[80]] = "Fireproof oil.";
        i.lIlIIIIIII[i.lIlIIIIIll[81]] = "SNAIL_4";
        i.lIlIIIIIII[i.lIlIIIIIll[82]] = "What does 'Achatina Acidia' mean?";
        i.lIlIIIIIII[i.lIlIIIIIll[83]] = "Acid-spitting snail.";
        i.lIlIIIIIII[i.lIlIIIIIll[84]] = "SNAIL_5";
        i.lIlIIIIIII[i.lIlIIIIIll[85]] = "How do snails move?";
        i.lIlIIIIIII[i.lIlIIIIIll[86]] = "Contracting and stretching.";
        i.lIlIIIIIII[i.lIlIIIIIll[87]] = "SNAIL_6";
        i.lIlIIIIIII[i.lIlIIIIIll[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        i.lIlIIIIIII[i.lIlIIIIIll[89]] = "An operculum.";
        i.lIlIIIIIII[i.lIlIIIIIll[90]] = "SNAKE_1";
        i.lIlIIIIIII[i.lIlIIIIIll[91]] = "What is snake venom adapted from?";
        i.lIlIIIIIII[i.lIlIIIIIll[92]] = "Stomach acid.";
        i.lIlIIIIIII[i.lIlIIIIIll[93]] = "SNAKE_2";
        i.lIlIIIIIII[i.lIlIIIIIll[94]] = "Aside from their noses, what do snakes use to smell?";
        i.lIlIIIIIII[i.lIlIIIIIll[95]] = "Tongue.";
        i.lIlIIIIIII[i.lIlIIIIIll[96]] = "SNAKE_3";
        i.lIlIIIIIII[i.lIlIIIIIll[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        i.lIlIIIIIII[i.lIlIIIIIll[98]] = "Seeing how you smell.";
        i.lIlIIIIIII[i.lIlIIIIIll[99]] = "SNAKE_4";
        i.lIlIIIIIII[i.lIlIIIIIll[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        i.lIlIIIIIII[i.lIlIIIIIll[101]] = "Constriction.";
        i.lIlIIIIIII[i.lIlIIIIIll[102]] = "SNAKE_5";
        i.lIlIIIIIII[i.lIlIIIIIll[103]] = "Lizards and snakes belong to the same order - what is it?";
        i.lIlIIIIIII[i.lIlIIIIIll[104]] = "Squamata.";
        i.lIlIIIIIII[i.lIlIIIIIll[105]] = "SNAKE_6";
        i.lIlIIIIIII[i.lIlIIIIIll[106]] = "Which habitat do snakes prefer?";
        i.lIlIIIIIII[i.lIlIIIIIll[107]] = "Anywhere.";
        i.lIlIIIIIII[i.lIlIIIIIll[108]] = "SLUG_1";
        i.lIlIIIIIII[i.lIlIIIIIll[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        i.lIlIIIIIII[i.lIlIIIIIll[110]] = "Nematocysts.";
        i.lIlIIIIIII[i.lIlIIIIIll[111]] = "SLUG_2";
        i.lIlIIIIIII[i.lIlIIIIIll[112]] = "Why has the museum never examined a live sea slug?";
        i.lIlIIIIIII[i.lIlIIIIIll[113]] = "The researchers keep vanishing.";
        i.lIlIIIIIII[i.lIlIIIIIll[114]] = "SLUG_3";
        i.lIlIIIIIII[i.lIlIIIIIll[115]] = "What do we think the sea slug feeds upon?";
        i.lIlIIIIIII[i.lIlIIIIIll[116]] = "Seaweed.";
        i.lIlIIIIIII[i.lIlIIIIIll[117]] = "SLUG_4";
        i.lIlIIIIIII[i.lIlIIIIIll[118]] = "What are the two fangs presumed to be used for?";
        i.lIlIIIIIII[i.lIlIIIIIll[119]] = "Defense or display.";
        i.lIlIIIIIII[i.lIlIIIIIll[120]] = "SLUG_5";
        i.lIlIIIIIII[i.lIlIIIIIll[121]] = "Off of which coastline would you find sea slugs?";
        i.lIlIIIIIII[i.lIlIIIIIll[122]] = "Ardougne.";
        i.lIlIIIIIII[i.lIlIIIIIll[123]] = "SLUG_6";
        i.lIlIIIIIII[i.lIlIIIIIll[124]] = "In what way are sea slugs similar to snails?";
        i.lIlIIIIIII[i.lIlIIIIIll[125]] = "They have a hard shell.";
        i.lIlIIIIIII[i.lIlIIIIIll[126]] = "MONKEY_1";
        i.lIlIIIIIII[i.lIlIIIIIll[127]] = "Which type of primates do monkeys belong to?";
        i.lIlIIIIIII[i.lIlIIIIIll[128]] = "Simian.";
        i.lIlIIIIIII[i.lIlIIIIIll[129]] = "MONKEY_2";
        i.lIlIIIIIII[i.lIlIIIIIll[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        i.lIlIIIIIII[i.lIlIIIIIll[131]] = "Harmless.";
        i.lIlIIIIIII[i.lIlIIIIIll[132]] = "MONKEY_3";
        i.lIlIIIIIII[i.lIlIIIIIll[133]] = "Monkeys love bananas. What else do they like to eat?";
        i.lIlIIIIIII[i.lIlIIIIIll[134]] = "Bitternuts.";
        i.lIlIIIIIII[i.lIlIIIIIll[135]] = "MONKEY_4";
        i.lIlIIIIIII[i.lIlIIIIIll[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        i.lIlIIIIIII[i.lIlIIIIIll[137]] = "Harmless.";
        i.lIlIIIIIII[i.lIlIIIIIll[138]] = "MONKEY_5";
        i.lIlIIIIIII[i.lIlIIIIIll[139]] = "What colour mohawk do Karamjan monkeys have?";
        i.lIlIIIIIII[i.lIlIIIIIll[140]] = "Red.";
        i.lIlIIIIIII[i.lIlIIIIIll[141]] = "MONKEY_6";
        i.lIlIIIIIII[i.lIlIIIIIll[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        i.lIlIIIIIII[i.lIlIIIIIll[143]] = "Seaweed.";
        i.lIlIIIIIII[i.lIlIIIIIll[144]] = "KALPHITE_1";
        i.lIlIIIIIII[i.lIlIIIIIll[145]] = "Kalphites are ruled by a...?";
        i.lIlIIIIIII[i.lIlIIIIIll[146]] = "Pasha.";
        i.lIlIIIIIII[i.lIlIIIIIll[147]] = "KALPHITE_2";
        i.lIlIIIIIII[i.lIlIIIIIll[148]] = "What is the lowest caste in kalphite society?";
        i.lIlIIIIIII[i.lIlIIIIIll[149]] = "Worker.";
        i.lIlIIIIIII[i.lIlIIIIIll[150]] = "KALPHITE_3";
        i.lIlIIIIIII[i.lIlIIIIIll[151]] = "What are the armoured plates on a kalphite called?";
        i.lIlIIIIIII[i.lIlIIIIIll[152]] = "Lamellae.";
        i.lIlIIIIIII[i.lIlIIIIIll[153]] = "KALPHITE_4";
        i.lIlIIIIIII[i.lIlIIIIIll[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        i.lIlIIIIIII[i.lIlIIIIIll[155]] = "Carnivores.";
        i.lIlIIIIIII[i.lIlIIIIIll[156]] = "KALPHITE_5";
        i.lIlIIIIIII[i.lIlIIIIIll[157]] = "What are kalphites assumed to have evolved from?";
        i.lIlIIIIIII[i.lIlIIIIIll[158]] = "Scarab beetles.";
        i.lIlIIIIIII[i.lIlIIIIIll[159]] = "KALPHITE_6";
        i.lIlIIIIIII[i.lIlIIIIIll[160]] = "Name the prominent figure in kalphite mythology?";
        i.lIlIIIIIII[i.lIlIIIIIll[161]] = "Scabaras.";
        i.lIlIIIIIII[i.lIlIIIIIll[162]] = "TERRORBIRD_1";
        i.lIlIIIIIII[i.lIlIIIIIll[163]] = "What is a terrorbird's preferred food?";
        i.lIlIIIIIII[i.lIlIIIIIll[164]] = "Anything.";
        i.lIlIIIIIII[i.lIlIIIIIll[165]] = "TERRORBIRD_2";
        i.lIlIIIIIII[i.lIlIIIIIll[166]] = "Who use terrorbirds as mounts?";
        i.lIlIIIIIII[i.lIlIIIIIll[167]] = "Gnomes.";
        i.lIlIIIIIII[i.lIlIIIIIll[168]] = "TERRORBIRD_3";
        i.lIlIIIIIII[i.lIlIIIIIll[169]] = "Where do terrorbirds get most of their water?";
        i.lIlIIIIIII[i.lIlIIIIIll[170]] = "Eating plants.";
        i.lIlIIIIIII[i.lIlIIIIIll[171]] = "TERRORBIRD_4";
        i.lIlIIIIIII[i.lIlIIIIIll[172]] = "How many claws do terrorbirds have?";
        i.lIlIIIIIII[i.lIlIIIIIll[173]] = "Four.";
        i.lIlIIIIIII[i.lIlIIIIIll[174]] = "TERRORBIRD_5";
        i.lIlIIIIIII[i.lIlIIIIIll[175]] = "What do terrorbirds eat to aid digestion?";
        i.lIlIIIIIII[i.lIlIIIIIll[176]] = "Stones.";
        i.lIlIIIIIII[i.lIlIIIIIll[177]] = "TERRORBIRD_6";
        i.lIlIIIIIII[i.lIlIIIIIll[178]] = "How many teeth do terrorbirds have?";
        i.lIlIIIIIII[i.lIlIIIIIll[179]] = "0.";
        i.lIlIIIIIII[i.lIlIIIIIll[180]] = "PENGUIN_1";
        i.lIlIIIIIII[i.lIlIIIIIll[181]] = "Which sense do penguins rely on when hunting?";
        i.lIlIIIIIII[i.lIlIIIIIll[182]] = "Sight.";
        i.lIlIIIIIII[i.lIlIIIIIll[183]] = "PENGUIN_2";
        i.lIlIIIIIII[i.lIlIIIIIll[184]] = "Which skill seems unusual for the penguins to possess?";
        i.lIlIIIIIII[i.lIlIIIIIll[185]] = "Planning.";
        i.lIlIIIIIII[i.lIlIIIIIll[186]] = "PENGUIN_3";
        i.lIlIIIIIII[i.lIlIIIIIll[187]] = "How do penguins keep warm?";
        i.lIlIIIIIII[i.lIlIIIIIll[188]] = "A layer of fat.";
        i.lIlIIIIIII[i.lIlIIIIIll[189]] = "PENGUIN_4";
        i.lIlIIIIIII[i.lIlIIIIIll[190]] = "What is the preferred climate for penguins?";
        i.lIlIIIIIII[i.lIlIIIIIll[191]] = "Cold.";
        i.lIlIIIIIII[i.lIlIIIIIll[192]] = "PENGUIN_5";
        i.lIlIIIIIII[i.lIlIIIIIll[193]] = "Describe the behaviour of penguins?";
        i.lIlIIIIIII[i.lIlIIIIIll[194]] = "Social.";
        i.lIlIIIIIII[i.lIlIIIIIll[195]] = "PENGUIN_6";
        i.lIlIIIIIII[i.lIlIIIIIll[196]] = "When do penguins fast?";
        i.lIlIIIIIII[i.lIlIIIIIll[197]] = "During breeding.";
        i.lIlIIIIIII[i.lIlIIIIIll[198]] = "MOLE_1";
        i.lIlIIIIIII[i.lIlIIIIIll[199]] = "What habitat do moles prefer?";
        i.lIlIIIIIII[i.lIlIIIIIll[200]] = "Subterranean.";
        i.lIlIIIIIII[i.lIlIIIIIll[201]] = "MOLE_2";
        i.lIlIIIIIII[i.lIlIIIIIll[202]] = "Why are moles considered to be an agricultural pest?";
        i.lIlIIIIIII[i.lIlIIIIIll[203]] = "They dig holes.";
        i.lIlIIIIIII[i.lIlIIIIIll[204]] = "MOLE_3";
        i.lIlIIIIIII[i.lIlIIIIIll[205]] = "Who discovered giant moles?";
        i.lIlIIIIIII[i.lIlIIIIIll[206]] = "Wyson the Gardener.";
        i.lIlIIIIIII[i.lIlIIIIIll[207]] = "MOLE_4";
        i.lIlIIIIIII[i.lIlIIIIIll[208]] = "What would you call a group of young moles?";
        i.lIlIIIIIII[i.lIlIIIIIll[209]] = "A labour.";
        i.lIlIIIIIII[i.lIlIIIIIll[210]] = "MOLE_5";
        i.lIlIIIIIII[i.lIlIIIIIll[211]] = "What is a mole's favourite food?";
        i.lIlIIIIIII[i.lIlIIIIIll[212]] = "Insects and other invertebrates.";
        i.lIlIIIIIII[i.lIlIIIIIll[213]] = "MOLE_6";
        i.lIlIIIIIII[i.lIlIIIIIll[214]] = "Which family do moles belong to?";
        i.lIlIIIIIII[i.lIlIIIIIll[215]] = "The Talpidae family.";
        i.lIlIIIIIII[i.lIlIIIIIll[216]] = "CAMEL_1";
        i.lIlIIIIIII[i.lIlIIIIIll[217]] = "What is produced by feeding chilli to a camel?";
        i.lIlIIIIIII[i.lIlIIIIIll[218]] = "Toxic dung.";
        i.lIlIIIIIII[i.lIlIIIIIll[219]] = "CAMEL_2";
        i.lIlIIIIIII[i.lIlIIIIIll[220]] = "If an ugthanki has one, how many does a bactrian have?";
        i.lIlIIIIIII[i.lIlIIIIIll[221]] = "Two.";
        i.lIlIIIIIII[i.lIlIIIIIll[222]] = "CAMEL_3";
        i.lIlIIIIIII[i.lIlIIIIIll[223]] = "Camels: herbivore, carnivore or omnivore?";
        i.lIlIIIIIII[i.lIlIIIIIll[224]] = "Omnivore.";
        i.lIlIIIIIII[i.lIlIIIIIll[225]] = "CAMEL_4";
        i.lIlIIIIIII[i.lIlIIIIIll[226]] = "What is the usual mood for a camel?";
        i.lIlIIIIIII[i.lIlIIIIIll[227]] = "Annoyed.";
        i.lIlIIIIIII[i.lIlIIIIIll[228]] = "CAMEL_5";
        i.lIlIIIIIII[i.lIlIIIIIll[229]] = "Where would you find an ugthanki?";
        i.lIlIIIIIII[i.lIlIIIIIll[230]] = "Al Kharid.";
        i.lIlIIIIIII[i.lIlIIIIIll[231]] = "CAMEL_6";
        i.lIlIIIIIII[i.lIlIIIIIll[232]] = "Which camel byproduct is known to be very nutritious?";
        i.lIlIIIIIII[i.lIlIIIIIll[233]] = "Milk.";
        i.lIlIIIIIII[i.lIlIIIIIll[234]] = "LEECH_1";
        i.lIlIIIIIII[i.lIlIIIIIll[235]] = "What is the favoured habitat of leeches?";
        i.lIlIIIIIII[i.lIlIIIIIll[236]] = "Water.";
        i.lIlIIIIIII[i.lIlIIIIIll[237]] = "LEECH_2";
        i.lIlIIIIIII[i.lIlIIIIIll[238]] = "What shape is the inside of a leech's mouth?";
        i.lIlIIIIIII[i.lIlIIIIIll[239]] = "'Y'-shaped.";
        i.lIlIIIIIII[i.lIlIIIIIll[240]] = "LEECH_3";
        i.lIlIIIIIII[i.lIlIIIIIll[241]] = "Which of these is not eaten by leeches?";
        i.lIlIIIIIII[i.lIlIIIIIll[242]] = "Apples.";
        i.lIlIIIIIII[i.lIlIIIIIll[243]] = "LEECH_4";
        i.lIlIIIIIII[i.lIlIIIIIll[244]] = "What contributed to the giant growth of Morytanian leeches?";
        i.lIlIIIIIII[i.lIlIIIIIll[245]] = "Environment.";
        i.lIlIIIIIII[i.lIlIIIIIll[246]] = "LEECH_5";
        i.lIlIIIIIII[i.lIlIIIIIll[247]] = "What is special about Morytanian leeches?";
        i.lIlIIIIIII[i.lIlIIIIIll[248]] = "They attack by jumping.";
        i.lIlIIIIIII[i.lIlIIIIIll[249]] = "LEECH_6";
        i.lIlIIIIIII[i.lIlIIIIIll[250]] = "How does a leech change when it feeds?";
        i.lIlIIIIIII[i.lIlIIIIIll[251]] = "It doubles in size.";
    }

    public String Z() {
        return this.answer;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var7;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var8 = lIlIIIIIll[0];
        while (i.lIIIlIIIIlIIl(var8, (int)var7)) {
            void var9;
            void var10;
            void var11 = var10[var8];
            Widget var12 = Widgets.get((WidgetInfo)var11);
            if (i.lIIIlIIIIlIlI(var12) && i.lIIIlIIIIlIll(var12.getText().equals(var9) ? 1 : 0)) {
                return var12;
            }
            ++var8;

            return null;
        }
        return null;
    }
}

