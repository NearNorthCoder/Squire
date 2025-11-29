/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Picking up sword", priority=300, blocking=true)
public class PickingUpSwordTask
extends GiantsfoundryTaskBase {

    private static void var3() {
        var1 = new String[var2[2]];
        w.var1[w.var2[0]] = "Pick-up";
        w.var1[w.var2[1]] = "Pick-up";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean M() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[var2[1]];
            stringArray[w.var2[0]] = var1[var2[1]];
            return tileObject.hasAction(stringArray);
        });
        if (w.var4(tileObject2)) {
            return var2[0];
        }
        tileObject2.interact(var1[var2[0]]);
        return var2[1];
    }

    static {
        w.var11();
        w.var3();
    }

    @Inject
    public PickingUpSwordTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void var11() {
        var2 = new int[3];
        w.var2[0] = (0x39 ^ 3) & ~(0x6E ^ 0x54);
        w.var2[1] = 1;
        w.var2[2] = 2;
    }
}

