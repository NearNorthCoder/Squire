/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.corp.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Entering house portal", priority=100, blocking=true)
public class EnteringHousePortalTask
extends Task {

    public boolean run() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((var1[1].equals(tileObject.getName( != 0)) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[2];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0xA1 ^ 0x9F) & ~(0x1C ^ 0x22)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if tileObject2 == null {
            return 0;
        }
        tileObject2.interact(var1[0]);
        return 1;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

}

