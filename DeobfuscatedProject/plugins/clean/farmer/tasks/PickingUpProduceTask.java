/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Picking up produce", priority=6, blocking=true)
public class PickingUpProduceTask
extends FarmerTaskBase {

    static {
        bf.lllIlllIlIlllI();
        bf.lllIlllIlIllIl();
    }

    @Inject
    public PickingUpProduceTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIlllIlIllll(int n2) {
        return n2 != 0;
    }

    private static void lllIlllIlIllIl() {
        lIllllIllIII = new String[lIllllIllIIl[1]];
        bf.lIllllIllIII[bf.lIllllIllIIl[0]] = "Take";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (bf.lllIlllIlIllll(Inventory.isFull() ? 1 : 0)) {
            return lIllllIllIIl[0];
        }
        int[] nArray = new int[lIllllIllIIl[1]];
        nArray[bf.lIllllIllIIl[0]] = au.LIMPWURT.au();
        List var1 = TileItems.getAll((int[])nArray);
        if (bf.lllIlllIlIllll(var1.isEmpty() ? 1 : 0)) {
            return lIllllIllIIl[0];
        }
        ((TileItem)var1_1.get(lIllllIllIIl[0])).interact(lIllllIllIII[lIllllIllIIl[0]]);
        return lIllllIllIIl[1];
    }
}

