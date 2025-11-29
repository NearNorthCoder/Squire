/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Burying bones", priority=20)
public class BuryingBonesTask
extends Task {
    
    private final  a aW;
    
    private final  SquireAlchemicalHydraConfig aX;

    private static void var3() {
        var2 = new int[4];
        z.var2[0] = (0x42 ^ 8) & ~(0x50 ^ 0x1A);
        z.var2[1] = 1;
        z.var2[2] = 2;
        z.var2[3] = 0xE7 ^ 0xC2 ^ (0x18 ^ 0x35);
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        z.var3();
        z.var5();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var6;
        if (z.var4(this.aX.bury() ? 1 : 0)) {
            return var2[0];
        }
        if (z.var4(var6.aW.g() ? 1 : 0)) {
            return var2[0];
        }
        if (z.var7(var6.aW.k())) {
            return var2[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var2[1]];
            stringArray[z.var2[0]] = var1[var2[1]];
            return item.hasAction(stringArray);
        });
        if (z.var9(var8)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[1];
    }

    private static void var5() {
        var1 = new String[var2[2]];
        z.var1[z.var2[0]] = "Bury";
        z.var1[z.var2[1]] = "Bury";
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    @Inject
    public BuryingBonesTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aW = a2;
        this.aX = squireAlchemicalHydraConfig;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

