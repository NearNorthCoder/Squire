/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Reloading cannon")
public class ReloadingCannonTask
extends Task {
    private final  CannonReloader bQ;
    private static  int[] lllIIIll;
    private static final  int bP;
    private  int bR;

    static {
        K.var1();
        bP = 4;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        K var2;
        if ((this.bQ.aA( == 0) ? 1 : 0)) {
            return 2;
        }
        if ((var2.bQ.az() > var2.bR)) {
            return 2;
        }
        int[] nArray = new int[3];
        nArray[2] = 4;
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if var3 == null {
            return 2;
        }
        int[] nArray2 = new int[5];
        nArray2[2] = 5;
        nArray2[3] = 6;
        Item var4 = Inventory.getFirst((int[])nArray2);
        if var4 == null {
            return 2;
        }
        var2_2.useOn((TileObject)var1_1);
        this.bR = Rand.nextInt((int)0, (int)1);
        return 3;
    }

    @Inject
    public ReloadingCannonTask(CannonReloader cannonReloader) {
        this.bR = Rand.nextInt((int)0, (int)1);
        this.bQ = cannonReloader;
    }
}

