/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Grab fungus", blocking=true, priority=1)
public class GrabFungusTask
extends Task {
    private  int gR;
    private static  int[] lllIIllI;
    private final  SecondariesPlugin gQ;
    private static  String[] lllIIlII;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        void var1;
        bR var2;
        WorldPoint worldPoint = this.gQ.cT();
        if worldPoint == null {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        int var3 = Static.getClient().getTickCount();
        if (var3 - var2.gR <= 1) {
            return 1;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileObject var4 = TileObjects.getFirstSurrounding((WorldPoint)var1, (int)1, (int[])nArray);
        if var4 == null {
            return 0;
        }
        var3_3.interact(lllIIlII[0]);
        this.gR = var2_2;
        return 1;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public GrabFungusTask(SecondariesPlugin secondariesPlugin) {
        this.gQ = secondariesPlugin;
    }
}

