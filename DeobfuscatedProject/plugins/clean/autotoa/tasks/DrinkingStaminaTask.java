/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Drinking stamina", priority=100)
public class DrinkingStaminaTask
extends AutotoaTaskBase {

    private static void lIlIIIlIIIllII() {
        llIIllIIIll = new String[llIIllIIlII[4]];
        ai.llIIllIIIll[ai.llIIllIIlII[0]] = "Drink";
        ai.llIIllIIIll[ai.llIIllIIlII[3]] = "Stamina";
    }

        return String.valueOf(var1);
    }

    static {
        ai.lIlIIIlIIIllIl();
        ai.lIlIIIlIIIllII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ai.lIlIIIlIIIlllI(Movement.isStaminaBoosted() ? 1 : 0)) {
            return llIIllIIlII[0];
        }
        if (ai.lIlIIIlIIIllll(Vars.getBit((int)llIIllIIlII[1]))) {
            return llIIllIIlII[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().startsWith(llIIllIIIll[llIIllIIlII[3]]));
        if (ai.lIlIIIlIIlIIII(var2)) {
            return llIIllIIlII[0];
        }
        if (ai.lIlIIIlIIlIIIl(Movement.getRunEnergy(), llIIllIIlII[2])) {
            return llIIllIIlII[0];
        }
        var1_1.interact(llIIllIIIll[llIIllIIlII[0]]);
        return llIIllIIlII[3];
    }

    private static boolean lIlIIIlIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIlIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIIlIIII(Object object) {
        return object == null;
    }

    @Inject
    protected DrinkingStaminaTask(Client client) {
        super(client);
    }
}

