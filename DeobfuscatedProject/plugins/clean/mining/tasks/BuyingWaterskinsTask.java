/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.MiningTaskBase;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;

@TaskDesc(name="Buying waterskins", priority=20, blocking=true)
public class BuyingWaterskinsTask
extends MiningTaskBase {

    @Inject
    protected BuyingWaterskinsTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static void lIIlIIlIIllllll() {
        lllllIIIllII = new String[lllllIIIllIl[6]];
        O.lllllIIIllII[O.lllllIIIllIl[0]] = "Buy-pass";
        O.lllllIIIllII[O.lllllIIIllIl[1]] = "Trade";
    }

    private static boolean lIIlIIlIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlIlIIIIll(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIlIlIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        O.lIIlIIlIlIIIIII();
        O.lIIlIIlIIllllll();
    }

    private static boolean lIIlIIlIlIIIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!O.lIIlIIlIlIIIIIl(this.z() ? 1 : 0) || O.lIIlIIlIlIIIIlI(this.y())) {
            return lllllIIIllIl[0];
        }
        int[] nArray = new int[lllllIIIllIl[1]];
        nArray[O.lllllIIIllIl[0]] = lllllIIIllIl[2];
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (O.lIIlIIlIlIIIIll(var2)) {
            return lllllIIIllIl[0];
        }
        int[] nArray2 = new int[lllllIIIllIl[1]];
        nArray2[O.lllllIIIllIl[0]] = lllllIIIllIl[3];
        if (O.lIIlIIlIlIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            var2.interact(lllllIIIllII[lllllIIIllIl[0]]);
            return lllllIIIllIl[1];
        }
        if (O.lIIlIIlIlIIIlII(Shop.isOpen() ? 1 : 0)) {
            int[] nArray3 = new int[lllllIIIllIl[1]];
            nArray3[O.lllllIIIllIl[0]] = lllllIIIllIl[4];
            if (O.lIIlIIlIlIIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Shop.sellFifty((int)lllllIIIllIl[4]);
                return lllllIIIllIl[1];
            }
            Shop.buyFifty((int)lllllIIIllIl[5]);
            return lllllIIIllIl[1];
        }
        var1_1.interact(lllllIIIllII[lllllIIIllIl[1]]);
        return lllllIIIllIl[1];
    }

    private static boolean lIIlIIlIlIIIIlI(int n2) {
        return n2 > 0;
    }
}

