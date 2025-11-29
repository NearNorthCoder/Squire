/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Production;

public class XHelper
extends MinigamesTaskBase {
    private final  int ax;

    private static boolean llIIllllllllII(Object object) {
        return object == null;
    }

    public int K() {
        return this.ax;
    }

    @Override
    public boolean c(o o2) {
        int[] nArray = new int[lIIllIllllll[0]];
        nArray[x.lIIllIllllll[1]] = this.ax;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (x.llIIllllllllII(tileObject)) {
            return lIIllIllllll[1];
        }
        if (x.llIIllllllllIl(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lIIllIllllll[0];
        }
        tileObject.interact(lIIllIllllll[1]);
        return lIIllIllllll[0];
    }

    public XHelper(String string, int n2) {
        super(string);
        this.ax = n2;
    }

    private static boolean llIIllllllllIl(int n2) {
        return n2 != 0;
    }

    static {
        x.llIIlllllllIll();
    }
}

