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
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Curing poison", priority=20)
public class CuringPoisonTask
extends Task {
    private final  a aq;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (o.lIIlIIIIlllIIll(this.aq.g() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        if (o.lIIlIIIIlllIIll(Combat.isPoisoned() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIlIlIIll[2]];
            stringArray[o.llllIlIlIIll[0]] = llllIlIlIIlI[llllIlIlIIll[2]];
            if (o.lIIlIIIIlllIlIl(item.hasAction(stringArray) ? 1 : 0) && o.lIIlIIIIlllIlIl(item.getName().toLowerCase().contains(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0)) {
                n2 = llllIlIlIIll[2];

                if ((152 + 117 - 198 + 124 ^ 79 + 197 - 129 + 51) <= 0) {
                    return false;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        });
        if (o.lIIlIIIIlllIlII(var1)) {
            return llllIlIlIIll[0];
        }
        var1_1.interact(llllIlIlIIlI[llllIlIlIIll[0]]);
        this.sleep(llllIlIlIIll[1]);
        return llllIlIlIIll[2];
    }

        return String.valueOf(var2);
    }

    private static void lIIlIIIIlllIIIl() {
        llllIlIlIIlI = new String[llllIlIlIIll[4]];
        o.llllIlIlIIlI[o.llllIlIlIIll[0]] = "Drink";
        o.llllIlIlIIlI[o.llllIlIlIIll[2]] = "Drink";
        o.llllIlIlIIlI[o.llllIlIlIIll[3]] = "anti";
    }

    private static boolean lIIlIIIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.lIIlIIIIlllIIlI();
        o.lIIlIIIIlllIIIl();
    }

    private static boolean lIIlIIIIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlllIIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public CuringPoisonTask(a a2) {
        this.aq = a2;
    }

    private static boolean lIIlIIIIlllIlII(Object object) {
        return object == null;
    }
}

