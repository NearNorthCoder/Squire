/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Picking up glass", blocking=true)
public class PickingUpGlassTask
extends Task {
    private final  BankStanderConfig t;

    private final  SquireBankStander s;

    static {
        E.lIlIlllIllllIl();
        E.lIlIlllIllllII();
    }

    private static void lIlIlllIllllII() {
        lllIlIIIIlI = new String[lllIlIIIIll[3]];
        E.lllIlIIIIlI[E.lllIlIIIIll[0]] = "Take";
    }

    @Inject
    public PickingUpGlassTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.s = squireBankStander;
        this.t = bankStanderConfig;
    }

    private static boolean lIlIllllIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIlllllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        TileItem var1;
        E var2;
        if (E.lIlIlllIlllllI(this.t.glassMakePickGlass() ? 1 : 0)) {
            return lllIlIIIIll[0];
        }
        if (E.lIlIlllIllllll(var2.s.b(), lllIlIIIIll[1]) && E.lIlIlllIlllllI(var2.s.d() ? 1 : 0)) {
            return lllIlIIIIll[0];
        }
        if (E.lIlIllllIIIIII(Inventory.isFull() ? 1 : 0)) {
            if (E.lIlIllllIIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
            }
            return Bank.open();
        }
        if (E.lIlIllllIIIIIl(var2.s.b(), lllIlIIIIll[2])) {
            var2.s.a(lllIlIIIIll[3]);
        }
        if (E.lIlIllllIIIIlI(var1 = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (E.lIlIllllIIIIll(tileItem.getId(), lllIlIIIIll[4])) {
                bl = lllIlIIIIll[3];

                }
            } else {
                bl = lllIlIIIIll[0];
            }
            return bl;
        }))) {
            var2.s.a(lllIlIIIIll[0]);
            var2.s.a(lllIlIIIIll[0]);
            return lllIlIIIIll[0];
        }
        var1_1.interact(lllIlIIIIlI[lllIlIIIIll[0]]);
        return lllIlIIIIll[3];
    }

    private static boolean lIlIllllIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlllIllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllllIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllllIIIIlI(Object object) {
        return object == null;
    }
}

