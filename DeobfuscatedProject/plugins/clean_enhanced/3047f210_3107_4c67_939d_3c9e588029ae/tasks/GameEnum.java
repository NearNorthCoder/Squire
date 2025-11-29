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
import java.util.Map;
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
            
            return null;
        }
        return String.valueOf(var6);
    }

    public String P() {
        return this.answer;
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    
            MATCHES = builder.build();
        }
    }

    public String O() {
        return this.question;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var32;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var33 = 0;
        while ((var33 < (int)var32)) {
            void var34;
            void var35;
            void var36 = var35[var33];
            Widget var37 = Widgets.get((WidgetInfo)var36);
            if (var37 != null && (var37.getText( != 0).equals(var34) ? 1 : 0)) {
                return var37;
            }
            ++var33;
            0;
            if (((174 + 28 - 78 + 54 ^ 90 + 36 - 117 + 140) & (0x52 ^ 0x30 ^ (0xDC ^ 0x99) ^ -1)) >= -1) continue;
            return null;
        }
        return null;
    }
}

