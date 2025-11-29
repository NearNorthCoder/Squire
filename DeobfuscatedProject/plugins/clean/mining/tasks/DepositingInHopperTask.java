/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing in hopper", priority=8)
public class DepositingInHopperTask
extends MiningTaskBase {

    private static void lIIlIIllllIIIlI() {
        lllllIllIllI = new String[lllllIllIlll[4]];
        z.lllllIllIllI[z.lllllIllIlll[0]] = "Drop";
        z.lllllIllIllI[z.lllllIllIlll[1]] = "Deposit";
    }

    @Inject
    public DepositingInHopperTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        TileObject var1;
        z var2;
        if (!z.lIIlIIllllIIlII(this.Z.I() ? 1 : 0) || z.lIIlIIllllIIlIl(this.Z.K() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (z.lIIlIIllllIIlIl(var2.Z.L() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (z.lIIlIIllllIIlII(var2.Z.F() ? 1 : 0)) {
            int[] nArray = new int[lllllIllIlll[1]];
            nArray[z.lllllIllIlll[0]] = lllllIllIlll[2];
            if (z.lIIlIIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIllIlll[1]];
                nArray2[z.lllllIllIlll[0]] = lllllIllIlll[2];
                Inventory.getFirst((int[])nArray2).interact(lllllIllIllI[lllllIllIlll[0]]);
                return lllllIllIlll[1];
            }
        }
        if (z.lIIlIIllllIIllI(var1 = var2.x())) {
            return lllllIllIlll[0];
        }
        var1_1.interact(lllllIllIllI[lllllIllIlll[1]]);
        this.sleep(lllllIllIlll[3]);
        return lllllIllIlll[1];
    }

    private static boolean lIIlIIllllIIlII(int n2) {
        return n2 != 0;
    }

    static {
        z.lIIlIIllllIIIll();
        z.lIIlIIllllIIIlI();
    }

    private static boolean lIIlIIllllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllllIIlIl(int n2) {
        return n2 == 0;
    }
}

