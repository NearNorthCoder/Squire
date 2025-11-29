/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    
    private final  SquirePlankerConfig l;

    private static void lIIlIIlllllllIl() {
        llllllIIIlIl = new String[llllllIIIllI[3]];
        b.llllllIIIlIl[b.llllllIIIllI[2]] = "Bank booth";
        b.llllllIIIlIl[b.llllllIIIllI[0]] = "Bank";
    }

    private static boolean lIIlIlIIIIIIIlI(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIIIIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIIlllllllll(int n) {
        return n == 0;
    }

    static {
        b.lIIlIIllllllllI();
        b.lIIlIIlllllllIl();
    }

    @Inject
    public BankingTask(SquirePlankerConfig squirePlankerConfig) {
        this.l = squirePlankerConfig;
    }

    private static boolean lIIlIlIIIIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIIIIIIII(int n, int n2) {
        return n > n2;
    }

    public boolean run() {
        b var1;
        if (b.lIIlIIlllllllll(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIIllI[0];
        }
        if (b.lIIlIlIIIIIIIII(Movement.getRunEnergy(), llllllIIIllI[1]) && b.lIIlIIlllllllll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return llllllIIIllI[0];
        }
        int[] nArray = new int[llllllIIIllI[0]];
        nArray[b.llllllIIIllI[2]] = var1.l.plank().d();
        Item var2 = Inventory.getFirst((int[])nArray);
        if (b.lIIlIlIIIIIIIIl(var2)) {
            if (b.lIIlIlIIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return llllllIIIllI[2];
        }
        if (b.lIIlIIlllllllll(Bank.isOpen() ? 1 : 0)) {
            if (b.lIIlIlIIIIIIIlI(var1.l.ironMode() ? 1 : 0)) {
                String[] stringArray = new String[llllllIIIllI[0]];
                stringArray[b.llllllIIIllI[2]] = llllllIIIlIl[llllllIIIllI[2]];
                TileObject var3 = TileObjects.getNearest((String[])stringArray);
                if (b.lIIlIlIIIIIIIll(var3)) {
                    return llllllIIIllI[2];
                }
                var3.interact(llllllIIIlIl[llllllIIIllI[0]]);
            }
            Bank.open();

            return llllllIIIllI[0];
        }
        int[] nArray2 = new int[llllllIIIllI[0]];
        nArray2[b.llllllIIIllI[2]] = this.l.plank().f();
        Bank.depositAll((int[])nArray2);
        Bank.withdrawAll((int)this.l.plank().d(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return llllllIIIllI[0];
    }
}

