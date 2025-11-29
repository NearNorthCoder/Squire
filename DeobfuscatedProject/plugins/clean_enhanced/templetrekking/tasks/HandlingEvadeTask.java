/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Handling evade")
public class HandlingEvadeTask
extends TempletrekkingTaskBase {

    static {
        w.var3();
        w.var4();
    }

    @Inject
    protected HandlingEvadeTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[var1[0]];
        nArray[w.var1[1]] = var1[2];
        nArray[w.var1[2]] = var1[3];
        nArray[w.var1[3]] = var1[4];
        nArray[w.var1[4]] = var1[5];
        nArray[w.var1[5]] = var1[6];
        nArray[w.var1[6]] = var1[7];
        nArray[w.var1[7]] = var1[8];
        nArray[w.var1[9]] = var1[10];
        super(templeTrekkingPlugin, nArray);
    }

    private static void var3() {
        var1 = new int[11];
        w.var1[0] = 8 + 153 - 113 + 126 ^ 141 + 49 - 101 + 77;
        w.var1[1] = (0x8D ^ 0xA4) & ~(0xEE ^ 0xC7);
        w.var1[2] = 1;
        w.var1[3] = 2;
        w.var1[4] = 3;
        w.var1[5] = 0x54 ^ 0x50;
        w.var1[6] = 0x8F ^ 0x8A;
        w.var1[7] = 0xF9 ^ 0xA3 ^ (6 ^ 0x5A);
        w.var1[8] = 0x45 ^ 0x4F;
        w.var1[9] = 0xAC ^ 0xB3 ^ (0x8A ^ 0x92);
        w.var1[10] = 0x34 ^ 0x38;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        w.var2[w.var1[1]] = "Evade-event";
        w.var2[w.var1[2]] = "Evade-event";
    }

    @Override
    public boolean z() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[var1[2]];
            stringArray[w.var1[1]] = var2[var1[2]];
            return tileObject.hasAction(stringArray);
        });
        if (w.var5(tileObject2)) {
            return var1[1];
        }
        tileObject2.interact(var2[var1[1]]);
        return var1[2];
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var5(Object object) {
        return object == null;
    }
}

