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
    
    private  int cs;

    private static boolean lllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        Y.lllIllIIIl();
    }

    private static boolean lllIllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIlIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Y llIIllIIlIIllII;
        void llIIllIIlIIlIll;
        int n2 = Static.getClient().getTickCount();
        if (!Y.lllIllIIlI(Players.getLocal().isAnimating() ? 1 : 0) || Y.lllIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            llIIllIIlIIllII.cs = llIIllIIlIIlIll;
        }
        if (Y.lllIllIlII((int)(llIIllIIlIIlIll - llIIllIIlIIllII.cs), lIIIlIIII[0])) {
            return lIIIlIIII[1];
        }
        if (Y.lllIllIIll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            llIIllIIlIIllII.cs = llIIllIIlIIlIll;
            return lIIIlIIII[2];
        }
        int[] nArray = new int[lIIIlIIII[2]];
        nArray[Y.lIIIlIIII[1]] = lIIIlIIII[3];
        TileObject llIIllIIlIIlIlI = TileObjects.getNearest((int[])nArray);
        if (Y.lllIllIlIl(llIIllIIlIIlIlI)) {
            return lIIIlIIII[1];
        }
        var2_2.interact(lIIIlIIII[3], MenuAction.GAME_OBJECT_SECOND_OPTION.getId(), var2_2.menuPoint().getX(), var2_2.menuPoint().getY());
        return lIIIlIIII[2];
    }
}

