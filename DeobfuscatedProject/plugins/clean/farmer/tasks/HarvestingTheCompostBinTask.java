/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Harvesting the compost bin", priority=30, blocking=true)
public class HarvestingTheCompostBinTask
extends FarmerTaskBase {

    private static boolean lllIlllIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean b(TileObject tileObject) {
        Item var1;
        Item item;
        if (aQ.lllIlllIIlIlll(this.bS.bottomless() ? 1 : 0)) {
            int[] nArray = new int[lIllllIIlllI[1]];
            nArray[aQ.lIllllIIlllI[0]] = lIllllIIlllI[2];
            item = Inventory.getFirst((int[])nArray);

            if ((0x3F ^ 0x3B) != (0x94 ^ 0x90)) {
                return false;
            }
        } else {
            int[] nArray = new int[lIllllIIlllI[1]];
            nArray[aQ.lIllllIIlllI[0]] = lIllllIIlllI[3];
            var1 = Inventory.getFirst((int[])nArray);
        }
        if (aQ.lllIlllIIllIII(var1)) {
            return lIllllIIlllI[0];
        }
        item.useOn(tileObject);
        return lIllllIIlllI[1];
    }

    private static boolean lllIlllIIlIlII(Object object) {
        return object != null;
    }

    private static boolean lllIlllIIllIII(Object object) {
        return object == null;
    }

    private static boolean lllIlllIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlllIIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        boolean bl;
        void var2;
        an an2 = n2.aI();
        au au2 = an2.aY();
        H h2 = H.c(au2);
        if (!aQ.lllIlllIIlIlII((Object)h2) || aQ.lllIlllIIlIlIl((Object)h2, (Object)this.bS.compostType())) {
            return lIllllIIlllI[0];
        }
        if (aQ.lllIlllIIlIllI((Object)var2.aZ(), (Object)n.HARVESTABLE)) {
            bl = lIllllIIlllI[1];

            if (((0x71 ^ 0x57 ^ (0x5E ^ 0x43)) & (0x64 ^ 0x2C ^ (0x48 ^ 0x3B) ^ -1)) == 3) {
                return false;
            }
        } else {
            bl = lIllllIIlllI[0];
        }
        return bl;
    }

    static {
        aQ.lllIlllIIlIIll();
    }

    @Inject
    public HarvestingTheCompostBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

}

