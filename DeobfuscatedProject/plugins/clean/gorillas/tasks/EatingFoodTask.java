/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=100)
public class EatingFoodTask
extends Task {
    private final  SquireGorillaConfig aj;

    private static boolean lllllIlIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public EatingFoodTask(SquireGorillaConfig squireGorillaConfig) {
        this.aj = squireGorillaConfig;
    }

    private static boolean lllllIlIllIIIl(Object object) {
        return object == null;
    }

    static {
        x.lllllIlIlIllll();
        x.lllllIlIlIlllI();
    }

    private static boolean lllllIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (x.lllllIlIllIIII(Combat.getCurrentHealth(), this.aj.eatAt())) {
            return llIIlIlIlIlI[0];
        }
        Item var2 = Inventory.getFirst(item -> item.hasAction(llIIlIlIlIIl[llIIlIlIlIlI[1]]::equals));
        if (x.lllllIlIllIIIl(var2)) {
            return llIIlIlIlIlI[0];
        }
        var1_1.interact(llIIlIlIlIIl[llIIlIlIlIlI[0]]);
        return llIIlIlIlIlI[1];
    }

    private static void lllllIlIlIlllI() {
        llIIlIlIlIIl = new String[llIIlIlIlIlI[2]];
        x.llIIlIlIlIIl[x.llIIlIlIlIlI[0]] = "Eat";
        x.llIIlIlIlIIl[x.llIIlIlIlIlI[1]] = "Eat";
    }

}

