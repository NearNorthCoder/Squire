/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Bank for staminas")
public class BankForStaminasTask
extends Task {
    
    private  int J;
    private  int I;
    private  int K;
    private final  SquireMixologyConfig L;

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIllIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIllIIlIlI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        h var2;
        if (h.lIIlIlIllIIlIIl(s.e() ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIIl(var2.L.useStamina() ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(Inventory.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[20]])) ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (!h.lIIlIlIllIIlIll(Vars.getBit((int)var2.I), llllllllIIlI[4]) || !h.lIIlIlIllIIlIll(Vars.getBit((int)var2.J), llllllllIIlI[4]) || h.lIIlIlIllIIllII(Vars.getBit((int)var2.K), llllllllIIlI[4])) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(SquireMixology.j ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(SquireMixology.k ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llllllllIIlI[5]];
            stringArray[h.llllllllIIlI[3]] = llllllllIIIl[llllllllIIlI[3]];
            TileObject var3 = TileObjects.getNearest((String[])stringArray);
            if (h.lIIlIlIllIIllIl(var3)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[5]];
                var3.interact(llllllllIIIl[llllllllIIlI[6]]);
                return llllllllIIlI[3];
            }
            if (h.lIIlIlIllIIlllI(var3)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[7]];
                WorldPoint var4 = new WorldPoint(llllllllIIlI[8], llllllllIIlI[9], llllllllIIlI[3]);
                Movement.setDestination((WorldPoint)var4);
                return llllllllIIlI[3];
            }
        }
        if (h.lIIlIlIllIIlIlI(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llllllllIIlI[7]];
            stringArray[h.llllllllIIlI[3]] = llllllllIIIl[llllllllIIlI[10]];
            stringArray[h.llllllllIIlI[5]] = llllllllIIIl[llllllllIIlI[11]];
            stringArray[h.llllllllIIlI[6]] = llllllllIIIl[llllllllIIlI[12]];
            Bank.depositAllExcept((String[])stringArray);
            if (h.lIIlIlIllIIlIIl(Bank.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[19]])) ? 1 : 0)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[13]];
                return llllllllIIlI[3];
            }
            if (h.lIIlIlIllIIlIlI(Bank.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[18]])) ? 1 : 0)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[14]];
                Bank.withdraw(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[17]]), (int)llllllllIIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                SquireMixology.m = llllllllIIIl[llllllllIIlI[15]];
                SquireMixology.r = llllllllIIlI[16];
                SquireMixology.A = llllllllIIlI[3];
                SquireMixology.k = llllllllIIlI[3];
                return llllllllIIlI[3];
            }
        }
        return llllllllIIlI[3];
    }

    private static boolean lIIlIlIllIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIllIIlllI(Object object) {
        return object == null;
    }

    private static void lIIlIlIllIIIlll() {
        llllllllIIIl = new String[llllllllIIlI[21]];
        h.llllllllIIIl[h.llllllllIIlI[3]] = "Bank Chest";
        h.llllllllIIIl[h.llllllllIIlI[5]] = "Opening bank";
        h.llllllllIIIl[h.llllllllIIlI[6]] = "Use";
        h.llllllllIIIl[h.llllllllIIlI[7]] = "Walk closer to bank";
        h.llllllllIIIl[h.llllllllIIlI[10]] = "Mox paste";
        h.llllllllIIIl[h.llllllllIIlI[11]] = "Lye paste";
        h.llllllllIIIl[h.llllllllIIlI[12]] = "Aga paste";
        h.llllllllIIIl[h.llllllllIIlI[13]] = "Out of staminas";
        h.llllllllIIIl[h.llllllllIIlI[14]] = "Withdrawing staminas";
        h.llllllllIIIl[h.llllllllIIlI[15]] = "Empty";
        h.llllllllIIIl[h.llllllllIIlI[17]] = "Stamina";
        h.llllllllIIIl[h.llllllllIIlI[18]] = "Stamina";
        h.llllllllIIIl[h.llllllllIIlI[19]] = "Stamina";
        h.llllllllIIIl[h.llllllllIIlI[20]] = "Stamina";
    }

    @Inject
    public BankForStaminasTask(SquireMixologyConfig squireMixologyConfig) {
        this.I = llllllllIIlI[0];
        this.J = llllllllIIlI[1];
        this.K = llllllllIIlI[2];
        this.L = squireMixologyConfig;
    }

    static {
        h.lIIlIlIllIIlIII();
        h.lIIlIlIllIIIlll();
    }
}

