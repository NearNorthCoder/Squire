/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.DepositBox
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Depositing ores", priority=19, blocking=true)
public class DepositingOresTask
extends MiningTaskBase {

    private final  int[] ad;

    private static boolean lIIlIIllIlIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        G.lIIlIIllIlIIlll();
        G.lIIlIIllIIlIlll();
    }

    @Inject
    public DepositingOresTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        int[] nArray = new int[lllllIlIlIII[0]];
        nArray[G.lllllIlIlIII[1]] = lllllIlIlIII[2];
        nArray[G.lllllIlIlIII[3]] = lllllIlIlIII[4];
        nArray[G.lllllIlIlIII[5]] = lllllIlIlIII[6];
        nArray[G.lllllIlIlIII[7]] = lllllIlIlIII[8];
        nArray[G.lllllIlIlIII[9]] = lllllIlIlIII[10];
        nArray[G.lllllIlIlIII[11]] = lllllIlIlIII[12];
        nArray[G.lllllIlIlIII[13]] = lllllIlIlIII[14];
        nArray[G.lllllIlIlIII[15]] = lllllIlIlIII[16];
        nArray[G.lllllIlIlIII[17]] = lllllIlIlIII[18];
        nArray[G.lllllIlIlIII[19]] = lllllIlIlIII[20];
        nArray[G.lllllIlIlIII[21]] = lllllIlIlIII[22];
        this.ad = nArray;
    }

    private static void lIIlIIllIIlIlll() {
        lllllIlIIIll = new String[lllllIlIlIII[3]];
        G.lllllIlIIIll[G.lllllIlIlIII[1]] = "Deposit";
    }

    private static boolean lIIlIIllIlIlIlI(Object object) {
        return object == null;
    }

    @Override
    public boolean t() {
        G var1;
        if (G.lIIlIIllIlIlIII(this.Z.O() ? 1 : 0)) {
            return lllllIlIlIII[1];
        }
        if (G.lIIlIIllIlIlIII(Inventory.contains(item -> T.av.contains(item.getId())) ? 1 : 0)) {
            if (G.lIIlIIllIlIlIII(var1.Z.D())) {
                var1.Z.a(lllllIlIlIII[1]);
            }
            return lllllIlIlIII[1];
        }
        int[] nArray = new int[lllllIlIlIII[3]];
        nArray[G.lllllIlIlIII[1]] = lllllIlIlIII[23];
        if (G.lIIlIIllIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllllIlIlIII[3]];
            nArray2[G.lllllIlIlIII[1]] = lllllIlIlIII[23];
            Inventory.dropAll((int[])nArray2);

            return lllllIlIlIII[3];
        }
        if (G.lIIlIIllIlIlIIl(DepositBox.isOpen() ? 1 : 0)) {
            DepositBox.depositAllItems((int[])var1.ad);
            return lllllIlIlIII[3];
        }
        int[] nArray3 = new int[lllllIlIlIII[3]];
        nArray3[G.lllllIlIlIII[1]] = lllllIlIlIII[24];
        TileObject var2 = TileObjects.getNearest((int[])nArray3);
        if (G.lIIlIIllIlIlIlI(var2)) {
            return lllllIlIlIII[1];
        }
        if (G.lIIlIIllIlIlIII(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            Movement.walkTo((Locatable)var2);

            return lllllIlIlIII[3];
        }
        if (G.lIIlIIllIlIlIIl(Movement.shouldWalk() ? 1 : 0)) {
            var2.interact(lllllIlIIIll[lllllIlIlIII[1]]);
        }
        return lllllIlIlIII[3];
    }

    private static boolean lIIlIIllIlIlIII(int n2) {
        return n2 == 0;
    }
}

