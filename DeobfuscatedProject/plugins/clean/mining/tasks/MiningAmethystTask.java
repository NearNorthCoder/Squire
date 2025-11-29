/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining amethyst")
public class MiningAmethystTask
extends Task {
    private static final  List<Integer> M;
    private static final  WorldPoint K;
    
    private final  SquireMinerConfig N;
    private static final  WorldPoint L;

    private static void lIIlIIlIIIlllll() {
        lllllIIIIlII = new String[lllllIIIIlIl[4]];
        x.lllllIIIIlII[x.lllllIIIIlIl[0]] = "Mine";
    }

    private static boolean lIIlIIlIIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static int lIIlIIlIIlIIlIl(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        WorldPoint var1;
        TileObject var2;
        WorldPoint worldPoint;
        if (x.lIIlIIlIIlIIIIl((Object)this.N.activity(), (Object)a.AMETHYST)) {
            return lllllIIIIlIl[0];
        }
        if (x.lIIlIIlIIlIIIlI(Inventory.isFull() ? 1 : 0)) {
            return lllllIIIIlIl[0];
        }
        if (x.lIIlIIlIIlIIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
            x var3;
            var3.sleep(Rand.nextInt((int)lllllIIIIlIl[1], (int)lllllIIIIlIl[2]));
            return lllllIIIIlIl[0];
        }
        if (x.lIIlIIlIIlIIIll(Vars.getBit((int)lllllIIIIlIl[3]))) {
            worldPoint = K;

            if (((0x23 ^ 0x29) & ~(0x42 ^ 0x48)) > 3) {
                return false;
            }
        } else {
            worldPoint = L;
        }
        if (x.lIIlIIlIIlIIlII(var2 = TileObjects.getNearest((WorldPoint)(var1 = worldPoint), tileObject -> {
            int n2;
            if (x.lIIlIIlIIlIIIlI(M.contains(tileObject.getId()) ? 1 : 0) && x.lIIlIIlIIlIIIlI(Players.getAll(player -> {
                int n2;
                if (x.lIIlIIlIIlIIIlI(player.isAnimating() ? 1 : 0) && x.lIIlIIlIIlIIllI(x.lIIlIIlIIlIIlIl(player.getWorldLocation().distanceToHypotenuse(tileObject.getWorldLocation()), 1.0f))) {
                    n2 = lllllIIIIlIl[4];

                    if (3 == 1) {
                        return ((0x40 ^ 0xA ^ (0xAF ^ 0xBB)) & (191 + 63 - 248 + 219 ^ 110 + 46 - 145 + 180 ^ -1)) != 0;
                    }
                } else {
                    n2 = lllllIIIIlIl[0];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && x.lIIlIIlIIlIIIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = lllllIIIIlIl[4];

                if (2 < 0) {
                    return false;
                }
            } else {
                n2 = lllllIIIIlIl[0];
            }
            return n2 != 0;
        }))) {
            return lllllIIIIlIl[0];
        }
        var2_2.interact(lllllIIIIlII[lllllIIIIlIl[0]]);
        return lllllIIIIlIl[4];
    }

    private static boolean lIIlIIlIIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIIlIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlIIlIIIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        x.lIIlIIlIIlIIIII();
        x.lIIlIIlIIIlllll();
        K = new WorldPoint(lllllIIIIlIl[5], lllllIIIIlIl[6], lllllIIIIlIl[0]);
        L = new WorldPoint(lllllIIIIlIl[7], lllllIIIIlIl[8], lllllIIIIlIl[0]);
        M = List.of(Integer.valueOf(lllllIIIIlIl[9]), Integer.valueOf(lllllIIIIlIl[10]));
    }

    private static boolean lIIlIIlIIlIIlII(Object object) {
        return object == null;
    }

    @Inject
    public MiningAmethystTask(SquireMinerConfig squireMinerConfig) {
        this.N = squireMinerConfig;
    }
}

