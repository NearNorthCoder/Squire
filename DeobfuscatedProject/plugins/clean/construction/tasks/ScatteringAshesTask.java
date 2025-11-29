/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Scattering ashes", priority=9990)
public class ScatteringAshesTask
extends Task {

    private final  SquireCerberusConfig aL;

    private static void llIlIlllI() {
        llIlIIl = new String[llIlIlI[1]];
        x.llIlIIl[x.llIlIlI[0]] = "Scatter";
    }

    private static boolean llIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (x.llIllIIII(this.aL.scatterAshes() ? 1 : 0)) {
            return llIlIlI[0];
        }
        int[] nArray = new int[llIlIlI[1]];
        nArray[x.llIlIlI[0]] = llIlIlI[2];
        Item lllIlIIIlIllIlI = Inventory.getFirst((int[])nArray);
        if (x.llIllIIIl(lllIlIIIlIllIlI)) {
            return llIlIlI[0];
        }
        var1_1.interact(llIlIIl[llIlIlI[0]]);
        return llIlIlI[1];
    }

    static {
        x.llIlIllll();
        x.llIlIlllI();
    }

    @Inject
    public ScatteringAshesTask(SquireCerberusConfig squireCerberusConfig) {
        this.aL = squireCerberusConfig;
    }
}

