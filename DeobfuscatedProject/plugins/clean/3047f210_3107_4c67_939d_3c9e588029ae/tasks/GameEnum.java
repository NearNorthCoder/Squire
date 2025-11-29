/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

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
    
    public static final  /* enum */ h CAMEL_2;
    public static final  /* enum */ h TERRORBIRD_5;
    public static final  /* enum */ h LIZARD_5;
    public static final  /* enum */ h MOLE_1;
    public static final  /* enum */ h PENGUIN_3;
    public static final  /* enum */ h SLUG_1;
    public static final  /* enum */ h LEECH_3;
    public static final  /* enum */ h CAMEL_5;
    public static final  /* enum */ h KALPHITE_6;
    public static final  /* enum */ h KALPHITE_2;
    public static final  /* enum */ h TORTOISE_1;
    private final  String question;
    public static final  /* enum */ h CAMEL_4;
    public static final  /* enum */ h DRAGON_3;
    private static final  h[] $VALUES;
    public static final  /* enum */ h MOLE_3;
    public static final  /* enum */ h MONKEY_6;
    public static final  /* enum */ h MONKEY_5;
    public static final  /* enum */ h MONKEY_3;
    public static final  /* enum */ h WYVERN_3;
    public static final  /* enum */ h LEECH_1;
    public static final  /* enum */ h WYVERN_1;
    public static final  /* enum */ h TERRORBIRD_4;
    public static final  /* enum */ h TERRORBIRD_2;
    public static final  /* enum */ h WYVERN_5;
    public static final  /* enum */ h SNAKE_4;
    public static final  /* enum */ h PENGUIN_6;
    public static final  /* enum */ h WYVERN_6;
    public static final  /* enum */ h SLUG_5;
    public static final  /* enum */ h SNAIL_6;
    public static final  /* enum */ h SNAKE_6;
    public static final  /* enum */ h SNAIL_4;
    public static final  /* enum */ h DRAGON_4;
    public static final  /* enum */ h WYVERN_4;
    public static final  /* enum */ h MOLE_4;
    public static final  /* enum */ h LEECH_6;
    public static final  /* enum */ h MOLE_5;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ h TERRORBIRD_1;
    public static final  /* enum */ h LIZARD_2;
    public static final  /* enum */ h DRAGON_5;
    public static final  /* enum */ h TORTOISE_3;
    public static final  /* enum */ h TORTOISE_4;
    public static final  /* enum */ h SNAIL_1;
    public static final  /* enum */ h LEECH_2;
    public static final  /* enum */ h PENGUIN_1;
    public static final  /* enum */ h TERRORBIRD_6;
    public static final  /* enum */ h TORTOISE_2;
    public static final  /* enum */ h LIZARD_1;
    public static final  /* enum */ h LEECH_5;
    public static final  /* enum */ h LIZARD_3;
    public static final  /* enum */ h PENGUIN_2;
    public static final  /* enum */ h LIZARD_4;
    public static final  /* enum */ h CAMEL_1;
    
    public static final  /* enum */ h KALPHITE_4;
    public static final  /* enum */ h MOLE_6;
    public static final  /* enum */ h SNAKE_2;
    public static final  /* enum */ h DRAGON_1;
    public static final  /* enum */ h SLUG_4;
    public static final  /* enum */ h DRAGON_2;
    public static final  /* enum */ h SLUG_2;
    public static final  /* enum */ h KALPHITE_1;
    public static final  /* enum */ h TORTOISE_6;
    public static final  /* enum */ h MONKEY_4;
    public static final  /* enum */ h SNAKE_3;
    public static final  /* enum */ h SNAKE_5;
    public static final  /* enum */ h SNAIL_3;
    public static final  /* enum */ h MOLE_2;
    public static final  /* enum */ h WYVERN_2;
    public static final  /* enum */ h TERRORBIRD_3;
    public static final  /* enum */ h CAMEL_3;
    public static final  /* enum */ h MONKEY_1;
    public static final  /* enum */ h SNAIL_2;
    public static final  /* enum */ h KALPHITE_3;
    public static final  /* enum */ h SLUG_6;
    private final  String answer;
    public static final  /* enum */ h LIZARD_6;
    public static final  /* enum */ h DRAGON_6;
    public static final  /* enum */ h SLUG_3;
    public static final  /* enum */ h LEECH_4;
    public static final  /* enum */ h PENGUIN_5;
    public static final  /* enum */ h SNAIL_5;
    public static final  /* enum */ h TORTOISE_5;
    public static final  /* enum */ h CAMEL_6;
    public static final  /* enum */ h PENGUIN_4;
    public static final  /* enum */ h SNAKE_1;
    public static final  /* enum */ h KALPHITE_5;
    public static final  /* enum */ h MONKEY_2;

        return String.valueOf(var1);
    }

    public String P() {
        return this.answer;
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    private static boolean llIlIlllIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlllIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void var2;
            h.llIlIlllIlIll();
            h.llIlIlllIlIlI();
            LIZARD_1 = new GameEnum(llllllIIlI[llllllIllI[1]], llllllIIlI[llllllIllI[2]]);
            LIZARD_2 = new GameEnum(llllllIIlI[llllllIllI[4]], llllllIIlI[llllllIllI[5]]);
            LIZARD_3 = new GameEnum(llllllIIlI[llllllIllI[7]], llllllIIlI[llllllIllI[8]]);
            LIZARD_4 = new GameEnum(llllllIIlI[llllllIllI[10]], llllllIIlI[llllllIllI[11]]);
            LIZARD_5 = new GameEnum(llllllIIlI[llllllIllI[13]], llllllIIlI[llllllIllI[14]]);
            LIZARD_6 = new GameEnum(llllllIIlI[llllllIllI[16]], llllllIIlI[llllllIllI[17]]);
            TORTOISE_1 = new GameEnum(llllllIIlI[llllllIllI[19]], llllllIIlI[llllllIllI[20]]);
            TORTOISE_2 = new GameEnum(llllllIIlI[llllllIllI[22]], llllllIIlI[llllllIllI[23]]);
            TORTOISE_3 = new GameEnum(llllllIIlI[llllllIllI[25]], llllllIIlI[llllllIllI[26]]);
            TORTOISE_4 = new GameEnum(llllllIIlI[llllllIllI[28]], llllllIIlI[llllllIllI[29]]);
            TORTOISE_5 = new GameEnum(llllllIIlI[llllllIllI[31]], llllllIIlI[llllllIllI[32]]);
            TORTOISE_6 = new GameEnum(llllllIIlI[llllllIllI[34]], llllllIIlI[llllllIllI[35]]);
            DRAGON_1 = new GameEnum(llllllIIlI[llllllIllI[37]], llllllIIlI[llllllIllI[38]]);
            DRAGON_2 = new GameEnum(llllllIIlI[llllllIllI[40]], llllllIIlI[llllllIllI[41]]);
            DRAGON_3 = new GameEnum(llllllIIlI[llllllIllI[43]], llllllIIlI[llllllIllI[44]]);
            DRAGON_4 = new GameEnum(llllllIIlI[llllllIllI[46]], llllllIIlI[llllllIllI[47]]);
            DRAGON_5 = new GameEnum(llllllIIlI[llllllIllI[49]], llllllIIlI[llllllIllI[50]]);
            DRAGON_6 = new GameEnum(llllllIIlI[llllllIllI[52]], llllllIIlI[llllllIllI[53]]);
            WYVERN_1 = new GameEnum(llllllIIlI[llllllIllI[55]], llllllIIlI[llllllIllI[56]]);
            WYVERN_2 = new GameEnum(llllllIIlI[llllllIllI[58]], llllllIIlI[llllllIllI[59]]);
            WYVERN_3 = new GameEnum(llllllIIlI[llllllIllI[61]], llllllIIlI[llllllIllI[62]]);
            WYVERN_4 = new GameEnum(llllllIIlI[llllllIllI[64]], llllllIIlI[llllllIllI[65]]);
            WYVERN_5 = new GameEnum(llllllIIlI[llllllIllI[67]], llllllIIlI[llllllIllI[68]]);
            WYVERN_6 = new GameEnum(llllllIIlI[llllllIllI[70]], llllllIIlI[llllllIllI[71]]);
            SNAIL_1 = new GameEnum(llllllIIlI[llllllIllI[73]], llllllIIlI[llllllIllI[74]]);
            SNAIL_2 = new GameEnum(llllllIIlI[llllllIllI[76]], llllllIIlI[llllllIllI[77]]);
            SNAIL_3 = new GameEnum(llllllIIlI[llllllIllI[79]], llllllIIlI[llllllIllI[80]]);
            SNAIL_4 = new GameEnum(llllllIIlI[llllllIllI[82]], llllllIIlI[llllllIllI[83]]);
            SNAIL_5 = new GameEnum(llllllIIlI[llllllIllI[85]], llllllIIlI[llllllIllI[86]]);
            SNAIL_6 = new GameEnum(llllllIIlI[llllllIllI[88]], llllllIIlI[llllllIllI[89]]);
            SNAKE_1 = new GameEnum(llllllIIlI[llllllIllI[91]], llllllIIlI[llllllIllI[92]]);
            SNAKE_2 = new GameEnum(llllllIIlI[llllllIllI[94]], llllllIIlI[llllllIllI[95]]);
            SNAKE_3 = new GameEnum(llllllIIlI[llllllIllI[97]], llllllIIlI[llllllIllI[98]]);
            SNAKE_4 = new GameEnum(llllllIIlI[llllllIllI[100]], llllllIIlI[llllllIllI[101]]);
            SNAKE_5 = new GameEnum(llllllIIlI[llllllIllI[103]], llllllIIlI[llllllIllI[104]]);
            SNAKE_6 = new GameEnum(llllllIIlI[llllllIllI[106]], llllllIIlI[llllllIllI[107]]);
            SLUG_1 = new GameEnum(llllllIIlI[llllllIllI[109]], llllllIIlI[llllllIllI[110]]);
            SLUG_2 = new GameEnum(llllllIIlI[llllllIllI[112]], llllllIIlI[llllllIllI[113]]);
            SLUG_3 = new GameEnum(llllllIIlI[llllllIllI[115]], llllllIIlI[llllllIllI[116]]);
            SLUG_4 = new GameEnum(llllllIIlI[llllllIllI[118]], llllllIIlI[llllllIllI[119]]);
            SLUG_5 = new GameEnum(llllllIIlI[llllllIllI[121]], llllllIIlI[llllllIllI[122]]);
            SLUG_6 = new GameEnum(llllllIIlI[llllllIllI[124]], llllllIIlI[llllllIllI[125]]);
            MONKEY_1 = new GameEnum(llllllIIlI[llllllIllI[127]], llllllIIlI[llllllIllI[128]]);
            MONKEY_2 = new GameEnum(llllllIIlI[llllllIllI[130]], llllllIIlI[llllllIllI[131]]);
            MONKEY_3 = new GameEnum(llllllIIlI[llllllIllI[133]], llllllIIlI[llllllIllI[134]]);
            MONKEY_4 = new GameEnum(llllllIIlI[llllllIllI[136]], llllllIIlI[llllllIllI[137]]);
            MONKEY_5 = new GameEnum(llllllIIlI[llllllIllI[139]], llllllIIlI[llllllIllI[140]]);
            MONKEY_6 = new GameEnum(llllllIIlI[llllllIllI[142]], llllllIIlI[llllllIllI[143]]);
            KALPHITE_1 = new GameEnum(llllllIIlI[llllllIllI[145]], llllllIIlI[llllllIllI[146]]);
            KALPHITE_2 = new GameEnum(llllllIIlI[llllllIllI[148]], llllllIIlI[llllllIllI[149]]);
            KALPHITE_3 = new GameEnum(llllllIIlI[llllllIllI[151]], llllllIIlI[llllllIllI[152]]);
            KALPHITE_4 = new GameEnum(llllllIIlI[llllllIllI[154]], llllllIIlI[llllllIllI[155]]);
            KALPHITE_5 = new GameEnum(llllllIIlI[llllllIllI[157]], llllllIIlI[llllllIllI[158]]);
            KALPHITE_6 = new GameEnum(llllllIIlI[llllllIllI[160]], llllllIIlI[llllllIllI[161]]);
            TERRORBIRD_1 = new GameEnum(llllllIIlI[llllllIllI[163]], llllllIIlI[llllllIllI[164]]);
            TERRORBIRD_2 = new GameEnum(llllllIIlI[llllllIllI[166]], llllllIIlI[llllllIllI[167]]);
            TERRORBIRD_3 = new GameEnum(llllllIIlI[llllllIllI[169]], llllllIIlI[llllllIllI[170]]);
            TERRORBIRD_4 = new GameEnum(llllllIIlI[llllllIllI[172]], llllllIIlI[llllllIllI[173]]);
            TERRORBIRD_5 = new GameEnum(llllllIIlI[llllllIllI[175]], llllllIIlI[llllllIllI[176]]);
            TERRORBIRD_6 = new GameEnum(llllllIIlI[llllllIllI[178]], llllllIIlI[llllllIllI[179]]);
            PENGUIN_1 = new GameEnum(llllllIIlI[llllllIllI[181]], llllllIIlI[llllllIllI[182]]);
            PENGUIN_2 = new GameEnum(llllllIIlI[llllllIllI[184]], llllllIIlI[llllllIllI[185]]);
            PENGUIN_3 = new GameEnum(llllllIIlI[llllllIllI[187]], llllllIIlI[llllllIllI[188]]);
            PENGUIN_4 = new GameEnum(llllllIIlI[llllllIllI[190]], llllllIIlI[llllllIllI[191]]);
            PENGUIN_5 = new GameEnum(llllllIIlI[llllllIllI[193]], llllllIIlI[llllllIllI[194]]);
            PENGUIN_6 = new GameEnum(llllllIIlI[llllllIllI[196]], llllllIIlI[llllllIllI[197]]);
            MOLE_1 = new GameEnum(llllllIIlI[llllllIllI[199]], llllllIIlI[llllllIllI[200]]);
            MOLE_2 = new GameEnum(llllllIIlI[llllllIllI[202]], llllllIIlI[llllllIllI[203]]);
            MOLE_3 = new GameEnum(llllllIIlI[llllllIllI[205]], llllllIIlI[llllllIllI[206]]);
            MOLE_4 = new GameEnum(llllllIIlI[llllllIllI[208]], llllllIIlI[llllllIllI[209]]);
            MOLE_5 = new GameEnum(llllllIIlI[llllllIllI[211]], llllllIIlI[llllllIllI[212]]);
            MOLE_6 = new GameEnum(llllllIIlI[llllllIllI[214]], llllllIIlI[llllllIllI[215]]);
            CAMEL_1 = new GameEnum(llllllIIlI[llllllIllI[217]], llllllIIlI[llllllIllI[218]]);
            CAMEL_2 = new GameEnum(llllllIIlI[llllllIllI[220]], llllllIIlI[llllllIllI[221]]);
            CAMEL_3 = new GameEnum(llllllIIlI[llllllIllI[223]], llllllIIlI[llllllIllI[224]]);
            CAMEL_4 = new GameEnum(llllllIIlI[llllllIllI[226]], llllllIIlI[llllllIllI[227]]);
            CAMEL_5 = new GameEnum(llllllIIlI[llllllIllI[229]], llllllIIlI[llllllIllI[230]]);
            CAMEL_6 = new GameEnum(llllllIIlI[llllllIllI[232]], llllllIIlI[llllllIllI[233]]);
            LEECH_1 = new GameEnum(llllllIIlI[llllllIllI[235]], llllllIIlI[llllllIllI[236]]);
            LEECH_2 = new GameEnum(llllllIIlI[llllllIllI[238]], llllllIIlI[llllllIllI[239]]);
            LEECH_3 = new GameEnum(llllllIIlI[llllllIllI[241]], llllllIIlI[llllllIllI[242]]);
            LEECH_4 = new GameEnum(llllllIIlI[llllllIllI[244]], llllllIIlI[llllllIllI[245]]);
            LEECH_5 = new GameEnum(llllllIIlI[llllllIllI[247]], llllllIIlI[llllllIllI[248]]);
            LEECH_6 = new GameEnum(llllllIIlI[llllllIllI[250]], llllllIIlI[llllllIllI[251]]);
            h[] hArray = new h[llllllIllI[84]];
            hArray[h.llllllIllI[0]] = LIZARD_1;
            hArray[h.llllllIllI[1]] = LIZARD_2;
            hArray[h.llllllIllI[2]] = LIZARD_3;
            hArray[h.llllllIllI[3]] = LIZARD_4;
            hArray[h.llllllIllI[4]] = LIZARD_5;
            hArray[h.llllllIllI[5]] = LIZARD_6;
            hArray[h.llllllIllI[6]] = TORTOISE_1;
            hArray[h.llllllIllI[7]] = TORTOISE_2;
            hArray[h.llllllIllI[8]] = TORTOISE_3;
            hArray[h.llllllIllI[9]] = TORTOISE_4;
            hArray[h.llllllIllI[10]] = TORTOISE_5;
            hArray[h.llllllIllI[11]] = TORTOISE_6;
            hArray[h.llllllIllI[12]] = DRAGON_1;
            hArray[h.llllllIllI[13]] = DRAGON_2;
            hArray[h.llllllIllI[14]] = DRAGON_3;
            hArray[h.llllllIllI[15]] = DRAGON_4;
            hArray[h.llllllIllI[16]] = DRAGON_5;
            hArray[h.llllllIllI[17]] = DRAGON_6;
            hArray[h.llllllIllI[18]] = WYVERN_1;
            hArray[h.llllllIllI[19]] = WYVERN_2;
            hArray[h.llllllIllI[20]] = WYVERN_3;
            hArray[h.llllllIllI[21]] = WYVERN_4;
            hArray[h.llllllIllI[22]] = WYVERN_5;
            hArray[h.llllllIllI[23]] = WYVERN_6;
            hArray[h.llllllIllI[24]] = SNAIL_1;
            hArray[h.llllllIllI[25]] = SNAIL_2;
            hArray[h.llllllIllI[26]] = SNAIL_3;
            hArray[h.llllllIllI[27]] = SNAIL_4;
            hArray[h.llllllIllI[28]] = SNAIL_5;
            hArray[h.llllllIllI[29]] = SNAIL_6;
            hArray[h.llllllIllI[30]] = SNAKE_1;
            hArray[h.llllllIllI[31]] = SNAKE_2;
            hArray[h.llllllIllI[32]] = SNAKE_3;
            hArray[h.llllllIllI[33]] = SNAKE_4;
            hArray[h.llllllIllI[34]] = SNAKE_5;
            hArray[h.llllllIllI[35]] = SNAKE_6;
            hArray[h.llllllIllI[36]] = SLUG_1;
            hArray[h.llllllIllI[37]] = SLUG_2;
            hArray[h.llllllIllI[38]] = SLUG_3;
            hArray[h.llllllIllI[39]] = SLUG_4;
            hArray[h.llllllIllI[40]] = SLUG_5;
            hArray[h.llllllIllI[41]] = SLUG_6;
            hArray[h.llllllIllI[42]] = MONKEY_1;
            hArray[h.llllllIllI[43]] = MONKEY_2;
            hArray[h.llllllIllI[44]] = MONKEY_3;
            hArray[h.llllllIllI[45]] = MONKEY_4;
            hArray[h.llllllIllI[46]] = MONKEY_5;
            hArray[h.llllllIllI[47]] = MONKEY_6;
            hArray[h.llllllIllI[48]] = KALPHITE_1;
            hArray[h.llllllIllI[49]] = KALPHITE_2;
            hArray[h.llllllIllI[50]] = KALPHITE_3;
            hArray[h.llllllIllI[51]] = KALPHITE_4;
            hArray[h.llllllIllI[52]] = KALPHITE_5;
            hArray[h.llllllIllI[53]] = KALPHITE_6;
            hArray[h.llllllIllI[54]] = TERRORBIRD_1;
            hArray[h.llllllIllI[55]] = TERRORBIRD_2;
            hArray[h.llllllIllI[56]] = TERRORBIRD_3;
            hArray[h.llllllIllI[57]] = TERRORBIRD_4;
            hArray[h.llllllIllI[58]] = TERRORBIRD_5;
            hArray[h.llllllIllI[59]] = TERRORBIRD_6;
            hArray[h.llllllIllI[60]] = PENGUIN_1;
            hArray[h.llllllIllI[61]] = PENGUIN_2;
            hArray[h.llllllIllI[62]] = PENGUIN_3;
            hArray[h.llllllIllI[63]] = PENGUIN_4;
            hArray[h.llllllIllI[64]] = PENGUIN_5;
            hArray[h.llllllIllI[65]] = PENGUIN_6;
            hArray[h.llllllIllI[66]] = MOLE_1;
            hArray[h.llllllIllI[67]] = MOLE_2;
            hArray[h.llllllIllI[68]] = MOLE_3;
            hArray[h.llllllIllI[69]] = MOLE_4;
            hArray[h.llllllIllI[70]] = MOLE_5;
            hArray[h.llllllIllI[71]] = MOLE_6;
            hArray[h.llllllIllI[72]] = CAMEL_1;
            hArray[h.llllllIllI[73]] = CAMEL_2;
            hArray[h.llllllIllI[74]] = CAMEL_3;
            hArray[h.llllllIllI[75]] = CAMEL_4;
            hArray[h.llllllIllI[76]] = CAMEL_5;
            hArray[h.llllllIllI[77]] = CAMEL_6;
            hArray[h.llllllIllI[78]] = LEECH_1;
            hArray[h.llllllIllI[79]] = LEECH_2;
            hArray[h.llllllIllI[80]] = LEECH_3;
            hArray[h.llllllIllI[81]] = LEECH_4;
            hArray[h.llllllIllI[82]] = LEECH_5;
            hArray[h.llllllIllI[83]] = LEECH_6;
            $VALUES = hArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            h[] hArray2 = h.values();
            int n2 = hArray2.length;
            int var3 = llllllIllI[0];
            while (h.llIlIlllIllII(var3, (int)var2)) {
                void var4;
                void var5;
                void var6 = var5[var3];
                var4.put((Object)var6.question, (Object)var6.answer);

                ++var3;

                if (((0x69 ^ 0x4F ^ (0x35 ^ 0x53)) & (0x93 ^ 0x84 ^ (0xCC ^ 0x9B) ^ -1)) == 0) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

    public String O() {
        return this.question;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean llIlIlllIllIl(Object object) {
        return object != null;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var7;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var8 = llllllIllI[0];
        while (h.llIlIlllIllII(var8, (int)var7)) {
            void var9;
            void var10;
            void var11 = var10[var8];
            Widget var12 = Widgets.get((WidgetInfo)var11);
            if (h.llIlIlllIllIl(var12) && h.llIlIlllIlllI(var12.getText().equals(var9) ? 1 : 0)) {
                return var12;
            }
            ++var8;

            if (((174 + 28 - 78 + 54 ^ 90 + 36 - 117 + 140) & (0x52 ^ 0x30 ^ (0xDC ^ 0x99) ^ -1)) >= -1) continue;
            return null;
        }
        return null;
    }

    private static void llIlIlllIlIlI() {
        llllllIIlI = new String[llllllIllI[252]];
        h.llllllIIlI[h.llllllIllI[0]] = "LIZARD_1";
        h.llllllIIlI[h.llllllIllI[1]] = "How does a lizard regulate body heat?";
        h.llllllIIlI[h.llllllIllI[2]] = "Sunlight.";
        h.llllllIIlI[h.llllllIllI[3]] = "LIZARD_2";
        h.llllllIIlI[h.llllllIllI[4]] = "Who discovered how to kill lizards?";
        h.llllllIIlI[h.llllllIllI[5]] = "The Slayer Masters.";
        h.llllllIIlI[h.llllllIllI[6]] = "LIZARD_3";
        h.llllllIIlI[h.llllllIllI[7]] = "How many eyes does a lizard have?";
        h.llllllIIlI[h.llllllIllI[8]] = "Three.";
        h.llllllIIlI[h.llllllIllI[9]] = "LIZARD_4";
        h.llllllIIlI[h.llllllIllI[10]] = "What order do lizards belong to?";
        h.llllllIIlI[h.llllllIllI[11]] = "Squamata.";
        h.llllllIIlI[h.llllllIllI[12]] = "LIZARD_5";
        h.llllllIIlI[h.llllllIllI[13]] = "What happens when a lizard becomes cold?";
        h.llllllIIlI[h.llllllIllI[14]] = "It becomes sleepy.";
        h.llllllIIlI[h.llllllIllI[15]] = "LIZARD_6";
        h.llllllIIlI[h.llllllIllI[16]] = "Lizard skin is made of the same substance as?";
        h.llllllIIlI[h.llllllIllI[17]] = "Hair.";
        h.llllllIIlI[h.llllllIllI[18]] = "TORTOISE_1";
        h.llllllIIlI[h.llllllIllI[19]] = "What is the name of the oldest tortoise ever recorded?";
        h.llllllIIlI[h.llllllIllI[20]] = "Mibbiwocket.";
        h.llllllIIlI[h.llllllIllI[21]] = "TORTOISE_2";
        h.llllllIIlI[h.llllllIllI[22]] = "What is a tortoise's favourite food?";
        h.llllllIIlI[h.llllllIllI[23]] = "Vegetables.";
        h.llllllIIlI[h.llllllIllI[24]] = "TORTOISE_3";
        h.llllllIIlI[h.llllllIllI[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        h.llllllIIlI[h.llllllIllI[26]] = "Admiral Bake.";
        h.llllllIIlI[h.llllllIllI[27]] = "TORTOISE_4";
        h.llllllIIlI[h.llllllIllI[28]] = "How does the tortoise protect itself?";
        h.llllllIIlI[h.llllllIllI[29]] = "Hard shell.";
        h.llllllIIlI[h.llllllIllI[30]] = "TORTOISE_5";
        h.llllllIIlI[h.llllllIllI[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        h.llllllIIlI[h.llllllIllI[32]] = "Twenty years.";
        h.llllllIIlI[h.llllllIllI[33]] = "TORTOISE_6";
        h.llllllIIlI[h.llllllIllI[34]] = "Which race breeds tortoises for battle?";
        h.llllllIIlI[h.llllllIllI[35]] = "Gnomes.";
        h.llllllIIlI[h.llllllIllI[36]] = "DRAGON_1";
        h.llllllIIlI[h.llllllIllI[37]] = "What is considered a delicacy by dragons?";
        h.llllllIIlI[h.llllllIllI[38]] = "Runite.";
        h.llllllIIlI[h.llllllIllI[39]] = "DRAGON_2";
        h.llllllIIlI[h.llllllIllI[40]] = "What is the best defence against a dragon's attack?";
        h.llllllIIlI[h.llllllIllI[41]] = "Anti dragon-breath shield.";
        h.llllllIIlI[h.llllllIllI[42]] = "DRAGON_3";
        h.llllllIIlI[h.llllllIllI[43]] = "How long do dragons live?";
        h.llllllIIlI[h.llllllIllI[44]] = "Unknown.";
        h.llllllIIlI[h.llllllIllI[45]] = "DRAGON_4";
        h.llllllIIlI[h.llllllIllI[46]] = "Which of these is not a type of dragon?";
        h.llllllIIlI[h.llllllIllI[47]] = "Elemental.";
        h.llllllIIlI[h.llllllIllI[48]] = "DRAGON_5";
        h.llllllIIlI[h.llllllIllI[49]] = "What is the favoured territory of a dragon?";
        h.llllllIIlI[h.llllllIllI[50]] = "Old battle sites.";
        h.llllllIIlI[h.llllllIllI[51]] = "DRAGON_6";
        h.llllllIIlI[h.llllllIllI[52]] = "Approximately how many feet tall do dragons stand?";
        h.llllllIIlI[h.llllllIllI[53]] = "Twelve.";
        h.llllllIIlI[h.llllllIllI[54]] = "WYVERN_1";
        h.llllllIIlI[h.llllllIllI[55]] = "How did the wyverns die out?";
        h.llllllIIlI[h.llllllIllI[56]] = "Climate change.";
        h.llllllIIlI[h.llllllIllI[57]] = "WYVERN_2";
        h.llllllIIlI[h.llllllIllI[58]] = "How many legs does a wyvern have?";
        h.llllllIIlI[h.llllllIllI[59]] = "Two.";
        h.llllllIIlI[h.llllllIllI[60]] = "WYVERN_3";
        h.llllllIIlI[h.llllllIllI[61]] = "Where have wyvern bones been found?";
        h.llllllIIlI[h.llllllIllI[62]] = "Asgarnia.";
        h.llllllIIlI[h.llllllIllI[63]] = "WYVERN_4";
        h.llllllIIlI[h.llllllIllI[64]] = "Which genus does the wyvern theoretically belong to?";
        h.llllllIIlI[h.llllllIllI[65]] = "Reptiles.";
        h.llllllIIlI[h.llllllIllI[66]] = "WYVERN_5";
        h.llllllIIlI[h.llllllIllI[67]] = "What are the wyverns' closest relations?";
        h.llllllIIlI[h.llllllIllI[68]] = "Dragons.";
        h.llllllIIlI[h.llllllIllI[69]] = "WYVERN_6";
        h.llllllIIlI[h.llllllIllI[70]] = "What is the ambient temperature of wyvern bones?";
        h.llllllIIlI[h.llllllIllI[71]] = "Below room temperature.";
        h.llllllIIlI[h.llllllIllI[72]] = "SNAIL_1";
        h.llllllIIlI[h.llllllIllI[73]] = "What is special about the shell of the giant Morytanian snail?";
        h.llllllIIlI[h.llllllIllI[74]] = "It is resistant to acid.";
        h.llllllIIlI[h.llllllIllI[75]] = "SNAIL_2";
        h.llllllIIlI[h.llllllIllI[76]] = "How do Morytanian snails capture their prey?";
        h.llllllIIlI[h.llllllIllI[77]] = "Spitting acid.";
        h.llllllIIlI[h.llllllIllI[78]] = "SNAIL_3";
        h.llllllIIlI[h.llllllIllI[79]] = "Which of these is a snail byproduct?";
        h.llllllIIlI[h.llllllIllI[80]] = "Fireproof oil.";
        h.llllllIIlI[h.llllllIllI[81]] = "SNAIL_4";
        h.llllllIIlI[h.llllllIllI[82]] = "What does 'Achatina Acidia' mean?";
        h.llllllIIlI[h.llllllIllI[83]] = "Acid-spitting snail.";
        h.llllllIIlI[h.llllllIllI[84]] = "SNAIL_5";
        h.llllllIIlI[h.llllllIllI[85]] = "How do snails move?";
        h.llllllIIlI[h.llllllIllI[86]] = "Contracting and stretching.";
        h.llllllIIlI[h.llllllIllI[87]] = "SNAIL_6";
        h.llllllIIlI[h.llllllIllI[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        h.llllllIIlI[h.llllllIllI[89]] = "An operculum.";
        h.llllllIIlI[h.llllllIllI[90]] = "SNAKE_1";
        h.llllllIIlI[h.llllllIllI[91]] = "What is snake venom adapted from?";
        h.llllllIIlI[h.llllllIllI[92]] = "Stomach acid.";
        h.llllllIIlI[h.llllllIllI[93]] = "SNAKE_2";
        h.llllllIIlI[h.llllllIllI[94]] = "Aside from their noses, what do snakes use to smell?";
        h.llllllIIlI[h.llllllIllI[95]] = "Tongue.";
        h.llllllIIlI[h.llllllIllI[96]] = "SNAKE_3";
        h.llllllIIlI[h.llllllIllI[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        h.llllllIIlI[h.llllllIllI[98]] = "Seeing how you smell.";
        h.llllllIIlI[h.llllllIllI[99]] = "SNAKE_4";
        h.llllllIIlI[h.llllllIllI[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        h.llllllIIlI[h.llllllIllI[101]] = "Constriction.";
        h.llllllIIlI[h.llllllIllI[102]] = "SNAKE_5";
        h.llllllIIlI[h.llllllIllI[103]] = "Lizards and snakes belong to the same order - what is it?";
        h.llllllIIlI[h.llllllIllI[104]] = "Squamata.";
        h.llllllIIlI[h.llllllIllI[105]] = "SNAKE_6";
        h.llllllIIlI[h.llllllIllI[106]] = "Which habitat do snakes prefer?";
        h.llllllIIlI[h.llllllIllI[107]] = "Anywhere.";
        h.llllllIIlI[h.llllllIllI[108]] = "SLUG_1";
        h.llllllIIlI[h.llllllIllI[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        h.llllllIIlI[h.llllllIllI[110]] = "Nematocysts.";
        h.llllllIIlI[h.llllllIllI[111]] = "SLUG_2";
        h.llllllIIlI[h.llllllIllI[112]] = "Why has the museum never examined a live sea slug?";
        h.llllllIIlI[h.llllllIllI[113]] = "The researchers keep vanishing.";
        h.llllllIIlI[h.llllllIllI[114]] = "SLUG_3";
        h.llllllIIlI[h.llllllIllI[115]] = "What do we think the sea slug feeds upon?";
        h.llllllIIlI[h.llllllIllI[116]] = "Seaweed.";
        h.llllllIIlI[h.llllllIllI[117]] = "SLUG_4";
        h.llllllIIlI[h.llllllIllI[118]] = "What are the two fangs presumed to be used for?";
        h.llllllIIlI[h.llllllIllI[119]] = "Defense or display.";
        h.llllllIIlI[h.llllllIllI[120]] = "SLUG_5";
        h.llllllIIlI[h.llllllIllI[121]] = "Off of which coastline would you find sea slugs?";
        h.llllllIIlI[h.llllllIllI[122]] = "Ardougne.";
        h.llllllIIlI[h.llllllIllI[123]] = "SLUG_6";
        h.llllllIIlI[h.llllllIllI[124]] = "In what way are sea slugs similar to snails?";
        h.llllllIIlI[h.llllllIllI[125]] = "They have a hard shell.";
        h.llllllIIlI[h.llllllIllI[126]] = "MONKEY_1";
        h.llllllIIlI[h.llllllIllI[127]] = "Which type of primates do monkeys belong to?";
        h.llllllIIlI[h.llllllIllI[128]] = "Simian.";
        h.llllllIIlI[h.llllllIllI[129]] = "MONKEY_2";
        h.llllllIIlI[h.llllllIllI[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        h.llllllIIlI[h.llllllIllI[131]] = "Harmless.";
        h.llllllIIlI[h.llllllIllI[132]] = "MONKEY_3";
        h.llllllIIlI[h.llllllIllI[133]] = "Monkeys love bananas. What else do they like to eat?";
        h.llllllIIlI[h.llllllIllI[134]] = "Bitternuts.";
        h.llllllIIlI[h.llllllIllI[135]] = "MONKEY_4";
        h.llllllIIlI[h.llllllIllI[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        h.llllllIIlI[h.llllllIllI[137]] = "Harmless.";
        h.llllllIIlI[h.llllllIllI[138]] = "MONKEY_5";
        h.llllllIIlI[h.llllllIllI[139]] = "What colour mohawk do Karamjan monkeys have?";
        h.llllllIIlI[h.llllllIllI[140]] = "Red.";
        h.llllllIIlI[h.llllllIllI[141]] = "MONKEY_6";
        h.llllllIIlI[h.llllllIllI[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        h.llllllIIlI[h.llllllIllI[143]] = "Seaweed.";
        h.llllllIIlI[h.llllllIllI[144]] = "KALPHITE_1";
        h.llllllIIlI[h.llllllIllI[145]] = "Kalphites are ruled by a...?";
        h.llllllIIlI[h.llllllIllI[146]] = "Pasha.";
        h.llllllIIlI[h.llllllIllI[147]] = "KALPHITE_2";
        h.llllllIIlI[h.llllllIllI[148]] = "What is the lowest caste in kalphite society?";
        h.llllllIIlI[h.llllllIllI[149]] = "Worker.";
        h.llllllIIlI[h.llllllIllI[150]] = "KALPHITE_3";
        h.llllllIIlI[h.llllllIllI[151]] = "What are the armoured plates on a kalphite called?";
        h.llllllIIlI[h.llllllIllI[152]] = "Lamellae.";
        h.llllllIIlI[h.llllllIllI[153]] = "KALPHITE_4";
        h.llllllIIlI[h.llllllIllI[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        h.llllllIIlI[h.llllllIllI[155]] = "Carnivores.";
        h.llllllIIlI[h.llllllIllI[156]] = "KALPHITE_5";
        h.llllllIIlI[h.llllllIllI[157]] = "What are kalphites assumed to have evolved from?";
        h.llllllIIlI[h.llllllIllI[158]] = "Scarab beetles.";
        h.llllllIIlI[h.llllllIllI[159]] = "KALPHITE_6";
        h.llllllIIlI[h.llllllIllI[160]] = "Name the prominent figure in kalphite mythology?";
        h.llllllIIlI[h.llllllIllI[161]] = "Scabaras.";
        h.llllllIIlI[h.llllllIllI[162]] = "TERRORBIRD_1";
        h.llllllIIlI[h.llllllIllI[163]] = "What is a terrorbird's preferred food?";
        h.llllllIIlI[h.llllllIllI[164]] = "Anything.";
        h.llllllIIlI[h.llllllIllI[165]] = "TERRORBIRD_2";
        h.llllllIIlI[h.llllllIllI[166]] = "Who use terrorbirds as mounts?";
        h.llllllIIlI[h.llllllIllI[167]] = "Gnomes.";
        h.llllllIIlI[h.llllllIllI[168]] = "TERRORBIRD_3";
        h.llllllIIlI[h.llllllIllI[169]] = "Where do terrorbirds get most of their water?";
        h.llllllIIlI[h.llllllIllI[170]] = "Eating plants.";
        h.llllllIIlI[h.llllllIllI[171]] = "TERRORBIRD_4";
        h.llllllIIlI[h.llllllIllI[172]] = "How many claws do terrorbirds have?";
        h.llllllIIlI[h.llllllIllI[173]] = "Four.";
        h.llllllIIlI[h.llllllIllI[174]] = "TERRORBIRD_5";
        h.llllllIIlI[h.llllllIllI[175]] = "What do terrorbirds eat to aid digestion?";
        h.llllllIIlI[h.llllllIllI[176]] = "Stones.";
        h.llllllIIlI[h.llllllIllI[177]] = "TERRORBIRD_6";
        h.llllllIIlI[h.llllllIllI[178]] = "How many teeth do terrorbirds have?";
        h.llllllIIlI[h.llllllIllI[179]] = "0.";
        h.llllllIIlI[h.llllllIllI[180]] = "PENGUIN_1";
        h.llllllIIlI[h.llllllIllI[181]] = "Which sense do penguins rely on when hunting?";
        h.llllllIIlI[h.llllllIllI[182]] = "Sight.";
        h.llllllIIlI[h.llllllIllI[183]] = "PENGUIN_2";
        h.llllllIIlI[h.llllllIllI[184]] = "Which skill seems unusual for the penguins to possess?";
        h.llllllIIlI[h.llllllIllI[185]] = "Planning.";
        h.llllllIIlI[h.llllllIllI[186]] = "PENGUIN_3";
        h.llllllIIlI[h.llllllIllI[187]] = "How do penguins keep warm?";
        h.llllllIIlI[h.llllllIllI[188]] = "A layer of fat.";
        h.llllllIIlI[h.llllllIllI[189]] = "PENGUIN_4";
        h.llllllIIlI[h.llllllIllI[190]] = "What is the preferred climate for penguins?";
        h.llllllIIlI[h.llllllIllI[191]] = "Cold.";
        h.llllllIIlI[h.llllllIllI[192]] = "PENGUIN_5";
        h.llllllIIlI[h.llllllIllI[193]] = "Describe the behaviour of penguins?";
        h.llllllIIlI[h.llllllIllI[194]] = "Social.";
        h.llllllIIlI[h.llllllIllI[195]] = "PENGUIN_6";
        h.llllllIIlI[h.llllllIllI[196]] = "When do penguins fast?";
        h.llllllIIlI[h.llllllIllI[197]] = "During breeding.";
        h.llllllIIlI[h.llllllIllI[198]] = "MOLE_1";
        h.llllllIIlI[h.llllllIllI[199]] = "What habitat do moles prefer?";
        h.llllllIIlI[h.llllllIllI[200]] = "Subterranean.";
        h.llllllIIlI[h.llllllIllI[201]] = "MOLE_2";
        h.llllllIIlI[h.llllllIllI[202]] = "Why are moles considered to be an agricultural pest?";
        h.llllllIIlI[h.llllllIllI[203]] = "They dig holes.";
        h.llllllIIlI[h.llllllIllI[204]] = "MOLE_3";
        h.llllllIIlI[h.llllllIllI[205]] = "Who discovered giant moles?";
        h.llllllIIlI[h.llllllIllI[206]] = "Wyson the Gardener.";
        h.llllllIIlI[h.llllllIllI[207]] = "MOLE_4";
        h.llllllIIlI[h.llllllIllI[208]] = "What would you call a group of young moles?";
        h.llllllIIlI[h.llllllIllI[209]] = "A labour.";
        h.llllllIIlI[h.llllllIllI[210]] = "MOLE_5";
        h.llllllIIlI[h.llllllIllI[211]] = "What is a mole's favourite food?";
        h.llllllIIlI[h.llllllIllI[212]] = "Insects and other invertebrates.";
        h.llllllIIlI[h.llllllIllI[213]] = "MOLE_6";
        h.llllllIIlI[h.llllllIllI[214]] = "Which family do moles belong to?";
        h.llllllIIlI[h.llllllIllI[215]] = "The Talpidae family.";
        h.llllllIIlI[h.llllllIllI[216]] = "CAMEL_1";
        h.llllllIIlI[h.llllllIllI[217]] = "What is produced by feeding chilli to a camel?";
        h.llllllIIlI[h.llllllIllI[218]] = "Toxic dung.";
        h.llllllIIlI[h.llllllIllI[219]] = "CAMEL_2";
        h.llllllIIlI[h.llllllIllI[220]] = "If an ugthanki has one, how many does a bactrian have?";
        h.llllllIIlI[h.llllllIllI[221]] = "Two.";
        h.llllllIIlI[h.llllllIllI[222]] = "CAMEL_3";
        h.llllllIIlI[h.llllllIllI[223]] = "Camels: herbivore, carnivore or omnivore?";
        h.llllllIIlI[h.llllllIllI[224]] = "Omnivore.";
        h.llllllIIlI[h.llllllIllI[225]] = "CAMEL_4";
        h.llllllIIlI[h.llllllIllI[226]] = "What is the usual mood for a camel?";
        h.llllllIIlI[h.llllllIllI[227]] = "Annoyed.";
        h.llllllIIlI[h.llllllIllI[228]] = "CAMEL_5";
        h.llllllIIlI[h.llllllIllI[229]] = "Where would you find an ugthanki?";
        h.llllllIIlI[h.llllllIllI[230]] = "Al Kharid.";
        h.llllllIIlI[h.llllllIllI[231]] = "CAMEL_6";
        h.llllllIIlI[h.llllllIllI[232]] = "Which camel byproduct is known to be very nutritious?";
        h.llllllIIlI[h.llllllIllI[233]] = "Milk.";
        h.llllllIIlI[h.llllllIllI[234]] = "LEECH_1";
        h.llllllIIlI[h.llllllIllI[235]] = "What is the favoured habitat of leeches?";
        h.llllllIIlI[h.llllllIllI[236]] = "Water.";
        h.llllllIIlI[h.llllllIllI[237]] = "LEECH_2";
        h.llllllIIlI[h.llllllIllI[238]] = "What shape is the inside of a leech's mouth?";
        h.llllllIIlI[h.llllllIllI[239]] = "'Y'-shaped.";
        h.llllllIIlI[h.llllllIllI[240]] = "LEECH_3";
        h.llllllIIlI[h.llllllIllI[241]] = "Which of these is not eaten by leeches?";
        h.llllllIIlI[h.llllllIllI[242]] = "Apples.";
        h.llllllIIlI[h.llllllIllI[243]] = "LEECH_4";
        h.llllllIIlI[h.llllllIllI[244]] = "What contributed to the giant growth of Morytanian leeches?";
        h.llllllIIlI[h.llllllIllI[245]] = "Environment.";
        h.llllllIIlI[h.llllllIllI[246]] = "LEECH_5";
        h.llllllIIlI[h.llllllIllI[247]] = "What is special about Morytanian leeches?";
        h.llllllIIlI[h.llllllIllI[248]] = "They attack by jumping.";
        h.llllllIIlI[h.llllllIllI[249]] = "LEECH_6";
        h.llllllIIlI[h.llllllIllI[250]] = "How does a leech change when it feeds?";
        h.llllllIIlI[h.llllllIllI[251]] = "It doubles in size.";
    }
}

