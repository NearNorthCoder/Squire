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
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying plant cure", priority=6, blocking=true)
public class ApplyingPlantCureTask
extends FarmerTaskBase {

    @Inject
    public ApplyingPlantCureTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (aV.lllIlIllllllII((Object)an2.aZ(), (Object)n.DISEASED)) {
                bl = lIlllIIllllI[3];

                if (-(0x4D ^ 0x49) >= 0) {
                    return false;
                }
            } else {
                bl = lIlllIIllllI[1];
            }
            return bl;
        });
    }

    static {
        aV.lllIlIlllllIlI();
    }

    @Override
    public boolean J(N n2) {
        int[] nArray = new int[lIlllIIllllI[0]];
        nArray[aV.lIlllIIllllI[1]] = lIlllIIllllI[2];
        nArray[aV.lIlllIIllllI[3]] = lIlllIIllllI[4];
        Item item = Inventory.getFirst((int[])nArray);
        if (aV.lllIlIlllllIll(item)) {
            return lIlllIIllllI[1];
        }
        Item item2 = item;
        Objects.requireNonNull(item2);

        return this.a(n2, arg_0 -> ((Item)item2).useOn(arg_0));
    }

    private static boolean lllIlIllllllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIlIlllllIll(Object object) {
        return object == null;
    }
}

