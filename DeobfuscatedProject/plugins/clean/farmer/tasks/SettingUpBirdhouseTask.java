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

@TaskDesc(name="Setting up birdhouse", priority=5)
public class SettingUpBirdhouseTask
extends FarmerTaskBase {

    private static boolean llllIIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIIIIIIIIIl() {
        lIllllllIIIl = new String[lIllllllIIlI[5]];
        aK.lIllllllIIIl[aK.lIllllllIIlI[1]] = "Build";
        aK.lIllllllIIIl[aK.lIllllllIIlI[0]] = "bird house";
        aK.lIllllllIIIl[aK.lIllllllIIlI[4]] = "logs";
    }

    static {
        aK.llllIIIIIIIIlI();
        aK.llllIIIIIIIIIl();
    }

    private static boolean llllIIIIIIIIll(Object object) {
        return object != null;
    }

    private static boolean llllIIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Inject
    protected SettingUpBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[lIllllllIIlI[0]];
        fArray[aK.lIllllllIIlI[1]] = F.EMPTY;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static boolean llllIIIIIIIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!aK.llllIIIIIIIIll(tileObject) || aK.llllIIIIIIIlII(tileObject.distanceTo((Locatable)Players.getLocal()), lIllllllIIlI[2])) {
            return lIllllllIIlI[1];
        }
        int[] nArray = new int[lIllllllIIlI[0]];
        nArray[aK.lIllllllIIlI[1]] = lIllllllIIlI[3];
        Item var2 = Inventory.getFirst((int[])nArray);
        if (aK.llllIIIIIIIIll(var2)) {
            Item var3 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIllllllIIIl[lIllllllIIlI[4]]));
            if (aK.llllIIIIIIIIll(var3)) {
                aK var4;
                var3.useOn(var2);
                var4.sleep(lIllllllIIlI[4]);
                return lIllllllIIlI[0];
            }
            return lIllllllIIlI[1];
        }
        if (aK.llllIIIIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllllllIIIl[lIllllllIIlI[0]])) ? 1 : 0)) {
            return lIllllllIIlI[1];
        }
        tileObject.interact(lIllllllIIIl[lIllllllIIlI[1]]);
        return lIllllllIIlI[0];
    }
}

