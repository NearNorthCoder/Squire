/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Cleansing parasite", priority=0x7FFFFFFF, blocking=true, register=true)
public class CleansingParasiteTask
extends Task {
    private final  h eh;
    private final  SquireNightmarePlugin eg;
    
    private static final  Logger ef;
    private final  SquireNightmareConfig ei;

    private static void var3() {
        var2 = new int[7];
        ao.var2[0] = (0xC3 ^ 0x91 ^ (0x65 ^ 5) & ~(0x32 ^ 0x52)) & (133 + 87 - 146 + 157 ^ 35 + 122 - 8 + 32 ^ -1);
        ao.var2[1] = -(0xFFFF9E51 & 0x69EF) & (0xFFFFBFE7 & 0x6FFF);
        ao.var2[2] = 1;
        ao.var2[3] = 2;
        ao.var2[4] = 3;
        ao.var2[5] = 0xDF ^ 0xA7 ^ (0x2E ^ 0x52);
        ao.var2[6] = 13 + 25 - 30 + 175 ^ 132 + 65 - 175 + 156;
    }

    static {
        ao.var3();
        ao.var4();
        ef = LoggerFactory.getLogger(CleansingParasiteTask.class);
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (ao.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-(0xA1 ^ 0xA5) < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void var4() {
        var1 = new String[var2[6]];
        ao.var1[ao.var2[0]] = "Infected and out of cures. Also No sanfew found in inventory or on the ground, teleporting out";
        ao.var1[ao.var2[2]] = "Drink";
        ao.var1[ao.var2[3]] = "Cleansing parasite";
        ao.var1[ao.var2[4]] = "sanfew";
        ao.var1[ao.var2[5]] = "balm";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ao var17;
        if (ao.var5(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (ao.var18(var17.eg.aq() ? 1 : 0)) {
            return var2[0];
        }
        if (ao.var5(Static.getClient().getVarbitValue(var2[1]))) {
            return var2[0];
        }
        Item var19 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[5]]));
        if (ao.var20(var19)) {
            var19 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[4]]));
        }
        if (ao.var20(var19)) {
            Log.info((String)var1[var2[0]]);
            return var17.eg.m();
        }
        var1_1.interact(var1[var2[2]]);
        ef.info(var1[var2[3]]);
        this.sleep(var2[4]);
        this.eg.p(var2[0]);
        return var2[2];
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Inject
    public CleansingParasiteTask(SquireNightmarePlugin squireNightmarePlugin, h h2, SquireNightmareConfig squireNightmareConfig) {
        this.eg = squireNightmarePlugin;
        this.eh = h2;
        this.ei = squireNightmareConfig;
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }
}

