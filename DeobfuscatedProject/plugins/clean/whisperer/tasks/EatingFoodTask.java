/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Eating food")
public class EatingFoodTask
extends WhispererTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        if (y.llIIIIIllIlllll(Combat.getCurrentHealth(), this.i.eatAt())) {
            return lIlIllIlllIll[0];
        }
        Item var1 = Inventory.getFirst(item -> item.hasAction(lIlIllIlllIlI[lIlIllIlllIll[1]]::equals));
        if (y.llIIIIIlllIIIII(var1)) {
            return lIlIllIlllIll[0];
        }
        var1_1.interact(lIlIllIlllIlI[lIlIllIlllIll[0]]);
        return lIlIllIlllIll[1];
    }

    private static boolean llIIIIIlllIIIII(Object object) {
        return object == null;
    }

    private static boolean llIIIIIllIlllll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.llIIIIIllIllllI();
        y.llIIIIIllIlllIl();
    }

    private static void llIIIIIllIlllIl() {
        lIlIllIlllIlI = new String[lIlIllIlllIll[2]];
        y.lIlIllIlllIlI[y.lIlIllIlllIll[0]] = "Eat";
        y.lIlIllIlllIlI[y.lIlIllIlllIll[1]] = "Eat";
    }

}

