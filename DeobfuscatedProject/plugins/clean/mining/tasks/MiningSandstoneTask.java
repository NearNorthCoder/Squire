/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining sandstone")
public class MiningSandstoneTask
extends Task {

    private final  SquireMiner aj;
    private final  SquireMinerConfig ak;
    public static final  int ai;

    private static boolean lIIlIlIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public MiningSandstoneTask(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        this.aj = squireMiner;
        this.ak = squireMinerConfig;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIIIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        J.lIIlIlIIIIIIIIl();
        J.lIIlIlIIIIIIIII();
        ai = lllllIllllIl[7];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject var2;
        J var3;
        if (J.lIIlIlIIIIIIIlI((Object)this.ak.activity(), (Object)a.SANDSTONE)) {
            return lllllIllllIl[0];
        }
        int[] nArray = new int[lllllIllllIl[1]];
        nArray[J.lllllIllllIl[0]] = lllllIllllIl[2];
        if (J.lIIlIlIIIIIIIll(Inventory.getCount((int[])nArray), var3.ak.waterskins())) {
            int[] nArray2 = new int[lllllIllllIl[1]];
            nArray2[J.lllllIllllIl[0]] = lllllIllllIl[2];
            Inventory.getFirst((int[])nArray2).interact(lllllIllllII[lllllIllllIl[0]]);
        }
        Player var4 = Players.getLocal();
        if (!J.lIIlIlIIIIIIlII(Inventory.isFull() ? 1 : 0) || !J.lIIlIlIIIIIIlIl(var4) || !J.lIIlIlIIIIIIlII(var4.isAnimating() ? 1 : 0) || J.lIIlIlIIIIIIllI(var4.isMoving() ? 1 : 0)) {
            return lllllIllllIl[0];
        }
        if (J.lIIlIlIIIIIIlII(Movement.isRunEnabled() ? 1 : 0) && J.lIIlIlIIIIIIlll(Movement.getRunEnergy(), lllllIllllIl[3])) {
            Movement.toggleRun();
        }
        if (J.lIIlIlIIIIIlIII(var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (J.lIIlIlIIIIIlIlI(tileObject.getId(), lllllIllllIl[7]) && J.lIIlIlIIIIIIllI(this.ak.area().a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIllllIl[1];

                if (((29 + 165 - 21 + 37 ^ 90 + 111 - 193 + 137) & (3 ^ (0x31 ^ 0x71) ^ -1)) != ((0x85 ^ 0xA5 ^ (0x40 ^ 0x6E)) & (0xD7 ^ 0xC0 ^ (0x3B ^ 0x22) ^ -1))) {
                    return ((0xE6 ^ 0x9D ^ (0x4B ^ 0)) & (0x28 ^ 0x23 ^ (0x31 ^ 0xA) ^ -1)) != 0;
                }
            } else {
                n2 = lllllIllllIl[0];
            }
            return n2 != 0;
        }))) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllllIl[4], lllllIllllIl[5], lllllIllllIl[0]), (boolean)lllllIllllIl[0]);

            return lllllIllllIl[1];
        }
        if (J.lIIlIlIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && J.lIIlIlIIIIIlIIl(Players.getLocal().distanceTo((Locatable)var2), lllllIllllIl[6])) {
            var3.aj.a();
        }
        var2_2.interact(lllllIllllII[lllllIllllIl[1]]);
        return lllllIllllIl[1];
    }

    private static boolean lIIlIlIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIIIIII() {
        lllllIllllII = new String[lllllIllllIl[8]];
        J.lllllIllllII[J.lllllIllllIl[0]] = "Drop";
        J.lllllIllllII[J.lllllIllllIl[1]] = "Mine";
    }

    private static boolean lIIlIlIIIIIIlIl(Object object) {
        return object != null;
    }
}

