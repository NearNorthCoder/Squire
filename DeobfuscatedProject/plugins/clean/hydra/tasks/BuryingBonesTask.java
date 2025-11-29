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
package gg.squire.hydra.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Burying bones", priority=20)
public class BuryingBonesTask
extends Task {
    
    private final  a aW;
    
    private final  SquireAlchemicalHydraConfig aX;

    private static boolean lIIlIIIIIlIlllI(int n2) {
        return n2 == 0;
    }

    static {
        z.lIIlIIIIIlIllIl();
        z.lIIlIIIIIlIllII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var1;
        if (z.lIIlIIIIIlIlllI(this.aX.bury() ? 1 : 0)) {
            return llllIIllllll[0];
        }
        if (z.lIIlIIIIIlIlllI(var1.aW.g() ? 1 : 0)) {
            return llllIIllllll[0];
        }
        if (z.lIIlIIIIIlIllll(var1.aW.k())) {
            return llllIIllllll[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIllllll[1]];
            stringArray[z.llllIIllllll[0]] = llllIIlllllI[llllIIllllll[1]];
            return item.hasAction(stringArray);
        });
        if (z.lIIlIIIIIllIIII(var2)) {
            return llllIIllllll[0];
        }
        var1_1.interact(llllIIlllllI[llllIIllllll[0]]);
        return llllIIllllll[1];
    }

    private static void lIIlIIIIIlIllII() {
        llllIIlllllI = new String[llllIIllllll[2]];
        z.llllIIlllllI[z.llllIIllllll[0]] = "Bury";
        z.llllIIlllllI[z.llllIIllllll[1]] = "Bury";
    }

    private static boolean lIIlIIIIIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIlIllll(Object object) {
        return object != null;
    }

    @Inject
    public BuryingBonesTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aW = a2;
        this.aX = squireAlchemicalHydraConfig;
    }

}

