/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching item", priority=100)
public class AlchingItemTask
extends Task {

    private static final  List<String> ai;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        v.var9();
        v.var10();
        String[] stringArray = new String[2];
        stringArray[0] = var2[0];
        stringArray[1] = var2[1];
        stringArray[3] = var2[3];
        stringArray[4] = var2[4];
        stringArray[5] = var2[5];
        stringArray[6] = var2[6];
        stringArray[7] = var2[7];
        stringArray[8] = var2[8];
        stringArray[9] = var2[9];
        stringArray[v.var1[10]] = var2[var1[10]];
        stringArray[v.var1[11]] = var2[var1[11]];
        stringArray[v.var1[12]] = var2[var1[12]];
        stringArray[v.var1[13]] = var2[var1[13]];
        ai = List.of(stringArray);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item2 = Inventory.getFirst(item -> ai.contains(item.getName()));
        if item2 == null {
            return 0;
        }
        SpellBook.Standard var17 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if ((var17.canCast( == 0) ? 1 : 0)) {
            return 0;
        }
        Magic.cast((Spevar2_2);
        item2.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), item2.getSlot(), WidgetInfo.INVENTORY.getId());
        return 1;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 0;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 0;
        while (var26 < var25) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0x4C ^ 0x2B ^ (0xB ^ 0x69)) > 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

