/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum60;
import gg.squire.farmer.tasks.GameEnum40;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Seeding birdhouse", priority=5)
public class SeedingBirdhouseTask
extends FarmerTaskBase {

    private static void lllIlllIIIlllI() {
        lIllllIIlIll = new String[lIllllIIllII[0]];
        aJ.lIllllIIlIll[aJ.lIllllIIllII[1]] = "seed";
    }

    private static boolean lllIlllIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lllIlllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected SeedingBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[lIllllIIllII[0]];
        fArray[aJ.lIllllIIllII[1]] = F.BUILT;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static boolean lllIlllIIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!aJ.lllIlllIIlIIII(tileObject) || aJ.lllIlllIIlIIIl(tileObject.distanceTo((Locatable)Players.getLocal()), lIllllIIllII[2])) {
            return lIllllIIllII[1];
        }
        Item var1 = Inventory.getFirst(item -> {
            int n2;
            if (aJ.lllIlllIIlIIlI(item.isStackable() ? 1 : 0) && aJ.lllIlllIIlIIlI(item.getName().toLowerCase().contains(lIllllIIlIll[lIllllIIllII[1]]) ? 1 : 0)) {
                n2 = lIllllIIllII[0];

            } else {
                n2 = lIllllIIllII[1];
            }
            return n2 != 0;
        });
        if (aJ.lllIlllIIlIIII(var1)) {
            void var2;
            aJ var3;
            void var4;
            var1.useOn((TileObject)var4);
            var3.cu.Q().add((GameEnum60) ar2);

            return lIllllIIllII[0];
        }
        return lIllllIIllII[1];
    }

    static {
        aJ.lllIlllIIIllll();
        aJ.lllIlllIIIlllI();
    }
}

