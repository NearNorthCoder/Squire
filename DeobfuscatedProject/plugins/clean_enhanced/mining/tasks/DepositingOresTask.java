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

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        G.var4();
        G.var5();
    }

    @Inject
    public DepositingOresTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        int[] nArray = new int[var2[0]];
        nArray[G.var2[1]] = var2[2];
        nArray[G.var2[3]] = var2[4];
        nArray[G.var2[5]] = var2[6];
        nArray[G.var2[7]] = var2[8];
        nArray[G.var2[9]] = var2[10];
        nArray[G.var2[11]] = var2[12];
        nArray[G.var2[13]] = var2[14];
        nArray[G.var2[15]] = var2[16];
        nArray[G.var2[17]] = var2[18];
        nArray[G.var2[19]] = var2[20];
        nArray[G.var2[21]] = var2[22];
        this.ad = nArray;
    }

    private static void var5() {
        var1 = new String[var2[3]];
        G.var1[G.var2[1]] = "Deposit";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean t() {
        G var13;
        if (G.var14(this.Z.O() ? 1 : 0)) {
            return var2[1];
        }
        if (G.var14(Inventory.contains(item -> T.av.contains(item.getId())) ? 1 : 0)) {
            if (G.var14(var13.Z.D())) {
                var13.Z.a(var2[1]);
            }
            return var2[1];
        }
        int[] nArray = new int[var2[3]];
        nArray[G.var2[1]] = var2[23];
        if (G.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[3]];
            nArray2[G.var2[1]] = var2[23];
            Inventory.dropAll((int[])nArray2);
            0;
            return var2[3];
        }
        if (G.var3(DepositBox.isOpen() ? 1 : 0)) {
            DepositBox.depositAllItems((int[])var13.ad);
            return var2[3];
        }
        int[] nArray3 = new int[var2[3]];
        nArray3[G.var2[1]] = var2[24];
        TileObject var15 = TileObjects.getNearest((int[])nArray3);
        if (G.var6(var15)) {
            return var2[1];
        }
        if (G.var14(Reachable.isInteractable((Locatable)var15) ? 1 : 0)) {
            Movement.walkTo((Locatable)var15);
            0;
            return var2[3];
        }
        if (G.var3(Movement.shouldWalk() ? 1 : 0)) {
            var15.interact(var1[var2[1]]);
        }
        return var2[3];
    }

    private static void var4() {
        var2 = new int[25];
        G.var2[0] = 0x16 ^ 0x1D;
        G.var2[1] = (0x6E ^ 0x53 ^ (0xA8 ^ 0xB8)) & (133 + 39 - 148 + 146 ^ 134 + 128 - 209 + 82 ^ -1);
        G.var2[2] = -(0xFFFFDF33 & 0x24FF) & (0xFFFFDDF7 & 0x27FF);
        G.var2[3] = 1;
        G.var2[4] = 0xFFFFAFEC & 0x7EFF;
        G.var2[5] = 2;
        G.var2[6] = 0xFFFFE5BF & 0x1BFC;
        G.var2[7] = 3;
        G.var2[8] = 0xFFFFEFBF & 0x11FF;
        G.var2[9] = 0x54 ^ 0x75 ^ (0x2D ^ 8);
        G.var2[10] = -(0xFFFFF73F & 0x7CE7) & (0xFFFFF5FF & 0x7FE7);
        G.var2[11] = 0x7F ^ 0x7A;
        G.var2[12] = 0xFFFFC1EB & 0x3FD7;
        G.var2[13] = 0x4D ^ 0x41 ^ (0x7B ^ 0x71);
        G.var2[14] = -(0xFFFFFBE9 & 0x24BF) & (0xFFFFBFFF & 0x66FF);
        G.var2[15] = 0x36 ^ 0x31;
        G.var2[16] = 0xFFFF87F7 & 0x7E5D;
        G.var2[17] = 0xB6 ^ 0x97 ^ (0xB9 ^ 0x90);
        G.var2[18] = 0xFFFFAFF3 & 0x565F;
        G.var2[19] = 0xA ^ 3;
        G.var2[20] = -(0xFFFFD969 & 0x7E9F) & (0xFFFFDFD9 & 0x7E7F);
        G.var2[21] = 51 + 4 - -67 + 50 ^ 51 + 27 - 47 + 135;
        G.var2[22] = -(0xFFFFFEA5 & 0x69FB) & (0xFFFFEEFF & Short.MAX_VALUE);
        G.var2[23] = 0xFFFFFEFB & 0x2FEF;
        G.var2[24] = -(0xFFFFFBAD & 0xE7F) & (0xFFFFFF7F & 0x6FFD);
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }
}

