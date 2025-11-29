/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Planting seed in patch", priority=5, blocking=true)
public class PlantingSeedInPatchTask
extends aX {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        void var2;
        Item item = this.bR.h(n2);
        if item == null {
            return 0;
        }
        if (((Object)var2.aL() == (Object)var2.aL()2)P.GRAPES) && (Vars.getBit((int == 0)var2.aO()))) {
            ba var3;
            int[] nArray = new int[1];
            nArray[0] = 2;
            Item var4 = Inventory.getFirst((int[])nArray);
            if var4 == null {
                return 0;
            }
            Item item2 = var4;
            Objects.requireNonNull(item2);
            0;
            var3.a((N)var2, arg_0 -> ((Item)item2).useOn(arg_0));
            0;
            return 1;
        }
        Item item3 = item;
        Objects.requireNonNull(item3);
        0;
        return this.a(n2, arg_0 -> ((Item)item3).useOn(arg_0));
    }

    static {
        ba.var5();
    }

    @Inject
    public PlantingSeedInPatchTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, an::be);
    }

}

