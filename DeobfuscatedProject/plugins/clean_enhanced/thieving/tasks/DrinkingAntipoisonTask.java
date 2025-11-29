/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Drinking antipoison", priority=0x7FFFFFFE, blocking=true)
public class DrinkingAntipoisonTask
extends ThievingTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        if (t.var9(Inventory.contains(item -> item.getName().contains(var2[var1[3]])) ? 1 : 0)) {
            Log.error((String)var2[var1[0]]);
            this.ad.forceStop();
        }
        if (t.var9(Combat.isPoisoned() ? 1 : 0)) {
            return var1[0];
        }
        Inventory.getFirst(item -> item.getName().contains(var2[var1[2]])).interact(var2[var1[1]]);
        return var1[1];
    }

    private static void var10() {
        var2 = new String[var1[4]];
        t.var2[t.var1[0]] = "We are out of antipoisons!!";
        t.var2[t.var1[1]] = "Drink";
        t.var2[t.var1[2]] = "ntipoison";
        t.var2[t.var1[3]] = "ntipoison";
    }

    @Inject
    public DrinkingAntipoisonTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    static {
        t.var17();
        t.var10();
    }

    private static void var17() {
        var1 = new int[6];
        t.var1[0] = (0x92 ^ 0x9A) & ~(0xBD ^ 0xB5);
        t.var1[1] = 1;
        t.var1[2] = 2;
        t.var1[3] = 3;
        t.var1[4] = 0xBC ^ 0xB8;
        t.var1[5] = 0xDD ^ 0x8F ^ (0xFA ^ 0xA0);
    }
}

