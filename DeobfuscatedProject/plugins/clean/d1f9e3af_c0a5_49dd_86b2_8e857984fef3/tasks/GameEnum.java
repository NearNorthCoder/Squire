/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

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
    public static final  /* enum */ h TERRORBIRD_4;
    public static final  /* enum */ h PENGUIN_5;
    public static final  /* enum */ h KALPHITE_2;
    private final  String question;
    public static final  /* enum */ h SLUG_3;
    public static final  /* enum */ h SNAIL_3;
    public static final  /* enum */ h PENGUIN_6;
    public static final  /* enum */ h TERRORBIRD_6;
    public static final  /* enum */ h WYVERN_3;
    public static final  /* enum */ h SNAIL_4;
    public static final  /* enum */ h SLUG_1;
    public static final  /* enum */ h TORTOISE_1;
    public static final  /* enum */ h WYVERN_1;
    public static final  /* enum */ h SNAIL_5;
    public static final  /* enum */ h PENGUIN_4;
    public static final  /* enum */ h TERRORBIRD_1;
    public static final  /* enum */ h MOLE_4;
    public static final  /* enum */ h TORTOISE_4;
    public static final  /* enum */ h LEECH_4;
    public static final  /* enum */ h MOLE_5;
    public static final  /* enum */ h MOLE_6;
    public static final  /* enum */ h SNAKE_4;
    public static final  /* enum */ h SLUG_4;
    private final  String answer;
    public static final  /* enum */ h TERRORBIRD_3;
    public static final  /* enum */ h DRAGON_2;
    public static final  /* enum */ h TORTOISE_2;
    public static final  /* enum */ h SNAKE_6;
    public static final  /* enum */ h TERRORBIRD_5;
    public static final  /* enum */ h LIZARD_5;
    public static final  /* enum */ h SNAKE_3;
    public static final  /* enum */ h KALPHITE_3;
    public static final  /* enum */ h LEECH_6;
    public static final  /* enum */ h PENGUIN_3;
    public static final  /* enum */ h MONKEY_6;
    public static final  /* enum */ h LIZARD_6;
    public static final  /* enum */ h DRAGON_4;
    public static final  /* enum */ h WYVERN_2;
    public static final  /* enum */ h DRAGON_1;
    public static final  /* enum */ h WYVERN_6;
    public static final  /* enum */ h MONKEY_1;
    public static final  /* enum */ h PENGUIN_1;
    public static final  /* enum */ h WYVERN_5;
    public static final  /* enum */ h SNAIL_1;
    public static final  /* enum */ h CAMEL_4;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ h SNAIL_2;
    public static final  /* enum */ h MOLE_1;
    public static final  /* enum */ h WYVERN_4;
    public static final  /* enum */ h TERRORBIRD_2;
    public static final  /* enum */ h SLUG_6;
    public static final  /* enum */ h SNAKE_2;
    public static final  /* enum */ h KALPHITE_1;
    public static final  /* enum */ h SNAIL_6;
    public static final  /* enum */ h CAMEL_5;
    public static final  /* enum */ h SNAKE_1;
    public static final  /* enum */ h PENGUIN_2;
    public static final  /* enum */ h DRAGON_5;
    
    public static final  /* enum */ h LEECH_5;
    public static final  /* enum */ h DRAGON_3;
    public static final  /* enum */ h CAMEL_2;
    public static final  /* enum */ h LEECH_1;
    private static final  h[] $VALUES;
    public static final  /* enum */ h KALPHITE_6;
    public static final  /* enum */ h MONKEY_3;
    public static final  /* enum */ h LIZARD_3;
    public static final  /* enum */ h TORTOISE_3;
    public static final  /* enum */ h LIZARD_2;
    public static final  /* enum */ h CAMEL_3;
    public static final  /* enum */ h SNAKE_5;
    public static final  /* enum */ h SLUG_2;
    public static final  /* enum */ h KALPHITE_4;
    public static final  /* enum */ h DRAGON_6;
    public static final  /* enum */ h MONKEY_2;
    public static final  /* enum */ h LEECH_2;
    public static final  /* enum */ h CAMEL_6;
    public static final  /* enum */ h LIZARD_4;
    public static final  /* enum */ h LIZARD_1;
    public static final  /* enum */ h MONKEY_4;
    public static final  /* enum */ h MOLE_2;
    public static final  /* enum */ h CAMEL_1;
    public static final  /* enum */ h TORTOISE_6;
    public static final  /* enum */ h KALPHITE_5;
    
    public static final  /* enum */ h TORTOISE_5;
    public static final  /* enum */ h MONKEY_5;
    public static final  /* enum */ h MOLE_3;
    public static final  /* enum */ h SLUG_5;
    public static final  /* enum */ h LEECH_3;

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        return String.valueOf(lIIIllIlIIlIllI);
    }

    public String P() {
        return this.answer;
    }

    private static boolean lllIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public String O() {
        return this.question;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void lIIIllIlIllllIl;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int lIIIllIlIllllII = lIIIllIlI[0];
        while (h.lllIlIlIlIl(lIIIllIlIllllII, (int)lIIIllIlIllllIl)) {
            void lIIIllIlIllllll;
            void lIIIllIlIlllllI;
            void lIIIllIlIlllIll = lIIIllIlIlllllI[lIIIllIlIllllII];
            Widget lIIIllIlIlllIlI = Widgets.get((WidgetInfo)lIIIllIlIlllIll);
            if (h.lllIlIlIllI(lIIIllIlIlllIlI) && h.lllIlIlIlll(lIIIllIlIlllIlI.getText().equals(lIIIllIlIllllll) ? 1 : 0)) {
                return lIIIllIlIlllIlI;
            }
            ++lIIIllIlIllllII;

            if ((0x70 ^ 0x74) > -1) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void lIIIllIlIllIIlI;
            h.lllIlIlIlII();
            h.lllIlIlIIll();
            LIZARD_1 = new GameEnum(lIIIlIllI[lIIIllIlI[1]], lIIIlIllI[lIIIllIlI[2]]);
            LIZARD_2 = new GameEnum(lIIIlIllI[lIIIllIlI[4]], lIIIlIllI[lIIIllIlI[5]]);
            LIZARD_3 = new GameEnum(lIIIlIllI[lIIIllIlI[7]], lIIIlIllI[lIIIllIlI[8]]);
            LIZARD_4 = new GameEnum(lIIIlIllI[lIIIllIlI[10]], lIIIlIllI[lIIIllIlI[11]]);
            LIZARD_5 = new GameEnum(lIIIlIllI[lIIIllIlI[13]], lIIIlIllI[lIIIllIlI[14]]);
            LIZARD_6 = new GameEnum(lIIIlIllI[lIIIllIlI[16]], lIIIlIllI[lIIIllIlI[17]]);
            TORTOISE_1 = new GameEnum(lIIIlIllI[lIIIllIlI[19]], lIIIlIllI[lIIIllIlI[20]]);
            TORTOISE_2 = new GameEnum(lIIIlIllI[lIIIllIlI[22]], lIIIlIllI[lIIIllIlI[23]]);
            TORTOISE_3 = new GameEnum(lIIIlIllI[lIIIllIlI[25]], lIIIlIllI[lIIIllIlI[26]]);
            TORTOISE_4 = new GameEnum(lIIIlIllI[lIIIllIlI[28]], lIIIlIllI[lIIIllIlI[29]]);
            TORTOISE_5 = new GameEnum(lIIIlIllI[lIIIllIlI[31]], lIIIlIllI[lIIIllIlI[32]]);
            TORTOISE_6 = new GameEnum(lIIIlIllI[lIIIllIlI[34]], lIIIlIllI[lIIIllIlI[35]]);
            DRAGON_1 = new GameEnum(lIIIlIllI[lIIIllIlI[37]], lIIIlIllI[lIIIllIlI[38]]);
            DRAGON_2 = new GameEnum(lIIIlIllI[lIIIllIlI[40]], lIIIlIllI[lIIIllIlI[41]]);
            DRAGON_3 = new GameEnum(lIIIlIllI[lIIIllIlI[43]], lIIIlIllI[lIIIllIlI[44]]);
            DRAGON_4 = new GameEnum(lIIIlIllI[lIIIllIlI[46]], lIIIlIllI[lIIIllIlI[47]]);
            DRAGON_5 = new GameEnum(lIIIlIllI[lIIIllIlI[49]], lIIIlIllI[lIIIllIlI[50]]);
            DRAGON_6 = new GameEnum(lIIIlIllI[lIIIllIlI[52]], lIIIlIllI[lIIIllIlI[53]]);
            WYVERN_1 = new GameEnum(lIIIlIllI[lIIIllIlI[55]], lIIIlIllI[lIIIllIlI[56]]);
            WYVERN_2 = new GameEnum(lIIIlIllI[lIIIllIlI[58]], lIIIlIllI[lIIIllIlI[59]]);
            WYVERN_3 = new GameEnum(lIIIlIllI[lIIIllIlI[61]], lIIIlIllI[lIIIllIlI[62]]);
            WYVERN_4 = new GameEnum(lIIIlIllI[lIIIllIlI[64]], lIIIlIllI[lIIIllIlI[65]]);
            WYVERN_5 = new GameEnum(lIIIlIllI[lIIIllIlI[67]], lIIIlIllI[lIIIllIlI[68]]);
            WYVERN_6 = new GameEnum(lIIIlIllI[lIIIllIlI[70]], lIIIlIllI[lIIIllIlI[71]]);
            SNAIL_1 = new GameEnum(lIIIlIllI[lIIIllIlI[73]], lIIIlIllI[lIIIllIlI[74]]);
            SNAIL_2 = new GameEnum(lIIIlIllI[lIIIllIlI[76]], lIIIlIllI[lIIIllIlI[77]]);
            SNAIL_3 = new GameEnum(lIIIlIllI[lIIIllIlI[79]], lIIIlIllI[lIIIllIlI[80]]);
            SNAIL_4 = new GameEnum(lIIIlIllI[lIIIllIlI[82]], lIIIlIllI[lIIIllIlI[83]]);
            SNAIL_5 = new GameEnum(lIIIlIllI[lIIIllIlI[85]], lIIIlIllI[lIIIllIlI[86]]);
            SNAIL_6 = new GameEnum(lIIIlIllI[lIIIllIlI[88]], lIIIlIllI[lIIIllIlI[89]]);
            SNAKE_1 = new GameEnum(lIIIlIllI[lIIIllIlI[91]], lIIIlIllI[lIIIllIlI[92]]);
            SNAKE_2 = new GameEnum(lIIIlIllI[lIIIllIlI[94]], lIIIlIllI[lIIIllIlI[95]]);
            SNAKE_3 = new GameEnum(lIIIlIllI[lIIIllIlI[97]], lIIIlIllI[lIIIllIlI[98]]);
            SNAKE_4 = new GameEnum(lIIIlIllI[lIIIllIlI[100]], lIIIlIllI[lIIIllIlI[101]]);
            SNAKE_5 = new GameEnum(lIIIlIllI[lIIIllIlI[103]], lIIIlIllI[lIIIllIlI[104]]);
            SNAKE_6 = new GameEnum(lIIIlIllI[lIIIllIlI[106]], lIIIlIllI[lIIIllIlI[107]]);
            SLUG_1 = new GameEnum(lIIIlIllI[lIIIllIlI[109]], lIIIlIllI[lIIIllIlI[110]]);
            SLUG_2 = new GameEnum(lIIIlIllI[lIIIllIlI[112]], lIIIlIllI[lIIIllIlI[113]]);
            SLUG_3 = new GameEnum(lIIIlIllI[lIIIllIlI[115]], lIIIlIllI[lIIIllIlI[116]]);
            SLUG_4 = new GameEnum(lIIIlIllI[lIIIllIlI[118]], lIIIlIllI[lIIIllIlI[119]]);
            SLUG_5 = new GameEnum(lIIIlIllI[lIIIllIlI[121]], lIIIlIllI[lIIIllIlI[122]]);
            SLUG_6 = new GameEnum(lIIIlIllI[lIIIllIlI[124]], lIIIlIllI[lIIIllIlI[125]]);
            MONKEY_1 = new GameEnum(lIIIlIllI[lIIIllIlI[127]], lIIIlIllI[lIIIllIlI[128]]);
            MONKEY_2 = new GameEnum(lIIIlIllI[lIIIllIlI[130]], lIIIlIllI[lIIIllIlI[131]]);
            MONKEY_3 = new GameEnum(lIIIlIllI[lIIIllIlI[133]], lIIIlIllI[lIIIllIlI[134]]);
            MONKEY_4 = new GameEnum(lIIIlIllI[lIIIllIlI[136]], lIIIlIllI[lIIIllIlI[137]]);
            MONKEY_5 = new GameEnum(lIIIlIllI[lIIIllIlI[139]], lIIIlIllI[lIIIllIlI[140]]);
            MONKEY_6 = new GameEnum(lIIIlIllI[lIIIllIlI[142]], lIIIlIllI[lIIIllIlI[143]]);
            KALPHITE_1 = new GameEnum(lIIIlIllI[lIIIllIlI[145]], lIIIlIllI[lIIIllIlI[146]]);
            KALPHITE_2 = new GameEnum(lIIIlIllI[lIIIllIlI[148]], lIIIlIllI[lIIIllIlI[149]]);
            KALPHITE_3 = new GameEnum(lIIIlIllI[lIIIllIlI[151]], lIIIlIllI[lIIIllIlI[152]]);
            KALPHITE_4 = new GameEnum(lIIIlIllI[lIIIllIlI[154]], lIIIlIllI[lIIIllIlI[155]]);
            KALPHITE_5 = new GameEnum(lIIIlIllI[lIIIllIlI[157]], lIIIlIllI[lIIIllIlI[158]]);
            KALPHITE_6 = new GameEnum(lIIIlIllI[lIIIllIlI[160]], lIIIlIllI[lIIIllIlI[161]]);
            TERRORBIRD_1 = new GameEnum(lIIIlIllI[lIIIllIlI[163]], lIIIlIllI[lIIIllIlI[164]]);
            TERRORBIRD_2 = new GameEnum(lIIIlIllI[lIIIllIlI[166]], lIIIlIllI[lIIIllIlI[167]]);
            TERRORBIRD_3 = new GameEnum(lIIIlIllI[lIIIllIlI[169]], lIIIlIllI[lIIIllIlI[170]]);
            TERRORBIRD_4 = new GameEnum(lIIIlIllI[lIIIllIlI[172]], lIIIlIllI[lIIIllIlI[173]]);
            TERRORBIRD_5 = new GameEnum(lIIIlIllI[lIIIllIlI[175]], lIIIlIllI[lIIIllIlI[176]]);
            TERRORBIRD_6 = new GameEnum(lIIIlIllI[lIIIllIlI[178]], lIIIlIllI[lIIIllIlI[179]]);
            PENGUIN_1 = new GameEnum(lIIIlIllI[lIIIllIlI[181]], lIIIlIllI[lIIIllIlI[182]]);
            PENGUIN_2 = new GameEnum(lIIIlIllI[lIIIllIlI[184]], lIIIlIllI[lIIIllIlI[185]]);
            PENGUIN_3 = new GameEnum(lIIIlIllI[lIIIllIlI[187]], lIIIlIllI[lIIIllIlI[188]]);
            PENGUIN_4 = new GameEnum(lIIIlIllI[lIIIllIlI[190]], lIIIlIllI[lIIIllIlI[191]]);
            PENGUIN_5 = new GameEnum(lIIIlIllI[lIIIllIlI[193]], lIIIlIllI[lIIIllIlI[194]]);
            PENGUIN_6 = new GameEnum(lIIIlIllI[lIIIllIlI[196]], lIIIlIllI[lIIIllIlI[197]]);
            MOLE_1 = new GameEnum(lIIIlIllI[lIIIllIlI[199]], lIIIlIllI[lIIIllIlI[200]]);
            MOLE_2 = new GameEnum(lIIIlIllI[lIIIllIlI[202]], lIIIlIllI[lIIIllIlI[203]]);
            MOLE_3 = new GameEnum(lIIIlIllI[lIIIllIlI[205]], lIIIlIllI[lIIIllIlI[206]]);
            MOLE_4 = new GameEnum(lIIIlIllI[lIIIllIlI[208]], lIIIlIllI[lIIIllIlI[209]]);
            MOLE_5 = new GameEnum(lIIIlIllI[lIIIllIlI[211]], lIIIlIllI[lIIIllIlI[212]]);
            MOLE_6 = new GameEnum(lIIIlIllI[lIIIllIlI[214]], lIIIlIllI[lIIIllIlI[215]]);
            CAMEL_1 = new GameEnum(lIIIlIllI[lIIIllIlI[217]], lIIIlIllI[lIIIllIlI[218]]);
            CAMEL_2 = new GameEnum(lIIIlIllI[lIIIllIlI[220]], lIIIlIllI[lIIIllIlI[221]]);
            CAMEL_3 = new GameEnum(lIIIlIllI[lIIIllIlI[223]], lIIIlIllI[lIIIllIlI[224]]);
            CAMEL_4 = new GameEnum(lIIIlIllI[lIIIllIlI[226]], lIIIlIllI[lIIIllIlI[227]]);
            CAMEL_5 = new GameEnum(lIIIlIllI[lIIIllIlI[229]], lIIIlIllI[lIIIllIlI[230]]);
            CAMEL_6 = new GameEnum(lIIIlIllI[lIIIllIlI[232]], lIIIlIllI[lIIIllIlI[233]]);
            LEECH_1 = new GameEnum(lIIIlIllI[lIIIllIlI[235]], lIIIlIllI[lIIIllIlI[236]]);
            LEECH_2 = new GameEnum(lIIIlIllI[lIIIllIlI[238]], lIIIlIllI[lIIIllIlI[239]]);
            LEECH_3 = new GameEnum(lIIIlIllI[lIIIllIlI[241]], lIIIlIllI[lIIIllIlI[242]]);
            LEECH_4 = new GameEnum(lIIIlIllI[lIIIllIlI[244]], lIIIlIllI[lIIIllIlI[245]]);
            LEECH_5 = new GameEnum(lIIIlIllI[lIIIllIlI[247]], lIIIlIllI[lIIIllIlI[248]]);
            LEECH_6 = new GameEnum(lIIIlIllI[lIIIllIlI[250]], lIIIlIllI[lIIIllIlI[251]]);
            h[] hArray = new h[lIIIllIlI[84]];
            hArray[h.lIIIllIlI[0]] = LIZARD_1;
            hArray[h.lIIIllIlI[1]] = LIZARD_2;
            hArray[h.lIIIllIlI[2]] = LIZARD_3;
            hArray[h.lIIIllIlI[3]] = LIZARD_4;
            hArray[h.lIIIllIlI[4]] = LIZARD_5;
            hArray[h.lIIIllIlI[5]] = LIZARD_6;
            hArray[h.lIIIllIlI[6]] = TORTOISE_1;
            hArray[h.lIIIllIlI[7]] = TORTOISE_2;
            hArray[h.lIIIllIlI[8]] = TORTOISE_3;
            hArray[h.lIIIllIlI[9]] = TORTOISE_4;
            hArray[h.lIIIllIlI[10]] = TORTOISE_5;
            hArray[h.lIIIllIlI[11]] = TORTOISE_6;
            hArray[h.lIIIllIlI[12]] = DRAGON_1;
            hArray[h.lIIIllIlI[13]] = DRAGON_2;
            hArray[h.lIIIllIlI[14]] = DRAGON_3;
            hArray[h.lIIIllIlI[15]] = DRAGON_4;
            hArray[h.lIIIllIlI[16]] = DRAGON_5;
            hArray[h.lIIIllIlI[17]] = DRAGON_6;
            hArray[h.lIIIllIlI[18]] = WYVERN_1;
            hArray[h.lIIIllIlI[19]] = WYVERN_2;
            hArray[h.lIIIllIlI[20]] = WYVERN_3;
            hArray[h.lIIIllIlI[21]] = WYVERN_4;
            hArray[h.lIIIllIlI[22]] = WYVERN_5;
            hArray[h.lIIIllIlI[23]] = WYVERN_6;
            hArray[h.lIIIllIlI[24]] = SNAIL_1;
            hArray[h.lIIIllIlI[25]] = SNAIL_2;
            hArray[h.lIIIllIlI[26]] = SNAIL_3;
            hArray[h.lIIIllIlI[27]] = SNAIL_4;
            hArray[h.lIIIllIlI[28]] = SNAIL_5;
            hArray[h.lIIIllIlI[29]] = SNAIL_6;
            hArray[h.lIIIllIlI[30]] = SNAKE_1;
            hArray[h.lIIIllIlI[31]] = SNAKE_2;
            hArray[h.lIIIllIlI[32]] = SNAKE_3;
            hArray[h.lIIIllIlI[33]] = SNAKE_4;
            hArray[h.lIIIllIlI[34]] = SNAKE_5;
            hArray[h.lIIIllIlI[35]] = SNAKE_6;
            hArray[h.lIIIllIlI[36]] = SLUG_1;
            hArray[h.lIIIllIlI[37]] = SLUG_2;
            hArray[h.lIIIllIlI[38]] = SLUG_3;
            hArray[h.lIIIllIlI[39]] = SLUG_4;
            hArray[h.lIIIllIlI[40]] = SLUG_5;
            hArray[h.lIIIllIlI[41]] = SLUG_6;
            hArray[h.lIIIllIlI[42]] = MONKEY_1;
            hArray[h.lIIIllIlI[43]] = MONKEY_2;
            hArray[h.lIIIllIlI[44]] = MONKEY_3;
            hArray[h.lIIIllIlI[45]] = MONKEY_4;
            hArray[h.lIIIllIlI[46]] = MONKEY_5;
            hArray[h.lIIIllIlI[47]] = MONKEY_6;
            hArray[h.lIIIllIlI[48]] = KALPHITE_1;
            hArray[h.lIIIllIlI[49]] = KALPHITE_2;
            hArray[h.lIIIllIlI[50]] = KALPHITE_3;
            hArray[h.lIIIllIlI[51]] = KALPHITE_4;
            hArray[h.lIIIllIlI[52]] = KALPHITE_5;
            hArray[h.lIIIllIlI[53]] = KALPHITE_6;
            hArray[h.lIIIllIlI[54]] = TERRORBIRD_1;
            hArray[h.lIIIllIlI[55]] = TERRORBIRD_2;
            hArray[h.lIIIllIlI[56]] = TERRORBIRD_3;
            hArray[h.lIIIllIlI[57]] = TERRORBIRD_4;
            hArray[h.lIIIllIlI[58]] = TERRORBIRD_5;
            hArray[h.lIIIllIlI[59]] = TERRORBIRD_6;
            hArray[h.lIIIllIlI[60]] = PENGUIN_1;
            hArray[h.lIIIllIlI[61]] = PENGUIN_2;
            hArray[h.lIIIllIlI[62]] = PENGUIN_3;
            hArray[h.lIIIllIlI[63]] = PENGUIN_4;
            hArray[h.lIIIllIlI[64]] = PENGUIN_5;
            hArray[h.lIIIllIlI[65]] = PENGUIN_6;
            hArray[h.lIIIllIlI[66]] = MOLE_1;
            hArray[h.lIIIllIlI[67]] = MOLE_2;
            hArray[h.lIIIllIlI[68]] = MOLE_3;
            hArray[h.lIIIllIlI[69]] = MOLE_4;
            hArray[h.lIIIllIlI[70]] = MOLE_5;
            hArray[h.lIIIllIlI[71]] = MOLE_6;
            hArray[h.lIIIllIlI[72]] = CAMEL_1;
            hArray[h.lIIIllIlI[73]] = CAMEL_2;
            hArray[h.lIIIllIlI[74]] = CAMEL_3;
            hArray[h.lIIIllIlI[75]] = CAMEL_4;
            hArray[h.lIIIllIlI[76]] = CAMEL_5;
            hArray[h.lIIIllIlI[77]] = CAMEL_6;
            hArray[h.lIIIllIlI[78]] = LEECH_1;
            hArray[h.lIIIllIlI[79]] = LEECH_2;
            hArray[h.lIIIllIlI[80]] = LEECH_3;
            hArray[h.lIIIllIlI[81]] = LEECH_4;
            hArray[h.lIIIllIlI[82]] = LEECH_5;
            hArray[h.lIIIllIlI[83]] = LEECH_6;
            $VALUES = hArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            h[] hArray2 = h.values();
            int n2 = hArray2.length;
            int lIIIllIlIllIIIl = lIIIllIlI[0];
            while (h.lllIlIlIlIl(lIIIllIlIllIIIl, (int)lIIIllIlIllIIlI)) {
                void lIIIllIlIllIlII;
                void lIIIllIlIllIIll;
                void lIIIllIlIllIIII = lIIIllIlIllIIll[lIIIllIlIllIIIl];
                lIIIllIlIllIlII.put((Object)lIIIllIlIllIIII.question, (Object)lIIIllIlIllIIII.answer);

                ++lIIIllIlIllIIIl;

                if ((0x3A ^ 0x3E) == (0xC5 ^ 0xC1)) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

    private static boolean lllIlIlIllI(Object object) {
        return object != null;
    }

    private static boolean lllIlIlIlll(int n2) {
        return n2 != 0;
    }

    private static void lllIlIlIIll() {
        lIIIlIllI = new String[lIIIllIlI[252]];
        h.lIIIlIllI[h.lIIIllIlI[0]] = "LIZARD_1";
        h.lIIIlIllI[h.lIIIllIlI[1]] = "How does a lizard regulate body heat?";
        h.lIIIlIllI[h.lIIIllIlI[2]] = "Sunlight.";
        h.lIIIlIllI[h.lIIIllIlI[3]] = "LIZARD_2";
        h.lIIIlIllI[h.lIIIllIlI[4]] = "Who discovered how to kill lizards?";
        h.lIIIlIllI[h.lIIIllIlI[5]] = "The Slayer Masters.";
        h.lIIIlIllI[h.lIIIllIlI[6]] = "LIZARD_3";
        h.lIIIlIllI[h.lIIIllIlI[7]] = "How many eyes does a lizard have?";
        h.lIIIlIllI[h.lIIIllIlI[8]] = "Three.";
        h.lIIIlIllI[h.lIIIllIlI[9]] = "LIZARD_4";
        h.lIIIlIllI[h.lIIIllIlI[10]] = "What order do lizards belong to?";
        h.lIIIlIllI[h.lIIIllIlI[11]] = "Squamata.";
        h.lIIIlIllI[h.lIIIllIlI[12]] = "LIZARD_5";
        h.lIIIlIllI[h.lIIIllIlI[13]] = "What happens when a lizard becomes cold?";
        h.lIIIlIllI[h.lIIIllIlI[14]] = "It becomes sleepy.";
        h.lIIIlIllI[h.lIIIllIlI[15]] = "LIZARD_6";
        h.lIIIlIllI[h.lIIIllIlI[16]] = "Lizard skin is made of the same substance as?";
        h.lIIIlIllI[h.lIIIllIlI[17]] = "Hair.";
        h.lIIIlIllI[h.lIIIllIlI[18]] = "TORTOISE_1";
        h.lIIIlIllI[h.lIIIllIlI[19]] = "What is the name of the oldest tortoise ever recorded?";
        h.lIIIlIllI[h.lIIIllIlI[20]] = "Mibbiwocket.";
        h.lIIIlIllI[h.lIIIllIlI[21]] = "TORTOISE_2";
        h.lIIIlIllI[h.lIIIllIlI[22]] = "What is a tortoise's favourite food?";
        h.lIIIlIllI[h.lIIIllIlI[23]] = "Vegetables.";
        h.lIIIlIllI[h.lIIIllIlI[24]] = "TORTOISE_3";
        h.lIIIlIllI[h.lIIIllIlI[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        h.lIIIlIllI[h.lIIIllIlI[26]] = "Admiral Bake.";
        h.lIIIlIllI[h.lIIIllIlI[27]] = "TORTOISE_4";
        h.lIIIlIllI[h.lIIIllIlI[28]] = "How does the tortoise protect itself?";
        h.lIIIlIllI[h.lIIIllIlI[29]] = "Hard shell.";
        h.lIIIlIllI[h.lIIIllIlI[30]] = "TORTOISE_5";
        h.lIIIlIllI[h.lIIIllIlI[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        h.lIIIlIllI[h.lIIIllIlI[32]] = "Twenty years.";
        h.lIIIlIllI[h.lIIIllIlI[33]] = "TORTOISE_6";
        h.lIIIlIllI[h.lIIIllIlI[34]] = "Which race breeds tortoises for battle?";
        h.lIIIlIllI[h.lIIIllIlI[35]] = "Gnomes.";
        h.lIIIlIllI[h.lIIIllIlI[36]] = "DRAGON_1";
        h.lIIIlIllI[h.lIIIllIlI[37]] = "What is considered a delicacy by dragons?";
        h.lIIIlIllI[h.lIIIllIlI[38]] = "Runite.";
        h.lIIIlIllI[h.lIIIllIlI[39]] = "DRAGON_2";
        h.lIIIlIllI[h.lIIIllIlI[40]] = "What is the best defence against a dragon's attack?";
        h.lIIIlIllI[h.lIIIllIlI[41]] = "Anti dragon-breath shield.";
        h.lIIIlIllI[h.lIIIllIlI[42]] = "DRAGON_3";
        h.lIIIlIllI[h.lIIIllIlI[43]] = "How long do dragons live?";
        h.lIIIlIllI[h.lIIIllIlI[44]] = "Unknown.";
        h.lIIIlIllI[h.lIIIllIlI[45]] = "DRAGON_4";
        h.lIIIlIllI[h.lIIIllIlI[46]] = "Which of these is not a type of dragon?";
        h.lIIIlIllI[h.lIIIllIlI[47]] = "Elemental.";
        h.lIIIlIllI[h.lIIIllIlI[48]] = "DRAGON_5";
        h.lIIIlIllI[h.lIIIllIlI[49]] = "What is the favoured territory of a dragon?";
        h.lIIIlIllI[h.lIIIllIlI[50]] = "Old battle sites.";
        h.lIIIlIllI[h.lIIIllIlI[51]] = "DRAGON_6";
        h.lIIIlIllI[h.lIIIllIlI[52]] = "Approximately how many feet tall do dragons stand?";
        h.lIIIlIllI[h.lIIIllIlI[53]] = "Twelve.";
        h.lIIIlIllI[h.lIIIllIlI[54]] = "WYVERN_1";
        h.lIIIlIllI[h.lIIIllIlI[55]] = "How did the wyverns die out?";
        h.lIIIlIllI[h.lIIIllIlI[56]] = "Climate change.";
        h.lIIIlIllI[h.lIIIllIlI[57]] = "WYVERN_2";
        h.lIIIlIllI[h.lIIIllIlI[58]] = "How many legs does a wyvern have?";
        h.lIIIlIllI[h.lIIIllIlI[59]] = "Two.";
        h.lIIIlIllI[h.lIIIllIlI[60]] = "WYVERN_3";
        h.lIIIlIllI[h.lIIIllIlI[61]] = "Where have wyvern bones been found?";
        h.lIIIlIllI[h.lIIIllIlI[62]] = "Asgarnia.";
        h.lIIIlIllI[h.lIIIllIlI[63]] = "WYVERN_4";
        h.lIIIlIllI[h.lIIIllIlI[64]] = "Which genus does the wyvern theoretically belong to?";
        h.lIIIlIllI[h.lIIIllIlI[65]] = "Reptiles.";
        h.lIIIlIllI[h.lIIIllIlI[66]] = "WYVERN_5";
        h.lIIIlIllI[h.lIIIllIlI[67]] = "What are the wyverns' closest relations?";
        h.lIIIlIllI[h.lIIIllIlI[68]] = "Dragons.";
        h.lIIIlIllI[h.lIIIllIlI[69]] = "WYVERN_6";
        h.lIIIlIllI[h.lIIIllIlI[70]] = "What is the ambient temperature of wyvern bones?";
        h.lIIIlIllI[h.lIIIllIlI[71]] = "Below room temperature.";
        h.lIIIlIllI[h.lIIIllIlI[72]] = "SNAIL_1";
        h.lIIIlIllI[h.lIIIllIlI[73]] = "What is special about the shell of the giant Morytanian snail?";
        h.lIIIlIllI[h.lIIIllIlI[74]] = "It is resistant to acid.";
        h.lIIIlIllI[h.lIIIllIlI[75]] = "SNAIL_2";
        h.lIIIlIllI[h.lIIIllIlI[76]] = "How do Morytanian snails capture their prey?";
        h.lIIIlIllI[h.lIIIllIlI[77]] = "Spitting acid.";
        h.lIIIlIllI[h.lIIIllIlI[78]] = "SNAIL_3";
        h.lIIIlIllI[h.lIIIllIlI[79]] = "Which of these is a snail byproduct?";
        h.lIIIlIllI[h.lIIIllIlI[80]] = "Fireproof oil.";
        h.lIIIlIllI[h.lIIIllIlI[81]] = "SNAIL_4";
        h.lIIIlIllI[h.lIIIllIlI[82]] = "What does 'Achatina Acidia' mean?";
        h.lIIIlIllI[h.lIIIllIlI[83]] = "Acid-spitting snail.";
        h.lIIIlIllI[h.lIIIllIlI[84]] = "SNAIL_5";
        h.lIIIlIllI[h.lIIIllIlI[85]] = "How do snails move?";
        h.lIIIlIllI[h.lIIIllIlI[86]] = "Contracting and stretching.";
        h.lIIIlIllI[h.lIIIllIlI[87]] = "SNAIL_6";
        h.lIIIlIllI[h.lIIIllIlI[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        h.lIIIlIllI[h.lIIIllIlI[89]] = "An operculum.";
        h.lIIIlIllI[h.lIIIllIlI[90]] = "SNAKE_1";
        h.lIIIlIllI[h.lIIIllIlI[91]] = "What is snake venom adapted from?";
        h.lIIIlIllI[h.lIIIllIlI[92]] = "Stomach acid.";
        h.lIIIlIllI[h.lIIIllIlI[93]] = "SNAKE_2";
        h.lIIIlIllI[h.lIIIllIlI[94]] = "Aside from their noses, what do snakes use to smell?";
        h.lIIIlIllI[h.lIIIllIlI[95]] = "Tongue.";
        h.lIIIlIllI[h.lIIIllIlI[96]] = "SNAKE_3";
        h.lIIIlIllI[h.lIIIllIlI[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        h.lIIIlIllI[h.lIIIllIlI[98]] = "Seeing how you smell.";
        h.lIIIlIllI[h.lIIIllIlI[99]] = "SNAKE_4";
        h.lIIIlIllI[h.lIIIllIlI[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        h.lIIIlIllI[h.lIIIllIlI[101]] = "Constriction.";
        h.lIIIlIllI[h.lIIIllIlI[102]] = "SNAKE_5";
        h.lIIIlIllI[h.lIIIllIlI[103]] = "Lizards and snakes belong to the same order - what is it?";
        h.lIIIlIllI[h.lIIIllIlI[104]] = "Squamata.";
        h.lIIIlIllI[h.lIIIllIlI[105]] = "SNAKE_6";
        h.lIIIlIllI[h.lIIIllIlI[106]] = "Which habitat do snakes prefer?";
        h.lIIIlIllI[h.lIIIllIlI[107]] = "Anywhere.";
        h.lIIIlIllI[h.lIIIllIlI[108]] = "SLUG_1";
        h.lIIIlIllI[h.lIIIllIlI[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        h.lIIIlIllI[h.lIIIllIlI[110]] = "Nematocysts.";
        h.lIIIlIllI[h.lIIIllIlI[111]] = "SLUG_2";
        h.lIIIlIllI[h.lIIIllIlI[112]] = "Why has the museum never examined a live sea slug?";
        h.lIIIlIllI[h.lIIIllIlI[113]] = "The researchers keep vanishing.";
        h.lIIIlIllI[h.lIIIllIlI[114]] = "SLUG_3";
        h.lIIIlIllI[h.lIIIllIlI[115]] = "What do we think the sea slug feeds upon?";
        h.lIIIlIllI[h.lIIIllIlI[116]] = "Seaweed.";
        h.lIIIlIllI[h.lIIIllIlI[117]] = "SLUG_4";
        h.lIIIlIllI[h.lIIIllIlI[118]] = "What are the two fangs presumed to be used for?";
        h.lIIIlIllI[h.lIIIllIlI[119]] = "Defense or display.";
        h.lIIIlIllI[h.lIIIllIlI[120]] = "SLUG_5";
        h.lIIIlIllI[h.lIIIllIlI[121]] = "Off of which coastline would you find sea slugs?";
        h.lIIIlIllI[h.lIIIllIlI[122]] = "Ardougne.";
        h.lIIIlIllI[h.lIIIllIlI[123]] = "SLUG_6";
        h.lIIIlIllI[h.lIIIllIlI[124]] = "In what way are sea slugs similar to snails?";
        h.lIIIlIllI[h.lIIIllIlI[125]] = "They have a hard shell.";
        h.lIIIlIllI[h.lIIIllIlI[126]] = "MONKEY_1";
        h.lIIIlIllI[h.lIIIllIlI[127]] = "Which type of primates do monkeys belong to?";
        h.lIIIlIllI[h.lIIIllIlI[128]] = "Simian.";
        h.lIIIlIllI[h.lIIIllIlI[129]] = "MONKEY_2";
        h.lIIIlIllI[h.lIIIllIlI[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        h.lIIIlIllI[h.lIIIllIlI[131]] = "Harmless.";
        h.lIIIlIllI[h.lIIIllIlI[132]] = "MONKEY_3";
        h.lIIIlIllI[h.lIIIllIlI[133]] = "Monkeys love bananas. What else do they like to eat?";
        h.lIIIlIllI[h.lIIIllIlI[134]] = "Bitternuts.";
        h.lIIIlIllI[h.lIIIllIlI[135]] = "MONKEY_4";
        h.lIIIlIllI[h.lIIIllIlI[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        h.lIIIlIllI[h.lIIIllIlI[137]] = "Harmless.";
        h.lIIIlIllI[h.lIIIllIlI[138]] = "MONKEY_5";
        h.lIIIlIllI[h.lIIIllIlI[139]] = "What colour mohawk do Karamjan monkeys have?";
        h.lIIIlIllI[h.lIIIllIlI[140]] = "Red.";
        h.lIIIlIllI[h.lIIIllIlI[141]] = "MONKEY_6";
        h.lIIIlIllI[h.lIIIllIlI[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        h.lIIIlIllI[h.lIIIllIlI[143]] = "Seaweed.";
        h.lIIIlIllI[h.lIIIllIlI[144]] = "KALPHITE_1";
        h.lIIIlIllI[h.lIIIllIlI[145]] = "Kalphites are ruled by a...?";
        h.lIIIlIllI[h.lIIIllIlI[146]] = "Pasha.";
        h.lIIIlIllI[h.lIIIllIlI[147]] = "KALPHITE_2";
        h.lIIIlIllI[h.lIIIllIlI[148]] = "What is the lowest caste in kalphite society?";
        h.lIIIlIllI[h.lIIIllIlI[149]] = "Worker.";
        h.lIIIlIllI[h.lIIIllIlI[150]] = "KALPHITE_3";
        h.lIIIlIllI[h.lIIIllIlI[151]] = "What are the armoured plates on a kalphite called?";
        h.lIIIlIllI[h.lIIIllIlI[152]] = "Lamellae.";
        h.lIIIlIllI[h.lIIIllIlI[153]] = "KALPHITE_4";
        h.lIIIlIllI[h.lIIIllIlI[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        h.lIIIlIllI[h.lIIIllIlI[155]] = "Carnivores.";
        h.lIIIlIllI[h.lIIIllIlI[156]] = "KALPHITE_5";
        h.lIIIlIllI[h.lIIIllIlI[157]] = "What are kalphites assumed to have evolved from?";
        h.lIIIlIllI[h.lIIIllIlI[158]] = "Scarab beetles.";
        h.lIIIlIllI[h.lIIIllIlI[159]] = "KALPHITE_6";
        h.lIIIlIllI[h.lIIIllIlI[160]] = "Name the prominent figure in kalphite mythology?";
        h.lIIIlIllI[h.lIIIllIlI[161]] = "Scabaras.";
        h.lIIIlIllI[h.lIIIllIlI[162]] = "TERRORBIRD_1";
        h.lIIIlIllI[h.lIIIllIlI[163]] = "What is a terrorbird's preferred food?";
        h.lIIIlIllI[h.lIIIllIlI[164]] = "Anything.";
        h.lIIIlIllI[h.lIIIllIlI[165]] = "TERRORBIRD_2";
        h.lIIIlIllI[h.lIIIllIlI[166]] = "Who use terrorbirds as mounts?";
        h.lIIIlIllI[h.lIIIllIlI[167]] = "Gnomes.";
        h.lIIIlIllI[h.lIIIllIlI[168]] = "TERRORBIRD_3";
        h.lIIIlIllI[h.lIIIllIlI[169]] = "Where do terrorbirds get most of their water?";
        h.lIIIlIllI[h.lIIIllIlI[170]] = "Eating plants.";
        h.lIIIlIllI[h.lIIIllIlI[171]] = "TERRORBIRD_4";
        h.lIIIlIllI[h.lIIIllIlI[172]] = "How many claws do terrorbirds have?";
        h.lIIIlIllI[h.lIIIllIlI[173]] = "Four.";
        h.lIIIlIllI[h.lIIIllIlI[174]] = "TERRORBIRD_5";
        h.lIIIlIllI[h.lIIIllIlI[175]] = "What do terrorbirds eat to aid digestion?";
        h.lIIIlIllI[h.lIIIllIlI[176]] = "Stones.";
        h.lIIIlIllI[h.lIIIllIlI[177]] = "TERRORBIRD_6";
        h.lIIIlIllI[h.lIIIllIlI[178]] = "How many teeth do terrorbirds have?";
        h.lIIIlIllI[h.lIIIllIlI[179]] = "0.";
        h.lIIIlIllI[h.lIIIllIlI[180]] = "PENGUIN_1";
        h.lIIIlIllI[h.lIIIllIlI[181]] = "Which sense do penguins rely on when hunting?";
        h.lIIIlIllI[h.lIIIllIlI[182]] = "Sight.";
        h.lIIIlIllI[h.lIIIllIlI[183]] = "PENGUIN_2";
        h.lIIIlIllI[h.lIIIllIlI[184]] = "Which skill seems unusual for the penguins to possess?";
        h.lIIIlIllI[h.lIIIllIlI[185]] = "Planning.";
        h.lIIIlIllI[h.lIIIllIlI[186]] = "PENGUIN_3";
        h.lIIIlIllI[h.lIIIllIlI[187]] = "How do penguins keep warm?";
        h.lIIIlIllI[h.lIIIllIlI[188]] = "A layer of fat.";
        h.lIIIlIllI[h.lIIIllIlI[189]] = "PENGUIN_4";
        h.lIIIlIllI[h.lIIIllIlI[190]] = "What is the preferred climate for penguins?";
        h.lIIIlIllI[h.lIIIllIlI[191]] = "Cold.";
        h.lIIIlIllI[h.lIIIllIlI[192]] = "PENGUIN_5";
        h.lIIIlIllI[h.lIIIllIlI[193]] = "Describe the behaviour of penguins?";
        h.lIIIlIllI[h.lIIIllIlI[194]] = "Social.";
        h.lIIIlIllI[h.lIIIllIlI[195]] = "PENGUIN_6";
        h.lIIIlIllI[h.lIIIllIlI[196]] = "When do penguins fast?";
        h.lIIIlIllI[h.lIIIllIlI[197]] = "During breeding.";
        h.lIIIlIllI[h.lIIIllIlI[198]] = "MOLE_1";
        h.lIIIlIllI[h.lIIIllIlI[199]] = "What habitat do moles prefer?";
        h.lIIIlIllI[h.lIIIllIlI[200]] = "Subterranean.";
        h.lIIIlIllI[h.lIIIllIlI[201]] = "MOLE_2";
        h.lIIIlIllI[h.lIIIllIlI[202]] = "Why are moles considered to be an agricultural pest?";
        h.lIIIlIllI[h.lIIIllIlI[203]] = "They dig holes.";
        h.lIIIlIllI[h.lIIIllIlI[204]] = "MOLE_3";
        h.lIIIlIllI[h.lIIIllIlI[205]] = "Who discovered giant moles?";
        h.lIIIlIllI[h.lIIIllIlI[206]] = "Wyson the Gardener.";
        h.lIIIlIllI[h.lIIIllIlI[207]] = "MOLE_4";
        h.lIIIlIllI[h.lIIIllIlI[208]] = "What would you call a group of young moles?";
        h.lIIIlIllI[h.lIIIllIlI[209]] = "A labour.";
        h.lIIIlIllI[h.lIIIllIlI[210]] = "MOLE_5";
        h.lIIIlIllI[h.lIIIllIlI[211]] = "What is a mole's favourite food?";
        h.lIIIlIllI[h.lIIIllIlI[212]] = "Insects and other invertebrates.";
        h.lIIIlIllI[h.lIIIllIlI[213]] = "MOLE_6";
        h.lIIIlIllI[h.lIIIllIlI[214]] = "Which family do moles belong to?";
        h.lIIIlIllI[h.lIIIllIlI[215]] = "The Talpidae family.";
        h.lIIIlIllI[h.lIIIllIlI[216]] = "CAMEL_1";
        h.lIIIlIllI[h.lIIIllIlI[217]] = "What is produced by feeding chilli to a camel?";
        h.lIIIlIllI[h.lIIIllIlI[218]] = "Toxic dung.";
        h.lIIIlIllI[h.lIIIllIlI[219]] = "CAMEL_2";
        h.lIIIlIllI[h.lIIIllIlI[220]] = "If an ugthanki has one, how many does a bactrian have?";
        h.lIIIlIllI[h.lIIIllIlI[221]] = "Two.";
        h.lIIIlIllI[h.lIIIllIlI[222]] = "CAMEL_3";
        h.lIIIlIllI[h.lIIIllIlI[223]] = "Camels: herbivore, carnivore or omnivore?";
        h.lIIIlIllI[h.lIIIllIlI[224]] = "Omnivore.";
        h.lIIIlIllI[h.lIIIllIlI[225]] = "CAMEL_4";
        h.lIIIlIllI[h.lIIIllIlI[226]] = "What is the usual mood for a camel?";
        h.lIIIlIllI[h.lIIIllIlI[227]] = "Annoyed.";
        h.lIIIlIllI[h.lIIIllIlI[228]] = "CAMEL_5";
        h.lIIIlIllI[h.lIIIllIlI[229]] = "Where would you find an ugthanki?";
        h.lIIIlIllI[h.lIIIllIlI[230]] = "Al Kharid.";
        h.lIIIlIllI[h.lIIIllIlI[231]] = "CAMEL_6";
        h.lIIIlIllI[h.lIIIllIlI[232]] = "Which camel byproduct is known to be very nutritious?";
        h.lIIIlIllI[h.lIIIllIlI[233]] = "Milk.";
        h.lIIIlIllI[h.lIIIllIlI[234]] = "LEECH_1";
        h.lIIIlIllI[h.lIIIllIlI[235]] = "What is the favoured habitat of leeches?";
        h.lIIIlIllI[h.lIIIllIlI[236]] = "Water.";
        h.lIIIlIllI[h.lIIIllIlI[237]] = "LEECH_2";
        h.lIIIlIllI[h.lIIIllIlI[238]] = "What shape is the inside of a leech's mouth?";
        h.lIIIlIllI[h.lIIIllIlI[239]] = "'Y'-shaped.";
        h.lIIIlIllI[h.lIIIllIlI[240]] = "LEECH_3";
        h.lIIIlIllI[h.lIIIllIlI[241]] = "Which of these is not eaten by leeches?";
        h.lIIIlIllI[h.lIIIllIlI[242]] = "Apples.";
        h.lIIIlIllI[h.lIIIllIlI[243]] = "LEECH_4";
        h.lIIIlIllI[h.lIIIllIlI[244]] = "What contributed to the giant growth of Morytanian leeches?";
        h.lIIIlIllI[h.lIIIllIlI[245]] = "Environment.";
        h.lIIIlIllI[h.lIIIllIlI[246]] = "LEECH_5";
        h.lIIIlIllI[h.lIIIllIlI[247]] = "What is special about Morytanian leeches?";
        h.lIIIlIllI[h.lIIIllIlI[248]] = "They attack by jumping.";
        h.lIIIlIllI[h.lIIIllIlI[249]] = "LEECH_6";
        h.lIIIlIllI[h.lIIIllIlI[250]] = "How does a leech change when it feeds?";
        h.lIIIlIllI[h.lIIIllIlI[251]] = "It doubles in size.";
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

