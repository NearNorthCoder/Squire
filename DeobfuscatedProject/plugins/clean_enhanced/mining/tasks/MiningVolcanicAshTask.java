/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining volcanic ash", priority=5)
public class MiningVolcanicAshTask
extends Task {
    
    private final  SquireMinerConfig aq;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (N.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var15(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (N.var16((Object)this.aq.activity(), (Object)a.VOLCANIC_ASH)) {
            return var1[0];
        }
        Player var17 = Players.getLocal();
        if (!N.var18(Inventory.isFull() ? 1 : 0) || !N.var19(var17) || !N.var18(var17.isAnimating() ? 1 : 0) || N.var14(var17.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        if (N.var18(Movement.isRunEnabled() ? 1 : 0) && N.var15(Movement.getRunEnergy(), var1[1])) {
            Movement.toggleRun();
        }
        int[] nArray = new int[var1[2]];
        nArray[N.var1[0]] = var1[3];
        TileObject var20 = TileObjects.getNearest((int[])nArray);
        if (N.var21(var20)) {
            System.out.println(var2[var1[0]]);
            return var1[0];
        }
        var2_2.interact(var2[var1[2]]);
        return var1[2];
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    @Inject
    public MiningVolcanicAshTask(SquireMinerConfig squireMinerConfig) {
        this.aq = squireMinerConfig;
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    private static void var28() {
        var2 = new String[var1[4]];
        N.var2[N.var1[0]] = "No volcanic ash pile found";
        N.var2[N.var1[2]] = "Mine";
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var29() {
        var1 = new int[6];
        N.var1[0] = (6 ^ 0x4C) & ~(0xF3 ^ 0xB9);
        N.var1[1] = 132 + 81 - 109 + 75 ^ 147 + 94 - 171 + 100;
        N.var1[2] = 1;
        N.var1[3] = -(0xFFFFE7C7 & 0x1C7F) & (0xFFFFFD5F & 0x7FEF);
        N.var1[4] = 2;
        N.var1[5] = 0x66 ^ 0x43 ^ (0x82 ^ 0xAF);
    }

    static {
        N.var29();
        N.var28();
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    private static boolean var18(int n2) {
        return n2 == 0;
    }
}

