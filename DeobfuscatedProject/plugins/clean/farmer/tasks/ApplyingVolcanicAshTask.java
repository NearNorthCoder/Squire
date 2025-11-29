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

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying volcanic ash", priority=30, blocking=true)
public class ApplyingVolcanicAshTask
extends FarmerTaskBase {

    private static boolean lllIllIIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIIIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var1);
    }

    @Inject
    public ApplyingVolcanicAshTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIllIIlIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lllIllIIIlllII() {
        lIlllIlIlIIl = new String[lIlllIlIlIlI[1]];
        aM.lIlllIlIlIIl[aM.lIlllIlIlIlI[0]] = "Giant";
    }

    private static boolean lllIllIIlIIIIl(Object object) {
        return object == null;
    }

    static {
        aM.lllIllIIIlllIl();
        aM.lllIllIIIlllII();
    }

    private static boolean lllIllIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(TileObject tileObject) {
        void var2;
        int var3;
        int n2;
        void var4;
        Item item2 = Inventory.getFirst(item -> {
            boolean bl;
            if (aM.lllIllIIlIIlII(item.getId(), lIlllIlIlIlI[4])) {
                bl = lIlllIlIlIlI[1];

                if ((0x23 ^ 0x27) <= ((0x78 ^ 0x5D) & ~(0x71 ^ 0x54))) {
                    return false;
                }
            } else {
                bl = lIlllIlIlIlI[0];
            }
            return bl;
        });
        if (aM.lllIllIIlIIIIl(item2)) {
            return lIlllIlIlIlI[0];
        }
        if (aM.lllIllIIlIIIlI(var4.getName().contains(lIlllIlIlIIl[lIlllIlIlIlI[0]]) ? 1 : 0)) {
            n2 = lIlllIlIlIlI[2];

            }
        } else {
            n2 = var3 = lIlllIlIlIlI[3];
        }
        if (aM.lllIllIIlIIIll(var2.getQuantity(), var3)) {
            return lIlllIlIlIlI[0];
        }
        item2.useOn(tileObject);
        return lIlllIlIlIlI[1];
    }

    private static boolean lllIllIIlIIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        int n3;
        void var5;
        if (aM.lllIllIIIllllI(this.bS.applyVolcanicAsh() ? 1 : 0)) {
            return lIlllIlIlIlI[0];
        }
        an var6 = var5.aI();
        au var7 = var6.aY();
        if (aM.lllIllIIIlllll((Object)var6.aZ(), (Object)n.HARVESTABLE) && (!aM.lllIllIIlIIIII((Object)var7, (Object)au.SUPERCOMPOST) || aM.lllIllIIIlllll((Object)var7, (Object)au.GIANT_SUPERCOMPOST))) {
            n3 = lIlllIlIlIlI[1];

            if (1 <= 0) {
                return ((0x27 ^ 0x49 ^ (0x37 ^ 0x6A)) & (82 + 58 - 72 + 80 ^ 71 + 45 - -24 + 27 ^ -1)) != 0;
            }
        } else {
            n3 = lIlllIlIlIlI[0];
        }
        return n3 != 0;
    }
}

