/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.minigames.tasks.GameEnum;

@TaskDesc(name="Turning In Juice")
public class TurningInJuiceTask
extends Task {

    private final  SquireSorceressGardenConfig t;

    static {
        c.lIlIllllllIIIII();
        c.lIlIlllllIlllll();
    }

    private boolean t() {
        c var1;
        String[] stringArray = new String[lIIllIIlIlIIl[1]];
        stringArray[c.lIIllIIlIlIIl[0]] = lIIllIIlIlIII[lIIllIIlIlIIl[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (c.lIlIllllllIIIll(nPC)) {
            Movement.walk((WorldPoint)new WorldPoint(lIIllIIlIlIIl[3], lIIllIIlIlIIl[4], lIIllIIlIlIIl[0]));
            return lIIllIIlIlIIl[1];
        }
        if (c.lIlIllllllIIlII(Movement.getRunEnergy(), lIIllIIlIlIIl[5]) && c.lIlIllllllIIIlI(Inventory.contains(var1::c) ? 1 : 0)) {
            Inventory.getFirst(var1::c).interact(lIIllIIlIlIII[lIIllIIlIlIIl[1]]);
        }
        int[] nArray = new int[lIIllIIlIlIIl[1]];
        nArray[c.lIIllIIlIlIIl[0]] = lIIllIIlIlIIl[2];
        Inventory.getFirst((int[])nArray).useOn((Actor)nPC);
        return lIIllIIlIlIIl[1];
    }

    private static boolean lIlIllllllIIlIl(int n) {
        return n == 0;
    }

    private boolean TurningInJuiceTask(Item item) {
        return item.getName().toLowerCase().contains(lIIllIIlIlIII[lIIllIIlIlIIl[6]]);
    }

    private static void lIlIlllllIlllll() {
        lIIllIIlIlIII = new String[lIIllIIlIlIIl[7]];
        c.lIIllIIlIlIII[c.lIIllIIlIlIIl[0]] = "Osman";
        c.lIIllIIlIlIII[c.lIIllIIlIlIIl[1]] = "Drink";
        c.lIIllIIlIlIII[c.lIIllIIlIlIIl[6]] = "stamina";
    }

    private static boolean lIlIllllllIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllllllIIIll(Object object) {
        return object == null;
    }

    private boolean u() {
        c var2;
        if (c.lIlIllllllIIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lIIllIIlIlIIl[1];
        }
        if (c.lIlIllllllIIlII(Movement.getRunEnergy(), lIIllIIlIlIIl[5]) && c.lIlIllllllIIlIl(Inventory.contains(var2::c) ? 1 : 0)) {
            Bank.withdraw(var2::c, (int)lIIllIIlIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIIllIIlIlIIl[1];
        }
        Bank.withdrawAll((int)lIIllIIlIlIIl[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lIIllIIlIlIIl[1];
    }

    public boolean run() {
        boolean bl;
        c var3;
        if (c.lIlIllllllIIIIl((Object)this.t.botActivity(), (Object)a.EXCHANGE)) {
            return lIIllIIlIlIIl[0];
        }
        if (c.lIlIllllllIIIlI(var3.s() ? 1 : 0)) {
            bl = var3.t();

            if (((38 + 29 - -19 + 149 ^ 136 + 60 - 95 + 97) & (0xBD ^ 0xAF ^ (0xD ^ 0x32) ^ -1)) == 2) {
                return ((0xC4 ^ 0x83 ^ (0 ^ 0x50)) & (62 + 21 - 57 + 128 ^ 14 + 12 - -92 + 23 ^ -1)) != 0;
            }
        } else {
            bl = var3.u();
        }
        return bl;
    }

    private static boolean lIlIllllllIIIlI(int n) {
        return n != 0;
    }

    @Inject
    public TurningInJuiceTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.t = squireSorceressGardenConfig;
    }

    private static boolean lIlIllllllIIlII(int n, int n2) {
        return n <= n2;
    }

    private boolean s() {
        int[] nArray = new int[lIIllIIlIlIIl[1]];
        nArray[c.lIIllIIlIlIIl[0]] = lIIllIIlIlIIl[2];
        return Inventory.contains((int[])nArray);
    }

}

