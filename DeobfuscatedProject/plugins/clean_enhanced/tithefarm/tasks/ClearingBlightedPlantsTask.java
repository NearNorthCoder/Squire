/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import gg.squire.tithefarm.tasks.TithefarmManager;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Clearing blighted plants")
public class ClearingBlightedPlantsTask
extends TithefarmTaskBase {

    public boolean run() {
        TileObject tileObject2 = this.Z.a(tileObject -> {
            String[] stringArray = new String[var1[1]];
            stringArray[l.var1[0]] = var2[var1[1]];
            return tileObject.hasAction(stringArray);
        });
        if (l.var3(tileObject2)) {
            return var1[0];
        }
        tileObject2.interact(var2[var1[0]]);
        return var1[1];
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    static {
        l.var10();
        l.var11();
    }

    private static void var11() {
        var2 = new String[var1[2]];
        l.var2[l.var1[0]] = "Clear";
        l.var2[l.var1[1]] = "Clear";
    }

    private static void var10() {
        var1 = new int[3];
        l.var1[0] = (0xB2 ^ 0x94 ^ (0x9E ^ 0x88)) & (86 + 191 - 243 + 207 ^ 162 + 79 - 110 + 62 ^ -1);
        l.var1[1] = 1;
        l.var1[2] = 2;
    }

    @Inject
    protected ClearingBlightedPlantsTask(i i2) {
        super(i2);
    }
}

