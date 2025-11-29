/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying plant cure", priority=6, blocking=true)
public class ApplyingPlantCureTask
extends aX {

    @Inject
    public ApplyingPlantCureTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (((Object)an2.aZ() == (Object)an2.aZ()2)n.DISEASED)) {
                bl = 3;
                0;
                if (-(0x4D ^ 0x49) >= 0) {
                    return ((0xE5 ^ 0xB1) & ~(0x12 ^ 0x46)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
    }

    static {
        aV.var2();
    }

    @Override
    public boolean J(N n2) {
        int[] nArray = new int[0];
        nArray[1] = 2;
        nArray[3] = 4;
        Item item = Inventory.getFirst((int[])nArray);
        if item == null {
            return 1;
        }
        Item item2 = item;
        Objects.requireNonNull(item2);
        0;
        return this.a(n2, arg_0 -> ((Item)item2).useOn(arg_0));
    }

}

