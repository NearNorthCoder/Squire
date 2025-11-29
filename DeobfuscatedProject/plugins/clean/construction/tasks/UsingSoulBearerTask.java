/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using Soul Bearer")
public class UsingSoulBearerTask
extends Task {
    private final  LooterConfig eI;
    
    private final  SquireLooter eJ;

        return String.valueOf(llIIIlIlIIllIII);
    }

    private static boolean lIIIlIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aP.lIIIlIIllII();
        aP.lIIIlIIlIll();
    }

    private static void lIIIlIIlIll() {
        lIIlllIlI = new String[lIIlllIll[3]];
        aP.lIIlllIlI[aP.lIIlllIll[0]] = "Fill";
        aP.lIIlllIlI[aP.lIIlllIll[1]] = "Ensouled";
    }

    private static boolean lIIIlIIllIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (aP.lIIIlIIllIl(this.eI.useSoulBearer() ? 1 : 0)) {
            return lIIlllIll[0];
        }
        if (aP.lIIIlIIlllI(Inventory.contains(item -> item.getName().contains(lIIlllIlI[lIIlllIll[1]])) ? 1 : 0)) {
            int[] nArray = new int[lIIlllIll[1]];
            nArray[aP.lIIlllIll[0]] = lIIlllIll[2];
            if (aP.lIIIlIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                aP llIIIlIlIllIIlI;
                int[] nArray2 = new int[lIIlllIll[1]];
                nArray2[aP.lIIlllIll[0]] = lIIlllIll[2];
                Inventory.getFirst((int[])nArray2).interact(lIIlllIlI[lIIlllIll[0]]);
                llIIIlIlIllIIlI.sleep(lIIlllIll[1]);
            }
        }
        return lIIlllIll[1];
    }

    @Inject
    public UsingSoulBearerTask(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eI = looterConfig;
        this.eJ = squireLooter;
    }
}

