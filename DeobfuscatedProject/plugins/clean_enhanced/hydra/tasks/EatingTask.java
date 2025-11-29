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
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Eating", priority=10)
public class EatingTask
extends Task {
    private final  a av;
    
    private final  SquireAlchemicalHydraConfig aw;

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public EatingTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.av = a2;
        this.aw = squireAlchemicalHydraConfig;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        r.var2[r.var1[0]] = "Eat";
        r.var2[r.var1[2]] = "Eat";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        r.var11();
        r.var4();
    }

    private static void var11() {
        var1 = new int[5];
        r.var1[0] = (0x3A ^ 0x3F ^ (0x14 ^ 2)) & (0x8D ^ 0x83 ^ (0x79 ^ 0x64) ^ -1);
        r.var1[1] = 72 + 91 - -29 + 0 ^ 10 + 71 - -60 + 55;
        r.var1[2] = 1;
        r.var1[3] = 2;
        r.var1[4] = 0x2D ^ 0x3E ^ (0xDC ^ 0xC7);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var12;
        if (r.var13(this.av.g() ? 1 : 0)) {
            return var1[0];
        }
        if (r.var3(Combat.getCurrentHealth(), var12.aw.eatAt())) {
            return var1[0];
        }
        Item var14 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[2]];
            stringArray[r.var1[0]] = var2[var1[2]];
            return item.hasAction(stringArray);
        });
        if (r.var15(var14)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.sleep(var1[1]);
        return var1[2];
    }

    private static boolean var15(Object object) {
        return object == null;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }
}

