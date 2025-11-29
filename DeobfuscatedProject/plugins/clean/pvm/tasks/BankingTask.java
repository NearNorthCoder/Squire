/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    private final  c U;
    private final  SquireShamansPlugin T;
    public static final  int S;
    private final  SquireShamanConfig V;
    private static final  Logger R;

        return String.valueOf(var1);
    }

    @Inject
    public BankingTask(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig) {
        this.T = squireShamansPlugin;
        this.U = c2;
        this.V = squireShamanConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        k var2;
        String[] stringArray = new String[lIIllIIIlIlll[0]];
        stringArray[k.lIIllIIIlIlll[1]] = lIIllIIIlIllI[lIIllIIIlIlll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!k.lIlIllllIIlIIII(nPC) || k.lIlIllllIIlIIIl(this.U.s() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        InventorySetup var3 = var2.U.r();
        if (k.lIlIllllIIlIIIl(var3.matchesInventory() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        int[] nArray = new int[lIIllIIIlIlll[0]];
        nArray[k.lIIllIIIlIlll[1]] = lIIllIIIlIlll[2];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (!k.lIlIllllIIlIIlI(var4) || k.lIlIllllIIlIIll(var4.distanceTo((Locatable)Players.getLocal()), lIIllIIIlIlll[3])) {
            return lIIllIIIlIlll[1];
        }
        if (k.lIlIllllIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        Item var5 = Inventory.getFirst(item -> {
            int n2;
            if (!k.lIlIllllIIlIlIl(item.getId(), this.V.weapon()) || k.lIlIllllIIlIllI(item.getId(), this.T.d())) {
                n2 = lIIllIIIlIlll[0];

                }
            } else {
                n2 = lIIllIIIlIlll[1];
            }
            return n2 != 0;
        });
        if (k.lIlIllllIIlIIlI(var5)) {
            int[] nArray2 = new int[lIIllIIIlIlll[0]];
            nArray2[k.lIIllIIIlIlll[1]] = var5.getId();
            if (k.lIlIllllIIlIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                var5.interact(lIIllIIIlIllI[lIIllIIIlIlll[0]]);
                return lIIllIIIlIlll[0];
            }
        }
        if (k.lIlIllllIIlIlII(Bank.isOpen() ? 1 : 0)) {
            var4.interact(lIIllIIIlIllI[lIIllIIIlIlll[4]]);
            return lIIllIIIlIlll[0];
        }
        var2_2.withdraw();

        this.sleep(lIIllIIIlIlll[4]);
        return lIIllIIIlIlll[0];
    }

    private static boolean lIlIllllIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllllIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lIlIllllIIlIIII(Object object) {
        return object == null;
    }

    static {
        k.lIlIllllIIIllll();
        k.lIlIllllIIIlllI();
        S = lIIllIIIlIlll[2];
        R = LoggerFactory.getLogger(BankingTask.class);
    }

    private static boolean lIlIllllIIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllllIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllllIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllllIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIllllIIIlllI() {
        lIIllIIIlIllI = new String[lIIllIIIlIlll[5]];
        k.lIIllIIIlIllI[k.lIIllIIIlIlll[1]] = "Lizardman Shaman";
        k.lIIllIIIlIllI[k.lIIllIIIlIlll[0]] = "Wield";
        k.lIIllIIIlIllI[k.lIIllIIIlIlll[4]] = "Use";
    }
}

