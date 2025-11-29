/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.WintertodtManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering Wintertodt Area", priority=1)
public class EnteringWintertodtAreaTask
extends Task {
    
    private final  b B;
    private static final  WorldPoint A;
    private static final  int z;
    private final  SquireWintertodtConfig C;

    @Inject
    public EnteringWintertodtAreaTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.B = b2;
        this.C = squireWintertodtConfig;
    }

    static {
        e.var3();
        e.var4();
        z = 2;
        A = new WorldPoint(4, 5, 0);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!(Movement.shouldWalk( != 0) ? 1 : 0) || (this.B.i( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileObject var11 = TileObjects.getNearest((int[])nArray);
        if var11 == null {
            e var12;
            Movement.walk((WorldPoint)A);
            var12.sleep(1);
            return 0;
        }
        var1_1.interact(var2[0]);
        this.sleep(3);
        return 1;
    }
}

