/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
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

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Withdrawing ores", priority=20, blocking=true)
public class WithdrawingOresTask
extends MiningTaskBase {
    private final  WorldPoint af;
    
    private static final  int ae;

    private static boolean lIIlIIlIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIIIllIII() {
        lllllIIIIIlI = new String[lllllIIIIIll[3]];
        H.lllllIIIIIlI[H.lllllIIIIIll[2]] = "Search";
    }

    private static boolean lIIlIIlIIIllIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        H var1;
        if (H.lIIlIIlIIIllIlI(this.Z.O() ? 1 : 0)) {
            return lllllIIIIIll[2];
        }
        int[] nArray = new int[lllllIIIIIll[3]];
        nArray[H.lllllIIIIIll[2]] = lllllIIIIIll[4];
        if (H.lIIlIIlIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIIIIIll[2];
        }
        if (!H.lIIlIIlIIIllIlI(Inventory.isFull() ? 1 : 0) || !H.lIIlIIlIIIllIll(var1.Z.D()) || H.lIIlIIlIIIlllII(var1.Z.M(), lllllIIIIIll[3])) {
            return lllllIIIIIll[2];
        }
        int[] nArray2 = new int[lllllIIIIIll[3]];
        nArray2[H.lllllIIIIIll[2]] = lllllIIIIIll[5];
        TileObject var2 = TileObjects.getNearest((int[])nArray2);
        if (H.lIIlIIlIIIlllIl(var2)) {
            return lllllIIIIIll[2];
        }
        Player var3 = Players.getLocal();
        if (H.lIIlIIlIIIlllII(var2.distanceTo((Locatable)var3), lllllIIIIIll[6])) {
            Movement.walkTo((WorldPoint)var1.af);

            return lllllIIIIIll[3];
        }
        var1_1.interact(lllllIIIIIlI[lllllIIIIIll[2]]);
        return lllllIIIIIll[3];
    }

    private static boolean lIIlIIlIIIlllII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public WithdrawingOresTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        this.af = new WorldPoint(lllllIIIIIll[0], lllllIIIIIll[1], lllllIIIIIll[2]);
    }

    static {
        H.lIIlIIlIIIllIIl();
        H.lIIlIIlIIIllIII();
        ae = lllllIIIIIll[5];
    }

    private static boolean lIIlIIlIIIlllIl(Object object) {
        return object == null;
    }
}

