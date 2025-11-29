/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Farming", priority=21002, blocking=true)
public class PrepFarmingTask
extends CoxTaskBase {
    private final  int ek = 7603;
    
    private final  int ej = 29742;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_2;
        void var1_1;
        int[] nArray = new int[lIlIlIIllIll[2]];
        nArray[bf.lIlIlIIllIll[3]] = lIlIlIIllIll[4];
        if (bf.llIlllIlIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlIIllIll[3];
        }
        int[] nArray2 = new int[lIlIlIIllIll[2]];
        nArray2[bf.lIlIlIIllIll[3]] = lIlIlIIllIll[5];
        Item var1 = Inventory.getFirst((int[])nArray2);
        if (bf.llIlllIlIlIlIl(var1)) {
            return lIlIlIIllIll[3];
        }
        int[] nArray3 = new int[lIlIlIIllIll[2]];
        nArray3[bf.lIlIlIIllIll[3]] = lIlIlIIllIll[6];
        TileObject var2 = TileObjects.getNearest((int[])nArray3);
        if (bf.llIlllIlIlIlIl(var2)) {
            return lIlIlIIllIll[3];
        }
        var1_1.useOn((TileObject)var2_2);
        return lIlIlIIllIll[2];
    }

    @Inject
    protected PrepFarmingTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ej = lIlIlIIllIll[0];
        this.ek = lIlIlIIllIll[1];
    }

    private static boolean llIlllIlIlIlIl(Object object) {
        return object == null;
    }

    private static boolean llIlllIlIlIlII(int n2) {
        return n2 == 0;
    }

    static {
        bf.llIlllIlIlIIll();
    }
}

