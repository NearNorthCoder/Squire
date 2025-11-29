/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
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

@TaskDesc(name="Repairing struts", priority=25, blocking=true)
public class RepairingStrutsTask
extends MiningTaskBase {
    private final  WorldPoint aa;
    private final  WorldPoint ab;

    private static boolean lIIlIIlIllIlIII(Object object) {
        return object == null;
    }

    static {
        D.lIIlIIlIllIIlII();
        D.lIIlIIlIllIIIll();
    }

    @Inject
    public RepairingStrutsTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        this.aa = new WorldPoint(lllllIIlIllI[0], lllllIIlIllI[1], lllllIIlIllI[2]);
        this.ab = new WorldPoint(lllllIIlIllI[3], lllllIIlIllI[4], lllllIIlIllI[2]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var3_4;
        D var1;
        if (D.lIIlIIlIllIIlIl(this.Z.M())) {
            return lllllIIlIllI[2];
        }
        if (D.lIIlIIlIllIIlIl(var1.Z.J() ? 1 : 0)) {
            return lllllIIlIllI[2];
        }
        String[] stringArray = new String[lllllIIlIllI[5]];
        stringArray[D.lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[2]];
        List var2 = TileObjects.getAll((String[])stringArray);
        if (D.lIIlIIlIllIIllI(var2.size(), lllllIIlIllI[6])) {
            return lllllIIlIllI[2];
        }
        if (D.lIIlIIlIllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return lllllIIlIllI[2];
        }
        Player var3 = Players.getLocal();
        int[] nArray = new int[lllllIIlIllI[5]];
        nArray[D.lllllIIlIllI[2]] = lllllIIlIllI[7];
        if (D.lIIlIIlIllIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (D.lIIlIIlIllIIlll(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lllllIIlIllI[5]];
                nArray2[D.lllllIIlIllI[2]] = lllllIIlIllI[8];
                if (D.lIIlIIlIllIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllllIIlIllI[5]];
                    nArray3[D.lllllIIlIllI[2]] = lllllIIlIllI[8];
                    Inventory.getFirst((int[])nArray3).drop();
                    return lllllIIlIllI[5];
                }
            }
            String[] stringArray2 = new String[lllllIIlIllI[5]];
            stringArray2[D.lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[5]];
            TileObject var4 = TileObjects.getNearest((WorldPoint)var1.aa, (String[])stringArray2);
            if (D.lIIlIIlIllIlIII(var4)) {
                return lllllIIlIllI[2];
            }
            if (D.lIIlIIlIllIlIIl(var4.distanceTo((Locatable)var3), lllllIIlIllI[6])) {
                Movement.walkTo((WorldPoint)var1.aa);

                return lllllIIlIllI[5];
            }
            var4.interact(lllllIIlIlIl[lllllIIlIllI[6]]);
            return lllllIIlIllI[5];
        }
        String[] stringArray3 = new String[lllllIIlIllI[5]];
        stringArray3[D.lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[9]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray3);
        if (D.lIIlIIlIllIlIII(var4)) {
            return lllllIIlIllI[2];
        }
        if (D.lIIlIIlIllIlIIl(var4.distanceTo((Locatable)var3), lllllIIlIllI[10])) {
            Movement.walkTo((WorldPoint)var1.ab);

            return lllllIIlIllI[5];
        }
        var3_4.interact(lllllIIlIlIl[lllllIIlIllI[11]]);
        return lllllIIlIllI[5];
    }

    private static boolean lIIlIIlIllIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIlIllIIIll() {
        lllllIIlIlIl = new String[lllllIIlIllI[12]];
        D.lllllIIlIlIl[D.lllllIIlIllI[2]] = "Broken strut";
        D.lllllIIlIlIl[D.lllllIIlIllI[5]] = "Crate";
        D.lllllIIlIlIl[D.lllllIIlIllI[6]] = "Search";
        D.lllllIIlIlIl[D.lllllIIlIllI[9]] = "Broken strut";
        D.lllllIIlIlIl[D.lllllIIlIllI[11]] = "Hammer";
    }

    private static boolean lIIlIIlIllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIllIIlIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var5);
    }
}

