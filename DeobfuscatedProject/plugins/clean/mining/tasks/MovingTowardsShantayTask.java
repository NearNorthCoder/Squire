/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.MiningTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving towards Shantay", priority=10, blocking=true)
public class MovingTowardsShantayTask
extends MiningTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!R.lIIlIlIIllIIlIl(this.z() ? 1 : 0) || R.lIIlIlIIllIIllI(this.y())) {
            return llllllIllIlI[0];
        }
        int[] nArray = new int[llllllIllIlI[1]];
        nArray[R.llllllIllIlI[0]] = llllllIllIlI[2];
        TileObject var1 = TileObjects.getNearest((int[])nArray);
        if (R.lIIlIlIIllIIlll(var1)) {
            if (R.lIIlIlIIllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)new WorldPoint(llllllIllIlI[3], llllllIllIlI[4], llllllIllIlI[0]));

                return llllllIllIlI[1];
            }
            int[] nArray2 = new int[llllllIllIlI[1]];
            nArray2[R.llllllIllIlI[0]] = llllllIllIlI[5];
            Item var2 = Inventory.getFirst((int[])nArray2);
            if (R.lIIlIlIIllIlIII(var2)) {
                var2.drop();
                return llllllIllIlI[1];
            }
            return llllllIllIlI[0];
        }
        var1_1.interact(llllllIllIIl[llllllIllIlI[0]]);
        return llllllIllIlI[1];
    }

    private static boolean lIIlIlIIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIIllIIIll() {
        llllllIllIIl = new String[llllllIllIlI[1]];
        R.llllllIllIIl[R.llllllIllIlI[0]] = "Go-through";
    }

    private static boolean lIIlIlIIllIIlll(Object object) {
        return object == null;
    }

    static {
        R.lIIlIlIIllIIlII();
        R.lIIlIlIIllIIIll();
    }

    private static boolean lIIlIlIIllIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlIIllIlIII(Object object) {
        return object != null;
    }

    @Inject
    protected MovingTowardsShantayTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}

