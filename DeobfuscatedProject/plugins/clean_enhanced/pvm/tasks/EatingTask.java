/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Eating", priority=100)
public class EatingTask
extends Task {
    private final  SquireShamanConfig ac;
    
    private static final  Logger ab;

    static {
        p.var3();
        p.var4();
        ab = LoggerFactory.getLogger(EatingTask.class);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (p.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var17(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public EatingTask(SquireShamanConfig squireShamanConfig) {
        this.ac = squireShamanConfig;
    }

    private static void var4() {
        var2 = new String[var1[2]];
        p.var2[p.var1[0]] = "Eat";
        p.var2[p.var1[1]] = "Eat";
    }

    public boolean run() {
        p var18;
        Item item2 = Inventory.getFirst(item -> item.hasAction(var2[var1[1]]::equals));
        if (p.var16(item2)) {
            return var1[0];
        }
        if (p.var17(Combat.getCurrentHealth(), var18.ac.eatAt())) {
            return var1[0];
        }
        item2.interact(var2[var1[0]]);
        return var1[1];
    }

    private static void var3() {
        var1 = new int[3];
        p.var1[0] = ((0x6D ^ 0x24) & ~(0x30 ^ 0x79) ^ (0xDE ^ 0x8A)) & (0x20 ^ 0x2B ^ (0xE3 ^ 0xBC) ^ -1);
        p.var1[1] = 1;
        p.var1[2] = 2;
    }
}

