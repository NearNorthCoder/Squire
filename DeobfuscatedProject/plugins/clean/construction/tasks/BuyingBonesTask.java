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
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Buying Bones")
public class BuyingBonesTask
extends Task {

    private final  LooterConfig ez;

    private static void llIIllIlII() {
        lllIIlll = new String[lllIlIll[6]];
        aK.lllIIlll[aK.lllIlIll[0]] = "Bury";
        aK.lllIIlll[aK.lllIlIll[1]] = "Scatter";
        aK.lllIIlll[aK.lllIlIll[2]] = "ashes";
        aK.lllIIlll[aK.lllIlIll[3]] = "ashes";
        aK.lllIIlll[aK.lllIlIll[4]] = "bones";
        aK.lllIIlll[aK.lllIlIll[5]] = "bones";
    }

    private static boolean llIIllIlll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(llIlIIlIIIlllII);
    }

    static {
        aK.llIIllIlIl();
        aK.llIIllIlII();
    }

    private static boolean llIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        Item llIlIIlIIllIllI;
        if (aK.llIIllIllI(this.ez.buryBones() ? 1 : 0)) {
            return lllIlIll[0];
        }
        if (aK.llIIllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlll[lllIlIll[5]])) ? 1 : 0)) {
            llIlIIlIIllIllI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlll[lllIlIll[4]]));
            llIlIIlIIllIllI.interact(lllIIlll[lllIlIll[0]]);
        }
        if (aK.llIIllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlll[lllIlIll[3]])) ? 1 : 0)) {
            llIlIIlIIllIllI = Inventory.getFirst(item -> item.getName().contains(lllIIlll[lllIlIll[2]]));
            llIlIIlIIllIllI.interact(lllIIlll[lllIlIll[1]]);
        }
        return lllIlIll[1];
    }

    private static boolean llIIllIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public BuyingBonesTask(LooterConfig looterConfig) {
        this.ez = looterConfig;
    }
}

