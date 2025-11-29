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
import java.util.Map;
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
    private static  String[] lIIIlIllI;
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
    private static  int[] lIIIllIlI;
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

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = 0;
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = 0;
        while (var21 < var20) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((0x24 ^ 0xB ^ (0xD4 ^ 0xAD)) & (2 ^ (0x5D ^ 9) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public String P() {
        return this.answer;
    }

    public String O() {
        return this.question;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var23;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var24 = 0;
        while ((var24 < (int)var23)) {
            void var25;
            void var26;
            void var27 = var26[var24];
            Widget var28 = Widgets.get((WidgetInfo)var27);
            if (var28 != null && (var28.getText( != 0).equals(var25) ? 1 : 0)) {
                return var28;
            }
            ++var24;
            0;
            if ((0x70 ^ 0x74) > -1) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    
            MATCHES = builder.build();
        }
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

