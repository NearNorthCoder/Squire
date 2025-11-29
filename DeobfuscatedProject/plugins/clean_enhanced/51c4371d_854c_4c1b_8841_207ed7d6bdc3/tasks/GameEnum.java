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
import java.util.Map;
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
    private static  String[] lllllIII;
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
    private static  int[] lllllllI;
    public static final  /* enum */ h KALPHITE_1;
    public static final  /* enum */ h WYVERN_2;

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
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
        void var14;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var15 = 0;
        while ((var15 < (int)var14)) {
            void var16;
            void var17;
            void var18 = var17[var15];
            Widget var19 = Widgets.get((WidgetInfo)var18);
            if (var19 != null && (var19.getText( != 0).equals(var16) ? 1 : 0)) {
                return var19;
            }
            ++var15;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return null;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = 0;
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = 0;
        while (var34 < var33) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if (1 <= (0x2C ^ 0x27 ^ (0x3C ^ 0x33))) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    public String P() {
        return this.question;
    }

    public String Q() {
        return this.answer;
    }
}

