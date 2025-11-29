/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.zulrah.tasks;

import java.util.function.Consumer;
import net.runelite.api.Item;
import net.unethicalite.api.widgets.Dialog;

public final class GameEnum4
extends Enum<b> {
    
    public static final  /* enum */ b RING_OF_DUELING;
    
    private final  Consumer<Item> action;
    public static final  /* enum */ b CONSTRUCTION_CAPE;
    private static final  b[] $VALUES;
    private final  String name;
    public static final  /* enum */ b HOUSE_TELEPORT;

    private GameEnum4(String string2, Consumer<Item> consumer) {
        this.name = string2;
        this.action = consumer;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var18);
    }

            item.interact(var1[3]);
        });
        HOUSE_TELEPORT = new GameEnum4(var1[7], item -> item.interact(var1[1]));
        CONSTRUCTION_CAPE = new GameEnum4(var1[9], item -> item.interact(var1[0]));
        b[] bArray = new b[3];
        bArray[0] = RING_OF_DUELING;
        bArray[1] = HOUSE_TELEPORT;
        bArray[2] = CONSTRUCTION_CAPE;
        $VALUES = bArray;
    }

    public String k() {
        return this.name;
    }

    public Consumer<Item> l() {
        return this.action;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }
}

