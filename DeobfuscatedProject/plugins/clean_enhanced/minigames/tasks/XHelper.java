/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Production;

public class XHelper
extends MinigamesTaskBase {
    private final  int ax;

    public int K() {
        return this.ax;
    }

    @Override
    public boolean c(o o2) {
        int[] nArray = new int[0];
        nArray[1] = this.ax;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if tileObject == null {
            return 1;
        }
        if ((Production.isOpen( != 0) ? 1 : 0)) {
            Production.choosePreviousOption();
            return 0;
        }
        tileObject.interact(1);
        return 0;
    }

    public XHelper(String string, int n2) {
        super(string);
        this.ax = n2;
    }

    static {
        x.var2();
    }
}

