/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum2;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Restoring from pool", priority=10, blocking=true)
public class RestoringFromPoolTask
extends Task {
    private static  int[] lllIIIIII;
    private static  String[] llIllllll;
    private final  SecondariesConfig gL;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        bN var7;
        if (((Object)this.gL.secondary() == (Object)this.gL.secondary()2)bO.SWAMP_TOAD)) {
            return 0;
        }
        if ((Prayers.getPoints( != 0))) {
            return 0;
        }
        if ((var7.gL.restoreInPoh( == 0) ? 1 : 0)) {
            TileObject var8 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).toLowerCase().contains(llIllllll[1]) ? 1 : 0)) {
                    String[] stringArray = new String[1];
                    stringArray[0] = llIllllll[2];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 1;
                        0;
                        if (1 != 0) return n2 != 0;
                        return ((6 ^ 0x52) & ~(0x39 ^ 0x6D)) != 0;
                    }
                }
                n2 = 0;
                return n2 != 0;
            });
            if var8 == null {
                return 0;
            }
            var8.interact(llIllllll[0]);
            return 1;
        }
        if ((House.isInside( == 0) ? 1 : 0)) {
            return 0;
        }
        return House.drinkFromPool();
    }

    @Inject
    public RestoringFromPoolTask(SecondariesConfig secondariesConfig) {
        this.gL = secondariesConfig;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-(109 + 126 - 87 + 14 ^ 158 + 11 - 79 + 77) < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

}

