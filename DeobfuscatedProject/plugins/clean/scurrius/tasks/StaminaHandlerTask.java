/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {

    private final  SquireScurriusConfig P;
    private final  SquireScurrius O;

    private static void lIlIllIlIlIIIIl() {
        lIIlIllIlIllI = new String[lIIlIllIlIlll[5]];
        g.lIIlIllIlIllI[g.lIIlIllIlIlll[0]] = "Drink";
        g.lIIlIllIlIllI[g.lIIlIllIlIlll[3]] = "Drink";
        g.lIIlIllIlIllI[g.lIIlIllIlIlll[4]] = "Stamina";
    }

    private static boolean lIlIllIlIlIIIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIIlIllIlIllI[lIIlIllIlIlll[4]]));
        if (g.lIlIllIlIlIIIll(item2)) {
            return lIIlIllIlIlll[0];
        }
        if (g.lIlIllIlIlIIlII(Movement.getRunEnergy(), lIIlIllIlIlll[1])) {
            return lIIlIllIlIlll[0];
        }
        if (g.lIlIllIlIlIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (g.lIlIllIlIlIIllI(Movement.getRunEnergy(), lIIlIllIlIlll[2])) {
                void var1;
                var1.interact(lIIlIllIlIllI[lIIlIllIlIlll[0]]);
                return lIIlIllIlIlll[3];
            }
            return lIIlIllIlIlll[0];
        }
        item2.interact(lIIlIllIlIllI[lIIlIllIlIlll[3]]);
        return lIIlIllIlIlll[3];
    }

    private static boolean lIlIllIlIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    StaminaHandlerTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.O = squireScurrius;
        this.P = squireScurriusConfig;
    }

    static {
        g.lIlIllIlIlIIIlI();
        g.lIlIllIlIlIIIIl();
    }

    private static boolean lIlIllIlIlIIlIl(int n2) {
        return n2 != 0;
    }
}

