/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

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
extends Enum<h> {
    public static final  /* enum */ h SNAIL_3;
    public static final  /* enum */ h CAMEL_6;
    public static final  /* enum */ h TORTOISE_3;
    public static final  /* enum */ h PENGUIN_3;
    public static final  /* enum */ h TORTOISE_4;
    public static final  /* enum */ h MONKEY_4;
    public static final  /* enum */ h DRAGON_1;
    public static final  /* enum */ h TERRORBIRD_1;
    public static final  /* enum */ h CAMEL_2;
    public static final  /* enum */ h DRAGON_6;
    public static final  /* enum */ h TERRORBIRD_4;
    public static final  /* enum */ h SNAKE_4;
    private final  String question;
    
    public static final  /* enum */ h MONKEY_3;
    public static final  /* enum */ h TORTOISE_2;
    public static final  /* enum */ h WYVERN_6;
    public static final  /* enum */ h KALPHITE_3;
    public static final  /* enum */ h DRAGON_2;
    public static final  /* enum */ h LEECH_2;
    public static final  /* enum */ h CAMEL_1;
    public static final  /* enum */ h PENGUIN_4;
    public static final  /* enum */ h SNAKE_1;
    public static final  /* enum */ h WYVERN_3;
    public static final  /* enum */ h PENGUIN_5;
    public static final  /* enum */ h SNAKE_2;
    public static final  /* enum */ h SNAKE_5;
    public static final  /* enum */ h SLUG_1;
    public static final  /* enum */ h WYVERN_4;
    public static final  /* enum */ h LEECH_4;
    public static final  /* enum */ h LIZARD_1;
    public static final  /* enum */ h WYVERN_5;
    public static final  /* enum */ h SNAKE_3;
    public static final  /* enum */ h TERRORBIRD_2;
    public static final  /* enum */ h KALPHITE_4;
    public static final  /* enum */ h MOLE_5;
    public static final  /* enum */ h LIZARD_3;
    public static final  /* enum */ h SNAIL_5;
    public static final  /* enum */ h WYVERN_2;
    public static final  /* enum */ h MONKEY_2;
    public static final  /* enum */ h CAMEL_3;
    public static final  /* enum */ h SLUG_2;
    public static final  /* enum */ h LIZARD_6;
    public static final  /* enum */ h MOLE_2;
    public static final  /* enum */ h SNAIL_1;
    public static final  /* enum */ h CAMEL_5;
    public static final  /* enum */ h DRAGON_5;
    public static final  /* enum */ h SLUG_5;
    public static final  /* enum */ h MONKEY_1;
    public static final  /* enum */ h PENGUIN_6;
    public static final  /* enum */ h LEECH_6;
    public static final  /* enum */ h SNAIL_6;
    public static final  /* enum */ h PENGUIN_2;
    public static final  /* enum */ h MOLE_6;
    public static final  /* enum */ h SNAIL_4;
    public static final  /* enum */ h KALPHITE_5;
    public static final  /* enum */ h TORTOISE_5;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ h MONKEY_5;
    private static final  h[] $VALUES;
    public static final  /* enum */ h TORTOISE_1;
    private final  String answer;
    public static final  /* enum */ h LIZARD_4;
    public static final  /* enum */ h DRAGON_3;
    public static final  /* enum */ h LEECH_3;
    public static final  /* enum */ h SLUG_6;
    
    public static final  /* enum */ h TERRORBIRD_5;
    public static final  /* enum */ h MONKEY_6;
    public static final  /* enum */ h TORTOISE_6;
    public static final  /* enum */ h MOLE_4;
    public static final  /* enum */ h SNAIL_2;
    public static final  /* enum */ h SLUG_3;
    public static final  /* enum */ h LIZARD_2;
    public static final  /* enum */ h SLUG_4;
    public static final  /* enum */ h WYVERN_1;
    public static final  /* enum */ h DRAGON_4;
    public static final  /* enum */ h KALPHITE_1;
    public static final  /* enum */ h TERRORBIRD_6;
    public static final  /* enum */ h CAMEL_4;
    public static final  /* enum */ h PENGUIN_1;
    public static final  /* enum */ h TERRORBIRD_3;
    public static final  /* enum */ h LEECH_5;
    public static final  /* enum */ h MOLE_1;
    public static final  /* enum */ h KALPHITE_2;
    public static final  /* enum */ h MOLE_3;
    public static final  /* enum */ h LIZARD_5;
    public static final  /* enum */ h KALPHITE_6;
    public static final  /* enum */ h LEECH_1;
    public static final  /* enum */ h SNAKE_6;

    private static boolean lllIlllIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void lIIIIIIIIIlI;
            h.lllIlllIIlll();
            h.lllIlllIIllI();
            LIZARD_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[1]], lIIIlIllll[lIIIllIIlI[2]]);
            LIZARD_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[4]], lIIIlIllll[lIIIllIIlI[5]]);
            LIZARD_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[7]], lIIIlIllll[lIIIllIIlI[8]]);
            LIZARD_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[10]], lIIIlIllll[lIIIllIIlI[11]]);
            LIZARD_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[13]], lIIIlIllll[lIIIllIIlI[14]]);
            LIZARD_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[16]], lIIIlIllll[lIIIllIIlI[17]]);
            TORTOISE_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[19]], lIIIlIllll[lIIIllIIlI[20]]);
            TORTOISE_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[22]], lIIIlIllll[lIIIllIIlI[23]]);
            TORTOISE_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[25]], lIIIlIllll[lIIIllIIlI[26]]);
            TORTOISE_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[28]], lIIIlIllll[lIIIllIIlI[29]]);
            TORTOISE_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[31]], lIIIlIllll[lIIIllIIlI[32]]);
            TORTOISE_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[34]], lIIIlIllll[lIIIllIIlI[35]]);
            DRAGON_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[37]], lIIIlIllll[lIIIllIIlI[38]]);
            DRAGON_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[40]], lIIIlIllll[lIIIllIIlI[41]]);
            DRAGON_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[43]], lIIIlIllll[lIIIllIIlI[44]]);
            DRAGON_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[46]], lIIIlIllll[lIIIllIIlI[47]]);
            DRAGON_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[49]], lIIIlIllll[lIIIllIIlI[50]]);
            DRAGON_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[52]], lIIIlIllll[lIIIllIIlI[53]]);
            WYVERN_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[55]], lIIIlIllll[lIIIllIIlI[56]]);
            WYVERN_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[58]], lIIIlIllll[lIIIllIIlI[59]]);
            WYVERN_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[61]], lIIIlIllll[lIIIllIIlI[62]]);
            WYVERN_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[64]], lIIIlIllll[lIIIllIIlI[65]]);
            WYVERN_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[67]], lIIIlIllll[lIIIllIIlI[68]]);
            WYVERN_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[70]], lIIIlIllll[lIIIllIIlI[71]]);
            SNAIL_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[73]], lIIIlIllll[lIIIllIIlI[74]]);
            SNAIL_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[76]], lIIIlIllll[lIIIllIIlI[77]]);
            SNAIL_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[79]], lIIIlIllll[lIIIllIIlI[80]]);
            SNAIL_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[82]], lIIIlIllll[lIIIllIIlI[83]]);
            SNAIL_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[85]], lIIIlIllll[lIIIllIIlI[86]]);
            SNAIL_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[88]], lIIIlIllll[lIIIllIIlI[89]]);
            SNAKE_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[91]], lIIIlIllll[lIIIllIIlI[92]]);
            SNAKE_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[94]], lIIIlIllll[lIIIllIIlI[95]]);
            SNAKE_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[97]], lIIIlIllll[lIIIllIIlI[98]]);
            SNAKE_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[100]], lIIIlIllll[lIIIllIIlI[101]]);
            SNAKE_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[103]], lIIIlIllll[lIIIllIIlI[104]]);
            SNAKE_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[106]], lIIIlIllll[lIIIllIIlI[107]]);
            SLUG_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[109]], lIIIlIllll[lIIIllIIlI[110]]);
            SLUG_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[112]], lIIIlIllll[lIIIllIIlI[113]]);
            SLUG_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[115]], lIIIlIllll[lIIIllIIlI[116]]);
            SLUG_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[118]], lIIIlIllll[lIIIllIIlI[119]]);
            SLUG_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[121]], lIIIlIllll[lIIIllIIlI[122]]);
            SLUG_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[124]], lIIIlIllll[lIIIllIIlI[125]]);
            MONKEY_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[127]], lIIIlIllll[lIIIllIIlI[128]]);
            MONKEY_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[130]], lIIIlIllll[lIIIllIIlI[131]]);
            MONKEY_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[133]], lIIIlIllll[lIIIllIIlI[134]]);
            MONKEY_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[136]], lIIIlIllll[lIIIllIIlI[137]]);
            MONKEY_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[139]], lIIIlIllll[lIIIllIIlI[140]]);
            MONKEY_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[142]], lIIIlIllll[lIIIllIIlI[143]]);
            KALPHITE_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[145]], lIIIlIllll[lIIIllIIlI[146]]);
            KALPHITE_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[148]], lIIIlIllll[lIIIllIIlI[149]]);
            KALPHITE_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[151]], lIIIlIllll[lIIIllIIlI[152]]);
            KALPHITE_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[154]], lIIIlIllll[lIIIllIIlI[155]]);
            KALPHITE_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[157]], lIIIlIllll[lIIIllIIlI[158]]);
            KALPHITE_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[160]], lIIIlIllll[lIIIllIIlI[161]]);
            TERRORBIRD_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[163]], lIIIlIllll[lIIIllIIlI[164]]);
            TERRORBIRD_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[166]], lIIIlIllll[lIIIllIIlI[167]]);
            TERRORBIRD_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[169]], lIIIlIllll[lIIIllIIlI[170]]);
            TERRORBIRD_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[172]], lIIIlIllll[lIIIllIIlI[173]]);
            TERRORBIRD_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[175]], lIIIlIllll[lIIIllIIlI[176]]);
            TERRORBIRD_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[178]], lIIIlIllll[lIIIllIIlI[179]]);
            PENGUIN_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[181]], lIIIlIllll[lIIIllIIlI[182]]);
            PENGUIN_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[184]], lIIIlIllll[lIIIllIIlI[185]]);
            PENGUIN_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[187]], lIIIlIllll[lIIIllIIlI[188]]);
            PENGUIN_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[190]], lIIIlIllll[lIIIllIIlI[191]]);
            PENGUIN_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[193]], lIIIlIllll[lIIIllIIlI[194]]);
            PENGUIN_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[196]], lIIIlIllll[lIIIllIIlI[197]]);
            MOLE_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[199]], lIIIlIllll[lIIIllIIlI[200]]);
            MOLE_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[202]], lIIIlIllll[lIIIllIIlI[203]]);
            MOLE_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[205]], lIIIlIllll[lIIIllIIlI[206]]);
            MOLE_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[208]], lIIIlIllll[lIIIllIIlI[209]]);
            MOLE_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[211]], lIIIlIllll[lIIIllIIlI[212]]);
            MOLE_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[214]], lIIIlIllll[lIIIllIIlI[215]]);
            CAMEL_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[217]], lIIIlIllll[lIIIllIIlI[218]]);
            CAMEL_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[220]], lIIIlIllll[lIIIllIIlI[221]]);
            CAMEL_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[223]], lIIIlIllll[lIIIllIIlI[224]]);
            CAMEL_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[226]], lIIIlIllll[lIIIllIIlI[227]]);
            CAMEL_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[229]], lIIIlIllll[lIIIllIIlI[230]]);
            CAMEL_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[232]], lIIIlIllll[lIIIllIIlI[233]]);
            LEECH_1 = new GameEnum(lIIIlIllll[lIIIllIIlI[235]], lIIIlIllll[lIIIllIIlI[236]]);
            LEECH_2 = new GameEnum(lIIIlIllll[lIIIllIIlI[238]], lIIIlIllll[lIIIllIIlI[239]]);
            LEECH_3 = new GameEnum(lIIIlIllll[lIIIllIIlI[241]], lIIIlIllll[lIIIllIIlI[242]]);
            LEECH_4 = new GameEnum(lIIIlIllll[lIIIllIIlI[244]], lIIIlIllll[lIIIllIIlI[245]]);
            LEECH_5 = new GameEnum(lIIIlIllll[lIIIllIIlI[247]], lIIIlIllll[lIIIllIIlI[248]]);
            LEECH_6 = new GameEnum(lIIIlIllll[lIIIllIIlI[250]], lIIIlIllll[lIIIllIIlI[251]]);
            h[] hArray = new h[lIIIllIIlI[84]];
            hArray[h.lIIIllIIlI[0]] = LIZARD_1;
            hArray[h.lIIIllIIlI[1]] = LIZARD_2;
            hArray[h.lIIIllIIlI[2]] = LIZARD_3;
            hArray[h.lIIIllIIlI[3]] = LIZARD_4;
            hArray[h.lIIIllIIlI[4]] = LIZARD_5;
            hArray[h.lIIIllIIlI[5]] = LIZARD_6;
            hArray[h.lIIIllIIlI[6]] = TORTOISE_1;
            hArray[h.lIIIllIIlI[7]] = TORTOISE_2;
            hArray[h.lIIIllIIlI[8]] = TORTOISE_3;
            hArray[h.lIIIllIIlI[9]] = TORTOISE_4;
            hArray[h.lIIIllIIlI[10]] = TORTOISE_5;
            hArray[h.lIIIllIIlI[11]] = TORTOISE_6;
            hArray[h.lIIIllIIlI[12]] = DRAGON_1;
            hArray[h.lIIIllIIlI[13]] = DRAGON_2;
            hArray[h.lIIIllIIlI[14]] = DRAGON_3;
            hArray[h.lIIIllIIlI[15]] = DRAGON_4;
            hArray[h.lIIIllIIlI[16]] = DRAGON_5;
            hArray[h.lIIIllIIlI[17]] = DRAGON_6;
            hArray[h.lIIIllIIlI[18]] = WYVERN_1;
            hArray[h.lIIIllIIlI[19]] = WYVERN_2;
            hArray[h.lIIIllIIlI[20]] = WYVERN_3;
            hArray[h.lIIIllIIlI[21]] = WYVERN_4;
            hArray[h.lIIIllIIlI[22]] = WYVERN_5;
            hArray[h.lIIIllIIlI[23]] = WYVERN_6;
            hArray[h.lIIIllIIlI[24]] = SNAIL_1;
            hArray[h.lIIIllIIlI[25]] = SNAIL_2;
            hArray[h.lIIIllIIlI[26]] = SNAIL_3;
            hArray[h.lIIIllIIlI[27]] = SNAIL_4;
            hArray[h.lIIIllIIlI[28]] = SNAIL_5;
            hArray[h.lIIIllIIlI[29]] = SNAIL_6;
            hArray[h.lIIIllIIlI[30]] = SNAKE_1;
            hArray[h.lIIIllIIlI[31]] = SNAKE_2;
            hArray[h.lIIIllIIlI[32]] = SNAKE_3;
            hArray[h.lIIIllIIlI[33]] = SNAKE_4;
            hArray[h.lIIIllIIlI[34]] = SNAKE_5;
            hArray[h.lIIIllIIlI[35]] = SNAKE_6;
            hArray[h.lIIIllIIlI[36]] = SLUG_1;
            hArray[h.lIIIllIIlI[37]] = SLUG_2;
            hArray[h.lIIIllIIlI[38]] = SLUG_3;
            hArray[h.lIIIllIIlI[39]] = SLUG_4;
            hArray[h.lIIIllIIlI[40]] = SLUG_5;
            hArray[h.lIIIllIIlI[41]] = SLUG_6;
            hArray[h.lIIIllIIlI[42]] = MONKEY_1;
            hArray[h.lIIIllIIlI[43]] = MONKEY_2;
            hArray[h.lIIIllIIlI[44]] = MONKEY_3;
            hArray[h.lIIIllIIlI[45]] = MONKEY_4;
            hArray[h.lIIIllIIlI[46]] = MONKEY_5;
            hArray[h.lIIIllIIlI[47]] = MONKEY_6;
            hArray[h.lIIIllIIlI[48]] = KALPHITE_1;
            hArray[h.lIIIllIIlI[49]] = KALPHITE_2;
            hArray[h.lIIIllIIlI[50]] = KALPHITE_3;
            hArray[h.lIIIllIIlI[51]] = KALPHITE_4;
            hArray[h.lIIIllIIlI[52]] = KALPHITE_5;
            hArray[h.lIIIllIIlI[53]] = KALPHITE_6;
            hArray[h.lIIIllIIlI[54]] = TERRORBIRD_1;
            hArray[h.lIIIllIIlI[55]] = TERRORBIRD_2;
            hArray[h.lIIIllIIlI[56]] = TERRORBIRD_3;
            hArray[h.lIIIllIIlI[57]] = TERRORBIRD_4;
            hArray[h.lIIIllIIlI[58]] = TERRORBIRD_5;
            hArray[h.lIIIllIIlI[59]] = TERRORBIRD_6;
            hArray[h.lIIIllIIlI[60]] = PENGUIN_1;
            hArray[h.lIIIllIIlI[61]] = PENGUIN_2;
            hArray[h.lIIIllIIlI[62]] = PENGUIN_3;
            hArray[h.lIIIllIIlI[63]] = PENGUIN_4;
            hArray[h.lIIIllIIlI[64]] = PENGUIN_5;
            hArray[h.lIIIllIIlI[65]] = PENGUIN_6;
            hArray[h.lIIIllIIlI[66]] = MOLE_1;
            hArray[h.lIIIllIIlI[67]] = MOLE_2;
            hArray[h.lIIIllIIlI[68]] = MOLE_3;
            hArray[h.lIIIllIIlI[69]] = MOLE_4;
            hArray[h.lIIIllIIlI[70]] = MOLE_5;
            hArray[h.lIIIllIIlI[71]] = MOLE_6;
            hArray[h.lIIIllIIlI[72]] = CAMEL_1;
            hArray[h.lIIIllIIlI[73]] = CAMEL_2;
            hArray[h.lIIIllIIlI[74]] = CAMEL_3;
            hArray[h.lIIIllIIlI[75]] = CAMEL_4;
            hArray[h.lIIIllIIlI[76]] = CAMEL_5;
            hArray[h.lIIIllIIlI[77]] = CAMEL_6;
            hArray[h.lIIIllIIlI[78]] = LEECH_1;
            hArray[h.lIIIllIIlI[79]] = LEECH_2;
            hArray[h.lIIIllIIlI[80]] = LEECH_3;
            hArray[h.lIIIllIIlI[81]] = LEECH_4;
            hArray[h.lIIIllIIlI[82]] = LEECH_5;
            hArray[h.lIIIllIIlI[83]] = LEECH_6;
            $VALUES = hArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            h[] hArray2 = h.values();
            int n2 = hArray2.length;
            int lIIIIIIIIIIl = lIIIllIIlI[0];
            while (h.lllIlllIlIII(lIIIIIIIIIIl, (int)lIIIIIIIIIlI)) {
                void lIIIIIIIIlII;
                void lIIIIIIIIIll;
                void lIIIIIIIIIII = lIIIIIIIIIll[lIIIIIIIIIIl];
                lIIIIIIIIlII.put((Object)lIIIIIIIIIII.question, (Object)lIIIIIIIIIII.answer);

                ++lIIIIIIIIIIl;

                break block1;
            }
            MATCHES = builder.build();
        }
    }

    private static boolean lllIlllIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void lIIIIIIIllIl;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int lIIIIIIIllII = lIIIllIIlI[0];
        while (h.lllIlllIlIII(lIIIIIIIllII, (int)lIIIIIIIllIl)) {
            void lIIIIIIIllll;
            void lIIIIIIIlllI;
            void lIIIIIIIlIll = lIIIIIIIlllI[lIIIIIIIllII];
            Widget lIIIIIIIlIlI = Widgets.get((WidgetInfo)lIIIIIIIlIll);
            if (h.lllIlllIlIIl(lIIIIIIIlIlI) && h.lllIlllIlIlI(lIIIIIIIlIlI.getText().equals(lIIIIIIIllll) ? 1 : 0)) {
                return lIIIIIIIlIlI;
            }
            ++lIIIIIIIllII;

            if ((87 + 14 - -30 + 29 ^ 134 + 87 - 108 + 51) >= (0xF3 ^ 0xB3 ^ (0x19 ^ 0x5D))) continue;
            return null;
        }
        return null;
    }

        return String.valueOf(lllllIllIIl);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public String O() {
        return this.question;
    }

    private static boolean lllIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public String P() {
        return this.answer;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lllIlllIIllI() {
        lIIIlIllll = new String[lIIIllIIlI[252]];
        h.lIIIlIllll[h.lIIIllIIlI[0]] = "LIZARD_1";
        h.lIIIlIllll[h.lIIIllIIlI[1]] = "How does a lizard regulate body heat?";
        h.lIIIlIllll[h.lIIIllIIlI[2]] = "Sunlight.";
        h.lIIIlIllll[h.lIIIllIIlI[3]] = "LIZARD_2";
        h.lIIIlIllll[h.lIIIllIIlI[4]] = "Who discovered how to kill lizards?";
        h.lIIIlIllll[h.lIIIllIIlI[5]] = "The Slayer Masters.";
        h.lIIIlIllll[h.lIIIllIIlI[6]] = "LIZARD_3";
        h.lIIIlIllll[h.lIIIllIIlI[7]] = "How many eyes does a lizard have?";
        h.lIIIlIllll[h.lIIIllIIlI[8]] = "Three.";
        h.lIIIlIllll[h.lIIIllIIlI[9]] = "LIZARD_4";
        h.lIIIlIllll[h.lIIIllIIlI[10]] = "What order do lizards belong to?";
        h.lIIIlIllll[h.lIIIllIIlI[11]] = "Squamata.";
        h.lIIIlIllll[h.lIIIllIIlI[12]] = "LIZARD_5";
        h.lIIIlIllll[h.lIIIllIIlI[13]] = "What happens when a lizard becomes cold?";
        h.lIIIlIllll[h.lIIIllIIlI[14]] = "It becomes sleepy.";
        h.lIIIlIllll[h.lIIIllIIlI[15]] = "LIZARD_6";
        h.lIIIlIllll[h.lIIIllIIlI[16]] = "Lizard skin is made of the same substance as?";
        h.lIIIlIllll[h.lIIIllIIlI[17]] = "Hair.";
        h.lIIIlIllll[h.lIIIllIIlI[18]] = "TORTOISE_1";
        h.lIIIlIllll[h.lIIIllIIlI[19]] = "What is the name of the oldest tortoise ever recorded?";
        h.lIIIlIllll[h.lIIIllIIlI[20]] = "Mibbiwocket.";
        h.lIIIlIllll[h.lIIIllIIlI[21]] = "TORTOISE_2";
        h.lIIIlIllll[h.lIIIllIIlI[22]] = "What is a tortoise's favourite food?";
        h.lIIIlIllll[h.lIIIllIIlI[23]] = "Vegetables.";
        h.lIIIlIllll[h.lIIIllIIlI[24]] = "TORTOISE_3";
        h.lIIIlIllll[h.lIIIllIIlI[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        h.lIIIlIllll[h.lIIIllIIlI[26]] = "Admiral Bake.";
        h.lIIIlIllll[h.lIIIllIIlI[27]] = "TORTOISE_4";
        h.lIIIlIllll[h.lIIIllIIlI[28]] = "How does the tortoise protect itself?";
        h.lIIIlIllll[h.lIIIllIIlI[29]] = "Hard shell.";
        h.lIIIlIllll[h.lIIIllIIlI[30]] = "TORTOISE_5";
        h.lIIIlIllll[h.lIIIllIIlI[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        h.lIIIlIllll[h.lIIIllIIlI[32]] = "Twenty years.";
        h.lIIIlIllll[h.lIIIllIIlI[33]] = "TORTOISE_6";
        h.lIIIlIllll[h.lIIIllIIlI[34]] = "Which race breeds tortoises for battle?";
        h.lIIIlIllll[h.lIIIllIIlI[35]] = "Gnomes.";
        h.lIIIlIllll[h.lIIIllIIlI[36]] = "DRAGON_1";
        h.lIIIlIllll[h.lIIIllIIlI[37]] = "What is considered a delicacy by dragons?";
        h.lIIIlIllll[h.lIIIllIIlI[38]] = "Runite.";
        h.lIIIlIllll[h.lIIIllIIlI[39]] = "DRAGON_2";
        h.lIIIlIllll[h.lIIIllIIlI[40]] = "What is the best defence against a dragon's attack?";
        h.lIIIlIllll[h.lIIIllIIlI[41]] = "Anti dragon-breath shield.";
        h.lIIIlIllll[h.lIIIllIIlI[42]] = "DRAGON_3";
        h.lIIIlIllll[h.lIIIllIIlI[43]] = "How long do dragons live?";
        h.lIIIlIllll[h.lIIIllIIlI[44]] = "Unknown.";
        h.lIIIlIllll[h.lIIIllIIlI[45]] = "DRAGON_4";
        h.lIIIlIllll[h.lIIIllIIlI[46]] = "Which of these is not a type of dragon?";
        h.lIIIlIllll[h.lIIIllIIlI[47]] = "Elemental.";
        h.lIIIlIllll[h.lIIIllIIlI[48]] = "DRAGON_5";
        h.lIIIlIllll[h.lIIIllIIlI[49]] = "What is the favoured territory of a dragon?";
        h.lIIIlIllll[h.lIIIllIIlI[50]] = "Old battle sites.";
        h.lIIIlIllll[h.lIIIllIIlI[51]] = "DRAGON_6";
        h.lIIIlIllll[h.lIIIllIIlI[52]] = "Approximately how many feet tall do dragons stand?";
        h.lIIIlIllll[h.lIIIllIIlI[53]] = "Twelve.";
        h.lIIIlIllll[h.lIIIllIIlI[54]] = "WYVERN_1";
        h.lIIIlIllll[h.lIIIllIIlI[55]] = "How did the wyverns die out?";
        h.lIIIlIllll[h.lIIIllIIlI[56]] = "Climate change.";
        h.lIIIlIllll[h.lIIIllIIlI[57]] = "WYVERN_2";
        h.lIIIlIllll[h.lIIIllIIlI[58]] = "How many legs does a wyvern have?";
        h.lIIIlIllll[h.lIIIllIIlI[59]] = "Two.";
        h.lIIIlIllll[h.lIIIllIIlI[60]] = "WYVERN_3";
        h.lIIIlIllll[h.lIIIllIIlI[61]] = "Where have wyvern bones been found?";
        h.lIIIlIllll[h.lIIIllIIlI[62]] = "Asgarnia.";
        h.lIIIlIllll[h.lIIIllIIlI[63]] = "WYVERN_4";
        h.lIIIlIllll[h.lIIIllIIlI[64]] = "Which genus does the wyvern theoretically belong to?";
        h.lIIIlIllll[h.lIIIllIIlI[65]] = "Reptiles.";
        h.lIIIlIllll[h.lIIIllIIlI[66]] = "WYVERN_5";
        h.lIIIlIllll[h.lIIIllIIlI[67]] = "What are the wyverns' closest relations?";
        h.lIIIlIllll[h.lIIIllIIlI[68]] = "Dragons.";
        h.lIIIlIllll[h.lIIIllIIlI[69]] = "WYVERN_6";
        h.lIIIlIllll[h.lIIIllIIlI[70]] = "What is the ambient temperature of wyvern bones?";
        h.lIIIlIllll[h.lIIIllIIlI[71]] = "Below room temperature.";
        h.lIIIlIllll[h.lIIIllIIlI[72]] = "SNAIL_1";
        h.lIIIlIllll[h.lIIIllIIlI[73]] = "What is special about the shell of the giant Morytanian snail?";
        h.lIIIlIllll[h.lIIIllIIlI[74]] = "It is resistant to acid.";
        h.lIIIlIllll[h.lIIIllIIlI[75]] = "SNAIL_2";
        h.lIIIlIllll[h.lIIIllIIlI[76]] = "How do Morytanian snails capture their prey?";
        h.lIIIlIllll[h.lIIIllIIlI[77]] = "Spitting acid.";
        h.lIIIlIllll[h.lIIIllIIlI[78]] = "SNAIL_3";
        h.lIIIlIllll[h.lIIIllIIlI[79]] = "Which of these is a snail byproduct?";
        h.lIIIlIllll[h.lIIIllIIlI[80]] = "Fireproof oil.";
        h.lIIIlIllll[h.lIIIllIIlI[81]] = "SNAIL_4";
        h.lIIIlIllll[h.lIIIllIIlI[82]] = "What does 'Achatina Acidia' mean?";
        h.lIIIlIllll[h.lIIIllIIlI[83]] = "Acid-spitting snail.";
        h.lIIIlIllll[h.lIIIllIIlI[84]] = "SNAIL_5";
        h.lIIIlIllll[h.lIIIllIIlI[85]] = "How do snails move?";
        h.lIIIlIllll[h.lIIIllIIlI[86]] = "Contracting and stretching.";
        h.lIIIlIllll[h.lIIIllIIlI[87]] = "SNAIL_6";
        h.lIIIlIllll[h.lIIIllIIlI[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        h.lIIIlIllll[h.lIIIllIIlI[89]] = "An operculum.";
        h.lIIIlIllll[h.lIIIllIIlI[90]] = "SNAKE_1";
        h.lIIIlIllll[h.lIIIllIIlI[91]] = "What is snake venom adapted from?";
        h.lIIIlIllll[h.lIIIllIIlI[92]] = "Stomach acid.";
        h.lIIIlIllll[h.lIIIllIIlI[93]] = "SNAKE_2";
        h.lIIIlIllll[h.lIIIllIIlI[94]] = "Aside from their noses, what do snakes use to smell?";
        h.lIIIlIllll[h.lIIIllIIlI[95]] = "Tongue.";
        h.lIIIlIllll[h.lIIIllIIlI[96]] = "SNAKE_3";
        h.lIIIlIllll[h.lIIIllIIlI[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        h.lIIIlIllll[h.lIIIllIIlI[98]] = "Seeing how you smell.";
        h.lIIIlIllll[h.lIIIllIIlI[99]] = "SNAKE_4";
        h.lIIIlIllll[h.lIIIllIIlI[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        h.lIIIlIllll[h.lIIIllIIlI[101]] = "Constriction.";
        h.lIIIlIllll[h.lIIIllIIlI[102]] = "SNAKE_5";
        h.lIIIlIllll[h.lIIIllIIlI[103]] = "Lizards and snakes belong to the same order - what is it?";
        h.lIIIlIllll[h.lIIIllIIlI[104]] = "Squamata.";
        h.lIIIlIllll[h.lIIIllIIlI[105]] = "SNAKE_6";
        h.lIIIlIllll[h.lIIIllIIlI[106]] = "Which habitat do snakes prefer?";
        h.lIIIlIllll[h.lIIIllIIlI[107]] = "Anywhere.";
        h.lIIIlIllll[h.lIIIllIIlI[108]] = "SLUG_1";
        h.lIIIlIllll[h.lIIIllIIlI[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        h.lIIIlIllll[h.lIIIllIIlI[110]] = "Nematocysts.";
        h.lIIIlIllll[h.lIIIllIIlI[111]] = "SLUG_2";
        h.lIIIlIllll[h.lIIIllIIlI[112]] = "Why has the museum never examined a live sea slug?";
        h.lIIIlIllll[h.lIIIllIIlI[113]] = "The researchers keep vanishing.";
        h.lIIIlIllll[h.lIIIllIIlI[114]] = "SLUG_3";
        h.lIIIlIllll[h.lIIIllIIlI[115]] = "What do we think the sea slug feeds upon?";
        h.lIIIlIllll[h.lIIIllIIlI[116]] = "Seaweed.";
        h.lIIIlIllll[h.lIIIllIIlI[117]] = "SLUG_4";
        h.lIIIlIllll[h.lIIIllIIlI[118]] = "What are the two fangs presumed to be used for?";
        h.lIIIlIllll[h.lIIIllIIlI[119]] = "Defense or display.";
        h.lIIIlIllll[h.lIIIllIIlI[120]] = "SLUG_5";
        h.lIIIlIllll[h.lIIIllIIlI[121]] = "Off of which coastline would you find sea slugs?";
        h.lIIIlIllll[h.lIIIllIIlI[122]] = "Ardougne.";
        h.lIIIlIllll[h.lIIIllIIlI[123]] = "SLUG_6";
        h.lIIIlIllll[h.lIIIllIIlI[124]] = "In what way are sea slugs similar to snails?";
        h.lIIIlIllll[h.lIIIllIIlI[125]] = "They have a hard shell.";
        h.lIIIlIllll[h.lIIIllIIlI[126]] = "MONKEY_1";
        h.lIIIlIllll[h.lIIIllIIlI[127]] = "Which type of primates do monkeys belong to?";
        h.lIIIlIllll[h.lIIIllIIlI[128]] = "Simian.";
        h.lIIIlIllll[h.lIIIllIIlI[129]] = "MONKEY_2";
        h.lIIIlIllll[h.lIIIllIIlI[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        h.lIIIlIllll[h.lIIIllIIlI[131]] = "Harmless.";
        h.lIIIlIllll[h.lIIIllIIlI[132]] = "MONKEY_3";
        h.lIIIlIllll[h.lIIIllIIlI[133]] = "Monkeys love bananas. What else do they like to eat?";
        h.lIIIlIllll[h.lIIIllIIlI[134]] = "Bitternuts.";
        h.lIIIlIllll[h.lIIIllIIlI[135]] = "MONKEY_4";
        h.lIIIlIllll[h.lIIIllIIlI[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        h.lIIIlIllll[h.lIIIllIIlI[137]] = "Harmless.";
        h.lIIIlIllll[h.lIIIllIIlI[138]] = "MONKEY_5";
        h.lIIIlIllll[h.lIIIllIIlI[139]] = "What colour mohawk do Karamjan monkeys have?";
        h.lIIIlIllll[h.lIIIllIIlI[140]] = "Red.";
        h.lIIIlIllll[h.lIIIllIIlI[141]] = "MONKEY_6";
        h.lIIIlIllll[h.lIIIllIIlI[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        h.lIIIlIllll[h.lIIIllIIlI[143]] = "Seaweed.";
        h.lIIIlIllll[h.lIIIllIIlI[144]] = "KALPHITE_1";
        h.lIIIlIllll[h.lIIIllIIlI[145]] = "Kalphites are ruled by a...?";
        h.lIIIlIllll[h.lIIIllIIlI[146]] = "Pasha.";
        h.lIIIlIllll[h.lIIIllIIlI[147]] = "KALPHITE_2";
        h.lIIIlIllll[h.lIIIllIIlI[148]] = "What is the lowest caste in kalphite society?";
        h.lIIIlIllll[h.lIIIllIIlI[149]] = "Worker.";
        h.lIIIlIllll[h.lIIIllIIlI[150]] = "KALPHITE_3";
        h.lIIIlIllll[h.lIIIllIIlI[151]] = "What are the armoured plates on a kalphite called?";
        h.lIIIlIllll[h.lIIIllIIlI[152]] = "Lamellae.";
        h.lIIIlIllll[h.lIIIllIIlI[153]] = "KALPHITE_4";
        h.lIIIlIllll[h.lIIIllIIlI[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        h.lIIIlIllll[h.lIIIllIIlI[155]] = "Carnivores.";
        h.lIIIlIllll[h.lIIIllIIlI[156]] = "KALPHITE_5";
        h.lIIIlIllll[h.lIIIllIIlI[157]] = "What are kalphites assumed to have evolved from?";
        h.lIIIlIllll[h.lIIIllIIlI[158]] = "Scarab beetles.";
        h.lIIIlIllll[h.lIIIllIIlI[159]] = "KALPHITE_6";
        h.lIIIlIllll[h.lIIIllIIlI[160]] = "Name the prominent figure in kalphite mythology?";
        h.lIIIlIllll[h.lIIIllIIlI[161]] = "Scabaras.";
        h.lIIIlIllll[h.lIIIllIIlI[162]] = "TERRORBIRD_1";
        h.lIIIlIllll[h.lIIIllIIlI[163]] = "What is a terrorbird's preferred food?";
        h.lIIIlIllll[h.lIIIllIIlI[164]] = "Anything.";
        h.lIIIlIllll[h.lIIIllIIlI[165]] = "TERRORBIRD_2";
        h.lIIIlIllll[h.lIIIllIIlI[166]] = "Who use terrorbirds as mounts?";
        h.lIIIlIllll[h.lIIIllIIlI[167]] = "Gnomes.";
        h.lIIIlIllll[h.lIIIllIIlI[168]] = "TERRORBIRD_3";
        h.lIIIlIllll[h.lIIIllIIlI[169]] = "Where do terrorbirds get most of their water?";
        h.lIIIlIllll[h.lIIIllIIlI[170]] = "Eating plants.";
        h.lIIIlIllll[h.lIIIllIIlI[171]] = "TERRORBIRD_4";
        h.lIIIlIllll[h.lIIIllIIlI[172]] = "How many claws do terrorbirds have?";
        h.lIIIlIllll[h.lIIIllIIlI[173]] = "Four.";
        h.lIIIlIllll[h.lIIIllIIlI[174]] = "TERRORBIRD_5";
        h.lIIIlIllll[h.lIIIllIIlI[175]] = "What do terrorbirds eat to aid digestion?";
        h.lIIIlIllll[h.lIIIllIIlI[176]] = "Stones.";
        h.lIIIlIllll[h.lIIIllIIlI[177]] = "TERRORBIRD_6";
        h.lIIIlIllll[h.lIIIllIIlI[178]] = "How many teeth do terrorbirds have?";
        h.lIIIlIllll[h.lIIIllIIlI[179]] = "0.";
        h.lIIIlIllll[h.lIIIllIIlI[180]] = "PENGUIN_1";
        h.lIIIlIllll[h.lIIIllIIlI[181]] = "Which sense do penguins rely on when hunting?";
        h.lIIIlIllll[h.lIIIllIIlI[182]] = "Sight.";
        h.lIIIlIllll[h.lIIIllIIlI[183]] = "PENGUIN_2";
        h.lIIIlIllll[h.lIIIllIIlI[184]] = "Which skill seems unusual for the penguins to possess?";
        h.lIIIlIllll[h.lIIIllIIlI[185]] = "Planning.";
        h.lIIIlIllll[h.lIIIllIIlI[186]] = "PENGUIN_3";
        h.lIIIlIllll[h.lIIIllIIlI[187]] = "How do penguins keep warm?";
        h.lIIIlIllll[h.lIIIllIIlI[188]] = "A layer of fat.";
        h.lIIIlIllll[h.lIIIllIIlI[189]] = "PENGUIN_4";
        h.lIIIlIllll[h.lIIIllIIlI[190]] = "What is the preferred climate for penguins?";
        h.lIIIlIllll[h.lIIIllIIlI[191]] = "Cold.";
        h.lIIIlIllll[h.lIIIllIIlI[192]] = "PENGUIN_5";
        h.lIIIlIllll[h.lIIIllIIlI[193]] = "Describe the behaviour of penguins?";
        h.lIIIlIllll[h.lIIIllIIlI[194]] = "Social.";
        h.lIIIlIllll[h.lIIIllIIlI[195]] = "PENGUIN_6";
        h.lIIIlIllll[h.lIIIllIIlI[196]] = "When do penguins fast?";
        h.lIIIlIllll[h.lIIIllIIlI[197]] = "During breeding.";
        h.lIIIlIllll[h.lIIIllIIlI[198]] = "MOLE_1";
        h.lIIIlIllll[h.lIIIllIIlI[199]] = "What habitat do moles prefer?";
        h.lIIIlIllll[h.lIIIllIIlI[200]] = "Subterranean.";
        h.lIIIlIllll[h.lIIIllIIlI[201]] = "MOLE_2";
        h.lIIIlIllll[h.lIIIllIIlI[202]] = "Why are moles considered to be an agricultural pest?";
        h.lIIIlIllll[h.lIIIllIIlI[203]] = "They dig holes.";
        h.lIIIlIllll[h.lIIIllIIlI[204]] = "MOLE_3";
        h.lIIIlIllll[h.lIIIllIIlI[205]] = "Who discovered giant moles?";
        h.lIIIlIllll[h.lIIIllIIlI[206]] = "Wyson the Gardener.";
        h.lIIIlIllll[h.lIIIllIIlI[207]] = "MOLE_4";
        h.lIIIlIllll[h.lIIIllIIlI[208]] = "What would you call a group of young moles?";
        h.lIIIlIllll[h.lIIIllIIlI[209]] = "A labour.";
        h.lIIIlIllll[h.lIIIllIIlI[210]] = "MOLE_5";
        h.lIIIlIllll[h.lIIIllIIlI[211]] = "What is a mole's favourite food?";
        h.lIIIlIllll[h.lIIIllIIlI[212]] = "Insects and other invertebrates.";
        h.lIIIlIllll[h.lIIIllIIlI[213]] = "MOLE_6";
        h.lIIIlIllll[h.lIIIllIIlI[214]] = "Which family do moles belong to?";
        h.lIIIlIllll[h.lIIIllIIlI[215]] = "The Talpidae family.";
        h.lIIIlIllll[h.lIIIllIIlI[216]] = "CAMEL_1";
        h.lIIIlIllll[h.lIIIllIIlI[217]] = "What is produced by feeding chilli to a camel?";
        h.lIIIlIllll[h.lIIIllIIlI[218]] = "Toxic dung.";
        h.lIIIlIllll[h.lIIIllIIlI[219]] = "CAMEL_2";
        h.lIIIlIllll[h.lIIIllIIlI[220]] = "If an ugthanki has one, how many does a bactrian have?";
        h.lIIIlIllll[h.lIIIllIIlI[221]] = "Two.";
        h.lIIIlIllll[h.lIIIllIIlI[222]] = "CAMEL_3";
        h.lIIIlIllll[h.lIIIllIIlI[223]] = "Camels: herbivore, carnivore or omnivore?";
        h.lIIIlIllll[h.lIIIllIIlI[224]] = "Omnivore.";
        h.lIIIlIllll[h.lIIIllIIlI[225]] = "CAMEL_4";
        h.lIIIlIllll[h.lIIIllIIlI[226]] = "What is the usual mood for a camel?";
        h.lIIIlIllll[h.lIIIllIIlI[227]] = "Annoyed.";
        h.lIIIlIllll[h.lIIIllIIlI[228]] = "CAMEL_5";
        h.lIIIlIllll[h.lIIIllIIlI[229]] = "Where would you find an ugthanki?";
        h.lIIIlIllll[h.lIIIllIIlI[230]] = "Al Kharid.";
        h.lIIIlIllll[h.lIIIllIIlI[231]] = "CAMEL_6";
        h.lIIIlIllll[h.lIIIllIIlI[232]] = "Which camel byproduct is known to be very nutritious?";
        h.lIIIlIllll[h.lIIIllIIlI[233]] = "Milk.";
        h.lIIIlIllll[h.lIIIllIIlI[234]] = "LEECH_1";
        h.lIIIlIllll[h.lIIIllIIlI[235]] = "What is the favoured habitat of leeches?";
        h.lIIIlIllll[h.lIIIllIIlI[236]] = "Water.";
        h.lIIIlIllll[h.lIIIllIIlI[237]] = "LEECH_2";
        h.lIIIlIllll[h.lIIIllIIlI[238]] = "What shape is the inside of a leech's mouth?";
        h.lIIIlIllll[h.lIIIllIIlI[239]] = "'Y'-shaped.";
        h.lIIIlIllll[h.lIIIllIIlI[240]] = "LEECH_3";
        h.lIIIlIllll[h.lIIIllIIlI[241]] = "Which of these is not eaten by leeches?";
        h.lIIIlIllll[h.lIIIllIIlI[242]] = "Apples.";
        h.lIIIlIllll[h.lIIIllIIlI[243]] = "LEECH_4";
        h.lIIIlIllll[h.lIIIllIIlI[244]] = "What contributed to the giant growth of Morytanian leeches?";
        h.lIIIlIllll[h.lIIIllIIlI[245]] = "Environment.";
        h.lIIIlIllll[h.lIIIllIIlI[246]] = "LEECH_5";
        h.lIIIlIllll[h.lIIIllIIlI[247]] = "What is special about Morytanian leeches?";
        h.lIIIlIllll[h.lIIIllIIlI[248]] = "They attack by jumping.";
        h.lIIIlIllll[h.lIIIllIIlI[249]] = "LEECH_6";
        h.lIIIlIllll[h.lIIIllIIlI[250]] = "How does a leech change when it feeds?";
        h.lIIIlIllll[h.lIIIllIIlI[251]] = "It doubles in size.";
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

}

