/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.woodcutting.tasks.GameEnum;

@TaskDesc(name="Chopping (fast)", priority=75, register=true)
public class ChoppingFastTask
extends Task {

    private final  SquireWoodcutterConfig K;
    private final  SquireWoodcutterPlugin L;

    static {
        k.llIIIlIIIIIIIII();
        k.llIIIIlllllllll();
    }

    private static boolean llIIIlIIIIIIIlI(int n) {
        return n != 0;
    }

    private static void llIIIIlllllllll() {
        lIllIIIIIlIIl = new String[lIllIIIIIlIlI[6]];
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[0]] = "fossil null";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[2]] = "Missed 4 cycles in a row, restarting.";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[4]] = "Chop down";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[5]] = "Chop down";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[1]] = "Chop down";
    }

    @Inject
    public ChoppingFastTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.L = squireWoodcutterPlugin;
        this.K = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIIIIIIIl(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIIIIIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean llIIIlIIIIIIllI(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIIIlIIIIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIlIIIIIIlIl(int n, int n2) {
        return n >= n2;
    }

    public boolean run() {
        TileObject var1;
        k var2;
        if (k.llIIIlIIIIIIIIl(this.K.fastTickChop() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (!k.llIIIlIIIIIIIIl(Bank.isOpen() ? 1 : 0) || k.llIIIlIIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (k.llIIIlIIIIIIIlI(var2.L.p() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (!k.llIIIlIIIIIIIll(Movement.getRunEnergy(), lIllIIIIIlIlI[1]) || k.llIIIlIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        Player var3 = Players.getLocal();
        if (k.llIIIlIIIIIIlII(var3)) {
            return lIllIIIIIlIlI[0];
        }
        WorldArea[] worldAreaArray = new WorldArea[lIllIIIIIlIlI[2]];
        worldAreaArray[k.lIllIIIIIlIlI[0]] = var2.L.j();
        if (k.llIIIlIIIIIIIlI(var3.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0) && k.llIIIlIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (k.llIIIlIIIIIIlII(var1 = TileObjects.getNearest(tileObject -> {
            int n;
            if (k.llIIIlIIIIIIIlI(tileObject.getName().equals(this.K.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIIlIlI[2]];
                stringArray[k.lIllIIIIIlIlI[0]] = lIllIIIIIlIIl[lIllIIIIIlIlI[1]];
                if (k.llIIIlIIIIIIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIIIlIlI[2];

                    if (-(3 ^ 0x54 ^ (0x3E ^ 0x6D)) < 0) return n != 0;
                    return ((156 + 13 - 92 + 117 ^ 3 + 69 - 24 + 82) & (0x74 ^ 0x1D ^ (0x5C ^ 0x75) ^ -1)) != 0;
                }
            }
            n = lIllIIIIIlIlI[0];
            return n != 0;
        }))) {
            return lIllIIIIIlIlI[0];
        }
        i var4 = i.b(var1);
        if (k.llIIIlIIIIIIlII((Object)var4)) {
            Log.info((String)lIllIIIIIlIIl[lIllIIIIIlIlI[0]]);
            return lIllIIIIIlIlI[0];
        }
        if (k.llIIIlIIIIIIlIl(var2.L.q(), lIllIIIIIlIlI[3]) && k.llIIIlIIIIIIIIl(var2.K.bank() ? 1 : 0) && k.llIIIlIIIIIIllI(var1.distanceTo((Locatable)var3), var2.L.m()) && k.llIIIlIIIIIIIIl(var3.isMoving() ? 1 : 0) && k.llIIIlIIIIIIIlI(Inventory.contains(item -> item.getName().contains(this.K.tree().r())) ? 1 : 0)) {
            Log.info((String)lIllIIIIIlIIl[lIllIIIIIlIlI[2]]);
            var1.interact(lIllIIIIIlIIl[lIllIIIIIlIlI[4]]);
            return lIllIIIIIlIlI[2];
        }
        if (k.llIIIlIIIIIIlIl(var1.distanceTo((Locatable)var3), var2.L.m())) {
            return lIllIIIIIlIlI[0];
        }
        if (k.llIIIlIIIIIIIlI(var2.L.b() ? 1 : 0)) {
            var1.interact(lIllIIIIIlIIl[lIllIIIIIlIlI[5]]);
            var2.sleep(lIllIIIIIlIlI[2]);
            return lIllIIIIIlIlI[2];
        }
        return lIllIIIIIlIlI[0];
    }
}

