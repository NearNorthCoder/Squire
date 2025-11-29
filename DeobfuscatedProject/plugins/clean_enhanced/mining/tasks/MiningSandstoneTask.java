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
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
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

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public MiningSandstoneTask(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        this.aj = squireMiner;
        this.ak = squireMinerConfig;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (J.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean var14(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static boolean var16(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static boolean var24(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var25(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        J.var26();
        J.var27();
        ai = var1[7];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject var28;
        J var29;
        if (J.var24((Object)this.ak.activity(), (Object)a.SANDSTONE)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[J.var1[0]] = var1[2];
        if (J.var14(Inventory.getCount((int[])nArray), var29.ak.waterskins())) {
            int[] nArray2 = new int[var1[1]];
            nArray2[J.var1[0]] = var1[2];
            Inventory.getFirst((int[])nArray2).interact(var2[var1[0]]);
        }
        Player var30 = Players.getLocal();
        if (!J.var31(Inventory.isFull() ? 1 : 0) || !J.var32(var30) || !J.var31(var30.isAnimating() ? 1 : 0) || J.var23(var30.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        if (J.var31(Movement.isRunEnabled() ? 1 : 0) && J.var25(Movement.getRunEnergy(), var1[3])) {
            Movement.toggleRun();
        }
        if (J.var15(var28 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (J.var33(tileObject.getId(), var1[7]) && J.var23(this.ak.area().a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (((29 + 165 - 21 + 37 ^ 90 + 111 - 193 + 137) & (3 ^ (0x31 ^ 0x71) ^ -1)) != ((0x85 ^ 0xA5 ^ (0x40 ^ 0x6E)) & (0xD7 ^ 0xC0 ^ (0x3B ^ 0x22) ^ -1))) {
                    return ((0xE6 ^ 0x9D ^ (0x4B ^ 0)) & (0x28 ^ 0x23 ^ (0x31 ^ 0xA) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }))) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[4], var1[5], var1[0]), (boolean)var1[0]);
            0;
            return var1[1];
        }
        if (J.var23(Movement.isRunEnabled() ? 1 : 0) && J.var16(Players.getLocal().distanceTo((Locatable)var28), var1[6])) {
            var29.aj.a();
        }
        var2_2.interact(var2[var1[1]]);
        return var1[1];
    }

    private static boolean var33(int n2, int n3) {
        return n2 == n3;
    }

    private static void var26() {
        var1 = new int[10];
        J.var1[0] = (0x8C ^ 0x83) & ~(0x33 ^ 0x3C);
        J.var1[1] = 1;
        J.var1[2] = 0xFFFFD7FF & 0x2F1F;
        J.var1[3] = 0x56 ^ 0x4F;
        J.var1[4] = -(0xFFFFB38C & 0x5EFF) & (0xFFFF9FEB & 0x7EFF);
        J.var1[5] = -(0xFFFFBCAD & 0x53F2) & (0xFFFF9BFF & Short.MAX_VALUE);
        J.var1[6] = 150 + 54 - 64 + 34 ^ 168 + 50 - 141 + 93;
        J.var1[7] = -(0xFFFFD3ED & 0x7F97) & (0xFFFFFFFF & 0x7FFE);
        J.var1[8] = 2;
        J.var1[9] = 0x55 ^ 0x23 ^ (0x7D ^ 3);
    }

    private static boolean var31(int n2) {
        return n2 == 0;
    }

    private static void var27() {
        var2 = new String[var1[8]];
        J.var2[J.var1[0]] = "Drop";
        J.var2[J.var1[1]] = "Mine";
    }

    private static boolean var32(Object object) {
        return object != null;
    }
}

