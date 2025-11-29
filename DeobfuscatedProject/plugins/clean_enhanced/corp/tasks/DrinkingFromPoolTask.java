/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpManager;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Drinking from pool")
public class DrinkingFromPoolTask
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
            if (1 != 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        j var13;
        if ((this.l( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var13.m( == 0) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        TileObject var14 = TileObjects.getNearest((String[])stringArray);
        if var14 == null {
            return 0;
        }
        var1_1.interact(var2[1]);
        return 1;
    }

}

