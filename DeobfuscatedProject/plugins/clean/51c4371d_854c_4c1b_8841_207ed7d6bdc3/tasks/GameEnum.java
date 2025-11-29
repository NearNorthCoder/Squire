/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

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
    public static final  /* enum */ h KALPHITE_3;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ h CAMEL_1;
    public static final  /* enum */ h WYVERN_3;
    public static final  /* enum */ h TERRORBIRD_6;
    public static final  /* enum */ h LEECH_1;
    public static final  /* enum */ h DRAGON_4;
    public static final  /* enum */ h LIZARD_1;
    public static final  /* enum */ h SLUG_6;
    public static final  /* enum */ h DRAGON_6;
    public static final  /* enum */ h CAMEL_3;
    public static final  /* enum */ h MONKEY_6;
    public static final  /* enum */ h MONKEY_1;
    public static final  /* enum */ h SLUG_1;
    public static final  /* enum */ h TERRORBIRD_2;
    public static final  /* enum */ h KALPHITE_4;
    public static final  /* enum */ h LEECH_3;
    public static final  /* enum */ h LEECH_6;
    public static final  /* enum */ h SLUG_5;
    public static final  /* enum */ h CAMEL_2;
    public static final  /* enum */ h CAMEL_4;
    public static final  /* enum */ h SNAIL_3;
    public static final  /* enum */ h PENGUIN_1;
    public static final  /* enum */ h LIZARD_4;
    public static final  /* enum */ h TORTOISE_6;
    public static final  /* enum */ h TORTOISE_5;
    public static final  /* enum */ h MOLE_3;
    public static final  /* enum */ h MONKEY_5;
    public static final  /* enum */ h LIZARD_3;
    public static final  /* enum */ h SNAKE_3;
    public static final  /* enum */ h PENGUIN_5;
    public static final  /* enum */ h MONKEY_4;
    public static final  /* enum */ h MOLE_4;
    private final  String question;
    public static final  /* enum */ h CAMEL_5;
    public static final  /* enum */ h MONKEY_2;
    public static final  /* enum */ h KALPHITE_6;
    public static final  /* enum */ h DRAGON_2;
    
    public static final  /* enum */ h SNAIL_5;
    public static final  /* enum */ h SNAIL_1;
    public static final  /* enum */ h LIZARD_6;
    public static final  /* enum */ h WYVERN_5;
    public static final  /* enum */ h SNAIL_6;
    public static final  /* enum */ h MONKEY_3;
    public static final  /* enum */ h TORTOISE_1;
    public static final  /* enum */ h WYVERN_4;
    public static final  /* enum */ h MOLE_5;
    public static final  /* enum */ h KALPHITE_2;
    public static final  /* enum */ h MOLE_1;
    public static final  /* enum */ h MOLE_6;
    public static final  /* enum */ h PENGUIN_3;
    public static final  /* enum */ h TERRORBIRD_5;
    public static final  /* enum */ h SNAKE_6;
    public static final  /* enum */ h KALPHITE_5;
    public static final  /* enum */ h WYVERN_6;
    public static final  /* enum */ h SLUG_2;
    public static final  /* enum */ h TORTOISE_4;
    public static final  /* enum */ h PENGUIN_2;
    public static final  /* enum */ h LEECH_2;
    public static final  /* enum */ h TERRORBIRD_3;
    public static final  /* enum */ h SLUG_4;
    public static final  /* enum */ h SNAKE_4;
    public static final  /* enum */ h TERRORBIRD_4;
    public static final  /* enum */ h LIZARD_2;
    public static final  /* enum */ h DRAGON_3;
    public static final  /* enum */ h SNAIL_4;
    public static final  /* enum */ h DRAGON_5;
    public static final  /* enum */ h SNAKE_5;
    public static final  /* enum */ h TORTOISE_2;
    public static final  /* enum */ h SNAKE_2;
    public static final  /* enum */ h SNAKE_1;
    public static final  /* enum */ h LIZARD_5;
    public static final  /* enum */ h CAMEL_6;
    public static final  /* enum */ h TORTOISE_3;
    private static final  h[] $VALUES;
    public static final  /* enum */ h PENGUIN_6;
    public static final  /* enum */ h PENGUIN_4;
    public static final  /* enum */ h DRAGON_1;
    public static final  /* enum */ h WYVERN_1;
    public static final  /* enum */ h TERRORBIRD_1;
    public static final  /* enum */ h SNAIL_2;
    public static final  /* enum */ h LEECH_4;
    public static final  /* enum */ h LEECH_5;
    public static final  /* enum */ h SLUG_3;
    public static final  /* enum */ h MOLE_2;
    private final  String answer;
    
    public static final  /* enum */ h KALPHITE_1;
    public static final  /* enum */ h WYVERN_2;

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void lIIlIlllIllIlII;
            h.llIlIIlllll();
            h.llIlIIlIIlI();
            LIZARD_1 = new GameEnum(lllllIII[lllllllI[1]], lllllIII[lllllllI[2]]);
            LIZARD_2 = new GameEnum(lllllIII[lllllllI[4]], lllllIII[lllllllI[5]]);
            LIZARD_3 = new GameEnum(lllllIII[lllllllI[7]], lllllIII[lllllllI[8]]);
            LIZARD_4 = new GameEnum(lllllIII[lllllllI[10]], lllllIII[lllllllI[11]]);
            LIZARD_5 = new GameEnum(lllllIII[lllllllI[13]], lllllIII[lllllllI[14]]);
            LIZARD_6 = new GameEnum(lllllIII[lllllllI[16]], lllllIII[lllllllI[17]]);
            TORTOISE_1 = new GameEnum(lllllIII[lllllllI[19]], lllllIII[lllllllI[20]]);
            TORTOISE_2 = new GameEnum(lllllIII[lllllllI[22]], lllllIII[lllllllI[23]]);
            TORTOISE_3 = new GameEnum(lllllIII[lllllllI[25]], lllllIII[lllllllI[26]]);
            TORTOISE_4 = new GameEnum(lllllIII[lllllllI[28]], lllllIII[lllllllI[29]]);
            TORTOISE_5 = new GameEnum(lllllIII[lllllllI[31]], lllllIII[lllllllI[32]]);
            TORTOISE_6 = new GameEnum(lllllIII[lllllllI[34]], lllllIII[lllllllI[35]]);
            DRAGON_1 = new GameEnum(lllllIII[lllllllI[37]], lllllIII[lllllllI[38]]);
            DRAGON_2 = new GameEnum(lllllIII[lllllllI[40]], lllllIII[lllllllI[41]]);
            DRAGON_3 = new GameEnum(lllllIII[lllllllI[43]], lllllIII[lllllllI[44]]);
            DRAGON_4 = new GameEnum(lllllIII[lllllllI[46]], lllllIII[lllllllI[47]]);
            DRAGON_5 = new GameEnum(lllllIII[lllllllI[49]], lllllIII[lllllllI[50]]);
            DRAGON_6 = new GameEnum(lllllIII[lllllllI[52]], lllllIII[lllllllI[53]]);
            WYVERN_1 = new GameEnum(lllllIII[lllllllI[55]], lllllIII[lllllllI[56]]);
            WYVERN_2 = new GameEnum(lllllIII[lllllllI[58]], lllllIII[lllllllI[59]]);
            WYVERN_3 = new GameEnum(lllllIII[lllllllI[61]], lllllIII[lllllllI[62]]);
            WYVERN_4 = new GameEnum(lllllIII[lllllllI[64]], lllllIII[lllllllI[65]]);
            WYVERN_5 = new GameEnum(lllllIII[lllllllI[67]], lllllIII[lllllllI[68]]);
            WYVERN_6 = new GameEnum(lllllIII[lllllllI[70]], lllllIII[lllllllI[71]]);
            SNAIL_1 = new GameEnum(lllllIII[lllllllI[73]], lllllIII[lllllllI[74]]);
            SNAIL_2 = new GameEnum(lllllIII[lllllllI[76]], lllllIII[lllllllI[77]]);
            SNAIL_3 = new GameEnum(lllllIII[lllllllI[79]], lllllIII[lllllllI[80]]);
            SNAIL_4 = new GameEnum(lllllIII[lllllllI[82]], lllllIII[lllllllI[83]]);
            SNAIL_5 = new GameEnum(lllllIII[lllllllI[85]], lllllIII[lllllllI[86]]);
            SNAIL_6 = new GameEnum(lllllIII[lllllllI[88]], lllllIII[lllllllI[89]]);
            SNAKE_1 = new GameEnum(lllllIII[lllllllI[91]], lllllIII[lllllllI[92]]);
            SNAKE_2 = new GameEnum(lllllIII[lllllllI[94]], lllllIII[lllllllI[95]]);
            SNAKE_3 = new GameEnum(lllllIII[lllllllI[97]], lllllIII[lllllllI[98]]);
            SNAKE_4 = new GameEnum(lllllIII[lllllllI[100]], lllllIII[lllllllI[101]]);
            SNAKE_5 = new GameEnum(lllllIII[lllllllI[103]], lllllIII[lllllllI[104]]);
            SNAKE_6 = new GameEnum(lllllIII[lllllllI[106]], lllllIII[lllllllI[107]]);
            SLUG_1 = new GameEnum(lllllIII[lllllllI[109]], lllllIII[lllllllI[110]]);
            SLUG_2 = new GameEnum(lllllIII[lllllllI[112]], lllllIII[lllllllI[113]]);
            SLUG_3 = new GameEnum(lllllIII[lllllllI[115]], lllllIII[lllllllI[116]]);
            SLUG_4 = new GameEnum(lllllIII[lllllllI[118]], lllllIII[lllllllI[119]]);
            SLUG_5 = new GameEnum(lllllIII[lllllllI[121]], lllllIII[lllllllI[122]]);
            SLUG_6 = new GameEnum(lllllIII[lllllllI[124]], lllllIII[lllllllI[125]]);
            MONKEY_1 = new GameEnum(lllllIII[lllllllI[127]], lllllIII[lllllllI[128]]);
            MONKEY_2 = new GameEnum(lllllIII[lllllllI[130]], lllllIII[lllllllI[131]]);
            MONKEY_3 = new GameEnum(lllllIII[lllllllI[133]], lllllIII[lllllllI[134]]);
            MONKEY_4 = new GameEnum(lllllIII[lllllllI[136]], lllllIII[lllllllI[137]]);
            MONKEY_5 = new GameEnum(lllllIII[lllllllI[139]], lllllIII[lllllllI[140]]);
            MONKEY_6 = new GameEnum(lllllIII[lllllllI[142]], lllllIII[lllllllI[143]]);
            KALPHITE_1 = new GameEnum(lllllIII[lllllllI[145]], lllllIII[lllllllI[146]]);
            KALPHITE_2 = new GameEnum(lllllIII[lllllllI[148]], lllllIII[lllllllI[149]]);
            KALPHITE_3 = new GameEnum(lllllIII[lllllllI[151]], lllllIII[lllllllI[152]]);
            KALPHITE_4 = new GameEnum(lllllIII[lllllllI[154]], lllllIII[lllllllI[155]]);
            KALPHITE_5 = new GameEnum(lllllIII[lllllllI[157]], lllllIII[lllllllI[158]]);
            KALPHITE_6 = new GameEnum(lllllIII[lllllllI[160]], lllllIII[lllllllI[161]]);
            TERRORBIRD_1 = new GameEnum(lllllIII[lllllllI[163]], lllllIII[lllllllI[164]]);
            TERRORBIRD_2 = new GameEnum(lllllIII[lllllllI[166]], lllllIII[lllllllI[167]]);
            TERRORBIRD_3 = new GameEnum(lllllIII[lllllllI[169]], lllllIII[lllllllI[170]]);
            TERRORBIRD_4 = new GameEnum(lllllIII[lllllllI[172]], lllllIII[lllllllI[173]]);
            TERRORBIRD_5 = new GameEnum(lllllIII[lllllllI[175]], lllllIII[lllllllI[176]]);
            TERRORBIRD_6 = new GameEnum(lllllIII[lllllllI[178]], lllllIII[lllllllI[179]]);
            PENGUIN_1 = new GameEnum(lllllIII[lllllllI[181]], lllllIII[lllllllI[182]]);
            PENGUIN_2 = new GameEnum(lllllIII[lllllllI[184]], lllllIII[lllllllI[185]]);
            PENGUIN_3 = new GameEnum(lllllIII[lllllllI[187]], lllllIII[lllllllI[188]]);
            PENGUIN_4 = new GameEnum(lllllIII[lllllllI[190]], lllllIII[lllllllI[191]]);
            PENGUIN_5 = new GameEnum(lllllIII[lllllllI[193]], lllllIII[lllllllI[194]]);
            PENGUIN_6 = new GameEnum(lllllIII[lllllllI[196]], lllllIII[lllllllI[197]]);
            MOLE_1 = new GameEnum(lllllIII[lllllllI[199]], lllllIII[lllllllI[200]]);
            MOLE_2 = new GameEnum(lllllIII[lllllllI[202]], lllllIII[lllllllI[203]]);
            MOLE_3 = new GameEnum(lllllIII[lllllllI[205]], lllllIII[lllllllI[206]]);
            MOLE_4 = new GameEnum(lllllIII[lllllllI[208]], lllllIII[lllllllI[209]]);
            MOLE_5 = new GameEnum(lllllIII[lllllllI[211]], lllllIII[lllllllI[212]]);
            MOLE_6 = new GameEnum(lllllIII[lllllllI[214]], lllllIII[lllllllI[215]]);
            CAMEL_1 = new GameEnum(lllllIII[lllllllI[217]], lllllIII[lllllllI[218]]);
            CAMEL_2 = new GameEnum(lllllIII[lllllllI[220]], lllllIII[lllllllI[221]]);
            CAMEL_3 = new GameEnum(lllllIII[lllllllI[223]], lllllIII[lllllllI[224]]);
            CAMEL_4 = new GameEnum(lllllIII[lllllllI[226]], lllllIII[lllllllI[227]]);
            CAMEL_5 = new GameEnum(lllllIII[lllllllI[229]], lllllIII[lllllllI[230]]);
            CAMEL_6 = new GameEnum(lllllIII[lllllllI[232]], lllllIII[lllllllI[233]]);
            LEECH_1 = new GameEnum(lllllIII[lllllllI[235]], lllllIII[lllllllI[236]]);
            LEECH_2 = new GameEnum(lllllIII[lllllllI[238]], lllllIII[lllllllI[239]]);
            LEECH_3 = new GameEnum(lllllIII[lllllllI[241]], lllllIII[lllllllI[242]]);
            LEECH_4 = new GameEnum(lllllIII[lllllllI[244]], lllllIII[lllllllI[245]]);
            LEECH_5 = new GameEnum(lllllIII[lllllllI[247]], lllllIII[lllllllI[248]]);
            LEECH_6 = new GameEnum(lllllIII[lllllllI[250]], lllllIII[lllllllI[251]]);
            h[] hArray = new h[lllllllI[84]];
            hArray[h.lllllllI[0]] = LIZARD_1;
            hArray[h.lllllllI[1]] = LIZARD_2;
            hArray[h.lllllllI[2]] = LIZARD_3;
            hArray[h.lllllllI[3]] = LIZARD_4;
            hArray[h.lllllllI[4]] = LIZARD_5;
            hArray[h.lllllllI[5]] = LIZARD_6;
            hArray[h.lllllllI[6]] = TORTOISE_1;
            hArray[h.lllllllI[7]] = TORTOISE_2;
            hArray[h.lllllllI[8]] = TORTOISE_3;
            hArray[h.lllllllI[9]] = TORTOISE_4;
            hArray[h.lllllllI[10]] = TORTOISE_5;
            hArray[h.lllllllI[11]] = TORTOISE_6;
            hArray[h.lllllllI[12]] = DRAGON_1;
            hArray[h.lllllllI[13]] = DRAGON_2;
            hArray[h.lllllllI[14]] = DRAGON_3;
            hArray[h.lllllllI[15]] = DRAGON_4;
            hArray[h.lllllllI[16]] = DRAGON_5;
            hArray[h.lllllllI[17]] = DRAGON_6;
            hArray[h.lllllllI[18]] = WYVERN_1;
            hArray[h.lllllllI[19]] = WYVERN_2;
            hArray[h.lllllllI[20]] = WYVERN_3;
            hArray[h.lllllllI[21]] = WYVERN_4;
            hArray[h.lllllllI[22]] = WYVERN_5;
            hArray[h.lllllllI[23]] = WYVERN_6;
            hArray[h.lllllllI[24]] = SNAIL_1;
            hArray[h.lllllllI[25]] = SNAIL_2;
            hArray[h.lllllllI[26]] = SNAIL_3;
            hArray[h.lllllllI[27]] = SNAIL_4;
            hArray[h.lllllllI[28]] = SNAIL_5;
            hArray[h.lllllllI[29]] = SNAIL_6;
            hArray[h.lllllllI[30]] = SNAKE_1;
            hArray[h.lllllllI[31]] = SNAKE_2;
            hArray[h.lllllllI[32]] = SNAKE_3;
            hArray[h.lllllllI[33]] = SNAKE_4;
            hArray[h.lllllllI[34]] = SNAKE_5;
            hArray[h.lllllllI[35]] = SNAKE_6;
            hArray[h.lllllllI[36]] = SLUG_1;
            hArray[h.lllllllI[37]] = SLUG_2;
            hArray[h.lllllllI[38]] = SLUG_3;
            hArray[h.lllllllI[39]] = SLUG_4;
            hArray[h.lllllllI[40]] = SLUG_5;
            hArray[h.lllllllI[41]] = SLUG_6;
            hArray[h.lllllllI[42]] = MONKEY_1;
            hArray[h.lllllllI[43]] = MONKEY_2;
            hArray[h.lllllllI[44]] = MONKEY_3;
            hArray[h.lllllllI[45]] = MONKEY_4;
            hArray[h.lllllllI[46]] = MONKEY_5;
            hArray[h.lllllllI[47]] = MONKEY_6;
            hArray[h.lllllllI[48]] = KALPHITE_1;
            hArray[h.lllllllI[49]] = KALPHITE_2;
            hArray[h.lllllllI[50]] = KALPHITE_3;
            hArray[h.lllllllI[51]] = KALPHITE_4;
            hArray[h.lllllllI[52]] = KALPHITE_5;
            hArray[h.lllllllI[53]] = KALPHITE_6;
            hArray[h.lllllllI[54]] = TERRORBIRD_1;
            hArray[h.lllllllI[55]] = TERRORBIRD_2;
            hArray[h.lllllllI[56]] = TERRORBIRD_3;
            hArray[h.lllllllI[57]] = TERRORBIRD_4;
            hArray[h.lllllllI[58]] = TERRORBIRD_5;
            hArray[h.lllllllI[59]] = TERRORBIRD_6;
            hArray[h.lllllllI[60]] = PENGUIN_1;
            hArray[h.lllllllI[61]] = PENGUIN_2;
            hArray[h.lllllllI[62]] = PENGUIN_3;
            hArray[h.lllllllI[63]] = PENGUIN_4;
            hArray[h.lllllllI[64]] = PENGUIN_5;
            hArray[h.lllllllI[65]] = PENGUIN_6;
            hArray[h.lllllllI[66]] = MOLE_1;
            hArray[h.lllllllI[67]] = MOLE_2;
            hArray[h.lllllllI[68]] = MOLE_3;
            hArray[h.lllllllI[69]] = MOLE_4;
            hArray[h.lllllllI[70]] = MOLE_5;
            hArray[h.lllllllI[71]] = MOLE_6;
            hArray[h.lllllllI[72]] = CAMEL_1;
            hArray[h.lllllllI[73]] = CAMEL_2;
            hArray[h.lllllllI[74]] = CAMEL_3;
            hArray[h.lllllllI[75]] = CAMEL_4;
            hArray[h.lllllllI[76]] = CAMEL_5;
            hArray[h.lllllllI[77]] = CAMEL_6;
            hArray[h.lllllllI[78]] = LEECH_1;
            hArray[h.lllllllI[79]] = LEECH_2;
            hArray[h.lllllllI[80]] = LEECH_3;
            hArray[h.lllllllI[81]] = LEECH_4;
            hArray[h.lllllllI[82]] = LEECH_5;
            hArray[h.lllllllI[83]] = LEECH_6;
            $VALUES = hArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            h[] hArray2 = h.values();
            int n2 = hArray2.length;
            int lIIlIlllIllIIll = lllllllI[0];
            while (h.llIlIlIIIII(lIIlIlllIllIIll, (int)lIIlIlllIllIlII)) {
                void lIIlIlllIllIllI;
                void lIIlIlllIllIlIl;
                void lIIlIlllIllIIlI = lIIlIlllIllIlIl[lIIlIlllIllIIll];
                lIIlIlllIllIllI.put((Object)lIIlIlllIllIIlI.question, (Object)lIIlIlllIllIIlI.answer);

                ++lIIlIlllIllIIll;

                if (-1 == -1) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void lIIlIlllIllllll;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int lIIlIlllIlllllI = lllllllI[0];
        while (h.llIlIlIIIII(lIIlIlllIlllllI, (int)lIIlIlllIllllll)) {
            void lIIlIllllIIIIIl;
            void lIIlIllllIIIIII;
            void lIIlIlllIllllIl = lIIlIllllIIIIII[lIIlIlllIlllllI];
            Widget lIIlIlllIllllII = Widgets.get((WidgetInfo)lIIlIlllIllllIl);
            if (h.llIlIlIIIIl(lIIlIlllIllllII) && h.llIlIlIIIlI(lIIlIlllIllllII.getText().equals(lIIlIllllIIIIIl) ? 1 : 0)) {
                return lIIlIlllIllllII;
            }
            ++lIIlIlllIlllllI;

            if (-3 < 0) continue;
            return null;
        }
        return null;
    }

        return String.valueOf(lIIlIlllIIllIII);
    }

    private static boolean llIlIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIIIl(Object object) {
        return object != null;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    public String P() {
        return this.question;
    }

    private static void llIlIIlIIlI() {
        lllllIII = new String[lllllllI[252]];
        h.lllllIII[h.lllllllI[0]] = "LIZARD_1";
        h.lllllIII[h.lllllllI[1]] = "How does a lizard regulate body heat?";
        h.lllllIII[h.lllllllI[2]] = "Sunlight.";
        h.lllllIII[h.lllllllI[3]] = "LIZARD_2";
        h.lllllIII[h.lllllllI[4]] = "Who discovered how to kill lizards?";
        h.lllllIII[h.lllllllI[5]] = "The Slayer Masters.";
        h.lllllIII[h.lllllllI[6]] = "LIZARD_3";
        h.lllllIII[h.lllllllI[7]] = "How many eyes does a lizard have?";
        h.lllllIII[h.lllllllI[8]] = "Three.";
        h.lllllIII[h.lllllllI[9]] = "LIZARD_4";
        h.lllllIII[h.lllllllI[10]] = "What order do lizards belong to?";
        h.lllllIII[h.lllllllI[11]] = "Squamata.";
        h.lllllIII[h.lllllllI[12]] = "LIZARD_5";
        h.lllllIII[h.lllllllI[13]] = "What happens when a lizard becomes cold?";
        h.lllllIII[h.lllllllI[14]] = "It becomes sleepy.";
        h.lllllIII[h.lllllllI[15]] = "LIZARD_6";
        h.lllllIII[h.lllllllI[16]] = "Lizard skin is made of the same substance as?";
        h.lllllIII[h.lllllllI[17]] = "Hair.";
        h.lllllIII[h.lllllllI[18]] = "TORTOISE_1";
        h.lllllIII[h.lllllllI[19]] = "What is the name of the oldest tortoise ever recorded?";
        h.lllllIII[h.lllllllI[20]] = "Mibbiwocket.";
        h.lllllIII[h.lllllllI[21]] = "TORTOISE_2";
        h.lllllIII[h.lllllllI[22]] = "What is a tortoise's favourite food?";
        h.lllllIII[h.lllllllI[23]] = "Vegetables.";
        h.lllllIII[h.lllllllI[24]] = "TORTOISE_3";
        h.lllllIII[h.lllllllI[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        h.lllllIII[h.lllllllI[26]] = "Admiral Bake.";
        h.lllllIII[h.lllllllI[27]] = "TORTOISE_4";
        h.lllllIII[h.lllllllI[28]] = "How does the tortoise protect itself?";
        h.lllllIII[h.lllllllI[29]] = "Hard shell.";
        h.lllllIII[h.lllllllI[30]] = "TORTOISE_5";
        h.lllllIII[h.lllllllI[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        h.lllllIII[h.lllllllI[32]] = "Twenty years.";
        h.lllllIII[h.lllllllI[33]] = "TORTOISE_6";
        h.lllllIII[h.lllllllI[34]] = "Which race breeds tortoises for battle?";
        h.lllllIII[h.lllllllI[35]] = "Gnomes.";
        h.lllllIII[h.lllllllI[36]] = "DRAGON_1";
        h.lllllIII[h.lllllllI[37]] = "What is considered a delicacy by dragons?";
        h.lllllIII[h.lllllllI[38]] = "Runite.";
        h.lllllIII[h.lllllllI[39]] = "DRAGON_2";
        h.lllllIII[h.lllllllI[40]] = "What is the best defence against a dragon's attack?";
        h.lllllIII[h.lllllllI[41]] = "Anti dragon-breath shield.";
        h.lllllIII[h.lllllllI[42]] = "DRAGON_3";
        h.lllllIII[h.lllllllI[43]] = "How long do dragons live?";
        h.lllllIII[h.lllllllI[44]] = "Unknown.";
        h.lllllIII[h.lllllllI[45]] = "DRAGON_4";
        h.lllllIII[h.lllllllI[46]] = "Which of these is not a type of dragon?";
        h.lllllIII[h.lllllllI[47]] = "Elemental.";
        h.lllllIII[h.lllllllI[48]] = "DRAGON_5";
        h.lllllIII[h.lllllllI[49]] = "What is the favoured territory of a dragon?";
        h.lllllIII[h.lllllllI[50]] = "Old battle sites.";
        h.lllllIII[h.lllllllI[51]] = "DRAGON_6";
        h.lllllIII[h.lllllllI[52]] = "Approximately how many feet tall do dragons stand?";
        h.lllllIII[h.lllllllI[53]] = "Twelve.";
        h.lllllIII[h.lllllllI[54]] = "WYVERN_1";
        h.lllllIII[h.lllllllI[55]] = "How did the wyverns die out?";
        h.lllllIII[h.lllllllI[56]] = "Climate change.";
        h.lllllIII[h.lllllllI[57]] = "WYVERN_2";
        h.lllllIII[h.lllllllI[58]] = "How many legs does a wyvern have?";
        h.lllllIII[h.lllllllI[59]] = "Two.";
        h.lllllIII[h.lllllllI[60]] = "WYVERN_3";
        h.lllllIII[h.lllllllI[61]] = "Where have wyvern bones been found?";
        h.lllllIII[h.lllllllI[62]] = "Asgarnia.";
        h.lllllIII[h.lllllllI[63]] = "WYVERN_4";
        h.lllllIII[h.lllllllI[64]] = "Which genus does the wyvern theoretically belong to?";
        h.lllllIII[h.lllllllI[65]] = "Reptiles.";
        h.lllllIII[h.lllllllI[66]] = "WYVERN_5";
        h.lllllIII[h.lllllllI[67]] = "What are the wyverns' closest relations?";
        h.lllllIII[h.lllllllI[68]] = "Dragons.";
        h.lllllIII[h.lllllllI[69]] = "WYVERN_6";
        h.lllllIII[h.lllllllI[70]] = "What is the ambient temperature of wyvern bones?";
        h.lllllIII[h.lllllllI[71]] = "Below room temperature.";
        h.lllllIII[h.lllllllI[72]] = "SNAIL_1";
        h.lllllIII[h.lllllllI[73]] = "What is special about the shell of the giant Morytanian snail?";
        h.lllllIII[h.lllllllI[74]] = "It is resistant to acid.";
        h.lllllIII[h.lllllllI[75]] = "SNAIL_2";
        h.lllllIII[h.lllllllI[76]] = "How do Morytanian snails capture their prey?";
        h.lllllIII[h.lllllllI[77]] = "Spitting acid.";
        h.lllllIII[h.lllllllI[78]] = "SNAIL_3";
        h.lllllIII[h.lllllllI[79]] = "Which of these is a snail byproduct?";
        h.lllllIII[h.lllllllI[80]] = "Fireproof oil.";
        h.lllllIII[h.lllllllI[81]] = "SNAIL_4";
        h.lllllIII[h.lllllllI[82]] = "What does 'Achatina Acidia' mean?";
        h.lllllIII[h.lllllllI[83]] = "Acid-spitting snail.";
        h.lllllIII[h.lllllllI[84]] = "SNAIL_5";
        h.lllllIII[h.lllllllI[85]] = "How do snails move?";
        h.lllllIII[h.lllllllI[86]] = "Contracting and stretching.";
        h.lllllIII[h.lllllllI[87]] = "SNAIL_6";
        h.lllllIII[h.lllllllI[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        h.lllllIII[h.lllllllI[89]] = "An operculum.";
        h.lllllIII[h.lllllllI[90]] = "SNAKE_1";
        h.lllllIII[h.lllllllI[91]] = "What is snake venom adapted from?";
        h.lllllIII[h.lllllllI[92]] = "Stomach acid.";
        h.lllllIII[h.lllllllI[93]] = "SNAKE_2";
        h.lllllIII[h.lllllllI[94]] = "Aside from their noses, what do snakes use to smell?";
        h.lllllIII[h.lllllllI[95]] = "Tongue.";
        h.lllllIII[h.lllllllI[96]] = "SNAKE_3";
        h.lllllIII[h.lllllllI[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        h.lllllIII[h.lllllllI[98]] = "Seeing how you smell.";
        h.lllllIII[h.lllllllI[99]] = "SNAKE_4";
        h.lllllIII[h.lllllllI[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        h.lllllIII[h.lllllllI[101]] = "Constriction.";
        h.lllllIII[h.lllllllI[102]] = "SNAKE_5";
        h.lllllIII[h.lllllllI[103]] = "Lizards and snakes belong to the same order - what is it?";
        h.lllllIII[h.lllllllI[104]] = "Squamata.";
        h.lllllIII[h.lllllllI[105]] = "SNAKE_6";
        h.lllllIII[h.lllllllI[106]] = "Which habitat do snakes prefer?";
        h.lllllIII[h.lllllllI[107]] = "Anywhere.";
        h.lllllIII[h.lllllllI[108]] = "SLUG_1";
        h.lllllIII[h.lllllllI[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        h.lllllIII[h.lllllllI[110]] = "Nematocysts.";
        h.lllllIII[h.lllllllI[111]] = "SLUG_2";
        h.lllllIII[h.lllllllI[112]] = "Why has the museum never examined a live sea slug?";
        h.lllllIII[h.lllllllI[113]] = "The researchers keep vanishing.";
        h.lllllIII[h.lllllllI[114]] = "SLUG_3";
        h.lllllIII[h.lllllllI[115]] = "What do we think the sea slug feeds upon?";
        h.lllllIII[h.lllllllI[116]] = "Seaweed.";
        h.lllllIII[h.lllllllI[117]] = "SLUG_4";
        h.lllllIII[h.lllllllI[118]] = "What are the two fangs presumed to be used for?";
        h.lllllIII[h.lllllllI[119]] = "Defense or display.";
        h.lllllIII[h.lllllllI[120]] = "SLUG_5";
        h.lllllIII[h.lllllllI[121]] = "Off of which coastline would you find sea slugs?";
        h.lllllIII[h.lllllllI[122]] = "Ardougne.";
        h.lllllIII[h.lllllllI[123]] = "SLUG_6";
        h.lllllIII[h.lllllllI[124]] = "In what way are sea slugs similar to snails?";
        h.lllllIII[h.lllllllI[125]] = "They have a hard shell.";
        h.lllllIII[h.lllllllI[126]] = "MONKEY_1";
        h.lllllIII[h.lllllllI[127]] = "Which type of primates do monkeys belong to?";
        h.lllllIII[h.lllllllI[128]] = "Simian.";
        h.lllllIII[h.lllllllI[129]] = "MONKEY_2";
        h.lllllIII[h.lllllllI[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        h.lllllIII[h.lllllllI[131]] = "Harmless.";
        h.lllllIII[h.lllllllI[132]] = "MONKEY_3";
        h.lllllIII[h.lllllllI[133]] = "Monkeys love bananas. What else do they like to eat?";
        h.lllllIII[h.lllllllI[134]] = "Bitternuts.";
        h.lllllIII[h.lllllllI[135]] = "MONKEY_4";
        h.lllllIII[h.lllllllI[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        h.lllllIII[h.lllllllI[137]] = "Harmless.";
        h.lllllIII[h.lllllllI[138]] = "MONKEY_5";
        h.lllllIII[h.lllllllI[139]] = "What colour mohawk do Karamjan monkeys have?";
        h.lllllIII[h.lllllllI[140]] = "Red.";
        h.lllllIII[h.lllllllI[141]] = "MONKEY_6";
        h.lllllIII[h.lllllllI[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        h.lllllIII[h.lllllllI[143]] = "Seaweed.";
        h.lllllIII[h.lllllllI[144]] = "KALPHITE_1";
        h.lllllIII[h.lllllllI[145]] = "Kalphites are ruled by a...?";
        h.lllllIII[h.lllllllI[146]] = "Pasha.";
        h.lllllIII[h.lllllllI[147]] = "KALPHITE_2";
        h.lllllIII[h.lllllllI[148]] = "What is the lowest caste in kalphite society?";
        h.lllllIII[h.lllllllI[149]] = "Worker.";
        h.lllllIII[h.lllllllI[150]] = "KALPHITE_3";
        h.lllllIII[h.lllllllI[151]] = "What are the armoured plates on a kalphite called?";
        h.lllllIII[h.lllllllI[152]] = "Lamellae.";
        h.lllllIII[h.lllllllI[153]] = "KALPHITE_4";
        h.lllllIII[h.lllllllI[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        h.lllllIII[h.lllllllI[155]] = "Carnivores.";
        h.lllllIII[h.lllllllI[156]] = "KALPHITE_5";
        h.lllllIII[h.lllllllI[157]] = "What are kalphites assumed to have evolved from?";
        h.lllllIII[h.lllllllI[158]] = "Scarab beetles.";
        h.lllllIII[h.lllllllI[159]] = "KALPHITE_6";
        h.lllllIII[h.lllllllI[160]] = "Name the prominent figure in kalphite mythology?";
        h.lllllIII[h.lllllllI[161]] = "Scabaras.";
        h.lllllIII[h.lllllllI[162]] = "TERRORBIRD_1";
        h.lllllIII[h.lllllllI[163]] = "What is a terrorbird's preferred food?";
        h.lllllIII[h.lllllllI[164]] = "Anything.";
        h.lllllIII[h.lllllllI[165]] = "TERRORBIRD_2";
        h.lllllIII[h.lllllllI[166]] = "Who use terrorbirds as mounts?";
        h.lllllIII[h.lllllllI[167]] = "Gnomes.";
        h.lllllIII[h.lllllllI[168]] = "TERRORBIRD_3";
        h.lllllIII[h.lllllllI[169]] = "Where do terrorbirds get most of their water?";
        h.lllllIII[h.lllllllI[170]] = "Eating plants.";
        h.lllllIII[h.lllllllI[171]] = "TERRORBIRD_4";
        h.lllllIII[h.lllllllI[172]] = "How many claws do terrorbirds have?";
        h.lllllIII[h.lllllllI[173]] = "Four.";
        h.lllllIII[h.lllllllI[174]] = "TERRORBIRD_5";
        h.lllllIII[h.lllllllI[175]] = "What do terrorbirds eat to aid digestion?";
        h.lllllIII[h.lllllllI[176]] = "Stones.";
        h.lllllIII[h.lllllllI[177]] = "TERRORBIRD_6";
        h.lllllIII[h.lllllllI[178]] = "How many teeth do terrorbirds have?";
        h.lllllIII[h.lllllllI[179]] = "0.";
        h.lllllIII[h.lllllllI[180]] = "PENGUIN_1";
        h.lllllIII[h.lllllllI[181]] = "Which sense do penguins rely on when hunting?";
        h.lllllIII[h.lllllllI[182]] = "Sight.";
        h.lllllIII[h.lllllllI[183]] = "PENGUIN_2";
        h.lllllIII[h.lllllllI[184]] = "Which skill seems unusual for the penguins to possess?";
        h.lllllIII[h.lllllllI[185]] = "Planning.";
        h.lllllIII[h.lllllllI[186]] = "PENGUIN_3";
        h.lllllIII[h.lllllllI[187]] = "How do penguins keep warm?";
        h.lllllIII[h.lllllllI[188]] = "A layer of fat.";
        h.lllllIII[h.lllllllI[189]] = "PENGUIN_4";
        h.lllllIII[h.lllllllI[190]] = "What is the preferred climate for penguins?";
        h.lllllIII[h.lllllllI[191]] = "Cold.";
        h.lllllIII[h.lllllllI[192]] = "PENGUIN_5";
        h.lllllIII[h.lllllllI[193]] = "Describe the behaviour of penguins?";
        h.lllllIII[h.lllllllI[194]] = "Social.";
        h.lllllIII[h.lllllllI[195]] = "PENGUIN_6";
        h.lllllIII[h.lllllllI[196]] = "When do penguins fast?";
        h.lllllIII[h.lllllllI[197]] = "During breeding.";
        h.lllllIII[h.lllllllI[198]] = "MOLE_1";
        h.lllllIII[h.lllllllI[199]] = "What habitat do moles prefer?";
        h.lllllIII[h.lllllllI[200]] = "Subterranean.";
        h.lllllIII[h.lllllllI[201]] = "MOLE_2";
        h.lllllIII[h.lllllllI[202]] = "Why are moles considered to be an agricultural pest?";
        h.lllllIII[h.lllllllI[203]] = "They dig holes.";
        h.lllllIII[h.lllllllI[204]] = "MOLE_3";
        h.lllllIII[h.lllllllI[205]] = "Who discovered giant moles?";
        h.lllllIII[h.lllllllI[206]] = "Wyson the Gardener.";
        h.lllllIII[h.lllllllI[207]] = "MOLE_4";
        h.lllllIII[h.lllllllI[208]] = "What would you call a group of young moles?";
        h.lllllIII[h.lllllllI[209]] = "A labour.";
        h.lllllIII[h.lllllllI[210]] = "MOLE_5";
        h.lllllIII[h.lllllllI[211]] = "What is a mole's favourite food?";
        h.lllllIII[h.lllllllI[212]] = "Insects and other invertebrates.";
        h.lllllIII[h.lllllllI[213]] = "MOLE_6";
        h.lllllIII[h.lllllllI[214]] = "Which family do moles belong to?";
        h.lllllIII[h.lllllllI[215]] = "The Talpidae family.";
        h.lllllIII[h.lllllllI[216]] = "CAMEL_1";
        h.lllllIII[h.lllllllI[217]] = "What is produced by feeding chilli to a camel?";
        h.lllllIII[h.lllllllI[218]] = "Toxic dung.";
        h.lllllIII[h.lllllllI[219]] = "CAMEL_2";
        h.lllllIII[h.lllllllI[220]] = "If an ugthanki has one, how many does a bactrian have?";
        h.lllllIII[h.lllllllI[221]] = "Two.";
        h.lllllIII[h.lllllllI[222]] = "CAMEL_3";
        h.lllllIII[h.lllllllI[223]] = "Camels: herbivore, carnivore or omnivore?";
        h.lllllIII[h.lllllllI[224]] = "Omnivore.";
        h.lllllIII[h.lllllllI[225]] = "CAMEL_4";
        h.lllllIII[h.lllllllI[226]] = "What is the usual mood for a camel?";
        h.lllllIII[h.lllllllI[227]] = "Annoyed.";
        h.lllllIII[h.lllllllI[228]] = "CAMEL_5";
        h.lllllIII[h.lllllllI[229]] = "Where would you find an ugthanki?";
        h.lllllIII[h.lllllllI[230]] = "Al Kharid.";
        h.lllllIII[h.lllllllI[231]] = "CAMEL_6";
        h.lllllIII[h.lllllllI[232]] = "Which camel byproduct is known to be very nutritious?";
        h.lllllIII[h.lllllllI[233]] = "Milk.";
        h.lllllIII[h.lllllllI[234]] = "LEECH_1";
        h.lllllIII[h.lllllllI[235]] = "What is the favoured habitat of leeches?";
        h.lllllIII[h.lllllllI[236]] = "Water.";
        h.lllllIII[h.lllllllI[237]] = "LEECH_2";
        h.lllllIII[h.lllllllI[238]] = "What shape is the inside of a leech's mouth?";
        h.lllllIII[h.lllllllI[239]] = "'Y'-shaped.";
        h.lllllIII[h.lllllllI[240]] = "LEECH_3";
        h.lllllIII[h.lllllllI[241]] = "Which of these is not eaten by leeches?";
        h.lllllIII[h.lllllllI[242]] = "Apples.";
        h.lllllIII[h.lllllllI[243]] = "LEECH_4";
        h.lllllIII[h.lllllllI[244]] = "What contributed to the giant growth of Morytanian leeches?";
        h.lllllIII[h.lllllllI[245]] = "Environment.";
        h.lllllIII[h.lllllllI[246]] = "LEECH_5";
        h.lllllIII[h.lllllllI[247]] = "What is special about Morytanian leeches?";
        h.lllllIII[h.lllllllI[248]] = "They attack by jumping.";
        h.lllllIII[h.lllllllI[249]] = "LEECH_6";
        h.lllllIII[h.lllllllI[250]] = "How does a leech change when it feeds?";
        h.lllllIII[h.lllllllI[251]] = "It doubles in size.";
    }

    private static boolean llIlIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public String Q() {
        return this.answer;
    }
}

