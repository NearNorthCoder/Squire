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
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.FarmerTaskBase;
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
extends FarmerTaskBase {

    private static boolean lllIllIIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        void var1;
        Item item = this.bR.h(n2);
        if (ba.lllIllIIIlIIIl(item)) {
            return lIlllIlIIlII[0];
        }
        if (ba.lllIllIIIlIIlI((Object)var1.aL(), (Object)P.GRAPES) && ba.lllIllIIIlIIll(Vars.getBit((int)var1.aO()))) {
            ba var2;
            int[] nArray = new int[lIlllIlIIlII[1]];
            nArray[ba.lIlllIlIIlII[0]] = lIlllIlIIlII[2];
            Item var3 = Inventory.getFirst((int[])nArray);
            if (ba.lllIllIIIlIIIl(var3)) {
                return lIlllIlIIlII[0];
            }
            Item item2 = var3;
            Objects.requireNonNull(item2);

            var2.a((FarmerManager) ar1, arg_0 -> ((Item)item2).useOn(arg_0));

            return lIlllIlIIlII[1];
        }
        Item item3 = item;
        Objects.requireNonNull(item3);

        return this.a(n2, arg_0 -> ((Item)item3).useOn(arg_0));
    }

    static {
        ba.lllIllIIIlIIII();
    }

    @Inject
    public PlantingSeedInPatchTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, an::be);
    }

    private static boolean lllIllIIIlIIIl(Object object) {
        return object == null;
    }

}

