/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

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
extends Enum<o> {
    public static final  /* enum */ o MOLE_3;
    public static final  /* enum */ o KALPHITE_3;
    public static final  /* enum */ o TERRORBIRD_6;
    public static final  /* enum */ o SLUG_4;
    public static final  /* enum */ o LEECH_2;
    public static final  /* enum */ o LIZARD_1;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ o TERRORBIRD_1;
    public static final  /* enum */ o WYVERN_5;
    public static final  /* enum */ o LEECH_6;
    public static final  /* enum */ o PENGUIN_5;
    public static final  /* enum */ o LIZARD_4;
    public static final  /* enum */ o WYVERN_1;
    public static final  /* enum */ o KALPHITE_6;
    public static final  /* enum */ o LEECH_3;
    public static final  /* enum */ o WYVERN_3;
    public static final  /* enum */ o TERRORBIRD_2;
    public static final  /* enum */ o LIZARD_6;
    public static final  /* enum */ o SNAKE_1;
    public static final  /* enum */ o LIZARD_5;
    public static final  /* enum */ o KALPHITE_4;
    private static final  o[] $VALUES;
    public static final  /* enum */ o SNAIL_5;
    public static final  /* enum */ o DRAGON_6;
    public static final  /* enum */ o SLUG_1;
    public static final  /* enum */ o SNAIL_2;
    public static final  /* enum */ o TERRORBIRD_3;
    public static final  /* enum */ o DRAGON_2;
    public static final  /* enum */ o MONKEY_5;
    public static final  /* enum */ o KALPHITE_1;
    private final  String answer;
    public static final  /* enum */ o MOLE_5;
    public static final  /* enum */ o CAMEL_2;
    public static final  /* enum */ o LEECH_4;
    public static final  /* enum */ o MONKEY_3;
    private final  String question;
    public static final  /* enum */ o SNAIL_3;
    public static final  /* enum */ o KALPHITE_2;
    public static final  /* enum */ o SLUG_6;
    public static final  /* enum */ o LEECH_1;
    public static final  /* enum */ o SNAKE_6;
    public static final  /* enum */ o SNAIL_6;
    public static final  /* enum */ o LIZARD_2;
    public static final  /* enum */ o SLUG_2;
    public static final  /* enum */ o SNAKE_3;
    public static final  /* enum */ o SLUG_5;
    public static final  /* enum */ o PENGUIN_2;
    public static final  /* enum */ o KALPHITE_5;
    public static final  /* enum */ o SNAIL_4;
    public static final  /* enum */ o TORTOISE_2;
    public static final  /* enum */ o MOLE_6;
    public static final  /* enum */ o PENGUIN_6;
    public static final  /* enum */ o LIZARD_3;
    public static final  /* enum */ o PENGUIN_1;
    public static final  /* enum */ o MOLE_2;
    public static final  /* enum */ o DRAGON_4;
    public static final  /* enum */ o SNAKE_5;
    public static final  /* enum */ o LEECH_5;
    public static final  /* enum */ o SLUG_3;
    public static final  /* enum */ o TERRORBIRD_5;
    public static final  /* enum */ o MONKEY_2;
    public static final  /* enum */ o CAMEL_6;
    public static final  /* enum */ o TORTOISE_6;
    public static final  /* enum */ o PENGUIN_4;
    public static final  /* enum */ o PENGUIN_3;
    public static final  /* enum */ o SNAKE_4;
    public static final  /* enum */ o CAMEL_5;
    public static final  /* enum */ o MOLE_4;
    public static final  /* enum */ o DRAGON_1;
    public static final  /* enum */ o DRAGON_5;
    public static final  /* enum */ o MONKEY_4;
    public static final  /* enum */ o WYVERN_4;
    public static final  /* enum */ o CAMEL_1;
    public static final  /* enum */ o SNAIL_1;
    public static final  /* enum */ o CAMEL_4;
    public static final  /* enum */ o WYVERN_2;
    public static final  /* enum */ o TORTOISE_4;
    public static final  /* enum */ o TERRORBIRD_4;
    public static final  /* enum */ o MONKEY_6;
    
    public static final  /* enum */ o SNAKE_2;
    
    public static final  /* enum */ o MOLE_1;
    public static final  /* enum */ o MONKEY_1;
    public static final  /* enum */ o WYVERN_6;
    public static final  /* enum */ o TORTOISE_5;
    public static final  /* enum */ o TORTOISE_3;
    public static final  /* enum */ o CAMEL_3;
    public static final  /* enum */ o DRAGON_3;
    public static final  /* enum */ o TORTOISE_1;

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void lllllIIIlllIIll;
            o.llIlIII();
            o.llIIIII();
            LIZARD_1 = new GameEnum(lIlI[lIlII[1]], lIlI[lIlII[2]]);
            LIZARD_2 = new GameEnum(lIlI[lIlII[4]], lIlI[lIlII[5]]);
            LIZARD_3 = new GameEnum(lIlI[lIlII[7]], lIlI[lIlII[8]]);
            LIZARD_4 = new GameEnum(lIlI[lIlII[10]], lIlI[lIlII[11]]);
            LIZARD_5 = new GameEnum(lIlI[lIlII[13]], lIlI[lIlII[14]]);
            LIZARD_6 = new GameEnum(lIlI[lIlII[16]], lIlI[lIlII[17]]);
            TORTOISE_1 = new GameEnum(lIlI[lIlII[19]], lIlI[lIlII[20]]);
            TORTOISE_2 = new GameEnum(lIlI[lIlII[22]], lIlI[lIlII[23]]);
            TORTOISE_3 = new GameEnum(lIlI[lIlII[25]], lIlI[lIlII[26]]);
            TORTOISE_4 = new GameEnum(lIlI[lIlII[28]], lIlI[lIlII[29]]);
            TORTOISE_5 = new GameEnum(lIlI[lIlII[31]], lIlI[lIlII[32]]);
            TORTOISE_6 = new GameEnum(lIlI[lIlII[34]], lIlI[lIlII[35]]);
            DRAGON_1 = new GameEnum(lIlI[lIlII[37]], lIlI[lIlII[38]]);
            DRAGON_2 = new GameEnum(lIlI[lIlII[40]], lIlI[lIlII[41]]);
            DRAGON_3 = new GameEnum(lIlI[lIlII[43]], lIlI[lIlII[44]]);
            DRAGON_4 = new GameEnum(lIlI[lIlII[46]], lIlI[lIlII[47]]);
            DRAGON_5 = new GameEnum(lIlI[lIlII[49]], lIlI[lIlII[50]]);
            DRAGON_6 = new GameEnum(lIlI[lIlII[52]], lIlI[lIlII[53]]);
            WYVERN_1 = new GameEnum(lIlI[lIlII[55]], lIlI[lIlII[56]]);
            WYVERN_2 = new GameEnum(lIlI[lIlII[58]], lIlI[lIlII[59]]);
            WYVERN_3 = new GameEnum(lIlI[lIlII[61]], lIlI[lIlII[62]]);
            WYVERN_4 = new GameEnum(lIlI[lIlII[64]], lIlI[lIlII[65]]);
            WYVERN_5 = new GameEnum(lIlI[lIlII[67]], lIlI[lIlII[68]]);
            WYVERN_6 = new GameEnum(lIlI[lIlII[70]], lIlI[lIlII[71]]);
            SNAIL_1 = new GameEnum(lIlI[lIlII[73]], lIlI[lIlII[74]]);
            SNAIL_2 = new GameEnum(lIlI[lIlII[76]], lIlI[lIlII[77]]);
            SNAIL_3 = new GameEnum(lIlI[lIlII[79]], lIlI[lIlII[80]]);
            SNAIL_4 = new GameEnum(lIlI[lIlII[82]], lIlI[lIlII[83]]);
            SNAIL_5 = new GameEnum(lIlI[lIlII[85]], lIlI[lIlII[86]]);
            SNAIL_6 = new GameEnum(lIlI[lIlII[88]], lIlI[lIlII[89]]);
            SNAKE_1 = new GameEnum(lIlI[lIlII[91]], lIlI[lIlII[92]]);
            SNAKE_2 = new GameEnum(lIlI[lIlII[94]], lIlI[lIlII[95]]);
            SNAKE_3 = new GameEnum(lIlI[lIlII[97]], lIlI[lIlII[98]]);
            SNAKE_4 = new GameEnum(lIlI[lIlII[100]], lIlI[lIlII[101]]);
            SNAKE_5 = new GameEnum(lIlI[lIlII[103]], lIlI[lIlII[104]]);
            SNAKE_6 = new GameEnum(lIlI[lIlII[106]], lIlI[lIlII[107]]);
            SLUG_1 = new GameEnum(lIlI[lIlII[109]], lIlI[lIlII[110]]);
            SLUG_2 = new GameEnum(lIlI[lIlII[112]], lIlI[lIlII[113]]);
            SLUG_3 = new GameEnum(lIlI[lIlII[115]], lIlI[lIlII[116]]);
            SLUG_4 = new GameEnum(lIlI[lIlII[118]], lIlI[lIlII[119]]);
            SLUG_5 = new GameEnum(lIlI[lIlII[121]], lIlI[lIlII[122]]);
            SLUG_6 = new GameEnum(lIlI[lIlII[124]], lIlI[lIlII[125]]);
            MONKEY_1 = new GameEnum(lIlI[lIlII[127]], lIlI[lIlII[128]]);
            MONKEY_2 = new GameEnum(lIlI[lIlII[130]], lIlI[lIlII[131]]);
            MONKEY_3 = new GameEnum(lIlI[lIlII[133]], lIlI[lIlII[134]]);
            MONKEY_4 = new GameEnum(lIlI[lIlII[136]], lIlI[lIlII[137]]);
            MONKEY_5 = new GameEnum(lIlI[lIlII[139]], lIlI[lIlII[140]]);
            MONKEY_6 = new GameEnum(lIlI[lIlII[142]], lIlI[lIlII[143]]);
            KALPHITE_1 = new GameEnum(lIlI[lIlII[145]], lIlI[lIlII[146]]);
            KALPHITE_2 = new GameEnum(lIlI[lIlII[148]], lIlI[lIlII[149]]);
            KALPHITE_3 = new GameEnum(lIlI[lIlII[151]], lIlI[lIlII[152]]);
            KALPHITE_4 = new GameEnum(lIlI[lIlII[154]], lIlI[lIlII[155]]);
            KALPHITE_5 = new GameEnum(lIlI[lIlII[157]], lIlI[lIlII[158]]);
            KALPHITE_6 = new GameEnum(lIlI[lIlII[160]], lIlI[lIlII[161]]);
            TERRORBIRD_1 = new GameEnum(lIlI[lIlII[163]], lIlI[lIlII[164]]);
            TERRORBIRD_2 = new GameEnum(lIlI[lIlII[166]], lIlI[lIlII[167]]);
            TERRORBIRD_3 = new GameEnum(lIlI[lIlII[169]], lIlI[lIlII[170]]);
            TERRORBIRD_4 = new GameEnum(lIlI[lIlII[172]], lIlI[lIlII[173]]);
            TERRORBIRD_5 = new GameEnum(lIlI[lIlII[175]], lIlI[lIlII[176]]);
            TERRORBIRD_6 = new GameEnum(lIlI[lIlII[178]], lIlI[lIlII[179]]);
            PENGUIN_1 = new GameEnum(lIlI[lIlII[181]], lIlI[lIlII[182]]);
            PENGUIN_2 = new GameEnum(lIlI[lIlII[184]], lIlI[lIlII[185]]);
            PENGUIN_3 = new GameEnum(lIlI[lIlII[187]], lIlI[lIlII[188]]);
            PENGUIN_4 = new GameEnum(lIlI[lIlII[190]], lIlI[lIlII[191]]);
            PENGUIN_5 = new GameEnum(lIlI[lIlII[193]], lIlI[lIlII[194]]);
            PENGUIN_6 = new GameEnum(lIlI[lIlII[196]], lIlI[lIlII[197]]);
            MOLE_1 = new GameEnum(lIlI[lIlII[199]], lIlI[lIlII[200]]);
            MOLE_2 = new GameEnum(lIlI[lIlII[202]], lIlI[lIlII[203]]);
            MOLE_3 = new GameEnum(lIlI[lIlII[205]], lIlI[lIlII[206]]);
            MOLE_4 = new GameEnum(lIlI[lIlII[208]], lIlI[lIlII[209]]);
            MOLE_5 = new GameEnum(lIlI[lIlII[211]], lIlI[lIlII[212]]);
            MOLE_6 = new GameEnum(lIlI[lIlII[214]], lIlI[lIlII[215]]);
            CAMEL_1 = new GameEnum(lIlI[lIlII[217]], lIlI[lIlII[218]]);
            CAMEL_2 = new GameEnum(lIlI[lIlII[220]], lIlI[lIlII[221]]);
            CAMEL_3 = new GameEnum(lIlI[lIlII[223]], lIlI[lIlII[224]]);
            CAMEL_4 = new GameEnum(lIlI[lIlII[226]], lIlI[lIlII[227]]);
            CAMEL_5 = new GameEnum(lIlI[lIlII[229]], lIlI[lIlII[230]]);
            CAMEL_6 = new GameEnum(lIlI[lIlII[232]], lIlI[lIlII[233]]);
            LEECH_1 = new GameEnum(lIlI[lIlII[235]], lIlI[lIlII[236]]);
            LEECH_2 = new GameEnum(lIlI[lIlII[238]], lIlI[lIlII[239]]);
            LEECH_3 = new GameEnum(lIlI[lIlII[241]], lIlI[lIlII[242]]);
            LEECH_4 = new GameEnum(lIlI[lIlII[244]], lIlI[lIlII[245]]);
            LEECH_5 = new GameEnum(lIlI[lIlII[247]], lIlI[lIlII[248]]);
            LEECH_6 = new GameEnum(lIlI[lIlII[250]], lIlI[lIlII[251]]);
            o[] oArray = new o[lIlII[84]];
            oArray[o.lIlII[0]] = LIZARD_1;
            oArray[o.lIlII[1]] = LIZARD_2;
            oArray[o.lIlII[2]] = LIZARD_3;
            oArray[o.lIlII[3]] = LIZARD_4;
            oArray[o.lIlII[4]] = LIZARD_5;
            oArray[o.lIlII[5]] = LIZARD_6;
            oArray[o.lIlII[6]] = TORTOISE_1;
            oArray[o.lIlII[7]] = TORTOISE_2;
            oArray[o.lIlII[8]] = TORTOISE_3;
            oArray[o.lIlII[9]] = TORTOISE_4;
            oArray[o.lIlII[10]] = TORTOISE_5;
            oArray[o.lIlII[11]] = TORTOISE_6;
            oArray[o.lIlII[12]] = DRAGON_1;
            oArray[o.lIlII[13]] = DRAGON_2;
            oArray[o.lIlII[14]] = DRAGON_3;
            oArray[o.lIlII[15]] = DRAGON_4;
            oArray[o.lIlII[16]] = DRAGON_5;
            oArray[o.lIlII[17]] = DRAGON_6;
            oArray[o.lIlII[18]] = WYVERN_1;
            oArray[o.lIlII[19]] = WYVERN_2;
            oArray[o.lIlII[20]] = WYVERN_3;
            oArray[o.lIlII[21]] = WYVERN_4;
            oArray[o.lIlII[22]] = WYVERN_5;
            oArray[o.lIlII[23]] = WYVERN_6;
            oArray[o.lIlII[24]] = SNAIL_1;
            oArray[o.lIlII[25]] = SNAIL_2;
            oArray[o.lIlII[26]] = SNAIL_3;
            oArray[o.lIlII[27]] = SNAIL_4;
            oArray[o.lIlII[28]] = SNAIL_5;
            oArray[o.lIlII[29]] = SNAIL_6;
            oArray[o.lIlII[30]] = SNAKE_1;
            oArray[o.lIlII[31]] = SNAKE_2;
            oArray[o.lIlII[32]] = SNAKE_3;
            oArray[o.lIlII[33]] = SNAKE_4;
            oArray[o.lIlII[34]] = SNAKE_5;
            oArray[o.lIlII[35]] = SNAKE_6;
            oArray[o.lIlII[36]] = SLUG_1;
            oArray[o.lIlII[37]] = SLUG_2;
            oArray[o.lIlII[38]] = SLUG_3;
            oArray[o.lIlII[39]] = SLUG_4;
            oArray[o.lIlII[40]] = SLUG_5;
            oArray[o.lIlII[41]] = SLUG_6;
            oArray[o.lIlII[42]] = MONKEY_1;
            oArray[o.lIlII[43]] = MONKEY_2;
            oArray[o.lIlII[44]] = MONKEY_3;
            oArray[o.lIlII[45]] = MONKEY_4;
            oArray[o.lIlII[46]] = MONKEY_5;
            oArray[o.lIlII[47]] = MONKEY_6;
            oArray[o.lIlII[48]] = KALPHITE_1;
            oArray[o.lIlII[49]] = KALPHITE_2;
            oArray[o.lIlII[50]] = KALPHITE_3;
            oArray[o.lIlII[51]] = KALPHITE_4;
            oArray[o.lIlII[52]] = KALPHITE_5;
            oArray[o.lIlII[53]] = KALPHITE_6;
            oArray[o.lIlII[54]] = TERRORBIRD_1;
            oArray[o.lIlII[55]] = TERRORBIRD_2;
            oArray[o.lIlII[56]] = TERRORBIRD_3;
            oArray[o.lIlII[57]] = TERRORBIRD_4;
            oArray[o.lIlII[58]] = TERRORBIRD_5;
            oArray[o.lIlII[59]] = TERRORBIRD_6;
            oArray[o.lIlII[60]] = PENGUIN_1;
            oArray[o.lIlII[61]] = PENGUIN_2;
            oArray[o.lIlII[62]] = PENGUIN_3;
            oArray[o.lIlII[63]] = PENGUIN_4;
            oArray[o.lIlII[64]] = PENGUIN_5;
            oArray[o.lIlII[65]] = PENGUIN_6;
            oArray[o.lIlII[66]] = MOLE_1;
            oArray[o.lIlII[67]] = MOLE_2;
            oArray[o.lIlII[68]] = MOLE_3;
            oArray[o.lIlII[69]] = MOLE_4;
            oArray[o.lIlII[70]] = MOLE_5;
            oArray[o.lIlII[71]] = MOLE_6;
            oArray[o.lIlII[72]] = CAMEL_1;
            oArray[o.lIlII[73]] = CAMEL_2;
            oArray[o.lIlII[74]] = CAMEL_3;
            oArray[o.lIlII[75]] = CAMEL_4;
            oArray[o.lIlII[76]] = CAMEL_5;
            oArray[o.lIlII[77]] = CAMEL_6;
            oArray[o.lIlII[78]] = LEECH_1;
            oArray[o.lIlII[79]] = LEECH_2;
            oArray[o.lIlII[80]] = LEECH_3;
            oArray[o.lIlII[81]] = LEECH_4;
            oArray[o.lIlII[82]] = LEECH_5;
            oArray[o.lIlII[83]] = LEECH_6;
            $VALUES = oArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            o[] oArray2 = o.values();
            int n2 = oArray2.length;
            int lllllIIIlllIIlI = lIlII[0];
            while (o.llIlIIl(lllllIIIlllIIlI, (int)lllllIIIlllIIll)) {
                void lllllIIIlllIlIl;
                void lllllIIIlllIlII;
                void lllllIIIlllIIIl = lllllIIIlllIlII[lllllIIIlllIIlI];
                lllllIIIlllIlIl.put((Object)lllllIIIlllIIIl.question, (Object)lllllIIIlllIIIl.answer);

                ++lllllIIIlllIIlI;

                if ((0xBC ^ 0xB8) == (0x81 ^ 0x85)) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

    public String aZ() {
        return this.question;
    }

    private static boolean llIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void lllllIIIllllllI;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int lllllIIIlllllIl = lIlII[0];
        while (o.llIlIIl(lllllIIIlllllIl, (int)lllllIIIllllllI)) {
            void lllllIIlIIIIIII;
            void lllllIIIlllllll;
            void lllllIIIlllllII = lllllIIIlllllll[lllllIIIlllllIl];
            Widget lllllIIIllllIll = Widgets.get((WidgetInfo)lllllIIIlllllII);
            if (o.llIlIlI(lllllIIIllllIll) && o.llIlIll(lllllIIIllllIll.getText().equals(lllllIIlIIIIIII) ? 1 : 0)) {
                return lllllIIIllllIll;
            }
            ++lllllIIIlllllIl;

            if (((0xE ^ 6) & ~(0x2E ^ 0x26)) == 0) continue;
            return null;
        }
        return null;
    }

    public String ba() {
        return this.answer;
    }

    private static boolean llIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private static void llIIIII() {
        lIlI = new String[lIlII[252]];
        o.lIlI[o.lIlII[0]] = "LIZARD_1";
        o.lIlI[o.lIlII[1]] = "How does a lizard regulate body heat?";
        o.lIlI[o.lIlII[2]] = "Sunlight.";
        o.lIlI[o.lIlII[3]] = "LIZARD_2";
        o.lIlI[o.lIlII[4]] = "Who discovered how to kill lizards?";
        o.lIlI[o.lIlII[5]] = "The Slayer Masters.";
        o.lIlI[o.lIlII[6]] = "LIZARD_3";
        o.lIlI[o.lIlII[7]] = "How many eyes does a lizard have?";
        o.lIlI[o.lIlII[8]] = "Three.";
        o.lIlI[o.lIlII[9]] = "LIZARD_4";
        o.lIlI[o.lIlII[10]] = "What order do lizards belong to?";
        o.lIlI[o.lIlII[11]] = "Squamata.";
        o.lIlI[o.lIlII[12]] = "LIZARD_5";
        o.lIlI[o.lIlII[13]] = "What happens when a lizard becomes cold?";
        o.lIlI[o.lIlII[14]] = "It becomes sleepy.";
        o.lIlI[o.lIlII[15]] = "LIZARD_6";
        o.lIlI[o.lIlII[16]] = "Lizard skin is made of the same substance as?";
        o.lIlI[o.lIlII[17]] = "Hair.";
        o.lIlI[o.lIlII[18]] = "TORTOISE_1";
        o.lIlI[o.lIlII[19]] = "What is the name of the oldest tortoise ever recorded?";
        o.lIlI[o.lIlII[20]] = "Mibbiwocket.";
        o.lIlI[o.lIlII[21]] = "TORTOISE_2";
        o.lIlI[o.lIlII[22]] = "What is a tortoise's favourite food?";
        o.lIlI[o.lIlII[23]] = "Vegetables.";
        o.lIlI[o.lIlII[24]] = "TORTOISE_3";
        o.lIlI[o.lIlII[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        o.lIlI[o.lIlII[26]] = "Admiral Bake.";
        o.lIlI[o.lIlII[27]] = "TORTOISE_4";
        o.lIlI[o.lIlII[28]] = "How does the tortoise protect itself?";
        o.lIlI[o.lIlII[29]] = "Hard shell.";
        o.lIlI[o.lIlII[30]] = "TORTOISE_5";
        o.lIlI[o.lIlII[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        o.lIlI[o.lIlII[32]] = "Twenty years.";
        o.lIlI[o.lIlII[33]] = "TORTOISE_6";
        o.lIlI[o.lIlII[34]] = "Which race breeds tortoises for battle?";
        o.lIlI[o.lIlII[35]] = "Gnomes.";
        o.lIlI[o.lIlII[36]] = "DRAGON_1";
        o.lIlI[o.lIlII[37]] = "What is considered a delicacy by dragons?";
        o.lIlI[o.lIlII[38]] = "Runite.";
        o.lIlI[o.lIlII[39]] = "DRAGON_2";
        o.lIlI[o.lIlII[40]] = "What is the best defence against a dragon's attack?";
        o.lIlI[o.lIlII[41]] = "Anti dragon-breath shield.";
        o.lIlI[o.lIlII[42]] = "DRAGON_3";
        o.lIlI[o.lIlII[43]] = "How long do dragons live?";
        o.lIlI[o.lIlII[44]] = "Unknown.";
        o.lIlI[o.lIlII[45]] = "DRAGON_4";
        o.lIlI[o.lIlII[46]] = "Which of these is not a type of dragon?";
        o.lIlI[o.lIlII[47]] = "Elemental.";
        o.lIlI[o.lIlII[48]] = "DRAGON_5";
        o.lIlI[o.lIlII[49]] = "What is the favoured territory of a dragon?";
        o.lIlI[o.lIlII[50]] = "Old battle sites.";
        o.lIlI[o.lIlII[51]] = "DRAGON_6";
        o.lIlI[o.lIlII[52]] = "Approximately how many feet tall do dragons stand?";
        o.lIlI[o.lIlII[53]] = "Twelve.";
        o.lIlI[o.lIlII[54]] = "WYVERN_1";
        o.lIlI[o.lIlII[55]] = "How did the wyverns die out?";
        o.lIlI[o.lIlII[56]] = "Climate change.";
        o.lIlI[o.lIlII[57]] = "WYVERN_2";
        o.lIlI[o.lIlII[58]] = "How many legs does a wyvern have?";
        o.lIlI[o.lIlII[59]] = "Two.";
        o.lIlI[o.lIlII[60]] = "WYVERN_3";
        o.lIlI[o.lIlII[61]] = "Where have wyvern bones been found?";
        o.lIlI[o.lIlII[62]] = "Asgarnia.";
        o.lIlI[o.lIlII[63]] = "WYVERN_4";
        o.lIlI[o.lIlII[64]] = "Which genus does the wyvern theoretically belong to?";
        o.lIlI[o.lIlII[65]] = "Reptiles.";
        o.lIlI[o.lIlII[66]] = "WYVERN_5";
        o.lIlI[o.lIlII[67]] = "What are the wyverns' closest relations?";
        o.lIlI[o.lIlII[68]] = "Dragons.";
        o.lIlI[o.lIlII[69]] = "WYVERN_6";
        o.lIlI[o.lIlII[70]] = "What is the ambient temperature of wyvern bones?";
        o.lIlI[o.lIlII[71]] = "Below room temperature.";
        o.lIlI[o.lIlII[72]] = "SNAIL_1";
        o.lIlI[o.lIlII[73]] = "What is special about the shell of the giant Morytanian snail?";
        o.lIlI[o.lIlII[74]] = "It is resistant to acid.";
        o.lIlI[o.lIlII[75]] = "SNAIL_2";
        o.lIlI[o.lIlII[76]] = "How do Morytanian snails capture their prey?";
        o.lIlI[o.lIlII[77]] = "Spitting acid.";
        o.lIlI[o.lIlII[78]] = "SNAIL_3";
        o.lIlI[o.lIlII[79]] = "Which of these is a snail byproduct?";
        o.lIlI[o.lIlII[80]] = "Fireproof oil.";
        o.lIlI[o.lIlII[81]] = "SNAIL_4";
        o.lIlI[o.lIlII[82]] = "What does 'Achatina Acidia' mean?";
        o.lIlI[o.lIlII[83]] = "Acid-spitting snail.";
        o.lIlI[o.lIlII[84]] = "SNAIL_5";
        o.lIlI[o.lIlII[85]] = "How do snails move?";
        o.lIlI[o.lIlII[86]] = "Contracting and stretching.";
        o.lIlI[o.lIlII[87]] = "SNAIL_6";
        o.lIlI[o.lIlII[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        o.lIlI[o.lIlII[89]] = "An operculum.";
        o.lIlI[o.lIlII[90]] = "SNAKE_1";
        o.lIlI[o.lIlII[91]] = "What is snake venom adapted from?";
        o.lIlI[o.lIlII[92]] = "Stomach acid.";
        o.lIlI[o.lIlII[93]] = "SNAKE_2";
        o.lIlI[o.lIlII[94]] = "Aside from their noses, what do snakes use to smell?";
        o.lIlI[o.lIlII[95]] = "Tongue.";
        o.lIlI[o.lIlII[96]] = "SNAKE_3";
        o.lIlI[o.lIlII[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        o.lIlI[o.lIlII[98]] = "Seeing how you smell.";
        o.lIlI[o.lIlII[99]] = "SNAKE_4";
        o.lIlI[o.lIlII[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        o.lIlI[o.lIlII[101]] = "Constriction.";
        o.lIlI[o.lIlII[102]] = "SNAKE_5";
        o.lIlI[o.lIlII[103]] = "Lizards and snakes belong to the same order - what is it?";
        o.lIlI[o.lIlII[104]] = "Squamata.";
        o.lIlI[o.lIlII[105]] = "SNAKE_6";
        o.lIlI[o.lIlII[106]] = "Which habitat do snakes prefer?";
        o.lIlI[o.lIlII[107]] = "Anywhere.";
        o.lIlI[o.lIlII[108]] = "SLUG_1";
        o.lIlI[o.lIlII[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        o.lIlI[o.lIlII[110]] = "Nematocysts.";
        o.lIlI[o.lIlII[111]] = "SLUG_2";
        o.lIlI[o.lIlII[112]] = "Why has the museum never examined a live sea slug?";
        o.lIlI[o.lIlII[113]] = "The researchers keep vanishing.";
        o.lIlI[o.lIlII[114]] = "SLUG_3";
        o.lIlI[o.lIlII[115]] = "What do we think the sea slug feeds upon?";
        o.lIlI[o.lIlII[116]] = "Seaweed.";
        o.lIlI[o.lIlII[117]] = "SLUG_4";
        o.lIlI[o.lIlII[118]] = "What are the two fangs presumed to be used for?";
        o.lIlI[o.lIlII[119]] = "Defense or display.";
        o.lIlI[o.lIlII[120]] = "SLUG_5";
        o.lIlI[o.lIlII[121]] = "Off of which coastline would you find sea slugs?";
        o.lIlI[o.lIlII[122]] = "Ardougne.";
        o.lIlI[o.lIlII[123]] = "SLUG_6";
        o.lIlI[o.lIlII[124]] = "In what way are sea slugs similar to snails?";
        o.lIlI[o.lIlII[125]] = "They have a hard shell.";
        o.lIlI[o.lIlII[126]] = "MONKEY_1";
        o.lIlI[o.lIlII[127]] = "Which type of primates do monkeys belong to?";
        o.lIlI[o.lIlII[128]] = "Simian.";
        o.lIlI[o.lIlII[129]] = "MONKEY_2";
        o.lIlI[o.lIlII[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        o.lIlI[o.lIlII[131]] = "Harmless.";
        o.lIlI[o.lIlII[132]] = "MONKEY_3";
        o.lIlI[o.lIlII[133]] = "Monkeys love bananas. What else do they like to eat?";
        o.lIlI[o.lIlII[134]] = "Bitternuts.";
        o.lIlI[o.lIlII[135]] = "MONKEY_4";
        o.lIlI[o.lIlII[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        o.lIlI[o.lIlII[137]] = "Harmless.";
        o.lIlI[o.lIlII[138]] = "MONKEY_5";
        o.lIlI[o.lIlII[139]] = "What colour mohawk do Karamjan monkeys have?";
        o.lIlI[o.lIlII[140]] = "Red.";
        o.lIlI[o.lIlII[141]] = "MONKEY_6";
        o.lIlI[o.lIlII[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        o.lIlI[o.lIlII[143]] = "Seaweed.";
        o.lIlI[o.lIlII[144]] = "KALPHITE_1";
        o.lIlI[o.lIlII[145]] = "Kalphites are ruled by a...?";
        o.lIlI[o.lIlII[146]] = "Pasha.";
        o.lIlI[o.lIlII[147]] = "KALPHITE_2";
        o.lIlI[o.lIlII[148]] = "What is the lowest caste in kalphite society?";
        o.lIlI[o.lIlII[149]] = "Worker.";
        o.lIlI[o.lIlII[150]] = "KALPHITE_3";
        o.lIlI[o.lIlII[151]] = "What are the armoured plates on a kalphite called?";
        o.lIlI[o.lIlII[152]] = "Lamellae.";
        o.lIlI[o.lIlII[153]] = "KALPHITE_4";
        o.lIlI[o.lIlII[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        o.lIlI[o.lIlII[155]] = "Carnivores.";
        o.lIlI[o.lIlII[156]] = "KALPHITE_5";
        o.lIlI[o.lIlII[157]] = "What are kalphites assumed to have evolved from?";
        o.lIlI[o.lIlII[158]] = "Scarab beetles.";
        o.lIlI[o.lIlII[159]] = "KALPHITE_6";
        o.lIlI[o.lIlII[160]] = "Name the prominent figure in kalphite mythology?";
        o.lIlI[o.lIlII[161]] = "Scabaras.";
        o.lIlI[o.lIlII[162]] = "TERRORBIRD_1";
        o.lIlI[o.lIlII[163]] = "What is a terrorbird's preferred food?";
        o.lIlI[o.lIlII[164]] = "Anything.";
        o.lIlI[o.lIlII[165]] = "TERRORBIRD_2";
        o.lIlI[o.lIlII[166]] = "Who use terrorbirds as mounts?";
        o.lIlI[o.lIlII[167]] = "Gnomes.";
        o.lIlI[o.lIlII[168]] = "TERRORBIRD_3";
        o.lIlI[o.lIlII[169]] = "Where do terrorbirds get most of their water?";
        o.lIlI[o.lIlII[170]] = "Eating plants.";
        o.lIlI[o.lIlII[171]] = "TERRORBIRD_4";
        o.lIlI[o.lIlII[172]] = "How many claws do terrorbirds have?";
        o.lIlI[o.lIlII[173]] = "Four.";
        o.lIlI[o.lIlII[174]] = "TERRORBIRD_5";
        o.lIlI[o.lIlII[175]] = "What do terrorbirds eat to aid digestion?";
        o.lIlI[o.lIlII[176]] = "Stones.";
        o.lIlI[o.lIlII[177]] = "TERRORBIRD_6";
        o.lIlI[o.lIlII[178]] = "How many teeth do terrorbirds have?";
        o.lIlI[o.lIlII[179]] = "0.";
        o.lIlI[o.lIlII[180]] = "PENGUIN_1";
        o.lIlI[o.lIlII[181]] = "Which sense do penguins rely on when hunting?";
        o.lIlI[o.lIlII[182]] = "Sight.";
        o.lIlI[o.lIlII[183]] = "PENGUIN_2";
        o.lIlI[o.lIlII[184]] = "Which skill seems unusual for the penguins to possess?";
        o.lIlI[o.lIlII[185]] = "Planning.";
        o.lIlI[o.lIlII[186]] = "PENGUIN_3";
        o.lIlI[o.lIlII[187]] = "How do penguins keep warm?";
        o.lIlI[o.lIlII[188]] = "A layer of fat.";
        o.lIlI[o.lIlII[189]] = "PENGUIN_4";
        o.lIlI[o.lIlII[190]] = "What is the preferred climate for penguins?";
        o.lIlI[o.lIlII[191]] = "Cold.";
        o.lIlI[o.lIlII[192]] = "PENGUIN_5";
        o.lIlI[o.lIlII[193]] = "Describe the behaviour of penguins?";
        o.lIlI[o.lIlII[194]] = "Social.";
        o.lIlI[o.lIlII[195]] = "PENGUIN_6";
        o.lIlI[o.lIlII[196]] = "When do penguins fast?";
        o.lIlI[o.lIlII[197]] = "During breeding.";
        o.lIlI[o.lIlII[198]] = "MOLE_1";
        o.lIlI[o.lIlII[199]] = "What habitat do moles prefer?";
        o.lIlI[o.lIlII[200]] = "Subterranean.";
        o.lIlI[o.lIlII[201]] = "MOLE_2";
        o.lIlI[o.lIlII[202]] = "Why are moles considered to be an agricultural pest?";
        o.lIlI[o.lIlII[203]] = "They dig holes.";
        o.lIlI[o.lIlII[204]] = "MOLE_3";
        o.lIlI[o.lIlII[205]] = "Who discovered giant moles?";
        o.lIlI[o.lIlII[206]] = "Wyson the Gardener.";
        o.lIlI[o.lIlII[207]] = "MOLE_4";
        o.lIlI[o.lIlII[208]] = "What would you call a group of young moles?";
        o.lIlI[o.lIlII[209]] = "A labour.";
        o.lIlI[o.lIlII[210]] = "MOLE_5";
        o.lIlI[o.lIlII[211]] = "What is a mole's favourite food?";
        o.lIlI[o.lIlII[212]] = "Insects and other invertebrates.";
        o.lIlI[o.lIlII[213]] = "MOLE_6";
        o.lIlI[o.lIlII[214]] = "Which family do moles belong to?";
        o.lIlI[o.lIlII[215]] = "The Talpidae family.";
        o.lIlI[o.lIlII[216]] = "CAMEL_1";
        o.lIlI[o.lIlII[217]] = "What is produced by feeding chilli to a camel?";
        o.lIlI[o.lIlII[218]] = "Toxic dung.";
        o.lIlI[o.lIlII[219]] = "CAMEL_2";
        o.lIlI[o.lIlII[220]] = "If an ugthanki has one, how many does a bactrian have?";
        o.lIlI[o.lIlII[221]] = "Two.";
        o.lIlI[o.lIlII[222]] = "CAMEL_3";
        o.lIlI[o.lIlII[223]] = "Camels: herbivore, carnivore or omnivore?";
        o.lIlI[o.lIlII[224]] = "Omnivore.";
        o.lIlI[o.lIlII[225]] = "CAMEL_4";
        o.lIlI[o.lIlII[226]] = "What is the usual mood for a camel?";
        o.lIlI[o.lIlII[227]] = "Annoyed.";
        o.lIlI[o.lIlII[228]] = "CAMEL_5";
        o.lIlI[o.lIlII[229]] = "Where would you find an ugthanki?";
        o.lIlI[o.lIlII[230]] = "Al Kharid.";
        o.lIlI[o.lIlII[231]] = "CAMEL_6";
        o.lIlI[o.lIlII[232]] = "Which camel byproduct is known to be very nutritious?";
        o.lIlI[o.lIlII[233]] = "Milk.";
        o.lIlI[o.lIlII[234]] = "LEECH_1";
        o.lIlI[o.lIlII[235]] = "What is the favoured habitat of leeches?";
        o.lIlI[o.lIlII[236]] = "Water.";
        o.lIlI[o.lIlII[237]] = "LEECH_2";
        o.lIlI[o.lIlII[238]] = "What shape is the inside of a leech's mouth?";
        o.lIlI[o.lIlII[239]] = "'Y'-shaped.";
        o.lIlI[o.lIlII[240]] = "LEECH_3";
        o.lIlI[o.lIlII[241]] = "Which of these is not eaten by leeches?";
        o.lIlI[o.lIlII[242]] = "Apples.";
        o.lIlI[o.lIlII[243]] = "LEECH_4";
        o.lIlI[o.lIlII[244]] = "What contributed to the giant growth of Morytanian leeches?";
        o.lIlI[o.lIlII[245]] = "Environment.";
        o.lIlI[o.lIlII[246]] = "LEECH_5";
        o.lIlI[o.lIlII[247]] = "What is special about Morytanian leeches?";
        o.lIlI[o.lIlII[248]] = "They attack by jumping.";
        o.lIlI[o.lIlII[249]] = "LEECH_6";
        o.lIlI[o.lIlII[250]] = "How does a leech change when it feeds?";
        o.lIlI[o.lIlII[251]] = "It doubles in size.";
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean llIlIlI(Object object) {
        return object != null;
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

        return String.valueOf(lllllIIIllIIlII);
    }
}

