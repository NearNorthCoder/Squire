/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final  SquireSepulchre aA;
    private final  SquireSepulchreConfig aB;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (T.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (((0xE0 ^ 0xB1 ^ (0x9B ^ 0xC6)) & (0x7E ^ 0x68 ^ (0x96 ^ 0x8C) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static void var22() {
        var2 = new String[var1[5]];
        T.var2[T.var1[0]] = "Drink";
        T.var2[T.var1[3]] = "Drink";
        T.var2[T.var1[4]] = "Stamina";
    }

    private static void var23() {
        var1 = new int[7];
        T.var1[0] = (0x4B ^ 0x7F ^ (0xCE ^ 0x9B)) & (96 + 239 - 325 + 235 ^ 124 + 76 - 82 + 30 ^ -1);
        T.var1[1] = 0x8F ^ 0x91;
        T.var1[2] = 0x37 ^ 0x3D;
        T.var1[3] = 1;
        T.var1[4] = 2;
        T.var1[5] = 3;
        T.var1[6] = 3 ^ (0xB4 ^ 0xBF);
    }

    private static boolean var24(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    StaminaHandlerTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aA = squireSepulchre;
        this.aB = squireSepulchreConfig;
    }

    static {
        T.var23();
        T.var22();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(var2[var1[4]]));
        if (T.var21(item2)) {
            return var1[0];
        }
        if (T.var24(Movement.getRunEnergy(), var1[1])) {
            return var1[0];
        }
        if (T.var20(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (T.var18(Movement.getRunEnergy(), var1[2])) {
                void var25;
                var25.interact(var2[var1[0]]);
                return var1[3];
            }
            return var1[0];
        }
        item2.interact(var2[var1[3]]);
        return var1[3];
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

