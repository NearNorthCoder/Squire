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
import java.util.Map;
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
    private static  int[] lIlII;
    public static final  /* enum */ o SNAKE_2;
    private static  String[] lIlI;
    public static final  /* enum */ o MOLE_1;
    public static final  /* enum */ o MONKEY_1;
    public static final  /* enum */ o WYVERN_6;
    public static final  /* enum */ o TORTOISE_5;
    public static final  /* enum */ o TORTOISE_3;
    public static final  /* enum */ o CAMEL_3;
    public static final  /* enum */ o DRAGON_3;
    public static final  /* enum */ o TORTOISE_1;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    
            MATCHES = builder.build();
        }
    }

    public String aZ() {
        return this.question;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
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
            if (((0xE ^ 6) & ~(0x2E ^ 0x26)) == 0) continue;
            return null;
        }
        return null;
    }

    public String ba() {
        return this.answer;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    private static String llIIIl(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = 0;
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = 0;
        while (var29 < var28) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (-1 < (140 + 41 - 132 + 127 ^ 44 + 110 - 90 + 116)) continue;
            return null;
        }
        return String.valueOf(var24);
    }
}

