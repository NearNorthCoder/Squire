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
package gg.squire.sepulchre.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
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
    private final  SquireSepulchre aA;
    private final  SquireSepulchreConfig aB;

        return String.valueOf(var1);
    }

    private static boolean lIIIlIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIIlllllll(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIlllllIl() {
        lllIIIlIIIll = new String[lllIIIlIIlII[5]];
        T.lllIIIlIIIll[T.lllIIIlIIlII[0]] = "Drink";
        T.lllIIIlIIIll[T.lllIIIlIIlII[3]] = "Drink";
        T.lllIIIlIIIll[T.lllIIIlIIlII[4]] = "Stamina";
    }

    private static boolean lIIIlIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    StaminaHandlerTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aA = squireSepulchre;
        this.aB = squireSepulchreConfig;
    }

    static {
        T.lIIIlIIIllllllI();
        T.lIIIlIIIlllllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lllIIIlIIIll[lllIIIlIIlII[4]]));
        if (T.lIIIlIIIlllllll(item2)) {
            return lllIIIlIIlII[0];
        }
        if (T.lIIIlIIlIIIIIII(Movement.getRunEnergy(), lllIIIlIIlII[1])) {
            return lllIIIlIIlII[0];
        }
        if (T.lIIIlIIlIIIIIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (T.lIIIlIIlIIIIIlI(Movement.getRunEnergy(), lllIIIlIIlII[2])) {
                void var2;
                var2.interact(lllIIIlIIIll[lllIIIlIIlII[0]]);
                return lllIIIlIIlII[3];
            }
            return lllIIIlIIlII[0];
        }
        item2.interact(lllIIIlIIIll[lllIIIlIIlII[3]]);
        return lllIIIlIIlII[3];
    }

}

