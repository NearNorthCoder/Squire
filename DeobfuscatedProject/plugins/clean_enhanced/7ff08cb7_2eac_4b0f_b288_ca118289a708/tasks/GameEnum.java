/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i CAMEL_5;
    public static final  /* enum */ i SNAIL_5;
    public static final  /* enum */ i KALPHITE_2;
    public static final  /* enum */ i WYVERN_1;
    public static final  /* enum */ i KALPHITE_4;
    public static final  /* enum */ i SLUG_6;
    public static final  /* enum */ i TORTOISE_3;
    public static final  /* enum */ i TERRORBIRD_3;
    public static final  /* enum */ i SNAIL_4;
    public static final  /* enum */ i PENGUIN_5;
    public static final  /* enum */ i MOLE_2;
    public static final  /* enum */ i MOLE_4;
    public static final  /* enum */ i LIZARD_3;
    public static final  /* enum */ i LIZARD_2;
    public static final  /* enum */ i TORTOISE_5;
    private static  int[] llllllllI;
    public static final  /* enum */ i KALPHITE_6;
    public static final  /* enum */ i SNAKE_3;
    public static final  /* enum */ i CAMEL_2;
    public static final  /* enum */ i DRAGON_1;
    public static final  /* enum */ i LIZARD_6;
    public static final  /* enum */ i SLUG_4;
    public static final  /* enum */ i SLUG_1;
    public static final  /* enum */ i TORTOISE_1;
    public static final  /* enum */ i PENGUIN_2;
    public static final  /* enum */ i MONKEY_1;
    public static final  /* enum */ i WYVERN_2;
    public static final  /* enum */ i SLUG_3;
    public static final  /* enum */ i LEECH_6;
    public static final  /* enum */ i DRAGON_2;
    public static final  /* enum */ i WYVERN_4;
    public static final  /* enum */ i MONKEY_6;
    public static final  /* enum */ i SNAIL_3;
    public static final  /* enum */ i LEECH_5;
    public static final  /* enum */ i PENGUIN_3;
    private final  String question;
    private static  String[] llllllIIl;
    public static final  /* enum */ i CAMEL_4;
    public static final  /* enum */ i DRAGON_3;
    public static final  /* enum */ i PENGUIN_6;
    public static final  /* enum */ i MONKEY_3;
    private static final  i[] $VALUES;
    public static final  /* enum */ i TORTOISE_2;
    public static final  /* enum */ i LEECH_4;
    public static final  /* enum */ i SNAIL_6;
    public static final  /* enum */ i SLUG_2;
    public static final  /* enum */ i CAMEL_6;
    public static final  /* enum */ i PENGUIN_4;
    private final  String answer;
    public static final  /* enum */ i LEECH_3;
    public static final  /* enum */ i TERRORBIRD_4;
    public static final  /* enum */ i TERRORBIRD_5;
    public static final  /* enum */ i SNAKE_2;
    public static final  /* enum */ i WYVERN_5;
    public static final  /* enum */ i LIZARD_1;
    public static final  /* enum */ i TERRORBIRD_1;
    public static final  /* enum */ i TORTOISE_4;
    public static final  /* enum */ i LEECH_1;
    public static final  /* enum */ i TERRORBIRD_6;
    public static final  /* enum */ i KALPHITE_5;
    public static final  /* enum */ i MOLE_6;
    public static final  /* enum */ i LIZARD_4;
    public static final  /* enum */ i MONKEY_4;
    public static final  /* enum */ i SNAIL_1;
    public static final  /* enum */ i TORTOISE_6;
    public static final  /* enum */ i MOLE_5;
    public static final  /* enum */ i KALPHITE_1;
    public static final  /* enum */ i SNAIL_2;
    public static final  /* enum */ i SNAKE_1;
    public static final  /* enum */ i LEECH_2;
    public static final  /* enum */ i DRAGON_5;
    public static final  /* enum */ i DRAGON_4;
    public static final  /* enum */ i LIZARD_5;
    public static final  /* enum */ i DRAGON_6;
    public static final  /* enum */ i MOLE_1;
    public static final  /* enum */ i SNAKE_6;
    public static final  /* enum */ i SNAKE_4;
    public static final  /* enum */ i WYVERN_6;
    public static final  /* enum */ i TERRORBIRD_2;
    public static final  /* enum */ i CAMEL_1;
    public static final  /* enum */ i MOLE_3;
    public static final  /* enum */ i KALPHITE_3;
    public static final  /* enum */ i SLUG_5;
    public static final  /* enum */ i MONKEY_2;
    public static final  /* enum */ i CAMEL_3;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ i WYVERN_3;
    public static final  /* enum */ i SNAKE_5;
    public static final  /* enum */ i MONKEY_5;
    public static final  /* enum */ i PENGUIN_1;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    public String aa() {
        return this.question;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var1;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var2 = 0;
        while ((var2 < (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            Widget var6 = Widgets.get((WidgetInfo)var5);
            if (var6 != null && (var6.getText( != 0).equals(var3) ? 1 : 0)) {
                return var6;
            }
            ++var2;
            0;
            if ((0x22 ^ 0x79 ^ (0xFB ^ 0xA5)) > 0) continue;
            return null;
        }
        return null;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public String ab() {
        return this.answer;
    }

    /*
     * WARNING - void declaration
     */
    
            MATCHES = builder.build();
        }
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
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
            if (((0x61 ^ 0x35) & ~(0x23 ^ 0x77)) != (0x6E ^ 0x6A)) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }
}

