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

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        H.var2[H.var1[2]] = "Search";
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        H var6;
        if (H.var3(this.Z.O() ? 1 : 0)) {
            return var1[2];
        }
        int[] nArray = new int[var1[3]];
        nArray[H.var1[2]] = var1[4];
        if (H.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[2];
        }
        if (!H.var3(Inventory.isFull() ? 1 : 0) || !H.var5(var6.Z.D()) || H.var7(var6.Z.M(), var1[3])) {
            return var1[2];
        }
        int[] nArray2 = new int[var1[3]];
        nArray2[H.var1[2]] = var1[5];
        TileObject var8 = TileObjects.getNearest((int[])nArray2);
        if (H.var9(var8)) {
            return var1[2];
        }
        Player var10 = Players.getLocal();
        if (H.var7(var8.distanceTo((Locatable)var10), var1[6])) {
            Movement.walkTo((WorldPoint)var6.af);
            0;
            return var1[3];
        }
        var1_1.interact(var2[var1[2]]);
        return var1[3];
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public WithdrawingOresTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        this.af = new WorldPoint(var1[0], var1[1], var1[2]);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        H.var17();
        H.var4();
        ae = var1[5];
    }

    private static void var17() {
        var1 = new int[9];
        H.var1[0] = 0xFFFFDFAF & 0x2EF5;
        H.var1[1] = -(0xFFFFE9EB & 0x7F75) & (0xFFFFFFFF & 0x7F7B);
        H.var1[2] = (0x1B ^ 0x5A) & ~(0x34 ^ 0x75);
        H.var1[3] = 1;
        H.var1[4] = 0xFFFFFEFF & 0x2FEB;
        H.var1[5] = -(0xFFFFFFFA & 0x13AD) & (0xFFFFFFF7 & 0x7BEF);
        H.var1[6] = 0x86 ^ 0x83;
        H.var1[7] = 127 + 127 - 122 + 2 ^ 50 + 63 - 36 + 65;
        H.var1[8] = 2;
    }

    private static boolean var9(Object object) {
        return object == null;
    }
}

