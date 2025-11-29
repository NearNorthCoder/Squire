/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.MenuAction
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Production
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.MenuAction;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Production;
import net.unethicalite.client.Static;

@TaskDesc(name="Making molten glass")
public class MakingMoltenGlassTask
extends Task {
    private static  int[] lIIIlIIII;
    private  int cs;

    static {
        Y.var1();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Y var2;
        void var3;
        int n2 = Static.getClient().getTickCount();
        if (!(Players.getLocal( == 0).isAnimating() ? 1 : 0) || (Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            var2.cs = var3;
        }
        if (((int)(var3 - var2.cs) < 0)) {
            return 1;
        }
        if ((Production.isOpen( != 0) ? 1 : 0)) {
            Production.choosePreviousOption();
            var2.cs = var3;
            return 2;
        }
        int[] nArray = new int[2];
        nArray[1] = 3;
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if var4 == null {
            return 1;
        }
        var2_2.interact(3, MenuAction.GAME_OBJECT_SECOND_OPTION.getId(), var2_2.menuPoint().getX(), var2_2.menuPoint().getY());
        return 2;
    }
}

