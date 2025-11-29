/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpManager;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Teleporting to corp")
public class TeleportingToCorpTask
extends CorpManager {

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
            if (-(0xF ^ 0xA) < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var13;
        if ((this.l( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var13.m( != 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var14 = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(var1[5]));
        if var14 == null {
            return 0;
        }
        if ((Widgets.isVisible(WidgetWidgets.get((int)1, (int)0)) ? 1 : 0)) {
            Keyboard.type((char)2);
            return 3;
        }
        String[] stringArray = new String[3];
        stringArray[0] = var1[0];
        if ((var14.hasAction(stringArray == 0) ? 1 : 0)) {
            var14.interact(var1[3]);
            return 3;
        }
        var1_1.interact(var1[4]);
        return 3;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

}

