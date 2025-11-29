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
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying compost potion to the bin", priority=31, blocking=true)
public class ApplyingCompostPotionToTheBinTask
extends FarmerTaskBase {

    @Inject
    public ApplyingCompostPotionToTheBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        int n3;
        void var1;
        if (aL.llllIIIllIIIll(this.bS.applyCompostPotion() ? 1 : 0)) {
            return llIIIIIlIlII[0];
        }
        an var2 = var1.aI();
        au var3 = var2.aY();
        if (aL.llllIIIllIIlII((Object)var2.aZ(), (Object)n.HARVESTABLE) && (!aL.llllIIIllIIlIl((Object)var3, (Object)au.COMPOST) || aL.llllIIIllIIlII((Object)var3, (Object)au.GIANT_COMPOST))) {
            n3 = llIIIIIlIlII[1];

            if (2 < 0) {
                return false;
            }
        } else {
            n3 = llIIIIIlIlII[0];
        }
        return n3 != 0;
    }

    @Override
    public boolean b(TileObject tileObject) {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIIIIlIIll[llIIIIIlIlII[0]]));
        if (aL.llllIIIllIIllI(item2)) {
            return llIIIIIlIlII[0];
        }
        item2.useOn(tileObject);
        return llIIIIIlIlII[1];
    }

    private static boolean llllIIIllIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIllIIllI(Object object) {
        return object == null;
    }

    private static void llllIIIllIIIIl() {
        llIIIIIlIIll = new String[llIIIIIlIlII[1]];
        aL.llIIIIIlIIll[aL.llIIIIIlIlII[0]] = "compost potion";
    }

    private static boolean llllIIIllIIIll(int n2) {
        return n2 == 0;
    }

    static {
        aL.llllIIIllIIIlI();
        aL.llllIIIllIIIIl();
    }

    private static boolean llllIIIllIIlIl(Object object, Object object2) {
        return object != object2;
    }
}

