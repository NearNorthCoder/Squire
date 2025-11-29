/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.tithefarm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking energy boost", priority=20)
public class DrinkingEnergyBoostTask
extends Task {
    private final  SquireTitheConfig R;
    private final  Client Q;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var2 = new String[var1[6]];
        n.var2[n.var1[0]] = "Drink";
        n.var2[n.var1[1]] = "Drink";
        n.var2[n.var1[2]] = "energy";
        n.var2[n.var1[3]] = "energy";
        n.var2[n.var1[4]] = "Stamina";
        n.var2[n.var1[5]] = "Stamina";
    }

    private static void var5() {
        var1 = new int[8];
        n.var1[0] = (0xC4 ^ 0x8B) & ~(0x54 ^ 0x1B);
        n.var1[1] = 1;
        n.var1[2] = 2;
        n.var1[3] = 3;
        n.var1[4] = 0x21 ^ 0x25;
        n.var1[5] = 0x6A ^ 0x61 ^ (0x47 ^ 0x49);
        n.var1[6] = 0x33 ^ 0xA ^ (0x8D ^ 0xB2);
        n.var1[7] = 1 + 127 - 63 + 65 ^ 107 + 60 - 113 + 84;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (n.var3(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    static {
        n.var5();
        n.var4();
    }

    @Inject
    public DrinkingEnergyBoostTask(Client client, SquireTitheConfig squireTitheConfig) {
        this.Q = client;
        this.R = squireTitheConfig;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        n var24;
        if (n.var17(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var6(Inventory.contains(item -> item.getName().startsWith(var2[var1[5]])) ? 1 : 0) && n.var17(Movement.isStaminaBoosted() ? 1 : 0) && n.var3(Movement.getRunEnergy(), var24.R.energyBoostAt())) {
            Inventory.getFirst(item -> item.getName().startsWith(var2[var1[4]])).interact(var2[var1[0]]);
            return var1[1];
        }
        if (n.var6(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[3]])) ? 1 : 0) && n.var3(Movement.getRunEnergy(), var24.R.energyBoostAt())) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[2]])).interact(var2[var1[1]]);
            return var1[1];
        }
        return var1[0];
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }
}

