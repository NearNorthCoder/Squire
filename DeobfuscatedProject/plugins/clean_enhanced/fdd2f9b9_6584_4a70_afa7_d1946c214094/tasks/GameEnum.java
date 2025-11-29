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
import java.util.Map;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    
            MATCHES = builder.build();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var16;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var17 = 0;
        while ((var17 < (int)var16)) {
            void var18;
            void var19;
            void var20 = var19[var17];
            Widget var21 = Widgets.get((WidgetInfo)var20);
            if (var21 != null && (var21.getText( != 0).equals(var18) ? 1 : 0)) {
                return var21;
            }
            ++var17;
            0;
            if ((87 + 14 - -30 + 29 ^ 134 + 87 - 108 + 51) >= (0xF3 ^ 0xB3 ^ (0x19 ^ 0x5D))) continue;
            return null;
        }
        return null;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = 0;
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = 0;
        while (var30 < var29) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (1 != -1) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public String O() {
        return this.question;
    }

    public String P() {
        return this.answer;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }
}

