/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", blocking=true)
public class EatingTask
extends Task {

    private final  SquireSkipperConfig C;

    private static boolean lIlllIlIllIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        h.lIlllIlIlIlllll();
        h.lIlllIlIlIllllI();
    }

    @Inject
    public EatingTask(SquireSkipperConfig squireSkipperConfig) {
        this.C = squireSkipperConfig;
    }

    private static void lIlllIlIlIllllI() {
        lIlIIlIIllIll = new String[lIlIIlIIlllII[0]];
        h.lIlIIlIIllIll[h.lIlIIlIIlllII[1]] = "Eat";
    }

    public boolean run() {
        h var1;
        int[] nArray = new int[lIlIIlIIlllII[0]];
        nArray[h.lIlIIlIIlllII[1]] = this.C.foodID();
        if (h.lIlllIlIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIIlllII[1];
        }
        if (h.lIlllIlIllIIIIl(Combat.getCurrentHealth(), var1.C.eatHP())) {
            return lIlIIlIIlllII[1];
        }
        int[] nArray2 = new int[lIlIIlIIlllII[0]];
        nArray2[h.lIlIIlIIlllII[1]] = this.C.foodID();
        Inventory.getFirst((int[])nArray2).interact(lIlIIlIIllIll[lIlIIlIIlllII[1]]);
        return lIlIIlIIlllII[0];
    }
}

